// default package

import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t11 extends u11 {
    public static final List c = Arrays.asList(new t11(2), new t11(3), new t11(4), new t11(1), new t11(0));
    public final /* synthetic */ byte b;

    public /* synthetic */ t11(byte b) {
        this.b = b;
    }

    public static t11 o(int i) {
        List list = c;
        if (i >= 0 && i <= list.size()) {
            return (t11) list.get(i);
        }
        zo4.m("Shape type must be in range from 0 to ", list.size() - 1, ", but got ", i);
        return null;
    }

    @Override // u11
    public final float a() {
        return 1.0f;
    }

    @Override // u11
    public final int d() {
        switch (this.b) {
            case 0:
                return R.drawable.photo_arrowshape;
            case 1:
                return R.drawable.msg_msgbubble;
            case 2:
                return R.drawable.photo_circle;
            case 3:
                return R.drawable.photo_rectangle;
            default:
                return R.drawable.photo_star;
        }
    }

    @Override // u11
    public final String h(int i) {
        if (i == 0 || i == 1) {
            return "shape";
        }
        if (i != 2) {
            return null;
        }
        return "brush";
    }

    public final int l() {
        switch (this.b) {
            case 0:
                return R.drawable.photo_arrowshape;
            case 1:
                return R.drawable.msg_msgbubble2;
            case 2:
                return R.drawable.photo_circle_fill;
            case 3:
                return R.drawable.photo_rectangle_fill;
            default:
                return R.drawable.photo_star_fill;
        }
    }

    public final String m() {
        switch (this.b) {
            case 0:
                return jb6.M0(2131747409, null);
            case 1:
                return jb6.M0(2131747407, null);
            case 2:
                return jb6.M0(2131747406, null);
            case 3:
                return jb6.M0(2131747395, null);
            default:
                return jb6.M0(2131747394, null);
        }
    }

    public final int n() {
        switch (this.b) {
            case 0:
                return 4;
            case 1:
                return 3;
            case 2:
                return 0;
            case 3:
                return 1;
            default:
                return 2;
        }
    }
}
