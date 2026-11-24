// default package

import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class u11 {
    public static final List a = Arrays.asList(new s11(), new n11(), new p11(), new r11(), new o11(), new q11());

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
