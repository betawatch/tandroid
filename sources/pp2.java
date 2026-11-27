// default package

import java.util.Comparator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class pp2 {
    public static final np2 a = new np2();
    public static final op2 b = new op2(-1);
    public static final op2 c = new op2(1);

    public pp2 a(int i, int i2) {
        return np2.f(Integer.compare(i, i2));
    }

    public pp2 b(Object obj, Object obj2, Comparator comparator) {
        return np2.f(comparator.compare(obj, obj2));
    }

    public pp2 c(boolean z, boolean z2) {
        return np2.f(Boolean.compare(z, z2));
    }

    public pp2 d(boolean z, boolean z2) {
        return np2.f(Boolean.compare(z2, z));
    }

    public int e() {
        return 0;
    }
}
