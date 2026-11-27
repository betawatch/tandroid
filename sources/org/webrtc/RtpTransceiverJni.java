package org.webrtc;

import java.util.List;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpTransceiver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public class RtpTransceiverJni implements RtpTransceiver.Natives {
    private static JniTestInstanceHolder sOverride;

    public static RtpTransceiver.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new RtpTransceiverJni() : (RtpTransceiver.Natives) obj;
    }

    public static void setInstanceForTesting(RtpTransceiver.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.RtpTransceiver.Natives
    public RtpTransceiver.RtpTransceiverDirection currentDirection(long j) {
        return (RtpTransceiver.RtpTransceiverDirection) GEN_JNI.org_webrtc_RtpTransceiver_currentDirection(j);
    }

    @Override // org.webrtc.RtpTransceiver.Natives
    public RtpTransceiver.RtpTransceiverDirection direction(long j) {
        return (RtpTransceiver.RtpTransceiverDirection) GEN_JNI.org_webrtc_RtpTransceiver_direction(j);
    }

    @Override // org.webrtc.RtpTransceiver.Natives
    public MediaStreamTrack.MediaType getMediaType(long j) {
        return (MediaStreamTrack.MediaType) GEN_JNI.org_webrtc_RtpTransceiver_getMediaType(j);
    }

    @Override // org.webrtc.RtpTransceiver.Natives
    public String getMid(long j) {
        return (String) GEN_JNI.org_webrtc_RtpTransceiver_getMid(j);
    }

    @Override // org.webrtc.RtpTransceiver.Natives
    public RtpReceiver getReceiver(long j) {
        return (RtpReceiver) GEN_JNI.org_webrtc_RtpTransceiver_getReceiver(j);
    }

    @Override // org.webrtc.RtpTransceiver.Natives
    public RtpSender getSender(long j) {
        return (RtpSender) GEN_JNI.org_webrtc_RtpTransceiver_getSender(j);
    }

    @Override // org.webrtc.RtpTransceiver.Natives
    public RtcError setCodecPreferences(long j, List list) {
        return (RtcError) GEN_JNI.org_webrtc_RtpTransceiver_setCodecPreferences(j, list);
    }

    @Override // org.webrtc.RtpTransceiver.Natives
    public boolean setDirection(long j, RtpTransceiver.RtpTransceiverDirection rtpTransceiverDirection) {
        return GEN_JNI.org_webrtc_RtpTransceiver_setDirection(j, rtpTransceiverDirection);
    }

    @Override // org.webrtc.RtpTransceiver.Natives
    public void stopInternal(long j) {
        GEN_JNI.org_webrtc_RtpTransceiver_stopInternal(j);
    }

    @Override // org.webrtc.RtpTransceiver.Natives
    public void stopStandard(long j) {
        GEN_JNI.org_webrtc_RtpTransceiver_stopStandard(j);
    }

    @Override // org.webrtc.RtpTransceiver.Natives
    public boolean stopped(long j) {
        return GEN_JNI.org_webrtc_RtpTransceiver_stopped(j);
    }
}
