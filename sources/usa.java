// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class usa implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wsa b;

    public /* synthetic */ usa(wsa wsaVar, byte b) {
        this.a = b;
        this.b = wsaVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final wsa wsaVar = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                gl.c3(new Runnable() { // from class: vsa
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        wsa wsaVar2 = wsaVar;
                        switch (b3) {
                            case 0:
                                long j = wsaVar2.b;
                                int i = wsaVar2.a;
                                ArrayList arrayList = wsaVar2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        wsaVar2.j();
                                        wsaVar2.d = true;
                                        wsaVar2.c = false;
                                        kk7.f(i).k(kk7.I3, Long.valueOf(j), wsaVar2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    wsaVar2.j();
                                    int size = arrayList.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        Object obj = arrayList.get(i2);
                                        i2++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (wsaVar2.e(tL_starGiftCollection.collection_id) == null) {
                                            xsa xsaVar = new xsa(i, j, false);
                                            int i3 = tL_starGiftCollection.collection_id;
                                            xsaVar.c = true;
                                            xsaVar.d = i3;
                                            wsaVar2.h.put(Integer.valueOf(i3), xsaVar);
                                        }
                                    }
                                    wsaVar2.d = true;
                                    wsaVar2.c = false;
                                    kk7.f(i).k(kk7.I3, Long.valueOf(j), wsaVar2);
                                    break;
                                }
                                break;
                            case 1:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f = wsaVar2.f(tL_starGiftCollection2.collection_id);
                                    if (f >= 0) {
                                        wsaVar2.e.set(f, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollection)) {
                                    wsaVar2.getClass();
                                    break;
                                } else {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f2 = wsaVar2.f(tL_starGiftCollection3.collection_id);
                                    if (f2 >= 0) {
                                        wsaVar2.e.set(f2, tL_starGiftCollection3);
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
                gl.c3(new Runnable() { // from class: vsa
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        wsa wsaVar2 = wsaVar;
                        switch (b32) {
                            case 0:
                                long j = wsaVar2.b;
                                int i = wsaVar2.a;
                                ArrayList arrayList = wsaVar2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        wsaVar2.j();
                                        wsaVar2.d = true;
                                        wsaVar2.c = false;
                                        kk7.f(i).k(kk7.I3, Long.valueOf(j), wsaVar2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    wsaVar2.j();
                                    int size = arrayList.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        Object obj = arrayList.get(i2);
                                        i2++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (wsaVar2.e(tL_starGiftCollection.collection_id) == null) {
                                            xsa xsaVar = new xsa(i, j, false);
                                            int i3 = tL_starGiftCollection.collection_id;
                                            xsaVar.c = true;
                                            xsaVar.d = i3;
                                            wsaVar2.h.put(Integer.valueOf(i3), xsaVar);
                                        }
                                    }
                                    wsaVar2.d = true;
                                    wsaVar2.c = false;
                                    kk7.f(i).k(kk7.I3, Long.valueOf(j), wsaVar2);
                                    break;
                                }
                                break;
                            case 1:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f = wsaVar2.f(tL_starGiftCollection2.collection_id);
                                    if (f >= 0) {
                                        wsaVar2.e.set(f, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollection)) {
                                    wsaVar2.getClass();
                                    break;
                                } else {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f2 = wsaVar2.f(tL_starGiftCollection3.collection_id);
                                    if (f2 >= 0) {
                                        wsaVar2.e.set(f2, tL_starGiftCollection3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                wsaVar.getClass();
                final byte b4 = 2;
                gl.c3(new Runnable() { // from class: vsa
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b4;
                        TLObject tLObject2 = tLObject;
                        wsa wsaVar2 = wsaVar;
                        switch (b32) {
                            case 0:
                                long j = wsaVar2.b;
                                int i = wsaVar2.a;
                                ArrayList arrayList = wsaVar2.e;
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollections)) {
                                    if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                        wsaVar2.j();
                                        wsaVar2.d = true;
                                        wsaVar2.c = false;
                                        kk7.f(i).k(kk7.I3, Long.valueOf(j), wsaVar2);
                                        break;
                                    }
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    wsaVar2.j();
                                    int size = arrayList.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        Object obj = arrayList.get(i2);
                                        i2++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (wsaVar2.e(tL_starGiftCollection.collection_id) == null) {
                                            xsa xsaVar = new xsa(i, j, false);
                                            int i3 = tL_starGiftCollection.collection_id;
                                            xsaVar.c = true;
                                            xsaVar.d = i3;
                                            wsaVar2.h.put(Integer.valueOf(i3), xsaVar);
                                        }
                                    }
                                    wsaVar2.d = true;
                                    wsaVar2.c = false;
                                    kk7.f(i).k(kk7.I3, Long.valueOf(j), wsaVar2);
                                    break;
                                }
                                break;
                            case 1:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f = wsaVar2.f(tL_starGiftCollection2.collection_id);
                                    if (f >= 0) {
                                        wsaVar2.e.set(f, tL_starGiftCollection2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!(tLObject2 instanceof TL_stars.TL_starGiftCollection)) {
                                    wsaVar2.getClass();
                                    break;
                                } else {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f2 = wsaVar2.f(tL_starGiftCollection3.collection_id);
                                    if (f2 >= 0) {
                                        wsaVar2.e.set(f2, tL_starGiftCollection3);
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
