package v9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Components.nd0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements h {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ d(g gVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i7) {
        this.a = i7;
        this.b = gVar;
        this.c = runnable;
        this.d = j3;
        this.e = j10;
        this.f = timeUnit;
    }

    @Override // v9.h
    public final ScheduledFuture c(nd0 nd0Var) {
        switch (this.a) {
            case 0:
                g gVar = this.b;
                return gVar.b.scheduleAtFixedRate(new e(gVar, this.c, nd0Var, 0), this.d, this.e, this.f);
            default:
                g gVar2 = this.b;
                return gVar2.b.scheduleWithFixedDelay(new e(gVar2, this.c, nd0Var, 2), this.d, this.e, this.f);
        }
    }
}
