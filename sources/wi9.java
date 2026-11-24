// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wi9 extends qi9 {
    public final TL_iv.pageBlockDetails X;
    public final tj9 Y;
    public final tj9[] Z;
    public final AnimatedArrowDrawable a0;
    public final Paint b0;
    public u51 c0;
    public boolean d0;
    public float e0;
    public float f0;

    public wi9(uj9 uj9Var, Rect rect, int i, TL_iv.pageBlockDetails pageblockdetails, SpannableStringBuilder spannableStringBuilder) {
        super(uj9Var, rect, i);
        this.b0 = new Paint(1);
        this.X = pageblockdetails;
        tj9 tj9Var = new tj9(uj9Var, spannableStringBuilder, b10.c(16.0f, this.c - gm.L(53.0f), 0));
        this.Y = tj9Var;
        this.Z = new tj9[]{tj9Var};
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(cmb.v0(uj9Var.D() ? cmb.ul : cmb.tl, uj9Var.D));
        this.a0 = animatedArrowDrawable;
        animatedArrowDrawable.setAnimationProgress(pageblockdetails.open ? 0.0f : 1.0f);
    }

    @Override // qi9
    public final int B() {
        return 1;
    }

    @Override // qi9
    public final CharSequence C() {
        return jb6.M0(this.X.open ? 2131754882 : 2131754892, null);
    }

    @Override // qi9
    public final CharSequence D(int i) {
        StaticLayout staticLayout = this.Y.b;
        CharSequence g0 = staticLayout != null ? qi9.g0(staticLayout.getText()) : null;
        return TextUtils.concat(jb6.M0(2131753952, null), ", ", jb6.M0(this.X.open ? 2131754882 : 2131754892, null), TextUtils.isEmpty(g0) ? "" : TextUtils.concat(", ", g0));
    }

    @Override // qi9
    public final int H() {
        Rect rect = this.b;
        return h0() + rect.top + rect.bottom;
    }

    @Override // qi9
    public final int I() {
        return J();
    }

    @Override // qi9
    public final int J() {
        Rect rect = this.b;
        return gm.L(16.0f) + this.Y.r() + gm.L(53.0f) + rect.left + rect.right;
    }

    @Override // qi9
    public final qkb[] K() {
        return this.Z;
    }

    @Override // qi9
    public final void S() {
        this.Y.i(this.W);
    }

    @Override // qi9
    public final boolean T(int i, View view) {
        i0();
        return true;
    }

    @Override // qi9
    public final void U() {
        this.Y.f(this.W);
    }

    @Override // qi9
    public final void V(Canvas canvas) {
        u51 u51Var = this.c0;
        float a = u51Var != null ? u51Var.a(0.02f) : 1.0f;
        uj9 uj9Var = this.a;
        float f = -uj9Var.S;
        int i = uj9Var.C + uj9Var.T;
        Rect rect = this.b;
        float f2 = (i - rect.left) - rect.right;
        if (a != 1.0f) {
            canvas.save();
            canvas.scale(a, a, (f + f2) / 2.0f, h0() / 2.0f);
        }
        int v0 = cmb.v0(uj9Var.D() ? cmb.ul : cmb.tl, uj9Var.D);
        AnimatedArrowDrawable animatedArrowDrawable = this.a0;
        animatedArrowDrawable.a.setColor(v0);
        animatedArrowDrawable.invalidateSelf();
        canvas.save();
        canvas.translate(gm.N(22.6f) + f, gm.N(21.66f));
        animatedArrowDrawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(gm.L(53.0f) + f, gm.L(14.0f));
        tj9 tj9Var = this.Y;
        tj9Var.d(canvas, tj9Var.T);
        canvas.restore();
        if (a != 1.0f) {
            canvas.restore();
        }
        if (this.X.open || uj9Var.s) {
            return;
        }
        int v02 = cmb.v0(uj9Var.D() ? cmb.wl : cmb.vl, uj9Var.D);
        Paint paint = this.b0;
        paint.setColor(v02);
        canvas.drawRect(f, h0() - 1.0f, f2, h0(), paint);
    }

    @Override // qi9
    public final boolean X(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        uj9 uj9Var = this.a;
        if (actionMasked == 0) {
            this.d0 = true;
            u51 u51Var = this.c0;
            if (u51Var == null && (view = uj9Var.Q) != null) {
                u51Var = new u51(view);
                this.c0 = u51Var;
            }
            if (u51Var != null) {
                u51Var.c(true);
            }
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 3) {
                this.d0 = false;
                u51 u51Var2 = this.c0;
                if (u51Var2 != null) {
                    u51Var2.c(false);
                }
            }
            return this.d0;
        }
        if (!this.d0) {
            return false;
        }
        this.d0 = false;
        u51 u51Var3 = this.c0;
        if (u51Var3 != null) {
            u51Var3.c(false);
        }
        View view2 = uj9Var.Q;
        if (view2 != null) {
            view2.playSoundEffect(0);
        }
        i0();
        return true;
    }

    @Override // qi9
    public final void Y(int i, int i2, int i3) {
        this.T = i;
        this.U = i2;
        this.V = i3;
        int L = gm.L(53.0f) + (i - this.a.S);
        tj9 tj9Var = this.Y;
        tj9Var.c = L - tj9Var.f;
        tj9Var.d = gm.L(14.0f) + i2;
        tj9Var.e = i3;
    }

    public final int h0() {
        return kt6.e(12.66f, this.Y.b.getHeight() + gm.L(14.0f), gm.L(27.82f));
    }

    public final void i0() {
        uj9 uj9Var = this.a;
        uj9Var.W();
        TL_iv.pageBlockDetails pageblockdetails = this.X;
        boolean z = pageblockdetails.open;
        pageblockdetails.open = !z;
        this.a0.a(!z ? 0.0f : 1.0f);
        uj9Var.s = true;
        uj9Var.P();
        View view = uj9Var.Q;
        if (view != null) {
            view.invalidate();
        }
        rc2 rc2Var = uj9Var.E;
        mc2 mc2Var = uj9Var.F;
        if (rc2Var == null || mc2Var == null) {
            return;
        }
        mc2Var.u1(rc2Var, true, true);
    }

    @Override // qi9
    public final void j(SpannableStringBuilder spannableStringBuilder) {
        qi9.k(spannableStringBuilder, this.Y, this.Z);
    }

    @Override // qi9
    public final boolean t(CharacterStyle characterStyle, int i, ii9 ii9Var) {
        if (!this.Y.o(characterStyle, ii9Var)) {
            return false;
        }
        Rect rect = this.b;
        ii9Var.e = (gm.L(53.0f) + (rect.left - this.a.S)) - r0.f;
        ii9Var.f = gm.L(14.0f) + i + rect.top;
        return true;
    }

    @Override // qi9
    public final void z(int i, Rect rect) {
        int i2 = (int) this.N;
        Rect rect2 = this.b;
        int i3 = i2 + rect2.top;
        int i4 = rect2.left;
        uj9 uj9Var = this.a;
        rect.set(i4 - uj9Var.S, i3, (uj9Var.C + uj9Var.T) - rect2.right, h0() + i3);
    }
}
