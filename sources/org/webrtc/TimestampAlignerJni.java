package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.TimestampAligner;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public class TimestampAlignerJni implements TimestampAligner.Natives {
    private static JniTestInstanceHolder sOverride;

    public static TimestampAligner.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new TimestampAlignerJni() : (TimestampAligner.Natives) obj;
    }

    public static void setInstanceForTesting(TimestampAligner.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.TimestampAligner.Natives
    public long createTimestampAligner(long j) {
        return GEN_JNI.org_webrtc_TimestampAligner_createTimestampAligner(j);
    }

    @Override // org.webrtc.TimestampAligner.Natives
    public void releaseTimestampAligner(long j) {
        GEN_JNI.org_webrtc_TimestampAligner_releaseTimestampAligner(j);
    }

    @Override // org.webrtc.TimestampAligner.Natives
    public long translateTimestamp(long j, long j2) {
        return GEN_JNI.org_webrtc_TimestampAligner_translateTimestamp(j, j2);
    }
}
