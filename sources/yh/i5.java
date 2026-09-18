package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5 b;

    public /* synthetic */ i5(k5 k5Var, int i10) {
        this.a = i10;
        this.b = k5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final k5 k5Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.j5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        k5 k5Var2 = k5Var;
                        switch (i11) {
                            case 0:
                                long j3 = k5Var2.b;
                                int i12 = k5Var2.a;
                                ArrayList arrayList = k5Var2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        k5Var2.j();
                                        k5Var2.d = true;
                                        k5Var2.c = false;
                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), k5Var2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    k5Var2.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (k5Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            l5 l5Var = new l5(i12, j3, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            l5Var.c = true;
                                            l5Var.d = i14;
                                            k5Var2.h.put(Integer.valueOf(i14), l5Var);
                                        }
                                    }
                                    k5Var2.d = true;
                                    k5Var2.c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), k5Var2);
                                    break;
                                }
                                break;
                            case 1:
                                k5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = k5Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        k5Var2.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                k5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = k5Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        k5Var2.e.set(f10, tL_starGiftCollection3);
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
                final k5 k5Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.j5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        k5 k5Var22 = k5Var2;
                        switch (i112) {
                            case 0:
                                long j3 = k5Var22.b;
                                int i12 = k5Var22.a;
                                ArrayList arrayList = k5Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        k5Var22.j();
                                        k5Var22.d = true;
                                        k5Var22.c = false;
                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), k5Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    k5Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (k5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            l5 l5Var = new l5(i12, j3, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            l5Var.c = true;
                                            l5Var.d = i14;
                                            k5Var22.h.put(Integer.valueOf(i14), l5Var);
                                        }
                                    }
                                    k5Var22.d = true;
                                    k5Var22.c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), k5Var22);
                                    break;
                                }
                                break;
                            case 1:
                                k5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = k5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        k5Var22.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                k5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = k5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        k5Var22.e.set(f10, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final k5 k5Var3 = this.b;
                k5Var3.getClass();
                final int i12 = 2;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.j5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i12;
                        TLObject tLObject2 = tLObject;
                        k5 k5Var22 = k5Var3;
                        switch (i112) {
                            case 0:
                                long j3 = k5Var22.b;
                                int i122 = k5Var22.a;
                                ArrayList arrayList = k5Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        k5Var22.j();
                                        k5Var22.d = true;
                                        k5Var22.c = false;
                                        NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), k5Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    k5Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (k5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            l5 l5Var = new l5(i122, j3, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            l5Var.c = true;
                                            l5Var.d = i14;
                                            k5Var22.h.put(Integer.valueOf(i14), l5Var);
                                        }
                                    }
                                    k5Var22.d = true;
                                    k5Var22.c = false;
                                    NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), k5Var22);
                                    break;
                                }
                                break;
                            case 1:
                                k5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = k5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        k5Var22.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                k5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = k5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        k5Var22.e.set(f10, tL_starGiftCollection3);
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
