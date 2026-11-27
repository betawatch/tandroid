// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class ruc {
    public static uo3 a;
    public static final int[] b = new int[jn7.M1];

    static {
        int i = 0;
        while (true) {
            int[] iArr = b;
            if (i >= 129) {
                return;
            }
            iArr[i] = (int) (Math.max(0.0d, Math.min(1.0d, 7.5d - Math.sqrt(i))) * 255.0d);
            i++;
        }
    }
}
