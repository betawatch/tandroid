package v7;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public abstract class y7 {
    public static long[] a(long[]... jArr) {
        long j3 = 0;
        for (long[] jArr2 : jArr) {
            j3 += jArr2.length;
        }
        int i10 = (int) j3;
        t6.b(j3, "the total number of elements (%s) in the arrays must fit in an int", j3 == ((long) i10));
        long[] jArr3 = new long[i10];
        int i11 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i11, jArr4.length);
            i11 += jArr4.length;
        }
        return jArr3;
    }

    public static int b(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }
}
