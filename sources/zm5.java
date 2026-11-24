// default package

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class zm5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ an5 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ zm5(an5 an5Var, long j, long j2, byte b) {
        this.a = b;
        this.b = an5Var;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                an5 an5Var = this.b;
                ConcurrentHashMap concurrentHashMap = an5Var.h.u;
                String str = an5Var.a.e;
                long j = this.c;
                long j2 = this.d;
                concurrentHashMap.put(str, new long[]{j, j2});
                gm.c3(new zm5(an5Var, j, j2, (byte) 1));
                break;
            default:
                tm5 tm5Var = this.b.a;
                nm7.f(tm5Var.o).k(nm7.X1, tm5Var.e, Long.valueOf(this.c), Long.valueOf(this.d));
                break;
        }
    }
}
