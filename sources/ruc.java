// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
