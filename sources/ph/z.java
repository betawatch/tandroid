package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class z extends View {
    public boolean A;
    public int B;
    public final RectF a;
    public final Paint b;
    public final TextPaint c;
    public final w d;
    public final xi0 e;
    public boolean f;
    public float h;
    public String n;
    public StaticLayout r;
    public float s;
    public boolean v;
    public boolean w;
    public boolean x;
    public final org.telegram.ui.Cells.z y;

    public z(Context context) {
        super(context);
        this.a = new RectF();
        Paint paint = new Paint(1);
        this.b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        w wVar = new w(this);
        this.d = wVar;
        xi0 xi0Var = new xi0(R.raw.bot_webview_sheet_to_cross, AndroidUtilities.dp(20.0f), String.valueOf(R.raw.bot_webview_sheet_to_cross) + hashCode(), AndroidUtilities.dp(20.0f));
        this.e = xi0Var;
        this.n = LocaleController.getString(R.string.BotsMenuTitle);
        this.A = true;
        paint.setColor(g6.w0(null, g6.cf, false));
        int w02 = g6.w0(null, g6.ef, false);
        wVar.k = w02;
        wVar.j = w02;
        xi0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(w02);
        wVar.n = true;
        wVar.h = false;
        wVar.a(0.0f, false);
        wVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        wVar.a.setStrokeCap(Paint.Cap.ROUND);
        wVar.l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int w03 = g6.w0(null, g6.Qh, false);
        org.telegram.ui.Cells.z i02 = g6.i0(dp, dp, dp, dp, 0, w03, w03);
        this.y = i02;
        i02.setCallback(this);
        xi0Var.setCallback(this);
        xi0Var.r0 = this;
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float interpolation;
        if (this.r != null) {
            boolean z10 = this.f;
            boolean z11 = true;
            if (z10) {
                float f9 = this.h;
                if (f9 != 1.0f) {
                    float f10 = f9 + 0.10666667f;
                    this.h = f10;
                    if (f10 > 1.0f) {
                        this.h = 1.0f;
                    } else {
                        invalidate();
                    }
                    interpolation = jr.f.getInterpolation(this.h);
                    if (z11 && interpolation > 0.0f) {
                        this.c.setAlpha((int) (255.0f * interpolation));
                    }
                    if (this.A) {
                        this.a.set(0.0f, 0.0f, ((this.s + AndroidUtilities.dp(4.0f)) * interpolation) + AndroidUtilities.dp(40.0f), getMeasuredHeight());
                        canvas.drawRoundRect(this.a, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.b);
                        org.telegram.ui.Cells.z zVar = this.y;
                        RectF rectF = this.a;
                        zVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        this.y.draw(canvas);
                    }
                    if (this.w) {
                        canvas.save();
                        canvas.translate(AndroidUtilities.dp(9.5f), AndroidUtilities.dp(6.0f));
                        xi0 xi0Var = this.e;
                        xi0Var.setBounds(0, 0, xi0Var.b, xi0Var.c);
                        xi0Var.draw(canvas);
                        canvas.restore();
                        if (xi0Var.h0) {
                            invalidate();
                        }
                    } else {
                        canvas.save();
                        canvas.translate(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
                        this.d.draw(canvas);
                        canvas.restore();
                    }
                    if (interpolation > 0.0f) {
                        canvas.save();
                        canvas.translate(AndroidUtilities.dp(34.0f), (getMeasuredHeight() - this.r.getHeight()) / 2.0f);
                        this.r.draw(canvas);
                        canvas.restore();
                    }
                    if (z11) {
                        AndroidUtilities.dp(4.0f);
                    }
                }
            }
            if (!z10) {
                float f11 = this.h;
                if (f11 != 0.0f) {
                    float f12 = f11 - 0.10666667f;
                    this.h = f12;
                    if (f12 < 0.0f) {
                        this.h = 0.0f;
                    } else {
                        invalidate();
                    }
                    interpolation = jr.f.getInterpolation(this.h);
                    if (z11) {
                        this.c.setAlpha((int) (255.0f * interpolation));
                    }
                    if (this.A) {
                    }
                    if (this.w) {
                    }
                    if (interpolation > 0.0f) {
                    }
                    if (z11) {
                    }
                }
            }
            z11 = false;
            interpolation = jr.f.getInterpolation(this.h);
            if (z11) {
            }
            if (this.A) {
            }
            if (this.w) {
            }
            if (interpolation > 0.0f) {
            }
            if (z11) {
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.y.setState(getDrawableState());
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.y.jumpToCurrentState();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.B != size || this.r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float dp = AndroidUtilities.dp(15.0f);
            TextPaint textPaint = this.c;
            textPaint.setTextSize(dp);
            this.B = size;
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c3 = bw0.c(Emoji.replaceEmoji(this.n, textPaint.getFontMetricsInt(), false), textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, i12, 1, true);
            this.r = c3;
            this.s = c3.getLineCount() > 0 ? this.r.getLineWidth(0) : 0.0f;
        }
        AndroidUtilities.dp(4.0f);
        int dp2 = AndroidUtilities.dp(40.0f);
        if (this.f) {
            dp2 = org.telegram.messenger.x3.C(4.0f, (int) this.s, dp2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
    }

    public void setDrawBackgroundDrawable(boolean z10) {
        this.A = z10;
        invalidate();
    }

    public void setOpened(boolean z10) {
        if (this.v != z10) {
            this.v = z10;
        }
        if (!this.w) {
            this.d.a(z10 ? 1.0f : 0.0f, true);
            return;
        }
        if (this.x != z10) {
            xi0 xi0Var = this.e;
            xi0Var.stop();
            xi0Var.h = true;
            xi0Var.N(z10 ? xi0Var.e[0] : 1);
            xi0Var.start();
            this.x = z10;
        }
    }

    public void setWebView(boolean z10) {
        this.w = z10;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.y == drawable;
    }
}
