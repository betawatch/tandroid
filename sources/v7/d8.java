package v7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class d8 {
    public static long[] a(long[]... jArr) {
        long j10 = 0;
        for (long[] jArr2 : jArr) {
            j10 += jArr2.length;
        }
        int i10 = (int) j10;
        t6.d(j10, "the total number of elements (%s) in the arrays must fit in an int", j10 == ((long) i10));
        long[] jArr3 = new long[i10];
        int i11 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i11, jArr4.length);
            i11 += jArr4.length;
        }
        return jArr3;
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
