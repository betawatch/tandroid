// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class vf3 extends FrameLayout implements gk7, x74 {
    public Paint A0;
    public boolean B0;
    public final float C0;
    public ValueAnimator D0;
    public final ArrayList E;
    public ValueAnimator E0;
    public final rf3 F;
    public float F0;
    public final rf3 G;
    public ValueAnimator G0;
    public final Paint H;
    public float H0;
    public final Paint I;
    public ValueAnimator I0;
    public final ra1 J;
    public float J0;
    public je5 K;
    public OvershootInterpolator K0;
    public boolean L;
    public AnimatorSet L0;
    public int M;
    public final xf4 M0;
    public int N;
    public long N0;
    public float O;
    public Drawable O0;
    public int P;
    public final ArrayList Q;
    public final ArrayList R;
    public final gb3 S;
    public final t26 T;
    public final hn U;
    public final b6 V;
    public final ImageView W;
    public final fm0 a;
    public final ImageView a0;
    public final int b;
    public final tl b0;
    public final Drawable c;
    public final ArrayList c0;
    public final qf3 d;
    public float d0;
    public int e;
    public float e0;
    public final int f;
    public final cj3 f0;
    public CharSequence g0;
    public final pf3 h;
    public boolean h0;
    public int i0;
    public SpannableStringBuilder j0;
    public ValueAnimator k0;
    public tf3 l0;
    public boolean m0;
    public ty8 n;
    public boolean n0;
    public float o0;
    public int p0;
    public uf3 q0;
    public final pf3 r;
    public a r0;
    public final g2b s;
    public ev0 s0;
    public float t0;
    public final float u0;
    public final float v0;
    public final ArrayList w;
    public final float w0;
    public final ArrayList x;
    public final mz2 x0;
    public final ArrayList y;
    public LinearGradient y0;
    public Matrix z0;

    public vf3(Context context, cj3 cj3Var, int i, int i2) {
        super(context);
        this.a = new fm0(1, this, s33.h, 380L, false);
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.E = new ArrayList();
        oh3 oh3Var = (oh3) this;
        byte b = 0;
        rf3 rf3Var = new rf3(oh3Var, false);
        this.F = rf3Var;
        byte b2 = 1;
        rf3 rf3Var2 = new rf3(oh3Var, true);
        this.G = rf3Var2;
        Paint paint = new Paint();
        this.H = new Paint(1);
        this.I = new Paint(1);
        ra1 ra1Var = new ra1(this);
        this.J = ra1Var;
        this.O = -1.0f;
        this.P = -1;
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = -1.0f;
        this.m0 = true;
        this.u0 = 1.0f;
        this.v0 = 0.95f;
        this.w0 = 0.9f;
        this.x0 = new mz2((byte) 11);
        this.C0 = 0.3f;
        this.F0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.K0 = new OvershootInterpolator(0.95f);
        xf4 xf4Var = new xf4(this);
        this.M0 = xf4Var;
        this.b = i2;
        this.f = i;
        this.f0 = cj3Var;
        this.t0 = gl.L(68.0f);
        this.s = na7.q1(i).M1();
        pf3 pf3Var = new pf3(oh3Var, context, b);
        this.h = pf3Var;
        pf3Var.setPadding(gl.L(3.0f), 0, gl.L(3.0f), 0);
        pf3Var.setClipToPadding(false);
        pf3Var.setClipChildren(false);
        ra1Var.h = new mf3(oh3Var, b);
        jc jcVar = new jc(oh3Var, (byte) 27);
        ra1Var.l = true;
        ra1Var.j = jcVar;
        pf3Var.j(new ao2(oh3Var, (byte) 5));
        gb3 gb3Var = new gb3();
        this.S = gb3Var;
        gb3Var.C = false;
        gb3Var.n(150L);
        gb3Var.m = false;
        pf3Var.setItemAnimator(gb3Var);
        t26 t26Var = new t26(0, false);
        this.T = t26Var;
        pf3Var.setLayoutManager(t26Var);
        byte b3 = 20;
        pf3Var.setOnItemClickListener(new u(oh3Var, b3));
        pf3Var.setOnItemLongClickListener(new vu2(oh3Var, b3));
        pf3Var.setAdapter(rf3Var);
        addView(pf3Var, nme.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        hn hnVar = new hn(getContext(), true, true, false);
        this.U = hnVar;
        hnVar.setGravity(3);
        hnVar.setTextColor(getTextLogoColor());
        hnVar.setTypeface(gl.o());
        hnVar.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
        hnVar.setTextSize(gl.L((gl.O1() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        hnVar.setImportantForAccessibility(1);
        hnVar.setFocusableInTouchMode(true);
        addView(hnVar, nme.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.W = imageView;
        imageView.setContentDescription(k96.M0(R.string.AppName, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, nme.c(22.0f, 90));
        tl tlVar = new tl(gl.L(26.0f), null);
        this.b0 = tlVar;
        tlVar.a = true;
        tlVar.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.a0 = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(tlVar);
        addView(imageView2, nme.c(40.0f, 40));
        b6 b6Var = new b6(oh3Var, context, xf4Var);
        this.V = b6Var;
        addView(b6Var, nme.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.L(1.0f));
        this.c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        pf3 pf3Var2 = new pf3(oh3Var, getContext(), b2);
        this.r = pf3Var2;
        getContext();
        pf3Var2.setLayoutManager(new t26(0, false));
        pf3Var2.i(new oq1(b2));
        qf3 qf3Var = new qf3();
        this.d = qf3Var;
        qf3Var.C = false;
        qf3Var.m = false;
        pf3Var2.setItemAnimator(qf3Var);
        pf3Var2.setAdapter(rf3Var2);
        pf3Var2.setClipChildren(false);
        addView(pf3Var2, nme.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        q(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        return this.b == 0 ? f(bkb.z8) : f(bkb.O8);
    }

    private int getTextLogoColor() {
        return f(bkb.Wl);
    }

    public final void b() {
        this.O = 1.0f - gl.R1(1.0f - this.d0, 1.0f, 1.0f - this.e0);
        d();
        float f = this.O;
        byte b = 0;
        int i = f == 1.0f ? 2 : f != 0.0f ? 1 : 0;
        if (this.P != i) {
            this.P = i;
            if (i != 1 && this.L) {
                gl.c3(new kf3(this, b));
            }
            int i2 = this.P;
            pf3 pf3Var = this.r;
            pf3 pf3Var2 = this.h;
            if (i2 == 0) {
                gl.d0(pf3Var2, new bm0((byte) 7));
                pf3Var.setVisibility(4);
                pf3Var2.setVisibility(0);
                if (System.currentTimeMillis() >= this.N0) {
                    this.N0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i3 = this.f;
                if (i2 == 1) {
                    ArrayList arrayList = this.R;
                    arrayList.clear();
                    int i4 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.y;
                        if (i4 >= arrayList2.size()) {
                            break;
                        }
                        if (((sf3) arrayList2.get(i4)).c != y6c.h(i3).e() || m()) {
                            arrayList.add(Long.valueOf(((sf3) arrayList2.get(i4)).c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i4++;
                    }
                    pf3Var.setVisibility(4);
                    pf3Var2.setVisibility(0);
                } else if (i2 == 2) {
                    pf3Var.setVisibility(0);
                    pf3Var2.setVisibility(4);
                    this.T.g1(0, 0);
                    on7 on7Var = na7.q1(i3).M1().K;
                    gl.r(on7Var);
                    on7Var.run();
                    ev0 ev0Var = this.s0;
                    if (ev0Var != null) {
                        ev0Var.a();
                        this.s0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int M0;
        t26 t26Var = this.T;
        int M02 = t26Var.M0() + 10;
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        g2b g2bVar = this.s;
        if (M02 > size || ((M0 = t26Var.M0() + 9) < arrayList.size() && g2bVar.D(0, ((sf3) arrayList.get(M0)).c) == 0)) {
            boolean z = this.b == 1;
            if (z) {
                if (!g2bVar.z) {
                    return;
                }
            } else if (!g2bVar.p) {
                return;
            }
            g2bVar.S(z);
        }
    }

    public final void d() {
        float a = moe.a(Math.min(this.O, this.e0), 0.0f, 1.0f);
        float f = this.a.e;
        float f2 = 1.0f - f;
        float f3 = f * a;
        float f4 = f2 * a;
        hn hnVar = this.U;
        if (hnVar != null) {
            hnVar.setAlpha(f3);
            hnVar.setVisibility(f3 > 0.0f ? 0 : 8);
        }
        ImageView imageView = this.W;
        if (imageView != null) {
            imageView.setAlpha(f4);
            imageView.setVisibility(f4 > 0.0f ? 0 : 8);
        }
        ImageView imageView2 = this.a0;
        if (imageView2 != null) {
            imageView2.setAlpha(f4);
            imageView2.setVisibility(f4 > 0.0f ? 0 : 8);
        }
        b6 b6Var = this.V;
        if (b6Var != null) {
            b6Var.setAlpha(a);
            b6Var.setVisibility(a > 0.0f ? 0 : 8);
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.x5 && this.m0) {
            q(getVisibility() == 0, false);
            gl.c3(new kf3(this, (byte) 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03bf  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i;
        float f;
        float f2;
        pf3 pf3Var;
        float f3;
        float f4;
        pf3 pf3Var2;
        boolean z;
        Canvas canvas2;
        boolean z2;
        float f5;
        double d;
        boolean z3;
        float f6;
        float f7;
        pf3 pf3Var3;
        float L;
        float f8;
        float R1;
        float f9;
        float R12;
        int i2;
        float f10;
        float f11;
        float R13;
        float f12;
        float f13;
        int R;
        canvas.save();
        int i3 = this.M;
        if (i3 > 0) {
            canvas.clipRect(0, i3, getMeasuredWidth(), getMeasuredHeight());
        }
        float measuredHeight = (getMeasuredHeight() - a.getCurrentActionBarHeight()) - gl.L(4.0f);
        float f14 = 0.0f;
        float R14 = gl.R1(0.0f, measuredHeight, this.d0);
        pf3 pf3Var4 = this.h;
        pf3Var4.setTranslationY(R14);
        pf3 pf3Var5 = this.r;
        pf3Var5.setTranslationY(R14);
        pf3Var5.setTranslationX(this.t0);
        int i4 = 0;
        while (true) {
            arrayList = this.Q;
            if (i4 >= arrayList.size()) {
                break;
            }
            ((uf3) arrayList.get(i4)).a = false;
            i4++;
        }
        arrayList.clear();
        int i5 = this.P;
        int i6 = -1;
        ArrayList arrayList2 = this.R;
        if ((i5 == 1 || i5 == 0) && !arrayList2.isEmpty()) {
            i = -1;
            f = 4.0f;
            for (int i7 = 0; i7 < pf3Var4.getChildCount(); i7++) {
                uf3 uf3Var = (uf3) pf3Var4.getChildAt(i7);
                i = uf3Var.F == ((Long) arrayList2.get(0)).longValue() ? RecyclerView.R(uf3Var) : i;
            }
        } else {
            f = 4.0f;
            i = this.P == 2 ? 0 : -1;
        }
        int i8 = this.P;
        if (i8 < 0 || i8 == 2) {
            f2 = R14;
            pf3Var = pf3Var4;
            f3 = 2.0f;
            float f15 = 0.0f;
            for (int i9 = 0; i9 < pf3Var5.getChildCount(); i9++) {
                float x = ((uf3) pf3Var5.getChildAt(i9)).getX() + pf3Var5.getX() + r4.getMeasuredWidth();
                if (f15 == 0.0f || x > f15) {
                    f15 = x;
                }
            }
            f4 = f15;
        } else {
            if (i == -1) {
                t26 t26Var = this.T;
                i = t26Var.H0();
                if (i == -1) {
                    i = t26Var.K0();
                }
                z2 = true;
            } else {
                z2 = false;
            }
            pf3Var4.setAlpha(1.0f - Utilities.i(this.O / this.C0, 1.0f, 0.0f));
            this.p0 = -1;
            if (this.o0 != 0.0f) {
                int i10 = -1;
                int i11 = 0;
                f3 = 2.0f;
                while (i11 < pf3Var4.getChildCount()) {
                    View childAt = pf3Var4.getChildAt(i11);
                    if (childAt.getX() < f14 || childAt.getX() + childAt.getMeasuredWidth() > getMeasuredWidth() || (R = RecyclerView.R(childAt)) < 0 || (i10 != i6 && R >= i10)) {
                        f13 = R14;
                    } else {
                        f13 = R14;
                        if (((sf3) this.y.get(R)).c != y6c.h(this.f).n) {
                            this.q0 = (uf3) childAt;
                            i10 = R;
                        }
                    }
                    i11++;
                    R14 = f13;
                    i6 = -1;
                    f14 = 0.0f;
                }
                f2 = R14;
                this.p0 = i10;
            } else {
                f2 = R14;
                f3 = 2.0f;
            }
            float f16 = 0.0f;
            int i12 = 0;
            while (i12 < pf3Var4.getChildCount()) {
                uf3 uf3Var2 = (uf3) pf3Var4.getChildAt(i12);
                uf3Var2.setClipInParent(false);
                u2b u2bVar = uf3Var2.P;
                int R2 = RecyclerView.R(uf3Var2);
                float f17 = this.O;
                if (R2 < i || R2 >= arrayList2.size() + i) {
                    f5 = measuredHeight;
                } else {
                    int i13 = R2 - i;
                    int i14 = i + 2;
                    float f18 = this.O;
                    if (i13 == i14) {
                        f5 = measuredHeight;
                        f17 = f18;
                    } else if (i13 == i + 1) {
                        f5 = measuredHeight;
                        f17 = (float) Math.pow(f18, 0.5d);
                    } else {
                        f5 = measuredHeight;
                        d = 0.25d;
                        f17 = (float) Math.pow(f18, 0.25d);
                        if (R2 < i) {
                            f17 = (float) Math.pow(this.O, d);
                        }
                        uf3Var2.d(f17, this.e0, this.o0, this.p0 != uf3Var2.b);
                        u2bVar.g = 0.0f;
                        RectF rectF = u2bVar.F;
                        u2bVar.h = 0.0f;
                        u2bVar.i = 0.0f;
                        u2bVar.j = 0.0f;
                        if (R2 > i || R2 >= arrayList2.size() + i) {
                            z3 = z2;
                            f6 = f16;
                            f7 = f17;
                            pf3Var3 = pf3Var4;
                            u2bVar.k = false;
                        } else {
                            uf3 uf3Var3 = (uf3) pf3Var4.getChildAt(i12 - 1);
                            if (uf3Var3 != null) {
                                u2b u2bVar2 = uf3Var3.P;
                                float L2 = gl.L(48.0f);
                                float L3 = gl.L(26.33f);
                                z3 = z2;
                                float R15 = (gl.R1(L2, L3, uf3Var3.K) + gl.L(8.0f)) / f3;
                                float R16 = (gl.R1(L2, L3, uf3Var2.K) + gl.L(8.0f)) / f3;
                                float x2 = uf3Var3.getX() + u2bVar2.F.centerX();
                                float y = uf3Var3.getY() + u2bVar2.F.centerY();
                                float x3 = uf3Var2.getX() + rectF.centerX();
                                float y2 = uf3Var2.getY() + rectF.centerY();
                                float f19 = x3 - x2;
                                float f20 = y2 - y;
                                f6 = f16;
                                if (((float) Math.sqrt((f20 * f20) + (f19 * f19))) < R15 + R16) {
                                    float degrees = (float) Math.toDegrees(Math.acos(r1 / r3) * 2.0d);
                                    f7 = f17;
                                    pf3Var3 = pf3Var4;
                                    float degrees2 = (float) Math.toDegrees(Math.atan2(f20, f19));
                                    float f21 = degrees / f3;
                                    u2bVar2.g = degrees2 - f21;
                                    u2bVar2.h = degrees2 + f21;
                                    float degrees3 = (float) Math.toDegrees(Math.atan2(-f20, -f19));
                                    float f22 = -Math.abs(degrees3 - f21);
                                    float abs = Math.abs(degrees3 + f21);
                                    u2bVar.i = f22;
                                    u2bVar.j = abs;
                                } else {
                                    f7 = f17;
                                    pf3Var3 = pf3Var4;
                                    u2bVar2.g = 0.0f;
                                    u2bVar2.h = 0.0f;
                                    u2bVar.i = 0.0f;
                                    u2bVar.j = 0.0f;
                                }
                                u2bVar2.k = false;
                                u2bVar.k = false;
                            } else {
                                z3 = z2;
                                f6 = f16;
                                f7 = f17;
                                pf3Var3 = pf3Var4;
                            }
                        }
                        L = gl.L(16.0f) * Utilities.i((this.o0 - 0.5f) / 0.5f, 1.0f, 0.0f);
                        float f23 = (float) (((1.0f - r1) * 0.5f) + 0.5d);
                        if (R2 > i) {
                            f8 = 0.0f;
                            R1 = 0.0f;
                        } else if (R2 == i + 1) {
                            R1 = gl.R1(gl.L(16.0f), 0.0f, this.O) + ((gl.L(16.0f) * f7) - gl.N(0.5f));
                            f8 = 0.0f;
                        } else {
                            f8 = 0.0f;
                            R1 = gl.R1(gl.L(32.0f), 0.0f, this.O) + (((gl.L(16.0f) * f7) + gl.L(16.0f)) - gl.N(0.5f));
                        }
                        float f24 = R1 + this.t0;
                        if (this.B0) {
                            if (this.o0 > f8) {
                                int i15 = uf3Var2.b;
                                int i16 = this.p0;
                                if (i15 < i16) {
                                    f12 = -L;
                                } else if (i15 > i16) {
                                    f12 = L;
                                }
                                R12 = gl.R1(f24 - uf3Var2.getLeft(), f12, 1.0f - this.J0);
                                f9 = 0.0f;
                            }
                            f12 = 0.0f;
                            R12 = gl.R1(f24 - uf3Var2.getLeft(), f12, 1.0f - this.J0);
                            f9 = 0.0f;
                        } else {
                            f9 = 0.0f;
                            R12 = gl.R1(0.0f, f24 - uf3Var2.getLeft(), this.K0.getInterpolation(this.F0));
                        }
                        float a = moe.a((this.d0 - 0.2f) / 0.1f, f9, 1.0f);
                        i2 = R2 - i;
                        if (i2 != 0) {
                            f10 = 0.65f;
                            R13 = gl.R1(f9, f2 - f5, s33.h.getInterpolation(this.O));
                        } else {
                            f10 = 0.65f;
                            if (i2 == 1) {
                                R13 = gl.R1(f9, (f2 - f5) * 0.65f, s33.h.getInterpolation(this.O));
                            } else {
                                f11 = f9;
                                float f25 = (uf3Var2.b == this.p0 || this.o0 <= f9) ? 0.0f : (-L) / f3;
                                float R17 = gl.R1(i2 == 0 ? gl.R1(f25, f2 - f5, this.H0) : i2 == 1 ? gl.R1(f25, (f2 - f5) * f10, this.H0) : 0.0f, f11, a);
                                if (this.O > 0.0f) {
                                    boolean z4 = R2 >= i && R2 <= i + 2;
                                    if (!z3) {
                                        uf3Var2.setCrossfadeTo(-1L);
                                    } else if (i2 < 0 || i2 >= arrayList2.size()) {
                                        uf3Var2.setCrossfadeTo(-1L);
                                    } else {
                                        uf3Var2.setCrossfadeTo(((Long) arrayList2.get(i2)).longValue());
                                    }
                                    uf3Var2.a = z4;
                                    uf3Var2.d = R2 == i;
                                    uf3Var2.c = R2 >= (arrayList2.size() + i) + (-1);
                                    uf3Var2.setTranslationX(R12);
                                    uf3Var2.setTranslationY(R17);
                                    if (z4) {
                                        arrayList.add(uf3Var2);
                                    }
                                } else if (pf3Var3.getItemAnimator() == null || !pf3Var3.getItemAnimator().k()) {
                                    if (this.o0 > 0.0f) {
                                        int i17 = uf3Var2.b;
                                        int i18 = this.p0;
                                        if (i17 < i18) {
                                            uf3Var2.setAlpha(f23);
                                        } else if (i17 > i18) {
                                            uf3Var2.setAlpha(f23);
                                        } else {
                                            uf3Var2.setAlpha(1.0f);
                                        }
                                    } else {
                                        uf3Var2.setAlpha(1.0f);
                                    }
                                    uf3Var2.setTranslationX(R12);
                                    uf3Var2.setTranslationY(R17);
                                }
                                if (uf3Var2.a) {
                                    float L4 = (gl.L(70.0f) / f3) + (uf3Var2.getMeasuredWidth() / f3) + uf3Var2.getX() + pf3Var3.getX();
                                    if (f6 == 0.0f || L4 > f6) {
                                        f16 = L4;
                                        i12++;
                                        measuredHeight = f5;
                                        z2 = z3;
                                        pf3Var4 = pf3Var3;
                                    }
                                }
                                f16 = f6;
                                i12++;
                                measuredHeight = f5;
                                z2 = z3;
                                pf3Var4 = pf3Var3;
                            }
                        }
                        f11 = R13;
                        if (uf3Var2.b == this.p0) {
                        }
                        float R172 = gl.R1(i2 == 0 ? gl.R1(f25, f2 - f5, this.H0) : i2 == 1 ? gl.R1(f25, (f2 - f5) * f10, this.H0) : 0.0f, f11, a);
                        if (this.O > 0.0f) {
                        }
                        if (uf3Var2.a) {
                        }
                        f16 = f6;
                        i12++;
                        measuredHeight = f5;
                        z2 = z3;
                        pf3Var4 = pf3Var3;
                    }
                }
                d = 0.25d;
                if (R2 < i) {
                }
                uf3Var2.d(f17, this.e0, this.o0, this.p0 != uf3Var2.b);
                u2bVar.g = 0.0f;
                RectF rectF2 = u2bVar.F;
                u2bVar.h = 0.0f;
                u2bVar.i = 0.0f;
                u2bVar.j = 0.0f;
                if (R2 > i) {
                }
                z3 = z2;
                f6 = f16;
                f7 = f17;
                pf3Var3 = pf3Var4;
                u2bVar.k = false;
                L = gl.L(16.0f) * Utilities.i((this.o0 - 0.5f) / 0.5f, 1.0f, 0.0f);
                float f232 = (float) (((1.0f - r1) * 0.5f) + 0.5d);
                if (R2 > i) {
                }
                float f242 = R1 + this.t0;
                if (this.B0) {
                }
                float a2 = moe.a((this.d0 - 0.2f) / 0.1f, f9, 1.0f);
                i2 = R2 - i;
                if (i2 != 0) {
                }
                f11 = R13;
                if (uf3Var2.b == this.p0) {
                }
                float R1722 = gl.R1(i2 == 0 ? gl.R1(f25, f2 - f5, this.H0) : i2 == 1 ? gl.R1(f25, (f2 - f5) * f10, this.H0) : 0.0f, f11, a2);
                if (this.O > 0.0f) {
                }
                if (uf3Var2.a) {
                }
                f16 = f6;
                i12++;
                measuredHeight = f5;
                z2 = z3;
                pf3Var4 = pf3Var3;
            }
            f4 = f16;
            pf3Var = pf3Var4;
        }
        if (this.K != null) {
            float U1 = gl.U1(s33.g.getInterpolation(this.O), 29, 74);
            pf3Var2 = pf3Var;
            z = false;
            if (pf3Var.getChildCount() > 0) {
                U1 += pf3Var2.getChildAt(0).getLeft();
            }
            this.K.n(0.0f, U1);
        } else {
            pf3Var2 = pf3Var;
            z = false;
        }
        float min = Math.min(this.O, this.e0);
        float visibleItemsMeasuredWidthWithAlpha = (this.r0.F.getVisibleItemsMeasuredWidthWithAlpha() * min) - gl.L(6.0f);
        boolean z5 = (min == 0.0f || visibleItemsMeasuredWidthWithAlpha <= 0.0f) ? z : true;
        if (z5) {
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, getWidth() - visibleItemsMeasuredWidthWithAlpha, getHeight());
        } else {
            canvas2 = canvas;
        }
        if (min != 0.0f) {
            b6 b6Var = this.V;
            float totalVisibility = b6Var.getTotalVisibility() * (-gl.L(10.0f));
            hn hnVar = this.U;
            hnVar.setPivotX(0.0f);
            hnVar.setScaleX(gl.R1(1.0f, 0.95f, b6Var.getTotalVisibility()));
            hnVar.setScaleY(gl.R1(1.0f, 0.95f, b6Var.getTotalVisibility()));
            float L5 = f2 - ((gl.L(56.0f) - a.getCurrentActionBarHeight()) / f3);
            hnVar.setTranslationY((((gl.L(14.0f) + L5) - ((hnVar.getMeasuredHeight() - hnVar.getTextHeight()) / f3)) + gl.L(f)) - (b6Var.getTotalVisibility() * gl.L(6.0f)));
            int L6 = gl.L(72.0f);
            float f26 = this.O;
            float R18 = gl.R1(gl.L(48.0f), gl.L(26.33f), f26) / f3;
            float i19 = ir2.i(R18, f3, gl.R1((L6 / f3) - R18, 0.0f, f26), -L6) + gl.L(12.0f) + f4;
            hnVar.setTranslationX(i19);
            gn drawable = hnVar.getDrawable();
            drawable.O = (this.r0.F.getVisibleItemsMeasuredWidthWithAlpha() * min) + (i19 - gl.L(12.0f));
            drawable.invalidateSelf();
            float translationX = hnVar.getTranslationX() + gl.L(1.0f);
            ImageView imageView = this.W;
            imageView.setTranslationX(translationX);
            imageView.setTranslationY(gl.L(22.333f) + L5 + totalVisibility);
            float translationX2 = (hnVar.getTranslationX() - gl.N(3.33f)) + imageView.getMeasuredWidth();
            ImageView imageView2 = this.a0;
            imageView2.setTranslationX(translationX2);
            imageView2.setTranslationY(gl.L(11.333f) + L5 + totalVisibility);
            b6Var.setTranslationX(hnVar.getTranslationX());
            b6Var.setTranslationY(L5 + gl.L(31.333f));
        }
        super.dispatchDraw(canvas);
        int i20 = this.P;
        if (i20 >= 0 && i20 != 2) {
            Collections.sort(arrayList, this.x0);
            for (int i21 = 0; i21 < arrayList.size(); i21++) {
                uf3 uf3Var4 = (uf3) arrayList.get(i21);
                canvas2.save();
                canvas2.translate(uf3Var4.getX() + pf3Var2.getX(), uf3Var4.getY() + pf3Var2.getY());
                uf3Var4.draw(canvas2);
                canvas2.restore();
            }
        }
        if (z5) {
            float L7 = gl.L(16.0f);
            if (this.y0 == null) {
                this.y0 = new LinearGradient(0.0f, 0.0f, L7, 0.0f, new int[]{16711680, -65536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.z0 = new Matrix();
                Paint paint = new Paint(1);
                this.A0 = paint;
                paint.setShader(this.y0);
                this.A0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            this.z0.reset();
            this.z0.postTranslate((getWidth() - visibleItemsMeasuredWidthWithAlpha) - L7, 0.0f);
            this.y0.setLocalMatrix(this.z0);
            canvas.drawRect((getWidth() - visibleItemsMeasuredWidthWithAlpha) - L7, 0.0f, (getWidth() - visibleItemsMeasuredWidthWithAlpha) + gl.L(1.0f), getHeight(), this.A0);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    public final uf3 e(long j) {
        pf3 pf3Var = this.P == 2 ? this.r : this.h;
        for (int i = 0; i < pf3Var.getChildCount(); i++) {
            View childAt = pf3Var.getChildAt(i);
            if (childAt instanceof uf3) {
                uf3 uf3Var = (uf3) childAt;
                if (uf3Var.F == j) {
                    return uf3Var;
                }
            }
        }
        return null;
    }

    public final int f(int i) {
        cj3 cj3Var = this.f0;
        return (cj3Var == null || cj3Var.getResourceProvider() == null) ? bkb.w0(null, i, false) : cj3Var.getThemedColor(i);
    }

    public final boolean g() {
        int i = this.P;
        return i == 0 || i == 1;
    }

    public float getCollapsedProgress() {
        return this.O;
    }

    public float getOverScrollCoef() {
        return this.u0;
    }

    public je5 getPremiumHint() {
        return this.K;
    }

    public final void h() {
        if (this.s.I()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(y6c.h(this.f).n));
            this.f0.getOrCreateStoryViewer().K(getContext(), null, arrayList, 0, null, null, p2b.a(this.r), false);
        }
    }

    public final void i(uf3 uf3Var, boolean z) {
        ValueAnimator valueAnimator;
        if ((z && (valueAnimator = this.I0) != null && valueAnimator.isRunning()) || uf3Var == null) {
            return;
        }
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        boolean z2 = uf3Var.G;
        g2b g2bVar = this.s;
        if (z2 && !g2bVar.I()) {
            if (na7.q1(this.f).c5()) {
                j(0L);
                return;
            } else {
                n();
                return;
            }
        }
        if (g2bVar.J(uf3Var.F) || g2bVar.L(uf3Var.F)) {
            TL_stories.PeerStories x = g2bVar.x(uf3Var.F);
            long j = uf3Var.F;
            ev0 ev0Var = this.s0;
            if (ev0Var != null) {
                ev0Var.a();
                this.s0 = null;
            }
            de2 de2Var = new de2((Object) this, (Object) uf3Var, j, (byte) 20);
            if (z) {
                de2Var.run();
                return;
            }
            ev0 n = x2b.n(x, de2Var);
            uf3Var.e = n;
            this.s0 = n;
            if (n != null) {
                g2bVar.g0(uf3Var.F, true);
            }
        }
    }

    public final void j(long j) {
        uf3 uf3Var;
        wx n;
        cj3 cj3Var = this.f0;
        int i = this.f;
        if (j == 0 && (n = na7.q1(i).M1().n()) != null && n.a(i, 1)) {
            cj3Var.showDialog(new h26(n.b(), this.f, null, getContext(), this.f0));
            return;
        }
        int i2 = 0;
        while (true) {
            pf3 pf3Var = this.h;
            if (i2 >= pf3Var.getChildCount()) {
                uf3Var = null;
                break;
            }
            uf3Var = (uf3) pf3Var.getChildAt(i2);
            if (j != 0) {
                if (uf3Var.F == j) {
                    break;
                } else {
                    i2++;
                }
            } else if (uf3Var.G) {
                break;
            } else {
                i2++;
            }
        }
        if (uf3Var == null) {
            return;
        }
        if (j == 0) {
            t7b.C(cj3Var.getParentActivity(), i).Q(o7b.c(uf3Var));
            return;
        }
        wjb resourceProvider = cj3Var != null ? cj3Var.getResourceProvider() : null;
        hd hdVar = new hd(3, resourceProvider, getContext());
        hdVar.q(500L);
        na7.q1(i).M1().j(j, new s0c((Object) this, (Object) hdVar, j, (Object) uf3Var, (byte) 2), true, resourceProvider);
    }

    public final boolean k(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.y;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            }
            if (((sf3) arrayList.get(i)).c == j) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            t26 t26Var = this.T;
            if (i < t26Var.H0()) {
                t26Var.g1(i, 0);
                return true;
            }
            if (i > t26Var.L0()) {
                t26Var.h1(i, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(boolean z, float f) {
        if (this.d0 != f) {
            this.d0 = f;
            b();
            final byte b = 0;
            final byte b2 = 1;
            boolean z2 = f > this.C0;
            if (z2 != this.B0) {
                this.B0 = z2;
                AnimatorSet animatorSet = this.L0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    this.L0.cancel();
                    this.L0 = null;
                }
                if (!z) {
                    this.e0 = z2 ? 1.0f : 0.0f;
                    b();
                    gl.d0(this.h, new bm0((byte) 8));
                    return;
                }
                final byte b3 = 2;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e0, z2 ? 1.0f : 0.0f);
                this.D0 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: jf3
                    public final /* synthetic */ vf3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b4 = b;
                        vf3 vf3Var = this.b;
                        switch (b4) {
                            case 0:
                                vf3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vf3Var.b();
                                break;
                            case 1:
                                vf3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                vf3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                vf3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vf3Var.invalidate();
                                break;
                        }
                    }
                });
                this.D0.setInterpolator(s33.h);
                float f2 = this.d0;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f2, z2 ? f2 : 0.0f);
                this.G0 = ofFloat2;
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: jf3
                    public final /* synthetic */ vf3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b4 = b2;
                        vf3 vf3Var = this.b;
                        switch (b4) {
                            case 0:
                                vf3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vf3Var.b();
                                break;
                            case 1:
                                vf3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                vf3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                vf3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vf3Var.invalidate();
                                break;
                        }
                    }
                });
                this.G0.setDuration(100L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.L0 = animatorSet2;
                animatorSet2.addListener(new y7((byte) 28, (Object) this, z2));
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.D0);
                arrayList.add(this.G0);
                if (this.B0) {
                    this.L0.setDuration(1000L);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.e0, z2 ? 1.0f : 0.0f);
                    this.E0 = ofFloat3;
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: jf3
                        public final /* synthetic */ vf3 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b4 = b3;
                            vf3 vf3Var = this.b;
                            switch (b4) {
                                case 0:
                                    vf3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vf3Var.b();
                                    break;
                                case 1:
                                    vf3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    break;
                                case 2:
                                    vf3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    break;
                                default:
                                    vf3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vf3Var.invalidate();
                                    break;
                            }
                        }
                    });
                    OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.v0);
                    this.K0 = overshootInterpolator;
                    this.E0.setInterpolator(overshootInterpolator);
                    this.E0.setDuration(750L);
                    arrayList.add(this.E0);
                } else {
                    this.I0 = ValueAnimator.ofFloat(this.e0, z2 ? 1.0f : 0.0f);
                    this.I0.setInterpolator(new OvershootInterpolator(this.w0));
                    this.I0.setDuration(350L);
                    final byte b4 = 3;
                    this.I0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: jf3
                        public final /* synthetic */ vf3 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b42 = b4;
                            vf3 vf3Var = this.b;
                            switch (b42) {
                                case 0:
                                    vf3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vf3Var.b();
                                    break;
                                case 1:
                                    vf3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    break;
                                case 2:
                                    vf3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    break;
                                default:
                                    vf3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vf3Var.invalidate();
                                    break;
                            }
                        }
                    });
                    arrayList.add(this.I0);
                }
                this.L0.playTogether(arrayList);
                this.L0.start();
            }
        }
    }

    public final boolean m() {
        long j = y6c.h(this.f).n;
        g2b g2bVar = this.s;
        if (g2bVar.K(j)) {
            return true;
        }
        return g2bVar.I() && g2bVar.g.size() <= 3;
    }

    public final void n() {
        je5 je5Var = this.K;
        if (je5Var == null) {
            je5 je5Var2 = new je5(getContext(), 1);
            je5Var2.i(f(bkb.vj));
            je5Var2.p(true);
            je5Var2.L = Layout.Alignment.ALIGN_CENTER;
            je5Var2.n(0.0f, 29.0f);
            this.K = je5Var2;
            SpannableStringBuilder N2 = gl.N2(k96.N0("StoriesPremiumHint2").replace('\n', ' '), bkb.wj, 0, new kf3(this, (byte) 1), null);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) N2.getSpans(0, N2.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                N2.setSpan(new z3c(gl.o()), N2.getSpanStart(clickableSpanArr[0]), N2.getSpanEnd(clickableSpanArr[0]), 33);
            }
            je5 je5Var3 = this.K;
            je5Var3.h = je5.a(N2, je5Var3.getTextPaint());
            this.K.t(N2);
            this.K.setPadding(gl.L(8.0f), gl.L(24.0f), gl.L(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.K, nme.e(-1, kk7.f2, 51));
            }
            je5Var = this.K;
        }
        if (je5Var != null) {
            if (je5Var.W) {
                pw0.E.a();
            }
            this.K.v();
        }
    }

    public final void o() {
        kz4 kz4Var = x2b.b;
        byte b = 0;
        if (kz4Var != null) {
            kz4Var.d(bkb.w0(null, bkb.bl, false), bkb.w0(null, bkb.cl, false), 0, 0);
        }
        kz4 kz4Var2 = x2b.c;
        if (kz4Var2 != null) {
            kz4Var2.d(bkb.w0(null, bkb.dl, false), bkb.w0(null, bkb.el, false), 0, 0);
        }
        kz4[] kz4VarArr = x2b.a;
        kz4 kz4Var3 = kz4VarArr[0];
        if (kz4Var3 != null) {
            kz4Var3.d(bkb.w0(null, bkb.Zk, false), bkb.w0(null, bkb.al, false), 0, 0);
        }
        kz4 kz4Var4 = kz4VarArr[1];
        if (kz4Var4 != null) {
            kz4Var4.d(bkb.w0(null, bkb.Xk, false), bkb.w0(null, bkb.Yk, false), 0, 0);
        }
        if (x2b.d != null) {
            int w0 = bkb.w0(null, bkb.nk, false);
            int w02 = bkb.w0(null, bkb.p7, false);
            x2b.d.d(bm2.f(0.25f, w0, w02), w02, 0, 0);
        }
        int textColor = getTextColor();
        this.U.setTextColor(getTextLogoColor());
        b6 b6Var = this.V;
        if (b6Var != null) {
            b6Var.b();
        }
        this.W.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        gl.d0(this.h, new lf3(textColor, b));
        gl.d0(this.r, new bm0((byte) 9));
        try {
            tl tlVar = this.b0;
            if (tlVar != null) {
                tlVar.k(Integer.valueOf(f(bkb.pi)));
            }
            ImageView imageView = this.a0;
            if (imageView != null) {
                imageView.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q(false, false);
        kk7.f(this.f).b(this, kk7.x5);
        xf4 xf4Var = this.M0;
        xf4Var.a = true;
        AnimatorSet animatorSet = (AnimatorSet) xf4Var.d;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.b0.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.f).n(this, kk7.x5);
        xf4 xf4Var = this.M0;
        xf4Var.a = false;
        ((AnimatorSet) xf4Var.d).cancel();
        ev0 ev0Var = this.s0;
        if (ev0Var != null) {
            ev0Var.a();
            this.s0 = null;
        }
        this.b0.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.U.setTextSize(gl.L((gl.O1() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        this.N = gl.L(70.0f);
        gl.P.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(89.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.P == 2) {
            int L = gl.L((this.E.size() * 26.33f) - (Math.max(0, r0 - 1) * 16.0f));
            pf3 pf3Var = this.r;
            int x = (int) pf3Var.getX();
            int y = (int) pf3Var.getY();
            int x2 = (int) (pf3Var.getX() + L);
            int y2 = (int) (pf3Var.getY() + pf3Var.getHeight());
            ra1 ra1Var = this.J;
            ra1Var.getClass();
            RectF rectF = gl.P;
            rectF.set(x, y, x2, y2);
            ra1Var.i = false;
            ra1Var.c = 0;
            ra1Var.a(rectF);
            if (ra1Var.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 1) {
            d();
        }
    }

    public final void q(boolean z, boolean z2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z3;
        if ((this.P == 1 || this.o0 != 0.0f) && !z2) {
            this.L = true;
            return;
        }
        ArrayList arrayList3 = this.w;
        arrayList3.clear();
        ArrayList arrayList4 = this.y;
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = this.x;
        arrayList5.clear();
        ArrayList arrayList6 = this.E;
        arrayList5.addAll(arrayList6);
        arrayList4.clear();
        int i = this.b;
        int i2 = this.f;
        g2b g2bVar = this.s;
        if (i != 1) {
            arrayList4.add(new sf3(y6c.h(i2).e()));
            arrayList = g2bVar.g;
        } else {
            arrayList = g2bVar.h;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            long n = cf3.n(((TL_stories.PeerStories) arrayList.get(i3)).peer);
            if (n != y6c.h(i2).e()) {
                arrayList4.add(new sf3(n));
            }
        }
        int size = arrayList4.size();
        if (!g2bVar.I()) {
            size--;
        }
        int max = Math.max(1, Math.max(g2bVar.C(i == 1), size));
        this.g0 = null;
        boolean H = g2bVar.H();
        hn hnVar = this.U;
        if (H) {
            arrayList2 = arrayList4;
            if (g2bVar.L(y6c.h(i2).e())) {
                String M0 = k96.M0(2131743561, null);
                if (M0.indexOf("…") > 0) {
                    SpannableStringBuilder spannableStringBuilder = this.j0;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = SpannableStringBuilder.valueOf(M0);
                        q6c q6cVar = new q6c();
                        spannableStringBuilder.setSpan(q6cVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                        q6cVar.a = hnVar;
                        q6cVar.n = true;
                        this.j0 = spannableStringBuilder;
                    }
                    this.g0 = spannableStringBuilder;
                } else {
                    this.g0 = M0;
                }
            } else {
                this.g0 = this.t0 < ((float) gl.L(50.0f)) ? null : k96.M0(2131748109, null);
            }
        } else {
            arrayList2 = arrayList4;
            this.g0 = this.t0 < ((float) gl.L(50.0f)) ? null : k96.G(max, "Stories", new Object[0]);
        }
        if (this.h0) {
            z3 = true;
        } else {
            z3 = true;
            hnVar.c(this.g0, z && !k96.a0, true);
        }
        this.a.a((!TextUtils.isEmpty(this.g0) || this.h0) ? z3 : false, z);
        arrayList6.clear();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            if (((sf3) arrayList2.get(i4)).c != y6c.h(i2).n || m()) {
                arrayList6.add((sf3) arrayList2.get(i4));
                if (arrayList6.size() >= 3) {
                    break;
                }
            }
        }
        pf3 pf3Var = this.h;
        pf3 pf3Var2 = this.r;
        if (!z) {
            pf3Var.setItemAnimator(null);
            pf3Var2.setItemAnimator(null);
        } else if (this.P == 2) {
            pf3Var2.setItemAnimator(this.d);
            pf3Var.setItemAnimator(null);
        } else {
            pf3Var.setItemAnimator(this.S);
            pf3Var2.setItemAnimator(null);
        }
        this.F.E(arrayList3, arrayList2);
        this.G.E(arrayList5, arrayList6);
        arrayList3.clear();
        invalidate();
    }

    public void setActionBar(a aVar) {
        this.r0 = aVar;
    }

    public void setClipTop(int i) {
        if (i < 0) {
            i = 0;
        }
        if (this.M != i) {
            this.M = i;
            invalidate();
        }
    }

    public void setMenuItemsOffset(float f) {
        this.t0 = f;
    }

    public void setOverscroll(float f) {
        this.o0 = f / gl.L(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f) {
        l(true, f);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        je5 je5Var = this.K;
        if (je5Var != null) {
            je5Var.setTranslationY(f);
        }
    }

    @Override // x74
    public final void F(float f, int i) {
    }
}
