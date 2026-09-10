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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.kl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ze(Object obj, KeyEvent.Callback callback, Object obj2, long j3, Object obj3, int i10) {
        this.a = i10;
        this.c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.e = obj2;
        this.b = j3;
        this.f = obj3;
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(final float f7, final float f10, int i10, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j3;
        int i11 = i10;
        final org.telegram.ui.Components.iv0 iv0Var = (org.telegram.ui.Components.iv0) this.c;
        org.telegram.ui.Components.ds0 ds0Var = (org.telegram.ui.Components.ds0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f;
        org.telegram.ui.Components.qt0 qt0Var = iv0Var.Q;
        org.telegram.ui.Components.ru0 ru0Var = iv0Var.R;
        org.telegram.ui.Components.rt0 rt0Var = iv0Var.a0;
        org.telegram.ui.Components.tu0 tu0Var = iv0Var.S;
        org.telegram.ui.ActionBar.p2 p2Var = iv0Var.v1;
        int i12 = ds0Var.F;
        if (i12 == 7) {
            if (view instanceof org.telegram.ui.Cells.bb) {
                if (!rt0Var.e.isEmpty()) {
                    i11 = ((Integer) rt0Var.e.get(i11)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = rt0Var.d.participants.participants.get(i11);
                if (i11 < 0 || i11 >= rt0Var.d.participants.participants.size()) {
                    return;
                }
                iv0Var.I0(chatParticipant, false, view);
                return;
            }
            s4.h0 adapter = ds0Var.h.getAdapter();
            org.telegram.ui.Components.yt0 yt0Var = iv0Var.j0;
            if (adapter == yt0Var) {
                TLObject E = yt0Var.E(i11);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j3 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                } else if (!(E instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    j3 = ((TLRPC.ChatParticipant) E).user_id;
                }
                if (j3 == 0 || j3 == p2Var.getUserConfig().getClientUserId()) {
                    return;
                }
                p2Var.presentFragment(new ProfileActivity(w.f.e(j3, "user_id"), null));
                return;
            }
            return;
        }
        if (i12 == 6 && (view instanceof org.telegram.ui.Cells.j6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.j6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var)) {
                if (!chat.forum) {
                    p2Var.presentFragment(new eo(bundle));
                    return;
                } else {
                    HashSet hashSet = ig1.n1;
                    p2Var.presentFragment(ig1.E0(p2Var.getMessagesController(), p2Var.getMessagesStorage(), bundle));
                    return;
                }
            }
            return;
        }
        if (i12 == 1 && (view instanceof org.telegram.ui.Cells.l7)) {
            iv0Var.G0(i11, view, ((org.telegram.ui.Cells.l7) view).getMessage(), ds0Var.F);
            return;
        }
        if (i12 == 3 && (view instanceof org.telegram.ui.Cells.o7)) {
            iv0Var.G0(i11, view, ((org.telegram.ui.Cells.o7) view).getMessage(), ds0Var.F);
            return;
        }
        if ((i12 == 2 || i12 == 4) && (view instanceof org.telegram.ui.Cells.k7)) {
            iv0Var.G0(i11, view, ((org.telegram.ui.Cells.k7) view).getMessage(), ds0Var.F);
            return;
        }
        if (i12 == 5 && (view instanceof org.telegram.ui.Cells.e2)) {
            iv0Var.G0(i11, view, (MessageObject) ((org.telegram.ui.Cells.e2) view).getParentObject(), ds0Var.F);
            return;
        }
        if (i12 == 0 && (view instanceof org.telegram.ui.Cells.u7)) {
            final org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
            MessageObject messageObject = u7Var.getMessageObject();
            if (messageObject != null && messageObject.isSensitive()) {
                if (p2Var == null) {
                    return;
                }
                final int currentAccount = p2Var.getCurrentAccount();
                final MessagesController messagesController = MessagesController.getInstance(currentAccount);
                final org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
                d2Var.q(200L);
                messagesController.getContentSettings(new Utilities.Callback() { // from class: org.telegram.ui.Components.gr0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                        org.telegram.ui.ActionBar.p2 p2Var2 = iv0.this.v1;
                        d2Var.c(200L);
                        final MessagesController messagesController2 = messagesController;
                        final boolean z10 = messagesController2.config.needAgeVideoVerification.get() && !TextUtils.isEmpty(messagesController2.verifyAgeBotUsername);
                        boolean z11 = (contentsettings == null || !contentsettings.sensitive_can_change) && z10;
                        final boolean[] zArr = new boolean[1];
                        final Context context2 = context;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        if (z10) {
                            zArr[0] = true;
                        } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context2, 1, p2Var2 == null ? null : p2Var2.getResourceProvider());
                            z1Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                            z1Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                            z1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            frameLayout.addView(z1Var, w7.a6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            z1Var.setOnClickListener(new v0(6, zArr));
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, p2Var2 == null ? null : p2Var2.getResourceProvider());
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
                            alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.nr0
                                @Override // org.telegram.ui.ActionBar.c2
                                public final void f(org.telegram.ui.ActionBar.d2 d2Var2, int i14) {
                                    TL_account.contentSettings contentsettings2;
                                    pr0 pr0Var = new pr0(org.telegram.ui.Cells.u7.this, f11, f12);
                                    if (!zArr[0]) {
                                        pr0Var.run(Boolean.FALSE);
                                        return;
                                    }
                                    if (!z10 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                        pr0Var.run(Boolean.TRUE);
                                    } else {
                                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                        ThemeActivity.C0(i13, context2, new org.telegram.ui.pf(21, messagesController2, pr0Var), U == null ? null : U.getResourceProvider());
                                    }
                                }
                            });
                        }
                        if (p2Var2 == null || p2Var2.getContext() == null) {
                            alertDialog$Builder.o();
                        } else {
                            p2Var2.showDialog(alertDialog$Builder.a);
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
                    iv0Var.G0(i11, view, messageObject, ds0Var.F);
                    return;
                }
                return;
            }
        }
        if (org.telegram.ui.Components.iv0.p0(i12) && (view instanceof org.telegram.ui.Cells.u7)) {
            MessageObject messageObject3 = ((org.telegram.ui.Cells.u7) view).getMessageObject();
            if (messageObject3 != null) {
                iv0Var.G0(i11, view, messageObject3, ds0Var.F);
                return;
            }
            return;
        }
        int i13 = ds0Var.F;
        if (i13 == 10) {
            if (((view instanceof org.telegram.ui.Cells.j6) || f10 < AndroidUtilities.dp(60.0f)) && i11 >= 0 && i11 < qt0Var.d.size()) {
                Bundle bundle2 = new Bundle();
                TLObject tLObject = (TLObject) qt0Var.d.get(i11);
                if (tLObject instanceof TLRPC.Chat) {
                    bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (!(tLObject instanceof TLRPC.User)) {
                    return;
                } else {
                    bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                p2Var.presentFragment(new eo(bundle2));
                return;
            }
            return;
        }
        if (i13 != 11) {
            if (i13 == 15 && (view instanceof org.telegram.ui.Cells.t1)) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                MessageObject messageObject4 = t1Var.getMessageObject();
                ds0Var.h.B0();
                int currentAccount2 = p2Var.getCurrentAccount();
                MessagesController messagesController2 = p2Var.getMessagesController();
                long j10 = this.b;
                TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j10));
                org.telegram.ui.Components.w70 F = org.telegram.ui.Components.w70.F(ds0Var, f6Var, t1Var);
                F.c0 = true;
                F.V(messageObject4.isOutOwner() ? 5 : 3);
                F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new a3.h0(iv0Var, j10, messageObject4, 16), false);
                if (!messageObject4.isPollClosed()) {
                    if (messageObject4.canUnvote()) {
                        F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new org.telegram.ui.Components.hr0(iv0Var, f6Var, currentAccount2, messageObject4), false);
                    }
                    if (!messageObject4.isForwarded() && ((messageObject4.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                        F.c(R.drawable.msg_pollstop, LocaleController.getString(messageObject4.isQuiz() ? R.string.StopQuiz : R.string.StopPoll), new org.telegram.ui.Components.hr0(iv0Var, f6Var, messageObject4, currentAccount2), false);
                    }
                }
                F.Z();
                return;
            }
            return;
        }
        if (ds0Var.h.getAdapter() != tu0Var) {
            if (iv0Var.C1) {
                if (ru0Var.v.y == 0) {
                    ru0Var.E(view);
                    return;
                }
                return;
            }
            Bundle bundle3 = new Bundle();
            if (i11 < 0 || i11 >= ru0Var.f.size()) {
                return;
            }
            SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) ru0Var.f.get(i11);
            bundle3.putLong("user_id", p2Var.getUserConfig().getClientUserId());
            bundle3.putInt("chatMode", 3);
            eo eoVar = new eo(bundle3);
            eoVar.d4 = savedDialog.dialogId;
            p2Var.presentFragment(eoVar);
            return;
        }
        if (i11 < 0) {
            return;
        }
        ArrayList arrayList = tu0Var.e;
        ArrayList arrayList2 = tu0Var.f;
        if (i11 < arrayList.size()) {
            SavedMessagesController.SavedDialog savedDialog2 = (SavedMessagesController.SavedDialog) arrayList.get(i11);
            Bundle bundle4 = new Bundle();
            bundle4.putLong("user_id", p2Var.getUserConfig().getClientUserId());
            bundle4.putInt("chatMode", 3);
            eo eoVar2 = new eo(bundle4);
            eoVar2.d4 = savedDialog2.dialogId;
            p2Var.presentFragment(eoVar2);
            return;
        }
        int size = i11 - arrayList.size();
        if (size < arrayList2.size()) {
            MessageObject messageObject5 = (MessageObject) arrayList2.get(size);
            Bundle bundle5 = new Bundle();
            bundle5.putLong("user_id", p2Var.getUserConfig().getClientUserId());
            bundle5.putInt("message_id", messageObject5.getId());
            org.telegram.ui.Components.ls0 ls0Var = new org.telegram.ui.Components.ls0(iv0Var, bundle5, size);
            ls0Var.L7 = messageObject5.getId();
            p2Var.presentFragment(ls0Var);
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                eo.X0((eo) this.c, (TLRPC.TL_game) this.d, (MessageObject) this.e, (String) this.f, this.b);
                break;
            default:
                org.telegram.ui.Components.k31 k31Var = (org.telegram.ui.Components.k31) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                org.telegram.ui.Components.c30 c30Var = (org.telegram.ui.Components.c30) this.f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j3 = this.b;
                    if (i11 >= size) {
                        k31Var.e0.addAll(hashSet);
                        k31Var.o();
                        org.telegram.ui.Components.wc.a0(k31Var.h).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new bi.ua(k31Var, hashSet, arrayList, j3, 26), new org.telegram.ui.Components.yo0(k31Var, arrayList, c30Var, 10)).j();
                        d2Var.dismiss();
                        break;
                    } else {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j3 == ((Integer) obj).intValue()) {
                            k31Var.m(0L, false);
                        }
                    }
                }
        }
    }

    public /* synthetic */ ze(eo eoVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j3) {
        this.a = 0;
        this.c = eoVar;
        this.d = tL_game;
        this.e = messageObject;
        this.f = str;
        this.b = j3;
    }

    public /* synthetic */ ze(org.telegram.ui.Components.k31 k31Var, ArrayList arrayList, long j3, HashSet hashSet, org.telegram.ui.Components.c30 c30Var) {
        this.a = 2;
        this.c = k31Var;
        this.d = arrayList;
        this.b = j3;
        this.e = hashSet;
        this.f = c30Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
