package qi;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class g {
    public static final g b = new g(-1);
    public final int a;

    public g(int i3) {
        if (i3 != -1 && i3 <= 0) {
            throw new IllegalArgumentException("height must be positive or -1");
        }
        this.a = i3;
    }
}
