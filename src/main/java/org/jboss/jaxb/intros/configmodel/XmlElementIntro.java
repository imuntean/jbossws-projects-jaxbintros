//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.08.21 at 10:20:40 PM GMT 
//


package org.jboss.jaxb.intros.configmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XmlElement complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="XmlElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="##default" />
 *       &lt;attribute name="nillable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="required" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="namespace" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="##default" />
 *       &lt;attribute name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlElement")
public class XmlElementIntro
{

   @XmlAttribute
   @XmlSchemaType(name = "anySimpleType")
   protected String name;
   @XmlAttribute
   protected Boolean nillable;
   @XmlAttribute
   protected Boolean required;
   @XmlAttribute
   @XmlSchemaType(name = "anySimpleType")
   protected String namespace;
   @XmlAttribute
   @XmlSchemaType(name = "anySimpleType")
   protected String defaultValue;
   @XmlAttribute
   @XmlSchemaType(name = "anySimpleType")
   protected String type;

   /**
    * Gets the value of the name property.
    *
    * @return possible object is
    *         {@link String }
    */
   public String getName()
   {
      if (name == null)
      {
         return "##default";
      }
      else
      {
         return name;
      }
   }

   /**
    * Sets the value of the name property.
    *
    * @param value allowed object is
    *              {@link String }
    */
   public void setName(String value)
   {
      this.name = value;
   }

   /**
    * Gets the value of the nillable property.
    *
    * @return possible object is
    *         {@link Boolean }
    */
   public boolean isNillable()
   {
      if (nillable == null)
      {
         return false;
      }
      else
      {
         return nillable;
      }
   }

   /**
    * Sets the value of the nillable property.
    *
    * @param value allowed object is
    *              {@link Boolean }
    */
   public void setNillable(Boolean value)
   {
      this.nillable = value;
   }

   /**
    * Gets the value of the required property.
    *
    * @return possible object is
    *         {@link Boolean }
    */
   public boolean isRequired()
   {
      if (required == null)
      {
         return false;
      }
      else
      {
         return required;
      }
   }

   /**
    * Sets the value of the required property.
    *
    * @param value allowed object is
    *              {@link Boolean }
    */
   public void setRequired(Boolean value)
   {
      this.required = value;
   }

   /**
    * Gets the value of the namespace property.
    *
    * @return possible object is
    *         {@link String }
    */
   public String getNamespace()
   {
      if (namespace == null)
      {
         return "##default";
      }
      else
      {
         return namespace;
      }
   }

   /**
    * Sets the value of the namespace property.
    *
    * @param value allowed object is
    *              {@link String }
    */
   public void setNamespace(String value)
   {
      this.namespace = value;
   }

   /**
    * Gets the value of the defaultValue property.
    *
    * @return possible object is
    *         {@link String }
    */
   public String getDefaultValue()
   {
      return defaultValue;
   }

   /**
    * Sets the value of the defaultValue property.
    *
    * @param value allowed object is
    *              {@link String }
    */
   public void setDefaultValue(String value)
   {
      this.defaultValue = value;
   }

   /**
    * Gets the value of the type property.
    *
    * @return possible object is
    *         {@link String }
    */
   public String getType()
   {
      return type;
   }

   /**
    * Sets the value of the type property.
    *
    * @param value allowed object is
    *              {@link String }
    */
   public void setType(String value)
   {
      this.type = value;
   }

}