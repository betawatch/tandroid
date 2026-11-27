// default package

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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class p1b {
    public TLRPC.User a;
    public String b;

    public static TLRPC.User a(ArrayList arrayList, long j) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.id == j) {
                return user;
            }
        }
        return null;
    }

    public final void b(e eVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.a.id);
        uc7.s1(yac.t0).i4(this.a, false, false);
        eVar.presentFragment(new ProfileActivity(bundle, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01be A[LOOP:1: B:70:0x01bc->B:71:0x01be, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final TLRPC.ChatFull chatFull, final w1b w1bVar, final id[] idVarArr, boolean z) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
        boolean z2;
        int size;
        String str;
        int i;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        uc7.s1(yac.t0).i4(this.a, false, false);
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (!z || (arrayList = chatFull.participants.participants) == null) {
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
        } else {
            int size2 = arrayList.size();
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
            for (int i2 = 0; i2 < size2; i2++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i2);
                long j = chatParticipant.user_id;
                if (j == this.a.id && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
                if (j == yac.h(yac.t0).n && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant2 = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
            }
        }
        c00.s("StatisticOpenProfile", 2131744553, arrayList2, R.drawable.msg_openprofile, arrayList4);
        arrayList3.add(2);
        arrayList2.add(ob6.M0(2131744551, "StatisticSearchUserHistory"));
        arrayList4.add(Integer.valueOf(R.drawable.msg_msgbubble3));
        arrayList3.add(1);
        if (z) {
            if (tL_chatChannelParticipant == null) {
                if (idVarArr[0] == null) {
                    id idVar = new id(3, null, w1bVar.getFragmentView().getContext());
                    idVarArr[0] = idVar;
                    idVar.q(300L);
                }
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = uc7.s1(yac.t0).h1(chatFull.id);
                tL_channels_getParticipant.participant = uc7.n1(this.a);
                final byte b = 0;
                ConnectionsManager.getInstance(yac.t0).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) { // from class: k1b
                    public final /* synthetic */ p1b b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (b) {
                            case 0:
                                final byte b2 = 0;
                                final p1b p1bVar = this.b;
                                final w1b w1bVar2 = w1bVar;
                                final id[] idVarArr2 = idVarArr;
                                final TLRPC.ChatFull chatFull2 = chatFull;
                                hl.c3(new Runnable() { // from class: m1b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b3 = b2;
                                        TLRPC.ChatFull chatFull3 = chatFull2;
                                        TLObject tLObject2 = tLObject;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        id[] idVarArr3 = idVarArr2;
                                        w1b w1bVar3 = w1bVar2;
                                        p1b p1bVar2 = p1bVar;
                                        switch (b3) {
                                            case 0:
                                                if (!w1bVar3.isFinishing() && w1bVar3.getFragmentView() != null && idVarArr3[0] != null) {
                                                    if (tL_error2 != null) {
                                                        p1bVar2.c(chatFull3, w1bVar3, idVarArr3, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant3.user_id = p1bVar2.a.id;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        p1bVar2.c(chatFull3, w1bVar3, idVarArr3, true);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                if (!w1bVar3.isFinishing() && w1bVar3.getFragmentView() != null && idVarArr3[0] != null) {
                                                    if (tL_error2 != null) {
                                                        p1bVar2.c(chatFull3, w1bVar3, idVarArr3, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant4.user_id = yac.h(yac.t0).n;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        p1bVar2.c(chatFull3, w1bVar3, idVarArr3, true);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final byte b3 = 1;
                                final p1b p1bVar2 = this.b;
                                final w1b w1bVar3 = w1bVar;
                                final id[] idVarArr3 = idVarArr;
                                final TLRPC.ChatFull chatFull3 = chatFull;
                                hl.c3(new Runnable() { // from class: m1b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b32 = b3;
                                        TLRPC.ChatFull chatFull32 = chatFull3;
                                        TLObject tLObject2 = tLObject;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        id[] idVarArr32 = idVarArr3;
                                        w1b w1bVar32 = w1bVar3;
                                        p1b p1bVar22 = p1bVar2;
                                        switch (b32) {
                                            case 0:
                                                if (!w1bVar32.isFinishing() && w1bVar32.getFragmentView() != null && idVarArr32[0] != null) {
                                                    if (tL_error2 != null) {
                                                        p1bVar22.c(chatFull32, w1bVar32, idVarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant3.user_id = p1bVar22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        p1bVar22.c(chatFull32, w1bVar32, idVarArr32, true);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                if (!w1bVar32.isFinishing() && w1bVar32.getFragmentView() != null && idVarArr32[0] != null) {
                                                    if (tL_error2 != null) {
                                                        p1bVar22.c(chatFull32, w1bVar32, idVarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant4.user_id = yac.h(yac.t0).n;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        p1bVar22.c(chatFull32, w1bVar32, idVarArr32, true);
                                                        break;
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
            if (tL_chatChannelParticipant2 == null) {
                if (idVarArr[0] == null) {
                    id idVar2 = new id(3, null, w1bVar.getFragmentView().getContext());
                    idVarArr[0] = idVar2;
                    idVar2.q(300L);
                }
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant2.channel = uc7.s1(yac.t0).h1(chatFull.id);
                tL_channels_getParticipant2.participant = uc7.s1(yac.t0).j1(yac.h(yac.t0).n);
                final byte b2 = 1;
                ConnectionsManager.getInstance(yac.t0).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) { // from class: k1b
                    public final /* synthetic */ p1b b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (b2) {
                            case 0:
                                final byte b22 = 0;
                                final p1b p1bVar = this.b;
                                final w1b w1bVar2 = w1bVar;
                                final id[] idVarArr2 = idVarArr;
                                final TLRPC.ChatFull chatFull2 = chatFull;
                                hl.c3(new Runnable() { // from class: m1b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b32 = b22;
                                        TLRPC.ChatFull chatFull32 = chatFull2;
                                        TLObject tLObject2 = tLObject;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        id[] idVarArr32 = idVarArr2;
                                        w1b w1bVar32 = w1bVar2;
                                        p1b p1bVar22 = p1bVar;
                                        switch (b32) {
                                            case 0:
                                                if (!w1bVar32.isFinishing() && w1bVar32.getFragmentView() != null && idVarArr32[0] != null) {
                                                    if (tL_error2 != null) {
                                                        p1bVar22.c(chatFull32, w1bVar32, idVarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant3.user_id = p1bVar22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        p1bVar22.c(chatFull32, w1bVar32, idVarArr32, true);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                if (!w1bVar32.isFinishing() && w1bVar32.getFragmentView() != null && idVarArr32[0] != null) {
                                                    if (tL_error2 != null) {
                                                        p1bVar22.c(chatFull32, w1bVar32, idVarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant4.user_id = yac.h(yac.t0).n;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        p1bVar22.c(chatFull32, w1bVar32, idVarArr32, true);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final byte b3 = 1;
                                final p1b p1bVar2 = this.b;
                                final w1b w1bVar3 = w1bVar;
                                final id[] idVarArr3 = idVarArr;
                                final TLRPC.ChatFull chatFull3 = chatFull;
                                hl.c3(new Runnable() { // from class: m1b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b32 = b3;
                                        TLRPC.ChatFull chatFull32 = chatFull3;
                                        TLObject tLObject2 = tLObject;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        id[] idVarArr32 = idVarArr3;
                                        w1b w1bVar32 = w1bVar3;
                                        p1b p1bVar22 = p1bVar2;
                                        switch (b32) {
                                            case 0:
                                                if (!w1bVar32.isFinishing() && w1bVar32.getFragmentView() != null && idVarArr32[0] != null) {
                                                    if (tL_error2 != null) {
                                                        p1bVar22.c(chatFull32, w1bVar32, idVarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant3.user_id = p1bVar22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        p1bVar22.c(chatFull32, w1bVar32, idVarArr32, true);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                if (!w1bVar32.isFinishing() && w1bVar32.getFragmentView() != null && idVarArr32[0] != null) {
                                                    if (tL_error2 != null) {
                                                        p1bVar22.c(chatFull32, w1bVar32, idVarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant4.user_id = yac.h(yac.t0).n;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        p1bVar22.c(chatFull32, w1bVar32, idVarArr32, true);
                                                        break;
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
        }
        id idVar3 = idVarArr[0];
        if (idVar3 != null) {
            idVar3.dismiss();
            idVarArr[0] = null;
        }
        if (tL_chatChannelParticipant2 != null && tL_chatChannelParticipant != null && tL_chatChannelParticipant2.user_id != tL_chatChannelParticipant.user_id) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = tL_chatChannelParticipant2.channelParticipant.admin_rights;
            boolean z3 = tL_chatAdminRights != null && tL_chatAdminRights.add_admins;
            if (z3 && ((channelParticipant instanceof TLRPC.TL_channelParticipantCreator) || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit))) {
                z3 = false;
            }
            if (z3) {
                z2 = channelParticipant.admin_rights == null;
                if (z2) {
                    str = "SetAsAdmin";
                    i = 2131745275;
                } else {
                    str = "EditAdminRights";
                    i = 2131751269;
                }
                arrayList2.add(ob6.M0(i, str));
                arrayList4.add(Integer.valueOf(z2 ? R.drawable.msg_admins : R.drawable.msg_permissions));
                arrayList3.add(0);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w1bVar.getParentActivity());
                CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
                Typeface typeface = hl.a;
                size = arrayList4.size();
                int[] iArr = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr[i3] = ((Integer) arrayList4.get(i3)).intValue();
                }
                final boolean z4 = z2;
                final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l1b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        ArrayList arrayList5 = arrayList3;
                        int intValue = ((Integer) arrayList5.get(i4)).intValue();
                        p1b p1bVar = p1b.this;
                        TLRPC.ChatFull chatFull2 = chatFull;
                        w1b w1bVar2 = w1bVar;
                        if (intValue != 0) {
                            if (((Integer) arrayList5.get(i4)).intValue() == 2) {
                                p1bVar.b(w1bVar2);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatFull2.id);
                            bundle.putLong("search_from_user_id", p1bVar.a.id);
                            w1bVar2.presentFragment(new zu1(bundle));
                            return;
                        }
                        boolean[] zArr = new boolean[1];
                        long j2 = p1bVar.a.id;
                        long j3 = chatFull2.id;
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                        String str2 = channelParticipant2.rank;
                        boolean z5 = z4;
                        n1b n1bVar = new n1b(p1bVar, j2, j3, tL_chatAdminRights2, tL_chatBannedRights, str2, z5, zArr, w1bVar2);
                        n1bVar.Y0 = new o1b(tL_chatChannelParticipant4, z5, zArr);
                        w1bVar2.presentFragment(n1bVar);
                    }
                };
                id idVar4 = alertDialog$Builder.a;
                idVar4.Q = charSequenceArr;
                idVar4.R = iArr;
                idVar4.N = onClickListener;
                w1bVar.showDialog(idVar4);
            }
        }
        z2 = false;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(w1bVar.getParentActivity());
        CharSequence[] charSequenceArr2 = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
        Typeface typeface2 = hl.a;
        size = arrayList4.size();
        int[] iArr2 = new int[size];
        while (i3 < size) {
        }
        final boolean z42 = z2;
        final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant32 = tL_chatChannelParticipant;
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: l1b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                ArrayList arrayList5 = arrayList3;
                int intValue = ((Integer) arrayList5.get(i4)).intValue();
                p1b p1bVar = p1b.this;
                TLRPC.ChatFull chatFull2 = chatFull;
                w1b w1bVar2 = w1bVar;
                if (intValue != 0) {
                    if (((Integer) arrayList5.get(i4)).intValue() == 2) {
                        p1bVar.b(w1bVar2);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chatFull2.id);
                    bundle.putLong("search_from_user_id", p1bVar.a.id);
                    w1bVar2.presentFragment(new zu1(bundle));
                    return;
                }
                boolean[] zArr = new boolean[1];
                long j2 = p1bVar.a.id;
                long j3 = chatFull2.id;
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant32;
                TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                String str2 = channelParticipant2.rank;
                boolean z5 = z42;
                n1b n1bVar = new n1b(p1bVar, j2, j3, tL_chatAdminRights2, tL_chatBannedRights, str2, z5, zArr, w1bVar2);
                n1bVar.Y0 = new o1b(tL_chatChannelParticipant4, z5, zArr);
                w1bVar2.presentFragment(n1bVar);
            }
        };
        id idVar42 = alertDialog$Builder2.a;
        idVar42.Q = charSequenceArr2;
        idVar42.R = iArr2;
        idVar42.N = onClickListener2;
        w1bVar.showDialog(idVar42);
    }
}
