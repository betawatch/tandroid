// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xwa implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zwa b;

    public /* synthetic */ xwa(zwa zwaVar, byte b) {
        this.a = b;
        this.b = zwaVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final zwa zwaVar = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                hl.c3(new Runnable() { // from class: ywa
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        zwa zwaVar2 = zwaVar;
                        switch (b3) {
                            case 0:
                                long j = zwaVar2.b;
                                int i = zwaVar2.a;
                                ArrayList arrayList = zwaVar2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        zwaVar2.j();
                                        zwaVar2.d = true;
                                        zwaVar2.c = false;
                                        jn7.f(i).k(jn7.J3, Long.valueOf(j), zwaVar2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    zwaVar2.j();
                                    int size = arrayList.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        Object obj = arrayList.get(i2);
                                        i2++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (zwaVar2.e(tL_starGiftCollection.collection_id) == null) {
                                            axa axaVar = new axa(i, j, false);
                                            int i3 = tL_starGiftCollection.collection_id;
                                            axaVar.c = true;
                                            axaVar.d = i3;
                                            zwaVar2.h.put(Integer.valueOf(i3), axaVar);
                                        }
                                    }
                                    zwaVar2.d = true;
                                    zwaVar2.c = false;
                                    jn7.f(i).k(jn7.J3, Long.valueOf(j), zwaVar2);
                                    break;
                                }
                                break;
                            case 1:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f = zwaVar2.f(tL_starGiftCollection2.collection_id);
                                    if (f >= 0) {
                                        zwaVar2.e.set(f, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollection)) {
                                    zwaVar2.getClass();
                                    break;
                                } else {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f2 = zwaVar2.f(tL_starGiftCollection3.collection_id);
                                    if (f2 >= 0) {
                                        zwaVar2.e.set(f2, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final byte b3 = 1;
                hl.c3(new Runnable() { // from class: ywa
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        zwa zwaVar2 = zwaVar;
                        switch (b32) {
                            case 0:
                                long j = zwaVar2.b;
                                int i = zwaVar2.a;
                                ArrayList arrayList = zwaVar2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        zwaVar2.j();
                                        zwaVar2.d = true;
                                        zwaVar2.c = false;
                                        jn7.f(i).k(jn7.J3, Long.valueOf(j), zwaVar2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    zwaVar2.j();
                                    int size = arrayList.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        Object obj = arrayList.get(i2);
                                        i2++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (zwaVar2.e(tL_starGiftCollection.collection_id) == null) {
                                            axa axaVar = new axa(i, j, false);
                                            int i3 = tL_starGiftCollection.collection_id;
                                            axaVar.c = true;
                                            axaVar.d = i3;
                                            zwaVar2.h.put(Integer.valueOf(i3), axaVar);
                                        }
                                    }
                                    zwaVar2.d = true;
                                    zwaVar2.c = false;
                                    jn7.f(i).k(jn7.J3, Long.valueOf(j), zwaVar2);
                                    break;
                                }
                                break;
                            case 1:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f = zwaVar2.f(tL_starGiftCollection2.collection_id);
                                    if (f >= 0) {
                                        zwaVar2.e.set(f, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollection)) {
                                    zwaVar2.getClass();
                                    break;
                                } else {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f2 = zwaVar2.f(tL_starGiftCollection3.collection_id);
                                    if (f2 >= 0) {
                                        zwaVar2.e.set(f2, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                zwaVar.getClass();
                final byte b4 = 2;
                hl.c3(new Runnable() { // from class: ywa
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b4;
                        TLObject tLObject2 = tLObject;
                        zwa zwaVar2 = zwaVar;
                        switch (b32) {
                            case 0:
                                long j = zwaVar2.b;
                                int i = zwaVar2.a;
                                ArrayList arrayList = zwaVar2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        zwaVar2.j();
                                        zwaVar2.d = true;
                                        zwaVar2.c = false;
                                        jn7.f(i).k(jn7.J3, Long.valueOf(j), zwaVar2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    zwaVar2.j();
                                    int size = arrayList.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        Object obj = arrayList.get(i2);
                                        i2++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (zwaVar2.e(tL_starGiftCollection.collection_id) == null) {
                                            axa axaVar = new axa(i, j, false);
                                            int i3 = tL_starGiftCollection.collection_id;
                                            axaVar.c = true;
                                            axaVar.d = i3;
                                            zwaVar2.h.put(Integer.valueOf(i3), axaVar);
                                        }
                                    }
                                    zwaVar2.d = true;
                                    zwaVar2.c = false;
                                    jn7.f(i).k(jn7.J3, Long.valueOf(j), zwaVar2);
                                    break;
                                }
                                break;
                            case 1:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f = zwaVar2.f(tL_starGiftCollection2.collection_id);
                                    if (f >= 0) {
                                        zwaVar2.e.set(f, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollection)) {
                                    zwaVar2.getClass();
                                    break;
                                } else {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f2 = zwaVar2.f(tL_starGiftCollection3.collection_id);
                                    if (f2 >= 0) {
                                        zwaVar2.e.set(f2, tL_starGiftCollection3);
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
