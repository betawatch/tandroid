package w7;

import java.util.Date;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public abstract class u6 {
    public static long a(Date date) {
        return (date.getTime() / 1000) + 2082844800;
    }

    public static Date b(long j3) {
        return new Date((j3 - 2082844800) * 1000);
    }
}
