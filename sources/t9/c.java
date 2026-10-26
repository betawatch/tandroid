package t9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import li.e3;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements g {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ c(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.a = i10;
        this.b = fVar;
        this.c = runnable;
        this.d = j10;
        this.e = j11;
        this.f = timeUnit;
    }

    @Override // t9.g
    public final ScheduledFuture a(e3 e3Var) {
        switch (this.a) {
            case 0:
                f fVar = this.b;
                return fVar.b.scheduleAtFixedRate(new d(fVar, this.c, e3Var, 0), this.d, this.e, this.f);
            default:
                f fVar2 = this.b;
                return fVar2.b.scheduleWithFixedDelay(new d(fVar2, this.c, e3Var, 2), this.d, this.e, this.f);
        }
    }
}
