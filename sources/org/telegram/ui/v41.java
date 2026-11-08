package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class v41 {
    public TLRPC.User a;
    public String b;

    public static TLRPC.User a(ArrayList arrayList, long j3) {
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.id == j3) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.f2 f2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.a.id);
        org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).X3(this.a, false, false);
        f2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01c1 A[LOOP:1: B:70:0x01bf->B:71:0x01c1, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final TLRPC.ChatFull chatFull, final c51 c51Var, final org.telegram.ui.ActionBar.u1[] u1VarArr, boolean z9) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
        boolean z10;
        int size;
        String str;
        int i7;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).X3(this.a, false, false);
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (!z9 || (arrayList = chatFull.participants.participants) == null) {
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
        } else {
            int size2 = arrayList.size();
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
            for (int i10 = 0; i10 < size2; i10++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i10);
                long j3 = chatParticipant.user_id;
                if (j3 == this.a.id && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
                if (j3 == org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).n && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant2 = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
            }
        }
        org.telegram.ui.Cells.f1.t("StatisticOpenProfile", 2131744899, arrayList2, R.drawable.msg_openprofile, arrayList4);
        arrayList3.add(2);
        arrayList2.add(org.telegram.messenger.id.M0(2131744897, "StatisticSearchUserHistory"));
        arrayList4.add(Integer.valueOf(R.drawable.msg_msgbubble3));
        arrayList3.add(1);
        if (z9 && tL_chatChannelParticipant == null) {
            if (u1VarArr[0] == null) {
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, c51Var.getFragmentView().getContext(), null);
                u1VarArr[0] = u1Var;
                u1Var.r(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).h1(chatFull.id);
            tL_channels_getParticipant.participant = org.telegram.messenger.qp.n1(this.a);
            final int i11 = 0;
            ConnectionsManager.getInstance(org.telegram.messenger.p10.s0).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) { // from class: org.telegram.ui.q41
                public final /* synthetic */ v41 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            final int i12 = 0;
                            final v41 v41Var = this.b;
                            final c51 c51Var2 = c51Var;
                            final org.telegram.ui.ActionBar.u1[] u1VarArr2 = u1VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.s41
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            v41 v41Var2 = v41Var;
                                            v41Var2.getClass();
                                            c51 c51Var3 = c51Var2;
                                            if (!c51Var3.isFinishing() && c51Var3.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.u1[] u1VarArr3 = u1VarArr2;
                                                if (u1VarArr3[0] != null) {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull3 = chatFull2;
                                                    if (tL_error2 != null) {
                                                        v41Var2.c(chatFull3, c51Var3, u1VarArr3, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = v41Var2.a.id;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        v41Var2.c(chatFull3, c51Var3, u1VarArr3, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            v41 v41Var3 = v41Var;
                                            v41Var3.getClass();
                                            c51 c51Var4 = c51Var2;
                                            if (!c51Var4.isFinishing() && c51Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.u1[] u1VarArr4 = u1VarArr2;
                                                if (u1VarArr4[0] != null) {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 != null) {
                                                        v41Var3.c(chatFull4, c51Var4, u1VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).n;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        v41Var3.c(chatFull4, c51Var4, u1VarArr4, true);
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
                            final int i13 = 1;
                            final v41 v41Var2 = this.b;
                            final c51 c51Var3 = c51Var;
                            final org.telegram.ui.ActionBar.u1[] u1VarArr3 = u1VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.s41
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            v41 v41Var22 = v41Var2;
                                            v41Var22.getClass();
                                            c51 c51Var32 = c51Var3;
                                            if (!c51Var32.isFinishing() && c51Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.u1[] u1VarArr32 = u1VarArr3;
                                                if (u1VarArr32[0] != null) {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 != null) {
                                                        v41Var22.c(chatFull32, c51Var32, u1VarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = v41Var22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        v41Var22.c(chatFull32, c51Var32, u1VarArr32, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            v41 v41Var3 = v41Var2;
                                            v41Var3.getClass();
                                            c51 c51Var4 = c51Var3;
                                            if (!c51Var4.isFinishing() && c51Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.u1[] u1VarArr4 = u1VarArr3;
                                                if (u1VarArr4[0] != null) {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 != null) {
                                                        v41Var3.c(chatFull4, c51Var4, u1VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).n;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        v41Var3.c(chatFull4, c51Var4, u1VarArr4, true);
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
        if (z9 && tL_chatChannelParticipant2 == null) {
            if (u1VarArr[0] == null) {
                org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, c51Var.getFragmentView().getContext(), null);
                u1VarArr[0] = u1Var2;
                u1Var2.r(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant2.channel = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).h1(chatFull.id);
            tL_channels_getParticipant2.participant = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).j1(org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).n);
            final int i12 = 1;
            ConnectionsManager.getInstance(org.telegram.messenger.p10.s0).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) { // from class: org.telegram.ui.q41
                public final /* synthetic */ v41 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i122 = 0;
                            final v41 v41Var = this.b;
                            final c51 c51Var2 = c51Var;
                            final org.telegram.ui.ActionBar.u1[] u1VarArr2 = u1VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.s41
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i122) {
                                        case 0:
                                            v41 v41Var22 = v41Var;
                                            v41Var22.getClass();
                                            c51 c51Var32 = c51Var2;
                                            if (!c51Var32.isFinishing() && c51Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.u1[] u1VarArr32 = u1VarArr2;
                                                if (u1VarArr32[0] != null) {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull2;
                                                    if (tL_error2 != null) {
                                                        v41Var22.c(chatFull32, c51Var32, u1VarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = v41Var22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        v41Var22.c(chatFull32, c51Var32, u1VarArr32, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            v41 v41Var3 = v41Var;
                                            v41Var3.getClass();
                                            c51 c51Var4 = c51Var2;
                                            if (!c51Var4.isFinishing() && c51Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.u1[] u1VarArr4 = u1VarArr2;
                                                if (u1VarArr4[0] != null) {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 != null) {
                                                        v41Var3.c(chatFull4, c51Var4, u1VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).n;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        v41Var3.c(chatFull4, c51Var4, u1VarArr4, true);
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
                            final int i13 = 1;
                            final v41 v41Var2 = this.b;
                            final c51 c51Var3 = c51Var;
                            final org.telegram.ui.ActionBar.u1[] u1VarArr3 = u1VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.s41
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            v41 v41Var22 = v41Var2;
                                            v41Var22.getClass();
                                            c51 c51Var32 = c51Var3;
                                            if (!c51Var32.isFinishing() && c51Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.u1[] u1VarArr32 = u1VarArr3;
                                                if (u1VarArr32[0] != null) {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 != null) {
                                                        v41Var22.c(chatFull32, c51Var32, u1VarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = v41Var22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        v41Var22.c(chatFull32, c51Var32, u1VarArr32, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            v41 v41Var3 = v41Var2;
                                            v41Var3.getClass();
                                            c51 c51Var4 = c51Var3;
                                            if (!c51Var4.isFinishing() && c51Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.u1[] u1VarArr4 = u1VarArr3;
                                                if (u1VarArr4[0] != null) {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 != null) {
                                                        v41Var3.c(chatFull4, c51Var4, u1VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).n;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        v41Var3.c(chatFull4, c51Var4, u1VarArr4, true);
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
        org.telegram.ui.ActionBar.u1 u1Var3 = u1VarArr[0];
        if (u1Var3 != null) {
            u1Var3.dismiss();
            u1VarArr[0] = null;
        }
        if (tL_chatChannelParticipant2 != null && tL_chatChannelParticipant != null && tL_chatChannelParticipant2.user_id != tL_chatChannelParticipant.user_id) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = tL_chatChannelParticipant2.channelParticipant.admin_rights;
            boolean z11 = tL_chatAdminRights != null && tL_chatAdminRights.add_admins;
            if (z11 && ((channelParticipant instanceof TLRPC.TL_channelParticipantCreator) || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit))) {
                z11 = false;
            }
            if (z11) {
                z10 = channelParticipant.admin_rights == null;
                if (z10) {
                    str = "SetAsAdmin";
                    i7 = 2131745550;
                } else {
                    str = "EditAdminRights";
                    i7 = 2131751305;
                }
                arrayList2.add(org.telegram.messenger.id.M0(i7, str));
                arrayList4.add(Integer.valueOf(z10 ? R.drawable.msg_admins : R.drawable.msg_permissions));
                arrayList3.add(0);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c51Var.getParentActivity());
                CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
                Typeface typeface = org.telegram.messenger.g0.a;
                size = arrayList4.size();
                int[] iArr = new int[size];
                for (int i13 = 0; i13 < size; i13++) {
                    iArr[i13] = ((Integer) arrayList4.get(i13)).intValue();
                }
                final boolean z12 = z10;
                final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.r41
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i14) {
                        ArrayList arrayList5 = arrayList3;
                        int intValue = ((Integer) arrayList5.get(i14)).intValue();
                        v41 v41Var = v41.this;
                        TLRPC.ChatFull chatFull2 = chatFull;
                        c51 c51Var2 = c51Var;
                        if (intValue != 0) {
                            if (((Integer) arrayList5.get(i14)).intValue() == 2) {
                                v41Var.b(c51Var2);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatFull2.id);
                            bundle.putLong("search_from_user_id", v41Var.a.id);
                            c51Var2.presentFragment(new an(bundle));
                            return;
                        }
                        boolean[] zArr = new boolean[1];
                        long j10 = v41Var.a.id;
                        long j11 = chatFull2.id;
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                        String str2 = channelParticipant2.rank;
                        boolean z13 = z12;
                        t41 t41Var = new t41(v41Var, j10, j11, tL_chatAdminRights2, tL_chatBannedRights, str2, z13, zArr, c51Var2);
                        t41Var.X0 = new u41(tL_chatChannelParticipant4, z13, zArr);
                        c51Var2.presentFragment(t41Var);
                    }
                };
                org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder.a;
                u1Var4.P = charSequenceArr;
                u1Var4.Q = iArr;
                u1Var4.M = onClickListener;
                c51Var.showDialog(u1Var4);
            }
        }
        z10 = false;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(c51Var.getParentActivity());
        CharSequence[] charSequenceArr2 = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
        Typeface typeface2 = org.telegram.messenger.g0.a;
        size = arrayList4.size();
        int[] iArr2 = new int[size];
        while (i13 < size) {
        }
        final boolean z122 = z10;
        final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant32 = tL_chatChannelParticipant;
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.r41
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i14) {
                ArrayList arrayList5 = arrayList3;
                int intValue = ((Integer) arrayList5.get(i14)).intValue();
                v41 v41Var = v41.this;
                TLRPC.ChatFull chatFull2 = chatFull;
                c51 c51Var2 = c51Var;
                if (intValue != 0) {
                    if (((Integer) arrayList5.get(i14)).intValue() == 2) {
                        v41Var.b(c51Var2);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chatFull2.id);
                    bundle.putLong("search_from_user_id", v41Var.a.id);
                    c51Var2.presentFragment(new an(bundle));
                    return;
                }
                boolean[] zArr = new boolean[1];
                long j10 = v41Var.a.id;
                long j11 = chatFull2.id;
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant32;
                TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                String str2 = channelParticipant2.rank;
                boolean z13 = z122;
                t41 t41Var = new t41(v41Var, j10, j11, tL_chatAdminRights2, tL_chatBannedRights, str2, z13, zArr, c51Var2);
                t41Var.X0 = new u41(tL_chatChannelParticipant4, z13, zArr);
                c51Var2.presentFragment(t41Var);
            }
        };
        org.telegram.ui.ActionBar.u1 u1Var42 = alertDialog$Builder2.a;
        u1Var42.P = charSequenceArr2;
        u1Var42.Q = iArr2;
        u1Var42.M = onClickListener2;
        c51Var.showDialog(u1Var42);
    }
}
