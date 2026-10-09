package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.e5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class g4 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final e5 b;
    public final v3 c;
    public z3 d;
    public boolean e;

    public g4(int i10, long j3) {
        this.a = i10;
        e5 e5Var = new e5(i10, 0L, false);
        this.b = e5Var;
        e5Var.p = j3;
        v3 v3Var = new v3(j3, i10, new ii.q1(this, 22));
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
            e5 e5Var = this.b;
            if (e5Var.m != -1) {
                ConnectionsManager.getInstance(e5Var.a).cancelRequest(e5Var.m, true);
                e5Var.m = -1;
            }
            e5Var.i = false;
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
