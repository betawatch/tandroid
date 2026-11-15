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
import c8.ja;
import di.c6;
import di.k4;
import fi.f4;
import fi.m3;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.pz;
import org.telegram.messenger.qz;
import org.telegram.messenger.si;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.Components.aa;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.o7;
import org.telegram.ui.Components.y50;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ct0;
import org.telegram.ui.ss0;
import org.telegram.ui.ts0;
import org.telegram.ui.w61;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class x0 extends u2 implements is {
    public static final /* synthetic */ int J1 = 0;
    public boolean A1;
    public int B1;
    public int C1;
    public float D1;
    public final ts0 E1;
    public int F1;
    public int G1;
    public int H1;
    public o7 I1;
    public final e2 m1;
    public final q0 n1;
    public final ArrayList o1;
    public float p1;
    public float q1;
    public boolean r1;
    public final v0 s1;
    public final w61 t1;
    public int u1;
    public final FrameLayout v1;
    public boolean w1;
    public final pz x1;
    public final int y1;
    public final boolean z1;

    public x0(int i7, Context context, e6 e6Var) {
        this(null, context, m10.t0, false, i7, true, null, e6Var);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        int i7 = 0;
        while (true) {
            v0 v0Var = this.s1;
            if (i7 >= v0Var.getChildCount()) {
                return true;
            }
            w0 w0Var = (w0) v0Var.getChildAt(i7);
            if (w0Var.a == this.B1) {
                if (w0Var.f instanceof a) {
                    return !((a) r1).b.canScrollVertically(-1);
                }
            }
            i7++;
        }
    }

    public final void I0() {
        v0 v0Var;
        View m10;
        View m11;
        int i7 = -1;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            v0Var = this.s1;
            if (i11 >= v0Var.getChildCount()) {
                break;
            }
            w0 w0Var = (w0) v0Var.getChildAt(i11);
            int i12 = w0Var.a;
            ViewGroup viewGroup = w0Var.f;
            if (i12 == this.B1 && (viewGroup instanceof a) && ((m11 = ((a) viewGroup).c.m(0)) == null || (i7 = m11.getTop()) < 0)) {
                i7 = 0;
            }
            if (w0Var.a == this.C1 && (viewGroup instanceof a) && ((m10 = ((a) viewGroup).c.m(0)) == null || (i10 = m10.getTop()) < 0)) {
                i10 = 0;
            }
            i11++;
        }
        int i13 = this.G1;
        if (i7 >= 0) {
            float f10 = 1.0f - this.D1;
            i13 = Math.min(i13, (int) com.google.android.gms.internal.vision.e2.z(1.0f, f10, i13, i7 * f10));
        }
        if (i10 >= 0) {
            float f11 = this.D1;
            i13 = Math.min(i13, (int) com.google.android.gms.internal.vision.e2.z(1.0f, f11, this.G1, i10 * f11));
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
            for (int i14 = 0; i14 < v0Var.getChildCount(); i14++) {
                if (!((w0) v0Var.getChildAt(i14)).h) {
                    v0Var.getChildAt(i14).setTranslationY(this.H1);
                }
            }
            w61Var.setTranslationY(this.H1);
            frameLayout.setTranslationY(this.H1);
            this.b.invalidate();
            org.telegram.messenger.g0.Y3(this.I1, this.H1 < org.telegram.messenger.g0.L(this.y1 == 40 ? 5.0f : 30.0f), 1.0f, true, true);
        }
    }

    public final void J0() {
        boolean z10 = this.A1;
        q0 q0Var = this.n1;
        if (z10) {
            q0Var.f.setText(hd.M0(2131754942, null));
            return;
        }
        if (!this.z1) {
            q0Var.f.setText(PremiumPreviewFragment.t0(this.a, this.E1));
            return;
        }
        int i7 = this.y1;
        if (i7 == 4) {
            q0Var.f.setText(hd.M0(2131743859, null));
            q0Var.setIcon(R.raw.unlock_icon);
        } else if (i7 != 10) {
            q0Var.f.setText(hd.M0(2131754942, null));
        } else {
            q0Var.f.setText(hd.M0(2131743860, null));
            q0Var.setIcon(R.raw.unlock_icon);
        }
    }

    public final void K0() {
        this.A1 = true;
        q0 q0Var = this.n1;
        q0Var.r = false;
        q0Var.d(true);
        J0();
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.j5 || i7 == ns.g5) {
            J0();
            return;
        }
        if (i7 == ns.f5) {
            boolean q10 = m10.i(this.a).q();
            q0 q0Var = this.n1;
            if (q10) {
                q0Var.c(hd.M0(2131747831, null), false, true);
            } else {
                q0Var.r = false;
                q0Var.d(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        super.dismiss();
        ns.e().n(this, ns.j5);
        ns.f(this.a).n(this, ns.g5);
        ns.f(this.a).n(this, ns.f5);
        ns.e().k(ns.k1, 16);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean m0() {
        v0 v0Var = this.s1;
        if (v0Var.getChildCount() > 0) {
            ViewGroup viewGroup = ((w0) v0Var.getChildAt(0)).f;
            if (viewGroup instanceof o0) {
                o0 o0Var = (o0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(r0.getMeasuredWidth(), 0.0f);
                o0Var.setOffset(r0.getMeasuredWidth());
                this.w1 = true;
                ofFloat.addUpdateListener(new f4(o0Var, 13));
                ofFloat.addListener(new y50(21, this, o0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(er.h);
                ofFloat.start();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ns.e().c(this, ns.j5);
        ns.f(this.a).c(this, ns.g5);
        ns.f(this.a).c(this, ns.f5);
        o7 o7Var = new o7(7, getContext(), this);
        this.I1 = o7Var;
        q6.h(j6.h5, o7Var, this.J0);
        q6.l(this.I1, 5, j6.G6, this.J0);
        q6.l(this.I1, 3, j6.z8, this.J0);
        o7 o7Var2 = this.I1;
        int i7 = j6.y8;
        q6.l(o7Var2, 1, i7, this.J0);
        q6.b(this.I1, i7, this.J0, true);
        this.I1.setCastShadows(true);
        this.I1.setExtraHeight(org.telegram.messenger.g0.L(2.0f));
        this.I1.setBackButtonImage(R.drawable.ic_ab_back);
        this.I1.setActionBarMenuOnItemClick(new ct0(this, 24));
        this.b.addView(this.I1, ja.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.I1.getLayoutParams()).topMargin = (-this.t0) - org.telegram.messenger.g0.L(2.0f);
        org.telegram.messenger.g0.Y3(this.I1, false, 1.0f, true, false);
        int i10 = this.B1;
        ArrayList arrayList = this.o1;
        if (((ss0) arrayList.get(i10)).a == 14) {
            this.I1.setTitle(hd.M0(2131743805, null));
            this.I1.requestLayout();
        } else if (((ss0) arrayList.get(this.B1)).a == 28) {
            this.I1.setTitle(hd.M0(2131744252, null));
            this.I1.requestLayout();
        } else if (((ss0) arrayList.get(this.B1)).a == 40) {
            this.I1.setTitle(hd.M0(2131750837, null));
            this.I1.requestLayout();
        } else {
            this.I1.setTitle(hd.M0(2131751349, null));
            this.I1.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        super.show();
        ns.e().k(ns.j1, 16);
    }

    public x0(e2 e2Var, int i7, boolean z10) {
        this(e2Var, e2Var.getContext(), e2Var.getCurrentAccount(), false, i7, z10, null);
    }

    public x0(e2 e2Var, Context context, int i7, int i10, boolean z10) {
        this(e2Var, context, i7, false, i10, z10, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x0(e2 e2Var, Context context, int i7, boolean z10, int i10, boolean z11, ts0 ts0Var) {
        this(e2Var, context, i7, z10, i10, z11, ts0Var, r0);
        e6 e6Var;
        if (e2Var == null) {
            e6Var = null;
        } else if (e2Var.getLastStoryViewer() != null && !e2Var.getLastStoryViewer().H0) {
            e6Var = e2Var.getLastStoryViewer().E;
        } else {
            e6Var = e2Var.getResourceProvider();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(e2 e2Var, Context context, int i7, boolean z10, int i10, boolean z11, ts0 ts0Var, e6 e6Var) {
        super(1, context, e6Var, false);
        final int i11 = 0;
        ArrayList arrayList = new ArrayList();
        this.o1 = arrayList;
        this.F1 = ns.e4;
        this.m1 = e2Var;
        this.E1 = ts0Var;
        Q(j6.h5);
        this.y1 = i10;
        this.z1 = z11;
        this.x1 = qz.i(org.telegram.messenger.g0.y2(null, R.raw.star_loader));
        m01 m01Var = new m01(12, getContext(), this);
        if (!z10 && i10 != 35) {
            PremiumPreviewFragment.s0(i7, arrayList);
        } else {
            PremiumPreviewFragment.r0(i7, arrayList, false);
            PremiumPreviewFragment.r0(i7, arrayList, true);
        }
        if (i10 == 40) {
            arrayList.clear();
            arrayList.add(new ss0(40, R.drawable.gift, hd.M0(2131750837, null), hd.M0(2131750836, null)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.o1.size()) {
                i12 = 0;
                break;
            } else if (((ss0) this.o1.get(i12)).a == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (z11) {
            ss0 ss0Var = (ss0) this.o1.get(i12);
            this.o1.clear();
            this.o1.add(ss0Var);
            i12 = 0;
        }
        ss0 ss0Var2 = (ss0) this.o1.get(i12);
        this.v0 = false;
        this.w0 = false;
        this.U0 = false;
        z0 z0Var = new z0(j6.Rk, j6.Sk, j6.Tk, -1, null);
        z0Var.o = 1.1f;
        z0Var.p = 1.5f;
        z0Var.q = -0.2f;
        z0Var.m = true;
        w61 w61Var = new w61(this, getContext(), z0Var, 5);
        this.t1 = w61Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v1 = frameLayout;
        frameLayout.setContentDescription(hd.M0(2131752041, null));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int L = org.telegram.messenger.g0.L(12.0f);
        int o4 = i0.a.o(-1, 40);
        int o10 = i0.a.o(-1, 100);
        imageView.setBackground(j6.k0(L, L, L, L, o4, o10, o10));
        frameLayout.addView(imageView, ja.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: ug.r0
            public final /* synthetic */ x0 b;

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
        m01Var.addView(w61Var, ja.t(-1, -2, 1, 0, 16, 0, 0));
        v0 v0Var = new v0(this, getContext());
        this.s1 = v0Var;
        v0Var.setOverScrollMode(2);
        v0Var.setOffscreenPageLimit(0);
        v0Var.setAdapter(new d20(this, 4));
        this.B1 = i12;
        v0Var.setCurrentItem(i12);
        m01Var.addView(v0Var, ja.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        m01Var.addView(frameLayout, ja.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        aa aaVar = new aa(getContext(), v0Var, this.o1.size());
        v0Var.b(new fi.o7(this, aaVar, 1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(m01Var);
        linearLayout.setOrientation(1);
        int i13 = j6.V8;
        int i14 = j6.P9;
        aaVar.n = i13;
        aaVar.r = i14;
        if (!z11) {
            linearLayout.addView(aaVar, ja.t(this.o1.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        final int i15 = 1;
        q0 q0Var = new q0(getContext(), e6Var, true);
        this.n1 = q0Var;
        q0Var.w.setOnClickListener(new m3(this, e2Var, z11, ss0Var2, 5));
        q0Var.h.setOnClickListener(new View.OnClickListener(this) { // from class: ug.r0
            public final /* synthetic */ x0 b;

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
        frameLayout2.addView(q0Var, ja.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        q6.h(j6.h5, frameLayout2, e6Var);
        linearLayout.addView(frameLayout2, ja.r(-1, 68, 80));
        if (i10 == 40) {
            q0Var.c(c6.h2(hd.M0(2131743888, null)), true, false);
        } else if (m10.i(i7).q()) {
            q0Var.c(hd.M0(2131747831, null), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        this.O = scrollView;
        si.b0(i7).o1();
        J0();
        this.V0 = 83;
        k4 k4Var = new k4(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.b = k4Var;
        int i16 = this.u0;
        k4Var.setPadding(i16, this.t0 - 1, i16, 0);
    }
}
