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
(value=com.x.okr.entity.OkrWorkReportBaseInfo.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Mon Dec 24 19:04:41 CST 2018")
public class OkrWorkReportBaseInfo_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> activityName;
    public static volatile ListAttribute<OkrWorkReportBaseInfo,String> attachmentList;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> centerId;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> centerTitle;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> creatorIdentity;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> creatorName;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> creatorTopUnitName;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> creatorUnitName;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,Integer> currentProcessLevel;
    public static volatile ListAttribute<OkrWorkReportBaseInfo,String> currentProcessorIdentityList;
    public static volatile ListAttribute<OkrWorkReportBaseInfo,String> currentProcessorNameList;
    public static volatile ListAttribute<OkrWorkReportBaseInfo,String> currentProcessorTopUnitNameList;
    public static volatile ListAttribute<OkrWorkReportBaseInfo,String> currentProcessorUnitNameList;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> description;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> id;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,Boolean> isWorkCompleted;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,Boolean> needAdminAudit;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,Boolean> needLeaderRead;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> processStatus;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> processType;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,Integer> progressPercent;
    public static volatile ListAttribute<OkrWorkReportBaseInfo,String> readLeadersIdentityList;
    public static volatile ListAttribute<OkrWorkReportBaseInfo,String> readLeadersNameList;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,Integer> reportCount;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> reportWorkflowType;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> reporterIdentity;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> reporterName;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> reporterTopUnitName;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> reporterUnitName;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> shortTitle;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> status;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,Date> submitTime;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> title;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> workAdminIdentity;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> workAdminName;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> workId;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> workTitle;
    public static volatile SingularAttribute<OkrWorkReportBaseInfo,String> workType;
}
