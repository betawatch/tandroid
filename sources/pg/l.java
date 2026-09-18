package pg;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class l extends m {
    public static final List b = Arrays.asList(new i(), new j(), new k(), new h(), new g());

    public static l p(int i10) {
        List list = b;
        if (i10 >= 0 && i10 <= list.size()) {
            return (l) list.get(i10);
        }
        StringBuilder sb2 = new StringBuilder("Shape type must be in range from 0 to ");
        sb2.append(list.size() - 1);
        sb2.append(", but got ");
        sb2.append(i10);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    @Override // pg.m
    public final float a() {
        return 1.0f;
    }

    @Override // pg.m
    public final String i(int i10) {
        if (i10 == 0 || i10 == 1) {
            return "shape";
        }
        if (i10 != 2) {
            return null;
        }
        return "brush";
    }

    public abstract int m();

    public abstract String n();

    public abstract int o();
}
