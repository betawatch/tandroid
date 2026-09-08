package v7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class o7 {
    public static int a(int i10, int i11) {
        long j3 = i10 + i11;
        int i12 = (int) j3;
        if (j3 == ((long) i12)) {
            return i12;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i10 + ", " + i11 + ")");
    }
}
