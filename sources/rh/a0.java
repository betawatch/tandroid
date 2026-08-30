package rh;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class a0 extends View {
    public boolean B;
    public int C;
    public final RectF a;
    public final Paint b;
    public final TextPaint c;
    public final x d;
    public final gj0 e;
    public boolean f;
    public float h;
    public String n;
    public StaticLayout r;
    public float s;
    public boolean v;
    public boolean w;
    public boolean x;
    public final org.telegram.ui.Cells.z y;

    public a0(Context context) {
        super(context);
        this.a = new RectF();
        Paint paint = new Paint(1);
        this.b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        x xVar = new x(this);
        this.d = xVar;
        gj0 gj0Var = new gj0(R.raw.bot_webview_sheet_to_cross, AndroidUtilities.dp(20.0f), String.valueOf(R.raw.bot_webview_sheet_to_cross) + hashCode(), AndroidUtilities.dp(20.0f));
        this.e = gj0Var;
        this.n = LocaleController.getString(R.string.BotsMenuTitle);
        this.B = true;
        paint.setColor(j6.w0(null, j6.cf, false));
        int w02 = j6.w0(null, j6.ef, false);
        xVar.k = w02;
        xVar.j = w02;
        gj0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(w02);
        xVar.n = true;
        xVar.h = false;
        xVar.a(0.0f, false);
        xVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        xVar.a.setStrokeCap(Paint.Cap.ROUND);
        xVar.l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int w03 = j6.w0(null, j6.Qh, false);
        org.telegram.ui.Cells.z i02 = j6.i0(dp, dp, dp, dp, 0, w03, w03);
        this.y = i02;
        i02.setCallback(this);
        gj0Var.setCallback(this);
        gj0Var.s0 = this;
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
            boolean z4 = this.f;
            boolean z10 = true;
            if (z4) {
                float f10 = this.h;
                if (f10 != 1.0f) {
                    float f11 = f10 + 0.10666667f;
                    this.h = f11;
                    if (f11 > 1.0f) {
                        this.h = 1.0f;
                    } else {
                        invalidate();
                    }
                    interpolation = nr.f.getInterpolation(this.h);
                    if (z10 && interpolation > 0.0f) {
                        this.c.setAlpha((int) (255.0f * interpolation));
                    }
                    if (this.B) {
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
                        gj0 gj0Var = this.e;
                        gj0Var.setBounds(0, 0, gj0Var.b, gj0Var.c);
                        gj0Var.draw(canvas);
                        canvas.restore();
                        if (gj0Var.i0) {
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
                    if (z10) {
                        AndroidUtilities.dp(4.0f);
                    }
                }
            }
            if (!z4) {
                float f12 = this.h;
                if (f12 != 0.0f) {
                    float f13 = f12 - 0.10666667f;
                    this.h = f13;
                    if (f13 < 0.0f) {
                        this.h = 0.0f;
                    } else {
                        invalidate();
                    }
                    interpolation = nr.f.getInterpolation(this.h);
                    if (z10) {
                        this.c.setAlpha((int) (255.0f * interpolation));
                    }
                    if (this.B) {
                    }
                    if (this.w) {
                    }
                    if (interpolation > 0.0f) {
                    }
                    if (z10) {
                    }
                }
            }
            z10 = false;
            interpolation = nr.f.getInterpolation(this.h);
            if (z10) {
            }
            if (this.B) {
            }
            if (this.w) {
            }
            if (interpolation > 0.0f) {
            }
            if (z10) {
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
        if (this.C != size || this.r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float dp = AndroidUtilities.dp(15.0f);
            TextPaint textPaint = this.c;
            textPaint.setTextSize(dp);
            this.C = size;
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c3 = kw0.c(Emoji.replaceEmoji(this.n, textPaint.getFontMetricsInt(), false), textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, i12, 1, true);
            this.r = c3;
            this.s = c3.getLineCount() > 0 ? this.r.getLineWidth(0) : 0.0f;
        }
        AndroidUtilities.dp(4.0f);
        int dp2 = AndroidUtilities.dp(40.0f);
        if (this.f) {
            dp2 = org.telegram.messenger.y3.C(4.0f, (int) this.s, dp2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
    }

    public void setDrawBackgroundDrawable(boolean z4) {
        this.B = z4;
        invalidate();
    }

    public void setOpened(boolean z4) {
        if (this.v != z4) {
            this.v = z4;
        }
        if (!this.w) {
            this.d.a(z4 ? 1.0f : 0.0f, true);
            return;
        }
        if (this.x != z4) {
            gj0 gj0Var = this.e;
            gj0Var.stop();
            gj0Var.h = true;
            gj0Var.N(z4 ? gj0Var.e[0] : 1);
            gj0Var.start();
            this.x = z4;
        }
    }

    public void setWebView(boolean z4) {
        this.w = z4;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.y == drawable;
    }
}
