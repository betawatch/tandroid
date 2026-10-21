package yh;

import ai.y9;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class e4 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final y9 b;
    public final s3 c;
    public x3 d;
    public boolean e;

    public e4(int i10, long j10) {
        this.a = i10;
        y9 y9Var = new y9(i10, 0L, false);
        this.b = y9Var;
        y9Var.p = j10;
        s3 s3Var = new s3(j10, i10, new ig.l0(this, 28));
        s3Var.s = true;
        this.c = s3Var;
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
        x3 x3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.b && (x3Var = this.d) != null) {
            x3Var.run();
        }
    }
}
