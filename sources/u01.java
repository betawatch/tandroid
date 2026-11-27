// default package

import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class u01 extends v01 {
    public static final List c = Arrays.asList(new u01(2), new u01(3), new u01(4), new u01(1), new u01(0));
    public final /* synthetic */ byte b;

    public /* synthetic */ u01(byte b) {
        this.b = b;
    }

    public static u01 o(int i) {
        List list = c;
        if (i >= 0 && i <= list.size()) {
            return (u01) list.get(i);
        }
        xi4.m("Shape type must be in range from 0 to ", list.size() - 1, ", but got ", i);
        return null;
    }

    @Override // v01
    public final float a() {
        return 1.0f;
    }

    @Override // v01
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

    @Override // v01
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
                return ob6.M0(2131747403, null);
            case 1:
                return ob6.M0(2131747401, null);
            case 2:
                return ob6.M0(2131747400, null);
            case 3:
                return ob6.M0(2131747389, null);
            default:
                return ob6.M0(2131747388, null);
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
