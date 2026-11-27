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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class pg3 extends FrameLayout implements fn7, s84 {
    public Paint A0;
    public boolean B0;
    public final float C0;
    public ValueAnimator D0;
    public final ArrayList E;
    public ValueAnimator E0;
    public final lg3 F;
    public float F0;
    public final lg3 G;
    public ValueAnimator G0;
    public final Paint H;
    public float H0;
    public final Paint I;
    public ValueAnimator I0;
    public final za1 J;
    public float J0;
    public kg5 K;
    public OvershootInterpolator K0;
    public boolean L;
    public AnimatorSet L0;
    public int M;
    public final vh4 M0;
    public int N;
    public long N0;
    public float O;
    public Drawable O0;
    public int P;
    public final ArrayList Q;
    public final ArrayList R;
    public final zb3 S;
    public final x46 T;
    public final in U;
    public final c6 V;
    public final ImageView W;
    public final fm0 a;
    public final ImageView a0;
    public final int b;
    public final ul b0;
    public final Drawable c;
    public final ArrayList c0;
    public final kg3 d;
    public float d0;
    public int e;
    public float e0;
    public final int f;
    public final uj3 f0;
    public CharSequence g0;
    public final jg3 h;
    public boolean h0;
    public int i0;
    public SpannableStringBuilder j0;
    public ValueAnimator k0;
    public ng3 l0;
    public boolean m0;
    public g29 n;
    public boolean n0;
    public float o0;
    public int p0;
    public og3 q0;
    public final jg3 r;
    public a r0;
    public final c6b s;
    public pv0 s0;
    public float t0;
    public final float u0;
    public final float v0;
    public final ArrayList w;
    public final float w0;
    public final ArrayList x;
    public final f03 x0;
    public final ArrayList y;
    public LinearGradient y0;
    public Matrix z0;

    public pg3(Context context, uj3 uj3Var, int i, int i2) {
        super(context);
        this.a = new fm0(1, this, k43.h, 380L, false);
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.E = new ArrayList();
        ii3 ii3Var = (ii3) this;
        byte b = 0;
        lg3 lg3Var = new lg3(ii3Var, false);
        this.F = lg3Var;
        byte b2 = 1;
        lg3 lg3Var2 = new lg3(ii3Var, true);
        this.G = lg3Var2;
        Paint paint = new Paint();
        this.H = new Paint(1);
        this.I = new Paint(1);
        za1 za1Var = new za1(this);
        this.J = za1Var;
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
        this.x0 = new f03((byte) 11);
        this.C0 = 0.3f;
        this.F0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.K0 = new OvershootInterpolator(0.95f);
        vh4 vh4Var = new vh4(this);
        this.M0 = vh4Var;
        this.b = i2;
        this.f = i;
        this.f0 = uj3Var;
        this.t0 = hl.L(68.0f);
        this.s = uc7.s1(i).O1();
        jg3 jg3Var = new jg3(ii3Var, context, b);
        this.h = jg3Var;
        jg3Var.setPadding(hl.L(3.0f), 0, hl.L(3.0f), 0);
        jg3Var.setClipToPadding(false);
        jg3Var.setClipChildren(false);
        za1Var.h = new gg3(ii3Var, b);
        kc kcVar = new kc(ii3Var, (byte) 27);
        za1Var.l = true;
        za1Var.j = kcVar;
        jg3Var.j(new to2(ii3Var, (byte) 5));
        zb3 zb3Var = new zb3();
        this.S = zb3Var;
        zb3Var.C = false;
        zb3Var.n(150L);
        zb3Var.m = false;
        jg3Var.setItemAnimator(zb3Var);
        x46 x46Var = new x46(0, false);
        this.T = x46Var;
        jg3Var.setLayoutManager(x46Var);
        jg3Var.setOnItemClickListener(new u(ii3Var, (byte) 20));
        jg3Var.setOnItemLongClickListener(new ht2(ii3Var, (byte) 22));
        jg3Var.setAdapter(lg3Var);
        addView(jg3Var, tre.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        in inVar = new in(getContext(), true, true, false);
        this.U = inVar;
        inVar.setGravity(3);
        inVar.setTextColor(getTextLogoColor());
        inVar.setTypeface(hl.o());
        inVar.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        inVar.setTextSize(hl.L((hl.O1() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        inVar.setImportantForAccessibility(1);
        inVar.setFocusableInTouchMode(true);
        addView(inVar, tre.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.W = imageView;
        imageView.setContentDescription(ob6.M0(R.string.AppName, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, tre.c(22.0f, 90));
        ul ulVar = new ul(hl.L(26.0f), null);
        this.b0 = ulVar;
        ulVar.a = true;
        ulVar.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.a0 = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(ulVar);
        addView(imageView2, tre.c(40.0f, 40));
        c6 c6Var = new c6(ii3Var, context, vh4Var);
        this.V = c6Var;
        addView(c6Var, tre.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(1.0f));
        this.c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        jg3 jg3Var2 = new jg3(ii3Var, getContext(), b2);
        this.r = jg3Var2;
        getContext();
        jg3Var2.setLayoutManager(new x46(0, false));
        jg3Var2.i(new br1(b2));
        kg3 kg3Var = new kg3();
        this.d = kg3Var;
        kg3Var.C = false;
        kg3Var.m = false;
        jg3Var2.setItemAnimator(kg3Var);
        jg3Var2.setAdapter(lg3Var2);
        jg3Var2.setClipChildren(false);
        addView(jg3Var2, tre.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        return this.b == 0 ? f(aob.A8) : f(aob.P8);
    }

    private int getTextLogoColor() {
        return f(aob.Xl);
    }

    public final void b() {
        this.O = 1.0f - hl.R1(1.0f - this.d0, 1.0f, 1.0f - this.e0);
        d();
        float f = this.O;
        byte b = 0;
        int i = f == 1.0f ? 2 : f != 0.0f ? 1 : 0;
        if (this.P != i) {
            this.P = i;
            if (i != 1 && this.L) {
                hl.c3(new eg3(this, b));
            }
            int i2 = this.P;
            jg3 jg3Var = this.r;
            jg3 jg3Var2 = this.h;
            if (i2 == 0) {
                hl.d0(jg3Var2, new bm0((byte) 7));
                jg3Var.setVisibility(4);
                jg3Var2.setVisibility(0);
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
                        if (((mg3) arrayList2.get(i4)).c != yac.h(i3).e() || m()) {
                            arrayList.add(Long.valueOf(((mg3) arrayList2.get(i4)).c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i4++;
                    }
                    jg3Var.setVisibility(4);
                    jg3Var2.setVisibility(0);
                } else if (i2 == 2) {
                    jg3Var.setVisibility(0);
                    jg3Var2.setVisibility(4);
                    this.T.g1(0, 0);
                    oe7 oe7Var = uc7.s1(i3).O1().K;
                    hl.r(oe7Var);
                    oe7Var.run();
                    pv0 pv0Var = this.s0;
                    if (pv0Var != null) {
                        pv0Var.a();
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
        x46 x46Var = this.T;
        int M02 = x46Var.M0() + 10;
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        c6b c6bVar = this.s;
        if (M02 > size || ((M0 = x46Var.M0() + 9) < arrayList.size() && c6bVar.D(0, ((mg3) arrayList.get(M0)).c) == 0)) {
            boolean z = this.b == 1;
            if (z) {
                if (!c6bVar.z) {
                    return;
                }
            } else if (!c6bVar.p) {
                return;
            }
            c6bVar.S(z);
        }
    }

    public final void d() {
        float a = ete.a(Math.min(this.O, this.e0), 0.0f, 1.0f);
        float f = this.a.e;
        float f2 = 1.0f - f;
        float f3 = f * a;
        float f4 = f2 * a;
        in inVar = this.U;
        if (inVar != null) {
            inVar.setAlpha(f3);
            inVar.setVisibility(f3 > 0.0f ? 0 : 8);
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
        c6 c6Var = this.V;
        if (c6Var != null) {
            c6Var.setAlpha(a);
            c6Var.setVisibility(a > 0.0f ? 0 : 8);
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.y5 && this.m0) {
            p(getVisibility() == 0, false);
            hl.c3(new eg3(this, (byte) 2));
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
        jg3 jg3Var;
        float f3;
        float f4;
        jg3 jg3Var2;
        boolean z;
        Canvas canvas2;
        boolean z2;
        float f5;
        double d;
        boolean z3;
        float f6;
        float f7;
        jg3 jg3Var3;
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
        int S;
        canvas.save();
        int i3 = this.M;
        if (i3 > 0) {
            canvas.clipRect(0, i3, getMeasuredWidth(), getMeasuredHeight());
        }
        float measuredHeight = (getMeasuredHeight() - a.getCurrentActionBarHeight()) - hl.L(4.0f);
        float f14 = 0.0f;
        float R14 = hl.R1(0.0f, measuredHeight, this.d0);
        jg3 jg3Var4 = this.h;
        jg3Var4.setTranslationY(R14);
        jg3 jg3Var5 = this.r;
        jg3Var5.setTranslationY(R14);
        jg3Var5.setTranslationX(this.t0);
        int i4 = 0;
        while (true) {
            arrayList = this.Q;
            if (i4 >= arrayList.size()) {
                break;
            }
            ((og3) arrayList.get(i4)).a = false;
            i4++;
        }
        arrayList.clear();
        int i5 = this.P;
        int i6 = -1;
        ArrayList arrayList2 = this.R;
        if ((i5 == 1 || i5 == 0) && !arrayList2.isEmpty()) {
            i = -1;
            f = 4.0f;
            for (int i7 = 0; i7 < jg3Var4.getChildCount(); i7++) {
                og3 og3Var = (og3) jg3Var4.getChildAt(i7);
                i = og3Var.F == ((Long) arrayList2.get(0)).longValue() ? RecyclerView.S(og3Var) : i;
            }
        } else {
            f = 4.0f;
            i = this.P == 2 ? 0 : -1;
        }
        int i8 = this.P;
        if (i8 < 0 || i8 == 2) {
            f2 = R14;
            jg3Var = jg3Var4;
            f3 = 2.0f;
            float f15 = 0.0f;
            for (int i9 = 0; i9 < jg3Var5.getChildCount(); i9++) {
                float x = ((og3) jg3Var5.getChildAt(i9)).getX() + jg3Var5.getX() + r4.getMeasuredWidth();
                if (f15 == 0.0f || x > f15) {
                    f15 = x;
                }
            }
            f4 = f15;
        } else {
            if (i == -1) {
                x46 x46Var = this.T;
                i = x46Var.H0();
                if (i == -1) {
                    i = x46Var.K0();
                }
                z2 = true;
            } else {
                z2 = false;
            }
            jg3Var4.setAlpha(1.0f - Utilities.i(this.O / this.C0, 1.0f, 0.0f));
            this.p0 = -1;
            if (this.o0 != 0.0f) {
                int i10 = -1;
                int i11 = 0;
                f3 = 2.0f;
                while (i11 < jg3Var4.getChildCount()) {
                    View childAt = jg3Var4.getChildAt(i11);
                    if (childAt.getX() < f14 || childAt.getX() + childAt.getMeasuredWidth() > getMeasuredWidth() || (S = RecyclerView.S(childAt)) < 0 || (i10 != i6 && S >= i10)) {
                        f13 = R14;
                    } else {
                        f13 = R14;
                        if (((mg3) this.y.get(S)).c != yac.h(this.f).n) {
                            this.q0 = (og3) childAt;
                            i10 = S;
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
            while (i12 < jg3Var4.getChildCount()) {
                og3 og3Var2 = (og3) jg3Var4.getChildAt(i12);
                og3Var2.setClipInParent(false);
                q6b q6bVar = og3Var2.P;
                int S2 = RecyclerView.S(og3Var2);
                float f17 = this.O;
                if (S2 < i || S2 >= arrayList2.size() + i) {
                    f5 = measuredHeight;
                } else {
                    int i13 = S2 - i;
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
                        if (S2 < i) {
                            f17 = (float) Math.pow(this.O, d);
                        }
                        og3Var2.d(f17, this.e0, this.o0, this.p0 != og3Var2.b);
                        q6bVar.g = 0.0f;
                        RectF rectF = q6bVar.F;
                        q6bVar.h = 0.0f;
                        q6bVar.i = 0.0f;
                        q6bVar.j = 0.0f;
                        if (S2 > i || S2 >= arrayList2.size() + i) {
                            z3 = z2;
                            f6 = f16;
                            f7 = f17;
                            jg3Var3 = jg3Var4;
                            q6bVar.k = false;
                        } else {
                            og3 og3Var3 = (og3) jg3Var4.getChildAt(i12 - 1);
                            if (og3Var3 != null) {
                                q6b q6bVar2 = og3Var3.P;
                                float L2 = hl.L(48.0f);
                                float L3 = hl.L(26.33f);
                                z3 = z2;
                                float R15 = (hl.R1(L2, L3, og3Var3.K) + hl.L(8.0f)) / f3;
                                float R16 = (hl.R1(L2, L3, og3Var2.K) + hl.L(8.0f)) / f3;
                                float x2 = og3Var3.getX() + q6bVar2.F.centerX();
                                float y = og3Var3.getY() + q6bVar2.F.centerY();
                                float x3 = og3Var2.getX() + rectF.centerX();
                                float y2 = og3Var2.getY() + rectF.centerY();
                                float f19 = x3 - x2;
                                float f20 = y2 - y;
                                f6 = f16;
                                if (((float) Math.sqrt((f20 * f20) + (f19 * f19))) < R15 + R16) {
                                    float degrees = (float) Math.toDegrees(Math.acos(r1 / r3) * 2.0d);
                                    f7 = f17;
                                    jg3Var3 = jg3Var4;
                                    float degrees2 = (float) Math.toDegrees(Math.atan2(f20, f19));
                                    float f21 = degrees / f3;
                                    q6bVar2.g = degrees2 - f21;
                                    q6bVar2.h = degrees2 + f21;
                                    float degrees3 = (float) Math.toDegrees(Math.atan2(-f20, -f19));
                                    float f22 = -Math.abs(degrees3 - f21);
                                    float abs = Math.abs(degrees3 + f21);
                                    q6bVar.i = f22;
                                    q6bVar.j = abs;
                                } else {
                                    f7 = f17;
                                    jg3Var3 = jg3Var4;
                                    q6bVar2.g = 0.0f;
                                    q6bVar2.h = 0.0f;
                                    q6bVar.i = 0.0f;
                                    q6bVar.j = 0.0f;
                                }
                                q6bVar2.k = false;
                                q6bVar.k = false;
                            } else {
                                z3 = z2;
                                f6 = f16;
                                f7 = f17;
                                jg3Var3 = jg3Var4;
                            }
                        }
                        L = hl.L(16.0f) * Utilities.i((this.o0 - 0.5f) / 0.5f, 1.0f, 0.0f);
                        float f23 = (float) (((1.0f - r1) * 0.5f) + 0.5d);
                        if (S2 > i) {
                            f8 = 0.0f;
                            R1 = 0.0f;
                        } else if (S2 == i + 1) {
                            R1 = hl.R1(hl.L(16.0f), 0.0f, this.O) + ((hl.L(16.0f) * f7) - hl.N(0.5f));
                            f8 = 0.0f;
                        } else {
                            f8 = 0.0f;
                            R1 = hl.R1(hl.L(32.0f), 0.0f, this.O) + (((hl.L(16.0f) * f7) + hl.L(16.0f)) - hl.N(0.5f));
                        }
                        float f24 = R1 + this.t0;
                        if (this.B0) {
                            if (this.o0 > f8) {
                                int i15 = og3Var2.b;
                                int i16 = this.p0;
                                if (i15 < i16) {
                                    f12 = -L;
                                } else if (i15 > i16) {
                                    f12 = L;
                                }
                                R12 = hl.R1(f24 - og3Var2.getLeft(), f12, 1.0f - this.J0);
                                f9 = 0.0f;
                            }
                            f12 = 0.0f;
                            R12 = hl.R1(f24 - og3Var2.getLeft(), f12, 1.0f - this.J0);
                            f9 = 0.0f;
                        } else {
                            f9 = 0.0f;
                            R12 = hl.R1(0.0f, f24 - og3Var2.getLeft(), this.K0.getInterpolation(this.F0));
                        }
                        float a = ete.a((this.d0 - 0.2f) / 0.1f, f9, 1.0f);
                        i2 = S2 - i;
                        if (i2 != 0) {
                            f10 = 0.65f;
                            R13 = hl.R1(f9, f2 - f5, k43.h.getInterpolation(this.O));
                        } else {
                            f10 = 0.65f;
                            if (i2 == 1) {
                                R13 = hl.R1(f9, (f2 - f5) * 0.65f, k43.h.getInterpolation(this.O));
                            } else {
                                f11 = f9;
                                float f25 = (og3Var2.b == this.p0 || this.o0 <= f9) ? 0.0f : (-L) / f3;
                                float R17 = hl.R1(i2 == 0 ? hl.R1(f25, f2 - f5, this.H0) : i2 == 1 ? hl.R1(f25, (f2 - f5) * f10, this.H0) : 0.0f, f11, a);
                                if (this.O > 0.0f) {
                                    boolean z4 = S2 >= i && S2 <= i + 2;
                                    if (!z3) {
                                        og3Var2.setCrossfadeTo(-1L);
                                    } else if (i2 < 0 || i2 >= arrayList2.size()) {
                                        og3Var2.setCrossfadeTo(-1L);
                                    } else {
                                        og3Var2.setCrossfadeTo(((Long) arrayList2.get(i2)).longValue());
                                    }
                                    og3Var2.a = z4;
                                    og3Var2.d = S2 == i;
                                    og3Var2.c = S2 >= (arrayList2.size() + i) + (-1);
                                    og3Var2.setTranslationX(R12);
                                    og3Var2.setTranslationY(R17);
                                    if (z4) {
                                        arrayList.add(og3Var2);
                                    }
                                } else if (jg3Var3.getItemAnimator() == null || !jg3Var3.getItemAnimator().k()) {
                                    if (this.o0 > 0.0f) {
                                        int i17 = og3Var2.b;
                                        int i18 = this.p0;
                                        if (i17 < i18) {
                                            og3Var2.setAlpha(f23);
                                        } else if (i17 > i18) {
                                            og3Var2.setAlpha(f23);
                                        } else {
                                            og3Var2.setAlpha(1.0f);
                                        }
                                    } else {
                                        og3Var2.setAlpha(1.0f);
                                    }
                                    og3Var2.setTranslationX(R12);
                                    og3Var2.setTranslationY(R17);
                                }
                                if (og3Var2.a) {
                                    float L4 = (hl.L(70.0f) / f3) + (og3Var2.getMeasuredWidth() / f3) + og3Var2.getX() + jg3Var3.getX();
                                    if (f6 == 0.0f || L4 > f6) {
                                        f16 = L4;
                                        i12++;
                                        measuredHeight = f5;
                                        z2 = z3;
                                        jg3Var4 = jg3Var3;
                                    }
                                }
                                f16 = f6;
                                i12++;
                                measuredHeight = f5;
                                z2 = z3;
                                jg3Var4 = jg3Var3;
                            }
                        }
                        f11 = R13;
                        if (og3Var2.b == this.p0) {
                        }
                        float R172 = hl.R1(i2 == 0 ? hl.R1(f25, f2 - f5, this.H0) : i2 == 1 ? hl.R1(f25, (f2 - f5) * f10, this.H0) : 0.0f, f11, a);
                        if (this.O > 0.0f) {
                        }
                        if (og3Var2.a) {
                        }
                        f16 = f6;
                        i12++;
                        measuredHeight = f5;
                        z2 = z3;
                        jg3Var4 = jg3Var3;
                    }
                }
                d = 0.25d;
                if (S2 < i) {
                }
                og3Var2.d(f17, this.e0, this.o0, this.p0 != og3Var2.b);
                q6bVar.g = 0.0f;
                RectF rectF2 = q6bVar.F;
                q6bVar.h = 0.0f;
                q6bVar.i = 0.0f;
                q6bVar.j = 0.0f;
                if (S2 > i) {
                }
                z3 = z2;
                f6 = f16;
                f7 = f17;
                jg3Var3 = jg3Var4;
                q6bVar.k = false;
                L = hl.L(16.0f) * Utilities.i((this.o0 - 0.5f) / 0.5f, 1.0f, 0.0f);
                float f232 = (float) (((1.0f - r1) * 0.5f) + 0.5d);
                if (S2 > i) {
                }
                float f242 = R1 + this.t0;
                if (this.B0) {
                }
                float a2 = ete.a((this.d0 - 0.2f) / 0.1f, f9, 1.0f);
                i2 = S2 - i;
                if (i2 != 0) {
                }
                f11 = R13;
                if (og3Var2.b == this.p0) {
                }
                float R1722 = hl.R1(i2 == 0 ? hl.R1(f25, f2 - f5, this.H0) : i2 == 1 ? hl.R1(f25, (f2 - f5) * f10, this.H0) : 0.0f, f11, a2);
                if (this.O > 0.0f) {
                }
                if (og3Var2.a) {
                }
                f16 = f6;
                i12++;
                measuredHeight = f5;
                z2 = z3;
                jg3Var4 = jg3Var3;
            }
            f4 = f16;
            jg3Var = jg3Var4;
        }
        if (this.K != null) {
            float U1 = hl.U1(k43.g.getInterpolation(this.O), 29, 74);
            jg3Var2 = jg3Var;
            z = false;
            if (jg3Var.getChildCount() > 0) {
                U1 += jg3Var2.getChildAt(0).getLeft();
            }
            this.K.n(0.0f, U1);
        } else {
            jg3Var2 = jg3Var;
            z = false;
        }
        float min = Math.min(this.O, this.e0);
        float visibleItemsMeasuredWidthWithAlpha = (this.r0.F.getVisibleItemsMeasuredWidthWithAlpha() * min) - hl.L(6.0f);
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
            c6 c6Var = this.V;
            float totalVisibility = c6Var.getTotalVisibility() * (-hl.L(10.0f));
            in inVar = this.U;
            inVar.setPivotX(0.0f);
            inVar.setScaleX(hl.R1(1.0f, 0.95f, c6Var.getTotalVisibility()));
            inVar.setScaleY(hl.R1(1.0f, 0.95f, c6Var.getTotalVisibility()));
            float L5 = f2 - ((hl.L(56.0f) - a.getCurrentActionBarHeight()) / f3);
            inVar.setTranslationY((((hl.L(14.0f) + L5) - ((inVar.getMeasuredHeight() - inVar.getTextHeight()) / f3)) + hl.L(f)) - (c6Var.getTotalVisibility() * hl.L(6.0f)));
            int L6 = hl.L(72.0f);
            float f26 = this.O;
            float R18 = hl.R1(hl.L(48.0f), hl.L(26.33f), f26) / f3;
            float i19 = bs2.i(R18, f3, hl.R1((L6 / f3) - R18, 0.0f, f26), -L6) + hl.L(12.0f) + f4;
            inVar.setTranslationX(i19);
            hn drawable = inVar.getDrawable();
            drawable.O = (this.r0.F.getVisibleItemsMeasuredWidthWithAlpha() * min) + (i19 - hl.L(12.0f));
            drawable.invalidateSelf();
            float translationX = inVar.getTranslationX() + hl.L(1.0f);
            ImageView imageView = this.W;
            imageView.setTranslationX(translationX);
            imageView.setTranslationY(hl.L(22.333f) + L5 + totalVisibility);
            float translationX2 = (inVar.getTranslationX() - hl.N(3.33f)) + imageView.getMeasuredWidth();
            ImageView imageView2 = this.a0;
            imageView2.setTranslationX(translationX2);
            imageView2.setTranslationY(hl.L(11.333f) + L5 + totalVisibility);
            c6Var.setTranslationX(inVar.getTranslationX());
            c6Var.setTranslationY(L5 + hl.L(31.333f));
        }
        super.dispatchDraw(canvas);
        int i20 = this.P;
        if (i20 >= 0 && i20 != 2) {
            Collections.sort(arrayList, this.x0);
            for (int i21 = 0; i21 < arrayList.size(); i21++) {
                og3 og3Var4 = (og3) arrayList.get(i21);
                canvas2.save();
                canvas2.translate(og3Var4.getX() + jg3Var2.getX(), og3Var4.getY() + jg3Var2.getY());
                og3Var4.draw(canvas2);
                canvas2.restore();
            }
        }
        if (z5) {
            float L7 = hl.L(16.0f);
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
            canvas.drawRect((getWidth() - visibleItemsMeasuredWidthWithAlpha) - L7, 0.0f, (getWidth() - visibleItemsMeasuredWidthWithAlpha) + hl.L(1.0f), getHeight(), this.A0);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    public final og3 e(long j) {
        jg3 jg3Var = this.P == 2 ? this.r : this.h;
        for (int i = 0; i < jg3Var.getChildCount(); i++) {
            View childAt = jg3Var.getChildAt(i);
            if (childAt instanceof og3) {
                og3 og3Var = (og3) childAt;
                if (og3Var.F == j) {
                    return og3Var;
                }
            }
        }
        return null;
    }

    public final int f(int i) {
        uj3 uj3Var = this.f0;
        return (uj3Var == null || uj3Var.getResourceProvider() == null) ? aob.w0(null, i, false) : uj3Var.getThemedColor(i);
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

    public kg5 getPremiumHint() {
        return this.K;
    }

    public final void h() {
        if (this.s.I()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(yac.h(this.f).n));
            this.f0.getOrCreateStoryViewer().K(getContext(), null, arrayList, 0, null, null, l6b.a(this.r), false);
        }
    }

    public final void i(og3 og3Var, boolean z) {
        ValueAnimator valueAnimator;
        if ((z && (valueAnimator = this.I0) != null && valueAnimator.isRunning()) || og3Var == null) {
            return;
        }
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        boolean z2 = og3Var.G;
        c6b c6bVar = this.s;
        if (z2 && !c6bVar.I()) {
            if (uc7.s1(this.f).k5()) {
                j(0L);
                return;
            } else {
                n();
                return;
            }
        }
        if (c6bVar.J(og3Var.F) || c6bVar.L(og3Var.F)) {
            TL_stories.PeerStories x = c6bVar.x(og3Var.F);
            long j = og3Var.F;
            pv0 pv0Var = this.s0;
            if (pv0Var != null) {
                pv0Var.a();
                this.s0 = null;
            }
            ue2 ue2Var = new ue2((Object) this, (Object) og3Var, j, (byte) 20);
            if (z) {
                ue2Var.run();
                return;
            }
            pv0 n = t6b.n(x, ue2Var);
            og3Var.e = n;
            this.s0 = n;
            if (n != null) {
                c6bVar.g0(og3Var.F, true);
            }
        }
    }

    public final void j(long j) {
        og3 og3Var;
        xx n;
        uj3 uj3Var = this.f0;
        int i = this.f;
        if (j == 0 && (n = uc7.s1(i).O1().n()) != null && n.a(i, 1)) {
            uj3Var.showDialog(new l46(n.b(), this.f, null, getContext(), this.f0));
            return;
        }
        int i2 = 0;
        while (true) {
            jg3 jg3Var = this.h;
            if (i2 >= jg3Var.getChildCount()) {
                og3Var = null;
                break;
            }
            og3Var = (og3) jg3Var.getChildAt(i2);
            if (j != 0) {
                if (og3Var.F == j) {
                    break;
                } else {
                    i2++;
                }
            } else if (og3Var.G) {
                break;
            } else {
                i2++;
            }
        }
        if (og3Var == null) {
            return;
        }
        if (j == 0) {
            sbb.C(uj3Var.getParentActivity(), i).Q(nbb.c(og3Var));
            return;
        }
        vnb resourceProvider = uj3Var != null ? uj3Var.getResourceProvider() : null;
        id idVar = new id(3, resourceProvider, getContext());
        idVar.q(500L);
        uc7.s1(i).O1().j(j, new r4c((Object) this, (Object) idVar, j, (Object) og3Var, (byte) 2), true, resourceProvider);
    }

    public final boolean k(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.y;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            }
            if (((mg3) arrayList.get(i)).c == j) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            x46 x46Var = this.T;
            if (i < x46Var.H0()) {
                x46Var.g1(i, 0);
                return true;
            }
            if (i > x46Var.L0()) {
                x46Var.h1(i, 0, true);
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
                    hl.d0(this.h, new bm0((byte) 8));
                    return;
                }
                final byte b3 = 2;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e0, z2 ? 1.0f : 0.0f);
                this.D0 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: dg3
                    public final /* synthetic */ pg3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b4 = b;
                        pg3 pg3Var = this.b;
                        switch (b4) {
                            case 0:
                                pg3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                pg3Var.b();
                                break;
                            case 1:
                                pg3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                pg3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                pg3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                pg3Var.invalidate();
                                break;
                        }
                    }
                });
                this.D0.setInterpolator(k43.h);
                float f2 = this.d0;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f2, z2 ? f2 : 0.0f);
                this.G0 = ofFloat2;
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: dg3
                    public final /* synthetic */ pg3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b4 = b2;
                        pg3 pg3Var = this.b;
                        switch (b4) {
                            case 0:
                                pg3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                pg3Var.b();
                                break;
                            case 1:
                                pg3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                pg3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                pg3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                pg3Var.invalidate();
                                break;
                        }
                    }
                });
                this.G0.setDuration(100L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.L0 = animatorSet2;
                animatorSet2.addListener(new z7((byte) 28, (Object) this, z2));
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.D0);
                arrayList.add(this.G0);
                if (this.B0) {
                    this.L0.setDuration(1000L);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.e0, z2 ? 1.0f : 0.0f);
                    this.E0 = ofFloat3;
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: dg3
                        public final /* synthetic */ pg3 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b4 = b3;
                            pg3 pg3Var = this.b;
                            switch (b4) {
                                case 0:
                                    pg3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    pg3Var.b();
                                    break;
                                case 1:
                                    pg3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    break;
                                case 2:
                                    pg3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    break;
                                default:
                                    pg3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    pg3Var.invalidate();
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
                    this.I0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: dg3
                        public final /* synthetic */ pg3 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b42 = b4;
                            pg3 pg3Var = this.b;
                            switch (b42) {
                                case 0:
                                    pg3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    pg3Var.b();
                                    break;
                                case 1:
                                    pg3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    break;
                                case 2:
                                    pg3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    break;
                                default:
                                    pg3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    pg3Var.invalidate();
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
        long j = yac.h(this.f).n;
        c6b c6bVar = this.s;
        if (c6bVar.K(j)) {
            return true;
        }
        return c6bVar.I() && c6bVar.g.size() <= 3;
    }

    public final void n() {
        kg5 kg5Var = this.K;
        if (kg5Var == null) {
            kg5 kg5Var2 = new kg5(getContext(), 1);
            kg5Var2.i(f(aob.wj));
            kg5Var2.p(true);
            kg5Var2.L = Layout.Alignment.ALIGN_CENTER;
            kg5Var2.n(0.0f, 29.0f);
            this.K = kg5Var2;
            SpannableStringBuilder N2 = hl.N2(ob6.N0("StoriesPremiumHint2").replace('\n', ' '), aob.xj, 0, new eg3(this, (byte) 1), null);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) N2.getSpans(0, N2.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                N2.setSpan(new y7c(hl.o()), N2.getSpanStart(clickableSpanArr[0]), N2.getSpanEnd(clickableSpanArr[0]), 33);
            }
            kg5 kg5Var3 = this.K;
            kg5Var3.h = kg5.a(N2, kg5Var3.getTextPaint());
            this.K.t(N2);
            this.K.setPadding(hl.L(8.0f), hl.L(24.0f), hl.L(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.K, tre.e(-1, jn7.f2, 51));
            }
            kg5Var = this.K;
        }
        if (kg5Var != null) {
            if (kg5Var.W) {
                yw0.E.a();
            }
            this.K.v();
        }
    }

    public final void o() {
        o15 o15Var = t6b.b;
        byte b = 0;
        if (o15Var != null) {
            o15Var.d(aob.w0(null, aob.cl, false), aob.w0(null, aob.dl, false), 0, 0);
        }
        o15 o15Var2 = t6b.c;
        if (o15Var2 != null) {
            o15Var2.d(aob.w0(null, aob.el, false), aob.w0(null, aob.fl, false), 0, 0);
        }
        o15[] o15VarArr = t6b.a;
        o15 o15Var3 = o15VarArr[0];
        if (o15Var3 != null) {
            o15Var3.d(aob.w0(null, aob.al, false), aob.w0(null, aob.bl, false), 0, 0);
        }
        o15 o15Var4 = o15VarArr[1];
        if (o15Var4 != null) {
            o15Var4.d(aob.w0(null, aob.Yk, false), aob.w0(null, aob.Zk, false), 0, 0);
        }
        if (t6b.d != null) {
            int w0 = aob.w0(null, aob.ok, false);
            int w02 = aob.w0(null, aob.q7, false);
            t6b.d.d(vm2.f(0.25f, w0, w02), w02, 0, 0);
        }
        int textColor = getTextColor();
        this.U.setTextColor(getTextLogoColor());
        c6 c6Var = this.V;
        if (c6Var != null) {
            c6Var.b();
        }
        this.W.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        hl.d0(this.h, new fg3(textColor, b));
        hl.d0(this.r, new bm0((byte) 9));
        try {
            ul ulVar = this.b0;
            if (ulVar != null) {
                ulVar.k(Integer.valueOf(f(aob.qi)));
            }
            ImageView imageView = this.a0;
            if (imageView != null) {
                imageView.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false, false);
        jn7.f(this.f).b(this, jn7.y5);
        vh4 vh4Var = this.M0;
        vh4Var.a = true;
        AnimatorSet animatorSet = (AnimatorSet) vh4Var.d;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.b0.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.f).n(this, jn7.y5);
        vh4 vh4Var = this.M0;
        vh4Var.a = false;
        ((AnimatorSet) vh4Var.d).cancel();
        pv0 pv0Var = this.s0;
        if (pv0Var != null) {
            pv0Var.a();
            this.s0 = null;
        }
        this.b0.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.U.setTextSize(hl.L((hl.O1() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        this.N = hl.L(70.0f);
        hl.P.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(89.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.P == 2) {
            int L = hl.L((this.E.size() * 26.33f) - (Math.max(0, r0 - 1) * 16.0f));
            jg3 jg3Var = this.r;
            int x = (int) jg3Var.getX();
            int y = (int) jg3Var.getY();
            int x2 = (int) (jg3Var.getX() + L);
            int y2 = (int) (jg3Var.getY() + jg3Var.getHeight());
            za1 za1Var = this.J;
            za1Var.getClass();
            RectF rectF = hl.P;
            rectF.set(x, y, x2, y2);
            za1Var.i = false;
            za1Var.c = 0;
            za1Var.a(rectF);
            if (za1Var.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z, boolean z2) {
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
        c6b c6bVar = this.s;
        if (i != 1) {
            arrayList4.add(new mg3(yac.h(i2).e()));
            arrayList = c6bVar.g;
        } else {
            arrayList = c6bVar.h;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            long n = wf3.n(((TL_stories.PeerStories) arrayList.get(i3)).peer);
            if (n != yac.h(i2).e()) {
                arrayList4.add(new mg3(n));
            }
        }
        int size = arrayList4.size();
        if (!c6bVar.I()) {
            size--;
        }
        int max = Math.max(1, Math.max(c6bVar.C(i == 1), size));
        this.g0 = null;
        boolean H = c6bVar.H();
        in inVar = this.U;
        if (H) {
            arrayList2 = arrayList4;
            if (c6bVar.L(yac.h(i2).e())) {
                String M0 = ob6.M0(2131743455, null);
                if (M0.indexOf("…") > 0) {
                    SpannableStringBuilder spannableStringBuilder = this.j0;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = SpannableStringBuilder.valueOf(M0);
                        qac qacVar = new qac();
                        spannableStringBuilder.setSpan(qacVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                        qacVar.a = inVar;
                        qacVar.n = true;
                        this.j0 = spannableStringBuilder;
                    }
                    this.g0 = spannableStringBuilder;
                } else {
                    this.g0 = M0;
                }
            } else {
                this.g0 = this.t0 < ((float) hl.L(50.0f)) ? null : ob6.M0(2131748055, null);
            }
        } else {
            arrayList2 = arrayList4;
            this.g0 = this.t0 < ((float) hl.L(50.0f)) ? null : ob6.G(max, "Stories", new Object[0]);
        }
        if (this.h0) {
            z3 = true;
        } else {
            z3 = true;
            inVar.c(this.g0, z && !ob6.a0, true);
        }
        this.a.a((!TextUtils.isEmpty(this.g0) || this.h0) ? z3 : false, z);
        arrayList6.clear();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            if (((mg3) arrayList2.get(i4)).c != yac.h(i2).n || m()) {
                arrayList6.add((mg3) arrayList2.get(i4));
                if (arrayList6.size() >= 3) {
                    break;
                }
            }
        }
        jg3 jg3Var = this.h;
        jg3 jg3Var2 = this.r;
        if (!z) {
            jg3Var.setItemAnimator(null);
            jg3Var2.setItemAnimator(null);
        } else if (this.P == 2) {
            jg3Var2.setItemAnimator(this.d);
            jg3Var.setItemAnimator(null);
        } else {
            jg3Var.setItemAnimator(this.S);
            jg3Var2.setItemAnimator(null);
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
        this.o0 = f / hl.L(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f) {
        l(true, f);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        kg5 kg5Var = this.K;
        if (kg5Var != null) {
            kg5Var.setTranslationY(f);
        }
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 1) {
            d();
        }
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}
