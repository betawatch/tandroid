package s0;

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
import b2.p1;
import c3.q;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import e9.n0;
import e9.s;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import m.s3;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.md0;
import r9.n;
import r9.p;
import si.o0;
import u2.c1;
import u2.f0;
import x9.m;
import x9.o;
import x9.r;
import x9.u;
import x9.v;
import x9.w;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements s5.e, r9.d, z1, qa.a, d9.k, e2.j, md0 {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // e2.j
    public void accept(Object obj) {
        ((c1) obj).b.release();
    }

    @Override // s5.e
    public Object apply(Object obj) {
        switch (this.a) {
            case 6:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        androidx.biometric.e a2 = l5.i.a();
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
            case 19:
                return ((q) obj).b().getClass().getSimpleName();
            case 20:
                return n0.u(s.x(((f0) obj).r().b, new b(22)));
            default:
                return Integer.valueOf(((p1) obj).c);
        }
    }

    @Override // org.telegram.ui.Components.md0
    public String e(int i10) {
        switch (this.a) {
            case 25:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(c2 c2Var, int i10) {
        switch (this.a) {
            case 11:
                c2Var.dismiss();
                break;
            case 12:
                c2Var.dismiss();
                break;
            case 24:
                break;
            case 27:
                c2Var.dismiss();
                break;
            default:
                c2Var.dismiss();
                break;
        }
    }

    @Override // qa.a
    public void h(qa.b bVar) {
        switch (this.a) {
            case 17:
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

    /* JADX WARN: Can't wrap try/catch for region: R(39:45|(1:47)|(1:49)(1:154)|50|(4:53|(2:55|56)(1:58)|57|51)|59|60|(1:62)|63|64|(1:66)(1:153)|(1:68)(1:152)|69|(5:139|(1:141)|142|3af|147)(1:73)|74|(21:78|(1:80)(2:135|(1:137))|81|82|(2:84|(1:86))(2:131|(2:133|134))|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|(4:118|(1:120)|114|115)(6:109|(1:111)|112|113|114|115))|138|82|(0)(0)|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|(2:103|105)|118|(0)|114|115) */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x056a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x056b, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0571, code lost:
    
        android.util.Log.e(r7, "Crashlytics was not started due to an exception during initialization", r0);
        r3.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x055a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x056e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x056f, code lost:
    
        r26 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0421  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // r9.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j2(z5 z5Var) {
        String str;
        int i10;
        int i11;
        int i12;
        ?? r22;
        Task task;
        Task onSuccessTask;
        x9.a aVar;
        boolean z10;
        String str2;
        boolean z11;
        boolean exists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        ea.a c10;
        String str3;
        switch (this.a) {
            case 7:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 8:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 9:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 10:
                n nVar = ExecutorsRegistrar.a;
                return s9.k.a;
            default:
                int i13 = CrashlyticsRegistrar.a;
                l9.h hVar = (l9.h) z5Var.a(l9.h.class);
                p q6 = z5Var.q(u9.a.class);
                p q10 = z5Var.q(m9.a.class);
                ra.d dVar = (ra.d) z5Var.a(ra.d.class);
                p q11 = z5Var.q(za.a.class);
                hVar.a();
                Context context = hVar.a;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 18.6.0 for " + packageName, null);
                ca.c cVar = new ca.c(context);
                r rVar = new r(hVar);
                u uVar = new u(context, packageName, dVar, rVar);
                u9.a aVar2 = new u9.a(q6);
                androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(q10);
                ExecutorService a2 = x9.h.a("Crashlytics Exception Handler");
                x9.j jVar = new x9.j(rVar, cVar);
                bb.c cVar2 = bb.c.a;
                bb.d dVar2 = bb.d.a;
                bb.c cVar3 = bb.c.a;
                bb.a a10 = bb.c.a(dVar2);
                if (a10.b != null) {
                    Log.d("SessionsDependencies", "Subscriber " + dVar2 + " already registered.");
                    str = null;
                } else {
                    a10.b = jVar;
                    Log.d("SessionsDependencies", "Subscriber " + dVar2 + " registered.");
                    str = null;
                    a10.a.e(null);
                }
                te.b bVar = new te.b(q11, 1);
                t9.a aVar3 = new t9.a(fVar);
                t9.a aVar4 = new t9.a(fVar);
                String str4 = str;
                o oVar = new o(hVar, uVar, aVar2, rVar, aVar3, aVar4, cVar, a2, jVar, bVar);
                hVar.a();
                String str5 = hVar.c.b;
                int e = x9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (e == 0) {
                    e = x9.h.e(context, "com.crashlytics.android.build_id", "string");
                }
                String string = e != 0 ? context.getResources().getString(e) : str4;
                ArrayList arrayList = new ArrayList();
                int e7 = x9.h.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int e10 = x9.h.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int e11 = x9.h.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (e7 == 0 || e10 == 0 || e11 == 0) {
                    i10 = 2;
                    i11 = 0;
                    i12 = 3;
                    String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(e7), Integer.valueOf(e10), Integer.valueOf(e11));
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        r22 = 0;
                        Log.d("FirebaseCrashlytics", format, null);
                    } else {
                        r22 = 0;
                    }
                } else {
                    i10 = 2;
                    String[] stringArray = context.getResources().getStringArray(e7);
                    String[] stringArray2 = context.getResources().getStringArray(e10);
                    String[] stringArray3 = context.getResources().getStringArray(e11);
                    i11 = 0;
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i14 = 0;
                        str3 = str4;
                        while (i14 < stringArray3.length) {
                            int i15 = i14;
                            arrayList.add(new x9.e(stringArray[i14], stringArray2[i14], stringArray3[i15]));
                            i14 = i15 + 1;
                            str3 = null;
                        }
                    } else {
                        String format2 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", format2, null);
                        }
                        str3 = null;
                    }
                    i12 = 3;
                    r22 = str3;
                }
                String h = o0.h("Mapping file ID is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", i12)) {
                    Log.d("FirebaseCrashlytics", h, r22);
                }
                int size = arrayList.size();
                int i16 = i11;
                while (i16 < size) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    x9.e eVar = (x9.e) obj;
                    String str6 = eVar.a;
                    String str7 = eVar.b;
                    String str8 = eVar.c;
                    int i17 = size;
                    StringBuilder w9 = a1.g.w("Build id for ", str6, " on ", str7, ": ");
                    w9.append(str8);
                    String sb2 = w9.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", sb2, null);
                    }
                    size = i17;
                }
                int i18 = i10;
                try {
                    x9.a a11 = x9.a.a(context, uVar, str5, string, arrayList, new mi.q(context));
                    String str9 = "Installer package name is: " + a11.d;
                    if (Log.isLoggable("FirebaseCrashlytics", i18)) {
                        Log.v("FirebaseCrashlytics", str9, null);
                    }
                    ExecutorService a12 = x9.h.a("com.google.firebase.crashlytics.startup");
                    new sb.a(3);
                    String str10 = a11.f;
                    String str11 = a11.g;
                    String c11 = uVar.c();
                    t7.u uVar2 = new t7.u(26);
                    a4.l lVar = new a4.l(uVar2, 15);
                    qb.c cVar4 = new qb.c(cVar);
                    Locale locale = Locale.US;
                    String p5 = a1.g.p("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str5, "/settings");
                    d9.l lVar2 = new d9.l();
                    if (p5 == null) {
                        throw new IllegalArgumentException("url must not be null.");
                    }
                    lVar2.a = p5;
                    String str12 = Build.MANUFACTURER;
                    String str13 = u.h;
                    String D = a1.g.D(str12.replaceAll(str13, ""), "/", Build.MODEL.replaceAll(str13, ""));
                    String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str13, "");
                    String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str13, "");
                    int e12 = x9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (e12 == 0) {
                        e12 = x9.h.e(context, "com.crashlytics.android.build_id", "string");
                    }
                    String[] strArr = {e12 != 0 ? context.getResources().getString(e12) : null, str5, str11, str10};
                    ArrayList arrayList2 = new ArrayList();
                    int i19 = i11;
                    while (i19 < 4) {
                        String str14 = strArr[i19];
                        String[] strArr2 = strArr;
                        if (str14 != null) {
                            arrayList2.add(str14.replace("-", "").toLowerCase(Locale.US));
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
                    ea.d dVar3 = new ea.d(str5, D, replaceAll, replaceAll2, uVar, sb4.length() > 0 ? x9.h.i(sb4) : null, str11, str10, o0.b(c11 != null ? 4 : 1));
                    ea.b bVar2 = new ea.b();
                    AtomicReference atomicReference = new AtomicReference();
                    bVar2.h = atomicReference;
                    bVar2.i = new AtomicReference(new TaskCompletionSource());
                    bVar2.a = context;
                    bVar2.b = dVar3;
                    bVar2.d = uVar2;
                    bVar2.c = lVar;
                    bVar2.e = cVar4;
                    bVar2.f = lVar2;
                    bVar2.g = rVar;
                    atomicReference.set(t7.u.F0(uVar2));
                    AtomicReference atomicReference2 = (AtomicReference) bVar2.i;
                    AtomicReference atomicReference3 = (AtomicReference) bVar2.h;
                    if (!((Context) bVar2.a).getSharedPreferences("com.google.firebase.crashlytics", i11).getString("existing_instance_identifier", "").equals(((ea.d) bVar2.b).f) || (c10 = bVar2.c(1)) == null) {
                        ea.a c12 = bVar2.c(3);
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
                        onSuccessTask = taskCompletionSource.getTask().onSuccessTask(a12, new a6.i(bVar2, 17));
                    } else {
                        atomicReference3.set(c10);
                        ((TaskCompletionSource) atomicReference2.get()).trySetResult(c10);
                        onSuccessTask = Tasks.forResult(null);
                    }
                    int i21 = 23;
                    onSuccessTask.continueWith(a12, new pb.a(i21));
                    com.google.firebase.messaging.r rVar3 = oVar.l;
                    ca.c cVar5 = oVar.h;
                    Context context2 = oVar.a;
                    if (context2 != null && (resources = context2.getResources()) != null) {
                        int e13 = x9.h.e(context2, "com.crashlytics.RequireBuildId", "bool");
                        if (e13 > 0) {
                            z10 = resources.getBoolean(e13);
                        } else {
                            int e14 = x9.h.e(context2, "com.crashlytics.RequireBuildId", "string");
                            if (e14 > 0) {
                                z10 = Boolean.parseBoolean(context2.getString(e14));
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
                        new x9.f(oVar.g);
                        String str16 = x9.f.b;
                        int i22 = 28;
                        oVar.e = new mi.q(i22, "crash_marker", cVar5);
                        oVar.d = new mi.q(i22, "initialization_marker", cVar5);
                        s3 s3Var = new s3(str16, cVar5, rVar3);
                        y9.e eVar2 = new y9.e(cVar5);
                        fa.a[] aVarArr = new fa.a[1];
                        boolean z12 = false;
                        aVarArr[0] = new sb.a(8);
                        qf.b bVar3 = new qf.b(aVarArr);
                        ((p) oVar.o.b).a(new b(i21));
                        x9.a aVar5 = aVar;
                        com.google.firebase.messaging.l j10 = com.google.firebase.messaging.l.j(oVar.a, oVar.g, oVar.h, aVar5, eVar2, s3Var, bVar3, bVar2, oVar.c, oVar.m);
                        bVar2 = bVar2;
                        oVar.f = new m(oVar.a, oVar.l, oVar.g, oVar.b, oVar.h, oVar.e, aVar5, s3Var, eVar2, j10, oVar.n, oVar.j, oVar.m);
                        mi.q qVar = oVar.d;
                        ca.c cVar6 = (ca.c) qVar.c;
                        String str17 = (String) qVar.b;
                        cVar6.getClass();
                        exists = new File(cVar6.b, str17).exists();
                        z11 = true;
                        z11 = true;
                        Boolean.TRUE.equals((Boolean) w.a(rVar3.v(new x9.n(oVar, z11 ? 1 : 0))));
                        m mVar = oVar.f;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        mVar.e.v(new u4.f(2, mVar, str16));
                        x9.q qVar2 = new x9.q(new le.b(mVar, 29), bVar2, defaultUncaughtExceptionHandler, mVar.j);
                        mVar.n = qVar2;
                        Thread.setDefaultUncaughtExceptionHandler(qVar2);
                        if (exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                            if (Log.isLoggable(str2, 3)) {
                                Log.d(str2, "Successfully configured exception handler.", null);
                            }
                            Tasks.call(a12, new t9.b(z11, oVar, bVar2));
                            return new t9.c(oVar);
                        }
                        if (Log.isLoggable(str2, 3)) {
                            Log.d(str2, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                        }
                        oVar.b(bVar2);
                        z11 = z12;
                        Tasks.call(a12, new t9.b(z11, oVar, bVar2));
                        return new t9.c(oVar);
                    }
                    aVar = a11;
                    z10 = true;
                    String str152 = aVar.b;
                    if (z10) {
                    }
                    new x9.f(oVar.g);
                    String str162 = x9.f.b;
                    int i222 = 28;
                    oVar.e = new mi.q(i222, "crash_marker", cVar5);
                    oVar.d = new mi.q(i222, "initialization_marker", cVar5);
                    s3 s3Var2 = new s3(str162, cVar5, rVar3);
                    y9.e eVar22 = new y9.e(cVar5);
                    fa.a[] aVarArr2 = new fa.a[1];
                    boolean z122 = false;
                    aVarArr2[0] = new sb.a(8);
                    qf.b bVar32 = new qf.b(aVarArr2);
                    ((p) oVar.o.b).a(new b(i21));
                    x9.a aVar52 = aVar;
                    com.google.firebase.messaging.l j102 = com.google.firebase.messaging.l.j(oVar.a, oVar.g, oVar.h, aVar52, eVar22, s3Var2, bVar32, bVar2, oVar.c, oVar.m);
                    bVar2 = bVar2;
                    oVar.f = new m(oVar.a, oVar.l, oVar.g, oVar.b, oVar.h, oVar.e, aVar52, s3Var2, eVar22, j102, oVar.n, oVar.j, oVar.m);
                    mi.q qVar3 = oVar.d;
                    ca.c cVar62 = (ca.c) qVar3.c;
                    String str172 = (String) qVar3.b;
                    cVar62.getClass();
                    exists = new File(cVar62.b, str172).exists();
                    z11 = true;
                    z11 = true;
                    Boolean.TRUE.equals((Boolean) w.a(rVar3.v(new x9.n(oVar, z11 ? 1 : 0))));
                    m mVar2 = oVar.f;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                    mVar2.e.v(new u4.f(2, mVar2, str162));
                    x9.q qVar22 = new x9.q(new le.b(mVar2, 29), bVar2, defaultUncaughtExceptionHandler2, mVar2.j);
                    mVar2.n = qVar22;
                    Thread.setDefaultUncaughtExceptionHandler(qVar22);
                    if (exists) {
                    }
                    if (Log.isLoggable(str2, 3)) {
                    }
                    Tasks.call(a12, new t9.b(z11, oVar, bVar2));
                    return new t9.c(oVar);
                } catch (PackageManager.NameNotFoundException e15) {
                    Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e15);
                    return null;
                }
        }
    }

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
    }

    private final void b(c2 c2Var, int i10) {
    }
}
