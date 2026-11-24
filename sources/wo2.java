// default package

import java.util.Comparator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class wo2 {
    public static final uo2 a = new uo2();
    public static final vo2 b = new vo2(-1);
    public static final vo2 c = new vo2(1);

    public wo2 a(int i, int i2) {
        return uo2.f(Integer.compare(i, i2));
    }

    public wo2 b(Object obj, Object obj2, Comparator comparator) {
        return uo2.f(comparator.compare(obj, obj2));
    }

    public wo2 c(boolean z, boolean z2) {
        return uo2.f(Boolean.compare(z, z2));
    }

    public wo2 d(boolean z, boolean z2) {
        return uo2.f(Boolean.compare(z2, z));
    }

    public int e() {
        return 0;
    }
}
