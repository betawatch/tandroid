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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s41 {
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

    public final void b(org.telegram.ui.ActionBar.e2 e2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.a.id);
        org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).X3(this.a, false, false);
        e2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01c1 A[LOOP:1: B:70:0x01bf->B:71:0x01c1, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final TLRPC.ChatFull chatFull, final z41 z41Var, final org.telegram.ui.ActionBar.t1[] t1VarArr, boolean z10) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
        boolean z11;
        int size;
        String str;
        int i7;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).X3(this.a, false, false);
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (!z10 || (arrayList = chatFull.participants.participants) == null) {
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
                if (j3 == org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).n && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant2 = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
            }
        }
        org.telegram.ui.Cells.y0.s("StatisticOpenProfile", 2131744896, arrayList2, R.drawable.msg_openprofile, arrayList4);
        arrayList3.add(2);
        arrayList2.add(org.telegram.messenger.hd.M0(2131744894, "StatisticSearchUserHistory"));
        arrayList4.add(Integer.valueOf(R.drawable.msg_msgbubble3));
        arrayList3.add(1);
        if (z10 && tL_chatChannelParticipant == null) {
            if (t1VarArr[0] == null) {
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, z41Var.getFragmentView().getContext(), null);
                t1VarArr[0] = t1Var;
                t1Var.r(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).h1(chatFull.id);
            tL_channels_getParticipant.participant = org.telegram.messenger.np.n1(this.a);
            final int i11 = 0;
            ConnectionsManager.getInstance(org.telegram.messenger.m10.t0).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) { // from class: org.telegram.ui.n41
                public final /* synthetic */ s41 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            final int i12 = 0;
                            final s41 s41Var = this.b;
                            final z41 z41Var2 = z41Var;
                            final org.telegram.ui.ActionBar.t1[] t1VarArr2 = t1VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.p41
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            s41 s41Var2 = s41Var;
                                            s41Var2.getClass();
                                            z41 z41Var3 = z41Var2;
                                            if (!z41Var3.isFinishing() && z41Var3.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.t1[] t1VarArr3 = t1VarArr2;
                                                if (t1VarArr3[0] != null) {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull3 = chatFull2;
                                                    if (tL_error2 != null) {
                                                        s41Var2.c(chatFull3, z41Var3, t1VarArr3, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = s41Var2.a.id;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        s41Var2.c(chatFull3, z41Var3, t1VarArr3, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            s41 s41Var3 = s41Var;
                                            s41Var3.getClass();
                                            z41 z41Var4 = z41Var2;
                                            if (!z41Var4.isFinishing() && z41Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.t1[] t1VarArr4 = t1VarArr2;
                                                if (t1VarArr4[0] != null) {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 != null) {
                                                        s41Var3.c(chatFull4, z41Var4, t1VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).n;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        s41Var3.c(chatFull4, z41Var4, t1VarArr4, true);
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
                            final s41 s41Var2 = this.b;
                            final z41 z41Var3 = z41Var;
                            final org.telegram.ui.ActionBar.t1[] t1VarArr3 = t1VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.p41
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            s41 s41Var22 = s41Var2;
                                            s41Var22.getClass();
                                            z41 z41Var32 = z41Var3;
                                            if (!z41Var32.isFinishing() && z41Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.t1[] t1VarArr32 = t1VarArr3;
                                                if (t1VarArr32[0] != null) {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 != null) {
                                                        s41Var22.c(chatFull32, z41Var32, t1VarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = s41Var22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        s41Var22.c(chatFull32, z41Var32, t1VarArr32, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            s41 s41Var3 = s41Var2;
                                            s41Var3.getClass();
                                            z41 z41Var4 = z41Var3;
                                            if (!z41Var4.isFinishing() && z41Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.t1[] t1VarArr4 = t1VarArr3;
                                                if (t1VarArr4[0] != null) {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 != null) {
                                                        s41Var3.c(chatFull4, z41Var4, t1VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).n;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        s41Var3.c(chatFull4, z41Var4, t1VarArr4, true);
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
            if (t1VarArr[0] == null) {
                org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, z41Var.getFragmentView().getContext(), null);
                t1VarArr[0] = t1Var2;
                t1Var2.r(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant2.channel = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).h1(chatFull.id);
            tL_channels_getParticipant2.participant = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).j1(org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).n);
            final int i12 = 1;
            ConnectionsManager.getInstance(org.telegram.messenger.m10.t0).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) { // from class: org.telegram.ui.n41
                public final /* synthetic */ s41 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i122 = 0;
                            final s41 s41Var = this.b;
                            final z41 z41Var2 = z41Var;
                            final org.telegram.ui.ActionBar.t1[] t1VarArr2 = t1VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.p41
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i122) {
                                        case 0:
                                            s41 s41Var22 = s41Var;
                                            s41Var22.getClass();
                                            z41 z41Var32 = z41Var2;
                                            if (!z41Var32.isFinishing() && z41Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.t1[] t1VarArr32 = t1VarArr2;
                                                if (t1VarArr32[0] != null) {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull2;
                                                    if (tL_error2 != null) {
                                                        s41Var22.c(chatFull32, z41Var32, t1VarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = s41Var22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        s41Var22.c(chatFull32, z41Var32, t1VarArr32, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            s41 s41Var3 = s41Var;
                                            s41Var3.getClass();
                                            z41 z41Var4 = z41Var2;
                                            if (!z41Var4.isFinishing() && z41Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.t1[] t1VarArr4 = t1VarArr2;
                                                if (t1VarArr4[0] != null) {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 != null) {
                                                        s41Var3.c(chatFull4, z41Var4, t1VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).n;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        s41Var3.c(chatFull4, z41Var4, t1VarArr4, true);
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
                            final s41 s41Var2 = this.b;
                            final z41 z41Var3 = z41Var;
                            final org.telegram.ui.ActionBar.t1[] t1VarArr3 = t1VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.p41
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            s41 s41Var22 = s41Var2;
                                            s41Var22.getClass();
                                            z41 z41Var32 = z41Var3;
                                            if (!z41Var32.isFinishing() && z41Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.t1[] t1VarArr32 = t1VarArr3;
                                                if (t1VarArr32[0] != null) {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 != null) {
                                                        s41Var22.c(chatFull32, z41Var32, t1VarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                        tL_chatChannelParticipant3.user_id = s41Var22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        s41Var22.c(chatFull32, z41Var32, t1VarArr32, true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            s41 s41Var3 = s41Var2;
                                            s41Var3.getClass();
                                            z41 z41Var4 = z41Var3;
                                            if (!z41Var4.isFinishing() && z41Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.t1[] t1VarArr4 = t1VarArr3;
                                                if (t1VarArr4[0] != null) {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 != null) {
                                                        s41Var3.c(chatFull4, z41Var4, t1VarArr4, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                        tL_chatChannelParticipant4.user_id = org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).n;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        s41Var3.c(chatFull4, z41Var4, t1VarArr4, true);
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
        org.telegram.ui.ActionBar.t1 t1Var3 = t1VarArr[0];
        if (t1Var3 != null) {
            t1Var3.dismiss();
            t1VarArr[0] = null;
        }
        if (tL_chatChannelParticipant2 != null && tL_chatChannelParticipant != null && tL_chatChannelParticipant2.user_id != tL_chatChannelParticipant.user_id) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = tL_chatChannelParticipant2.channelParticipant.admin_rights;
            boolean z12 = tL_chatAdminRights != null && tL_chatAdminRights.add_admins;
            if (z12 && ((channelParticipant instanceof TLRPC.TL_channelParticipantCreator) || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit))) {
                z12 = false;
            }
            if (z12) {
                z11 = channelParticipant.admin_rights == null;
                if (z11) {
                    str = "SetAsAdmin";
                    i7 = 2131745547;
                } else {
                    str = "EditAdminRights";
                    i7 = 2131751304;
                }
                arrayList2.add(org.telegram.messenger.hd.M0(i7, str));
                arrayList4.add(Integer.valueOf(z11 ? R.drawable.msg_admins : R.drawable.msg_permissions));
                arrayList3.add(0);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z41Var.getParentActivity());
                CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
                Typeface typeface = org.telegram.messenger.g0.a;
                size = arrayList4.size();
                int[] iArr = new int[size];
                for (int i13 = 0; i13 < size; i13++) {
                    iArr[i13] = ((Integer) arrayList4.get(i13)).intValue();
                }
                final boolean z13 = z11;
                final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.o41
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i14) {
                        ArrayList arrayList5 = arrayList3;
                        int intValue = ((Integer) arrayList5.get(i14)).intValue();
                        s41 s41Var = s41.this;
                        TLRPC.ChatFull chatFull2 = chatFull;
                        z41 z41Var2 = z41Var;
                        if (intValue != 0) {
                            if (((Integer) arrayList5.get(i14)).intValue() == 2) {
                                s41Var.b(z41Var2);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatFull2.id);
                            bundle.putLong("search_from_user_id", s41Var.a.id);
                            z41Var2.presentFragment(new an(bundle));
                            return;
                        }
                        boolean[] zArr = new boolean[1];
                        long j10 = s41Var.a.id;
                        long j11 = chatFull2.id;
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                        String str2 = channelParticipant2.rank;
                        boolean z14 = z13;
                        q41 q41Var = new q41(s41Var, j10, j11, tL_chatAdminRights2, tL_chatBannedRights, str2, z14, zArr, z41Var2);
                        q41Var.Y0 = new r41(tL_chatChannelParticipant4, z14, zArr);
                        z41Var2.presentFragment(q41Var);
                    }
                };
                org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder.a;
                t1Var4.Q = charSequenceArr;
                t1Var4.R = iArr;
                t1Var4.N = onClickListener;
                z41Var.showDialog(t1Var4);
            }
        }
        z11 = false;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(z41Var.getParentActivity());
        CharSequence[] charSequenceArr2 = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
        Typeface typeface2 = org.telegram.messenger.g0.a;
        size = arrayList4.size();
        int[] iArr2 = new int[size];
        while (i13 < size) {
        }
        final boolean z132 = z11;
        final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant32 = tL_chatChannelParticipant;
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.o41
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i14) {
                ArrayList arrayList5 = arrayList3;
                int intValue = ((Integer) arrayList5.get(i14)).intValue();
                s41 s41Var = s41.this;
                TLRPC.ChatFull chatFull2 = chatFull;
                z41 z41Var2 = z41Var;
                if (intValue != 0) {
                    if (((Integer) arrayList5.get(i14)).intValue() == 2) {
                        s41Var.b(z41Var2);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chatFull2.id);
                    bundle.putLong("search_from_user_id", s41Var.a.id);
                    z41Var2.presentFragment(new an(bundle));
                    return;
                }
                boolean[] zArr = new boolean[1];
                long j10 = s41Var.a.id;
                long j11 = chatFull2.id;
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant32;
                TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                String str2 = channelParticipant2.rank;
                boolean z14 = z132;
                q41 q41Var = new q41(s41Var, j10, j11, tL_chatAdminRights2, tL_chatBannedRights, str2, z14, zArr, z41Var2);
                q41Var.Y0 = new r41(tL_chatChannelParticipant4, z14, zArr);
                z41Var2.presentFragment(q41Var);
            }
        };
        org.telegram.ui.ActionBar.t1 t1Var42 = alertDialog$Builder2.a;
        t1Var42.Q = charSequenceArr2;
        t1Var42.R = iArr2;
        t1Var42.N = onClickListener2;
        z41Var.showDialog(t1Var42);
    }
}
