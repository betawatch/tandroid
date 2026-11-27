// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
