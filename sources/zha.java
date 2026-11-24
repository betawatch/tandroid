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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zha extends FrameLayout {
    public int E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public boolean I;
    public boolean J;
    public boolean K;
    public long L;
    public Runnable M;
    public p8c N;
    public boolean O;
    public long P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public boolean U;
    public final on V;
    public final RectF W;
    public float a;
    public final RectF a0;
    public rf8 b;
    public final RectF b0;
    public final g29 c;
    public final RectF c0;
    public h07 d;
    public final RectF d0;
    public r7 e;
    public final float[] e0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final Path f0;
    public final ArrayList g0;
    public il0 h;
    public float h0;
    public float i0;
    public float j0;
    public int k0;
    public int l0;
    public final int[] m0;
    public h07 n;
    public final float[] n0;
    public final RectF o0;
    public final WeakHashMap r;
    public boolean s;
    public boolean w;
    public boolean x;
    public int y;

    public zha(Context context) {
        super(context);
        this.a = 1.0f;
        this.c = new g29((Object) this, (byte) 11);
        this.r = new WeakHashMap();
        this.F = new Paint(1);
        this.G = new Paint(1);
        Paint paint = new Paint();
        this.H = paint;
        this.V = new on(null);
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

    public static void e(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        if (f5 >= 1.0f) {
            canvas.save();
        } else {
            canvas.saveLayerAlpha(f, f2, f3, f4, (int) (f5 * 255.0f));
        }
    }

    public static float f(float f, float f2, float f3) {
        float l = Utilities.l((f3 - f) / (f2 - f));
        return yjb.B(l, 2.0f, 3.0f, l * l);
    }

    public static double g(double d, double d2, double d3) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        double d4 = 6.283185307179586d / d3;
        double d5 = 1.0d - (d2 * d2);
        double sqrt = Math.sqrt(d5) * d4;
        double d6 = sqrt * d;
        return 1.0d - (((Math.sin(d6) * (d2 / Math.sqrt(d5))) + Math.cos(d6)) * Math.exp(((-d2) * d4) * d));
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

    private void setAnimating(boolean z) {
        if (this.U == z) {
            return;
        }
        this.U = z;
        on onVar = this.V;
        if (z) {
            onVar.d();
        } else {
            onVar.e();
        }
    }

    public final void a(boolean z) {
        if (this.I) {
            this.I = false;
            if (z && isAttachedToWindow() && isLaidOut()) {
                h();
                return;
            }
        } else if (!this.U) {
            return;
        }
        c();
    }

    public final void b() {
        h07 h07Var = this.d;
        if (h07Var == null) {
            return;
        }
        r7 r7Var = this.e;
        RectF rectF = this.W;
        this.J = h07Var.c(r7Var, rectF);
        View menuHostView = this.d.getMenuHostView();
        RectF rectF2 = this.o0;
        boolean c = zec.c(menuHostView, this, rectF2);
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
        il0 il0Var = this.h;
        if (il0Var != null) {
            il0Var.a.setEmpty();
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
            yha yhaVar = (yha) arrayList.get(i);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = yhaVar.a;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(yhaVar.b);
            Drawable drawable = yhaVar.c;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(drawable);
            if (drawable != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(yhaVar.d);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(yhaVar.e, yhaVar.f, yhaVar.g, yhaVar.h);
            i++;
        }
        arrayList.clear();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null && actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
            this.f.getSwipeBack().setForegroundOnGlass(false);
        }
        r7 r7Var = this.e;
        h07 h07Var = this.d;
        this.e = null;
        this.d = null;
        if (h07Var != null) {
            h07Var.b(null, null);
        }
        if (r7Var != null) {
            r7Var.getIconView().setAlpha(1.0f);
            o7 o7Var = r7Var.R;
            if (o7Var != null) {
                o7Var.z();
            }
        }
        if (this.O) {
            this.O = false;
            p8c p8cVar = this.N;
            if (p8cVar != null) {
                p8cVar.a(Boolean.FALSE);
            }
        }
        Runnable runnable = this.M;
        if (runnable != null) {
            this.M = null;
            runnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(h07 h07Var, r7 r7Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        ViewParent parent;
        View findFocus;
        if (this.I && this.d == h07Var && this.e == r7Var) {
            return;
        }
        h07 h07Var2 = this.d;
        if (h07Var2 != null && (h07Var2 != h07Var || this.e != r7Var)) {
            c();
        }
        this.d = h07Var;
        this.e = r7Var;
        this.s = h07Var.g();
        this.w = h07Var.a();
        this.x = false;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != actionBarPopupWindow$ActionBarPopupWindowLayout) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                gl.B2(actionBarPopupWindow$ActionBarPopupWindowLayout2);
            }
            this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        j(actionBarPopupWindow$ActionBarPopupWindowLayout, gl.L(5.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(0.0f);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(1.0f);
        zkb.c0(actionBarPopupWindow$ActionBarPopupWindowLayout, false);
        cs5.V(actionBarPopupWindow$ActionBarPopupWindowLayout, bkb.p1(0.06f, bkb.v0(bkb.D8, this.d.getMenuResourcesProvider())));
        actionBarPopupWindow$ActionBarPopupWindowLayout.f();
        rf8 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        if (swipeBack != null) {
            swipeBack.b(false);
            swipeBack.setForegroundOnGlass(true);
            if (this.b != swipeBack) {
                this.b = swipeBack;
                swipeBack.y.add(new ad2(this, (byte) 1));
            }
            for (int i = 1; i < swipeBack.getChildCount(); i++) {
                if (swipeBack.getChildAt(i) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) swipeBack.getChildAt(i);
                    j(actionBarPopupWindow$ActionBarPopupWindowLayout3, 0);
                    zkb.c0(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
                    cs5.V(actionBarPopupWindow$ActionBarPopupWindowLayout3, bkb.p1(0.06f, bkb.v0(bkb.D8, this.d.getMenuResourcesProvider())));
                }
            }
        }
        ScrollView scrollView = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
        if (scrollView != null) {
            scrollView.scrollTo(0, 0);
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() != this) {
            gl.B2(actionBarPopupWindow$ActionBarPopupWindowLayout);
            addView(actionBarPopupWindow$ActionBarPopupWindowLayout, new FrameLayout.LayoutParams(-2, -2));
        }
        il0 il0Var = this.h;
        if (il0Var != null) {
            if (this.n != h07Var) {
                il0Var.a.setEmpty();
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
                p8c p8cVar = this.N;
                if (p8cVar != null) {
                    p8cVar.a(Boolean.TRUE);
                }
            }
            h();
            h07Var.b(this, r7Var);
            b();
            if (!this.J && r7Var != null) {
                r7Var.getIconView().setAlpha(0.0f);
            }
            findFocus = getRootView() == null ? getRootView().findFocus() : null;
            if ((findFocus instanceof EditText) || !findFocus.isShown()) {
                setFocusableInTouchMode(true);
                requestFocus();
            }
            return;
        }
        WeakHashMap weakHashMap = this.r;
        il0 il0Var2 = (il0) weakHashMap.get(h07Var);
        this.h = il0Var2;
        if (il0Var2 == null) {
            il0 h = h07Var.h(this);
            this.h = h;
            if (h != null) {
                h.p(this.c);
                weakHashMap.put(h07Var, this.h);
            }
        }
        this.n = h07Var;
        parent = getParent();
        if (parent instanceof ViewGroup) {
        }
        setVisibility(0);
        this.I = true;
        this.L = SystemClock.uptimeMillis();
        if (!this.O) {
        }
        h();
        h07Var.b(this, r7Var);
        b();
        if (!this.J) {
            r7Var.getIconView().setAlpha(0.0f);
        }
        if (getRootView() == null) {
        }
        if (findFocus instanceof EditText) {
        }
        setFocusableInTouchMode(true);
        requestFocus();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        char c;
        float f;
        char c2;
        RectF rectF;
        float f2;
        float f3;
        float f4;
        char c3;
        if (this.d == null || this.f == null) {
            return;
        }
        if (this.U) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (this.P == 0) {
                this.P = currentAnimationTimeMillis;
            }
            float animatorDurationScale = getAnimatorDurationScale();
            float f5 = animatorDurationScale <= 0.0f ? 10.0f : ((currentAnimationTimeMillis - this.P) / 1000.0f) / animatorDurationScale;
            float f6 = this.Q;
            if (this.I) {
                this.T = 0.0f;
                this.R = f5 > 0.7f ? 1.0f : ((1.0f - f6) * ((float) g(f5, 0.78d, 0.3d))) + f6;
                this.S = f5 > 0.7f ? 1.0f : ((1.0f - f6) * ((float) g(f5 - 0.02d, 0.8d, 0.34d))) + f6;
                if (f5 > 0.7f) {
                    setAnimating(false);
                }
            } else {
                float l = Utilities.l(f5 / 0.2f);
                float l2 = Utilities.l(f5 / 0.17f);
                this.R = (1.0f - ((3.0f - (l2 * 2.0f)) * (l2 * l2))) * f6;
                this.S = (1.0f - ((3.0f - (l * 2.0f)) * (l * l))) * f6;
                float f7 = f5 - 0.2f;
                this.T = (f7 <= 0.0f || !this.J) ? 0.0f : f6 * 0.07f * ((float) Math.exp((-f7) / 0.11f)) * ((float) Math.sin((f7 * 6.283185307179586d) / 0.17000000178813934d));
                if (!this.J ? f7 >= 0.0f : f7 > 0.45f) {
                    this.T = 0.0f;
                    post(new uw0(this, (byte) 2));
                }
            }
            float f8 = this.j0;
            float f9 = f8 == 0.0f ? 0.0f : f5 - f8;
            if (f9 > 0.001f) {
                this.i0 = (this.S - this.h0) / f9;
            } else if (f8 == 0.0f) {
                this.i0 = 0.0f;
            }
            this.h0 = this.S;
            this.j0 = Math.max(f5, 1.0E-4f);
        }
        b();
        float backScaleX = this.f.getBackScaleX() * this.f.getMeasuredWidth();
        float backScaleY = this.f.getBackScaleY() * this.f.getMeasuredHeight();
        rf8 swipeBack = this.f.getSwipeBack();
        RectF rectF2 = this.a0;
        if (swipeBack == null || !(swipeBack.R || this.f.c)) {
            rectF2.set(this.f.getLeft(), this.f.getTop(), this.f.getLeft() + backScaleX, this.f.getTop() + backScaleY);
        } else {
            rectF2.set(this.f.getRight() - backScaleX, this.f.getTop(), this.f.getRight(), this.f.getTop() + backScaleY);
        }
        float f10 = this.R;
        float f11 = this.S;
        float l3 = Utilities.l(Math.max(f10, f11));
        RectF rectF3 = this.W;
        float R1 = gl.R1(rectF3.left, rectF2.left, f10);
        float R12 = gl.R1(rectF3.top, rectF2.top, f11);
        float R13 = gl.R1(rectF3.right, rectF2.right, f10);
        float R14 = gl.R1(rectF3.bottom, rectF2.bottom, f11);
        RectF rectF4 = this.b0;
        rectF4.set(R1, R12, R13, R14);
        if (this.T != 0.0f) {
            float centerX = rectF4.centerX();
            float centerY = rectF4.centerY();
            c = 2;
            float z = yjb.z(this.T, 0.5f, 1.0f, rectF4.width() / 2.0f);
            f = 2.0f;
            float height = (1.0f - this.T) * (rectF4.height() / 2.0f);
            rectF4.set(centerX - z, centerY - height, centerX + z, centerY + height);
        } else {
            c = 2;
            f = 2.0f;
        }
        float min = Math.min(Math.min(rectF4.height(), rectF4.width()) / f, gl.R1(rectF3.height() / f, gl.L(22.0f), Utilities.l(f11)));
        float l4 = this.s ? Utilities.l(this.i0 / 9.0f) * gl.L(5.0f) * 0.75f : 0.0f;
        float f12 = min + l4;
        float[] fArr = this.e0;
        fArr[3] = f12;
        fArr[c] = f12;
        fArr[1] = f12;
        fArr[0] = f12;
        fArr[7] = min;
        fArr[6] = min;
        fArr[5] = min;
        fArr[4] = min;
        float f13 = rectF4.left;
        float f14 = rectF4.top - l4;
        float f15 = rectF4.right;
        float f16 = rectF4.bottom;
        RectF rectF5 = this.d0;
        rectF5.set(f13, f14, f15, f16);
        h07 h07Var = this.d;
        int menuDimAlpha = (h07Var == null || h07Var.getMenuDimAlpha() < 0) ? 26 : this.d.getMenuDimAlpha();
        Paint paint = this.H;
        paint.setAlpha((int) (menuDimAlpha * l3));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int L = gl.L(6.0f);
        float l5 = (this.J && this.d.e()) ? 1.0f : Utilities.l(l3 / 0.25f);
        il0 il0Var = this.h;
        RectF rectF6 = this.c0;
        Path path = this.f0;
        if (il0Var != null) {
            float l6 = this.J ? Utilities.l(l3) : 1.0f;
            this.a = l6;
            this.d.setMenuGlassFrostedProgress(l6);
            this.h.updateColors();
            il0 il0Var2 = this.h;
            float i = i(this.d.getButtonsGlassColorProvider(), true);
            g29 g29Var = this.c;
            c2 = 1;
            float R15 = gl.R1(i, i(g29Var, true), this.a);
            float R16 = gl.R1(i(this.d.getButtonsGlassColorProvider(), false), i(g29Var, false), this.a);
            hl0 hl0Var = il0Var2.S;
            hl0Var.i = R15;
            hl0Var.j = R16;
            il0Var2.Q = null;
            il0 il0Var3 = this.h;
            if (l4 > 0.0f) {
                il0Var3.t(f12, f12, min, min, false);
            } else {
                il0Var3.r(min);
            }
            this.h.setBounds(Math.round(rectF5.left) - L, Math.round(rectF5.top) - L, Math.round(rectF5.right) + L, Math.round(rectF5.bottom) + L);
            rectF6.set(this.f.getLeft(), this.f.getTop(), this.f.getRight(), this.f.getBottom());
            rectF6.union(rectF3);
            float max = (Math.max(rectF6.width(), rectF6.height()) * 0.04f) + gl.L(4.0f);
            rectF = rectF4;
            this.h.a.set((int) Math.floor(rectF6.left - max), (int) Math.floor(rectF6.top - max), (int) Math.ceil(rectF6.right + max), (int) Math.ceil(rectF6.bottom + max));
            this.h.setAlpha((int) (l5 * 255.0f));
            this.h.draw(canvas);
        } else {
            c2 = 1;
            rectF = rectF4;
            int v0 = bkb.v0(bkb.F8, this.d.getMenuResourcesProvider());
            Paint paint2 = this.F;
            paint2.setColor(v0);
            paint2.setAlpha((int) (paint2.getAlpha() * l5));
            path.rewind();
            path.addRoundRect(rectF5, fArr, Path.Direction.CW);
            canvas.drawPath(path, paint2);
        }
        int menuAnchorTint = this.J ? this.d.getMenuAnchorTint() : 0;
        if (menuAnchorTint != 0 && l3 < 1.0f) {
            Paint paint3 = this.G;
            paint3.setColor(menuAnchorTint);
            paint3.setAlpha((int) ((1.0f - l3) * Color.alpha(menuAnchorTint)));
            path.rewind();
            path.addRoundRect(rectF5, fArr, Path.Direction.CW);
            canvas.drawPath(path, paint3);
        }
        canvas.save();
        path.rewind();
        path.addRoundRect(rectF5, fArr, Path.Direction.CW);
        canvas.clipPath(path);
        float l7 = 1.0f - Utilities.l(l3 / (this.I ? 0.3f : 0.7f));
        View menuView = this.J ? this.d.getMenuView() : this.e.getIconView();
        if (l7 <= 0.004f || menuView == null) {
            f2 = 0.25f;
        } else {
            RectF rectF7 = this.o0;
            boolean c4 = zec.c(menuView, this, rectF7);
            float[] fArr2 = this.n0;
            if (c4) {
                c3 = 0;
                fArr2[0] = rectF7.left;
                fArr2[c2] = rectF7.top;
            } else {
                c3 = 0;
                fArr2[c2] = 0.0f;
                fArr2[0] = 0.0f;
            }
            float f17 = fArr2[c3];
            rectF6.set(f17, fArr2[c2], menuView.getWidth() + f17, fArr2[c2] + menuView.getHeight());
            float l8 = 1.0f - (Utilities.l(l3 / 0.3f) * 0.15f);
            f2 = 0.25f;
            e(canvas, rectF6.left, rectF6.top, rectF6.right, rectF6.bottom, l7);
            float f18 = this.T;
            canvas.scale(yjb.z(f18, 0.5f, 1.0f, l8), (1.0f - f18) * l8, rectF6.centerX(), rectF6.centerY());
            canvas.translate(rectF6.left, rectF6.top);
            menuView.draw(canvas);
            canvas.restore();
        }
        boolean z2 = this.s;
        boolean z3 = this.I;
        if (!z2) {
            f3 = z3 ? f(f2, 0.75f, l3) : f(0.5f, 0.95f, l3);
        } else {
            if (!z3) {
                f4 = f(0.6f, 1.0f, l3);
                if (f4 > 0.004f) {
                    if (this.s) {
                        float centerX2 = rectF.centerX() - rectF2.centerX();
                        float f19 = rectF.top - rectF2.top;
                        if (Math.abs(this.i0) < 0.6f) {
                            centerX2 = Math.round(centerX2);
                            f19 = Math.round(f19);
                        }
                        e(canvas, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom, f4);
                        canvas.translate(centerX2, f19);
                        super.dispatchDraw(canvas);
                        canvas.restore();
                    } else {
                        RectF rectF8 = rectF;
                        float max2 = Math.max(0.3f, rectF8.width() / Math.max(1.0f, rectF2.width()));
                        e(canvas, rectF8.left, rectF8.top, rectF8.right, rectF8.bottom, f4);
                        if (this.w) {
                            canvas.translate(rectF8.centerX() - rectF2.centerX(), rectF8.top - rectF2.top);
                            canvas.scale(max2, max2, rectF2.centerX(), rectF2.top);
                        } else {
                            canvas.translate(rectF8.right - rectF2.right, rectF8.top - rectF2.top);
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
            f3 = f(0.15f, 0.6f, l3);
        }
        f4 = f3;
        if (f4 > 0.004f) {
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

    public r7 getItem() {
        return this.e;
    }

    public final void h() {
        this.Q = Math.max(this.R, this.S);
        this.h0 = this.S;
        this.j0 = 0.0f;
        this.P = 0L;
        setAnimating(true);
        invalidate();
    }

    public final float i(al0 al0Var, boolean z) {
        if (al0Var == this.c) {
            h07 h07Var = this.d;
            al0Var = h07Var != null ? h07Var.getMenuGlassColorProvider() : null;
        }
        if (!(al0Var instanceof nl0)) {
            return gl.N(z ? 1.0f : 0.6666667f);
        }
        nl0 nl0Var = (nl0) al0Var;
        return z ? nl0Var.f : nl0Var.h;
    }

    public final void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.g0;
            if (i2 >= arrayList.size()) {
                arrayList.add(new yha(actionBarPopupWindow$ActionBarPopupWindowLayout));
                break;
            } else if (((yha) arrayList.get(i2)).a == actionBarPopupWindow$ActionBarPopupWindowLayout) {
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
            int max = (int) Math.max(gl.L(8.0f), Math.min(ls6.x(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
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
            int max2 = Math.max(gl.L(8.0f), i5 - measuredWidth);
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
            this.y = (int) Math.max(gl.L(8.0f), Math.min(ls6.x(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
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
        WeakHashMap weakHashMap = jdc.a;
        vxc a = cdc.a(this);
        if (rootView == null || a == null) {
            this.k0 = gl.L(8.0f);
            L = (size2 - gl.L(16.0f)) - gl.n;
            this.l0 = L;
        } else {
            sxc sxcVar = a.a;
            int[] iArr = this.m0;
            getLocationInWindow(iArr);
            int i3 = sxcVar.f(1).b;
            int i4 = sxcVar.f(10).d;
            this.k0 = gl.L(8.0f) + Math.max(0, i3 - iArr[1]);
            L = Math.min(size2, (rootView.getHeight() - i4) - iArr[1]) - gl.L(16.0f);
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
        int f = ug8.f(16.0f, size, TLObject.FLAG_31);
        int L2 = gl.L(48.0f);
        if (menuMaxHeight > 0) {
            i5 = Math.min(menuMaxHeight, i5);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(f, View.MeasureSpec.makeMeasureSpec(Math.max(L2, i5), TLObject.FLAG_31));
    }

    public void setOnClosed(Runnable runnable) {
        this.M = runnable;
    }

    public void setOnShownChanged(p8c p8cVar) {
        this.N = p8cVar;
    }
}
