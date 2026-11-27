// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xk8 extends nx0 implements fn7 {
    public static final /* synthetic */ int I1 = 0;
    public int A1;
    public int B1;
    public float C1;
    public final tl8 D1;
    public int E1;
    public int F1;
    public int G1;
    public y10 H1;
    public final e l1;
    public final ok8 m1;
    public final ArrayList n1;
    public float o1;
    public float p1;
    public boolean q1;
    public final tk8 r1;
    public final tt s1;
    public int t1;
    public final FrameLayout u1;
    public boolean v1;
    public final ggb w1;
    public final byte x1;
    public final boolean y1;
    public boolean z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xk8(e eVar, Context context, int i, boolean z, int i2, boolean z2, tl8 tl8Var, vnb vnbVar) {
        super(1, vnbVar, context, false);
        final byte b = 0;
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        this.E1 = jn7.d4;
        this.l1 = eVar;
        this.D1 = tl8Var;
        L(aob.h5);
        this.x1 = i2;
        this.y1 = z2;
        this.w1 = hgb.h(hl.v2(null, R.raw.star_loader));
        d26 d26Var = new d26((byte) 13, getContext(), this);
        if (z || i2 == 35) {
            PremiumPreviewFragment.p0(i, arrayList, false);
            PremiumPreviewFragment.p0(i, arrayList, true);
        } else {
            PremiumPreviewFragment.q0(i, arrayList);
        }
        if (i2 == 40) {
            arrayList.clear();
            arrayList.add(new sl8(40, R.drawable.gift, ob6.M0(2131750802, null), ob6.M0(2131750801, null)));
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.n1.size()) {
                i3 = 0;
                break;
            } else if (((sl8) this.n1.get(i3)).a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (z2) {
            sl8 sl8Var = (sl8) this.n1.get(i3);
            this.n1.clear();
            this.n1.add(sl8Var);
            i3 = 0;
        }
        sl8 sl8Var2 = (sl8) this.n1.get(i3);
        this.v0 = false;
        this.w0 = false;
        this.T0 = false;
        al8 al8Var = new al8(aob.Rk, aob.Sk, aob.Tk, -1, null);
        al8Var.o = 1.1f;
        al8Var.p = 1.5f;
        al8Var.q = -0.2f;
        al8Var.m = true;
        tt ttVar = new tt(this, getContext(), al8Var, (byte) 25);
        this.s1 = ttVar;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.u1 = frameLayout;
        frameLayout.setContentDescription(ob6.M0(2131752006, null));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int L = hl.L(12.0f);
        int o = vm2.o(-1, 40);
        int o2 = vm2.o(-1, 100);
        imageView.setBackground(aob.i0(L, L, L, L, o, o2, o2));
        frameLayout.addView(imageView, tre.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: pk8
            public final /* synthetic */ xk8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                xk8 xk8Var = this.b;
                switch (b2) {
                    case 0:
                        xk8Var.dismiss();
                        break;
                    default:
                        xk8Var.dismiss();
                        break;
                }
            }
        });
        d26Var.addView(ttVar, tre.t(-1, -2, 1, 0, 16, 0, 0));
        tk8 tk8Var = new tk8(this, getContext());
        this.r1 = tk8Var;
        tk8Var.setOverScrollMode(2);
        tk8Var.setOffscreenPageLimit(0);
        tk8Var.setAdapter(new gb5(this, (byte) 2));
        this.A1 = i3;
        tk8Var.setCurrentItem(i3);
        d26Var.addView(tk8Var, tre.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        d26Var.addView(frameLayout, tre.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        zw0 zw0Var = new zw0(getContext(), tk8Var, this.n1.size());
        tk8Var.b(new vk8(b, this, zw0Var));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(d26Var);
        linearLayout.setOrientation(1);
        int i4 = aob.V8;
        int i5 = aob.P9;
        zw0Var.n = i4;
        zw0Var.r = i5;
        if (!z2) {
            linearLayout.addView(zw0Var, tre.t(this.n1.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        final byte b2 = 1;
        ok8 ok8Var = new ok8(vnbVar, getContext(), true);
        this.m1 = ok8Var;
        ok8Var.w.setOnClickListener(new e73(this, eVar, z2, sl8Var2, (byte) 5));
        ok8Var.h.setOnClickListener(new View.OnClickListener(this) { // from class: pk8
            public final /* synthetic */ xk8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                xk8 xk8Var = this.b;
                switch (b22) {
                    case 0:
                        xk8Var.dismiss();
                        break;
                    default:
                        xk8Var.dismiss();
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(ok8Var, tre.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        yob.h(aob.h5, vnbVar, frameLayout2);
        linearLayout.addView(frameLayout2, tre.r(-1, 68, 80));
        if (i2 == 40) {
            ok8Var.c(wua.l2(ob6.M0(2131743543, null)), true, false);
        } else if (yac.h(i).p()) {
            ok8Var.c(ob6.M0(2131747558, null), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        this.O = scrollView;
        ls6.d0(i).p1();
        F0();
        this.U0 = (byte) 83;
        jo0 jo0Var = new jo0(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.b = jo0Var;
        int i6 = this.u0;
        jo0Var.setPadding(i6, this.t0 - 1, i6, 0);
    }

    @Override // nx0
    public final boolean D() {
        int i = 0;
        while (true) {
            tk8 tk8Var = this.r1;
            if (i >= tk8Var.getChildCount()) {
                return true;
            }
            wk8 wk8Var = (wk8) tk8Var.getChildAt(i);
            if (wk8Var.a == this.A1) {
                if (wk8Var.f instanceof lg0) {
                    return !((lg0) r1).b.canScrollVertically(-1);
                }
            }
            i++;
        }
    }

    public final void E0() {
        tk8 tk8Var;
        View m;
        View m2;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            tk8Var = this.r1;
            if (i3 >= tk8Var.getChildCount()) {
                break;
            }
            wk8 wk8Var = (wk8) tk8Var.getChildAt(i3);
            int i4 = wk8Var.a;
            ViewGroup viewGroup = wk8Var.f;
            if (i4 == this.A1 && (viewGroup instanceof lg0) && ((m2 = ((lg0) viewGroup).c.m(0)) == null || (i = m2.getTop()) < 0)) {
                i = 0;
            }
            if (wk8Var.a == this.B1 && (viewGroup instanceof lg0) && ((m = ((lg0) viewGroup).c.m(0)) == null || (i2 = m.getTop()) < 0)) {
                i2 = 0;
            }
            i3++;
        }
        int i5 = this.F1;
        if (i >= 0) {
            float f = 1.0f - this.C1;
            i5 = Math.min(i5, (int) qd4.A(1.0f, f, i5, i * f));
        }
        if (i2 >= 0) {
            float f2 = this.C1;
            i5 = Math.min(i5, (int) qd4.A(1.0f, f2, this.F1, i2 * f2));
        }
        float f3 = 1.0f - this.p1;
        FrameLayout frameLayout = this.u1;
        frameLayout.setAlpha(f3);
        if (this.o1 == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z = this.q1;
        tt ttVar = this.s1;
        ttVar.setTranslationX((z ? ttVar.getMeasuredWidth() : -ttVar.getMeasuredWidth()) * this.p1);
        if (i5 != this.G1) {
            this.G1 = i5;
            for (int i6 = 0; i6 < tk8Var.getChildCount(); i6++) {
                if (!((wk8) tk8Var.getChildAt(i6)).h) {
                    tk8Var.getChildAt(i6).setTranslationY(this.G1);
                }
            }
            ttVar.setTranslationY(this.G1);
            frameLayout.setTranslationY(this.G1);
            this.b.invalidate();
            hl.T3(this.H1, this.G1 < hl.L(this.x1 == 40 ? 5.0f : 30.0f), 1.0f, true, true);
        }
    }

    public final void F0() {
        boolean z = this.z1;
        ok8 ok8Var = this.m1;
        if (z) {
            ok8Var.f.setText(ob6.M0(2131754938, null));
            return;
        }
        if (!this.y1) {
            ok8Var.f.setText(PremiumPreviewFragment.r0(this.a, this.D1));
            return;
        }
        byte b = this.x1;
        if (b == 4) {
            ok8Var.f.setText(ob6.M0(2131743514, null));
            ok8Var.setIcon(R.raw.unlock_icon);
        } else if (b != 10) {
            ok8Var.f.setText(ob6.M0(2131754938, null));
        } else {
            ok8Var.f.setText(ob6.M0(2131743515, null));
            ok8Var.setIcon(R.raw.unlock_icon);
        }
    }

    public final void G0() {
        this.z1 = true;
        ok8 ok8Var = this.m1;
        ok8Var.r = false;
        ok8Var.d(true);
        F0();
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.m5 || i == jn7.j5) {
            F0();
            return;
        }
        if (i == jn7.i5) {
            boolean p = yac.h(this.a).p();
            ok8 ok8Var = this.m1;
            if (p) {
                ok8Var.c(ob6.M0(2131747558, null), false, true);
            } else {
                ok8Var.r = false;
                ok8Var.d(true);
            }
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        jn7.e().n(this, jn7.m5);
        jn7.f(this.a).n(this, jn7.j5);
        jn7.f(this.a).n(this, jn7.i5);
        jn7.e().k(jn7.k1, 16);
    }

    @Override // nx0
    public final boolean j0() {
        tk8 tk8Var = this.r1;
        if (tk8Var.getChildCount() > 0) {
            ViewGroup viewGroup = ((wk8) tk8Var.getChildAt(0)).f;
            if (viewGroup instanceof lk8) {
                lk8 lk8Var = (lk8) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(r0.getMeasuredWidth(), 0.0f);
                lk8Var.setOffset(r0.getMeasuredWidth());
                this.v1 = true;
                ofFloat.addUpdateListener(new ce0(lk8Var, (byte) 11));
                ofFloat.addListener(new wd8((Object) this, (Object) lk8Var, (byte) 1));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(k43.h);
                ofFloat.start();
            }
        }
        return false;
    }

    @Override // nx0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jn7.e().b(this, jn7.m5);
        jn7.f(this.a).b(this, jn7.j5);
        jn7.f(this.a).b(this, jn7.i5);
        y10 y10Var = new y10((byte) 5, getContext(), this);
        this.H1 = y10Var;
        yob.h(aob.h5, this.J0, y10Var);
        yob.l(this.H1, 5, aob.G6, this.J0);
        yob.l(this.H1, 3, aob.z8, this.J0);
        y10 y10Var2 = this.H1;
        int i = aob.y8;
        yob.l(y10Var2, 1, i, this.J0);
        yob.b(this.H1, i, this.J0, true);
        this.H1.setCastShadows(true);
        this.H1.setExtraHeight(hl.L(2.0f));
        this.H1.setBackButtonImage(R.drawable.ic_ab_back);
        this.H1.setActionBarMenuOnItemClick(new zl5(this, (byte) 27));
        this.b.addView(this.H1, tre.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.H1.getLayoutParams()).topMargin = (-this.t0) - hl.L(2.0f);
        hl.T3(this.H1, false, 1.0f, true, false);
        int i2 = this.A1;
        ArrayList arrayList = this.n1;
        if (((sl8) arrayList.get(i2)).a == 14) {
            this.H1.setTitle(ob6.M0(2131743460, null));
            this.H1.requestLayout();
            return;
        }
        if (((sl8) arrayList.get(this.A1)).a == 28) {
            this.H1.setTitle(ob6.M0(2131743905, null));
            this.H1.requestLayout();
            return;
        }
        byte b = ((sl8) arrayList.get(this.A1)).a;
        y10 y10Var3 = this.H1;
        if (b == 40) {
            y10Var3.setTitle(ob6.M0(2131750802, null));
            this.H1.requestLayout();
        } else {
            y10Var3.setTitle(ob6.M0(2131751314, null));
            this.H1.requestLayout();
        }
    }

    @Override // nx0, android.app.Dialog
    public final void show() {
        super.show();
        jn7.e().k(jn7.j1, 16);
    }

    public xk8(e eVar, int i, boolean z) {
        this(eVar, eVar.getContext(), eVar.getCurrentAccount(), false, i, z, null);
    }

    public xk8(e eVar, Context context, int i, int i2, boolean z) {
        this(eVar, context, i, false, i2, z, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xk8(e eVar, Context context, int i, boolean z, int i2, boolean z2, tl8 tl8Var) {
        this(eVar, context, i, z, i2, z2, tl8Var, r0);
        vnb vnbVar;
        if (eVar == null) {
            vnbVar = null;
        } else if (eVar.getLastStoryViewer() != null && !eVar.getLastStoryViewer().H0) {
            vnbVar = eVar.getLastStoryViewer().E;
        } else {
            vnbVar = eVar.getResourceProvider();
        }
    }

    public xk8(int i, vnb vnbVar, Context context) {
        this(null, context, yac.t0, false, i, true, null, vnbVar);
    }
}
