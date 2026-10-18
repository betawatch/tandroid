package yh;

import ai.y9;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class f4 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final y9 b;
    public final t3 c;
    public y3 d;
    public boolean e;

    public f4(int i10, long j10) {
        this.a = i10;
        y9 y9Var = new y9(i10, 0L, false);
        this.b = y9Var;
        y9Var.p = j10;
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
