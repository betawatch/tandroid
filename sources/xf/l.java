package xf;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class l extends m {
    public static final List b = Arrays.asList(new i(), new j(), new k(), new h(), new g());

    public static l p(int i9) {
        List list = b;
        if (i9 >= 0 && i9 <= list.size()) {
            return (l) list.get(i9);
        }
        StringBuilder sb2 = new StringBuilder("Shape type must be in range from 0 to ");
        sb2.append(list.size() - 1);
        sb2.append(", but got ");
        sb2.append(i9);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    @Override // xf.m
    public final float a() {
        return 1.0f;
    }

    @Override // xf.m
    public final String i(int i9) {
        if (i9 == 0 || i9 == 1) {
            return "shape";
        }
        if (i9 != 2) {
            return null;
        }
        return "brush";
    }

    public abstract int m();

    public abstract String n();

    public abstract int o();
}
