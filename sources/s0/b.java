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
import b2.l1;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.messaging.n;
import com.google.firebase.messaging.t;
import e9.i0;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import ki.e0;
import m.p3;
import n4.y;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Components.bd0;
import q9.q;
import t7.u;
import u2.d0;
import v7.j0;
import w9.o;
import w9.p;
import w9.r;
import w9.s;
import w9.v;
import w9.w;
import w9.x;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements s5.f, pa.a, q9.d, a2, bd0, d9.e, q3.g, Continuation {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:43|(1:45)|(1:47)(1:153)|48|(4:51|(2:53|54)(1:56)|55|49)|57|58|(1:60)|61|62|(1:64)(1:152)|(1:66)(1:151)|67|(5:138|(1:140)|141|39f|146)(1:71)|72|(21:76|(1:78)(2:134|(1:136))|79|80|(2:82|(1:84))(2:130|(2:132|133))|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|(5:116|(1:118)|119|112|113)(6:107|(1:109)|110|111|112|113))|137|80|(0)(0)|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|(2:101|103)|116|(0)|119|112|113) */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0561, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0562, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0568, code lost:
    
        android.util.Log.e(r6, "Crashlytics was not started due to an exception during initialization", r0);
        r2.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0550, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0565, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0411  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // q9.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object G(cf.c cVar) {
        ?? r32;
        int i10;
        ?? r12;
        Task task;
        Task onSuccessTask;
        w9.a aVar;
        boolean z10;
        String str;
        boolean z11;
        boolean exists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        da.a c10;
        String str2;
        int i11 = CrashlyticsRegistrar.a;
        k9.h hVar = (k9.h) cVar.b(k9.h.class);
        q u10 = cVar.u(t9.a.class);
        q u11 = cVar.u(l9.a.class);
        qa.d dVar = (qa.d) cVar.b(qa.d.class);
        q u12 = cVar.u(ya.a.class);
        hVar.a();
        Context context = hVar.a;
        String packageName = context.getPackageName();
        Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 18.6.0 for " + packageName, null);
        ba.c cVar2 = new ba.c(context);
        s sVar = new s(hVar);
        v vVar = new v(context, packageName, dVar, sVar);
        t9.a aVar2 = new t9.a(u10);
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(u11);
        ExecutorService a2 = w9.h.a("Crashlytics Exception Handler");
        w9.j jVar = new w9.j(sVar, cVar2);
        ab.c cVar3 = ab.c.a;
        ab.d dVar2 = ab.d.a;
        ab.c cVar4 = ab.c.a;
        ab.a a10 = ab.c.a(dVar2);
        if (a10.b != null) {
            Log.d("SessionsDependencies", "Subscriber " + dVar2 + " already registered.");
            r32 = null;
        } else {
            a10.b = jVar;
            Log.d("SessionsDependencies", "Subscriber " + dVar2 + " registered.");
            r32 = null;
            a10.a.e(null);
        }
        e0 e0Var = new e0(u12, 22);
        s9.a aVar3 = new s9.a(fVar);
        s9.a aVar4 = new s9.a(fVar);
        String str3 = r32;
        p pVar = new p(hVar, vVar, aVar2, sVar, aVar3, aVar4, cVar2, a2, jVar, e0Var);
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
            i10 = 3;
            String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(e7), Integer.valueOf(e10), Integer.valueOf(e11));
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                r12 = 0;
                Log.d("FirebaseCrashlytics", format, null);
            } else {
                r12 = 0;
            }
        } else {
            String[] stringArray = context.getResources().getStringArray(e7);
            String[] stringArray2 = context.getResources().getStringArray(e10);
            String[] stringArray3 = context.getResources().getStringArray(e11);
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                int i12 = 0;
                str2 = str3;
                while (i12 < stringArray3.length) {
                    int i13 = i12;
                    arrayList.add(new w9.e(stringArray[i12], stringArray2[i12], stringArray3[i13]));
                    i12 = i13 + 1;
                    str2 = null;
                }
            } else {
                String format2 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", format2, null);
                }
                str2 = null;
            }
            i10 = 3;
            r12 = str2;
        }
        String g10 = j0.g("Mapping file ID is: ", string);
        if (Log.isLoggable("FirebaseCrashlytics", i10)) {
            Log.d("FirebaseCrashlytics", g10, r12);
        }
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            w9.e eVar = (w9.e) obj;
            String str5 = eVar.a;
            String str6 = eVar.b;
            String str7 = eVar.c;
            int i15 = size;
            StringBuilder w10 = a4.a.w("Build id for ", str5, " on ", str6, ": ");
            w10.append(str7);
            String sb2 = w10.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", sb2, null);
            }
            size = i15;
        }
        try {
            w9.a a11 = w9.a.a(context, vVar, str4, string, arrayList, new f3(context));
            String str8 = "Installer package name is: " + a11.d;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str8, null);
            }
            ExecutorService a12 = w9.h.a("com.google.firebase.crashlytics.startup");
            new ob.a(1);
            String str9 = a11.f;
            String str10 = a11.g;
            String c11 = vVar.c();
            na.d dVar3 = new na.d(25);
            a6.i iVar = new a6.i(dVar3, 17);
            android.support.v4.media.c cVar5 = new android.support.v4.media.c(cVar2);
            Locale locale = Locale.US;
            String p5 = a4.a.p("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str4, "/settings");
            c5.i iVar2 = new c5.i();
            if (p5 == null) {
                throw new IllegalArgumentException("url must not be null.");
            }
            iVar2.a = p5;
            String str11 = Build.MANUFACTURER;
            String str12 = v.h;
            String C = a4.a.C(str11.replaceAll(str12, ""), "/", Build.MODEL.replaceAll(str12, ""));
            String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str12, "");
            String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str12, "");
            int e12 = w9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (e12 == 0) {
                e12 = w9.h.e(context, "com.crashlytics.android.build_id", "string");
            }
            String[] strArr = {e12 != 0 ? context.getResources().getString(e12) : null, str4, str10, str9};
            ArrayList arrayList2 = new ArrayList();
            int i16 = 0;
            while (i16 < 4) {
                String str13 = strArr[i16];
                String[] strArr2 = strArr;
                if (str13 != null) {
                    arrayList2.add(str13.replace("-", "").toLowerCase(Locale.US));
                }
                i16++;
                strArr = strArr2;
            }
            Collections.sort(arrayList2);
            StringBuilder sb3 = new StringBuilder();
            int size2 = arrayList2.size();
            int i17 = 0;
            while (i17 < size2) {
                Object obj2 = arrayList2.get(i17);
                i17++;
                sb3.append((String) obj2);
                arrayList2 = arrayList2;
            }
            String sb4 = sb3.toString();
            da.d dVar4 = new da.d(str4, C, replaceAll, replaceAll2, vVar, sb4.length() > 0 ? w9.h.i(sb4) : null, str10, str9, j0.c(c11 != null ? 4 : 1));
            da.b bVar = new da.b();
            AtomicReference atomicReference = new AtomicReference();
            bVar.h = atomicReference;
            bVar.i = new AtomicReference(new TaskCompletionSource());
            bVar.a = context;
            bVar.b = dVar4;
            bVar.d = dVar3;
            bVar.c = iVar;
            bVar.e = cVar5;
            bVar.f = iVar2;
            bVar.g = sVar;
            atomicReference.set(ob.a.B2(dVar3));
            AtomicReference atomicReference2 = (AtomicReference) bVar.i;
            AtomicReference atomicReference3 = (AtomicReference) bVar.h;
            if (!((Context) bVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((da.d) bVar.b).f) || (c10 = bVar.c(1)) == null) {
                da.a c12 = bVar.c(3);
                if (c12 != null) {
                    atomicReference3.set(c12);
                    ((TaskCompletionSource) atomicReference2.get()).trySetResult(c12);
                }
                s sVar2 = (s) bVar.g;
                Task task2 = sVar2.h.getTask();
                synchronized (sVar2.c) {
                    task = sVar2.d.getTask();
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
            t tVar = pVar.l;
            ba.c cVar6 = pVar.h;
            Context context2 = pVar.a;
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
                    str = "FirebaseCrashlytics";
                    if (Log.isLoggable(str, 2)) {
                        Log.v(str, "Configured not to require a build ID.", null);
                    }
                } else {
                    str = "FirebaseCrashlytics";
                    if (TextUtils.isEmpty(str14)) {
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
                }
                new w9.f(pVar.g);
                String str15 = w9.f.b;
                int i18 = 21;
                boolean z12 = false;
                pVar.e = new f3("crash_marker", cVar6, z12, i18);
                pVar.d = new f3("initialization_marker", cVar6, z12, i18);
                p3 p3Var = new p3(str15, cVar6, tVar);
                x9.e eVar2 = new x9.e(cVar6);
                ea.a[] aVarArr = new ea.a[1];
                aVarArr[0] = new u();
                y yVar = new y();
                yVar.a = aVarArr;
                yVar.b = new rb.a(7);
                ((q) pVar.o.b).a(new b(10));
                w9.a aVar5 = aVar;
                n k10 = n.k(pVar.a, pVar.g, pVar.h, aVar5, eVar2, p3Var, yVar, bVar, pVar.c, pVar.m);
                bVar = bVar;
                pVar.f = new w9.n(pVar.a, pVar.l, pVar.g, pVar.b, pVar.h, pVar.e, aVar5, p3Var, eVar2, k10, pVar.n, pVar.j, pVar.m);
                f3 f3Var = pVar.d;
                ba.c cVar7 = (ba.c) f3Var.c;
                String str16 = (String) f3Var.b;
                cVar7.getClass();
                exists = new File(cVar7.b, str16).exists();
                Boolean.TRUE.equals((Boolean) x.a(tVar.k(new o(pVar, 1))));
                w9.n nVar = pVar.f;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                nVar.e.k(new u4.g(2, nVar, str15));
                r rVar = new r(new w9.k(nVar), bVar, defaultUncaughtExceptionHandler, nVar.j);
                nVar.n = rVar;
                Thread.setDefaultUncaughtExceptionHandler(rVar);
                if (exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                    if (Log.isLoggable(str, 3)) {
                        Log.d(str, "Successfully configured exception handler.", null);
                    }
                    z11 = true;
                    Tasks.call(a12, new s9.b(z11, pVar, bVar));
                    return new s9.c(pVar);
                }
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                }
                pVar.b(bVar);
                z11 = false;
                Tasks.call(a12, new s9.b(z11, pVar, bVar));
                return new s9.c(pVar);
            }
            aVar = a11;
            z10 = true;
            String str142 = aVar.b;
            if (z10) {
            }
            new w9.f(pVar.g);
            String str152 = w9.f.b;
            int i182 = 21;
            boolean z122 = false;
            pVar.e = new f3("crash_marker", cVar6, z122, i182);
            pVar.d = new f3("initialization_marker", cVar6, z122, i182);
            p3 p3Var2 = new p3(str152, cVar6, tVar);
            x9.e eVar22 = new x9.e(cVar6);
            ea.a[] aVarArr2 = new ea.a[1];
            aVarArr2[0] = new u();
            y yVar2 = new y();
            yVar2.a = aVarArr2;
            yVar2.b = new rb.a(7);
            ((q) pVar.o.b).a(new b(10));
            w9.a aVar52 = aVar;
            n k102 = n.k(pVar.a, pVar.g, pVar.h, aVar52, eVar22, p3Var2, yVar2, bVar, pVar.c, pVar.m);
            bVar = bVar;
            pVar.f = new w9.n(pVar.a, pVar.l, pVar.g, pVar.b, pVar.h, pVar.e, aVar52, p3Var2, eVar22, k102, pVar.n, pVar.j, pVar.m);
            f3 f3Var2 = pVar.d;
            ba.c cVar72 = (ba.c) f3Var2.c;
            String str162 = (String) f3Var2.b;
            cVar72.getClass();
            exists = new File(cVar72.b, str162).exists();
            Boolean.TRUE.equals((Boolean) x.a(tVar.k(new o(pVar, 1))));
            w9.n nVar2 = pVar.f;
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
            nVar2.e.k(new u4.g(2, nVar2, str152));
            r rVar2 = new r(new w9.k(nVar2), bVar, defaultUncaughtExceptionHandler2, nVar2.j);
            nVar2.n = rVar2;
            Thread.setDefaultUncaughtExceptionHandler(rVar2);
            if (exists) {
            }
            if (Log.isLoggable(str, 3)) {
            }
            z11 = true;
            Tasks.call(a12, new s9.b(z11, pVar, bVar));
            return new s9.c(pVar);
        } catch (PackageManager.NameNotFoundException e15) {
            Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e15);
            return null;
        }
    }

    @Override // s5.f
    public Object apply(Object obj) {
        switch (this.a) {
            case 5:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        aa.a a2 = l5.i.a();
                        a2.v(rawQuery.getString(1));
                        a2.d = v5.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        a2.c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(a2.h());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 16:
                return ((c3.o) obj).c().getClass().getSimpleName();
            case 17:
                return i0.v(e9.q.w(((d0) obj).s().b, new b(18)));
            case 18:
                return Integer.valueOf(((l1) obj).c);
            case 25:
                return Long.valueOf(((z3.a) obj).b);
            case 26:
                return Long.valueOf(((z3.a) obj).c);
            default:
                return (w3.o) obj;
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

    @Override // org.telegram.ui.Components.bd0
    public String e(int i10) {
        switch (this.a) {
            case 12:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override // pa.a
    public void h(pa.b bVar) {
        switch (this.a) {
            case 6:
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

    @Override // org.telegram.ui.ActionBar.a2
    public void k(b2 b2Var, int i10) {
        switch (this.a) {
            case 11:
                break;
            case 14:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z10;
        if (task.isSuccessful()) {
            w9.b bVar = (w9.b) task.getResult();
            String str = "Crashlytics report successfully enqueued to DataTransport: " + bVar.b;
            t9.b bVar2 = t9.b.a;
            bVar2.b(str);
            File file = bVar.c;
            z10 = true;
            if (file.delete()) {
                bVar2.b("Deleted report file: " + file.getPath());
            } else {
                bVar2.d("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
    }

    private final void a(b2 b2Var, int i10) {
    }
}
