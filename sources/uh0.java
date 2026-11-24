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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class uh0 {
    public final Long A;
    public final mad B;
    public final String c;
    public final String d;
    public volatile ei0 f;
    public final Context g;
    public final aec h;
    public volatile e8d i;
    public volatile ucd j;
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
    public final c6e x;
    public final boolean y;
    public ExecutorService z;
    public final Object a = new Object();
    public volatile byte b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int l = 0;

    public uh0(c6e c6eVar, Context context, ci0 ci0Var, sj sjVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = abd.a;
        this.c = "8.0.0";
        String v = v();
        this.d = v;
        this.g = context.getApplicationContext();
        ale x = lle.x();
        x.b();
        lle.v((lle) x.b);
        if (v != null) {
            x.b();
            lle.w((lle) x.b, v);
        }
        String packageName = this.g.getPackageName();
        x.b();
        lle.t((lle) x.b, packageName);
        x.b();
        lle.q((lle) x.b, nextLong);
        x.b();
        lle.u((lle) x.b);
        int i = Build.VERSION.SDK_INT;
        x.b();
        lle.n((lle) x.b, i);
        x.c();
        try {
            int i2 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            x.b();
            lle.o((lle) x.b, i2);
        } catch (Throwable th) {
            xgd.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new aec(this.g, (lle) x.a());
        if (ci0Var == null) {
            xgd.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f = new ei0(this.g, ci0Var, this.h);
        this.x = c6eVar;
        this.y = false;
        this.g.getPackageName();
    }

    public static Future f(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new rld(submit, runnable, (byte) 14), (long) (j * 0.95d));
            return submit;
        } catch (Exception e) {
            xgd.i("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static void p(uh0 uh0Var, int i) {
        if (i != 0) {
            uh0Var.k(0);
            return;
        }
        synchronized (uh0Var.a) {
            if (uh0Var.b == 3) {
                return;
            }
            uh0Var.k(2);
            ei0 ei0Var = uh0Var.f != null ? uh0Var.f : null;
            if (ei0Var != null) {
                boolean z = uh0Var.u;
                IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                ei0Var.b = z;
                hbf hbfVar = (hbf) ei0Var.f;
                Context context = (Context) ei0Var.a;
                hbfVar.a(context, intentFilter2);
                boolean z2 = ei0Var.b;
                hbf hbfVar2 = (hbf) ei0Var.e;
                if (z2) {
                    hbfVar2.b(context, intentFilter);
                } else {
                    hbfVar2.a(context, intentFilter);
                }
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean q(uh0 uh0Var) {
        boolean z;
        synchronized (uh0Var.a) {
            z = uh0Var.b == 1;
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

    public final void A(int i, fi0 fi0Var, long j, boolean z) {
        try {
            int i2 = yid.a;
            try {
                this.h.m(yid.b(i, 2, fi0Var, null, dke.b), this.l, j, z);
            } catch (Throwable th) {
                xgd.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            xgd.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void B(int i, fi0 fi0Var, String str, long j, boolean z) {
        try {
            int i2 = yid.a;
            try {
                this.h.m(yid.b(i, 2, fi0Var, str, dke.b), this.l, j, z);
            } catch (Throwable th) {
                xgd.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            xgd.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void C(fi0 fi0Var) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new tq4((Object) this, (Object) fi0Var, (byte) 16));
    }

    public void a(ss2 ss2Var, ts2 ts2Var) {
        if (f(new p4d(this, ts2Var, ss2Var, (byte) 1), 30000L, new tq4(this, ts2Var, ss2Var), r(), e()) == null) {
            fi0 u = u();
            x(25, 4, u);
            ts2Var.d(u);
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
    public fi0 b(Activity activity, final ei0 ei0Var) {
        String str;
        long j;
        String str2;
        fi0 fi0Var;
        gl8 gl8Var;
        fi0 fi0Var2;
        HashSet hashSet;
        fi0 a;
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
        if (this.f == null || ((ci0) this.f.c) == null) {
            fi0 fi0Var3 = qjd.o;
            y(12, fi0Var3, nextLong);
            return fi0Var3;
        }
        try {
            xgd.g("BillingClient", "Already connected or not opted into auto reconnection.");
            fi0 fi0Var4 = qjd.g;
            TimeUnit.MILLISECONDS.getClass();
            int i3 = fi0Var4.a;
            if (i3 == 0) {
                xgd.g("BillingClient", "Reconnection succeeded with result: " + i3);
            } else {
                xgd.h("BillingClient", "Reconnection failed with result: " + i3);
            }
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            xgd.i("BillingClient", "Error during reconnection attempt: ", e);
        }
        if (!o()) {
            fi0 fi0Var5 = qjd.h;
            y(2, fi0Var5, nextLong);
            C(fi0Var5);
            return fi0Var5;
        }
        synchronized (this.a) {
            if (this.j != null) {
                this.j.getClass();
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) ei0Var.f);
        efd efdVar = (efd) ei0Var.e;
        Iterator it = arrayList.iterator();
        if ((it.hasNext() ? it.next() : null) != null) {
            fyb.g();
            return null;
        }
        sed sedVar = (sed) efdVar.iterator();
        di0 di0Var = (di0) (sedVar.hasNext() ? sedVar.next() : null);
        kl8 kl8Var = di0Var.a;
        String str5 = kl8Var.c;
        String str6 = kl8Var.d;
        if (str6.equals("subs") && !this.k) {
            xgd.h("BillingClient", "Current client doesn't support subscriptions.");
            fi0 fi0Var6 = qjd.j;
            A(9, fi0Var6, nextLong, false);
            C(fi0Var6);
            return fi0Var6;
        }
        if (((String) ei0Var.a) == null && ((String) ei0Var.c) == null) {
            nfd nfdVar = (nfd) ei0Var.d;
            nfdVar.getClass();
            if (nfdVar.a == 0 && !ei0Var.b) {
                efd efdVar2 = (efd) ei0Var.e;
                if (efdVar2 != null) {
                    int size = efdVar2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                    }
                }
                if (arrayList.size() <= 1 && !this.q) {
                    xgd.h("BillingClient", "Current client doesn't support multi-item purchases.");
                    fi0 fi0Var7 = qjd.k;
                    A(19, fi0Var7, nextLong, false);
                    C(fi0Var7);
                    return fi0Var7;
                }
                if (efdVar.isEmpty() && !this.r) {
                    xgd.h("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                    fi0 fi0Var8 = qjd.m;
                    A(20, fi0Var8, nextLong, false);
                    C(fi0Var8);
                    return fi0Var8;
                }
                if (((efd) ei0Var.e).isEmpty()) {
                    di0 di0Var2 = (di0) ((efd) ei0Var.e).get(0);
                    int i5 = 1;
                    while (i5 < ((efd) ei0Var.e).size()) {
                        di0 di0Var3 = (di0) ((efd) ei0Var.e).get(i5);
                        str = str5;
                        if (di0Var3.a.d.equals(di0Var2.a.d) || di0Var3.a.d.equals("play_pass_subs")) {
                            i5++;
                            str5 = str;
                        } else {
                            a = qjd.a(5, "All products should have same ProductType.");
                        }
                    }
                    str = str5;
                    kl8 kl8Var2 = di0Var2.a;
                    String optString = kl8Var2.b.optString("packageName");
                    HashMap hashMap = new HashMap();
                    HashSet hashSet2 = new HashSet();
                    j = nextLong;
                    efd efdVar3 = (efd) ei0Var.e;
                    int size2 = efdVar3.size();
                    str2 = str6;
                    int i6 = 0;
                    while (true) {
                        if (i6 < size2) {
                            efd efdVar4 = efdVar3;
                            di0 di0Var4 = (di0) efdVar3.get(i6);
                            int i7 = size2;
                            kl8 kl8Var3 = di0Var4.a;
                            int i8 = i6;
                            ArrayList arrayList2 = kl8Var3.h;
                            String str7 = kl8Var3.c;
                            if (arrayList2 != null) {
                                hashSet = hashSet2;
                                if (di0Var4.b == null) {
                                    fi0Var = qjd.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str7);
                                    break;
                                }
                            } else {
                                hashSet = hashSet2;
                            }
                            if (hashMap.containsKey(str7)) {
                                fi0Var = qjd.a(5, "ProductId can not be duplicated. Invalid product id: " + kl8Var3.c + ".");
                                break;
                            }
                            hashMap.put(kl8Var3.c, di0Var4);
                            if (!kl8Var2.d.equals("play_pass_subs") && !kl8Var3.d.equals("play_pass_subs") && !optString.equals(kl8Var3.b.optString("packageName"))) {
                                fi0Var = qjd.a(5, "All products must have the same package name.");
                                break;
                            }
                            i6 = i8 + 1;
                            size2 = i7;
                            efdVar3 = efdVar4;
                            hashSet2 = hashSet;
                        } else {
                            Iterator it2 = hashSet2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    String str8 = (String) it2.next();
                                    if (hashMap.containsKey(str8)) {
                                        fi0Var = qjd.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str8 + ".");
                                        break;
                                    }
                                } else {
                                    ArrayList arrayList3 = kl8Var2.i;
                                    String str9 = di0Var2.b;
                                    if (str9 != null && arrayList3 != null) {
                                        int size3 = arrayList3.size();
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 >= size3) {
                                                gl8Var = null;
                                                break;
                                            }
                                            Object obj2 = arrayList3.get(i9);
                                            i9++;
                                            gl8Var = (gl8) obj2;
                                            if (str9.equals(gl8Var.d)) {
                                                break;
                                            }
                                        }
                                        if (gl8Var != null && gl8Var.g != null) {
                                            fi0Var = qjd.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                        }
                                    }
                                    fi0Var = qjd.g;
                                }
                            }
                        }
                    }
                    fi0Var2 = fi0Var;
                    if (fi0Var2 != qjd.g) {
                        A(kk7.s1, fi0Var2, j, false);
                        C(fi0Var2);
                        return fi0Var2;
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
                        int i10 = xgd.a;
                        z = false;
                        final ?? bundle = new Bundle();
                        xgd.b(bundle, str10, str11, longValue);
                        bundle.putLong("billingClientTransactionId", j5);
                        byte b = ((nfd) ei0Var.d).a;
                        if (b != 0) {
                            bundle.putInt("prorationMode", b);
                        }
                        if (!TextUtils.isEmpty((String) ei0Var.a)) {
                            bundle.putString("accountId", (String) ei0Var.a);
                        }
                        if (!TextUtils.isEmpty((String) ei0Var.c)) {
                            bundle.putString("obfuscatedProfileId", (String) ei0Var.c);
                        }
                        if (!TextUtils.isEmpty((String) ((nfd) ei0Var.d).b)) {
                            bundle.putString("oldSkuPurchaseToken", (String) ((nfd) ei0Var.d).b);
                        }
                        ((nfd) ei0Var.d).getClass();
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
                        sed listIterator = ((efd) ei0Var.e).listIterator(0);
                        while (listIterator.hasNext()) {
                        }
                        if (!arrayList4.isEmpty()) {
                            qpd n = xpd.n();
                            n.b();
                            xpd.o((xpd) n.b, arrayList4);
                            bundle.putByteArray("subscriptionProductReplacementParamsList", ((xpd) n.a()).a());
                        }
                        if (arrayList.isEmpty()) {
                            ArrayList arrayList5 = new ArrayList(efdVar.size() - 1);
                            ArrayList arrayList6 = new ArrayList(efdVar.size() - 1);
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = new ArrayList();
                            int i11 = 0;
                            while (i11 < efdVar.size()) {
                                di0 di0Var5 = (di0) efdVar.get(i11);
                                kl8 kl8Var4 = di0Var5.a;
                                long j6 = j5;
                                if (!kl8Var4.f.isEmpty()) {
                                    arrayList7.add(kl8Var4.f);
                                }
                                arrayList8.add(di0Var5.b);
                                String str12 = kl8Var4.g;
                                ArrayList arrayList11 = kl8Var4.i;
                                if (arrayList11 != null && !arrayList11.isEmpty()) {
                                    ArrayList arrayList12 = kl8Var4.i;
                                    int size4 = arrayList12.size();
                                    int i12 = 0;
                                    while (i12 < size4) {
                                        Object obj3 = arrayList12.get(i12);
                                        i12++;
                                        ArrayList arrayList13 = arrayList12;
                                        gl8 gl8Var2 = (gl8) obj3;
                                        String str13 = str12;
                                        if (!TextUtils.isEmpty(gl8Var2.f)) {
                                            str4 = gl8Var2.f;
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
                                    arrayList5.add(((di0) efdVar.get(i11)).a.c);
                                    arrayList6.add(((di0) efdVar.get(i11)).a.d);
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
                                throw ls6.l(it3);
                            }
                            if (!arrayList14.isEmpty()) {
                                bundle.putStringArrayList("skuDetailsTokens", arrayList14);
                            }
                            if (arrayList.size() > 1) {
                                ArrayList arrayList15 = new ArrayList(arrayList.size() - 1);
                                ArrayList arrayList16 = new ArrayList(arrayList.size() - 1);
                                if (1 < arrayList.size()) {
                                    arrayList.get(1).getClass();
                                    fyb.g();
                                    return null;
                                }
                                bundle.putStringArrayList("additionalSkus", arrayList15);
                                bundle.putStringArrayList("additionalSkuTypes", arrayList16);
                            }
                            j2 = j5;
                        }
                        if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.o) {
                            fi0 fi0Var9 = qjd.l;
                            A(21, fi0Var9, j2, false);
                            C(fi0Var9);
                            return fi0Var9;
                        }
                        if (TextUtils.isEmpty(di0Var.a.b.optString("packageName"))) {
                            z4 = false;
                        } else {
                            bundle.putString("skuPackageName", di0Var.a.b.optString("packageName"));
                            z4 = true;
                        }
                        Intent intent = activity.getIntent();
                        if (intent == null) {
                            xgd.h("BillingClient", "Activity's intent is null.");
                        } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                            String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                            bundle.putString("proxyPackage", stringExtra);
                            try {
                                bundle.putString("proxyPackageVersion", this.g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                            } catch (PackageManager.NameNotFoundException unused) {
                                bundle.putString("proxyPackageVersion", "package not found");
                            }
                        }
                        final int i13 = (!this.r || efdVar.isEmpty()) ? (this.p && z4) ? 15 : this.n ? 9 : 6 : 17;
                        final String str14 = str;
                        final ?? r4 = str2;
                        f = f(new Callable(i13, str14, r4, ei0Var, bundle) { // from class: bhf
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
                                e8d e8dVar;
                                uh0 uh0Var = uh0.this;
                                byte b2 = this.b;
                                String str15 = this.c;
                                String str16 = this.d;
                                Bundle bundle2 = this.e;
                                try {
                                    synchronized (uh0Var.a) {
                                        e8dVar = uh0Var.i;
                                    }
                                    if (e8dVar == null) {
                                        return xgd.c(kk7.r1, qjd.h);
                                    }
                                    return ((t7d) e8dVar).b0(b2, uh0Var.g.getPackageName(), str15, str16, bundle2);
                                } catch (DeadObjectException e2) {
                                    fi0 fi0Var10 = qjd.h;
                                    String a2 = yid.a(e2);
                                    c = xgd.c(5, fi0Var10);
                                    if (a2 != null) {
                                        c.putString("ADDITIONAL_LOG_DETAILS", a2);
                                    }
                                    return c;
                                } catch (Exception e3) {
                                    fi0 fi0Var11 = qjd.f;
                                    String a3 = yid.a(e3);
                                    c = xgd.c(5, fi0Var11);
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
                        f = f(new p4d(this, str, r42, (byte) 7), 5000L, null, this.e, e());
                        j3 = r42;
                    }
                    try {
                        if (f == null) {
                            try {
                                fi0 fi0Var10 = qjd.b;
                                A(25, fi0Var10, j2, z);
                                C(fi0Var10);
                                return fi0Var10;
                            } catch (CancellationException e2) {
                                e = e2;
                                z5 = z;
                                j3 = j2;
                                xgd.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                                fi0 fi0Var11 = qjd.i;
                                B(4, fi0Var11, yid.a(e), j3, z5);
                                C(fi0Var11);
                                return fi0Var11;
                            } catch (TimeoutException e3) {
                                e = e3;
                                z5 = z;
                                j3 = j2;
                                xgd.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                                fi0 fi0Var112 = qjd.i;
                                B(4, fi0Var112, yid.a(e), j3, z5);
                                C(fi0Var112);
                                return fi0Var112;
                            } catch (Exception e4) {
                                e = e4;
                                z5 = z;
                                j3 = j2;
                                xgd.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                                fi0 fi0Var12 = qjd.h;
                                B(5, fi0Var12, yid.a(e), j3, z5);
                                C(fi0Var12);
                                return fi0Var12;
                            }
                        }
                        z5 = z;
                        j3 = j2;
                        Bundle bundle2 = (Bundle) f.get(5000L, TimeUnit.MILLISECONDS);
                        int a2 = xgd.a("BillingClient", bundle2);
                        String f2 = xgd.f("BillingClient", bundle2);
                        if (a2 == 0) {
                            Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                            intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                            intent2.putExtra("billingClientTransactionId", j3);
                            intent2.putExtra("wasServiceAutoReconnected", z5);
                            activity.startActivity(intent2);
                            return qjd.g;
                        }
                        xgd.h("BillingClient", "Unable to buy item, Error response code: " + a2);
                        fi0 a3 = qjd.a(a2, f2);
                        try {
                            if (bundle2 != null) {
                                try {
                                    obj = bundle2.get("LOG_REASON");
                                } catch (Throwable th) {
                                    xgd.h("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                                }
                                if (obj != null) {
                                    if (obj instanceof Integer) {
                                        d = yjb.d(((Integer) obj).intValue());
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
                                                xgd.h("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
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
                                    xgd.h("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                                }
                            }
                            B(i2, a3, str3, j4, z2);
                            C(a3);
                            return a3;
                        } catch (CancellationException e5) {
                            e = e5;
                            j3 = j4;
                            z5 = z2;
                            xgd.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                            fi0 fi0Var1122 = qjd.i;
                            B(4, fi0Var1122, yid.a(e), j3, z5);
                            C(fi0Var1122);
                            return fi0Var1122;
                        } catch (TimeoutException e6) {
                            e = e6;
                            j3 = j4;
                            z5 = z2;
                            xgd.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                            fi0 fi0Var11222 = qjd.i;
                            B(4, fi0Var11222, yid.a(e), j3, z5);
                            C(fi0Var11222);
                            return fi0Var11222;
                        } catch (Exception e7) {
                            e = e7;
                            j3 = j4;
                            z5 = z2;
                            xgd.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                            fi0 fi0Var122 = qjd.h;
                            B(5, fi0Var122, yid.a(e), j3, z5);
                            C(fi0Var122);
                            return fi0Var122;
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
                        xgd.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        fi0 fi0Var112222 = qjd.i;
                        B(4, fi0Var112222, yid.a(e), j3, z5);
                        C(fi0Var112222);
                        return fi0Var112222;
                    } catch (TimeoutException e9) {
                        e = e9;
                        xgd.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        fi0 fi0Var1122222 = qjd.i;
                        B(4, fi0Var1122222, yid.a(e), j3, z5);
                        C(fi0Var1122222);
                        return fi0Var1122222;
                    } catch (Exception e10) {
                        e = e10;
                        xgd.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                        fi0 fi0Var1222 = qjd.h;
                        B(5, fi0Var1222, yid.a(e), j3, z5);
                        C(fi0Var1222);
                        return fi0Var1222;
                    }
                } else {
                    a = qjd.g;
                    str = str5;
                }
                j = nextLong;
                fi0Var2 = a;
                str2 = str6;
                if (fi0Var2 != qjd.g) {
                }
            }
        }
        if (!this.m) {
            xgd.h("BillingClient", "Current client doesn't support extra params for buy intent.");
            fi0 fi0Var13 = qjd.e;
            A(18, fi0Var13, nextLong, false);
            C(fi0Var13);
            return fi0Var13;
        }
        if (arrayList.size() <= 1) {
        }
        if (efdVar.isEmpty()) {
        }
        if (((efd) ei0Var.e).isEmpty()) {
        }
        j = nextLong;
        fi0Var2 = a;
        str2 = str6;
        if (fi0Var2 != qjd.g) {
        }
    }

    public void c(z24 z24Var, sg0 sg0Var) {
        if (f(new p4d(this, sg0Var, z24Var, (byte) 2), 30000L, new rld(this, sg0Var, (byte) 15), r(), e()) == null) {
            fi0 u = u();
            x(25, 7, u);
            sed sedVar = efd.b;
            ((bi0) sg0Var.b).b(u, nhd.e);
        }
    }

    public void d(ci0 ci0Var) {
        l(ci0Var);
    }

    public final synchronized ExecutorService e() {
        ExecutorService executorService;
        executorService = this.z;
        if (executorService == null) {
            executorService = Executors.newFixedThreadPool(xgd.a, new kn7(this));
            this.z = executorService;
        }
        return executorService;
    }

    public final void g(ts2 ts2Var, String str, fi0 fi0Var, int i, String str2, Exception exc) {
        xgd.i("BillingClient", str2, exc);
        z(i, 4, fi0Var, yid.a(exc));
        ts2Var.d(fi0Var);
    }

    public final void h(fhe fheVar) {
        try {
            aec aecVar = this.h;
            int i = this.l;
            aecVar.getClass();
            try {
                ale aleVar = (ale) ((lle) aecVar.b).g();
                aleVar.b();
                lle.p((lle) aleVar.b, i);
                aecVar.b = (lle) aleVar.a();
                aecVar.i(fheVar);
            } catch (Throwable th) {
                xgd.i("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            xgd.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void i(fie fieVar) {
        try {
            aec aecVar = this.h;
            int i = this.l;
            aecVar.getClass();
            try {
                ale aleVar = (ale) ((lle) aecVar.b).g();
                aleVar.b();
                lle.p((lle) aleVar.b, i);
                lle lleVar = (lle) aleVar.a();
                aecVar.b = lleVar;
                try {
                    aecVar.t(fieVar, lleVar);
                } catch (Throwable th) {
                    xgd.i("BillingLogger", "Unable to log.", th);
                }
            } catch (Throwable th2) {
                xgd.i("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            xgd.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void j(int i, fi0 fi0Var) {
        try {
            int i2 = yid.a;
            tge tgeVar = (tge) yid.b(i, 6, fi0Var, null, dke.b).g();
            vqe r = dre.r();
            r.c(false);
            r.d();
            tgeVar.d(r);
            h((fhe) tgeVar.a());
        } catch (Throwable th) {
            xgd.i("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(int i) {
        synchronized (this.a) {
            if (this.b == 3) {
                return;
            }
            byte b = this.b;
            xgd.g("BillingClient", "Setting clientState from " + (b != 0 ? b != 1 ? b != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i != 0 ? i != 1 ? i != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
            this.b = i;
        }
    }

    public final void l(vh0 vh0Var) {
        int i;
        fi0 fi0Var;
        fi0 fi0Var2;
        synchronized (this.a) {
            if (o()) {
                fi0Var = t();
            } else {
                if (this.b == 1) {
                    xgd.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    fi0Var2 = qjd.c;
                    j(37, fi0Var2);
                } else if (this.b == 3) {
                    xgd.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    fi0Var2 = qjd.h;
                    j(38, fi0Var2);
                } else {
                    k(1);
                    m();
                    xgd.g("BillingClient", "Starting in-app billing setup.");
                    this.j = new ucd(this, vh0Var);
                    gdd gddVar = this.j.b;
                    gddVar.c = 0L;
                    gddVar.b = false;
                    gddVar.a();
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
                                xgd.h("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.c);
                                synchronized (this.a) {
                                    if (this.b == 2) {
                                        fi0Var = t();
                                    } else if (this.b != 1) {
                                        xgd.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                        fi0Var2 = qjd.h;
                                        j(kk7.p1, fi0Var2);
                                    } else {
                                        ucd ucdVar = this.j;
                                        if (this.g.bindService(intent2, ucdVar, 1)) {
                                            xgd.g("BillingClient", "Service was bonded successfully.");
                                            fi0Var = null;
                                        } else {
                                            xgd.h("BillingClient", "Connection to Billing service is blocked.");
                                            i = 39;
                                        }
                                    }
                                }
                            }
                        } else {
                            xgd.h("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    k(0);
                    xgd.g("BillingClient", "Billing service unavailable on device.");
                    fi0 fi0Var3 = qjd.a;
                    j(i, fi0Var3);
                    fi0Var = fi0Var3;
                }
                fi0Var = fi0Var2;
            }
        }
        if (fi0Var != null) {
            vh0Var.a(fi0Var);
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
                        xgd.i("BillingClient", "There was an exception while unbinding service!", th);
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
        mad madVar = this.B;
        if (madVar == null) {
            fvc.f("ticker");
            return false;
        }
        long a = madVar.a();
        long j = 30000;
        int i = 1;
        long j2 = 30000;
        while (i <= 3) {
            try {
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                xgd.i("BillingClient", "Error during reconnection attempt: ", e);
            }
            if (Math.max(0L, j2) <= 0) {
                xgd.h("BillingClient", "No time remaining for reconnection attempt.");
                return o();
            }
            xgd.g("BillingClient", "Already connected or not opted into auto reconnection.");
            fi0 fi0Var = qjd.g;
            timeUnit.getClass();
            int i2 = fi0Var.a;
            if (i2 == 0) {
                xgd.g("BillingClient", "Reconnection succeeded with result: " + i2);
                return o();
            }
            xgd.h("BillingClient", "Reconnection failed with result: " + i2);
            j2 = j - (((madVar.a() - a) + 0) / 1000000);
            long j3 = j;
            long pow = ((long) Math.pow(2.0d, i - 1)) * 1000;
            if (j2 < pow) {
                xgd.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                return o();
            }
            if (i < 3 && pow > 0) {
                try {
                    Thread.sleep(pow);
                    j2 = j3 - (((madVar.a() - a) + 0) / 1000000);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    xgd.i("BillingClient", "Error sleeping during reconnection attempt: ", e2);
                }
            }
            i++;
            j = j3;
        }
        xgd.h("BillingClient", "Max retries reached.");
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

    public final kp s(fi0 fi0Var, int i, String str, Exception exc) {
        xgd.i("BillingClient", str, exc);
        z(i, 7, fi0Var, yid.a(exc));
        return new kp(fi0Var.a, fi0Var.c, new ArrayList(), new ArrayList());
    }

    public final fi0 t() {
        xgd.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        nhe s = fie.s();
        s.b();
        fie.r((fie) s.b, 6);
        vqe r = dre.r();
        r.b();
        dre.q((dre) r.b);
        r.c(false);
        r.d();
        s.b();
        fie.q((fie) s.b, (dre) r.a());
        i((fie) s.a());
        return qjd.g;
    }

    public final fi0 u() {
        int[] iArr = {0, 3};
        synchronized (this.a) {
            for (int i = 0; i < 2; i++) {
                if (this.b == iArr[i]) {
                    return qjd.h;
                }
            }
            return qjd.f;
        }
    }

    public final aec w(fi0 fi0Var, int i, String str, Exception exc) {
        z(i, 9, fi0Var, yid.a(exc));
        xgd.i("BillingClient", str, exc);
        return new aec(fi0Var, null, (byte) 14);
    }

    public final void x(int i, int i2, fi0 fi0Var) {
        try {
            int i3 = yid.a;
            h(yid.b(i, i2, fi0Var, null, dke.b));
        } catch (Throwable th) {
            xgd.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void y(int i, fi0 fi0Var, long j) {
        try {
            int i2 = yid.a;
            try {
                this.h.j(yid.b(i, 2, fi0Var, null, dke.b), this.l, j);
            } catch (Throwable th) {
                xgd.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            xgd.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void z(int i, int i2, fi0 fi0Var, String str) {
        try {
            int i3 = yid.a;
            h(yid.b(i, i2, fi0Var, str, dke.b));
        } catch (Throwable th) {
            xgd.i("BillingClient", "Unable to log.", th);
        }
    }

    public uh0(c6e c6eVar, Context context, sj sjVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = abd.a;
        this.c = "8.0.0";
        String v = v();
        this.d = v;
        this.g = context.getApplicationContext();
        ale x = lle.x();
        x.b();
        lle.v((lle) x.b);
        if (v != null) {
            x.b();
            lle.w((lle) x.b, v);
        }
        String packageName = this.g.getPackageName();
        x.b();
        lle.t((lle) x.b, packageName);
        x.b();
        lle.q((lle) x.b, nextLong);
        x.b();
        lle.u((lle) x.b);
        int i = Build.VERSION.SDK_INT;
        x.b();
        lle.n((lle) x.b, i);
        x.c();
        try {
            int i2 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            x.b();
            lle.o((lle) x.b, i2);
        } catch (Throwable th) {
            xgd.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new aec(this.g, (lle) x.a());
        xgd.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f = new ei0(this.g, null, this.h);
        this.x = c6eVar;
        this.g.getPackageName();
    }
}
