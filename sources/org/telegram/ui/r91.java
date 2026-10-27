package org.telegram.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class r91 {
    public TLRPC.User a;
    public String b;

    public static TLRPC.User a(long j10, ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.id == j10) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.r2 r2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.a.id);
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.a, false);
        r2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final TLRPC.ChatFull chatFull, final y91 y91Var, final org.telegram.ui.ActionBar.e2[] e2VarArr, boolean z10) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
        String str;
        int i10;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        boolean z11 = false;
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.a, false);
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (!z10 || (arrayList = chatFull.participants.participants) == null) {
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
        } else {
            int size = arrayList.size();
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i11);
                long j10 = chatParticipant.user_id;
                if (j10 == this.a.id && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
                if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant2 = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
            }
        }
        arrayList2.add(LocaleController.getString("StatisticOpenProfile", R.string.StatisticOpenProfile));
        d3.n(R.drawable.msg_openprofile, 2, arrayList4, arrayList3);
        arrayList2.add(LocaleController.getString("StatisticSearchUserHistory", R.string.StatisticSearchUserHistory));
        d3.n(R.drawable.msg_msgbubble3, 1, arrayList4, arrayList3);
        if (z10 && tL_chatChannelParticipant == null) {
            if (e2VarArr[0] == null) {
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(y91Var.getFragmentView().getContext(), 3, null);
                e2VarArr[0] = e2Var;
                e2Var.r(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.id);
            tL_channels_getParticipant.participant = MessagesController.getInputPeer(this.a);
            final int i12 = 0;
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) { // from class: org.telegram.ui.m91
                public final /* synthetic */ r91 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i13 = 0;
                            final r91 r91Var = this.b;
                            final y91 y91Var2 = y91Var;
                            final org.telegram.ui.ActionBar.e2[] e2VarArr2 = e2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.o91
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            y91 y91Var3 = y91Var2;
                                            if (!y91Var3.isFinishing() && y91Var3.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.e2[] e2VarArr3 = e2VarArr2;
                                                if (e2VarArr3[0] != null) {
                                                    r91 r91Var2 = r91Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull3 = chatFull2;
                                                    if (tL_error2 != null) {
                                                        r91Var2.c(chatFull3, y91Var3, e2VarArr3, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = r91Var2.a.id;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        r91Var2.c(chatFull3, y91Var3, e2VarArr3, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            y91 y91Var4 = y91Var2;
                                            if (!y91Var4.isFinishing() && y91Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.e2[] e2VarArr4 = e2VarArr2;
                                                if (e2VarArr4[0] != null) {
                                                    r91 r91Var3 = r91Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 != null) {
                                                        r91Var3.c(chatFull4, y91Var4, e2VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        r91Var3.c(chatFull4, y91Var4, e2VarArr4, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i14 = 1;
                            final r91 r91Var2 = this.b;
                            final y91 y91Var3 = y91Var;
                            final org.telegram.ui.ActionBar.e2[] e2VarArr3 = e2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.o91
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            y91 y91Var32 = y91Var3;
                                            if (!y91Var32.isFinishing() && y91Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.e2[] e2VarArr32 = e2VarArr3;
                                                if (e2VarArr32[0] != null) {
                                                    r91 r91Var22 = r91Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 != null) {
                                                        r91Var22.c(chatFull32, y91Var32, e2VarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = r91Var22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        r91Var22.c(chatFull32, y91Var32, e2VarArr32, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            y91 y91Var4 = y91Var3;
                                            if (!y91Var4.isFinishing() && y91Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.e2[] e2VarArr4 = e2VarArr3;
                                                if (e2VarArr4[0] != null) {
                                                    r91 r91Var3 = r91Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 != null) {
                                                        r91Var3.c(chatFull4, y91Var4, e2VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        r91Var3.c(chatFull4, y91Var4, e2VarArr4, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        if (z10 && tL_chatChannelParticipant2 == null) {
            if (e2VarArr[0] == null) {
                org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2(y91Var.getFragmentView().getContext(), 3, null);
                e2VarArr[0] = e2Var2;
                e2Var2.r(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant2.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.id);
            tL_channels_getParticipant2.participant = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(UserConfig.getInstance(UserConfig.selectedAccount).clientUserId);
            final int i13 = 1;
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) { // from class: org.telegram.ui.m91
                public final /* synthetic */ r91 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            final int i132 = 0;
                            final r91 r91Var = this.b;
                            final y91 y91Var2 = y91Var;
                            final org.telegram.ui.ActionBar.e2[] e2VarArr2 = e2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.o91
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i132) {
                                        case 0:
                                            y91 y91Var32 = y91Var2;
                                            if (!y91Var32.isFinishing() && y91Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.e2[] e2VarArr32 = e2VarArr2;
                                                if (e2VarArr32[0] != null) {
                                                    r91 r91Var22 = r91Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull2;
                                                    if (tL_error2 != null) {
                                                        r91Var22.c(chatFull32, y91Var32, e2VarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = r91Var22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        r91Var22.c(chatFull32, y91Var32, e2VarArr32, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            y91 y91Var4 = y91Var2;
                                            if (!y91Var4.isFinishing() && y91Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.e2[] e2VarArr4 = e2VarArr2;
                                                if (e2VarArr4[0] != null) {
                                                    r91 r91Var3 = r91Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 != null) {
                                                        r91Var3.c(chatFull4, y91Var4, e2VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        r91Var3.c(chatFull4, y91Var4, e2VarArr4, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i14 = 1;
                            final r91 r91Var2 = this.b;
                            final y91 y91Var3 = y91Var;
                            final org.telegram.ui.ActionBar.e2[] e2VarArr3 = e2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.o91
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            y91 y91Var32 = y91Var3;
                                            if (!y91Var32.isFinishing() && y91Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.e2[] e2VarArr32 = e2VarArr3;
                                                if (e2VarArr32[0] != null) {
                                                    r91 r91Var22 = r91Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 != null) {
                                                        r91Var22.c(chatFull32, y91Var32, e2VarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = r91Var22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        r91Var22.c(chatFull32, y91Var32, e2VarArr32, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            y91 y91Var4 = y91Var3;
                                            if (!y91Var4.isFinishing() && y91Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.e2[] e2VarArr4 = e2VarArr3;
                                                if (e2VarArr4[0] != null) {
                                                    r91 r91Var3 = r91Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 != null) {
                                                        r91Var3.c(chatFull4, y91Var4, e2VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        r91Var3.c(chatFull4, y91Var4, e2VarArr4, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var3 = e2VarArr[0];
        if (e2Var3 != null) {
            e2Var3.dismiss();
            e2VarArr[0] = null;
        }
        if (tL_chatChannelParticipant2 != null && tL_chatChannelParticipant != null && tL_chatChannelParticipant2.user_id != tL_chatChannelParticipant.user_id) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = tL_chatChannelParticipant2.channelParticipant.admin_rights;
            boolean z12 = tL_chatAdminRights != null && tL_chatAdminRights.add_admins;
            if (z12 && ((channelParticipant instanceof TLRPC.TL_channelParticipantCreator) || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit))) {
                z12 = false;
            }
            if (z12) {
                boolean z13 = channelParticipant.admin_rights == null;
                if (z13) {
                    str = "SetAsAdmin";
                    i10 = R.string.SetAsAdmin;
                } else {
                    str = "EditAdminRights";
                    i10 = R.string.EditAdminRights;
                }
                arrayList2.add(LocaleController.getString(str, i10));
                d3.n(z13 ? R.drawable.msg_admins : R.drawable.msg_permissions, 0, arrayList4, arrayList3);
                z11 = z13;
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y91Var.getParentActivity());
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
        int[] intArray = AndroidUtilities.toIntArray(arrayList4);
        final boolean z14 = z11;
        final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.n91
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i14) {
                ArrayList arrayList5 = arrayList3;
                int intValue = ((Integer) arrayList5.get(i14)).intValue();
                r91 r91Var = r91.this;
                TLRPC.ChatFull chatFull2 = chatFull;
                y91 y91Var2 = y91Var;
                if (intValue != 0) {
                    if (((Integer) arrayList5.get(i14)).intValue() == 2) {
                        r91Var.b(y91Var2);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chatFull2.id);
                    bundle.putLong("search_from_user_id", r91Var.a.id);
                    y91Var2.presentFragment(new wn(bundle));
                    return;
                }
                boolean[] zArr = new boolean[1];
                long j11 = r91Var.a.id;
                long j12 = chatFull2.id;
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                String str2 = channelParticipant2.rank;
                boolean z15 = z14;
                p91 p91Var = new p91(r91Var, j11, j12, tL_chatAdminRights2, tL_chatBannedRights, str2, z15, zArr, y91Var2);
                p91Var.X0 = new q91(tL_chatChannelParticipant4, z15, zArr);
                y91Var2.presentFragment(p91Var);
            }
        };
        org.telegram.ui.ActionBar.e2 e2Var4 = alertDialog$Builder.a;
        e2Var4.P = charSequenceArr;
        e2Var4.Q = intArray;
        e2Var4.M = onClickListener;
        y91Var.showDialog(e2Var4);
    }
}
