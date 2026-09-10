package zh;

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
import bi.ce;
import bi.vd;
import bi.xd;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.x20;
import org.telegram.ui.iw0;
import org.telegram.ui.nx;
import org.telegram.ui.to;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public abstract class l extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, le.d {
    public boolean A0;
    public final float B0;
    public ValueAnimator C0;
    public ValueAnimator D0;
    public final i E;
    public float E0;
    public final i F;
    public ValueAnimator F0;
    public final Paint G;
    public float G0;
    public final Paint H;
    public ValueAnimator H0;
    public final ed I;
    public float I0;
    public bi.x4 J;
    public OvershootInterpolator J0;
    public boolean K;
    public AnimatorSet K0;
    public int L;
    public final com.google.firebase.messaging.m L0;
    public int M;
    public long M0;
    public float N;
    public Drawable N0;
    public int O;
    public final ArrayList P;
    public final ArrayList Q;
    public final s4.j R;
    public final s4.c0 S;
    public final org.telegram.ui.Components.o6 T;
    public final org.telegram.ui.ActionBar.j U;
    public final ImageView V;
    public final ImageView W;
    public final le.b a;
    public final org.telegram.ui.Components.n5 a0;
    public final int b;
    public final ArrayList b0;
    public final Drawable c;
    public float c0;
    public final h d;
    public float d0;
    public int e;
    public final wy e0;
    public final int f;
    public CharSequence f0;
    public boolean g0;
    public final g h;
    public int h0;
    public SpannableStringBuilder i0;
    public ValueAnimator j0;
    public vd k0;
    public boolean l0;
    public boolean m0;
    public lj0 n;
    public float n0;
    public int o0;
    public k p0;
    public org.telegram.ui.ActionBar.l q0;
    public final g r;
    public org.telegram.ui.web.a1 r0;
    public final i5 s;
    public float s0;
    public final float t0;
    public final float u0;
    public final ArrayList v;
    public final float v0;
    public final ArrayList w;
    public final sg.p w0;
    public final ArrayList x;
    public LinearGradient x0;
    public final ArrayList y;
    public Matrix y0;
    public Paint z0;

    public l(Context context, wy wyVar, int i10, int i11) {
        super(context);
        this.a = new le.b(1, this, wr.h, 380L, false);
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        nx nxVar = (nx) this;
        i iVar = new i(nxVar, false);
        this.E = iVar;
        i iVar2 = new i(nxVar, true);
        this.F = iVar2;
        Paint paint = new Paint();
        this.G = new Paint(1);
        this.H = new Paint(1);
        ed edVar = new ed(this);
        this.I = edVar;
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
        this.w0 = new sg.p(20);
        this.B0 = 0.3f;
        this.E0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.J0 = new OvershootInterpolator(0.95f);
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m(this);
        this.L0 = mVar;
        this.b = i11;
        this.f = i10;
        this.e0 = wyVar;
        this.s0 = AndroidUtilities.dp(68.0f);
        this.s = MessagesController.getInstance(i10).getStoriesController();
        g gVar = new g(nxVar, context, 0);
        this.h = gVar;
        gVar.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        gVar.setClipToPadding(false);
        gVar.setClipChildren(false);
        edVar.h = new xh.x(nxVar, 18);
        org.telegram.ui.web.d1 d1Var = new org.telegram.ui.web.d1(nxVar, 15);
        edVar.l = true;
        edVar.j = d1Var;
        gVar.j(new al0(nxVar, 20));
        s4.j jVar = new s4.j();
        this.R = jVar;
        jVar.C = false;
        jVar.n(150L);
        jVar.m = false;
        gVar.setItemAnimator(jVar);
        s4.c0 c0Var = new s4.c0(0, false);
        this.S = c0Var;
        gVar.setLayoutManager(c0Var);
        gVar.setOnItemClickListener(new ai.g(nxVar, 24));
        gVar.setOnItemLongClickListener(new th.e(nxVar, 19));
        gVar.setAdapter(iVar);
        addView(gVar, w7.a6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getContext(), true, true, false);
        this.T = o6Var;
        o6Var.setGravity(3);
        o6Var.setTextColor(getTextLogoColor());
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        o6Var.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        o6Var.setImportantForAccessibility(1);
        o6Var.setFocusableInTouchMode(true);
        addView(o6Var, w7.a6.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.V = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, w7.a6.c(22.0f, 90));
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(26.0f), null);
        this.a0 = n5Var;
        n5Var.a = true;
        n5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.W = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(n5Var);
        addView(imageView2, w7.a6.c(40.0f, 40));
        org.telegram.ui.ActionBar.j jVar2 = new org.telegram.ui.ActionBar.j(nxVar, context, mVar);
        this.U = jVar2;
        addView(jVar2, w7.a6.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        g gVar2 = new g(nxVar, getContext(), 1);
        this.r = gVar2;
        getContext();
        gVar2.setLayoutManager(new s4.c0(0, false));
        gVar2.i(new fg.j0(10));
        h hVar = new h();
        this.d = hVar;
        hVar.C = false;
        hVar.m = false;
        gVar2.setItemAnimator(hVar);
        gVar2.setAdapter(iVar2);
        gVar2.setClipChildren(false);
        addView(gVar2, w7.a6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        return this.b == 0 ? f(org.telegram.ui.ActionBar.j6.A8) : f(org.telegram.ui.ActionBar.j6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.j6.gl);
    }

    @Override // le.d
    public final void G(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 1) {
            d();
        }
    }

    public final void b() {
        this.N = 1.0f - AndroidUtilities.lerp(1.0f - this.c0, 1.0f, 1.0f - this.d0);
        d();
        float f7 = this.N;
        int i10 = f7 == 1.0f ? 2 : f7 != 0.0f ? 1 : 0;
        if (this.O != i10) {
            this.O = i10;
            if (i10 != 1 && this.K) {
                AndroidUtilities.runOnUIThread(new d(this, 0));
            }
            int i11 = this.O;
            g gVar = this.r;
            g gVar2 = this.h;
            if (i11 == 0) {
                AndroidUtilities.forEachViews((RecyclerView) gVar2, (e2.h) new y2.h(1));
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
                        ArrayList arrayList2 = this.x;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        if (((j) arrayList2.get(i13)).c != UserConfig.getInstance(i12).getClientUserId() || m()) {
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
                    pg.f2 f2Var = MessagesController.getInstance(i12).getStoriesController().K;
                    AndroidUtilities.cancelRunOnUIThread(f2Var);
                    f2Var.run();
                    org.telegram.ui.web.a1 a1Var = this.r0;
                    if (a1Var != null) {
                        a1Var.a();
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
        s4.c0 c0Var = this.S;
        int N02 = c0Var.N0() + 10;
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        i5 i5Var = this.s;
        if (N02 > size || ((N0 = c0Var.N0() + 9) < arrayList.size() && i5Var.D(0, ((j) arrayList.get(N0)).c) == 0)) {
            boolean z10 = this.b == 1;
            if (z10) {
                if (!i5Var.z) {
                    return;
                }
            } else if (!i5Var.p) {
                return;
            }
            i5Var.Q(z10);
        }
    }

    public final void d() {
        float a2 = w7.q.a(Math.min(this.N, this.d0), 0.0f, 1.0f);
        float f7 = this.a.e;
        float f10 = 1.0f - f7;
        float f11 = f7 * a2;
        float f12 = f10 * a2;
        org.telegram.ui.Components.o6 o6Var = this.T;
        if (o6Var != null) {
            o6Var.setAlpha(f11);
            o6Var.setVisibility(f11 > 0.0f ? 0 : 8);
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

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesUpdated && this.l0) {
            p(getVisibility() == 0, false);
            AndroidUtilities.runOnUIThread(new d(this, 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03a8  */
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
        int i11;
        Canvas canvas2;
        boolean z10;
        float f13;
        double d;
        boolean z11;
        float f14;
        float f15;
        g gVar3;
        float f16;
        float dp;
        float f17;
        float lerp;
        float f18;
        float lerp2;
        int i12;
        float f19;
        float f20;
        float lerp3;
        float f21;
        float f22;
        int R;
        canvas.save();
        int i13 = this.L;
        if (i13 > 0) {
            canvas.clipRect(0, i13, getMeasuredWidth(), getMeasuredHeight());
        }
        float measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.dp(4.0f);
        float f23 = 0.0f;
        float lerp4 = AndroidUtilities.lerp(0.0f, measuredHeight, this.c0);
        g gVar4 = this.h;
        gVar4.setTranslationY(lerp4);
        g gVar5 = this.r;
        gVar5.setTranslationY(lerp4);
        gVar5.setTranslationX(this.s0);
        int i14 = 0;
        while (true) {
            arrayList = this.P;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((k) arrayList.get(i14)).a = false;
            i14++;
        }
        arrayList.clear();
        int i15 = this.O;
        int i16 = -1;
        ArrayList arrayList2 = this.Q;
        if ((i15 == 1 || i15 == 0) && !arrayList2.isEmpty()) {
            i10 = -1;
            f7 = 4.0f;
            for (int i17 = 0; i17 < gVar4.getChildCount(); i17++) {
                k kVar = (k) gVar4.getChildAt(i17);
                i10 = kVar.E == ((Long) arrayList2.get(0)).longValue() ? RecyclerView.R(kVar) : i10;
            }
        } else {
            f7 = 4.0f;
            i10 = this.O == 2 ? 0 : -1;
        }
        int i18 = this.O;
        if (i18 < 0 || i18 == 2) {
            f10 = lerp4;
            gVar = gVar4;
            f11 = 2.0f;
            float f24 = 0.0f;
            for (int i19 = 0; i19 < gVar5.getChildCount(); i19++) {
                float x10 = ((k) gVar5.getChildAt(i19)).getX() + gVar5.getX() + r4.getMeasuredWidth();
                if (f24 == 0.0f || x10 > f24) {
                    f24 = x10;
                }
            }
            f12 = f24;
        } else {
            if (i10 == -1) {
                s4.c0 c0Var = this.S;
                i10 = c0Var.I0();
                if (i10 == -1) {
                    i10 = c0Var.L0();
                }
                z10 = true;
            } else {
                z10 = false;
            }
            gVar4.setAlpha(1.0f - Utilities.clamp(this.N / this.B0, 1.0f, 0.0f));
            this.o0 = -1;
            if (this.n0 != 0.0f) {
                int i20 = 0;
                int i21 = -1;
                f11 = 2.0f;
                while (i20 < gVar4.getChildCount()) {
                    View childAt = gVar4.getChildAt(i20);
                    if (childAt.getX() < f23 || childAt.getX() + childAt.getMeasuredWidth() > getMeasuredWidth() || (R = RecyclerView.R(childAt)) < 0 || (i21 != i16 && R >= i21)) {
                        f22 = lerp4;
                    } else {
                        f22 = lerp4;
                        if (((j) this.x.get(R)).c != UserConfig.getInstance(this.f).clientUserId) {
                            this.p0 = (k) childAt;
                            i21 = R;
                        }
                    }
                    i20++;
                    lerp4 = f22;
                    i16 = -1;
                    f23 = 0.0f;
                }
                f10 = lerp4;
                this.o0 = i21;
            } else {
                f10 = lerp4;
                f11 = 2.0f;
            }
            float f25 = 0.0f;
            int i22 = 0;
            while (i22 < gVar4.getChildCount()) {
                k kVar2 = (k) gVar4.getChildAt(i22);
                kVar2.setClipInParent(false);
                x5 x5Var = kVar2.O;
                int R2 = RecyclerView.R(kVar2);
                float f26 = this.N;
                if (R2 >= i10 && R2 < arrayList2.size() + i10) {
                    int i23 = R2 - i10;
                    if (i23 == i10 + 2) {
                        f26 = this.N;
                    } else if (i23 == i10 + 1) {
                        f13 = measuredHeight;
                        f26 = (float) Math.pow(this.N, 0.5d);
                        d = 0.25d;
                        if (R2 < i10) {
                            f26 = (float) Math.pow(this.N, d);
                        }
                        kVar2.d(f26, this.d0, this.n0, this.o0 == kVar2.b);
                        if (R2 > i10 || R2 >= arrayList2.size() + i10) {
                            z11 = z10;
                            f14 = f25;
                            f15 = f26;
                            gVar3 = gVar4;
                            f16 = 0.0f;
                            x5Var.g = 0.0f;
                            x5Var.h = 0.0f;
                            x5Var.i = 0.0f;
                            x5Var.j = 0.0f;
                            x5Var.k = false;
                        } else {
                            k kVar3 = (k) gVar4.getChildAt(i22 - 1);
                            if (kVar3 != null) {
                                x5 x5Var2 = kVar3.O;
                                float dp2 = AndroidUtilities.dp(48.0f);
                                float dp3 = AndroidUtilities.dp(26.33f);
                                z11 = z10;
                                float lerp5 = (AndroidUtilities.lerp(dp2, dp3, kVar3.J) + AndroidUtilities.dp(8.0f)) / f11;
                                float lerp6 = (AndroidUtilities.lerp(dp2, dp3, kVar2.J) + AndroidUtilities.dp(8.0f)) / f11;
                                float x11 = kVar3.getX() + x5Var2.F.centerX();
                                float y3 = kVar3.getY() + x5Var2.F.centerY();
                                float x12 = (kVar2.getX() + x5Var.F.centerX()) - x11;
                                float y10 = (kVar2.getY() + x5Var.F.centerY()) - y3;
                                f14 = f25;
                                if (((float) Math.sqrt((y10 * y10) + (x12 * x12))) < lerp5 + lerp6) {
                                    float degrees = (float) Math.toDegrees(Math.acos(r1 / r3) * 2.0d);
                                    f15 = f26;
                                    gVar3 = gVar4;
                                    float degrees2 = (float) Math.toDegrees(Math.atan2(y10, x12));
                                    float f27 = degrees / f11;
                                    x5Var2.g = degrees2 - f27;
                                    x5Var2.h = degrees2 + f27;
                                    float degrees3 = (float) Math.toDegrees(Math.atan2(-y10, -x12));
                                    float f28 = -Math.abs(degrees3 - f27);
                                    float abs = Math.abs(degrees3 + f27);
                                    x5Var.i = f28;
                                    x5Var.j = abs;
                                    f16 = 0.0f;
                                } else {
                                    f15 = f26;
                                    gVar3 = gVar4;
                                    f16 = 0.0f;
                                    x5Var2.g = 0.0f;
                                    x5Var2.h = 0.0f;
                                    x5Var.i = 0.0f;
                                    x5Var.j = 0.0f;
                                }
                                x5Var2.k = false;
                                x5Var.k = false;
                            } else {
                                z11 = z10;
                                f14 = f25;
                                f15 = f26;
                                gVar3 = gVar4;
                                f16 = 0.0f;
                            }
                        }
                        dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.n0 - 0.5f) / 0.5f, 1.0f, f16);
                        float f29 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                        if (R2 <= i10) {
                            f17 = 0.0f;
                            lerp = 0.0f;
                        } else if (R2 == i10 + 1) {
                            lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), 0.0f, this.N) + ((AndroidUtilities.dp(16.0f) * f15) - AndroidUtilities.dpf2(0.5f));
                            f17 = 0.0f;
                        } else {
                            f17 = 0.0f;
                            lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), 0.0f, this.N) + (((AndroidUtilities.dp(16.0f) * f15) + AndroidUtilities.dp(16.0f)) - AndroidUtilities.dpf2(0.5f));
                        }
                        float f30 = lerp + this.s0;
                        if (this.A0) {
                            f18 = 0.0f;
                            lerp2 = AndroidUtilities.lerp(0.0f, f30 - kVar2.getLeft(), this.J0.getInterpolation(this.E0));
                        } else {
                            if (this.n0 > f17) {
                                int i24 = kVar2.b;
                                int i25 = this.o0;
                                if (i24 < i25) {
                                    f21 = -dp;
                                } else if (i24 > i25) {
                                    f21 = dp;
                                }
                                lerp2 = AndroidUtilities.lerp(f30 - kVar2.getLeft(), f21, 1.0f - this.I0);
                                f18 = 0.0f;
                            }
                            f21 = 0.0f;
                            lerp2 = AndroidUtilities.lerp(f30 - kVar2.getLeft(), f21, 1.0f - this.I0);
                            f18 = 0.0f;
                        }
                        float a2 = w7.q.a((this.c0 - 0.2f) / 0.1f, f18, 1.0f);
                        i12 = R2 - i10;
                        if (i12 == 0) {
                            f19 = 0.65f;
                            lerp3 = AndroidUtilities.lerp(f18, f10 - f13, wr.h.getInterpolation(this.N));
                        } else {
                            f19 = 0.65f;
                            if (i12 == 1) {
                                lerp3 = AndroidUtilities.lerp(f18, (f10 - f13) * 0.65f, wr.h.getInterpolation(this.N));
                            } else {
                                f20 = 0.0f;
                                float f31 = (kVar2.b == this.o0 || this.n0 <= f18) ? 0.0f : (-dp) / f11;
                                float lerp7 = AndroidUtilities.lerp(i12 != 0 ? AndroidUtilities.lerp(f31, f10 - f13, this.G0) : i12 == 1 ? AndroidUtilities.lerp(f31, (f10 - f13) * f19, this.G0) : 0.0f, f20, a2);
                                if (this.N <= 0.0f) {
                                    boolean z12 = R2 >= i10 && R2 <= i10 + 2;
                                    if (!z11) {
                                        kVar2.setCrossfadeTo(-1L);
                                    } else if (i12 < 0 || i12 >= arrayList2.size()) {
                                        kVar2.setCrossfadeTo(-1L);
                                    } else {
                                        kVar2.setCrossfadeTo(((Long) arrayList2.get(i12)).longValue());
                                    }
                                    kVar2.a = z12;
                                    kVar2.d = R2 == i10;
                                    kVar2.c = R2 >= (arrayList2.size() + i10) + (-1);
                                    kVar2.setTranslationX(lerp2);
                                    kVar2.setTranslationY(lerp7);
                                    if (z12) {
                                        arrayList.add(kVar2);
                                    }
                                } else if (gVar3.getItemAnimator() == null || !gVar3.getItemAnimator().k()) {
                                    if (this.n0 > 0.0f) {
                                        int i26 = kVar2.b;
                                        int i27 = this.o0;
                                        if (i26 < i27) {
                                            kVar2.setAlpha(f29);
                                        } else if (i26 > i27) {
                                            kVar2.setAlpha(f29);
                                        } else {
                                            kVar2.setAlpha(1.0f);
                                        }
                                    } else {
                                        kVar2.setAlpha(1.0f);
                                    }
                                    kVar2.setTranslationX(lerp2);
                                    kVar2.setTranslationY(lerp7);
                                }
                                if (kVar2.a) {
                                    float dp4 = (AndroidUtilities.dp(70.0f) / f11) + (kVar2.getMeasuredWidth() / f11) + kVar2.getX() + gVar3.getX();
                                    if (f14 == 0.0f || dp4 > f14) {
                                        f25 = dp4;
                                        i22++;
                                        measuredHeight = f13;
                                        z10 = z11;
                                        gVar4 = gVar3;
                                    }
                                }
                                f25 = f14;
                                i22++;
                                measuredHeight = f13;
                                z10 = z11;
                                gVar4 = gVar3;
                            }
                        }
                        f20 = lerp3;
                        if (kVar2.b == this.o0) {
                        }
                        float lerp72 = AndroidUtilities.lerp(i12 != 0 ? AndroidUtilities.lerp(f31, f10 - f13, this.G0) : i12 == 1 ? AndroidUtilities.lerp(f31, (f10 - f13) * f19, this.G0) : 0.0f, f20, a2);
                        if (this.N <= 0.0f) {
                        }
                        if (kVar2.a) {
                        }
                        f25 = f14;
                        i22++;
                        measuredHeight = f13;
                        z10 = z11;
                        gVar4 = gVar3;
                    } else {
                        f13 = measuredHeight;
                        d = 0.25d;
                        f26 = (float) Math.pow(this.N, 0.25d);
                        if (R2 < i10) {
                        }
                        kVar2.d(f26, this.d0, this.n0, this.o0 == kVar2.b);
                        if (R2 > i10) {
                        }
                        z11 = z10;
                        f14 = f25;
                        f15 = f26;
                        gVar3 = gVar4;
                        f16 = 0.0f;
                        x5Var.g = 0.0f;
                        x5Var.h = 0.0f;
                        x5Var.i = 0.0f;
                        x5Var.j = 0.0f;
                        x5Var.k = false;
                        dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.n0 - 0.5f) / 0.5f, 1.0f, f16);
                        float f292 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                        if (R2 <= i10) {
                        }
                        float f302 = lerp + this.s0;
                        if (this.A0) {
                        }
                        float a22 = w7.q.a((this.c0 - 0.2f) / 0.1f, f18, 1.0f);
                        i12 = R2 - i10;
                        if (i12 == 0) {
                        }
                        f20 = lerp3;
                        if (kVar2.b == this.o0) {
                        }
                        float lerp722 = AndroidUtilities.lerp(i12 != 0 ? AndroidUtilities.lerp(f31, f10 - f13, this.G0) : i12 == 1 ? AndroidUtilities.lerp(f31, (f10 - f13) * f19, this.G0) : 0.0f, f20, a22);
                        if (this.N <= 0.0f) {
                        }
                        if (kVar2.a) {
                        }
                        f25 = f14;
                        i22++;
                        measuredHeight = f13;
                        z10 = z11;
                        gVar4 = gVar3;
                    }
                }
                f13 = measuredHeight;
                d = 0.25d;
                if (R2 < i10) {
                }
                kVar2.d(f26, this.d0, this.n0, this.o0 == kVar2.b);
                if (R2 > i10) {
                }
                z11 = z10;
                f14 = f25;
                f15 = f26;
                gVar3 = gVar4;
                f16 = 0.0f;
                x5Var.g = 0.0f;
                x5Var.h = 0.0f;
                x5Var.i = 0.0f;
                x5Var.j = 0.0f;
                x5Var.k = false;
                dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.n0 - 0.5f) / 0.5f, 1.0f, f16);
                float f2922 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                if (R2 <= i10) {
                }
                float f3022 = lerp + this.s0;
                if (this.A0) {
                }
                float a222 = w7.q.a((this.c0 - 0.2f) / 0.1f, f18, 1.0f);
                i12 = R2 - i10;
                if (i12 == 0) {
                }
                f20 = lerp3;
                if (kVar2.b == this.o0) {
                }
                float lerp7222 = AndroidUtilities.lerp(i12 != 0 ? AndroidUtilities.lerp(f31, f10 - f13, this.G0) : i12 == 1 ? AndroidUtilities.lerp(f31, (f10 - f13) * f19, this.G0) : 0.0f, f20, a222);
                if (this.N <= 0.0f) {
                }
                if (kVar2.a) {
                }
                f25 = f14;
                i22++;
                measuredHeight = f13;
                z10 = z11;
                gVar4 = gVar3;
            }
            f12 = f25;
            gVar = gVar4;
        }
        if (this.J != null) {
            float lerp8 = AndroidUtilities.lerp(29, 74, wr.g.getInterpolation(this.N));
            gVar2 = gVar;
            i11 = 0;
            if (gVar.getChildCount() > 0) {
                lerp8 += gVar2.getChildAt(0).getLeft();
            }
            this.J.l(0.0f, lerp8);
        } else {
            gVar2 = gVar;
            i11 = 0;
        }
        float min = Math.min(this.N, this.d0);
        float visibleItemsMeasuredWidthWithAlpha = (this.q0.E.getVisibleItemsMeasuredWidthWithAlpha() * min) - AndroidUtilities.dp(6.0f);
        boolean z13 = min != 0.0f && visibleItemsMeasuredWidthWithAlpha > 0.0f;
        if (z13) {
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, getWidth() - visibleItemsMeasuredWidthWithAlpha, getHeight());
        } else {
            canvas2 = canvas;
        }
        if (min != 0.0f) {
            org.telegram.ui.ActionBar.j jVar = this.U;
            float totalVisibility = jVar.getTotalVisibility() * (-AndroidUtilities.dp(10.0f));
            org.telegram.ui.Components.o6 o6Var = this.T;
            o6Var.setPivotX(0.0f);
            o6Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, jVar.getTotalVisibility()));
            o6Var.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, jVar.getTotalVisibility()));
            o6Var.setTranslationY((((f10 + AndroidUtilities.dp(14.0f)) - ((o6Var.getMeasuredHeight() - o6Var.getTextHeight()) / f11)) + AndroidUtilities.dp(f7)) - (jVar.getTotalVisibility() * AndroidUtilities.dp(6.0f)));
            int dp5 = AndroidUtilities.dp(72.0f);
            float f32 = this.N;
            float lerp9 = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), AndroidUtilities.dp(26.33f), f32) / f11;
            float a10 = org.telegram.ui.Cells.r6.a(lerp9, 2.0f, AndroidUtilities.lerp((dp5 / f11) - lerp9, 0.0f, f32), -dp5) + AndroidUtilities.dp(12.0f) + f12;
            o6Var.setTranslationX(a10);
            org.telegram.ui.Components.n6 drawable = o6Var.getDrawable();
            drawable.H = (this.q0.E.getVisibleItemsMeasuredWidthWithAlpha() * min) + (a10 - AndroidUtilities.dp(12.0f));
            drawable.invalidateSelf();
            float translationX = o6Var.getTranslationX() + AndroidUtilities.dp(1.0f);
            ImageView imageView = this.V;
            imageView.setTranslationX(translationX);
            imageView.setTranslationY(f10 + AndroidUtilities.dp(22.333f) + totalVisibility);
            float translationX2 = (o6Var.getTranslationX() - AndroidUtilities.dpf2(3.33f)) + imageView.getMeasuredWidth();
            ImageView imageView2 = this.W;
            imageView2.setTranslationX(translationX2);
            imageView2.setTranslationY(f10 + AndroidUtilities.dp(11.333f) + totalVisibility);
            jVar.setTranslationX(o6Var.getTranslationX());
            jVar.setTranslationY(f10 + AndroidUtilities.dp(31.333f));
        }
        super.dispatchDraw(canvas);
        int i28 = this.O;
        if (i28 >= 0 && i28 != 2) {
            Collections.sort(arrayList, this.w0);
            while (i11 < arrayList.size()) {
                k kVar4 = (k) arrayList.get(i11);
                canvas2.save();
                canvas2.translate(kVar4.getX() + gVar2.getX(), kVar4.getY() + gVar2.getY());
                kVar4.draw(canvas2);
                canvas2.restore();
                i11++;
            }
        }
        if (z13) {
            float dp6 = AndroidUtilities.dp(16.0f);
            if (this.x0 == null) {
                this.x0 = new LinearGradient(0.0f, 0.0f, dp6, 0.0f, new int[]{16711680, -65536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.y0 = new Matrix();
                Paint paint = new Paint(1);
                this.z0 = paint;
                paint.setShader(this.x0);
                this.z0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            this.y0.reset();
            this.y0.postTranslate((getWidth() - visibleItemsMeasuredWidthWithAlpha) - dp6, 0.0f);
            this.x0.setLocalMatrix(this.y0);
            canvas2.drawRect((getWidth() - visibleItemsMeasuredWidthWithAlpha) - dp6, 0.0f, AndroidUtilities.dp(1.0f) + (getWidth() - visibleItemsMeasuredWidthWithAlpha), getHeight(), this.z0);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    public final k e(long j3) {
        g gVar = this.O == 2 ? this.r : this.h;
        for (int i10 = 0; i10 < gVar.getChildCount(); i10++) {
            View childAt = gVar.getChildAt(i10);
            if (childAt instanceof k) {
                k kVar = (k) childAt;
                if (kVar.E == j3) {
                    return kVar;
                }
            }
        }
        return null;
    }

    public final int f(int i10) {
        wy wyVar = this.e0;
        return (wyVar == null || wyVar.getResourceProvider() == null) ? org.telegram.ui.ActionBar.j6.w0(null, i10, false) : wyVar.getThemedColor(i10);
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

    public bi.x4 getPremiumHint() {
        return this.J;
    }

    public final void h() {
        if (this.s.H()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(UserConfig.getInstance(this.f).clientUserId));
            this.e0.getOrCreateStoryViewer().F(getContext(), null, arrayList, 0, null, null, s5.a(this.r), false);
        }
    }

    public final void i(k kVar, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.H0) == null || !valueAnimator.isRunning()) && kVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = kVar.F;
            i5 i5Var = this.s;
            if (!z11 || i5Var.H()) {
                if (i5Var.I(kVar.E) || i5Var.K(kVar.E)) {
                    TL_stories.PeerStories y3 = i5Var.y(kVar.E);
                    long j3 = kVar.E;
                    org.telegram.ui.web.a1 a1Var = this.r0;
                    if (a1Var != null) {
                        a1Var.a();
                        this.r0 = null;
                    }
                    a3.h0 h0Var = new a3.h0(this, kVar, j3, 28);
                    if (z10) {
                        h0Var.run();
                        return;
                    }
                    org.telegram.ui.web.a1 n10 = a6.n(y3, h0Var);
                    kVar.e = n10;
                    this.r0 = n10;
                    if (n10 != null) {
                        i5Var.e0(kVar.E, true);
                    }
                }
            } else if (MessagesController.getInstance(this.f).storiesEnabled()) {
                j(0L);
            } else {
                n();
            }
        }
    }

    public final void j(long j3) {
        k kVar;
        j4.w o9;
        wy wyVar = this.e0;
        int i10 = this.f;
        if (j3 == 0 && (o9 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o9.a(i10, 1)) {
            wyVar.showDialog(new qg.k0(o9.b(), this.f, getContext(), this.e0, null));
            return;
        }
        int i11 = 0;
        while (true) {
            g gVar = this.h;
            if (i11 >= gVar.getChildCount()) {
                kVar = null;
                break;
            }
            kVar = (k) gVar.getChildAt(i11);
            if (j3 == 0) {
                if (kVar.F) {
                    break;
                } else {
                    i11++;
                }
            } else if (kVar.E == j3) {
                break;
            } else {
                i11++;
            }
        }
        if (kVar == null) {
            return;
        }
        if (j3 == 0) {
            ce.E(wyVar.getParentActivity(), i10).R(xd.c(kVar));
            return;
        }
        org.telegram.ui.ActionBar.f6 resourceProvider = wyVar != null ? wyVar.getResourceProvider() : null;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getContext(), 3, resourceProvider);
        d2Var.q(500L);
        MessagesController.getInstance(i10).getStoriesController().k(j3, new to(this, d2Var, j3, kVar, 2), true, resourceProvider);
    }

    public final boolean k(long j3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            if (((j) arrayList.get(i10)).c == j3) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            s4.c0 c0Var = this.S;
            if (i10 < c0Var.I0()) {
                c0Var.h1(i10, 0);
                return true;
            }
            if (i10 > c0Var.M0()) {
                c0Var.i1(i10, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(float f7, boolean z10) {
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
            final int i12 = 2;
            if (!z10) {
                this.d0 = z11 ? 1.0f : 0.0f;
                b();
                AndroidUtilities.forEachViews((RecyclerView) this.h, (e2.h) new y2.h(i12));
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d0, z11 ? 1.0f : 0.0f);
            this.C0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zh.c
                public final /* synthetic */ l b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            l lVar = this.b;
                            lVar.getClass();
                            lVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            lVar.b();
                            break;
                        case 1:
                            l lVar2 = this.b;
                            lVar2.getClass();
                            lVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            l lVar3 = this.b;
                            lVar3.getClass();
                            lVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            l lVar4 = this.b;
                            lVar4.getClass();
                            lVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            lVar4.invalidate();
                            break;
                    }
                }
            });
            this.C0.setInterpolator(wr.h);
            float f10 = this.c0;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, z11 ? f10 : 0.0f);
            this.F0 = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zh.c
                public final /* synthetic */ l b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i11) {
                        case 0:
                            l lVar = this.b;
                            lVar.getClass();
                            lVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            lVar.b();
                            break;
                        case 1:
                            l lVar2 = this.b;
                            lVar2.getClass();
                            lVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            l lVar3 = this.b;
                            lVar3.getClass();
                            lVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            l lVar4 = this.b;
                            lVar4.getClass();
                            lVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            lVar4.invalidate();
                            break;
                    }
                }
            });
            this.F0.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.K0 = animatorSet2;
            animatorSet2.addListener(new iw0(14, this, z11));
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.C0);
            arrayList.add(this.F0);
            if (this.A0) {
                this.K0.setDuration(1000L);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.d0, z11 ? 1.0f : 0.0f);
                this.D0 = ofFloat3;
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zh.c
                    public final /* synthetic */ l b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i12) {
                            case 0:
                                l lVar = this.b;
                                lVar.getClass();
                                lVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                lVar.b();
                                break;
                            case 1:
                                l lVar2 = this.b;
                                lVar2.getClass();
                                lVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                l lVar3 = this.b;
                                lVar3.getClass();
                                lVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                l lVar4 = this.b;
                                lVar4.getClass();
                                lVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                lVar4.invalidate();
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
                this.H0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zh.c
                    public final /* synthetic */ l b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i13) {
                            case 0:
                                l lVar = this.b;
                                lVar.getClass();
                                lVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                lVar.b();
                                break;
                            case 1:
                                l lVar2 = this.b;
                                lVar2.getClass();
                                lVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                l lVar3 = this.b;
                                lVar3.getClass();
                                lVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                l lVar4 = this.b;
                                lVar4.getClass();
                                lVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                lVar4.invalidate();
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
        long j3 = UserConfig.getInstance(this.f).clientUserId;
        i5 i5Var = this.s;
        if (i5Var.J(j3)) {
            return true;
        }
        return i5Var.H() && i5Var.g.size() <= 3;
    }

    public final void n() {
        if (this.J == null) {
            bi.x4 x4Var = new bi.x4(getContext(), 1);
            x4Var.h(f(org.telegram.ui.ActionBar.j6.Fi));
            x4Var.p(true);
            x4Var.K = Layout.Alignment.ALIGN_CENTER;
            x4Var.l(0.0f, 29.0f);
            this.J = x4Var;
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.j6.Gi, 0, new d(this, 1));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) replaceSingleTag.getSpans(0, replaceSingleTag.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                replaceSingleTag.setSpan(new s51(AndroidUtilities.bold()), replaceSingleTag.getSpanStart(clickableSpanArr[0]), replaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
            }
            bi.x4 x4Var2 = this.J;
            x4Var2.h = bi.x4.a(replaceSingleTag, x4Var2.getTextPaint());
            this.J.s(replaceSingleTag);
            this.J.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.J, w7.a6.e(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 51));
            }
        }
        bi.x4 x4Var3 = this.J;
        if (x4Var3 != null) {
            if (x4Var3.V) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.J.u();
        }
    }

    public final void o() {
        x20 x20Var = a6.b;
        if (x20Var != null) {
            x20Var.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.lk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.mk, false), 0, 0);
        }
        x20 x20Var2 = a6.c;
        if (x20Var2 != null) {
            x20Var2.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.nk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ok, false), 0, 0);
        }
        x20[] x20VarArr = a6.a;
        x20 x20Var3 = x20VarArr[0];
        if (x20Var3 != null) {
            x20Var3.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kk, false), 0, 0);
        }
        x20 x20Var4 = x20VarArr[1];
        if (x20Var4 != null) {
            x20Var4.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ik, false), 0, 0);
        }
        if (a6.d != null) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.xj, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false);
            a6.d.d(i0.a.d(0.25f, w02, w03), w03, 0, 0);
        }
        int textColor = getTextColor();
        this.T.setTextColor(getTextLogoColor());
        org.telegram.ui.ActionBar.j jVar = this.U;
        if (jVar != null) {
            jVar.c();
        }
        this.V.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.h, (e2.h) new m4.s0(textColor, 4));
        AndroidUtilities.forEachViews((RecyclerView) this.r, (e2.h) new y2.h(3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false, false);
        NotificationCenter.getInstance(this.f).addObserver(this, NotificationCenter.storiesUpdated);
        com.google.firebase.messaging.m mVar = this.L0;
        mVar.a = true;
        AnimatorSet animatorSet = (AnimatorSet) mVar.c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.a0.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.storiesUpdated);
        com.google.firebase.messaging.m mVar = this.L0;
        mVar.a = false;
        ((AnimatorSet) mVar.c).cancel();
        org.telegram.ui.web.a1 a1Var = this.r0;
        if (a1Var != null) {
            a1Var.a();
            this.r0 = null;
        }
        this.a0.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.T.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        this.M = AndroidUtilities.dp(70.0f);
        AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(89.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.O == 2) {
            int dp = AndroidUtilities.dp((this.y.size() * 26.33f) - (Math.max(0, r0 - 1) * 16.0f));
            g gVar = this.r;
            int x10 = (int) gVar.getX();
            int y3 = (int) gVar.getY();
            int x11 = (int) (gVar.getX() + dp);
            int y10 = (int) (gVar.getY() + gVar.getHeight());
            ed edVar = this.I;
            edVar.getClass();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x10, y3, x11, y10);
            edVar.i = false;
            edVar.c = 0;
            edVar.a(rectF);
            if (edVar.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z10, boolean z11) {
        ArrayList arrayList;
        if ((this.O == 1 || this.n0 != 0.0f) && !z11) {
            this.K = true;
            return;
        }
        ArrayList arrayList2 = this.v;
        arrayList2.clear();
        ArrayList arrayList3 = this.x;
        arrayList2.addAll(arrayList3);
        ArrayList arrayList4 = this.w;
        arrayList4.clear();
        ArrayList arrayList5 = this.y;
        arrayList4.addAll(arrayList5);
        arrayList3.clear();
        int i10 = this.b;
        int i11 = this.f;
        if (i10 != 1) {
            arrayList3.add(new j(UserConfig.getInstance(i11).getClientUserId()));
        }
        i5 i5Var = this.s;
        ArrayList arrayList6 = i10 == 1 ? i5Var.h : i5Var.g;
        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList6.get(i12)).peer);
            if (peerDialogId != UserConfig.getInstance(i11).getClientUserId()) {
                arrayList3.add(new j(peerDialogId));
            }
        }
        int size = arrayList3.size();
        if (!i5Var.H()) {
            size--;
        }
        int max = Math.max(1, Math.max(i5Var.C(i10 == 1), size));
        this.f0 = null;
        boolean G = i5Var.G();
        org.telegram.ui.Components.o6 o6Var = this.T;
        if (G) {
            arrayList = arrayList3;
            if (i5Var.K(UserConfig.getInstance(i11).getClientUserId())) {
                String string = LocaleController.getString(R.string.UploadingStory);
                if (string.indexOf("…") > 0) {
                    if (this.i0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
                        a8 a8Var = new a8();
                        valueOf.setSpan(a8Var, valueOf.length() - 1, valueOf.length(), 0);
                        a8Var.a = o6Var;
                        a8Var.n = true;
                        this.i0 = valueOf;
                    }
                    this.f0 = this.i0;
                } else {
                    this.f0 = string;
                }
            } else {
                this.f0 = this.s0 < ((float) AndroidUtilities.dp(50.0f)) ? null : LocaleController.getString(R.string.MyStory);
            }
        } else {
            arrayList = arrayList3;
            this.f0 = this.s0 < ((float) AndroidUtilities.dp(50.0f)) ? null : LocaleController.formatPluralString("Stories", max, new Object[0]);
        }
        if (!this.g0) {
            o6Var.c(this.f0, z10 && !LocaleController.isRTL, true);
        }
        this.a.a(!TextUtils.isEmpty(this.f0) || this.g0, z10);
        arrayList5.clear();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (((j) arrayList.get(i13)).c != UserConfig.getInstance(i11).clientUserId || m()) {
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
        this.n0 = f7 / AndroidUtilities.dp(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f7) {
        l(f7, true);
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        bi.x4 x4Var = this.J;
        if (x4Var != null) {
            x4Var.setTranslationY(f7);
        }
    }

    @Override // le.d
    public final /* synthetic */ void B(float f7, int i10) {
    }
}
