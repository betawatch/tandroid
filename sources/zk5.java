// default package

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class zk5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ al5 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ zk5(al5 al5Var, long j, long j2, byte b) {
        this.a = b;
        this.b = al5Var;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                al5 al5Var = this.b;
                ConcurrentHashMap concurrentHashMap = al5Var.h.u;
                String str = al5Var.a.e;
                long j = this.c;
                long j2 = this.d;
                concurrentHashMap.put(str, new long[]{j, j2});
                gl.c3(new zk5(al5Var, j, j2, (byte) 1));
                break;
            default:
                tk5 tk5Var = this.b.a;
                kk7.f(tk5Var.o).k(kk7.W1, tk5Var.e, Long.valueOf(this.c), Long.valueOf(this.d));
                break;
        }
    }
}
