package zh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class g5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;

    public /* synthetic */ g5(i5 i5Var, int i10) {
        this.a = i10;
        this.b = i5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final i5 i5Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.h5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        i5 i5Var2 = i5Var;
                        switch (i11) {
                            case 0:
                                long j3 = i5Var2.b;
                                int i12 = i5Var2.a;
                                ArrayList arrayList = i5Var2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        i5Var2.j();
                                        i5Var2.d = true;
                                        i5Var2.c = false;
                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), i5Var2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    i5Var2.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (i5Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            j5 j5Var = new j5(i12, j3, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            j5Var.c = true;
                                            j5Var.d = i14;
                                            i5Var2.h.put(Integer.valueOf(i14), j5Var);
                                        }
                                    }
                                    i5Var2.d = true;
                                    i5Var2.c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), i5Var2);
                                    break;
                                }
                                break;
                            case 1:
                                i5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = i5Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        i5Var2.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                i5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = i5Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        i5Var2.e.set(f10, tL_starGiftCollection3);
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
                final i5 i5Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.h5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        i5 i5Var22 = i5Var2;
                        switch (i112) {
                            case 0:
                                long j3 = i5Var22.b;
                                int i12 = i5Var22.a;
                                ArrayList arrayList = i5Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        i5Var22.j();
                                        i5Var22.d = true;
                                        i5Var22.c = false;
                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), i5Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    i5Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (i5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            j5 j5Var = new j5(i12, j3, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            j5Var.c = true;
                                            j5Var.d = i14;
                                            i5Var22.h.put(Integer.valueOf(i14), j5Var);
                                        }
                                    }
                                    i5Var22.d = true;
                                    i5Var22.c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), i5Var22);
                                    break;
                                }
                                break;
                            case 1:
                                i5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = i5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        i5Var22.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                i5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = i5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        i5Var22.e.set(f10, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final i5 i5Var3 = this.b;
                i5Var3.getClass();
                final int i12 = 2;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.h5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i12;
                        TLObject tLObject2 = tLObject;
                        i5 i5Var22 = i5Var3;
                        switch (i112) {
                            case 0:
                                long j3 = i5Var22.b;
                                int i122 = i5Var22.a;
                                ArrayList arrayList = i5Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        i5Var22.j();
                                        i5Var22.d = true;
                                        i5Var22.c = false;
                                        NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), i5Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    i5Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (i5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            j5 j5Var = new j5(i122, j3, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            j5Var.c = true;
                                            j5Var.d = i14;
                                            i5Var22.h.put(Integer.valueOf(i14), j5Var);
                                        }
                                    }
                                    i5Var22.d = true;
                                    i5Var22.c = false;
                                    NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), i5Var22);
                                    break;
                                }
                                break;
                            case 1:
                                i5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = i5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        i5Var22.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                i5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = i5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        i5Var22.e.set(f10, tL_starGiftCollection3);
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
