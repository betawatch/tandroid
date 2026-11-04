package vg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import b8.mf;
import ci.l6;
import ci.t4;
import ei.n4;
import ei.u3;
import ei.v7;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.jz;
import org.telegram.messenger.kz;
import org.telegram.messenger.li;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.p7;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.w10;
import org.telegram.ui.Components.xq;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ls0;
import org.telegram.ui.ms0;
import org.telegram.ui.n61;
import org.telegram.ui.vs0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v0 extends t2 implements cs {
    public static final /* synthetic */ int G1 = 0;
    public float A1;
    public final ms0 B1;
    public int C1;
    public int D1;
    public int E1;
    public p7 F1;
    public final d2 j1;
    public final o0 k1;
    public final ArrayList l1;
    public float m1;
    public float n1;
    public boolean o1;
    public final t0 p1;
    public final n61 q1;
    public int r1;
    public final FrameLayout s1;
    public boolean t1;
    public final jz u1;
    public final int v1;
    public final boolean w1;
    public boolean x1;
    public int y1;
    public int z1;

    public v0(int i3, Context context, e6 e6Var) {
        this(null, context, h10.t0, false, i3, true, null, e6Var);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        int i3 = 0;
        while (true) {
            t0 t0Var = this.p1;
            if (i3 >= t0Var.getChildCount()) {
                return true;
            }
            u0 u0Var = (u0) t0Var.getChildAt(i3);
            if (u0Var.a == this.y1) {
                if (u0Var.f instanceof a) {
                    return !((a) r1).b.canScrollVertically(-1);
                }
            }
            i3++;
        }
    }

    public final void I0() {
        t0 t0Var;
        View m10;
        View m11;
        int i3 = -1;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            t0Var = this.p1;
            if (i11 >= t0Var.getChildCount()) {
                break;
            }
            u0 u0Var = (u0) t0Var.getChildAt(i11);
            int i12 = u0Var.a;
            ViewGroup viewGroup = u0Var.f;
            if (i12 == this.y1 && (viewGroup instanceof a) && ((m11 = ((a) viewGroup).c.m(0)) == null || (i3 = m11.getTop()) < 0)) {
                i3 = 0;
            }
            if (u0Var.a == this.z1 && (viewGroup instanceof a) && ((m10 = ((a) viewGroup).c.m(0)) == null || (i10 = m10.getTop()) < 0)) {
                i10 = 0;
            }
            i11++;
        }
        int i13 = this.D1;
        if (i3 >= 0) {
            float f10 = 1.0f - this.A1;
            i13 = Math.min(i13, (int) com.google.android.recaptcha.internal.a.y(1.0f, f10, i13, i3 * f10));
        }
        if (i10 >= 0) {
            float f11 = this.A1;
            i13 = Math.min(i13, (int) com.google.android.recaptcha.internal.a.y(1.0f, f11, this.D1, i10 * f11));
        }
        float f12 = 1.0f - this.n1;
        FrameLayout frameLayout = this.s1;
        frameLayout.setAlpha(f12);
        if (this.m1 == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z10 = this.o1;
        n61 n61Var = this.q1;
        n61Var.setTranslationX((z10 ? n61Var.getMeasuredWidth() : -n61Var.getMeasuredWidth()) * this.n1);
        if (i13 != this.E1) {
            this.E1 = i13;
            for (int i14 = 0; i14 < t0Var.getChildCount(); i14++) {
                if (!((u0) t0Var.getChildAt(i14)).h) {
                    t0Var.getChildAt(i14).setTranslationY(this.E1);
                }
            }
            n61Var.setTranslationY(this.E1);
            frameLayout.setTranslationY(this.E1);
            this.b.invalidate();
            org.telegram.messenger.g0.Z3(this.F1, this.E1 < org.telegram.messenger.g0.L(this.v1 == 40 ? 5.0f : 30.0f), 1.0f, true, true);
        }
    }

    public final void J0() {
        boolean z10 = this.x1;
        o0 o0Var = this.k1;
        if (z10) {
            o0Var.f.setText(bd.M0(2131754942, null));
            return;
        }
        if (!this.w1) {
            o0Var.f.setText(PremiumPreviewFragment.t0(this.a, this.B1));
            return;
        }
        int i3 = this.v1;
        if (i3 == 4) {
            o0Var.f.setText(bd.M0(2131743869, null));
            o0Var.setIcon(R.raw.unlock_icon);
        } else if (i3 != 10) {
            o0Var.f.setText(bd.M0(2131754942, null));
        } else {
            o0Var.f.setText(bd.M0(2131743870, null));
            o0Var.setIcon(R.raw.unlock_icon);
        }
    }

    public final void K0() {
        this.x1 = true;
        o0 o0Var = this.k1;
        o0Var.r = false;
        o0Var.d(true);
        J0();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.j5 || i3 == hs.g5) {
            J0();
            return;
        }
        if (i3 == hs.f5) {
            boolean q10 = h10.i(this.a).q();
            o0 o0Var = this.k1;
            if (q10) {
                o0Var.c(bd.M0(2131747839, null), false, true);
            } else {
                o0Var.r = false;
                o0Var.d(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        super.dismiss();
        hs.e().n(this, hs.j5);
        hs.f(this.a).n(this, hs.g5);
        hs.f(this.a).n(this, hs.f5);
        hs.e().k(hs.k1, 16);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean m0() {
        t0 t0Var = this.p1;
        if (t0Var.getChildCount() > 0) {
            ViewGroup viewGroup = ((u0) t0Var.getChildAt(0)).f;
            if (viewGroup instanceof m0) {
                m0 m0Var = (m0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(r0.getMeasuredWidth(), 0.0f);
                m0Var.setOffset(r0.getMeasuredWidth());
                this.t1 = true;
                ofFloat.addUpdateListener(new n4(m0Var, 14));
                ofFloat.addListener(new ri0(21, this, m0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(xq.h);
                ofFloat.start();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hs.e().c(this, hs.j5);
        hs.f(this.a).c(this, hs.g5);
        hs.f(this.a).c(this, hs.f5);
        p7 p7Var = new p7(7, getContext(), this);
        this.F1 = p7Var;
        r6.i(k6.h5, p7Var, this.J0);
        r6.m(this.F1, 5, k6.G6, this.J0);
        r6.m(this.F1, 3, k6.z8, this.J0);
        p7 p7Var2 = this.F1;
        int i3 = k6.y8;
        r6.m(p7Var2, 1, i3, this.J0);
        r6.b(this.F1, i3, this.J0, true);
        this.F1.setCastShadows(true);
        this.F1.setExtraHeight(org.telegram.messenger.g0.L(2.0f));
        this.F1.setBackButtonImage(R.drawable.ic_ab_back);
        this.F1.setActionBarMenuOnItemClick(new vs0(this, 24));
        this.b.addView(this.F1, mf.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.F1.getLayoutParams()).topMargin = (-this.t0) - org.telegram.messenger.g0.L(2.0f);
        org.telegram.messenger.g0.Z3(this.F1, false, 1.0f, true, false);
        int i10 = this.y1;
        ArrayList arrayList = this.l1;
        if (((ls0) arrayList.get(i10)).a == 14) {
            this.F1.setTitle(bd.M0(2131743815, null));
            this.F1.requestLayout();
        } else if (((ls0) arrayList.get(this.y1)).a == 28) {
            this.F1.setTitle(bd.M0(2131744262, null));
            this.F1.requestLayout();
        } else if (((ls0) arrayList.get(this.y1)).a == 40) {
            this.F1.setTitle(bd.M0(2131750838, null));
            this.F1.requestLayout();
        } else {
            this.F1.setTitle(bd.M0(2131751350, null));
            this.F1.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        super.show();
        hs.e().k(hs.j1, 16);
    }

    public v0(d2 d2Var, int i3, boolean z10) {
        this(d2Var, d2Var.getContext(), d2Var.getCurrentAccount(), false, i3, z10, null);
    }

    public v0(d2 d2Var, Context context, int i3, int i10, boolean z10) {
        this(d2Var, context, i3, false, i10, z10, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v0(d2 d2Var, Context context, int i3, boolean z10, int i10, boolean z11, ms0 ms0Var) {
        this(d2Var, context, i3, z10, i10, z11, ms0Var, r0);
        e6 e6Var;
        if (d2Var == null) {
            e6Var = null;
        } else if (d2Var.getLastStoryViewer() != null && !d2Var.getLastStoryViewer().I0) {
            e6Var = d2Var.getLastStoryViewer().E;
        } else {
            e6Var = d2Var.getResourceProvider();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(d2 d2Var, Context context, int i3, boolean z10, int i10, boolean z11, ms0 ms0Var, e6 e6Var) {
        super(1, context, e6Var, false);
        final int i11 = 0;
        ArrayList arrayList = new ArrayList();
        this.l1 = arrayList;
        this.C1 = hs.e4;
        this.j1 = d2Var;
        this.B1 = ms0Var;
        P(k6.h5);
        this.v1 = i10;
        this.w1 = z11;
        this.u1 = kz.i(org.telegram.messenger.g0.y2(null, R.raw.star_loader));
        kw0 kw0Var = new kw0(12, getContext(), this);
        if (!z10 && i10 != 35) {
            PremiumPreviewFragment.s0(i3, arrayList);
        } else {
            PremiumPreviewFragment.r0(i3, arrayList, false);
            PremiumPreviewFragment.r0(i3, arrayList, true);
        }
        if (i10 == 40) {
            arrayList.clear();
            arrayList.add(new ls0(40, R.drawable.gift, bd.M0(2131750838, null), bd.M0(2131750837, null)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.l1.size()) {
                i12 = 0;
                break;
            } else if (((ls0) this.l1.get(i12)).a == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (z11) {
            ls0 ls0Var = (ls0) this.l1.get(i12);
            this.l1.clear();
            this.l1.add(ls0Var);
            i12 = 0;
        }
        ls0 ls0Var2 = (ls0) this.l1.get(i12);
        this.v0 = false;
        this.w0 = false;
        this.U0 = false;
        x0 x0Var = new x0(k6.Ok, k6.Pk, k6.Qk, -1, null);
        x0Var.o = 1.1f;
        x0Var.p = 1.5f;
        x0Var.q = -0.2f;
        x0Var.m = true;
        n61 n61Var = new n61(this, getContext(), x0Var, 6);
        this.q1 = n61Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.s1 = frameLayout;
        frameLayout.setContentDescription(bd.M0(2131752041, null));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int L = org.telegram.messenger.g0.L(12.0f);
        int o10 = i0.a.o(-1, 40);
        int o11 = i0.a.o(-1, 100);
        imageView.setBackground(k6.k0(L, L, L, L, o10, o11, o11));
        frameLayout.addView(imageView, mf.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: vg.p0
            public final /* synthetic */ v0 b;

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
        kw0Var.addView(n61Var, mf.t(-1, -2, 1, 0, 16, 0, 0));
        t0 t0Var = new t0(this, getContext());
        this.p1 = t0Var;
        t0Var.setOverScrollMode(2);
        t0Var.setOffscreenPageLimit(0);
        t0Var.setAdapter(new w10(this, 4));
        this.y1 = i12;
        t0Var.setCurrentItem(i12);
        kw0Var.addView(t0Var, mf.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        kw0Var.addView(frameLayout, mf.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        da daVar = new da(getContext(), t0Var, this.l1.size());
        t0Var.b(new v7(1, this, daVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(kw0Var);
        linearLayout.setOrientation(1);
        int i13 = k6.V8;
        int i14 = k6.P9;
        daVar.n = i13;
        daVar.r = i14;
        if (!z11) {
            linearLayout.addView(daVar, mf.t(this.l1.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        final int i15 = 1;
        o0 o0Var = new o0(getContext(), e6Var, true);
        this.k1 = o0Var;
        o0Var.w.setOnClickListener(new u3(this, d2Var, z11, ls0Var2, 5));
        o0Var.h.setOnClickListener(new View.OnClickListener(this) { // from class: vg.p0
            public final /* synthetic */ v0 b;

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
        frameLayout2.addView(o0Var, mf.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        r6.i(k6.h5, frameLayout2, e6Var);
        linearLayout.addView(frameLayout2, mf.r(-1, 68, 80));
        if (i10 == 40) {
            o0Var.c(l6.g2(bd.M0(2131743898, null)), true, false);
        } else if (h10.i(i3).q()) {
            o0Var.c(bd.M0(2131747839, null), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        this.O = scrollView;
        li.b0(i3).o1();
        J0();
        this.V0 = 83;
        t4 t4Var = new t4(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.b = t4Var;
        int i16 = this.u0;
        t4Var.setPadding(i16, this.t0 - 1, i16, 0);
    }
}
