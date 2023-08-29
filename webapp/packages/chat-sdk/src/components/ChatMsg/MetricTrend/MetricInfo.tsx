import { PREFIX_CLS } from '../../../common/constants';
import { formatMetric, formatNumberWithCN } from '../../../utils/utils';
import { AggregateInfoType } from '../../../common/type';
import PeriodCompareItem from '../MetricCard/PeriodCompareItem';
import { SwapOutlined } from '@ant-design/icons';
import { useState } from 'react';

type Props = {
  aggregateInfo: AggregateInfoType;
};

const MetricInfo: React.FC<Props> = ({ aggregateInfo }) => {
  const { metricInfos } = aggregateInfo || {};
  const metricInfo = metricInfos?.[0] || {};
  const { date, value, statistics } = metricInfo || {};

  const prefixCls = `${PREFIX_CLS}-metric-info`;

  const [isNumber, setIsNumber] = useState(false);
  const handleNumberClick = () => {
    setIsNumber(!isNumber);
  };

  return (
    <div className={prefixCls}>
      <div className={`${prefixCls}-indicator`}>
        <div style={{ display: 'flex', alignItems: 'flex-end' }}>
          <div className={`${prefixCls}-indicator-value`}>
            {isNumber ? formatMetric(value) : formatNumberWithCN(+value)}
          </div>
          <div className={`${prefixCls}-indicator-switch`}>
            <SwapOutlined onClick={handleNumberClick} />
          </div>
        </div>
        <div className={`${prefixCls}-bottom-section`}>
          <div className={`${prefixCls}-date`}>
            最新数据日期：<span className={`${prefixCls}-date-value`}>{date}</span>
          </div>
          {metricInfos?.length > 0 && (
            <div className={`${prefixCls}-period-compare`}>
              {Object.keys(statistics).map((key: any) => (
                <PeriodCompareItem title={key} value={metricInfos[0].statistics[key]} />
              ))}
            </div>
          )}
        </div>
      </div>
    </div>
  );
};

export default MetricInfo;
