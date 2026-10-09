package s0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import b2.l1;
import c3.o;
import ci.u5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.messaging.n;
import com.google.firebase.messaging.s;
import e9.a1;
import e9.g0;
import e9.i0;
import e9.q;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import m.q3;
import n4.x;
import n6.t;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.qd0;
import q9.p;
import sc.v;
import u2.d0;
import u2.o1;
import u2.y0;
import w9.m;
import w9.r;
import w9.u;
import w9.w;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements s5.e, pa.a, q9.d, a2, qd0, d9.e, e2.h, q3.g, Continuation {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // e2.h
    public void accept(Object obj) {
        ((y0) obj).b.release();
    }

    @Override // s5.e
    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        aa.a a2 = l5.i.a();
                        a2.t(rawQuery.getString(1));
                        a2.d = v5.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        a2.c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(a2.d());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 14:
                return ((o) obj).c().getClass().getSimpleName();
            case 15:
                return i0.v(q.w(((d0) obj).p().b, new b(17)));
            case 17:
                return Integer.valueOf(((l1) obj).c);
            case 24:
                return Long.valueOf(((z3.a) obj).b);
            case 25:
                return Long.valueOf(((z3.a) obj).c);
            case 26:
                return (w3.q) obj;
            default:
                o1 o1Var = (o1) obj;
                o1Var.getClass();
                Bundle bundle = new Bundle();
                String str = o1.e;
                a1 a1Var = o1Var.b;
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(a1Var.d);
                g0 listIterator = a1Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList2.add(((l1) listIterator.next()).c());
                }
                bundle.putParcelableArrayList(str, arrayList2);
                return bundle;
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

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 9:
                break;
            case 12:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // pa.a
    public void g(pa.b bVar) {
        switch (this.a) {
            case 4:
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

    @Override // org.telegram.ui.Components.qd0
    public String i(int i10) {
        switch (this.a) {
            case 10:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
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

    /* JADX WARN: Can't wrap try/catch for region: R(48:37|38|39|(1:41)|42|(1:44)|(1:46)(1:162)|47|(4:50|(2:52|53)(1:55)|54|48)|56|57|(1:59)|60|61|(1:63)(1:161)|(1:65)(1:160)|66|(5:147|(1:149)|150|3a9|155)(1:70)|71|(25:75|(1:77)(2:143|(1:145))|78|79|(2:81|(1:83))(2:139|(2:141|142))|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(5:119|(1:121)|122|115|116)(6:110|(1:112)|113|114|115|116))|146|79|(0)(0)|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(2:104|106)|119|(0)|122|115|116) */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0550, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0570, code lost:
    
        android.util.Log.e(r5, "Crashlytics was not started due to an exception during initialization", r0);
        r2.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0561, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0562, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0565, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0566, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0568, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0569, code lost:
    
        r26 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x056c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x056d, code lost:
    
        r1 = r3;
        r26 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x041b  */
    @Override // q9.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object y0(u5 u5Var) {
        String str;
        u uVar;
        int i10;
        int i11;
        Throwable th2;
        Task task;
        Task onSuccessTask;
        w9.a aVar;
        boolean z10;
        String str2;
        da.c cVar;
        boolean z11;
        boolean exists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        da.b c10;
        int i12 = CrashlyticsRegistrar.a;
        k9.h hVar = (k9.h) u5Var.a(k9.h.class);
        p t10 = u5Var.t(t9.a.class);
        p t11 = u5Var.t(l9.a.class);
        qa.d dVar = (qa.d) u5Var.a(qa.d.class);
        p t12 = u5Var.t(ya.a.class);
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
        k2.g0 g0Var = new k2.g0(t12, 26);
        s9.a aVar3 = new s9.a(fVar);
        u uVar3 = uVar2;
        s9.a aVar4 = new s9.a(fVar);
        String str3 = str;
        w9.o oVar = new w9.o(hVar, uVar3, aVar2, rVar, aVar3, aVar4, cVar2, a2, jVar, g0Var);
        hVar.a();
        String str4 = hVar.c.b;
        int e7 = w9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (e7 == 0) {
            e7 = w9.h.e(context, "com.crashlytics.android.build_id", "string");
        }
        String string = e7 != 0 ? context.getResources().getString(e7) : str3;
        ArrayList arrayList = new ArrayList();
        int e10 = w9.h.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int e11 = w9.h.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int e12 = w9.h.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (e10 == 0 || e11 == 0 || e12 == 0) {
            uVar = uVar3;
            i10 = 1;
            i11 = 3;
            String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(e10), Integer.valueOf(e11), Integer.valueOf(e12));
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                th2 = null;
                Log.d("FirebaseCrashlytics", format, null);
            } else {
                th2 = null;
            }
        } else {
            i10 = 1;
            String[] stringArray = context.getResources().getStringArray(e10);
            String[] stringArray2 = context.getResources().getStringArray(e11);
            String[] stringArray3 = context.getResources().getStringArray(e12);
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                int i13 = 0;
                while (i13 < stringArray3.length) {
                    int i14 = i13;
                    arrayList.add(new w9.e(stringArray[i13], stringArray2[i14], stringArray3[i14]));
                    i13 = i14 + 1;
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
            i11 = 3;
        }
        String i15 = v.i("Mapping file ID is: ", string);
        if (Log.isLoggable("FirebaseCrashlytics", i11)) {
            Log.d("FirebaseCrashlytics", i15, th2);
        }
        int size = arrayList.size();
        int i16 = 0;
        while (i16 < size) {
            Object obj = arrayList.get(i16);
            i16++;
            w9.e eVar = (w9.e) obj;
            String str5 = eVar.a;
            String str6 = eVar.b;
            String str7 = eVar.c;
            int i17 = size;
            StringBuilder x10 = a1.g.x("Build id for ", str5, " on ", str6, ": ");
            x10.append(str7);
            String sb2 = x10.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", sb2, null);
            }
            size = i17;
        }
        u uVar4 = uVar;
        try {
            w9.a a11 = w9.a.a(context, uVar4, str4, string, arrayList, new t(context, 18));
            String str8 = "Installer package name is: " + a11.d;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str8, null);
            }
            ExecutorService a12 = w9.h.a("com.google.firebase.crashlytics.startup");
            ob.a aVar5 = new ob.a(i10);
            String str9 = a11.f;
            String str10 = a11.g;
            String c11 = uVar4.c();
            rb.a aVar6 = new rb.a(25);
            a4.l lVar = new a4.l(aVar6, 14);
            pb.c cVar5 = new pb.c(cVar2);
            Locale locale = Locale.US;
            da.a aVar7 = new da.a(a1.g.q("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str4, "/settings"), aVar5);
            String str11 = Build.MANUFACTURER;
            String str12 = u.h;
            String D = a1.g.D(str11.replaceAll(str12, ""), "/", Build.MODEL.replaceAll(str12, ""));
            String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str12, "");
            String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str12, "");
            int e13 = w9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (e13 == 0) {
                e13 = w9.h.e(context, "com.crashlytics.android.build_id", "string");
            }
            String[] strArr = {e13 != 0 ? context.getResources().getString(e13) : null, str4, str10, str9};
            ArrayList arrayList2 = new ArrayList();
            int i18 = 0;
            while (i18 < 4) {
                String str13 = strArr[i18];
                String[] strArr2 = strArr;
                if (str13 != null) {
                    arrayList2.add(str13.replace("-", "").toLowerCase(Locale.US));
                }
                i18++;
                strArr = strArr2;
            }
            Collections.sort(arrayList2);
            StringBuilder sb3 = new StringBuilder();
            int size2 = arrayList2.size();
            int i19 = 0;
            while (i19 < size2) {
                Object obj2 = arrayList2.get(i19);
                i19++;
                sb3.append((String) obj2);
                arrayList2 = arrayList2;
            }
            String sb4 = sb3.toString();
            da.e eVar2 = new da.e(str4, D, replaceAll, replaceAll2, uVar4, sb4.length() > 0 ? w9.h.i(sb4) : null, str10, str9, v.c(c11 != null ? 4 : 1));
            da.c cVar6 = new da.c();
            AtomicReference atomicReference = new AtomicReference();
            cVar6.h = atomicReference;
            cVar6.i = new AtomicReference(new TaskCompletionSource());
            cVar6.a = context;
            cVar6.b = eVar2;
            cVar6.d = aVar6;
            cVar6.c = lVar;
            cVar6.e = cVar5;
            cVar6.f = aVar7;
            cVar6.g = rVar;
            atomicReference.set(na.d.m(aVar6));
            AtomicReference atomicReference2 = (AtomicReference) cVar6.i;
            AtomicReference atomicReference3 = (AtomicReference) cVar6.h;
            if (!((Context) cVar6.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((da.e) cVar6.b).f) || (c10 = cVar6.c(1)) == null) {
                da.b c12 = cVar6.c(3);
                if (c12 != null) {
                    atomicReference3.set(c12);
                    ((TaskCompletionSource) atomicReference2.get()).trySetResult(c12);
                }
                r rVar2 = (r) cVar6.g;
                Task task2 = rVar2.h.getTask();
                synchronized (rVar2.c) {
                    task = rVar2.d.getTask();
                }
                ExecutorService executorService = w.a;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                w9.v vVar = new w9.v(0, taskCompletionSource);
                task2.continueWith(a12, vVar);
                task.continueWith(a12, vVar);
                onSuccessTask = taskCompletionSource.getTask().onSuccessTask(a12, new a6.i(cVar6, 17));
            } else {
                atomicReference3.set(c10);
                ((TaskCompletionSource) atomicReference2.get()).trySetResult(c10);
                onSuccessTask = Tasks.forResult(null);
            }
            onSuccessTask.continueWith(a12, new na.d(22));
            s sVar = oVar.l;
            ba.c cVar7 = oVar.h;
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
                int i20 = 24;
                oVar.e = new t(i20, "crash_marker", cVar7);
                oVar.d = new t(i20, "initialization_marker", cVar7);
                q3 q3Var = new q3(str15, cVar7, sVar);
                x9.e eVar3 = new x9.e(cVar7);
                ea.a[] aVarArr = new ea.a[1];
                boolean z12 = false;
                aVarArr[0] = new t7.t();
                x xVar = new x(aVarArr);
                ((p) oVar.o.b).a(new b(8));
                w9.a aVar8 = aVar;
                n k10 = n.k(oVar.a, oVar.g, oVar.h, aVar8, eVar3, q3Var, xVar, cVar6, oVar.c, oVar.m);
                cVar = cVar6;
                oVar.f = new m(oVar.a, oVar.l, oVar.g, oVar.b, oVar.h, oVar.e, aVar8, q3Var, eVar3, k10, oVar.n, oVar.j, oVar.m);
                t tVar = oVar.d;
                ba.c cVar8 = (ba.c) tVar.c;
                String str16 = (String) tVar.b;
                cVar8.getClass();
                exists = new File(cVar8.b, str16).exists();
                Boolean.TRUE.equals((Boolean) w.a(sVar.k(new w9.n(oVar, 1))));
                m mVar = oVar.f;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                mVar.e.k(new u4.f(2, mVar, str15));
                w9.q qVar = new w9.q(new w3.b(mVar), cVar, defaultUncaughtExceptionHandler, mVar.j);
                mVar.n = qVar;
                Thread.setDefaultUncaughtExceptionHandler(qVar);
                if (exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "Successfully configured exception handler.", null);
                    }
                    z11 = true;
                    Tasks.call(a12, new s9.b(z11, oVar, cVar));
                    return new s9.c(oVar);
                }
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                }
                oVar.b(cVar);
                z11 = z12;
                Tasks.call(a12, new s9.b(z11, oVar, cVar));
                return new s9.c(oVar);
            }
            aVar = a11;
            z10 = true;
            String str142 = aVar.b;
            if (z10) {
            }
            new w9.f(oVar.g);
            String str152 = w9.f.b;
            int i202 = 24;
            oVar.e = new t(i202, "crash_marker", cVar7);
            oVar.d = new t(i202, "initialization_marker", cVar7);
            q3 q3Var2 = new q3(str152, cVar7, sVar);
            x9.e eVar32 = new x9.e(cVar7);
            ea.a[] aVarArr2 = new ea.a[1];
            boolean z122 = false;
            aVarArr2[0] = new t7.t();
            x xVar2 = new x(aVarArr2);
            ((p) oVar.o.b).a(new b(8));
            w9.a aVar82 = aVar;
            n k102 = n.k(oVar.a, oVar.g, oVar.h, aVar82, eVar32, q3Var2, xVar2, cVar6, oVar.c, oVar.m);
            cVar = cVar6;
            oVar.f = new m(oVar.a, oVar.l, oVar.g, oVar.b, oVar.h, oVar.e, aVar82, q3Var2, eVar32, k102, oVar.n, oVar.j, oVar.m);
            t tVar2 = oVar.d;
            ba.c cVar82 = (ba.c) tVar2.c;
            String str162 = (String) tVar2.b;
            cVar82.getClass();
            exists = new File(cVar82.b, str162).exists();
            Boolean.TRUE.equals((Boolean) w.a(sVar.k(new w9.n(oVar, 1))));
            m mVar2 = oVar.f;
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
            mVar2.e.k(new u4.f(2, mVar2, str152));
            w9.q qVar2 = new w9.q(new w3.b(mVar2), cVar, defaultUncaughtExceptionHandler2, mVar2.j);
            mVar2.n = qVar2;
            Thread.setDefaultUncaughtExceptionHandler(qVar2);
            if (exists) {
            }
            if (Log.isLoggable(str2, 3)) {
            }
            z11 = true;
            Tasks.call(a12, new s9.b(z11, oVar, cVar));
            return new s9.c(oVar);
        } catch (PackageManager.NameNotFoundException e16) {
            Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e16);
            return null;
        }
    }

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
    }

    private final void a(b2 b2Var, int i10) {
    }
}
