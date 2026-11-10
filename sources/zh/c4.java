package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import bi.dd;
import bi.ea;
import bi.m7;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.q5;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c4 extends View {
    public final m7 a;
    public final h6 b;
    public float c;
    public float d;
    public Drawable e;

    public c4(int i7, Context context, h6 h6Var) {
        super(context);
        this.b = h6Var;
        m7 m7Var = new m7(i7, this, h6Var);
        this.a = m7Var;
        m7Var.y.setCallback(this);
        qs.i(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z9) {
        m7 m7Var = this.a;
        f5 f5Var = m7Var.e;
        b1 b1Var = m7Var.j;
        ImageReceiver imageReceiver = m7Var.d;
        m7Var.N = false;
        m7Var.Q = null;
        m7Var.R = null;
        m7Var.p = false;
        m7Var.k = (TL_stars.starGiftAttributeBackdrop) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        m7Var.l = (TL_stars.starGiftAttributePattern) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = m7Var.m;
        m7Var.m = (TL_stars.starGiftAttributeModel) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = m7Var.f;
        m7Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = m7Var.l;
        if (stargiftattributepattern != null) {
            f5Var.i(stargiftattributepattern.document, false);
        } else {
            f5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = m7Var.m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
            imageReceiver.X(0);
            imageReceiver.e();
            imageReceiver.W(0);
            dd.c1(imageReceiver, m7Var.m.document, qs.v1);
        }
        boolean z10 = tL_starGiftUnique.burned;
        m7Var.L = z10;
        if (z10) {
            int w02 = m6.w0(m6.q7, m7Var.c);
            Paint paint2 = (Paint) b1Var.b;
            paint2.setShader(null);
            paint2.setColor(w02);
            m7Var.M = t6.b;
            b1Var.f(11, id.M0(2131749893, null), true);
        } else {
            b1Var.e(m7Var.k, true, false);
            b1Var.f(11, id.M0(2131749894, null), true);
        }
        if (m7Var.S) {
            imageReceiver.P();
            f5Var.a();
            m7Var.y.d.P();
        }
        m7Var.O = org.telegram.messenger.camera.q.C(64.0f, (org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m, (int) (org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.Q0() * 0.6f : (org.telegram.messenger.g0.q.x * 0.62f) - org.telegram.messenger.g0.L(34.0f)));
        if (!org.telegram.messenger.g0.Q1()) {
            m7Var.O = (int) (m7Var.O * 1.2f);
        }
        m7Var.O -= org.telegram.messenger.g0.L(8.0f);
        m7Var.h(tL_starGiftUnique, j3, tL_textWithEntities, str);
        te.c cVar = m7Var.T;
        if (z9) {
            int round = Math.round(cVar.h ? cVar.g : cVar.f);
            int i7 = m7Var.O;
            if (round != i7) {
                cVar.a(i7);
            }
        } else {
            cVar.c(m7Var.O);
        }
        requestLayout();
        invalidate();
    }

    public m7 getLayout() {
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
        m7 m7Var = this.a;
        m7Var.S = false;
        m7Var.d.R();
        m7Var.e.b();
        i0 i0Var = m7Var.y;
        i0Var.d.R();
        q5.release((View) null, i0Var.q);
        i0Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        h6 h6Var = this.b;
        if (h6Var != null) {
            h6Var.b(0.0f, getY(), getMeasuredWidth(), height);
        } else {
            m6.r(0.0f, getY(), getMeasuredWidth(), height);
        }
        m7 m7Var = this.a;
        this.c = (getWidth() - ((int) m7Var.T.f)) / 2.0f;
        float L = m7Var.T.f + org.telegram.messenger.g0.L(8.0f);
        float width = (getWidth() - L) / 2.0f;
        float L2 = this.d - org.telegram.messenger.g0.L(4.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width, L2, L + width, m7Var.P + L2 + org.telegram.messenger.g0.L(8.0f));
        Rect rect = org.telegram.messenger.g0.Q;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.c, this.d);
        m7Var.b(canvas);
        m7Var.c(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int i11 = (int) this.a.T.f;
        this.c = (size - i11) / 2.0f;
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
