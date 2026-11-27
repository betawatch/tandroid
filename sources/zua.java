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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class zua extends View {
    public final yua a;
    public final vnb b;
    public float c;
    public float d;
    public Drawable e;

    public zua(int i, vnb vnbVar, Context context) {
        super(context);
        this.b = vnbVar;
        yua yuaVar = new yua(i, vnbVar, this);
        this.a = yuaVar;
        yuaVar.y.setCallback(this);
        jn7.i(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z) {
        yua yuaVar = this.a;
        ul ulVar = yuaVar.e;
        vx4 vx4Var = yuaVar.j;
        ImageReceiver imageReceiver = yuaVar.d;
        yuaVar.N = false;
        yuaVar.Q = null;
        yuaVar.R = null;
        yuaVar.p = false;
        yuaVar.k = (TL_stars.starGiftAttributeBackdrop) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        yuaVar.l = (TL_stars.starGiftAttributePattern) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = yuaVar.m;
        yuaVar.m = (TL_stars.starGiftAttributeModel) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = yuaVar.f;
        yuaVar.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = yuaVar.l;
        if (stargiftattributepattern != null) {
            ulVar.i(stargiftattributepattern.document, false);
        } else {
            ulVar.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = yuaVar.m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
            imageReceiver.N(0);
            imageReceiver.e();
            imageReceiver.M(0);
            nza.e1(imageReceiver, yuaVar.m.document, jn7.u1);
        }
        boolean z2 = tL_starGiftUnique.burned;
        yuaVar.L = z2;
        if (z2) {
            vx4Var.f(aob.v0(aob.q7, yuaVar.c));
            yuaVar.M = yob.b;
            vx4Var.g(11, ob6.M0(2131749839, null), true);
        } else {
            vx4Var.e(yuaVar.k, true, false);
            vx4Var.g(11, ob6.M0(2131749840, null), true);
        }
        if (yuaVar.S) {
            imageReceiver.I();
            ulVar.a();
            yuaVar.y.d.I();
        }
        yuaVar.O = c00.y(64.0f, (hl.q.y - a.getCurrentActionBarHeight()) - hl.m, (int) (hl.O1() ? hl.P0() * 0.6f : (hl.q.x * 0.62f) - hl.L(34.0f)));
        if (!hl.O1()) {
            yuaVar.O = (int) (yuaVar.O * 1.2f);
        }
        yuaVar.O -= hl.L(8.0f);
        yuaVar.h(tL_starGiftUnique, j, tL_textWithEntities, str);
        t84 t84Var = yuaVar.T;
        if (z) {
            int round = Math.round(t84Var.h ? t84Var.g : t84Var.f);
            int i = yuaVar.O;
            if (round != i) {
                t84Var.a(i);
            }
        } else {
            t84Var.c(yuaVar.O);
        }
        requestLayout();
        invalidate();
    }

    public yua getLayout() {
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
        yua yuaVar = this.a;
        yuaVar.S = false;
        yuaVar.d.K();
        yuaVar.e.b();
        iw4 iw4Var = yuaVar.y;
        iw4Var.d.K();
        hm.release((View) null, iw4Var.q);
        iw4Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        vnb vnbVar = this.b;
        if (vnbVar != null) {
            vnbVar.b(0.0f, getY(), getMeasuredWidth(), height);
        } else {
            aob.q(0.0f, getY(), getMeasuredWidth(), height);
        }
        yua yuaVar = this.a;
        this.c = (getWidth() - ((int) yuaVar.T.f)) / 2.0f;
        float L = yuaVar.T.f + hl.L(8.0f);
        float width = (getWidth() - L) / 2.0f;
        float L2 = this.d - hl.L(4.0f);
        RectF rectF = hl.P;
        rectF.set(width, L2, L + width, yuaVar.P + L2 + hl.L(8.0f));
        Rect rect = hl.Q;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.c, this.d);
        yuaVar.b(canvas);
        yuaVar.c(canvas);
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
