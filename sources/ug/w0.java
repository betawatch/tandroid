package ug;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import bi.k7;
import bi.m5;
import c8.ha;
import di.m4;
import di.r3;
import di.v7;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.sz;
import org.telegram.messenger.ui;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.a20;
import org.telegram.ui.Components.ea;
import org.telegram.ui.Components.r7;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.xq;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.nt0;
import org.telegram.ui.vs0;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class w0 extends v2 implements ls {
    public static final /* synthetic */ int F1 = 0;
    public final ws0 A1;
    public int B1;
    public int C1;
    public int D1;
    public r7 E1;
    public final f2 i1;
    public final p0 j1;
    public final ArrayList k1;
    public float l1;
    public float m1;
    public boolean n1;
    public final u0 o1;
    public final pg.h p1;
    public int q1;
    public final FrameLayout r1;
    public boolean s1;
    public final rz t1;
    public final int u1;
    public final boolean v1;
    public boolean w1;
    public int x1;
    public int y1;
    public float z1;

    public w0(int i7, Context context, f6 f6Var) {
        this(null, context, p10.s0, false, i7, true, null, f6Var);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        int i7 = 0;
        while (true) {
            u0 u0Var = this.o1;
            if (i7 >= u0Var.getChildCount()) {
                return true;
            }
            v0 v0Var = (v0) u0Var.getChildAt(i7);
            if (v0Var.a == this.x1) {
                if (v0Var.f instanceof a) {
                    return !((a) r1).b.canScrollVertically(-1);
                }
            }
            i7++;
        }
    }

    public final void I0() {
        u0 u0Var;
        View m10;
        View m11;
        int i7 = -1;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            u0Var = this.o1;
            if (i11 >= u0Var.getChildCount()) {
                break;
            }
            v0 v0Var = (v0) u0Var.getChildAt(i11);
            int i12 = v0Var.a;
            ViewGroup viewGroup = v0Var.f;
            if (i12 == this.x1 && (viewGroup instanceof a) && ((m11 = ((a) viewGroup).c.m(0)) == null || (i7 = m11.getTop()) < 0)) {
                i7 = 0;
            }
            if (v0Var.a == this.y1 && (viewGroup instanceof a) && ((m10 = ((a) viewGroup).c.m(0)) == null || (i10 = m10.getTop()) < 0)) {
                i10 = 0;
            }
            i11++;
        }
        int i13 = this.C1;
        if (i7 >= 0) {
            float f10 = 1.0f - this.z1;
            i13 = Math.min(i13, (int) com.google.android.recaptcha.internal.a.z(1.0f, f10, i13, i7 * f10));
        }
        if (i10 >= 0) {
            float f11 = this.z1;
            i13 = Math.min(i13, (int) com.google.android.recaptcha.internal.a.z(1.0f, f11, this.C1, i10 * f11));
        }
        float f12 = 1.0f - this.m1;
        FrameLayout frameLayout = this.r1;
        frameLayout.setAlpha(f12);
        if (this.l1 == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z9 = this.n1;
        pg.h hVar = this.p1;
        hVar.setTranslationX((z9 ? hVar.getMeasuredWidth() : -hVar.getMeasuredWidth()) * this.m1);
        if (i13 != this.D1) {
            this.D1 = i13;
            for (int i14 = 0; i14 < u0Var.getChildCount(); i14++) {
                if (!((v0) u0Var.getChildAt(i14)).h) {
                    u0Var.getChildAt(i14).setTranslationY(this.D1);
                }
            }
            hVar.setTranslationY(this.D1);
            frameLayout.setTranslationY(this.D1);
            this.b.invalidate();
            org.telegram.messenger.g0.Z3(this.E1, this.D1 < org.telegram.messenger.g0.L(this.u1 == 40 ? 5.0f : 30.0f), 1.0f, true, true);
        }
    }

    public final void J0() {
        boolean z9 = this.w1;
        p0 p0Var = this.j1;
        if (z9) {
            p0Var.f.setText(hd.M0(2131754942, null));
            return;
        }
        if (!this.v1) {
            p0Var.f.setText(PremiumPreviewFragment.t0(this.a, this.A1));
            return;
        }
        int i7 = this.u1;
        if (i7 == 4) {
            p0Var.f.setText(hd.M0(2131743860, null));
            p0Var.setIcon(R.raw.unlock_icon);
        } else if (i7 != 10) {
            p0Var.f.setText(hd.M0(2131754942, null));
        } else {
            p0Var.f.setText(hd.M0(2131743861, null));
            p0Var.setIcon(R.raw.unlock_icon);
        }
    }

    public final void K0() {
        this.w1 = true;
        p0 p0Var = this.j1;
        p0Var.r = false;
        p0Var.d(true);
        J0();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.j5 || i7 == qs.g5) {
            J0();
            return;
        }
        if (i7 == qs.f5) {
            boolean q10 = p10.i(this.a).q();
            p0 p0Var = this.j1;
            if (q10) {
                p0Var.c(hd.M0(2131747830, null), false, true);
            } else {
                p0Var.r = false;
                p0Var.d(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        qs.e().n(this, qs.j5);
        qs.f(this.a).n(this, qs.g5);
        qs.f(this.a).n(this, qs.f5);
        qs.e().k(qs.k1, 16);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean m0() {
        u0 u0Var = this.o1;
        if (u0Var.getChildCount() > 0) {
            ViewGroup viewGroup = ((v0) u0Var.getChildAt(0)).f;
            if (viewGroup instanceof n0) {
                n0 n0Var = (n0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(r0.getMeasuredWidth(), 0.0f);
                n0Var.setOffset(r0.getMeasuredWidth());
                this.s1 = true;
                ofFloat.addUpdateListener(new m4(n0Var, 13));
                ofFloat.addListener(new v50(22, this, n0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(xq.h);
                ofFloat.start();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        qs.e().c(this, qs.j5);
        qs.f(this.a).c(this, qs.g5);
        qs.f(this.a).c(this, qs.f5);
        r7 r7Var = new r7(7, getContext(), this);
        this.E1 = r7Var;
        r6.i(k6.h5, r7Var, this.I0);
        r6.m(this.E1, 5, k6.G6, this.I0);
        r6.m(this.E1, 3, k6.z8, this.I0);
        r7 r7Var2 = this.E1;
        int i7 = k6.y8;
        r6.m(r7Var2, 1, i7, this.I0);
        r6.b(this.E1, i7, this.I0, true);
        this.E1.setCastShadows(true);
        this.E1.setExtraHeight(org.telegram.messenger.g0.L(2.0f));
        this.E1.setBackButtonImage(R.drawable.ic_ab_back);
        this.E1.setActionBarMenuOnItemClick(new nt0(this, 23));
        this.b.addView(this.E1, ha.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.E1.getLayoutParams()).topMargin = (-this.s0) - org.telegram.messenger.g0.L(2.0f);
        org.telegram.messenger.g0.Z3(this.E1, false, 1.0f, true, false);
        int i10 = this.x1;
        ArrayList arrayList = this.k1;
        if (((vs0) arrayList.get(i10)).a == 14) {
            this.E1.setTitle(hd.M0(2131743806, null));
            this.E1.requestLayout();
        } else if (((vs0) arrayList.get(this.x1)).a == 28) {
            this.E1.setTitle(hd.M0(2131744253, null));
            this.E1.requestLayout();
        } else if (((vs0) arrayList.get(this.x1)).a == 40) {
            this.E1.setTitle(hd.M0(2131750838, null));
            this.E1.requestLayout();
        } else {
            this.E1.setTitle(hd.M0(2131751350, null));
            this.E1.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        super.show();
        qs.e().k(qs.j1, 16);
    }

    public w0(f2 f2Var, int i7, boolean z9) {
        this(f2Var, f2Var.getContext(), f2Var.getCurrentAccount(), false, i7, z9, null);
    }

    public w0(f2 f2Var, Context context, int i7, int i10, boolean z9) {
        this(f2Var, context, i7, false, i10, z9, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w0(f2 f2Var, Context context, int i7, boolean z9, int i10, boolean z10, ws0 ws0Var) {
        this(f2Var, context, i7, z9, i10, z10, ws0Var, r0);
        f6 f6Var;
        if (f2Var == null) {
            f6Var = null;
        } else if (f2Var.getLastStoryViewer() != null && !f2Var.getLastStoryViewer().G0) {
            f6Var = f2Var.getLastStoryViewer().D;
        } else {
            f6Var = f2Var.getResourceProvider();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(f2 f2Var, Context context, int i7, boolean z9, int i10, boolean z10, ws0 ws0Var, f6 f6Var) {
        super(1, context, f6Var, false);
        final int i11 = 0;
        ArrayList arrayList = new ArrayList();
        this.k1 = arrayList;
        this.B1 = qs.e4;
        this.i1 = f2Var;
        this.A1 = ws0Var;
        P(k6.h5);
        this.u1 = i10;
        this.v1 = z10;
        this.t1 = sz.i(org.telegram.messenger.g0.y2(null, R.raw.star_loader));
        v41 v41Var = new v41(11, getContext(), this);
        if (!z9 && i10 != 35) {
            PremiumPreviewFragment.s0(i7, arrayList);
        } else {
            PremiumPreviewFragment.r0(i7, arrayList, false);
            PremiumPreviewFragment.r0(i7, arrayList, true);
        }
        if (i10 == 40) {
            arrayList.clear();
            arrayList.add(new vs0(40, R.drawable.gift, hd.M0(2131750838, null), hd.M0(2131750837, null)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.k1.size()) {
                i12 = 0;
                break;
            } else if (((vs0) this.k1.get(i12)).a == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (z10) {
            vs0 vs0Var = (vs0) this.k1.get(i12);
            this.k1.clear();
            this.k1.add(vs0Var);
            i12 = 0;
        }
        vs0 vs0Var2 = (vs0) this.k1.get(i12);
        this.u0 = false;
        this.v0 = false;
        this.T0 = false;
        y0 y0Var = new y0(k6.Ok, k6.Pk, k6.Qk, -1, null);
        y0Var.o = 1.1f;
        y0Var.p = 1.5f;
        y0Var.q = -0.2f;
        y0Var.m = true;
        pg.h hVar = new pg.h(this, getContext(), y0Var, 3);
        this.p1 = hVar;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.r1 = frameLayout;
        frameLayout.setContentDescription(hd.M0(2131752041, null));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int L = org.telegram.messenger.g0.L(12.0f);
        int o4 = i0.a.o(-1, 40);
        int o10 = i0.a.o(-1, 100);
        imageView.setBackground(k6.k0(L, L, L, L, o4, o10, o10));
        frameLayout.addView(imageView, ha.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: ug.q0
            public final /* synthetic */ w0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        v41Var.addView(hVar, ha.t(-1, -2, 1, 0, 16, 0, 0));
        u0 u0Var = new u0(this, getContext());
        this.o1 = u0Var;
        u0Var.setOverScrollMode(2);
        u0Var.setOffscreenPageLimit(0);
        u0Var.setAdapter(new a20(this, 4));
        this.x1 = i12;
        u0Var.setCurrentItem(i12);
        v41Var.addView(u0Var, ha.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        v41Var.addView(frameLayout, ha.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        ea eaVar = new ea(getContext(), u0Var, this.k1.size());
        u0Var.b(new v7(this, eaVar, 1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(v41Var);
        linearLayout.setOrientation(1);
        int i13 = k6.V8;
        int i14 = k6.P9;
        eaVar.n = i13;
        eaVar.r = i14;
        if (!z10) {
            linearLayout.addView(eaVar, ha.t(this.k1.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        final int i15 = 1;
        p0 p0Var = new p0(getContext(), f6Var, true);
        this.j1 = p0Var;
        p0Var.w.setOnClickListener(new r3(this, f2Var, z10, vs0Var2, 5));
        p0Var.h.setOnClickListener(new View.OnClickListener(this) { // from class: ug.q0
            public final /* synthetic */ w0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(p0Var, ha.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        r6.i(k6.h5, frameLayout2, f6Var);
        linearLayout.addView(frameLayout2, ha.r(-1, 68, 80));
        if (i10 == 40) {
            p0Var.c(k7.g2(hd.M0(2131743889, null)), true, false);
        } else if (p10.i(i7).q()) {
            p0Var.c(hd.M0(2131747830, null), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        this.N = scrollView;
        ui.b0(i7).o1();
        J0();
        this.U0 = 83;
        m5 m5Var = new m5(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.b = m5Var;
        int i16 = this.t0;
        m5Var.setPadding(i16, this.s0 - 1, i16, 0);
    }
}
