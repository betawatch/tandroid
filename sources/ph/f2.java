package ph;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import rh.v5;
import w7.b6;
import w7.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f2 extends FrameLayout implements us {
    public final LinearLayout D;
    public final TextView E;
    public final TextView F;
    public final vh.d G;
    public boolean H;
    public final vq0 a;
    public final int b;
    public final p6 c;
    public boolean d;
    public v5 e;
    public final ii f;
    public boolean h;
    public int n;
    public final FrameLayout r;
    public final LinearLayout s;
    public final TextView w;
    public final TextView x;
    public final FrameLayout y;

    public f2(vq0 vq0Var, int i10, p6 p6Var) {
        super(vq0Var.getContext());
        this.n = org.telegram.messenger.i0.q.y;
        Context context = vq0Var.getContext();
        this.a = vq0Var;
        this.b = i10;
        this.c = p6Var;
        ii iiVar = new ii(context, i10, new ag.a(this, 26), new a2(this), new a2(this), p6Var, vq0Var);
        this.f = iiVar;
        iiVar.f3.r = false;
        iiVar.setSelectorType(9);
        iiVar.setSelectorDrawableColor(0);
        iiVar.setClipToPadding(false);
        iiVar.setClipChildren(false);
        addView(iiVar, b6.e(-1, -1, zs.E1));
        g();
        iiVar.j(new bi.t3(10, this, vq0Var));
        b2 b2Var = new b2(vq0Var);
        b2Var.m = false;
        b2Var.C = false;
        b2Var.o(gr.h);
        b2Var.n(350L);
        iiVar.setItemAnimator(b2Var);
        new s4.x(new c2(this, vq0Var)).h(iiVar);
        View view = this.r;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.y;
        if (view2 != null) {
            removeView(view2);
        }
        final int i11 = 1;
        if (vq0Var.d != this.e) {
            this.r = null;
            this.w = null;
            this.x = null;
            this.s = null;
            this.y = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.D = linearLayout;
            linearLayout.setOrientation(1);
            this.y.addView(this.D, b6.e(-2, -2, 17));
            TextView textView = new TextView(getContext());
            this.E = textView;
            textView.setTextSize(1, 20.0f);
            this.E.setTypeface(org.telegram.messenger.i0.o());
            a7.V(this.E, t6.G6, p6Var);
            this.E.setText(cd.L0(2131750254, null));
            this.D.addView(this.E, b6.t(-2, -2, 1, 0, 0, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.F = textView2;
            textView2.setTextSize(1, 14.0f);
            a7.V(this.F, t6.y6, p6Var);
            this.F.setText(cd.L0(2131750255, null));
            this.D.addView(this.F, b6.t(-2, -2, 1, 0, 10, 0, 0));
            vh.d dVar = new vh.d(getContext(), p6Var, true);
            this.G = dVar;
            dVar.i(cd.L0(2131750256, null), false, true);
            this.D.addView(this.G, b6.t(zs.e3, 44, 1, 0, 19, 0, 12));
            this.G.setOnClickListener(new View.OnClickListener(this) { // from class: ph.w1
                public final /* synthetic */ f2 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i11) {
                        case 0:
                            v5 v5Var = this.b.e;
                            if (v5Var != null) {
                                if (!v5Var.e || v5Var.g != 783) {
                                    v5Var.g = 783;
                                    v5Var.e = true;
                                    v5Var.j(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            this.b.a.a();
                            break;
                    }
                }
            });
            addView(this.y, b6.d(-1, -1.0f, zs.E1, 0.0f, -12.0f, 0.0f, 0.0f));
            iiVar.setEmptyView(this.y);
            LinearLayout linearLayout2 = this.D;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(vq0Var.e.h() ? 0 : 8);
                return;
            }
            return;
        }
        this.y = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.D = null;
        this.r = new FrameLayout(getContext());
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        this.s = linearLayout3;
        linearLayout3.setOrientation(1);
        this.r.addView(this.s, b6.e(-2, -2, 17));
        g9 g9Var = new g9(getContext());
        g9Var.setImageDrawable(new bi0(R.raw.utyan_empty, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f)));
        this.s.addView(g9Var, b6.t(120, 120, 1, 0, 0, 0, 0));
        TextView textView3 = new TextView(getContext());
        this.w = textView3;
        textView3.setTextSize(1, 17.0f);
        this.w.setTypeface(org.telegram.messenger.i0.o());
        a7.V(this.w, t6.G6, p6Var);
        this.w.setText(cd.L0(2131746684, null));
        this.s.addView(this.w, b6.t(-2, -2, 1, 0, 12, 0, 0));
        TextView textView4 = new TextView(getContext());
        this.x = textView4;
        textView4.setTextSize(1, 14.0f);
        TextView textView5 = this.x;
        int i12 = t6.Ci;
        a7.V(textView5, i12, p6Var);
        this.x.setText(cd.L0(2131746685, null));
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: ph.w1
            public final /* synthetic */ f2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        v5 v5Var = this.b.e;
                        if (v5Var != null) {
                            if (!v5Var.e || v5Var.g != 783) {
                                v5Var.g = 783;
                                v5Var.e = true;
                                v5Var.j(true);
                                break;
                            }
                        }
                        break;
                    default:
                        this.b.a.a();
                        break;
                }
            }
        });
        this.x.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(4.0f));
        a7.R(this.x, t6.a0(t6.r1(0.1f, t6.w0(i12, p6Var)), 4, 4), null, a7.L(0.1f, i12), p6Var);
        e6.a(this.x);
        this.s.addView(this.x, b6.t(-2, -2, 1, 0, 8, 0, 0));
        addView(this.r, b6.e(-1, -1, zs.E1));
        iiVar.setEmptyView(this.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReordering(boolean z10) {
        ii iiVar;
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        vq0 vq0Var = this.a;
        vq0Var.q(vq0Var.g());
        int i10 = 0;
        while (true) {
            iiVar = this.f;
            if (i10 >= iiVar.getChildCount()) {
                break;
            }
            View childAt = iiVar.getChildAt(i10);
            if (childAt instanceof c1) {
                ((c1) childAt).e(z10, true);
            }
            i10++;
        }
        p51 p51Var = iiVar.f3;
        if (p51Var != null) {
            p51Var.T();
        }
        if (z10) {
            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
            if (T instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) T;
                profileActivity.T4(false);
                org.telegram.messenger.i0.g3(new q1(profileActivity, 1));
            }
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.G3 && objArr[1] == this.e) {
            f(true);
            if (this.e == null || !isAttachedToWindow()) {
                return;
            }
            ii iiVar = this.f;
            if (iiVar.canScrollVertically(1)) {
                for (int i12 = 0; i12 < iiVar.getChildCount(); i12++) {
                    if (!(iiVar.getChildAt(i12) instanceof zz)) {
                    }
                }
                return;
            }
            this.e.b();
        }
    }

    public final void e() {
        if (this.h) {
            v5 v5Var = this.e;
            if (v5Var != null) {
                v5Var.n();
            }
            setReordering(false);
        }
    }

    public final void f(boolean z10) {
        p51 p51Var;
        ii iiVar = this.f;
        if (iiVar == null || (p51Var = iiVar.f3) == null) {
            return;
        }
        boolean canScrollVertically = iiVar.canScrollVertically(-1);
        p51Var.O(z10);
        if (canScrollVertically) {
            return;
        }
        iiVar.v0(0);
    }

    public final void g() {
        vq0 vq0Var = this.a;
        setClipChildren(vq0Var.L == 0);
        ii iiVar = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) iiVar.getLayoutParams();
        int i10 = marginLayoutParams.topMargin;
        int i11 = -vq0Var.L;
        if (i10 != i11 || marginLayoutParams.bottomMargin != (-vq0Var.M)) {
            marginLayoutParams.topMargin = i11;
            marginLayoutParams.bottomMargin = -vq0Var.M;
            iiVar.setLayoutParams(marginLayoutParams);
        }
        iiVar.setPadding(org.telegram.messenger.i0.L(9.0f), vq0Var.L + vq0Var.K, org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(86.0f) + vq0Var.M);
    }

    public float getTabsHeight() {
        ii iiVar = this.f;
        float y3 = iiVar.getY();
        for (int i10 = 0; i10 < iiVar.getChildCount(); i10++) {
            View childAt = iiVar.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof c1) {
                if (R == 0) {
                    return Math.max(0.0f, childAt.getY() + y3);
                }
            } else if (R == 0) {
                return Math.max(0.0f, (childAt.getAlpha() * childAt.getHeight()) + childAt.getY() + y3);
            }
        }
        return 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.b).c(this, zs.G3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.b).n(this, zs.G3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.n);
    }

    public void setHasTabs(boolean z10) {
        if (this.H == z10) {
            return;
        }
        this.H = z10;
        ii iiVar = this.f;
        boolean canScrollVertically = iiVar.canScrollVertically(-1);
        iiVar.f3.O(true);
        if (!canScrollVertically) {
            iiVar.v0(0);
        }
        this.a.p();
    }

    public void setVisibleHeight(int i10) {
        this.n = i10;
        float l4 = Utilities.l(org.telegram.messenger.i0.z1(i10, org.telegram.messenger.i0.L(150.0f), org.telegram.messenger.i0.L(220.0f)));
        float T1 = org.telegram.messenger.i0.T1(0.6f, 1.0f, l4);
        LinearLayout linearLayout = this.s;
        if (linearLayout != null) {
            linearLayout.setAlpha(l4);
            this.s.setScaleX(T1);
            this.s.setScaleY(T1);
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.n)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.D;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(l4);
            this.D.setScaleX(T1);
            this.D.setScaleY(T1);
        }
        FrameLayout frameLayout2 = this.y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.n)) / 2.0f);
        }
    }
}
