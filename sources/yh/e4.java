package yh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import zh.f5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class e4 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final f5 b;
    public final t3 c;
    public x3 d;
    public boolean e;

    public e4(int i10, long j10) {
        this.a = i10;
        f5 f5Var = new f5(i10, 0L, false);
        this.b = f5Var;
        f5Var.p = j10;
        t3 t3Var = new t3(j10, i10, new ji.p1(this, 22));
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
            f5 f5Var = this.b;
            if (f5Var.m != -1) {
                ConnectionsManager.getInstance(f5Var.a).cancelRequest(f5Var.m, true);
                f5Var.m = -1;
            }
            f5Var.i = false;
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
