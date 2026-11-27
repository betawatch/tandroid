// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ula extends FrameLayout {
    public int E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public boolean I;
    public boolean J;
    public boolean K;
    public long L;
    public Runnable M;
    public pcc N;
    public boolean O;
    public long P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public boolean U;
    public final pn V;
    public final RectF W;
    public float a;
    public final RectF a0;
    public fj8 b;
    public final RectF b0;
    public final pq8 c;
    public final RectF c0;
    public o27 d;
    public final RectF d0;
    public s7 e;
    public final float[] e0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final Path f0;
    public final ArrayList g0;
    public jl0 h;
    public float h0;
    public float i0;
    public float j0;
    public int k0;
    public int l0;
    public final int[] m0;
    public o27 n;
    public final float[] n0;
    public final RectF o0;
    public final WeakHashMap r;
    public boolean s;
    public boolean w;
    public boolean x;
    public int y;

    public ula(Context context) {
        super(context);
        this.a = 1.0f;
        this.c = new pq8((Object) this, (byte) 15);
        this.r = new WeakHashMap();
        this.F = new Paint(1);
        this.G = new Paint(1);
        Paint paint = new Paint();
        this.H = paint;
        this.V = new pn(null);
        this.W = new RectF();
        this.a0 = new RectF();
        this.b0 = new RectF();
        this.c0 = new RectF();
        this.d0 = new RectF();
        this.e0 = new float[8];
        this.f0 = new Path();
        this.g0 = new ArrayList();
        this.m0 = new int[2];
        this.n0 = new float[2];
        this.o0 = new RectF();
        setWillNotDraw(false);
        setClipChildren(false);
        setVisibility(8);
        paint.setColor(-16777216);
    }

    public static void f(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        if (f5 >= 1.0f) {
            canvas.save();
        } else {
            canvas.saveLayerAlpha(f, f2, f3, f4, (int) (f5 * 255.0f));
        }
    }

    public static float g(float f, float f2, float f3) {
        float l = Utilities.l((f3 - f) / (f2 - f));
        return xnb.B(l, 2.0f, 3.0f, l * l);
    }

    private float getAnimatorDurationScale() {
        if (Build.VERSION.SDK_INT >= 33) {
            return ValueAnimator.getDurationScale();
        }
        try {
            return Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
            return 1.0f;
        }
    }

    private int getRawContentBottom() {
        int i = (int) this.W.bottom;
        this.d.getClass();
        return this.d.getMenuExtraBelow() + i;
    }

    private int getRawContentTop() {
        int i = (int) this.W.top;
        return Math.max(Math.min(i, 0), i - this.d.getMenuRise());
    }

    public static double h(double d, double d2, double d3) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        double d4 = 6.283185307179586d / d3;
        double d5 = 1.0d - (d2 * d2);
        double sqrt = Math.sqrt(d5) * d4;
        double d6 = sqrt * d;
        return 1.0d - (((Math.sin(d6) * (d2 / Math.sqrt(d5))) + Math.cos(d6)) * Math.exp(((-d2) * d4) * d));
    }

    private void setAnimating(boolean z) {
        if (this.U == z) {
            return;
        }
        this.U = z;
        pn pnVar = this.V;
        if (z) {
            pnVar.d();
        } else {
            pnVar.e();
        }
    }

    public final void a(boolean z) {
        if (this.I) {
            this.I = false;
            if (z && isAttachedToWindow() && isLaidOut()) {
                i();
                return;
            }
        } else if (!this.U) {
            return;
        }
        c();
    }

    public final void b() {
        o27 o27Var = this.d;
        if (o27Var == null) {
            return;
        }
        s7 s7Var = this.e;
        RectF rectF = this.W;
        this.J = o27Var.c(s7Var, rectF);
        View menuHostView = this.d.getMenuHostView();
        RectF rectF2 = this.o0;
        boolean c = yic.c(menuHostView, this, rectF2);
        float[] fArr = this.n0;
        if (c) {
            fArr[0] = rectF2.left;
            fArr[1] = rectF2.top;
        } else {
            fArr[1] = 0.0f;
            fArr[0] = 0.0f;
        }
        rectF.offset(fArr[0], fArr[1]);
    }

    public final void c() {
        ArrayList arrayList;
        jl0 jl0Var = this.h;
        if (jl0Var != null) {
            jl0Var.a.setEmpty();
        }
        setAnimating(false);
        this.I = false;
        this.x = false;
        this.T = 0.0f;
        this.S = 0.0f;
        this.R = 0.0f;
        clearFocus();
        setVisibility(8);
        int i = 0;
        while (true) {
            arrayList = this.g0;
            if (i >= arrayList.size()) {
                break;
            }
            tla tlaVar = (tla) arrayList.get(i);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = tlaVar.a;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(tlaVar.b);
            Drawable drawable = tlaVar.c;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(drawable);
            if (drawable != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(tlaVar.d);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(tlaVar.e, tlaVar.f, tlaVar.g, tlaVar.h);
            i++;
        }
        arrayList.clear();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null && actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
            this.f.getSwipeBack().setForegroundOnGlass(false);
        }
        s7 s7Var = this.e;
        o27 o27Var = this.d;
        this.e = null;
        this.d = null;
        if (o27Var != null) {
            o27Var.b(null, null);
        }
        if (s7Var != null) {
            s7Var.getIconView().setAlpha(1.0f);
            p7 p7Var = s7Var.R;
            if (p7Var != null) {
                p7Var.A();
            }
        }
        if (this.O) {
            this.O = false;
            pcc pccVar = this.N;
            if (pccVar != null) {
                pccVar.a(Boolean.FALSE);
            }
        }
        Runnable runnable = this.M;
        if (runnable != null) {
            this.M = null;
            runnable.run();
        }
    }

    public final boolean d(o27 o27Var) {
        if (this.d == o27Var && this.e == null) {
            return this.I || this.U;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0491  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        char c;
        float f;
        float f2;
        RectF rectF;
        float f3;
        float l;
        float f4;
        float f5;
        float f6;
        float f7;
        float g;
        char c2;
        o27 o27Var;
        if (this.d == null || this.f == null) {
            return;
        }
        if (this.U) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (this.P == 0) {
                this.P = currentAnimationTimeMillis;
            }
            float animatorDurationScale = getAnimatorDurationScale();
            float f8 = animatorDurationScale <= 0.0f ? 10.0f : ((currentAnimationTimeMillis - this.P) / 1000.0f) / animatorDurationScale;
            float f9 = this.Q;
            if (this.I) {
                this.T = 0.0f;
                this.R = f8 > 0.7f ? 1.0f : ((1.0f - f9) * ((float) h(f8, 0.78d, 0.3d))) + f9;
                this.S = f8 > 0.7f ? 1.0f : ((1.0f - f9) * ((float) h(f8 - 0.02d, 0.8d, 0.34d))) + f9;
                if (f8 > 0.7f) {
                    setAnimating(false);
                }
            } else {
                float l2 = Utilities.l(f8 / 0.2f);
                float l3 = Utilities.l(f8 / 0.17f);
                this.R = (1.0f - ((3.0f - (l3 * 2.0f)) * (l3 * l3))) * f9;
                this.S = (1.0f - ((3.0f - (l2 * 2.0f)) * (l2 * l2))) * f9;
                float f10 = f8 - 0.2f;
                this.T = (f10 <= 0.0f || !this.J) ? 0.0f : f9 * 0.07f * ((float) Math.exp((-f10) / 0.11f)) * ((float) Math.sin((f10 * 6.283185307179586d) / 0.17000000178813934d));
                if (!this.J ? f10 >= 0.0f : f10 > 0.45f) {
                    this.T = 0.0f;
                    post(new cx0(this, (byte) 2));
                }
            }
            float f11 = this.j0;
            float f12 = f11 == 0.0f ? 0.0f : f8 - f11;
            if (f12 > 0.001f) {
                this.i0 = (this.S - this.h0) / f12;
            } else if (f11 == 0.0f) {
                this.i0 = 0.0f;
            }
            this.h0 = this.S;
            this.j0 = Math.max(f8, 1.0E-4f);
        }
        b();
        float backScaleX = this.f.getBackScaleX() * this.f.getMeasuredWidth();
        float backScaleY = this.f.getBackScaleY() * this.f.getMeasuredHeight();
        fj8 swipeBack = this.f.getSwipeBack();
        RectF rectF2 = this.a0;
        if (swipeBack == null || !(swipeBack.R || this.f.c)) {
            rectF2.set(this.f.getLeft(), this.f.getTop(), this.f.getLeft() + backScaleX, this.f.getTop() + backScaleY);
        } else {
            rectF2.set(this.f.getRight() - backScaleX, this.f.getTop(), this.f.getRight(), this.f.getTop() + backScaleY);
        }
        float f13 = this.R;
        float f14 = this.S;
        float l4 = Utilities.l(Math.max(f13, f14));
        RectF rectF3 = this.W;
        float R1 = hl.R1(rectF3.left, rectF2.left, f13);
        float R12 = hl.R1(rectF3.top, rectF2.top, f14);
        float R13 = hl.R1(rectF3.right, rectF2.right, f13);
        float R14 = hl.R1(rectF3.bottom, rectF2.bottom, f14);
        RectF rectF4 = this.b0;
        rectF4.set(R1, R12, R13, R14);
        if (this.T != 0.0f) {
            float centerX = rectF4.centerX();
            float centerY = rectF4.centerY();
            float z = xnb.z(this.T, 0.5f, 1.0f, rectF4.width() / 2.0f);
            float height = (1.0f - this.T) * (rectF4.height() / 2.0f);
            rectF4.set(centerX - z, centerY - height, centerX + z, centerY + height);
        }
        float min = Math.min(Math.min(rectF4.height(), rectF4.width()) / 2.0f, hl.R1(rectF3.height() / 2.0f, hl.L(22.0f), Utilities.l(f14)));
        float l5 = this.s ? Utilities.l(this.i0 / 9.0f) * hl.L(5.0f) * 0.75f : 0.0f;
        float f15 = min + l5;
        float[] fArr = this.e0;
        fArr[3] = f15;
        fArr[2] = f15;
        fArr[1] = f15;
        fArr[0] = f15;
        fArr[7] = min;
        fArr[6] = min;
        fArr[5] = min;
        fArr[4] = min;
        float f16 = rectF4.left;
        float f17 = rectF4.top - l5;
        float f18 = rectF4.right;
        float f19 = rectF4.bottom;
        RectF rectF5 = this.d0;
        rectF5.set(f16, f17, f18, f19);
        o27 o27Var2 = this.d;
        int menuDimAlpha = (o27Var2 == null || o27Var2.getMenuDimAlpha() < 0) ? 26 : this.d.getMenuDimAlpha();
        Paint paint = this.H;
        paint.setAlpha((int) (menuDimAlpha * l4));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int L = hl.L(6.0f);
        float l6 = (this.J && this.d.d()) ? 1.0f : Utilities.l(l4 / 0.25f);
        jl0 jl0Var = this.h;
        RectF rectF6 = this.c0;
        Path path = this.f0;
        if (jl0Var != null) {
            float l7 = this.J ? Utilities.l(l4) : 1.0f;
            this.a = l7;
            this.d.setMenuGlassFrostedProgress(l7);
            this.h.updateColors();
            jl0 jl0Var2 = this.h;
            float j = j(this.d.getButtonsGlassColorProvider(), true);
            pq8 pq8Var = this.c;
            float f20 = l6;
            c = 1;
            float R15 = hl.R1(j, j(pq8Var, true), this.a);
            float R16 = hl.R1(j(this.d.getButtonsGlassColorProvider(), false), j(pq8Var, false), this.a);
            il0 il0Var = jl0Var2.S;
            il0Var.i = R15;
            il0Var.j = R16;
            jl0Var2.Q = null;
            jl0 jl0Var3 = this.h;
            if (l5 > 0.0f) {
                jl0Var3.t(f15, f15, min, min, false);
            } else {
                jl0Var3.r(min);
            }
            this.h.setBounds(Math.round(rectF5.left) - L, Math.round(rectF5.top) - L, Math.round(rectF5.right) + L, Math.round(rectF5.bottom) + L);
            rectF6.set(this.f.getLeft(), this.f.getTop(), this.f.getRight(), this.f.getBottom());
            rectF = rectF3;
            rectF6.union(rectF);
            float max = (Math.max(rectF6.width(), rectF6.height()) * 0.04f) + hl.L(4.0f);
            f = f13;
            f2 = f14;
            this.h.a.set((int) Math.floor(rectF6.left - max), (int) Math.floor(rectF6.top - max), (int) Math.ceil(rectF6.right + max), (int) Math.ceil(rectF6.bottom + max));
            this.h.setAlpha((int) (255.0f * f20));
            this.h.draw(canvas);
        } else {
            float f21 = l6;
            c = 1;
            f = f13;
            f2 = f14;
            rectF = rectF3;
            int v0 = aob.v0(aob.G8, this.d.getMenuResourcesProvider());
            Paint paint2 = this.F;
            paint2.setColor(v0);
            paint2.setAlpha((int) (paint2.getAlpha() * f21));
            path.rewind();
            path.addRoundRect(rectF5, fArr, Path.Direction.CW);
            canvas.drawPath(path, paint2);
        }
        int menuAnchorTint = this.J ? this.d.getMenuAnchorTint() : 0;
        if (menuAnchorTint != 0 && l4 < 1.0f) {
            Paint paint3 = this.G;
            paint3.setColor(menuAnchorTint);
            paint3.setAlpha((int) ((1.0f - l4) * Color.alpha(menuAnchorTint)));
            path.rewind();
            path.addRoundRect(rectF5, fArr, Path.Direction.CW);
            canvas.drawPath(path, paint3);
        }
        canvas.save();
        path.rewind();
        path.addRoundRect(rectF5, fArr, Path.Direction.CW);
        canvas.clipPath(path);
        if (this.J && (o27Var = this.d) != null && o27Var.g()) {
            float abs = Math.abs(rectF2.width() - rectF.width());
            float abs2 = Math.abs(rectF2.height() - rectF.height());
            float f22 = abs + abs2;
            if (f22 >= 1.0f) {
                f3 = Utilities.l(((abs2 * f2) + (abs * f)) / f22);
                char c3 = (this.J || !this.d.g()) ? (char) 0 : c;
                float f23 = c3 == 0 ? 0.5f : 0.3f;
                l = 1.0f - Utilities.l(f3 / (!this.I ? f23 : c3 != 0 ? 0.45f : 0.7f));
                View menuView = !this.J ? this.d.getMenuView() : this.e.getIconView();
                if (l > 0.004f || menuView == null) {
                    f4 = 0.004f;
                    f5 = 0.5f;
                    f6 = 0.15f;
                    f7 = 0.25f;
                } else {
                    RectF rectF7 = this.o0;
                    boolean c4 = yic.c(menuView, this, rectF7);
                    float[] fArr2 = this.n0;
                    if (c4) {
                        c2 = 0;
                        fArr2[0] = rectF7.left;
                        fArr2[c] = rectF7.top;
                    } else {
                        c2 = 0;
                        fArr2[c] = 0.0f;
                        fArr2[0] = 0.0f;
                    }
                    float f24 = fArr2[c2];
                    f4 = 0.004f;
                    rectF6.set(f24, fArr2[c], menuView.getWidth() + f24, fArr2[c] + menuView.getHeight());
                    float l8 = 1.0f - (Utilities.l(f3 / f23) * 0.15f);
                    f6 = 0.15f;
                    f7 = 0.25f;
                    f(canvas, rectF6.left, rectF6.top, rectF6.right, rectF6.bottom, l);
                    float f25 = this.T;
                    f5 = 0.5f;
                    canvas.scale(xnb.z(f25, 0.5f, 1.0f, l8), (1.0f - f25) * l8, rectF6.centerX(), rectF6.centerY());
                    canvas.translate(rectF6.left, rectF6.top);
                    menuView.draw(canvas);
                    canvas.restore();
                }
                boolean z2 = this.s;
                boolean z3 = this.I;
                g = !z2 ? z3 ? g(f6, 0.6f, l4) : g(0.6f, 1.0f, l4) : z3 ? c3 != 0 ? g(0.4f, 0.85f, f3) : g(f7, 0.75f, f3) : g(f5, 0.95f, f3);
                if (g > f4) {
                    if (this.s) {
                        float centerX2 = rectF4.centerX() - rectF2.centerX();
                        float f26 = rectF4.top - rectF2.top;
                        if (Math.abs(this.i0) < 0.6f) {
                            centerX2 = Math.round(centerX2);
                            f26 = Math.round(f26);
                        }
                        f(canvas, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom, g);
                        canvas.translate(centerX2, f26);
                        super.dispatchDraw(canvas);
                        canvas.restore();
                    } else {
                        float max2 = Math.max(0.3f, rectF4.width() / Math.max(1.0f, rectF2.width()));
                        f(canvas, rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, g);
                        if (this.w) {
                            canvas.translate(rectF4.centerX() - rectF2.centerX(), rectF4.top - rectF2.top);
                            canvas.scale(max2, max2, rectF2.centerX(), rectF2.top);
                        } else {
                            canvas.translate(rectF4.right - rectF2.right, rectF4.top - rectF2.top);
                            canvas.scale(max2, max2, rectF2.right, rectF2.top);
                        }
                        super.dispatchDraw(canvas);
                        canvas.restore();
                    }
                }
                canvas.restore();
                if (this.U) {
                    return;
                }
                invalidate();
                return;
            }
        }
        f3 = l4;
        if (this.J) {
        }
        if (c3 == 0) {
        }
        l = 1.0f - Utilities.l(f3 / (!this.I ? f23 : c3 != 0 ? 0.45f : 0.7f));
        View menuView2 = !this.J ? this.d.getMenuView() : this.e.getIconView();
        if (l > 0.004f) {
        }
        f4 = 0.004f;
        f5 = 0.5f;
        f6 = 0.15f;
        f7 = 0.25f;
        boolean z22 = this.s;
        boolean z32 = this.I;
        g = !z22 ? z32 ? g(f6, 0.6f, l4) : g(0.6f, 1.0f, l4) : z32 ? c3 != 0 ? g(0.4f, 0.85f, f3) : g(f7, 0.75f, f3) : g(f5, 0.95f, f3);
        if (g > f4) {
        }
        canvas.restore();
        if (this.U) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.I || keyEvent.getAction() != 1 || keyEvent.getRepeatCount() != 0 || (keyEvent.getKeyCode() != 82 && keyEvent.getKeyCode() != 4)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        a(true);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r7.W.contains(r8.getX(), r8.getY()) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r7.K = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r1 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        a(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r7.a0.contains(r8.getX(), r8.getY()) == false) goto L16;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!this.I) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (SystemClock.uptimeMillis() - this.L < 300) {
            }
        }
        if (this.K) {
            return true;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(o27 o27Var, s7 s7Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        ViewParent parent;
        View findFocus;
        if (this.I && this.d == o27Var && this.e == s7Var) {
            return;
        }
        o27 o27Var2 = this.d;
        if (o27Var2 != null && (o27Var2 != o27Var || this.e != s7Var)) {
            c();
        }
        this.d = o27Var;
        this.e = s7Var;
        this.s = o27Var.h();
        this.w = o27Var.a();
        this.x = false;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != actionBarPopupWindow$ActionBarPopupWindowLayout) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                hl.B2(actionBarPopupWindow$ActionBarPopupWindowLayout2);
            }
            this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        k(actionBarPopupWindow$ActionBarPopupWindowLayout, hl.L(5.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(0.0f);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(1.0f);
        yob.c0(actionBarPopupWindow$ActionBarPopupWindowLayout, false);
        fu5.V(actionBarPopupWindow$ActionBarPopupWindowLayout, aob.p1(0.06f, aob.v0(aob.E8, this.d.getMenuResourcesProvider())));
        actionBarPopupWindow$ActionBarPopupWindowLayout.f();
        fj8 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        if (swipeBack != null) {
            swipeBack.b(false);
            swipeBack.setForegroundOnGlass(true);
            if (this.b != swipeBack) {
                this.b = swipeBack;
                swipeBack.y.add(new qd2(this, (byte) 1));
            }
            for (int i = 1; i < swipeBack.getChildCount(); i++) {
                if (swipeBack.getChildAt(i) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) swipeBack.getChildAt(i);
                    k(actionBarPopupWindow$ActionBarPopupWindowLayout3, 0);
                    yob.c0(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
                    fu5.V(actionBarPopupWindow$ActionBarPopupWindowLayout3, aob.p1(0.06f, aob.v0(aob.E8, this.d.getMenuResourcesProvider())));
                }
            }
        }
        ScrollView scrollView = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
        if (scrollView != null) {
            scrollView.scrollTo(0, 0);
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() != this) {
            hl.B2(actionBarPopupWindow$ActionBarPopupWindowLayout);
            addView(actionBarPopupWindow$ActionBarPopupWindowLayout, new FrameLayout.LayoutParams(-2, -2));
        }
        jl0 jl0Var = this.h;
        if (jl0Var != null) {
            if (this.n != o27Var) {
                jl0Var.a.setEmpty();
                this.h.setBounds(0, 0, 0, 0);
            }
            parent = getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).bringChildToFront(this);
            }
            setVisibility(0);
            this.I = true;
            this.L = SystemClock.uptimeMillis();
            if (!this.O) {
                this.O = true;
                pcc pccVar = this.N;
                if (pccVar != null) {
                    pccVar.a(Boolean.TRUE);
                }
            }
            i();
            o27Var.b(this, s7Var);
            b();
            if (!this.J && s7Var != null) {
                s7Var.getIconView().setAlpha(0.0f);
            }
            findFocus = getRootView() == null ? getRootView().findFocus() : null;
            if ((findFocus instanceof EditText) || !findFocus.isShown()) {
                setFocusableInTouchMode(true);
                requestFocus();
            }
            return;
        }
        WeakHashMap weakHashMap = this.r;
        jl0 jl0Var2 = (jl0) weakHashMap.get(o27Var);
        this.h = jl0Var2;
        if (jl0Var2 == null) {
            jl0 i2 = o27Var.i(this);
            this.h = i2;
            if (i2 != null) {
                i2.p(this.c);
                weakHashMap.put(o27Var, this.h);
            }
        }
        this.n = o27Var;
        parent = getParent();
        if (parent instanceof ViewGroup) {
        }
        setVisibility(0);
        this.I = true;
        this.L = SystemClock.uptimeMillis();
        if (!this.O) {
        }
        i();
        o27Var.b(this, s7Var);
        b();
        if (!this.J) {
            s7Var.getIconView().setAlpha(0.0f);
        }
        if (getRootView() == null) {
        }
        if (findFocus instanceof EditText) {
        }
        setFocusableInTouchMode(true);
        requestFocus();
    }

    public s7 getItem() {
        return this.e;
    }

    public final void i() {
        this.Q = Math.max(this.R, this.S);
        this.h0 = this.S;
        this.j0 = 0.0f;
        this.P = 0L;
        setAnimating(true);
        invalidate();
    }

    public final float j(bl0 bl0Var, boolean z) {
        if (bl0Var == this.c) {
            o27 o27Var = this.d;
            bl0Var = o27Var != null ? o27Var.getMenuGlassColorProvider() : null;
        }
        if (!(bl0Var instanceof ol0)) {
            return hl.N(z ? 1.0f : 0.6666667f);
        }
        ol0 ol0Var = (ol0) bl0Var;
        return z ? ol0Var.f : ol0Var.h;
    }

    public final void k(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.g0;
            if (i2 >= arrayList.size()) {
                arrayList.add(new tla(actionBarPopupWindow$ActionBarPopupWindowLayout));
                break;
            } else if (((tla) arrayList.get(i2)).a == actionBarPopupWindow$ActionBarPopupWindowLayout) {
                break;
            } else {
                i2++;
            }
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(null);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(null);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(0, i, 0, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.I || this.U) {
            c();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        if (this.d == null || (actionBarPopupWindow$ActionBarPopupWindowLayout = this.f) == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() != this) {
            return;
        }
        b();
        int measuredWidth = this.f.getMeasuredWidth();
        int measuredHeight = this.f.getMeasuredHeight();
        boolean z2 = this.s;
        RectF rectF = this.W;
        if (z2) {
            this.d.getClass();
            int max = (int) Math.max(hl.L(8.0f), Math.min(qu6.x(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
            int rawContentBottom = getRawContentBottom();
            if (rawContentBottom - measuredHeight < this.k0) {
                rawContentBottom = Math.min(Math.max(rawContentBottom, this.l0), this.k0 + measuredHeight);
            }
            this.f.layout(max, rawContentBottom - measuredHeight, measuredWidth + max, rawContentBottom);
            return;
        }
        if (!this.w) {
            int i5 = (int) rectF.right;
            int rawContentTop = getRawContentTop();
            if (rawContentTop + measuredHeight > this.l0) {
                rawContentTop = Math.max(Math.min(rawContentTop, this.k0), this.l0 - measuredHeight);
            }
            int max2 = Math.max(hl.L(8.0f), i5 - measuredWidth);
            this.f.layout(max2, rawContentTop, measuredWidth + max2, measuredHeight + rawContentTop);
            return;
        }
        if (!this.x) {
            this.x = true;
            int rawContentTop2 = getRawContentTop();
            if (rawContentTop2 + measuredHeight > this.l0) {
                rawContentTop2 = Math.max(Math.min(rawContentTop2, this.k0), this.l0 - measuredHeight);
            }
            this.E = rawContentTop2;
            this.y = (int) Math.max(hl.L(8.0f), Math.min(qu6.x(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f;
        int i6 = this.y;
        int i7 = this.E;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        int L;
        int min;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        if (this.d == null || (actionBarPopupWindow$ActionBarPopupWindowLayout = this.f) == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() != this) {
            return;
        }
        b();
        View rootView = getRootView();
        WeakHashMap weakHashMap = ihc.a;
        l2d a = bhc.a(this);
        if (rootView == null || a == null) {
            this.k0 = hl.L(8.0f);
            L = (size2 - hl.L(16.0f)) - hl.n;
            this.l0 = L;
        } else {
            i2d i2dVar = a.a;
            int[] iArr = this.m0;
            getLocationInWindow(iArr);
            int i3 = i2dVar.f(1).b;
            int i4 = i2dVar.f(10).d;
            this.k0 = hl.L(8.0f) + Math.max(0, i3 - iArr[1]);
            L = Math.min(size2, (rootView.getHeight() - i4) - iArr[1]) - hl.L(16.0f);
            this.l0 = L;
        }
        if (this.s) {
            L = Math.max(L, getRawContentBottom());
            min = this.k0;
        } else {
            min = Math.min(getRawContentTop(), this.k0);
        }
        int i5 = L - min;
        int menuMaxHeight = this.d.getMenuMaxHeight();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f;
        int f = ik8.f(16.0f, size, TLObject.FLAG_31);
        int L2 = hl.L(48.0f);
        if (menuMaxHeight > 0) {
            i5 = Math.min(menuMaxHeight, i5);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(f, View.MeasureSpec.makeMeasureSpec(Math.max(L2, i5), TLObject.FLAG_31));
    }

    public void setOnClosed(Runnable runnable) {
        this.M = runnable;
    }

    public void setOnShownChanged(pcc pccVar) {
        this.N = pccVar;
    }
}
