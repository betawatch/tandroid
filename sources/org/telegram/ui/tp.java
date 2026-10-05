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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class tp extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public qp a;
    public org.telegram.ui.Components.zl0 b;
    public org.telegram.ui.ActionBar.v0 c;
    public org.telegram.ui.Components.pz d;
    public sp e;
    public TLRPC.Chat f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat n;
    public org.telegram.ui.ActionBar.b2 r;
    public boolean s;
    public ArrayList v;
    public boolean w;
    public boolean x;
    public pp y;

    public static /* synthetic */ void S(tp tpVar, org.telegram.ui.ActionBar.b2[] b2VarArr) {
        try {
            b2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        b2VarArr[0] = null;
        tpVar.h.linked_chat_id = 0L;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(tpVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, tpVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new ip(tpVar, 2), 1000L);
        if (tpVar.s) {
            return;
        }
        tpVar.finishFragment();
    }

    public static /* synthetic */ void U(tp tpVar, org.telegram.ui.ActionBar.b2[] b2VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.n2 n2Var) {
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            try {
                b2Var.dismiss();
            } catch (Throwable unused) {
            }
            b2VarArr[0] = null;
        }
        tpVar.h.linked_chat_id = chat.id;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(tpVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, tpVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new ip(tpVar, 1), 1000L);
        if (n2Var == null) {
            tpVar.finishFragment();
        } else {
            tpVar.removeSelfFromStack();
            n2Var.finishFragment();
        }
    }

    public final void X(TLRPC.Chat chat, org.telegram.ui.ActionBar.n2 n2Var) {
        if (chat == null) {
            return;
        }
        if (!ChatObject.isChannel(chat)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), chat.id, this, new o(18, this, n2Var));
            return;
        }
        org.telegram.ui.ActionBar.b2[] b2VarArr = {n2Var == null ? new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null) : null};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(this.f);
        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(chat);
        AndroidUtilities.runOnUIThread(new jp(this, b2VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new ai.p3(this, b2VarArr, chat, n2Var, 5), 64), 1), 500L);
    }

    public final void Y() {
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

    public final void Z(TLRPC.Chat chat, boolean z10) {
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat.id);
        int i10 = 0;
        if (chatFull == null) {
            if (z10) {
                getMessagesController().loadFullChat(chat.id, 0, true);
                this.n = chat;
                this.r = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
                AndroidUtilities.runOnUIThread(new ip(this, i10), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.j5, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        String formatString = !ChatObject.isPublic(chat) ? LocaleController.formatString("DiscussionLinkGroupPublicPrivateAlert", R.string.DiscussionLinkGroupPublicPrivateAlert, chat.title, this.f.title) : !ChatObject.isPublic(this.f) ? LocaleController.formatString("DiscussionLinkGroupPrivateAlert", R.string.DiscussionLinkGroupPrivateAlert, chat.title, this.f.title) : LocaleController.formatString("DiscussionLinkGroupPublicAlert", R.string.DiscussionLinkGroupPublicAlert, chat.title, this.f.title);
        if (chatFull.hidden_prehistory) {
            formatString = org.telegram.messenger.q.g(R.string.DiscussionLinkGroupAlertHistory, sa.e.j(formatString, "\n\n"));
        }
        textView.setText(AndroidUtilities.replaceTags(formatString));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.n(frameLayout);
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getParentActivity());
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        frameLayout.addView(w9Var, w7.z5.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.E8, false));
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z11 = LocaleController.isRTL;
        frameLayout.addView(textView2, w7.z5.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f));
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        h9Var.k(this.currentAccount, chat);
        w9Var.e(chat, h9Var);
        alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionLinkGroup), new c7(this, chatFull, chat, 9));
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
        qp qpVar = this.a;
        if (qpVar != null) {
            qpVar.l();
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.c;
        if (v0Var != null) {
            v0Var.setVisibility(this.v.size() <= 10 ? 8 : 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.N = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Discussion));
        int i10 = 2;
        this.actionBar.setActionBarMenuOnItemClick(new qo(this, i10));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, i10);
        this.c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new sp(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        this.d = pzVar;
        pzVar.b();
        this.d.setText(LocaleController.getString(R.string.NoResult));
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.b = zl0Var;
        zl0Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new s4.c0(1, false));
        org.telegram.ui.Components.zl0 zl0Var2 = this.b;
        qp qpVar = new qp(this, context);
        this.a = qpVar;
        zl0Var2.setAdapter(qpVar);
        this.b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.b, w7.z5.c(-1.0f, -1));
        frameLayout.addView(this.d, w7.z5.c(-1.0f, -1));
        this.b.setOnItemClickListener(new i(this, 3));
        b0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        pp ppVar;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = null;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.id;
            if (j3 == this.E) {
                this.h = chatFull;
                Y();
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
            Z(this.n, false);
            this.n = null;
            return;
        }
        if (i10 != NotificationCenter.updateInterfaces) {
            if (i10 == NotificationCenter.dialogDeleted) {
                if ((-this.E) == ((Long) objArr[0]).longValue()) {
                    org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
                    if (c5Var == null || c5Var.getLastFragment() != this) {
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
        if (chat2 == null || (ppVar = this.y) == null) {
            return;
        }
        if (!this.P) {
            ppVar.setJoinRequest(chat2.join_request);
        }
        if (this.O) {
            return;
        }
        this.y.setJoinToSend(chat2.join_to_send);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 7);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class}, null, null, null, org.telegram.ui.ActionBar.i6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.k0, null, null, org.telegram.ui.ActionBar.i6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.i6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.i6.r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{np.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.g9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.v6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        Y();
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
        qp qpVar = this.a;
        if (qpVar != null) {
            qpVar.l();
        }
    }
}
