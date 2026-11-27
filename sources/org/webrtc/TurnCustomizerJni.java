package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.TurnCustomizer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public class TurnCustomizerJni implements TurnCustomizer.Natives {
    private static JniTestInstanceHolder sOverride;

    public static TurnCustomizer.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new TurnCustomizerJni() : (TurnCustomizer.Natives) obj;
    }

    public static void setInstanceForTesting(TurnCustomizer.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.TurnCustomizer.Natives
    public void freeTurnCustomizer(long j) {
        GEN_JNI.org_webrtc_TurnCustomizer_freeTurnCustomizer(j);
    }
}
