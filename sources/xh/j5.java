package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class j5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5 b;

    public /* synthetic */ j5(l5 l5Var, int i10) {
        this.a = i10;
        this.b = l5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final l5 l5Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: xh.k5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        l5 l5Var2 = l5Var;
                        switch (i11) {
                            case 0:
                                long j3 = l5Var2.b;
                                int i12 = l5Var2.a;
                                ArrayList arrayList = l5Var2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        l5Var2.j();
                                        l5Var2.d = true;
                                        l5Var2.c = false;
                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), l5Var2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    l5Var2.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (l5Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            n5 n5Var = new n5(i12, j3, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            n5Var.c = true;
                                            n5Var.d = i14;
                                            l5Var2.h.put(Integer.valueOf(i14), n5Var);
                                        }
                                    }
                                    l5Var2.d = true;
                                    l5Var2.c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), l5Var2);
                                    break;
                                }
                                break;
                            case 1:
                                l5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = l5Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        l5Var2.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                l5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = l5Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        l5Var2.e.set(f10, tL_starGiftCollection3);
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
                final l5 l5Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: xh.k5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        l5 l5Var22 = l5Var2;
                        switch (i112) {
                            case 0:
                                long j3 = l5Var22.b;
                                int i12 = l5Var22.a;
                                ArrayList arrayList = l5Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        l5Var22.j();
                                        l5Var22.d = true;
                                        l5Var22.c = false;
                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), l5Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    l5Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (l5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            n5 n5Var = new n5(i12, j3, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            n5Var.c = true;
                                            n5Var.d = i14;
                                            l5Var22.h.put(Integer.valueOf(i14), n5Var);
                                        }
                                    }
                                    l5Var22.d = true;
                                    l5Var22.c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), l5Var22);
                                    break;
                                }
                                break;
                            case 1:
                                l5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = l5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        l5Var22.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                l5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = l5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        l5Var22.e.set(f10, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final l5 l5Var3 = this.b;
                l5Var3.getClass();
                final int i12 = 2;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: xh.k5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i12;
                        TLObject tLObject2 = tLObject;
                        l5 l5Var22 = l5Var3;
                        switch (i112) {
                            case 0:
                                long j3 = l5Var22.b;
                                int i122 = l5Var22.a;
                                ArrayList arrayList = l5Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        l5Var22.j();
                                        l5Var22.d = true;
                                        l5Var22.c = false;
                                        NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), l5Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    l5Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (l5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            n5 n5Var = new n5(i122, j3, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            n5Var.c = true;
                                            n5Var.d = i14;
                                            l5Var22.h.put(Integer.valueOf(i14), n5Var);
                                        }
                                    }
                                    l5Var22.d = true;
                                    l5Var22.c = false;
                                    NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), l5Var22);
                                    break;
                                }
                                break;
                            case 1:
                                l5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = l5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        l5Var22.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                l5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = l5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        l5Var22.e.set(f10, tL_starGiftCollection3);
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
