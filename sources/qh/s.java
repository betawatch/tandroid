package qh;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.f11;
import org.telegram.ui.web.v1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s implements us {
    public final int a;
    public final TLRPC.Document b;
    public final int c;
    public final f11 d;
    public boolean e;
    public boolean f;
    public boolean h;

    public s(int i10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i11, f11 f11Var) {
        this.a = i10;
        this.b = document;
        this.c = i11;
        this.d = f11Var;
        zs.f(i10).b(this, zs.Y1);
        b8.G(i10);
        if (!b8.K(document, null, true, true).exists()) {
            b8.G(i10).X(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (this.e || this.f) {
            return;
        }
        b8.G(this.a);
        if (b8.K(this.b, null, true, true).exists()) {
            this.f = true;
            zs.f(this.a).n(this, zs.Y1);
            b8.G(this.a);
            Utilities.e.c(new v1(13, this, b8.K(this.b, null, true, true)));
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.Y1) {
            a();
        }
    }
}
