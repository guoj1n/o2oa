/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.mind.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.mind.entity.MindFolderInfo.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Mon Dec 24 19:04:37 CST 2018")
public class MindFolderInfo_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<MindFolderInfo,String> creator;
    public static volatile SingularAttribute<MindFolderInfo,String> creatorUnit;
    public static volatile SingularAttribute<MindFolderInfo,String> description;
    public static volatile SingularAttribute<MindFolderInfo,String> id;
    public static volatile SingularAttribute<MindFolderInfo,String> name;
    public static volatile SingularAttribute<MindFolderInfo,Integer> orderNumber;
    public static volatile SingularAttribute<MindFolderInfo,String> parentId;
}
