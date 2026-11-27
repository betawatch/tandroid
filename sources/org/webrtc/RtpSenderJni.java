package org.webrtc;

import java.util.List;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.RtpSender;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public class RtpSenderJni implements RtpSender.Natives {
    private static JniTestInstanceHolder sOverride;

    public static RtpSender.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new RtpSenderJni() : (RtpSender.Natives) obj;
    }

    public static void setInstanceForTesting(RtpSender.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.RtpSender.Natives
    public long getDtmfSender(long j) {
        return GEN_JNI.org_webrtc_RtpSender_getDtmfSender(j);
    }

    @Override // org.webrtc.RtpSender.Natives
    public String getId(long j) {
        return (String) GEN_JNI.org_webrtc_RtpSender_getId(j);
    }

    @Override // org.webrtc.RtpSender.Natives
    public String getMediaType(long j) {
        return (String) GEN_JNI.org_webrtc_RtpSender_getMediaType(j);
    }

    @Override // org.webrtc.RtpSender.Natives
    public RtpParameters getParameters(long j) {
        return (RtpParameters) GEN_JNI.org_webrtc_RtpSender_getParameters(j);
    }

    @Override // org.webrtc.RtpSender.Natives
    public List getStreams(long j) {
        return (List) GEN_JNI.org_webrtc_RtpSender_getStreams(j);
    }

    @Override // org.webrtc.RtpSender.Natives
    public long getTrack(long j) {
        return GEN_JNI.org_webrtc_RtpSender_getTrack(j);
    }

    @Override // org.webrtc.RtpSender.Natives
    public void setFrameEncryptor(long j, long j2) {
        GEN_JNI.org_webrtc_RtpSender_setFrameEncryptor(j, j2);
    }

    @Override // org.webrtc.RtpSender.Natives
    public boolean setParameters(long j, RtpParameters rtpParameters) {
        return GEN_JNI.org_webrtc_RtpSender_setParameters(j, rtpParameters);
    }

    @Override // org.webrtc.RtpSender.Natives
    public void setStreams(long j, List list) {
        GEN_JNI.org_webrtc_RtpSender_setStreams(j, list);
    }

    @Override // org.webrtc.RtpSender.Natives
    public boolean setTrack(long j, long j2) {
        return GEN_JNI.org_webrtc_RtpSender_setTrack(j, j2);
    }
}
