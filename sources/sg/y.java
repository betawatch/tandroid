package sg;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import m.s3;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.kd0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements org.telegram.ui.ActionBar.a2, qa.a, r9.d, d9.k, e2.j, kd0, q3.g, Continuation {
    public final /* synthetic */ int a;

    public /* synthetic */ y(int i10) {
        this.a = i10;
    }

    @Override // e2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 9:
                ((u2.b1) obj).b.release();
                break;
            default:
                ((ExecutorService) obj).shutdown();
                break;
        }
    }

    @Override // d9.k
    public Object apply(Object obj) {
        switch (this.a) {
            case 7:
                return ((c3.o) obj).b().getClass().getSimpleName();
            case 8:
                return e9.n0.u(e9.s.x(((u2.e0) obj).r().b, new y(10)));
            case 10:
                return Integer.valueOf(((b2.p1) obj).c);
            case 23:
                return Long.valueOf(((z3.a) obj).b);
            case 24:
                return Long.valueOf(((z3.a) obj).c);
            case 25:
                return (w3.q) obj;
            default:
                u2.s1 s1Var = (u2.s1) obj;
                s1Var.getClass();
                Bundle bundle = new Bundle();
                String str = u2.s1.e;
                e9.x1 x1Var = s1Var.b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(x1Var.d);
                e9.l0 listIterator = x1Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(((b2.p1) listIterator.next()).c());
                }
                bundle.putParcelableArrayList(str, arrayList);
                return bundle;
        }
    }

    @Override // q3.g
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.kd0
    public String e(int i10) {
        switch (this.a) {
            case 13:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                b2Var.dismiss();
                break;
            case 12:
                break;
            case 15:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // qa.a
    public void h(qa.b bVar) {
        switch (this.a) {
            case 5:
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

    /* JADX WARN: Can't wrap try/catch for region: R(39:43|(1:45)|(1:47)(1:152)|48|(4:51|(2:53|54)(1:56)|55|49)|57|58|(1:60)|61|62|(1:64)(1:151)|(1:66)(1:150)|67|(5:137|(1:139)|140|3a2|145)(1:71)|72|(21:76|(1:78)(2:133|(1:135))|79|80|(2:82|(1:84))(2:129|(2:131|132))|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|(4:116|(1:118)|112|113)(6:107|(1:109)|110|111|112|113))|136|80|(0)(0)|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|(2:101|103)|116|(0)|112|113) */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x055a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x055b, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0561, code lost:
    
        android.util.Log.e(r6, "Crashlytics was not started due to an exception during initialization", r0);
        r2.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x054a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x055e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x055f, code lost:
    
        r27 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0413  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // r9.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j2(z5 z5Var) {
        ?? r32;
        int i10;
        int i11;
        int i12;
        ?? r12;
        Task task;
        Task onSuccessTask;
        x9.a aVar;
        boolean z10;
        String str;
        boolean z11;
        boolean exists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        ea.a c10;
        String str2;
        int i13 = CrashlyticsRegistrar.a;
        l9.h hVar = (l9.h) z5Var.a(l9.h.class);
        r9.p v = z5Var.v(u9.a.class);
        r9.p v10 = z5Var.v(m9.a.class);
        ra.d dVar = (ra.d) z5Var.a(ra.d.class);
        r9.p v11 = z5Var.v(za.a.class);
        hVar.a();
        Context context = hVar.a;
        String packageName = context.getPackageName();
        Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 18.6.0 for " + packageName, null);
        ca.c cVar = new ca.c(context);
        x9.r rVar = new x9.r(hVar);
        x9.u uVar = new x9.u(context, packageName, dVar, rVar);
        u9.a aVar2 = new u9.a(v);
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(v10);
        ExecutorService a2 = x9.h.a("Crashlytics Exception Handler");
        x9.j jVar = new x9.j(rVar, cVar);
        bb.c cVar2 = bb.c.a;
        bb.d dVar2 = bb.d.a;
        bb.c cVar3 = bb.c.a;
        bb.a a10 = bb.c.a(dVar2);
        if (a10.b != null) {
            Log.d("SessionsDependencies", "Subscriber " + dVar2 + " already registered.");
            r32 = null;
        } else {
            a10.b = jVar;
            Log.d("SessionsDependencies", "Subscriber " + dVar2 + " registered.");
            r32 = null;
            a10.a.e(null);
        }
        le.b bVar = new le.b(v11, 23);
        t9.a aVar3 = new t9.a(fVar);
        t9.a aVar4 = new t9.a(fVar);
        String str3 = r32;
        x9.o oVar = new x9.o(hVar, uVar, aVar2, rVar, aVar3, aVar4, cVar, a2, jVar, bVar);
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
            i10 = 1;
            i11 = 0;
            i12 = 3;
            String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(e7), Integer.valueOf(e10), Integer.valueOf(e11));
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                r12 = 0;
                Log.d("FirebaseCrashlytics", format, null);
            } else {
                r12 = 0;
            }
        } else {
            i10 = 1;
            String[] stringArray = context.getResources().getStringArray(e7);
            String[] stringArray2 = context.getResources().getStringArray(e10);
            String[] stringArray3 = context.getResources().getStringArray(e11);
            i11 = 0;
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                int i14 = 0;
                str2 = str3;
                while (i14 < stringArray3.length) {
                    int i15 = i14;
                    arrayList.add(new x9.e(stringArray[i14], stringArray2[i14], stringArray3[i15]));
                    i14 = i15 + 1;
                    str2 = null;
                }
            } else {
                String format2 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", format2, null);
                }
                str2 = null;
            }
            i12 = 3;
            r12 = str2;
        }
        String h = r4.c.h("Mapping file ID is: ", string);
        if (Log.isLoggable("FirebaseCrashlytics", i12)) {
            Log.d("FirebaseCrashlytics", h, r12);
        }
        int size = arrayList.size();
        int i16 = i11;
        while (i16 < size) {
            Object obj = arrayList.get(i16);
            i16++;
            x9.e eVar = (x9.e) obj;
            String str5 = eVar.a;
            String str6 = eVar.b;
            String str7 = eVar.c;
            int i17 = size;
            StringBuilder w9 = a1.g.w("Build id for ", str5, " on ", str6, ": ");
            w9.append(str7);
            String sb2 = w9.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", sb2, null);
            }
            size = i17;
        }
        int i18 = 3;
        try {
            x9.a a11 = x9.a.a(context, uVar, str4, string, arrayList, new mi.q(context));
            String str8 = "Installer package name is: " + a11.d;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str8, null);
            }
            ExecutorService a12 = x9.h.a("com.google.firebase.crashlytics.startup");
            new sb.a(i18);
            String str9 = a11.f;
            String str10 = a11.g;
            String c11 = uVar.c();
            t7.u uVar2 = new t7.u(26);
            ag.b bVar2 = new ag.b(uVar2, 14);
            a6.m mVar = new a6.m(cVar);
            Locale locale = Locale.US;
            String p5 = a1.g.p("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str4, "/settings");
            d9.l lVar = new d9.l();
            if (p5 == null) {
                throw new IllegalArgumentException("url must not be null.");
            }
            lVar.a = p5;
            String str11 = Build.MANUFACTURER;
            String str12 = x9.u.h;
            String C = a1.g.C(str11.replaceAll(str12, ""), "/", Build.MODEL.replaceAll(str12, ""));
            String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str12, "");
            String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str12, "");
            int e12 = x9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (e12 == 0) {
                e12 = x9.h.e(context, "com.crashlytics.android.build_id", "string");
            }
            String[] strArr = {e12 != 0 ? context.getResources().getString(e12) : null, str4, str10, str9};
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
            ea.d dVar3 = new ea.d(str4, C, replaceAll, replaceAll2, uVar, sb4.length() > 0 ? x9.h.i(sb4) : null, str10, str9, r4.c.b(c11 != null ? 4 : i10));
            ea.b bVar3 = new ea.b();
            AtomicReference atomicReference = new AtomicReference();
            bVar3.h = atomicReference;
            bVar3.i = new AtomicReference(new TaskCompletionSource());
            bVar3.a = context;
            bVar3.b = dVar3;
            bVar3.d = uVar2;
            bVar3.c = bVar2;
            bVar3.e = mVar;
            bVar3.f = lVar;
            bVar3.g = rVar;
            atomicReference.set(t7.u.F0(uVar2));
            AtomicReference atomicReference2 = (AtomicReference) bVar3.i;
            AtomicReference atomicReference3 = (AtomicReference) bVar3.h;
            if (!((Context) bVar3.a).getSharedPreferences("com.google.firebase.crashlytics", i11).getString("existing_instance_identifier", "").equals(((ea.d) bVar3.b).f) || (c10 = bVar3.c(i10)) == null) {
                ea.a c12 = bVar3.c(3);
                if (c12 != null) {
                    atomicReference3.set(c12);
                    ((TaskCompletionSource) atomicReference2.get()).trySetResult(c12);
                }
                x9.r rVar2 = (x9.r) bVar3.g;
                Task task2 = rVar2.h.getTask();
                synchronized (rVar2.c) {
                    task = rVar2.d.getTask();
                }
                ExecutorService executorService = x9.w.a;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                x9.v vVar = new x9.v(0, taskCompletionSource);
                task2.continueWith(a12, vVar);
                task.continueWith(a12, vVar);
                onSuccessTask = taskCompletionSource.getTask().onSuccessTask(a12, new a6.i(bVar3, 17));
            } else {
                atomicReference3.set(c10);
                ((TaskCompletionSource) atomicReference2.get()).trySetResult(c10);
                onSuccessTask = Tasks.forResult(null);
            }
            onSuccessTask.continueWith(a12, new pb.a(23));
            com.google.firebase.messaging.r rVar3 = oVar.l;
            ca.c cVar4 = oVar.h;
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
                new x9.f(oVar.g);
                String str15 = x9.f.b;
                int i21 = 29;
                oVar.e = new mi.q(i21, "crash_marker", cVar4);
                oVar.d = new mi.q(i21, "initialization_marker", cVar4);
                s3 s3Var = new s3(str15, cVar4, rVar3);
                y9.e eVar2 = new y9.e(cVar4);
                fa.a[] aVarArr = new fa.a[1];
                boolean z12 = false;
                aVarArr[0] = new sb.a(8);
                qf.b bVar4 = new qf.b(aVarArr);
                ((r9.p) oVar.o.b).a(new y(11));
                x9.a aVar5 = aVar;
                com.google.firebase.messaging.l m10 = com.google.firebase.messaging.l.m(oVar.a, oVar.g, oVar.h, aVar5, eVar2, s3Var, bVar4, bVar3, oVar.c, oVar.m);
                bVar3 = bVar3;
                oVar.f = new x9.m(oVar.a, oVar.l, oVar.g, oVar.b, oVar.h, oVar.e, aVar5, s3Var, eVar2, m10, oVar.n, oVar.j, oVar.m);
                mi.q qVar = oVar.d;
                ca.c cVar5 = (ca.c) qVar.c;
                String str16 = (String) qVar.b;
                cVar5.getClass();
                exists = new File(cVar5.b, str16).exists();
                z11 = true;
                z11 = true;
                Boolean.TRUE.equals((Boolean) x9.w.a(rVar3.v(new x9.n(oVar, z11 ? 1 : 0))));
                x9.m mVar2 = oVar.f;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                mVar2.e.v(new u4.f(2, mVar2, str15));
                x9.q qVar2 = new x9.q(new uc.b(mVar2), bVar3, defaultUncaughtExceptionHandler, mVar2.j);
                mVar2.n = qVar2;
                Thread.setDefaultUncaughtExceptionHandler(qVar2);
                if (exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                    if (Log.isLoggable(str, 3)) {
                        Log.d(str, "Successfully configured exception handler.", null);
                    }
                    Tasks.call(a12, new t9.b(z11, oVar, bVar3));
                    return new t9.c(oVar);
                }
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                }
                oVar.b(bVar3);
                z11 = z12;
                Tasks.call(a12, new t9.b(z11, oVar, bVar3));
                return new t9.c(oVar);
            }
            aVar = a11;
            z10 = true;
            String str142 = aVar.b;
            if (z10) {
            }
            new x9.f(oVar.g);
            String str152 = x9.f.b;
            int i212 = 29;
            oVar.e = new mi.q(i212, "crash_marker", cVar4);
            oVar.d = new mi.q(i212, "initialization_marker", cVar4);
            s3 s3Var2 = new s3(str152, cVar4, rVar3);
            y9.e eVar22 = new y9.e(cVar4);
            fa.a[] aVarArr2 = new fa.a[1];
            boolean z122 = false;
            aVarArr2[0] = new sb.a(8);
            qf.b bVar42 = new qf.b(aVarArr2);
            ((r9.p) oVar.o.b).a(new y(11));
            x9.a aVar52 = aVar;
            com.google.firebase.messaging.l m102 = com.google.firebase.messaging.l.m(oVar.a, oVar.g, oVar.h, aVar52, eVar22, s3Var2, bVar42, bVar3, oVar.c, oVar.m);
            bVar3 = bVar3;
            oVar.f = new x9.m(oVar.a, oVar.l, oVar.g, oVar.b, oVar.h, oVar.e, aVar52, s3Var2, eVar22, m102, oVar.n, oVar.j, oVar.m);
            mi.q qVar3 = oVar.d;
            ca.c cVar52 = (ca.c) qVar3.c;
            String str162 = (String) qVar3.b;
            cVar52.getClass();
            exists = new File(cVar52.b, str162).exists();
            z11 = true;
            z11 = true;
            Boolean.TRUE.equals((Boolean) x9.w.a(rVar3.v(new x9.n(oVar, z11 ? 1 : 0))));
            x9.m mVar22 = oVar.f;
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
            mVar22.e.v(new u4.f(2, mVar22, str152));
            x9.q qVar22 = new x9.q(new uc.b(mVar22), bVar3, defaultUncaughtExceptionHandler2, mVar22.j);
            mVar22.n = qVar22;
            Thread.setDefaultUncaughtExceptionHandler(qVar22);
            if (exists) {
            }
            if (Log.isLoggable(str, 3)) {
            }
            Tasks.call(a12, new t9.b(z11, oVar, bVar3));
            return new t9.c(oVar);
        } catch (PackageManager.NameNotFoundException e15) {
            Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e15);
            return null;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z10;
        if (task.isSuccessful()) {
            x9.b bVar = (x9.b) task.getResult();
            String str = "Crashlytics report successfully enqueued to DataTransport: " + bVar.b;
            u9.b bVar2 = u9.b.a;
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

    public /* synthetic */ y(Object obj, int i10) {
        this.a = i10;
    }

    private final void c(b2 b2Var, int i10) {
    }
}
