package xh;

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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.a6;
import w7.y5;
import yh.k5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class o2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final ci.d H;
    public boolean I;
    public final zr0 a;
    public final int b;
    public final d6 c;
    public boolean d;
    public k5 e;
    public final j2 f;
    public ah.n h;
    public boolean n;
    public int r;
    public final FrameLayout s;
    public final LinearLayout v;
    public final TextView w;
    public final TextView x;
    public final FrameLayout y;

    public o2(zr0 zr0Var, int i10, d6 d6Var) {
        super(zr0Var.getContext());
        this.r = AndroidUtilities.displaySize.y;
        Context context = zr0Var.getContext();
        this.a = zr0Var;
        this.b = i10;
        this.c = d6Var;
        j2 j2Var = new j2(context, i10, new hi.a(this, 17), new i2(this), new i2(this), d6Var, zr0Var);
        this.f = j2Var;
        j2Var.Y2.r = false;
        j2Var.setSelectorType(9);
        j2Var.setSelectorDrawableColor(0);
        j2Var.setPadding(AndroidUtilities.dp(9.0f), zr0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        j2Var.setClipToPadding(false);
        j2Var.setClipChildren(false);
        addView(j2Var, y5.e(-1, -1, 119));
        j2Var.j(new ii.n3(9, this, zr0Var));
        k2 k2Var = new k2(zr0Var);
        k2Var.m = false;
        k2Var.C = false;
        k2Var.o(rr.h);
        k2Var.n(350L);
        j2Var.setItemAnimator(k2Var);
        new s4.y(new l2(this, zr0Var)).e(j2Var);
        View view = this.s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.y;
        if (view2 != null) {
            removeView(view2);
        }
        if (zr0Var.d != this.e) {
            this.s = null;
            this.w = null;
            this.x = null;
            this.v = null;
            this.y = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.E = linearLayout;
            linearLayout.setOrientation(1);
            this.y.addView(this.E, y5.e(-2, -2, 17));
            TextView textView = new TextView(getContext());
            this.F = textView;
            textView.setTextSize(1, 20.0f);
            this.F.setTypeface(AndroidUtilities.bold());
            this.F.setTextColor(h6.v0(h6.G6, d6Var));
            this.F.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
            this.E.addView(this.F, y5.t(-2, -2, 1, 0, 0, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.G = textView2;
            textView2.setTextSize(1, 14.0f);
            this.G.setTextColor(h6.v0(h6.y6, d6Var));
            this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
            this.E.addView(this.G, y5.t(-2, -2, 1, 0, 10, 0, 0));
            ci.d dVar = new ci.d(getContext(), d6Var, true);
            this.H = dVar;
            dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
            this.E.addView(this.H, y5.t(200, 44, 1, 0, 19, 0, 12));
            final int i11 = 1;
            this.H.setOnClickListener(new View.OnClickListener(this) { // from class: xh.f2
                public final /* synthetic */ o2 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i11) {
                        case 0:
                            k5 k5Var = this.b.e;
                            if (k5Var != null) {
                                if (!k5Var.e || k5Var.g != 783) {
                                    k5Var.g = 783;
                                    k5Var.e = true;
                                    k5Var.i(true);
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
            addView(this.y, y5.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
            j2Var.setEmptyView(this.y);
            LinearLayout linearLayout2 = this.E;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(zr0Var.e.h() ? 0 : 8);
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
        this.s.addView(this.v, y5.e(-2, -2, 17));
        w9 w9Var = new w9(getContext());
        w9Var.setImageDrawable(new ij0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        this.v.addView(w9Var, y5.t(120, 120, 1, 0, 0, 0, 0));
        TextView textView3 = new TextView(getContext());
        this.w = textView3;
        textView3.setTextSize(1, 17.0f);
        this.w.setTypeface(AndroidUtilities.bold());
        this.w.setTextColor(h6.v0(h6.G6, d6Var));
        this.w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
        this.v.addView(this.w, y5.t(-2, -2, 1, 0, 12, 0, 0));
        TextView textView4 = new TextView(getContext());
        this.x = textView4;
        textView4.setTextSize(1, 14.0f);
        TextView textView5 = this.x;
        int i12 = h6.Oh;
        textView5.setTextColor(h6.v0(i12, d6Var));
        this.x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
        final int i13 = 0;
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: xh.f2
            public final /* synthetic */ o2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i13) {
                    case 0:
                        k5 k5Var = this.b.e;
                        if (k5Var != null) {
                            if (!k5Var.e || k5Var.g != 783) {
                                k5Var.g = 783;
                                k5Var.e = true;
                                k5Var.i(true);
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
        this.x.setBackground(h6.Y(h6.l1(0.1f, h6.v0(i12, d6Var)), 4, 4));
        a6.a(this.x);
        this.v.addView(this.x, y5.t(-2, -2, 1, 0, 8, 0, 0));
        addView(this.s, y5.e(-1, -1, 119));
        j2Var.setEmptyView(this.s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReordering(boolean z10) {
        j2 j2Var;
        if (this.n == z10) {
            return;
        }
        this.n = z10;
        zr0 zr0Var = this.a;
        zr0Var.p(zr0Var.g());
        int i10 = 0;
        while (true) {
            j2Var = this.f;
            if (i10 >= j2Var.getChildCount()) {
                break;
            }
            View childAt = j2Var.getChildAt(i10);
            if (childAt instanceof j1) {
                ((j1) childAt).d(z10, true);
            }
            i10++;
        }
        j61 j61Var = j2Var.Y2;
        if (j61Var != null) {
            j61Var.S();
        }
        if (z10) {
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new s1(profileActivity, 1));
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
            j2 j2Var = this.f;
            if (j2Var.canScrollVertically(1)) {
                for (int i12 = 0; i12 < j2Var.getChildCount(); i12++) {
                    if (!(j2Var.getChildAt(i12) instanceof u00)) {
                    }
                }
                return;
            }
            this.e.a();
        }
    }

    public final void e() {
        if (this.n) {
            k5 k5Var = this.e;
            if (k5Var != null) {
                k5Var.l();
            }
            setReordering(false);
        }
    }

    public final void f(boolean z10) {
        j61 j61Var;
        j2 j2Var = this.f;
        if (j2Var == null || (j61Var = j2Var.Y2) == null) {
            return;
        }
        boolean canScrollVertically = j2Var.canScrollVertically(-1);
        j61Var.N(z10);
        if (canScrollVertically) {
            return;
        }
        j2Var.u0(0);
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            j2 j2Var = this.f;
            if (i10 >= j2Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = j2Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof j1) {
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
        j2 j2Var = this.f;
        boolean canScrollVertically = j2Var.canScrollVertically(-1);
        j2Var.Y2.N(true);
        if (!canScrollVertically) {
            j2Var.u0(0);
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
