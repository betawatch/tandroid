package org.telegram.ui;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xt0 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ org.telegram.messenger.ls d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ xt0(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z9, String str) {
        this.d = profileActivity;
        this.e = channelParticipant;
        this.f = user;
        this.g = chatParticipant;
        this.b = z9;
        this.c = str;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        int i7 = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        org.telegram.messenger.ls lsVar = this.d;
        switch (i7) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) lsVar;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj2;
                Integer num = (Integer) obj;
                RectF rectF = ProfileActivity.V6;
                profileActivity.getClass();
                boolean z9 = this.b;
                if (channelParticipant != null) {
                    profileActivity.R4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z9);
                    break;
                } else {
                    profileActivity.R4(num.intValue(), user, chatParticipant, null, null, this.c, z9);
                    break;
                }
            default:
                t11 t11Var = (t11) lsVar;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj4;
                HashMap hashMap = (HashMap) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                int i10 = t11Var.V;
                boolean z10 = this.b;
                String str = this.c;
                if (z10) {
                    ArrayList s02 = org.telegram.messenger.ui.b0(i10).s0(5);
                    for (int i11 = 0; i11 < s02.size(); i11++) {
                        if (((TLRPC.TL_messages_stickerSet) s02.get(i11)).documents != null && (arrayList2 = ((TLRPC.TL_messages_stickerSet) s02.get(i11)).documents) != null) {
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                String V = org.telegram.messenger.ij.V(arrayList2.get(i12), null, null);
                                long j3 = arrayList2.get(i12).id;
                                if (V != null && !linkedHashSet.contains(Long.valueOf(j3)) && str.contains(V.toLowerCase())) {
                                    linkedHashSet.add(Long.valueOf(j3));
                                }
                            }
                        }
                    }
                    ArrayList arrayList4 = org.telegram.messenger.ui.b0(i10).s0[1];
                    for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                        if ((arrayList4.get(i13) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i13)).keywords != null && (arrayList = ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i13)).documents) != null) {
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                String V2 = org.telegram.messenger.ij.V(arrayList.get(i14), null, null);
                                long j10 = arrayList.get(i14).id;
                                if (V2 != null && !linkedHashSet.contains(Long.valueOf(j10)) && str.contains(V2)) {
                                    linkedHashSet.add(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                    runnable.run();
                    break;
                } else {
                    org.telegram.messenger.ui.b0(i10).V(t11.b2, str, false, new bi.q7(t11Var, linkedHashSet, hashMap, arrayList3, runnable), true, t11Var.W == 3, false, false, 30);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ xt0(t11 t11Var, boolean z9, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.d = t11Var;
        this.b = z9;
        this.e = linkedHashSet;
        this.c = str;
        this.f = hashMap;
        this.g = arrayList;
    }
}
