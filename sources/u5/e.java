package u5;

import a8.p0;
import a8.r7;
import a8.wa;
import aa.b0;
import aa.f0;
import aa.r;
import aa.t;
import aa.u;
import aa.w;
import aa.x;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import bg.p;
import bi.d0;
import bi.u3;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import f5.f;
import f5.l;
import h9.f1;
import j$.util.Objects;
import j2.n;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m.q3;
import o5.i;
import o9.g;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.q1;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.vy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ky0;
import org.telegram.ui.q31;
import q4.q;
import r0.k1;
import r0.m;
import sg.i0;
import ug.j;
import w7.s;
import wg.a0;
import wg.c0;
import wg.r0;
import wg.v0;
import wg.w0;
import wh.h;
import zh.g1;
import zh.h0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements w5.b, u9.d, d5.a, r1, dj0, wh.a, ua.a, p, m, q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r0.m
    public k1 S0(View view, k1 k1Var) {
        ((h0) this.b).n1.j(k1Var);
        return k1.b;
    }

    @Override // org.telegram.messenger.q1
    public void a(f fVar, List list) {
        int i7;
        g1 g1Var = (g1) this.b;
        ArrayList arrayList = g1Var.e2;
        Iterator it = list.iterator();
        long j3 = 0;
        while (true) {
            i7 = 0;
            if (!it.hasNext()) {
                break;
            }
            l lVar = (l) it.next();
            int size = arrayList.size();
            while (true) {
                if (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    j jVar = (j) obj;
                    if (jVar.h() != null && jVar.h().equals(lVar.c)) {
                        jVar.h = lVar;
                        if (jVar.f() > j3) {
                            j3 = jVar.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            ((j) obj2).g = j3;
        }
        g0.h3(new a0(g1Var, 5));
    }

    @Override // ua.a
    public void c(ua.b bVar) {
        x9.a aVar = (x9.a) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.b.set((x9.a) bVar.get());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u9.d
    public Object e(r7 r7Var) {
        u uVar;
        ba.e eVar;
        int i7;
        int i10;
        int i11;
        Throwable th2;
        String str;
        w9.b bVar;
        Task task;
        Task onSuccessTask;
        NetworkInfo activeNetworkInfo;
        ia.b a10;
        switch (this.a) {
            case 1:
                return this.b;
            default:
                CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.b;
                int i12 = CrashlyticsRegistrar.d;
                long currentTimeMillis = System.currentTimeMillis();
                g gVar = (g) r7Var.a(g.class);
                va.d dVar = (va.d) r7Var.a(va.d.class);
                u9.p o4 = r7Var.o(x9.a.class);
                u9.p o10 = r7Var.o(p9.a.class);
                u9.p o11 = r7Var.o(fb.a.class);
                ExecutorService executorService = (ExecutorService) r7Var.e(crashlyticsRegistrar.a);
                ExecutorService executorService2 = (ExecutorService) r7Var.e(crashlyticsRegistrar.b);
                ExecutorService executorService3 = (ExecutorService) r7Var.e(crashlyticsRegistrar.c);
                gVar.a();
                Context context = gVar.a;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.1.1 for " + packageName, null);
                ba.e eVar2 = new ba.e(executorService, executorService2);
                ga.d dVar2 = new ga.d(context);
                x xVar = new x(gVar);
                b0 b0Var = new b0(context, packageName, dVar, xVar);
                x9.a aVar = new x9.a(o4);
                androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(o10);
                aa.j jVar = new aa.j(xVar, dVar2);
                hb.c cVar = hb.c.a;
                hb.d dVar3 = hb.d.a;
                hb.c cVar2 = hb.c.a;
                hb.a a11 = hb.c.a(dVar3);
                if (a11.b != null) {
                    Log.d("FirebaseSessions", "Subscriber " + dVar3 + " already registered.");
                } else {
                    a11.b = jVar;
                    Log.d("FirebaseSessions", "Subscriber " + dVar3 + " registered.");
                    a11.a.countDown();
                }
                u uVar2 = new u(gVar, b0Var, aVar, xVar, new w9.a(fVar), new w9.a(fVar), dVar2, jVar, new vy(o11, 28), eVar2);
                ba.e eVar3 = uVar2.n;
                gVar.a();
                String str2 = gVar.c.b;
                int e10 = aa.g.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (e10 == 0) {
                    e10 = aa.g.e(context, "com.crashlytics.android.build_id", "string");
                }
                String string = e10 != 0 ? context.getResources().getString(e10) : null;
                ArrayList arrayList = new ArrayList();
                int e11 = aa.g.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int e12 = aa.g.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int e13 = aa.g.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (e11 == 0 || e12 == 0 || e13 == 0) {
                    uVar = uVar2;
                    eVar = eVar3;
                    i7 = 1;
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
                    i7 = 1;
                    String[] stringArray = context.getResources().getStringArray(e11);
                    String[] stringArray2 = context.getResources().getStringArray(e12);
                    String[] stringArray3 = context.getResources().getStringArray(e13);
                    i10 = 0;
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i13 = 0;
                        while (i13 < stringArray3.length) {
                            int i14 = i13;
                            arrayList.add(new aa.d(stringArray[i14], stringArray2[i14], stringArray3[i14]));
                            i13 = i14 + 1;
                            eVar3 = eVar3;
                            uVar2 = uVar2;
                        }
                        uVar = uVar2;
                        eVar = eVar3;
                    } else {
                        uVar = uVar2;
                        eVar = eVar3;
                        String format2 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", format2, null);
                        }
                    }
                    th2 = null;
                    i11 = 3;
                }
                String i15 = rf.b.i("Mapping file ID is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", i11)) {
                    Log.d("FirebaseCrashlytics", i15, th2);
                }
                int size = arrayList.size();
                int i16 = i10;
                while (i16 < size) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    aa.d dVar4 = (aa.d) obj;
                    String str3 = dVar4.a;
                    String str4 = dVar4.b;
                    String str5 = dVar4.c;
                    int i17 = size;
                    StringBuilder n10 = com.google.android.recaptcha.internal.a.n("Build id for ", str3, " on ", str4, ": ");
                    n10.append(str5);
                    String sb2 = n10.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", sb2, null);
                    }
                    size = i17;
                }
                int i18 = i7;
                try {
                    aa.a a12 = aa.a.a(context, b0Var, str2, string, arrayList, new i0(context));
                    String str6 = "Installer package name is: " + a12.d;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str6, null);
                    }
                    pb.b bVar2 = new pb.b(9);
                    String str7 = a12.f;
                    String str8 = a12.g;
                    String d = b0Var.d();
                    s sVar = new s(i18, i10);
                    gf.g gVar2 = new gf.g(sVar, 5);
                    f1 f1Var = new f1(dVar2);
                    Locale locale = Locale.US;
                    g9.l lVar = new g9.l(p0.p("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str2, "/settings"), bVar2);
                    String str9 = Build.MANUFACTURER;
                    String str10 = b0.h;
                    String D = p0.D(str9.replaceAll(str10, ""), "/", Build.MODEL.replaceAll(str10, ""));
                    String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str10, "");
                    String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str10, "");
                    int e14 = aa.g.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (e14 == 0) {
                        e14 = aa.g.e(context, "com.crashlytics.android.build_id", "string");
                    }
                    String[] strArr = {e14 != 0 ? context.getResources().getString(e14) : null, str2, str8, str7};
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
                    ia.e eVar4 = new ia.e(str2, D, replaceAll, replaceAll2, b0Var, sb4.length() > 0 ? aa.g.i(sb4) : null, str8, str7, p0.d(d != null ? 4 : 1));
                    ia.c cVar3 = new ia.c();
                    AtomicReference atomicReference = new AtomicReference();
                    cVar3.h = atomicReference;
                    cVar3.i = new AtomicReference(new TaskCompletionSource());
                    cVar3.a = context;
                    cVar3.b = eVar4;
                    cVar3.d = sVar;
                    cVar3.c = gVar2;
                    cVar3.e = f1Var;
                    cVar3.f = lVar;
                    cVar3.g = xVar;
                    atomicReference.set(nb.a.W(sVar));
                    AtomicReference atomicReference2 = (AtomicReference) cVar3.i;
                    AtomicReference atomicReference3 = (AtomicReference) cVar3.h;
                    if (!((Context) cVar3.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals((String) ((ia.e) cVar3.b).f) || (a10 = cVar3.a(1)) == null) {
                        ia.b a13 = cVar3.a(3);
                        if (a13 != null) {
                            atomicReference3.set(a13);
                            ((TaskCompletionSource) atomicReference2.get()).trySetResult(a13);
                        }
                        x xVar2 = (x) cVar3.g;
                        Task task2 = xVar2.h.getTask();
                        synchronized (xVar2.c) {
                            task = xVar2.d.getTask();
                        }
                        onSuccessTask = ba.a.a(task2, task).onSuccessTask(eVar2.a, new q(29, cVar3, eVar2));
                    } else {
                        atomicReference3.set(a10);
                        ((TaskCompletionSource) atomicReference2.get()).trySetResult(a10);
                        onSuccessTask = Tasks.forResult(null);
                    }
                    int i21 = 12;
                    onSuccessTask.addOnFailureListener(executorService3, new v0.j(i21));
                    u uVar3 = uVar;
                    ga.d dVar5 = uVar3.h;
                    Context context2 = uVar3.a;
                    boolean c10 = aa.g.c(context2, "com.google.firebase.crashlytics.RequireBuildId", aa.g.c(context2, "com.crashlytics.RequireBuildId", true));
                    String str12 = a12.b;
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
                        int i22 = 2;
                        uVar3.e = new wf.b(i22, "crash_marker", dVar5);
                        uVar3.d = new wf.b(i22, "initialization_marker", dVar5);
                        ba.e eVar5 = eVar;
                        q3 q3Var = new q3(str13, dVar5, eVar5);
                        ca.f fVar2 = new ca.f(dVar5);
                        n nVar = new n(new ja.a[]{new nb.a(i21)});
                        ((u9.p) uVar3.m.b).a(new v0.j(26));
                        uVar3.f = new aa.q(uVar3.a, uVar3.g, uVar3.b, uVar3.h, uVar3.e, a12, q3Var, fVar2, f0.d(uVar3.a, uVar3.g, uVar3.h, a12, fVar2, q3Var, nVar, cVar3, uVar3.c, uVar3.k, uVar3.n), uVar3.l, uVar3.j, uVar3.k, uVar3.n);
                        wf.b bVar3 = uVar3.d;
                        ga.d dVar6 = (ga.d) bVar3.c;
                        String str14 = (String) bVar3.b;
                        dVar6.getClass();
                        boolean exists = new File((File) dVar6.d, str14).exists();
                        try {
                            Boolean.TRUE.equals((Boolean) eVar5.a.a.submit(new t(uVar3, 0)).get(3L, TimeUnit.SECONDS));
                        } catch (Exception unused) {
                        }
                        aa.q qVar = uVar3.f;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        qVar.e.a.a(new a1.e(2, qVar, str13));
                        w wVar = new w(new aa.n(qVar, 0), cVar3, defaultUncaughtExceptionHandler, qVar.j);
                        qVar.n = wVar;
                        Thread.setDefaultUncaughtExceptionHandler(wVar);
                        if (Build.VERSION.SDK_INT >= 37) {
                            uVar3.f.e(str13);
                        }
                        if (!exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                            if (Log.isLoggable(str, 3)) {
                                Log.d(str, "Successfully configured exception handler.", null);
                            }
                            eVar5.a.a(new r(uVar3, cVar3, 0));
                        } else {
                            if (Log.isLoggable(str, 3)) {
                                Log.d(str, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                            }
                            uVar3.b(cVar3);
                        }
                    } catch (Exception e15) {
                        Log.e(str, "Crashlytics was not started due to an exception during initialization", e15);
                        uVar3.f = null;
                    }
                    bVar = new w9.b(uVar3);
                } catch (PackageManager.NameNotFoundException e16) {
                    str = "FirebaseCrashlytics";
                    Log.e(str, "Error retrieving app package info.", e16);
                    bVar = null;
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis2 > 16) {
                    String h = rf.b.h(currentTimeMillis2, "Initializing Crashlytics blocked main for ", " ms");
                    if (Log.isLoggable(str, 3)) {
                        Log.d(str, h, null);
                    }
                }
                return bVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0122  */
    @Override // org.telegram.ui.Components.dj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(float f10, float f11, int i7, View view) {
        long j3;
        w0 w0Var = (w0) this.b;
        LinkedHashMap linkedHashMap = w0Var.d2;
        v0 v0Var = w0Var.Q1;
        HashSet hashSet = w0Var.W1;
        if (view instanceof m8) {
            linkedHashMap.clear();
            w0Var.i1(true);
        } else if (view instanceof ah.r) {
            ah.r rVar = (ah.r) view;
            TLRPC.User user = rVar.getUser();
            TLRPC.Chat chat = rVar.getChat();
            long j10 = user != null ? user.id : -chat.id;
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
            if (hashSet.size() != 11 || w0Var.j2 != 1) {
                j3 = 1;
                if (hashSet.size() != wg.r.f() + 1 || w0Var.j2 != 2) {
                    v0Var.b(true, hashSet, new r0(w0Var, 1), null);
                    w0Var.n1(true, false);
                    if (chat != null && !t3.t0(chat) && hashSet.contains(Long.valueOf(j10))) {
                        Context context = w0Var.o1.getContext();
                        g6 g6Var = w0Var.I0;
                        q31 q31Var = new q31(w0Var, j10, 4);
                        r0 r0Var = new r0(w0Var, 2);
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, g6Var);
                        boolean V = t3.V(chat);
                        String M0 = id.M0(V ? 2131753397 : 2131753395, null);
                        u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = id.M0(V ? 2131753396 : 2131753394, null);
                        alertDialog$Builder.k(id.M0(2131754486, "Add"), new org.telegram.ui.web.a0(17, atomicBoolean, r0Var));
                        alertDialog$Builder.h(id.M0(2131752589, "Cancel"), new v0.j(15));
                        alertDialog$Builder.j(new u3(18, atomicBoolean, q31Var));
                        alertDialog$Builder.p();
                    } else if (chat != null) {
                        w0Var.e1();
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
                    if (hashSet.size() == qp.s1(p10.s0).p0 + j3 && w0Var.j2 == 3) {
                        hashSet.remove(Long.valueOf(hashCode));
                        w0Var.k1();
                        return;
                    }
                    v0Var.b(true, hashSet, new r0(w0Var, 3), w0Var.c2);
                    if (TextUtils.isEmpty(w0Var.f2)) {
                        w0Var.n1(true, false);
                        return;
                    }
                    w0Var.f2 = null;
                    v0Var.setText("");
                    w0Var.n1(false, false);
                    w0Var.n1(true, true);
                    return;
                }
            }
            hashSet.remove(Long.valueOf(j10));
            w0Var.k1();
            return;
        }
        j3 = 1;
        if (view instanceof ah.c) {
        }
    }

    @Override // org.telegram.ui.Components.dj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
        switch (this.a) {
            case 4:
                ((r0) this.b).run();
                break;
            case 5:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.b;
                f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    c0.e1(Q, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    break;
                }
                break;
            case 6:
                ((sn) this.b).run();
                break;
            case 7:
                ((r0) this.b).run();
                break;
            default:
                ((d0) this.b).run();
                break;
        }
    }

    @Override // w5.b
    public Object h() {
        ui.e eVar = (ui.e) this.b;
        Iterator it = ((Iterable) ((v5.g) ((v5.d) eVar.c)).c(new v0.j(5))).iterator();
        while (it.hasNext()) {
            ((ky0) eVar.d).J((i) it.next(), 1, false);
        }
        return null;
    }

    @Override // d5.a
    public void i(WebView webView, wa waVar, Uri uri, boolean z9, e5.f fVar) {
        e5.f fVar2;
        ui.i iVar = (ui.i) this.b;
        if (webView == iVar.o && z9 && uri != null && iVar.f.equals(uri.toString()) && iVar.j(webView)) {
            int i7 = waVar.b;
            if (i7 != 0) {
                if (i7 == 1) {
                    synchronized (iVar.a) {
                        if (!iVar.u && (fVar2 = iVar.p) != null && fVar2 == fVar) {
                            waVar.f(1);
                            byte[] bArr = (byte[]) waVar.d;
                            Objects.requireNonNull(bArr);
                            iVar.k.execute(new u9.f(9, iVar, bArr));
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            waVar.f(0);
            String str = (String) waVar.c;
            if (iVar.q || str == null || !str.startsWith("tproxy-base64:")) {
                iVar.i(str, fVar);
                return;
            }
            synchronized (iVar.a) {
                if (!iVar.u && iVar.r && iVar.p == fVar) {
                    if (str.length() - 14 > 1398112) {
                        iVar.h();
                    } else {
                        iVar.k.execute(new u9.f(8, iVar, str));
                    }
                }
            }
        }
    }

    @Override // bg.p
    public void j(long j3) {
        ((zh.e) this.b).a(j3, true);
    }

    @Override // wh.a
    public void m(Canvas canvas, int i7) {
        h hVar = (h) this.b;
        hVar.getClass();
        canvas.save();
        RectF rectF = hVar.r;
        canvas.translate(-rectF.left, (-rectF.top) + g0.L(30.0f));
        hVar.e(canvas, true, i7);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.dj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
