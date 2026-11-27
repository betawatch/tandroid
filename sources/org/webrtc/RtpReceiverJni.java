package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.RtpReceiver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public class RtpReceiverJni implements RtpReceiver.Natives {
    private static JniTestInstanceHolder sOverride;

    public static RtpReceiver.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new RtpReceiverJni() : (RtpReceiver.Natives) obj;
    }

    public static void setInstanceForTesting(RtpReceiver.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.RtpReceiver.Natives
    public String getId(long j) {
        return (String) GEN_JNI.org_webrtc_RtpReceiver_getId(j);
    }

    @Override // org.webrtc.RtpReceiver.Natives
    public RtpParameters getParameters(long j) {
        return (RtpParameters) GEN_JNI.org_webrtc_RtpReceiver_getParameters(j);
    }

    @Override // org.webrtc.RtpReceiver.Natives
    public long getTrack(long j) {
        return GEN_JNI.org_webrtc_RtpReceiver_getTrack(j);
    }

    @Override // org.webrtc.RtpReceiver.Natives
    public void setFrameDecryptor(long j, long j2) {
        GEN_JNI.org_webrtc_RtpReceiver_setFrameDecryptor(j, j2);
    }

    @Override // org.webrtc.RtpReceiver.Natives
    public long setObserver(long j, RtpReceiver.Observer observer) {
        return GEN_JNI.org_webrtc_RtpReceiver_setObserver(j, observer);
    }

    @Override // org.webrtc.RtpReceiver.Natives
    public void unsetObserver(long j, long j2) {
        GEN_JNI.org_webrtc_RtpReceiver_unsetObserver(j, j2);
    }
}
