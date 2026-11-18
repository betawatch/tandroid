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
import c8.ma;
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
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.lz;
import org.telegram.messenger.mz;
import org.telegram.messenger.ri;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.x2;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.w01;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.hs0;
import org.telegram.ui.ws0;
import org.telegram.ui.xs0;
import org.telegram.ui.y61;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class z0 extends x2 implements fs {
    public static final /* synthetic */ int J1 = 0;
    public boolean A1;
    public int B1;
    public int C1;
    public float D1;
    public final xs0 E1;
    public int F1;
    public int G1;
    public int H1;
    public v7 I1;
    public final h2 m1;
    public final s0 n1;
    public final ArrayList o1;
    public float p1;
    public float q1;
    public boolean r1;
    public final x0 s1;
    public final y61 t1;
    public int u1;
    public final FrameLayout v1;
    public boolean w1;
    public final lz x1;
    public final int y1;
    public final boolean z1;

    public z0(int i7, Context context, i6 i6Var) {
        this(null, context, j10.t0, false, i7, true, null, i6Var);
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean G() {
        int i7 = 0;
        while (true) {
            x0 x0Var = this.s1;
            if (i7 >= x0Var.getChildCount()) {
                return true;
            }
            y0 y0Var = (y0) x0Var.getChildAt(i7);
            if (y0Var.a == this.B1) {
                if (y0Var.f instanceof a) {
                    return !((a) r1).b.canScrollVertically(-1);
                }
            }
            i7++;
        }
    }

    public final void J0() {
        x0 x0Var;
        View m10;
        View m11;
        int i7 = -1;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            x0Var = this.s1;
            if (i11 >= x0Var.getChildCount()) {
                break;
            }
            y0 y0Var = (y0) x0Var.getChildAt(i11);
            int i12 = y0Var.a;
            ViewGroup viewGroup = y0Var.f;
            if (i12 == this.B1 && (viewGroup instanceof a) && ((m11 = ((a) viewGroup).c.m(0)) == null || (i7 = m11.getTop()) < 0)) {
                i7 = 0;
            }
            if (y0Var.a == this.C1 && (viewGroup instanceof a) && ((m10 = ((a) viewGroup).c.m(0)) == null || (i10 = m10.getTop()) < 0)) {
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
        y61 y61Var = this.t1;
        y61Var.setTranslationX((z10 ? y61Var.getMeasuredWidth() : -y61Var.getMeasuredWidth()) * this.q1);
        if (i13 != this.H1) {
            this.H1 = i13;
            for (int i14 = 0; i14 < x0Var.getChildCount(); i14++) {
                if (!((y0) x0Var.getChildAt(i14)).h) {
                    x0Var.getChildAt(i14).setTranslationY(this.H1);
                }
            }
            y61Var.setTranslationY(this.H1);
            frameLayout.setTranslationY(this.H1);
            this.b.invalidate();
            org.telegram.messenger.g0.X3(this.I1, this.H1 < org.telegram.messenger.g0.L(this.y1 == 40 ? 5.0f : 30.0f), 1.0f, true, true);
        }
    }

    public final void K0() {
        boolean z10 = this.A1;
        s0 s0Var = this.n1;
        if (z10) {
            s0Var.f.setText(gd.M0(2131754942, null));
            return;
        }
        if (!this.z1) {
            s0Var.f.setText(PremiumPreviewFragment.t0(this.a, this.E1));
            return;
        }
        int i7 = this.y1;
        if (i7 == 4) {
            s0Var.f.setText(gd.M0(2131743622, null));
            s0Var.setIcon(R.raw.unlock_icon);
        } else if (i7 != 10) {
            s0Var.f.setText(gd.M0(2131754942, null));
        } else {
            s0Var.f.setText(gd.M0(2131743623, null));
            s0Var.setIcon(R.raw.unlock_icon);
        }
    }

    public final void L0() {
        this.A1 = true;
        s0 s0Var = this.n1;
        s0Var.r = false;
        s0Var.d(true);
        K0();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.l5 || i7 == ks.i5) {
            K0();
            return;
        }
        if (i7 == ks.h5) {
            boolean q10 = j10.i(this.a).q();
            s0 s0Var = this.n1;
            if (q10) {
                s0Var.c(gd.M0(2131747638, null), false, true);
            } else {
                s0Var.r = false;
                s0Var.d(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        super.dismiss();
        ks.e().n(this, ks.l5);
        ks.f(this.a).n(this, ks.i5);
        ks.f(this.a).n(this, ks.h5);
        ks.e().k(ks.k1, 16);
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean m0() {
        x0 x0Var = this.s1;
        if (x0Var.getChildCount() > 0) {
            ViewGroup viewGroup = ((y0) x0Var.getChildAt(0)).f;
            if (viewGroup instanceof q0) {
                q0 q0Var = (q0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(r0.getMeasuredWidth(), 0.0f);
                q0Var.setOffset(r0.getMeasuredWidth());
                this.w1 = true;
                ofFloat.addUpdateListener(new d4(q0Var, 13));
                ofFloat.addListener(new h60(21, this, q0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(lr.h);
                ofFloat.start();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ks.e().c(this, ks.l5);
        ks.f(this.a).c(this, ks.i5);
        ks.f(this.a).c(this, ks.h5);
        v7 v7Var = new v7(7, getContext(), this);
        this.I1 = v7Var;
        u6.h(n6.h5, v7Var, this.J0);
        u6.l(this.I1, 5, n6.G6, this.J0);
        u6.l(this.I1, 3, n6.z8, this.J0);
        v7 v7Var2 = this.I1;
        int i7 = n6.y8;
        u6.l(v7Var2, 1, i7, this.J0);
        u6.b(this.I1, i7, this.J0, true);
        this.I1.setCastShadows(true);
        this.I1.setExtraHeight(org.telegram.messenger.g0.L(2.0f));
        this.I1.setBackButtonImage(R.drawable.ic_ab_back);
        this.I1.setActionBarMenuOnItemClick(new hs0(this, 26));
        this.b.addView(this.I1, ma.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.I1.getLayoutParams()).topMargin = (-this.t0) - org.telegram.messenger.g0.L(2.0f);
        org.telegram.messenger.g0.X3(this.I1, false, 1.0f, true, false);
        int i10 = this.B1;
        ArrayList arrayList = this.o1;
        if (((ws0) arrayList.get(i10)).a == 14) {
            this.I1.setTitle(gd.M0(2131743568, null));
            this.I1.requestLayout();
        } else if (((ws0) arrayList.get(this.B1)).a == 28) {
            this.I1.setTitle(gd.M0(2131744017, null));
            this.I1.requestLayout();
        } else if (((ws0) arrayList.get(this.B1)).a == 40) {
            this.I1.setTitle(gd.M0(2131750826, null));
            this.I1.requestLayout();
        } else {
            this.I1.setTitle(gd.M0(2131751338, null));
            this.I1.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void show() {
        super.show();
        ks.e().k(ks.j1, 16);
    }

    public z0(h2 h2Var, int i7, boolean z10) {
        this(h2Var, h2Var.getContext(), h2Var.getCurrentAccount(), false, i7, z10, null);
    }

    public z0(h2 h2Var, Context context, int i7, int i10, boolean z10) {
        this(h2Var, context, i7, false, i10, z10, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z0(h2 h2Var, Context context, int i7, boolean z10, int i10, boolean z11, xs0 xs0Var) {
        this(h2Var, context, i7, z10, i10, z11, xs0Var, r0);
        i6 i6Var;
        if (h2Var == null) {
            i6Var = null;
        } else if (h2Var.getLastStoryViewer() != null && !h2Var.getLastStoryViewer().H0) {
            i6Var = h2Var.getLastStoryViewer().E;
        } else {
            i6Var = h2Var.getResourceProvider();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(h2 h2Var, Context context, int i7, boolean z10, int i10, boolean z11, xs0 xs0Var, i6 i6Var) {
        super(1, context, i6Var, false);
        final int i11 = 0;
        ArrayList arrayList = new ArrayList();
        this.o1 = arrayList;
        this.F1 = ks.e4;
        this.m1 = h2Var;
        this.E1 = xs0Var;
        Q(n6.h5);
        this.y1 = i10;
        this.z1 = z11;
        this.x1 = mz.i(org.telegram.messenger.g0.y2(null, R.raw.star_loader));
        w01 w01Var = new w01(11, getContext(), this);
        if (!z10 && i10 != 35) {
            PremiumPreviewFragment.s0(i7, arrayList);
        } else {
            PremiumPreviewFragment.r0(i7, arrayList, false);
            PremiumPreviewFragment.r0(i7, arrayList, true);
        }
        if (i10 == 40) {
            arrayList.clear();
            arrayList.add(new ws0(40, R.drawable.gift, gd.M0(2131750826, null), gd.M0(2131750825, null)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.o1.size()) {
                i12 = 0;
                break;
            } else if (((ws0) this.o1.get(i12)).a == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (z11) {
            ws0 ws0Var = (ws0) this.o1.get(i12);
            this.o1.clear();
            this.o1.add(ws0Var);
            i12 = 0;
        }
        ws0 ws0Var2 = (ws0) this.o1.get(i12);
        this.v0 = false;
        this.w0 = false;
        this.U0 = false;
        b1 b1Var = new b1(n6.Rk, n6.Sk, n6.Tk, -1, null);
        b1Var.o = 1.1f;
        b1Var.p = 1.5f;
        b1Var.q = -0.2f;
        b1Var.m = true;
        y61 y61Var = new y61(this, getContext(), b1Var, 6);
        this.t1 = y61Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v1 = frameLayout;
        frameLayout.setContentDescription(gd.M0(2131752030, null));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int L = org.telegram.messenger.g0.L(12.0f);
        int o4 = i0.a.o(-1, 40);
        int o10 = i0.a.o(-1, 100);
        imageView.setBackground(n6.k0(L, L, L, L, o4, o10, o10));
        frameLayout.addView(imageView, ma.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: ug.t0
            public final /* synthetic */ z0 b;

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
        w01Var.addView(y61Var, ma.t(-1, -2, 1, 0, 16, 0, 0));
        x0 x0Var = new x0(this, getContext());
        this.s1 = x0Var;
        x0Var.setOverScrollMode(2);
        x0Var.setOffscreenPageLimit(0);
        x0Var.setAdapter(new k20(this, 4));
        this.B1 = i12;
        x0Var.setCurrentItem(i12);
        w01Var.addView(x0Var, ma.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        w01Var.addView(frameLayout, ma.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        ia iaVar = new ia(getContext(), x0Var, this.o1.size());
        x0Var.b(new l7(this, iaVar, 1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(w01Var);
        linearLayout.setOrientation(1);
        int i13 = n6.V8;
        int i14 = n6.P9;
        iaVar.n = i13;
        iaVar.r = i14;
        if (!z11) {
            linearLayout.addView(iaVar, ma.t(this.o1.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        final int i15 = 1;
        s0 s0Var = new s0(getContext(), i6Var, true);
        this.n1 = s0Var;
        s0Var.w.setOnClickListener(new k3(this, h2Var, z11, ws0Var2, 5));
        s0Var.h.setOnClickListener(new View.OnClickListener(this) { // from class: ug.t0
            public final /* synthetic */ z0 b;

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
        frameLayout2.addView(s0Var, ma.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        u6.h(n6.h5, frameLayout2, i6Var);
        linearLayout.addView(frameLayout2, ma.r(-1, 68, 80));
        if (i10 == 40) {
            s0Var.c(f6.t2(gd.M0(2131743651, null)), true, false);
        } else if (j10.i(i7).q()) {
            s0Var.c(gd.M0(2131747638, null), false, false);
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
