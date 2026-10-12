package s9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ji.d4;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements h {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ d(g gVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.a = i10;
        this.b = gVar;
        this.c = runnable;
        this.d = j10;
        this.e = j11;
        this.f = timeUnit;
    }

    @Override // s9.h
    public final ScheduledFuture a(d4 d4Var) {
        switch (this.a) {
            case 0:
                g gVar = this.b;
                return gVar.b.scheduleAtFixedRate(new e(gVar, this.c, d4Var, 0), this.d, this.e, this.f);
            default:
                g gVar2 = this.b;
                return gVar2.b.scheduleWithFixedDelay(new e(gVar2, this.c, d4Var, 2), this.d, this.e, this.f);
        }
    }
}
