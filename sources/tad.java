// default package

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
