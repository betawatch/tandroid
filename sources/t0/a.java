package t0;

import a4.l;
import a6.m;
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
import b2.q1;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import d9.k;
import e9.l0;
import e9.n0;
import e9.x1;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import ji.w4;
import m.t3;
import m2.t;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.qd0;
import r9.p;
import t7.u;
import u2.a1;
import u2.e0;
import u2.r1;
import w3.q;
import x9.n;
import x9.o;
import x9.r;
import x9.s;
import x9.v;
import x9.w;
import x9.x;
import yh.f4;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements qa.a, r9.d, k, e2.j, z1, qd0, q3.g, Continuation, GenericProvider {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(43:44|(1:46)|(1:48)(1:163)|49|(4:52|(2:54|55)(1:57)|56|50)|58|59|(1:61)|62|63|(1:65)(1:162)|(1:67)(1:161)|68|(5:148|(1:150)|151|3aa|156)(1:72)|73|(25:77|(1:79)(2:144|(1:146))|80|81|(2:83|(1:85))(2:140|(2:142|143))|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|(4:121|(1:123)|117|118)(6:112|(1:114)|115|116|117|118))|147|81|(0)(0)|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|(2:106|108)|121|(0)|117|118) */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0550, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x056f, code lost:
    
        android.util.Log.e(r5, "Crashlytics was not started due to an exception during initialization", r0);
        r2.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0560, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0561, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0564, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0565, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0567, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0568, code lost:
    
        r26 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x056b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x056c, code lost:
    
        r1 = r3;
        r26 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x041c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(z5 z5Var) {
        String str;
        v vVar;
        int i10;
        int i11;
        Throwable th2;
        Task task;
        Task onSuccessTask;
        x9.a aVar;
        boolean z10;
        String str2;
        ea.b bVar;
        boolean z11;
        boolean exists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        ea.a c10;
        int i12 = CrashlyticsRegistrar.a;
        l9.h hVar = (l9.h) z5Var.a(l9.h.class);
        p s10 = z5Var.s(u9.a.class);
        p s11 = z5Var.s(m9.a.class);
        ra.d dVar = (ra.d) z5Var.a(ra.d.class);
        p s12 = z5Var.s(za.a.class);
        hVar.a();
        Context context = hVar.a;
        String packageName = context.getPackageName();
        Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 18.6.0 for " + packageName, null);
        ca.c cVar = new ca.c(context);
        s sVar = new s(hVar);
        v vVar2 = new v(context, packageName, dVar, sVar);
        u9.a aVar2 = new u9.a(s10);
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(s11);
        ExecutorService a2 = x9.h.a("Crashlytics Exception Handler");
        x9.j jVar = new x9.j(sVar, cVar);
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
        w4 w4Var = new w4(s12, 29);
        t9.a aVar3 = new t9.a(fVar);
        v vVar3 = vVar2;
        t9.a aVar4 = new t9.a(fVar);
        String str3 = str;
        x9.p pVar = new x9.p(hVar, vVar3, aVar2, sVar, aVar3, aVar4, cVar, a2, jVar, w4Var);
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
            i10 = 1;
            i11 = 3;
            String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(e7), Integer.valueOf(e10), Integer.valueOf(e11));
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                th2 = null;
                Log.d("FirebaseCrashlytics", format, null);
            } else {
                th2 = null;
            }
        } else {
            i10 = 1;
            String[] stringArray = context.getResources().getStringArray(e7);
            String[] stringArray2 = context.getResources().getStringArray(e10);
            String[] stringArray3 = context.getResources().getStringArray(e11);
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
        String h = t8.b.h("Mapping file ID is: ", string);
        if (Log.isLoggable("FirebaseCrashlytics", i11)) {
            Log.d("FirebaseCrashlytics", h, th2);
        }
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            x9.e eVar = (x9.e) obj;
            String str5 = eVar.a;
            String str6 = eVar.b;
            String str7 = eVar.c;
            int i16 = size;
            StringBuilder w9 = a1.g.w("Build id for ", str5, " on ", str6, ": ");
            w9.append(str7);
            String sb2 = w9.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", sb2, null);
            }
            size = i16;
        }
        int i17 = 3;
        v vVar4 = vVar;
        try {
            x9.a a11 = x9.a.a(context, vVar4, str4, string, arrayList, new t(context));
            String str8 = "Installer package name is: " + a11.d;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str8, null);
            }
            ExecutorService a12 = x9.h.a("com.google.firebase.crashlytics.startup");
            new sb.a(i17);
            String str9 = a11.f;
            String str10 = a11.g;
            String c11 = vVar4.c();
            u uVar = new u(26);
            l lVar = new l(uVar, 20);
            m mVar = new m(cVar);
            Locale locale = Locale.US;
            String p5 = a1.g.p("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str4, "/settings");
            c5.j jVar2 = new c5.j();
            if (p5 == null) {
                throw new IllegalArgumentException("url must not be null.");
            }
            jVar2.a = p5;
            String str11 = Build.MANUFACTURER;
            String str12 = v.h;
            String D = a1.g.D(str11.replaceAll(str12, ""), "/", Build.MODEL.replaceAll(str12, ""));
            String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str12, "");
            String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str12, "");
            int e12 = x9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (e12 == 0) {
                e12 = x9.h.e(context, "com.crashlytics.android.build_id", "string");
            }
            String[] strArr = {e12 != 0 ? context.getResources().getString(e12) : null, str4, str10, str9};
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
            ea.d dVar3 = new ea.d(str4, D, replaceAll, replaceAll2, vVar4, sb4.length() > 0 ? x9.h.i(sb4) : null, str10, str9, t8.b.b(c11 != null ? 4 : i10));
            ea.b bVar2 = new ea.b();
            AtomicReference atomicReference = new AtomicReference();
            bVar2.h = atomicReference;
            bVar2.i = new AtomicReference(new TaskCompletionSource());
            bVar2.a = context;
            bVar2.b = dVar3;
            bVar2.d = uVar;
            bVar2.c = lVar;
            bVar2.e = mVar;
            bVar2.f = jVar2;
            bVar2.g = sVar;
            atomicReference.set(u.E0(uVar));
            AtomicReference atomicReference2 = (AtomicReference) bVar2.i;
            AtomicReference atomicReference3 = (AtomicReference) bVar2.h;
            if (!((Context) bVar2.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((ea.d) bVar2.b).f) || (c10 = bVar2.c(i10)) == null) {
                ea.a c12 = bVar2.c(3);
                if (c12 != null) {
                    atomicReference3.set(c12);
                    ((TaskCompletionSource) atomicReference2.get()).trySetResult(c12);
                }
                s sVar2 = (s) bVar2.g;
                Task task2 = sVar2.h.getTask();
                synchronized (sVar2.c) {
                    task = sVar2.d.getTask();
                }
                ExecutorService executorService = x.a;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                w wVar = new w(0, taskCompletionSource);
                task2.continueWith(a12, wVar);
                task.continueWith(a12, wVar);
                onSuccessTask = taskCompletionSource.getTask().onSuccessTask(a12, new a6.i(bVar2, 17));
            } else {
                atomicReference3.set(c10);
                ((TaskCompletionSource) atomicReference2.get()).trySetResult(c10);
                onSuccessTask = Tasks.forResult(null);
            }
            onSuccessTask.continueWith(a12, new pb.a(23));
            com.google.firebase.messaging.s sVar3 = pVar.l;
            ca.c cVar4 = pVar.h;
            Context context2 = pVar.a;
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
                pVar.e = new x9.l("crash_marker", cVar4);
                pVar.d = new x9.l("initialization_marker", cVar4);
                t3 t3Var = new t3(str15, cVar4, sVar3);
                y9.e eVar2 = new y9.e(cVar4);
                fa.a[] aVarArr = new fa.a[1];
                boolean z12 = false;
                aVarArr[0] = new sb.a(8);
                qf.b bVar3 = new qf.b(aVarArr);
                ((p) pVar.o.b).a(new a(7));
                x9.a aVar5 = aVar;
                com.google.firebase.messaging.m k10 = com.google.firebase.messaging.m.k(pVar.a, pVar.g, pVar.h, aVar5, eVar2, t3Var, bVar3, bVar2, pVar.c, pVar.m);
                bVar = bVar2;
                pVar.f = new n(pVar.a, pVar.l, pVar.g, pVar.b, pVar.h, pVar.e, aVar5, t3Var, eVar2, k10, pVar.n, pVar.j, pVar.m);
                x9.l lVar2 = pVar.d;
                ca.c cVar5 = (ca.c) lVar2.b;
                String str16 = (String) lVar2.a;
                cVar5.getClass();
                exists = new File(cVar5.b, str16).exists();
                z11 = true;
                z11 = true;
                Boolean.TRUE.equals((Boolean) x.a(sVar3.v(new o(pVar, z11 ? 1 : 0))));
                n nVar = pVar.f;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                nVar.e.v(new u4.f(2, nVar, str15));
                r rVar = new r(new v1.b(nVar), bVar, defaultUncaughtExceptionHandler, nVar.j);
                nVar.n = rVar;
                Thread.setDefaultUncaughtExceptionHandler(rVar);
                if (exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "Successfully configured exception handler.", null);
                    }
                    Tasks.call(a12, new t9.b(z11, pVar, bVar));
                    return new t9.c(pVar);
                }
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                }
                pVar.b(bVar);
                z11 = z12;
                Tasks.call(a12, new t9.b(z11, pVar, bVar));
                return new t9.c(pVar);
            }
            aVar = a11;
            z10 = true;
            String str142 = aVar.b;
            if (z10) {
            }
            new x9.f(pVar.g);
            String str152 = x9.f.b;
            pVar.e = new x9.l("crash_marker", cVar4);
            pVar.d = new x9.l("initialization_marker", cVar4);
            t3 t3Var2 = new t3(str152, cVar4, sVar3);
            y9.e eVar22 = new y9.e(cVar4);
            fa.a[] aVarArr2 = new fa.a[1];
            boolean z122 = false;
            aVarArr2[0] = new sb.a(8);
            qf.b bVar32 = new qf.b(aVarArr2);
            ((p) pVar.o.b).a(new a(7));
            x9.a aVar52 = aVar;
            com.google.firebase.messaging.m k102 = com.google.firebase.messaging.m.k(pVar.a, pVar.g, pVar.h, aVar52, eVar22, t3Var2, bVar32, bVar2, pVar.c, pVar.m);
            bVar = bVar2;
            pVar.f = new n(pVar.a, pVar.l, pVar.g, pVar.b, pVar.h, pVar.e, aVar52, t3Var2, eVar22, k102, pVar.n, pVar.j, pVar.m);
            x9.l lVar22 = pVar.d;
            ca.c cVar52 = (ca.c) lVar22.b;
            String str162 = (String) lVar22.a;
            cVar52.getClass();
            exists = new File(cVar52.b, str162).exists();
            z11 = true;
            z11 = true;
            Boolean.TRUE.equals((Boolean) x.a(sVar3.v(new o(pVar, z11 ? 1 : 0))));
            n nVar2 = pVar.f;
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
            nVar2.e.v(new u4.f(2, nVar2, str152));
            r rVar2 = new r(new v1.b(nVar2), bVar, defaultUncaughtExceptionHandler2, nVar2.j);
            nVar2.n = rVar2;
            Thread.setDefaultUncaughtExceptionHandler(rVar2);
            if (exists) {
            }
            if (Log.isLoggable(str2, 3)) {
            }
            Tasks.call(a12, new t9.b(z11, pVar, bVar));
            return new t9.c(pVar);
        } catch (PackageManager.NameNotFoundException e15) {
            Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e15);
            return null;
        }
    }

    @Override // e2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 5:
                ((a1) obj).b.release();
                break;
            default:
                ((ExecutorService) obj).shutdown();
                break;
        }
    }

    @Override // d9.k
    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                return ((c3.o) obj).b().getClass().getSimpleName();
            case 4:
                return n0.u(e9.s.x(((e0) obj).o().b, new a(6)));
            case 6:
                return Integer.valueOf(((q1) obj).c);
            case 19:
                return Long.valueOf(((z3.b) obj).b);
            case 20:
                return Long.valueOf(((z3.b) obj).c);
            case 21:
                return (q) obj;
            default:
                r1 r1Var = (r1) obj;
                r1Var.getClass();
                Bundle bundle = new Bundle();
                String str = r1.e;
                x1 x1Var = r1Var.b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(x1Var.d);
                l0 listIterator = x1Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(((q1) listIterator.next()).c());
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

    @Override // org.telegram.ui.Components.qd0
    public String e(int i10) {
        switch (this.a) {
            case 9:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(a2 a2Var, int i10) {
        switch (this.a) {
            case 8:
                break;
            case 11:
                a2Var.dismiss();
                break;
            case 12:
                a2Var.dismiss();
                break;
            case 27:
                a2Var.dismiss();
                break;
            default:
                a2Var.dismiss();
                break;
        }
    }

    @Override // qa.a
    public void h(qa.b bVar) {
        switch (this.a) {
            case 1:
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

    @Override // r9.d
    public Object n2(z5 z5Var) {
        switch (this.a) {
            case 2:
                return a(z5Var);
            default:
                Set w9 = z5Var.w(ya.a.class);
                ya.c cVar = ya.c.c;
                if (cVar == null) {
                    synchronized (ya.c.class) {
                        try {
                            cVar = ya.c.c;
                            if (cVar == null) {
                                cVar = new ya.c(0);
                                ya.c.c = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new ya.b(w9, cVar);
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        int i10 = f4.k0;
        return 0;
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

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
    }

    private final void c(a2 a2Var, int i10) {
    }
}
