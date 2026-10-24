package w7;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class b7 {
    public static int a(long j10) {
        if (j10 > 2147483647L || j10 < -2147483648L) {
            throw new RuntimeException(org.telegram.ui.Cells.b1.k(j10, "A cast to int has gone wrong. Please contact the mp4parser discussion group (", ")"));
        }
        return (int) j10;
    }
}
