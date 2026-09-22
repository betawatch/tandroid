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
import org.telegram.ui.Components.m5;
import org.telegram.ui.Components.x5;
import yh.u5;
import yh.x7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class z4 extends View {
    public final yh.b4 a;
    public final e6 b;
    public float c;
    public float d;
    public Drawable e;

    public z4(Context context, int i10, e6 e6Var) {
        super(context);
        this.b = e6Var;
        yh.b4 b4Var = new yh.b4(i10, this, e6Var);
        this.a = b4Var;
        b4Var.y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        yh.b4 b4Var = this.a;
        m5 m5Var = b4Var.e;
        l1 l1Var = b4Var.j;
        ImageReceiver imageReceiver = b4Var.d;
        b4Var.K = false;
        b4Var.N = null;
        b4Var.O = null;
        b4Var.p = false;
        b4Var.k = (TL_stars.starGiftAttributeBackdrop) u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        b4Var.l = (TL_stars.starGiftAttributePattern) u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = b4Var.m;
        b4Var.m = (TL_stars.starGiftAttributeModel) u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = b4Var.f;
        b4Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = b4Var.l;
        if (stargiftattributepattern != null) {
            m5Var.i(stargiftattributepattern.document, false);
        } else {
            m5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = b4Var.m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            x7.Z0(imageReceiver, b4Var.m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        b4Var.J = z11;
        if (z11) {
            int v02 = i6.v0(i6.q7, b4Var.c);
            Paint paint2 = l1Var.a;
            paint2.setShader(null);
            paint2.setColor(v02);
            l1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            l1Var.d(b4Var.k, true, false);
            l1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (b4Var.P) {
            imageReceiver.onAttachedToWindow();
            m5Var.a();
            b4Var.y.d.onAttachedToWindow();
        }
        b4Var.L = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            b4Var.L = (int) (b4Var.L * 1.2f);
        }
        b4Var.L -= AndroidUtilities.dp(8.0f);
        b4Var.h(tL_starGiftUnique, j3, tL_textWithEntities, str);
        le.e eVar = b4Var.Q;
        if (z10) {
            int round = Math.round(eVar.g ? eVar.f : eVar.e);
            int i10 = b4Var.L;
            if (round != i10) {
                eVar.a(i10);
            }
        } else {
            eVar.c(b4Var.L);
        }
        requestLayout();
        invalidate();
    }

    public yh.b4 getLayout() {
        return this.a;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yh.b4 b4Var = this.a;
        b4Var.P = true;
        if (b4Var.N != null) {
            b4Var.d.onAttachedToWindow();
            b4Var.e.a();
            b4Var.y.d.onAttachedToWindow();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yh.b4 b4Var = this.a;
        b4Var.P = false;
        b4Var.d.onDetachedFromWindow();
        b4Var.e.b();
        k0 k0Var = b4Var.y;
        k0Var.d.onDetachedFromWindow();
        x5.release((View) null, k0Var.q);
        k0Var.q = null;
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
        yh.b4 b4Var = this.a;
        this.c = (getWidth() - ((int) b4Var.Q.e)) / 2.0f;
        float dp = b4Var.Q.e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, b4Var.M + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.c, this.d);
        b4Var.a(canvas);
        b4Var.b(canvas);
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
