// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class vsd {
    public static boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    public static int b(int i, int i2, boolean z) {
        return z ? i | i2 : i & (~i2);
    }
}
