package v7;

import java.util.Date;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class r8 {
    public static long a(Date date) {
        return (date.getTime() / 1000) + 2082844800;
    }

    public static Date b(long j10) {
        return new Date((j10 - 2082844800) * 1000);
    }
}
