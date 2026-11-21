package v9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import v4.f0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements g {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i7) {
        this.a = i7;
        this.b = fVar;
        this.c = runnable;
        this.d = j3;
        this.e = j10;
        this.f = timeUnit;
    }

    @Override // v9.g
    public final ScheduledFuture a(f0 f0Var) {
        switch (this.a) {
            case 0:
                f fVar = this.b;
                return fVar.b.scheduleAtFixedRate(new d(fVar, this.c, f0Var, 0), this.d, this.e, this.f);
            default:
                f fVar2 = this.b;
                return fVar2.b.scheduleWithFixedDelay(new d(fVar2, this.c, f0Var, 2), this.d, this.e, this.f);
        }
    }
}
