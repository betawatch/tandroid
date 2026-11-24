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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vt4 extends FrameLayout {
    public static final s33 c0 = new s33(0.33d, 1.0d, 0.68d, 1.0d);
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
    public boolean S;
    public boolean T;
    public ValueAnimator U;
    public final RectF V;
    public final RectF W;
    public final View a;
    public int a0;
    public final wjb b;
    public yla b0;
    public final ut4 c;
    public LinearLayout d;
    public LinearLayout e;
    public final FrameLayout f;
    public final ScrollView h;
    public int n;
    public final Paint r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public final RectF y;

    public vt4(Context context, View view, wjb wjbVar, ut4 ut4Var) {
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
        this.M = gl.L(220.0f);
        this.V = new RectF();
        this.W = new RectF();
        this.a = view;
        this.b = wjbVar;
        this.c = ut4Var;
        setWillNotDraw(false);
        setClipChildren(false);
        int v0 = bkb.v0(bkb.c6, wjbVar);
        int v02 = bkb.v0(bkb.F6, wjbVar);
        this.K = v02;
        boolean z = gl.B(v0) < 0.5f;
        this.H = z;
        paint.setColor(bkb.p1(Build.VERSION.SDK_INT >= 31 ? z ? 0.78f : 0.74f : 0.97f, v0));
        this.I = paint.getAlpha();
        this.L = bkb.p1(0.06f, v02);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(gl.L(0.66f));
        int i = z ? 620756991 : 385875968;
        this.J = i;
        paint2.setColor(i);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setPadding(0, gl.L(6.0f), 0, gl.L(6.0f));
        ScrollView scrollView = new ScrollView(context);
        this.h = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setOverScrollMode(2);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        frameLayout.addView(this.d, new FrameLayout.LayoutParams(-1, -2));
        scrollView.addView(frameLayout, new FrameLayout.LayoutParams(-1, -2));
        addView(scrollView, new FrameLayout.LayoutParams(-2, -2));
        setOnClickListener(new tt4(this, (byte) 0));
    }

    public final void a(FrameLayout frameLayout, int i, Runnable runnable) {
        frameLayout.setBackground(bkb.f0(bkb.p1(0.08f, this.K), 2, -1));
        if (runnable != null) {
            frameLayout.setOnClickListener(new rt4(this, runnable, (byte) 0));
        }
        this.d.addView(frameLayout, nme.o(-1, i));
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
            childAt.setTranslationY((1.0f - f2) * (-gl.L(6.0f)));
            float f3 = (f2 * 0.04f) + 0.96f;
            childAt.setScaleX(f3);
            childAt.setScaleY(f3);
        }
        this.a.setAlpha(1.0f - Math.max(0.0f, Math.min(1.0f, (f - 0.1f) / 0.45f)));
        Drawable drawable = this.Q;
        if (drawable != null && !this.S) {
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
        s54 s54Var = new s54((Object) this, (byte) 29);
        yla ylaVar = this.b0;
        if (ylaVar != null) {
            ylaVar.d();
        }
        yla ylaVar2 = new yla(new ti4(this.N * 1000.0f));
        ylaVar2.m = oo1.j(0.0f, 650.0f, 1.0f);
        this.b0 = ylaVar2;
        ylaVar2.f(1.0f);
        this.b0.b(new st4(this, (byte) 1));
        this.b0.a(new o11(this, s54Var, (byte) 4));
        this.b0.h();
    }

    public final void d() {
        View view = this.a;
        view.getLocationInWindow(new int[2]);
        getLocationInWindow(new int[2]);
        float scaleX = ((r1[0] - r0[0]) - ((1.0f - view.getScaleX()) * view.getPivotX())) - view.getTranslationX();
        float scaleY = ((r1[1] - r0[1]) - ((1.0f - view.getScaleY()) * view.getPivotY())) - view.getTranslationY();
        RectF rectF = this.y;
        rectF.set(scaleX, scaleY, view.getWidth() + scaleX, view.getHeight() + scaleY);
        rectF.inset(0.0f, 0.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ut4 ut4Var;
        RectF rectF = this.y;
        if (rectF.isEmpty() && getWidth() > 0) {
            e();
        }
        if (this.O) {
            d();
        }
        float f = this.N;
        float f2 = rectF.left;
        RectF rectF2 = this.E;
        float R1 = gl.R1(f2, rectF2.left, f);
        float R12 = gl.R1(rectF.top, rectF2.top, f);
        float R13 = gl.R1(rectF.right, rectF2.right, f);
        float R14 = gl.R1(rectF.bottom, rectF2.bottom, f);
        RectF rectF3 = this.F;
        rectF3.set(R1, R12, R13, R14);
        if (rectF3.width() <= 1.0f || rectF3.height() <= 1.0f) {
            return;
        }
        float max = Math.max(0.0f, Math.min(1.0f, f));
        float R15 = gl.R1(rectF.height() / 2.0f, gl.L(16.0f), max);
        Path path = this.G;
        path.rewind();
        path.addRoundRect(rectF3, R15, R15, Path.Direction.CW);
        if (max > 0.0f) {
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(path);
            } else {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            int p1 = bkb.p1(0.01f, bkb.v0(bkb.c6, this.b));
            Paint paint = this.w;
            paint.setColor(p1);
            float L = gl.L(6.0f);
            float L2 = gl.L(1.5f);
            boolean z = this.H;
            paint.setShadowLayer(L, 0.0f, L2, bkb.p1((z ? 0.3f : 0.1f) * max, -16777216));
            canvas.drawRoundRect(rectF3, R15, R15, paint);
            paint.setShadowLayer(gl.L(1.0f), 0.0f, gl.L(0.5f), bkb.p1((z ? 0.25f : 0.07f) * max, -16777216));
            canvas.drawRoundRect(rectF3, R15, R15, paint);
            canvas.restore();
        }
        canvas.save();
        canvas.clipPath(path);
        if (max > 0.0f) {
            int saveLayerAlpha = canvas.saveLayerAlpha(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, (int) (255.0f * max));
            int ceil = (int) Math.ceil(rectF3.width());
            int ceil2 = (int) Math.ceil(rectF3.height());
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (ut4Var = this.c) != null && ceil > 0 && ceil2 > 0) {
                RenderNode e = qm0.e(this.P);
                if (e == null) {
                    e = new RenderNode("marketMorphBlur");
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.35f);
                    e.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix)), RenderEffect.createBlurEffect(gl.L(22.0f), gl.L(22.0f), Shader.TileMode.CLAMP)));
                    this.P = e;
                }
                int L3 = gl.L(24.0f);
                int i = L3 << 1;
                int i2 = ceil + i;
                int i3 = ceil2 + i;
                e.setPosition(0, 0, i2, i3);
                RecordingCanvas beginRecording = e.beginRecording(i2, i3);
                float f3 = L3;
                try {
                    beginRecording.translate(f3 - rectF3.left, f3 - rectF3.top);
                    ut4Var.b(beginRecording);
                    e.endRecording();
                    canvas.save();
                    canvas.translate(rectF3.left - f3, rectF3.top - f3);
                    canvas.drawRenderNode(e);
                    canvas.restore();
                } catch (Throwable th) {
                    e.endRecording();
                    throw th;
                }
            }
            canvas.restoreToCount(saveLayerAlpha);
        }
        Paint paint2 = this.r;
        paint2.setAlpha((int) (this.I * max));
        canvas.drawRect(rectF3, paint2);
        if (this.Q == null && Color.alpha(this.L) > 0) {
            int i4 = this.L;
            Paint paint3 = this.x;
            paint3.setColor(i4);
            paint3.setAlpha(Math.round((1.0f - max) * Color.alpha(this.L)));
            canvas.drawRect(rectF3, paint3);
        }
        canvas.restore();
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
        Paint paint4 = this.s;
        paint4.setAlpha((int) (Color.alpha(this.J) * max));
        RectF rectF4 = gl.P;
        rectF4.set(rectF3.left + gl.L(0.33f), rectF3.top + gl.L(0.33f), rectF3.right - gl.L(0.33f), rectF3.bottom - gl.L(0.33f));
        canvas.drawRoundRect(rectF4, R15, R15, paint4);
    }

    public final void e() {
        d();
        this.d.measure(0, 0);
        int i = this.n;
        boolean z = this.T;
        RectF rectF = this.y;
        if (z) {
            float f = rectF.top;
            if (f > 0.0f) {
                i = b00.x(16.0f, (int) f, i);
            }
        }
        if (!this.T && getHeight() > 0) {
            i = b00.x(16.0f, getHeight(), i);
        }
        int max = Math.max(this.M, this.d.getMeasuredWidth());
        int min = Math.min(this.d.getMeasuredHeight(), Math.max(gl.L(48.0f), i));
        float f2 = rectF.centerX() > ((float) getWidth()) / 2.0f ? rectF.right - max : rectF.left;
        float f3 = max;
        if (f2 + f3 > getWidth() - gl.L(8.0f)) {
            f2 = ls6.x(8.0f, getWidth(), max);
        }
        float max2 = Math.max(gl.L(8.0f), f2);
        boolean z2 = this.T;
        RectF rectF2 = this.E;
        if (z2) {
            float f4 = min;
            float max3 = Math.max(gl.L(8.0f), (rectF.top - gl.L(8.0f)) - f4);
            rectF2.set(max2, max3, f3 + max2, f4 + max3);
        } else {
            float f5 = rectF.top;
            if (getHeight() > 0 && min + f5 > getHeight() - gl.L(8.0f)) {
                f5 = Math.max(gl.L(8.0f), (getHeight() - gl.L(8.0f)) - min);
            }
            rectF2.set(max2, f5, f3 + max2, min + f5);
        }
    }

    public final void f() {
        this.Q = this.a.getBackground();
        b(this.N);
        yla ylaVar = new yla(new ti4(this.N * 1000.0f));
        ylaVar.m = oo1.j(1000.0f, 560.0f, 0.86f);
        this.b0 = ylaVar;
        ylaVar.b(new st4(this, (byte) 0));
        this.b0.h();
    }

    public final void g(ArrayList arrayList, ArrayList arrayList2) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, gl.L(6.0f), 0, gl.L(6.0f));
        a8 a8Var = new a8(0, this.b, getContext(), false, false);
        a8Var.j(k96.M0(2131753753, null), R.drawable.msg_arrow_back, null);
        a8Var.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        int v0 = bkb.v0(bkb.E8, this.b);
        int i = this.K;
        a8Var.d(i, v0);
        a8Var.setBackground(bkb.f0(bkb.p1(0.08f, i), 2, -1));
        a8Var.setOnClickListener(new tt4(this, (byte) 1));
        linearLayout.addView(a8Var, nme.o(-1, 44));
        View view = new View(getContext());
        view.setBackgroundColor(bkb.p1(0.06f, i));
        linearLayout.addView(view, nme.o(-1, 8));
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            View view2 = (View) arrayList.get(i2);
            Runnable runnable = (Runnable) arrayList2.get(i2);
            view2.setBackground(bkb.f0(bkb.p1(0.08f, i), 2, -1));
            if (runnable != null) {
                view2.setOnClickListener(new rt4(this, runnable, (byte) 1));
            }
            linearLayout.addView(view2, nme.o(-1, 44));
        }
        this.e = this.d;
        h(linearLayout, true);
    }

    public final void h(final LinearLayout linearLayout, boolean z) {
        int i;
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        final LinearLayout linearLayout2 = this.d;
        final int scrollY = this.h.getScrollY();
        int i2 = 0;
        if (z) {
            this.a0 = scrollY;
            i = 0;
        } else {
            i = this.a0;
        }
        RectF rectF = this.V;
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
        e();
        this.W.set(rectF2);
        rectF2.set(rectF);
        final float f = z ? 1.0f : -1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.U = ofFloat;
        final int i3 = i;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: qt4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                vt4 vt4Var = vt4.this;
                RectF rectF3 = vt4Var.E;
                RectF rectF4 = vt4Var.V;
                float f2 = rectF4.left;
                RectF rectF5 = vt4Var.W;
                rectF3.set(gl.R1(f2, rectF5.left, floatValue), gl.R1(rectF4.top, rectF5.top, floatValue), gl.R1(rectF4.right, rectF5.right, floatValue), gl.R1(rectF4.bottom, rectF5.bottom, floatValue));
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
                vt4Var.requestLayout();
                vt4Var.invalidate();
            }
        });
        this.U.addListener(new qp1(this, linearLayout2, linearLayout, i3, (byte) 2));
        this.U.setDuration(260L);
        this.U.setInterpolator(c0);
        this.U.start();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.U == null) {
            e();
        }
        RectF rectF = this.E;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) rectF.width(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) rectF.height(), TLObject.FLAG_30);
        ScrollView scrollView = this.h;
        scrollView.measure(makeMeasureSpec, makeMeasureSpec2);
        scrollView.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
