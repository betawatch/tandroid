package vh;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c9 extends View {
    public final bi0 a;
    public final org.telegram.ui.Components.e6 b;
    public final Paint c;
    public final Paint d;
    public final dc e;
    public boolean f;
    public final org.telegram.ui.Components.t5 h;

    public c9(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new dc(this);
        gr grVar = gr.h;
        this.h = new org.telegram.ui.Components.t5(this, 0L, 240L, grVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(2.66f));
        paint.setShadowLayer(org.telegram.messenger.i0.N(3.0f), 0.0f, org.telegram.messenger.i0.L(1.66f), 805306368);
        paint2.setColor(855638016);
        bi0 bi0Var = new bi0(R.raw.group_pip_delete_icon, org.telegram.messenger.i0.L(48.0f), org.telegram.messenger.i0.L(48.0f), true, null);
        this.a = bi0Var;
        bi0Var.R(this);
        bi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        bi0Var.h = true;
        bi0Var.P(0);
        bi0Var.J(true);
        bi0Var.start();
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(true, true, false);
        this.b = e6Var;
        e6Var.n(0.3f, 250L, grVar);
        e6Var.M = org.telegram.messenger.i0.q.x;
        e6Var.w(org.telegram.messenger.i0.L(14.0f));
        e6Var.u(-1);
        e6Var.s(org.telegram.messenger.i0.N(1.33f), org.telegram.messenger.i0.L(1.0f), TLObject.FLAG_30);
        e6Var.t(cd.L0(2131743970, null), true, true);
        e6Var.b = 17;
    }

    public final void a(boolean z10, boolean z11) {
        this.e.c(z10);
        this.b.t(cd.L0((z10 || z11) ? 2131743969 : 2131743970, null), true, true);
        boolean z12 = z10 && !z11;
        this.f = z12;
        bi0 bi0Var = this.a;
        if (z12) {
            if (bi0Var.a0 > 34) {
                bi0Var.N(0, false, false);
            }
            bi0Var.P(33);
            bi0Var.start();
        } else {
            bi0Var.P(z11 ? 66 : 0);
            bi0Var.start();
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float L = org.telegram.messenger.i0.L(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float d = (this.h.d(this.f) * org.telegram.messenger.i0.L(3.0f)) + L;
        canvas.drawCircle(width, height, d, this.d);
        canvas.drawCircle(width, height, d, this.c);
        float L2 = org.telegram.messenger.i0.L(48.0f) / 2.0f;
        bi0 bi0Var = this.a;
        bi0Var.setBounds((int) (width - L2), (int) (height - L2), (int) (width + L2), (int) (L2 + height));
        bi0Var.draw(canvas);
        int L3 = (int) (height + L + org.telegram.messenger.i0.L(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.e6 e6Var = this.b;
        e6Var.setBounds(0, L3, width2, height2);
        e6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, org.telegram.messenger.i0.L(120.0f));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b || super.verifyDrawable(drawable);
    }
}
