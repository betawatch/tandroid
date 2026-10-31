package xh;

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
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.m5;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ov0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class w extends View implements k6 {
    public final org.telegram.ui.Cells.y D;
    public boolean E;
    public int F;
    public bi0 G;
    public int H;
    public int I;
    public final RectF a;
    public final Paint b;
    public final TextPaint c;
    public final t d;
    public final bi0 e;
    public boolean f;
    public float h;
    public String n;
    public StaticLayout r;
    public float s;
    public boolean w;
    public boolean x;
    public boolean y;

    public w(Context context) {
        super(context);
        this.a = new RectF();
        this.b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        t tVar = new t(this);
        this.d = tVar;
        bi0 bi0Var = new bi0(R.raw.bot_webview_sheet_to_cross, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f));
        this.e = bi0Var;
        this.n = cd.L0(2131752891, null);
        this.E = true;
        updateColors();
        tVar.n = true;
        tVar.h = false;
        tVar.a(false, 0.0f);
        tVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        tVar.a.setStrokeCap(Paint.Cap.ROUND);
        tVar.l = true;
        int L = org.telegram.messenger.i0.L(16.0f);
        int x02 = t6.x0(null, t6.Ei, false);
        this.F = x02;
        org.telegram.ui.Cells.y k02 = t6.k0(L, L, L, L, 0, x02, x02);
        this.D = k02;
        k02.setCallback(this);
        bi0Var.setCallback(this);
        bi0Var.R(this);
        setContentDescription(cd.L0(2131754917, "AccDescrBotMenu"));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.Rf));
        hashSet.add(Integer.valueOf(t6.Tf));
        hashSet.add(Integer.valueOf(t6.Ei));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float interpolation;
        if (this.r != null) {
            boolean z11 = this.f;
            if (z11) {
                float f7 = this.h;
                if (f7 != 1.0f) {
                    float f10 = f7 + 0.10666667f;
                    this.h = f10;
                    if (f10 > 1.0f) {
                        this.h = 1.0f;
                    } else {
                        invalidate();
                    }
                    z10 = true;
                    interpolation = gr.f.getInterpolation(this.h);
                    if (z10 && interpolation > 0.0f) {
                        this.c.setAlpha((int) (255.0f * interpolation));
                    }
                    if (this.E) {
                        this.a.set(0.0f, 0.0f, z20.b(this.s, org.telegram.messenger.i0.L(4.0f), interpolation, org.telegram.messenger.i0.L(40.0f)), getMeasuredHeight());
                        canvas.drawRoundRect(this.a, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), this.b);
                        int x02 = t6.x0(null, t6.Ei, false);
                        if (x02 != this.F) {
                            org.telegram.ui.Cells.y yVar = this.D;
                            this.F = x02;
                            t6.H1(yVar, x02, true);
                        }
                        org.telegram.ui.Cells.y yVar2 = this.D;
                        RectF rectF = this.a;
                        yVar2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        this.D.draw(canvas);
                    }
                    if (this.x) {
                        canvas.save();
                        canvas.translate(org.telegram.messenger.i0.L(9.5f), org.telegram.messenger.i0.L(6.0f));
                        bi0 bi0Var = this.e;
                        bi0Var.setBounds(0, 0, bi0Var.b, bi0Var.c);
                        bi0Var.draw(canvas);
                        canvas.restore();
                        if (bi0Var.k0) {
                            invalidate();
                        }
                    } else {
                        canvas.save();
                        canvas.translate(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(4.0f));
                        this.d.draw(canvas);
                        canvas.restore();
                    }
                    if (interpolation > 0.0f) {
                        canvas.save();
                        canvas.translate(org.telegram.messenger.i0.L(34.0f), (getMeasuredHeight() - this.r.getHeight()) / 2.0f);
                        this.r.draw(canvas);
                        canvas.restore();
                    }
                    if (z10) {
                        org.telegram.messenger.i0.L(4.0f);
                    }
                }
            }
            if (!z11) {
                float f11 = this.h;
                if (f11 != 0.0f) {
                    float f12 = f11 - 0.10666667f;
                    this.h = f12;
                    if (f12 < 0.0f) {
                        this.h = 0.0f;
                    } else {
                        invalidate();
                    }
                    z10 = true;
                    interpolation = gr.f.getInterpolation(this.h);
                    if (z10) {
                        this.c.setAlpha((int) (255.0f * interpolation));
                    }
                    if (this.E) {
                    }
                    if (this.x) {
                    }
                    if (interpolation > 0.0f) {
                    }
                    if (z10) {
                    }
                }
            }
            z10 = false;
            interpolation = gr.f.getInterpolation(this.h);
            if (z10) {
            }
            if (this.E) {
            }
            if (this.x) {
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
        this.D.setState(getDrawableState());
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.D.jumpToCurrentState();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.I != size || this.r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float L = org.telegram.messenger.i0.L(15.0f);
            TextPaint textPaint = this.c;
            textPaint.setTextSize(L);
            this.I = size;
            int i12 = (int) (org.telegram.messenger.i0.q.x * 0.6f);
            StaticLayout c10 = ov0.c(org.telegram.messenger.k6.m(this.n, textPaint.getFontMetricsInt(), false, null, 0), textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i12, 1, true);
            this.r = c10;
            this.s = c10.getLineCount() > 0 ? this.r.getLineWidth(0) : 0.0f;
        }
        org.telegram.messenger.i0.L(4.0f);
        int L2 = org.telegram.messenger.i0.L(40.0f);
        if (this.f) {
            L2 = m5.C(4.0f, (int) this.s, L2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_30));
    }

    public void setDrawBackgroundDrawable(boolean z10) {
        this.E = z10;
        invalidate();
    }

    public void setOpened(boolean z10) {
        if (this.w != z10) {
            this.w = z10;
        }
        if (!this.x) {
            this.d.a(true, z10 ? 1.0f : 0.0f);
            return;
        }
        if (this.y != z10) {
            bi0 bi0Var = this.e;
            bi0Var.stop();
            bi0Var.h = true;
            bi0Var.P(z10 ? bi0Var.e[0] : 1);
            bi0Var.start();
            this.y = z10;
        }
    }

    public void setWebView(boolean z10) {
        this.x = z10;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        TextPaint textPaint = this.c;
        try {
            this.b.setColor(t6.x0(null, t6.Rf, false));
            int x02 = t6.x0(null, t6.Tf, false);
            t tVar = this.d;
            tVar.k = x02;
            tVar.j = x02;
            bi0 bi0Var = this.e;
            if (bi0Var != null) {
                if (bi0Var == this.G) {
                    if (x02 != this.H) {
                    }
                }
                this.G = bi0Var;
                this.H = x02;
                bi0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            int alpha = textPaint.getAlpha();
            textPaint.setColor(x02);
            if (alpha != 255) {
                textPaint.setAlpha(alpha);
            }
            invalidate();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.D == drawable;
    }
}
