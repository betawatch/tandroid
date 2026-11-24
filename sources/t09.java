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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class t09 extends FrameLayout implements gk7, tjb {
    public static final ax1 m1 = new ax1(Float.class, "transitionProgress", (byte) 3);
    public final r09 A0;
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
    public k27 I;
    public final Paint I0;
    public boolean J;
    public final Paint J0;
    public int K;
    public bd2 K0;
    public long L;
    public boolean L0;
    public boolean M;
    public final on M0;
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
    public l46 S0;
    public st T;
    public int T0;
    public final ArrayList U;
    public int U0;
    public final ArrayList V;
    public float V0;
    public final ArrayList W;
    public float W0;
    public il0 X0;
    public il0 Y0;
    public il0 Z0;
    public boolean a;
    public final xe2 a0;
    public kl0 a1;
    public final fu b;
    public final c83 b0;
    public nl0 b1;
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
    public bd2 f1;
    public final int[] g0;
    public boolean g1;
    public final Paint h;
    public s09 h0;
    public boolean h1;
    public final Rect i0;
    public boolean i1;
    public final Drawable j0;
    public Paint j1;
    public final boolean k0;
    public Matrix k1;
    public final wjb l0;
    public LinearGradient l1;
    public h19 m0;
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
    public oh8 v0;
    public float w;
    public q43 w0;
    public final RectF x;
    public float x0;
    public final Path y;
    public m43 y0;
    public ValueAnimator z0;

    /* JADX WARN: Multi-variable type inference failed */
    public t09(int i, int i2, wjb wjbVar, Context context, d dVar) {
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
        this.E = gl.L(72.0f);
        float L = gl.L(8.0f);
        this.F = L;
        this.G = L / 2.0f;
        this.H = gl.L(36.0f);
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
        this.M0 = new on(null);
        this.P0 = true;
        this.h1 = false;
        this.N0 = i;
        this.c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(bkb.v0(bkb.h6, wjbVar));
        paint3.setColor(bkb.v0(bkb.zk, wjbVar));
        this.l0 = wjbVar;
        this.K = i2;
        this.u0 = dVar;
        r09 r09Var = new r09(this, context);
        this.A0 = r09Var;
        byte b4 = 8;
        r09Var.setVisibility(8);
        r09Var.P = false;
        r09Var.c.setVisibility(8);
        addView(r09Var);
        this.k0 = gba.c() && gba.o() != 0;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.j0 = mutate;
        int L2 = gl.L(7.0f);
        rect.bottom = L2;
        rect.right = L2;
        rect.top = L2;
        rect.left = L2;
        zkb.x(this, mutate, bkb.Je, null, PorterDuff.Mode.MULTIPLY);
        fu fuVar = new fu((byte) 28, context, (Object) this);
        this.b = fuVar;
        fuVar.setClipChildren(false);
        fuVar.setClipToPadding(false);
        xe2 xe2Var = new xe2((ViewGroup) this, (byte) 4);
        this.a0 = xe2Var;
        fuVar.i(new h09(this, b));
        fuVar.setLayoutManager(xe2Var);
        fuVar.setOverScrollMode(2);
        c83 c83Var = new c83(this, b3);
        this.b0 = c83Var;
        fuVar.setAdapter(c83Var);
        fuVar.j(new n09(this));
        fuVar.j(new n58(this, b4));
        fuVar.i(new h09(this, b2));
        fuVar.setOnItemClickListener(new f09(this, b));
        fuVar.setOnItemLongClickListener(new h93(this, i));
        addView(fuVar, nme.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        h();
        int paddingTop = (fuVar.getLayoutParams().height - fuVar.getPaddingTop()) - fuVar.getPaddingBottom();
        r09Var.getLayoutParams().width = paddingTop - gl.L(12.0f);
        r09Var.getLayoutParams().height = paddingTop;
        if (i == 2 || i == 4) {
            paint.setColor(bm2.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(bkb.v0(bkb.F8, wjbVar));
        }
        hq6.d0(i2).l1();
    }

    public static HashSet f(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        boolean z = true;
        int i = 0;
        while (i < arrayList.size()) {
            k27 k27Var = (k27) arrayList.get(i);
            hashSet.clear();
            if (k27Var != null && (tL_messageReactions = k27Var.k.reactions) != null && tL_messageReactions.results != null) {
                for (int i2 = 0; i2 < k27Var.k.reactions.results.size(); i2++) {
                    if (k27Var.k.reactions.results.get(i2).chosen) {
                        h19 d = h19.d(k27Var.k.reactions.results.get(i2).reaction);
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
                hashSet2.add((h19) longSparseArray.valueAt(i4));
            }
        }
        return hashSet2;
    }

    public final void a(boolean z) {
        m43 m43Var = this.y0;
        if (m43Var != null) {
            if (!m43Var.q || !z) {
                m43Var.q = true;
                if (z) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    byte b = 0;
                    ofFloat.addUpdateListener(new h43(m43Var, b));
                    ofFloat.addListener(new k43(m43Var, b));
                    ofFloat.setDuration(150L);
                    ofFloat.start();
                } else {
                    m43Var.f();
                }
            }
            this.y0 = null;
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F8));
        hashSet.add(Integer.valueOf(bkb.E8));
        hashSet.add(Integer.valueOf(bkb.g5));
    }

    public final void b() {
        m43 m43Var = this.y0;
        if (m43Var != null) {
            m43Var.d();
        }
    }

    public final void c(float f, float f2, float f3, int i, Canvas canvas) {
        s33 s33Var;
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
            s33Var = s33.f;
            canvas.clipRect(0.0f, 0.0f, measuredWidth, (gl.R1(f5, measuredHeight, s33Var.getInterpolation(this.P)) - ((int) Math.ceil((1.0f - this.w) * (rectF2.height() / 2.0f)))) + 1.0f);
        } else {
            float f6 = rectF2.bottom;
            s33Var = s33.f;
            canvas.clipRect(0.0f, (gl.R1(f6, 0.0f, s33Var.getInterpolation(this.P)) - ((int) Math.ceil((1.0f - this.w) * (rectF2.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), gl.R1(gl.L(8.0f) + getMeasuredHeight(), getPaddingTop() - d(), s33Var.getInterpolation(this.P)));
        }
        float width = ((k96.a0 || this.N) ? this.H : getWidth() - this.H) + this.V0;
        float paddingTop = this.M ? getPaddingTop() - d() : (getHeight() - getPaddingBottom()) + d();
        int L = gl.L(3.0f);
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
        boolean C = this.h0.C();
        float f13 = paddingTop;
        RectF rectF3 = this.c0;
        if (C) {
            rectF3.set(f7, f10, f11, f12);
            this.h0.x(canvas, rectF3, f, getX(), getY(), i, false);
            rectF = rectF3;
            f4 = f;
            canvas2 = canvas;
        } else {
            rectF = rectF3;
            canvas2 = canvas;
            f4 = f;
            if (this.Y0 != null) {
                RectF rectF4 = gl.P;
                rectF4.set(f7, f10, f11, f12);
                Rect rect = gl.Q;
                rectF4.round(rect);
                rect.inset(-gl.L(8.0f), -gl.L(8.0f));
                this.Y0.setBounds(rect);
                this.Y0.setAlpha(paint.getAlpha());
                this.Y0.draw(canvas2);
            } else {
                canvas2.drawCircle(width, f13, f4, paint);
            }
        }
        boolean z2 = k96.a0;
        float f14 = this.F;
        float width2 = this.V0 + this.W0 + ((z2 || this.N) ? this.H - f14 : (getWidth() - this.H) + f14);
        boolean z3 = this.M;
        float f15 = this.G;
        float R1 = gl.R1(z3 ? (getPaddingTop() - d()) - gl.L(16.0f) : ((getHeight() - f15) - f8) + d(), (f15 + f8) - d(), s33Var.getInterpolation(this.P));
        float f16 = (-gl.L(1.0f)) * f2;
        drawable.setBounds((int) ((width2 - f4) - f16), (int) ((R1 - f4) - f16), (int) (width2 + f4 + f16), (int) (f4 + R1 + f16));
        drawable.draw(canvas2);
        if (this.h0.C()) {
            rectF.set(width2 - f3, R1 - f3, width2 + f3, R1 + f3);
            Canvas canvas3 = canvas2;
            this.h0.x(canvas3, rectF, f3, getX(), getY(), i, false);
            canvas2 = canvas3;
        } else if (this.Z0 != null) {
            RectF rectF5 = gl.P;
            rectF5.set(width2 - f3, R1 - f3, width2 + f3, R1 + f3);
            Rect rect2 = gl.Q;
            rectF5.round(rect2);
            rect2.inset(-gl.L(8.0f), -gl.L(8.0f));
            this.Z0.setBounds(rect2);
            this.Z0.setAlpha(paint.getAlpha());
            this.Z0.draw(canvas2);
        } else {
            canvas2.drawCircle(width2, R1, f3, paint);
        }
        canvas2.restore();
        drawable.setAlpha(kk7.d4);
        paint.setAlpha(kk7.d4);
    }

    public final float d() {
        return (int) (getPullingLeftProgress() * gl.L(6.0f));
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.S) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id != this.L || getVisibility() == 0 || (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                return;
            }
            m(this.I, null, true);
            setVisibility(0);
            p(false);
            return;
        }
        if (i != kk7.k4) {
            if (i == kk7.v3) {
                m(this.I, null, true);
            }
        } else if (this.N0 == 4) {
            invalidate();
            fu fuVar = this.b;
            fuVar.invalidate();
            fuVar.h1();
            for (int i3 = 0; i3 < fuVar.getChildCount(); i3++) {
                View childAt = fuVar.getChildAt(i3);
                if (childAt instanceof r09) {
                    r09 r09Var = (r09) childAt;
                    r09Var.a.invalidate();
                    r09Var.b.invalidate();
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
        fu fuVar;
        int i3;
        float f6;
        boolean n;
        RectF rectF3;
        int i4;
        RectF rectF4;
        int i5;
        fu fuVar2;
        float f7;
        int R;
        float f8;
        float f9;
        float x;
        float scaleX;
        float f10;
        float f11;
        vl vlVar;
        ml mlVar;
        int i6;
        s09 s09Var;
        Canvas canvas2 = canvas;
        long min = Math.min(16L, System.currentTimeMillis() - this.Q);
        this.Q = System.currentTimeMillis();
        boolean z = this.O;
        float f12 = this.P;
        if (z) {
            if (f12 != 1.0f) {
                this.P = ls6.z(min, 220.0f, f12, 1.0f);
                invalidate();
            }
        } else if (f12 != 0.0f) {
            this.P = oo1.x(min, 220.0f, f12, 0.0f);
            invalidate();
        }
        l46 l46Var = this.S0;
        if (l46Var != null) {
            l46Var.setTranslationY(-d());
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
        h19 h19Var = this.m0;
        byte b2 = this.N0;
        if (h19Var != null && b2 != 5 && ((s09Var = this.h0) == null || s09Var.r())) {
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
        h19 h19Var2 = this.m0;
        if (h19Var2 == null || !h19Var2.a) {
            float f16 = this.o0;
            this.q0 = (f16 * 2.0f) + 1.0f;
            this.r0 = 1.0f - (f16 * 0.15f);
        } else {
            this.q0 = 1.0f;
            this.r0 = 1.0f;
        }
        int save = canvas2.save();
        if (k96.a0 || this.N) {
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
        if (k96.a0 || this.N) {
            max = Math.max(0.25f, this.w);
            f2 = 0.0f;
        } else {
            f2 = 1.0f - Math.max(0.25f, this.w);
            max = 1.0f;
        }
        float pullingLeftProgress = getPullingLeftProgress();
        float d = d();
        bd2 bd2Var = this.f1;
        if (bd2Var != null) {
            bd2Var.setExpandSize(d);
        }
        float width2 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f2);
        float topOffset = getTopOffset();
        float paddingTop = getPaddingTop();
        fu fuVar3 = this.b;
        float f19 = f2;
        float f20 = max;
        RectF rectF5 = this.x;
        rectF5.set(getPaddingLeft() + width2, (((1.0f - this.r0) * fuVar3.getMeasuredHeight()) + paddingTop) - d, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + d);
        this.E = b00.b(d, 2.0f, rectF5.height() - topOffset, 2.0f);
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
            if (b2 == 1 || this.h0.C()) {
                i6 = save2;
                b = b2;
                rectF = rectF5;
                f4 = f17;
                i = 1;
                this.h0.x(canvas, rectF, this.E, getX(), getY(), kk7.d4, false);
                canvas2 = canvas;
            } else {
                il0 il0Var = this.X0;
                Paint paint = this.f;
                if (il0Var != null) {
                    Rect rect2 = gl.Q;
                    rectF5.round(rect2);
                    rect2.inset(-gl.L(8.0f), -gl.L(8.0f));
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
                            int v0 = bkb.v0(bkb.zk, this.l0);
                            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, gl.L(64.0f), 0.0f, new int[]{v0, bkb.p1(0.0f, v0)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            this.l1 = linearGradient;
                            this.j1.setShader(linearGradient);
                        }
                        this.k1.reset();
                        this.k1.postTranslate(rectF.left, rectF.top);
                        this.l1.setLocalMatrix(this.k1);
                        this.j1.setAlpha((int) (l * f3));
                        canvas2.drawRoundRect(rectF, f23, f23, this.j1);
                    } else if (((h19) it.next()).a) {
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
                while (i9 < fuVar3.getChildCount()) {
                    View childAt = fuVar3.getChildAt(i9);
                    boolean z2 = i;
                    int abs = (this.w == 1.0f || !gba.j()) ? i11 : (int) (Math.abs((((childAt.getMeasuredWidth() / f5) + childAt.getLeft()) / fuVar3.getMeasuredWidth()) - 0.8f) * 200.0f);
                    float f26 = f14;
                    if (childAt instanceof r09) {
                        r09 r09Var = (r09) fuVar3.getChildAt(i9);
                        i5 = i9;
                        if (this.C0 != 0.0f) {
                            i4 = save3;
                            f9 = gl.L(46.0f) * Utilities.i(r09Var.getLeft() / (getMeasuredWidth() - gl.L(34.0f)), 1.0f, 0.0f) * getPullingLeftProgress();
                        } else {
                            i4 = save3;
                            f9 = 0.0f;
                        }
                        h19 h19Var3 = r09Var.e;
                        q09 q09Var = r09Var.a;
                        float f27 = f9;
                        q09 q09Var2 = r09Var.b;
                        q09 q09Var3 = r09Var.c;
                        rectF4 = rectF;
                        if (h19Var3.equals(this.m0)) {
                            q09 q09Var4 = q09Var2.getVisibility() == 0 ? q09Var2 : q09Var;
                            r09Var.setPivotX(r09Var.getMeasuredWidth() >> 1);
                            r09Var.setPivotY(q09Var4.getY() + q09Var4.getMeasuredHeight());
                            r09Var.setScaleX(this.q0);
                            r09Var.setScaleY(this.q0);
                            if (!this.s0) {
                                if (this.R == null) {
                                    q09Var3.setVisibility(0);
                                    q09Var3.setAlpha(1.0f);
                                    if (q09Var3.getImageReceiver().B() || ((vlVar = q09Var3.e) != null && (mlVar = vlVar.k) != null && mlVar.B())) {
                                        q09Var4.setAlpha(0.0f);
                                    }
                                    f11 = 1.0f;
                                } else {
                                    f11 = 1.0f;
                                    q09Var3.setAlpha(1.0f - this.p0);
                                    q09Var4.setAlpha(this.p0);
                                }
                                if (this.o0 == f11) {
                                    this.s0 = z2;
                                    if (System.currentTimeMillis() - this.t0 > 300) {
                                        this.t0 = System.currentTimeMillis();
                                        fuVar2 = fuVar3;
                                        this.h0.q(r09Var, r09Var.e, true, false);
                                        canvas2.save();
                                        x = r09Var.getX() + fuVar2.getX();
                                        scaleX = ((r09Var.getScaleX() * r09Var.getMeasuredWidth()) - r09Var.getMeasuredWidth()) / f5;
                                        f10 = x - scaleX;
                                        if (f10 >= 0.0f && r09Var.getTranslationX() >= 0.0f) {
                                            r09Var.setTranslationX((-f10) - f27);
                                        } else if (r09Var.getMeasuredWidth() + x + scaleX > getMeasuredWidth() || r09Var.getTranslationX() > 0.0f) {
                                            r09Var.setTranslationX(0.0f - f27);
                                        } else {
                                            r09Var.setTranslationX((((getMeasuredWidth() - x) - r09Var.getMeasuredWidth()) - scaleX) - f27);
                                        }
                                        canvas2.translate(r09Var.getX() + fuVar2.getX(), r09Var.getY() + fuVar2.getY());
                                        canvas2.scale(r09Var.getScaleX(), r09Var.getScaleY(), r09Var.getPivotX(), r09Var.getPivotY());
                                        r09Var.draw(canvas2);
                                        canvas2.restore();
                                    }
                                }
                            }
                            fuVar2 = fuVar3;
                            canvas2.save();
                            x = r09Var.getX() + fuVar2.getX();
                            scaleX = ((r09Var.getScaleX() * r09Var.getMeasuredWidth()) - r09Var.getMeasuredWidth()) / f5;
                            f10 = x - scaleX;
                            if (f10 >= 0.0f) {
                            }
                            if (r09Var.getMeasuredWidth() + x + scaleX > getMeasuredWidth()) {
                            }
                            r09Var.setTranslationX(0.0f - f27);
                            canvas2.translate(r09Var.getX() + fuVar2.getX(), r09Var.getY() + fuVar2.getY());
                            canvas2.scale(r09Var.getScaleX(), r09Var.getScaleY(), r09Var.getPivotX(), r09Var.getPivotY());
                            r09Var.draw(canvas2);
                            canvas2.restore();
                        } else {
                            fuVar2 = fuVar3;
                            int R2 = RecyclerView.R(r09Var);
                            float measuredWidth = (((this.q0 - 1.0f) * r09Var.getMeasuredWidth()) / 3.0f) - (((1.0f - this.r0) * r09Var.getMeasuredWidth()) * (Math.abs(this.n0 - R2) - 1));
                            if (R2 < this.n0) {
                                r09Var.setPivotX(0.0f);
                                r09Var.setTranslationX(-measuredWidth);
                            } else {
                                r09Var.setPivotX(r09Var.getMeasuredWidth() - f27);
                                r09Var.setTranslationX(measuredWidth - f27);
                            }
                            r09Var.setPivotY(q09Var.getY() + q09Var.getMeasuredHeight());
                            r09Var.setScaleX(this.r0);
                            r09Var.setScaleY(this.r0);
                            q09Var3.setVisibility(4);
                            q09Var.setAlpha(1.0f);
                        }
                        if (childAt.getLeft() > i10) {
                            i10 = childAt.getLeft();
                        }
                        if (!this.O0 && (!r09Var.r || q09Var.getImageReceiver().y() != null)) {
                            if ((r09Var.getMeasuredWidth() / f5) + r09Var.getX() > 0.0f && (r09Var.getMeasuredWidth() / f5) + r09Var.getX() < fuVar2.getWidth()) {
                                if (!hashSet.contains(r09Var)) {
                                    r09Var.b(abs);
                                    abs += 30;
                                }
                                hashSet2.add(r09Var);
                            } else if (!r09Var.n) {
                                r09Var.c();
                            }
                        }
                    } else {
                        i4 = save3;
                        rectF4 = rectF;
                        i5 = i9;
                        fuVar2 = fuVar3;
                        if (childAt == this.S) {
                            if ((childAt.getMeasuredWidth() / f5) + childAt.getX() <= 0.0f || (childAt.getMeasuredWidth() / f5) + childAt.getX() >= fuVar2.getWidth()) {
                                oh8 oh8Var = this.v0;
                                f7 = 0.0f;
                                oh8Var.setScaleX(0.0f);
                                oh8Var.setScaleY(0.0f);
                                if (childAt == this.T) {
                                    if ((childAt.getMeasuredWidth() / f5) + childAt.getX() <= f7 || (childAt.getMeasuredWidth() / f5) + childAt.getX() >= fuVar2.getWidth()) {
                                        q43 q43Var = this.w0;
                                        q43Var.setScaleX(0.0f);
                                        q43Var.setScaleY(0.0f);
                                        ((t09) q43Var.c).T.invalidate();
                                        ValueAnimator valueAnimator = (ValueAnimator) q43Var.b;
                                        if (valueAnimator != null) {
                                            valueAnimator.cancel();
                                        }
                                    } else {
                                        if (!hashSet.contains(childAt)) {
                                            if (this.w != 1.0f) {
                                                q43 q43Var2 = this.w0;
                                                q43Var2.setScaleX(0.0f);
                                                q43Var2.setScaleY(0.0f);
                                                ((t09) q43Var2.c).T.invalidate();
                                                ValueAnimator valueAnimator2 = (ValueAnimator) q43Var2.b;
                                                if (valueAnimator2 != null) {
                                                    valueAnimator2.cancel();
                                                }
                                            }
                                            q43 q43Var3 = this.w0;
                                            boolean z3 = e66.e(8200) || gba.o() >= 1;
                                            q43Var3.invalidate();
                                            ValueAnimator valueAnimator3 = (ValueAnimator) q43Var3.b;
                                            if (valueAnimator3 != null) {
                                                valueAnimator3.removeAllListeners();
                                                ((ValueAnimator) q43Var3.b).cancel();
                                            }
                                            if (z3) {
                                                ValueAnimator ofFloat = ValueAnimator.ofFloat(q43Var3.getScaleX(), 1.0f);
                                                q43Var3.b = ofFloat;
                                                ofFloat.setInterpolator(gl.H);
                                                ((ValueAnimator) q43Var3.b).addUpdateListener(new u28(q43Var3, (byte) 26));
                                                ((ValueAnimator) q43Var3.b).setStartDelay((long) (abs * ((t09) q43Var3.c).c));
                                                ((ValueAnimator) q43Var3.b).setDuration(300L);
                                                ((ValueAnimator) q43Var3.b).start();
                                            } else {
                                                q43Var3.setScaleX(1.0f);
                                                q43Var3.setScaleY(1.0f);
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
                                        oh8 oh8Var2 = this.v0;
                                        f8 = 0.0f;
                                        oh8Var2.setScaleX(0.0f);
                                        oh8Var2.setScaleY(0.0f);
                                    } else {
                                        f8 = 0.0f;
                                    }
                                    oh8 oh8Var3 = this.v0;
                                    wd1 wd1Var = oh8Var3.K;
                                    if (wd1Var != null) {
                                        wd1Var.g = f8;
                                        wd1Var.j = false;
                                    }
                                    oh8Var3.invalidate();
                                    oh8Var3.animate().scaleX(1.1f).scaleY(1.1f).setStartDelay(abs).setInterpolator(gl.H).setDuration(300L);
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
                    fuVar3 = fuVar2;
                    rectF = rectF4;
                    i = 1;
                }
                i2 = save3;
                rectF2 = rectF;
                fuVar = fuVar3;
                f6 = f14;
                r09 r09Var2 = this.A0;
                if (pullingLeftProgress > 0.0f) {
                    float pullingLeftProgress2 = getPullingLeftProgress();
                    int measuredWidth3 = r09Var2.getMeasuredWidth() - gl.L(f5);
                    float f28 = i10 + measuredWidth3;
                    float i12 = Utilities.i(f28 / (getMeasuredWidth() - r09Var2.getMeasuredWidth()), 1.0f, 0.0f) * pullingLeftProgress2 * measuredWidth3;
                    if (r09Var2.getTag() == null) {
                        r09Var2.setTag(Float.valueOf(1.0f));
                        r09Var2.c();
                        r09Var2.b(0);
                    }
                    float i13 = Utilities.i(pullingLeftProgress2, 1.0f, 0.0f);
                    r09Var2.setScaleX(i13);
                    r09Var2.setScaleY(i13);
                    i3 = 1;
                    r09Var2.setTranslationX(((fuVar.getX() + f28) - i12) + (-((b3 == 1 || b3 == 2) ? gl.L(8.0f) : gl.L(20.0f))));
                    if (r09Var2.getVisibility() != 0) {
                        r09Var2.setVisibility(0);
                    }
                } else {
                    i3 = 1;
                    if (r09Var2.getVisibility() != 8 && this.P0) {
                        r09Var2.setVisibility(8);
                    }
                    if (r09Var2.getTag() != null) {
                        r09Var2.setTag(null);
                    }
                }
                if (!this.e1 && this.y0 != null) {
                    int z4 = (int) tb4.z(1.0f, this.x0, Utilities.i(1.0f - (this.x0 / 0.2f), 1.0f, 0.0f), f3);
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
                if (!k96.a0 || this.N) {
                    i3 = -1;
                }
                canvas.translate((1.0f - this.w) * getWidth() * i3, 0.0f);
                fuVar.setTranslationX(-width2);
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
                c(f13, max2, f29, kk7.d4, canvas);
                invalidate();
            }
        }
        i2 = save3;
        rectF2 = rectF;
        fuVar = fuVar3;
        i3 = i;
        f6 = f14;
        if (!this.e1) {
        }
        float f292 = f6;
        n = n();
        if (!n) {
        }
        if (!k96.a0) {
        }
        i3 = -1;
        canvas.translate((1.0f - this.w) * getWidth() * i3, 0.0f);
        fuVar.setTranslationX(-width2);
        super.dispatchDraw(canvas);
        if (!n) {
        }
        canvas.restoreToCount(i2);
        c(f13, max2, f292, kk7.d4, canvas);
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
                h19 h19Var = (h19) it.next();
                if (!hashSet.contains(h19Var)) {
                    hashSet.add(h19Var);
                    arrayList.add(h19Var);
                    i2++;
                    if (i2 >= 8) {
                        return;
                    }
                }
            }
            ArrayList arrayList2 = hq6.d0(this.K).n;
            while (i < arrayList2.size()) {
                h19 c = h19.c((TLRPC.TL_availableReaction) arrayList2.get(i));
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
                ArrayList arrayList3 = hq6.d0(i3).n;
                while (i < arrayList3.size()) {
                    arrayList.add(h19.c((TLRPC.TL_availableReaction) arrayList3.get(i)));
                    i++;
                }
                return;
            }
            ArrayList arrayList4 = hq6.d0(i3).H1;
            int i4 = 0;
            while (i < arrayList4.size()) {
                h19 d = h19.d((TLRPC.Reaction) arrayList4.get(i));
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
            TLRPC.messages_AvailableEffects C0 = na7.q1(i5).C0();
            if (C0 != null) {
                while (i < C0.effects.size()) {
                    h19 e = h19.e(C0.effects.get(i));
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
        ArrayList arrayList5 = b == 3 ? hq6.d0(i5).H1 : hq6.d0(i5).G1;
        if (b == 3) {
            TLRPC.TL_messages_savedReactionsTags F1 = na7.q1(this.K).F1(0L, false);
            if (F1 != null) {
                for (int i6 = 0; i6 < F1.tags.size(); i6++) {
                    h19 d2 = h19.d(F1.tags.get(i6).reaction);
                    if (!hashSet.contains(d2)) {
                        hashSet.add(d2);
                        arrayList.add(d2);
                    }
                }
            }
            for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                h19 d3 = h19.d((TLRPC.Reaction) arrayList5.get(i7));
                if (!hashSet.contains(d3)) {
                    hashSet.add(d3);
                    arrayList.add(d3);
                }
            }
        } else {
            for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                h19 d4 = h19.d((TLRPC.Reaction) arrayList5.get(i8));
                if (!hashSet.contains(d4) && (b == 3 || y6c.h(this.K).p() || d4.g == 0)) {
                    hashSet.add(d4);
                    arrayList.add(d4);
                }
            }
        }
        if (b != 3 || y6c.h(this.K).p()) {
            ArrayList arrayList6 = hq6.d0(this.K).F1;
            for (int i9 = 0; i9 < arrayList6.size(); i9++) {
                h19 d5 = h19.d((TLRPC.Reaction) arrayList6.get(i9));
                if (!hashSet.contains(d5)) {
                    hashSet.add(d5);
                    arrayList.add(d5);
                }
            }
            ArrayList arrayList7 = hq6.d0(this.K).n;
            while (i < arrayList7.size()) {
                h19 c2 = h19.c((TLRPC.TL_availableReaction) arrayList7.get(i));
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
            fu fuVar = this.b;
            if (i >= fuVar.getChildCount()) {
                return;
            }
            View childAt = fuVar.getChildAt(i);
            if (childAt instanceof r09) {
                ((r09) childAt).b.invalidate();
            }
            i++;
        }
    }

    public s09 getDelegate() {
        return this.h0;
    }

    public int getHintTextWidth() {
        return this.T0;
    }

    public int getItemsCount() {
        return (n() ? 1 : 0) + this.U.size() + 1;
    }

    public float getPullingLeftProgress() {
        return Utilities.i(this.C0 / gl.L(42.0f), 2.0f, 0.0f);
    }

    public m43 getReactionsWindow() {
        return this.y0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document e;
        HashSet hashSet = this.e0;
        if (hashSet.isEmpty()) {
            return "";
        }
        h19 h19Var = (h19) hashSet.iterator().next();
        long j = h19Var.g;
        String str = null;
        if (j != 0 && (e = vl.e(this.K, j)) != null) {
            str = k27.V(e, null, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = h19Var.f;
        }
        return TextUtils.isEmpty(str) ? "👍" : str;
    }

    public HashSet<h19> getSelectedReactions() {
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
            return (gl.L(36.0f) * itemsCount) - gl.L(4.0f);
        }
        return gl.L(16.0f) + oo1.h(itemsCount, 1, gl.L(2.0f), gl.L(36.0f) * itemsCount);
    }

    public List<h19> getVisibleReactionsList() {
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
        m43 m43Var = this.y0;
        if (m43Var == null) {
            return null;
        }
        return m43Var.c;
    }

    public final void h() {
        int L = gl.L(24.0f);
        float height = getHeight() / 2.0f;
        int w0 = bkb.w0(null, bkb.F8, false);
        this.c1 = w0;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, L, height, w0, 0, tileMode));
        this.n.setShader(new LinearGradient(getWidth(), height, getWidth() - L, height, w0, 0, tileMode));
        invalidate();
    }

    public final void i(View view, h19 h19Var, boolean z) {
        s09 s09Var = this.h0;
        if (s09Var != null) {
            s09Var.q(view, h19Var, z, true);
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
        g09 g09Var = new g09(this, (byte) 1);
        fu fuVar = this.b;
        gl.d0(fuVar, g09Var);
        this.D0.clear();
        fuVar.invalidate();
        st stVar = this.T;
        if (stVar != null) {
            stVar.invalidate();
        }
        invalidate();
    }

    public final void l(kl0 kl0Var, nl0 nl0Var) {
        this.a1 = kl0Var;
        this.b1 = nl0Var;
        il0 c = kl0Var.c(this, null, true);
        c.p(nl0Var);
        ug8.r(c, gl.L(24.0f), 8.0f);
        this.X0 = c;
        il0 c2 = kl0Var.c(this, null, true);
        c2.p(nl0Var);
        ug8.r(c2, gl.L(8.0f), 8.0f);
        this.Y0 = c2;
        il0 c3 = kl0Var.c(this, null, true);
        c3.p(nl0Var);
        ug8.r(c3, gl.L(4.0f), 8.0f);
        this.Z0 = c3;
    }

    public final void m(k27 k27Var, TLRPC.ChatFull chatFull, boolean z) {
        int i;
        TLRPC.ChatFull chatFull2;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.I = k27Var;
        if (k27Var == null || (message = k27Var.k) == null || (tL_messageReactions2 = message.reactions) == null) {
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
        this.J = b == 0 && this.I != null && i >= na7.q1(this.K).M0(k27.B0(this.I.k));
        this.B0 = b == 0 && this.I != null && hc2.V(na7.q1(this.K).K0(Long.valueOf(-k27.B0(this.I.k))));
        ArrayList arrayList2 = new ArrayList();
        if (k27Var == null || !k27Var.k3()) {
            chatFull2 = chatFull;
        } else {
            chatFull2 = na7.q1(this.K).L0(-k27Var.Z0());
            if (chatFull2 == null) {
                this.L = -k27Var.Z0();
                na7.q1(this.K).X2(0, -k27Var.Z0(), true);
                setVisibility(4);
                return;
            }
        }
        this.d0 = false;
        if (b == 3) {
            this.F0 = y6c.h(this.K).p();
            e(arrayList2);
        } else if (b == 5) {
            this.F0 = true;
            e(arrayList2);
        } else if (this.J) {
            this.F0 = false;
            if (chatFull2 != null && chatFull2.paid_reactions_available) {
                this.d0 = true;
                h19 h19Var = new h19();
                h19Var.a = true;
                arrayList2.add(h19Var);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.I.k.reactions.results;
            int size2 = arrayList3.size();
            int i3 = 0;
            while (i3 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i3);
                i3++;
                arrayList2.add(h19.d(reactionCount2.reaction));
            }
        } else if (chatFull2 != null) {
            if (chatFull2.paid_reactions_available) {
                this.d0 = true;
                h19 h19Var2 = new h19();
                h19Var2.a = true;
                arrayList2.add(h19Var2);
            }
            TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat K0 = na7.q1(this.K).K0(Long.valueOf(chatFull2.id));
                if (K0 == null || hc2.V(K0)) {
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
                    ArrayList arrayList5 = hq6.d0(this.K).n;
                    int size4 = arrayList5.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size4) {
                            Object obj = arrayList5.get(i5);
                            i5++;
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                            if (!(reaction2 instanceof TLRPC.TL_reactionEmoji) || !tL_availableReaction.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    arrayList2.add(h19.d(reaction2));
                                    break;
                                }
                            } else {
                                arrayList2.add(h19.d(reaction2));
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
                hashSet.add((h19) arrayList2.get(i6));
            }
            i6++;
        }
        this.G0 = !this.J && ((!this.F0 && arrayList2.size() > 16) || (this.F0 && !y6c.h(this.K).p() && na7.q1(this.K).E3()));
        if (b == 3 && !y6c.h(this.K).p()) {
            this.G0 = false;
        }
        if (b == 4) {
            this.G0 = true;
        }
        ArrayList arrayList6 = this.U;
        arrayList6.clear();
        if (n()) {
            int L = (gl.q.x - gl.L(36.0f)) / gl.L(34.0f);
            if (L > 7) {
                L = 7;
            }
            int i7 = 0;
            if (L < 1) {
                L = 1;
            }
            while (i7 < Math.min(arrayList2.size(), L)) {
                arrayList6.add((h19) arrayList2.get(i7));
                i7++;
            }
            if (i7 < arrayList2.size()) {
                this.A0.d(-1, (h19) arrayList2.get(i7));
            }
        } else {
            arrayList6.addAll(arrayList2);
        }
        this.H0 = true;
        for (int i8 = 0; i8 < arrayList6.size(); i8++) {
            if (((h19) arrayList6.get(i8)).g != 0) {
                this.H0 = false;
            }
        }
        ArrayList arrayList7 = this.W;
        arrayList7.clear();
        arrayList7.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < gl.L(200.0f)) {
            getLayoutParams().width = -2;
        }
        c83 c83Var = this.b0;
        t09 t09Var = (t09) c83Var.e;
        ArrayList arrayList8 = t09Var.e;
        ArrayList arrayList9 = t09Var.U;
        ArrayList arrayList10 = t09Var.d;
        arrayList8.clear();
        arrayList8.addAll(arrayList10);
        arrayList10.clear();
        for (int i9 = 0; i9 < arrayList9.size(); i9++) {
            h19 h19Var3 = (h19) arrayList9.get(i9);
            arrayList10.add(new k09(h19Var3.f == null ? 3 : 0, h19Var3));
        }
        if (!t09Var.V.isEmpty() && !na7.q1(t09Var.K).E3()) {
            arrayList10.add(new k09(1, null));
        }
        if (t09Var.n()) {
            arrayList10.add(new k09(2, null));
        }
        if (z) {
            c83Var.E(arrayList8, arrayList10);
        } else {
            c83Var.f();
        }
        if (k27Var == null || (tL_messageReactions = k27Var.k.reactions) == null || tL_messageReactions.results == null) {
            return;
        }
        for (int i10 = 0; i10 < k27Var.k.reactions.results.size(); i10++) {
            if (k27Var.k.reactions.results.get(i10).chosen) {
                this.e0.add(h19.d(k27Var.k.reactions.results.get(i10).reaction));
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
        m43 m43Var = new m43(this.N0, this.u0, this.W, this.e0, this, this.l0, this.a);
        this.y0 = m43Var;
        kl0 kl0Var = this.a1;
        boolean z = true;
        if (kl0Var != null) {
            nl0 nl0Var = this.b1;
            lw9 lw9Var = m43Var.m.g0;
            lw9Var.y = true;
            lw9Var.setBackground(null);
            lw9Var.updateColors();
            lw9Var.invalidate();
            il0 c = kl0Var.c(m43Var.a, null, true);
            c.p(nl0Var);
            ug8.r(c, gl.L(12.0f), 8.0f);
            m43Var.z = c;
        }
        m43 m43Var2 = this.y0;
        s09 s09Var = this.h0;
        if (s09Var != null && !s09Var.r()) {
            z = false;
        }
        m43Var2.m.setLongPressEnabled(z);
        g();
        this.y0.p = new sr8(this, (byte) 8);
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.e().b(this, kk7.k4);
        kk7.f(this.K).b(this, kk7.S);
        if (this.N0 == 5) {
            kk7.f(this.K).b(this, kk7.v3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.k4);
        kk7.f(this.K).n(this, kk7.S);
        if (this.N0 == 5) {
            kk7.f(this.K).n(this, kk7.v3);
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
        boolean j = gba.j();
        ax1 ax1Var = m1;
        if (j) {
            duration = ObjectAnimator.ofFloat(this, ax1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, ax1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new kt7(this, (byte) 1));
        duration.start();
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        if (getAlpha() != f && f == 0.0f) {
            this.D0.clear();
            int i = 0;
            while (true) {
                fu fuVar = this.b;
                if (i >= fuVar.getChildCount()) {
                    break;
                }
                if (fuVar.getChildAt(i) instanceof r09) {
                    ((r09) fuVar.getChildAt(i)).c();
                }
                i++;
            }
        }
        super.setAlpha(f);
    }

    public void setBubbleOffset(float f) {
        this.V0 = f;
    }

    public void setChatScrimView(bd2 bd2Var) {
        this.f1 = bd2Var;
    }

    public void setCurrentAccount(int i) {
        this.K = i;
    }

    public void setCustomEmojiEnterProgress(float f) {
        this.x0 = f;
        bd2 bd2Var = this.f1;
        if (bd2Var != null) {
            bd2Var.setPopupAlpha(1.0f - f);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z) {
        q43 q43Var = this.w0;
        if (!z) {
            q43Var.setBackground(null);
            return;
        }
        int L = gl.L(28.0f);
        int i = bkb.h6;
        zkb.R(q43Var, bkb.h0(L, 0, bm2.o(bkb.w0(null, i, false), 40)), null, zkb.g(i, 40), null);
    }

    public void setDelegate(s09 s09Var) {
        this.h0 = s09Var;
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
            wjb wjbVar = this.l0;
            l46 l46Var = new l46(context, wjbVar);
            this.S0 = l46Var;
            l46Var.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
            this.S0.setClickable(true);
            this.S0.setTextSize(1, 12.0f);
            byte b = this.N0;
            if (b == 1 || b == 2 || b == 4) {
                zkb.X(this.S0, bkb.F6, wjbVar);
                this.S0.setAlpha(0.5f);
            } else {
                zkb.X(this.S0, bkb.y6, wjbVar);
            }
            this.S0.setGravity(1);
            addView(this.S0, nme.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.S0.setText(charSequence);
        this.g1 = false;
        ((FrameLayout.LayoutParams) this.A0.getLayoutParams()).topMargin = gl.L(20.0f);
        ((FrameLayout.LayoutParams) this.b.getLayoutParams()).topMargin = gl.L(20.0f);
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

    public void setParentLayout(bd2 bd2Var) {
        this.K0 = bd2Var;
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
            h19 b2 = h19.b(str);
            hashSet.add(b2);
            this.f0.add(b2);
        }
        gl.d0(this.b, new g09(this, b));
    }

    public void setSelectedReaction(h19 h19Var) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        if (h19Var != null) {
            hashSet.add(h19Var);
        }
        this.b0.f();
    }

    public void setSelectedReactionAnimated(h19 h19Var) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        if (h19Var != null) {
            hashSet.add(h19Var);
        }
        gl.d0(this.b, new g09(this, (byte) 0));
    }

    public void setSelectedReactionInclusive(h19 h19Var) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        if (h19Var != null) {
            hashSet.add(h19Var);
        }
        gl.d0(this.b, new g09(this, (byte) 0));
    }

    public void setSelectedReactions(ArrayList<k27> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.e0;
        hashSet.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            k27 k27Var = arrayList.get(i);
            if (k27Var != null && (tL_messageReactions = k27Var.k.reactions) != null && tL_messageReactions.results != null) {
                for (int i2 = 0; i2 < k27Var.k.reactions.results.size(); i2++) {
                    if (k27Var.k.reactions.results.get(i2).chosen) {
                        hashSet.add(h19.d(k27Var.k.reactions.results.get(i2).reaction));
                    }
                }
            }
        }
        this.b0.f();
    }

    public void setSelectedReactionsInclusive(ArrayList<k27> arrayList) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        hashSet.addAll(f(arrayList));
        gl.d0(this.b, new g09(this, (byte) 0));
    }

    public void setSkipDraw(boolean z) {
        if (this.e1 != z) {
            this.e1 = z;
            if (!z) {
                int i = 0;
                while (true) {
                    fu fuVar = this.b;
                    if (i >= fuVar.getChildCount()) {
                        break;
                    }
                    if (fuVar.getChildAt(i) instanceof r09) {
                        r09 r09Var = (r09) fuVar.getChildAt(i);
                        boolean z2 = r09Var.r;
                        q09 q09Var = r09Var.b;
                        if (z2 && (q09Var.getImageReceiver().y() != null || q09Var.getImageReceiver().m() != null)) {
                            q09Var.setVisibility(0);
                            r09Var.a.setVisibility(4);
                            if (r09Var.s) {
                                r09Var.w = true;
                            }
                        }
                        r09Var.invalidate();
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
            hashSet.add(h19.d(reaction));
        }
        this.b0.f();
    }

    public void setTop(boolean z) {
        this.M = z;
    }

    public void setTransitionProgress(float f) {
        this.w = f;
        bd2 bd2Var = this.K0;
        if (bd2Var != null) {
            if (!this.L0 || !gba.j()) {
                f = 1.0f;
            }
            bd2Var.setReactionsTransitionProgress(f);
        }
        invalidate();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        if (f != getTranslationX()) {
            super.setTranslationX(f);
        }
    }

    @Override // tjb
    public final void updateColors() {
        int v0;
        Paint paint = this.f;
        if (paint != null) {
            try {
                byte b = this.N0;
                if (b != 2 && b != 4 && paint.getColor() != (v0 = bkb.v0(bkb.F8, this.l0))) {
                    int alpha = paint.getAlpha();
                    paint.setColor(v0);
                    paint.setAlpha(alpha);
                    invalidate();
                }
            } catch (Exception e) {
                fa4.g(e, true);
                return;
            }
        }
        oh8 oh8Var = this.v0;
        if (oh8Var != null) {
            oh8Var.setColor(bm2.f(0.7f, bkb.w0(null, bkb.E8, false), bkb.w0(null, bkb.g5, false)));
        }
        if (getWidth() <= 0 || getHeight() <= 0 || this.c1 == bkb.w0(null, bkb.F8, false)) {
            return;
        }
        h();
    }

    public void j() {
    }
}
