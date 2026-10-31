package th;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.u10;
import org.telegram.ui.Components.x41;
import org.telegram.ui.ay;
import org.telegram.ui.ex0;
import org.telegram.ui.ko;
import org.telegram.ui.uw;
import vh.j8;
import vh.o8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class m extends FrameLayout implements us, fe.e {
    public boolean A0;
    public final float B0;
    public ValueAnimator C0;
    public final ArrayList D;
    public ValueAnimator D0;
    public final i E;
    public float E0;
    public final i F;
    public ValueAnimator F0;
    public final Paint G;
    public float G0;
    public final Paint H;
    public ValueAnimator H0;
    public final jc I;
    public float I0;
    public vh.p2 J;
    public OvershootInterpolator J0;
    public boolean K;
    public AnimatorSet K0;
    public int L;
    public final ac.a L0;
    public int M;
    public long M0;
    public float N;
    public Drawable N0;
    public int O;
    public final ArrayList P;
    public final ArrayList Q;
    public final s4.j R;
    public final s4.a0 S;
    public final org.telegram.ui.Components.f6 T;
    public final org.telegram.ui.ActionBar.j U;
    public final ImageView V;
    public final ImageView W;
    public final fe.b a;
    public final org.telegram.ui.Components.d5 a0;
    public final int b;
    public final ArrayList b0;
    public final Drawable c;
    public float c0;
    public final h d;
    public float d0;
    public int e;
    public final ay e0;
    public final int f;
    public CharSequence f0;
    public boolean g0;
    public final g h;
    public int h0;
    public SpannableStringBuilder i0;
    public ValueAnimator j0;
    public k k0;
    public boolean l0;
    public boolean m0;
    public fi0 n;
    public float n0;
    public int o0;
    public l p0;
    public org.telegram.ui.ActionBar.l q0;
    public final g r;
    public org.telegram.ui.web.x0 r0;
    public final e5 s;
    public float s0;
    public final float t0;
    public final float u0;
    public final float v0;
    public final ArrayList w;
    public final ex0 w0;
    public final ArrayList x;
    public LinearGradient x0;
    public final ArrayList y;
    public Matrix y0;
    public Paint z0;

    public m(Context context, ay ayVar, int i10, int i11) {
        super(context);
        this.a = new fe.b(1, this, gr.h, 380L, false);
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.D = new ArrayList();
        uw uwVar = (uw) this;
        i iVar = new i(uwVar, false);
        this.E = iVar;
        int i12 = 1;
        i iVar2 = new i(uwVar, true);
        this.F = iVar2;
        Paint paint = new Paint();
        this.G = new Paint(1);
        this.H = new Paint(1);
        jc jcVar = new jc(this);
        this.I = jcVar;
        this.N = -1.0f;
        this.O = -1;
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.b0 = new ArrayList();
        this.c0 = -1.0f;
        this.l0 = true;
        this.t0 = 1.0f;
        this.u0 = 0.95f;
        this.v0 = 0.9f;
        this.w0 = new ex0(18);
        this.B0 = 0.3f;
        this.E0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.J0 = new OvershootInterpolator(0.95f);
        ac.a aVar = new ac.a(this);
        this.L0 = aVar;
        this.b = i11;
        this.f = i10;
        this.e0 = ayVar;
        this.s0 = org.telegram.messenger.i0.L(68.0f);
        this.s = vp.r1(i10).O1();
        g gVar = new g(uwVar, context, 0);
        this.h = gVar;
        gVar.setPadding(org.telegram.messenger.i0.L(3.0f), 0, org.telegram.messenger.i0.L(3.0f), 0);
        gVar.setClipToPadding(false);
        gVar.setClipChildren(false);
        jcVar.h = new sg.v(uwVar, 2);
        r5.a aVar2 = new r5.a(uwVar, 7);
        jcVar.l = true;
        jcVar.j = aVar2;
        gVar.j(new bu0(uwVar, 22));
        s4.j jVar = new s4.j();
        this.R = jVar;
        jVar.C = false;
        jVar.n(150L);
        jVar.m = false;
        gVar.setItemAnimator(jVar);
        s4.a0 a0Var = new s4.a0(0, false);
        this.S = a0Var;
        gVar.setLayoutManager(a0Var);
        gVar.setOnItemClickListener(new ag.y0(uwVar, 16));
        gVar.setOnItemLongClickListener(new rh.d0(uwVar, 10));
        gVar.setAdapter(iVar);
        addView(gVar, w7.b6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(getContext(), true, true, false);
        this.T = f6Var;
        f6Var.setGravity(3);
        f6Var.setTextColor(getTextLogoColor());
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        f6Var.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        f6Var.setTextSize(org.telegram.messenger.i0.L((org.telegram.messenger.i0.Q1() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        f6Var.setImportantForAccessibility(1);
        f6Var.setFocusableInTouchMode(true);
        addView(f6Var, w7.b6.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.V = imageView;
        imageView.setContentDescription(cd.L0(R.string.AppName, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, w7.b6.c(22.0f, 90));
        org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(26.0f), null);
        this.a0 = d5Var;
        d5Var.a = true;
        d5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.W = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(d5Var);
        addView(imageView2, w7.b6.c(40.0f, 40));
        org.telegram.ui.ActionBar.j jVar2 = new org.telegram.ui.ActionBar.j(uwVar, context, aVar);
        this.U = jVar2;
        addView(jVar2, w7.b6.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        this.c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        g gVar2 = new g(uwVar, getContext(), i12);
        this.r = gVar2;
        getContext();
        gVar2.setLayoutManager(new s4.a0(0, false));
        gVar2.i(new dh.g(13));
        h hVar = new h();
        this.d = hVar;
        hVar.C = false;
        hVar.m = false;
        gVar2.setItemAnimator(hVar);
        gVar2.setAdapter(iVar2);
        gVar2.setClipChildren(false);
        addView(gVar2, w7.b6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        return this.b == 0 ? f(org.telegram.ui.ActionBar.t6.A8) : f(org.telegram.ui.ActionBar.t6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.t6.Ul);
    }

    public final void b() {
        this.N = 1.0f - org.telegram.messenger.i0.T1(1.0f - this.c0, 1.0f, 1.0f - this.d0);
        d();
        float f7 = this.N;
        int i10 = f7 == 1.0f ? 2 : f7 != 0.0f ? 1 : 0;
        if (this.O != i10) {
            this.O = i10;
            if (i10 != 1 && this.K) {
                org.telegram.messenger.i0.g3(new d(this, 0));
            }
            int i11 = this.O;
            g gVar = this.r;
            g gVar2 = this.h;
            if (i11 == 0) {
                org.telegram.messenger.i0.d0(gVar2, new ag.z0(26));
                gVar.setVisibility(4);
                gVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.M0) {
                    this.M0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i12 = this.f;
                if (i11 == 1) {
                    ArrayList arrayList = this.Q;
                    arrayList.clear();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.y;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        if (((j) arrayList2.get(i13)).c != d20.i(i12).e() || m()) {
                            arrayList.add(Long.valueOf(((j) arrayList2.get(i13)).c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i13++;
                    }
                    gVar.setVisibility(4);
                    gVar2.setVisibility(0);
                } else if (i11 == 2) {
                    gVar.setVisibility(0);
                    gVar2.setVisibility(4);
                    this.S.h1(0, 0);
                    org.telegram.utils.twidget.v vVar = vp.r1(i12).O1().K;
                    org.telegram.messenger.i0.r(vVar);
                    vVar.run();
                    org.telegram.ui.web.x0 x0Var = this.r0;
                    if (x0Var != null) {
                        x0Var.a();
                        this.r0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int N0;
        s4.a0 a0Var = this.S;
        int N02 = a0Var.N0() + 10;
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        e5 e5Var = this.s;
        if (N02 > size || ((N0 = a0Var.N0() + 9) < arrayList.size() && e5Var.E(0, ((j) arrayList.get(N0)).c) == 0)) {
            boolean z10 = this.b == 1;
            if (z10) {
                if (!e5Var.z) {
                    return;
                }
            } else if (!e5Var.p) {
                return;
            }
            e5Var.T(z10);
        }
    }

    public final void d() {
        float a2 = w7.u.a(Math.min(this.N, this.d0), 0.0f, 1.0f);
        float f7 = this.a.e;
        float f10 = 1.0f - f7;
        float f11 = f7 * a2;
        float f12 = f10 * a2;
        org.telegram.ui.Components.f6 f6Var = this.T;
        if (f6Var != null) {
            f6Var.setAlpha(f11);
            f6Var.setVisibility(f11 > 0.0f ? 0 : 8);
        }
        ImageView imageView = this.V;
        if (imageView != null) {
            imageView.setAlpha(f12);
            imageView.setVisibility(f12 > 0.0f ? 0 : 8);
        }
        ImageView imageView2 = this.W;
        if (imageView2 != null) {
            imageView2.setAlpha(f12);
            imageView2.setVisibility(f12 > 0.0f ? 0 : 8);
        }
        org.telegram.ui.ActionBar.j jVar = this.U;
        if (jVar != null) {
            jVar.setAlpha(a2);
            jVar.setVisibility(a2 > 0.0f ? 0 : 8);
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.v5 && this.l0) {
            p(getVisibility() == 0, false);
            org.telegram.messenger.i0.g3(new d(this, 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03a6  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i10;
        float f7;
        float f10;
        g gVar;
        float f11;
        float f12;
        g gVar2;
        boolean z10;
        Canvas canvas2;
        boolean z11;
        float f13;
        double d;
        boolean z12;
        float f14;
        float f15;
        g gVar3;
        float f16;
        float L;
        float f17;
        float T1;
        float f18;
        float T12;
        int i11;
        float f19;
        float f20;
        float T13;
        float f21;
        float f22;
        int R;
        canvas.save();
        int i12 = this.L;
        if (i12 > 0) {
            canvas.clipRect(0, i12, getMeasuredWidth(), getMeasuredHeight());
        }
        float measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.L(4.0f);
        float f23 = 0.0f;
        float T14 = org.telegram.messenger.i0.T1(0.0f, measuredHeight, this.c0);
        g gVar4 = this.h;
        gVar4.setTranslationY(T14);
        g gVar5 = this.r;
        gVar5.setTranslationY(T14);
        gVar5.setTranslationX(this.s0);
        int i13 = 0;
        while (true) {
            arrayList = this.P;
            if (i13 >= arrayList.size()) {
                break;
            }
            ((l) arrayList.get(i13)).a = false;
            i13++;
        }
        arrayList.clear();
        int i14 = this.O;
        int i15 = -1;
        ArrayList arrayList2 = this.Q;
        if ((i14 == 1 || i14 == 0) && !arrayList2.isEmpty()) {
            i10 = -1;
            f7 = 4.0f;
            for (int i16 = 0; i16 < gVar4.getChildCount(); i16++) {
                l lVar = (l) gVar4.getChildAt(i16);
                i10 = lVar.E == ((Long) arrayList2.get(0)).longValue() ? RecyclerView.R(lVar) : i10;
            }
        } else {
            f7 = 4.0f;
            i10 = this.O == 2 ? 0 : -1;
        }
        int i17 = this.O;
        if (i17 < 0 || i17 == 2) {
            f10 = T14;
            gVar = gVar4;
            f11 = 2.0f;
            float f24 = 0.0f;
            for (int i18 = 0; i18 < gVar5.getChildCount(); i18++) {
                float x10 = ((l) gVar5.getChildAt(i18)).getX() + gVar5.getX() + r4.getMeasuredWidth();
                if (f24 == 0.0f || x10 > f24) {
                    f24 = x10;
                }
            }
            f12 = f24;
        } else {
            if (i10 == -1) {
                s4.a0 a0Var = this.S;
                i10 = a0Var.I0();
                if (i10 == -1) {
                    i10 = a0Var.L0();
                }
                z11 = true;
            } else {
                z11 = false;
            }
            gVar4.setAlpha(1.0f - Utilities.i(this.N / this.B0, 1.0f, 0.0f));
            this.o0 = -1;
            if (this.n0 != 0.0f) {
                int i19 = -1;
                int i20 = 0;
                f11 = 2.0f;
                while (i20 < gVar4.getChildCount()) {
                    View childAt = gVar4.getChildAt(i20);
                    if (childAt.getX() < f23 || childAt.getX() + childAt.getMeasuredWidth() > getMeasuredWidth() || (R = RecyclerView.R(childAt)) < 0 || (i19 != i15 && R >= i19)) {
                        f22 = T14;
                    } else {
                        f22 = T14;
                        if (((j) this.y.get(R)).c != d20.i(this.f).n) {
                            this.p0 = (l) childAt;
                            i19 = R;
                        }
                    }
                    i20++;
                    T14 = f22;
                    i15 = -1;
                    f23 = 0.0f;
                }
                f10 = T14;
                this.o0 = i19;
            } else {
                f10 = T14;
                f11 = 2.0f;
            }
            float f25 = 0.0f;
            int i21 = 0;
            while (i21 < gVar4.getChildCount()) {
                l lVar2 = (l) gVar4.getChildAt(i21);
                lVar2.setClipInParent(false);
                t5 t5Var = lVar2.O;
                int R2 = RecyclerView.R(lVar2);
                float f26 = this.N;
                if (R2 >= i10 && R2 < arrayList2.size() + i10) {
                    int i22 = R2 - i10;
                    if (i22 == i10 + 2) {
                        f26 = this.N;
                    } else if (i22 == i10 + 1) {
                        f13 = measuredHeight;
                        f26 = (float) Math.pow(this.N, 0.5d);
                        d = 0.25d;
                        if (R2 < i10) {
                            f26 = (float) Math.pow(this.N, d);
                        }
                        lVar2.d(f26, this.d0, this.n0, this.o0 == lVar2.b);
                        if (R2 > i10 || R2 >= arrayList2.size() + i10) {
                            z12 = z11;
                            f14 = f25;
                            f15 = f26;
                            gVar3 = gVar4;
                            f16 = 0.0f;
                            t5Var.g = 0.0f;
                            t5Var.h = 0.0f;
                            t5Var.i = 0.0f;
                            t5Var.j = 0.0f;
                            t5Var.k = false;
                        } else {
                            l lVar3 = (l) gVar4.getChildAt(i21 - 1);
                            if (lVar3 != null) {
                                t5 t5Var2 = lVar3.O;
                                float L2 = org.telegram.messenger.i0.L(48.0f);
                                float L3 = org.telegram.messenger.i0.L(26.33f);
                                z12 = z11;
                                float T15 = (org.telegram.messenger.i0.T1(L2, L3, lVar3.J) + org.telegram.messenger.i0.L(8.0f)) / f11;
                                float T16 = (org.telegram.messenger.i0.T1(L2, L3, lVar2.J) + org.telegram.messenger.i0.L(8.0f)) / f11;
                                float x11 = lVar3.getX() + t5Var2.F.centerX();
                                float y3 = lVar3.getY() + t5Var2.F.centerY();
                                float x12 = (lVar2.getX() + t5Var.F.centerX()) - x11;
                                float y10 = (lVar2.getY() + t5Var.F.centerY()) - y3;
                                f14 = f25;
                                if (((float) Math.sqrt((y10 * y10) + (x12 * x12))) < T15 + T16) {
                                    float degrees = (float) Math.toDegrees(Math.acos(r1 / r3) * 2.0d);
                                    f15 = f26;
                                    gVar3 = gVar4;
                                    float degrees2 = (float) Math.toDegrees(Math.atan2(y10, x12));
                                    float f27 = degrees / f11;
                                    t5Var2.g = degrees2 - f27;
                                    t5Var2.h = degrees2 + f27;
                                    float degrees3 = (float) Math.toDegrees(Math.atan2(-y10, -x12));
                                    float f28 = -Math.abs(degrees3 - f27);
                                    float abs = Math.abs(degrees3 + f27);
                                    t5Var.i = f28;
                                    t5Var.j = abs;
                                    f16 = 0.0f;
                                } else {
                                    f15 = f26;
                                    gVar3 = gVar4;
                                    f16 = 0.0f;
                                    t5Var2.g = 0.0f;
                                    t5Var2.h = 0.0f;
                                    t5Var.i = 0.0f;
                                    t5Var.j = 0.0f;
                                }
                                t5Var2.k = false;
                                t5Var.k = false;
                            } else {
                                z12 = z11;
                                f14 = f25;
                                f15 = f26;
                                gVar3 = gVar4;
                                f16 = 0.0f;
                            }
                        }
                        L = org.telegram.messenger.i0.L(16.0f) * Utilities.i((this.n0 - 0.5f) / 0.5f, 1.0f, f16);
                        float f29 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                        if (R2 <= i10) {
                            f17 = 0.0f;
                            T1 = 0.0f;
                        } else if (R2 == i10 + 1) {
                            T1 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(16.0f), 0.0f, this.N) + ((org.telegram.messenger.i0.L(16.0f) * f15) - org.telegram.messenger.i0.N(0.5f));
                            f17 = 0.0f;
                        } else {
                            f17 = 0.0f;
                            T1 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(32.0f), 0.0f, this.N) + (((org.telegram.messenger.i0.L(16.0f) * f15) + org.telegram.messenger.i0.L(16.0f)) - org.telegram.messenger.i0.N(0.5f));
                        }
                        float f30 = T1 + this.s0;
                        if (this.A0) {
                            f18 = 0.0f;
                            T12 = org.telegram.messenger.i0.T1(0.0f, f30 - lVar2.getLeft(), this.J0.getInterpolation(this.E0));
                        } else {
                            if (this.n0 > f17) {
                                int i23 = lVar2.b;
                                int i24 = this.o0;
                                if (i23 < i24) {
                                    f21 = -L;
                                } else if (i23 > i24) {
                                    f21 = L;
                                }
                                T12 = org.telegram.messenger.i0.T1(f30 - lVar2.getLeft(), f21, 1.0f - this.I0);
                                f18 = 0.0f;
                            }
                            f21 = 0.0f;
                            T12 = org.telegram.messenger.i0.T1(f30 - lVar2.getLeft(), f21, 1.0f - this.I0);
                            f18 = 0.0f;
                        }
                        float a2 = w7.u.a((this.c0 - 0.2f) / 0.1f, f18, 1.0f);
                        i11 = R2 - i10;
                        if (i11 == 0) {
                            f19 = 0.65f;
                            T13 = org.telegram.messenger.i0.T1(f18, f10 - f13, gr.h.getInterpolation(this.N));
                        } else {
                            f19 = 0.65f;
                            if (i11 == 1) {
                                T13 = org.telegram.messenger.i0.T1(f18, (f10 - f13) * 0.65f, gr.h.getInterpolation(this.N));
                            } else {
                                f20 = f18;
                                float f31 = (lVar2.b == this.o0 || this.n0 <= f18) ? 0.0f : (-L) / f11;
                                float T17 = org.telegram.messenger.i0.T1(i11 != 0 ? org.telegram.messenger.i0.T1(f31, f10 - f13, this.G0) : i11 == 1 ? org.telegram.messenger.i0.T1(f31, (f10 - f13) * f19, this.G0) : 0.0f, f20, a2);
                                if (this.N <= 0.0f) {
                                    boolean z13 = R2 >= i10 && R2 <= i10 + 2;
                                    if (!z12) {
                                        lVar2.setCrossfadeTo(-1L);
                                    } else if (i11 < 0 || i11 >= arrayList2.size()) {
                                        lVar2.setCrossfadeTo(-1L);
                                    } else {
                                        lVar2.setCrossfadeTo(((Long) arrayList2.get(i11)).longValue());
                                    }
                                    lVar2.a = z13;
                                    lVar2.d = R2 == i10;
                                    lVar2.c = R2 >= (arrayList2.size() + i10) + (-1);
                                    lVar2.setTranslationX(T12);
                                    lVar2.setTranslationY(T17);
                                    if (z13) {
                                        arrayList.add(lVar2);
                                    }
                                } else if (gVar3.getItemAnimator() == null || !gVar3.getItemAnimator().k()) {
                                    if (this.n0 > 0.0f) {
                                        int i25 = lVar2.b;
                                        int i26 = this.o0;
                                        if (i25 < i26) {
                                            lVar2.setAlpha(f29);
                                        } else if (i25 > i26) {
                                            lVar2.setAlpha(f29);
                                        } else {
                                            lVar2.setAlpha(1.0f);
                                        }
                                    } else {
                                        lVar2.setAlpha(1.0f);
                                    }
                                    lVar2.setTranslationX(T12);
                                    lVar2.setTranslationY(T17);
                                }
                                if (lVar2.a) {
                                    float L4 = (org.telegram.messenger.i0.L(70.0f) / f11) + (lVar2.getMeasuredWidth() / f11) + lVar2.getX() + gVar3.getX();
                                    if (f14 == 0.0f || L4 > f14) {
                                        f25 = L4;
                                        i21++;
                                        measuredHeight = f13;
                                        z11 = z12;
                                        gVar4 = gVar3;
                                    }
                                }
                                f25 = f14;
                                i21++;
                                measuredHeight = f13;
                                z11 = z12;
                                gVar4 = gVar3;
                            }
                        }
                        f20 = T13;
                        if (lVar2.b == this.o0) {
                        }
                        float T172 = org.telegram.messenger.i0.T1(i11 != 0 ? org.telegram.messenger.i0.T1(f31, f10 - f13, this.G0) : i11 == 1 ? org.telegram.messenger.i0.T1(f31, (f10 - f13) * f19, this.G0) : 0.0f, f20, a2);
                        if (this.N <= 0.0f) {
                        }
                        if (lVar2.a) {
                        }
                        f25 = f14;
                        i21++;
                        measuredHeight = f13;
                        z11 = z12;
                        gVar4 = gVar3;
                    } else {
                        f13 = measuredHeight;
                        d = 0.25d;
                        f26 = (float) Math.pow(this.N, 0.25d);
                        if (R2 < i10) {
                        }
                        lVar2.d(f26, this.d0, this.n0, this.o0 == lVar2.b);
                        if (R2 > i10) {
                        }
                        z12 = z11;
                        f14 = f25;
                        f15 = f26;
                        gVar3 = gVar4;
                        f16 = 0.0f;
                        t5Var.g = 0.0f;
                        t5Var.h = 0.0f;
                        t5Var.i = 0.0f;
                        t5Var.j = 0.0f;
                        t5Var.k = false;
                        L = org.telegram.messenger.i0.L(16.0f) * Utilities.i((this.n0 - 0.5f) / 0.5f, 1.0f, f16);
                        float f292 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                        if (R2 <= i10) {
                        }
                        float f302 = T1 + this.s0;
                        if (this.A0) {
                        }
                        float a22 = w7.u.a((this.c0 - 0.2f) / 0.1f, f18, 1.0f);
                        i11 = R2 - i10;
                        if (i11 == 0) {
                        }
                        f20 = T13;
                        if (lVar2.b == this.o0) {
                        }
                        float T1722 = org.telegram.messenger.i0.T1(i11 != 0 ? org.telegram.messenger.i0.T1(f31, f10 - f13, this.G0) : i11 == 1 ? org.telegram.messenger.i0.T1(f31, (f10 - f13) * f19, this.G0) : 0.0f, f20, a22);
                        if (this.N <= 0.0f) {
                        }
                        if (lVar2.a) {
                        }
                        f25 = f14;
                        i21++;
                        measuredHeight = f13;
                        z11 = z12;
                        gVar4 = gVar3;
                    }
                }
                f13 = measuredHeight;
                d = 0.25d;
                if (R2 < i10) {
                }
                lVar2.d(f26, this.d0, this.n0, this.o0 == lVar2.b);
                if (R2 > i10) {
                }
                z12 = z11;
                f14 = f25;
                f15 = f26;
                gVar3 = gVar4;
                f16 = 0.0f;
                t5Var.g = 0.0f;
                t5Var.h = 0.0f;
                t5Var.i = 0.0f;
                t5Var.j = 0.0f;
                t5Var.k = false;
                L = org.telegram.messenger.i0.L(16.0f) * Utilities.i((this.n0 - 0.5f) / 0.5f, 1.0f, f16);
                float f2922 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                if (R2 <= i10) {
                }
                float f3022 = T1 + this.s0;
                if (this.A0) {
                }
                float a222 = w7.u.a((this.c0 - 0.2f) / 0.1f, f18, 1.0f);
                i11 = R2 - i10;
                if (i11 == 0) {
                }
                f20 = T13;
                if (lVar2.b == this.o0) {
                }
                float T17222 = org.telegram.messenger.i0.T1(i11 != 0 ? org.telegram.messenger.i0.T1(f31, f10 - f13, this.G0) : i11 == 1 ? org.telegram.messenger.i0.T1(f31, (f10 - f13) * f19, this.G0) : 0.0f, f20, a222);
                if (this.N <= 0.0f) {
                }
                if (lVar2.a) {
                }
                f25 = f14;
                i21++;
                measuredHeight = f13;
                z11 = z12;
                gVar4 = gVar3;
            }
            f12 = f25;
            gVar = gVar4;
        }
        if (this.J != null) {
            float W1 = org.telegram.messenger.i0.W1(gr.g.getInterpolation(this.N), 29, 74);
            gVar2 = gVar;
            z10 = false;
            if (gVar.getChildCount() > 0) {
                W1 += gVar2.getChildAt(0).getLeft();
            }
            this.J.l(0.0f, W1);
        } else {
            gVar2 = gVar;
            z10 = false;
        }
        float min = Math.min(this.N, this.d0);
        float visibleItemsMeasuredWidthWithAlpha = (this.q0.E.getVisibleItemsMeasuredWidthWithAlpha() * min) - org.telegram.messenger.i0.L(6.0f);
        boolean z14 = (min == 0.0f || visibleItemsMeasuredWidthWithAlpha <= 0.0f) ? z10 : true;
        if (z14) {
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, getWidth() - visibleItemsMeasuredWidthWithAlpha, getHeight());
        } else {
            canvas2 = canvas;
        }
        if (min != 0.0f) {
            org.telegram.ui.ActionBar.j jVar = this.U;
            float totalVisibility = jVar.getTotalVisibility() * (-org.telegram.messenger.i0.L(10.0f));
            org.telegram.ui.Components.f6 f6Var = this.T;
            f6Var.setPivotX(0.0f);
            f6Var.setScaleX(org.telegram.messenger.i0.T1(1.0f, 0.95f, jVar.getTotalVisibility()));
            f6Var.setScaleY(org.telegram.messenger.i0.T1(1.0f, 0.95f, jVar.getTotalVisibility()));
            float L5 = f10 - ((org.telegram.messenger.i0.L(56.0f) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) / f11);
            f6Var.setTranslationY((((org.telegram.messenger.i0.L(14.0f) + L5) - ((f6Var.getMeasuredHeight() - f6Var.getTextHeight()) / f11)) + org.telegram.messenger.i0.L(f7)) - (jVar.getTotalVisibility() * org.telegram.messenger.i0.L(6.0f)));
            int L6 = org.telegram.messenger.i0.L(72.0f);
            float f32 = this.N;
            float T18 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(48.0f), org.telegram.messenger.i0.L(26.33f), f32) / f11;
            float d10 = sc.e.d(T18, f11, org.telegram.messenger.i0.T1((L6 / f11) - T18, 0.0f, f32), -L6) + org.telegram.messenger.i0.L(12.0f) + f12;
            f6Var.setTranslationX(d10);
            org.telegram.ui.Components.e6 drawable = f6Var.getDrawable();
            drawable.N = (this.q0.E.getVisibleItemsMeasuredWidthWithAlpha() * min) + (d10 - org.telegram.messenger.i0.L(12.0f));
            drawable.invalidateSelf();
            float translationX = f6Var.getTranslationX() + org.telegram.messenger.i0.L(1.0f);
            ImageView imageView = this.V;
            imageView.setTranslationX(translationX);
            imageView.setTranslationY(org.telegram.messenger.i0.L(22.333f) + L5 + totalVisibility);
            float translationX2 = (f6Var.getTranslationX() - org.telegram.messenger.i0.N(3.33f)) + imageView.getMeasuredWidth();
            ImageView imageView2 = this.W;
            imageView2.setTranslationX(translationX2);
            imageView2.setTranslationY(org.telegram.messenger.i0.L(11.333f) + L5 + totalVisibility);
            jVar.setTranslationX(f6Var.getTranslationX());
            jVar.setTranslationY(L5 + org.telegram.messenger.i0.L(31.333f));
        }
        super.dispatchDraw(canvas);
        int i27 = this.O;
        if (i27 >= 0 && i27 != 2) {
            Collections.sort(arrayList, this.w0);
            for (int i28 = 0; i28 < arrayList.size(); i28++) {
                l lVar4 = (l) arrayList.get(i28);
                canvas2.save();
                canvas2.translate(lVar4.getX() + gVar2.getX(), lVar4.getY() + gVar2.getY());
                lVar4.draw(canvas2);
                canvas2.restore();
            }
        }
        if (z14) {
            float L7 = org.telegram.messenger.i0.L(16.0f);
            if (this.x0 == null) {
                this.x0 = new LinearGradient(0.0f, 0.0f, L7, 0.0f, new int[]{16711680, -65536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.y0 = new Matrix();
                Paint paint = new Paint(1);
                this.z0 = paint;
                paint.setShader(this.x0);
                this.z0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            this.y0.reset();
            this.y0.postTranslate((getWidth() - visibleItemsMeasuredWidthWithAlpha) - L7, 0.0f);
            this.x0.setLocalMatrix(this.y0);
            canvas2.drawRect((getWidth() - visibleItemsMeasuredWidthWithAlpha) - L7, 0.0f, org.telegram.messenger.i0.L(1.0f) + (getWidth() - visibleItemsMeasuredWidthWithAlpha), getHeight(), this.z0);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    public final l e(long j10) {
        g gVar = this.O == 2 ? this.r : this.h;
        for (int i10 = 0; i10 < gVar.getChildCount(); i10++) {
            View childAt = gVar.getChildAt(i10);
            if (childAt instanceof l) {
                l lVar = (l) childAt;
                if (lVar.E == j10) {
                    return lVar;
                }
            }
        }
        return null;
    }

    public final int f(int i10) {
        ay ayVar = this.e0;
        return (ayVar == null || ayVar.getResourceProvider() == null) ? org.telegram.ui.ActionBar.t6.x0(null, i10, false) : ayVar.getThemedColor(i10);
    }

    public final boolean g() {
        int i10 = this.O;
        return i10 == 0 || i10 == 1;
    }

    public float getCollapsedProgress() {
        return this.N;
    }

    public float getOverScrollCoef() {
        return this.t0;
    }

    public vh.p2 getPremiumHint() {
        return this.J;
    }

    public final void h() {
        if (this.s.J()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(d20.i(this.f).n));
            this.e0.getOrCreateStoryViewer().T(getContext(), null, arrayList, 0, null, null, n5.a(this.r), false);
        }
    }

    public final void i(l lVar, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.H0) == null || !valueAnimator.isRunning()) && lVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = lVar.F;
            e5 e5Var = this.s;
            if (!z11 || e5Var.J()) {
                if (e5Var.K(lVar.E) || e5Var.M(lVar.E)) {
                    TL_stories.PeerStories y3 = e5Var.y(lVar.E);
                    long j10 = lVar.E;
                    org.telegram.ui.web.x0 x0Var = this.r0;
                    if (x0Var != null) {
                        x0Var.a();
                        this.r0 = null;
                    }
                    a3.i0 i0Var = new a3.i0(this, lVar, j10, 27);
                    if (z10) {
                        i0Var.run();
                        return;
                    }
                    org.telegram.ui.web.x0 n10 = w5.n(y3, i0Var);
                    lVar.e = n10;
                    this.r0 = n10;
                    if (n10 != null) {
                        e5Var.h0(lVar.E, true);
                    }
                }
            } else if (vp.r1(this.f).T4()) {
                j(0L);
            } else {
                n();
            }
        }
    }

    public final void j(long j10) {
        l lVar;
        j4.w o10;
        ay ayVar = this.e0;
        int i10 = this.f;
        if (j10 == 0 && (o10 = vp.r1(i10).O1().o()) != null && o10.a(i10, 1)) {
            ayVar.showDialog(new kg.q0(o10.b(), this.f, getContext(), this.e0, null));
            return;
        }
        int i11 = 0;
        while (true) {
            g gVar = this.h;
            if (i11 >= gVar.getChildCount()) {
                lVar = null;
                break;
            }
            lVar = (l) gVar.getChildAt(i11);
            if (j10 == 0) {
                if (lVar.F) {
                    break;
                } else {
                    i11++;
                }
            } else if (lVar.E == j10) {
                break;
            } else {
                i11++;
            }
        }
        if (lVar == null) {
            return;
        }
        if (j10 == 0) {
            o8.D(ayVar.getParentActivity(), i10).Q(j8.c(lVar));
            return;
        }
        org.telegram.ui.ActionBar.p6 resourceProvider = ayVar != null ? ayVar.getResourceProvider() : null;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, getContext(), resourceProvider);
        x1Var.r(500L);
        vp.r1(i10).O1().k(j10, new ko(this, x1Var, j10, lVar, 5), true, resourceProvider);
    }

    public final boolean k(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.y;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            if (((j) arrayList.get(i10)).c == j10) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            s4.a0 a0Var = this.S;
            if (i10 < a0Var.I0()) {
                a0Var.h1(i10, 0);
                return true;
            }
            if (i10 > a0Var.M0()) {
                a0Var.i1(i10, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(boolean z10, float f7) {
        if (this.c0 == f7) {
            return;
        }
        this.c0 = f7;
        b();
        final int i10 = 0;
        final int i11 = 1;
        boolean z11 = f7 > this.B0;
        if (z11 != this.A0) {
            this.A0 = z11;
            AnimatorSet animatorSet = this.K0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.K0.cancel();
                this.K0 = null;
            }
            if (!z10) {
                this.d0 = z11 ? 1.0f : 0.0f;
                b();
                org.telegram.messenger.i0.d0(this.h, new ag.z0(27));
                return;
            }
            final int i12 = 2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d0, z11 ? 1.0f : 0.0f);
            this.C0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: th.c
                public final /* synthetic */ m b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            m mVar = this.b;
                            mVar.getClass();
                            mVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            mVar.b();
                            break;
                        case 1:
                            m mVar2 = this.b;
                            mVar2.getClass();
                            mVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            m mVar3 = this.b;
                            mVar3.getClass();
                            mVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            m mVar4 = this.b;
                            mVar4.getClass();
                            mVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            mVar4.invalidate();
                            break;
                    }
                }
            });
            this.C0.setInterpolator(gr.h);
            float f10 = this.c0;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, z11 ? f10 : 0.0f);
            this.F0 = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: th.c
                public final /* synthetic */ m b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i11) {
                        case 0:
                            m mVar = this.b;
                            mVar.getClass();
                            mVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            mVar.b();
                            break;
                        case 1:
                            m mVar2 = this.b;
                            mVar2.getClass();
                            mVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            m mVar3 = this.b;
                            mVar3.getClass();
                            mVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            m mVar4 = this.b;
                            mVar4.getClass();
                            mVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            mVar4.invalidate();
                            break;
                    }
                }
            });
            this.F0.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.K0 = animatorSet2;
            animatorSet2.addListener(new sg.y(i11, this, z11));
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.C0);
            arrayList.add(this.F0);
            if (this.A0) {
                this.K0.setDuration(1000L);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.d0, z11 ? 1.0f : 0.0f);
                this.D0 = ofFloat3;
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: th.c
                    public final /* synthetic */ m b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i12) {
                            case 0:
                                m mVar = this.b;
                                mVar.getClass();
                                mVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                mVar.b();
                                break;
                            case 1:
                                m mVar2 = this.b;
                                mVar2.getClass();
                                mVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                m mVar3 = this.b;
                                mVar3.getClass();
                                mVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                m mVar4 = this.b;
                                mVar4.getClass();
                                mVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                mVar4.invalidate();
                                break;
                        }
                    }
                });
                OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.u0);
                this.J0 = overshootInterpolator;
                this.D0.setInterpolator(overshootInterpolator);
                this.D0.setDuration(750L);
                arrayList.add(this.D0);
            } else {
                this.H0 = ValueAnimator.ofFloat(this.d0, z11 ? 1.0f : 0.0f);
                this.H0.setInterpolator(new OvershootInterpolator(this.v0));
                this.H0.setDuration(350L);
                final int i13 = 3;
                this.H0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: th.c
                    public final /* synthetic */ m b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i13) {
                            case 0:
                                m mVar = this.b;
                                mVar.getClass();
                                mVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                mVar.b();
                                break;
                            case 1:
                                m mVar2 = this.b;
                                mVar2.getClass();
                                mVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                m mVar3 = this.b;
                                mVar3.getClass();
                                mVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                m mVar4 = this.b;
                                mVar4.getClass();
                                mVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                mVar4.invalidate();
                                break;
                        }
                    }
                });
                arrayList.add(this.H0);
            }
            this.K0.playTogether(arrayList);
            this.K0.start();
        }
    }

    public final boolean m() {
        long j10 = d20.i(this.f).n;
        e5 e5Var = this.s;
        if (e5Var.L(j10)) {
            return true;
        }
        return e5Var.J() && e5Var.g.size() <= 3;
    }

    public final void n() {
        if (this.J == null) {
            vh.p2 p2Var = new vh.p2(getContext(), 1);
            p2Var.h(f(org.telegram.ui.ActionBar.t6.tj));
            p2Var.p(true);
            p2Var.K = Layout.Alignment.ALIGN_CENTER;
            p2Var.l(0.0f, 29.0f);
            this.J = p2Var;
            SpannableStringBuilder R2 = org.telegram.messenger.i0.R2(cd.M0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.t6.uj, 0, new d(this, 1), null);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) R2.getSpans(0, R2.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                R2.setSpan(new x41(org.telegram.messenger.i0.o()), R2.getSpanStart(clickableSpanArr[0]), R2.getSpanEnd(clickableSpanArr[0]), 33);
            }
            vh.p2 p2Var2 = this.J;
            p2Var2.h = vh.p2.a(R2, p2Var2.getTextPaint());
            this.J.s(R2);
            this.J.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.J, w7.b6.e(-1, zs.g2, 51));
            }
        }
        vh.p2 p2Var3 = this.J;
        if (p2Var3 != null) {
            if (p2Var3.V) {
                org.telegram.messenger.t2.D.a();
            }
            this.J.u();
        }
    }

    public final void o() {
        u10 u10Var = w5.b;
        if (u10Var != null) {
            u10Var.d(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Zk, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.al, false), 0, 0);
        }
        u10 u10Var2 = w5.c;
        if (u10Var2 != null) {
            u10Var2.d(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.bl, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.cl, false), 0, 0);
        }
        u10[] u10VarArr = w5.a;
        u10 u10Var3 = u10VarArr[0];
        if (u10Var3 != null) {
            u10Var3.d(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Xk, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yk, false), 0, 0);
        }
        u10 u10Var4 = u10VarArr[1];
        if (u10Var4 != null) {
            u10Var4.d(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vk, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wk, false), 0, 0);
        }
        if (w5.d != null) {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.lk, false);
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q7, false);
            w5.d.d(i0.b.f(0.25f, x02, x03), x03, 0, 0);
        }
        int textColor = getTextColor();
        this.T.setTextColor(getTextLogoColor());
        org.telegram.ui.ActionBar.j jVar = this.U;
        if (jVar != null) {
            jVar.d();
        }
        this.V.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        org.telegram.messenger.i0.d0(this.h, new rv0(textColor, 1));
        org.telegram.messenger.i0.d0(this.r, new ag.z0(28));
        try {
            org.telegram.ui.Components.d5 d5Var = this.a0;
            if (d5Var != null) {
                d5Var.k(Integer.valueOf(f(org.telegram.ui.ActionBar.t6.ni)));
            }
            ImageView imageView = this.W;
            if (imageView != null) {
                imageView.invalidate();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false, false);
        zs.f(this.f).c(this, zs.v5);
        ac.a aVar = this.L0;
        aVar.a = true;
        AnimatorSet animatorSet = (AnimatorSet) aVar.c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.a0.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.f).n(this, zs.v5);
        ac.a aVar = this.L0;
        aVar.a = false;
        ((AnimatorSet) aVar.c).cancel();
        org.telegram.ui.web.x0 x0Var = this.r0;
        if (x0Var != null) {
            x0Var.a();
            this.r0 = null;
        }
        this.a0.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.T.setTextSize(org.telegram.messenger.i0.L((org.telegram.messenger.i0.Q1() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        this.M = org.telegram.messenger.i0.L(70.0f);
        org.telegram.messenger.i0.P.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(89.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.O == 2) {
            int L = org.telegram.messenger.i0.L((this.D.size() * 26.33f) - (Math.max(0, r0 - 1) * 16.0f));
            g gVar = this.r;
            int x10 = (int) gVar.getX();
            int y3 = (int) gVar.getY();
            int x11 = (int) (gVar.getX() + L);
            int y10 = (int) (gVar.getY() + gVar.getHeight());
            jc jcVar = this.I;
            jcVar.getClass();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(x10, y3, x11, y10);
            jcVar.i = false;
            jcVar.c = 0;
            jcVar.a(rectF);
            if (jcVar.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z10, boolean z11) {
        ArrayList arrayList;
        boolean z12;
        if ((this.O == 1 || this.n0 != 0.0f) && !z11) {
            this.K = true;
            return;
        }
        ArrayList arrayList2 = this.w;
        arrayList2.clear();
        ArrayList arrayList3 = this.y;
        arrayList2.addAll(arrayList3);
        ArrayList arrayList4 = this.x;
        arrayList4.clear();
        ArrayList arrayList5 = this.D;
        arrayList4.addAll(arrayList5);
        arrayList3.clear();
        int i10 = this.b;
        int i11 = this.f;
        if (i10 != 1) {
            arrayList3.add(new j(d20.i(i11).e()));
        }
        e5 e5Var = this.s;
        ArrayList arrayList6 = i10 == 1 ? e5Var.h : e5Var.g;
        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
            long o10 = org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList6.get(i12)).peer);
            if (o10 != d20.i(i11).e()) {
                arrayList3.add(new j(o10));
            }
        }
        int size = arrayList3.size();
        if (!e5Var.J()) {
            size--;
        }
        int max = Math.max(1, Math.max(e5Var.D(i10 == 1), size));
        this.f0 = null;
        boolean I = e5Var.I();
        org.telegram.ui.Components.f6 f6Var = this.T;
        if (I) {
            arrayList = arrayList3;
            if (e5Var.M(d20.i(i11).e())) {
                String L0 = cd.L0(2131743826, null);
                if (L0.indexOf("…") > 0) {
                    if (this.i0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(L0);
                        u7 u7Var = new u7();
                        valueOf.setSpan(u7Var, valueOf.length() - 1, valueOf.length(), 0);
                        u7Var.a = f6Var;
                        u7Var.n = true;
                        this.i0 = valueOf;
                    }
                    this.f0 = this.i0;
                } else {
                    this.f0 = L0;
                }
            } else {
                this.f0 = this.s0 < ((float) org.telegram.messenger.i0.L(50.0f)) ? null : cd.L0(2131748316, null);
            }
        } else {
            arrayList = arrayList3;
            this.f0 = this.s0 < ((float) org.telegram.messenger.i0.L(50.0f)) ? null : cd.G(max, "Stories", new Object[0]);
        }
        if (this.g0) {
            z12 = true;
        } else {
            z12 = true;
            f6Var.c(this.f0, z10 && !cd.X, true);
        }
        this.a.a((!TextUtils.isEmpty(this.f0) || this.g0) ? z12 : false, z10);
        arrayList5.clear();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (((j) arrayList.get(i13)).c != d20.i(i11).n || m()) {
                arrayList5.add((j) arrayList.get(i13));
                if (arrayList5.size() >= 3) {
                    break;
                }
            }
        }
        g gVar = this.h;
        g gVar2 = this.r;
        if (!z10) {
            gVar.setItemAnimator(null);
            gVar2.setItemAnimator(null);
        } else if (this.O == 2) {
            gVar2.setItemAnimator(this.d);
            gVar.setItemAnimator(null);
        } else {
            gVar.setItemAnimator(this.R);
            gVar2.setItemAnimator(null);
        }
        this.E.E(arrayList2, arrayList);
        this.F.E(arrayList4, arrayList5);
        arrayList2.clear();
        invalidate();
    }

    public void setActionBar(org.telegram.ui.ActionBar.l lVar) {
        this.q0 = lVar;
    }

    public void setClipTop(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (this.L != i10) {
            this.L = i10;
            invalidate();
        }
    }

    public void setMenuItemsOffset(float f7) {
        this.s0 = f7;
    }

    public void setOverscroll(float f7) {
        this.n0 = f7 / org.telegram.messenger.i0.L(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f7) {
        l(true, f7);
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        vh.p2 p2Var = this.J;
        if (p2Var != null) {
            p2Var.setTranslationY(f7);
        }
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 1) {
            d();
        }
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
