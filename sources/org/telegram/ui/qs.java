package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class qs implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qs(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((Comparator) this.b).compare(((ps) obj).a, ((ps) obj2).a);
            case 1:
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.b;
                int i7 = longSparseIntArray.get(((Long) obj).longValue());
                int i10 = longSparseIntArray.get(((Long) obj2).longValue());
                if (i7 > i10) {
                    return 1;
                }
                return i7 < i10 ? -1 : 0;
            case 2:
                org.telegram.messenger.dd ddVar = (org.telegram.messenger.dd) this.b;
                org.telegram.messenger.dd ddVar2 = (org.telegram.messenger.dd) obj;
                org.telegram.messenger.dd ddVar3 = (org.telegram.messenger.dd) obj2;
                if (ddVar2 != ddVar) {
                    if (ddVar3 != ddVar) {
                        int i11 = ddVar2.k;
                        int i12 = ddVar3.k;
                        if (i11 == i12) {
                            return ddVar2.a.compareTo(ddVar3.a);
                        }
                        if (i11 <= i12) {
                            if (i11 >= i12) {
                                return 0;
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.b;
                int indexOf = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf2 = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf < 0 || indexOf2 < 0) {
                    return 0;
                }
                return indexOf - indexOf2;
        }
    }
}
