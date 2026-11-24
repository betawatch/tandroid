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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class tg9 extends mg9 {
    public final TL_iv.pageBlockDetails X;
    public final qh9 Y;
    public final qh9[] Z;
    public final AnimatedArrowDrawable a0;
    public final Paint b0;
    public n41 c0;
    public boolean d0;
    public float e0;
    public float f0;

    public tg9(rh9 rh9Var, Rect rect, int i, TL_iv.pageBlockDetails pageblockdetails, SpannableStringBuilder spannableStringBuilder) {
        super(rh9Var, rect, i);
        this.b0 = new Paint(1);
        this.X = pageblockdetails;
        qh9 qh9Var = new qh9(rh9Var, spannableStringBuilder, b00.c(16.0f, this.c - gl.L(53.0f), 0));
        this.Y = qh9Var;
        this.Z = new qh9[]{qh9Var};
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(bkb.v0(rh9Var.D() ? bkb.ul : bkb.tl, rh9Var.D));
        this.a0 = animatedArrowDrawable;
        animatedArrowDrawable.setAnimationProgress(pageblockdetails.open ? 0.0f : 1.0f);
    }

    @Override // mg9
    public final void A(int i, Rect rect) {
        int i2 = (int) this.N;
        Rect rect2 = this.b;
        int i3 = i2 + rect2.top;
        int i4 = rect2.left;
        rh9 rh9Var = this.a;
        rect.set(i4 - rh9Var.S, i3, (rh9Var.C + rh9Var.T) - rect2.right, i0() + i3);
    }

    @Override // mg9
    public final int C() {
        return 1;
    }

    @Override // mg9
    public final CharSequence D() {
        return k96.M0(this.X.open ? 2131754882 : 2131754892, null);
    }

    @Override // mg9
    public final CharSequence E(int i) {
        StaticLayout staticLayout = this.Y.b;
        CharSequence h0 = staticLayout != null ? mg9.h0(staticLayout.getText()) : null;
        return TextUtils.concat(k96.M0(2131753984, null), ", ", k96.M0(this.X.open ? 2131754882 : 2131754892, null), TextUtils.isEmpty(h0) ? "" : TextUtils.concat(", ", h0));
    }

    @Override // mg9
    public final int I() {
        Rect rect = this.b;
        return i0() + rect.top + rect.bottom;
    }

    @Override // mg9
    public final int J() {
        return K();
    }

    @Override // mg9
    public final int K() {
        Rect rect = this.b;
        return gl.L(16.0f) + this.Y.r() + gl.L(53.0f) + rect.left + rect.right;
    }

    @Override // mg9
    public final pib[] L() {
        return this.Z;
    }

    @Override // mg9
    public final void T() {
        this.Y.i(this.W);
    }

    @Override // mg9
    public final boolean U(int i, View view) {
        j0();
        return true;
    }

    @Override // mg9
    public final void V() {
        this.Y.f(this.W);
    }

    @Override // mg9
    public final void W(Canvas canvas) {
        n41 n41Var = this.c0;
        float a = n41Var != null ? n41Var.a(0.02f) : 1.0f;
        rh9 rh9Var = this.a;
        float f = -rh9Var.S;
        int i = rh9Var.C + rh9Var.T;
        Rect rect = this.b;
        float f2 = (i - rect.left) - rect.right;
        if (a != 1.0f) {
            canvas.save();
            canvas.scale(a, a, (f + f2) / 2.0f, i0() / 2.0f);
        }
        int v0 = bkb.v0(rh9Var.D() ? bkb.ul : bkb.tl, rh9Var.D);
        AnimatedArrowDrawable animatedArrowDrawable = this.a0;
        animatedArrowDrawable.a.setColor(v0);
        animatedArrowDrawable.invalidateSelf();
        canvas.save();
        canvas.translate(gl.N(22.6f) + f, gl.N(21.66f));
        animatedArrowDrawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(gl.L(53.0f) + f, gl.L(14.0f));
        qh9 qh9Var = this.Y;
        qh9Var.d(canvas, qh9Var.T);
        canvas.restore();
        if (a != 1.0f) {
            canvas.restore();
        }
        if (this.X.open || rh9Var.s) {
            return;
        }
        int v02 = bkb.v0(rh9Var.D() ? bkb.wl : bkb.vl, rh9Var.D);
        Paint paint = this.b0;
        paint.setColor(v02);
        canvas.drawRect(f, i0() - 1.0f, f2, i0(), paint);
    }

    @Override // mg9
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        rh9 rh9Var = this.a;
        if (actionMasked == 0) {
            this.d0 = true;
            n41 n41Var = this.c0;
            if (n41Var == null && (view = rh9Var.Q) != null) {
                n41Var = new n41(view);
                this.c0 = n41Var;
            }
            if (n41Var != null) {
                n41Var.c(true);
            }
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 3) {
                this.d0 = false;
                n41 n41Var2 = this.c0;
                if (n41Var2 != null) {
                    n41Var2.c(false);
                }
            }
            return this.d0;
        }
        if (!this.d0) {
            return false;
        }
        this.d0 = false;
        n41 n41Var3 = this.c0;
        if (n41Var3 != null) {
            n41Var3.c(false);
        }
        View view2 = rh9Var.Q;
        if (view2 != null) {
            view2.playSoundEffect(0);
        }
        j0();
        return true;
    }

    @Override // mg9
    public final void Z(int i, int i2, int i3) {
        this.T = i;
        this.U = i2;
        this.V = i3;
        int L = gl.L(53.0f) + (i - this.a.S);
        qh9 qh9Var = this.Y;
        qh9Var.c = L - qh9Var.f;
        qh9Var.d = gl.L(14.0f) + i2;
        qh9Var.e = i3;
    }

    public final int i0() {
        return ls6.e(12.66f, this.Y.b.getHeight() + gl.L(14.0f), gl.L(27.82f));
    }

    public final void j0() {
        rh9 rh9Var = this.a;
        rh9Var.W();
        TL_iv.pageBlockDetails pageblockdetails = this.X;
        boolean z = pageblockdetails.open;
        pageblockdetails.open = !z;
        this.a0.a(!z ? 0.0f : 1.0f);
        rh9Var.s = true;
        rh9Var.P();
        View view = rh9Var.Q;
        if (view != null) {
            view.invalidate();
        }
        gb2 gb2Var = rh9Var.E;
        bb2 bb2Var = rh9Var.F;
        if (gb2Var == null || bb2Var == null) {
            return;
        }
        bb2Var.G1(gb2Var, true, true);
    }

    @Override // mg9
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        mg9.m(spannableStringBuilder, this.Y, this.Z);
    }

    @Override // mg9
    public final boolean u(CharacterStyle characterStyle, int i, eg9 eg9Var) {
        if (!this.Y.o(characterStyle, eg9Var)) {
            return false;
        }
        Rect rect = this.b;
        eg9Var.e = (gl.L(53.0f) + (rect.left - this.a.S)) - r0.f;
        eg9Var.f = gl.L(14.0f) + i + rect.top;
        return true;
    }
}
