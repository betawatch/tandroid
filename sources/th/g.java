package th;

import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class g extends sh.d {
    public final fj b;
    public final RadialProgress2 c;

    public g(fj fjVar) {
        this.b = fjVar;
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.c = radialProgress2;
        TLRPC.Document F0 = fjVar.F0();
        if (fj.W2(F0)) {
            TLRPC.PhotoSize w10 = w7.w(F0.thumbs, g0.L(22.0f), true, null, false);
            radialProgress2.j(w7.w(F0.thumbs, g0.L(44.0f), true, w10, true), w10, F0, fjVar);
        } else {
            String t02 = fj.t0(F0, true);
            if (TextUtils.isEmpty(t02)) {
                radialProgress2.i(null, null, null);
            } else {
                radialProgress2.h(t02);
            }
        }
        radialProgress2.g(n6.Ze, n6.af, n6.ld, n6.md);
    }

    @Override // sh.d
    public final void a(View view) {
        super.a(view);
        RadialProgress2 radialProgress2 = this.c;
        radialProgress2.n(view);
        radialProgress2.e();
        radialProgress2.setIcon(0, false, false);
    }

    @Override // sh.d
    public final void b() {
        super.b();
        this.c.f();
    }

    @Override // sh.d
    public final void c(Canvas canvas, int i7, int i10) {
        RadialProgress2 radialProgress2 = this.c;
        radialProgress2.setCircleRadius(i7 / 2);
        radialProgress2.r(0, 0, i7, i10);
        radialProgress2.draw(canvas);
    }
}
