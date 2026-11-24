package org.webrtc;

import org.webrtc.EglBase;
import org.webrtc.EglBase10;
import org.webrtc.EglBase14;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int a = 0;

    static {
        Object obj = EglBase.lock;
    }

    public static EglBase a(EglBase.Context context, int[] iArr) {
        if (context == null) {
            return EglBase14Impl.isEGL14Supported() ? new EglBase14Impl(null, iArr) : new EglBase10Impl(null, iArr);
        }
        if (context instanceof EglBase14.Context) {
            return new EglBase14Impl(((EglBase14.Context) context).getRawContext(), iArr);
        }
        if (context instanceof EglBase10.Context) {
            return new EglBase10Impl(((EglBase10.Context) context).getRawContext(), iArr);
        }
        u36.j("Unrecognized Context");
        return null;
    }

    public static int b(int[] iArr) {
        for (int i = 0; i < iArr.length - 1; i++) {
            if (iArr[i] == 12352) {
                int i2 = iArr[i + 1];
                if (i2 != 4) {
                    return i2 != 64 ? 1 : 3;
                }
                return 2;
            }
        }
        return 1;
    }
}
