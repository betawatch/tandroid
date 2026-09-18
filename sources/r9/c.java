package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k2.u;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements g {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.a = i10;
        this.b = fVar;
        this.c = runnable;
        this.d = j3;
        this.e = j10;
        this.f = timeUnit;
    }

    @Override // r9.g
    public final ScheduledFuture a(u uVar) {
        switch (this.a) {
            case 0:
                f fVar = this.b;
                return fVar.b.scheduleAtFixedRate(new d(fVar, this.c, uVar, 0), this.d, this.e, this.f);
            default:
                f fVar2 = this.b;
                return fVar2.b.scheduleWithFixedDelay(new d(fVar2, this.c, uVar, 2), this.d, this.e, this.f);
        }
    }
}
