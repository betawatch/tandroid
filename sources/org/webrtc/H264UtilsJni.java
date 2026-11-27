package org.webrtc;

import java.util.Map;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.H264Utils;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
class H264UtilsJni implements H264Utils.Natives {
    private static JniTestInstanceHolder sOverride;

    public static H264Utils.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new H264UtilsJni() : (H264Utils.Natives) obj;
    }

    public static void setInstanceForTesting(H264Utils.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.H264Utils.Natives
    public boolean isSameH264Profile(Map map, Map map2) {
        return GEN_JNI.org_webrtc_H264Utils_isSameH264Profile(map, map2);
    }
}
