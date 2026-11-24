// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rs8 extends FrameLayout implements jm7 {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final b61 H;
    public boolean I;
    public final lea a;
    public final int b;
    public final ylb c;
    public boolean d;
    public ava e;
    public final va f;
    public boolean h;
    public int n;
    public final FrameLayout r;
    public final LinearLayout s;
    public final TextView w;
    public final TextView x;
    public final FrameLayout y;

    public rs8(lea leaVar, int i, ylb ylbVar) {
        super(leaVar.getContext());
        this.n = gm.q.y;
        Context context = leaVar.getContext();
        this.a = leaVar;
        this.b = i;
        this.c = ylbVar;
        va vaVar = new va(context, i, new vh8(this, (byte) 4), new ms8(this), new ms8(this), ylbVar, leaVar);
        this.f = vaVar;
        vaVar.g3.r = false;
        vaVar.setSelectorType(9);
        vaVar.setSelectorDrawableColor(0);
        vaVar.setClipToPadding(false);
        vaVar.setClipChildren(false);
        addView(vaVar, qoe.e(-1, -1, nm7.D1));
        g();
        vaVar.j(new bk1(this, leaVar, (byte) 8));
        ns8 ns8Var = new ns8(leaVar);
        ns8Var.m = false;
        ns8Var.C = false;
        ns8Var.o(d53.h);
        ns8Var.n(350L);
        vaVar.setItemAnimator(ns8Var);
        new hu5(new os8(this, leaVar)).h(vaVar);
        View view = this.r;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.y;
        if (view2 != null) {
            removeView(view2);
        }
        final byte b = 1;
        if (leaVar.d != this.e) {
            this.r = null;
            this.w = null;
            this.x = null;
            this.s = null;
            this.y = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.E = linearLayout;
            linearLayout.setOrientation(1);
            this.y.addView(this.E, qoe.e(-2, -2, 17));
            TextView textView = new TextView(getContext());
            this.F = textView;
            textView.setTextSize(1, 20.0f);
            this.F.setTypeface(gm.o());
            anb.X(this.F, cmb.F6, ylbVar);
            this.F.setText(jb6.M0(2131750178, null));
            this.E.addView(this.F, qoe.t(-2, -2, 1, 0, 0, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.G = textView2;
            textView2.setTextSize(1, 14.0f);
            anb.X(this.G, cmb.x6, ylbVar);
            this.G.setText(jb6.M0(2131750179, null));
            this.E.addView(this.G, qoe.t(-2, -2, 1, 0, 10, 0, 0));
            b61 b61Var = new b61(ylbVar, getContext(), true);
            this.H = b61Var;
            b61Var.i(jb6.M0(2131750180, null), false, true);
            this.E.addView(this.H, qoe.t(nm7.d3, 44, 1, 0, 19, 0, 12));
            this.H.setOnClickListener(new View.OnClickListener(this) { // from class: js8
                public final /* synthetic */ rs8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    byte b2 = b;
                    rs8 rs8Var = this.b;
                    switch (b2) {
                        case 0:
                            ava avaVar = rs8Var.e;
                            if (avaVar != null) {
                                if (!avaVar.e || avaVar.g != 783) {
                                    avaVar.g = 783;
                                    avaVar.e = true;
                                    avaVar.k(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            rs8Var.a.a();
                            break;
                    }
                }
            });
            addView(this.y, qoe.d(-1, -1.0f, nm7.D1, 0.0f, -12.0f, 0.0f, 0.0f));
            vaVar.setEmptyView(this.y);
            LinearLayout linearLayout2 = this.E;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(leaVar.e.h() ? (byte) 0 : (byte) 8);
                return;
            }
            return;
        }
        this.y = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.E = null;
        this.r = new FrameLayout(getContext());
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        this.s = linearLayout3;
        linearLayout3.setOrientation(1);
        this.r.addView(this.s, qoe.e(-2, -2, 17));
        bf0 bf0Var = new bf0(getContext());
        bf0Var.setImageDrawable(new p09(R.raw.utyan_empty, gm.L(120.0f), gm.L(120.0f)));
        this.s.addView(bf0Var, qoe.t(nm7.E1, nm7.E1, 1, 0, 0, 0, 0));
        TextView textView3 = new TextView(getContext());
        this.w = textView3;
        textView3.setTextSize(1, 17.0f);
        this.w.setTypeface(gm.o());
        anb.X(this.w, cmb.F6, ylbVar);
        this.w.setText(jb6.M0(2131746402, null));
        this.s.addView(this.w, qoe.t(-2, -2, 1, 0, 12, 0, 0));
        TextView textView4 = new TextView(getContext());
        this.x = textView4;
        textView4.setTextSize(1, 14.0f);
        TextView textView5 = this.x;
        int i2 = cmb.Ei;
        anb.X(textView5, i2, ylbVar);
        this.x.setText(jb6.M0(2131746403, null));
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: js8
            public final /* synthetic */ rs8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b2 = r2;
                rs8 rs8Var = this.b;
                switch (b2) {
                    case 0:
                        ava avaVar = rs8Var.e;
                        if (avaVar != null) {
                            if (!avaVar.e || avaVar.g != 783) {
                                avaVar.g = 783;
                                avaVar.e = true;
                                avaVar.k(true);
                                break;
                            }
                        }
                        break;
                    default:
                        rs8Var.a.a();
                        break;
                }
            }
        });
        this.x.setPadding(gm.L(10.0f), gm.L(4.0f), gm.L(10.0f), gm.L(4.0f));
        anb.R(this.x, cmb.Y(cmb.p1(0.1f, cmb.v0(i2, ylbVar)), 4, 4), null, anb.K(0.1f, i2), ylbVar);
        rve.a(this.x);
        this.s.addView(this.x, qoe.t(-2, -2, 1, 0, 8, 0, 0));
        addView(this.r, qoe.e(-1, -1, nm7.D1));
        vaVar.setEmptyView(this.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReordering(boolean z) {
        va vaVar;
        if (this.h != z) {
            this.h = z;
            lea leaVar = this.a;
            leaVar.q(leaVar.g());
            byte b = 0;
            int i = 0;
            while (true) {
                vaVar = this.f;
                if (i >= vaVar.getChildCount()) {
                    break;
                }
                View childAt = vaVar.getChildAt(i);
                if (childAt instanceof ox4) {
                    ((ox4) childAt).e(z, true);
                }
                i++;
            }
            l7c l7cVar = vaVar.g3;
            if (l7cVar != null) {
                l7cVar.T();
            }
            if (z) {
                d S = LaunchActivity.S();
                if (S instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) S;
                    profileActivity.n3(false);
                    gm.c3(new gs8(profileActivity, b));
                }
            }
        }
    }

    public final /* synthetic */ void b() {
        setReordering(true);
    }

    public final /* synthetic */ void c() {
        setReordering(true);
    }

    public final /* synthetic */ void d() {
        setReordering(true);
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.I3 && objArr[1] == this.e) {
            f(true);
            if (this.e == null || !isAttachedToWindow()) {
                return;
            }
            va vaVar = this.f;
            if (vaVar.canScrollVertically(1)) {
                for (int i3 = 0; i3 < vaVar.getChildCount(); i3++) {
                    if (!(vaVar.getChildAt(i3) instanceof tk4)) {
                    }
                }
                return;
            }
            this.e.a();
        }
    }

    public final void e() {
        if (this.h) {
            ava avaVar = this.e;
            if (avaVar != null) {
                avaVar.p();
            }
            setReordering(false);
        }
    }

    public final void f(boolean z) {
        l7c l7cVar;
        va vaVar = this.f;
        if (vaVar == null || (l7cVar = vaVar.g3) == null) {
            return;
        }
        boolean canScrollVertically = vaVar.canScrollVertically(-1);
        l7cVar.O(z);
        if (canScrollVertically) {
            return;
        }
        vaVar.w0(0);
    }

    public final void g() {
        lea leaVar = this.a;
        setClipChildren(leaVar.M == 0);
        va vaVar = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vaVar.getLayoutParams();
        int i = marginLayoutParams.topMargin;
        int i2 = -leaVar.M;
        if (i != i2 || marginLayoutParams.bottomMargin != (-leaVar.N)) {
            marginLayoutParams.topMargin = i2;
            marginLayoutParams.bottomMargin = -leaVar.N;
            vaVar.setLayoutParams(marginLayoutParams);
        }
        vaVar.setPadding(gm.L(9.0f), leaVar.M + leaVar.L, gm.L(9.0f), gm.L(86.0f) + leaVar.N);
    }

    public float getTabsHeight() {
        va vaVar = this.f;
        float y = vaVar.getY();
        for (int i = 0; i < vaVar.getChildCount(); i++) {
            View childAt = vaVar.getChildAt(i);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof ox4) {
                if (R == 0) {
                    return Math.max(0.0f, childAt.getY() + y);
                }
            } else if (R == 0) {
                return Math.max(0.0f, (childAt.getAlpha() * childAt.getHeight()) + childAt.getY() + y);
            }
        }
        return 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.b).b(this, nm7.I3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.b).n(this, nm7.I3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setVisibleHeight(this.n);
    }

    public void setHasTabs(boolean z) {
        if (this.I == z) {
            return;
        }
        this.I = z;
        va vaVar = this.f;
        boolean canScrollVertically = vaVar.canScrollVertically(-1);
        vaVar.g3.O(true);
        if (!canScrollVertically) {
            vaVar.w0(0);
        }
        this.a.p();
    }

    public void setVisibleHeight(int i) {
        this.n = i;
        float l = Utilities.l(gm.x1(i, gm.L(150.0f), gm.L(220.0f)));
        float R1 = gm.R1(0.6f, 1.0f, l);
        LinearLayout linearLayout = this.s;
        if (linearLayout != null) {
            linearLayout.setAlpha(l);
            this.s.setScaleX(R1);
            this.s.setScaleY(R1);
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.n)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(l);
            this.E.setScaleX(R1);
            this.E.setScaleY(R1);
        }
        FrameLayout frameLayout2 = this.y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.n)) / 2.0f);
        }
    }
}
