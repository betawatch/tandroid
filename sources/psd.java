// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class psd {
    public static int a(long j) {
        if (j <= 2147483647L && j >= -2147483648L) {
            return (int) j;
        }
        zo4.k(wi8.n(j, "A cast to int has gone wrong. Please contact the mp4parser discussion group (", ")"));
        return 0;
    }
}
