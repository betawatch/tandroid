// default package

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
