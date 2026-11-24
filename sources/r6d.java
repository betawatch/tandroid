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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class r6d implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public r6d(ui0 ui0Var, xw8 xw8Var, String str) {
        this.a = (byte) 3;
        this.b = xw8Var;
        this.c = str;
        Objects.requireNonNull(ui0Var);
        this.d = ui0Var;
    }

    private final Object a() {
        gad gadVar;
        int readInt;
        String str;
        ui0 ui0Var = (ui0) this.b;
        eu2 eu2Var = (eu2) this.c;
        du2 du2Var = (du2) this.d;
        if (!ui0Var.n()) {
            fj0 fj0Var = sld.h;
            ui0Var.x(2, 4, fj0Var);
            eu2Var.e(fj0Var);
            return null;
        }
        String str2 = du2Var.b;
        try {
            yid.g("BillingClient", "Consuming purchase with token: ".concat(str2));
            synchronized (ui0Var.a) {
                gadVar = ui0Var.i;
            }
            if (gadVar == null) {
                ui0Var.g(eu2Var, str2, sld.h, nm7.r1, "Service has been reset to null.", null);
                return null;
            }
            boolean z = ui0Var.n;
            Context context = ui0Var.g;
            if (z) {
                String packageName = context.getPackageName();
                boolean z2 = ui0Var.n;
                String str3 = ui0Var.c;
                String str4 = ui0Var.d;
                long longValue = ui0Var.A.longValue();
                Bundle bundle = new Bundle();
                if (z2) {
                    yid.b(bundle, str3, str4, longValue);
                }
                Bundle Z = ((v9d) gadVar).Z(packageName, str2, bundle);
                readInt = Z.getInt("RESPONSE_CODE");
                str = yid.f("BillingClient", Z);
            } else {
                String packageName2 = context.getPackageName();
                v9d v9dVar = (v9d) gadVar;
                Parcel X = v9dVar.X();
                X.writeInt(3);
                X.writeString(packageName2);
                X.writeString(str2);
                Parcel Y = v9dVar.Y(X, 5);
                readInt = Y.readInt();
                Y.recycle();
                str = "";
            }
            fj0 a = sld.a(readInt, str);
            if (readInt == 0) {
                yid.g("BillingClient", "Successfully consumed purchase.");
                eu2Var.e(a);
                return null;
            }
            ui0Var.g(eu2Var, str2, a, 23, "Error consuming purchase with token. Response code: " + readInt, null);
            return null;
        } catch (DeadObjectException e) {
            ui0Var.g(eu2Var, str2, sld.h, 29, "Error consuming purchase!", e);
            return null;
        } catch (Exception e2) {
            ui0Var.g(eu2Var, str2, sld.f, 29, "Error consuming purchase!", e2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x00ab, code lost:
    
        r0 = r1.s(sld.h, nm7.r1, "Service has been reset to null.", r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [ui0] */
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
        kq kqVar;
        gad gadVar;
        ArrayList arrayList;
        int i;
        ?? r1 = (ui0) this.b;
        xg0 xg0Var = (xg0) this.c;
        oo8 oo8Var = (oo8) this.d;
        ?? r4 = 0;
        if (!r1.n()) {
            fj0 fj0Var = sld.h;
            r1.x(2, 7, fj0Var);
            tgd tgdVar = fhd.b;
            ((bj0) xg0Var.b).b(fj0Var, ojd.e);
            return null;
        }
        if (!r1.r) {
            yid.h("BillingClient", "Querying product details is not supported.");
            fj0 fj0Var2 = sld.m;
            r1.x(20, 7, fj0Var2);
            tgd tgdVar2 = fhd.b;
            ((bj0) xg0Var.b).b(fj0Var2, ojd.e);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        String str = ((zy8) ((fhd) oo8Var.b).get(0)).b;
        fhd fhdVar = (fhd) oo8Var.b;
        int size = fhdVar.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                kqVar = new kq(0, "", arrayList2, arrayList3);
                break;
            }
            int i4 = i3 + 20;
            ArrayList arrayList4 = new ArrayList(fhdVar.subList(i3, i4 > size ? size : i4));
            ArrayList<String> arrayList5 = new ArrayList<>();
            int size2 = arrayList4.size();
            for (int i5 = i2; i5 < size2; i5++) {
                arrayList5.add(((zy8) arrayList4.get(i5)).a);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList5);
            String str2 = r1.c;
            bundle.putString("playBillingLibraryVersion", str2);
            try {
                synchronized (r1.a) {
                    try {
                        gadVar = r1.i;
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
                if (gadVar == null) {
                    break;
                }
                if (r1.s) {
                    r1.x.getClass();
                }
                r1.g.getPackageName();
                r1.g.getPackageName();
                r1.g.getPackageName();
                r1.g.getPackageName();
                fhd fhdVar2 = fhdVar;
                ArrayList arrayList6 = arrayList4;
                r4 = 43;
                r4 = 43;
                try {
                    Bundle e0 = ((v9d) gadVar).e0(true != r1.t ? 17 : 20, r1.g.getPackageName(), str, bundle, yid.d(str2, r1.d, arrayList4, new dhf((byte) 29), r1.A.longValue()));
                    if (e0 == null) {
                        kqVar = r1.s(sld.n, 44, "queryProductDetailsAsync got empty product details response.", null);
                        break;
                    }
                    if (e0.containsKey("DETAILS_LIST")) {
                        ArrayList<String> stringArrayList = e0.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            kqVar = r1.s(sld.n, 46, "queryProductDetailsAsync got null response list", null);
                            break;
                        }
                        ArrayList arrayList7 = new ArrayList();
                        int size3 = stringArrayList.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            try {
                                ln8 ln8Var = new ln8(stringArrayList.get(i6));
                                yid.g("BillingClient", "Got product details: ".concat(ln8Var.toString()));
                                arrayList7.add(ln8Var);
                            } catch (JSONException e) {
                                kqVar = r1.s(sld.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
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
                                    e7c e7cVar = new e7c(str3);
                                    yid.g("BillingClient", "Got unfetchedProduct: ".concat(e7cVar.toString()));
                                    arrayList8.add(e7cVar);
                                }
                            } else {
                                int size5 = arrayList6.size();
                                int i8 = 0;
                                while (i8 < size5) {
                                    Object obj = arrayList6.get(i8);
                                    i8++;
                                    zy8 zy8Var = (zy8) obj;
                                    int size6 = arrayList7.size();
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= size6) {
                                            arrayList = arrayList6;
                                            i = size5;
                                            arrayList8.add(new e7c(new JSONObject().put("productId", zy8Var.a).put(TeXSymbolParser.TYPE_ATTR, zy8Var.b).put("statusCode", 0).toString()));
                                            break;
                                        }
                                        Object obj2 = arrayList7.get(i9);
                                        i9++;
                                        ln8 ln8Var2 = (ln8) obj2;
                                        arrayList = arrayList6;
                                        i = size5;
                                        if (!zy8Var.a.equals(ln8Var2.c) || !zy8Var.b.equals(ln8Var2.d)) {
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
                            fhdVar = fhdVar2;
                            r4 = 0;
                            i2 = 0;
                        } catch (JSONException e2) {
                            kqVar = r1.s(sld.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e2);
                        }
                    } else {
                        int a = yid.a("BillingClient", e0);
                        String f = yid.f("BillingClient", e0);
                        kqVar = a != 0 ? r1.s(sld.a(a, f), 23, hg9.j(a, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : r1.s(sld.a(6, f), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                } catch (DeadObjectException e3) {
                    e = e3;
                    kqVar = r1.s(sld.h, r4, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    ((bj0) xg0Var.b).b(sld.a(kqVar.b, (String) kqVar.d), (ArrayList) kqVar.c);
                    return null;
                } catch (Exception e4) {
                    e = e4;
                    kqVar = r1.s(sld.f, r4, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    ((bj0) xg0Var.b).b(sld.a(kqVar.b, (String) kqVar.d), (ArrayList) kqVar.c);
                    return null;
                }
            } catch (DeadObjectException e5) {
                e = e5;
                r4 = 43;
            } catch (Exception e6) {
                e = e6;
            }
        }
        ((bj0) xg0Var.b).b(sld.a(kqVar.b, (String) kqVar.d), (ArrayList) kqVar.c);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0088, code lost:
    
        r0 = r2.w(sld.h, nm7.r1, "Service has been reset to null", r3);
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
        rhb w;
        ArrayList arrayList;
        gad gadVar;
        Bundle d0;
        fj0 a;
        int i;
        ui0 ui0Var = (ui0) this.d;
        Exception exc2 = null;
        int i2 = 9;
        if (!ui0Var.n()) {
            fj0 fj0Var = sld.h;
            ui0Var.x(2, 9, fj0Var);
            xw8 xw8Var = (xw8) this.b;
            tgd tgdVar = fhd.b;
            xw8Var.a(fj0Var, ojd.e);
            return null;
        }
        String str = (String) this.c;
        if (TextUtils.isEmpty(str)) {
            yid.h("BillingClient", "Please provide a valid product type.");
            fj0 fj0Var2 = sld.d;
            ui0Var.x(50, 9, fj0Var2);
            xw8 xw8Var2 = (xw8) this.b;
            tgd tgdVar2 = fhd.b;
            xw8Var2.a(fj0Var2, ojd.e);
            return null;
        }
        yid.g("BillingClient", "Querying owned items, item type: ".concat(str));
        ArrayList arrayList2 = new ArrayList();
        boolean z = ui0Var.n;
        ui0Var.x.getClass();
        ui0Var.x.getClass();
        long longValue = ui0Var.A.longValue();
        Bundle bundle = new Bundle();
        yid.b(bundle, ui0Var.c, ui0Var.d, longValue);
        int i3 = 1;
        if (z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        String str2 = null;
        while (true) {
            try {
                synchronized (ui0Var.a) {
                    try {
                        gadVar = ui0Var.i;
                    } catch (Throwable th) {
                        th = th;
                        exc = exc2;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (DeadObjectException e) {
                                    e = e;
                                    w = ui0Var.w(sld.h, 52, "Got exception trying to get purchases try to reconnect", e);
                                    arrayList = (ArrayList) w.b;
                                    xw8 xw8Var3 = (xw8) this.b;
                                    fj0 fj0Var3 = (fj0) w.c;
                                    if (arrayList != null) {
                                    }
                                    return exc;
                                } catch (Exception e2) {
                                    e = e2;
                                    w = ui0Var.w(sld.f, 52, "Got exception trying to get purchases try to reconnect", e);
                                    arrayList = (ArrayList) w.b;
                                    xw8 xw8Var32 = (xw8) this.b;
                                    fj0 fj0Var32 = (fj0) w.c;
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
                if (gadVar == null) {
                    break;
                }
                if (ui0Var.n) {
                    d0 = ((v9d) gadVar).d0(ui0Var.w ? 26 : ui0Var.v ? 24 : ui0Var.s ? 19 : i2, ui0Var.g.getPackageName(), str, str2, bundle);
                } else {
                    d0 = ((v9d) gadVar).c0(ui0Var.g.getPackageName(), str, str2);
                }
                fj0 fj0Var4 = sld.f;
                if (d0 == null) {
                    yid.h("BillingClient", "getPurchase() got null owned items list");
                    i = 54;
                } else {
                    int a2 = yid.a("BillingClient", d0);
                    String f = yid.f("BillingClient", d0);
                    g1 a3 = fj0.a();
                    a3.a = a2;
                    a3.c = f;
                    a = a3.a();
                    if (a2 != 0) {
                        yid.h("BillingClient", "getPurchase() failed. Response code: " + a2);
                        i = 23;
                    } else if (d0.containsKey("INAPP_PURCHASE_ITEM_LIST") && d0.containsKey("INAPP_PURCHASE_DATA_LIST") && d0.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = d0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = d0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = d0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            yid.h("BillingClient", "Bundle returned from getPurchase() contains null SKUs list.");
                            i = 56;
                        } else if (stringArrayList2 == null) {
                            yid.h("BillingClient", "Bundle returned from getPurchase() contains null purchases list.");
                            i = 57;
                        } else if (stringArrayList3 == null) {
                            yid.h("BillingClient", "Bundle returned from getPurchase() contains null signatures list.");
                            i = 58;
                        } else {
                            a = sld.g;
                            i = i3;
                        }
                    } else {
                        yid.h("BillingClient", "Bundle returned from getPurchase() doesn't contain required fields.");
                        i = 55;
                    }
                    if (a == sld.g) {
                        w = ui0Var.w(a, i, "Purchase bundle invalid", exc2);
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
                        yid.g("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i4))));
                        try {
                            Purchase purchase = new Purchase(str3, str4);
                            if (TextUtils.isEmpty(purchase.b())) {
                                yid.h("BillingClient", "BUG: empty/null token!");
                                z2 = true;
                            }
                            arrayList2.add(purchase);
                            i4++;
                            stringArrayList4 = arrayList3;
                        } catch (JSONException e3) {
                            w = ui0Var.w(sld.f, 51, "Got an exception trying to decode the purchase!", e3);
                        }
                    }
                    if (z2) {
                        i2 = 9;
                        ui0Var.x(26, 9, fj0Var4);
                    } else {
                        i2 = 9;
                    }
                    str2 = d0.getString("INAPP_CONTINUATION_TOKEN");
                    yid.g("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                    if (TextUtils.isEmpty(str2)) {
                        w = new rhb(sld.g, arrayList2, (byte) 16);
                        break;
                    }
                    exc2 = exc;
                    i3 = 1;
                }
                a = fj0Var4;
                if (a == sld.g) {
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
        xw8 xw8Var322 = (xw8) this.b;
        fj0 fj0Var322 = (fj0) w.c;
        if (arrayList != null) {
            xw8Var322.a(fj0Var322, arrayList);
        } else {
            tgd tgdVar3 = fhd.b;
            xw8Var322.a(fj0Var322, ojd.e);
        }
        return exc;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle c;
        gad gadVar;
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
                ui0 ui0Var = (ui0) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                try {
                    synchronized (ui0Var.a) {
                        gadVar = ui0Var.i;
                    }
                    if (gadVar == null) {
                        return yid.c(nm7.r1, sld.h);
                    }
                    return ((v9d) gadVar).a0(ui0Var.g.getPackageName(), str, str2);
                } catch (DeadObjectException e) {
                    fj0 fj0Var = sld.h;
                    String a = ald.a(e);
                    c = yid.c(5, fj0Var);
                    if (a != null) {
                        c.putString("ADDITIONAL_LOG_DETAILS", a);
                    }
                    return c;
                } catch (Exception e2) {
                    fj0 fj0Var2 = sld.f;
                    String a2 = ald.a(e2);
                    c = yid.c(5, fj0Var2);
                    if (a2 != null) {
                        c.putString("ADDITIONAL_LOG_DETAILS", a2);
                    }
                    return c;
                }
        }
    }

    public /* synthetic */ r6d(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
