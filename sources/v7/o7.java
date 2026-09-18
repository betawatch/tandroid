package v7;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
