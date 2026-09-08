package org.webrtc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpCapabilities;
import org.webrtc.RtpParameters;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public class RtpTransceiver {
    private RtpReceiver cachedReceiver;
    private RtpSender cachedSender;
    private long nativeRtpTransceiver;

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public enum RtpTransceiverDirection {
        SEND_RECV(0),
        SEND_ONLY(1),
        RECV_ONLY(2),
        INACTIVE(3),
        STOPPED(4);

        private final int nativeIndex;

        RtpTransceiverDirection(int i10) {
            this.nativeIndex = i10;
        }

        public static RtpTransceiverDirection fromNativeIndex(int i10) {
            for (RtpTransceiverDirection rtpTransceiverDirection : values()) {
                if (rtpTransceiverDirection.getNativeIndex() == i10) {
                    return rtpTransceiverDirection;
                }
            }
            throw new IllegalArgumentException(i2.g.i(i10, "Uknown native RtpTransceiverDirection type"));
        }

        public int getNativeIndex() {
            return this.nativeIndex;
        }
    }

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public static final class RtpTransceiverInit {
        private final RtpTransceiverDirection direction;
        private final List<RtpParameters.Encoding> sendEncodings;
        private final List<String> streamIds;

        public RtpTransceiverInit() {
            this(RtpTransceiverDirection.SEND_RECV);
        }

        public int getDirectionNativeIndex() {
            return this.direction.getNativeIndex();
        }

        public List<RtpParameters.Encoding> getSendEncodings() {
            return new ArrayList(this.sendEncodings);
        }

        public List<String> getStreamIds() {
            return new ArrayList(this.streamIds);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RtpTransceiverInit(RtpTransceiverDirection rtpTransceiverDirection) {
            this(rtpTransceiverDirection, r0, r0);
            List list = Collections.EMPTY_LIST;
        }

        public RtpTransceiverInit(RtpTransceiverDirection rtpTransceiverDirection, List<String> list) {
            this(rtpTransceiverDirection, list, Collections.EMPTY_LIST);
        }

        public RtpTransceiverInit(RtpTransceiverDirection rtpTransceiverDirection, List<String> list, List<RtpParameters.Encoding> list2) {
            this.direction = rtpTransceiverDirection;
            this.streamIds = new ArrayList(list);
            this.sendEncodings = new ArrayList(list2);
        }
    }

    public RtpTransceiver(long j3) {
        this.nativeRtpTransceiver = j3;
        this.cachedSender = nativeGetSender(j3);
        this.cachedReceiver = nativeGetReceiver(j3);
    }

    private void checkRtpTransceiverExists() {
        if (this.nativeRtpTransceiver == 0) {
            throw new IllegalStateException("RtpTransceiver has been disposed.");
        }
    }

    private static native RtpTransceiverDirection nativeCurrentDirection(long j3);

    private static native RtpTransceiverDirection nativeDirection(long j3);

    private static native MediaStreamTrack.MediaType nativeGetMediaType(long j3);

    private static native String nativeGetMid(long j3);

    private static native RtpReceiver nativeGetReceiver(long j3);

    private static native RtpSender nativeGetSender(long j3);

    private static native void nativeSetCodecPreferences(long j3, List<RtpCapabilities.CodecCapability> list);

    private static native boolean nativeSetDirection(long j3, RtpTransceiverDirection rtpTransceiverDirection);

    private static native void nativeStopInternal(long j3);

    private static native void nativeStopStandard(long j3);

    private static native boolean nativeStopped(long j3);

    public void dispose() {
        checkRtpTransceiverExists();
        this.cachedSender.dispose();
        this.cachedReceiver.dispose();
        JniCommon.nativeReleaseRef(this.nativeRtpTransceiver);
        this.nativeRtpTransceiver = 0L;
    }

    public RtpTransceiverDirection getCurrentDirection() {
        checkRtpTransceiverExists();
        return nativeCurrentDirection(this.nativeRtpTransceiver);
    }

    public RtpTransceiverDirection getDirection() {
        checkRtpTransceiverExists();
        return nativeDirection(this.nativeRtpTransceiver);
    }

    public MediaStreamTrack.MediaType getMediaType() {
        checkRtpTransceiverExists();
        return nativeGetMediaType(this.nativeRtpTransceiver);
    }

    public String getMid() {
        checkRtpTransceiverExists();
        return nativeGetMid(this.nativeRtpTransceiver);
    }

    public RtpReceiver getReceiver() {
        return this.cachedReceiver;
    }

    public RtpSender getSender() {
        return this.cachedSender;
    }

    public boolean isStopped() {
        checkRtpTransceiverExists();
        return nativeStopped(this.nativeRtpTransceiver);
    }

    public void setCodecPreferences(List<RtpCapabilities.CodecCapability> list) {
        checkRtpTransceiverExists();
        nativeSetCodecPreferences(this.nativeRtpTransceiver, list);
    }

    public boolean setDirection(RtpTransceiverDirection rtpTransceiverDirection) {
        checkRtpTransceiverExists();
        return nativeSetDirection(this.nativeRtpTransceiver, rtpTransceiverDirection);
    }

    public void stop() {
        checkRtpTransceiverExists();
        nativeStopInternal(this.nativeRtpTransceiver);
    }

    public void stopInternal() {
        checkRtpTransceiverExists();
        nativeStopInternal(this.nativeRtpTransceiver);
    }

    public void stopStandard() {
        checkRtpTransceiverExists();
        nativeStopStandard(this.nativeRtpTransceiver);
    }
}
