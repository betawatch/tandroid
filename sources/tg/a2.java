package tg;

import a8.r7;
import a8.xa;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import c8.fc;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import di.a3;
import j$.util.Objects;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m.o3;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.kc;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.km;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.k8;
import org.telegram.ui.ld0;
import org.telegram.ui.n31;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements OnSuccessListener, kc, w5.b, u9.d, org.telegram.ui.ActionBar.q1, hj0, wh.a, ua.a, d5.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.kc
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ch0 B;
        g2 g2Var = (g2) this.b;
        if (!z10 || z11 || (B = imageReceiver.B()) == null) {
            return;
        }
        g2Var.q(B);
    }

    @Override // ua.a
    public void b(ua.b bVar) {
        x9.a aVar = (x9.a) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.b.set((x9.a) bVar.get());
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // d5.a
    public void e(WebView webView, xa xaVar, Uri uri, boolean z10, e5.f fVar) {
        e5.f fVar2;
        xi.i iVar = (xi.i) this.b;
        if (webView == iVar.o && z10 && uri != null && iVar.f.equals(uri.toString()) && iVar.j(webView)) {
            int i7 = xaVar.b;
            if (i7 != 0) {
                if (i7 == 1) {
                    synchronized (iVar.a) {
                        if (!iVar.u && (fVar2 = iVar.p) != null && fVar2 == fVar) {
                            xaVar.e(1);
                            byte[] bArr = (byte[]) xaVar.d;
                            Objects.requireNonNull(bArr);
                            iVar.k.execute(new ug.t1(20, iVar, bArr));
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            xaVar.e(0);
            String str = (String) xaVar.c;
            if (iVar.q || str == null || !str.startsWith("tproxy-base64:")) {
                iVar.i(str, fVar);
                return;
            }
            synchronized (iVar.a) {
                if (!iVar.u && iVar.r && iVar.p == fVar) {
                    if (str.length() - 14 > 1398112) {
                        iVar.h();
                    } else {
                        iVar.k.execute(new ug.t1(19, iVar, str));
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0123  */
    @Override // org.telegram.ui.Components.hj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(float f10, float f11, int i7, View view) {
        long j3;
        wg.u0 u0Var = (wg.u0) this.b;
        LinkedHashMap linkedHashMap = u0Var.h2;
        wg.t0 t0Var = u0Var.U1;
        HashSet hashSet = u0Var.a2;
        int i10 = 3;
        if (view instanceof l8) {
            linkedHashMap.clear();
            u0Var.i1(true);
        } else if (view instanceof ah.r) {
            ah.r rVar = (ah.r) view;
            TLRPC.User user = rVar.getUser();
            TLRPC.Chat chat = rVar.getChat();
            long j10 = user != null ? user.id : -chat.id;
            j3 = 1;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                Long valueOf = Long.valueOf(j10);
                if (user == null) {
                    user = chat;
                }
                linkedHashMap.put(valueOf, user);
            }
            if ((hashSet.size() == 11 && u0Var.n2 == 1) || (hashSet.size() == wg.q.f() + 1 && u0Var.n2 == 2)) {
                hashSet.remove(Long.valueOf(j10));
                u0Var.k1();
                return;
            }
            t0Var.b(true, hashSet, new wg.p0(u0Var, 1), null);
            u0Var.n1(true, false);
            if (chat != null && !t3.t0(chat) && hashSet.contains(Long.valueOf(j10))) {
                Context context = u0Var.s1.getContext();
                e6 e6Var = u0Var.J0;
                n31 n31Var = new n31(u0Var, j10, i10);
                wg.p0 p0Var = new wg.p0(u0Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                boolean V = t3.V(chat);
                String M0 = hd.M0(V ? 2131753397 : 2131753395, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                t1Var.U = hd.M0(V ? 2131753396 : 2131753394, null);
                alertDialog$Builder.k(hd.M0(2131754486, "Add"), new k8(23, atomicBoolean, p0Var));
                alertDialog$Builder.h(hd.M0(2131752589, "Cancel"), new ug.x(16));
                alertDialog$Builder.j(new a3(18, atomicBoolean, n31Var));
                alertDialog$Builder.p();
            } else if (chat != null) {
                u0Var.e1();
            }
            if (view instanceof ah.c) {
                return;
            }
            long hashCode = ((ah.c) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == np.s1(m10.t0).q0 + j3 && u0Var.n2 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                u0Var.k1();
                return;
            }
            t0Var.b(true, hashSet, new wg.p0(u0Var, 3), u0Var.g2);
            if (TextUtils.isEmpty(u0Var.j2)) {
                u0Var.n1(true, false);
                return;
            }
            u0Var.j2 = null;
            t0Var.setText("");
            u0Var.n1(false, false);
            u0Var.n1(true, true);
            return;
        }
        j3 = 1;
        if (view instanceof ah.c) {
        }
    }

    @Override // w5.b
    public Object g() {
        SQLiteDatabase a10;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 2:
                v5.g gVar = (v5.g) ((v5.c) obj);
                gVar.getClass();
                int i10 = r5.a.e;
                xi.e eVar = new xi.e();
                eVar.a = null;
                eVar.b = new ArrayList();
                eVar.c = null;
                eVar.d = "";
                HashMap hashMap = new HashMap();
                a10 = gVar.a();
                a10.beginTransaction();
                try {
                    r5.a aVar = (r5.a) v5.g.h(a10.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new km(gVar, hashMap, eVar, 16));
                    a10.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 3:
                v5.g gVar2 = (v5.g) ((v5.d) obj);
                long s5 = gVar2.b.s() - gVar2.d.d;
                a10 = gVar2.a();
                a10.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(s5)};
                    Cursor rawQuery = a10.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            gVar2.e(rawQuery.getInt(0), r5.c.c, rawQuery.getString(1));
                        } catch (Throwable th2) {
                            rawQuery.close();
                            throw th2;
                        }
                    }
                    rawQuery.close();
                    int delete = a10.delete("events", "timestamp_ms < ?", strArr);
                    a10.setTransactionSuccessful();
                    a10.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 4:
                v5.g gVar3 = (v5.g) ((v5.c) ((ia.c) obj).i);
                a10 = gVar3.a();
                a10.beginTransaction();
                try {
                    a10.compileStatement("DELETE FROM log_event_dropped").execute();
                    a10.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.b.s()).execute();
                    a10.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                ab.c0 c0Var = (ab.c0) obj;
                Iterator it = ((Iterable) ((v5.g) ((v5.d) c0Var.c)).c(new ug.x(6))).iterator();
                while (it.hasNext()) {
                    ((ld0) c0Var.d).H((o5.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 8:
                ((wg.p0) this.b).run();
                break;
            case 9:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.b;
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != null) {
                    wg.a0.e1(Q, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    break;
                }
                break;
            case 10:
                ((ao) this.b).run();
                break;
            default:
                ((wg.p0) this.b).run();
                break;
        }
    }

    @Override // u9.d
    public Object i(r7 r7Var) {
        aa.t tVar;
        ba.e eVar;
        int i7;
        int i10;
        int i11;
        Throwable th2;
        String str;
        w9.b bVar;
        aa.a a10;
        String str2;
        String str3;
        String d;
        w7.s sVar;
        ia.d dVar;
        hi.l0 l0Var;
        String p10;
        f5.g gVar;
        Task task;
        Task onSuccessTask;
        NetworkInfo activeNetworkInfo;
        ia.b a11;
        switch (this.a) {
            case 6:
                return this.b;
            default:
                CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.b;
                int i12 = CrashlyticsRegistrar.d;
                long currentTimeMillis = System.currentTimeMillis();
                o9.g gVar2 = (o9.g) r7Var.a(o9.g.class);
                va.d dVar2 = (va.d) r7Var.a(va.d.class);
                u9.o o4 = r7Var.o(x9.a.class);
                u9.o o10 = r7Var.o(p9.a.class);
                u9.o o11 = r7Var.o(fb.a.class);
                ExecutorService executorService = (ExecutorService) r7Var.e(crashlyticsRegistrar.a);
                ExecutorService executorService2 = (ExecutorService) r7Var.e(crashlyticsRegistrar.b);
                ExecutorService executorService3 = (ExecutorService) r7Var.e(crashlyticsRegistrar.c);
                gVar2.a();
                Context context = gVar2.a;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.1.1 for " + packageName, null);
                ba.e eVar2 = new ba.e(executorService, executorService2);
                ga.d dVar3 = new ga.d(context);
                aa.w wVar = new aa.w(gVar2);
                aa.a0 a0Var = new aa.a0(context, packageName, dVar2, wVar);
                x9.a aVar = new x9.a(o4);
                androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(o10);
                aa.j jVar = new aa.j(wVar, dVar3);
                hb.c cVar = hb.c.a;
                hb.d dVar4 = hb.d.a;
                hb.c cVar2 = hb.c.a;
                hb.a a12 = hb.c.a(dVar4);
                if (a12.b != null) {
                    Log.d("FirebaseSessions", "Subscriber " + dVar4 + " already registered.");
                } else {
                    a12.b = jVar;
                    Log.d("FirebaseSessions", "Subscriber " + dVar4 + " registered.");
                    a12.a.countDown();
                }
                aa.t tVar2 = new aa.t(gVar2, a0Var, aVar, wVar, new w9.a(fVar), new w9.a(fVar), dVar3, jVar, new x9.d(o11), eVar2);
                ba.e eVar3 = tVar2.n;
                gVar2.a();
                String str4 = gVar2.c.b;
                int e10 = aa.g.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (e10 == 0) {
                    e10 = aa.g.e(context, "com.crashlytics.android.build_id", "string");
                }
                String string = e10 != 0 ? context.getResources().getString(e10) : null;
                ArrayList arrayList = new ArrayList();
                int e11 = aa.g.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int e12 = aa.g.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int e13 = aa.g.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                int i13 = 1;
                if (e11 == 0 || e12 == 0 || e13 == 0) {
                    tVar = tVar2;
                    eVar = eVar3;
                    i7 = 2;
                    i10 = 0;
                    i11 = 3;
                    String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(e11), Integer.valueOf(e12), Integer.valueOf(e13));
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        th2 = null;
                        Log.d("FirebaseCrashlytics", format, null);
                    } else {
                        th2 = null;
                    }
                } else {
                    i7 = 2;
                    String[] stringArray = context.getResources().getStringArray(e11);
                    String[] stringArray2 = context.getResources().getStringArray(e12);
                    String[] stringArray3 = context.getResources().getStringArray(e13);
                    i10 = 0;
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i14 = 0;
                        while (i14 < stringArray3.length) {
                            int i15 = i14;
                            arrayList.add(new aa.d(stringArray[i15], stringArray2[i15], stringArray3[i15]));
                            i14 = i15 + 1;
                            eVar3 = eVar3;
                            tVar2 = tVar2;
                        }
                        tVar = tVar2;
                        eVar = eVar3;
                    } else {
                        tVar = tVar2;
                        eVar = eVar3;
                        String format2 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", format2, null);
                        }
                    }
                    th2 = null;
                    i11 = 3;
                }
                String k10 = r.b.k("Mapping file ID is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", i11)) {
                    Log.d("FirebaseCrashlytics", k10, th2);
                }
                int size = arrayList.size();
                int i16 = i10;
                while (i16 < size) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    aa.d dVar5 = (aa.d) obj;
                    String str5 = dVar5.a;
                    String str6 = dVar5.b;
                    String str7 = dVar5.c;
                    int i17 = size;
                    StringBuilder n10 = com.google.android.gms.internal.vision.e2.n("Build id for ", str5, " on ", str6, ": ");
                    n10.append(str7);
                    String sb2 = n10.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", sb2, null);
                    }
                    size = i17;
                }
                int i18 = i7;
                try {
                    a10 = aa.a.a(context, a0Var, str4, string, arrayList, new sg.h0(context));
                    String str8 = "Installer package name is: " + a10.d;
                    if (Log.isLoggable("FirebaseCrashlytics", i18)) {
                        Log.v("FirebaseCrashlytics", str8, null);
                    }
                    new qb.a(9);
                    str2 = a10.f;
                    str3 = a10.g;
                    d = a0Var.d();
                    sVar = new w7.s(i13);
                    dVar = new ia.d(sVar, i10);
                    l0Var = new hi.l0(dVar3);
                    Locale locale = Locale.US;
                    p10 = a8.p0.p("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str4, "/settings");
                    gVar = new f5.g();
                } catch (PackageManager.NameNotFoundException e14) {
                    str = "FirebaseCrashlytics";
                    Log.e(str, "Error retrieving app package info.", e14);
                    bVar = null;
                }
                if (p10 == null) {
                    throw new IllegalArgumentException("url must not be null.");
                }
                gVar.a = p10;
                String str9 = Build.MANUFACTURER;
                String str10 = aa.a0.h;
                String E = a8.p0.E(str9.replaceAll(str10, ""), "/", Build.MODEL.replaceAll(str10, ""));
                String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str10, "");
                String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str10, "");
                int e15 = aa.g.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (e15 == 0) {
                    e15 = aa.g.e(context, "com.crashlytics.android.build_id", "string");
                }
                String[] strArr = {e15 != 0 ? context.getResources().getString(e15) : null, str4, str3, str2};
                ArrayList arrayList2 = new ArrayList();
                int i19 = 0;
                while (i19 < 4) {
                    String str11 = strArr[i19];
                    String[] strArr2 = strArr;
                    if (str11 != null) {
                        arrayList2.add(str11.replace("-", "").toLowerCase(Locale.US));
                    }
                    i19++;
                    strArr = strArr2;
                }
                Collections.sort(arrayList2);
                StringBuilder sb3 = new StringBuilder();
                int size2 = arrayList2.size();
                int i20 = 0;
                while (i20 < size2) {
                    Object obj2 = arrayList2.get(i20);
                    i20++;
                    sb3.append((String) obj2);
                    arrayList2 = arrayList2;
                }
                String sb4 = sb3.toString();
                ia.f fVar2 = new ia.f(str4, E, replaceAll, replaceAll2, a0Var, sb4.length() > 0 ? aa.g.i(sb4) : null, str3, str2, a8.p0.d(d != null ? 4 : 1));
                ia.c cVar3 = new ia.c();
                AtomicReference atomicReference = new AtomicReference();
                cVar3.h = atomicReference;
                cVar3.i = new AtomicReference(new TaskCompletionSource());
                cVar3.a = context;
                cVar3.b = fVar2;
                cVar3.d = sVar;
                cVar3.c = dVar;
                cVar3.e = l0Var;
                cVar3.f = gVar;
                cVar3.g = wVar;
                atomicReference.set(pb.b.D0(sVar));
                AtomicReference atomicReference2 = (AtomicReference) cVar3.i;
                AtomicReference atomicReference3 = (AtomicReference) cVar3.h;
                if (!((Context) cVar3.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals((String) ((ia.f) cVar3.b).f) || (a11 = cVar3.a(1)) == null) {
                    ia.b a13 = cVar3.a(3);
                    if (a13 != null) {
                        atomicReference3.set(a13);
                        ((TaskCompletionSource) atomicReference2.get()).trySetResult(a13);
                    }
                    aa.w wVar2 = (aa.w) cVar3.g;
                    Task task2 = wVar2.h.getTask();
                    synchronized (wVar2.c) {
                        task = wVar2.d.getTask();
                    }
                    onSuccessTask = ba.a.a(task2, task).onSuccessTask(eVar2.a, new q4.q(27, cVar3, eVar2));
                } else {
                    atomicReference3.set(a11);
                    ((TaskCompletionSource) atomicReference2.get()).trySetResult(a11);
                    onSuccessTask = Tasks.forResult(null);
                }
                onSuccessTask.addOnFailureListener(executorService3, new ug.x(13));
                aa.t tVar3 = tVar;
                ga.d dVar6 = tVar3.h;
                Context context2 = tVar3.a;
                boolean c10 = aa.g.c(context2, "com.google.firebase.crashlytics.RequireBuildId", aa.g.c(context2, "com.crashlytics.RequireBuildId", true));
                String str12 = a10.b;
                if (c10) {
                    str = "FirebaseCrashlytics";
                    if (TextUtils.isEmpty(str12)) {
                        Log.e(str, ".");
                        Log.e(str, ".     |  | ");
                        Log.e(str, ".     |  |");
                        Log.e(str, ".     |  |");
                        Log.e(str, ".   \\ |  | /");
                        Log.e(str, ".    \\    /");
                        Log.e(str, ".     \\  /");
                        Log.e(str, ".      \\/");
                        Log.e(str, ".");
                        Log.e(str, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                        Log.e(str, ".");
                        Log.e(str, ".      /\\");
                        Log.e(str, ".     /  \\");
                        Log.e(str, ".    /    \\");
                        Log.e(str, ".   / |  | \\");
                        Log.e(str, ".     |  |");
                        Log.e(str, ".     |  |");
                        Log.e(str, ".     |  |");
                        Log.e(str, ".");
                        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                    }
                } else {
                    str = "FirebaseCrashlytics";
                    if (Log.isLoggable(str, 2)) {
                        Log.v(str, "Configured not to require a build ID.", null);
                    }
                }
                String str13 = new aa.e().a;
                try {
                    int i21 = 2;
                    tVar3.e = new wf.b(i21, "crash_marker", dVar6);
                    tVar3.d = new wf.b(i21, "initialization_marker", dVar6);
                    ba.e eVar4 = eVar;
                    o3 o3Var = new o3(str13, dVar6, eVar4);
                    ca.f fVar3 = new ca.f(dVar6);
                    wf.b bVar2 = new wf.b(new ja.a[]{new nb.a(12)});
                    ((u9.o) tVar3.m.a).a(new x2.p1(1));
                    tVar3.f = new aa.p(tVar3.a, tVar3.g, tVar3.b, tVar3.h, tVar3.e, a10, o3Var, fVar3, aa.e0.d(tVar3.a, tVar3.g, tVar3.h, a10, fVar3, o3Var, bVar2, cVar3, tVar3.c, tVar3.k, tVar3.n), tVar3.l, tVar3.j, tVar3.k, tVar3.n);
                    wf.b bVar3 = tVar3.d;
                    ga.d dVar7 = (ga.d) bVar3.c;
                    String str14 = (String) bVar3.b;
                    dVar7.getClass();
                    boolean exists = new File((File) dVar7.d, str14).exists();
                    try {
                        Boolean.TRUE.equals((Boolean) eVar4.a.a.submit(new aa.s(tVar3, 0)).get(3L, TimeUnit.SECONDS));
                    } catch (Exception unused) {
                    }
                    aa.p pVar = tVar3.f;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                    pVar.e.a.a(new a1.e(2, pVar, str13));
                    aa.v vVar = new aa.v(new ob.c(pVar, 1), cVar3, defaultUncaughtExceptionHandler, pVar.j);
                    pVar.n = vVar;
                    Thread.setDefaultUncaughtExceptionHandler(vVar);
                    if (Build.VERSION.SDK_INT >= 37) {
                        tVar3.f.e(str13);
                    }
                    if (!exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                        if (Log.isLoggable(str, 3)) {
                            Log.d(str, "Successfully configured exception handler.", null);
                        }
                        eVar4.a.a(new aa.q(tVar3, cVar3, 0));
                    } else {
                        if (Log.isLoggable(str, 3)) {
                            Log.d(str, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                        }
                        tVar3.b(cVar3);
                    }
                } catch (Exception e16) {
                    Log.e(str, "Crashlytics was not started due to an exception during initialization", e16);
                    tVar3.f = null;
                }
                bVar = new w9.b(tVar3);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis2 > 16) {
                    String j3 = r.b.j(currentTimeMillis2, "Initializing Crashlytics blocked main for ", " ms");
                    if (Log.isLoggable(str, 3)) {
                        Log.d(str, j3, null);
                    }
                }
                return bVar;
        }
    }

    @Override // wh.a
    public void k(Canvas canvas, int i7) {
        wh.h hVar = (wh.h) this.b;
        hVar.getClass();
        canvas.save();
        RectF rectF = hVar.r;
        canvas.translate(-rectF.left, (-rectF.top) + org.telegram.messenger.g0.L(30.0f));
        hVar.e(canvas, true, i7);
        canvas.restore();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        f2 f2Var = (f2) this.b;
        List list = (List) obj;
        if (list.size() <= 0) {
            a8.b("objimg: no objects");
            return;
        }
        int i7 = ((wb.a) list.get(0)).c;
        String str = null;
        if (fc.a == null) {
            fc.a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
        }
        if (i7 >= 0) {
            String[] strArr = fc.a;
            if (i7 < strArr.length) {
                str = strArr[i7];
            }
        }
        f2Var.d0 = str;
        StringBuilder sb2 = new StringBuilder("objimg: detected #");
        sb2.append(((wb.a) list.get(0)).c);
        sb2.append(" ");
        sb2.append(f2Var.d0);
        sb2.append(" ");
        org.telegram.ui.Cells.y0.t(((wb.a) list.get(0)).a, sb2);
        j6.g(f2Var.d0);
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void A(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void O(int i7, Drawable drawable) {
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
