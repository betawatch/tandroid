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
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.messaging.t;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import m.p3;
import n4.y;
import n7.a1;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Cells.ia;
import org.telegram.ui.Cells.q3;
import q9.n;
import q9.p;
import w9.o;
import w9.q;
import w9.r;
import w9.u;
import w9.w;
import w9.x;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements q9.d, a2, s5.e, pa.a {
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:46|(1:48)|(1:50)(1:155)|51|(4:54|(2:56|57)(1:59)|58|52)|60|61|(1:63)|64|65|(1:67)(1:154)|(1:69)(1:153)|70|(5:140|(1:142)|143|3ac|148)(1:74)|75|(21:79|(1:81)(2:136|(1:138))|82|83|(2:85|(1:87))(2:132|(2:134|135))|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(4:119|(1:121)|115|116)(6:110|(1:112)|113|114|115|116))|139|83|(0)(0)|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(2:104|106)|119|(0)|115|116) */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0565, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0566, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x056c, code lost:
    
        android.util.Log.e(r6, "Crashlytics was not started due to an exception during initialization", r0);
        r3.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0555, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0569, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x041e  */
    @Override // q9.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object G(cf.c cVar) {
        String str;
        u uVar;
        int i10;
        Throwable th2;
        Task task;
        Task onSuccessTask;
        w9.a aVar;
        boolean z10;
        String str2;
        boolean z11;
        boolean exists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        da.a c10;
        switch (this.a) {
            case 0:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 2:
                n nVar = ExecutorsRegistrar.a;
                return k.a;
            default:
                int i11 = CrashlyticsRegistrar.a;
                k9.h hVar = (k9.h) cVar.a(k9.h.class);
                p t10 = cVar.t(t9.a.class);
                p t11 = cVar.t(l9.a.class);
                qa.d dVar = (qa.d) cVar.a(qa.d.class);
                p t12 = cVar.t(ya.a.class);
                hVar.a();
                Context context = hVar.a;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 18.6.0 for " + packageName, null);
                ba.c cVar2 = new ba.c(context);
                r rVar = new r(hVar);
                u uVar2 = new u(context, packageName, dVar, rVar);
                t9.a aVar2 = new t9.a(t10);
                androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(t11);
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
                String str3 = str;
                u uVar3 = uVar2;
                o oVar = new o(hVar, uVar3, aVar2, rVar, new s9.a(fVar), new s9.a(fVar), cVar2, a2, jVar, new ka.c(t12, 19));
                hVar.a();
                String str4 = hVar.c.b;
                int e = w9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (e == 0) {
                    e = w9.h.e(context, "com.crashlytics.android.build_id", "string");
                }
                String string = e != 0 ? context.getResources().getString(e) : str3;
                ArrayList arrayList = new ArrayList();
                int e7 = w9.h.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int e10 = w9.h.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int e11 = w9.h.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (e7 == 0 || e10 == 0 || e11 == 0) {
                    uVar = uVar3;
                    i10 = 3;
                    String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(e7), Integer.valueOf(e10), Integer.valueOf(e11));
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        th2 = null;
                        Log.d("FirebaseCrashlytics", format, null);
                    } else {
                        th2 = null;
                    }
                } else {
                    String[] stringArray = context.getResources().getStringArray(e7);
                    String[] stringArray2 = context.getResources().getStringArray(e10);
                    String[] stringArray3 = context.getResources().getStringArray(e11);
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i12 = 0;
                        while (i12 < stringArray3.length) {
                            int i13 = i12;
                            arrayList.add(new w9.e(stringArray[i12], stringArray2[i13], stringArray3[i13]));
                            i12 = i13 + 1;
                            uVar3 = uVar3;
                        }
                        uVar = uVar3;
                    } else {
                        uVar = uVar3;
                        String format2 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", format2, null);
                        }
                    }
                    th2 = null;
                    i10 = 3;
                }
                String i14 = q3.i("Mapping file ID is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", i10)) {
                    Log.d("FirebaseCrashlytics", i14, th2);
                }
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    w9.e eVar = (w9.e) obj;
                    String str5 = eVar.a;
                    String str6 = eVar.b;
                    String str7 = eVar.c;
                    int i16 = size;
                    StringBuilder x10 = a4.a.x("Build id for ", str5, " on ", str6, ": ");
                    x10.append(str7);
                    String sb2 = x10.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", sb2, null);
                    }
                    size = i16;
                }
                u uVar4 = uVar;
                try {
                    w9.a a11 = w9.a.a(context, uVar4, str4, string, arrayList, new a1(context));
                    String str8 = "Installer package name is: " + a11.d;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str8, null);
                    }
                    ExecutorService a12 = w9.h.a("com.google.firebase.crashlytics.startup");
                    new ob.a(1);
                    String str9 = a11.f;
                    String str10 = a11.g;
                    String c11 = uVar4.c();
                    na.d dVar3 = new na.d(25);
                    a6.i iVar = new a6.i(dVar3, 17);
                    m mVar = new m(cVar2);
                    Locale locale = Locale.US;
                    String q6 = a4.a.q("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str4, "/settings");
                    c5.i iVar2 = new c5.i();
                    if (q6 == null) {
                        throw new IllegalArgumentException("url must not be null.");
                    }
                    iVar2.a = q6;
                    String str11 = Build.MANUFACTURER;
                    String str12 = u.h;
                    String D = a4.a.D(str11.replaceAll(str12, ""), "/", Build.MODEL.replaceAll(str12, ""));
                    String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str12, "");
                    String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str12, "");
                    int e12 = w9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (e12 == 0) {
                        e12 = w9.h.e(context, "com.crashlytics.android.build_id", "string");
                    }
                    String[] strArr = {e12 != 0 ? context.getResources().getString(e12) : null, str4, str10, str9};
                    ArrayList arrayList2 = new ArrayList();
                    int i17 = 0;
                    while (i17 < 4) {
                        String str13 = strArr[i17];
                        String[] strArr2 = strArr;
                        if (str13 != null) {
                            arrayList2.add(str13.replace("-", "").toLowerCase(Locale.US));
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
                    da.d dVar4 = new da.d(str4, D, replaceAll, replaceAll2, uVar4, sb4.length() > 0 ? w9.h.i(sb4) : null, str10, str9, w.c.c(c11 != null ? 4 : 1));
                    da.b bVar = new da.b();
                    AtomicReference atomicReference = new AtomicReference();
                    bVar.h = atomicReference;
                    bVar.i = new AtomicReference(new TaskCompletionSource());
                    bVar.a = context;
                    bVar.b = dVar4;
                    bVar.d = dVar3;
                    bVar.c = iVar;
                    bVar.e = mVar;
                    bVar.f = iVar2;
                    bVar.g = rVar;
                    atomicReference.set(ob.a.B2(dVar3));
                    AtomicReference atomicReference2 = (AtomicReference) bVar.i;
                    AtomicReference atomicReference3 = (AtomicReference) bVar.h;
                    if (!((Context) bVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((da.d) bVar.b).f) || (c10 = bVar.c(1)) == null) {
                        da.a c12 = bVar.c(3);
                        if (c12 != null) {
                            atomicReference3.set(c12);
                            ((TaskCompletionSource) atomicReference2.get()).trySetResult(c12);
                        }
                        r rVar2 = (r) bVar.g;
                        Task task2 = rVar2.h.getTask();
                        synchronized (rVar2.c) {
                            task = rVar2.d.getTask();
                        }
                        ExecutorService executorService = x.a;
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        w wVar = new w(0, taskCompletionSource);
                        task2.continueWith(a12, wVar);
                        task.continueWith(a12, wVar);
                        onSuccessTask = taskCompletionSource.getTask().onSuccessTask(a12, new xa.c(bVar, 16));
                    } else {
                        atomicReference3.set(c10);
                        ((TaskCompletionSource) atomicReference2.get()).trySetResult(c10);
                        onSuccessTask = Tasks.forResult(null);
                    }
                    onSuccessTask.continueWith(a12, new na.d(22));
                    t tVar = oVar.l;
                    ba.c cVar5 = oVar.h;
                    Context context2 = oVar.a;
                    if (context2 != null && (resources = context2.getResources()) != null) {
                        int e13 = w9.h.e(context2, "com.crashlytics.RequireBuildId", "bool");
                        if (e13 > 0) {
                            z10 = resources.getBoolean(e13);
                        } else {
                            int e14 = w9.h.e(context2, "com.crashlytics.RequireBuildId", "string");
                            if (e14 > 0) {
                                z10 = Boolean.parseBoolean(context2.getString(e14));
                            }
                        }
                        aVar = a11;
                        String str14 = aVar.b;
                        if (z10) {
                            str2 = "FirebaseCrashlytics";
                            if (Log.isLoggable(str2, 2)) {
                                Log.v(str2, "Configured not to require a build ID.", null);
                            }
                        } else {
                            str2 = "FirebaseCrashlytics";
                            if (TextUtils.isEmpty(str14)) {
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
                        String str15 = w9.f.b;
                        int i19 = 24;
                        oVar.e = new a1(i19, "crash_marker", cVar5);
                        oVar.d = new a1(i19, "initialization_marker", cVar5);
                        p3 p3Var = new p3(str15, cVar5, tVar);
                        x9.e eVar2 = new x9.e(cVar5);
                        ea.a[] aVarArr = new ea.a[1];
                        aVarArr[0] = new t7.u();
                        y yVar = new y(aVarArr);
                        ((p) oVar.o.b).a(new t0.a(1));
                        w9.a aVar3 = aVar;
                        com.google.firebase.messaging.n k10 = com.google.firebase.messaging.n.k(oVar.a, oVar.g, oVar.h, aVar3, eVar2, p3Var, yVar, bVar, oVar.c, oVar.m);
                        bVar = bVar;
                        oVar.f = new w9.m(oVar.a, oVar.l, oVar.g, oVar.b, oVar.h, oVar.e, aVar3, p3Var, eVar2, k10, oVar.n, oVar.j, oVar.m);
                        a1 a1Var = oVar.d;
                        ba.c cVar6 = (ba.c) a1Var.c;
                        String str16 = (String) a1Var.b;
                        cVar6.getClass();
                        exists = new File(cVar6.b, str16).exists();
                        z11 = true;
                        z11 = true;
                        Boolean.TRUE.equals((Boolean) x.a(tVar.k(new w9.n(oVar, z11 ? 1 : 0))));
                        w9.m mVar2 = oVar.f;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        mVar2.e.k(new u4.g(2, mVar2, str15));
                        q qVar = new q(new ia(mVar2, 20), bVar, defaultUncaughtExceptionHandler, mVar2.j);
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
                    String str142 = aVar.b;
                    if (z10) {
                    }
                    new w9.f(oVar.g);
                    String str152 = w9.f.b;
                    int i192 = 24;
                    oVar.e = new a1(i192, "crash_marker", cVar5);
                    oVar.d = new a1(i192, "initialization_marker", cVar5);
                    p3 p3Var2 = new p3(str152, cVar5, tVar);
                    x9.e eVar22 = new x9.e(cVar5);
                    ea.a[] aVarArr2 = new ea.a[1];
                    aVarArr2[0] = new t7.u();
                    y yVar2 = new y(aVarArr2);
                    ((p) oVar.o.b).a(new t0.a(1));
                    w9.a aVar32 = aVar;
                    com.google.firebase.messaging.n k102 = com.google.firebase.messaging.n.k(oVar.a, oVar.g, oVar.h, aVar32, eVar22, p3Var2, yVar2, bVar, oVar.c, oVar.m);
                    bVar = bVar;
                    oVar.f = new w9.m(oVar.a, oVar.l, oVar.g, oVar.b, oVar.h, oVar.e, aVar32, p3Var2, eVar22, k102, oVar.n, oVar.j, oVar.m);
                    a1 a1Var2 = oVar.d;
                    ba.c cVar62 = (ba.c) a1Var2.c;
                    String str162 = (String) a1Var2.b;
                    cVar62.getClass();
                    exists = new File(cVar62.b, str162).exists();
                    z11 = true;
                    z11 = true;
                    Boolean.TRUE.equals((Boolean) x.a(tVar.k(new w9.n(oVar, z11 ? 1 : 0))));
                    w9.m mVar22 = oVar.f;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                    mVar22.e.k(new u4.g(2, mVar22, str152));
                    q qVar2 = new q(new ia(mVar22, 20), bVar, defaultUncaughtExceptionHandler2, mVar22.j);
                    mVar22.n = qVar2;
                    Thread.setDefaultUncaughtExceptionHandler(qVar2);
                    if (exists) {
                    }
                    if (Log.isLoggable(str2, 3)) {
                    }
                    Tasks.call(a12, new s9.b(z11, oVar, bVar));
                    return new s9.c(oVar);
                } catch (PackageManager.NameNotFoundException e15) {
                    Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e15);
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
                a2.u(rawQuery.getString(1));
                a2.d = v5.a.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                a2.c = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a2.e());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 3:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // pa.a
    public void j(pa.b bVar) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
        }
        bVar.get().getClass();
        throw new ClassCastException();
    }

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
    }
}
