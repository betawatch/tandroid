package tg;

import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g extends h {
    public static final List c = Arrays.asList(new g(2), new g(3), new g(4), new g(1), new g(0));
    public final /* synthetic */ int b;

    public /* synthetic */ g(int i3) {
        this.b = i3;
    }

    public static g p(int i3) {
        List list = c;
        if (i3 >= 0 && i3 <= list.size()) {
            return (g) list.get(i3);
        }
        StringBuilder sb2 = new StringBuilder("Shape type must be in range from 0 to ");
        sb2.append(list.size() - 1);
        sb2.append(", but got ");
        sb2.append(i3);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    @Override // tg.h
    public final float a() {
        return 1.0f;
    }

    @Override // tg.h
    public final int e() {
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

    @Override // tg.h
    public final String i(int i3) {
        if (i3 == 0 || i3 == 1) {
            return "shape";
        }
        if (i3 != 2) {
            return null;
        }
        return "brush";
    }

    public final int m() {
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

    public final String n() {
        switch (this.b) {
            case 0:
                return bd.M0(2131747684, null);
            case 1:
                return bd.M0(2131747682, null);
            case 2:
                return bd.M0(2131747681, null);
            case 3:
                return bd.M0(2131747670, null);
            default:
                return bd.M0(2131747669, null);
        }
    }

    public final int o() {
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
