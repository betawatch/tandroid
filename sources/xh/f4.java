package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.m5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class f4 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final m5 b;
    public final u3 c;
    public y3 d;
    public boolean e;

    public f4(int i10, long j3) {
        this.a = i10;
        m5 m5Var = new m5(i10, 0L, false);
        this.b = m5Var;
        m5Var.p = j3;
        u3 u3Var = new u3(j3, i10, new org.telegram.ui.web.b1(this, 19));
        u3Var.s = true;
        this.c = u3Var;
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
            m5 m5Var = this.b;
            if (m5Var.m != -1) {
                ConnectionsManager.getInstance(m5Var.a).cancelRequest(m5Var.m, true);
                m5Var.m = -1;
            }
            m5Var.i = false;
            this.c.f();
            this.e = false;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        y3 y3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.b && (y3Var = this.d) != null) {
            y3Var.run();
        }
    }
}
