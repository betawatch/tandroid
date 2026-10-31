package rh;

import java.util.ArrayList;
import org.telegram.messenger.zs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ u5 b;

    public /* synthetic */ s5(u5 u5Var, int i10) {
        this.a = i10;
        this.b = u5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final u5 u5Var = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.t5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        u5 u5Var2 = u5Var;
                        switch (i11) {
                            case 0:
                                long j10 = u5Var2.b;
                                int i12 = u5Var2.a;
                                ArrayList arrayList = u5Var2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        u5Var2.j();
                                        u5Var2.d = true;
                                        u5Var2.c = false;
                                        zs.f(i12).k(zs.H3, Long.valueOf(j10), u5Var2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    u5Var2.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (u5Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            v5 v5Var = new v5(i12, j10, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            v5Var.c = true;
                                            v5Var.d = i14;
                                            u5Var2.h.put(Integer.valueOf(i14), v5Var);
                                        }
                                    }
                                    u5Var2.d = true;
                                    u5Var2.c = false;
                                    zs.f(i12).k(zs.H3, Long.valueOf(j10), u5Var2);
                                    break;
                                }
                                break;
                            case 1:
                                u5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = u5Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        u5Var2.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                u5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = u5Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        u5Var2.e.set(f10, tL_starGiftCollection3);
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
                final u5 u5Var2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.t5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        u5 u5Var22 = u5Var2;
                        switch (i112) {
                            case 0:
                                long j10 = u5Var22.b;
                                int i12 = u5Var22.a;
                                ArrayList arrayList = u5Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        u5Var22.j();
                                        u5Var22.d = true;
                                        u5Var22.c = false;
                                        zs.f(i12).k(zs.H3, Long.valueOf(j10), u5Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    u5Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (u5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            v5 v5Var = new v5(i12, j10, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            v5Var.c = true;
                                            v5Var.d = i14;
                                            u5Var22.h.put(Integer.valueOf(i14), v5Var);
                                        }
                                    }
                                    u5Var22.d = true;
                                    u5Var22.c = false;
                                    zs.f(i12).k(zs.H3, Long.valueOf(j10), u5Var22);
                                    break;
                                }
                                break;
                            case 1:
                                u5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = u5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        u5Var22.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                u5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = u5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        u5Var22.e.set(f10, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final u5 u5Var3 = this.b;
                u5Var3.getClass();
                final int i12 = 2;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.t5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i12;
                        TLObject tLObject2 = tLObject;
                        u5 u5Var22 = u5Var3;
                        switch (i112) {
                            case 0:
                                long j10 = u5Var22.b;
                                int i122 = u5Var22.a;
                                ArrayList arrayList = u5Var22.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        u5Var22.j();
                                        u5Var22.d = true;
                                        u5Var22.c = false;
                                        zs.f(i122).k(zs.H3, Long.valueOf(j10), u5Var22);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    u5Var22.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (u5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            v5 v5Var = new v5(i122, j10, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            v5Var.c = true;
                                            v5Var.d = i14;
                                            u5Var22.h.put(Integer.valueOf(i14), v5Var);
                                        }
                                    }
                                    u5Var22.d = true;
                                    u5Var22.c = false;
                                    zs.f(i122).k(zs.H3, Long.valueOf(j10), u5Var22);
                                    break;
                                }
                                break;
                            case 1:
                                u5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = u5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        u5Var22.e.set(f7, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                u5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = u5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        u5Var22.e.set(f10, tL_starGiftCollection3);
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
