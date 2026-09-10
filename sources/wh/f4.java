package wh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import xh.n5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class f4 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final n5 b;
    public final u3 c;
    public y3 d;
    public boolean e;

    public f4(int i10, long j3) {
        this.a = i10;
        n5 n5Var = new n5(i10, 0L, false);
        this.b = n5Var;
        n5Var.p = j3;
        u3 u3Var = new u3(j3, i10, new org.telegram.ui.web.y1(this, 15));
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
            n5 n5Var = this.b;
            if (n5Var.m != -1) {
                ConnectionsManager.getInstance(n5Var.a).cancelRequest(n5Var.m, true);
                n5Var.m = -1;
            }
            n5Var.i = false;
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
