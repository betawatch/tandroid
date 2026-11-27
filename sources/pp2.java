// default package

import java.util.Comparator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
