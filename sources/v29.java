// default package

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class v29 extends FrameLayout implements jm7, vlb {
    public static final ny1 m1 = new ny1(Float.class, "transitionProgress", (byte) 3);
    public final t29 A0;
    public boolean B0;
    public float C0;
    public final HashSet D0;
    public float E;
    public final HashSet E0;
    public final float F;
    public boolean F0;
    public final float G;
    public boolean G0;
    public int H;
    public boolean H0;
    public k47 I;
    public final Paint I0;
    public boolean J;
    public final Paint J0;
    public int K;
    public me2 K0;
    public long L;
    public boolean L0;
    public boolean M;
    public final po M0;
    public boolean N;
    public final byte N0;
    public boolean O;
    public boolean O0;
    public float P;
    public boolean P0;
    public long Q;
    public Runnable Q0;
    public ValueAnimator R;
    public boolean R0;
    public FrameLayout S;
    public l66 S0;
    public su T;
    public int T0;
    public final ArrayList U;
    public int U0;
    public final ArrayList V;
    public float V0;
    public final ArrayList W;
    public float W0;
    public im0 X0;
    public im0 Y0;
    public im0 Z0;
    public boolean a;
    public final jg2 a0;
    public km0 a1;
    public final fv b;
    public final o93 b0;
    public nm0 b1;
    public final float c;
    public final RectF c0;
    public int c1;
    public final ArrayList d;
    public boolean d0;
    public boolean d1;
    public final ArrayList e;
    public final HashSet e0;
    public boolean e1;
    public final Paint f;
    public final HashSet f0;
    public me2 f1;
    public final int[] g0;
    public boolean g1;
    public final Paint h;
    public u29 h0;
    public boolean h1;
    public final Rect i0;
    public boolean i1;
    public final Drawable j0;
    public Paint j1;
    public final boolean k0;
    public Matrix k1;
    public final ylb l0;
    public LinearGradient l1;
    public k39 m0;
    public final Paint n;
    public int n0;
    public float o0;
    public float p0;
    public float q0;
    public float r;
    public float r0;
    public float s;
    public boolean s0;
    public long t0;
    public d u0;
    public pj8 v0;
    public float w;
    public b63 w0;
    public final RectF x;
    public float x0;
    public final Path y;
    public x53 y0;
    public ValueAnimator z0;

    /* JADX WARN: Multi-variable type inference failed */
    public v29(int i, int i2, ylb ylbVar, Context context, d dVar) {
        super(context);
        byte b = 0;
        this.a = false;
        this.d = new ArrayList();
        this.e = new ArrayList();
        byte b2 = 1;
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new Paint(1);
        this.n = new Paint(1);
        this.w = 1.0f;
        this.x = new RectF();
        this.y = new Path();
        this.E = gm.L(72.0f);
        float L = gm.L(8.0f);
        this.F = L;
        this.G = L / 2.0f;
        this.H = gm.L(36.0f);
        this.U = new ArrayList(20);
        this.V = new ArrayList(10);
        this.W = new ArrayList(20);
        this.c0 = new RectF();
        this.d0 = false;
        this.e0 = new HashSet();
        this.f0 = new HashSet();
        byte b3 = 2;
        this.g0 = new int[2];
        Rect rect = new Rect();
        this.i0 = rect;
        this.D0 = new HashSet();
        this.E0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.I0 = paint2;
        Paint paint3 = new Paint(1);
        this.J0 = paint3;
        this.M0 = new po(null);
        this.P0 = true;
        this.h1 = false;
        this.N0 = i;
        this.c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(cmb.v0(cmb.h6, ylbVar));
        paint3.setColor(cmb.v0(cmb.zk, ylbVar));
        this.l0 = ylbVar;
        this.K = i2;
        this.u0 = dVar;
        t29 t29Var = new t29(this, context);
        this.A0 = t29Var;
        t29Var.setVisibility(8);
        t29Var.P = false;
        t29Var.c.setVisibility(8);
        addView(t29Var);
        this.k0 = gda.c() && gda.o() != 0;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.j0 = mutate;
        int L2 = gm.L(7.0f);
        rect.bottom = L2;
        rect.right = L2;
        rect.top = L2;
        rect.left = L2;
        anb.x(this, mutate, cmb.Je, null, PorterDuff.Mode.MULTIPLY);
        fv fvVar = new fv((byte) 28, context, (Object) this);
        this.b = fvVar;
        fvVar.setClipChildren(false);
        fvVar.setClipToPadding(false);
        jg2 jg2Var = new jg2((ViewGroup) this, (byte) 4);
        this.a0 = jg2Var;
        fvVar.i(new i29(this, b));
        fvVar.setLayoutManager(jg2Var);
        fvVar.setOverScrollMode(2);
        o93 o93Var = new o93(this, b3);
        this.b0 = o93Var;
        fvVar.setAdapter(o93Var);
        fvVar.j(new o29(this));
        fvVar.j(new so7(this, (byte) 9));
        fvVar.i(new i29(this, b2));
        fvVar.setOnItemClickListener(new s19(this, b2));
        fvVar.setOnItemLongClickListener(new ta3(this, i));
        addView(fvVar, qoe.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        h();
        int paddingTop = (fvVar.getLayoutParams().height - fvVar.getPaddingTop()) - fvVar.getPaddingBottom();
        t29Var.getLayoutParams().width = paddingTop - gm.L(12.0f);
        t29Var.getLayoutParams().height = paddingTop;
        if (i == 2 || i == 4) {
            paint.setColor(on2.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(cmb.v0(cmb.F8, ylbVar));
        }
        hs6.d0(i2).l1();
    }

    public static HashSet f(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        boolean z = true;
        int i = 0;
        while (i < arrayList.size()) {
            k47 k47Var = (k47) arrayList.get(i);
            hashSet.clear();
            if (k47Var != null && (tL_messageReactions = k47Var.k.reactions) != null && tL_messageReactions.results != null) {
                for (int i2 = 0; i2 < k47Var.k.reactions.results.size(); i2++) {
                    if (k47Var.k.reactions.results.get(i2).chosen) {
                        k39 d = k39.d(k47Var.k.reactions.results.get(i2).reaction);
                        if (z || longSparseArray.indexOfKey(d.h) >= 0) {
                            hashSet.add(Long.valueOf(d.h));
                            longSparseArray.put(d.h, d);
                        }
                    }
                }
            }
            int i3 = 0;
            while (i3 < longSparseArray.size()) {
                if (!hashSet.contains(Long.valueOf(longSparseArray.keyAt(i3)))) {
                    longSparseArray.removeAt(i3);
                    i3--;
                }
                i3++;
            }
            i++;
            z = false;
        }
        HashSet hashSet2 = new HashSet();
        for (int i4 = 0; i4 < longSparseArray.size(); i4++) {
            if (longSparseArray.valueAt(i4) != null) {
                hashSet2.add((k39) longSparseArray.valueAt(i4));
            }
        }
        return hashSet2;
    }

    public final void a(boolean z) {
        x53 x53Var = this.y0;
        if (x53Var != null) {
            if (!x53Var.q || !z) {
                x53Var.q = true;
                if (z) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    byte b = 0;
                    ofFloat.addUpdateListener(new s53(x53Var, b));
                    ofFloat.addListener(new v53(x53Var, b));
                    ofFloat.setDuration(150L);
                    ofFloat.start();
                } else {
                    x53Var.f();
                }
            }
            this.y0 = null;
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F8));
        hashSet.add(Integer.valueOf(cmb.E8));
        hashSet.add(Integer.valueOf(cmb.g5));
    }

    public final void b() {
        x53 x53Var = this.y0;
        if (x53Var != null) {
            x53Var.d();
        }
    }

    public final void c(float f, float f2, float f3, int i, Canvas canvas) {
        d53 d53Var;
        RectF rectF;
        Canvas canvas2;
        float f4;
        if (this.N0 == 1) {
            return;
        }
        canvas.save();
        boolean z = this.M;
        RectF rectF2 = this.x;
        if (z) {
            float measuredWidth = getMeasuredWidth();
            float f5 = rectF2.top;
            float measuredHeight = getMeasuredHeight();
            d53Var = d53.f;
            canvas.clipRect(0.0f, 0.0f, measuredWidth, (gm.R1(f5, measuredHeight, d53Var.getInterpolation(this.P)) - ((int) Math.ceil((1.0f - this.w) * (rectF2.height() / 2.0f)))) + 1.0f);
        } else {
            float f6 = rectF2.bottom;
            d53Var = d53.f;
            canvas.clipRect(0.0f, (gm.R1(f6, 0.0f, d53Var.getInterpolation(this.P)) - ((int) Math.ceil((1.0f - this.w) * (rectF2.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), gm.R1(gm.L(8.0f) + getMeasuredHeight(), getPaddingTop() - d(), d53Var.getInterpolation(this.P)));
        }
        float width = ((jb6.a0 || this.N) ? this.H : getWidth() - this.H) + this.V0;
        float paddingTop = this.M ? getPaddingTop() - d() : (getHeight() - getPaddingBottom()) + d();
        int L = gm.L(3.0f);
        Drawable drawable = this.j0;
        drawable.setAlpha(i);
        Paint paint = this.f;
        paint.setAlpha(i);
        float f7 = width - f;
        float f8 = L;
        float f9 = f8 * f2;
        int i2 = (int) (f7 - f9);
        float f10 = paddingTop - f;
        int i3 = (int) (f10 - f9);
        float f11 = width + f;
        int i4 = (int) (f11 + f9);
        float f12 = paddingTop + f;
        drawable.setBounds(i2, i3, i4, (int) (f12 + f9));
        drawable.draw(canvas);
        boolean s = this.h0.s();
        float f13 = paddingTop;
        RectF rectF3 = this.c0;
        if (s) {
            rectF3.set(f7, f10, f11, f12);
            this.h0.m(canvas, rectF3, f, getX(), getY(), i, false);
            rectF = rectF3;
            f4 = f;
            canvas2 = canvas;
        } else {
            rectF = rectF3;
            canvas2 = canvas;
            f4 = f;
            if (this.Y0 != null) {
                RectF rectF4 = gm.P;
                rectF4.set(f7, f10, f11, f12);
                Rect rect = gm.Q;
                rectF4.round(rect);
                rect.inset(-gm.L(8.0f), -gm.L(8.0f));
                this.Y0.setBounds(rect);
                this.Y0.setAlpha(paint.getAlpha());
                this.Y0.draw(canvas2);
            } else {
                canvas2.drawCircle(width, f13, f4, paint);
            }
        }
        boolean z2 = jb6.a0;
        float f14 = this.F;
        float width2 = this.V0 + this.W0 + ((z2 || this.N) ? this.H - f14 : (getWidth() - this.H) + f14);
        boolean z3 = this.M;
        float f15 = this.G;
        float R1 = gm.R1(z3 ? (getPaddingTop() - d()) - gm.L(16.0f) : ((getHeight() - f15) - f8) + d(), (f15 + f8) - d(), d53Var.getInterpolation(this.P));
        float f16 = (-gm.L(1.0f)) * f2;
        drawable.setBounds((int) ((width2 - f4) - f16), (int) ((R1 - f4) - f16), (int) (width2 + f4 + f16), (int) (f4 + R1 + f16));
        drawable.draw(canvas2);
        if (this.h0.s()) {
            rectF.set(width2 - f3, R1 - f3, width2 + f3, R1 + f3);
            Canvas canvas3 = canvas2;
            this.h0.m(canvas3, rectF, f3, getX(), getY(), i, false);
            canvas2 = canvas3;
        } else if (this.Z0 != null) {
            RectF rectF5 = gm.P;
            rectF5.set(width2 - f3, R1 - f3, width2 + f3, R1 + f3);
            Rect rect2 = gm.Q;
            rectF5.round(rect2);
            rect2.inset(-gm.L(8.0f), -gm.L(8.0f));
            this.Z0.setBounds(rect2);
            this.Z0.setAlpha(paint.getAlpha());
            this.Z0.draw(canvas2);
        } else {
            canvas2.drawCircle(width2, R1, f3, paint);
        }
        canvas2.restore();
        drawable.setAlpha(nm7.d4);
        paint.setAlpha(nm7.d4);
    }

    public final float d() {
        return (int) (getPullingLeftProgress() * gm.L(6.0f));
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id != this.L || getVisibility() == 0 || (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                return;
            }
            m(this.I, null, true);
            setVisibility(0);
            p(false);
            return;
        }
        if (i != nm7.m4) {
            if (i == nm7.w3) {
                m(this.I, null, true);
            }
        } else if (this.N0 == 4) {
            invalidate();
            fv fvVar = this.b;
            fvVar.invalidate();
            fvVar.h1();
            for (int i3 = 0; i3 < fvVar.getChildCount(); i3++) {
                View childAt = fvVar.getChildAt(i3);
                if (childAt instanceof t29) {
                    t29 t29Var = (t29) childAt;
                    t29Var.a.invalidate();
                    t29Var.b.invalidate();
                } else {
                    childAt.invalidate();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x08ea  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float width;
        float f;
        float max;
        float f2;
        float f3;
        byte b;
        float f4;
        RectF rectF;
        int i;
        float f5;
        int i2;
        RectF rectF2;
        fv fvVar;
        int i3;
        float f6;
        boolean n;
        RectF rectF3;
        int i4;
        RectF rectF4;
        int i5;
        fv fvVar2;
        float f7;
        int R;
        float f8;
        float f9;
        float x;
        float scaleX;
        float f10;
        float f11;
        vm vmVar;
        mm mmVar;
        int i6;
        u29 u29Var;
        Canvas canvas2 = canvas;
        long min = Math.min(16L, System.currentTimeMillis() - this.Q);
        this.Q = System.currentTimeMillis();
        boolean z = this.O;
        float f12 = this.P;
        if (z) {
            if (f12 != 1.0f) {
                this.P = kt6.A(min, 220.0f, f12, 1.0f);
                invalidate();
            }
        } else if (f12 != 0.0f) {
            this.P = aq1.x(min, 220.0f, f12, 0.0f);
            invalidate();
        }
        l66 l66Var = this.S0;
        if (l66Var != null) {
            l66Var.setTranslationY(-d());
        }
        float max2 = (Math.max(0.25f, Math.min(this.w, 1.0f)) - 0.25f) / 0.75f;
        float f13 = this.F * max2;
        float f14 = this.G * max2;
        HashSet hashSet = this.E0;
        hashSet.clear();
        HashSet hashSet2 = this.D0;
        hashSet.addAll(hashSet2);
        hashSet2.clear();
        if (this.d1) {
            invalidate();
        }
        k39 k39Var = this.m0;
        byte b2 = this.N0;
        if (k39Var != null && b2 != 5 && ((u29Var = this.h0) == null || u29Var.h())) {
            float f15 = this.o0;
            if (f15 != 1.0f) {
                float longPressTimeout = (16.0f / (this.m0.a ? ViewConfiguration.getLongPressTimeout() : 1500.0f)) + f15;
                this.o0 = longPressTimeout;
                if (longPressTimeout >= 1.0f) {
                    this.o0 = 1.0f;
                }
                invalidate();
            }
        }
        k39 k39Var2 = this.m0;
        if (k39Var2 == null || !k39Var2.a) {
            float f16 = this.o0;
            this.q0 = (f16 * 2.0f) + 1.0f;
            this.r0 = 1.0f - (f16 * 0.15f);
        } else {
            this.q0 = 1.0f;
            this.r0 = 1.0f;
        }
        int save = canvas2.save();
        if (jb6.a0 || this.N) {
            width = getWidth();
            f = 0.125f;
        } else {
            width = getWidth();
            f = 0.875f;
        }
        float f17 = width * f;
        float f18 = this.w;
        if (f18 != 1.0f) {
            canvas2.scale(f18, f18, f17, getHeight() / 2.0f);
        }
        if (jb6.a0 || this.N) {
            max = Math.max(0.25f, this.w);
            f2 = 0.0f;
        } else {
            f2 = 1.0f - Math.max(0.25f, this.w);
            max = 1.0f;
        }
        float pullingLeftProgress = getPullingLeftProgress();
        float d = d();
        me2 me2Var = this.f1;
        if (me2Var != null) {
            me2Var.setExpandSize(d);
        }
        float width2 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f2);
        float topOffset = getTopOffset();
        float paddingTop = getPaddingTop();
        fv fvVar3 = this.b;
        float f19 = f2;
        float f20 = max;
        RectF rectF5 = this.x;
        rectF5.set(getPaddingLeft() + width2, (((1.0f - this.r0) * fvVar3.getMeasuredHeight()) + paddingTop) - d, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + d);
        this.E = b10.b(d, 2.0f, rectF5.height() - topOffset, 2.0f);
        if (b2 != 1) {
            f3 = 255.0f;
            int i7 = (int) (Utilities.i(1.0f - (this.x0 / 0.05f), 1.0f, 0.0f) * 255.0f);
            Drawable drawable = this.j0;
            drawable.setAlpha(i7);
            float paddingLeft = getPaddingLeft();
            int width3 = getWidth() - getPaddingRight();
            Rect rect = this.i0;
            int i8 = (int) d;
            drawable.setBounds((int) ((((width3 + rect.right) * f19) + paddingLeft) - rect.left), (getPaddingTop() - rect.top) - i8, (int) (((getWidth() - getPaddingRight()) + rect.right) * f20), (getHeight() - getPaddingBottom()) + rect.bottom + i8);
            if (this.X0 == null) {
                drawable.draw(canvas2);
            }
        } else {
            f3 = 255.0f;
        }
        canvas2.restoreToCount(save);
        if (this.e1) {
            b = b2;
            f4 = f17;
            rectF = rectF5;
            i = 1;
            f5 = 2.0f;
        } else {
            int save2 = canvas2.save();
            float f21 = this.w;
            if (f21 != 1.0f) {
                f5 = 2.0f;
                canvas2.scale(f21, f21, f17, getHeight() / 2.0f);
            } else {
                f5 = 2.0f;
            }
            if (b2 == 1 || this.h0.s()) {
                i6 = save2;
                b = b2;
                rectF = rectF5;
                f4 = f17;
                i = 1;
                this.h0.m(canvas, rectF, this.E, getX(), getY(), nm7.d4, false);
                canvas2 = canvas;
            } else {
                im0 im0Var = this.X0;
                Paint paint = this.f;
                if (im0Var != null) {
                    Rect rect2 = gm.Q;
                    rectF5.round(rect2);
                    rect2.inset(-gm.L(8.0f), -gm.L(8.0f));
                    this.X0.setBounds(rect2);
                    this.X0.setAlpha(paint.getAlpha());
                    this.X0.draw(canvas2);
                } else {
                    float f22 = this.E;
                    canvas2.drawRoundRect(rectF5, f22, f22, paint);
                }
                i6 = save2;
                b = b2;
                f4 = f17;
                rectF = rectF5;
                i = 1;
            }
            if (this.d0) {
                Iterator it = this.e0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        float f23 = this.E;
                        float l = Utilities.l(1.0f - getPullingLeftProgress());
                        if (this.j1 == null) {
                            this.j1 = new Paint(i);
                        }
                        if (this.k1 == null) {
                            this.k1 = new Matrix();
                        }
                        if (this.l1 == null) {
                            int v0 = cmb.v0(cmb.zk, this.l0);
                            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, gm.L(64.0f), 0.0f, new int[]{v0, cmb.p1(0.0f, v0)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            this.l1 = linearGradient;
                            this.j1.setShader(linearGradient);
                        }
                        this.k1.reset();
                        this.k1.postTranslate(rectF.left, rectF.top);
                        this.l1.setLocalMatrix(this.k1);
                        this.j1.setAlpha((int) (l * f3));
                        canvas2.drawRoundRect(rectF, f23, f23, this.j1);
                    } else if (((k39) it.next()).a) {
                        break;
                    }
                }
            }
            canvas2.restoreToCount(i6);
        }
        Path path = this.y;
        path.rewind();
        float f24 = this.E;
        path.addRoundRect(rectF, f24, f24, Path.Direction.CW);
        int save3 = canvas2.save();
        float f25 = this.w;
        if (f25 != 1.0f) {
            canvas2.scale(f25, f25, f4, getHeight() / f5);
        }
        if (this.w != 0.0f) {
            byte b3 = b;
            if (getAlpha() == 1.0f || b3 == 5) {
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (i9 < fvVar3.getChildCount()) {
                    View childAt = fvVar3.getChildAt(i9);
                    boolean z2 = i;
                    int abs = (this.w == 1.0f || !gda.j()) ? i11 : (int) (Math.abs((((childAt.getMeasuredWidth() / f5) + childAt.getLeft()) / fvVar3.getMeasuredWidth()) - 0.8f) * 200.0f);
                    float f26 = f14;
                    if (childAt instanceof t29) {
                        t29 t29Var = (t29) fvVar3.getChildAt(i9);
                        i5 = i9;
                        if (this.C0 != 0.0f) {
                            i4 = save3;
                            f9 = gm.L(46.0f) * Utilities.i(t29Var.getLeft() / (getMeasuredWidth() - gm.L(34.0f)), 1.0f, 0.0f) * getPullingLeftProgress();
                        } else {
                            i4 = save3;
                            f9 = 0.0f;
                        }
                        k39 k39Var3 = t29Var.e;
                        s29 s29Var = t29Var.a;
                        float f27 = f9;
                        s29 s29Var2 = t29Var.b;
                        s29 s29Var3 = t29Var.c;
                        rectF4 = rectF;
                        if (k39Var3.equals(this.m0)) {
                            s29 s29Var4 = s29Var2.getVisibility() == 0 ? s29Var2 : s29Var;
                            t29Var.setPivotX(t29Var.getMeasuredWidth() >> 1);
                            t29Var.setPivotY(s29Var4.getY() + s29Var4.getMeasuredHeight());
                            t29Var.setScaleX(this.q0);
                            t29Var.setScaleY(this.q0);
                            if (!this.s0) {
                                if (this.R == null) {
                                    s29Var3.setVisibility(0);
                                    s29Var3.setAlpha(1.0f);
                                    if (s29Var3.getImageReceiver().B() || ((vmVar = s29Var3.e) != null && (mmVar = vmVar.k) != null && mmVar.B())) {
                                        s29Var4.setAlpha(0.0f);
                                    }
                                    f11 = 1.0f;
                                } else {
                                    f11 = 1.0f;
                                    s29Var3.setAlpha(1.0f - this.p0);
                                    s29Var4.setAlpha(this.p0);
                                }
                                if (this.o0 == f11) {
                                    this.s0 = z2;
                                    if (System.currentTimeMillis() - this.t0 > 300) {
                                        this.t0 = System.currentTimeMillis();
                                        fvVar2 = fvVar3;
                                        this.h0.g(t29Var, t29Var.e, true, false);
                                        canvas2.save();
                                        x = t29Var.getX() + fvVar2.getX();
                                        scaleX = ((t29Var.getScaleX() * t29Var.getMeasuredWidth()) - t29Var.getMeasuredWidth()) / f5;
                                        f10 = x - scaleX;
                                        if (f10 >= 0.0f && t29Var.getTranslationX() >= 0.0f) {
                                            t29Var.setTranslationX((-f10) - f27);
                                        } else if (t29Var.getMeasuredWidth() + x + scaleX > getMeasuredWidth() || t29Var.getTranslationX() > 0.0f) {
                                            t29Var.setTranslationX(0.0f - f27);
                                        } else {
                                            t29Var.setTranslationX((((getMeasuredWidth() - x) - t29Var.getMeasuredWidth()) - scaleX) - f27);
                                        }
                                        canvas2.translate(t29Var.getX() + fvVar2.getX(), t29Var.getY() + fvVar2.getY());
                                        canvas2.scale(t29Var.getScaleX(), t29Var.getScaleY(), t29Var.getPivotX(), t29Var.getPivotY());
                                        t29Var.draw(canvas2);
                                        canvas2.restore();
                                    }
                                }
                            }
                            fvVar2 = fvVar3;
                            canvas2.save();
                            x = t29Var.getX() + fvVar2.getX();
                            scaleX = ((t29Var.getScaleX() * t29Var.getMeasuredWidth()) - t29Var.getMeasuredWidth()) / f5;
                            f10 = x - scaleX;
                            if (f10 >= 0.0f) {
                            }
                            if (t29Var.getMeasuredWidth() + x + scaleX > getMeasuredWidth()) {
                            }
                            t29Var.setTranslationX(0.0f - f27);
                            canvas2.translate(t29Var.getX() + fvVar2.getX(), t29Var.getY() + fvVar2.getY());
                            canvas2.scale(t29Var.getScaleX(), t29Var.getScaleY(), t29Var.getPivotX(), t29Var.getPivotY());
                            t29Var.draw(canvas2);
                            canvas2.restore();
                        } else {
                            fvVar2 = fvVar3;
                            int R2 = RecyclerView.R(t29Var);
                            float measuredWidth = (((this.q0 - 1.0f) * t29Var.getMeasuredWidth()) / 3.0f) - (((1.0f - this.r0) * t29Var.getMeasuredWidth()) * (Math.abs(this.n0 - R2) - 1));
                            if (R2 < this.n0) {
                                t29Var.setPivotX(0.0f);
                                t29Var.setTranslationX(-measuredWidth);
                            } else {
                                t29Var.setPivotX(t29Var.getMeasuredWidth() - f27);
                                t29Var.setTranslationX(measuredWidth - f27);
                            }
                            t29Var.setPivotY(s29Var.getY() + s29Var.getMeasuredHeight());
                            t29Var.setScaleX(this.r0);
                            t29Var.setScaleY(this.r0);
                            s29Var3.setVisibility(4);
                            s29Var.setAlpha(1.0f);
                        }
                        if (childAt.getLeft() > i10) {
                            i10 = childAt.getLeft();
                        }
                        if (!this.O0 && (!t29Var.r || s29Var.getImageReceiver().y() != null)) {
                            if ((t29Var.getMeasuredWidth() / f5) + t29Var.getX() > 0.0f && (t29Var.getMeasuredWidth() / f5) + t29Var.getX() < fvVar2.getWidth()) {
                                if (!hashSet.contains(t29Var)) {
                                    t29Var.b(abs);
                                    abs += 30;
                                }
                                hashSet2.add(t29Var);
                            } else if (!t29Var.n) {
                                t29Var.c();
                            }
                        }
                    } else {
                        i4 = save3;
                        rectF4 = rectF;
                        i5 = i9;
                        fvVar2 = fvVar3;
                        if (childAt == this.S) {
                            if ((childAt.getMeasuredWidth() / f5) + childAt.getX() <= 0.0f || (childAt.getMeasuredWidth() / f5) + childAt.getX() >= fvVar2.getWidth()) {
                                pj8 pj8Var = this.v0;
                                f7 = 0.0f;
                                pj8Var.setScaleX(0.0f);
                                pj8Var.setScaleY(0.0f);
                                if (childAt == this.T) {
                                    if ((childAt.getMeasuredWidth() / f5) + childAt.getX() <= f7 || (childAt.getMeasuredWidth() / f5) + childAt.getX() >= fvVar2.getWidth()) {
                                        b63 b63Var = this.w0;
                                        b63Var.setScaleX(0.0f);
                                        b63Var.setScaleY(0.0f);
                                        ((v29) b63Var.c).T.invalidate();
                                        ValueAnimator valueAnimator = (ValueAnimator) b63Var.b;
                                        if (valueAnimator != null) {
                                            valueAnimator.cancel();
                                        }
                                    } else {
                                        if (!hashSet.contains(childAt)) {
                                            if (this.w != 1.0f) {
                                                b63 b63Var2 = this.w0;
                                                b63Var2.setScaleX(0.0f);
                                                b63Var2.setScaleY(0.0f);
                                                ((v29) b63Var2.c).T.invalidate();
                                                ValueAnimator valueAnimator2 = (ValueAnimator) b63Var2.b;
                                                if (valueAnimator2 != null) {
                                                    valueAnimator2.cancel();
                                                }
                                            }
                                            b63 b63Var3 = this.w0;
                                            boolean z3 = e86.e(8200) || gda.o() >= 1;
                                            b63Var3.invalidate();
                                            ValueAnimator valueAnimator3 = (ValueAnimator) b63Var3.b;
                                            if (valueAnimator3 != null) {
                                                valueAnimator3.removeAllListeners();
                                                ((ValueAnimator) b63Var3.b).cancel();
                                            }
                                            if (z3) {
                                                ValueAnimator ofFloat = ValueAnimator.ofFloat(b63Var3.getScaleX(), 1.0f);
                                                b63Var3.b = ofFloat;
                                                ofFloat.setInterpolator(gm.H);
                                                ((ValueAnimator) b63Var3.b).addUpdateListener(new fx7(b63Var3, (byte) 28));
                                                ((ValueAnimator) b63Var3.b).setStartDelay((long) (abs * ((v29) b63Var3.c).c));
                                                ((ValueAnimator) b63Var3.b).setDuration(300L);
                                                ((ValueAnimator) b63Var3.b).start();
                                            } else {
                                                b63Var3.setScaleX(1.0f);
                                                b63Var3.setScaleY(1.0f);
                                            }
                                            abs += 30;
                                        }
                                        hashSet2.add(childAt);
                                    }
                                }
                                R = RecyclerView.R(childAt);
                                float measuredWidth2 = (((this.q0 - 1.0f) * childAt.getMeasuredWidth()) / 3.0f) - (((1.0f - this.r0) * childAt.getMeasuredWidth()) * (Math.abs(this.n0 - R) - 1));
                                if (R >= this.n0) {
                                    childAt.setPivotX(0.0f);
                                    childAt.setTranslationX(-measuredWidth2);
                                } else {
                                    childAt.setPivotX(childAt.getMeasuredWidth());
                                    childAt.setTranslationX(measuredWidth2);
                                }
                                childAt.setScaleX(this.r0);
                                childAt.setScaleY(this.r0);
                            } else {
                                if (!hashSet.contains(childAt)) {
                                    if (this.w != 1.0f) {
                                        pj8 pj8Var2 = this.v0;
                                        f8 = 0.0f;
                                        pj8Var2.setScaleX(0.0f);
                                        pj8Var2.setScaleY(0.0f);
                                    } else {
                                        f8 = 0.0f;
                                    }
                                    pj8 pj8Var3 = this.v0;
                                    ef1 ef1Var = pj8Var3.K;
                                    if (ef1Var != null) {
                                        ef1Var.g = f8;
                                        ef1Var.j = false;
                                    }
                                    pj8Var3.invalidate();
                                    pj8Var3.animate().scaleX(1.1f).scaleY(1.1f).setStartDelay(abs).setInterpolator(gm.H).setDuration(300L);
                                    abs += 30;
                                }
                                hashSet2.add(childAt);
                            }
                        }
                        f7 = 0.0f;
                        if (childAt == this.T) {
                        }
                        R = RecyclerView.R(childAt);
                        float measuredWidth22 = (((this.q0 - 1.0f) * childAt.getMeasuredWidth()) / 3.0f) - (((1.0f - this.r0) * childAt.getMeasuredWidth()) * (Math.abs(this.n0 - R) - 1));
                        if (R >= this.n0) {
                        }
                        childAt.setScaleX(this.r0);
                        childAt.setScaleY(this.r0);
                    }
                    i11 = abs;
                    i9 = i5 + 1;
                    canvas2 = canvas;
                    f14 = f26;
                    save3 = i4;
                    fvVar3 = fvVar2;
                    rectF = rectF4;
                    i = 1;
                }
                i2 = save3;
                rectF2 = rectF;
                fvVar = fvVar3;
                f6 = f14;
                t29 t29Var2 = this.A0;
                if (pullingLeftProgress > 0.0f) {
                    float pullingLeftProgress2 = getPullingLeftProgress();
                    int measuredWidth3 = t29Var2.getMeasuredWidth() - gm.L(f5);
                    float f28 = i10 + measuredWidth3;
                    float i12 = Utilities.i(f28 / (getMeasuredWidth() - t29Var2.getMeasuredWidth()), 1.0f, 0.0f) * pullingLeftProgress2 * measuredWidth3;
                    if (t29Var2.getTag() == null) {
                        t29Var2.setTag(Float.valueOf(1.0f));
                        t29Var2.c();
                        t29Var2.b(0);
                    }
                    float i13 = Utilities.i(pullingLeftProgress2, 1.0f, 0.0f);
                    t29Var2.setScaleX(i13);
                    t29Var2.setScaleY(i13);
                    i3 = 1;
                    t29Var2.setTranslationX(((fvVar.getX() + f28) - i12) + (-((b3 == 1 || b3 == 2) ? gm.L(8.0f) : gm.L(20.0f))));
                    if (t29Var2.getVisibility() != 0) {
                        t29Var2.setVisibility(0);
                    }
                } else {
                    i3 = 1;
                    if (t29Var2.getVisibility() != 8 && this.P0) {
                        t29Var2.setVisibility(8);
                    }
                    if (t29Var2.getTag() != null) {
                        t29Var2.setTag(null);
                    }
                }
                if (!this.e1 && this.y0 != null) {
                    int z4 = (int) td4.z(1.0f, this.x0, Utilities.i(1.0f - (this.x0 / 0.2f), 1.0f, 0.0f), f3);
                    canvas.save();
                    c(f13, max2, f6, z4, canvas);
                    canvas.restore();
                    return;
                }
                float f29 = f6;
                n = n();
                if (!n) {
                    canvas.clipPath(path);
                }
                if (!jb6.a0 || this.N) {
                    i3 = -1;
                }
                canvas.translate((1.0f - this.w) * getWidth() * i3, 0.0f);
                fvVar.setTranslationX(-width2);
                super.dispatchDraw(canvas);
                if (!n) {
                    Paint paint2 = this.h;
                    if (paint2 != null) {
                        paint2.setAlpha((int) (Utilities.i(this.r * this.w, 1.0f, 0.0f) * 255.0f));
                        rectF3 = rectF2;
                        canvas.drawRect(rectF3, paint2);
                    } else {
                        rectF3 = rectF2;
                    }
                    Paint paint3 = this.n;
                    if (paint3 != null) {
                        paint3.setAlpha((int) (Utilities.i(this.s * this.w, 1.0f, 0.0f) * 255.0f));
                        canvas.drawRect(rectF3, paint3);
                    }
                }
                canvas.restoreToCount(i2);
                c(f13, max2, f29, nm7.d4, canvas);
                invalidate();
            }
        }
        i2 = save3;
        rectF2 = rectF;
        fvVar = fvVar3;
        i3 = i;
        f6 = f14;
        if (!this.e1) {
        }
        float f292 = f6;
        n = n();
        if (!n) {
        }
        if (!jb6.a0) {
        }
        i3 = -1;
        canvas.translate((1.0f - this.w) * getWidth() * i3, 0.0f);
        fvVar.setTranslationX(-width2);
        super.dispatchDraw(canvas);
        if (!n) {
        }
        canvas.restoreToCount(i2);
        c(f13, max2, f292, nm7.d4, canvas);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        int i = 0;
        byte b = this.N0;
        if (b == 4) {
            Iterator it = this.e0.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                k39 k39Var = (k39) it.next();
                if (!hashSet.contains(k39Var)) {
                    hashSet.add(k39Var);
                    arrayList.add(k39Var);
                    i2++;
                    if (i2 >= 8) {
                        return;
                    }
                }
            }
            ArrayList arrayList2 = hs6.d0(this.K).n;
            while (i < arrayList2.size()) {
                k39 c = k39.c((TLRPC.TL_availableReaction) arrayList2.get(i));
                if (!hashSet.contains(c)) {
                    hashSet.add(c);
                    arrayList.add(c);
                    i2++;
                    if (i2 >= 8) {
                        return;
                    }
                }
                i++;
            }
            return;
        }
        if (!this.F0 || b == 4) {
            int i3 = this.K;
            if (b != 3) {
                ArrayList arrayList3 = hs6.d0(i3).n;
                while (i < arrayList3.size()) {
                    arrayList.add(k39.c((TLRPC.TL_availableReaction) arrayList3.get(i)));
                    i++;
                }
                return;
            }
            ArrayList arrayList4 = hs6.d0(i3).H1;
            int i4 = 0;
            while (i < arrayList4.size()) {
                k39 d = k39.d((TLRPC.Reaction) arrayList4.get(i));
                if (!hashSet.contains(d)) {
                    hashSet.add(d);
                    arrayList.add(d);
                    i4++;
                }
                if (i4 == 16) {
                    return;
                } else {
                    i++;
                }
            }
            return;
        }
        int i5 = this.K;
        if (b == 5) {
            TLRPC.messages_AvailableEffects D0 = oc7.r1(i5).D0();
            if (D0 != null) {
                while (i < D0.effects.size()) {
                    k39 e = k39.e(D0.effects.get(i));
                    if (!hashSet.contains(e)) {
                        hashSet.add(e);
                        arrayList.add(e);
                    }
                    i++;
                }
                return;
            }
            return;
        }
        ArrayList arrayList5 = b == 3 ? hs6.d0(i5).H1 : hs6.d0(i5).G1;
        if (b == 3) {
            TLRPC.TL_messages_savedReactionsTags G1 = oc7.r1(this.K).G1(0L, false);
            if (G1 != null) {
                for (int i6 = 0; i6 < G1.tags.size(); i6++) {
                    k39 d2 = k39.d(G1.tags.get(i6).reaction);
                    if (!hashSet.contains(d2)) {
                        hashSet.add(d2);
                        arrayList.add(d2);
                    }
                }
            }
            for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                k39 d3 = k39.d((TLRPC.Reaction) arrayList5.get(i7));
                if (!hashSet.contains(d3)) {
                    hashSet.add(d3);
                    arrayList.add(d3);
                }
            }
        } else {
            for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                k39 d4 = k39.d((TLRPC.Reaction) arrayList5.get(i8));
                if (!hashSet.contains(d4) && (b == 3 || z8c.h(this.K).p() || d4.g == 0)) {
                    hashSet.add(d4);
                    arrayList.add(d4);
                }
            }
        }
        if (b != 3 || z8c.h(this.K).p()) {
            ArrayList arrayList6 = hs6.d0(this.K).F1;
            for (int i9 = 0; i9 < arrayList6.size(); i9++) {
                k39 d5 = k39.d((TLRPC.Reaction) arrayList6.get(i9));
                if (!hashSet.contains(d5)) {
                    hashSet.add(d5);
                    arrayList.add(d5);
                }
            }
            ArrayList arrayList7 = hs6.d0(this.K).n;
            while (i < arrayList7.size()) {
                k39 c2 = k39.c((TLRPC.TL_availableReaction) arrayList7.get(i));
                if (!hashSet.contains(c2)) {
                    hashSet.add(c2);
                    arrayList.add(c2);
                }
                i++;
            }
        }
    }

    public void g() {
        int i = 0;
        while (true) {
            fv fvVar = this.b;
            if (i >= fvVar.getChildCount()) {
                return;
            }
            View childAt = fvVar.getChildAt(i);
            if (childAt instanceof t29) {
                ((t29) childAt).b.invalidate();
            }
            i++;
        }
    }

    public u29 getDelegate() {
        return this.h0;
    }

    public int getHintTextWidth() {
        return this.T0;
    }

    public int getItemsCount() {
        return (n() ? 1 : 0) + this.U.size() + 1;
    }

    public float getPullingLeftProgress() {
        return Utilities.i(this.C0 / gm.L(42.0f), 2.0f, 0.0f);
    }

    public x53 getReactionsWindow() {
        return this.y0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document e;
        HashSet hashSet = this.e0;
        if (hashSet.isEmpty()) {
            return "";
        }
        k39 k39Var = (k39) hashSet.iterator().next();
        long j = k39Var.g;
        String str = null;
        if (j != 0 && (e = vm.e(this.K, j)) != null) {
            str = k47.V(e, null, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = k39Var.f;
        }
        return TextUtils.isEmpty(str) ? "👍" : str;
    }

    public HashSet<k39> getSelectedReactions() {
        return this.e0;
    }

    public float getTopOffset() {
        if (this.R0) {
            return ((FrameLayout.LayoutParams) this.b.getLayoutParams()).topMargin;
        }
        return 0.0f;
    }

    public int getTotalWidth() {
        int itemsCount = getItemsCount();
        if (n()) {
            return (gm.L(36.0f) * itemsCount) - gm.L(4.0f);
        }
        return gm.L(16.0f) + aq1.h(itemsCount, 1, gm.L(2.0f), gm.L(36.0f) * itemsCount);
    }

    public List<k39> getVisibleReactionsList() {
        return this.U;
    }

    public int getWindowType() {
        byte b = this.N0;
        if (b == 4) {
            return 13;
        }
        if (b == 3) {
            return 11;
        }
        if (b == 5) {
            return 14;
        }
        return this.G0 ? 8 : 1;
    }

    public View getWindowView() {
        x53 x53Var = this.y0;
        if (x53Var == null) {
            return null;
        }
        return x53Var.c;
    }

    public final void h() {
        int L = gm.L(24.0f);
        float height = getHeight() / 2.0f;
        int w0 = cmb.w0(null, cmb.F8, false);
        this.c1 = w0;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, L, height, w0, 0, tileMode));
        this.n.setShader(new LinearGradient(getWidth(), height, getWidth() - L, height, w0, 0, tileMode));
        invalidate();
    }

    public final void i(View view, k39 k39Var, boolean z) {
        u29 u29Var = this.h0;
        if (u29Var != null) {
            u29Var.g(view, k39Var, z, true);
        }
        if (this.N0 == 5) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    public final void k() {
        this.P0 = true;
        this.n0 = 0;
        this.o0 = 0.0f;
        this.C0 = 0.0f;
        this.m0 = null;
        this.s0 = false;
        h29 h29Var = new h29(this, (byte) 1);
        fv fvVar = this.b;
        gm.d0(fvVar, h29Var);
        this.D0.clear();
        fvVar.invalidate();
        su suVar = this.T;
        if (suVar != null) {
            suVar.invalidate();
        }
        invalidate();
    }

    public final void l(km0 km0Var, nm0 nm0Var) {
        this.a1 = km0Var;
        this.b1 = nm0Var;
        im0 c = km0Var.c(this, null, true);
        c.p(nm0Var);
        wi8.r(c, gm.L(24.0f), 8.0f);
        this.X0 = c;
        im0 c2 = km0Var.c(this, null, true);
        c2.p(nm0Var);
        wi8.r(c2, gm.L(8.0f), 8.0f);
        this.Y0 = c2;
        im0 c3 = km0Var.c(this, null, true);
        c3.p(nm0Var);
        wi8.r(c3, gm.L(4.0f), 8.0f);
        this.Z0 = c3;
    }

    public final void m(k47 k47Var, TLRPC.ChatFull chatFull, boolean z) {
        int i;
        TLRPC.ChatFull chatFull2;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.I = k47Var;
        if (k47Var == null || (message = k47Var.k) == null || (tL_messageReactions2 = message.reactions) == null) {
            i = 0;
        } else {
            ArrayList<TLRPC.ReactionCount> arrayList = tL_messageReactions2.results;
            int size = arrayList.size();
            i = 0;
            int i2 = 0;
            while (i2 < size) {
                TLRPC.ReactionCount reactionCount = arrayList.get(i2);
                i2++;
                if (!(reactionCount.reaction instanceof TLRPC.TL_reactionPaid)) {
                    i++;
                }
            }
        }
        byte b = this.N0;
        this.J = b == 0 && this.I != null && i >= oc7.r1(this.K).N0(k47.B0(this.I.k));
        this.B0 = b == 0 && this.I != null && sd2.V(oc7.r1(this.K).L0(Long.valueOf(-k47.B0(this.I.k))));
        ArrayList arrayList2 = new ArrayList();
        if (k47Var == null || !k47Var.k3()) {
            chatFull2 = chatFull;
        } else {
            chatFull2 = oc7.r1(this.K).M0(-k47Var.Z0());
            if (chatFull2 == null) {
                this.L = -k47Var.Z0();
                oc7.r1(this.K).a3(0, -k47Var.Z0(), true);
                setVisibility(4);
                return;
            }
        }
        this.d0 = false;
        if (b == 3) {
            this.F0 = z8c.h(this.K).p();
            e(arrayList2);
        } else if (b == 5) {
            this.F0 = true;
            e(arrayList2);
        } else if (this.J) {
            this.F0 = false;
            if (chatFull2 != null && chatFull2.paid_reactions_available) {
                this.d0 = true;
                k39 k39Var = new k39();
                k39Var.a = true;
                arrayList2.add(k39Var);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.I.k.reactions.results;
            int size2 = arrayList3.size();
            int i3 = 0;
            while (i3 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i3);
                i3++;
                arrayList2.add(k39.d(reactionCount2.reaction));
            }
        } else if (chatFull2 != null) {
            if (chatFull2.paid_reactions_available) {
                this.d0 = true;
                k39 k39Var2 = new k39();
                k39Var2.a = true;
                arrayList2.add(k39Var2);
            }
            TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat L0 = oc7.r1(this.K).L0(Long.valueOf(chatFull2.id));
                if (L0 == null || sd2.V(L0)) {
                    this.F0 = false;
                } else {
                    this.F0 = true;
                }
                e(arrayList2);
            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                ArrayList<TLRPC.Reaction> arrayList4 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                int size3 = arrayList4.size();
                int i4 = 0;
                while (i4 < size3) {
                    TLRPC.Reaction reaction = arrayList4.get(i4);
                    i4++;
                    TLRPC.Reaction reaction2 = reaction;
                    ArrayList arrayList5 = hs6.d0(this.K).n;
                    int size4 = arrayList5.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size4) {
                            Object obj = arrayList5.get(i5);
                            i5++;
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                            if (!(reaction2 instanceof TLRPC.TL_reactionEmoji) || !tL_availableReaction.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    arrayList2.add(k39.d(reaction2));
                                    break;
                                }
                            } else {
                                arrayList2.add(k39.d(reaction2));
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            this.F0 = true;
            e(arrayList2);
        }
        HashSet hashSet = new HashSet();
        int i6 = 0;
        while (i6 < arrayList2.size()) {
            if (hashSet.contains(arrayList2.get(i6))) {
                i6--;
                arrayList2.remove(i6);
            } else {
                hashSet.add((k39) arrayList2.get(i6));
            }
            i6++;
        }
        this.G0 = !this.J && ((!this.F0 && arrayList2.size() > 16) || (this.F0 && !z8c.h(this.K).p() && oc7.r1(this.K).H3()));
        if (b == 3 && !z8c.h(this.K).p()) {
            this.G0 = false;
        }
        if (b == 4) {
            this.G0 = true;
        }
        ArrayList arrayList6 = this.U;
        arrayList6.clear();
        if (n()) {
            int L = (gm.q.x - gm.L(36.0f)) / gm.L(34.0f);
            if (L > 7) {
                L = 7;
            }
            int i7 = 0;
            if (L < 1) {
                L = 1;
            }
            while (i7 < Math.min(arrayList2.size(), L)) {
                arrayList6.add((k39) arrayList2.get(i7));
                i7++;
            }
            if (i7 < arrayList2.size()) {
                this.A0.d(-1, (k39) arrayList2.get(i7));
            }
        } else {
            arrayList6.addAll(arrayList2);
        }
        this.H0 = true;
        for (int i8 = 0; i8 < arrayList6.size(); i8++) {
            if (((k39) arrayList6.get(i8)).g != 0) {
                this.H0 = false;
            }
        }
        ArrayList arrayList7 = this.W;
        arrayList7.clear();
        arrayList7.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < gm.L(200.0f)) {
            getLayoutParams().width = -2;
        }
        o93 o93Var = this.b0;
        v29 v29Var = (v29) o93Var.e;
        ArrayList arrayList8 = v29Var.e;
        ArrayList arrayList9 = v29Var.U;
        ArrayList arrayList10 = v29Var.d;
        arrayList8.clear();
        arrayList8.addAll(arrayList10);
        arrayList10.clear();
        for (int i9 = 0; i9 < arrayList9.size(); i9++) {
            k39 k39Var3 = (k39) arrayList9.get(i9);
            arrayList10.add(new l29(k39Var3.f == null ? 3 : 0, k39Var3));
        }
        if (!v29Var.V.isEmpty() && !oc7.r1(v29Var.K).H3()) {
            arrayList10.add(new l29(1, null));
        }
        if (v29Var.n()) {
            arrayList10.add(new l29(2, null));
        }
        if (z) {
            o93Var.E(arrayList8, arrayList10);
        } else {
            o93Var.f();
        }
        if (k47Var == null || (tL_messageReactions = k47Var.k.reactions) == null || tL_messageReactions.results == null) {
            return;
        }
        for (int i10 = 0; i10 < k47Var.k.reactions.results.size(); i10++) {
            if (k47Var.k.reactions.results.get(i10).chosen) {
                this.e0.add(k39.d(k47Var.k.reactions.results.get(i10).reaction));
            }
        }
    }

    public final boolean n() {
        return this.F0 || this.G0;
    }

    public final void o() {
        if (this.y0 != null) {
            return;
        }
        x53 x53Var = new x53(this.N0, this.u0, this.W, this.e0, this, this.l0, this.a);
        this.y0 = x53Var;
        km0 km0Var = this.a1;
        boolean z = true;
        if (km0Var != null) {
            nm0 nm0Var = this.b1;
            ny9 ny9Var = x53Var.m.g0;
            ny9Var.y = true;
            ny9Var.setBackground(null);
            ny9Var.updateColors();
            ny9Var.invalidate();
            im0 c = km0Var.c(x53Var.a, null, true);
            c.p(nm0Var);
            wi8.r(c, gm.L(12.0f), 8.0f);
            x53Var.z = c;
        }
        x53 x53Var2 = this.y0;
        u29 u29Var = this.h0;
        if (u29Var != null && !u29Var.h()) {
            z = false;
        }
        x53Var2.m.setLongPressEnabled(z);
        g();
        this.y0.p = new pp8(this, (byte) 16);
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.e().b(this, nm7.m4);
        nm7.f(this.K).b(this, nm7.T);
        if (this.N0 == 5) {
            nm7.f(this.K).b(this, nm7.w3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.m4);
        nm7.f(this.K).n(this, nm7.T);
        if (this.N0 == 5) {
            nm7.f(this.K).n(this, nm7.w3);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        h();
    }

    public final void p(boolean z) {
        ObjectAnimator duration;
        this.L0 = z;
        setTransitionProgress(0.0f);
        setAlpha(1.0f);
        this.M0.d();
        boolean j = gda.j();
        ny1 ny1Var = m1;
        if (j) {
            duration = ObjectAnimator.ofFloat(this, ny1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, ny1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new lv7(this, (byte) 1));
        duration.start();
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        if (getAlpha() != f && f == 0.0f) {
            this.D0.clear();
            int i = 0;
            while (true) {
                fv fvVar = this.b;
                if (i >= fvVar.getChildCount()) {
                    break;
                }
                if (fvVar.getChildAt(i) instanceof t29) {
                    ((t29) fvVar.getChildAt(i)).c();
                }
                i++;
            }
        }
        super.setAlpha(f);
    }

    public void setBubbleOffset(float f) {
        this.V0 = f;
    }

    public void setChatScrimView(me2 me2Var) {
        this.f1 = me2Var;
    }

    public void setCurrentAccount(int i) {
        this.K = i;
    }

    public void setCustomEmojiEnterProgress(float f) {
        this.x0 = f;
        me2 me2Var = this.f1;
        if (me2Var != null) {
            me2Var.setPopupAlpha(1.0f - f);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z) {
        b63 b63Var = this.w0;
        if (!z) {
            b63Var.setBackground(null);
            return;
        }
        int L = gm.L(28.0f);
        int i = cmb.h6;
        anb.R(b63Var, cmb.h0(L, 0, on2.p(cmb.w0(null, i, false), 40)), null, anb.g(i, 40), null);
    }

    public void setDelegate(u29 u29Var) {
        this.h0 = u29Var;
    }

    public void setFlippedVertically(boolean z) {
        this.O = z;
        invalidate();
    }

    public void setFragment(d dVar) {
        this.u0 = dVar;
    }

    public void setHint(CharSequence charSequence) {
        this.R0 = true;
        if (this.S0 == null) {
            Context context = getContext();
            ylb ylbVar = this.l0;
            l66 l66Var = new l66(context, ylbVar);
            this.S0 = l66Var;
            l66Var.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
            this.S0.setClickable(true);
            this.S0.setTextSize(1, 12.0f);
            byte b = this.N0;
            if (b == 1 || b == 2 || b == 4) {
                anb.X(this.S0, cmb.F6, ylbVar);
                this.S0.setAlpha(0.5f);
            } else {
                anb.X(this.S0, cmb.y6, ylbVar);
            }
            this.S0.setGravity(1);
            addView(this.S0, qoe.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.S0.setText(charSequence);
        this.g1 = false;
        ((FrameLayout.LayoutParams) this.A0.getLayoutParams()).topMargin = gm.L(20.0f);
        ((FrameLayout.LayoutParams) this.b.getLayoutParams()).topMargin = gm.L(20.0f);
    }

    public void setMiniBubblesOffset(float f) {
        this.W0 = f;
    }

    public void setMirrorX(boolean z) {
        this.N = z;
        invalidate();
    }

    public void setOnSwitchedToLoopView(Runnable runnable) {
        this.Q0 = runnable;
    }

    public void setParentLayout(me2 me2Var) {
        this.K0 = me2Var;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        int size = arrayList.size();
        byte b = 0;
        int i = 0;
        while (i < size) {
            String str = arrayList.get(i);
            i++;
            k39 b2 = k39.b(str);
            hashSet.add(b2);
            this.f0.add(b2);
        }
        gm.d0(this.b, new h29(this, b));
    }

    public void setSelectedReaction(k39 k39Var) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        if (k39Var != null) {
            hashSet.add(k39Var);
        }
        this.b0.f();
    }

    public void setSelectedReactionAnimated(k39 k39Var) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        if (k39Var != null) {
            hashSet.add(k39Var);
        }
        gm.d0(this.b, new h29(this, (byte) 0));
    }

    public void setSelectedReactionInclusive(k39 k39Var) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        if (k39Var != null) {
            hashSet.add(k39Var);
        }
        gm.d0(this.b, new h29(this, (byte) 0));
    }

    public void setSelectedReactions(ArrayList<k47> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.e0;
        hashSet.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            k47 k47Var = arrayList.get(i);
            if (k47Var != null && (tL_messageReactions = k47Var.k.reactions) != null && tL_messageReactions.results != null) {
                for (int i2 = 0; i2 < k47Var.k.reactions.results.size(); i2++) {
                    if (k47Var.k.reactions.results.get(i2).chosen) {
                        hashSet.add(k39.d(k47Var.k.reactions.results.get(i2).reaction));
                    }
                }
            }
        }
        this.b0.f();
    }

    public void setSelectedReactionsInclusive(ArrayList<k47> arrayList) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        hashSet.addAll(f(arrayList));
        gm.d0(this.b, new h29(this, (byte) 0));
    }

    public void setSkipDraw(boolean z) {
        if (this.e1 != z) {
            this.e1 = z;
            if (!z) {
                int i = 0;
                while (true) {
                    fv fvVar = this.b;
                    if (i >= fvVar.getChildCount()) {
                        break;
                    }
                    if (fvVar.getChildAt(i) instanceof t29) {
                        t29 t29Var = (t29) fvVar.getChildAt(i);
                        boolean z2 = t29Var.r;
                        s29 s29Var = t29Var.b;
                        if (z2 && (s29Var.getImageReceiver().y() != null || s29Var.getImageReceiver().m() != null)) {
                            s29Var.setVisibility(0);
                            t29Var.a.setVisibility(4);
                            if (t29Var.s) {
                                t29Var.w = true;
                            }
                        }
                        t29Var.invalidate();
                    }
                    i++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.e0;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(k39.d(reaction));
        }
        this.b0.f();
    }

    public void setTop(boolean z) {
        this.M = z;
    }

    public void setTransitionProgress(float f) {
        this.w = f;
        me2 me2Var = this.K0;
        if (me2Var != null) {
            if (!this.L0 || !gda.j()) {
                f = 1.0f;
            }
            me2Var.setReactionsTransitionProgress(f);
        }
        invalidate();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        if (f != getTranslationX()) {
            super.setTranslationX(f);
        }
    }

    @Override // vlb
    public final void updateColors() {
        int v0;
        Paint paint = this.f;
        if (paint != null) {
            try {
                byte b = this.N0;
                if (b != 2 && b != 4 && paint.getColor() != (v0 = cmb.v0(cmb.F8, this.l0))) {
                    int alpha = paint.getAlpha();
                    paint.setColor(v0);
                    paint.setAlpha(alpha);
                    invalidate();
                }
            } catch (Exception e) {
                fc4.g(e, true);
                return;
            }
        }
        pj8 pj8Var = this.v0;
        if (pj8Var != null) {
            pj8Var.setColor(on2.f(0.7f, cmb.w0(null, cmb.E8, false), cmb.w0(null, cmb.g5, false)));
        }
        if (getWidth() <= 0 || getHeight() <= 0 || this.c1 == cmb.w0(null, cmb.F8, false)) {
            return;
        }
        h();
    }

    public void j() {
    }
}
