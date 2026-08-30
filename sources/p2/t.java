package p2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.t1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kh.a2;
import n7.qa;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.Components.qk0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00b6, code lost:
    
        r0 = r2.s(p2.b0.h, 107, "Service has been reset to null.", r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a() {
        x5.k kVar;
        int i10;
        com.google.android.gms.internal.play_billing.c cVar;
        int i11;
        int i12;
        b bVar = (b) this.b;
        org.telegram.messenger.d dVar = (org.telegram.messenger.d) this.c;
        qk0 qk0Var = (qk0) this.d;
        Exception exc = null;
        if (!bVar.n()) {
            h hVar = b0.h;
            bVar.y(2, 7, hVar);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
            com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
            dVar.a(hVar, new r(vVar, vVar));
            return null;
        }
        if (!bVar.r) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Querying product details is not supported.");
            h hVar2 = b0.m;
            bVar.y(20, 7, hVar2);
            com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
            com.google.android.gms.internal.play_billing.v vVar2 = com.google.android.gms.internal.play_billing.v.e;
            dVar.a(hVar2, new r(vVar2, vVar2));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str = ((q) ((com.google.android.gms.internal.play_billing.r) qk0Var.b).get(0)).b;
        com.google.android.gms.internal.play_billing.r rVar = (com.google.android.gms.internal.play_billing.r) qk0Var.b;
        int size = rVar.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                kVar = new x5.k(0, "", arrayList, arrayList2);
                break;
            }
            int i14 = i13 + 20;
            ArrayList arrayList3 = new ArrayList(rVar.subList(i13, i14 > size ? size : i14));
            ArrayList<String> arrayList4 = new ArrayList<>();
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                arrayList4.add(((q) arrayList3.get(i15)).a);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
            String str2 = bVar.c;
            bundle.putString("playBillingLibraryVersion", str2);
            try {
                synchronized (bVar.a) {
                    try {
                        cVar = bVar.i;
                    } finally {
                        th = th;
                        i10 = 43;
                        while (true) {
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
                if (cVar == null) {
                    break;
                }
                if (bVar.s) {
                    bVar.x.getClass();
                }
                bVar.v();
                bVar.v();
                bVar.v();
                bVar.v();
                int i16 = i14;
                try {
                    Bundle a12 = ((com.google.android.gms.internal.play_billing.a) cVar).a1(true != bVar.t ? 17 : 20, bVar.g.getPackageName(), str, bundle, com.google.android.gms.internal.play_billing.u.d(str2, bVar.d, arrayList3, new t1(1), bVar.A.longValue()));
                    if (a12 == null) {
                        kVar = bVar.s(b0.n, 44, "queryProductDetailsAsync got empty product details response.", null);
                        break;
                    }
                    if (a12.containsKey("DETAILS_LIST")) {
                        ArrayList<String> stringArrayList = a12.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            kVar = bVar.s(b0.n, 46, "queryProductDetailsAsync got null response list", null);
                            break;
                        }
                        ArrayList arrayList5 = new ArrayList();
                        int size3 = stringArrayList.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            com.google.android.gms.internal.play_billing.r rVar2 = rVar;
                            try {
                                n nVar = new n(stringArrayList.get(i17));
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Got product details: ".concat(nVar.toString()));
                                arrayList5.add(nVar);
                                i17++;
                                rVar = rVar2;
                            } catch (JSONException e) {
                                kVar = bVar.s(b0.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                            }
                        }
                        com.google.android.gms.internal.play_billing.r rVar3 = rVar;
                        ArrayList<String> stringArrayList2 = a12.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                        new ArrayList();
                        try {
                            ArrayList arrayList6 = new ArrayList();
                            if (stringArrayList2 != null) {
                                int size4 = stringArrayList2.size();
                                int i18 = 0;
                                while (i18 < size4) {
                                    String str3 = stringArrayList2.get(i18);
                                    i18++;
                                    s sVar = new s(str3);
                                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Got unfetchedProduct: ".concat(sVar.toString()));
                                    arrayList6.add(sVar);
                                }
                            } else {
                                int size5 = arrayList3.size();
                                int i19 = 0;
                                while (i19 < size5) {
                                    Object obj = arrayList3.get(i19);
                                    i19++;
                                    q qVar = (q) obj;
                                    int size6 = arrayList5.size();
                                    int i20 = 0;
                                    while (true) {
                                        if (i20 >= size6) {
                                            i11 = size5;
                                            i12 = i16;
                                            arrayList6.add(new s(new JSONObject().put("productId", qVar.a).put(TeXSymbolParser.TYPE_ATTR, qVar.b).put("statusCode", 0).toString()));
                                            break;
                                        }
                                        Object obj2 = arrayList5.get(i20);
                                        i20++;
                                        n nVar2 = (n) obj2;
                                        i11 = size5;
                                        i12 = i16;
                                        if (!qVar.a.equals(nVar2.c) || !qVar.b.equals(nVar2.d)) {
                                            size5 = i11;
                                            i16 = i12;
                                        }
                                    }
                                    size5 = i11;
                                    i16 = i12;
                                }
                            }
                            int i21 = i16;
                            arrayList.addAll(arrayList5);
                            arrayList2.addAll(arrayList6);
                            rVar = rVar3;
                            i13 = i21;
                            exc = null;
                        } catch (JSONException e6) {
                            kVar = bVar.s(b0.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e6);
                        }
                    } else {
                        int a2 = com.google.android.gms.internal.play_billing.u.a("BillingClient", a12);
                        String f10 = com.google.android.gms.internal.play_billing.u.f("BillingClient", a12);
                        kVar = a2 != 0 ? bVar.s(b0.a(a2, f10), 23, a2.j(a2, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : bVar.s(b0.a(6, f10), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                } catch (DeadObjectException e10) {
                    e = e10;
                    kVar = bVar.s(b0.h, i10, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    dVar.a(b0.a(kVar.a, (String) kVar.d), new r((ArrayList) kVar.b, (ArrayList) kVar.c));
                    return null;
                } catch (Exception e11) {
                    e = e11;
                    kVar = bVar.s(b0.f, i10, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    dVar.a(b0.a(kVar.a, (String) kVar.d), new r((ArrayList) kVar.b, (ArrayList) kVar.c));
                    return null;
                }
            } catch (DeadObjectException e12) {
                e = e12;
                i10 = 43;
            } catch (Exception e13) {
                e = e13;
                i10 = 43;
            }
        }
        dVar.a(b0.a(kVar.a, (String) kVar.d), new r((ArrayList) kVar.b, (ArrayList) kVar.c));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x008c, code lost:
    
        r0 = r2.x(p2.b0.h, 107, "Service has been reset to null", r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0171 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b() {
        Exception exc;
        qa x10;
        List list;
        com.google.android.gms.internal.play_billing.c cVar;
        Bundle Z0;
        h e;
        int i10;
        b bVar = (b) this.b;
        Exception exc2 = null;
        if (!bVar.n()) {
            h hVar = b0.h;
            bVar.y(2, 9, hVar);
            o oVar = (o) this.c;
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
            oVar.b(hVar, com.google.android.gms.internal.play_billing.v.e);
            return null;
        }
        String str = (String) this.d;
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Please provide a valid product type.");
            h hVar2 = b0.d;
            bVar.y(50, 9, hVar2);
            o oVar2 = (o) this.c;
            com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
            oVar2.b(hVar2, com.google.android.gms.internal.play_billing.v.e);
            return null;
        }
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z4 = bVar.n;
        bVar.x.getClass();
        bVar.x.getClass();
        long longValue = bVar.A.longValue();
        Bundle bundle = new Bundle();
        com.google.android.gms.internal.play_billing.u.b(bundle, bVar.c, bVar.d, longValue);
        if (z4) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        String str2 = null;
        while (true) {
            try {
                synchronized (bVar.a) {
                    try {
                        cVar = bVar.i;
                    } catch (Throwable th2) {
                        th = th2;
                        exc = exc2;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (DeadObjectException e6) {
                                    e = e6;
                                    x10 = bVar.x(b0.h, 52, "Got exception trying to get purchases try to reconnect", e);
                                    list = (List) x10.b;
                                    if (list != null) {
                                    }
                                    return exc;
                                } catch (Exception e10) {
                                    e = e10;
                                    x10 = bVar.x(b0.f, 52, "Got exception trying to get purchases try to reconnect", e);
                                    list = (List) x10.b;
                                    if (list != null) {
                                    }
                                    return exc;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                }
                if (cVar == null) {
                    break;
                }
                if (bVar.n) {
                    Z0 = ((com.google.android.gms.internal.play_billing.a) cVar).Z0(bVar.w ? 26 : bVar.v ? 24 : bVar.s ? 19 : 9, bVar.g.getPackageName(), str, str2, bundle);
                } else {
                    Z0 = ((com.google.android.gms.internal.play_billing.a) cVar).Y0(bVar.g.getPackageName(), str, str2);
                }
                h hVar3 = b0.f;
                if (Z0 == null) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "getPurchase() got null owned items list");
                    i10 = 54;
                } else {
                    int a2 = com.google.android.gms.internal.play_billing.u.a("BillingClient", Z0);
                    String f10 = com.google.android.gms.internal.play_billing.u.f("BillingClient", Z0);
                    g a10 = h.a();
                    a10.a = a2;
                    a10.c = f10;
                    e = a10.e();
                    if (a2 != 0) {
                        com.google.android.gms.internal.play_billing.u.h("BillingClient", "getPurchase() failed. Response code: " + a2);
                        i10 = 23;
                    } else if (Z0.containsKey("INAPP_PURCHASE_ITEM_LIST") && Z0.containsKey("INAPP_PURCHASE_DATA_LIST") && Z0.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = Z0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = Z0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = Z0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() contains null SKUs list.");
                            i10 = 56;
                        } else if (stringArrayList2 == null) {
                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() contains null purchases list.");
                            i10 = 57;
                        } else if (stringArrayList3 == null) {
                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() contains null signatures list.");
                            i10 = 58;
                        } else {
                            e = b0.g;
                            i10 = 1;
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Bundle returned from getPurchase() doesn't contain required fields.");
                        i10 = 55;
                    }
                    if (e == b0.g) {
                        x10 = bVar.x(e, i10, "Purchase bundle invalid", exc2);
                        break;
                    }
                    ArrayList<String> stringArrayList4 = Z0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList5 = Z0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList6 = Z0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    int i11 = 0;
                    exc = exc2;
                    boolean z10 = false;
                    while (i11 < stringArrayList5.size()) {
                        String str3 = stringArrayList5.get(i11);
                        String str4 = stringArrayList6.get(i11);
                        ArrayList<String> arrayList2 = stringArrayList4;
                        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i11))));
                        try {
                            Purchase purchase = new Purchase(str3, str4);
                            if (TextUtils.isEmpty(purchase.c())) {
                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "BUG: empty/null token!");
                                z10 = true;
                            }
                            arrayList.add(purchase);
                            i11++;
                            stringArrayList4 = arrayList2;
                        } catch (JSONException e11) {
                            x10 = bVar.x(b0.f, 51, "Got an exception trying to decode the purchase!", e11);
                        }
                    }
                    if (z10) {
                        bVar.y(26, 9, hVar3);
                    }
                    str2 = Z0.getString("INAPP_CONTINUATION_TOKEN");
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                    if (TextUtils.isEmpty(str2)) {
                        x10 = new qa(25, b0.g, arrayList);
                        break;
                    }
                    exc2 = exc;
                }
                e = hVar3;
                if (e == b0.g) {
                }
            } catch (DeadObjectException e12) {
                e = e12;
                exc = exc2;
            } catch (Exception e13) {
                e = e13;
                exc = exc2;
            }
        }
        exc = exc2;
        list = (List) x10.b;
        if (list != null) {
            ((o) this.c).b((h) x10.c, list);
        } else {
            o oVar3 = (o) this.c;
            h hVar4 = (h) x10.c;
            com.google.android.gms.internal.play_billing.p pVar3 = com.google.android.gms.internal.play_billing.r.b;
            oVar3.b(hVar4, com.google.android.gms.internal.play_billing.v.e);
        }
        return exc;
    }

    private final Object c() {
        Bundle c3;
        com.google.android.gms.internal.play_billing.c cVar;
        b bVar = (b) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        try {
            synchronized (bVar.a) {
                cVar = bVar.i;
            }
            if (cVar == null) {
                return com.google.android.gms.internal.play_billing.u.c(107, b0.h);
            }
            return ((com.google.android.gms.internal.play_billing.a) cVar).W0(bVar.g.getPackageName(), str, str2);
        } catch (DeadObjectException e) {
            h hVar = b0.h;
            String a2 = z.a(e);
            c3 = com.google.android.gms.internal.play_billing.u.c(5, hVar);
            if (a2 != null) {
                c3.putString("ADDITIONAL_LOG_DETAILS", a2);
            }
            return c3;
        } catch (Exception e6) {
            h hVar2 = b0.f;
            String a10 = z.a(e6);
            c3 = com.google.android.gms.internal.play_billing.u.c(5, hVar2);
            if (a10 != null) {
                c3.putString("ADDITIONAL_LOG_DETAILS", a10);
            }
            return c3;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Exception exc;
        DeadObjectException deadObjectException;
        com.google.android.gms.internal.play_billing.c cVar;
        int readInt;
        String str;
        switch (this.a) {
            case 0:
                b bVar = (b) this.b;
                j jVar = (j) this.c;
                i iVar = (i) this.d;
                if (!bVar.n()) {
                    h hVar = b0.h;
                    bVar.y(2, 4, hVar);
                    jVar.a(hVar, iVar.a);
                    return null;
                }
                String str2 = "Error consuming purchase with token. Response code: ";
                String str3 = iVar.a;
                try {
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Consuming purchase with token: ".concat(str3));
                    try {
                        synchronized (bVar.a) {
                            try {
                                cVar = bVar.i;
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                            }
                        }
                        try {
                            if (cVar == null) {
                                str2 = str3;
                                try {
                                    bVar.g(jVar, str2, b0.h, 107, "Service has been reset to null.", null);
                                    return null;
                                } catch (DeadObjectException e) {
                                    e = e;
                                    deadObjectException = e;
                                    bVar.g(jVar, str2, b0.h, 29, "Error consuming purchase!", deadObjectException);
                                    return null;
                                } catch (Exception e6) {
                                    e = e6;
                                    exc = e;
                                    bVar.g(jVar, str2, b0.f, 29, "Error consuming purchase!", exc);
                                    return null;
                                }
                            }
                            if (bVar.n) {
                                String packageName = bVar.g.getPackageName();
                                boolean z4 = bVar.n;
                                String str4 = bVar.c;
                                String str5 = bVar.d;
                                long longValue = bVar.A.longValue();
                                Bundle bundle = new Bundle();
                                if (z4) {
                                    com.google.android.gms.internal.play_billing.u.b(bundle, str4, str5, longValue);
                                }
                                Bundle V0 = ((com.google.android.gms.internal.play_billing.a) cVar).V0(packageName, str3, bundle);
                                readInt = V0.getInt("RESPONSE_CODE");
                                str = com.google.android.gms.internal.play_billing.u.f("BillingClient", V0);
                            } else {
                                String packageName2 = bVar.g.getPackageName();
                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                Parcel S0 = aVar.S0();
                                S0.writeInt(3);
                                S0.writeString(packageName2);
                                S0.writeString(str3);
                                Parcel T0 = aVar.T0(S0, 5);
                                readInt = T0.readInt();
                                T0.recycle();
                                str = "";
                            }
                            h a2 = b0.a(readInt, str);
                            if (readInt == 0) {
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Successfully consumed purchase.");
                                jVar.a(a2, str3);
                                return null;
                            }
                            bVar.g(jVar, str3, a2, 23, "Error consuming purchase with token. Response code: " + readInt, null);
                            return null;
                        } catch (DeadObjectException e10) {
                            deadObjectException = e10;
                            str2 = str3;
                            bVar.g(jVar, str2, b0.h, 29, "Error consuming purchase!", deadObjectException);
                            return null;
                        } catch (Exception e11) {
                            exc = e11;
                            str2 = str3;
                            bVar.g(jVar, str2, b0.f, 29, "Error consuming purchase!", exc);
                            return null;
                        }
                    } catch (DeadObjectException e12) {
                        e = e12;
                    } catch (Exception e13) {
                        e = e13;
                    }
                } catch (DeadObjectException e14) {
                    e = e14;
                    str2 = str3;
                } catch (Exception e15) {
                    e = e15;
                    str2 = str3;
                }
            case 1:
                return a();
            case 2:
                return b();
            case 3:
                return c();
            case 4:
                return Boolean.valueOf(((SharedPreferences) this.b).getBoolean((String) this.c, ((Boolean) this.d).booleanValue()));
            case 5:
                return Integer.valueOf(((SharedPreferences) this.b).getInt((String) this.c, ((Integer) this.d).intValue()));
            case 6:
                return Long.valueOf(((SharedPreferences) this.b).getLong((String) this.c, ((Long) this.d).longValue()));
            default:
                return ((SharedPreferences) this.b).getString((String) this.c, (String) this.d);
        }
    }

    public t(b bVar, o oVar, String str) {
        this.a = 2;
        this.c = oVar;
        this.d = str;
        Objects.requireNonNull(bVar);
        this.b = bVar;
    }
}
