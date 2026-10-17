package yh;

import ai.x9;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class f4 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final x9 b;
    public final t3 c;
    public y3 d;
    public boolean e;

    public f4(int i10, long j10) {
        this.a = i10;
        x9 x9Var = new x9(i10, 0L, false);
        this.b = x9Var;
        x9Var.p = j10;
        t3 t3Var = new t3(j10, i10, new ig.l0(this, 28));
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
            this.b.f();
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
