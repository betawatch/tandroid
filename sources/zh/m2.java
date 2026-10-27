package zh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.p8;
import bi.t9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class m2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final TextView E;
    public final TextView F;
    public final fi.d G;
    public boolean H;
    public final ws0 a;
    public final int b;
    public final u6 c;
    public boolean d;
    public t9 e;
    public final h2 f;
    public boolean h;
    public int n;
    public final FrameLayout r;
    public final LinearLayout s;
    public final TextView v;
    public final TextView w;
    public final FrameLayout x;
    public final LinearLayout y;

    public m2(ws0 ws0Var, int i10, u6 u6Var) {
        super(ws0Var.getContext());
        this.n = AndroidUtilities.displaySize.y;
        Context context = ws0Var.getContext();
        this.a = ws0Var;
        this.b = i10;
        this.c = u6Var;
        h2 h2Var = new h2(context, i10, new q0(this, 1), new g2(this), new g2(this), u6Var, ws0Var);
        this.f = h2Var;
        h2Var.g3.r = false;
        h2Var.setSelectorType(9);
        h2Var.setSelectorDrawableColor(0);
        h2Var.setClipToPadding(false);
        h2Var.setClipChildren(false);
        addView(h2Var, kb1.i(-1, -1, 119));
        g();
        h2Var.j(new ai.u0(10, this, ws0Var));
        i2 i2Var = new i2(ws0Var);
        i2Var.m = false;
        i2Var.C = false;
        i2Var.o(ds.h);
        i2Var.n(350L);
        h2Var.setItemAnimator(i2Var);
        new s4.z(new j2(this, ws0Var)).h(h2Var);
        View view = this.r;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.x;
        if (view2 != null) {
            removeView(view2);
        }
        if (ws0Var.d != this.e) {
            this.r = null;
            this.v = null;
            this.w = null;
            this.s = null;
            this.x = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.y = linearLayout;
            linearLayout.setOrientation(1);
            this.x.addView(this.y, kb1.i(-2, -2, 17));
            TextView textView = new TextView(getContext());
            this.E = textView;
            textView.setTextSize(1, 20.0f);
            this.E.setTypeface(AndroidUtilities.bold());
            f7.V(this.E, y6.G6, u6Var);
            this.E.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
            this.y.addView(this.E, kb1.x(-2, -2, 1, 0, 0, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.F = textView2;
            textView2.setTextSize(1, 14.0f);
            f7.V(this.F, y6.y6, u6Var);
            this.F.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
            this.y.addView(this.F, kb1.x(-2, -2, 1, 0, 10, 0, 0));
            fi.d dVar = new fi.d(getContext(), u6Var, true);
            this.G = dVar;
            dVar.i(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
            this.y.addView(this.G, kb1.x(200, 44, 1, 0, 19, 0, 12));
            final int i11 = 1;
            this.G.setOnClickListener(new View.OnClickListener(this) { // from class: zh.d2
                public final /* synthetic */ m2 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i11) {
                        case 0:
                            t9 t9Var = this.b.e;
                            if (t9Var != null) {
                                if (!t9Var.e || t9Var.g != 783) {
                                    t9Var.g = 783;
                                    t9Var.e = true;
                                    t9Var.j(true);
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
            addView(this.x, kb1.h(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
            h2Var.setEmptyView(this.x);
            LinearLayout linearLayout2 = this.y;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(ws0Var.e.h() ? 0 : 8);
                return;
            }
            return;
        }
        this.x = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.y = null;
        this.r = new FrameLayout(getContext());
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        this.s = linearLayout3;
        linearLayout3.setOrientation(1);
        this.r.addView(this.s, kb1.i(-2, -2, 17));
        y9 y9Var = new y9(getContext());
        y9Var.setImageDrawable(new yj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        this.s.addView(y9Var, kb1.x(120, 120, 1, 0, 0, 0, 0));
        TextView textView3 = new TextView(getContext());
        this.v = textView3;
        textView3.setTextSize(1, 17.0f);
        this.v.setTypeface(AndroidUtilities.bold());
        f7.V(this.v, y6.G6, u6Var);
        this.v.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
        this.s.addView(this.v, kb1.x(-2, -2, 1, 0, 12, 0, 0));
        TextView textView4 = new TextView(getContext());
        this.w = textView4;
        textView4.setTextSize(1, 14.0f);
        TextView textView5 = this.w;
        int i12 = y6.Oh;
        f7.V(textView5, i12, u6Var);
        this.w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
        final int i13 = 0;
        this.w.setOnClickListener(new View.OnClickListener(this) { // from class: zh.d2
            public final /* synthetic */ m2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i13) {
                    case 0:
                        t9 t9Var = this.b.e;
                        if (t9Var != null) {
                            if (!t9Var.e || t9Var.g != 783) {
                                t9Var.g = 783;
                                t9Var.e = true;
                                t9Var.j(true);
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
        this.w.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
        f7.R(this.w, y6.Z(y6.o1(0.1f, y6.w0(i12, u6Var)), 4, 4), null, f7.L(0.1f, i12), u6Var);
        kb1.b(this.w);
        this.s.addView(this.w, kb1.x(-2, -2, 1, 0, 8, 0, 0));
        addView(this.r, kb1.i(-1, -1, 119));
        h2Var.setEmptyView(this.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReordering(boolean z10) {
        h2 h2Var;
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        ws0 ws0Var = this.a;
        ws0Var.q(ws0Var.g());
        int i10 = 0;
        while (true) {
            h2Var = this.f;
            if (i10 >= h2Var.getChildCount()) {
                break;
            }
            View childAt = h2Var.getChildAt(i10);
            if (childAt instanceof g1) {
                ((g1) childAt).e(z10, true);
            }
            i10++;
        }
        k71 k71Var = h2Var.g3;
        if (k71Var != null) {
            k71Var.T();
        }
        if (z10) {
            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.O4(false);
                AndroidUtilities.runOnUIThread(new p8(profileActivity, 2));
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
            h2 h2Var = this.f;
            if (h2Var.canScrollVertically(1)) {
                for (int i12 = 0; i12 < h2Var.getChildCount(); i12++) {
                    if (!(h2Var.getChildAt(i12) instanceof c10)) {
                    }
                }
                return;
            }
            this.e.b();
        }
    }

    public final void e() {
        if (this.h) {
            t9 t9Var = this.e;
            if (t9Var != null) {
                t9Var.n();
            }
            setReordering(false);
        }
    }

    public final void f(boolean z10) {
        k71 k71Var;
        h2 h2Var = this.f;
        if (h2Var == null || (k71Var = h2Var.g3) == null) {
            return;
        }
        boolean canScrollVertically = h2Var.canScrollVertically(-1);
        k71Var.O(z10);
        if (canScrollVertically) {
            return;
        }
        h2Var.v0(0);
    }

    public final void g() {
        ws0 ws0Var = this.a;
        setClipChildren(ws0Var.L == 0);
        h2 h2Var = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) h2Var.getLayoutParams();
        int i10 = marginLayoutParams.topMargin;
        int i11 = -ws0Var.L;
        if (i10 != i11 || marginLayoutParams.bottomMargin != (-ws0Var.M)) {
            marginLayoutParams.topMargin = i11;
            marginLayoutParams.bottomMargin = -ws0Var.M;
            h2Var.setLayoutParams(marginLayoutParams);
        }
        h2Var.setPadding(AndroidUtilities.dp(9.0f), ws0Var.L + ws0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f) + ws0Var.M);
    }

    public float getTabsHeight() {
        h2 h2Var = this.f;
        float y3 = h2Var.getY();
        for (int i10 = 0; i10 < h2Var.getChildCount(); i10++) {
            View childAt = h2Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof g1) {
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
        NotificationCenter.getInstance(this.b).addWeakObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
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
        h2 h2Var = this.f;
        boolean canScrollVertically = h2Var.canScrollVertically(-1);
        h2Var.g3.O(true);
        if (!canScrollVertically) {
            h2Var.v0(0);
        }
        this.a.p();
    }

    public void setVisibleHeight(int i10) {
        this.n = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.s;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.s.setScaleX(lerp);
            this.s.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.n)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.y;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.y.setScaleX(lerp);
            this.y.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.x;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.n)) / 2.0f);
        }
    }
}
