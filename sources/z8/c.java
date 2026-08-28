package z8;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import n5.a0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements g {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ c(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i9) {
        this.a = i9;
        this.b = fVar;
        this.c = runnable;
        this.d = j10;
        this.e = j11;
        this.f = timeUnit;
    }

    @Override // z8.g
    public final ScheduledFuture a(a0 a0Var) {
        switch (this.a) {
            case 0:
                f fVar = this.b;
                return fVar.b.scheduleAtFixedRate(new d(fVar, this.c, a0Var, 0), this.d, this.e, this.f);
            default:
                f fVar2 = this.b;
                return fVar2.b.scheduleWithFixedDelay(new d(fVar2, this.c, a0Var, 2), this.d, this.e, this.f);
        }
    }
}
