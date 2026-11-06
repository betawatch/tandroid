package sg;

import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class g extends h {
    public static final List c = Arrays.asList(new g(2), new g(3), new g(4), new g(1), new g(0));
    public final /* synthetic */ int b;

    public /* synthetic */ g(int i7) {
        this.b = i7;
    }

    public static g p(int i7) {
        List list = c;
        if (i7 >= 0 && i7 <= list.size()) {
            return (g) list.get(i7);
        }
        StringBuilder sb2 = new StringBuilder("Shape type must be in range from 0 to ");
        sb2.append(list.size() - 1);
        sb2.append(", but got ");
        sb2.append(i7);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    @Override // sg.h
    public final float a() {
        return 1.0f;
    }

    @Override // sg.h
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

    @Override // sg.h
    public final String i(int i7) {
        if (i7 == 0 || i7 == 1) {
            return "shape";
        }
        if (i7 != 2) {
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
                return hd.M0(2131747675, null);
            case 1:
                return hd.M0(2131747673, null);
            case 2:
                return hd.M0(2131747672, null);
            case 3:
                return hd.M0(2131747661, null);
            default:
                return hd.M0(2131747660, null);
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
