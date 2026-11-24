// default package

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class vk5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wk5 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ vk5(wk5 wk5Var, long j, long j2, byte b) {
        this.a = b;
        this.b = wk5Var;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wk5 wk5Var = this.b;
                ConcurrentHashMap concurrentHashMap = wk5Var.i.u;
                String str = wk5Var.a;
                long j = this.c;
                long j2 = this.d;
                concurrentHashMap.put(str, new long[]{j, j2});
                gl.c3(new vk5(wk5Var, j, j2, (byte) 1));
                break;
            default:
                wk5 wk5Var2 = this.b;
                kk7.f(wk5Var2.h).k(kk7.W1, wk5Var2.a, Long.valueOf(this.c), Long.valueOf(this.d));
                break;
        }
    }
}
