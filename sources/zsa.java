// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zsa extends View {
    public final ysa a;
    public final ylb b;
    public float c;
    public float d;
    public Drawable e;

    public zsa(int i, ylb ylbVar, Context context) {
        super(context);
        this.b = ylbVar;
        ysa ysaVar = new ysa(i, ylbVar, this);
        this.a = ysaVar;
        ysaVar.y.setCallback(this);
        nm7.i(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z) {
        ysa ysaVar = this.a;
        tm tmVar = ysaVar.e;
        rx4 rx4Var = ysaVar.j;
        ImageReceiver imageReceiver = ysaVar.d;
        ysaVar.N = false;
        ysaVar.Q = null;
        ysaVar.R = null;
        ysaVar.p = false;
        ysaVar.k = (TL_stars.starGiftAttributeBackdrop) jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ysaVar.l = (TL_stars.starGiftAttributePattern) jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = ysaVar.m;
        ysaVar.m = (TL_stars.starGiftAttributeModel) jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = ysaVar.f;
        ysaVar.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = ysaVar.l;
        if (stargiftattributepattern != null) {
            tmVar.i(stargiftattributepattern.document, false);
        } else {
            tmVar.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = ysaVar.m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
            imageReceiver.N(0);
            imageReceiver.e();
            imageReceiver.M(0);
            nxa.e1(imageReceiver, ysaVar.m.document, nm7.u1);
        }
        boolean z2 = tL_starGiftUnique.burned;
        ysaVar.L = z2;
        if (z2) {
            rx4Var.f(cmb.v0(cmb.p7, ysaVar.c));
            ysaVar.M = anb.b;
            rx4Var.g(11, jb6.M0(2131749826, null), true);
        } else {
            rx4Var.e(ysaVar.k, true, false);
            rx4Var.g(11, jb6.M0(2131749827, null), true);
        }
        if (ysaVar.S) {
            imageReceiver.I();
            tmVar.a();
            ysaVar.y.d.I();
        }
        ysaVar.O = b10.x(64.0f, (gm.q.y - a.getCurrentActionBarHeight()) - gm.m, (int) (gm.O1() ? gm.P0() * 0.6f : (gm.q.x * 0.62f) - gm.L(34.0f)));
        if (!gm.O1()) {
            ysaVar.O = (int) (ysaVar.O * 1.2f);
        }
        ysaVar.O -= gm.L(8.0f);
        ysaVar.h(tL_starGiftUnique, j, tL_textWithEntities, str);
        h94 h94Var = ysaVar.T;
        if (z) {
            int round = Math.round(h94Var.h ? h94Var.g : h94Var.f);
            int i = ysaVar.O;
            if (round != i) {
                h94Var.a(i);
            }
        } else {
            h94Var.c(ysaVar.O);
        }
        requestLayout();
        invalidate();
    }

    public ysa getLayout() {
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
        ysa ysaVar = this.a;
        ysaVar.S = false;
        ysaVar.d.K();
        ysaVar.e.b();
        gw4 gw4Var = ysaVar.y;
        gw4Var.d.K();
        gn.release((View) null, gw4Var.q);
        gw4Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        ylb ylbVar = this.b;
        if (ylbVar != null) {
            ylbVar.b(0.0f, getY(), getMeasuredWidth(), height);
        } else {
            cmb.q(0.0f, getY(), getMeasuredWidth(), height);
        }
        ysa ysaVar = this.a;
        this.c = (getWidth() - ((int) ysaVar.T.f)) / 2.0f;
        float L = ysaVar.T.f + gm.L(8.0f);
        float width = (getWidth() - L) / 2.0f;
        float L2 = this.d - gm.L(4.0f);
        RectF rectF = gm.P;
        rectF.set(width, L2, L + width, ysaVar.P + L2 + gm.L(8.0f));
        Rect rect = gm.Q;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.c, this.d);
        ysaVar.b(canvas);
        ysaVar.c(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = (int) this.a.T.f;
        this.c = (size - i3) / 2.0f;
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
