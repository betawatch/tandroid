package r9;

import a4.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.messaging.s;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import k2.g0;
import m.p3;
import n4.y;
import n7.z0;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Cells.p6;
import q9.n;
import q9.p;
import rg.o2;
import w9.o;
import w9.q;
import w9.r;
import w9.u;
import w9.v;
import w9.w;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements q9.d, OnFailureListener, s5.e, pa.a, a2 {
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(47:38|39|40|(1:42)|43|(1:45)|(1:47)(1:162)|48|(4:51|(2:53|54)(1:56)|55|49)|57|58|(1:60)|61|62|(1:64)(1:161)|(1:66)(1:160)|67|(5:147|(1:149)|150|3a5|155)(1:71)|72|(25:76|(1:78)(2:143|(1:145))|79|80|(2:82|(1:84))(2:139|(2:141|142))|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|(4:120|(1:122)|116|117)(6:111|(1:113)|114|115|116|117))|146|80|(0)(0)|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|(2:105|107)|120|(0)|116|117) */
    /* JADX WARN: Can't wrap try/catch for region: R(60:3|(1:5)(1:177)|6|(1:8)|(1:10)(1:176)|11|(3:171|172|(1:174)(1:175))(3:15|(3:167|(1:169)|170)(3:19|(2:22|20)|23)|24)|25|(1:27)|28|(3:30|(2:32|33)(1:35)|34)|36|37|38|39|40|(1:42)|43|(1:45)|(1:47)(1:162)|48|(4:51|(2:53|54)(1:56)|55|49)|57|58|(1:60)|61|62|(1:64)(1:161)|(1:66)(1:160)|67|(5:147|(1:149)|150|3a5|155)(1:71)|72|(25:76|(1:78)(2:143|(1:145))|79|80|(2:82|(1:84))(2:139|(2:141|142))|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|(4:120|(1:122)|116|117)(6:111|(1:113)|114|115|116|117))|146|80|(0)(0)|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|(2:105|107)|120|(0)|116|117) */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x054e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x056d, code lost:
    
        android.util.Log.e(r7, "Crashlytics was not started due to an exception during initialization", r0);
        r3.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x055e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x055f, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0562, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0563, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0565, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0569, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x056a, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0417  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // q9.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object D(cf.c cVar) {
        String str;
        int i10;
        ?? r22;
        Task task;
        Task onSuccessTask;
        w9.a aVar;
        boolean z10;
        String str2;
        da.b bVar;
        boolean z11;
        boolean exists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        da.a c10;
        String str3;
        switch (this.a) {
            case 0:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 1:
                n nVar = ExecutorsRegistrar.a;
                return k.a;
            default:
                int i11 = CrashlyticsRegistrar.a;
                k9.h hVar = (k9.h) cVar.a(k9.h.class);
                p p5 = cVar.p(t9.a.class);
                p p10 = cVar.p(l9.a.class);
                qa.d dVar = (qa.d) cVar.a(qa.d.class);
                p p11 = cVar.p(ya.a.class);
                hVar.a();
                Context context = hVar.a;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 18.6.0 for " + packageName, null);
                ba.c cVar2 = new ba.c(context);
                r rVar = new r(hVar);
                u uVar = new u(context, packageName, dVar, rVar);
                t9.a aVar2 = new t9.a(p5);
                androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(p10);
                ExecutorService a2 = w9.h.a("Crashlytics Exception Handler");
                w9.j jVar = new w9.j(rVar, cVar2);
                ab.c cVar3 = ab.c.a;
                ab.d dVar2 = ab.d.a;
                ab.c cVar4 = ab.c.a;
                ab.a a10 = ab.c.a(dVar2);
                if (a10.b != null) {
                    Log.d("SessionsDependencies", "Subscriber " + dVar2 + " already registered.");
                    str = null;
                } else {
                    a10.b = jVar;
                    Log.d("SessionsDependencies", "Subscriber " + dVar2 + " registered.");
                    str = null;
                    a10.a.e(null);
                }
                g0 g0Var = new g0(p11, 23);
                s9.a aVar3 = new s9.a(fVar);
                s9.a aVar4 = new s9.a(fVar);
                String str4 = str;
                o oVar = new o(hVar, uVar, aVar2, rVar, aVar3, aVar4, cVar2, a2, jVar, g0Var);
                hVar.a();
                String str5 = hVar.c.b;
                int e7 = w9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (e7 == 0) {
                    e7 = w9.h.e(context, "com.crashlytics.android.build_id", "string");
                }
                String string = e7 != 0 ? context.getResources().getString(e7) : str4;
                ArrayList arrayList = new ArrayList();
                int e10 = w9.h.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int e11 = w9.h.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int e12 = w9.h.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (e10 == 0 || e11 == 0 || e12 == 0) {
                    i10 = 3;
                    String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(e10), Integer.valueOf(e11), Integer.valueOf(e12));
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        r22 = 0;
                        Log.d("FirebaseCrashlytics", format, null);
                    } else {
                        r22 = 0;
                    }
                } else {
                    String[] stringArray = context.getResources().getStringArray(e10);
                    String[] stringArray2 = context.getResources().getStringArray(e11);
                    String[] stringArray3 = context.getResources().getStringArray(e12);
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i12 = 0;
                        str3 = str4;
                        while (i12 < stringArray3.length) {
                            int i13 = i12;
                            arrayList.add(new w9.e(stringArray[i12], stringArray2[i12], stringArray3[i13]));
                            i12 = i13 + 1;
                            str3 = null;
                        }
                    } else {
                        String format2 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", format2, null);
                        }
                        str3 = null;
                    }
                    i10 = 3;
                    r22 = str3;
                }
                String i14 = p6.i("Mapping file ID is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", i10)) {
                    Log.d("FirebaseCrashlytics", i14, r22);
                }
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    w9.e eVar = (w9.e) obj;
                    String str6 = eVar.a;
                    String str7 = eVar.b;
                    String str8 = eVar.c;
                    int i16 = size;
                    StringBuilder w10 = a4.a.w("Build id for ", str6, " on ", str7, ": ");
                    w10.append(str8);
                    String sb2 = w10.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", sb2, null);
                    }
                    size = i16;
                }
                try {
                    w9.a a11 = w9.a.a(context, uVar, str5, string, arrayList, new z0(context));
                    String str9 = "Installer package name is: " + a11.d;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str9, null);
                    }
                    ExecutorService a12 = w9.h.a("com.google.firebase.crashlytics.startup");
                    ob.a aVar5 = new ob.a(1);
                    String str10 = a11.f;
                    String str11 = a11.g;
                    String c11 = uVar.c();
                    ob.a aVar6 = new ob.a(25);
                    xa.c cVar5 = new xa.c(aVar6, 15);
                    a6.i iVar = new a6.i(cVar2);
                    Locale locale = Locale.US;
                    m mVar = new m(a4.a.p("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str5, "/settings"), aVar5);
                    String str12 = Build.MANUFACTURER;
                    String str13 = u.h;
                    String C = a4.a.C(str12.replaceAll(str13, ""), "/", Build.MODEL.replaceAll(str13, ""));
                    String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str13, "");
                    String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str13, "");
                    int e13 = w9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (e13 == 0) {
                        e13 = w9.h.e(context, "com.crashlytics.android.build_id", "string");
                    }
                    String[] strArr = {e13 != 0 ? context.getResources().getString(e13) : null, str5, str11, str10};
                    ArrayList arrayList2 = new ArrayList();
                    int i17 = 0;
                    while (i17 < 4) {
                        String str14 = strArr[i17];
                        String[] strArr2 = strArr;
                        if (str14 != null) {
                            arrayList2.add(str14.replace("-", "").toLowerCase(Locale.US));
                        }
                        i17++;
                        strArr = strArr2;
                    }
                    Collections.sort(arrayList2);
                    StringBuilder sb3 = new StringBuilder();
                    int size2 = arrayList2.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        Object obj2 = arrayList2.get(i18);
                        i18++;
                        sb3.append((String) obj2);
                        arrayList2 = arrayList2;
                    }
                    String sb4 = sb3.toString();
                    da.d dVar3 = new da.d(str5, C, replaceAll, replaceAll2, uVar, sb4.length() > 0 ? w9.h.i(sb4) : null, str11, str10, w.f.c(c11 != null ? 4 : 1));
                    da.b bVar2 = new da.b();
                    AtomicReference atomicReference = new AtomicReference();
                    bVar2.h = atomicReference;
                    bVar2.i = new AtomicReference(new TaskCompletionSource());
                    bVar2.a = context;
                    bVar2.b = dVar3;
                    bVar2.d = aVar6;
                    bVar2.c = cVar5;
                    bVar2.e = iVar;
                    bVar2.f = mVar;
                    bVar2.g = rVar;
                    atomicReference.set(qb.b.s2(aVar6));
                    AtomicReference atomicReference2 = (AtomicReference) bVar2.i;
                    AtomicReference atomicReference3 = (AtomicReference) bVar2.h;
                    if (!((Context) bVar2.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((da.d) bVar2.b).f) || (c10 = bVar2.c(1)) == null) {
                        da.a c12 = bVar2.c(3);
                        if (c12 != null) {
                            atomicReference3.set(c12);
                            ((TaskCompletionSource) atomicReference2.get()).trySetResult(c12);
                        }
                        r rVar2 = (r) bVar2.g;
                        Task task2 = rVar2.h.getTask();
                        synchronized (rVar2.c) {
                            task = rVar2.d.getTask();
                        }
                        ExecutorService executorService = w.a;
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        v vVar = new v(0, taskCompletionSource);
                        task2.continueWith(a12, vVar);
                        task.continueWith(a12, vVar);
                        onSuccessTask = taskCompletionSource.getTask().onSuccessTask(a12, new a6.m(bVar2, 14));
                    } else {
                        atomicReference3.set(c10);
                        ((TaskCompletionSource) atomicReference2.get()).trySetResult(c10);
                        onSuccessTask = Tasks.forResult(null);
                    }
                    onSuccessTask.continueWith(a12, new ob.a(22));
                    s sVar = oVar.l;
                    ba.c cVar6 = oVar.h;
                    Context context2 = oVar.a;
                    if (context2 != null && (resources = context2.getResources()) != null) {
                        int e14 = w9.h.e(context2, "com.crashlytics.RequireBuildId", "bool");
                        if (e14 > 0) {
                            z10 = resources.getBoolean(e14);
                        } else {
                            int e15 = w9.h.e(context2, "com.crashlytics.RequireBuildId", "string");
                            if (e15 > 0) {
                                z10 = Boolean.parseBoolean(context2.getString(e15));
                            }
                        }
                        aVar = a11;
                        String str15 = aVar.b;
                        if (z10) {
                            str2 = "FirebaseCrashlytics";
                            if (Log.isLoggable(str2, 2)) {
                                Log.v(str2, "Configured not to require a build ID.", null);
                            }
                        } else {
                            str2 = "FirebaseCrashlytics";
                            if (TextUtils.isEmpty(str15)) {
                                Log.e(str2, ".");
                                Log.e(str2, ".     |  | ");
                                Log.e(str2, ".     |  |");
                                Log.e(str2, ".     |  |");
                                Log.e(str2, ".   \\ |  | /");
                                Log.e(str2, ".    \\    /");
                                Log.e(str2, ".     \\  /");
                                Log.e(str2, ".      \\/");
                                Log.e(str2, ".");
                                Log.e(str2, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                                Log.e(str2, ".");
                                Log.e(str2, ".      /\\");
                                Log.e(str2, ".     /  \\");
                                Log.e(str2, ".    /    \\");
                                Log.e(str2, ".   / |  | \\");
                                Log.e(str2, ".     |  |");
                                Log.e(str2, ".     |  |");
                                Log.e(str2, ".     |  |");
                                Log.e(str2, ".");
                                throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                            }
                        }
                        new w9.f(oVar.g);
                        String str16 = w9.f.b;
                        int i19 = 23;
                        oVar.e = new o0.a(i19, "crash_marker", cVar6);
                        oVar.d = new o0.a(i19, "initialization_marker", cVar6);
                        p3 p3Var = new p3(str16, cVar6, sVar);
                        x9.e eVar2 = new x9.e(cVar6);
                        ea.a[] aVarArr = new ea.a[1];
                        aVarArr[0] = new na.d();
                        y yVar = new y(aVarArr);
                        ((p) oVar.o.b).a(new t0.a(1));
                        w9.a aVar7 = aVar;
                        com.google.firebase.messaging.n k10 = com.google.firebase.messaging.n.k(oVar.a, oVar.g, oVar.h, aVar7, eVar2, p3Var, yVar, bVar2, oVar.c, oVar.m);
                        bVar = bVar2;
                        oVar.f = new w9.m(oVar.a, oVar.l, oVar.g, oVar.b, oVar.h, oVar.e, aVar7, p3Var, eVar2, k10, oVar.n, oVar.j, oVar.m);
                        o0.a aVar8 = oVar.d;
                        ba.c cVar7 = (ba.c) aVar8.c;
                        String str17 = (String) aVar8.b;
                        cVar7.getClass();
                        exists = new File(cVar7.b, str17).exists();
                        z11 = true;
                        z11 = true;
                        Boolean.TRUE.equals((Boolean) w.a(sVar.h(new w9.n(oVar, z11 ? 1 : 0))));
                        w9.m mVar2 = oVar.f;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        mVar2.e.h(new u4.g(2, mVar2, str16));
                        q qVar = new q(new mg.n(mVar2, 22), bVar, defaultUncaughtExceptionHandler, mVar2.j);
                        mVar2.n = qVar;
                        Thread.setDefaultUncaughtExceptionHandler(qVar);
                        if (exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                            if (Log.isLoggable(str2, 3)) {
                                Log.d(str2, "Successfully configured exception handler.", null);
                            }
                            Tasks.call(a12, new s9.b(z11, oVar, bVar));
                            return new s9.c(oVar);
                        }
                        if (Log.isLoggable(str2, 3)) {
                            Log.d(str2, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                        }
                        oVar.b(bVar);
                        z11 = false;
                        Tasks.call(a12, new s9.b(z11, oVar, bVar));
                        return new s9.c(oVar);
                    }
                    aVar = a11;
                    z10 = true;
                    String str152 = aVar.b;
                    if (z10) {
                    }
                    new w9.f(oVar.g);
                    String str162 = w9.f.b;
                    int i192 = 23;
                    oVar.e = new o0.a(i192, "crash_marker", cVar6);
                    oVar.d = new o0.a(i192, "initialization_marker", cVar6);
                    p3 p3Var2 = new p3(str162, cVar6, sVar);
                    x9.e eVar22 = new x9.e(cVar6);
                    ea.a[] aVarArr2 = new ea.a[1];
                    aVarArr2[0] = new na.d();
                    y yVar2 = new y(aVarArr2);
                    ((p) oVar.o.b).a(new t0.a(1));
                    w9.a aVar72 = aVar;
                    com.google.firebase.messaging.n k102 = com.google.firebase.messaging.n.k(oVar.a, oVar.g, oVar.h, aVar72, eVar22, p3Var2, yVar2, bVar2, oVar.c, oVar.m);
                    bVar = bVar2;
                    oVar.f = new w9.m(oVar.a, oVar.l, oVar.g, oVar.b, oVar.h, oVar.e, aVar72, p3Var2, eVar22, k102, oVar.n, oVar.j, oVar.m);
                    o0.a aVar82 = oVar.d;
                    ba.c cVar72 = (ba.c) aVar82.c;
                    String str172 = (String) aVar82.b;
                    cVar72.getClass();
                    exists = new File(cVar72.b, str172).exists();
                    z11 = true;
                    z11 = true;
                    Boolean.TRUE.equals((Boolean) w.a(sVar.h(new w9.n(oVar, z11 ? 1 : 0))));
                    w9.m mVar22 = oVar.f;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                    mVar22.e.h(new u4.g(2, mVar22, str162));
                    q qVar2 = new q(new mg.n(mVar22, 22), bVar, defaultUncaughtExceptionHandler2, mVar22.j);
                    mVar22.n = qVar2;
                    Thread.setDefaultUncaughtExceptionHandler(qVar2);
                    if (exists) {
                    }
                    if (Log.isLoggable(str2, 3)) {
                    }
                    Tasks.call(a12, new s9.b(z11, oVar, bVar));
                    return new s9.c(oVar);
                } catch (PackageManager.NameNotFoundException e16) {
                    Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e16);
                    return null;
                }
        }
    }

    @Override // s5.e
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                aa.a a2 = l5.i.a();
                a2.B(rawQuery.getString(1));
                a2.d = v5.a.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                a2.c = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a2.f());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(b2 b2Var, int i10) {
        switch (this.a) {
            case 27:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // pa.a
    public void h(pa.b bVar) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
        }
        bVar.get().getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i10 = o2.r0;
    }

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
    }
}
