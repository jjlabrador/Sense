/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'SensorMsg'
 * message type.
 */

public class SensorMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 18;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 147;

    /** Create a new SensorMsg of size 18. */
    public SensorMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new SensorMsg of the given data_length. */
    public SensorMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new SensorMsg with the given data_length
     * and base offset.
     */
    public SensorMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new SensorMsg using the given byte array
     * as backing store.
     */
    public SensorMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new SensorMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public SensorMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new SensorMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public SensorMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new SensorMsg embedded in the given message
     * at the given base offset.
     */
    public SensorMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new SensorMsg embedded in the given message
     * at the given base offset and length.
     */
    public SensorMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <SensorMsg> \n";
      try {
        s += "  [id=0x"+Long.toHexString(get_id())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [sensor_t=0x"+Long.toHexString(get_sensor_t())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [count=0x"+Long.toHexString(get_count())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [reading_acc=0x"+Long.toHexString(get_reading_acc())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [reading_light=0x"+Long.toHexString(get_reading_light())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [readings=";
        for (int i = 0; i < 5; i++) {
          s += "0x"+Long.toHexString(getElement_readings(i) & 0xffff)+" ";
        }
        s += "]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: id
    //   Field type: int, unsigned
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'id' is signed (false).
     */
    public static boolean isSigned_id() {
        return false;
    }

    /**
     * Return whether the field 'id' is an array (false).
     */
    public static boolean isArray_id() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'id'
     */
    public static int offset_id() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'id'
     */
    public static int offsetBits_id() {
        return 0;
    }

    /**
     * Return the value (as a int) of the field 'id'
     */
    public int get_id() {
        return (int)getUIntBEElement(offsetBits_id(), 16);
    }

    /**
     * Set the value of the field 'id'
     */
    public void set_id(int value) {
        setUIntBEElement(offsetBits_id(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'id'
     */
    public static int size_id() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'id'
     */
    public static int sizeBits_id() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: sensor_t
    //   Field type: short, unsigned
    //   Offset (bits): 16
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'sensor_t' is signed (false).
     */
    public static boolean isSigned_sensor_t() {
        return false;
    }

    /**
     * Return whether the field 'sensor_t' is an array (false).
     */
    public static boolean isArray_sensor_t() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'sensor_t'
     */
    public static int offset_sensor_t() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'sensor_t'
     */
    public static int offsetBits_sensor_t() {
        return 16;
    }

    /**
     * Return the value (as a short) of the field 'sensor_t'
     */
    public short get_sensor_t() {
        return (short)getUIntBEElement(offsetBits_sensor_t(), 8);
    }

    /**
     * Set the value of the field 'sensor_t'
     */
    public void set_sensor_t(short value) {
        setUIntBEElement(offsetBits_sensor_t(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'sensor_t'
     */
    public static int size_sensor_t() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'sensor_t'
     */
    public static int sizeBits_sensor_t() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: count
    //   Field type: int, unsigned
    //   Offset (bits): 24
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'count' is signed (false).
     */
    public static boolean isSigned_count() {
        return false;
    }

    /**
     * Return whether the field 'count' is an array (false).
     */
    public static boolean isArray_count() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'count'
     */
    public static int offset_count() {
        return (24 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'count'
     */
    public static int offsetBits_count() {
        return 24;
    }

    /**
     * Return the value (as a int) of the field 'count'
     */
    public int get_count() {
        return (int)getUIntBEElement(offsetBits_count(), 16);
    }

    /**
     * Set the value of the field 'count'
     */
    public void set_count(int value) {
        setUIntBEElement(offsetBits_count(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'count'
     */
    public static int size_count() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'count'
     */
    public static int sizeBits_count() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: reading_acc
    //   Field type: int, unsigned
    //   Offset (bits): 40
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'reading_acc' is signed (false).
     */
    public static boolean isSigned_reading_acc() {
        return false;
    }

    /**
     * Return whether the field 'reading_acc' is an array (false).
     */
    public static boolean isArray_reading_acc() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'reading_acc'
     */
    public static int offset_reading_acc() {
        return (40 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'reading_acc'
     */
    public static int offsetBits_reading_acc() {
        return 40;
    }

    /**
     * Return the value (as a int) of the field 'reading_acc'
     */
    public int get_reading_acc() {
        return (int)getUIntBEElement(offsetBits_reading_acc(), 16);
    }

    /**
     * Set the value of the field 'reading_acc'
     */
    public void set_reading_acc(int value) {
        setUIntBEElement(offsetBits_reading_acc(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'reading_acc'
     */
    public static int size_reading_acc() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'reading_acc'
     */
    public static int sizeBits_reading_acc() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: reading_light
    //   Field type: short, unsigned
    //   Offset (bits): 56
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'reading_light' is signed (false).
     */
    public static boolean isSigned_reading_light() {
        return false;
    }

    /**
     * Return whether the field 'reading_light' is an array (false).
     */
    public static boolean isArray_reading_light() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'reading_light'
     */
    public static int offset_reading_light() {
        return (56 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'reading_light'
     */
    public static int offsetBits_reading_light() {
        return 56;
    }

    /**
     * Return the value (as a short) of the field 'reading_light'
     */
    public short get_reading_light() {
        return (short)getUIntBEElement(offsetBits_reading_light(), 8);
    }

    /**
     * Set the value of the field 'reading_light'
     */
    public void set_reading_light(short value) {
        setUIntBEElement(offsetBits_reading_light(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'reading_light'
     */
    public static int size_reading_light() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'reading_light'
     */
    public static int sizeBits_reading_light() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: readings
    //   Field type: int[], unsigned
    //   Offset (bits): 64
    //   Size of each element (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'readings' is signed (false).
     */
    public static boolean isSigned_readings() {
        return false;
    }

    /**
     * Return whether the field 'readings' is an array (true).
     */
    public static boolean isArray_readings() {
        return true;
    }

    /**
     * Return the offset (in bytes) of the field 'readings'
     */
    public static int offset_readings(int index1) {
        int offset = 64;
        if (index1 < 0 || index1 >= 5) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 16;
        return (offset / 8);
    }

    /**
     * Return the offset (in bits) of the field 'readings'
     */
    public static int offsetBits_readings(int index1) {
        int offset = 64;
        if (index1 < 0 || index1 >= 5) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 16;
        return offset;
    }

    /**
     * Return the entire array 'readings' as a int[]
     */
    public int[] get_readings() {
        int[] tmp = new int[5];
        for (int index0 = 0; index0 < numElements_readings(0); index0++) {
            tmp[index0] = getElement_readings(index0);
        }
        return tmp;
    }

    /**
     * Set the contents of the array 'readings' from the given int[]
     */
    public void set_readings(int[] value) {
        for (int index0 = 0; index0 < value.length; index0++) {
            setElement_readings(index0, value[index0]);
        }
    }

    /**
     * Return an element (as a int) of the array 'readings'
     */
    public int getElement_readings(int index1) {
        return (int)getUIntBEElement(offsetBits_readings(index1), 16);
    }

    /**
     * Set an element of the array 'readings'
     */
    public void setElement_readings(int index1, int value) {
        setUIntBEElement(offsetBits_readings(index1), 16, value);
    }

    /**
     * Return the total size, in bytes, of the array 'readings'
     */
    public static int totalSize_readings() {
        return (80 / 8);
    }

    /**
     * Return the total size, in bits, of the array 'readings'
     */
    public static int totalSizeBits_readings() {
        return 80;
    }

    /**
     * Return the size, in bytes, of each element of the array 'readings'
     */
    public static int elementSize_readings() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of each element of the array 'readings'
     */
    public static int elementSizeBits_readings() {
        return 16;
    }

    /**
     * Return the number of dimensions in the array 'readings'
     */
    public static int numDimensions_readings() {
        return 1;
    }

    /**
     * Return the number of elements in the array 'readings'
     */
    public static int numElements_readings() {
        return 5;
    }

    /**
     * Return the number of elements in the array 'readings'
     * for the given dimension.
     */
    public static int numElements_readings(int dimension) {
      int array_dims[] = { 5,  };
        if (dimension < 0 || dimension >= 1) throw new ArrayIndexOutOfBoundsException();
        if (array_dims[dimension] == 0) throw new IllegalArgumentException("Array dimension "+dimension+" has unknown size");
        return array_dims[dimension];
    }

}
