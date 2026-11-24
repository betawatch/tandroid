// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class zne {
    public static long[] a(long[]... jArr) {
        long j = 0;
        for (long[] jArr2 : jArr) {
            j += jArr2.length;
        }
        int i = (int) j;
        gre.d(j, "the total number of elements (%s) in the arrays must fit in an int", j == ((long) i));
        long[] jArr3 = new long[i];
        int i2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i2, jArr4.length);
            i2 += jArr4.length;
        }
        return jArr3;
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
