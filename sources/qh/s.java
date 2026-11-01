package qh;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.b8;
import org.telegram.messenger.vs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.d01;
import org.telegram.ui.web.v1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class s implements vs {
    public final int a;
    public final TLRPC.Document b;
    public final int c;
    public final d01 d;
    public boolean e;
    public boolean f;
    public boolean h;

    public s(int i10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i11, d01 d01Var) {
        this.a = i10;
        this.b = document;
        this.c = i11;
        this.d = d01Var;
        at.f(i10).b(this, at.Y1);
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
            at.f(this.a).n(this, at.Y1);
            b8.G(this.a);
            Utilities.e.c(new v1(14, this, b8.K(this.b, null, true, true)));
        }
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.Y1) {
            a();
        }
    }
}
