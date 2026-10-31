package rh;

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
import android.view.View;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.nu0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x6 implements iu0, s5.e, r9.d, qa.a, NativeInstance.AudioLevelsCallback, mu0, nu0, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;

    public /* synthetic */ x6(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(48:39|40|41|(1:43)|44|(1:46)|(1:48)(1:164)|49|(4:52|(2:54|55)(1:57)|56|50)|58|59|(1:61)|62|63|(1:65)(1:163)|(1:67)(1:162)|68|(5:149|(1:151)|152|3b2|157)(1:72)|73|(25:77|(1:79)(2:145|(1:147))|80|81|(2:83|(1:85))(2:141|(2:143|144))|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|(5:121|(1:123)|124|117|118)(6:112|(1:114)|115|116|117|118))|148|81|(0)(0)|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|(2:106|108)|121|(0)|124|117|118) */
    /* JADX WARN: Can't wrap try/catch for region: R(61:3|(1:5)(1:179)|6|(1:8)|(1:10)(1:178)|11|(3:173|174|(1:176)(1:177))(3:15|(3:169|170|(1:172))(4:19|(2:22|20)|23|24)|25)|26|(1:28)|29|(3:31|(2:33|34)(1:36)|35)|37|38|39|40|41|(1:43)|44|(1:46)|(1:48)(1:164)|49|(4:52|(2:54|55)(1:57)|56|50)|58|59|(1:61)|62|63|(1:65)(1:163)|(1:67)(1:162)|68|(5:149|(1:151)|152|3b2|157)(1:72)|73|(25:77|(1:79)(2:145|(1:147))|80|81|(2:83|(1:85))(2:141|(2:143|144))|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|(5:121|(1:123)|124|117|118)(6:112|(1:114)|115|116|117|118))|148|81|(0)(0)|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|(2:106|108)|121|(0)|124|117|118) */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x055f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x057f, code lost:
    
        android.util.Log.e(r10, "Crashlytics was not started due to an exception during initialization", r0);
        r3.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0570, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0571, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0574, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0575, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0577, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0578, code lost:
    
        r27 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x057b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x057c, code lost:
    
        r1 = r2;
        r27 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x041f  */
    @Override // r9.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object K(bh.d dVar) {
        String str;
        x9.v vVar;
        boolean z10;
        int i10;
        int i11;
        Throwable th2;
        Task task;
        Task onSuccessTask;
        x9.a aVar;
        boolean z11;
        String str2;
        ea.d dVar2;
        boolean z12;
        boolean exists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        ea.c c10;
        switch (this.a) {
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 17:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 18:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 19:
                r9.n nVar = ExecutorsRegistrar.a;
                return s9.k.a;
            default:
                int i12 = CrashlyticsRegistrar.a;
                l9.h hVar = (l9.h) dVar.b(l9.h.class);
                r9.p u10 = dVar.u(u9.a.class);
                r9.p u11 = dVar.u(m9.a.class);
                ra.d dVar3 = (ra.d) dVar.b(ra.d.class);
                r9.p u12 = dVar.u(ab.a.class);
                hVar.a();
                Context context = hVar.a;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 18.6.0 for " + packageName, null);
                ca.c cVar = new ca.c(context);
                x9.s sVar = new x9.s(hVar);
                x9.v vVar2 = new x9.v(context, packageName, dVar3, sVar);
                u9.a aVar2 = new u9.a(u10);
                androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(u11);
                ExecutorService a2 = x9.h.a("Crashlytics Exception Handler");
                x9.j jVar = new x9.j(sVar, cVar);
                cb.c cVar2 = cb.c.a;
                cb.d dVar4 = cb.d.a;
                cb.c cVar3 = cb.c.a;
                cb.a a10 = cb.c.a(dVar4);
                if (a10.b != null) {
                    Log.d("SessionsDependencies", "Subscriber " + dVar4 + " already registered.");
                    str = null;
                } else {
                    a10.b = jVar;
                    Log.d("SessionsDependencies", "Subscriber " + dVar4 + " registered.");
                    str = null;
                    a10.a.e(null);
                }
                String str3 = str;
                x9.v vVar3 = vVar2;
                x9.p pVar = new x9.p(hVar, vVar3, aVar2, sVar, new t9.a(fVar), new t9.a(fVar), cVar, a2, jVar, new n2.u(u12, 27));
                hVar.a();
                String str4 = hVar.c.b;
                int e = x9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (e == 0) {
                    e = x9.h.e(context, "com.crashlytics.android.build_id", "string");
                }
                String string = e != 0 ? context.getResources().getString(e) : str3;
                ArrayList arrayList = new ArrayList();
                int e7 = x9.h.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int e10 = x9.h.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int e11 = x9.h.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (e7 == 0 || e10 == 0 || e11 == 0) {
                    vVar = vVar3;
                    z10 = true;
                    i10 = 0;
                    i11 = 3;
                    String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(e7), Integer.valueOf(e10), Integer.valueOf(e11));
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        th2 = null;
                        Log.d("FirebaseCrashlytics", format, null);
                    } else {
                        th2 = null;
                    }
                } else {
                    z10 = true;
                    String[] stringArray = context.getResources().getStringArray(e7);
                    String[] stringArray2 = context.getResources().getStringArray(e10);
                    String[] stringArray3 = context.getResources().getStringArray(e11);
                    i10 = 0;
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i13 = 0;
                        while (i13 < stringArray3.length) {
                            int i14 = i13;
                            arrayList.add(new x9.e(stringArray[i13], stringArray2[i14], stringArray3[i14]));
                            i13 = i14 + 1;
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
                    i11 = 3;
                }
                String h = sc.e.h("Mapping file ID is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", i11)) {
                    Log.d("FirebaseCrashlytics", h, th2);
                }
                int size = arrayList.size();
                int i15 = i10;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    x9.e eVar = (x9.e) obj;
                    String str5 = eVar.a;
                    String str6 = eVar.b;
                    String str7 = eVar.c;
                    int i16 = size;
                    StringBuilder v = a1.g.v("Build id for ", str5, " on ", str6, ": ");
                    v.append(str7);
                    String sb2 = v.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", sb2, null);
                    }
                    size = i16;
                }
                x9.v vVar4 = vVar;
                try {
                    x9.a a11 = x9.a.a(context, vVar4, str4, string, arrayList, new u9.b(context, i10));
                    String str8 = "Installer package name is: " + a11.d;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str8, null);
                    }
                    ExecutorService a12 = x9.h.a("com.google.firebase.crashlytics.startup");
                    jb.b bVar = new jb.b(3);
                    String str9 = a11.f;
                    String str10 = a11.g;
                    String c11 = vVar4.c();
                    t7.u uVar = new t7.u(26);
                    a4.l lVar = new a4.l(uVar, 14);
                    k6.h hVar2 = new k6.h(cVar);
                    Locale locale = Locale.US;
                    ea.a aVar3 = new ea.a(a1.g.n("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str4, "/settings"), bVar);
                    String str11 = Build.MANUFACTURER;
                    String str12 = x9.v.h;
                    String C = a1.g.C(str11.replaceAll(str12, ""), "/", Build.MODEL.replaceAll(str12, ""));
                    String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str12, "");
                    String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str12, "");
                    int e12 = x9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (e12 == 0) {
                        e12 = x9.h.e(context, "com.crashlytics.android.build_id", "string");
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
                    ea.f fVar2 = new ea.f(str4, C, replaceAll, replaceAll2, vVar4, sb4.length() > 0 ? x9.h.i(sb4) : null, str10, str9, sc.e.c(c11 != null ? 4 : 1));
                    ea.d dVar5 = new ea.d();
                    AtomicReference atomicReference = new AtomicReference();
                    dVar5.h = atomicReference;
                    dVar5.i = new AtomicReference(new TaskCompletionSource());
                    dVar5.a = context;
                    dVar5.b = fVar2;
                    dVar5.d = uVar;
                    dVar5.c = lVar;
                    dVar5.e = hVar2;
                    dVar5.f = aVar3;
                    dVar5.g = sVar;
                    atomicReference.set(kb.a.O1(uVar));
                    AtomicReference atomicReference2 = (AtomicReference) dVar5.i;
                    AtomicReference atomicReference3 = (AtomicReference) dVar5.h;
                    int i19 = 21;
                    if (!((Context) dVar5.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals((String) ((ea.f) dVar5.b).f) || (c10 = dVar5.c(1)) == null) {
                        ea.c c12 = dVar5.c(3);
                        if (c12 != null) {
                            atomicReference3.set(c12);
                            ((TaskCompletionSource) atomicReference2.get()).trySetResult(c12);
                        }
                        x9.s sVar2 = (x9.s) dVar5.g;
                        Task task2 = sVar2.h.getTask();
                        synchronized (sVar2.c) {
                            task = sVar2.d.getTask();
                        }
                        ExecutorService executorService = x9.x.a;
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        x9.w wVar = new x9.w(0, taskCompletionSource);
                        task2.continueWith(a12, wVar);
                        task.continueWith(a12, wVar);
                        onSuccessTask = taskCompletionSource.getTask().onSuccessTask(a12, new a6.i(dVar5, i19));
                    } else {
                        atomicReference3.set(c10);
                        ((TaskCompletionSource) atomicReference2.get()).trySetResult(c10);
                        onSuccessTask = Tasks.forResult(null);
                    }
                    onSuccessTask.continueWith(a12, new jb.b(i19));
                    xa.n nVar2 = pVar.l;
                    ca.c cVar4 = pVar.h;
                    Context context2 = pVar.a;
                    if (context2 != null && (resources = context2.getResources()) != null) {
                        int e13 = x9.h.e(context2, "com.crashlytics.RequireBuildId", "bool");
                        if (e13 > 0) {
                            z11 = resources.getBoolean(e13);
                        } else {
                            int e14 = x9.h.e(context2, "com.crashlytics.RequireBuildId", "string");
                            if (e14 > 0) {
                                z11 = Boolean.parseBoolean(context2.getString(e14));
                            }
                        }
                        aVar = a11;
                        String str14 = aVar.b;
                        if (z11) {
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
                        new x9.f(pVar.g);
                        String str15 = x9.f.b;
                        int i20 = 8;
                        pVar.e = new u9.b(i20, "crash_marker", cVar4);
                        pVar.d = new u9.b(i20, "initialization_marker", cVar4);
                        m.p3 p3Var = new m.p3(str15, cVar4, nVar2);
                        y9.e eVar2 = new y9.e(cVar4);
                        int i21 = 6;
                        fa.a[] aVarArr = new fa.a[1];
                        boolean z13 = false;
                        aVarArr[0] = new jb.b(i21);
                        n4.q qVar = new n4.q();
                        qVar.a = aVarArr;
                        qVar.b = new hb.a(i21);
                        ((r9.p) pVar.o.b).a(new th.m1(5));
                        x9.a aVar4 = aVar;
                        j2.f k10 = j2.f.k(pVar.a, pVar.g, pVar.h, aVar4, eVar2, p3Var, qVar, dVar5, pVar.c, pVar.m);
                        dVar2 = dVar5;
                        pVar.f = new x9.n(pVar.a, pVar.l, pVar.g, pVar.b, pVar.h, pVar.e, aVar4, p3Var, eVar2, k10, pVar.n, pVar.j, pVar.m);
                        u9.b bVar2 = pVar.d;
                        ca.c cVar5 = (ca.c) bVar2.c;
                        String str16 = (String) bVar2.b;
                        cVar5.getClass();
                        exists = new File(cVar5.b, str16).exists();
                        Boolean.TRUE.equals((Boolean) x9.x.a(nVar2.Y(new x9.o(pVar, 1))));
                        x9.n nVar3 = pVar.f;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        nVar3.e.Y(new pb.d(3, nVar3, str15));
                        x9.r rVar = new x9.r(new vh.w3(nVar3), dVar2, defaultUncaughtExceptionHandler, nVar3.j);
                        nVar3.n = rVar;
                        Thread.setDefaultUncaughtExceptionHandler(rVar);
                        if (exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                            if (Log.isLoggable(str2, 3)) {
                                Log.d(str2, "Successfully configured exception handler.", null);
                            }
                            z12 = true;
                            Tasks.call(a12, new t9.b(z12, pVar, dVar2));
                            return new t9.c(pVar);
                        }
                        if (Log.isLoggable(str2, 3)) {
                            Log.d(str2, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                        }
                        pVar.b(dVar2);
                        z12 = z13;
                        Tasks.call(a12, new t9.b(z12, pVar, dVar2));
                        return new t9.c(pVar);
                    }
                    aVar = a11;
                    z11 = true;
                    String str142 = aVar.b;
                    if (z11) {
                    }
                    new x9.f(pVar.g);
                    String str152 = x9.f.b;
                    int i202 = 8;
                    pVar.e = new u9.b(i202, "crash_marker", cVar4);
                    pVar.d = new u9.b(i202, "initialization_marker", cVar4);
                    m.p3 p3Var2 = new m.p3(str152, cVar4, nVar2);
                    y9.e eVar22 = new y9.e(cVar4);
                    int i212 = 6;
                    fa.a[] aVarArr2 = new fa.a[1];
                    boolean z132 = false;
                    aVarArr2[0] = new jb.b(i212);
                    n4.q qVar2 = new n4.q();
                    qVar2.a = aVarArr2;
                    qVar2.b = new hb.a(i212);
                    ((r9.p) pVar.o.b).a(new th.m1(5));
                    x9.a aVar42 = aVar;
                    j2.f k102 = j2.f.k(pVar.a, pVar.g, pVar.h, aVar42, eVar22, p3Var2, qVar2, dVar5, pVar.c, pVar.m);
                    dVar2 = dVar5;
                    pVar.f = new x9.n(pVar.a, pVar.l, pVar.g, pVar.b, pVar.h, pVar.e, aVar42, p3Var2, eVar22, k102, pVar.n, pVar.j, pVar.m);
                    u9.b bVar22 = pVar.d;
                    ca.c cVar52 = (ca.c) bVar22.c;
                    String str162 = (String) bVar22.b;
                    cVar52.getClass();
                    exists = new File(cVar52.b, str162).exists();
                    Boolean.TRUE.equals((Boolean) x9.x.a(nVar2.Y(new x9.o(pVar, 1))));
                    x9.n nVar32 = pVar.f;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                    nVar32.e.Y(new pb.d(3, nVar32, str152));
                    x9.r rVar2 = new x9.r(new vh.w3(nVar32), dVar2, defaultUncaughtExceptionHandler2, nVar32.j);
                    nVar32.n = rVar2;
                    Thread.setDefaultUncaughtExceptionHandler(rVar2);
                    if (exists) {
                    }
                    if (Log.isLoggable(str2, 3)) {
                    }
                    z12 = true;
                    Tasks.call(a12, new t9.b(z12, pVar, dVar2));
                    return new t9.c(pVar);
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
                android.support.v4.media.session.a0 a2 = l5.i.a();
                a2.y(rawQuery.getString(1));
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

    @Override // org.telegram.ui.Components.nu0
    public void b(Object obj, float f7) {
        th.w0 w0Var = (th.w0) obj;
        switch (this.a) {
            case 26:
                WindowManager.LayoutParams layoutParams = w0Var.c;
                w0Var.N = f7;
                layoutParams.x = (int) f7;
                org.telegram.messenger.i0.S3(w0Var.b, w0Var.d, layoutParams);
                break;
            default:
                WindowManager.LayoutParams layoutParams2 = w0Var.c;
                w0Var.O = f7;
                layoutParams2.y = (int) f7;
                org.telegram.messenger.i0.S3(w0Var.b, w0Var.d, layoutParams2);
                break;
        }
    }

    @Override // org.telegram.ui.Components.iu0
    public /* synthetic */ float f(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override // org.telegram.ui.Components.mu0
    public float get(Object obj) {
        th.w0 w0Var = (th.w0) obj;
        switch (this.a) {
            case 25:
                return w0Var.N;
            default:
                return w0Var.O;
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        x1Var.dismiss();
    }

    @Override // qa.a
    public void i(qa.b bVar) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
        }
        bVar.get().getClass();
        throw new ClassCastException();
    }

    @Override // org.telegram.ui.Components.iu0
    public RecyclerView j(View view) {
        return ((e8) view).a;
    }

    @Override // org.telegram.ui.Components.iu0
    public /* synthetic */ void p(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    public /* synthetic */ x6(Object obj, int i10) {
        this.a = i10;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
