// default package

import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class v01 {
    public static final List a = Arrays.asList(new t01(), new o01(), new q01(), new s01(), new p01(), new r01());

    public float a() {
        return 0.85f;
    }

    public int b() {
        return -16777216;
    }

    public float c() {
        return 0.25f;
    }

    public int d() {
        return R.raw.photo_arrow;
    }

    public float e() {
        return 1.0f;
    }

    public float f() {
        return 0.4f;
    }

    public float g() {
        return 1.0f;
    }

    public String h(int i) {
        if (i == 0) {
            return "blitWithMask";
        }
        if (i == 1) {
            return "compositeWithMask";
        }
        if (i != 2) {
            return null;
        }
        return "brush";
    }

    public float i() {
        return 1.0f;
    }

    public float j() {
        return 0.15f;
    }

    public int k() {
        return R.drawable.paint_radial_brush;
    }
}
