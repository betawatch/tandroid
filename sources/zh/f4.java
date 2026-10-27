package zh;

import bi.t9;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f4 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final t9 b;
    public final u3 c;
    public y3 d;
    public boolean e;

    public f4(int i10, long j10) {
        this.a = i10;
        t9 t9Var = new t9(i10, 0L, false);
        this.b = t9Var;
        t9Var.p = j10;
        u3 u3Var = new u3(j10, i10, new l1(this, 2));
        u3Var.s = true;
        this.c = u3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        NotificationCenter.getInstance(this.a).addWeakObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.b.b();
        this.c.g(false);
        this.e = true;
    }

    public final void b() {
        if (this.e) {
            NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
            this.b.a();
            this.c.a();
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
