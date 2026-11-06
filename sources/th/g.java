package th;

import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.g0;
import org.telegram.messenger.ij;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class g extends sh.c {
    public final ij b;
    public final RadialProgress2 c;

    public g(ij ijVar) {
        this.b = ijVar;
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.c = radialProgress2;
        TLRPC.Document F0 = ijVar.F0();
        if (ij.X2(F0)) {
            TLRPC.PhotoSize w10 = w7.w(F0.thumbs, g0.L(22.0f), true, null, false);
            radialProgress2.j(w7.w(F0.thumbs, g0.L(44.0f), true, w10, true), w10, F0, ijVar);
        } else {
            String t02 = ij.t0(F0, true);
            if (TextUtils.isEmpty(t02)) {
                radialProgress2.i(null, null, null);
            } else {
                radialProgress2.h(t02);
            }
        }
        radialProgress2.g(k6.We, k6.Xe, k6.id, k6.jd);
    }

    @Override // sh.c
    public final void a(View view) {
        super.a(view);
        RadialProgress2 radialProgress2 = this.c;
        radialProgress2.n(view);
        radialProgress2.e();
        radialProgress2.setIcon(0, false, false);
    }

    @Override // sh.c
    public final void b() {
        super.b();
        this.c.f();
    }

    @Override // sh.c
    public final void c(Canvas canvas, int i7, int i10) {
        RadialProgress2 radialProgress2 = this.c;
        radialProgress2.setCircleRadius(i7 / 2);
        radialProgress2.r(0, 0, i7, i10);
        radialProgress2.draw(canvas);
    }
}
