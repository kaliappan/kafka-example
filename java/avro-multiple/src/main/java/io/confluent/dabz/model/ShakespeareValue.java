/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.confluent.dabz.model;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ShakespeareValue extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5215388297811822111L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ShakespeareValue\",\"namespace\":\"io.confluent.dabz.model\",\"fields\":[{\"name\":\"line_number\",\"type\":\"int\",\"doc\":\"The line number for line\"},{\"name\":\"line\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The line from Shakespeare\"},{\"name\":\"blog\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ShakespeareValue> ENCODER =
      new BinaryMessageEncoder<ShakespeareValue>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ShakespeareValue> DECODER =
      new BinaryMessageDecoder<ShakespeareValue>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<ShakespeareValue> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<ShakespeareValue> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ShakespeareValue>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this ShakespeareValue to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a ShakespeareValue from a ByteBuffer. */
  public static ShakespeareValue fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The line number for line */
  @Deprecated public int line_number;
  /** The line from Shakespeare */
  @Deprecated public java.lang.String line;
  @Deprecated public org.joda.time.DateTime blog;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ShakespeareValue() {}

  /**
   * All-args constructor.
   * @param line_number The line number for line
   * @param line The line from Shakespeare
   * @param blog The new value for blog
   */
  public ShakespeareValue(java.lang.Integer line_number, java.lang.String line, org.joda.time.DateTime blog) {
    this.line_number = line_number;
    this.line = line;
    this.blog = blog;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return line_number;
    case 1: return line;
    case 2: return blog;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  protected static final org.apache.avro.data.TimeConversions.DateConversion DATE_CONVERSION = new org.apache.avro.data.TimeConversions.DateConversion();
  protected static final org.apache.avro.data.TimeConversions.TimeConversion TIME_CONVERSION = new org.apache.avro.data.TimeConversions.TimeConversion();
  protected static final org.apache.avro.data.TimeConversions.TimestampConversion TIMESTAMP_CONVERSION = new org.apache.avro.data.TimeConversions.TimestampConversion();
  protected static final org.apache.avro.Conversions.DecimalConversion DECIMAL_CONVERSION = new org.apache.avro.Conversions.DecimalConversion();

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      TIMESTAMP_CONVERSION,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: line_number = (java.lang.Integer)value$; break;
    case 1: line = (java.lang.String)value$; break;
    case 2: blog = (org.joda.time.DateTime)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'line_number' field.
   * @return The line number for line
   */
  public java.lang.Integer getLineNumber() {
    return line_number;
  }

  /**
   * Sets the value of the 'line_number' field.
   * The line number for line
   * @param value the value to set.
   */
  public void setLineNumber(java.lang.Integer value) {
    this.line_number = value;
  }

  /**
   * Gets the value of the 'line' field.
   * @return The line from Shakespeare
   */
  public java.lang.String getLine() {
    return line;
  }

  /**
   * Sets the value of the 'line' field.
   * The line from Shakespeare
   * @param value the value to set.
   */
  public void setLine(java.lang.String value) {
    this.line = value;
  }

  /**
   * Gets the value of the 'blog' field.
   * @return The value of the 'blog' field.
   */
  public org.joda.time.DateTime getBlog() {
    return blog;
  }

  /**
   * Sets the value of the 'blog' field.
   * @param value the value to set.
   */
  public void setBlog(org.joda.time.DateTime value) {
    this.blog = value;
  }

  /**
   * Creates a new ShakespeareValue RecordBuilder.
   * @return A new ShakespeareValue RecordBuilder
   */
  public static io.confluent.dabz.model.ShakespeareValue.Builder newBuilder() {
    return new io.confluent.dabz.model.ShakespeareValue.Builder();
  }

  /**
   * Creates a new ShakespeareValue RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ShakespeareValue RecordBuilder
   */
  public static io.confluent.dabz.model.ShakespeareValue.Builder newBuilder(io.confluent.dabz.model.ShakespeareValue.Builder other) {
    return new io.confluent.dabz.model.ShakespeareValue.Builder(other);
  }

  /**
   * Creates a new ShakespeareValue RecordBuilder by copying an existing ShakespeareValue instance.
   * @param other The existing instance to copy.
   * @return A new ShakespeareValue RecordBuilder
   */
  public static io.confluent.dabz.model.ShakespeareValue.Builder newBuilder(io.confluent.dabz.model.ShakespeareValue other) {
    return new io.confluent.dabz.model.ShakespeareValue.Builder(other);
  }

  /**
   * RecordBuilder for ShakespeareValue instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ShakespeareValue>
    implements org.apache.avro.data.RecordBuilder<ShakespeareValue> {

    /** The line number for line */
    private int line_number;
    /** The line from Shakespeare */
    private java.lang.String line;
    private org.joda.time.DateTime blog;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.confluent.dabz.model.ShakespeareValue.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.line_number)) {
        this.line_number = data().deepCopy(fields()[0].schema(), other.line_number);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.line)) {
        this.line = data().deepCopy(fields()[1].schema(), other.line);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.blog)) {
        this.blog = data().deepCopy(fields()[2].schema(), other.blog);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ShakespeareValue instance
     * @param other The existing instance to copy.
     */
    private Builder(io.confluent.dabz.model.ShakespeareValue other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.line_number)) {
        this.line_number = data().deepCopy(fields()[0].schema(), other.line_number);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.line)) {
        this.line = data().deepCopy(fields()[1].schema(), other.line);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.blog)) {
        this.blog = data().deepCopy(fields()[2].schema(), other.blog);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'line_number' field.
      * The line number for line
      * @return The value.
      */
    public java.lang.Integer getLineNumber() {
      return line_number;
    }

    /**
      * Sets the value of the 'line_number' field.
      * The line number for line
      * @param value The value of 'line_number'.
      * @return This builder.
      */
    public io.confluent.dabz.model.ShakespeareValue.Builder setLineNumber(int value) {
      validate(fields()[0], value);
      this.line_number = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'line_number' field has been set.
      * The line number for line
      * @return True if the 'line_number' field has been set, false otherwise.
      */
    public boolean hasLineNumber() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'line_number' field.
      * The line number for line
      * @return This builder.
      */
    public io.confluent.dabz.model.ShakespeareValue.Builder clearLineNumber() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'line' field.
      * The line from Shakespeare
      * @return The value.
      */
    public java.lang.String getLine() {
      return line;
    }

    /**
      * Sets the value of the 'line' field.
      * The line from Shakespeare
      * @param value The value of 'line'.
      * @return This builder.
      */
    public io.confluent.dabz.model.ShakespeareValue.Builder setLine(java.lang.String value) {
      validate(fields()[1], value);
      this.line = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'line' field has been set.
      * The line from Shakespeare
      * @return True if the 'line' field has been set, false otherwise.
      */
    public boolean hasLine() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'line' field.
      * The line from Shakespeare
      * @return This builder.
      */
    public io.confluent.dabz.model.ShakespeareValue.Builder clearLine() {
      line = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'blog' field.
      * @return The value.
      */
    public org.joda.time.DateTime getBlog() {
      return blog;
    }

    /**
      * Sets the value of the 'blog' field.
      * @param value The value of 'blog'.
      * @return This builder.
      */
    public io.confluent.dabz.model.ShakespeareValue.Builder setBlog(org.joda.time.DateTime value) {
      validate(fields()[2], value);
      this.blog = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'blog' field has been set.
      * @return True if the 'blog' field has been set, false otherwise.
      */
    public boolean hasBlog() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'blog' field.
      * @return This builder.
      */
    public io.confluent.dabz.model.ShakespeareValue.Builder clearBlog() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ShakespeareValue build() {
      try {
        ShakespeareValue record = new ShakespeareValue();
        record.line_number = fieldSetFlags()[0] ? this.line_number : (java.lang.Integer) defaultValue(fields()[0], record.getConversion(0));
        record.line = fieldSetFlags()[1] ? this.line : (java.lang.String) defaultValue(fields()[1], record.getConversion(1));
        record.blog = fieldSetFlags()[2] ? this.blog : (org.joda.time.DateTime) defaultValue(fields()[2], record.getConversion(2));
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ShakespeareValue>
    WRITER$ = (org.apache.avro.io.DatumWriter<ShakespeareValue>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ShakespeareValue>
    READER$ = (org.apache.avro.io.DatumReader<ShakespeareValue>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
