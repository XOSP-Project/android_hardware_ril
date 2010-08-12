// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.android.internal.telephony.ril_proto;

public final class RilCtrlCmds {
  private RilCtrlCmds() {}
  // enum CtrlCmd
  public static final int CTRL_CMD_ECHO = 0;
  public static final int CTRL_CMD_GET_RADIO_STATE = 1;
  public static final int CTRL_CMD_SET_RADIO_STATE = 2;
  
  // enum CtrlStatus
  public static final int CTRL_STATUS_OK = 0;
  public static final int CTRL_STATUS_ERR = 1;
  
  public static final class CtrlReqRadioState extends
      com.google.protobuf.micro.MessageMicro {
    public CtrlReqRadioState() {}
    
    // required .ril_proto.RadioState state = 1;
    public static final int STATE_FIELD_NUMBER = 1;
    private boolean hasState;
    private int state_ = com.android.internal.telephony.ril_proto.RilCmds.RADIOSTATE_OFF;
    public boolean hasState() { return hasState; }
    public int getState() { return state_; }
    public CtrlReqRadioState setState(int value) {
      hasState = true;
      state_ = value;
      return this;
    }
    public CtrlReqRadioState clearState() {
      hasState = false;
      state_ = com.android.internal.telephony.ril_proto.RilCmds.RADIOSTATE_OFF;
      return this;
    }
    
    public final CtrlReqRadioState clear() {
      clearState();
      cachedSize = -1;
      return this;
    }
    
    public final boolean isInitialized() {
      if (!hasState) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro output)
                        throws java.io.IOException {
      if (hasState()) {
        output.writeInt32(1, getState());
      }
    }
    
    private int cachedSize = -1;
    public int getCachedSize() {
      if (cachedSize < 0) {
        // getSerializedSize sets cachedSize
        getSerializedSize();
      }
      return cachedSize;
    }
    
    public int getSerializedSize() {
      int size = 0;
      if (hasState()) {
        size += com.google.protobuf.micro.CodedOutputStreamMicro
          .computeInt32Size(1, getState());
      }
      cachedSize = size;
      return size;
    }
    
    public CtrlReqRadioState mergeFrom(
        com.google.protobuf.micro.CodedInputStreamMicro input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
              setState(input.readInt32());
            break;
          }
        }
      }
    }
    
    public static CtrlReqRadioState parseFrom(byte[] data)
        throws com.google.protobuf.micro.InvalidProtocolBufferMicroException {
      return (CtrlReqRadioState) (new CtrlReqRadioState().mergeFrom(data));
    }
    
    public static CtrlReqRadioState parseFrom(
            com.google.protobuf.micro.CodedInputStreamMicro input)
        throws java.io.IOException {
      return (CtrlReqRadioState) (new CtrlReqRadioState().mergeFrom(input));
    }
    
  }
  
  public static final class CtrlRspRadioState extends
      com.google.protobuf.micro.MessageMicro {
    public CtrlRspRadioState() {}
    
    // required .ril_proto.RadioState state = 1;
    public static final int STATE_FIELD_NUMBER = 1;
    private boolean hasState;
    private int state_ = com.android.internal.telephony.ril_proto.RilCmds.RADIOSTATE_OFF;
    public boolean hasState() { return hasState; }
    public int getState() { return state_; }
    public CtrlRspRadioState setState(int value) {
      hasState = true;
      state_ = value;
      return this;
    }
    public CtrlRspRadioState clearState() {
      hasState = false;
      state_ = com.android.internal.telephony.ril_proto.RilCmds.RADIOSTATE_OFF;
      return this;
    }
    
    public final CtrlRspRadioState clear() {
      clearState();
      cachedSize = -1;
      return this;
    }
    
    public final boolean isInitialized() {
      if (!hasState) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro output)
                        throws java.io.IOException {
      if (hasState()) {
        output.writeInt32(1, getState());
      }
    }
    
    private int cachedSize = -1;
    public int getCachedSize() {
      if (cachedSize < 0) {
        // getSerializedSize sets cachedSize
        getSerializedSize();
      }
      return cachedSize;
    }
    
    public int getSerializedSize() {
      int size = 0;
      if (hasState()) {
        size += com.google.protobuf.micro.CodedOutputStreamMicro
          .computeInt32Size(1, getState());
      }
      cachedSize = size;
      return size;
    }
    
    public CtrlRspRadioState mergeFrom(
        com.google.protobuf.micro.CodedInputStreamMicro input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
              setState(input.readInt32());
            break;
          }
        }
      }
    }
    
    public static CtrlRspRadioState parseFrom(byte[] data)
        throws com.google.protobuf.micro.InvalidProtocolBufferMicroException {
      return (CtrlRspRadioState) (new CtrlRspRadioState().mergeFrom(data));
    }
    
    public static CtrlRspRadioState parseFrom(
            com.google.protobuf.micro.CodedInputStreamMicro input)
        throws java.io.IOException {
      return (CtrlRspRadioState) (new CtrlRspRadioState().mergeFrom(input));
    }
    
  }
  
}
