package yh;

import ai.t8;
import ai.y9;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class l2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final ei.d H;
    public boolean I;
    public final ns0 a;
    public final int b;
    public final g6 c;
    public boolean d;
    public y9 e;
    public final g2 f;
    public bh.l h;
    public boolean n;
    public int r;
    public final FrameLayout s;
    public final LinearLayout v;
    public final TextView w;
    public final TextView x;
    public final FrameLayout y;

    public l2(ns0 ns0Var, int i10, g6 g6Var) {
        super(ns0Var.getContext());
        this.r = AndroidUtilities.displaySize.y;
        Context context = ns0Var.getContext();
        this.a = ns0Var;
        this.b = i10;
        this.c = g6Var;
        g2 g2Var = new g2(context, i10, new hg.o(this, 28), new f2(this), new f2(this), g6Var, ns0Var);
        this.f = g2Var;
        g2Var.Z2.r = false;
        g2Var.setSelectorType(9);
        g2Var.setSelectorDrawableColor(0);
        g2Var.setPadding(AndroidUtilities.dp(9.0f), ns0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        g2Var.setClipToPadding(false);
        g2Var.setClipChildren(false);
        addView(g2Var, z5.e(-1, -1, 119));
        g2Var.j(new ki.m3(9, this, ns0Var));
        h2 h2Var = new h2(ns0Var);
        h2Var.m = false;
        h2Var.C = false;
        h2Var.o(bs.h);
        h2Var.n(350L);
        g2Var.setItemAnimator(h2Var);
        new s4.y(new i2(this, ns0Var)).d(g2Var);
        View view = this.s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.y;
        if (view2 != null) {
            removeView(view2);
        }
        if (ns0Var.d != this.e) {
            this.s = null;
            this.w = null;
            this.x = null;
            this.v = null;
            this.y = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.E = linearLayout;
            linearLayout.setOrientation(1);
            this.y.addView(this.E, z5.e(-2, -2, 17));
            TextView textView = new TextView(getContext());
            this.F = textView;
            textView.setTextSize(1, 20.0f);
            this.F.setTypeface(AndroidUtilities.bold());
            r6.W(this.F, k6.G6, g6Var);
            this.F.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
            this.E.addView(this.F, z5.t(-2, -2, 1, 0, 0, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.G = textView2;
            textView2.setTextSize(1, 14.0f);
            r6.W(this.G, k6.y6, g6Var);
            this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
            this.E.addView(this.G, z5.t(-2, -2, 1, 0, 10, 0, 0));
            ei.d dVar = new ei.d(getContext(), g6Var, true);
            this.H = dVar;
            dVar.i(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
            this.E.addView(this.H, z5.t(200, 44, 1, 0, 19, 0, 12));
            final int i11 = 1;
            this.H.setOnClickListener(new View.OnClickListener(this) { // from class: yh.c2
                public final /* synthetic */ l2 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i11) {
                        case 0:
                            y9 y9Var = this.b.e;
                            if (y9Var != null) {
                                if (!y9Var.e || y9Var.g != 783) {
                                    y9Var.g = 783;
                                    y9Var.e = true;
                                    y9Var.j(true);
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
            addView(this.y, z5.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
            g2Var.setEmptyView(this.y);
            LinearLayout linearLayout2 = this.E;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(ns0Var.e.h() ? 0 : 8);
                return;
            }
            return;
        }
        this.y = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.E = null;
        this.s = new FrameLayout(getContext());
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        this.v = linearLayout3;
        linearLayout3.setOrientation(1);
        this.s.addView(this.v, z5.e(-2, -2, 17));
        w9 w9Var = new w9(getContext());
        w9Var.setImageDrawable(new yj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        this.v.addView(w9Var, z5.t(120, 120, 1, 0, 0, 0, 0));
        TextView textView3 = new TextView(getContext());
        this.w = textView3;
        textView3.setTextSize(1, 17.0f);
        this.w.setTypeface(AndroidUtilities.bold());
        r6.W(this.w, k6.G6, g6Var);
        this.w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
        this.v.addView(this.w, z5.t(-2, -2, 1, 0, 12, 0, 0));
        TextView textView4 = new TextView(getContext());
        this.x = textView4;
        textView4.setTextSize(1, 14.0f);
        TextView textView5 = this.x;
        int i12 = k6.Oh;
        r6.W(textView5, i12, g6Var);
        this.x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
        final int i13 = 0;
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: yh.c2
            public final /* synthetic */ l2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i13) {
                    case 0:
                        y9 y9Var = this.b.e;
                        if (y9Var != null) {
                            if (!y9Var.e || y9Var.g != 783) {
                                y9Var.g = 783;
                                y9Var.e = true;
                                y9Var.j(true);
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
        this.x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
        r6.S(this.x, k6.Z(k6.o1(0.1f, k6.w0(i12, g6Var)), 4, 4), null, r6.M(0.1f, i12), g6Var);
        b6.a(this.x);
        this.v.addView(this.x, z5.t(-2, -2, 1, 0, 8, 0, 0));
        addView(this.s, z5.e(-1, -1, 119));
        g2Var.setEmptyView(this.s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReordering(boolean z10) {
        g2 g2Var;
        if (this.n == z10) {
            return;
        }
        this.n = z10;
        ns0 ns0Var = this.a;
        ns0Var.p(ns0Var.g());
        int i10 = 0;
        while (true) {
            g2Var = this.f;
            if (i10 >= g2Var.getChildCount()) {
                break;
            }
            View childAt = g2Var.getChildAt(i10);
            if (childAt instanceof g1) {
                ((g1) childAt).e(z10, true);
            }
            i10++;
        }
        b71 b71Var = g2Var.Z2;
        if (b71Var != null) {
            b71Var.S();
        }
        if (z10) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.I4(false);
                AndroidUtilities.runOnUIThread(new t8(profileActivity, 2));
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.e) {
            f(true);
            if (this.e == null || !isAttachedToWindow()) {
                return;
            }
            g2 g2Var = this.f;
            if (g2Var.canScrollVertically(1)) {
                for (int i12 = 0; i12 < g2Var.getChildCount(); i12++) {
                    if (!(g2Var.getChildAt(i12) instanceof b10)) {
                    }
                }
                return;
            }
            this.e.a();
        }
    }

    public final void e() {
        if (this.n) {
            y9 y9Var = this.e;
            if (y9Var != null) {
                y9Var.n();
            }
            setReordering(false);
        }
    }

    public final void f(boolean z10) {
        b71 b71Var;
        g2 g2Var = this.f;
        if (g2Var == null || (b71Var = g2Var.Z2) == null) {
            return;
        }
        boolean canScrollVertically = g2Var.canScrollVertically(-1);
        b71Var.N(z10);
        if (canScrollVertically) {
            return;
        }
        g2Var.u0(0);
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            g2 g2Var = this.f;
            if (i10 >= g2Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = g2Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof g1) {
                if (R == 0) {
                    return Math.max(0.0f, childAt.getY());
                }
            } else if (R == 0) {
                return Math.max(0.0f, (childAt.getAlpha() * childAt.getHeight()) + childAt.getY());
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        g2 g2Var = this.f;
        boolean canScrollVertically = g2Var.canScrollVertically(-1);
        g2Var.Z2.N(true);
        if (!canScrollVertically) {
            g2Var.u0(0);
        }
        this.a.o();
    }

    public void setVisibleHeight(int i10) {
        this.r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.r)) / 2.0f);
        }
    }
}
