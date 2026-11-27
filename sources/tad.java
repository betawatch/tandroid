// default package

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class tad {
    public final long a;
    public long b;
    public long c;
    public final AtomicInteger d;
    public final byte e;

    public tad(e00 e00Var) {
        this.e = e00Var.a;
        long currentTimeMillis = System.currentTimeMillis();
        this.a = currentTimeMillis;
        this.b = currentTimeMillis;
        this.d = new AtomicInteger(1);
    }
}
