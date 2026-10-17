package qg;

import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public abstract class m {
    public static final List a = Arrays.asList(new f(), new a(), new c(), new e(), new b(), new d());

    public float a() {
        return 0.85f;
    }

    public float b() {
        return 0.0f;
    }

    public int c() {
        return -16777216;
    }

    public float d() {
        return 0.25f;
    }

    public abstract int e();

    public float f() {
        return 1.0f;
    }

    public float g() {
        return 0.4f;
    }

    public float h() {
        return 1.0f;
    }

    public String i(int i10) {
        if (i10 == 0) {
            return "blitWithMask";
        }
        if (i10 == 1) {
            return "compositeWithMask";
        }
        if (i10 != 2) {
            return null;
        }
        return "brush";
    }

    public float j() {
        return 1.0f;
    }

    public float k() {
        return 0.15f;
    }

    public int l() {
        return R.drawable.paint_radial_brush;
    }
}
