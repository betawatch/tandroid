package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ d5 b;

    public /* synthetic */ b5(d5 d5Var, int i10) {
        this.a = i10;
        this.b = d5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final d5 d5Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.c5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        d5 d5Var2 = d5Var;
                        switch (i11) {
                            case 0:
                                long j3 = d5Var2.b;
                                int i12 = d5Var2.a;
                                ArrayList arrayList = d5Var2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        d5Var2.j();
                                        d5Var2.d = true;
                                        d5Var2.c = false;
                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), d5Var2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    d5Var2.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (d5Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            e5 e5Var = new e5(i12, j3, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            e5Var.c = true;
                                            e5Var.d = i14;
                                            d5Var2.h.put(Integer.valueOf(i14), e5Var);
                                        }
                                    }
                                    d5Var2.d = true;
                                    d5Var2.c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), d5Var2);
                                    break;
                                }
                                break;
                            case 1:
                                d5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = d5Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        d5Var2.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                d5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = d5Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        d5Var2.e.set(f10, tL_starGiftCollection3);
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
                final d5 d5Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.c5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        d5 d5Var22 = d5Var2;
                        switch (i112) {
                            case 0:
                                long j3 = d5Var22.b;
                                int i12 = d5Var22.a;
                                ArrayList arrayList = d5Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        d5Var22.j();
                                        d5Var22.d = true;
                                        d5Var22.c = false;
                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), d5Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    d5Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (d5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            e5 e5Var = new e5(i12, j3, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            e5Var.c = true;
                                            e5Var.d = i14;
                                            d5Var22.h.put(Integer.valueOf(i14), e5Var);
                                        }
                                    }
                                    d5Var22.d = true;
                                    d5Var22.c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), d5Var22);
                                    break;
                                }
                                break;
                            case 1:
                                d5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = d5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        d5Var22.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                d5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = d5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        d5Var22.e.set(f10, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final d5 d5Var3 = this.b;
                d5Var3.getClass();
                final int i12 = 2;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.c5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i12;
                        TLObject tLObject2 = tLObject;
                        d5 d5Var22 = d5Var3;
                        switch (i112) {
                            case 0:
                                long j3 = d5Var22.b;
                                int i122 = d5Var22.a;
                                ArrayList arrayList = d5Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        d5Var22.j();
                                        d5Var22.d = true;
                                        d5Var22.c = false;
                                        NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), d5Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    d5Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (d5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            e5 e5Var = new e5(i122, j3, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            e5Var.c = true;
                                            e5Var.d = i14;
                                            d5Var22.h.put(Integer.valueOf(i14), e5Var);
                                        }
                                    }
                                    d5Var22.d = true;
                                    d5Var22.c = false;
                                    NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), d5Var22);
                                    break;
                                }
                                break;
                            case 1:
                                d5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = d5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        d5Var22.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                d5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = d5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        d5Var22.e.set(f10, tL_starGiftCollection3);
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
