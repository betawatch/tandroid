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
import c8.na;
import com.google.android.gms.internal.vision.e2;
import di.f6;
import di.n4;
import fi.d4;
import fi.k3;
import fi.l7;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.kz;
import org.telegram.messenger.lz;
import org.telegram.messenger.ri;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.u7;
import org.telegram.ui.Components.w01;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.gs0;
import org.telegram.ui.vs0;
import org.telegram.ui.w61;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class y0 extends w2 implements fs {
    public static final /* synthetic */ int J1 = 0;
    public boolean A1;
    public int B1;
    public int C1;
    public float D1;
    public final ws0 E1;
    public int F1;
    public int G1;
    public int H1;
    public u7 I1;
    public final g2 m1;
    public final r0 n1;
    public final ArrayList o1;
    public float p1;
    public float q1;
    public boolean r1;
    public final w0 s1;
    public final w61 t1;
    public int u1;
    public final FrameLayout v1;
    public boolean w1;
    public final kz x1;
    public final int y1;
    public final boolean z1;

    public y0(int i7, Context context, i6 i6Var) {
        this(null, context, i10.t0, false, i7, true, null, i6Var);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean F() {
        int i7 = 0;
        while (true) {
            w0 w0Var = this.s1;
            if (i7 >= w0Var.getChildCount()) {
                return true;
            }
            x0 x0Var = (x0) w0Var.getChildAt(i7);
            if (x0Var.a == this.B1) {
                if (x0Var.f instanceof a) {
                    return !((a) r1).b.canScrollVertically(-1);
                }
            }
            i7++;
        }
    }

    public final void J0() {
        w0 w0Var;
        View m10;
        View m11;
        int i7 = -1;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            w0Var = this.s1;
            if (i11 >= w0Var.getChildCount()) {
                break;
            }
            x0 x0Var = (x0) w0Var.getChildAt(i11);
            int i12 = x0Var.a;
            ViewGroup viewGroup = x0Var.f;
            if (i12 == this.B1 && (viewGroup instanceof a) && ((m11 = ((a) viewGroup).c.m(0)) == null || (i7 = m11.getTop()) < 0)) {
                i7 = 0;
            }
            if (x0Var.a == this.C1 && (viewGroup instanceof a) && ((m10 = ((a) viewGroup).c.m(0)) == null || (i10 = m10.getTop()) < 0)) {
                i10 = 0;
            }
            i11++;
        }
        int i13 = this.G1;
        if (i7 >= 0) {
            float f10 = 1.0f - this.D1;
            i13 = Math.min(i13, (int) e2.z(1.0f, f10, i13, i7 * f10));
        }
        if (i10 >= 0) {
            float f11 = this.D1;
            i13 = Math.min(i13, (int) e2.z(1.0f, f11, this.G1, i10 * f11));
        }
        float f12 = 1.0f - this.q1;
        FrameLayout frameLayout = this.v1;
        frameLayout.setAlpha(f12);
        if (this.p1 == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z10 = this.r1;
        w61 w61Var = this.t1;
        w61Var.setTranslationX((z10 ? w61Var.getMeasuredWidth() : -w61Var.getMeasuredWidth()) * this.q1);
        if (i13 != this.H1) {
            this.H1 = i13;
            for (int i14 = 0; i14 < w0Var.getChildCount(); i14++) {
                if (!((x0) w0Var.getChildAt(i14)).h) {
                    w0Var.getChildAt(i14).setTranslationY(this.H1);
                }
            }
            w61Var.setTranslationY(this.H1);
            frameLayout.setTranslationY(this.H1);
            this.b.invalidate();
            org.telegram.messenger.g0.X3(this.I1, this.H1 < org.telegram.messenger.g0.L(this.y1 == 40 ? 5.0f : 30.0f), 1.0f, true, true);
        }
    }

    public final void K0() {
        boolean z10 = this.A1;
        r0 r0Var = this.n1;
        if (z10) {
            r0Var.f.setText(gd.N0(2131754942, null));
            return;
        }
        if (!this.z1) {
            r0Var.f.setText(PremiumPreviewFragment.t0(this.a, this.E1));
            return;
        }
        int i7 = this.y1;
        if (i7 == 4) {
            r0Var.f.setText(gd.N0(2131743612, null));
            r0Var.setIcon(R.raw.unlock_icon);
        } else if (i7 != 10) {
            r0Var.f.setText(gd.N0(2131754942, null));
        } else {
            r0Var.f.setText(gd.N0(2131743613, null));
            r0Var.setIcon(R.raw.unlock_icon);
        }
    }

    public final void L0() {
        this.A1 = true;
        r0 r0Var = this.n1;
        r0Var.r = false;
        r0Var.d(true);
        K0();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.m5 || i7 == ks.j5) {
            K0();
            return;
        }
        if (i7 == ks.i5) {
            boolean q10 = i10.i(this.a).q();
            r0 r0Var = this.n1;
            if (q10) {
                r0Var.c(gd.N0(2131747637, null), false, true);
            } else {
                r0Var.r = false;
                r0Var.d(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        ks.e().n(this, ks.m5);
        ks.f(this.a).n(this, ks.j5);
        ks.f(this.a).n(this, ks.i5);
        ks.e().k(ks.k1, 16);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean m0() {
        w0 w0Var = this.s1;
        if (w0Var.getChildCount() > 0) {
            ViewGroup viewGroup = ((x0) w0Var.getChildAt(0)).f;
            if (viewGroup instanceof p0) {
                p0 p0Var = (p0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(r0.getMeasuredWidth(), 0.0f);
                p0Var.setOffset(r0.getMeasuredWidth());
                this.w1 = true;
                ofFloat.addUpdateListener(new d4(p0Var, 13));
                ofFloat.addListener(new f10(22, this, p0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(kr.h);
                ofFloat.start();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ks.e().c(this, ks.m5);
        ks.f(this.a).c(this, ks.j5);
        ks.f(this.a).c(this, ks.i5);
        u7 u7Var = new u7(7, getContext(), this);
        this.I1 = u7Var;
        u6.h(n6.h5, u7Var, this.J0);
        u6.l(this.I1, 5, n6.G6, this.J0);
        u6.l(this.I1, 3, n6.z8, this.J0);
        u7 u7Var2 = this.I1;
        int i7 = n6.y8;
        u6.l(u7Var2, 1, i7, this.J0);
        u6.b(this.I1, i7, this.J0, true);
        this.I1.setCastShadows(true);
        this.I1.setExtraHeight(org.telegram.messenger.g0.L(2.0f));
        this.I1.setBackButtonImage(R.drawable.ic_ab_back);
        this.I1.setActionBarMenuOnItemClick(new gs0(this, 26));
        this.b.addView(this.I1, na.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.I1.getLayoutParams()).topMargin = (-this.t0) - org.telegram.messenger.g0.L(2.0f);
        org.telegram.messenger.g0.X3(this.I1, false, 1.0f, true, false);
        int i10 = this.B1;
        ArrayList arrayList = this.o1;
        if (((vs0) arrayList.get(i10)).a == 14) {
            this.I1.setTitle(gd.N0(2131743558, null));
            this.I1.requestLayout();
        } else if (((vs0) arrayList.get(this.B1)).a == 28) {
            this.I1.setTitle(gd.N0(2131744007, null));
            this.I1.requestLayout();
        } else if (((vs0) arrayList.get(this.B1)).a == 40) {
            this.I1.setTitle(gd.N0(2131750825, null));
            this.I1.requestLayout();
        } else {
            this.I1.setTitle(gd.N0(2131751337, null));
            this.I1.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        ks.e().k(ks.j1, 16);
    }

    public y0(g2 g2Var, int i7, boolean z10) {
        this(g2Var, g2Var.getContext(), g2Var.getCurrentAccount(), false, i7, z10, null);
    }

    public y0(g2 g2Var, Context context, int i7, int i10, boolean z10) {
        this(g2Var, context, i7, false, i10, z10, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y0(g2 g2Var, Context context, int i7, boolean z10, int i10, boolean z11, ws0 ws0Var) {
        this(g2Var, context, i7, z10, i10, z11, ws0Var, r0);
        i6 i6Var;
        if (g2Var == null) {
            i6Var = null;
        } else if (g2Var.getLastStoryViewer() != null && !g2Var.getLastStoryViewer().H0) {
            i6Var = g2Var.getLastStoryViewer().E;
        } else {
            i6Var = g2Var.getResourceProvider();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(g2 g2Var, Context context, int i7, boolean z10, int i10, boolean z11, ws0 ws0Var, i6 i6Var) {
        super(1, context, i6Var, false);
        final int i11 = 0;
        ArrayList arrayList = new ArrayList();
        this.o1 = arrayList;
        this.F1 = ks.e4;
        this.m1 = g2Var;
        this.E1 = ws0Var;
        Q(n6.h5);
        this.y1 = i10;
        this.z1 = z11;
        this.x1 = lz.i(org.telegram.messenger.g0.y2(null, R.raw.star_loader));
        w01 w01Var = new w01(11, getContext(), this);
        if (!z10 && i10 != 35) {
            PremiumPreviewFragment.s0(i7, arrayList);
        } else {
            PremiumPreviewFragment.r0(i7, arrayList, false);
            PremiumPreviewFragment.r0(i7, arrayList, true);
        }
        if (i10 == 40) {
            arrayList.clear();
            arrayList.add(new vs0(40, R.drawable.gift, gd.N0(2131750825, null), gd.N0(2131750824, null)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.o1.size()) {
                i12 = 0;
                break;
            } else if (((vs0) this.o1.get(i12)).a == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (z11) {
            vs0 vs0Var = (vs0) this.o1.get(i12);
            this.o1.clear();
            this.o1.add(vs0Var);
            i12 = 0;
        }
        vs0 vs0Var2 = (vs0) this.o1.get(i12);
        this.v0 = false;
        this.w0 = false;
        this.U0 = false;
        a1 a1Var = new a1(n6.Rk, n6.Sk, n6.Tk, -1, null);
        a1Var.o = 1.1f;
        a1Var.p = 1.5f;
        a1Var.q = -0.2f;
        a1Var.m = true;
        w61 w61Var = new w61(this, getContext(), a1Var, 6);
        this.t1 = w61Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v1 = frameLayout;
        frameLayout.setContentDescription(gd.N0(2131752029, null));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int L = org.telegram.messenger.g0.L(12.0f);
        int o4 = i0.a.o(-1, 40);
        int o10 = i0.a.o(-1, 100);
        imageView.setBackground(n6.k0(L, L, L, L, o4, o10, o10));
        frameLayout.addView(imageView, na.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: ug.s0
            public final /* synthetic */ y0 b;

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
        w01Var.addView(w61Var, na.t(-1, -2, 1, 0, 16, 0, 0));
        w0 w0Var = new w0(this, getContext());
        this.s1 = w0Var;
        w0Var.setOverScrollMode(2);
        w0Var.setOffscreenPageLimit(0);
        w0Var.setAdapter(new l20(this, 4));
        this.B1 = i12;
        w0Var.setCurrentItem(i12);
        w01Var.addView(w0Var, na.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        w01Var.addView(frameLayout, na.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        ha haVar = new ha(getContext(), w0Var, this.o1.size());
        w0Var.b(new l7(this, haVar, 1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(w01Var);
        linearLayout.setOrientation(1);
        int i13 = n6.V8;
        int i14 = n6.P9;
        haVar.n = i13;
        haVar.r = i14;
        if (!z11) {
            linearLayout.addView(haVar, na.t(this.o1.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        final int i15 = 1;
        r0 r0Var = new r0(getContext(), i6Var, true);
        this.n1 = r0Var;
        r0Var.w.setOnClickListener(new k3(this, g2Var, z11, vs0Var2, 5));
        r0Var.h.setOnClickListener(new View.OnClickListener(this) { // from class: ug.s0
            public final /* synthetic */ y0 b;

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
        frameLayout2.addView(r0Var, na.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        u6.h(n6.h5, frameLayout2, i6Var);
        linearLayout.addView(frameLayout2, na.r(-1, 68, 80));
        if (i10 == 40) {
            r0Var.c(f6.t2(gd.N0(2131743641, null)), true, false);
        } else if (i10.i(i7).q()) {
            r0Var.c(gd.N0(2131747637, null), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        this.O = scrollView;
        ri.d0(i7).r1();
        K0();
        this.V0 = 83;
        n4 n4Var = new n4(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.b = n4Var;
        int i16 = this.u0;
        n4Var.setPadding(i16, this.t0 - 1, i16, 0);
    }
}
