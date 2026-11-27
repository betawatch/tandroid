package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.MediaSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public class MediaSourceJni implements MediaSource.Natives {
    private static JniTestInstanceHolder sOverride;

    public static MediaSource.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new MediaSourceJni() : (MediaSource.Natives) obj;
    }

    public static void setInstanceForTesting(MediaSource.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.MediaSource.Natives
    public MediaSource.State getState(long j) {
        return (MediaSource.State) GEN_JNI.org_webrtc_MediaSource_getState(j);
    }
}
