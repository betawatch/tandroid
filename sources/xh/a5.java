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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.q5;
import yh.m5;
import yh.p7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class a5 extends View {
    public final yh.u3 a;
    public final e6 b;
    public float c;
    public float d;
    public Drawable e;

    public a5(Context context, int i10, e6 e6Var) {
        super(context);
        this.b = e6Var;
        yh.u3 u3Var = new yh.u3(i10, this, e6Var);
        this.a = u3Var;
        u3Var.y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        yh.u3 u3Var = this.a;
        q5 q5Var = u3Var.e;
        m1 m1Var = u3Var.j;
        ImageReceiver imageReceiver = u3Var.d;
        u3Var.K = false;
        u3Var.N = null;
        u3Var.O = null;
        u3Var.p = false;
        u3Var.k = (TL_stars.starGiftAttributeBackdrop) m5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        u3Var.l = (TL_stars.starGiftAttributePattern) m5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = u3Var.m;
        u3Var.m = (TL_stars.starGiftAttributeModel) m5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = u3Var.f;
        u3Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = u3Var.l;
        if (stargiftattributepattern != null) {
            q5Var.i(stargiftattributepattern.document, false);
        } else {
            q5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = u3Var.m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            p7.a1(imageReceiver, u3Var.m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        u3Var.J = z11;
        if (z11) {
            int w02 = i6.w0(i6.q7, u3Var.c);
            Paint paint2 = (Paint) m1Var.b;
            paint2.setShader(null);
            paint2.setColor(w02);
            m1Var.f(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            m1Var.e(u3Var.k, true, false);
            m1Var.f(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (u3Var.P) {
            imageReceiver.onAttachedToWindow();
            q5Var.a();
            u3Var.y.d.onAttachedToWindow();
        }
        u3Var.L = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            u3Var.L = (int) (u3Var.L * 1.2f);
        }
        u3Var.L -= AndroidUtilities.dp(8.0f);
        u3Var.h(tL_starGiftUnique, j3, tL_textWithEntities, str);
        me.e eVar = u3Var.Q;
        if (z10) {
            int round = Math.round(eVar.g ? eVar.f : eVar.e);
            int i10 = u3Var.L;
            if (round != i10) {
                eVar.a(i10);
            }
        } else {
            eVar.c(u3Var.L);
        }
        requestLayout();
        invalidate();
    }

    public yh.u3 getLayout() {
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
        yh.u3 u3Var = this.a;
        u3Var.P = false;
        u3Var.d.onDetachedFromWindow();
        u3Var.e.b();
        m0 m0Var = u3Var.y;
        m0Var.d.onDetachedFromWindow();
        b6.release((View) null, m0Var.q);
        m0Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        e6 e6Var = this.b;
        if (e6Var != null) {
            e6Var.m(0.0f, getY(), getMeasuredWidth(), height);
        } else {
            i6.q(0.0f, getY(), getMeasuredWidth(), height);
        }
        yh.u3 u3Var = this.a;
        this.c = (getWidth() - ((int) u3Var.Q.e)) / 2.0f;
        float dp = u3Var.Q.e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, u3Var.M + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.c, this.d);
        u3Var.b(canvas);
        u3Var.c(canvas);
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
