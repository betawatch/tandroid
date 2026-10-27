package s0;

import a8.me;
import aa.b0;
import aa.m0;
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
import b2.q1;
import c3.o;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import f9.i0;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import li.h5;
import m.r3;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.b10;
import s9.q;
import sg.o2;
import u2.a1;
import u2.e0;
import y9.n;
import y9.p;
import y9.r;
import y9.s;
import y9.v;
import y9.w;
import y9.x;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements s9.e, ra.a, s9.d, OnFailureListener, t5.e, b2, e9.k, e2.j, q3.g {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // s9.e
    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // e2.j
    public void accept(Object obj) {
        ((a1) obj).b.release();
    }

    @Override // t5.e
    public Object apply(Object obj) {
        switch (this.a) {
            case 10:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        k6.c a2 = m5.i.a();
                        a2.H(rawQuery.getString(1));
                        a2.d = w5.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        a2.b = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(a2.j());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 17:
                return ((o) obj).b().getClass().getSimpleName();
            case 18:
                return i0.u(f9.o.x(((e0) obj).p().b, new b(20)));
            default:
                return Integer.valueOf(((q1) obj).c);
        }
    }

    @Override // q3.g
    public boolean c(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(43:46|(1:48)|(1:50)(1:165)|51|(4:54|(2:56|57)(1:59)|58|52)|60|61|(1:63)|64|65|(1:67)(1:164)|(1:69)(1:163)|70|(5:150|(1:152)|153|3b3|158)(1:74)|75|(25:79|(1:81)(2:146|(1:148))|82|83|(2:85|(1:87))(2:142|(2:144|145))|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(4:123|(1:125)|119|120)(6:114|(1:116)|117|118|119|120))|149|83|(0)(0)|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(2:108|110)|123|(0)|119|120) */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x055a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0579, code lost:
    
        android.util.Log.e(r5, "Crashlytics was not started due to an exception during initialization", r0);
        r3.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x056a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x056b, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x056e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x056f, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0571, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0572, code lost:
    
        r27 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0575, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0576, code lost:
    
        r1 = r4;
        r27 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0425  */
    @Override // s9.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d1(me meVar) {
        sa.d lambda$getComponents$0;
        String str;
        v vVar;
        int i10;
        int i11;
        int i12;
        Throwable th2;
        Task task;
        Task onSuccessTask;
        y9.a aVar;
        boolean z10;
        String str2;
        b0 b0Var;
        boolean z11;
        boolean exists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        fa.a c10;
        switch (this.a) {
            case 6:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(meVar);
                return lambda$getComponents$0;
            case 7:
            case 8:
            case 9:
            case 10:
            default:
                int i13 = CrashlyticsRegistrar.a;
                m9.h hVar = (m9.h) meVar.a(m9.h.class);
                q u10 = meVar.u(v9.a.class);
                q u11 = meVar.u(n9.a.class);
                sa.d dVar = (sa.d) meVar.a(sa.d.class);
                q u12 = meVar.u(ab.a.class);
                hVar.a();
                Context context = hVar.a;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 18.6.0 for " + packageName, null);
                da.c cVar = new da.c(context);
                s sVar = new s(hVar);
                v vVar2 = new v(context, packageName, dVar, sVar);
                v9.a aVar2 = new v9.a(u10);
                androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(u11);
                ExecutorService a2 = y9.h.a("Crashlytics Exception Handler");
                y9.j jVar = new y9.j(sVar, cVar);
                cb.c cVar2 = cb.c.a;
                cb.d dVar2 = cb.d.a;
                cb.c cVar3 = cb.c.a;
                cb.a a10 = cb.c.a(dVar2);
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
                v vVar3 = vVar2;
                p pVar = new p(hVar, vVar3, aVar2, sVar, new u9.a(fVar), new u9.a(fVar), cVar, a2, jVar, new t6.f(u12));
                hVar.a();
                String str4 = hVar.c.b;
                int e = y9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (e == 0) {
                    e = y9.h.e(context, "com.crashlytics.android.build_id", "string");
                }
                String string = e != 0 ? context.getResources().getString(e) : str3;
                ArrayList arrayList = new ArrayList();
                int e10 = y9.h.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int e11 = y9.h.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int e12 = y9.h.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (e10 == 0 || e11 == 0 || e12 == 0) {
                    vVar = vVar3;
                    i10 = 2;
                    i11 = 0;
                    i12 = 3;
                    String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(e10), Integer.valueOf(e11), Integer.valueOf(e12));
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        th2 = null;
                        Log.d("FirebaseCrashlytics", format, null);
                    } else {
                        th2 = null;
                    }
                } else {
                    i10 = 2;
                    String[] stringArray = context.getResources().getStringArray(e10);
                    String[] stringArray2 = context.getResources().getStringArray(e11);
                    String[] stringArray3 = context.getResources().getStringArray(e12);
                    i11 = 0;
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i14 = 0;
                        while (i14 < stringArray3.length) {
                            int i15 = i14;
                            arrayList.add(new y9.e(stringArray[i14], stringArray2[i15], stringArray3[i15]));
                            i14 = i15 + 1;
                            vVar3 = vVar3;
                        }
                        vVar = vVar3;
                    } else {
                        vVar = vVar3;
                        String format2 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", format2, null);
                        }
                    }
                    th2 = null;
                    i12 = 3;
                }
                String j10 = b10.j("Mapping file ID is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", i12)) {
                    Log.d("FirebaseCrashlytics", j10, th2);
                }
                int size = arrayList.size();
                int i16 = i11;
                while (i16 < size) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    y9.e eVar = (y9.e) obj;
                    String str5 = eVar.a;
                    String str6 = eVar.b;
                    String str7 = eVar.c;
                    int i17 = size;
                    StringBuilder w10 = a1.g.w("Build id for ", str5, " on ", str6, ": ");
                    w10.append(str7);
                    String sb2 = w10.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", sb2, null);
                    }
                    size = i17;
                }
                int i18 = i10;
                v vVar4 = vVar;
                try {
                    y9.a a11 = y9.a.a(context, vVar4, str4, string, arrayList, new m4.c(context, 23));
                    String str8 = "Installer package name is: " + a11.d;
                    if (Log.isLoggable("FirebaseCrashlytics", i18)) {
                        Log.v("FirebaseCrashlytics", str8, null);
                    }
                    ExecutorService a12 = y9.h.a("com.google.firebase.crashlytics.startup");
                    new sb.b(4);
                    String str9 = a11.f;
                    String str10 = a11.g;
                    String c11 = vVar4.c();
                    sb.b bVar = new sb.b(27);
                    b6.i iVar = new b6.i(bVar, 19);
                    a4.l lVar = new a4.l(cVar);
                    Locale locale = Locale.US;
                    String p10 = a1.g.p("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str4, "/settings");
                    d5.j jVar2 = new d5.j();
                    if (p10 == null) {
                        throw new IllegalArgumentException("url must not be null.");
                    }
                    jVar2.a = p10;
                    String str11 = Build.MANUFACTURER;
                    String str12 = v.h;
                    String D = a1.g.D(str11.replaceAll(str12, ""), "/", Build.MODEL.replaceAll(str12, ""));
                    String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str12, "");
                    String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str12, "");
                    int e13 = y9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (e13 == 0) {
                        e13 = y9.h.e(context, "com.crashlytics.android.build_id", "string");
                    }
                    String[] strArr = {e13 != 0 ? context.getResources().getString(e13) : null, str4, str10, str9};
                    ArrayList arrayList2 = new ArrayList();
                    int i19 = i11;
                    while (i19 < 4) {
                        String str13 = strArr[i19];
                        String[] strArr2 = strArr;
                        if (str13 != null) {
                            arrayList2.add(str13.replace("-", "").toLowerCase(Locale.US));
                        }
                        i19++;
                        strArr = strArr2;
                    }
                    Collections.sort(arrayList2);
                    StringBuilder sb3 = new StringBuilder();
                    int size2 = arrayList2.size();
                    int i20 = i11;
                    while (i20 < size2) {
                        Object obj2 = arrayList2.get(i20);
                        i20++;
                        sb3.append((String) obj2);
                        arrayList2 = arrayList2;
                    }
                    String sb4 = sb3.toString();
                    fa.c cVar4 = new fa.c(str4, D, replaceAll, replaceAll2, vVar4, sb4.length() > 0 ? y9.h.i(sb4) : null, str10, str9, b10.d(c11 != null ? 4 : 1));
                    b0 b0Var2 = new b0();
                    AtomicReference atomicReference = new AtomicReference();
                    b0Var2.h = atomicReference;
                    b0Var2.i = new AtomicReference(new TaskCompletionSource());
                    b0Var2.a = context;
                    b0Var2.c = cVar4;
                    b0Var2.b = bVar;
                    b0Var2.f = iVar;
                    b0Var2.g = lVar;
                    b0Var2.d = jVar2;
                    b0Var2.e = sVar;
                    atomicReference.set(pa.d.e(bVar));
                    AtomicReference atomicReference2 = (AtomicReference) b0Var2.i;
                    AtomicReference atomicReference3 = (AtomicReference) b0Var2.h;
                    if (!((Context) b0Var2.a).getSharedPreferences("com.google.firebase.crashlytics", i11).getString("existing_instance_identifier", "").equals(((fa.c) b0Var2.c).f) || (c10 = b0Var2.c(1)) == null) {
                        fa.a c12 = b0Var2.c(3);
                        if (c12 != null) {
                            atomicReference3.set(c12);
                            ((TaskCompletionSource) atomicReference2.get()).trySetResult(c12);
                        }
                        s sVar2 = (s) b0Var2.e;
                        Task task2 = sVar2.h.getTask();
                        synchronized (sVar2.c) {
                            task = sVar2.d.getTask();
                        }
                        ExecutorService executorService = x.a;
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        w wVar = new w(0, taskCompletionSource);
                        task2.continueWith(a12, wVar);
                        task.continueWith(a12, wVar);
                        onSuccessTask = taskCompletionSource.getTask().onSuccessTask(a12, new za.c(b0Var2, 20));
                    } else {
                        atomicReference3.set(c10);
                        ((TaskCompletionSource) atomicReference2.get()).trySetResult(c10);
                        onSuccessTask = Tasks.forResult(null);
                    }
                    onSuccessTask.continueWith(a12, new tb.a(23));
                    com.google.firebase.messaging.q qVar = pVar.l;
                    da.c cVar5 = pVar.h;
                    Context context2 = pVar.a;
                    if (context2 != null && (resources = context2.getResources()) != null) {
                        int e14 = y9.h.e(context2, "com.crashlytics.RequireBuildId", "bool");
                        if (e14 > 0) {
                            z10 = resources.getBoolean(e14);
                        } else {
                            int e15 = y9.h.e(context2, "com.crashlytics.RequireBuildId", "string");
                            if (e15 > 0) {
                                z10 = Boolean.parseBoolean(context2.getString(e15));
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
                        new y9.f(pVar.g);
                        String str15 = y9.f.b;
                        int i21 = 29;
                        pVar.e = new m4.c(i21, "crash_marker", cVar5);
                        pVar.d = new m4.c(i21, "initialization_marker", cVar5);
                        r3 r3Var = new r3(str15, cVar5, qVar);
                        z9.e eVar2 = new z9.e(cVar5);
                        ga.a[] aVarArr = new ga.a[1];
                        boolean z12 = false;
                        aVarArr[0] = new pa.d();
                        rf.b bVar2 = new rf.b(aVarArr);
                        ((q) pVar.o.a).a(new b(i21));
                        y9.a aVar3 = aVar;
                        m0 j11 = m0.j(pVar.a, pVar.g, pVar.h, aVar3, eVar2, r3Var, bVar2, b0Var2, pVar.c, pVar.m);
                        b0Var = b0Var2;
                        pVar.f = new n(pVar.a, pVar.l, pVar.g, pVar.b, pVar.h, pVar.e, aVar3, r3Var, eVar2, j11, pVar.n, pVar.j, pVar.m);
                        m4.c cVar6 = pVar.d;
                        da.c cVar7 = (da.c) cVar6.c;
                        String str16 = (String) cVar6.b;
                        cVar7.getClass();
                        exists = new File(cVar7.b, str16).exists();
                        z11 = true;
                        z11 = true;
                        Boolean.TRUE.equals((Boolean) x.a(qVar.F(new y9.o(pVar, z11 ? 1 : 0))));
                        n nVar = pVar.f;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        nVar.e.F(new u4.f(2, nVar, str15));
                        r rVar = new r(new h5(nVar), b0Var, defaultUncaughtExceptionHandler, nVar.j);
                        nVar.n = rVar;
                        Thread.setDefaultUncaughtExceptionHandler(rVar);
                        if (exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                            if (Log.isLoggable(str2, 3)) {
                                Log.d(str2, "Successfully configured exception handler.", null);
                            }
                            Tasks.call(a12, new u9.b(z11, pVar, b0Var));
                            return new u9.c(pVar);
                        }
                        if (Log.isLoggable(str2, 3)) {
                            Log.d(str2, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                        }
                        pVar.b(b0Var);
                        z11 = z12;
                        Tasks.call(a12, new u9.b(z11, pVar, b0Var));
                        return new u9.c(pVar);
                    }
                    aVar = a11;
                    z10 = true;
                    String str142 = aVar.b;
                    if (z10) {
                    }
                    new y9.f(pVar.g);
                    String str152 = y9.f.b;
                    int i212 = 29;
                    pVar.e = new m4.c(i212, "crash_marker", cVar5);
                    pVar.d = new m4.c(i212, "initialization_marker", cVar5);
                    r3 r3Var2 = new r3(str152, cVar5, qVar);
                    z9.e eVar22 = new z9.e(cVar5);
                    ga.a[] aVarArr2 = new ga.a[1];
                    boolean z122 = false;
                    aVarArr2[0] = new pa.d();
                    rf.b bVar22 = new rf.b(aVarArr2);
                    ((q) pVar.o.a).a(new b(i212));
                    y9.a aVar32 = aVar;
                    m0 j112 = m0.j(pVar.a, pVar.g, pVar.h, aVar32, eVar22, r3Var2, bVar22, b0Var2, pVar.c, pVar.m);
                    b0Var = b0Var2;
                    pVar.f = new n(pVar.a, pVar.l, pVar.g, pVar.b, pVar.h, pVar.e, aVar32, r3Var2, eVar22, j112, pVar.n, pVar.j, pVar.m);
                    m4.c cVar62 = pVar.d;
                    da.c cVar72 = (da.c) cVar62.c;
                    String str162 = (String) cVar62.b;
                    cVar72.getClass();
                    exists = new File(cVar72.b, str162).exists();
                    z11 = true;
                    z11 = true;
                    Boolean.TRUE.equals((Boolean) x.a(qVar.F(new y9.o(pVar, z11 ? 1 : 0))));
                    n nVar2 = pVar.f;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                    nVar2.e.F(new u4.f(2, nVar2, str152));
                    r rVar2 = new r(new h5(nVar2), b0Var, defaultUncaughtExceptionHandler2, nVar2.j);
                    nVar2.n = rVar2;
                    Thread.setDefaultUncaughtExceptionHandler(rVar2);
                    if (exists) {
                    }
                    if (Log.isLoggable(str2, 3)) {
                    }
                    Tasks.call(a12, new u9.b(z11, pVar, b0Var));
                    return new u9.c(pVar);
                } catch (PackageManager.NameNotFoundException e16) {
                    Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e16);
                    return null;
                }
            case 11:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 12:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 13:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 14:
                s9.o oVar = ExecutorsRegistrar.a;
                return t9.k.a;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(e2 e2Var, int i10) {
        switch (this.a) {
            case 15:
                e2Var.dismiss();
                break;
            default:
                e2Var.dismiss();
                break;
        }
    }

    @Override // ra.a
    public void i(ra.b bVar) {
        switch (this.a) {
            case 5:
                return;
            case 21:
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
                }
                bVar.get().getClass();
                throw new ClassCastException();
            default:
                bVar.get().getClass();
                throw new ClassCastException();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i10 = o2.r0;
    }

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
    }

    private final void b(ra.b bVar) {
    }
}
