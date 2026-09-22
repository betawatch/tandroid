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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.x5;
import w7.z5;
import yh.m5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class n2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final ci.d H;
    public boolean I;
    public final nr0 a;
    public final int b;
    public final e6 c;
    public boolean d;
    public m5 e;
    public final i2 f;
    public ah.n h;
    public boolean n;
    public int r;
    public final FrameLayout s;
    public final LinearLayout v;
    public final TextView w;
    public final TextView x;
    public final FrameLayout y;

    public n2(nr0 nr0Var, int i10, e6 e6Var) {
        super(nr0Var.getContext());
        this.r = AndroidUtilities.displaySize.y;
        Context context = nr0Var.getContext();
        this.a = nr0Var;
        this.b = i10;
        this.c = e6Var;
        i2 i2Var = new i2(context, i10, new hi.a(this, 17), new h2(this), new h2(this), e6Var, nr0Var);
        this.f = i2Var;
        i2Var.Y2.r = false;
        i2Var.setSelectorType(9);
        i2Var.setSelectorDrawableColor(0);
        i2Var.setPadding(AndroidUtilities.dp(9.0f), nr0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        i2Var.setClipToPadding(false);
        i2Var.setClipChildren(false);
        addView(i2Var, x5.e(-1, -1, 119));
        i2Var.j(new ii.m3(9, this, nr0Var));
        j2 j2Var = new j2(nr0Var);
        j2Var.m = false;
        j2Var.C = false;
        j2Var.o(qr.h);
        j2Var.n(350L);
        i2Var.setItemAnimator(j2Var);
        new s4.y(new k2(this, nr0Var)).e(i2Var);
        View view = this.s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.y;
        if (view2 != null) {
            removeView(view2);
        }
        if (nr0Var.d != this.e) {
            this.s = null;
            this.w = null;
            this.x = null;
            this.v = null;
            this.y = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.E = linearLayout;
            linearLayout.setOrientation(1);
            this.y.addView(this.E, x5.e(-2, -2, 17));
            TextView textView = new TextView(getContext());
            this.F = textView;
            textView.setTextSize(1, 20.0f);
            this.F.setTypeface(AndroidUtilities.bold());
            this.F.setTextColor(i6.v0(i6.G6, e6Var));
            this.F.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
            this.E.addView(this.F, x5.t(-2, -2, 1, 0, 0, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.G = textView2;
            textView2.setTextSize(1, 14.0f);
            this.G.setTextColor(i6.v0(i6.y6, e6Var));
            this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
            this.E.addView(this.G, x5.t(-2, -2, 1, 0, 10, 0, 0));
            ci.d dVar = new ci.d(getContext(), e6Var, true);
            this.H = dVar;
            dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
            this.E.addView(this.H, x5.t(200, 44, 1, 0, 19, 0, 12));
            final int i11 = 1;
            this.H.setOnClickListener(new View.OnClickListener(this) { // from class: xh.e2
                public final /* synthetic */ n2 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i11) {
                        case 0:
                            m5 m5Var = this.b.e;
                            if (m5Var != null) {
                                if (!m5Var.e || m5Var.g != 783) {
                                    m5Var.g = 783;
                                    m5Var.e = true;
                                    m5Var.i(true);
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
            addView(this.y, x5.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
            i2Var.setEmptyView(this.y);
            LinearLayout linearLayout2 = this.E;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(nr0Var.e.h() ? 0 : 8);
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
        this.s.addView(this.v, x5.e(-2, -2, 17));
        u9 u9Var = new u9(getContext());
        u9Var.setImageDrawable(new xi0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        this.v.addView(u9Var, x5.t(120, 120, 1, 0, 0, 0, 0));
        TextView textView3 = new TextView(getContext());
        this.w = textView3;
        textView3.setTextSize(1, 17.0f);
        this.w.setTypeface(AndroidUtilities.bold());
        this.w.setTextColor(i6.v0(i6.G6, e6Var));
        this.w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
        this.v.addView(this.w, x5.t(-2, -2, 1, 0, 12, 0, 0));
        TextView textView4 = new TextView(getContext());
        this.x = textView4;
        textView4.setTextSize(1, 14.0f);
        TextView textView5 = this.x;
        int i12 = i6.Oh;
        textView5.setTextColor(i6.v0(i12, e6Var));
        this.x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
        final int i13 = 0;
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: xh.e2
            public final /* synthetic */ n2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i13) {
                    case 0:
                        m5 m5Var = this.b.e;
                        if (m5Var != null) {
                            if (!m5Var.e || m5Var.g != 783) {
                                m5Var.g = 783;
                                m5Var.e = true;
                                m5Var.i(true);
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
        this.x.setBackground(i6.Y(i6.l1(0.1f, i6.v0(i12, e6Var)), 4, 4));
        z5.a(this.x);
        this.v.addView(this.x, x5.t(-2, -2, 1, 0, 8, 0, 0));
        addView(this.s, x5.e(-1, -1, 119));
        i2Var.setEmptyView(this.s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReordering(boolean z10) {
        i2 i2Var;
        if (this.n == z10) {
            return;
        }
        this.n = z10;
        nr0 nr0Var = this.a;
        nr0Var.p(nr0Var.g());
        int i10 = 0;
        while (true) {
            i2Var = this.f;
            if (i10 >= i2Var.getChildCount()) {
                break;
            }
            View childAt = i2Var.getChildAt(i10);
            if (childAt instanceof i1) {
                ((i1) childAt).d(z10, true);
            }
            i10++;
        }
        w51 w51Var = i2Var.Y2;
        if (w51Var != null) {
            w51Var.S();
        }
        if (z10) {
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new r1(profileActivity, 1));
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
            i2 i2Var = this.f;
            if (i2Var.canScrollVertically(1)) {
                for (int i12 = 0; i12 < i2Var.getChildCount(); i12++) {
                    if (!(i2Var.getChildAt(i12) instanceof t00)) {
                    }
                }
                return;
            }
            this.e.a();
        }
    }

    public final void e() {
        if (this.n) {
            m5 m5Var = this.e;
            if (m5Var != null) {
                m5Var.l();
            }
            setReordering(false);
        }
    }

    public final void f(boolean z10) {
        w51 w51Var;
        i2 i2Var = this.f;
        if (i2Var == null || (w51Var = i2Var.Y2) == null) {
            return;
        }
        boolean canScrollVertically = i2Var.canScrollVertically(-1);
        w51Var.N(z10);
        if (canScrollVertically) {
            return;
        }
        i2Var.u0(0);
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            i2 i2Var = this.f;
            if (i10 >= i2Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = i2Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof i1) {
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
        i2 i2Var = this.f;
        boolean canScrollVertically = i2Var.canScrollVertically(-1);
        i2Var.Y2.N(true);
        if (!canScrollVertically) {
            i2Var.u0(0);
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
