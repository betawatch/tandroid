package sg;

import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public abstract class h {
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

    public String i(int i7) {
        if (i7 == 0) {
            return "blitWithMask";
        }
        if (i7 == 1) {
            return "compositeWithMask";
        }
        if (i7 != 2) {
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
