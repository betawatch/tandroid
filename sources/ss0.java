// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ss0 extends d implements gk7 {
    public final wi1 E;
    public final wi1 F;
    public final wi1 G;
    public final wi1 H;
    public final wi1 I;
    public final wi1 J;
    public final SpannableStringBuilder K;
    public iva L;
    public FrameLayout M;
    public FrameLayout N;
    public wec O;
    public boolean P;
    public int Q;
    public t1 R;
    public LinearLayout S;
    public RelativeSizeSpan T;
    public hn U;
    public hn V;
    public os0 W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final boolean a;
    public ps0 a0;
    public final long b;
    public tb b0;
    public final boolean c;
    public u41 c0;
    public o72 d;
    public final cm2[] d0;
    public q5c e;
    public t1 e0;
    public dha f;
    public RelativeSizeSpan f0;
    public hn g0;
    public si9 h;
    public hn h0;
    public u41 i0;
    public double j0;
    public m21 k0;
    public SpannableStringBuilder l0;
    public SpannableStringBuilder m0;
    public int n;
    public SpannableStringBuilder n0;
    public boolean o0;
    public gxa p0;
    public gxa q0;
    public View r;
    public DecimalFormat r0;
    public fm0 s;
    public SpannableStringBuilder s0;
    public final es0 t0;
    public final int u0;
    public TLRPC.TL_payments_starsRevenueStats w;
    public TLRPC.TL_starsRevenueStatus x;
    public gxa y;

    /* JADX WARN: Multi-variable type inference failed */
    public ss0(int i, long j) {
        super(null);
        this.n = -1;
        this.E = wi1.a("XTR", k96.M0(2131752949, null));
        this.F = wi1.a("XTR", k96.M0(2131752947, null));
        this.G = wi1.a("XTR", k96.M0(2131752946, null));
        this.H = wi1.a("TON", k96.M0(2131753021, null));
        this.I = wi1.a("TON", k96.M0(2131753020, null));
        this.J = wi1.a("TON", k96.M0(2131753019, null));
        this.X = false;
        this.Y = true;
        this.d0 = new cm2[1];
        this.t0 = new es0(this, (byte) 0);
        this.u0 = -1;
        this.a = i;
        this.b = j;
        boolean z = j == getUserConfig().e();
        this.c = z;
        if (i == 0) {
            ct0.g(this.currentAccount).r(j);
            if (!z) {
                ct0.g(this.currentAccount).l(j);
            }
        } else if (i == 1) {
            ct0 g = ct0.g(this.currentAccount);
            Long l = (Long) g.d.get(Long.valueOf(j));
            g.j(j, l == null || System.currentTimeMillis() - l.longValue() > 30000);
        }
        this.K = gl.D2(gl.N2(z ? k96.H(',', "SelfStarsWithdrawInfo", (int) getMessagesController().k4.q2.f()) : k96.M0(2131752945, null), -1, 0, new es0(this, (byte) 2), null), true);
    }

    public static String w0(int i) {
        int i2 = i / 86400;
        int i3 = i - (86400 * i2);
        int i4 = i3 / 3600;
        int i5 = i3 - (i4 * 3600);
        int i6 = i5 / 60;
        int i7 = i5 - (i6 * 60);
        if (i2 == 0) {
            return i4 == 0 ? String.format(Locale.ENGLISH, "%02d:%02d", Integer.valueOf(i6), Integer.valueOf(i7)) : String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i7));
        }
        Locale locale = Locale.ENGLISH;
        return k96.a0(null, null, 2131747129, String.format(locale, "%02d", Integer.valueOf(i2)), String.format(locale, "%02d", Integer.valueOf(i4)), String.format(locale, "%02d", Integer.valueOf(i6)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v131, types: [android.widget.FrameLayout] */
    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        dha dhaVar;
        byte b = 1;
        if (this.a || !this.c) {
            dha dhaVar2 = new dha(context);
            this.f = dhaVar2;
            dhaVar2.setCommonInsetsManagedExternally(true);
            this.f.setGeometry(new qx4(this));
            dha dhaVar3 = this.f;
            dhaVar3.getClass();
            this.h = new si9((byte) 6, context, dhaVar3);
            dhaVar = this.f;
        } else {
            this.f = null;
            this.h = null;
            dhaVar = new FrameLayout(context);
        }
        FrameLayout frameLayout = dhaVar;
        frameLayout.setBackgroundColor(getThemedColor(bkb.Z6));
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        this.d = new o72(context, null, false, getResourceProvider());
        TLRPC.User V1 = getMessagesController().V1(Long.valueOf(this.b));
        this.d.k(V1, true);
        this.simpleActionBar.setTitle(l7c.r(V1));
        boolean z7 = this.a;
        pha phaVar = this.simpleActionBar;
        if (z7) {
            phaVar.setSubtitle(k96.M0(2131752936, null));
        } else {
            phaVar.setSubtitle(k96.M0(2131752937, null));
        }
        this.simpleActionBar.setBackButtonDrawable(new ed0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 9));
        this.simpleActionBar.setBackground(null);
        iva ivaVar = (this.a || this.f == null) ? null : new iva(context, this.currentAccount, false, this.b, getClassGuid(), getResourceProvider(), this.f);
        this.L = ivaVar;
        if (this.a) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.M = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.M.setClipToPadding(false);
            s39 s39Var = new s39(context, this.resourceProvider, this.f);
            this.O = s39Var;
            s39Var.setAdapter(new qs0(this, context, s39Var));
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.N = frameLayout3;
            frameLayout3.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
            this.N.addView(s39Var.l(-2, true), nme.e(-1, 48, 48));
            this.M.addView(s39Var, nme.c(-1.0f, -1));
        } else if (ivaVar != null) {
            this.O = ivaVar.getViewPager();
            this.N = this.L.getTabsContainer();
        }
        t1 t1Var = new t1(b, context, z);
        this.R = t1Var;
        t1Var.setOrientation(1);
        t1 t1Var2 = this.R;
        int i = bkb.c6;
        zkb.h(i, getResourceProvider(), t1Var2);
        this.R.setPadding(0, 0, 0, gl.L(17.0f));
        hn hnVar = new hn(context, false, true, true);
        this.U = hnVar;
        hnVar.setTypeface(gl.o());
        hn hnVar2 = this.U;
        int i2 = bkb.F6;
        zkb.U(hnVar2, i2, getResourceProvider());
        this.U.setTextSize(gl.L(32.0f));
        this.U.setGravity(17);
        this.T = new RelativeSizeSpan(0.6770833f);
        this.R.addView(this.U, nme.t(-1, 38, 49, 22, 15, 22, 0));
        hn hnVar3 = new hn(context, true, true, true);
        this.V = hnVar3;
        hnVar3.setGravity(17);
        hn hnVar4 = this.V;
        int i3 = bkb.x6;
        zkb.U(hnVar4, i3, getResourceProvider());
        this.V.setTextSize(gl.L(14.0f));
        this.R.addView(this.V, nme.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        os0 os0Var = new os0(z6 ? 1 : 0, context, this);
        this.W = os0Var;
        os0Var.setText(k96.M0(2131752941, null));
        this.W.setLeftPadding(gl.L(36.0f));
        ps0 ps0Var = new ps0(context, (byte) (z5 ? 1 : 0));
        this.a0 = ps0Var;
        ps0Var.setFocusable(false);
        zkb.X(this.a0, i2, getResourceProvider());
        this.a0.setCursorSize(gl.L(20.0f));
        this.a0.setCursorWidth(1.5f);
        this.a0.setBackground(null);
        this.a0.setTextSize(1, 18.0f);
        this.a0.setMaxLines(1);
        int L = gl.L(16.0f);
        this.a0.setPadding(gl.L(6.0f), L, L, L);
        byte b2 = 2;
        this.a0.setInputType(2);
        this.a0.setTypeface(Typeface.DEFAULT);
        zkb.C(this.a0, bkb.kg, getResourceProvider());
        zkb.y(this.a0, bkb.lg, getResourceProvider());
        byte b3 = 3;
        this.a0.setGravity(k96.a0 ? 5 : 3);
        this.a0.setOnFocusChangeListener(new ls0(this, z4 ? 1 : 0));
        this.a0.addTextChangedListener(new b7(this, b2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, nme.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.a0, nme.p(-1, -2, 1.0f, kk7.D1));
        this.W.e(this.a0);
        this.W.addView(linearLayout, nme.e(-1, -2, 48));
        this.a0.setOnEditorActionListener(new j(this, b3));
        this.R.addView(this.W, nme.t(-1, -2, 1, 18, 14, 18, 2));
        this.W.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.S = linearLayout2;
        linearLayout2.setOrientation(0);
        tb tbVar = new tb(context, true, getResourceProvider(), b3);
        tbVar.setRoundRadius(24);
        this.b0 = tbVar;
        tbVar.setEnabled(na7.q1(this.currentAccount).k4.T2.f);
        this.b0.i(k96.M0(2131752957, null), false, true);
        tb tbVar2 = this.b0;
        final boolean z8 = z3 ? 1 : 0;
        tbVar2.setOnClickListener(new View.OnClickListener(this) { // from class: ns0
            public final /* synthetic */ ss0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = z8;
                ss0 ss0Var = this.b;
                switch (b4) {
                    case 0:
                        ss0Var.y0();
                        break;
                    default:
                        ss0Var.p0(view);
                        break;
                }
            }
        });
        u41 u41Var = new u41(getResourceProvider(), context, true);
        u41Var.setRoundRadius(24);
        this.c0 = u41Var;
        u41Var.setEnabled(true);
        this.c0.i(k96.M0(2131748182, null), false, true);
        this.c0.setOnClickListener(new t(this, context, (byte) 24));
        this.S.addView(this.b0, nme.p(-1, 48, 1.0f, kk7.D1));
        if (!this.c) {
            this.S.addView(new Space(context), nme.p(8, 48, 0.0f, kk7.D1));
            this.S.addView(this.c0, nme.p(-1, 48, 1.0f, kk7.D1));
        }
        this.R.addView(this.S, nme.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        t1 t1Var3 = new t1((byte) 2, context, z2 ? 1 : 0);
        this.e0 = t1Var3;
        t1Var3.setOrientation(1);
        zkb.h(i, this.resourceProvider, this.e0);
        this.e0.setPadding(0, 0, 0, gl.L(17.0f));
        hn hnVar5 = new hn(context, false, true, true);
        this.g0 = hnVar5;
        hnVar5.setTypeface(gl.o());
        zkb.U(this.g0, i2, this.resourceProvider);
        this.g0.setTextSize(gl.L(32.0f));
        this.g0.setGravity(17);
        this.f0 = new RelativeSizeSpan(0.6770833f);
        this.e0.addView(this.g0, nme.t(-1, 38, 49, 22, 15, 22, 0));
        hn hnVar6 = new hn(context, true, true, true);
        this.h0 = hnVar6;
        hnVar6.setGravity(17);
        zkb.U(this.h0, i3, this.resourceProvider);
        this.h0.setTextSize(gl.L(14.0f));
        this.e0.addView(this.h0, nme.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        u41 u41Var2 = new u41(this.resourceProvider, context, true);
        u41Var2.setRoundRadius(24);
        this.i0 = u41Var2;
        u41Var2.setEnabled(na7.q1(this.currentAccount).k4.T2.f);
        final byte b4 = 1;
        this.i0.i(k96.M0(this.c ? 2131748183 : 2131748159, null), false, true);
        this.i0.setVisibility(8);
        this.i0.setOnClickListener(new View.OnClickListener(this) { // from class: ns0
            public final /* synthetic */ ss0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b42 = b4;
                ss0 ss0Var = this.b;
                switch (b42) {
                    case 0:
                        ss0Var.y0();
                        break;
                    default:
                        ss0Var.p0(view);
                        break;
                }
            }
        });
        this.e0.addView(this.i0, nme.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        q5c q5cVar = new q5c(this, new is0(this, (byte) 1), new fs0(this), new qm0(this, (byte) 4));
        this.e = q5cVar;
        q5cVar.r1();
        q5c q5cVar2 = this.e;
        q5cVar2.g3.r = false;
        q5cVar2.setCaptureSectionsDecoratorAllowed(true);
        this.e.setClipToPadding(false);
        this.e.setOverScrollMode(0);
        dha dhaVar4 = this.f;
        q5c q5cVar3 = this.e;
        if (dhaVar4 != null) {
            getParentActivity();
            xe2 xe2Var = new xe2((Object) dhaVar4, (byte) 5);
            q5cVar3.f3 = xe2Var;
            q5cVar3.setLayoutManager(xe2Var);
            this.f.v(this.e, new fs0(this));
            this.f.y(this.a ? this.M : this.L, this.O, new fs0(this));
            FrameLayout frameLayout4 = this.N;
            this.f.z(frameLayout4);
            frameLayout4.setLayoutParams(nme.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        } else {
            frameLayout.addView(q5cVar3, nme.c(-1.0f, -1));
        }
        this.fragmentView = frameLayout;
        getBaseSimpleGlass().f(frameLayout, this.e, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.r = new View(getParentActivity());
        frameLayout.addView(this.r, frameLayout.indexOfChild(this.f != null ? this.N : this.simpleActionBar), nme.e(-1, 0, 48));
        this.r.setBackground(getBaseSimpleGlass().a(this.r));
        fm0 fm0Var = new fm0(0, new fs0(this), s33.h, 380L, false);
        this.s = fm0Var;
        dha dhaVar5 = this.f;
        fm0Var.a(dhaVar5 != null && dhaVar5.f0, false);
        if (this.f != null) {
            getBaseSimpleGlass().n = this.f;
            iva ivaVar2 = this.L;
            qw4 qw4Var = this.glassEngine;
            if (ivaVar2 != null) {
                ivaVar2.setGlassEngine(qw4Var);
            } else {
                qw4Var.c(this.O);
            }
            getBaseSimpleGlass().o = new cg0(this, new jd(frameLayout, (byte) 1), (byte) 2);
            View view = this.N;
            il0 c = getBaseSimpleGlass().c.c(view, null, false);
            c.p(nod.l(this.resourceProvider));
            c.q(gl.L(9.66f));
            c.r(gl.L(18.0f));
            view.setBackground(c);
        }
        gl.B2(this.d.e);
        frameLayout.addView(this.d.e, nme.e(42, 42, 53));
        l0();
        return this.fragmentView;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.D3 && ((Long) objArr[0]).longValue() == this.b) {
            m0();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return gl.B(bkb.w0(null, bkb.c6, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        wec wecVar = this.O;
        if (wecVar == null || !wecVar.canScrollHorizontally(-1)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void l0() {
        if (this.e != null) {
            gl.v3(this.d.e, 0, ((a.getCurrentActionBarHeight() - gl.L(42.0f)) / 2) + this.mSystemInsets.b, gl.L(6.0f), 0);
            q5c q5cVar = this.e;
            io5 io5Var = this.mSystemInsets;
            dg0.e(q5cVar, io5Var.b, io5Var.d, a.getCurrentActionBarHeight(), 0);
            if (this.f != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
                this.f.A(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                dha dhaVar = this.f;
                dhaVar.C();
                dhaVar.requestLayout();
                dhaVar.invalidate();
            }
            if (this.r != null) {
                int currentActionBarHeight = a.getCurrentActionBarHeight() + this.mSystemInsets.b + (this.f != null ? gl.L(44.0f) : 0);
                ViewGroup.LayoutParams layoutParams = this.r.getLayoutParams();
                if (layoutParams.height != currentActionBarHeight) {
                    layoutParams.height = currentActionBarHeight;
                    this.r.setLayoutParams(layoutParams);
                }
                x0();
            }
        }
    }

    public final void m0() {
        fk1 fk1Var;
        ArrayList arrayList;
        TLRPC.TL_payments_starsRevenueStats h = ct0.g(this.currentAccount).h(this.b, false);
        if (h == this.w) {
            if ((h == null ? null : h.status) == this.x) {
                return;
            }
        }
        this.w = h;
        this.x = h == null ? null : h.status;
        if (h != null) {
            this.j0 = h.usd_rate;
            gxa f0 = uxa.f0(h.revenue_graph, k96.M0(2131752951, null), 2, false);
            this.y = f0;
            if (f0 != null && (fk1Var = f0.d) != null && (arrayList = fk1Var.d) != null && !arrayList.isEmpty() && this.y.d.d.get(0) != null) {
                gxa gxaVar = this.y;
                gxaVar.h = true;
                ((ek1) gxaVar.d.d.get(0)).g = bkb.ok;
                this.y.d.h = (float) ((1.0d / this.j0) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = h.status;
            v0(tL_starsRevenueStatus.available_balance, tL_starsRevenueStatus.next_withdrawal_at);
            q5c q5cVar = this.e;
            if (q5cVar != null) {
                dha dhaVar = this.f;
                boolean z = dhaVar != null && dhaVar.f0;
                q5cVar.g3.O(dhaVar == null);
                if (z) {
                    this.f.a();
                }
            }
        }
    }

    public final void n0(ArrayList arrayList) {
        int i;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i2;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        this.n = -1;
        ct0 g = ct0.g(this.currentAccount);
        boolean z = this.a;
        if (!z) {
            arrayList.add(c4c.h(2, this.u0, this.y));
            arrayList.add(c4c.B(-1, null));
            arrayList.add(c4c.b(k96.M0(2131752950, null)));
            TLRPC.TL_payments_starsRevenueStats h = g.h(this.b, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                wi1 wi1Var = this.E;
                wi1Var.a = false;
                wi1Var.g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus2.available_balance;
                wi1Var.i = starsAmount;
                wi1Var.h = "XTR";
                wi1Var.f = "USD";
                double d = starsAmount.amount;
                double d2 = this.j0;
                wi1Var.j = (long) (d * d2 * 100.0d);
                wi1 wi1Var2 = this.F;
                wi1Var2.a = false;
                wi1Var2.g = true;
                wi1Var2.i = tL_starsRevenueStatus2.current_balance;
                wi1Var2.h = "XTR";
                wi1Var2.j = (long) (r5.amount * d2 * 100.0d);
                wi1Var2.f = "USD";
                wi1 wi1Var3 = this.G;
                wi1Var3.a = false;
                wi1Var3.g = true;
                wi1Var3.i = tL_starsRevenueStatus2.overall_revenue;
                wi1Var3.h = "XTR";
                wi1Var3.j = (long) (r5.amount * d2 * 100.0d);
                wi1Var3.f = "USD";
                v0(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                this.S.setVisibility(h.status.withdrawal_enabled ? 0 : 8);
            }
            arrayList.add(c4c.v(this.E));
            arrayList.add(c4c.v(this.F));
            arrayList.add(c4c.v(this.G));
            arrayList.add(c4c.B(-2, k96.M0(this.c ? 2131745453 : 2131752948, null)));
            arrayList.add(c4c.b(k96.M0(2131752960, null)));
            arrayList.add(c4c.j(1, this.R));
            arrayList.add(c4c.B(-3, this.K));
            if (this.c) {
                return;
            }
            if (getMessagesController().k4.C2.f) {
                arrayList.add(xb.i(2, bkb.v0(bkb.kk, this.resourceProvider), p82.a0(k96.M0(2131753142, null)), k96.M0(2131753143, null)));
                arrayList.add(c4c.B(-4, null));
            }
            this.n = arrayList.size();
            arrayList.add(c4c.n(this.h, -2));
            return;
        }
        if (z) {
            TLRPC.TL_payments_starsRevenueStats j = g.j(this.b, true);
            byte b = 3;
            if (!this.c) {
                SpannableStringBuilder spannableStringBuilder = this.l0;
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = gl.D2(gl.N2(k96.a0(null, null, 2131753033, 50), -1, 3, new es0(this, b), this.resourceProvider), true);
                    this.l0 = spannableStringBuilder;
                }
                arrayList.add(c4c.g(spannableStringBuilder));
            }
            gxa gxaVar = this.p0;
            if (gxaVar == null && j != null) {
                gxaVar = uxa.f0(j.top_hours_graph, k96.M0(2131753035, null), 0, false);
                this.p0 = gxaVar;
                if (gxaVar != null) {
                    gxaVar.n = true;
                }
            }
            if (gxaVar != null && !gxaVar.l) {
                arrayList.add(c4c.h(5, this.u0, gxaVar));
                arrayList.add(c4c.B(-1, null));
            }
            gxa gxaVar2 = this.q0;
            if (gxaVar2 != null || j == null) {
                i = 2;
            } else {
                TL_stats.StatsGraph statsGraph = j.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j.usd_rate);
                }
                i = 2;
                gxaVar2 = uxa.f0(statsGraph, k96.M0(2131753034, null), 2, false);
                this.q0 = gxaVar2;
            }
            if (gxaVar2 != null && !gxaVar2.l) {
                arrayList.add(c4c.h(i, this.u0, gxaVar2));
                arrayList.add(c4c.B(-2, null));
            }
            if (!this.o0 && j != null && (tL_starsRevenueStatus = j.status) != null) {
                double d3 = j.usd_rate;
                wi1 wi1Var4 = this.H;
                long j2 = tL_starsRevenueStatus.available_balance.amount;
                wi1Var4.d = j2;
                double d4 = j2 / 1.0E9d;
                long j3 = (long) (d4 * d3 * 100.0d);
                wi1Var4.e = j3;
                if (this.r0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    this.r0 = decimalFormat;
                    i2 = 2;
                    decimalFormat.setMinimumFractionDigits(2);
                    this.r0.setMaximumFractionDigits(6);
                    this.r0.setGroupingUsed(false);
                } else {
                    i2 = 2;
                }
                DecimalFormat decimalFormat2 = this.r0;
                if (d4 <= 1.5d) {
                    i2 = 6;
                }
                decimalFormat2.setMaximumFractionDigits(i2);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(zi1.L("TON " + this.r0.format(d4), this.g0.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder2, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder2.setSpan(this.f0, indexOf, spannableStringBuilder2.length(), 33);
                }
                this.g0.setText(spannableStringBuilder2);
                this.h0.setText("≈" + ci0.h().e(j3, "USD"));
                this.H.f = "USD";
                wi1 wi1Var5 = this.I;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j.status;
                long j4 = tL_starsRevenueStatus3.current_balance.amount;
                wi1Var5.d = j4;
                wi1Var5.e = (long) ((j4 / 1.0E9d) * d3 * 100.0d);
                wi1Var5.f = "USD";
                wi1 wi1Var6 = this.J;
                wi1Var6.a = true;
                long j5 = tL_starsRevenueStatus3.overall_revenue.amount;
                wi1Var6.d = j5;
                wi1Var6.e = (long) ((j5 / 1.0E9d) * d3 * 100.0d);
                wi1Var6.f = "USD";
                this.o0 = true;
                this.i0.setVisibility((tL_starsRevenueStatus3.available_balance.amount <= 0 || !tL_starsRevenueStatus3.withdrawal_enabled) ? 8 : 0);
            }
            if (this.o0) {
                arrayList.add(c4c.b(k96.M0(2131753022, null)));
                arrayList.add(c4c.v(this.H));
                arrayList.add(c4c.v(this.I));
                arrayList.add(c4c.v(this.J));
                SpannableStringBuilder spannableStringBuilder3 = this.m0;
                if (spannableStringBuilder3 == null) {
                    spannableStringBuilder3 = gl.D2(gl.N2(k96.M0(2131753018, null), -1, 3, new es0(this, (byte) 4), this.resourceProvider), true);
                    this.m0 = spannableStringBuilder3;
                }
                arrayList.add(c4c.B(-4, spannableStringBuilder3));
            }
            arrayList.add(c4c.b(k96.M0(2131753039, null)));
            arrayList.add(c4c.k(this.e0));
            SpannableStringBuilder spannableStringBuilder4 = this.n0;
            if (spannableStringBuilder4 == null) {
                spannableStringBuilder4 = gl.D2(gl.N2(k96.M0(na7.q1(this.currentAccount).k4.T2.f ? 2131753038 : 2131753036, null), -1, 3, new es0(this, (byte) 5), null), true);
                this.n0 = spannableStringBuilder4;
            }
            arrayList.add(c4c.B(-5, spannableStringBuilder4));
            this.n = arrayList.size();
            arrayList.add(c4c.n(this.h, -2));
        }
    }

    public final void o0(boolean z, long j, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User f = y6c.h(this.currentAccount).f();
        if (parentActivity == null || f == null) {
            return;
        }
        long j2 = this.b;
        if (z) {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = na7.q1(this.currentAccount).h1(j2);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
            tL_payments_getStarsRevenueWithdrawalUrl.amount = j;
        } else {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = na7.q1(this.currentAccount).h1(j2);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new js0(this, twoStepVerificationActivity, parentActivity, z, j));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        kk7.f(this.currentAccount).b(this, kk7.D3);
        m0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        this.P = true;
        kk7.f(this.currentAccount).n(this, kk7.D3);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        l0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            o72 o72Var = this.d;
            if (o72Var != null) {
                o72Var.i(bkb.w0(null, bkb.Ej, false), bkb.w0(null, bkb.Fj, false));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void p0(View view) {
        if (!view.isEnabled() || this.i0.R) {
            return;
        }
        if (this.c && uz4.c(this.currentAccount)) {
            uz4.g(this, this.H.d, new is0(this, (byte) 0));
            return;
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        o oVar = new o(this, twoStepVerificationActivity, (byte) 23);
        twoStepVerificationActivity.a0 = (byte) 1;
        twoStepVerificationActivity.c0 = oVar;
        this.i0.setLoading(true);
        twoStepVerificationActivity.w0(new gs0(this, twoStepVerificationActivity, (byte) 0));
    }

    public final void q0(Context context, View view) {
        if (view.isEnabled()) {
            u41 u41Var = this.c0;
            if (u41Var.R) {
                return;
            }
            u41Var.setLoading(true);
            TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
            tL_payments_getStarsRevenueAdsAccountUrl.peer = na7.q1(this.currentAccount).h1(this.b);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new pl(this, context, (byte) 5));
        }
    }

    public final void r0() {
        showDialog(zi1.J(this.resourceProvider, getParentActivity(), true));
    }

    public final void s0(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z, long j, TLObject tLObject) {
        int i;
        if (tL_error == null) {
            twoStepVerificationActivity.s0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
                d01.v(getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url, false);
                return;
            } else {
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    this.Y = true;
                    d01.v(getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url, false);
                    return;
                }
                return;
            }
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new j67((byte) 1, j, this, twoStepVerificationActivity, z), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.s0();
                twoStepVerificationActivity.finishFragment();
            }
            u21.e0(tL_error);
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.s0();
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String M0 = k96.M0(2131751285, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(gl.L(24.0f), gl.L(2.0f), gl.L(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(activity);
        int i2 = bkb.i5;
        zkb.X(textView, i2, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((k96.a0 ? 5 : 3) | 48);
        textView.setText(gl.S2(k96.M0(2131742601, null)));
        linearLayout.addView(textView, nme.o(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(k96.a0 ? gl.L(11.0f) : 0, gl.L(9.0f), k96.a0 ? 0 : gl.L(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.s(imageView, i2, null, mode);
        TextView textView2 = new TextView(activity);
        zkb.X(textView2, i2, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((k96.a0 ? 5 : 3) | 48);
        textView2.setText(gl.S2(k96.M0(2131751288, null)));
        if (k96.a0) {
            linearLayout2.addView(textView2, nme.o(-1, -2));
            linearLayout2.addView(imageView, nme.r(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, nme.o(-2, -2));
            linearLayout2.addView(textView2, nme.o(-1, -2));
        }
        LinearLayout m = ir2.m(activity, 0);
        linearLayout.addView(m, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(k96.a0 ? gl.L(11.0f) : 0, gl.L(9.0f), k96.a0 ? 0 : gl.L(11.0f), 0);
        zkb.s(imageView2, i2, null, mode);
        TextView textView3 = new TextView(activity);
        zkb.X(textView3, i2, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((k96.a0 ? 5 : 3) | 48);
        textView3.setText(gl.S2(k96.M0(2131751287, null)));
        if (k96.a0) {
            m.addView(textView3, nme.o(-1, -2));
            i = 5;
            m.addView(imageView2, nme.r(-2, -2, 5));
        } else {
            i = 5;
            m.addView(imageView2, nme.o(-2, -2));
            m.addView(textView3, nme.o(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.j(k96.M0(2131751279, null), new fs0(this));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
        } else {
            TextView textView4 = new TextView(activity);
            zkb.X(textView4, i2, null);
            textView4.setTextSize(1, 16.0f);
            de9.q(textView4, (k96.a0 ? i : 3) | 48, null, 2131751286);
            linearLayout.addView(textView4, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.g(k96.M0(2131747638, null), null);
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.showDialog(hdVar);
        } else {
            showDialog(hdVar);
        }
    }

    public final void t0() {
        m21.e();
        TLRPC.TL_payments_starsRevenueStats h = ct0.g(this.currentAccount).h(this.b, false);
        long j = h == null ? 0L : h.status.available_balance.amount;
        if (j < getMessagesController().k4.q2.f()) {
            this.Y = true;
            this.Z = j;
        } else {
            this.Y = false;
            j = getMessagesController().k4.q2.f();
            this.Z = j;
        }
        this.X = true;
        this.a0.setText(Long.toString(j));
        ps0 ps0Var = this.a0;
        ps0Var.setSelection(ps0Var.getText().length());
        this.X = false;
        es0 es0Var = this.t0;
        gl.r(es0Var);
        es0Var.run();
    }

    public final void u0(c4c c4cVar) {
        boolean H = c4cVar.H(dva.class);
        Object obj = c4cVar.H;
        if (H) {
            Activity parentActivity = getParentActivity();
            int i = this.currentAccount;
            wjb resourceProvider = getResourceProvider();
            jva.k1(parentActivity, true, this.b, i, (TL_stars.StarsTransaction) obj, resourceProvider);
            return;
        }
        if (obj instanceof TL_stats.BroadcastRevenueTransaction) {
            zi1.N(getParentActivity(), this.currentAccount, (TL_stats.BroadcastRevenueTransaction) c4cVar.H, this.b, this.resourceProvider);
        } else if (c4cVar.d == 2) {
            presentFragment(new eg1(this.b));
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(TL_stars.StarsAmount starsAmount, int i) {
        if (this.U == null || this.V == null) {
            return;
        }
        long j = (long) (this.j0 * starsAmount.amount * 100.0d);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jva.a1(false, TextUtils.concat("XTR ", jva.G0(starsAmount, 0.8f, ' ')), 1.0f, null));
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(this.T, indexOf, spannableStringBuilder.length(), 33);
        }
        this.U.setText(spannableStringBuilder);
        this.V.setText("≈" + ci0.h().e(j, "USD"));
        this.W.setVisibility(j > 0 ? 0 : 8);
        if (this.Y) {
            this.X = true;
            ps0 ps0Var = this.a0;
            long j2 = starsAmount.amount;
            this.Z = j2;
            ps0Var.setText(Long.toString(j2));
            ps0 ps0Var2 = this.a0;
            ps0Var2.setSelection(ps0Var2.getText().length());
            this.X = false;
            this.b0.setEnabled(this.Z > 0);
        }
        this.Q = i;
        es0 es0Var = this.t0;
        gl.r(es0Var);
        es0Var.run();
    }

    public final void x0() {
        View view = this.r;
        if (view == null) {
            return;
        }
        fm0 fm0Var = this.s;
        view.setTranslationY(this.f != null ? (-(1.0f - (fm0Var == null ? 0.0f : fm0Var.e))) * gl.L(44.0f) : 0.0f);
    }

    public final void y0() {
        tb tbVar = this.b0;
        if (!tbVar.e0 || tbVar.R) {
            return;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        byte b = 1;
        if (this.Q > currentTime) {
            this.k0 = u21.b0(this).Q(R.raw.timer_3, 36, gl.S2(k96.a0(null, null, 2131752940, w0(this.Q - currentTime)))).j();
            return;
        }
        if (this.Z < getMessagesController().k4.q2.f()) {
            u21.b0(this).M(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), gl.N2(k96.G((int) getMessagesController().k4.q2.f(), "BotStarsWithdrawMinLimit", new Object[0]), -1, 0, new es0(this, b), null)).j();
            return;
        }
        long j = this.Z;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        hs0 hs0Var = new hs0((Object) this, j, (Object) twoStepVerificationActivity, (byte) 0);
        twoStepVerificationActivity.a0 = (byte) 1;
        twoStepVerificationActivity.c0 = hs0Var;
        this.b0.setLoading(true);
        twoStepVerificationActivity.w0(new gs0(this, twoStepVerificationActivity, b));
    }
}
