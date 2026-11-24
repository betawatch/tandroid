// default package

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class re3 implements ve3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ue3 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ re3(ue3 ue3Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, byte b) {
        this.a = b;
        this.b = ue3Var;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // ve3
    public final ScheduledFuture a(k6d k6dVar) {
        byte b = this.a;
        Runnable runnable = this.c;
        ue3 ue3Var = this.b;
        switch (b) {
            case 0:
                return ue3Var.b.scheduleAtFixedRate(new se3(ue3Var, runnable, k6dVar, (byte) 0), this.d, this.e, this.f);
            default:
                return ue3Var.b.scheduleWithFixedDelay(new se3(ue3Var, runnable, k6dVar, (byte) 2), this.d, this.e, this.f);
        }
    }
}
