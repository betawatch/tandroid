package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yt extends org.telegram.ui.ActionBar.d2 {
    public static final org.telegram.ui.Components.qp0 y = new org.telegram.ui.Components.qp0(2);
    public uw a;
    public ContactsActivity b;
    public org.telegram.ui.ActionBar.q0 c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public xt[] f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public int w;
    public boolean x;

    public static void Z(yt ytVar, TLRPC.User user) {
        if (org.telegram.messenger.hp.F2(user)) {
            org.telegram.ui.Components.t4.v0(org.telegram.messenger.bd.M0(2131751106, null), ytVar);
        } else {
            org.telegram.messenger.hp.s1(ytVar.currentAccount).w(user.id);
            org.telegram.ui.Components.t4.v0(org.telegram.messenger.bd.M0(2131743771, null), ytVar);
        }
        ytVar.finishFragment();
    }

    public static void o0(yt ytVar, float f10) {
        xt[] xtVarArr = ytVar.f;
        ytVar.actionBar.setTranslationY(f10);
        for (int i3 = 0; i3 < xtVarArr.length; i3++) {
            int i10 = (int) f10;
            xtVarArr[i3].d.setPinnedSectionOffsetY(i10);
            ci.j1 j1Var = xtVarArr[i3].e;
            if (j1Var != null) {
                j1Var.setPinnedSectionOffsetY(i10);
            }
        }
        ytVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
        uw uwVar = this.a;
        if (uwVar != null) {
            uwVar.addThemeColorKeys(hashSet);
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.addThemeColorKeys(hashSet);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        float f10;
        ContactsActivity contactsActivity = this.b;
        uw uwVar = this.a;
        xt[] xtVarArr = this.f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131753687, null));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f11 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new o9(this, 27));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.q().a(0, R.drawable.outline_header_search);
        a10.N();
        a10.I = new lg.w1(this, 10);
        this.c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, b8.mf.e(-1, 44, 83));
        this.e.setDelegate(new f(this, 13));
        this.w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        wt wtVar = new wt(this, context);
        this.fragmentView = wtVar;
        wtVar.setWillNotDraw(false);
        uwVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i3 = 0;
        while (i3 < xtVarArr.length) {
            xt xtVar = new xt(this, context);
            xtVarArr[i3] = xtVar;
            wtVar.addView(xtVar, b8.mf.c(-1.0f, -1));
            if (i3 == 0) {
                xt xtVar2 = xtVarArr[i3];
                xtVar2.a = uwVar;
                f10 = f11;
                xtVar2.d = uwVar.f0[0].a;
                uwVar.Y3();
                cw cwVar = uwVar.D0;
                xtVar2.e = cwVar != null ? cwVar.b0 : null;
            } else {
                f10 = f11;
                if (i3 == 1) {
                    xt xtVar3 = xtVarArr[i3];
                    xtVar3.a = contactsActivity;
                    xtVar3.d = contactsActivity.d;
                    xtVar3.setVisibility(8);
                }
            }
            xtVarArr[i3].d.setScrollingTouchSlop(1);
            xt xtVar4 = xtVarArr[i3];
            xtVar4.b = (FrameLayout) xtVar4.a.getFragmentView();
            xt xtVar5 = xtVarArr[i3];
            xtVar5.c = xtVar5.a.getActionBar();
            xt xtVar6 = xtVarArr[i3];
            xtVar6.addView(xtVar6.b, b8.mf.c(-1.0f, -1));
            org.telegram.messenger.g0.E2(xtVarArr[i3].c);
            xt xtVar7 = xtVarArr[i3];
            xtVar7.addView(xtVar7.c, b8.mf.c(-2.0f, -1));
            xtVarArr[i3].c.setVisibility(8);
            int i10 = 0;
            while (i10 < 2) {
                org.telegram.ui.Components.tj0 tj0Var = i10 == 0 ? xtVarArr[i3].d : xtVarArr[i3].e;
                if (tj0Var != null) {
                    tj0Var.setClipToPadding(false);
                    tj0Var.setOnScrollListener(new ai.i4(7, this, tj0Var.getOnScrollListener()));
                }
                i10++;
            }
            i3++;
            f11 = f10;
        }
        float f12 = f11;
        wtVar.addView(this.actionBar, b8.mf.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, org.telegram.messenger.bd.M0(2131753690, null), null);
            this.e.a(1, org.telegram.messenger.bd.M0(2131753689, null), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                xtVarArr[0].f = currentTabId;
            }
            this.e.c();
        }
        r0(false);
        this.x = this.e.getCurrentTabId() == this.e.getFirstTabId();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.e.getSelectorDrawable()}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L8));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.x;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        uw uwVar = this.a;
        if (uwVar != null) {
            uwVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        uw uwVar = this.a;
        if (uwVar != null) {
            uwVar.onPause();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        uw uwVar = this.a;
        if (uwVar != null) {
            uwVar.onResume();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            uw uwVar = this.a;
            if (uwVar != null && uwVar.fragmentView != null) {
                uwVar.onThemeColorsChanged();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            ContactsActivity contactsActivity = this.b;
            if (contactsActivity == null || contactsActivity.fragmentView == null) {
                return;
            }
            contactsActivity.onThemeColorsChanged();
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public final void q0(TLRPC.User user) {
        if (user == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131753692, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("AreYouSureBlockContact2", null, 2131754119, org.telegram.messenger.g5.m(0, user.first_name, user.last_name)));
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131753693, null), new org.telegram.ui.Components.i41(8, this, user));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        showDialog(s1Var);
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
        }
    }

    public final void r0(boolean z10) {
        xt[] xtVarArr = this.f;
        for (int i3 = 0; i3 < xtVarArr.length; i3++) {
            xtVarArr[i3].d.C0();
            ci.j1 j1Var = xtVarArr[i3].e;
            if (j1Var != null) {
                j1Var.C0();
            }
        }
        int i10 = 0;
        while (i10 < 2) {
            org.telegram.ui.Components.tj0 tj0Var = i10 == 0 ? xtVarArr[z10 ? 1 : 0].d : xtVarArr[z10 ? 1 : 0].e;
            if (tj0Var != null) {
                tj0Var.getAdapter();
                tj0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((u4.b0) tj0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
            i10++;
        }
    }
}
