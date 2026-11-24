// default package

import android.app.Activity;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qf implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ qac e;
    public final /* synthetic */ long f;

    public /* synthetic */ qf(int i, long j, long j2, qac qacVar, long j3, byte b) {
        this.a = b;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = qacVar;
        this.f = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ylb r63Var;
        switch (this.a) {
            case 0:
                int i = this.b;
                long j = jva.v(i, false).m().amount;
                long j2 = this.c;
                qac qacVar = this.e;
                long j3 = this.f;
                if (j >= j2) {
                    qacVar.a(Long.valueOf(j3));
                    break;
                } else {
                    Activity u0 = gm.u0();
                    d S = LaunchActivity.S();
                    if (!PhotoViewer.r0().V0()) {
                        if (S == null) {
                            r63Var = null;
                        } else if (!S.hasShownSheet()) {
                            r63Var = S.getResourceProvider();
                        }
                        ylb ylbVar = r63Var;
                        if (u0 == null) {
                            long j4 = this.d;
                            new dxa(u0, ylbVar, j2, 13, pg3.r(i, j4), new lg(qacVar, j3, (byte) 0), j4).show();
                            break;
                        }
                    }
                    r63Var = new r63();
                    ylb ylbVar2 = r63Var;
                    if (u0 == null) {
                    }
                }
                break;
            default:
                int i2 = this.b;
                qf qfVar = new qf(i2, this.c, this.d, this.e, this.f, (byte) 0);
                if (!jva.v(i2, false).e) {
                    jva v = jva.v(i2, false);
                    v.e = false;
                    v.n(qfVar, false, true);
                    v.e = true;
                    break;
                } else {
                    qfVar.run();
                    break;
                }
        }
    }
}
