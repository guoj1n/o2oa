/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.okr.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.okr.entity.OkrWorkBaseInfo.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Mon Dec 24 19:04:41 CST 2018")
public class OkrWorkBaseInfo_ extends SliceJpaObject_  {
    public static volatile ListAttribute<OkrWorkBaseInfo,String> appraiseInfoList;
    public static volatile SingularAttribute<OkrWorkBaseInfo,Integer> appraiseTimes;
    public static volatile SingularAttribute<OkrWorkBaseInfo,Date> archiveDate;
    public static volatile ListAttribute<OkrWorkBaseInfo,String> attachmentList;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> centerId;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> centerTitle;
    public static volatile SingularAttribute<OkrWorkBaseInfo,Date> completeDateLimit;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> completeDateLimitStr;
    public static volatile SingularAttribute<OkrWorkBaseInfo,Date> completeTime;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> confirmDateStr;
    public static volatile ListAttribute<OkrWorkBaseInfo,String> cooperateEmployeeNameList;
    public static volatile ListAttribute<OkrWorkBaseInfo,String> cooperateIdentityList;
    public static volatile ListAttribute<OkrWorkBaseInfo,String> cooperateTopUnitNameList;
    public static volatile ListAttribute<OkrWorkBaseInfo,String> cooperateUnitNameList;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> creatorIdentity;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> creatorName;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> creatorTopUnitName;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> creatorUnitName;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> currentActivityName;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> currentAppraiseInfoId;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> currentAppraiseJobId;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> currentAppraiseStatus;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> currentAppraiseTitle;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> currentAppraiseWorkId;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> deployDateStr;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> deployMonth;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> deployYear;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> deployerIdentity;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> deployerName;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> deployerTopUnitName;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> deployerUnitName;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> id;
    public static volatile SingularAttribute<OkrWorkBaseInfo,Boolean> isCompleted;
    public static volatile SingularAttribute<OkrWorkBaseInfo,Boolean> isNeedReport;
    public static volatile SingularAttribute<OkrWorkBaseInfo,Boolean> isOverTime;
    public static volatile SingularAttribute<OkrWorkBaseInfo,Date> lastReportTime;
    public static volatile SingularAttribute<OkrWorkBaseInfo,Date> nextReportTime;
    public static volatile SingularAttribute<OkrWorkBaseInfo,Integer> overallProgress;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> parentWorkId;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> parentWorkTitle;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> progressAnalyseTime;
    public static volatile ListAttribute<OkrWorkBaseInfo,String> readLeaderIdentityList;
    public static volatile ListAttribute<OkrWorkBaseInfo,String> readLeaderNameList;
    public static volatile ListAttribute<OkrWorkBaseInfo,String> readLeaderTopUnitNameList;
    public static volatile ListAttribute<OkrWorkBaseInfo,String> readLeaderUnitNameList;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> reportAdminIdentity;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> reportAdminName;
    public static volatile SingularAttribute<OkrWorkBaseInfo,Integer> reportCount;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> reportCycle;
    public static volatile SingularAttribute<OkrWorkBaseInfo,Integer> reportDayInCycle;
    public static volatile SingularAttribute<OkrWorkBaseInfo,Boolean> reportNeedAdminAudit;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> reportTimeQue;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> responsibilityEmployeeName;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> responsibilityIdentity;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> responsibilityTopUnitName;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> responsibilityUnitName;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> shortDutyDescription;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> shortLandmarkDescription;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> shortMajorIssuesDescription;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> shortProgressAction;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> shortProgressPlan;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> shortResultDescription;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> shortWorkDetail;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> status;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> title;
    public static volatile SingularAttribute<OkrWorkBaseInfo,Integer> workAuditLevel;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> workDateTimeType;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> workLevel;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> workProcessStatus;
    public static volatile SingularAttribute<OkrWorkBaseInfo,String> workType;
}
