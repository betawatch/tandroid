package xb;

import q6.m;
import r1.f;
import wb.c;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class a extends c {
    public static final a b;

    static {
        f fVar = new f();
        fVar.a = -1.0f;
        boolean z9 = false;
        if (Float.compare(0.5f, 0.0f) >= 0 && Float.compare(0.5f, 1.0f) <= 0) {
            z9 = true;
        }
        m.a("Confidence Threshold should be in range [0.0f, 1.0f].", z9);
        fVar.a = 0.5f;
        b = new a(fVar);
    }
}
