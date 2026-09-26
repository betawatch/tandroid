package s0;

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
import m.p3;
import n4.y;
import n7.z0;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.ad0;
import q9.p;
import u2.d0;
import u2.o1;
import u2.y0;
import w9.o;
import w9.q;
import w9.r;
import w9.u;
import w9.v;
import w9.w;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements s5.f, pa.a, q9.d, z1, ad0, d9.e, e2.h {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(44:44|(1:46)|(1:48)(1:164)|49|(4:52|(2:54|55)(1:57)|56|50)|58|59|(1:61)|62|63|(1:65)(1:163)|(1:67)(1:162)|68|(5:149|(1:151)|152|3a2|157)(1:72)|73|(25:77|(1:79)(2:145|(1:147))|80|81|(2:83|(1:85))(2:141|(2:143|144))|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|(5:121|(1:123)|124|117|118)(6:112|(1:114)|115|116|117|118))|148|81|(0)(0)|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|(2:106|108)|121|(0)|124|117|118) */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0548, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0568, code lost:
    
        android.util.Log.e(r5, "Crashlytics was not started due to an exception during initialization", r0);
        r2.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0559, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x055a, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x055d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x055e, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0560, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0564, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0565, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0414  */
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
        da.b bVar;
        boolean z11;
        boolean exists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        da.a c10;
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
        l.d dVar3 = new l.d(t12);
        s9.a aVar3 = new s9.a(fVar);
        u uVar3 = uVar2;
        s9.a aVar4 = new s9.a(fVar);
        String str3 = str;
        o oVar = new o(hVar, uVar3, aVar2, rVar, aVar3, aVar4, cVar2, a2, jVar, dVar3);
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
        String g10 = v7.j.g("Mapping file ID is: ", string);
        if (Log.isLoggable("FirebaseCrashlytics", i10)) {
            Log.d("FirebaseCrashlytics", g10, th2);
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
            StringBuilder x10 = a4.a.x("Build id for ", str5, " on ", str6, ": ");
            x10.append(str7);
            String sb2 = x10.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", sb2, null);
            }
            size = i15;
        }
        u uVar4 = uVar;
        try {
            w9.a a11 = w9.a.a(context, uVar4, str4, string, arrayList, new z0(context));
            String str8 = "Installer package name is: " + a11.d;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str8, null);
            }
            ExecutorService a12 = w9.h.a("com.google.firebase.crashlytics.startup");
            new ob.a(1);
            String str9 = a11.f;
            String str10 = a11.g;
            String c11 = uVar4.c();
            na.d dVar4 = new na.d(25);
            a6.i iVar = new a6.i(dVar4, 17);
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
            da.d dVar5 = new da.d(str4, D, replaceAll, replaceAll2, uVar4, sb4.length() > 0 ? w9.h.i(sb4) : null, str10, str9, v7.j.c(c11 != null ? 4 : 1));
            da.b bVar2 = new da.b();
            AtomicReference atomicReference = new AtomicReference();
            bVar2.h = atomicReference;
            bVar2.i = new AtomicReference(new TaskCompletionSource());
            bVar2.a = context;
            bVar2.b = dVar5;
            bVar2.d = dVar4;
            bVar2.c = iVar;
            bVar2.e = mVar;
            bVar2.f = iVar2;
            bVar2.g = rVar;
            atomicReference.set(ob.a.B2(dVar4));
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
                onSuccessTask = taskCompletionSource.getTask().onSuccessTask(a12, new xa.c(bVar2, 16));
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
                int i18 = 24;
                oVar.e = new z0(i18, "crash_marker", cVar5);
                oVar.d = new z0(i18, "initialization_marker", cVar5);
                p3 p3Var = new p3(str15, cVar5, tVar);
                x9.e eVar2 = new x9.e(cVar5);
                ea.a[] aVarArr = new ea.a[1];
                aVarArr[0] = new t7.u();
                y yVar = new y(aVarArr);
                ((p) oVar.o.a).a(new b(21));
                w9.a aVar5 = aVar;
                n k10 = n.k(oVar.a, oVar.g, oVar.h, aVar5, eVar2, p3Var, yVar, bVar2, oVar.c, oVar.m);
                bVar = bVar2;
                oVar.f = new w9.m(oVar.a, oVar.l, oVar.g, oVar.b, oVar.h, oVar.e, aVar5, p3Var, eVar2, k10, oVar.n, oVar.j, oVar.m);
                z0 z0Var = oVar.d;
                ba.c cVar6 = (ba.c) z0Var.c;
                String str16 = (String) z0Var.b;
                cVar6.getClass();
                exists = new File(cVar6.b, str16).exists();
                Boolean.TRUE.equals((Boolean) w.a(tVar.k(new w9.n(oVar, 1))));
                w9.m mVar2 = oVar.f;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                mVar2.e.k(new u4.g(2, mVar2, str15));
                q qVar = new q(new w3.b(mVar2), bVar, defaultUncaughtExceptionHandler, mVar2.j);
                mVar2.n = qVar;
                Thread.setDefaultUncaughtExceptionHandler(qVar);
                if (exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "Successfully configured exception handler.", null);
                    }
                    z11 = true;
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
            int i182 = 24;
            oVar.e = new z0(i182, "crash_marker", cVar5);
            oVar.d = new z0(i182, "initialization_marker", cVar5);
            p3 p3Var2 = new p3(str152, cVar5, tVar);
            x9.e eVar22 = new x9.e(cVar5);
            ea.a[] aVarArr2 = new ea.a[1];
            aVarArr2[0] = new t7.u();
            y yVar2 = new y(aVarArr2);
            ((p) oVar.o.a).a(new b(21));
            w9.a aVar52 = aVar;
            n k102 = n.k(oVar.a, oVar.g, oVar.h, aVar52, eVar22, p3Var2, yVar2, bVar2, oVar.c, oVar.m);
            bVar = bVar2;
            oVar.f = new w9.m(oVar.a, oVar.l, oVar.g, oVar.b, oVar.h, oVar.e, aVar52, p3Var2, eVar22, k102, oVar.n, oVar.j, oVar.m);
            z0 z0Var2 = oVar.d;
            ba.c cVar62 = (ba.c) z0Var2.c;
            String str162 = (String) z0Var2.b;
            cVar62.getClass();
            exists = new File(cVar62.b, str162).exists();
            Boolean.TRUE.equals((Boolean) w.a(tVar.k(new w9.n(oVar, 1))));
            w9.m mVar22 = oVar.f;
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
            mVar22.e.k(new u4.g(2, mVar22, str152));
            q qVar2 = new q(new w3.b(mVar22), bVar, defaultUncaughtExceptionHandler2, mVar22.j);
            mVar22.n = qVar2;
            Thread.setDefaultUncaughtExceptionHandler(qVar2);
            if (exists) {
            }
            if (Log.isLoggable(str2, 3)) {
            }
            z11 = true;
            Tasks.call(a12, new s9.b(z11, oVar, bVar));
            return new s9.c(oVar);
        } catch (PackageManager.NameNotFoundException e15) {
            Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e15);
            return null;
        }
    }

    @Override // e2.h
    public void accept(Object obj) {
        ((y0) obj).b.release();
    }

    @Override // s5.f
    public Object apply(Object obj) {
        switch (this.a) {
            case 16:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        aa.a a2 = l5.i.a();
                        a2.t(rawQuery.getString(1));
                        a2.d = v5.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        a2.c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(a2.e());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 27:
                return ((c3.o) obj).c().getClass().getSimpleName();
            default:
                return i0.v(e9.q.w(((d0) obj).r().b, new o1(0)));
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(a2 a2Var, int i10) {
        switch (this.a) {
            case 22:
                break;
            case 25:
                a2Var.dismiss();
                break;
            default:
                a2Var.dismiss();
                break;
        }
    }

    @Override // pa.a
    public void g(pa.b bVar) {
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

    @Override // org.telegram.ui.Components.ad0
    public String j(int i10) {
        switch (this.a) {
            case 23:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
    }

    private final void a(a2 a2Var, int i10) {
    }
}
