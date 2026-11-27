// default package

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class yk9 extends xk9 {
    public pm3 d0;
    public v41 e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public float j0;
    public int k0;
    public final Drawable l0;
    public int m0;

    public yk9(hl9 hl9Var, Rect rect, int i, TL_iv.pageBlockBlockquote pageblockblockquote, SpannableStringBuilder spannableStringBuilder) {
        super(hl9Var, rect, i, spannableStringBuilder);
        this.l0 = c00.e(a.b, R.drawable.arrow_more);
        boolean z = pageblockblockquote.collapsed;
        this.h0 = z;
        this.i0 = z;
    }

    @Override // xk9, dk9
    public final int H() {
        if (!this.h0) {
            return super.H();
        }
        Rect rect = this.b;
        return (int) Math.min((this.X.b.getPaint().getTextSize() * 1.4f * 3.0f) + rect.top + this.a0 + rect.bottom, super.H());
    }

    @Override // xk9, dk9
    public final void V(Canvas canvas) {
        v41 v41Var = this.e0;
        float a = v41Var != null ? v41Var.a(0.01f) : 1.0f;
        int i = this.c;
        if (a != 1.0f) {
            canvas.save();
            canvas.scale(a, a, i / 2.0f, H() / 2.0f);
        }
        boolean z = this.j0 > 0.0f;
        int i2 = (this.k0 - this.b.bottom) - this.b0;
        canvas.save();
        canvas.clipRect(0, 0, i, i2);
        if (z) {
            canvas.saveLayer(0.0f, 0.0f, i, i2, null);
        }
        super.V(canvas);
        if (z) {
            if (this.d0 == null) {
                this.d0 = new pm3((byte) 7);
            }
            RectF rectF = hl.P;
            rectF.set(0.0f, i2 - hl.L(24.0f), i, i2 + 1);
            this.d0.r(canvas, rectF, 3, this.j0);
            canvas.restore();
        }
        canvas.restore();
        hl9 hl9Var = this.a;
        int h = hl9Var.y.h();
        int i3 = this.m0;
        Drawable drawable = this.l0;
        if (h != i3) {
            int h2 = hl9Var.y.h();
            this.m0 = h2;
            drawable.setColorFilter(new PorterDuffColorFilter(h2, PorterDuff.Mode.SRC_IN));
        }
        br3.e(this.l0, hl9Var.C - hl.L(24.0f), hl.L(8.0f) + ((i2 - hl.L(16.0f)) - hl.L(2.0f)), hl.L(16.0f), hl.L(16.0f), 17);
        canvas.save();
        canvas.rotate(hl.U1(this.j0, jn7.J2, 0), drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
        if (a != 1.0f) {
            canvas.restore();
        }
    }

    @Override // xk9, dk9
    public final boolean X(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        if (this.g0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.g0 = false;
            }
            return super.X(motionEvent);
        }
        hl9 hl9Var = this.a;
        if (actionMasked == 0) {
            boolean X = super.X(motionEvent);
            this.g0 = X;
            if (!X) {
                this.f0 = true;
                v41 v41Var = this.e0;
                if (v41Var == null && (view = hl9Var.Q) != null) {
                    v41Var = new v41(view);
                    this.e0 = v41Var;
                }
                if (v41Var != null) {
                    v41Var.c(true);
                    return true;
                }
            }
        } else {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.f0 = false;
                    v41 v41Var2 = this.e0;
                    if (v41Var2 != null) {
                        v41Var2.c(false);
                    }
                }
                return this.f0;
            }
            if (!this.f0) {
                return false;
            }
            this.f0 = false;
            v41 v41Var3 = this.e0;
            if (v41Var3 != null) {
                v41Var3.c(false);
            }
            View view2 = hl9Var.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            hl9Var.W();
            this.h0 = !this.h0;
            hl9Var.u = true;
            hl9Var.P();
            View view3 = hl9Var.Q;
            if (view3 != null) {
                view3.invalidate();
            }
            wb2 wb2Var = hl9Var.E;
            rb2 rb2Var = hl9Var.F;
            if (wb2Var != null && rb2Var != null) {
                rb2Var.r1(wb2Var, true, true);
            }
        }
        return true;
    }

    @Override // dk9
    public final void c0() {
        super.c0();
        this.i0 = this.h0;
    }

    @Override // dk9
    public final float y() {
        v41 v41Var = this.e0;
        if (v41Var != null) {
            return v41Var.a(0.01f);
        }
        return 1.0f;
    }
}
