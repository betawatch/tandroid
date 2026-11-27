package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.TurnCustomizer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
