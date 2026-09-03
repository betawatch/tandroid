package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class tx0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.sl0 a;
    public f2.j0 b;
    public sx0 c;
    public org.telegram.ui.Components.oz d;
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

    public tx0() {
        super(null);
        this.y = 1;
        this.x = true;
    }

    public final void U(Long l10, View view) {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(this, view);
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false)));
        int i10 = this.y;
        H.l(0, LocaleController.getString(R.string.Unblock), new pr0(14, this, l10), i10 == 1);
        H.m(i10 != 1, i10 == 0 ? R.drawable.msg_user_remove : 0, LocaleController.getString(R.string.Remove), true, new rx0(this, l10));
        H.S = 190;
        H.Z();
    }

    public final void V() {
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
        sx0 sx0Var = this.c;
        if (sx0Var != null) {
            sx0Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.y;
        if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.BlockedUsers));
        } else if (i10 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(context, null);
        this.d = ozVar;
        if (i10 == 1) {
            ozVar.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            ozVar.setText(LocaleController.getString(R.string.NoContacts));
        }
        frameLayout.addView(this.d, k7.c6.c(-1.0f, -1));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.a = sl0Var;
        sl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.setItemSelectorColorProvider(new qx0(this));
        this.a.setEmptyView(this.d);
        org.telegram.ui.Components.sl0 sl0Var2 = this.a;
        f2.j0 j0Var = new f2.j0(1, false);
        this.b = j0Var;
        sl0Var2.setLayoutManager(j0Var);
        this.a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.sl0 sl0Var3 = this.a;
        sx0 sx0Var = new sx0(this, context);
        this.c = sx0Var;
        sl0Var3.setAdapter(sx0Var);
        this.a.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.a, k7.c6.c(-1.0f, -1));
        this.a.setOnItemClickListener(new j(this, 27));
        this.a.setOnItemLongClickListener(new qx0(this));
        if (i10 == 1) {
            this.a.setOnScrollListener(new l3(this, 25));
            if (getMessagesController().totalBlockedCount < 0) {
                this.d.b();
            } else {
                this.d.c();
            }
        }
        V();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.sl0 sl0Var;
        if (i10 != NotificationCenter.updateInterfaces) {
            if (i10 == NotificationCenter.blockedUsersDidLoad) {
                this.d.c();
                V();
                return;
            }
            return;
        }
        int intValue = ((Integer) objArr[0]).intValue();
        if (((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0) || (sl0Var = this.a) == null) {
            return;
        }
        int childCount = sl0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.a.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.b5) {
                ((org.telegram.ui.Cells.b5) childAt).c(intValue);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 29);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 2048, null, null, null, null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.k6.b7));
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.k6.r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.v6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        if (this.y == 1) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.y == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        sx0 sx0Var = this.c;
        if (sx0Var != null) {
            sx0Var.l();
        }
    }
}
