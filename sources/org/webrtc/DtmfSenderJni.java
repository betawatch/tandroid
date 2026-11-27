package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.DtmfSender;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
class DtmfSenderJni implements DtmfSender.Natives {
    private static JniTestInstanceHolder sOverride;

    public static DtmfSender.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new DtmfSenderJni() : (DtmfSender.Natives) obj;
    }

    public static void setInstanceForTesting(DtmfSender.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.DtmfSender.Natives
    public boolean canInsertDtmf(long j) {
        return GEN_JNI.org_webrtc_DtmfSender_canInsertDtmf(j);
    }

    @Override // org.webrtc.DtmfSender.Natives
    public int duration(long j) {
        return GEN_JNI.org_webrtc_DtmfSender_duration(j);
    }

    @Override // org.webrtc.DtmfSender.Natives
    public boolean insertDtmf(long j, String str, int i, int i2) {
        return GEN_JNI.org_webrtc_DtmfSender_insertDtmf(j, str, i, i2);
    }

    @Override // org.webrtc.DtmfSender.Natives
    public int interToneGap(long j) {
        return GEN_JNI.org_webrtc_DtmfSender_interToneGap(j);
    }

    @Override // org.webrtc.DtmfSender.Natives
    public String tones(long j) {
        return (String) GEN_JNI.org_webrtc_DtmfSender_tones(j);
    }
}
