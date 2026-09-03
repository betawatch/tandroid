package uf;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class i extends cg.b {
    public final TLRPC.Dialog c;
    public final TLRPC.RecentMeUrl d;
    public final TLRPC.TL_contact e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final TL_chatlists.TL_chatlists_chatlistUpdates i;
    public final int j;
    public final int k;
    public final String l;
    public final TLRPC.Chat m;
    public final TLRPC.User n;

    public i(k kVar, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.i = tL_chatlists_chatlistUpdates;
        int i10 = kVar.T;
        kVar.T = i10 + 1;
        this.k = i10;
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.m, this.d, this.e, this.l);
    }

    public i(k kVar, String str) {
        super(22, false);
        HashMap hashMap = kVar.V;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            this.k = num.intValue();
        } else {
            int i10 = kVar.T;
            kVar.T = i10 + 1;
            this.k = i10;
            hashMap.put(str, Integer.valueOf(i10));
        }
        this.l = str;
    }

    public i(k kVar, TLRPC.User user) {
        super(23, false);
        this.n = user;
        long j10 = user.id;
        LongSparseIntArray longSparseIntArray = kVar.U;
        int i10 = longSparseIntArray.get(j10, -1);
        if (i10 >= 0) {
            this.k = i10;
            return;
        }
        int i11 = kVar.T;
        kVar.T = i11 + 1;
        this.k = i11;
        longSparseIntArray.put(user.id, i11);
    }

    public i(k kVar, TLRPC.Chat chat) {
        super(23, false);
        this.m = chat;
        long j10 = chat.id;
        LongSparseIntArray longSparseIntArray = kVar.U;
        int i10 = longSparseIntArray.get(-j10, -1);
        if (i10 >= 0) {
            this.k = i10;
            return;
        }
        int i11 = kVar.T;
        kVar.T = i11 + 1;
        this.k = i11;
        longSparseIntArray.put(-chat.id, i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, int i10, TLRPC.Dialog dialog) {
        super(i10, true);
        LongSparseIntArray longSparseIntArray = kVar.U;
        this.c = dialog;
        if (dialog != null) {
            int i11 = longSparseIntArray.get(dialog.id, -1);
            if (i11 >= 0) {
                this.k = i11;
            } else {
                int i12 = kVar.T;
                kVar.T = i12 + 1;
                this.k = i12;
                longSparseIntArray.put(dialog.id, i12);
            }
        } else if (i10 == 19) {
            this.k = 5;
        } else {
            int i13 = kVar.T;
            kVar.T = i13 + 1;
            this.k = i13;
        }
        if (dialog != null) {
            int i14 = kVar.h;
            int i15 = kVar.C;
            if (i14 != 7 && i14 != 8) {
                this.g = dialog.pinned;
            } else {
                MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i15).selectedDialogFilter[kVar.h == 8 ? (char) 1 : (char) 0];
                this.g = dialogFilter != null && dialogFilter.pinnedDialogs.indexOfKey(dialog.id) >= 0;
            }
            this.h = dialog.isFolder;
            this.f = MessagesController.getInstance(i15).isForum(dialog.id);
        }
    }

    public i(k kVar, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i10 = kVar.T;
        kVar.T = i10 + 1;
        this.k = i10;
    }

    public i(k kVar, int i10) {
        super(i10, true);
        this.j = i10;
        if (i10 == 10) {
            this.k = 1;
        } else {
            if (i10 == 19) {
                this.k = 5;
                return;
            }
            int i11 = kVar.T;
            kVar.T = i11 + 1;
            this.k = i11;
        }
    }

    public i(k kVar, int i10, int i11) {
        super(5, true);
        this.j = i10;
        int i12 = kVar.T;
        kVar.T = i12 + 1;
        this.k = i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = kVar.U;
        this.e = tL_contact;
        if (tL_contact != null) {
            int i10 = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i10 > 0) {
                this.k = i10;
                return;
            }
            int i11 = kVar.T;
            kVar.T = i11 + 1;
            this.k = i11;
            longSparseIntArray.put(tL_contact.user_id, i11);
            return;
        }
        int i12 = kVar.T;
        kVar.T = i12 + 1;
        this.k = i12;
    }
}
