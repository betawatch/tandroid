package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ j5 b;

    public /* synthetic */ h5(j5 j5Var, int i10) {
        this.a = i10;
        this.b = j5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final j5 j5Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.i5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        j5 j5Var2 = j5Var;
                        switch (i11) {
                            case 0:
                                long j3 = j5Var2.b;
                                int i12 = j5Var2.a;
                                ArrayList arrayList = j5Var2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        j5Var2.j();
                                        j5Var2.d = true;
                                        j5Var2.c = false;
                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), j5Var2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    j5Var2.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (j5Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            k5 k5Var = new k5(i12, j3, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            k5Var.c = true;
                                            k5Var.d = i14;
                                            j5Var2.h.put(Integer.valueOf(i14), k5Var);
                                        }
                                    }
                                    j5Var2.d = true;
                                    j5Var2.c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), j5Var2);
                                    break;
                                }
                                break;
                            case 1:
                                j5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = j5Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        j5Var2.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                j5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = j5Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        j5Var2.e.set(f10, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final j5 j5Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.i5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        j5 j5Var22 = j5Var2;
                        switch (i112) {
                            case 0:
                                long j3 = j5Var22.b;
                                int i12 = j5Var22.a;
                                ArrayList arrayList = j5Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        j5Var22.j();
                                        j5Var22.d = true;
                                        j5Var22.c = false;
                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), j5Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    j5Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (j5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            k5 k5Var = new k5(i12, j3, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            k5Var.c = true;
                                            k5Var.d = i14;
                                            j5Var22.h.put(Integer.valueOf(i14), k5Var);
                                        }
                                    }
                                    j5Var22.d = true;
                                    j5Var22.c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), j5Var22);
                                    break;
                                }
                                break;
                            case 1:
                                j5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = j5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        j5Var22.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                j5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = j5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        j5Var22.e.set(f10, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final j5 j5Var3 = this.b;
                j5Var3.getClass();
                final int i12 = 2;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.i5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i12;
                        TLObject tLObject2 = tLObject;
                        j5 j5Var22 = j5Var3;
                        switch (i112) {
                            case 0:
                                long j3 = j5Var22.b;
                                int i122 = j5Var22.a;
                                ArrayList arrayList = j5Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        j5Var22.j();
                                        j5Var22.d = true;
                                        j5Var22.c = false;
                                        NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), j5Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    j5Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (j5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            k5 k5Var = new k5(i122, j3, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            k5Var.c = true;
                                            k5Var.d = i14;
                                            j5Var22.h.put(Integer.valueOf(i14), k5Var);
                                        }
                                    }
                                    j5Var22.d = true;
                                    j5Var22.c = false;
                                    NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), j5Var22);
                                    break;
                                }
                                break;
                            case 1:
                                j5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = j5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        j5Var22.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                j5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = j5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        j5Var22.e.set(f10, tL_starGiftCollection3);
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
}
