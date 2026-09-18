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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.m5;
import org.telegram.ui.Components.x5;
import yh.v5;
import yh.y7;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class z4 extends View {
    public final yh.c4 a;
    public final f6 b;
    public float c;
    public float d;
    public Drawable e;

    public z4(Context context, int i10, f6 f6Var) {
        super(context);
        this.b = f6Var;
        yh.c4 c4Var = new yh.c4(i10, this, f6Var);
        this.a = c4Var;
        c4Var.y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        yh.c4 c4Var = this.a;
        m5 m5Var = c4Var.e;
        l1 l1Var = c4Var.j;
        ImageReceiver imageReceiver = c4Var.d;
        c4Var.K = false;
        c4Var.N = null;
        c4Var.O = null;
        c4Var.p = false;
        c4Var.k = (TL_stars.starGiftAttributeBackdrop) v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        c4Var.l = (TL_stars.starGiftAttributePattern) v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = c4Var.m;
        c4Var.m = (TL_stars.starGiftAttributeModel) v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = c4Var.f;
        c4Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = c4Var.l;
        if (stargiftattributepattern != null) {
            m5Var.i(stargiftattributepattern.document, false);
        } else {
            m5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = c4Var.m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            y7.Z0(imageReceiver, c4Var.m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        c4Var.J = z11;
        if (z11) {
            int v02 = j6.v0(j6.q7, c4Var.c);
            Paint paint2 = l1Var.a;
            paint2.setShader(null);
            paint2.setColor(v02);
            l1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            l1Var.d(c4Var.k, true, false);
            l1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (c4Var.P) {
            imageReceiver.onAttachedToWindow();
            m5Var.a();
            c4Var.y.d.onAttachedToWindow();
        }
        c4Var.L = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            c4Var.L = (int) (c4Var.L * 1.2f);
        }
        c4Var.L -= AndroidUtilities.dp(8.0f);
        c4Var.h(tL_starGiftUnique, j3, tL_textWithEntities, str);
        le.e eVar = c4Var.Q;
        if (z10) {
            int round = Math.round(eVar.g ? eVar.f : eVar.e);
            int i10 = c4Var.L;
            if (round != i10) {
                eVar.a(i10);
            }
        } else {
            eVar.c(c4Var.L);
        }
        requestLayout();
        invalidate();
    }

    public yh.c4 getLayout() {
        return this.a;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yh.c4 c4Var = this.a;
        c4Var.P = true;
        if (c4Var.N != null) {
            c4Var.d.onAttachedToWindow();
            c4Var.e.a();
            c4Var.y.d.onAttachedToWindow();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yh.c4 c4Var = this.a;
        c4Var.P = false;
        c4Var.d.onDetachedFromWindow();
        c4Var.e.b();
        k0 k0Var = c4Var.y;
        k0Var.d.onDetachedFromWindow();
        x5.release((View) null, k0Var.q);
        k0Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        f6 f6Var = this.b;
        if (f6Var != null) {
            f6Var.m(0.0f, getY(), getMeasuredWidth(), height);
        } else {
            j6.q(0.0f, getY(), getMeasuredWidth(), height);
        }
        yh.c4 c4Var = this.a;
        this.c = (getWidth() - ((int) c4Var.Q.e)) / 2.0f;
        float dp = c4Var.Q.e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, c4Var.M + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.c, this.d);
        c4Var.a(canvas);
        c4Var.b(canvas);
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
