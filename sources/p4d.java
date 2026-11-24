// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class p4d implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public p4d(uh0 uh0Var, wu8 wu8Var, String str) {
        this.a = (byte) 3;
        this.b = wu8Var;
        this.c = str;
        Objects.requireNonNull(uh0Var);
        this.d = uh0Var;
    }

    private final Object a() {
        e8d e8dVar;
        int readInt;
        String str;
        uh0 uh0Var = (uh0) this.b;
        ts2 ts2Var = (ts2) this.c;
        ss2 ss2Var = (ss2) this.d;
        if (!uh0Var.n()) {
            fi0 fi0Var = qjd.h;
            uh0Var.x(2, 4, fi0Var);
            ts2Var.d(fi0Var);
            return null;
        }
        String str2 = ss2Var.a;
        try {
            xgd.g("BillingClient", "Consuming purchase with token: ".concat(str2));
            synchronized (uh0Var.a) {
                e8dVar = uh0Var.i;
            }
            if (e8dVar == null) {
                uh0Var.g(ts2Var, str2, qjd.h, kk7.r1, "Service has been reset to null.", null);
                return null;
            }
            boolean z = uh0Var.n;
            Context context = uh0Var.g;
            if (z) {
                String packageName = context.getPackageName();
                boolean z2 = uh0Var.n;
                String str3 = uh0Var.c;
                String str4 = uh0Var.d;
                long longValue = uh0Var.A.longValue();
                Bundle bundle = new Bundle();
                if (z2) {
                    xgd.b(bundle, str3, str4, longValue);
                }
                Bundle Z = ((t7d) e8dVar).Z(packageName, str2, bundle);
                readInt = Z.getInt("RESPONSE_CODE");
                str = xgd.f("BillingClient", Z);
            } else {
                String packageName2 = context.getPackageName();
                t7d t7dVar = (t7d) e8dVar;
                Parcel X = t7dVar.X();
                X.writeInt(3);
                X.writeString(packageName2);
                X.writeString(str2);
                Parcel Y = t7dVar.Y(X, 5);
                readInt = Y.readInt();
                Y.recycle();
                str = "";
            }
            fi0 a = qjd.a(readInt, str);
            if (readInt == 0) {
                xgd.g("BillingClient", "Successfully consumed purchase.");
                ts2Var.d(a);
                return null;
            }
            uh0Var.g(ts2Var, str2, a, 23, "Error consuming purchase with token. Response code: " + readInt, null);
            return null;
        } catch (DeadObjectException e) {
            uh0Var.g(ts2Var, str2, qjd.h, 29, "Error consuming purchase!", e);
            return null;
        } catch (Exception e2) {
            uh0Var.g(ts2Var, str2, qjd.f, 29, "Error consuming purchase!", e2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x00ab, code lost:
    
        r0 = r1.s(qjd.h, kk7.r1, "Service has been reset to null.", r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [uh0] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b() {
        kp kpVar;
        e8d e8dVar;
        ArrayList arrayList;
        int i;
        ?? r1 = (uh0) this.b;
        sg0 sg0Var = (sg0) this.c;
        z24 z24Var = (z24) this.d;
        ?? r4 = 0;
        if (!r1.n()) {
            fi0 fi0Var = qjd.h;
            r1.x(2, 7, fi0Var);
            sed sedVar = efd.b;
            ((bi0) sg0Var.b).b(fi0Var, nhd.e);
            return null;
        }
        if (!r1.r) {
            xgd.h("BillingClient", "Querying product details is not supported.");
            fi0 fi0Var2 = qjd.m;
            r1.x(20, 7, fi0Var2);
            sed sedVar2 = efd.b;
            ((bi0) sg0Var.b).b(fi0Var2, nhd.e);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        String str = ((yw8) ((efd) z24Var.b).get(0)).b;
        efd efdVar = (efd) z24Var.b;
        int size = efdVar.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                kpVar = new kp(0, "", arrayList2, arrayList3);
                break;
            }
            int i4 = i3 + 20;
            ArrayList arrayList4 = new ArrayList(efdVar.subList(i3, i4 > size ? size : i4));
            ArrayList<String> arrayList5 = new ArrayList<>();
            int size2 = arrayList4.size();
            for (int i5 = i2; i5 < size2; i5++) {
                arrayList5.add(((yw8) arrayList4.get(i5)).a);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList5);
            String str2 = r1.c;
            bundle.putString("playBillingLibraryVersion", str2);
            try {
                synchronized (r1.a) {
                    try {
                        e8dVar = r1.i;
                    } finally {
                        th = th;
                        r4 = 43;
                        r4 = 43;
                        while (true) {
                            try {
                            } catch (Throwable th) {
                                th = th;
                            }
                        }
                    }
                }
                if (e8dVar == null) {
                    break;
                }
                if (r1.s) {
                    r1.x.getClass();
                }
                r1.g.getPackageName();
                r1.g.getPackageName();
                r1.g.getPackageName();
                r1.g.getPackageName();
                efd efdVar2 = efdVar;
                ArrayList arrayList6 = arrayList4;
                r4 = 43;
                r4 = 43;
                try {
                    Bundle e0 = ((t7d) e8dVar).e0(true != r1.t ? 17 : 20, r1.g.getPackageName(), str, bundle, xgd.d(str2, r1.d, arrayList4, new cff((byte) 29), r1.A.longValue()));
                    if (e0 == null) {
                        kpVar = r1.s(qjd.n, 44, "queryProductDetailsAsync got empty product details response.", null);
                        break;
                    }
                    if (e0.containsKey("DETAILS_LIST")) {
                        ArrayList<String> stringArrayList = e0.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            kpVar = r1.s(qjd.n, 46, "queryProductDetailsAsync got null response list", null);
                            break;
                        }
                        ArrayList arrayList7 = new ArrayList();
                        int size3 = stringArrayList.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            try {
                                kl8 kl8Var = new kl8(stringArrayList.get(i6));
                                xgd.g("BillingClient", "Got product details: ".concat(kl8Var.toString()));
                                arrayList7.add(kl8Var);
                            } catch (JSONException e) {
                                kpVar = r1.s(qjd.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                            }
                        }
                        ArrayList<String> stringArrayList2 = e0.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                        try {
                            ArrayList arrayList8 = new ArrayList();
                            if (stringArrayList2 != null) {
                                int size4 = stringArrayList2.size();
                                int i7 = 0;
                                while (i7 < size4) {
                                    String str3 = stringArrayList2.get(i7);
                                    i7++;
                                    e5c e5cVar = new e5c(str3);
                                    xgd.g("BillingClient", "Got unfetchedProduct: ".concat(e5cVar.toString()));
                                    arrayList8.add(e5cVar);
                                }
                            } else {
                                int size5 = arrayList6.size();
                                int i8 = 0;
                                while (i8 < size5) {
                                    Object obj = arrayList6.get(i8);
                                    i8++;
                                    yw8 yw8Var = (yw8) obj;
                                    int size6 = arrayList7.size();
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= size6) {
                                            arrayList = arrayList6;
                                            i = size5;
                                            arrayList8.add(new e5c(new JSONObject().put("productId", yw8Var.a).put(TeXSymbolParser.TYPE_ATTR, yw8Var.b).put("statusCode", 0).toString()));
                                            break;
                                        }
                                        Object obj2 = arrayList7.get(i9);
                                        i9++;
                                        kl8 kl8Var2 = (kl8) obj2;
                                        arrayList = arrayList6;
                                        i = size5;
                                        if (!yw8Var.a.equals(kl8Var2.c) || !yw8Var.b.equals(kl8Var2.d)) {
                                            arrayList6 = arrayList;
                                            size5 = i;
                                        }
                                    }
                                    arrayList6 = arrayList;
                                    size5 = i;
                                }
                            }
                            arrayList2.addAll(arrayList7);
                            arrayList3.addAll(arrayList8);
                            i3 = i4;
                            efdVar = efdVar2;
                            r4 = 0;
                            i2 = 0;
                        } catch (JSONException e2) {
                            kpVar = r1.s(qjd.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e2);
                        }
                    } else {
                        int a = xgd.a("BillingClient", e0);
                        String f = xgd.f("BillingClient", e0);
                        kpVar = a != 0 ? r1.s(qjd.a(a, f), 23, de9.k(a, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : r1.s(qjd.a(6, f), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                } catch (DeadObjectException e3) {
                    e = e3;
                    kpVar = r1.s(qjd.h, r4, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    ((bi0) sg0Var.b).b(qjd.a(kpVar.b, (String) kpVar.d), (ArrayList) kpVar.c);
                    return null;
                } catch (Exception e4) {
                    e = e4;
                    kpVar = r1.s(qjd.f, r4, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    ((bi0) sg0Var.b).b(qjd.a(kpVar.b, (String) kpVar.d), (ArrayList) kpVar.c);
                    return null;
                }
            } catch (DeadObjectException e5) {
                e = e5;
                r4 = 43;
            } catch (Exception e6) {
                e = e6;
            }
        }
        ((bi0) sg0Var.b).b(qjd.a(kpVar.b, (String) kpVar.d), (ArrayList) kpVar.c);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0088, code lost:
    
        r0 = r2.w(qjd.h, kk7.r1, "Service has been reset to null", r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0168 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object c() {
        Exception exc;
        aec w;
        ArrayList arrayList;
        e8d e8dVar;
        Bundle d0;
        fi0 a;
        int i;
        uh0 uh0Var = (uh0) this.d;
        Exception exc2 = null;
        int i2 = 9;
        if (!uh0Var.n()) {
            fi0 fi0Var = qjd.h;
            uh0Var.x(2, 9, fi0Var);
            wu8 wu8Var = (wu8) this.b;
            sed sedVar = efd.b;
            wu8Var.a(fi0Var, nhd.e);
            return null;
        }
        String str = (String) this.c;
        if (TextUtils.isEmpty(str)) {
            xgd.h("BillingClient", "Please provide a valid product type.");
            fi0 fi0Var2 = qjd.d;
            uh0Var.x(50, 9, fi0Var2);
            wu8 wu8Var2 = (wu8) this.b;
            sed sedVar2 = efd.b;
            wu8Var2.a(fi0Var2, nhd.e);
            return null;
        }
        xgd.g("BillingClient", "Querying owned items, item type: ".concat(str));
        ArrayList arrayList2 = new ArrayList();
        boolean z = uh0Var.n;
        uh0Var.x.getClass();
        uh0Var.x.getClass();
        long longValue = uh0Var.A.longValue();
        Bundle bundle = new Bundle();
        xgd.b(bundle, uh0Var.c, uh0Var.d, longValue);
        int i3 = 1;
        if (z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        String str2 = null;
        while (true) {
            try {
                synchronized (uh0Var.a) {
                    try {
                        e8dVar = uh0Var.i;
                    } catch (Throwable th) {
                        th = th;
                        exc = exc2;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (DeadObjectException e) {
                                    e = e;
                                    w = uh0Var.w(qjd.h, 52, "Got exception trying to get purchases try to reconnect", e);
                                    arrayList = (ArrayList) w.b;
                                    wu8 wu8Var3 = (wu8) this.b;
                                    fi0 fi0Var3 = (fi0) w.c;
                                    if (arrayList != null) {
                                    }
                                    return exc;
                                } catch (Exception e2) {
                                    e = e2;
                                    w = uh0Var.w(qjd.f, 52, "Got exception trying to get purchases try to reconnect", e);
                                    arrayList = (ArrayList) w.b;
                                    wu8 wu8Var32 = (wu8) this.b;
                                    fi0 fi0Var32 = (fi0) w.c;
                                    if (arrayList != null) {
                                    }
                                    return exc;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
                if (e8dVar == null) {
                    break;
                }
                if (uh0Var.n) {
                    d0 = ((t7d) e8dVar).d0(uh0Var.w ? 26 : uh0Var.v ? 24 : uh0Var.s ? 19 : i2, uh0Var.g.getPackageName(), str, str2, bundle);
                } else {
                    d0 = ((t7d) e8dVar).c0(uh0Var.g.getPackageName(), str, str2);
                }
                fi0 fi0Var4 = qjd.f;
                if (d0 == null) {
                    xgd.h("BillingClient", "getPurchase() got null owned items list");
                    i = 54;
                } else {
                    int a2 = xgd.a("BillingClient", d0);
                    String f = xgd.f("BillingClient", d0);
                    g1 a3 = fi0.a();
                    a3.a = a2;
                    a3.c = f;
                    a = a3.a();
                    if (a2 != 0) {
                        xgd.h("BillingClient", "getPurchase() failed. Response code: " + a2);
                        i = 23;
                    } else if (d0.containsKey("INAPP_PURCHASE_ITEM_LIST") && d0.containsKey("INAPP_PURCHASE_DATA_LIST") && d0.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = d0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = d0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = d0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            xgd.h("BillingClient", "Bundle returned from getPurchase() contains null SKUs list.");
                            i = 56;
                        } else if (stringArrayList2 == null) {
                            xgd.h("BillingClient", "Bundle returned from getPurchase() contains null purchases list.");
                            i = 57;
                        } else if (stringArrayList3 == null) {
                            xgd.h("BillingClient", "Bundle returned from getPurchase() contains null signatures list.");
                            i = 58;
                        } else {
                            a = qjd.g;
                            i = i3;
                        }
                    } else {
                        xgd.h("BillingClient", "Bundle returned from getPurchase() doesn't contain required fields.");
                        i = 55;
                    }
                    if (a == qjd.g) {
                        w = uh0Var.w(a, i, "Purchase bundle invalid", exc2);
                        break;
                    }
                    ArrayList<String> stringArrayList4 = d0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList5 = d0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList6 = d0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    int i4 = 0;
                    exc = exc2;
                    boolean z2 = false;
                    while (i4 < stringArrayList5.size()) {
                        String str3 = stringArrayList5.get(i4);
                        String str4 = stringArrayList6.get(i4);
                        ArrayList<String> arrayList3 = stringArrayList4;
                        xgd.g("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i4))));
                        try {
                            Purchase purchase = new Purchase(str3, str4);
                            if (TextUtils.isEmpty(purchase.b())) {
                                xgd.h("BillingClient", "BUG: empty/null token!");
                                z2 = true;
                            }
                            arrayList2.add(purchase);
                            i4++;
                            stringArrayList4 = arrayList3;
                        } catch (JSONException e3) {
                            w = uh0Var.w(qjd.f, 51, "Got an exception trying to decode the purchase!", e3);
                        }
                    }
                    if (z2) {
                        i2 = 9;
                        uh0Var.x(26, 9, fi0Var4);
                    } else {
                        i2 = 9;
                    }
                    str2 = d0.getString("INAPP_CONTINUATION_TOKEN");
                    xgd.g("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                    if (TextUtils.isEmpty(str2)) {
                        w = new aec(qjd.g, arrayList2, (byte) 14);
                        break;
                    }
                    exc2 = exc;
                    i3 = 1;
                }
                a = fi0Var4;
                if (a == qjd.g) {
                }
            } catch (DeadObjectException e4) {
                e = e4;
                exc = exc2;
            } catch (Exception e5) {
                e = e5;
                exc = exc2;
            }
        }
        exc = exc2;
        arrayList = (ArrayList) w.b;
        wu8 wu8Var322 = (wu8) this.b;
        fi0 fi0Var322 = (fi0) w.c;
        if (arrayList != null) {
            wu8Var322.a(fi0Var322, arrayList);
        } else {
            sed sedVar3 = efd.b;
            wu8Var322.a(fi0Var322, nhd.e);
        }
        return exc;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle c;
        e8d e8dVar;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((SharedPreferences) this.b).getBoolean((String) this.c, ((Boolean) this.d).booleanValue()));
            case 1:
                return a();
            case 2:
                return b();
            case 3:
                return c();
            case 4:
                return Integer.valueOf(((SharedPreferences) this.b).getInt((String) this.c, ((Integer) this.d).intValue()));
            case 5:
                return Long.valueOf(((SharedPreferences) this.b).getLong((String) this.c, ((Long) this.d).longValue()));
            case 6:
                return ((SharedPreferences) this.b).getString((String) this.c, (String) this.d);
            default:
                uh0 uh0Var = (uh0) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                try {
                    synchronized (uh0Var.a) {
                        e8dVar = uh0Var.i;
                    }
                    if (e8dVar == null) {
                        return xgd.c(kk7.r1, qjd.h);
                    }
                    return ((t7d) e8dVar).a0(uh0Var.g.getPackageName(), str, str2);
                } catch (DeadObjectException e) {
                    fi0 fi0Var = qjd.h;
                    String a = yid.a(e);
                    c = xgd.c(5, fi0Var);
                    if (a != null) {
                        c.putString("ADDITIONAL_LOG_DETAILS", a);
                    }
                    return c;
                } catch (Exception e2) {
                    fi0 fi0Var2 = qjd.f;
                    String a2 = yid.a(e2);
                    c = xgd.c(5, fi0Var2);
                    if (a2 != null) {
                        c.putString("ADDITIONAL_LOG_DETAILS", a2);
                    }
                    return c;
                }
        }
    }

    public /* synthetic */ p4d(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
