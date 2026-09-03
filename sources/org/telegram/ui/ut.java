package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ut implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ut(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((Comparator) this.b).compare(((tt) obj).a, ((tt) obj2).a);
            case 1:
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.b;
                int i10 = longSparseIntArray.get(((Long) obj).longValue());
                int i11 = longSparseIntArray.get(((Long) obj2).longValue());
                if (i10 > i11) {
                    return 1;
                }
                return i10 < i11 ? -1 : 0;
            case 2:
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.b;
                LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) obj;
                LocaleController.LocaleInfo localeInfo3 = (LocaleController.LocaleInfo) obj2;
                if (localeInfo2 != localeInfo) {
                    if (localeInfo3 != localeInfo) {
                        int i12 = localeInfo2.serverIndex;
                        int i13 = localeInfo3.serverIndex;
                        if (i12 == i13) {
                            return localeInfo2.name.compareTo(localeInfo3.name);
                        }
                        if (i12 <= i13) {
                            if (i12 >= i13) {
                                return 0;
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.b;
                int indexOf = stickersActivity.e.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf2 = stickersActivity.e.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf < 0 || indexOf2 < 0) {
                    return 0;
                }
                return indexOf - indexOf2;
        }
    }
}
