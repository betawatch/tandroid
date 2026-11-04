package u9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Components.i9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements h {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ d(g gVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i3) {
        this.a = i3;
        this.b = gVar;
        this.c = runnable;
        this.d = j10;
        this.e = j11;
        this.f = timeUnit;
    }

    @Override // u9.h
    public final ScheduledFuture a(i9 i9Var) {
        switch (this.a) {
            case 0:
                g gVar = this.b;
                return gVar.b.scheduleAtFixedRate(new e(gVar, this.c, i9Var, 0), this.d, this.e, this.f);
            default:
                g gVar2 = this.b;
                return gVar2.b.scheduleWithFixedDelay(new e(gVar2, this.c, i9Var, 2), this.d, this.e, this.f);
        }
    }
}
