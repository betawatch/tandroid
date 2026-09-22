package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.nl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xe(Object obj, KeyEvent.Callback callback, Object obj2, long j3, Object obj3, int i10) {
        this.a = i10;
        this.c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.e = obj2;
        this.b = j3;
        this.f = obj3;
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(final float f7, final float f10, int i10, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j3;
        int i11 = i10;
        final org.telegram.ui.Components.lv0 lv0Var = (org.telegram.ui.Components.lv0) this.c;
        org.telegram.ui.Components.hs0 hs0Var = (org.telegram.ui.Components.hs0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f;
        org.telegram.ui.Components.ut0 ut0Var = lv0Var.Q;
        org.telegram.ui.Components.vu0 vu0Var = lv0Var.R;
        org.telegram.ui.Components.vt0 vt0Var = lv0Var.a0;
        org.telegram.ui.Components.wu0 wu0Var = lv0Var.S;
        org.telegram.ui.ActionBar.n2 n2Var = lv0Var.v1;
        int i12 = hs0Var.F;
        if (i12 == 7) {
            if (view instanceof org.telegram.ui.Cells.ab) {
                if (!vt0Var.e.isEmpty()) {
                    i11 = ((Integer) vt0Var.e.get(i11)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = vt0Var.d.participants.participants.get(i11);
                if (i11 < 0 || i11 >= vt0Var.d.participants.participants.size()) {
                    return;
                }
                lv0Var.I0(chatParticipant, false, view);
                return;
            }
            s4.h0 adapter = hs0Var.h.getAdapter();
            org.telegram.ui.Components.cu0 cu0Var = lv0Var.j0;
            if (adapter == cu0Var) {
                TLObject E = cu0Var.E(i11);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j3 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                } else if (!(E instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    j3 = ((TLRPC.ChatParticipant) E).user_id;
                }
                if (j3 == 0 || j3 == n2Var.getUserConfig().getClientUserId()) {
                    return;
                }
                n2Var.presentFragment(new ProfileActivity(v7.j0.e(j3, "user_id"), null));
                return;
            }
            return;
        }
        if (i12 == 6 && (view instanceof org.telegram.ui.Cells.j6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.j6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                if (!chat.forum) {
                    n2Var.presentFragment(new zn(bundle));
                    return;
                } else {
                    HashSet hashSet = fg1.n1;
                    n2Var.presentFragment(fg1.E0(n2Var.getMessagesController(), n2Var.getMessagesStorage(), bundle));
                    return;
                }
            }
            return;
        }
        if (i12 == 1 && (view instanceof org.telegram.ui.Cells.l7)) {
            lv0Var.G0(i11, view, ((org.telegram.ui.Cells.l7) view).getMessage(), hs0Var.F);
            return;
        }
        if (i12 == 3 && (view instanceof org.telegram.ui.Cells.o7)) {
            lv0Var.G0(i11, view, ((org.telegram.ui.Cells.o7) view).getMessage(), hs0Var.F);
            return;
        }
        if ((i12 == 2 || i12 == 4) && (view instanceof org.telegram.ui.Cells.k7)) {
            lv0Var.G0(i11, view, ((org.telegram.ui.Cells.k7) view).getMessage(), hs0Var.F);
            return;
        }
        if (i12 == 5 && (view instanceof org.telegram.ui.Cells.f2)) {
            lv0Var.G0(i11, view, (MessageObject) ((org.telegram.ui.Cells.f2) view).getParentObject(), hs0Var.F);
            return;
        }
        if (i12 == 0 && (view instanceof org.telegram.ui.Cells.u7)) {
            final org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
            MessageObject messageObject = u7Var.getMessageObject();
            if (messageObject != null && messageObject.isSensitive()) {
                if (n2Var == null) {
                    return;
                }
                final int currentAccount = n2Var.getCurrentAccount();
                final MessagesController messagesController = MessagesController.getInstance(currentAccount);
                final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
                b2Var.q(200L);
                messagesController.getContentSettings(new Utilities.Callback() { // from class: org.telegram.ui.Components.kr0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                        org.telegram.ui.ActionBar.n2 n2Var2 = lv0.this.v1;
                        b2Var.c(200L);
                        final MessagesController messagesController2 = messagesController;
                        final boolean z10 = messagesController2.config.needAgeVideoVerification.get() && !TextUtils.isEmpty(messagesController2.verifyAgeBotUsername);
                        boolean z11 = (contentsettings == null || !contentsettings.sensitive_can_change) && z10;
                        final boolean[] zArr = new boolean[1];
                        final Context context2 = context;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        if (z10) {
                            zArr[0] = true;
                        } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                            org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context2, 1, n2Var2 == null ? null : n2Var2.getResourceProvider());
                            a2Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                            a2Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                            a2Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            frameLayout.addView(a2Var, w7.y5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            a2Var.setOnClickListener(new t0(6, zArr));
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, n2Var2 == null ? null : n2Var2.getResourceProvider());
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(z11 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText);
                        alertDialog$Builder.n(frameLayout);
                        alertDialog$Builder.a.G = 9;
                        alertDialog$Builder.h(LocaleController.getString(z11 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
                        if (!z11) {
                            String string = LocaleController.getString(R.string.MessageShowSensitiveContentButton);
                            final org.telegram.ui.Cells.u7 u7Var2 = u7Var;
                            final float f11 = f7;
                            final float f12 = f10;
                            final int i13 = currentAccount;
                            alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.rr0
                                @Override // org.telegram.ui.ActionBar.a2
                                public final void k(org.telegram.ui.ActionBar.b2 b2Var2, int i14) {
                                    TL_account.contentSettings contentsettings2;
                                    tr0 tr0Var = new tr0(org.telegram.ui.Cells.u7.this, f11, f12);
                                    if (!zArr[0]) {
                                        tr0Var.run(Boolean.FALSE);
                                        return;
                                    }
                                    if (!z10 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                        tr0Var.run(Boolean.TRUE);
                                    } else {
                                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                        ThemeActivity.C0(i13, context2, new org.telegram.ui.of(21, messagesController2, tr0Var), U == null ? null : U.getResourceProvider());
                                    }
                                }
                            });
                        }
                        if (n2Var2 == null || n2Var2.getContext() == null) {
                            alertDialog$Builder.o();
                        } else {
                            n2Var2.showDialog(alertDialog$Builder.a);
                        }
                    }
                });
                return;
            }
            MessageObject messageObject2 = u7Var.n;
            if (messageObject2 != null && messageObject2.hasMediaSpoilers() && u7Var.i0 == 0.0f && !u7Var.n.isMediaSpoilersRevealedInSharedMedia) {
                u7Var.n(f7, f10);
                return;
            } else {
                if (messageObject != null) {
                    lv0Var.G0(i11, view, messageObject, hs0Var.F);
                    return;
                }
                return;
            }
        }
        if (org.telegram.ui.Components.lv0.p0(i12) && (view instanceof org.telegram.ui.Cells.u7)) {
            MessageObject messageObject3 = ((org.telegram.ui.Cells.u7) view).getMessageObject();
            if (messageObject3 != null) {
                lv0Var.G0(i11, view, messageObject3, hs0Var.F);
                return;
            }
            return;
        }
        int i13 = hs0Var.F;
        if (i13 == 10) {
            if (((view instanceof org.telegram.ui.Cells.j6) || f10 < AndroidUtilities.dp(60.0f)) && i11 >= 0 && i11 < ut0Var.d.size()) {
                Bundle bundle2 = new Bundle();
                TLObject tLObject = (TLObject) ut0Var.d.get(i11);
                if (tLObject instanceof TLRPC.Chat) {
                    bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (!(tLObject instanceof TLRPC.User)) {
                    return;
                } else {
                    bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                n2Var.presentFragment(new zn(bundle2));
                return;
            }
            return;
        }
        if (i13 != 11) {
            if (i13 == 15 && (view instanceof org.telegram.ui.Cells.u1)) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                MessageObject messageObject4 = u1Var.getMessageObject();
                hs0Var.h.C0();
                int currentAccount2 = n2Var.getCurrentAccount();
                MessagesController messagesController2 = n2Var.getMessagesController();
                long j10 = this.b;
                TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j10));
                org.telegram.ui.Components.y70 F = org.telegram.ui.Components.y70.F(hs0Var, f6Var, u1Var);
                F.c0 = true;
                F.V(messageObject4.isOutOwner() ? 5 : 3);
                F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new a3.h0(lv0Var, j10, messageObject4, 22), false);
                if (!messageObject4.isPollClosed()) {
                    if (messageObject4.canUnvote()) {
                        F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new org.telegram.ui.Components.lr0(lv0Var, f6Var, currentAccount2, messageObject4), false);
                    }
                    if (!messageObject4.isForwarded() && ((messageObject4.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                        F.c(R.drawable.msg_pollstop, LocaleController.getString(messageObject4.isQuiz() ? R.string.StopQuiz : R.string.StopPoll), new org.telegram.ui.Components.lr0(lv0Var, f6Var, messageObject4, currentAccount2), false);
                    }
                }
                F.Z();
                return;
            }
            return;
        }
        if (hs0Var.h.getAdapter() != wu0Var) {
            if (lv0Var.C1) {
                if (vu0Var.v.y == 0) {
                    vu0Var.E(view);
                    return;
                }
                return;
            }
            Bundle bundle3 = new Bundle();
            if (i11 < 0 || i11 >= vu0Var.f.size()) {
                return;
            }
            SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) vu0Var.f.get(i11);
            bundle3.putLong("user_id", n2Var.getUserConfig().getClientUserId());
            bundle3.putInt("chatMode", 3);
            zn znVar = new zn(bundle3);
            znVar.d4 = savedDialog.dialogId;
            n2Var.presentFragment(znVar);
            return;
        }
        if (i11 < 0) {
            return;
        }
        ArrayList arrayList = wu0Var.e;
        ArrayList arrayList2 = wu0Var.f;
        if (i11 < arrayList.size()) {
            SavedMessagesController.SavedDialog savedDialog2 = (SavedMessagesController.SavedDialog) arrayList.get(i11);
            Bundle bundle4 = new Bundle();
            bundle4.putLong("user_id", n2Var.getUserConfig().getClientUserId());
            bundle4.putInt("chatMode", 3);
            zn znVar2 = new zn(bundle4);
            znVar2.d4 = savedDialog2.dialogId;
            n2Var.presentFragment(znVar2);
            return;
        }
        int size = i11 - arrayList.size();
        if (size < arrayList2.size()) {
            MessageObject messageObject5 = (MessageObject) arrayList2.get(size);
            Bundle bundle5 = new Bundle();
            bundle5.putLong("user_id", n2Var.getUserConfig().getClientUserId());
            bundle5.putInt("message_id", messageObject5.getId());
            org.telegram.ui.Components.ps0 ps0Var = new org.telegram.ui.Components.ps0(lv0Var, bundle5, size);
            ps0Var.L7 = messageObject5.getId();
            n2Var.presentFragment(ps0Var);
        }
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                zn.T0((zn) this.c, (TLRPC.TL_game) this.d, (MessageObject) this.e, (String) this.f, this.b);
                break;
            default:
                org.telegram.ui.Components.n31 n31Var = (org.telegram.ui.Components.n31) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                org.telegram.ui.Components.sh shVar = (org.telegram.ui.Components.sh) this.f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j3 = this.b;
                    if (i11 >= size) {
                        n31Var.e0.addAll(hashSet);
                        n31Var.o();
                        org.telegram.ui.Components.xc.a0(n31Var.h).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new org.telegram.ui.Components.z21(n31Var, hashSet, arrayList, j3, 0), new org.telegram.ui.Components.yn0(n31Var, arrayList, shVar, 13)).j();
                        b2Var.dismiss();
                        break;
                    } else {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j3 == ((Integer) obj).intValue()) {
                            n31Var.m(0L, false);
                        }
                    }
                }
        }
    }

    public /* synthetic */ xe(zn znVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j3) {
        this.a = 0;
        this.c = znVar;
        this.d = tL_game;
        this.e = messageObject;
        this.f = str;
        this.b = j3;
    }

    public /* synthetic */ xe(org.telegram.ui.Components.n31 n31Var, ArrayList arrayList, long j3, HashSet hashSet, org.telegram.ui.Components.sh shVar) {
        this.a = 2;
        this.c = n31Var;
        this.d = arrayList;
        this.b = j3;
        this.e = hashSet;
        this.f = shVar;
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
