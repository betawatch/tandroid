// default package

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class yd3 implements ce3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ be3 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ yd3(be3 be3Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, byte b) {
        this.a = b;
        this.b = be3Var;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // ce3
    public final ScheduledFuture a(z8d z8dVar) {
        byte b = this.a;
        Runnable runnable = this.c;
        be3 be3Var = this.b;
        switch (b) {
            case 0:
                return be3Var.b.scheduleAtFixedRate(new zd3(be3Var, runnable, z8dVar, (byte) 0), this.d, this.e, this.f);
            default:
                return be3Var.b.scheduleWithFixedDelay(new zd3(be3Var, runnable, z8dVar, (byte) 2), this.d, this.e, this.f);
        }
    }
}
