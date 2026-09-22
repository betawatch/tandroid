package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.l5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class g4 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final l5 b;
    public final v3 c;
    public z3 d;
    public boolean e;

    public g4(int i10, long j3) {
        this.a = i10;
        l5 l5Var = new l5(i10, 0L, false);
        this.b = l5Var;
        l5Var.p = j3;
        v3 v3Var = new v3(j3, i10, new org.telegram.ui.web.b1(this, 19));
        v3Var.s = true;
        this.c = v3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.b.a();
        this.c.g(false);
        this.e = true;
    }

    public final void b() {
        if (this.e) {
            NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
            l5 l5Var = this.b;
            if (l5Var.m != -1) {
                ConnectionsManager.getInstance(l5Var.a).cancelRequest(l5Var.m, true);
                l5Var.m = -1;
            }
            l5Var.i = false;
            this.c.f();
            this.e = false;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z3 z3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.b && (z3Var = this.d) != null) {
            z3Var.run();
        }
    }
}
