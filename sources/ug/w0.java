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
import di.n4;
import di.r3;
import di.v7;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.sz;
import org.telegram.messenger.ui;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.a20;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.q7;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.wq;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.qt0;
import org.telegram.ui.ys0;
import org.telegram.ui.zs0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class w0 extends w2 implements ls {
    public static final /* synthetic */ int I1 = 0;
    public int A1;
    public int B1;
    public float C1;
    public final zs0 D1;
    public int E1;
    public int F1;
    public int G1;
    public q7 H1;
    public final f2 l1;
    public final p0 m1;
    public final ArrayList n1;
    public float o1;
    public float p1;
    public boolean q1;
    public final u0 r1;
    public final pg.h s1;
    public int t1;
    public final FrameLayout u1;
    public boolean v1;
    public final rz w1;
    public final int x1;
    public final boolean y1;
    public boolean z1;

    public w0(int i7, Context context, h6 h6Var) {
        this(null, context, p10.s0, false, i7, true, null, h6Var);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        int i7 = 0;
        while (true) {
            u0 u0Var = this.r1;
            if (i7 >= u0Var.getChildCount()) {
                return true;
            }
            v0 v0Var = (v0) u0Var.getChildAt(i7);
            if (v0Var.a == this.A1) {
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
            u0Var = this.r1;
            if (i11 >= u0Var.getChildCount()) {
                break;
            }
            v0 v0Var = (v0) u0Var.getChildAt(i11);
            int i12 = v0Var.a;
            ViewGroup viewGroup = v0Var.f;
            if (i12 == this.A1 && (viewGroup instanceof a) && ((m11 = ((a) viewGroup).c.m(0)) == null || (i7 = m11.getTop()) < 0)) {
                i7 = 0;
            }
            if (v0Var.a == this.B1 && (viewGroup instanceof a) && ((m10 = ((a) viewGroup).c.m(0)) == null || (i10 = m10.getTop()) < 0)) {
                i10 = 0;
            }
            i11++;
        }
        int i13 = this.F1;
        if (i7 >= 0) {
            float f10 = 1.0f - this.C1;
            i13 = Math.min(i13, (int) com.google.android.recaptcha.internal.a.z(1.0f, f10, i13, i7 * f10));
        }
        if (i10 >= 0) {
            float f11 = this.C1;
            i13 = Math.min(i13, (int) com.google.android.recaptcha.internal.a.z(1.0f, f11, this.F1, i10 * f11));
        }
        float f12 = 1.0f - this.p1;
        FrameLayout frameLayout = this.u1;
        frameLayout.setAlpha(f12);
        if (this.o1 == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z9 = this.q1;
        pg.h hVar = this.s1;
        hVar.setTranslationX((z9 ? hVar.getMeasuredWidth() : -hVar.getMeasuredWidth()) * this.p1);
        if (i13 != this.G1) {
            this.G1 = i13;
            for (int i14 = 0; i14 < u0Var.getChildCount(); i14++) {
                if (!((v0) u0Var.getChildAt(i14)).h) {
                    u0Var.getChildAt(i14).setTranslationY(this.G1);
                }
            }
            hVar.setTranslationY(this.G1);
            frameLayout.setTranslationY(this.G1);
            this.b.invalidate();
            org.telegram.messenger.g0.Z3(this.H1, this.G1 < org.telegram.messenger.g0.L(this.x1 == 40 ? 5.0f : 30.0f), 1.0f, true, true);
        }
    }

    public final void J0() {
        boolean z9 = this.z1;
        p0 p0Var = this.m1;
        if (z9) {
            p0Var.f.setText(id.M0(2131754942, null));
            return;
        }
        if (!this.y1) {
            p0Var.f.setText(PremiumPreviewFragment.t0(this.a, this.D1));
            return;
        }
        int i7 = this.x1;
        if (i7 == 4) {
            p0Var.f.setText(id.M0(2131743859, null));
            p0Var.setIcon(R.raw.unlock_icon);
        } else if (i7 != 10) {
            p0Var.f.setText(id.M0(2131754942, null));
        } else {
            p0Var.f.setText(id.M0(2131743860, null));
            p0Var.setIcon(R.raw.unlock_icon);
        }
    }

    public final void K0() {
        this.z1 = true;
        p0 p0Var = this.m1;
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
            p0 p0Var = this.m1;
            if (q10) {
                p0Var.c(id.M0(2131747831, null), false, true);
            } else {
                p0Var.r = false;
                p0Var.d(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        qs.e().n(this, qs.j5);
        qs.f(this.a).n(this, qs.g5);
        qs.f(this.a).n(this, qs.f5);
        qs.e().k(qs.k1, 16);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean m0() {
        u0 u0Var = this.r1;
        if (u0Var.getChildCount() > 0) {
            ViewGroup viewGroup = ((v0) u0Var.getChildAt(0)).f;
            if (viewGroup instanceof n0) {
                n0 n0Var = (n0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(r0.getMeasuredWidth(), 0.0f);
                n0Var.setOffset(r0.getMeasuredWidth());
                this.v1 = true;
                ofFloat.addUpdateListener(new n4(n0Var, 13));
                ofFloat.addListener(new v50(22, this, n0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(wq.h);
                ofFloat.start();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        qs.e().c(this, qs.j5);
        qs.f(this.a).c(this, qs.g5);
        qs.f(this.a).c(this, qs.f5);
        q7 q7Var = new q7(7, getContext(), this);
        this.H1 = q7Var;
        t6.h(m6.h5, q7Var, this.I0);
        t6.l(this.H1, 5, m6.G6, this.I0);
        t6.l(this.H1, 3, m6.z8, this.I0);
        q7 q7Var2 = this.H1;
        int i7 = m6.y8;
        t6.l(q7Var2, 1, i7, this.I0);
        t6.b(this.H1, i7, this.I0, true);
        this.H1.setCastShadows(true);
        this.H1.setExtraHeight(org.telegram.messenger.g0.L(2.0f));
        this.H1.setBackButtonImage(R.drawable.ic_ab_back);
        this.H1.setActionBarMenuOnItemClick(new qt0(this, 23));
        this.b.addView(this.H1, ha.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.H1.getLayoutParams()).topMargin = (-this.s0) - org.telegram.messenger.g0.L(2.0f);
        org.telegram.messenger.g0.Z3(this.H1, false, 1.0f, true, false);
        int i10 = this.A1;
        ArrayList arrayList = this.n1;
        if (((ys0) arrayList.get(i10)).a == 14) {
            this.H1.setTitle(id.M0(2131743805, null));
            this.H1.requestLayout();
        } else if (((ys0) arrayList.get(this.A1)).a == 28) {
            this.H1.setTitle(id.M0(2131744252, null));
            this.H1.requestLayout();
        } else if (((ys0) arrayList.get(this.A1)).a == 40) {
            this.H1.setTitle(id.M0(2131750837, null));
            this.H1.requestLayout();
        } else {
            this.H1.setTitle(id.M0(2131751349, null));
            this.H1.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
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
    public w0(f2 f2Var, Context context, int i7, boolean z9, int i10, boolean z10, zs0 zs0Var) {
        this(f2Var, context, i7, z9, i10, z10, zs0Var, r0);
        h6 h6Var;
        if (f2Var == null) {
            h6Var = null;
        } else if (f2Var.getLastStoryViewer() != null && !f2Var.getLastStoryViewer().G0) {
            h6Var = f2Var.getLastStoryViewer().D;
        } else {
            h6Var = f2Var.getResourceProvider();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(f2 f2Var, Context context, int i7, boolean z9, int i10, boolean z10, zs0 zs0Var, h6 h6Var) {
        super(1, context, h6Var, false);
        final int i11 = 0;
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        this.E1 = qs.e4;
        this.l1 = f2Var;
        this.D1 = zs0Var;
        P(m6.h5);
        this.x1 = i10;
        this.y1 = z10;
        this.w1 = sz.i(org.telegram.messenger.g0.y2(null, R.raw.star_loader));
        w41 w41Var = new w41(11, getContext(), this);
        if (!z9 && i10 != 35) {
            PremiumPreviewFragment.s0(i7, arrayList);
        } else {
            PremiumPreviewFragment.r0(i7, arrayList, false);
            PremiumPreviewFragment.r0(i7, arrayList, true);
        }
        if (i10 == 40) {
            arrayList.clear();
            arrayList.add(new ys0(40, R.drawable.gift, id.M0(2131750837, null), id.M0(2131750836, null)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.n1.size()) {
                i12 = 0;
                break;
            } else if (((ys0) this.n1.get(i12)).a == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (z10) {
            ys0 ys0Var = (ys0) this.n1.get(i12);
            this.n1.clear();
            this.n1.add(ys0Var);
            i12 = 0;
        }
        ys0 ys0Var2 = (ys0) this.n1.get(i12);
        this.u0 = false;
        this.v0 = false;
        this.T0 = false;
        y0 y0Var = new y0(m6.Ok, m6.Pk, m6.Qk, -1, null);
        y0Var.o = 1.1f;
        y0Var.p = 1.5f;
        y0Var.q = -0.2f;
        y0Var.m = true;
        pg.h hVar = new pg.h(this, getContext(), y0Var, 3);
        this.s1 = hVar;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.u1 = frameLayout;
        frameLayout.setContentDescription(id.M0(2131752041, null));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int L = org.telegram.messenger.g0.L(12.0f);
        int o4 = i0.a.o(-1, 40);
        int o10 = i0.a.o(-1, 100);
        imageView.setBackground(m6.k0(L, L, L, L, o4, o10, o10));
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
        w41Var.addView(hVar, ha.t(-1, -2, 1, 0, 16, 0, 0));
        u0 u0Var = new u0(this, getContext());
        this.r1 = u0Var;
        u0Var.setOverScrollMode(2);
        u0Var.setOffscreenPageLimit(0);
        u0Var.setAdapter(new a20(this, 4));
        this.A1 = i12;
        u0Var.setCurrentItem(i12);
        w41Var.addView(u0Var, ha.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        w41Var.addView(frameLayout, ha.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        da daVar = new da(getContext(), u0Var, this.n1.size());
        u0Var.b(new v7(this, daVar, 1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(w41Var);
        linearLayout.setOrientation(1);
        int i13 = m6.V8;
        int i14 = m6.P9;
        daVar.n = i13;
        daVar.r = i14;
        if (!z10) {
            linearLayout.addView(daVar, ha.t(this.n1.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        final int i15 = 1;
        p0 p0Var = new p0(getContext(), h6Var, true);
        this.m1 = p0Var;
        p0Var.w.setOnClickListener(new r3(this, f2Var, z10, ys0Var2, 5));
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
        t6.h(m6.h5, frameLayout2, h6Var);
        linearLayout.addView(frameLayout2, ha.r(-1, 68, 80));
        if (i10 == 40) {
            p0Var.c(k7.f2(id.M0(2131743888, null)), true, false);
        } else if (p10.i(i7).q()) {
            p0Var.c(id.M0(2131747831, null), false, false);
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
