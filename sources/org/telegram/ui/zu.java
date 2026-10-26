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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zu extends org.telegram.ui.ActionBar.r2 {
    public static final org.telegram.ui.Components.qs0 x = new org.telegram.ui.Components.qs0(2);
    public cy a;
    public ContactsActivity b;
    public org.telegram.ui.ActionBar.w0 c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public yu[] f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public int v;
    public boolean w;

    public static /* synthetic */ void V(zu zuVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.g5.v0(zuVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(zuVar.currentAccount).blockPeer(user.id);
            org.telegram.ui.Components.g5.v0(zuVar, LocaleController.getString(R.string.UserBlocked));
        }
        zuVar.finishFragment();
    }

    public static void k0(zu zuVar, float f7) {
        yu[] yuVarArr = zuVar.f;
        zuVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < yuVarArr.length; i10++) {
            int i11 = (int) f7;
            yuVarArr[i10].d.setPinnedSectionOffsetY(i11);
            bi.r1 r1Var = yuVarArr[i10].e;
            if (r1Var != null) {
                r1Var.setPinnedSectionOffsetY(i11);
            }
        }
        zuVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d6));
        cy cyVar = this.a;
        if (cyVar != null) {
            cyVar.addThemeColorKeys(hashSet);
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.addThemeColorKeys(hashSet);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        float f7;
        ContactsActivity contactsActivity = this.b;
        cy cyVar = this.a;
        yu[] yuVarArr = this.f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f10 = 44.0f;
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new ga(this, 25));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.l().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new jg.e2(this, 10);
        this.c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, org.telegram.ui.Components.gb1.i(-1, 44, 83));
        this.e.setDelegate(new f(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        xu xuVar = new xu(this, context);
        this.fragmentView = xuVar;
        xuVar.setWillNotDraw(false);
        cyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i10 = 0;
        while (i10 < yuVarArr.length) {
            yu yuVar = new yu(this, context);
            yuVarArr[i10] = yuVar;
            xuVar.addView(yuVar, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            if (i10 == 0) {
                yu yuVar2 = yuVarArr[i10];
                yuVar2.a = cyVar;
                f7 = f10;
                yuVar2.d = cyVar.e0[0].a;
                cyVar.U3();
                jx jxVar = cyVar.C0;
                yuVar2.e = jxVar != null ? jxVar.a0 : null;
            } else {
                f7 = f10;
                if (i10 == 1) {
                    yu yuVar3 = yuVarArr[i10];
                    yuVar3.a = contactsActivity;
                    yuVar3.d = contactsActivity.d;
                    yuVar3.setVisibility(8);
                }
            }
            yuVarArr[i10].d.setScrollingTouchSlop(1);
            yu yuVar4 = yuVarArr[i10];
            yuVar4.b = (FrameLayout) yuVar4.a.getFragmentView();
            yu yuVar5 = yuVarArr[i10];
            yuVar5.c = yuVar5.a.getActionBar();
            yu yuVar6 = yuVarArr[i10];
            yuVar6.addView(yuVar6.b, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            AndroidUtilities.removeFromParent(yuVarArr[i10].c);
            yu yuVar7 = yuVarArr[i10];
            yuVar7.addView(yuVar7.c, org.telegram.ui.Components.gb1.g(-2.0f, -1));
            yuVarArr[i10].c.setVisibility(8);
            int i11 = 0;
            while (i11 < 2) {
                org.telegram.ui.Components.mm0 mm0Var = i11 == 0 ? yuVarArr[i10].d : yuVarArr[i10].e;
                if (mm0Var != null) {
                    mm0Var.setClipToPadding(false);
                    mm0Var.setOnScrollListener(new ai.u0(6, this, mm0Var.getOnScrollListener()));
                }
                i11++;
            }
            i10++;
            f10 = f7;
        }
        float f11 = f10;
        xuVar.addView(this.actionBar, org.telegram.ui.Components.gb1.g(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                yuVarArr[0].f = currentTabId;
            }
            this.e.c();
        }
        n0(false);
        this.w = this.e.getCurrentTabId() == this.e.getFirstTabId();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.e.getSelectorDrawable()}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.L8));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.w;
    }

    public final void m0(TLRPC.User user) {
        if (user == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.BlockUser);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.R = string;
        e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new org.telegram.ui.Components.voip.k1(6, this, user));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
        }
    }

    public final void n0(boolean z10) {
        yu[] yuVarArr = this.f;
        for (int i10 = 0; i10 < yuVarArr.length; i10++) {
            yuVarArr[i10].d.C0();
            bi.r1 r1Var = yuVarArr[i10].e;
            if (r1Var != null) {
                r1Var.C0();
            }
        }
        int i11 = 0;
        while (i11 < 2) {
            org.telegram.ui.Components.mm0 mm0Var = i11 == 0 ? yuVarArr[z10 ? 1 : 0].d : yuVarArr[z10 ? 1 : 0].e;
            if (mm0Var != null) {
                mm0Var.getAdapter();
                mm0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.c0) mm0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        cy cyVar = this.a;
        if (cyVar != null) {
            cyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        cy cyVar = this.a;
        if (cyVar != null) {
            cyVar.onPause();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        cy cyVar = this.a;
        if (cyVar != null) {
            cyVar.onResume();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            cy cyVar = this.a;
            if (cyVar != null && cyVar.fragmentView != null) {
                cyVar.onThemeColorsChanged();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            ContactsActivity contactsActivity = this.b;
            if (contactsActivity == null || contactsActivity.fragmentView == null) {
                return;
            }
            contactsActivity.onThemeColorsChanged();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
