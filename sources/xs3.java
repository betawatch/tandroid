// default package

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum xs3 {
    b(TimeUnit.NANOSECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(TimeUnit.MICROSECONDS),
    c(TimeUnit.MILLISECONDS),
    d(TimeUnit.SECONDS),
    e(TimeUnit.MINUTES),
    f(TimeUnit.HOURS),
    h(TimeUnit.DAYS);

    public final TimeUnit a;

    xs3(TimeUnit timeUnit) {
        this.a = timeUnit;
    }
}
