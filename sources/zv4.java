// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class zv4 extends FrameLayout {
    public static final k43 i0 = new k43(0.33d, 1.0d, 0.68d, 1.0d);
    public final RectF E;
    public final RectF F;
    public final Path G;
    public final boolean H;
    public final int I;
    public final int J;
    public final int K;
    public int L;
    public int M;
    public float N;
    public boolean O;
    public Object P;
    public Drawable Q;
    public Runnable R;
    public jl0 S;
    public int T;
    public int U;
    public on1 V;
    public h01 W;
    public final View a;
    public boolean a0;
    public final vnb b;
    public boolean b0;
    public final yv4 c;
    public boolean c0;
    public LinearLayout d;
    public ValueAnimator d0;
    public LinearLayout e;
    public final RectF e0;
    public final FrameLayout f;
    public final RectF f0;
    public int g0;
    public final ScrollView h;
    public vpa h0;
    public int n;
    public final Paint r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public final RectF y;

    public zv4(Context context, View view, vnb vnbVar, yv4 yv4Var) {
        super(context);
        this.n = ConnectionsManager.DEFAULT_DATACENTER_ID;
        Paint paint = new Paint(1);
        this.r = paint;
        Paint paint2 = new Paint(1);
        this.s = paint2;
        this.w = new Paint(1);
        this.x = new Paint(1);
        this.y = new RectF();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Path();
        this.M = hl.L(220.0f);
        this.e0 = new RectF();
        this.f0 = new RectF();
        this.a = view;
        this.b = vnbVar;
        this.c = yv4Var;
        setWillNotDraw(false);
        setClipChildren(false);
        int v0 = aob.v0(aob.d6, vnbVar);
        int v02 = aob.v0(aob.G6, vnbVar);
        this.K = v02;
        boolean z = hl.B(v0) < 0.5f;
        this.H = z;
        paint.setColor(aob.p1(Build.VERSION.SDK_INT >= 31 ? z ? 0.78f : 0.74f : 0.97f, v0));
        this.I = paint.getAlpha();
        this.L = aob.p1(0.06f, v02);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(hl.L(0.66f));
        int i = z ? 620756991 : 385875968;
        this.J = i;
        paint2.setColor(i);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setPadding(0, hl.L(6.0f), 0, hl.L(6.0f));
        ScrollView scrollView = new ScrollView(context);
        this.h = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setOverScrollMode(2);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        frameLayout.addView(this.d, new FrameLayout.LayoutParams(-1, -2));
        scrollView.addView(frameLayout, new FrameLayout.LayoutParams(-1, -2));
        addView(scrollView, new FrameLayout.LayoutParams(-2, -2));
        setOnClickListener(new xv4(this, (byte) 0));
    }

    public final void a(FrameLayout frameLayout, int i, Runnable runnable) {
        frameLayout.setBackground(aob.f0(aob.p1(0.08f, this.K), 2, -1));
        if (runnable != null) {
            frameLayout.setOnClickListener(new vv4(this, runnable, (byte) 0));
        }
        this.d.addView(frameLayout, tre.o(-1, i));
    }

    public final void b(float f) {
        this.N = f;
        RectF rectF = this.E;
        if (!rectF.isEmpty()) {
            float width = rectF.width();
            RectF rectF2 = this.y;
            float max = Math.max(0.0f, Math.min(width, rectF2.centerX() - rectF.left));
            ScrollView scrollView = this.h;
            scrollView.setPivotX(max);
            scrollView.setPivotY(Math.max(0.0f, Math.min(rectF.height(), rectF2.centerY() - rectF.top)));
            float max2 = (Math.max(0.0f, f) * 0.1f) + 0.9f;
            scrollView.setScaleX(max2);
            scrollView.setScaleY(max2);
        }
        int childCount = this.d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.d.getChildAt(i);
            float max3 = 1.0f - Math.max(0.0f, Math.min(1.0f, ((f - 0.3f) - (Math.min(i, 6) * 0.045f)) / 0.42f));
            float f2 = 1.0f - (max3 * max3);
            childAt.setAlpha(f2);
            childAt.setTranslationY((1.0f - f2) * (-hl.L(6.0f)));
            float f3 = (f2 * 0.04f) + 0.96f;
            childAt.setScaleX(f3);
            childAt.setScaleY(f3);
        }
        this.a.setAlpha(1.0f - Math.max(0.0f, Math.min(1.0f, (f - 0.1f) / 0.45f)));
        Drawable drawable = this.Q;
        if (drawable != null && !this.b0) {
            drawable.setAlpha(Math.round((1.0f - Math.max(0.0f, Math.min(1.0f, f))) * 255.0f));
        }
        invalidate();
    }

    public final void c(Runnable runnable) {
        if (this.O) {
            return;
        }
        this.O = true;
        if (runnable != null) {
            runnable.run();
        }
        rj4 rj4Var = new rj4(this, (byte) 13);
        vpa vpaVar = this.h0;
        if (vpaVar != null) {
            vpaVar.d();
        }
        vpa vpaVar2 = new vpa(new xk4(this.N * 1000.0f));
        vpaVar2.m = bp1.j(0.0f, 650.0f, 1.0f);
        this.h0 = vpaVar2;
        vpaVar2.f(1.0f);
        this.h0.b(new wv4(this, (byte) 1));
        this.h0.a(new x11(this, rj4Var, (byte) 4));
        this.h0.h();
    }

    public final boolean d() {
        LinearLayout linearLayout = this.e;
        if (linearLayout == null || this.O) {
            return false;
        }
        this.e = null;
        i(linearLayout, false);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        yv4 yv4Var;
        RectF rectF = this.y;
        if (rectF.isEmpty() && getWidth() > 0) {
            f();
        }
        if (this.O) {
            e();
        }
        float f2 = this.N;
        float f3 = rectF.left;
        RectF rectF2 = this.E;
        float R1 = hl.R1(f3, rectF2.left, f2);
        float R12 = hl.R1(rectF.top, rectF2.top, f2);
        float R13 = hl.R1(rectF.right, rectF2.right, f2);
        float R14 = hl.R1(rectF.bottom, rectF2.bottom, f2);
        RectF rectF3 = this.F;
        rectF3.set(R1, R12, R13, R14);
        if (rectF3.width() <= 1.0f || rectF3.height() <= 1.0f) {
            return;
        }
        float max = Math.max(0.0f, Math.min(1.0f, f2));
        float min = (!this.a0 || this.O) ? max : Math.min(1.0f, 2.5f * max);
        float R15 = hl.R1(rectF.height() / 2.0f, hl.L(16.0f), max);
        Path path = this.G;
        path.rewind();
        path.addRoundRect(rectF3, R15, R15, Path.Direction.CW);
        if (min > 0.0f) {
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(path);
            } else {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            int p1 = aob.p1(0.01f, aob.v0(aob.d6, this.b));
            Paint paint = this.w;
            paint.setColor(p1);
            float L = hl.L(6.0f);
            float L2 = hl.L(1.5f);
            boolean z = this.H;
            paint.setShadowLayer(L, 0.0f, L2, aob.p1((z ? 0.3f : 0.1f) * min, -16777216));
            canvas.drawRoundRect(rectF3, R15, R15, paint);
            paint.setShadowLayer(hl.L(1.0f), 0.0f, hl.L(0.5f), aob.p1((z ? 0.25f : 0.07f) * min, -16777216));
            canvas.drawRoundRect(rectF3, R15, R15, paint);
            canvas.restore();
        }
        jl0 jl0Var = this.S;
        if (jl0Var != null && min < 1.0f) {
            jl0Var.r(R15);
            this.S.setBounds((int) rectF3.left, (int) rectF3.top, (int) Math.ceil(rectF3.right), (int) Math.ceil(rectF3.bottom));
            this.S.setAlpha((int) ((1.0f - min) * 255.0f));
            this.S.draw(canvas);
        }
        if (this.W != null) {
            View view = this.a;
            if (view.getAlpha() > 0.0f) {
                canvas.save();
                canvas.clipPath(path);
                h01 h01Var = this.W;
                float alpha = view.getAlpha();
                zv4 zv4Var = (zv4) h01Var.b;
                knc kncVar = (knc) h01Var.c;
                zv4Var.getLocationInWindow(new int[2]);
                kncVar.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r14[0] - r15[0], r14[1] - r15[1]);
                RectF rectF4 = kncVar.O1;
                if (!rectF4.isEmpty() && alpha > 0.0f) {
                    kncVar.h(canvas, rectF4, alpha);
                }
                canvas.restore();
                canvas.restore();
            }
        }
        canvas.save();
        canvas.clipPath(path);
        if (min > 0.0f) {
            int saveLayerAlpha = canvas.saveLayerAlpha(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, (int) (255.0f * min));
            int ceil = (int) Math.ceil(rectF3.width());
            int ceil2 = (int) Math.ceil(rectF3.height());
            if (Build.VERSION.SDK_INT < 31 || !canvas.isHardwareAccelerated() || (yv4Var = this.c) == null || ceil <= 0 || ceil2 <= 0) {
                f = 1.0f;
            } else {
                RenderNode g = rm0.g(this.P);
                if (g == null) {
                    g = new RenderNode("marketMorphBlur");
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.35f);
                    f = 1.0f;
                    g.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix)), RenderEffect.createBlurEffect(hl.L(22.0f), hl.L(22.0f), Shader.TileMode.CLAMP)));
                    this.P = g;
                } else {
                    f = 1.0f;
                }
                int L3 = hl.L(24.0f);
                int i = L3 << 1;
                int i2 = ceil + i;
                int i3 = ceil2 + i;
                g.setPosition(0, 0, i2, i3);
                RecordingCanvas beginRecording = g.beginRecording(i2, i3);
                float f4 = L3;
                try {
                    beginRecording.translate(f4 - rectF3.left, f4 - rectF3.top);
                    yv4Var.a(beginRecording);
                    g.endRecording();
                    canvas.save();
                    canvas.translate(rectF3.left - f4, rectF3.top - f4);
                    canvas.drawRenderNode(g);
                    canvas.restore();
                } catch (Throwable th) {
                    g.endRecording();
                    throw th;
                }
            }
            canvas.restoreToCount(saveLayerAlpha);
        } else {
            f = 1.0f;
        }
        Paint paint2 = this.r;
        paint2.setAlpha((int) (this.I * min));
        canvas.drawRect(rectF3, paint2);
        if (this.Q == null && Color.alpha(this.L) > 0) {
            int i4 = this.L;
            Paint paint3 = this.x;
            paint3.setColor(i4);
            paint3.setAlpha(Math.round((f - min) * Color.alpha(this.L)));
            canvas.drawRect(rectF3, paint3);
        }
        canvas.restore();
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
        Paint paint4 = this.s;
        paint4.setAlpha((int) (Color.alpha(this.J) * min));
        RectF rectF5 = hl.P;
        rectF5.set(rectF3.left + hl.L(0.33f), rectF3.top + hl.L(0.33f), rectF3.right - hl.L(0.33f), rectF3.bottom - hl.L(0.33f));
        canvas.drawRoundRect(rectF5, R15, R15, paint4);
    }

    public final void e() {
        on1 on1Var = this.V;
        if (on1Var != null && this.O) {
            on1Var.run();
        }
        View view = this.a;
        view.getLocationInWindow(new int[2]);
        getLocationInWindow(new int[2]);
        float scaleX = ((r1[0] - r0[0]) - ((1.0f - view.getScaleX()) * view.getPivotX())) - view.getTranslationX();
        float scaleY = ((r1[1] - r0[1]) - ((1.0f - view.getScaleY()) * view.getPivotY())) - view.getTranslationY();
        RectF rectF = this.y;
        rectF.set(scaleX, scaleY, view.getWidth() + scaleX, view.getHeight() + scaleY);
        rectF.inset(0.0f, 0.0f);
    }

    public final void f() {
        e();
        this.d.measure(0, 0);
        int i = this.n;
        boolean z = this.c0;
        RectF rectF = this.y;
        if (z) {
            int i2 = this.U;
            if (i2 > 0) {
                i = Math.min(i, i2 - this.T);
            } else {
                float f = rectF.top;
                if (f > 0.0f) {
                    i = c00.y(16.0f, (int) f, i);
                }
            }
        }
        if (!this.c0 && getHeight() > 0) {
            i = c00.y(16.0f, getHeight(), i);
        }
        int max = Math.max(this.M, this.d.getMeasuredWidth());
        int min = Math.min(this.d.getMeasuredHeight(), Math.max(hl.L(48.0f), i));
        float f2 = rectF.centerX() > ((float) getWidth()) / 2.0f ? rectF.right - max : rectF.left;
        float f3 = max;
        if (f2 + f3 > getWidth() - hl.L(8.0f)) {
            f2 = qu6.x(8.0f, getWidth(), max);
        }
        float max2 = Math.max(hl.L(8.0f), f2);
        boolean z2 = this.c0;
        RectF rectF2 = this.E;
        if (!z2) {
            float f4 = rectF.top;
            if (getHeight() > 0 && min + f4 > getHeight() - hl.L(8.0f)) {
                f4 = Math.max(hl.L(8.0f), (getHeight() - hl.L(8.0f)) - min);
            }
            rectF2.set(max2, f4, f3 + max2, min + f4);
            return;
        }
        if (!this.a0) {
            float f5 = min;
            float max3 = Math.max(hl.L(8.0f), (rectF.top - hl.L(8.0f)) - f5);
            rectF2.set(max2, max3, f3 + max2, f5 + max3);
            return;
        }
        float f6 = rectF.left;
        if (f6 + f3 > getWidth() - hl.L(8.0f)) {
            f6 = rectF.centerX() - (f3 / 2.0f);
        }
        float max4 = Math.max(hl.L(8.0f), Math.min(qu6.x(8.0f, getWidth(), max), f6));
        int i3 = this.U;
        if (i3 > 0) {
            float f7 = rectF.bottom;
            float f8 = min;
            float f9 = f7 - f8;
            float f10 = this.T;
            if (f9 < f10) {
                rectF2.set(max4, f10, f3 + max4, Math.min(f8 + f10, Math.max(f7, i3)));
                return;
            }
        }
        rectF2.set(max4, Math.max(hl.L(8.0f), rectF.bottom - min), f3 + max4, rectF.bottom);
    }

    public final void g() {
        this.Q = this.a.getBackground();
        b(this.N);
        vpa vpaVar = new vpa(new xk4(this.N * 1000.0f));
        vpaVar.m = bp1.j(1000.0f, 560.0f, 0.86f);
        this.h0 = vpaVar;
        vpaVar.b(new wv4(this, (byte) 0));
        this.h0.h();
    }

    public final void h(ArrayList arrayList, ArrayList arrayList2) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, hl.L(6.0f), 0, hl.L(6.0f));
        b8 b8Var = new b8(0, this.b, getContext(), false, false);
        b8Var.j(ob6.M0(2131753749, null), R.drawable.msg_arrow_back, null);
        b8Var.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        int v0 = aob.v0(aob.F8, this.b);
        int i = this.K;
        b8Var.d(i, v0);
        b8Var.setBackground(aob.f0(aob.p1(0.08f, i), 2, -1));
        b8Var.setOnClickListener(new xv4(this, (byte) 1));
        linearLayout.addView(b8Var, tre.o(-1, 44));
        View view = new View(getContext());
        view.setBackgroundColor(aob.p1(0.06f, i));
        linearLayout.addView(view, tre.o(-1, 8));
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            View view2 = (View) arrayList.get(i2);
            Runnable runnable = (Runnable) arrayList2.get(i2);
            view2.setBackground(aob.f0(aob.p1(0.08f, i), 2, -1));
            if (runnable != null) {
                view2.setOnClickListener(new vv4(this, runnable, (byte) 1));
            }
            linearLayout.addView(view2, tre.o(-1, 44));
        }
        this.e = this.d;
        i(linearLayout, true);
    }

    public final void i(final LinearLayout linearLayout, boolean z) {
        int i;
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        final LinearLayout linearLayout2 = this.d;
        final int scrollY = this.h.getScrollY();
        int i2 = 0;
        if (z) {
            this.g0 = scrollY;
            i = 0;
        } else {
            i = this.g0;
        }
        RectF rectF = this.e0;
        RectF rectF2 = this.E;
        rectF.set(rectF2);
        this.d = linearLayout;
        if (linearLayout.getParent() == null) {
            this.f.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        }
        while (true) {
            if (i2 >= linearLayout.getChildCount()) {
                break;
            }
            View childAt = linearLayout.getChildAt(i2);
            childAt.setAlpha(1.0f);
            childAt.setTranslationY(0.0f);
            childAt.setScaleX(1.0f);
            childAt.setScaleY(1.0f);
            i2++;
        }
        f();
        this.f0.set(rectF2);
        rectF2.set(rectF);
        final float f = z ? 1.0f : -1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d0 = ofFloat;
        final int i3 = i;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: uv4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                zv4 zv4Var = zv4.this;
                RectF rectF3 = zv4Var.E;
                RectF rectF4 = zv4Var.e0;
                float f2 = rectF4.left;
                RectF rectF5 = zv4Var.f0;
                rectF3.set(hl.R1(f2, rectF5.left, floatValue), hl.R1(rectF4.top, rectF5.top, floatValue), hl.R1(rectF4.right, rectF5.right, floatValue), hl.R1(rectF4.bottom, rectF5.bottom, floatValue));
                float max = Math.max(rectF4.width(), rectF5.width());
                float f3 = f;
                LinearLayout linearLayout3 = linearLayout2;
                linearLayout3.setTranslationX((-f3) * max * floatValue);
                float f4 = 1.0f - floatValue;
                linearLayout3.setAlpha(f4);
                float f5 = f3 * max * f4;
                LinearLayout linearLayout4 = linearLayout;
                linearLayout4.setTranslationX(f5);
                linearLayout4.setTranslationY(scrollY - i3);
                linearLayout4.setAlpha(floatValue);
                zv4Var.requestLayout();
                zv4Var.invalidate();
            }
        });
        this.d0.addListener(new eq1(this, linearLayout2, linearLayout, i3, (byte) 2));
        this.d0.setDuration(260L);
        this.d0.setInterpolator(i0);
        this.d0.start();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.d0 == null) {
            f();
        }
        RectF rectF = this.E;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) rectF.width(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) rectF.height(), TLObject.FLAG_30);
        ScrollView scrollView = this.h;
        scrollView.measure(makeMeasureSpec, makeMeasureSpec2);
        scrollView.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
