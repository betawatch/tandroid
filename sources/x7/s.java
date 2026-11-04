package x7;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class s {
    public static int a(int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (i3 == 90) {
            return 1;
        }
        if (i3 == 180) {
            return 2;
        }
        if (i3 == 270) {
            return 3;
        }
        throw new IllegalArgumentException(k2.p1.i(i3, "Invalid rotation: "));
    }
}
