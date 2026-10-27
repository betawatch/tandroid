package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ux0 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.nm0 a;
    public s4.c0 b;
    public tx0 c;
    public org.telegram.ui.Components.uz d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public final boolean x;
    public final int y;

    public ux0() {
        super(null);
        this.y = 1;
        this.x = true;
    }

    public final void V(Long l4, View view) {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(this, view);
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false)));
        int i10 = this.y;
        H.l(0, LocaleController.getString(R.string.Unblock), new am0(26, this, l4), i10 == 1);
        boolean z10 = i10 != 1;
        H.m(i10 == 0 ? R.drawable.msg_user_remove : 0, new sx0(this, l4), LocaleController.getString(R.string.Remove), z10, true);
        H.S = 190;
        H.Z();
    }

    public final void W() {
        this.e = 0;
        this.f = -1;
        this.n = -1;
        this.h = -1;
        this.w = -1;
        if (!this.x || getMessagesController().totalBlockedCount >= 0) {
            int i10 = this.e;
            int i11 = i10 + 1;
            this.e = i11;
            this.f = i10;
            int i12 = this.y;
            if (i12 == 1) {
                this.e = i10 + 2;
                this.h = i11;
            }
            if (i12 != 1) {
                throw null;
            }
            int size = getMessagesController().blockePeers.size();
            if (size != 0) {
                if (i12 == 1) {
                    int i13 = this.e;
                    this.e = i13 + 1;
                    this.n = i13;
                }
                int i14 = this.e;
                this.r = i14;
                int i15 = i14 + size;
                this.s = i15;
                int i16 = i15 + 1;
                this.e = i16;
                this.v = i15;
                if (i12 != 1) {
                    this.e = i15 + 2;
                    this.w = i16;
                }
            } else {
                this.n = -1;
                this.r = -1;
                this.s = -1;
                this.v = -1;
                this.w = -1;
            }
        }
        tx0 tx0Var = this.c;
        if (tx0Var != null) {
            tx0Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.y;
        if (i10 == 1) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.BlockedUsers));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
        } else {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new c20(this, 28));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.d = uzVar;
        if (i10 == 1) {
            uzVar.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            uzVar.setText(LocaleController.getString(R.string.NoContacts));
        }
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.a = nm0Var;
        nm0Var.u1();
        this.a.setItemSelectorColorProvider(new rx0(this));
        this.a.setSectionsDrawBackground(true);
        this.a.setEmptyView(this.d);
        org.telegram.ui.Components.nm0 nm0Var2 = this.a;
        s4.c0 c0Var = new s4.c0(1, false);
        this.b = c0Var;
        nm0Var2.setLayoutManager(c0Var);
        this.a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.nm0 nm0Var3 = this.a;
        tx0 tx0Var = new tx0(this, context);
        this.c = tx0Var;
        nm0Var3.setAdapter(tx0Var);
        this.a.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.a, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        frameLayout.addView(this.d, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.a.setOnItemClickListener(new h(this, 28));
        this.a.setOnItemLongClickListener(new rx0(this));
        if (i10 == 1) {
            this.a.setOnScrollListener(new i3(this, 26));
            if (getMessagesController().totalBlockedCount < 0) {
                this.d.b();
            } else {
                this.d.c();
            }
        }
        W();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.nm0 nm0Var;
        if (i10 != NotificationCenter.updateInterfaces) {
            if (i10 == NotificationCenter.blockedUsersDidLoad) {
                this.d.c();
                W();
                return;
            }
            return;
        }
        int intValue = ((Integer) objArr[0]).intValue();
        if (((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0) || (nm0Var = this.a) == null) {
            return;
        }
        int childCount = nm0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.a.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.f5) {
                ((org.telegram.ui.Cells.f5) childAt).d(intValue);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        j6 j6Var = new j6(18, this);
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 16, new Class[]{org.telegram.ui.Cells.f5.class, org.telegram.ui.Cells.c5.class, org.telegram.ui.Cells.q4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 0, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"statusColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 0, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.n6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.updateInterfaces);
        if (this.y == 1) {
            NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.y == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        tx0 tx0Var = this.c;
        if (tx0Var != null) {
            tx0Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.uz uzVar = this.d;
            if (uzVar != null) {
                uzVar.setProgressBarColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h6, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
