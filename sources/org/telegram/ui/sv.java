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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class sv extends org.telegram.ui.ActionBar.m2 {
    public static final org.telegram.ui.Components.js0 x = new org.telegram.ui.Components.js0(2);
    public yy a;
    public ContactsActivity b;
    public org.telegram.ui.ActionBar.u0 c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public rv[] f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public int v;
    public boolean w;

    public static /* synthetic */ void U(sv svVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.g5.v0(svVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(svVar.currentAccount).blockPeer(user.id);
            org.telegram.ui.Components.g5.v0(svVar, LocaleController.getString(R.string.UserBlocked));
        }
        svVar.finishFragment();
    }

    public static void j0(sv svVar, float f7) {
        rv[] rvVarArr = svVar.f;
        svVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < rvVarArr.length; i10++) {
            int i11 = (int) f7;
            rvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            bi.o0 o0Var = rvVarArr[i10].e;
            if (o0Var != null) {
                o0Var.setPinnedSectionOffsetY(i11);
            }
        }
        svVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        float f7;
        ContactsActivity contactsActivity = this.b;
        yy yyVar = this.a;
        rv[] rvVarArr = this.f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f10 = 44.0f;
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new nb(this, 22));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 9);
        this.c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, w7.a6.e(-1, 44, 83));
        this.e.setDelegate(new g(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        qv qvVar = new qv(this, context);
        this.fragmentView = qvVar;
        qvVar.setWillNotDraw(false);
        yyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i10 = 0;
        while (i10 < rvVarArr.length) {
            rv rvVar = new rv(this, context);
            rvVarArr[i10] = rvVar;
            qvVar.addView(rvVar, w7.a6.d(-1.0f, -1));
            if (i10 == 0) {
                rv rvVar2 = rvVarArr[i10];
                rvVar2.a = yyVar;
                f7 = f10;
                rvVar2.d = yyVar.e0[0].a;
                yyVar.J3();
                iy iyVar = yyVar.C0;
                rvVar2.e = iyVar != null ? iyVar.V : null;
            } else {
                f7 = f10;
                if (i10 == 1) {
                    rv rvVar3 = rvVarArr[i10];
                    rvVar3.a = contactsActivity;
                    rvVar3.d = contactsActivity.f;
                    rvVar3.setVisibility(8);
                }
            }
            rvVarArr[i10].d.setScrollingTouchSlop(1);
            rv rvVar4 = rvVarArr[i10];
            rvVar4.b = (FrameLayout) rvVar4.a.getFragmentView();
            rv rvVar5 = rvVarArr[i10];
            rvVar5.c = rvVar5.a.getActionBar();
            rv rvVar6 = rvVarArr[i10];
            rvVar6.addView(rvVar6.b, w7.a6.d(-1.0f, -1));
            AndroidUtilities.removeFromParent(rvVarArr[i10].c);
            rv rvVar7 = rvVarArr[i10];
            rvVar7.addView(rvVar7.c, w7.a6.d(-2.0f, -1));
            rvVarArr[i10].c.setVisibility(8);
            int i11 = 0;
            while (i11 < 2) {
                org.telegram.ui.Components.mm0 mm0Var = i11 == 0 ? rvVarArr[i10].d : rvVarArr[i10].e;
                if (mm0Var != null) {
                    mm0Var.setClipToPadding(false);
                    mm0Var.setOnScrollListener(new ji.n3(5, this, mm0Var.getOnScrollListener()));
                }
                i11++;
            }
            i10++;
            f10 = f7;
        }
        float f11 = f10;
        qvVar.addView(this.actionBar, w7.a6.d(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                rvVarArr[0].f = currentTabId;
            }
            this.e.c();
        }
        m0(false);
        this.w = this.e.getCurrentTabId() == this.e.getFirstTabId();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, new Drawable[]{this.e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.g6.L8));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.w;
    }

    public final void l0(TLRPC.User user) {
        if (user == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.BlockUser);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.R = string;
        a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new org.telegram.ui.Components.t2(29, this, user));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
        }
    }

    public final void m0(boolean z10) {
        rv[] rvVarArr = this.f;
        for (int i10 = 0; i10 < rvVarArr.length; i10++) {
            rvVarArr[i10].d.B0();
            bi.o0 o0Var = rvVarArr[i10].e;
            if (o0Var != null) {
                o0Var.B0();
            }
        }
        int i11 = 0;
        while (i11 < 2) {
            org.telegram.ui.Components.mm0 mm0Var = i11 == 0 ? rvVarArr[z10 ? 1 : 0].d : rvVarArr[z10 ? 1 : 0].e;
            if (mm0Var != null) {
                mm0Var.getAdapter();
                mm0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.b0) mm0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        yy yyVar = this.a;
        if (yyVar != null) {
            yyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onPause() {
        super.onPause();
        yy yyVar = this.a;
        if (yyVar != null) {
            yyVar.onPause();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        yy yyVar = this.a;
        if (yyVar != null) {
            yyVar.onResume();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}
