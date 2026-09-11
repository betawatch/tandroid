package yh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import zh.j5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class e4 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final j5 b;
    public final t3 c;
    public x3 d;
    public boolean e;

    public e4(int i10, long j3) {
        this.a = i10;
        j5 j5Var = new j5(i10, 0L, false);
        this.b = j5Var;
        j5Var.p = j3;
        t3 t3Var = new t3(j3, i10, new org.telegram.ui.web.b1(this, 19));
        t3Var.s = true;
        this.c = t3Var;
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
            j5 j5Var = this.b;
            if (j5Var.m != -1) {
                ConnectionsManager.getInstance(j5Var.a).cancelRequest(j5Var.m, true);
                j5Var.m = -1;
            }
            j5Var.i = false;
            this.c.f();
            this.e = false;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x3 x3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.b && (x3Var = this.d) != null) {
            x3Var.run();
        }
    }
}
