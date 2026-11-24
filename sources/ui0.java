// default package

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.ProxyBillingActivity;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ui0 {
    public final Long A;
    public final ocd B;
    public final String c;
    public final String d;
    public volatile ej0 f;
    public final Context g;
    public final rhb h;
    public volatile gad i;
    public volatile wed j;
    public boolean k;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final f8e x;
    public final boolean y;
    public ExecutorService z;
    public final Object a = new Object();
    public volatile byte b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int l = 0;

    public ui0(f8e f8eVar, Context context, cj0 cj0Var, sk skVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = cdd.a;
        this.c = "8.0.0";
        String v = v();
        this.d = v;
        this.g = context.getApplicationContext();
        cne x = nne.x();
        x.b();
        nne.v((nne) x.b);
        if (v != null) {
            x.b();
            nne.w((nne) x.b, v);
        }
        String packageName = this.g.getPackageName();
        x.b();
        nne.t((nne) x.b, packageName);
        x.b();
        nne.q((nne) x.b, nextLong);
        x.b();
        nne.u((nne) x.b);
        int i = Build.VERSION.SDK_INT;
        x.b();
        nne.n((nne) x.b, i);
        x.c();
        try {
            int i2 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            x.b();
            nne.o((nne) x.b, i2);
        } catch (Throwable th) {
            yid.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new rhb(this.g, (nne) x.a());
        if (cj0Var == null) {
            yid.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f = new ej0(this.g, cj0Var, this.h);
        this.x = f8eVar;
        this.y = false;
        this.g.getPackageName();
    }

    public static Future f(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new tnd(submit, runnable, (byte) 14), (long) (j * 0.95d));
            return submit;
        } catch (Exception e) {
            yid.i("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static void p(ui0 ui0Var, int i) {
        if (i != 0) {
            ui0Var.k(0);
            return;
        }
        synchronized (ui0Var.a) {
            if (ui0Var.b == 3) {
                return;
            }
            ui0Var.k(2);
            ej0 ej0Var = ui0Var.f != null ? ui0Var.f : null;
            if (ej0Var != null) {
                boolean z = ui0Var.u;
                IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                ej0Var.b = z;
                idf idfVar = (idf) ej0Var.f;
                Context context = (Context) ej0Var.a;
                idfVar.a(context, intentFilter2);
                boolean z2 = ej0Var.b;
                idf idfVar2 = (idf) ej0Var.e;
                if (z2) {
                    idfVar2.b(context, intentFilter);
                } else {
                    idfVar2.a(context, intentFilter);
                }
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean q(ui0 ui0Var) {
        boolean z;
        synchronized (ui0Var.a) {
            z = ui0Var.b == 1;
        }
        return z;
    }

    public static String v() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void A(int i, fj0 fj0Var, long j, boolean z) {
        try {
            int i2 = ald.a;
            try {
                this.h.y(ald.b(i, 2, fj0Var, null, fme.b), this.l, j, z);
            } catch (Throwable th) {
                yid.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            yid.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void B(int i, fj0 fj0Var, String str, long j, boolean z) {
        try {
            int i2 = ald.a;
            try {
                this.h.y(ald.b(i, 2, fj0Var, str, fme.b), this.l, j, z);
            } catch (Throwable th) {
                yid.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            yid.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void C(fj0 fj0Var) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new us4((Object) this, (Object) fj0Var, (byte) 16));
    }

    public void a(du2 du2Var, eu2 eu2Var) {
        if (f(new r6d(this, eu2Var, du2Var, (byte) 1), 30000L, new us4(this, eu2Var, du2Var), r(), e()) == null) {
            fj0 u = u();
            x(25, 4, u);
            eu2Var.e(u);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0688 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02df  */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v60, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v40, types: [android.os.BaseBundle, android.os.Bundle] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fj0 b(Activity activity, final ej0 ej0Var) {
        String str;
        long j;
        String str2;
        fj0 fj0Var;
        in8 in8Var;
        fj0 fj0Var2;
        HashSet hashSet;
        fj0 a;
        long j2;
        boolean z;
        Future f;
        long j3;
        Object obj;
        int d;
        int i;
        boolean z2;
        int i2;
        long j4;
        String str3;
        boolean z3;
        String str4;
        boolean z4;
        long nextLong = new Random().nextLong();
        if (this.f == null || ((cj0) this.f.c) == null) {
            fj0 fj0Var3 = sld.o;
            y(12, fj0Var3, nextLong);
            return fj0Var3;
        }
        try {
            yid.g("BillingClient", "Already connected or not opted into auto reconnection.");
            fj0 fj0Var4 = sld.g;
            TimeUnit.MILLISECONDS.getClass();
            int i3 = fj0Var4.a;
            if (i3 == 0) {
                yid.g("BillingClient", "Reconnection succeeded with result: " + i3);
            } else {
                yid.h("BillingClient", "Reconnection failed with result: " + i3);
            }
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            yid.i("BillingClient", "Error during reconnection attempt: ", e);
        }
        if (!o()) {
            fj0 fj0Var5 = sld.h;
            y(2, fj0Var5, nextLong);
            C(fj0Var5);
            return fj0Var5;
        }
        synchronized (this.a) {
            if (this.j != null) {
                this.j.getClass();
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) ej0Var.f);
        fhd fhdVar = (fhd) ej0Var.e;
        Iterator it = arrayList.iterator();
        if ((it.hasNext() ? it.next() : null) != null) {
            rjb.p();
            return null;
        }
        tgd tgdVar = (tgd) fhdVar.iterator();
        dj0 dj0Var = (dj0) (tgdVar.hasNext() ? tgdVar.next() : null);
        ln8 ln8Var = dj0Var.a;
        String str5 = ln8Var.c;
        String str6 = ln8Var.d;
        if (str6.equals("subs") && !this.k) {
            yid.h("BillingClient", "Current client doesn't support subscriptions.");
            fj0 fj0Var6 = sld.j;
            A(9, fj0Var6, nextLong, false);
            C(fj0Var6);
            return fj0Var6;
        }
        if (((String) ej0Var.a) == null && ((String) ej0Var.c) == null) {
            ohd ohdVar = (ohd) ej0Var.d;
            ohdVar.getClass();
            if (ohdVar.a == 0 && !ej0Var.b) {
                fhd fhdVar2 = (fhd) ej0Var.e;
                if (fhdVar2 != null) {
                    int size = fhdVar2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                    }
                }
                if (arrayList.size() <= 1 && !this.q) {
                    yid.h("BillingClient", "Current client doesn't support multi-item purchases.");
                    fj0 fj0Var7 = sld.k;
                    A(19, fj0Var7, nextLong, false);
                    C(fj0Var7);
                    return fj0Var7;
                }
                if (fhdVar.isEmpty() && !this.r) {
                    yid.h("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                    fj0 fj0Var8 = sld.m;
                    A(20, fj0Var8, nextLong, false);
                    C(fj0Var8);
                    return fj0Var8;
                }
                if (((fhd) ej0Var.e).isEmpty()) {
                    dj0 dj0Var2 = (dj0) ((fhd) ej0Var.e).get(0);
                    int i5 = 1;
                    while (i5 < ((fhd) ej0Var.e).size()) {
                        dj0 dj0Var3 = (dj0) ((fhd) ej0Var.e).get(i5);
                        str = str5;
                        if (dj0Var3.a.d.equals(dj0Var2.a.d) || dj0Var3.a.d.equals("play_pass_subs")) {
                            i5++;
                            str5 = str;
                        } else {
                            a = sld.a(5, "All products should have same ProductType.");
                        }
                    }
                    str = str5;
                    ln8 ln8Var2 = dj0Var2.a;
                    String optString = ln8Var2.b.optString("packageName");
                    HashMap hashMap = new HashMap();
                    HashSet hashSet2 = new HashSet();
                    j = nextLong;
                    fhd fhdVar3 = (fhd) ej0Var.e;
                    int size2 = fhdVar3.size();
                    str2 = str6;
                    int i6 = 0;
                    while (true) {
                        if (i6 < size2) {
                            fhd fhdVar4 = fhdVar3;
                            dj0 dj0Var4 = (dj0) fhdVar3.get(i6);
                            int i7 = size2;
                            ln8 ln8Var3 = dj0Var4.a;
                            int i8 = i6;
                            ArrayList arrayList2 = ln8Var3.h;
                            String str7 = ln8Var3.c;
                            if (arrayList2 != null) {
                                hashSet = hashSet2;
                                if (dj0Var4.b == null) {
                                    fj0Var = sld.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str7);
                                    break;
                                }
                            } else {
                                hashSet = hashSet2;
                            }
                            if (hashMap.containsKey(str7)) {
                                fj0Var = sld.a(5, "ProductId can not be duplicated. Invalid product id: " + ln8Var3.c + ".");
                                break;
                            }
                            hashMap.put(ln8Var3.c, dj0Var4);
                            if (!ln8Var2.d.equals("play_pass_subs") && !ln8Var3.d.equals("play_pass_subs") && !optString.equals(ln8Var3.b.optString("packageName"))) {
                                fj0Var = sld.a(5, "All products must have the same package name.");
                                break;
                            }
                            i6 = i8 + 1;
                            size2 = i7;
                            fhdVar3 = fhdVar4;
                            hashSet2 = hashSet;
                        } else {
                            Iterator it2 = hashSet2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    String str8 = (String) it2.next();
                                    if (hashMap.containsKey(str8)) {
                                        fj0Var = sld.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str8 + ".");
                                        break;
                                    }
                                } else {
                                    ArrayList arrayList3 = ln8Var2.i;
                                    String str9 = dj0Var2.b;
                                    if (str9 != null && arrayList3 != null) {
                                        int size3 = arrayList3.size();
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 >= size3) {
                                                in8Var = null;
                                                break;
                                            }
                                            Object obj2 = arrayList3.get(i9);
                                            i9++;
                                            in8Var = (in8) obj2;
                                            if (str9.equals(in8Var.d)) {
                                                break;
                                            }
                                        }
                                        if (in8Var != null && in8Var.g != null) {
                                            fj0Var = sld.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                        }
                                    }
                                    fj0Var = sld.g;
                                }
                            }
                        }
                    }
                    fj0Var2 = fj0Var;
                    if (fj0Var2 != sld.g) {
                        A(nm7.s1, fj0Var2, j, false);
                        C(fj0Var2);
                        return fj0Var2;
                    }
                    boolean z5 = false;
                    long j5 = j;
                    if (this.m) {
                        boolean z6 = this.n;
                        this.x.getClass();
                        this.x.getClass();
                        boolean z7 = this.y;
                        String str10 = this.c;
                        String str11 = this.d;
                        long longValue = this.A.longValue();
                        this.g.getPackageName();
                        int i10 = yid.a;
                        z = false;
                        final ?? bundle = new Bundle();
                        yid.b(bundle, str10, str11, longValue);
                        bundle.putLong("billingClientTransactionId", j5);
                        byte b = ((ohd) ej0Var.d).a;
                        if (b != 0) {
                            bundle.putInt("prorationMode", b);
                        }
                        if (!TextUtils.isEmpty((String) ej0Var.a)) {
                            bundle.putString("accountId", (String) ej0Var.a);
                        }
                        if (!TextUtils.isEmpty((String) ej0Var.c)) {
                            bundle.putString("obfuscatedProfileId", (String) ej0Var.c);
                        }
                        if (!TextUtils.isEmpty((String) ((ohd) ej0Var.d).b)) {
                            bundle.putString("oldSkuPurchaseToken", (String) ((ohd) ej0Var.d).b);
                        }
                        ((ohd) ej0Var.d).getClass();
                        if (z6) {
                            z3 = true;
                            bundle.putBoolean("enablePendingPurchases", true);
                        } else {
                            z3 = true;
                        }
                        if (z7) {
                            bundle.putBoolean("enableAlternativeBilling", z3);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        tgd listIterator = ((fhd) ej0Var.e).listIterator(0);
                        while (listIterator.hasNext()) {
                        }
                        if (!arrayList4.isEmpty()) {
                            trd n = asd.n();
                            n.b();
                            asd.o((asd) n.b, arrayList4);
                            bundle.putByteArray("subscriptionProductReplacementParamsList", ((asd) n.a()).a());
                        }
                        if (arrayList.isEmpty()) {
                            ArrayList arrayList5 = new ArrayList(fhdVar.size() - 1);
                            ArrayList arrayList6 = new ArrayList(fhdVar.size() - 1);
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = new ArrayList();
                            int i11 = 0;
                            while (i11 < fhdVar.size()) {
                                dj0 dj0Var5 = (dj0) fhdVar.get(i11);
                                ln8 ln8Var4 = dj0Var5.a;
                                long j6 = j5;
                                if (!ln8Var4.f.isEmpty()) {
                                    arrayList7.add(ln8Var4.f);
                                }
                                arrayList8.add(dj0Var5.b);
                                String str12 = ln8Var4.g;
                                ArrayList arrayList11 = ln8Var4.i;
                                if (arrayList11 != null && !arrayList11.isEmpty()) {
                                    ArrayList arrayList12 = ln8Var4.i;
                                    int size4 = arrayList12.size();
                                    int i12 = 0;
                                    while (i12 < size4) {
                                        Object obj3 = arrayList12.get(i12);
                                        i12++;
                                        ArrayList arrayList13 = arrayList12;
                                        in8 in8Var2 = (in8) obj3;
                                        String str13 = str12;
                                        if (!TextUtils.isEmpty(in8Var2.f)) {
                                            str4 = in8Var2.f;
                                            break;
                                        }
                                        str12 = str13;
                                        arrayList12 = arrayList13;
                                    }
                                }
                                str4 = str12;
                                if (!TextUtils.isEmpty(str4)) {
                                    arrayList9.add(str4);
                                }
                                if (i11 > 0) {
                                    arrayList5.add(((dj0) fhdVar.get(i11)).a.c);
                                    arrayList6.add(((dj0) fhdVar.get(i11)).a.d);
                                }
                                i11++;
                                j5 = j6;
                            }
                            j2 = j5;
                            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList8);
                            if (!arrayList10.isEmpty()) {
                                bundle.putIntegerArrayList("autoPayBalanceThresholdList", arrayList10);
                            }
                            if (!arrayList7.isEmpty()) {
                                bundle.putStringArrayList("skuDetailsTokens", arrayList7);
                            }
                            if (!arrayList9.isEmpty()) {
                                bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList9);
                            }
                            if (!arrayList5.isEmpty()) {
                                bundle.putStringArrayList("additionalSkus", arrayList5);
                                bundle.putStringArrayList("additionalSkuTypes", arrayList6);
                            }
                        } else {
                            ArrayList arrayList14 = new ArrayList();
                            Iterator it3 = arrayList.iterator();
                            if (it3.hasNext()) {
                                throw kt6.l(it3);
                            }
                            if (!arrayList14.isEmpty()) {
                                bundle.putStringArrayList("skuDetailsTokens", arrayList14);
                            }
                            if (arrayList.size() > 1) {
                                ArrayList arrayList15 = new ArrayList(arrayList.size() - 1);
                                ArrayList arrayList16 = new ArrayList(arrayList.size() - 1);
                                if (1 < arrayList.size()) {
                                    arrayList.get(1).getClass();
                                    rjb.p();
                                    return null;
                                }
                                bundle.putStringArrayList("additionalSkus", arrayList15);
                                bundle.putStringArrayList("additionalSkuTypes", arrayList16);
                            }
                            j2 = j5;
                        }
                        if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.o) {
                            fj0 fj0Var9 = sld.l;
                            A(21, fj0Var9, j2, false);
                            C(fj0Var9);
                            return fj0Var9;
                        }
                        if (TextUtils.isEmpty(dj0Var.a.b.optString("packageName"))) {
                            z4 = false;
                        } else {
                            bundle.putString("skuPackageName", dj0Var.a.b.optString("packageName"));
                            z4 = true;
                        }
                        Intent intent = activity.getIntent();
                        if (intent == null) {
                            yid.h("BillingClient", "Activity's intent is null.");
                        } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                            String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                            bundle.putString("proxyPackage", stringExtra);
                            try {
                                bundle.putString("proxyPackageVersion", this.g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                            } catch (PackageManager.NameNotFoundException unused) {
                                bundle.putString("proxyPackageVersion", "package not found");
                            }
                        }
                        final int i13 = (!this.r || fhdVar.isEmpty()) ? (this.p && z4) ? 15 : this.n ? 9 : 6 : 17;
                        final String str14 = str;
                        final ?? r4 = str2;
                        f = f(new Callable(i13, str14, r4, ej0Var, bundle) { // from class: cjf
                            public final /* synthetic */ byte b;
                            public final /* synthetic */ String c;
                            public final /* synthetic */ String d;
                            public final /* synthetic */ Bundle e;

                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                this.e = bundle;
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Bundle c;
                                gad gadVar;
                                ui0 ui0Var = ui0.this;
                                byte b2 = this.b;
                                String str15 = this.c;
                                String str16 = this.d;
                                Bundle bundle2 = this.e;
                                try {
                                    synchronized (ui0Var.a) {
                                        gadVar = ui0Var.i;
                                    }
                                    if (gadVar == null) {
                                        return yid.c(nm7.r1, sld.h);
                                    }
                                    return ((v9d) gadVar).b0(b2, ui0Var.g.getPackageName(), str15, str16, bundle2);
                                } catch (DeadObjectException e2) {
                                    fj0 fj0Var10 = sld.h;
                                    String a2 = ald.a(e2);
                                    c = yid.c(5, fj0Var10);
                                    if (a2 != null) {
                                        c.putString("ADDITIONAL_LOG_DETAILS", a2);
                                    }
                                    return c;
                                } catch (Exception e3) {
                                    fj0 fj0Var11 = sld.f;
                                    String a3 = ald.a(e3);
                                    c = yid.c(5, fj0Var11);
                                    if (a3 != null) {
                                        c.putString("ADDITIONAL_LOG_DETAILS", a3);
                                    }
                                    return c;
                                }
                            }
                        }, 5000L, null, this.e, e());
                        j3 = r4;
                        z5 = bundle;
                    } else {
                        j2 = j5;
                        z = false;
                        ?? r42 = str2;
                        f = f(new r6d(this, str, r42, (byte) 7), 5000L, null, this.e, e());
                        j3 = r42;
                    }
                    try {
                        if (f == null) {
                            try {
                                fj0 fj0Var10 = sld.b;
                                A(25, fj0Var10, j2, z);
                                C(fj0Var10);
                                return fj0Var10;
                            } catch (CancellationException e2) {
                                e = e2;
                                z5 = z;
                                j3 = j2;
                                yid.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                                fj0 fj0Var11 = sld.i;
                                B(4, fj0Var11, ald.a(e), j3, z5);
                                C(fj0Var11);
                                return fj0Var11;
                            } catch (TimeoutException e3) {
                                e = e3;
                                z5 = z;
                                j3 = j2;
                                yid.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                                fj0 fj0Var112 = sld.i;
                                B(4, fj0Var112, ald.a(e), j3, z5);
                                C(fj0Var112);
                                return fj0Var112;
                            } catch (Exception e4) {
                                e = e4;
                                z5 = z;
                                j3 = j2;
                                yid.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                                fj0 fj0Var12 = sld.h;
                                B(5, fj0Var12, ald.a(e), j3, z5);
                                C(fj0Var12);
                                return fj0Var12;
                            }
                        }
                        z5 = z;
                        j3 = j2;
                        Bundle bundle2 = (Bundle) f.get(5000L, TimeUnit.MILLISECONDS);
                        int a2 = yid.a("BillingClient", bundle2);
                        String f2 = yid.f("BillingClient", bundle2);
                        if (a2 == 0) {
                            Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                            intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                            intent2.putExtra("billingClientTransactionId", j3);
                            intent2.putExtra("wasServiceAutoReconnected", z5);
                            activity.startActivity(intent2);
                            return sld.g;
                        }
                        yid.h("BillingClient", "Unable to buy item, Error response code: " + a2);
                        fj0 a3 = sld.a(a2, f2);
                        try {
                            if (bundle2 != null) {
                                try {
                                    obj = bundle2.get("LOG_REASON");
                                } catch (Throwable th) {
                                    yid.h("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                                }
                                if (obj != null) {
                                    if (obj instanceof Integer) {
                                        d = mlb.d(((Integer) obj).intValue());
                                        i = 1;
                                        if (d == i) {
                                            d = 23;
                                        }
                                        if (bundle2 != null) {
                                            try {
                                                String string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                                                z2 = z5 ? 1 : 0;
                                                i2 = d;
                                                j4 = j3;
                                                str3 = string;
                                            } catch (Throwable th2) {
                                                yid.h("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                                            }
                                            B(i2, a3, str3, j4, z2);
                                            C(a3);
                                            return a3;
                                        }
                                        z2 = z5 ? 1 : 0;
                                        i2 = d;
                                        j4 = j3;
                                        str3 = null;
                                        B(i2, a3, str3, j4, z2);
                                        C(a3);
                                        return a3;
                                    }
                                    yid.h("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                                }
                            }
                            B(i2, a3, str3, j4, z2);
                            C(a3);
                            return a3;
                        } catch (CancellationException e5) {
                            e = e5;
                            j3 = j4;
                            z5 = z2;
                            yid.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                            fj0 fj0Var1122 = sld.i;
                            B(4, fj0Var1122, ald.a(e), j3, z5);
                            C(fj0Var1122);
                            return fj0Var1122;
                        } catch (TimeoutException e6) {
                            e = e6;
                            j3 = j4;
                            z5 = z2;
                            yid.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                            fj0 fj0Var11222 = sld.i;
                            B(4, fj0Var11222, ald.a(e), j3, z5);
                            C(fj0Var11222);
                            return fj0Var11222;
                        } catch (Exception e7) {
                            e = e7;
                            j3 = j4;
                            z5 = z2;
                            yid.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                            fj0 fj0Var122 = sld.h;
                            B(5, fj0Var122, ald.a(e), j3, z5);
                            C(fj0Var122);
                            return fj0Var122;
                        }
                        i = 1;
                        d = 1;
                        if (d == i) {
                        }
                        if (bundle2 != null) {
                        }
                        z2 = z5 ? 1 : 0;
                        i2 = d;
                        j4 = j3;
                        str3 = null;
                    } catch (CancellationException e8) {
                        e = e8;
                        yid.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        fj0 fj0Var112222 = sld.i;
                        B(4, fj0Var112222, ald.a(e), j3, z5);
                        C(fj0Var112222);
                        return fj0Var112222;
                    } catch (TimeoutException e9) {
                        e = e9;
                        yid.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        fj0 fj0Var1122222 = sld.i;
                        B(4, fj0Var1122222, ald.a(e), j3, z5);
                        C(fj0Var1122222);
                        return fj0Var1122222;
                    } catch (Exception e10) {
                        e = e10;
                        yid.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                        fj0 fj0Var1222 = sld.h;
                        B(5, fj0Var1222, ald.a(e), j3, z5);
                        C(fj0Var1222);
                        return fj0Var1222;
                    }
                } else {
                    a = sld.g;
                    str = str5;
                }
                j = nextLong;
                fj0Var2 = a;
                str2 = str6;
                if (fj0Var2 != sld.g) {
                }
            }
        }
        if (!this.m) {
            yid.h("BillingClient", "Current client doesn't support extra params for buy intent.");
            fj0 fj0Var13 = sld.e;
            A(18, fj0Var13, nextLong, false);
            C(fj0Var13);
            return fj0Var13;
        }
        if (arrayList.size() <= 1) {
        }
        if (fhdVar.isEmpty()) {
        }
        if (((fhd) ej0Var.e).isEmpty()) {
        }
        j = nextLong;
        fj0Var2 = a;
        str2 = str6;
        if (fj0Var2 != sld.g) {
        }
    }

    public void c(oo8 oo8Var, xg0 xg0Var) {
        if (f(new r6d(this, xg0Var, oo8Var, (byte) 2), 30000L, new tnd(this, xg0Var, (byte) 15), r(), e()) == null) {
            fj0 u = u();
            x(25, 7, u);
            tgd tgdVar = fhd.b;
            ((bj0) xg0Var.b).b(u, ojd.e);
        }
    }

    public void d(cj0 cj0Var) {
        l(cj0Var);
    }

    public final synchronized ExecutorService e() {
        ExecutorService executorService;
        executorService = this.z;
        if (executorService == null) {
            executorService = Executors.newFixedThreadPool(yid.a, new op7(this));
            this.z = executorService;
        }
        return executorService;
    }

    public final void g(eu2 eu2Var, String str, fj0 fj0Var, int i, String str2, Exception exc) {
        yid.i("BillingClient", str2, exc);
        z(i, 4, fj0Var, ald.a(exc));
        eu2Var.e(fj0Var);
    }

    public final void h(gje gjeVar) {
        try {
            rhb rhbVar = this.h;
            int i = this.l;
            rhbVar.getClass();
            try {
                cne cneVar = (cne) ((nne) rhbVar.b).g();
                cneVar.b();
                nne.p((nne) cneVar.b, i);
                rhbVar.b = (nne) cneVar.a();
                rhbVar.v(gjeVar);
            } catch (Throwable th) {
                yid.i("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            yid.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void i(gke gkeVar) {
        try {
            rhb rhbVar = this.h;
            int i = this.l;
            rhbVar.getClass();
            try {
                cne cneVar = (cne) ((nne) rhbVar.b).g();
                cneVar.b();
                nne.p((nne) cneVar.b, i);
                nne nneVar = (nne) cneVar.a();
                rhbVar.b = nneVar;
                try {
                    rhbVar.L(gkeVar, nneVar);
                } catch (Throwable th) {
                    yid.i("BillingLogger", "Unable to log.", th);
                }
            } catch (Throwable th2) {
                yid.i("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            yid.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void j(int i, fj0 fj0Var) {
        try {
            int i2 = ald.a;
            uie uieVar = (uie) ald.b(i, 6, fj0Var, null, fme.b).g();
            yse r = gte.r();
            r.c(false);
            r.d();
            uieVar.d(r);
            h((gje) uieVar.a());
        } catch (Throwable th) {
            yid.i("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(int i) {
        synchronized (this.a) {
            if (this.b == 3) {
                return;
            }
            byte b = this.b;
            yid.g("BillingClient", "Setting clientState from " + (b != 0 ? b != 1 ? b != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i != 0 ? i != 1 ? i != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
            this.b = i;
        }
    }

    public final void l(vi0 vi0Var) {
        int i;
        fj0 fj0Var;
        fj0 fj0Var2;
        synchronized (this.a) {
            if (o()) {
                fj0Var = t();
            } else {
                if (this.b == 1) {
                    yid.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    fj0Var2 = sld.c;
                    j(37, fj0Var2);
                } else if (this.b == 3) {
                    yid.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    fj0Var2 = sld.h;
                    j(38, fj0Var2);
                } else {
                    k(1);
                    m();
                    yid.g("BillingClient", "Starting in-app billing setup.");
                    this.j = new wed(this, vi0Var);
                    ifd ifdVar = this.j.b;
                    ifdVar.c = 0L;
                    ifdVar.b = false;
                    ifdVar.a();
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.g.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        i = 41;
                    } else {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        i = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                yid.h("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.c);
                                synchronized (this.a) {
                                    if (this.b == 2) {
                                        fj0Var = t();
                                    } else if (this.b != 1) {
                                        yid.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                        fj0Var2 = sld.h;
                                        j(nm7.p1, fj0Var2);
                                    } else {
                                        wed wedVar = this.j;
                                        if (this.g.bindService(intent2, wedVar, 1)) {
                                            yid.g("BillingClient", "Service was bonded successfully.");
                                            fj0Var = null;
                                        } else {
                                            yid.h("BillingClient", "Connection to Billing service is blocked.");
                                            i = 39;
                                        }
                                    }
                                }
                            }
                        } else {
                            yid.h("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    k(0);
                    yid.g("BillingClient", "Billing service unavailable on device.");
                    fj0 fj0Var3 = sld.a;
                    j(i, fj0Var3);
                    fj0Var = fj0Var3;
                }
                fj0Var = fj0Var2;
            }
        }
        if (fj0Var != null) {
            vi0Var.a(fj0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m() {
        synchronized (this.a) {
            if (this.j != null) {
                try {
                    this.g.unbindService(this.j);
                } catch (Throwable th) {
                    try {
                        yid.i("BillingClient", "There was an exception while unbinding service!", th);
                        this.i = null;
                        this.j = null;
                    } finally {
                        this.i = null;
                        this.j = null;
                    }
                }
            }
        }
    }

    public final boolean n() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ocd ocdVar = this.B;
        if (ocdVar == null) {
            gxc.d("ticker");
            return false;
        }
        long a = ocdVar.a();
        long j = 30000;
        int i = 1;
        long j2 = 30000;
        while (i <= 3) {
            try {
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                yid.i("BillingClient", "Error during reconnection attempt: ", e);
            }
            if (Math.max(0L, j2) <= 0) {
                yid.h("BillingClient", "No time remaining for reconnection attempt.");
                return o();
            }
            yid.g("BillingClient", "Already connected or not opted into auto reconnection.");
            fj0 fj0Var = sld.g;
            timeUnit.getClass();
            int i2 = fj0Var.a;
            if (i2 == 0) {
                yid.g("BillingClient", "Reconnection succeeded with result: " + i2);
                return o();
            }
            yid.h("BillingClient", "Reconnection failed with result: " + i2);
            j2 = j - (((ocdVar.a() - a) + 0) / 1000000);
            long j3 = j;
            long pow = ((long) Math.pow(2.0d, i - 1)) * 1000;
            if (j2 < pow) {
                yid.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                return o();
            }
            if (i < 3 && pow > 0) {
                try {
                    Thread.sleep(pow);
                    j2 = j3 - (((ocdVar.a() - a) + 0) / 1000000);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    yid.i("BillingClient", "Error sleeping during reconnection attempt: ", e2);
                }
            }
            i++;
            j = j3;
        }
        yid.h("BillingClient", "Max retries reached.");
        return o();
    }

    public final boolean o() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.b == 2 && this.i != null && this.j != null) {
                z = true;
            }
        }
        return z;
    }

    public final Handler r() {
        return Looper.myLooper() == null ? this.e : new Handler(Looper.myLooper());
    }

    public final kq s(fj0 fj0Var, int i, String str, Exception exc) {
        yid.i("BillingClient", str, exc);
        z(i, 7, fj0Var, ald.a(exc));
        return new kq(fj0Var.a, fj0Var.c, new ArrayList(), new ArrayList());
    }

    public final fj0 t() {
        yid.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        oje s = gke.s();
        s.b();
        gke.r((gke) s.b, 6);
        yse r = gte.r();
        r.b();
        gte.q((gte) r.b);
        r.c(false);
        r.d();
        s.b();
        gke.q((gke) s.b, (gte) r.a());
        i((gke) s.a());
        return sld.g;
    }

    public final fj0 u() {
        int[] iArr = {0, 3};
        synchronized (this.a) {
            for (int i = 0; i < 2; i++) {
                if (this.b == iArr[i]) {
                    return sld.h;
                }
            }
            return sld.f;
        }
    }

    public final rhb w(fj0 fj0Var, int i, String str, Exception exc) {
        z(i, 9, fj0Var, ald.a(exc));
        yid.i("BillingClient", str, exc);
        return new rhb(fj0Var, null, (byte) 16);
    }

    public final void x(int i, int i2, fj0 fj0Var) {
        try {
            int i3 = ald.a;
            h(ald.b(i, i2, fj0Var, null, fme.b));
        } catch (Throwable th) {
            yid.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void y(int i, fj0 fj0Var, long j) {
        try {
            int i2 = ald.a;
            try {
                this.h.w(ald.b(i, 2, fj0Var, null, fme.b), this.l, j);
            } catch (Throwable th) {
                yid.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            yid.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void z(int i, int i2, fj0 fj0Var, String str) {
        try {
            int i3 = ald.a;
            h(ald.b(i, i2, fj0Var, str, fme.b));
        } catch (Throwable th) {
            yid.i("BillingClient", "Unable to log.", th);
        }
    }

    public ui0(f8e f8eVar, Context context, sk skVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = cdd.a;
        this.c = "8.0.0";
        String v = v();
        this.d = v;
        this.g = context.getApplicationContext();
        cne x = nne.x();
        x.b();
        nne.v((nne) x.b);
        if (v != null) {
            x.b();
            nne.w((nne) x.b, v);
        }
        String packageName = this.g.getPackageName();
        x.b();
        nne.t((nne) x.b, packageName);
        x.b();
        nne.q((nne) x.b, nextLong);
        x.b();
        nne.u((nne) x.b);
        int i = Build.VERSION.SDK_INT;
        x.b();
        nne.n((nne) x.b, i);
        x.c();
        try {
            int i2 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            x.b();
            nne.o((nne) x.b, i2);
        } catch (Throwable th) {
            yid.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new rhb(this.g, (nne) x.a());
        yid.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f = new ej0(this.g, null, this.h);
        this.x = f8eVar;
        this.g.getPackageName();
    }
}
