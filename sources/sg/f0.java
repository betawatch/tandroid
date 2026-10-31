package sg;

import ag.c2;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import j$.util.Objects;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.d20;
import org.telegram.messenger.ic;
import org.telegram.messenger.ui;
import org.telegram.messenger.v5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.f5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f0 {
    public final ImageReceiver a;
    public f5 b;
    public o0 e;
    public View f;
    public boolean g;
    public boolean i;
    public int j;
    public PorterDuffColorFilter k;
    public final Rect c = new Rect();
    public final int d = d20.s0;
    public float h = 1.0f;

    public f0(View view) {
        this.f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.z1 = true;
    }

    public final void a(Canvas canvas) {
        f5 f5Var = this.b;
        Rect rect = this.c;
        if (f5Var != null) {
            c2 c2Var = f5Var.k;
            if (c2Var != null) {
                c2Var.J0((int) (rect.width() * 0.1f));
            }
            this.b.setColorFilter(this.k);
            this.b.setBounds(rect);
            this.b.setAlpha((int) (this.h * 255.0f));
            this.b.draw(canvas);
            return;
        }
        float f7 = rect.left;
        float f10 = rect.top;
        float width = rect.width();
        float height = rect.height();
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(f7, f10, width, height);
        imageReceiver.setAlpha(this.h);
        imageReceiver.h(canvas, null);
    }

    public final void b(boolean z10) {
        this.g = z10;
        ImageReceiver imageReceiver = this.a;
        if (z10) {
            imageReceiver.P();
            f5 f5Var = this.b;
            if (f5Var != null) {
                f5Var.a(this.f);
                return;
            }
            return;
        }
        imageReceiver.R();
        f5 f5Var2 = this.b;
        if (f5Var2 != null) {
            f5Var2.n(this.f);
        }
    }

    public final void c(Rect rect) {
        this.c.set(rect);
    }

    public final void d(int i10) {
        if (this.j != i10) {
            this.j = i10;
            this.k = new PorterDuffColorFilter(this.j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(o0 o0Var) {
        if (Objects.equals(this.e, o0Var)) {
            return;
        }
        ImageReceiver imageReceiver = this.a;
        imageReceiver.f();
        f5 f5Var = this.b;
        if (f5Var != null) {
            f5Var.n(this.f);
            this.b = null;
        }
        this.e = o0Var;
        boolean z10 = this.i;
        String str = z10 ? "60_60_firstframe" : "60_60";
        if (o0Var.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(this.d).r.get(o0Var.f);
            if (tL_availableReaction != null) {
                imageReceiver.r0(ic.b(tL_availableReaction.select_animation), str, null, null, v5.f(tL_availableReaction.select_animation, t6.m6, 0.2f, null), 0L, "tgs", o0Var, 0);
                return;
            }
            return;
        }
        f5 f5Var2 = new f5(z10 ? 13 : 1, d20.s0, o0Var.g);
        this.b = f5Var2;
        if (this.g) {
            f5Var2.a(this.f);
        }
        f5 f5Var3 = this.b;
        this.j = -16777216;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        this.k = porterDuffColorFilter;
        f5Var3.setColorFilter(porterDuffColorFilter);
    }
}
