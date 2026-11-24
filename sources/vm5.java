// default package

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class vm5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wm5 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ vm5(wm5 wm5Var, long j, long j2, byte b) {
        this.a = b;
        this.b = wm5Var;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wm5 wm5Var = this.b;
                ConcurrentHashMap concurrentHashMap = wm5Var.i.u;
                String str = wm5Var.a;
                long j = this.c;
                long j2 = this.d;
                concurrentHashMap.put(str, new long[]{j, j2});
                gm.c3(new vm5(wm5Var, j, j2, (byte) 1));
                break;
            default:
                wm5 wm5Var2 = this.b;
                nm7.f(wm5Var2.h).k(nm7.X1, wm5Var2.a, Long.valueOf(this.c), Long.valueOf(this.d));
                break;
        }
    }
}
