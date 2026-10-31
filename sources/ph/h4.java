package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.o5;
import rh.e6;
import rh.h8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h4 extends View {
    public final rh.g4 a;
    public final p6 b;
    public float c;
    public float d;
    public Drawable e;

    public h4(int i10, Context context, p6 p6Var) {
        super(context);
        this.b = p6Var;
        rh.g4 g4Var = new rh.g4(i10, this, p6Var);
        this.a = g4Var;
        g4Var.y.setCallback(this);
        zs.i(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        rh.g4 g4Var = this.a;
        d5 d5Var = g4Var.e;
        f1 f1Var = g4Var.j;
        ImageReceiver imageReceiver = g4Var.d;
        g4Var.N = false;
        g4Var.Q = null;
        g4Var.R = null;
        g4Var.p = false;
        g4Var.k = (TL_stars.starGiftAttributeBackdrop) e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        g4Var.l = (TL_stars.starGiftAttributePattern) e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = g4Var.m;
        g4Var.m = (TL_stars.starGiftAttributeModel) e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = g4Var.f;
        g4Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = g4Var.l;
        if (stargiftattributepattern != null) {
            d5Var.i(stargiftattributepattern.document, false);
        } else {
            d5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = g4Var.m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
            imageReceiver.X(0);
            imageReceiver.e();
            imageReceiver.W(0);
            h8.b1(imageReceiver, g4Var.m.document, zs.v1);
        }
        boolean z11 = tL_starGiftUnique.burned;
        g4Var.L = z11;
        if (z11) {
            int w02 = t6.w0(t6.q7, g4Var.c);
            Paint paint2 = (Paint) f1Var.b;
            paint2.setShader(null);
            paint2.setColor(w02);
            g4Var.M = a7.b;
            f1Var.f(11, cd.L0(2131749902, null), true);
        } else {
            f1Var.e(g4Var.k, true, false);
            f1Var.f(11, cd.L0(2131749903, null), true);
        }
        if (g4Var.S) {
            imageReceiver.P();
            d5Var.a();
            g4Var.y.d.P();
        }
        g4Var.O = z20.C(64.0f, (org.telegram.messenger.i0.q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.m, (int) (org.telegram.messenger.i0.Q1() ? org.telegram.messenger.i0.Q0() * 0.6f : (org.telegram.messenger.i0.q.x * 0.62f) - org.telegram.messenger.i0.L(34.0f)));
        if (!org.telegram.messenger.i0.Q1()) {
            g4Var.O = (int) (g4Var.O * 1.2f);
        }
        g4Var.O -= org.telegram.messenger.i0.L(8.0f);
        g4Var.h(tL_starGiftUnique, j10, tL_textWithEntities, str);
        fe.f fVar = g4Var.T;
        if (z10) {
            int round = Math.round(fVar.h ? fVar.g : fVar.f);
            int i10 = g4Var.O;
            if (round != i10) {
                fVar.a(i10);
            }
        } else {
            fVar.c(g4Var.O);
        }
        requestLayout();
        invalidate();
    }

    public rh.g4 getLayout() {
        return this.a;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rh.g4 g4Var = this.a;
        g4Var.S = false;
        g4Var.d.R();
        g4Var.e.b();
        l0 l0Var = g4Var.y;
        l0Var.d.R();
        o5.release((View) null, l0Var.q);
        l0Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        p6 p6Var = this.b;
        if (p6Var != null) {
            p6Var.b(0.0f, getY(), getMeasuredWidth(), height);
        } else {
            t6.r(0.0f, getY(), getMeasuredWidth(), height);
        }
        rh.g4 g4Var = this.a;
        this.c = (getWidth() - ((int) g4Var.T.f)) / 2.0f;
        float L = g4Var.T.f + org.telegram.messenger.i0.L(8.0f);
        float width = (getWidth() - L) / 2.0f;
        float L2 = this.d - org.telegram.messenger.i0.L(4.0f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(width, L2, L + width, g4Var.P + L2 + org.telegram.messenger.i0.L(8.0f));
        Rect rect = org.telegram.messenger.i0.Q;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.c, this.d);
        g4Var.b(canvas);
        g4Var.c(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int i12 = (int) this.a.T.f;
        this.c = (size - i12) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + r4.P);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.e(this.c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a.y;
    }
}
