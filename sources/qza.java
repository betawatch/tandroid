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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qza {
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

    public final void b(d dVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.a.id);
        oc7.r1(z8c.t0).c4(this.a, false, false);
        dVar.presentFragment(new ProfileActivity(bundle, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01be A[LOOP:1: B:70:0x01bc->B:71:0x01be, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final TLRPC.ChatFull chatFull, final xza xzaVar, final he[] heVarArr, boolean z) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
        boolean z2;
        int size;
        String str;
        int i;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        oc7.r1(z8c.t0).c4(this.a, false, false);
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
                if (j == z8c.h(z8c.t0).n && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant2 = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
            }
        }
        b10.r("StatisticOpenProfile", 2131744585, arrayList2, R.drawable.msg_openprofile, arrayList4);
        arrayList3.add(2);
        arrayList2.add(jb6.M0(2131744583, "StatisticSearchUserHistory"));
        arrayList4.add(Integer.valueOf(R.drawable.msg_msgbubble3));
        arrayList3.add(1);
        if (z) {
            if (tL_chatChannelParticipant == null) {
                if (heVarArr[0] == null) {
                    he heVar = new he(3, null, xzaVar.getFragmentView().getContext());
                    heVarArr[0] = heVar;
                    heVar.q(300L);
                }
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = oc7.r1(z8c.t0).g1(chatFull.id);
                tL_channels_getParticipant.participant = oc7.m1(this.a);
                final byte b = 0;
                ConnectionsManager.getInstance(z8c.t0).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) { // from class: lza
                    public final /* synthetic */ qza b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (b) {
                            case 0:
                                final byte b2 = 0;
                                final qza qzaVar = this.b;
                                final xza xzaVar2 = xzaVar;
                                final he[] heVarArr2 = heVarArr;
                                final TLRPC.ChatFull chatFull2 = chatFull;
                                gm.c3(new Runnable() { // from class: nza
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b3 = b2;
                                        TLRPC.ChatFull chatFull3 = chatFull2;
                                        TLObject tLObject2 = tLObject;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        he[] heVarArr3 = heVarArr2;
                                        xza xzaVar3 = xzaVar2;
                                        qza qzaVar2 = qzaVar;
                                        switch (b3) {
                                            case 0:
                                                if (!xzaVar3.isFinishing() && xzaVar3.getFragmentView() != null && heVarArr3[0] != null) {
                                                    if (tL_error2 != null) {
                                                        qzaVar2.c(chatFull3, xzaVar3, heVarArr3, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant3.user_id = qzaVar2.a.id;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        qzaVar2.c(chatFull3, xzaVar3, heVarArr3, true);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                if (!xzaVar3.isFinishing() && xzaVar3.getFragmentView() != null && heVarArr3[0] != null) {
                                                    if (tL_error2 != null) {
                                                        qzaVar2.c(chatFull3, xzaVar3, heVarArr3, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant4.user_id = z8c.h(z8c.t0).n;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        qzaVar2.c(chatFull3, xzaVar3, heVarArr3, true);
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
                                final qza qzaVar2 = this.b;
                                final xza xzaVar3 = xzaVar;
                                final he[] heVarArr3 = heVarArr;
                                final TLRPC.ChatFull chatFull3 = chatFull;
                                gm.c3(new Runnable() { // from class: nza
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b32 = b3;
                                        TLRPC.ChatFull chatFull32 = chatFull3;
                                        TLObject tLObject2 = tLObject;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        he[] heVarArr32 = heVarArr3;
                                        xza xzaVar32 = xzaVar3;
                                        qza qzaVar22 = qzaVar2;
                                        switch (b32) {
                                            case 0:
                                                if (!xzaVar32.isFinishing() && xzaVar32.getFragmentView() != null && heVarArr32[0] != null) {
                                                    if (tL_error2 != null) {
                                                        qzaVar22.c(chatFull32, xzaVar32, heVarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant3.user_id = qzaVar22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        qzaVar22.c(chatFull32, xzaVar32, heVarArr32, true);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                if (!xzaVar32.isFinishing() && xzaVar32.getFragmentView() != null && heVarArr32[0] != null) {
                                                    if (tL_error2 != null) {
                                                        qzaVar22.c(chatFull32, xzaVar32, heVarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant4.user_id = z8c.h(z8c.t0).n;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        qzaVar22.c(chatFull32, xzaVar32, heVarArr32, true);
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
                if (heVarArr[0] == null) {
                    he heVar2 = new he(3, null, xzaVar.getFragmentView().getContext());
                    heVarArr[0] = heVar2;
                    heVar2.q(300L);
                }
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant2.channel = oc7.r1(z8c.t0).g1(chatFull.id);
                tL_channels_getParticipant2.participant = oc7.r1(z8c.t0).i1(z8c.h(z8c.t0).n);
                final byte b2 = 1;
                ConnectionsManager.getInstance(z8c.t0).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) { // from class: lza
                    public final /* synthetic */ qza b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (b2) {
                            case 0:
                                final byte b22 = 0;
                                final qza qzaVar = this.b;
                                final xza xzaVar2 = xzaVar;
                                final he[] heVarArr2 = heVarArr;
                                final TLRPC.ChatFull chatFull2 = chatFull;
                                gm.c3(new Runnable() { // from class: nza
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b32 = b22;
                                        TLRPC.ChatFull chatFull32 = chatFull2;
                                        TLObject tLObject2 = tLObject;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        he[] heVarArr32 = heVarArr2;
                                        xza xzaVar32 = xzaVar2;
                                        qza qzaVar22 = qzaVar;
                                        switch (b32) {
                                            case 0:
                                                if (!xzaVar32.isFinishing() && xzaVar32.getFragmentView() != null && heVarArr32[0] != null) {
                                                    if (tL_error2 != null) {
                                                        qzaVar22.c(chatFull32, xzaVar32, heVarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant3.user_id = qzaVar22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        qzaVar22.c(chatFull32, xzaVar32, heVarArr32, true);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                if (!xzaVar32.isFinishing() && xzaVar32.getFragmentView() != null && heVarArr32[0] != null) {
                                                    if (tL_error2 != null) {
                                                        qzaVar22.c(chatFull32, xzaVar32, heVarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant4.user_id = z8c.h(z8c.t0).n;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        qzaVar22.c(chatFull32, xzaVar32, heVarArr32, true);
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
                                final qza qzaVar2 = this.b;
                                final xza xzaVar3 = xzaVar;
                                final he[] heVarArr3 = heVarArr;
                                final TLRPC.ChatFull chatFull3 = chatFull;
                                gm.c3(new Runnable() { // from class: nza
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b32 = b3;
                                        TLRPC.ChatFull chatFull32 = chatFull3;
                                        TLObject tLObject2 = tLObject;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        he[] heVarArr32 = heVarArr3;
                                        xza xzaVar32 = xzaVar3;
                                        qza qzaVar22 = qzaVar2;
                                        switch (b32) {
                                            case 0:
                                                if (!xzaVar32.isFinishing() && xzaVar32.getFragmentView() != null && heVarArr32[0] != null) {
                                                    if (tL_error2 != null) {
                                                        qzaVar22.c(chatFull32, xzaVar32, heVarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant3.user_id = qzaVar22.a.id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        qzaVar22.c(chatFull32, xzaVar32, heVarArr32, true);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                if (!xzaVar32.isFinishing() && xzaVar32.getFragmentView() != null && heVarArr32[0] != null) {
                                                    if (tL_error2 != null) {
                                                        qzaVar22.c(chatFull32, xzaVar32, heVarArr32, false);
                                                        break;
                                                    } else {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                                        tL_chatChannelParticipant4.user_id = z8c.h(z8c.t0).n;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        qzaVar22.c(chatFull32, xzaVar32, heVarArr32, true);
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
        he heVar3 = heVarArr[0];
        if (heVar3 != null) {
            heVar3.dismiss();
            heVarArr[0] = null;
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
                    i = 2131745281;
                } else {
                    str = "EditAdminRights";
                    i = 2131751241;
                }
                arrayList2.add(jb6.M0(i, str));
                arrayList4.add(Integer.valueOf(z2 ? R.drawable.msg_admins : R.drawable.msg_permissions));
                arrayList3.add(0);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xzaVar.getParentActivity());
                CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
                Typeface typeface = gm.a;
                size = arrayList4.size();
                int[] iArr = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr[i3] = ((Integer) arrayList4.get(i3)).intValue();
                }
                final boolean z4 = z2;
                final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: mza
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        ArrayList arrayList5 = arrayList3;
                        int intValue = ((Integer) arrayList5.get(i4)).intValue();
                        qza qzaVar = qza.this;
                        TLRPC.ChatFull chatFull2 = chatFull;
                        xza xzaVar2 = xzaVar;
                        if (intValue != 0) {
                            if (((Integer) arrayList5.get(i4)).intValue() == 2) {
                                qzaVar.b(xzaVar2);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatFull2.id);
                            bundle.putLong("search_from_user_id", qzaVar.a.id);
                            xzaVar2.presentFragment(new yv1(bundle));
                            return;
                        }
                        boolean[] zArr = new boolean[1];
                        long j2 = qzaVar.a.id;
                        long j3 = chatFull2.id;
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                        String str2 = channelParticipant2.rank;
                        boolean z5 = z4;
                        oza ozaVar = new oza(qzaVar, j2, j3, tL_chatAdminRights2, tL_chatBannedRights, str2, z5, zArr, xzaVar2);
                        ozaVar.Y0 = new pza(tL_chatChannelParticipant4, z5, zArr);
                        xzaVar2.presentFragment(ozaVar);
                    }
                };
                he heVar4 = alertDialog$Builder.a;
                heVar4.Q = charSequenceArr;
                heVar4.R = iArr;
                heVar4.N = onClickListener;
                xzaVar.showDialog(heVar4);
            }
        }
        z2 = false;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xzaVar.getParentActivity());
        CharSequence[] charSequenceArr2 = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
        Typeface typeface2 = gm.a;
        size = arrayList4.size();
        int[] iArr2 = new int[size];
        while (i3 < size) {
        }
        final boolean z42 = z2;
        final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant32 = tL_chatChannelParticipant;
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: mza
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                ArrayList arrayList5 = arrayList3;
                int intValue = ((Integer) arrayList5.get(i4)).intValue();
                qza qzaVar = qza.this;
                TLRPC.ChatFull chatFull2 = chatFull;
                xza xzaVar2 = xzaVar;
                if (intValue != 0) {
                    if (((Integer) arrayList5.get(i4)).intValue() == 2) {
                        qzaVar.b(xzaVar2);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chatFull2.id);
                    bundle.putLong("search_from_user_id", qzaVar.a.id);
                    xzaVar2.presentFragment(new yv1(bundle));
                    return;
                }
                boolean[] zArr = new boolean[1];
                long j2 = qzaVar.a.id;
                long j3 = chatFull2.id;
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant32;
                TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                String str2 = channelParticipant2.rank;
                boolean z5 = z42;
                oza ozaVar = new oza(qzaVar, j2, j3, tL_chatAdminRights2, tL_chatBannedRights, str2, z5, zArr, xzaVar2);
                ozaVar.Y0 = new pza(tL_chatChannelParticipant4, z5, zArr);
                xzaVar2.presentFragment(ozaVar);
            }
        };
        he heVar42 = alertDialog$Builder2.a;
        heVar42.Q = charSequenceArr2;
        heVar42.R = iArr2;
        heVar42.N = onClickListener2;
        xzaVar.showDialog(heVar42);
    }
}
