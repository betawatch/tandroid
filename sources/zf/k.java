package zf;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.ap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k extends hg.b {
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

    public k(m mVar, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.i = tL_chatlists_chatlistUpdates;
        int i10 = mVar.W;
        mVar.W = i10 + 1;
        this.k = i10;
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.m, this.d, this.e, this.l);
    }

    public k(m mVar, String str) {
        super(22, false);
        HashMap hashMap = mVar.Y;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            this.k = num.intValue();
        } else {
            int i10 = mVar.W;
            mVar.W = i10 + 1;
            this.k = i10;
            hashMap.put(str, Integer.valueOf(i10));
        }
        this.l = str;
    }

    public k(m mVar, TLRPC.User user) {
        super(23, false);
        this.n = user;
        long j10 = user.id;
        LongSparseIntArray longSparseIntArray = mVar.X;
        int i10 = longSparseIntArray.get(j10, -1);
        if (i10 >= 0) {
            this.k = i10;
            return;
        }
        int i11 = mVar.W;
        mVar.W = i11 + 1;
        this.k = i11;
        longSparseIntArray.put(user.id, i11);
    }

    public k(m mVar, TLRPC.Chat chat) {
        super(23, false);
        this.m = chat;
        long j10 = chat.id;
        LongSparseIntArray longSparseIntArray = mVar.X;
        int i10 = longSparseIntArray.get(-j10, -1);
        if (i10 >= 0) {
            this.k = i10;
            return;
        }
        int i11 = mVar.W;
        mVar.W = i11 + 1;
        this.k = i11;
        longSparseIntArray.put(-chat.id, i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, int i10, TLRPC.Dialog dialog) {
        super(i10, true);
        LongSparseIntArray longSparseIntArray = mVar.X;
        this.c = dialog;
        if (dialog != null) {
            int i11 = longSparseIntArray.get(dialog.id, -1);
            if (i11 >= 0) {
                this.k = i11;
            } else {
                int i12 = mVar.W;
                mVar.W = i12 + 1;
                this.k = i12;
                longSparseIntArray.put(dialog.id, i12);
            }
        } else if (i10 == 19) {
            this.k = 5;
        } else {
            int i13 = mVar.W;
            mVar.W = i13 + 1;
            this.k = i13;
        }
        if (dialog != null) {
            int i14 = mVar.h;
            int i15 = mVar.F;
            if (i14 != 7 && i14 != 8) {
                this.g = dialog.pinned;
            } else {
                ap apVar = vp.r1(i15).M[mVar.h == 8 ? (char) 1 : (char) 0];
                this.g = apVar != null && apVar.j.indexOfKey(dialog.id) >= 0;
            }
            this.h = dialog.isFolder;
            this.f = vp.r1(i15).s2(dialog.id);
        }
    }

    public k(m mVar, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i10 = mVar.W;
        mVar.W = i10 + 1;
        this.k = i10;
    }

    public k(m mVar, int i10) {
        super(i10, true);
        this.j = i10;
        if (i10 == 10) {
            this.k = 1;
        } else {
            if (i10 == 19) {
                this.k = 5;
                return;
            }
            int i11 = mVar.W;
            mVar.W = i11 + 1;
            this.k = i11;
        }
    }

    public k(m mVar, int i10, int i11) {
        super(5, true);
        this.j = i10;
        int i12 = mVar.W;
        mVar.W = i12 + 1;
        this.k = i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = mVar.X;
        this.e = tL_contact;
        if (tL_contact != null) {
            int i10 = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i10 > 0) {
                this.k = i10;
                return;
            }
            int i11 = mVar.W;
            mVar.W = i11 + 1;
            this.k = i11;
            longSparseIntArray.put(tL_contact.user_id, i11);
            return;
        }
        int i12 = mVar.W;
        mVar.W = i12 + 1;
        this.k = i12;
    }
}
