package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class yq0 extends org.telegram.ui.ActionBar.m2 {
    public static final org.telegram.ui.Components.ur0 y = new org.telegram.ui.Components.ur0(4);
    public final tq0 a;
    public final tq0 b;
    public org.telegram.ui.ActionBar.u0 c;
    public org.telegram.ui.Components.ku d;
    public boolean e;
    public final Paint f;
    public ScrollSlidingTextTabStrip h;
    public final wq0[] n;
    public AnimatorSet r;
    public boolean s;
    public boolean v;
    public boolean w;
    public int x;

    public yq0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, wn wnVar) {
        super(null);
        this.e = true;
        this.f = new Paint();
        this.n = new wq0[2];
        this.a = new tq0(0, null, hashMap, arrayList, i10, z10, wnVar, false);
        this.b = new tq0(1, null, hashMap, arrayList, i10, z10, wnVar, false);
    }

    public static void g0(yq0 yq0Var, float f7) {
        yq0Var.actionBar.setTranslationY(f7);
        int i10 = 0;
        while (true) {
            wq0[] wq0VarArr = yq0Var.n;
            if (i10 >= wq0VarArr.length) {
                yq0Var.fragmentView.invalidate();
                return;
            } else {
                wq0VarArr[i10].d.setPinnedSectionOffsetY((int) f7);
                i10++;
            }
        }
    }

    public static void h0(yq0 yq0Var, String str) {
        yq0Var.c.getSearchField().setText(str);
        yq0Var.c.getSearchField().setSelection(str.length());
        yq0Var.actionBar.w();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        wq0[] wq0VarArr;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.h5, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.j5;
        kVar.setTitleColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.actionBar.B(org.telegram.ui.ActionBar.h6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 16));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 14);
        this.c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.c.getSearchField();
        searchField.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        searchField.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Vd, false));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.h6.Y9;
        int i12 = org.telegram.ui.ActionBar.h6.Z9;
        scrollSlidingTextTabStrip2.L = i11;
        scrollSlidingTextTabStrip2.M = i12;
        scrollSlidingTextTabStrip2.e();
        this.actionBar.addView(this.h, w7.y5.e(-1, 44, 83));
        this.h.setDelegate(new uq0(this));
        this.x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        vq0 vq0Var = new vq0(this, context);
        this.fragmentView = vq0Var;
        vq0Var.setWillNotDraw(false);
        tq0 tq0Var = this.a;
        tq0Var.setParentFragment(this);
        org.telegram.ui.Components.ku kuVar = tq0Var.d0;
        this.d = kuVar;
        kuVar.setSizeNotifierLayout(vq0Var);
        int i13 = 0;
        while (i13 < 4) {
            View view = i13 != 0 ? i13 != 1 ? i13 != 2 ? tq0Var.c0 : tq0Var.b0 : tq0Var.a0 : tq0Var.Z;
            ((ViewGroup) view.getParent()).removeView(view);
            i13++;
        }
        FrameLayout frameLayout = tq0Var.Z;
        k0 k0Var = tq0Var.a0;
        n50 n50Var = tq0Var.b0;
        View view2 = tq0Var.c0;
        org.telegram.ui.Components.ku kuVar2 = tq0Var.d0;
        tq0 tq0Var2 = this.b;
        tq0Var2.Z = frameLayout;
        tq0Var2.a0 = k0Var;
        tq0Var2.d0 = kuVar2;
        tq0Var2.b0 = n50Var;
        tq0Var2.c0 = view2;
        tq0Var2.q0 = false;
        tq0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            wq0VarArr = this.n;
            if (i14 >= wq0VarArr.length) {
                break;
            }
            wq0 wq0Var = new wq0(this, context);
            wq0VarArr[i14] = wq0Var;
            vq0Var.addView(wq0Var, w7.y5.c(-1.0f, -1));
            if (i14 == 0) {
                wq0 wq0Var2 = wq0VarArr[i14];
                wq0Var2.a = tq0Var;
                wq0Var2.d = tq0Var.K;
            } else if (i14 == 1) {
                wq0 wq0Var3 = wq0VarArr[i14];
                wq0Var3.a = tq0Var2;
                wq0Var3.d = tq0Var2.K;
                wq0Var3.setVisibility(8);
            }
            wq0VarArr[i14].d.setScrollingTouchSlop(1);
            wq0 wq0Var4 = wq0VarArr[i14];
            wq0Var4.b = (FrameLayout) wq0Var4.a.getFragmentView();
            wq0VarArr[i14].d.setClipToPadding(false);
            wq0 wq0Var5 = wq0VarArr[i14];
            wq0Var5.c = wq0Var5.a.getActionBar();
            wq0 wq0Var6 = wq0VarArr[i14];
            wq0Var6.addView(wq0Var6.b, w7.y5.c(-1.0f, -1));
            wq0 wq0Var7 = wq0VarArr[i14];
            wq0Var7.addView(wq0Var7.c, w7.y5.c(-2.0f, -1));
            wq0VarArr[i14].c.setVisibility(8);
            wq0VarArr[i14].d.setOnScrollListener(new ii.n3(7, this, wq0VarArr[i14].d.getOnScrollListener()));
            i14++;
        }
        vq0Var.addView(this.actionBar, w7.y5.c(-2.0f, -1));
        vq0Var.addView(tq0Var.Z, w7.y5.e(-1, 48, 83));
        vq0Var.addView(tq0Var.a0, w7.y5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        vq0Var.addView(tq0Var.b0, w7.y5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                wq0VarArr[0].e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        this.e = this.h.getCurrentTabId() == this.h.getFirstTabId();
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.h5, false);
        if (Build.VERSION.SDK_INT >= 23 && AndroidUtilities.computePerceivedBrightness(w02) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.I5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar2, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, TLObject.FLAG_27, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c.getSearchField(), 16777216, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.h6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, new Drawable[]{this.h.getSelectorDrawable()}, null, i13));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void j0(boolean z10) {
        wq0[] wq0VarArr;
        int i10 = 0;
        while (true) {
            wq0VarArr = this.n;
            if (i10 >= wq0VarArr.length) {
                break;
            }
            wq0VarArr[i10].d.B0();
            i10++;
        }
        wq0VarArr[z10 ? 1 : 0].d.getAdapter();
        wq0VarArr[z10 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((s4.c0) wq0VarArr[z10 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        tq0 tq0Var = this.a;
        if (tq0Var != null) {
            tq0Var.onConfigurationChanged(configuration);
        }
        tq0 tq0Var2 = this.b;
        if (tq0Var2 != null) {
            tq0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        tq0 tq0Var = this.a;
        if (tq0Var != null) {
            tq0Var.onFragmentDestroy();
        }
        tq0 tq0Var2 = this.b;
        if (tq0Var2 != null) {
            tq0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onPause() {
        super.onPause();
        tq0 tq0Var = this.a;
        if (tq0Var != null) {
            tq0Var.onPause();
        }
        tq0 tq0Var2 = this.b;
        if (tq0Var2 != null) {
            tq0Var2.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.u0 u0Var = this.c;
        if (u0Var != null) {
            u0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        tq0 tq0Var = this.a;
        if (tq0Var != null) {
            tq0Var.onResume();
        }
        tq0 tq0Var2 = this.b;
        if (tq0Var2 != null) {
            tq0Var2.onResume();
        }
    }
}
