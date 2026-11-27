// default package

import java.util.Comparator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
