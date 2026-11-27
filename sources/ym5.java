// default package

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class ym5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zm5 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ym5(zm5 zm5Var, long j, long j2, byte b) {
        this.a = b;
        this.b = zm5Var;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zm5 zm5Var = this.b;
                ConcurrentHashMap concurrentHashMap = zm5Var.i.u;
                String str = zm5Var.a;
                long j = this.c;
                long j2 = this.d;
                concurrentHashMap.put(str, new long[]{j, j2});
                hl.c3(new ym5(zm5Var, j, j2, (byte) 1));
                break;
            default:
                zm5 zm5Var2 = this.b;
                jn7.f(zm5Var2.h).k(jn7.X1, zm5Var2.a, Long.valueOf(this.c), Long.valueOf(this.d));
                break;
        }
    }
}
