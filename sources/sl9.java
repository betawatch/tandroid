// default package

import android.os.Handler;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class sl9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bm9 b;
    public final /* synthetic */ nn9 c;
    public final /* synthetic */ long d;

    public /* synthetic */ sl9(bm9 bm9Var, nn9 nn9Var, long j, byte b) {
        this.a = b;
        this.b = bm9Var;
        this.c = nn9Var;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bm9 bm9Var = this.b;
                bm9Var.c.post(new sl9(bm9Var, this.c, this.d, (byte) 1));
                break;
            default:
                bm9 bm9Var2 = this.b;
                nn9 nn9Var = this.c;
                long j = this.d;
                if (bm9Var2.U && bm9Var2.F == nn9Var) {
                    bm9Var2.j.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + bm9.x(j));
                    un9 un9Var = (un9) bm9Var2.k.b;
                    Handler handler = un9Var.i;
                    lj4 lj4Var = un9Var.d;
                    Objects.requireNonNull(lj4Var);
                    handler.post(new kf9(lj4Var, (byte) 9));
                    break;
                }
                break;
        }
    }
}
