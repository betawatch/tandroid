package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class xp extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public up a;
    public org.telegram.ui.Components.ll0 b;
    public org.telegram.ui.ActionBar.v0 c;
    public org.telegram.ui.Components.mz d;
    public wp e;
    public TLRPC.Chat f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat n;
    public org.telegram.ui.ActionBar.b2 r;
    public boolean s;
    public ArrayList v;
    public boolean w;
    public boolean x;
    public tp y;

    public static /* synthetic */ void U(xp xpVar, org.telegram.ui.ActionBar.b2[] b2VarArr) {
        try {
            b2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        b2VarArr[0] = null;
        xpVar.h.linked_chat_id = 0L;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(xpVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, xpVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new mp(xpVar, 2), 1000L);
        if (xpVar.s) {
            return;
        }
        xpVar.finishFragment();
    }

    public static /* synthetic */ void W(xp xpVar, org.telegram.ui.ActionBar.b2[] b2VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.n2 n2Var) {
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            try {
                b2Var.dismiss();
            } catch (Throwable unused) {
            }
            b2VarArr[0] = null;
        }
        xpVar.h.linked_chat_id = chat.id;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(xpVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, xpVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new mp(xpVar, 1), 1000L);
        if (n2Var == null) {
            xpVar.finishFragment();
        } else {
            xpVar.removeSelfFromStack();
            n2Var.finishFragment();
        }
    }

    public final void Y(TLRPC.Chat chat, org.telegram.ui.ActionBar.n2 n2Var) {
        if (chat == null) {
            return;
        }
        if (!ChatObject.isChannel(chat)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), chat.id, this, new m4(15, this, n2Var));
            return;
        }
        org.telegram.ui.ActionBar.b2[] b2VarArr = {n2Var == null ? new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null) : null};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(this.f);
        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(chat);
        AndroidUtilities.runOnUIThread(new np(this, b2VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new bi.c3(this, b2VarArr, chat, n2Var, 5), 64), 1), 500L);
    }

    public final void Z() {
        if (this.h.linked_chat_id != 0) {
            this.v.clear();
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.h.linked_chat_id));
            if (chat != null) {
                this.v.add(chat);
            }
            org.telegram.ui.ActionBar.v0 v0Var = this.c;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
        }
        if (!this.w && this.s && this.h.linked_chat_id == 0) {
            this.w = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new m(this, 3));
        }
    }

    public final void a0(TLRPC.Chat chat, boolean z10) {
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat.id);
        int i10 = 0;
        if (chatFull == null) {
            if (z10) {
                getMessagesController().loadFullChat(chat.id, 0, true);
                this.n = chat;
                this.r = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
                AndroidUtilities.runOnUIThread(new mp(this, i10), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        String formatString = !ChatObject.isPublic(chat) ? LocaleController.formatString("DiscussionLinkGroupPublicPrivateAlert", R.string.DiscussionLinkGroupPublicPrivateAlert, chat.title, this.f.title) : !ChatObject.isPublic(this.f) ? LocaleController.formatString("DiscussionLinkGroupPrivateAlert", R.string.DiscussionLinkGroupPrivateAlert, chat.title, this.f.title) : LocaleController.formatString("DiscussionLinkGroupPublicAlert", R.string.DiscussionLinkGroupPublicAlert, chat.title, this.f.title);
        if (chatFull.hidden_prehistory) {
            formatString = org.telegram.messenger.w1.h(R.string.DiscussionLinkGroupAlertHistory, w.f.g(formatString, "\n\n"));
        }
        textView.setText(AndroidUtilities.replaceTags(formatString));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.n(frameLayout);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        i9Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(getParentActivity());
        x9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        frameLayout.addView(x9Var, w7.x5.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z11 = LocaleController.isRTL;
        frameLayout.addView(textView2, w7.x5.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f));
        frameLayout.addView(textView, w7.x5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        i9Var.k(this.currentAccount, chat);
        x9Var.e(chat, i9Var);
        alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionLinkGroup), new b7(this, chatFull, chat, 9));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.a);
    }

    public final void b0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10 = this.s;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.E));
        this.f = chat;
        if (chat == null) {
            return;
        }
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = 1;
        if (z10) {
            if (this.h.linked_chat_id == 0) {
                this.M = 2;
                this.F = 1;
            }
            int i10 = this.M;
            this.G = i10;
            int size = this.v.size() + i10;
            this.M = size;
            this.H = size;
            if (this.h.linked_chat_id != 0) {
                this.M = size + 1;
                this.F = size;
            }
        } else {
            this.G = 1;
            int size2 = this.v.size();
            int i11 = 1 + size2;
            this.H = i11;
            this.M = size2 + 2;
            this.F = i11;
        }
        int i12 = this.M;
        this.M = i12 + 1;
        this.J = i12;
        if (!z10 || (this.v.size() > 0 && this.h.linked_chat_id != 0)) {
            TLRPC.Chat chat2 = z10 ? (TLRPC.Chat) this.v.get(0) : this.f;
            if (chat2 != null && ((!ChatObject.isPublic(chat2) || z10) && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                int i13 = this.M;
                this.M = i13 + 1;
                this.K = i13;
            }
        }
        up upVar = this.a;
        if (upVar != null) {
            upVar.l();
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.c;
        if (v0Var != null) {
            v0Var.setVisibility(this.v.size() <= 10 ? 8 : 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.N = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Discussion));
        this.actionBar.setActionBarMenuOnItemClick(new ic(this, 3));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 2);
        this.c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new wp(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.fragmentView.setTag(Integer.valueOf(i10));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.d = mzVar;
        mzVar.b();
        this.d.setText(LocaleController.getString(R.string.NoResult));
        frameLayout2.addView(this.d, w7.x5.c(-1.0f, -1));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.b = ll0Var;
        ll0Var.o1();
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new s4.c0(1, false));
        org.telegram.ui.Components.ll0 ll0Var2 = this.b;
        up upVar = new up(this, context);
        this.a = upVar;
        ll0Var2.setAdapter(upVar);
        this.b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout2.addView(this.b, w7.x5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setOnItemClickListener(new i(this, 3));
        b0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        tp tpVar;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = null;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.id;
            if (j3 == this.E) {
                this.h = chatFull;
                Z();
                b0();
                return;
            }
            TLRPC.Chat chat3 = this.n;
            if (chat3 == null || chat3.id != j3) {
                return;
            }
            try {
                this.r.dismiss();
            } catch (Throwable unused) {
            }
            this.r = null;
            a0(this.n, false);
            this.n = null;
            return;
        }
        if (i10 != NotificationCenter.updateInterfaces) {
            if (i10 == NotificationCenter.dialogDeleted) {
                if ((-this.E) == ((Long) objArr[0]).longValue()) {
                    org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
                    if (d5Var == null || d5Var.getLastFragment() != this) {
                        removeSelfFromStack();
                        return;
                    } else {
                        finishFragment();
                        return;
                    }
                }
                return;
            }
            return;
        }
        if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_CHAT) == 0 || this.f == null) {
            return;
        }
        TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f.id));
        if (chat4 != null) {
            this.f = chat4;
        }
        if (this.v.size() > 0 && (chat = getMessagesController().getChat(Long.valueOf(((TLRPC.Chat) this.v.get(0)).id))) != null) {
            this.v.set(0, chat);
        }
        if (!this.s) {
            chat2 = this.f;
        } else if (this.v.size() > 0) {
            chat2 = (TLRPC.Chat) this.v.get(0);
        }
        if (chat2 == null || (tpVar = this.y) == null) {
            return;
        }
        if (!this.P) {
            tpVar.setJoinRequest(chat2.join_request);
        }
        if (this.O) {
            return;
        }
        this.y.setJoinToSend(chat2.join_to_send);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 7);
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 16, new Class[]{org.telegram.ui.Cells.a5.class, org.telegram.ui.Cells.x4.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{rp.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.g9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.v6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        Z();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        up upVar = this.a;
        if (upVar != null) {
            upVar.l();
        }
    }
}
