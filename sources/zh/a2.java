package zh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.v9;
import bi.w8;
import c8.ha;
import c8.ka;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class a2 extends FrameLayout implements ls {
    public final LinearLayout D;
    public final TextView E;
    public final TextView F;
    public final fi.d G;
    public boolean H;
    public final up0 a;
    public final int b;
    public final f6 c;
    public boolean d;
    public v9 e;
    public final fi.w3 f;
    public boolean h;
    public int n;
    public final FrameLayout r;
    public final LinearLayout s;
    public final TextView w;
    public final TextView x;
    public final FrameLayout y;

    public a2(up0 up0Var, int i7, f6 f6Var) {
        super(up0Var.getContext());
        this.n = org.telegram.messenger.g0.q.y;
        Context context = up0Var.getContext();
        this.a = up0Var;
        this.b = i7;
        this.c = f6Var;
        final int i10 = 1;
        fi.w3 w3Var = new fi.w3(context, i7, new q0(this, i10), new v1(this), new v1(this), f6Var, up0Var);
        this.f = w3Var;
        w3Var.f3.r = false;
        w3Var.setSelectorType(9);
        w3Var.setSelectorDrawableColor(0);
        w3Var.setClipToPadding(false);
        w3Var.setClipChildren(false);
        addView(w3Var, ha.e(-1, -1, qs.E1));
        g();
        w3Var.j(new ai.o0(11, this, up0Var));
        w1 w1Var = new w1(up0Var);
        w1Var.m = false;
        w1Var.C = false;
        w1Var.o(xq.h);
        w1Var.n(350L);
        w3Var.setItemAnimator(w1Var);
        new v4.y(new x1(this, up0Var)).h(w3Var);
        View view = this.r;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.y;
        if (view2 != null) {
            removeView(view2);
        }
        if (up0Var.d != this.e) {
            this.r = null;
            this.w = null;
            this.x = null;
            this.s = null;
            this.y = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.D = linearLayout;
            linearLayout.setOrientation(1);
            this.y.addView(this.D, ha.e(-2, -2, 17));
            TextView textView = new TextView(getContext());
            this.E = textView;
            textView.setTextSize(1, 20.0f);
            this.E.setTypeface(org.telegram.messenger.g0.o());
            r6.V(this.E, k6.G6, f6Var);
            this.E.setText(hd.M0(2131750244, null));
            this.D.addView(this.E, ha.t(-2, -2, 1, 0, 0, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.F = textView2;
            textView2.setTextSize(1, 14.0f);
            r6.V(this.F, k6.y6, f6Var);
            this.F.setText(hd.M0(2131750245, null));
            this.D.addView(this.F, ha.t(-2, -2, 1, 0, 10, 0, 0));
            fi.d dVar = new fi.d(getContext(), f6Var, true);
            this.G = dVar;
            dVar.i(hd.M0(2131750246, null), false, true);
            this.D.addView(this.G, ha.t(qs.e3, 44, 1, 0, 19, 0, 12));
            this.G.setOnClickListener(new View.OnClickListener(this) { // from class: zh.s1
                public final /* synthetic */ a2 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i10) {
                        case 0:
                            v9 v9Var = this.b.e;
                            if (v9Var != null) {
                                if (!v9Var.e || v9Var.g != 783) {
                                    v9Var.g = 783;
                                    v9Var.e = true;
                                    v9Var.j(true);
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
            addView(this.y, ha.d(-1, -1.0f, qs.E1, 0.0f, -12.0f, 0.0f, 0.0f));
            w3Var.setEmptyView(this.y);
            LinearLayout linearLayout2 = this.D;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(up0Var.e.h() ? 0 : 8);
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
        this.r.addView(this.s, ha.e(-2, -2, 17));
        l9 l9Var = new l9(getContext());
        l9Var.setImageDrawable(new zg0(R.raw.utyan_empty, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        this.s.addView(l9Var, ha.t(120, 120, 1, 0, 0, 0, 0));
        TextView textView3 = new TextView(getContext());
        this.w = textView3;
        textView3.setTextSize(1, 17.0f);
        this.w.setTypeface(org.telegram.messenger.g0.o());
        r6.V(this.w, k6.G6, f6Var);
        this.w.setText(hd.M0(2131746668, null));
        this.s.addView(this.w, ha.t(-2, -2, 1, 0, 12, 0, 0));
        TextView textView4 = new TextView(getContext());
        this.x = textView4;
        textView4.setTextSize(1, 14.0f);
        TextView textView5 = this.x;
        int i11 = k6.Ci;
        r6.V(textView5, i11, f6Var);
        this.x.setText(hd.M0(2131746669, null));
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: zh.s1
            public final /* synthetic */ a2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        v9 v9Var = this.b.e;
                        if (v9Var != null) {
                            if (!v9Var.e || v9Var.g != 783) {
                                v9Var.g = 783;
                                v9Var.e = true;
                                v9Var.j(true);
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
        this.x.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f));
        r6.R(this.x, k6.a0(k6.r1(0.1f, k6.w0(i11, f6Var)), 4, 4), null, r6.L(0.1f, i11), f6Var);
        ka.a(this.x);
        this.s.addView(this.x, ha.t(-2, -2, 1, 0, 8, 0, 0));
        addView(this.r, ha.e(-1, -1, qs.E1));
        w3Var.setEmptyView(this.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReordering(boolean z9) {
        fi.w3 w3Var;
        if (this.h == z9) {
            return;
        }
        this.h = z9;
        up0 up0Var = this.a;
        up0Var.q(up0Var.g());
        int i7 = 0;
        while (true) {
            w3Var = this.f;
            if (i7 >= w3Var.getChildCount()) {
                break;
            }
            View childAt = w3Var.getChildAt(i7);
            if (childAt instanceof z0) {
                ((z0) childAt).e(z9, true);
            }
            i7++;
        }
        l41 l41Var = w3Var.f3;
        if (l41Var != null) {
            l41Var.T();
        }
        if (z9) {
            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            if (T instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) T;
                profileActivity.U4(false);
                org.telegram.messenger.g0.h3(new w8(profileActivity, 2));
            }
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.G3 && objArr[1] == this.e) {
            f(true);
            if (this.e == null || !isAttachedToWindow()) {
                return;
            }
            fi.w3 w3Var = this.f;
            if (w3Var.canScrollVertically(1)) {
                for (int i11 = 0; i11 < w3Var.getChildCount(); i11++) {
                    if (!(w3Var.getChildAt(i11) instanceof lz)) {
                    }
                }
                return;
            }
            this.e.a();
        }
    }

    public final void e() {
        if (this.h) {
            v9 v9Var = this.e;
            if (v9Var != null) {
                v9Var.n();
            }
            setReordering(false);
        }
    }

    public final void f(boolean z9) {
        l41 l41Var;
        fi.w3 w3Var = this.f;
        if (w3Var == null || (l41Var = w3Var.f3) == null) {
            return;
        }
        boolean canScrollVertically = w3Var.canScrollVertically(-1);
        l41Var.O(z9);
        if (canScrollVertically) {
            return;
        }
        w3Var.v0(0);
    }

    public final void g() {
        up0 up0Var = this.a;
        setClipChildren(up0Var.L == 0);
        fi.w3 w3Var = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) w3Var.getLayoutParams();
        int i7 = marginLayoutParams.topMargin;
        int i10 = -up0Var.L;
        if (i7 != i10 || marginLayoutParams.bottomMargin != (-up0Var.M)) {
            marginLayoutParams.topMargin = i10;
            marginLayoutParams.bottomMargin = -up0Var.M;
            w3Var.setLayoutParams(marginLayoutParams);
        }
        w3Var.setPadding(org.telegram.messenger.g0.L(9.0f), up0Var.L + up0Var.K, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(86.0f) + up0Var.M);
    }

    public float getTabsHeight() {
        fi.w3 w3Var = this.f;
        float y10 = w3Var.getY();
        for (int i7 = 0; i7 < w3Var.getChildCount(); i7++) {
            View childAt = w3Var.getChildAt(i7);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof z0) {
                if (R == 0) {
                    return Math.max(0.0f, childAt.getY() + y10);
                }
            } else if (R == 0) {
                return Math.max(0.0f, (childAt.getAlpha() * childAt.getHeight()) + childAt.getY() + y10);
            }
        }
        return 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.b).c(this, qs.G3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.b).n(this, qs.G3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        setVisibleHeight(this.n);
    }

    public void setHasTabs(boolean z9) {
        if (this.H == z9) {
            return;
        }
        this.H = z9;
        fi.w3 w3Var = this.f;
        boolean canScrollVertically = w3Var.canScrollVertically(-1);
        w3Var.f3.O(true);
        if (!canScrollVertically) {
            w3Var.v0(0);
        }
        this.a.p();
    }

    public void setVisibleHeight(int i7) {
        this.n = i7;
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(i7, org.telegram.messenger.g0.L(150.0f), org.telegram.messenger.g0.L(220.0f)));
        float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, l10);
        LinearLayout linearLayout = this.s;
        if (linearLayout != null) {
            linearLayout.setAlpha(l10);
            this.s.setScaleX(T1);
            this.s.setScaleY(T1);
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.n)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.D;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(l10);
            this.D.setScaleX(T1);
            this.D.setScaleY(T1);
        }
        FrameLayout frameLayout2 = this.y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.n)) / 2.0f);
        }
    }
}
