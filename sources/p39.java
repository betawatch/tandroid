// default package

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import j$.util.Objects;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class p39 {
    public final ImageReceiver a;
    public wl b;
    public w49 e;
    public View f;
    public boolean g;
    public boolean i;
    public int j;
    public PorterDuffColorFilter k;
    public final Rect c = new Rect();
    public final int d = yac.t0;
    public float h = 1.0f;

    public p39(View view) {
        this.f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.A1 = true;
    }

    public final void a(Canvas canvas) {
        wl wlVar = this.b;
        Rect rect = this.c;
        if (wlVar != null) {
            nl nlVar = wlVar.k;
            if (nlVar != null) {
                nlVar.q0((int) (rect.width() * 0.1f));
            }
            this.b.setColorFilter(this.k);
            this.b.setBounds(rect);
            this.b.setAlpha((int) (this.h * 255.0f));
            this.b.draw(canvas);
            return;
        }
        float f = rect.left;
        float f2 = rect.top;
        float width = rect.width();
        float height = rect.height();
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0(f, f2, width, height);
        imageReceiver.setAlpha(this.h);
        imageReceiver.h(canvas, null);
    }

    public final void b(boolean z) {
        this.g = z;
        ImageReceiver imageReceiver = this.a;
        if (z) {
            imageReceiver.I();
            wl wlVar = this.b;
            if (wlVar != null) {
                wlVar.b(this.f);
                return;
            }
            return;
        }
        imageReceiver.K();
        wl wlVar2 = this.b;
        if (wlVar2 != null) {
            wlVar2.o(this.f);
        }
    }

    public final void c(Rect rect) {
        this.c.set(rect);
    }

    public final void d(int i) {
        if (this.j != i) {
            this.j = i;
            this.k = new PorterDuffColorFilter(this.j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(w49 w49Var) {
        if (Objects.equals(this.e, w49Var)) {
            return;
        }
        ImageReceiver imageReceiver = this.a;
        imageReceiver.f();
        wl wlVar = this.b;
        if (wlVar != null) {
            wlVar.o(this.f);
            this.b = null;
        }
        this.e = w49Var;
        boolean z = this.i;
        String str = z ? "60_60_firstframe" : "60_60";
        if (w49Var.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(this.d).r.get(w49Var.f);
            if (tL_availableReaction != null) {
                imageReceiver.Z(jn5.b(tL_availableReaction.select_animation), str, null, null, lp3.f(tL_availableReaction.select_animation, aob.m6, 0.2f, null), 0L, "tgs", w49Var, 0);
                return;
            }
            return;
        }
        wl wlVar2 = new wl(z ? 13 : 1, yac.t0, w49Var.g);
        this.b = wlVar2;
        if (this.g) {
            wlVar2.b(this.f);
        }
        wl wlVar3 = this.b;
        this.j = -16777216;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        this.k = porterDuffColorFilter;
        wlVar3.setColorFilter(porterDuffColorFilter);
    }
}
