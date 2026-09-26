package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.z5;
import yh.s5;
import yh.w7;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class a5 extends View {
    public final yh.z3 a;
    public final d6 b;
    public float c;
    public float d;
    public Drawable e;

    public a5(Context context, int i10, d6 d6Var) {
        super(context);
        this.b = d6Var;
        yh.z3 z3Var = new yh.z3(i10, this, d6Var);
        this.a = z3Var;
        z3Var.y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        yh.z3 z3Var = this.a;
        o5 o5Var = z3Var.e;
        m1 m1Var = z3Var.j;
        ImageReceiver imageReceiver = z3Var.d;
        z3Var.K = false;
        z3Var.N = null;
        z3Var.O = null;
        z3Var.p = false;
        z3Var.k = (TL_stars.starGiftAttributeBackdrop) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        z3Var.l = (TL_stars.starGiftAttributePattern) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = z3Var.m;
        z3Var.m = (TL_stars.starGiftAttributeModel) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = z3Var.f;
        z3Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = z3Var.l;
        if (stargiftattributepattern != null) {
            o5Var.i(stargiftattributepattern.document, false);
        } else {
            o5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = z3Var.m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            w7.Z0(imageReceiver, z3Var.m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        z3Var.J = z11;
        if (z11) {
            int v02 = h6.v0(h6.q7, z3Var.c);
            Paint paint2 = m1Var.a;
            paint2.setShader(null);
            paint2.setColor(v02);
            m1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            m1Var.d(z3Var.k, true, false);
            m1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (z3Var.P) {
            imageReceiver.onAttachedToWindow();
            o5Var.a();
            z3Var.y.d.onAttachedToWindow();
        }
        z3Var.L = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            z3Var.L = (int) (z3Var.L * 1.2f);
        }
        z3Var.L -= AndroidUtilities.dp(8.0f);
        z3Var.h(tL_starGiftUnique, j3, tL_textWithEntities, str);
        le.f fVar = z3Var.Q;
        if (z10) {
            int round = Math.round(fVar.g ? fVar.f : fVar.e);
            int i10 = z3Var.L;
            if (round != i10) {
                fVar.a(i10);
            }
        } else {
            fVar.c(z3Var.L);
        }
        requestLayout();
        invalidate();
    }

    public yh.z3 getLayout() {
        return this.a;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yh.z3 z3Var = this.a;
        z3Var.P = true;
        if (z3Var.N != null) {
            z3Var.d.onAttachedToWindow();
            z3Var.e.a();
            z3Var.y.d.onAttachedToWindow();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yh.z3 z3Var = this.a;
        z3Var.P = false;
        z3Var.d.onDetachedFromWindow();
        z3Var.e.b();
        k0 k0Var = z3Var.y;
        k0Var.d.onDetachedFromWindow();
        z5.release((View) null, k0Var.q);
        k0Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        d6 d6Var = this.b;
        if (d6Var != null) {
            d6Var.m(0.0f, getY(), getMeasuredWidth(), height);
        } else {
            h6.q(0.0f, getY(), getMeasuredWidth(), height);
        }
        yh.z3 z3Var = this.a;
        this.c = (getWidth() - ((int) z3Var.Q.e)) / 2.0f;
        float dp = z3Var.Q.e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, z3Var.M + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.c, this.d);
        z3Var.a(canvas);
        z3Var.b(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int i12 = (int) this.a.Q.e;
        this.c = (size - i12) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + r4.M);
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
