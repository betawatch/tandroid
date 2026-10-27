package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import bi.ca;
import bi.dd;
import bi.j7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.r5;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class z4 extends View {
    public final j7 a;
    public final u6 b;
    public float c;
    public float d;
    public Drawable e;

    public z4(Context context, int i10, u6 u6Var) {
        super(context);
        this.b = u6Var;
        j7 j7Var = new j7(i10, this, u6Var);
        this.a = j7Var;
        j7Var.y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        j7 j7Var = this.a;
        r5 r5Var = j7Var.e;
        j1 j1Var = j7Var.j;
        ImageReceiver imageReceiver = j7Var.d;
        j7Var.N = false;
        j7Var.Q = null;
        j7Var.R = null;
        j7Var.p = false;
        j7Var.k = (TL_stars.starGiftAttributeBackdrop) ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        j7Var.l = (TL_stars.starGiftAttributePattern) ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = j7Var.m;
        j7Var.m = (TL_stars.starGiftAttributeModel) ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = j7Var.f;
        j7Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = j7Var.l;
        if (stargiftattributepattern != null) {
            r5Var.i(stargiftattributepattern.document, false);
        } else {
            r5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = j7Var.m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            dd.Y0(imageReceiver, j7Var.m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        j7Var.L = z11;
        if (z11) {
            int w02 = y6.w0(y6.q7, j7Var.c);
            Paint paint2 = (Paint) j1Var.b;
            paint2.setShader(null);
            paint2.setColor(w02);
            j7Var.M = f7.b;
            j1Var.f(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            j1Var.e(j7Var.k, true, false);
            j1Var.f(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (j7Var.S) {
            imageReceiver.onAttachedToWindow();
            r5Var.a();
            j7Var.y.d.onAttachedToWindow();
        }
        j7Var.O = org.telegram.ui.d3.g(64.0f, (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)));
        if (!AndroidUtilities.isTablet()) {
            j7Var.O = (int) (j7Var.O * 1.2f);
        }
        j7Var.O -= AndroidUtilities.dp(8.0f);
        j7Var.h(tL_starGiftUnique, j10, tL_textWithEntities, str);
        oe.e eVar = j7Var.T;
        if (z10) {
            int round = Math.round(eVar.h ? eVar.g : eVar.f);
            int i10 = j7Var.O;
            if (round != i10) {
                eVar.a(i10);
            }
        } else {
            eVar.c(j7Var.O);
        }
        requestLayout();
        invalidate();
    }

    public j7 getLayout() {
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
        j7 j7Var = this.a;
        j7Var.S = false;
        j7Var.d.onDetachedFromWindow();
        j7Var.e.b();
        j0 j0Var = j7Var.y;
        j0Var.d.onDetachedFromWindow();
        c6.release((View) null, j0Var.q);
        j0Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        u6 u6Var = this.b;
        if (u6Var != null) {
            u6Var.b(0.0f, getY(), getMeasuredWidth(), height);
        } else {
            y6.q(0.0f, getY(), getMeasuredWidth(), height);
        }
        j7 j7Var = this.a;
        this.c = (getWidth() - ((int) j7Var.T.f)) / 2.0f;
        float dp = j7Var.T.f + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, j7Var.P + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.c, this.d);
        j7Var.b(canvas);
        j7Var.c(canvas);
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
