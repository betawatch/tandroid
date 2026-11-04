package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vm0 extends org.telegram.ui.ActionBar.d2 {
    public static final org.telegram.ui.Components.qp0 E = new org.telegram.ui.Components.qp0(4);
    public final sm0 a;
    public final sm0 b;
    public org.telegram.ui.ActionBar.q0 c;
    public org.telegram.ui.Components.jt d;
    public boolean e;
    public final Paint f;
    public ScrollSlidingTextTabStrip h;
    public final org.telegram.ui.ActionBar.x4[] n;
    public AnimatorSet r;
    public boolean s;
    public boolean w;
    public boolean x;
    public int y;

    public vm0(HashMap hashMap, ArrayList arrayList, int i3, boolean z10, wm wmVar) {
        super(null);
        this.e = true;
        this.f = new Paint();
        this.n = new org.telegram.ui.ActionBar.x4[2];
        this.a = new sm0(0, null, hashMap, arrayList, i3, z10, wmVar, false);
        this.b = new sm0(1, null, hashMap, arrayList, i3, z10, wmVar, false);
    }

    public static void l0(vm0 vm0Var, float f10) {
        vm0Var.actionBar.setTranslationY(f10);
        int i3 = 0;
        while (true) {
            org.telegram.ui.ActionBar.x4[] x4VarArr = vm0Var.n;
            if (i3 >= x4VarArr.length) {
                vm0Var.fragmentView.invalidate();
                return;
            } else {
                ((org.telegram.ui.Components.tj0) x4VarArr[i3].f).setPinnedSectionOffsetY((int) f10);
                i3++;
            }
        }
    }

    public static void m0(vm0 vm0Var, String str) {
        vm0Var.c.getSearchField().setText(str);
        vm0Var.c.getSearchField().setSelection(str.length());
        vm0Var.actionBar.z();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        sm0 sm0Var = this.a;
        if (sm0Var != null) {
            sm0Var.addThemeColorKeys(hashSet);
        }
        sm0 sm0Var2 = this.b;
        if (sm0Var2 != null) {
            sm0Var2.addThemeColorKeys(hashSet);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.x4[] x4VarArr;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i3 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.m(kVar, 5, i3, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i3, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.I5, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        int i10 = 0;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f10 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new hx(this, 26));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.q().a(0, R.drawable.outline_header_search);
        a10.N();
        a10.I = new lg.w1(this, 18);
        this.c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745771, null));
        EditTextBoldCursor searchField = this.c.getSearchField();
        org.telegram.ui.ActionBar.r6.V(searchField, i3, null);
        org.telegram.ui.ActionBar.r6.w(searchField, i3, null);
        org.telegram.ui.ActionBar.r6.E(searchField, org.telegram.ui.ActionBar.k6.Je, null);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.k6.Y9;
        int i12 = org.telegram.ui.ActionBar.k6.Z9;
        scrollSlidingTextTabStrip2.M = i11;
        scrollSlidingTextTabStrip2.N = i12;
        scrollSlidingTextTabStrip2.updateColors();
        this.actionBar.addView(this.h, b8.mf.e(-1, 44, 83));
        this.h.setDelegate(new tm0(this, i10));
        this.y = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        um0 um0Var = new um0(this, context);
        this.fragmentView = um0Var;
        um0Var.setWillNotDraw(false);
        sm0 sm0Var = this.a;
        sm0Var.setParentFragment(this);
        org.telegram.ui.Components.jt jtVar = sm0Var.e0;
        this.d = jtVar;
        jtVar.setSizeNotifierLayout(um0Var);
        int i13 = 0;
        while (i13 < 4) {
            View view = i13 != 0 ? i13 != 1 ? i13 != 2 ? sm0Var.d0 : sm0Var.c0 : sm0Var.b0 : sm0Var.a0;
            ((ViewGroup) view.getParent()).removeView(view);
            i13++;
        }
        FrameLayout frameLayout = sm0Var.a0;
        l0 l0Var = sm0Var.b0;
        org.telegram.ui.Components.voip.r0 r0Var = sm0Var.c0;
        View view2 = sm0Var.d0;
        org.telegram.ui.Components.jt jtVar2 = sm0Var.e0;
        sm0 sm0Var2 = this.b;
        sm0Var2.a0 = frameLayout;
        sm0Var2.b0 = l0Var;
        sm0Var2.e0 = jtVar2;
        sm0Var2.c0 = r0Var;
        sm0Var2.d0 = view2;
        sm0Var2.r0 = false;
        sm0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            x4VarArr = this.n;
            if (i14 >= x4VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.x4 x4Var = new org.telegram.ui.ActionBar.x4(this, context);
            x4VarArr[i14] = x4Var;
            float f11 = f10;
            um0Var.addView(x4Var, b8.mf.c(-1.0f, -1));
            if (i14 == 0) {
                org.telegram.ui.ActionBar.x4 x4Var2 = x4VarArr[i14];
                x4Var2.c = sm0Var;
                x4Var2.f = sm0Var.L;
            } else if (i14 == 1) {
                org.telegram.ui.ActionBar.x4 x4Var3 = x4VarArr[i14];
                x4Var3.c = sm0Var2;
                x4Var3.f = sm0Var2.L;
                x4Var3.setVisibility(8);
            }
            ((org.telegram.ui.Components.tj0) x4VarArr[i14].f).setScrollingTouchSlop(1);
            org.telegram.ui.ActionBar.x4 x4Var4 = x4VarArr[i14];
            x4Var4.d = (FrameLayout) ((org.telegram.ui.ActionBar.d2) x4Var4.c).getFragmentView();
            ((org.telegram.ui.Components.tj0) x4VarArr[i14].f).setClipToPadding(false);
            org.telegram.ui.ActionBar.x4 x4Var5 = x4VarArr[i14];
            x4Var5.e = ((org.telegram.ui.ActionBar.d2) x4Var5.c).getActionBar();
            org.telegram.ui.ActionBar.x4 x4Var6 = x4VarArr[i14];
            x4Var6.addView((FrameLayout) x4Var6.d, b8.mf.c(-1.0f, -1));
            org.telegram.ui.ActionBar.x4 x4Var7 = x4VarArr[i14];
            x4Var7.addView((org.telegram.ui.ActionBar.k) x4Var7.e, b8.mf.c(-2.0f, -1));
            ((org.telegram.ui.ActionBar.k) x4VarArr[i14].e).setVisibility(8);
            ((org.telegram.ui.Components.tj0) x4VarArr[i14].f).setOnScrollListener(new ai.i4(9, this, ((org.telegram.ui.Components.tj0) x4VarArr[i14].f).getOnScrollListener()));
            i14++;
            f10 = f11;
        }
        float f12 = f10;
        um0Var.addView(this.actionBar, b8.mf.c(-2.0f, -1));
        um0Var.addView(sm0Var.a0, b8.mf.e(-1, 48, 83));
        um0Var.addView(sm0Var.b0, b8.mf.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        um0Var.addView(sm0Var.c0, b8.mf.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, org.telegram.messenger.bd.M0(2131749278, null), null);
            this.h.a(1, org.telegram.messenger.bd.M0(2131750476, null), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                x4VarArr[0].b = currentTabId;
            }
            this.h.c();
        }
        o0(false);
        this.e = this.h.getCurrentTabId() == this.h.getFirstTabId();
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | TLObject.FLAG_13);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Je));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.j5));
        int i3 = org.telegram.ui.ActionBar.k6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.h.getSelectorDrawable()}, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void o0(boolean z10) {
        org.telegram.ui.ActionBar.x4[] x4VarArr;
        int i3 = 0;
        while (true) {
            x4VarArr = this.n;
            if (i3 >= x4VarArr.length) {
                break;
            }
            ((org.telegram.ui.Components.tj0) x4VarArr[i3].f).C0();
            i3++;
        }
        ((org.telegram.ui.Components.tj0) x4VarArr[z10 ? 1 : 0].f).getAdapter();
        ((org.telegram.ui.Components.tj0) x4VarArr[z10 ? 1 : 0].f).setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((u4.b0) ((org.telegram.ui.Components.tj0) x4VarArr[z10 ? 1 : 0].f).getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        sm0 sm0Var = this.a;
        if (sm0Var != null) {
            sm0Var.onConfigurationChanged(configuration);
        }
        sm0 sm0Var2 = this.b;
        if (sm0Var2 != null) {
            sm0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        sm0 sm0Var = this.a;
        if (sm0Var != null) {
            sm0Var.onFragmentDestroy();
        }
        sm0 sm0Var2 = this.b;
        if (sm0Var2 != null) {
            sm0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        sm0 sm0Var = this.a;
        if (sm0Var != null) {
            sm0Var.onPause();
        }
        sm0 sm0Var2 = this.b;
        if (sm0Var2 != null) {
            sm0Var2.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.q0 q0Var = this.c;
        if (q0Var != null) {
            q0Var.F(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        sm0 sm0Var = this.a;
        if (sm0Var != null) {
            sm0Var.onResume();
        }
        sm0 sm0Var2 = this.b;
        if (sm0Var2 != null) {
            sm0Var2.onResume();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.q0 q0Var = this.c;
            if (q0Var != null && q0Var.getSearchField() != null) {
                this.c.getSearchField().setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false));
            }
            if (this.fragmentView != null) {
                boolean z10 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false)) >= 0.721f;
                int systemUiVisibility = this.fragmentView.getSystemUiVisibility();
                int i3 = z10 ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193);
                if (i3 != systemUiVisibility) {
                    this.fragmentView.setSystemUiVisibility(i3);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            sm0 sm0Var = this.a;
            if (sm0Var != null && sm0Var.fragmentView != null) {
                sm0Var.onThemeColorsChanged();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        try {
            sm0 sm0Var2 = this.b;
            if (sm0Var2 == null || sm0Var2.fragmentView == null) {
                return;
            }
            sm0Var2.onThemeColorsChanged();
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
    }
}
