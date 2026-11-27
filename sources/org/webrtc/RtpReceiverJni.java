package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.RtpReceiver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
