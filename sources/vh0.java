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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class vh0 {
    public final Long A;
    public final ffd B;
    public final String c;
    public final String d;
    public volatile fi0 f;
    public final Context g;
    public final zhc h;
    public volatile xcd i;
    public volatile nhd j;
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
    public final sae x;
    public final boolean y;
    public ExecutorService z;
    public final Object a = new Object();
    public volatile byte b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int l = 0;

    public vh0(sae saeVar, Context context, di0 di0Var, tj tjVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = tfd.a;
        this.c = "8.0.0";
        String v = v();
        this.d = v;
        this.g = context.getApplicationContext();
        rpe x = cqe.x();
        x.b();
        cqe.v((cqe) x.b);
        if (v != null) {
            x.b();
            cqe.w((cqe) x.b, v);
        }
        String packageName = this.g.getPackageName();
        x.b();
        cqe.t((cqe) x.b, packageName);
        x.b();
        cqe.q((cqe) x.b, nextLong);
        x.b();
        cqe.u((cqe) x.b);
        int i = Build.VERSION.SDK_INT;
        x.b();
        cqe.n((cqe) x.b, i);
        x.c();
        try {
            int i2 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            x.b();
            cqe.o((cqe) x.b, i2);
        } catch (Throwable th) {
            old.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new zhc(this.g, (cqe) x.a());
        if (di0Var == null) {
            old.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f = new fi0(this.g, di0Var, this.h);
        this.x = saeVar;
        this.y = false;
        this.g.getPackageName();
    }

    public static Future f(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new iqd(submit, runnable, (byte) 14), (long) (j * 0.95d));
            return submit;
        } catch (Exception e) {
            old.i("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static void p(vh0 vh0Var, int i) {
        if (i != 0) {
            vh0Var.k(0);
            return;
        }
        synchronized (vh0Var.a) {
            if (vh0Var.b == 3) {
                return;
            }
            vh0Var.k(2);
            fi0 fi0Var = vh0Var.f != null ? vh0Var.f : null;
            if (fi0Var != null) {
                boolean z = vh0Var.u;
                IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                fi0Var.b = z;
                xff xffVar = (xff) fi0Var.f;
                Context context = (Context) fi0Var.a;
                xffVar.a(context, intentFilter2);
                boolean z2 = fi0Var.b;
                xff xffVar2 = (xff) fi0Var.e;
                if (z2) {
                    xffVar2.b(context, intentFilter);
                } else {
                    xffVar2.a(context, intentFilter);
                }
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean q(vh0 vh0Var) {
        boolean z;
        synchronized (vh0Var.a) {
            z = vh0Var.b == 1;
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

    public final void A(int i, gi0 gi0Var, long j, boolean z) {
        try {
            int i2 = pnd.a;
            try {
                this.h.m(pnd.b(i, 2, gi0Var, null, uoe.b), this.l, j, z);
            } catch (Throwable th) {
                old.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            old.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void B(int i, gi0 gi0Var, String str, long j, boolean z) {
        try {
            int i2 = pnd.a;
            try {
                this.h.m(pnd.b(i, 2, gi0Var, str, uoe.b), this.l, j, z);
            } catch (Throwable th) {
                old.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            old.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void C(gi0 gi0Var) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new xs4((Object) this, (Object) gi0Var, (byte) 16));
    }

    public void a(mt2 mt2Var, nt2 nt2Var) {
        if (f(new h9d(this, nt2Var, mt2Var, (byte) 1), 30000L, new xs4(this, nt2Var, mt2Var), r(), e()) == null) {
            gi0 u = u();
            x(25, 4, u);
            nt2Var.e(u);
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
    public gi0 b(Activity activity, final fi0 fi0Var) {
        String str;
        long j;
        String str2;
        gi0 gi0Var;
        to8 to8Var;
        gi0 gi0Var2;
        HashSet hashSet;
        gi0 a;
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
        if (this.f == null || ((di0) this.f.c) == null) {
            gi0 gi0Var3 = hod.o;
            y(12, gi0Var3, nextLong);
            return gi0Var3;
        }
        try {
            old.g("BillingClient", "Already connected or not opted into auto reconnection.");
            gi0 gi0Var4 = hod.g;
            TimeUnit.MILLISECONDS.getClass();
            int i3 = gi0Var4.a;
            if (i3 == 0) {
                old.g("BillingClient", "Reconnection succeeded with result: " + i3);
            } else {
                old.h("BillingClient", "Reconnection failed with result: " + i3);
            }
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            old.i("BillingClient", "Error during reconnection attempt: ", e);
        }
        if (!o()) {
            gi0 gi0Var5 = hod.h;
            y(2, gi0Var5, nextLong);
            C(gi0Var5);
            return gi0Var5;
        }
        synchronized (this.a) {
            if (this.j != null) {
                this.j.getClass();
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) fi0Var.f);
        vjd vjdVar = (vjd) fi0Var.e;
        Iterator it = arrayList.iterator();
        if ((it.hasNext() ? it.next() : null) != null) {
            grb.o();
            return null;
        }
        jjd jjdVar = (jjd) vjdVar.iterator();
        ei0 ei0Var = (ei0) (jjdVar.hasNext() ? jjdVar.next() : null);
        wo8 wo8Var = ei0Var.a;
        String str5 = wo8Var.c;
        String str6 = wo8Var.d;
        if (str6.equals("subs") && !this.k) {
            old.h("BillingClient", "Current client doesn't support subscriptions.");
            gi0 gi0Var6 = hod.j;
            A(9, gi0Var6, nextLong, false);
            C(gi0Var6);
            return gi0Var6;
        }
        if (((String) fi0Var.a) == null && ((String) fi0Var.c) == null) {
            ekd ekdVar = (ekd) fi0Var.d;
            ekdVar.getClass();
            if (ekdVar.a == 0 && !fi0Var.b) {
                vjd vjdVar2 = (vjd) fi0Var.e;
                if (vjdVar2 != null) {
                    int size = vjdVar2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                    }
                }
                if (arrayList.size() <= 1 && !this.q) {
                    old.h("BillingClient", "Current client doesn't support multi-item purchases.");
                    gi0 gi0Var7 = hod.k;
                    A(19, gi0Var7, nextLong, false);
                    C(gi0Var7);
                    return gi0Var7;
                }
                if (vjdVar.isEmpty() && !this.r) {
                    old.h("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                    gi0 gi0Var8 = hod.m;
                    A(20, gi0Var8, nextLong, false);
                    C(gi0Var8);
                    return gi0Var8;
                }
                if (((vjd) fi0Var.e).isEmpty()) {
                    ei0 ei0Var2 = (ei0) ((vjd) fi0Var.e).get(0);
                    int i5 = 1;
                    while (i5 < ((vjd) fi0Var.e).size()) {
                        ei0 ei0Var3 = (ei0) ((vjd) fi0Var.e).get(i5);
                        str = str5;
                        if (ei0Var3.a.d.equals(ei0Var2.a.d) || ei0Var3.a.d.equals("play_pass_subs")) {
                            i5++;
                            str5 = str;
                        } else {
                            a = hod.a(5, "All products should have same ProductType.");
                        }
                    }
                    str = str5;
                    wo8 wo8Var2 = ei0Var2.a;
                    String optString = wo8Var2.b.optString("packageName");
                    HashMap hashMap = new HashMap();
                    HashSet hashSet2 = new HashSet();
                    j = nextLong;
                    vjd vjdVar3 = (vjd) fi0Var.e;
                    int size2 = vjdVar3.size();
                    str2 = str6;
                    int i6 = 0;
                    while (true) {
                        if (i6 < size2) {
                            vjd vjdVar4 = vjdVar3;
                            ei0 ei0Var4 = (ei0) vjdVar3.get(i6);
                            int i7 = size2;
                            wo8 wo8Var3 = ei0Var4.a;
                            int i8 = i6;
                            ArrayList arrayList2 = wo8Var3.h;
                            String str7 = wo8Var3.c;
                            if (arrayList2 != null) {
                                hashSet = hashSet2;
                                if (ei0Var4.b == null) {
                                    gi0Var = hod.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str7);
                                    break;
                                }
                            } else {
                                hashSet = hashSet2;
                            }
                            if (hashMap.containsKey(str7)) {
                                gi0Var = hod.a(5, "ProductId can not be duplicated. Invalid product id: " + wo8Var3.c + ".");
                                break;
                            }
                            hashMap.put(wo8Var3.c, ei0Var4);
                            if (!wo8Var2.d.equals("play_pass_subs") && !wo8Var3.d.equals("play_pass_subs") && !optString.equals(wo8Var3.b.optString("packageName"))) {
                                gi0Var = hod.a(5, "All products must have the same package name.");
                                break;
                            }
                            i6 = i8 + 1;
                            size2 = i7;
                            vjdVar3 = vjdVar4;
                            hashSet2 = hashSet;
                        } else {
                            Iterator it2 = hashSet2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    String str8 = (String) it2.next();
                                    if (hashMap.containsKey(str8)) {
                                        gi0Var = hod.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str8 + ".");
                                        break;
                                    }
                                } else {
                                    ArrayList arrayList3 = wo8Var2.i;
                                    String str9 = ei0Var2.b;
                                    if (str9 != null && arrayList3 != null) {
                                        int size3 = arrayList3.size();
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 >= size3) {
                                                to8Var = null;
                                                break;
                                            }
                                            Object obj2 = arrayList3.get(i9);
                                            i9++;
                                            to8Var = (to8) obj2;
                                            if (str9.equals(to8Var.d)) {
                                                break;
                                            }
                                        }
                                        if (to8Var != null && to8Var.g != null) {
                                            gi0Var = hod.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                        }
                                    }
                                    gi0Var = hod.g;
                                }
                            }
                        }
                    }
                    gi0Var2 = gi0Var;
                    if (gi0Var2 != hod.g) {
                        A(jn7.s1, gi0Var2, j, false);
                        C(gi0Var2);
                        return gi0Var2;
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
                        int i10 = old.a;
                        z = false;
                        final ?? bundle = new Bundle();
                        old.b(bundle, str10, str11, longValue);
                        bundle.putLong("billingClientTransactionId", j5);
                        byte b = ((ekd) fi0Var.d).a;
                        if (b != 0) {
                            bundle.putInt("prorationMode", b);
                        }
                        if (!TextUtils.isEmpty((String) fi0Var.a)) {
                            bundle.putString("accountId", (String) fi0Var.a);
                        }
                        if (!TextUtils.isEmpty((String) fi0Var.c)) {
                            bundle.putString("obfuscatedProfileId", (String) fi0Var.c);
                        }
                        if (!TextUtils.isEmpty((String) ((ekd) fi0Var.d).b)) {
                            bundle.putString("oldSkuPurchaseToken", (String) ((ekd) fi0Var.d).b);
                        }
                        ((ekd) fi0Var.d).getClass();
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
                        jjd listIterator = ((vjd) fi0Var.e).listIterator(0);
                        while (listIterator.hasNext()) {
                        }
                        if (!arrayList4.isEmpty()) {
                            gud n = nud.n();
                            n.b();
                            nud.o((nud) n.b, arrayList4);
                            bundle.putByteArray("subscriptionProductReplacementParamsList", ((nud) n.a()).a());
                        }
                        if (arrayList.isEmpty()) {
                            ArrayList arrayList5 = new ArrayList(vjdVar.size() - 1);
                            ArrayList arrayList6 = new ArrayList(vjdVar.size() - 1);
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = new ArrayList();
                            int i11 = 0;
                            while (i11 < vjdVar.size()) {
                                ei0 ei0Var5 = (ei0) vjdVar.get(i11);
                                wo8 wo8Var4 = ei0Var5.a;
                                long j6 = j5;
                                if (!wo8Var4.f.isEmpty()) {
                                    arrayList7.add(wo8Var4.f);
                                }
                                arrayList8.add(ei0Var5.b);
                                String str12 = wo8Var4.g;
                                ArrayList arrayList11 = wo8Var4.i;
                                if (arrayList11 != null && !arrayList11.isEmpty()) {
                                    ArrayList arrayList12 = wo8Var4.i;
                                    int size4 = arrayList12.size();
                                    int i12 = 0;
                                    while (i12 < size4) {
                                        Object obj3 = arrayList12.get(i12);
                                        i12++;
                                        ArrayList arrayList13 = arrayList12;
                                        to8 to8Var2 = (to8) obj3;
                                        String str13 = str12;
                                        if (!TextUtils.isEmpty(to8Var2.f)) {
                                            str4 = to8Var2.f;
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
                                    arrayList5.add(((ei0) vjdVar.get(i11)).a.c);
                                    arrayList6.add(((ei0) vjdVar.get(i11)).a.d);
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
                                throw qu6.l(it3);
                            }
                            if (!arrayList14.isEmpty()) {
                                bundle.putStringArrayList("skuDetailsTokens", arrayList14);
                            }
                            if (arrayList.size() > 1) {
                                ArrayList arrayList15 = new ArrayList(arrayList.size() - 1);
                                ArrayList arrayList16 = new ArrayList(arrayList.size() - 1);
                                if (1 < arrayList.size()) {
                                    arrayList.get(1).getClass();
                                    grb.o();
                                    return null;
                                }
                                bundle.putStringArrayList("additionalSkus", arrayList15);
                                bundle.putStringArrayList("additionalSkuTypes", arrayList16);
                            }
                            j2 = j5;
                        }
                        if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.o) {
                            gi0 gi0Var9 = hod.l;
                            A(21, gi0Var9, j2, false);
                            C(gi0Var9);
                            return gi0Var9;
                        }
                        if (TextUtils.isEmpty(ei0Var.a.b.optString("packageName"))) {
                            z4 = false;
                        } else {
                            bundle.putString("skuPackageName", ei0Var.a.b.optString("packageName"));
                            z4 = true;
                        }
                        Intent intent = activity.getIntent();
                        if (intent == null) {
                            old.h("BillingClient", "Activity's intent is null.");
                        } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                            String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                            bundle.putString("proxyPackage", stringExtra);
                            try {
                                bundle.putString("proxyPackageVersion", this.g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                            } catch (PackageManager.NameNotFoundException unused) {
                                bundle.putString("proxyPackageVersion", "package not found");
                            }
                        }
                        final int i13 = (!this.r || vjdVar.isEmpty()) ? (this.p && z4) ? 15 : this.n ? 9 : 6 : 17;
                        final String str14 = str;
                        final ?? r4 = str2;
                        f = f(new Callable(i13, str14, r4, fi0Var, bundle) { // from class: rlf
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
                                xcd xcdVar;
                                vh0 vh0Var = vh0.this;
                                byte b2 = this.b;
                                String str15 = this.c;
                                String str16 = this.d;
                                Bundle bundle2 = this.e;
                                try {
                                    synchronized (vh0Var.a) {
                                        xcdVar = vh0Var.i;
                                    }
                                    if (xcdVar == null) {
                                        return old.c(jn7.r1, hod.h);
                                    }
                                    return ((mcd) xcdVar).b0(b2, vh0Var.g.getPackageName(), str15, str16, bundle2);
                                } catch (DeadObjectException e2) {
                                    gi0 gi0Var10 = hod.h;
                                    String a2 = pnd.a(e2);
                                    c = old.c(5, gi0Var10);
                                    if (a2 != null) {
                                        c.putString("ADDITIONAL_LOG_DETAILS", a2);
                                    }
                                    return c;
                                } catch (Exception e3) {
                                    gi0 gi0Var11 = hod.f;
                                    String a3 = pnd.a(e3);
                                    c = old.c(5, gi0Var11);
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
                        f = f(new h9d(this, str, r42, (byte) 7), 5000L, null, this.e, e());
                        j3 = r42;
                    }
                    try {
                        if (f == null) {
                            try {
                                gi0 gi0Var10 = hod.b;
                                A(25, gi0Var10, j2, z);
                                C(gi0Var10);
                                return gi0Var10;
                            } catch (CancellationException e2) {
                                e = e2;
                                z5 = z;
                                j3 = j2;
                                old.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                                gi0 gi0Var11 = hod.i;
                                B(4, gi0Var11, pnd.a(e), j3, z5);
                                C(gi0Var11);
                                return gi0Var11;
                            } catch (TimeoutException e3) {
                                e = e3;
                                z5 = z;
                                j3 = j2;
                                old.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                                gi0 gi0Var112 = hod.i;
                                B(4, gi0Var112, pnd.a(e), j3, z5);
                                C(gi0Var112);
                                return gi0Var112;
                            } catch (Exception e4) {
                                e = e4;
                                z5 = z;
                                j3 = j2;
                                old.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                                gi0 gi0Var12 = hod.h;
                                B(5, gi0Var12, pnd.a(e), j3, z5);
                                C(gi0Var12);
                                return gi0Var12;
                            }
                        }
                        z5 = z;
                        j3 = j2;
                        Bundle bundle2 = (Bundle) f.get(5000L, TimeUnit.MILLISECONDS);
                        int a2 = old.a("BillingClient", bundle2);
                        String f2 = old.f("BillingClient", bundle2);
                        if (a2 == 0) {
                            Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                            intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                            intent2.putExtra("billingClientTransactionId", j3);
                            intent2.putExtra("wasServiceAutoReconnected", z5);
                            activity.startActivity(intent2);
                            return hod.g;
                        }
                        old.h("BillingClient", "Unable to buy item, Error response code: " + a2);
                        gi0 a3 = hod.a(a2, f2);
                        try {
                            if (bundle2 != null) {
                                try {
                                    obj = bundle2.get("LOG_REASON");
                                } catch (Throwable th) {
                                    old.h("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                                }
                                if (obj != null) {
                                    if (obj instanceof Integer) {
                                        d = xnb.d(((Integer) obj).intValue());
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
                                                old.h("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
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
                                    old.h("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                                }
                            }
                            B(i2, a3, str3, j4, z2);
                            C(a3);
                            return a3;
                        } catch (CancellationException e5) {
                            e = e5;
                            j3 = j4;
                            z5 = z2;
                            old.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                            gi0 gi0Var1122 = hod.i;
                            B(4, gi0Var1122, pnd.a(e), j3, z5);
                            C(gi0Var1122);
                            return gi0Var1122;
                        } catch (TimeoutException e6) {
                            e = e6;
                            j3 = j4;
                            z5 = z2;
                            old.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                            gi0 gi0Var11222 = hod.i;
                            B(4, gi0Var11222, pnd.a(e), j3, z5);
                            C(gi0Var11222);
                            return gi0Var11222;
                        } catch (Exception e7) {
                            e = e7;
                            j3 = j4;
                            z5 = z2;
                            old.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                            gi0 gi0Var122 = hod.h;
                            B(5, gi0Var122, pnd.a(e), j3, z5);
                            C(gi0Var122);
                            return gi0Var122;
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
                        old.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        gi0 gi0Var112222 = hod.i;
                        B(4, gi0Var112222, pnd.a(e), j3, z5);
                        C(gi0Var112222);
                        return gi0Var112222;
                    } catch (TimeoutException e9) {
                        e = e9;
                        old.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        gi0 gi0Var1122222 = hod.i;
                        B(4, gi0Var1122222, pnd.a(e), j3, z5);
                        C(gi0Var1122222);
                        return gi0Var1122222;
                    } catch (Exception e10) {
                        e = e10;
                        old.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                        gi0 gi0Var1222 = hod.h;
                        B(5, gi0Var1222, pnd.a(e), j3, z5);
                        C(gi0Var1222);
                        return gi0Var1222;
                    }
                } else {
                    a = hod.g;
                    str = str5;
                }
                j = nextLong;
                gi0Var2 = a;
                str2 = str6;
                if (gi0Var2 != hod.g) {
                }
            }
        }
        if (!this.m) {
            old.h("BillingClient", "Current client doesn't support extra params for buy intent.");
            gi0 gi0Var13 = hod.e;
            A(18, gi0Var13, nextLong, false);
            C(gi0Var13);
            return gi0Var13;
        }
        if (arrayList.size() <= 1) {
        }
        if (vjdVar.isEmpty()) {
        }
        if (((vjd) fi0Var.e).isEmpty()) {
        }
        j = nextLong;
        gi0Var2 = a;
        str2 = str6;
        if (gi0Var2 != hod.g) {
        }
    }

    public void c(k09 k09Var, tg0 tg0Var) {
        if (f(new h9d(this, tg0Var, k09Var, (byte) 2), 30000L, new iqd(this, tg0Var, (byte) 15), r(), e()) == null) {
            gi0 u = u();
            x(25, 7, u);
            jjd jjdVar = vjd.b;
            ((ci0) tg0Var.b).c(u, emd.e);
        }
    }

    public void d(di0 di0Var) {
        l(di0Var);
    }

    public final synchronized ExecutorService e() {
        ExecutorService executorService;
        executorService = this.z;
        if (executorService == null) {
            executorService = Executors.newFixedThreadPool(old.a, new kq7(this));
            this.z = executorService;
        }
        return executorService;
    }

    public final void g(nt2 nt2Var, String str, gi0 gi0Var, int i, String str2, Exception exc) {
        old.i("BillingClient", str2, exc);
        z(i, 4, gi0Var, pnd.a(exc));
        nt2Var.e(gi0Var);
    }

    public final void h(wle wleVar) {
        try {
            zhc zhcVar = this.h;
            int i = this.l;
            zhcVar.getClass();
            try {
                rpe rpeVar = (rpe) ((cqe) zhcVar.b).g();
                rpeVar.b();
                cqe.p((cqe) rpeVar.b, i);
                zhcVar.b = (cqe) rpeVar.a();
                zhcVar.h(wleVar);
            } catch (Throwable th) {
                old.i("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            old.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void i(wme wmeVar) {
        try {
            zhc zhcVar = this.h;
            int i = this.l;
            zhcVar.getClass();
            try {
                rpe rpeVar = (rpe) ((cqe) zhcVar.b).g();
                rpeVar.b();
                cqe.p((cqe) rpeVar.b, i);
                cqe cqeVar = (cqe) rpeVar.a();
                zhcVar.b = cqeVar;
                try {
                    zhcVar.r(wmeVar, cqeVar);
                } catch (Throwable th) {
                    old.i("BillingLogger", "Unable to log.", th);
                }
            } catch (Throwable th2) {
                old.i("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            old.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void j(int i, gi0 gi0Var) {
        try {
            int i2 = pnd.a;
            kle kleVar = (kle) pnd.b(i, 6, gi0Var, null, uoe.b).g();
            mve r = uve.r();
            r.c(false);
            r.d();
            kleVar.d(r);
            h((wle) kleVar.a());
        } catch (Throwable th) {
            old.i("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(int i) {
        synchronized (this.a) {
            if (this.b == 3) {
                return;
            }
            byte b = this.b;
            old.g("BillingClient", "Setting clientState from " + (b != 0 ? b != 1 ? b != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i != 0 ? i != 1 ? i != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
            this.b = i;
        }
    }

    public final void l(wh0 wh0Var) {
        int i;
        gi0 gi0Var;
        gi0 gi0Var2;
        synchronized (this.a) {
            if (o()) {
                gi0Var = t();
            } else {
                if (this.b == 1) {
                    old.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    gi0Var2 = hod.c;
                    j(37, gi0Var2);
                } else if (this.b == 3) {
                    old.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    gi0Var2 = hod.h;
                    j(38, gi0Var2);
                } else {
                    k(1);
                    m();
                    old.g("BillingClient", "Starting in-app billing setup.");
                    this.j = new nhd(this, wh0Var);
                    zhd zhdVar = this.j.b;
                    zhdVar.c = 0L;
                    zhdVar.b = false;
                    zhdVar.a();
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
                                old.h("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.c);
                                synchronized (this.a) {
                                    if (this.b == 2) {
                                        gi0Var = t();
                                    } else if (this.b != 1) {
                                        old.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                        gi0Var2 = hod.h;
                                        j(jn7.p1, gi0Var2);
                                    } else {
                                        nhd nhdVar = this.j;
                                        if (this.g.bindService(intent2, nhdVar, 1)) {
                                            old.g("BillingClient", "Service was bonded successfully.");
                                            gi0Var = null;
                                        } else {
                                            old.h("BillingClient", "Connection to Billing service is blocked.");
                                            i = 39;
                                        }
                                    }
                                }
                            }
                        } else {
                            old.h("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    k(0);
                    old.g("BillingClient", "Billing service unavailable on device.");
                    gi0 gi0Var3 = hod.a;
                    j(i, gi0Var3);
                    gi0Var = gi0Var3;
                }
                gi0Var = gi0Var2;
            }
        }
        if (gi0Var != null) {
            wh0Var.a(gi0Var);
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
                        old.i("BillingClient", "There was an exception while unbinding service!", th);
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
        ffd ffdVar = this.B;
        if (ffdVar == null) {
            p3d.h("ticker");
            return false;
        }
        long a = ffdVar.a();
        long j = 30000;
        int i = 1;
        long j2 = 30000;
        while (i <= 3) {
            try {
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                old.i("BillingClient", "Error during reconnection attempt: ", e);
            }
            if (Math.max(0L, j2) <= 0) {
                old.h("BillingClient", "No time remaining for reconnection attempt.");
                return o();
            }
            old.g("BillingClient", "Already connected or not opted into auto reconnection.");
            gi0 gi0Var = hod.g;
            timeUnit.getClass();
            int i2 = gi0Var.a;
            if (i2 == 0) {
                old.g("BillingClient", "Reconnection succeeded with result: " + i2);
                return o();
            }
            old.h("BillingClient", "Reconnection failed with result: " + i2);
            j2 = j - (((ffdVar.a() - a) + 0) / 1000000);
            long j3 = j;
            long pow = ((long) Math.pow(2.0d, i - 1)) * 1000;
            if (j2 < pow) {
                old.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                return o();
            }
            if (i < 3 && pow > 0) {
                try {
                    Thread.sleep(pow);
                    j2 = j3 - (((ffdVar.a() - a) + 0) / 1000000);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    old.i("BillingClient", "Error sleeping during reconnection attempt: ", e2);
                }
            }
            i++;
            j = j3;
        }
        old.h("BillingClient", "Max retries reached.");
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

    public final lp s(gi0 gi0Var, int i, String str, Exception exc) {
        old.i("BillingClient", str, exc);
        z(i, 7, gi0Var, pnd.a(exc));
        return new lp(gi0Var.a, gi0Var.c, new ArrayList(), new ArrayList());
    }

    public final gi0 t() {
        old.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        eme s = wme.s();
        s.b();
        wme.r((wme) s.b, 6);
        mve r = uve.r();
        r.b();
        uve.q((uve) r.b);
        r.c(false);
        r.d();
        s.b();
        wme.q((wme) s.b, (uve) r.a());
        i((wme) s.a());
        return hod.g;
    }

    public final gi0 u() {
        int[] iArr = {0, 3};
        synchronized (this.a) {
            for (int i = 0; i < 2; i++) {
                if (this.b == iArr[i]) {
                    return hod.h;
                }
            }
            return hod.f;
        }
    }

    public final zhc w(gi0 gi0Var, int i, String str, Exception exc) {
        z(i, 9, gi0Var, pnd.a(exc));
        old.i("BillingClient", str, exc);
        return new zhc(gi0Var, null, (byte) 14);
    }

    public final void x(int i, int i2, gi0 gi0Var) {
        try {
            int i3 = pnd.a;
            h(pnd.b(i, i2, gi0Var, null, uoe.b));
        } catch (Throwable th) {
            old.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void y(int i, gi0 gi0Var, long j) {
        try {
            int i2 = pnd.a;
            try {
                this.h.i(pnd.b(i, 2, gi0Var, null, uoe.b), this.l, j);
            } catch (Throwable th) {
                old.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            old.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void z(int i, int i2, gi0 gi0Var, String str) {
        try {
            int i3 = pnd.a;
            h(pnd.b(i, i2, gi0Var, str, uoe.b));
        } catch (Throwable th) {
            old.i("BillingClient", "Unable to log.", th);
        }
    }

    public vh0(sae saeVar, Context context, tj tjVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = tfd.a;
        this.c = "8.0.0";
        String v = v();
        this.d = v;
        this.g = context.getApplicationContext();
        rpe x = cqe.x();
        x.b();
        cqe.v((cqe) x.b);
        if (v != null) {
            x.b();
            cqe.w((cqe) x.b, v);
        }
        String packageName = this.g.getPackageName();
        x.b();
        cqe.t((cqe) x.b, packageName);
        x.b();
        cqe.q((cqe) x.b, nextLong);
        x.b();
        cqe.u((cqe) x.b);
        int i = Build.VERSION.SDK_INT;
        x.b();
        cqe.n((cqe) x.b, i);
        x.c();
        try {
            int i2 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            x.b();
            cqe.o((cqe) x.b, i2);
        } catch (Throwable th) {
            old.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new zhc(this.g, (cqe) x.a());
        old.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f = new fi0(this.g, null, this.h);
        this.x = saeVar;
        this.g.getPackageName();
    }
}
