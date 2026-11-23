package yh;

import ah.i;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.messenger.bz;
import org.telegram.messenger.g0;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.le;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.zi0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class a extends FrameLayout {
    public boolean E;
    public float F;
    public float G;
    public final RectF H;
    public boolean I;
    public String J;
    public final TextPaint K;
    public final i6 a;
    public final le b;
    public final i c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final TextPaint h;
    public final m6 n;
    public final ve0 r;
    public LinearGradient s;
    public final Matrix w;
    public final c6 x;
    public final c6 y;

    public a(Context context, i6 i6Var, le leVar) {
        super(context);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.w = new Matrix();
        kr krVar = kr.h;
        this.x = new c6(this, 0L, 420L, krVar);
        this.y = new c6(this, 0L, 200L, krVar);
        this.F = -1.0f;
        this.G = 1.0f;
        this.H = new RectF();
        this.J = "0:01";
        this.K = new TextPaint(1);
        this.a = i6Var;
        this.b = leVar;
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        m6 m6Var = new m6(false, false, false);
        this.n = m6Var;
        m6Var.n(0.35f, 260L, krVar);
        m6Var.setCallback(this);
        m6Var.w(g0.L(14.0f));
        m6Var.x(g0.o1("fonts/rmedium.ttf"));
        m6Var.N = g0.q.x;
        ve0 ve0Var = new ve0(10);
        this.r = ve0Var;
        ve0Var.f = this;
        ve0Var.setCallback(this);
        ve0Var.h = ks.j4;
        textPaint.setTextSize(g0.L(15.0f));
        i iVar = new i(12, context, this);
        this.c = iVar;
        iVar.setBackground(null);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setTextSize(1, bz.W0);
        iVar.setMaxLines(6);
        iVar.setGravity(51);
        iVar.setImeOptions(TLObject.FLAG_28);
        iVar.setInputType(147457);
        iVar.setCursorSize(g0.L(20.0f));
        iVar.setCursorWidth(1.5f);
        iVar.setHint("Nothing recognised — type here");
        iVar.setVisibility(8);
        iVar.setAlpha(0.0f);
        addView(iVar, na.d(-1, -2.0f, 51, 10.0f, 40.0f, 6.0f, 11.0f));
        int w02 = n6.w0(n6.Uf, i6Var);
        int i7 = n6.Le;
        iVar.setTextColor(n6.w0(i7, i6Var));
        iVar.setHintTextColor(n6.w0(n6.Me, i6Var));
        iVar.setCursorColor(w02);
        iVar.setHandlesColor(w02);
        iVar.setHighlightColor(n6.r1(0.25f, w02));
        textPaint.setColor(n6.r1(0.5f, n6.w0(i7, i6Var)));
        this.s = null;
        invalidate();
        setMinimumHeight(g0.L(44.0f));
    }

    public final float a() {
        le leVar = this.b;
        if (leVar != null) {
            float b12 = leVar.b.b1(this);
            if (!Float.isNaN(b12)) {
                return b12;
            }
        }
        if (this.F <= 0.0f) {
            return 0.0f;
        }
        return getHeight() - this.F;
    }

    public final boolean b(MotionEvent motionEvent) {
        RectF rectF = g0.P;
        rectF.set(this.H);
        rectF.inset(-g0.L(6.0f), -g0.L(8.0f));
        return rectF.contains(motionEvent.getX(), motionEvent.getY());
    }

    public final void c(int i7) {
        this.J = g0.g0(Math.max(1, i7), false, false);
        float L = g0.L(14.0f);
        TextPaint textPaint = this.K;
        textPaint.setTextSize(L);
        textPaint.setTypeface(g0.o1("fonts/rmedium.ttf"));
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        zi0 zi0Var;
        int i7 = n6.Uf;
        i6 i6Var = this.a;
        int w02 = n6.w0(i7, i6Var);
        c6 c6Var = this.x;
        c6Var.getClass();
        float e10 = c6Var.e(false, 0.0f);
        float a10 = a();
        float d = this.y.d(this.I);
        i iVar = this.c;
        iVar.setTranslationY(a10);
        float L = iVar.getVisibility() == 0 ? g0.L(11.0f) + iVar.getBottom() : g0.L(44.0f);
        float max = L > ((float) (g0.L(44.0f) + 1)) ? Math.max(0.0f, Math.min(1.0f, ((getHeight() - a10) - g0.L(44.0f)) / (L - g0.L(44.0f)))) : 1.0f;
        if (this.E) {
            float f12 = this.G;
            f10 = f12 * f12 * f12;
        } else {
            f10 = this.G;
        }
        iVar.setAlpha(Math.min(e10, max * max) * f10);
        float L2 = g0.L(26.0f);
        float L3 = g0.L(36.0f);
        String str = this.J;
        Paint paint = this.K;
        float measureText = paint.measureText(str) + L3;
        float L4 = g0.L(8.0f);
        float f13 = L2 / 2.0f;
        float T1 = g0.T1(g0.L(22.0f), g0.L(8.0f) + f13, e10) + a10;
        float f14 = measureText + L4;
        RectF rectF = this.H;
        rectF.set(L4, T1 - f13, f14, T1 + f13);
        float T12 = (1.0f - (d * 0.06f)) * g0.T1(0.7f, 1.0f, this.G);
        canvas.save();
        canvas.scale(T12, T12, rectF.left, rectF.centerY());
        if (this.E) {
            float f15 = this.G;
            f11 = f15 * f15;
        } else {
            f11 = this.G;
        }
        int r12 = n6.r1(0.12f * f11, w02);
        Paint paint2 = this.d;
        paint2.setColor(r12);
        canvas.drawRoundRect(rectF, f13, f13, paint2);
        int L5 = g0.L(10.0f);
        le leVar = this.b;
        boolean z10 = (leVar == null || (zi0Var = leVar.b.i1) == null || !zi0Var.g()) ? false : true;
        ve0 ve0Var = this.r;
        ve0Var.a(z10, true);
        ve0Var.a.setColor(w02);
        ve0Var.g = (int) (f11 * 255.0f);
        float f16 = L5 / 2.0f;
        ve0Var.setBounds((int) (rectF.left + g0.L(10.0f)), (int) (T1 - f16), ((int) (rectF.left + g0.L(10.0f))) + L5, (int) (f16 + T1));
        ve0Var.draw(canvas);
        paint.setColor(n6.r1(f11, w02));
        canvas.drawText(this.J, rectF.left + g0.L(26.0f), T1 - ((paint.ascent() + paint.descent()) / 2.0f), paint);
        canvas.restore();
        float f17 = (1.0f - e10) * this.G;
        if (f17 > 0.0f) {
            float L6 = f14 + g0.L(12.0f);
            float width = getWidth() - g0.L(12.0f);
            float f18 = (-g0.L(6.0f)) * e10;
            Paint paint3 = this.h;
            paint3.setAlpha((int) (127.5f * f17));
            int i10 = n6.Le;
            paint3.setColor(n6.r1(0.5f * f17, n6.w0(i10, i6Var)));
            canvas.drawText("Transcribing…", L6, g0.L(19.0f) + a10 + f18, paint3);
            float L7 = a10 + g0.L(28.0f) + f18;
            int w03 = n6.w0(i10, i6Var);
            int r13 = n6.r1(0.08f * f17, w03);
            Paint paint4 = this.e;
            paint4.setColor(r13);
            RectF rectF2 = g0.P;
            rectF2.set(L6, L7, width, g0.L(6.0f) + L7);
            canvas.drawRoundRect(rectF2, g0.L(3.0f), g0.L(3.0f), paint4);
            float f19 = width - L6;
            if (f19 > 0.0f) {
                LinearGradient linearGradient = this.s;
                Paint paint5 = this.f;
                if (linearGradient == null) {
                    LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, g0.L(90.0f), 0.0f, new int[]{0, n6.r1(0.14f, w03), 0}, (float[]) null, Shader.TileMode.CLAMP);
                    this.s = linearGradient2;
                    paint5.setShader(linearGradient2);
                }
                float interpolation = (kr.j.getInterpolation((SystemClock.elapsedRealtime() % 1300) / 1300.0f) * (f19 + g0.L(90.0f))) + (L6 - g0.L(90.0f));
                Matrix matrix = this.w;
                matrix.setTranslate(interpolation, 0.0f);
                this.s.setLocalMatrix(matrix);
                paint5.setAlpha((int) (f17 * 255.0f));
                canvas.drawRoundRect(rectF2, g0.L(3.0f), g0.L(3.0f), paint5);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    public String getText() {
        i iVar = this.c;
        return iVar.getText() == null ? "" : iVar.getText().toString();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && b(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.c.setTranslationY(a());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        setMeasuredDimension(getMeasuredWidth(), g0.L(44.0f));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        le leVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (!b(motionEvent)) {
                return false;
            }
            this.I = true;
            invalidate();
            return true;
        }
        if ((actionMasked != 1 && actionMasked != 3) || !this.I) {
            return this.I;
        }
        this.I = false;
        if (actionMasked == 1 && (leVar = this.b) != null) {
            ChatActivityEnterView chatActivityEnterView = leVar.b;
            zi0 zi0Var = chatActivityEnterView.i1;
            if (zi0Var != null) {
                zi0Var.setPlaying(!zi0Var.g());
            }
            a aVar = chatActivityEnterView.T1;
            if (aVar != null) {
                aVar.invalidate();
            }
        }
        invalidate();
        return true;
    }

    public void setCollapsing(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            requestLayout();
        }
    }

    public void setModeProgress(float f10) {
        this.G = f10;
        invalidate();
    }

    public void setVisibleHeight(float f10) {
        if (this.F != f10) {
            this.F = f10;
            this.c.setTranslationY(a());
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.n || drawable == this.r || super.verifyDrawable(drawable);
    }
}
