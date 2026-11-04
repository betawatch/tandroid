package z9;

import ai.t1;
import ai.z3;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import android.os.ProfilingTrigger;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import ca.c0;
import ca.d0;
import ca.d1;
import ca.e0;
import ca.e1;
import ca.f0;
import ca.g0;
import ca.m0;
import ca.m1;
import ca.n0;
import ca.o0;
import ca.o1;
import ca.q0;
import ca.q1;
import ca.r1;
import ca.s0;
import ca.s1;
import ca.t0;
import ca.t2;
import ca.u2;
import ca.v0;
import ca.w0;
import ca.z0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.function.Supplier;
import k2.p1;
import m.o3;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m {
    public static final fa.a r = new fa.a(3);
    public static final Charset s = Charset.forName("UTF-8");
    public final Context a;
    public final s b;
    public final w9.b c;
    public final o3 d;
    public final aa.g e;
    public final v f;
    public final fa.f g;
    public final a h;
    public final ba.f i;
    public final w9.a j;
    public final x9.a k;
    public final i l;
    public final x m;
    public r n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public m(Context context, v vVar, s sVar, fa.f fVar, w9.b bVar, a aVar, o3 o3Var, ba.f fVar2, x xVar, w9.a aVar2, x9.a aVar3, i iVar, aa.g gVar) {
        new AtomicBoolean(false);
        this.a = context;
        this.f = vVar;
        this.b = sVar;
        this.g = fVar;
        this.c = bVar;
        this.h = aVar;
        this.d = o3Var;
        this.i = fVar2;
        this.j = aVar2;
        this.k = aVar3;
        this.l = iVar;
        this.m = xVar;
        this.e = gVar;
    }

    public static void a(m mVar, String str, ProfilingResult profilingResult) {
        int triggerType = profilingResult.getTriggerType();
        String str2 = triggerType == 8 ? "trigger-type-anomaly" : triggerType == 7 ? "trigger-type-oom" : "trigger-type-unknown";
        try {
            if (mVar.g.b(str, str2).createNewFile()) {
                return;
            }
            String str3 = "Trigger file " + str2 + " exists for session: " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        } catch (IOException unused) {
            Log.e("FirebaseCrashlytics", "Unable to touch trigger file ".concat(str2), null);
        }
    }

    public static Task b(m mVar) {
        Task call;
        mVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : fa.f.i(((File) mVar.g.d).listFiles(r))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    call = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new l(mVar, parseLong));
                }
                arrayList.add(call);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25, types: [int] */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z10, ha.c cVar, boolean z11) {
        ArrayList arrayList;
        int i3;
        int i10;
        boolean z12;
        String str;
        m0 a10;
        d0 a11;
        t2 t2Var;
        boolean z13;
        String[] list;
        Throwable th2;
        List list2;
        String str2;
        String processName;
        int i11;
        List list3;
        InputStream traceInputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        aa.g.a();
        ArrayList arrayList2 = new ArrayList(this.m.b.d());
        if (arrayList2.size() <= z10) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        final String str3 = (String) arrayList2.get(z10 == true ? 1 : 0);
        if (z11 && cVar.b().b.b) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    fa.f fVar = this.g;
                    ba.f fVar2 = new ba.f(fVar);
                    fVar2.b = ba.f.c;
                    if (str3 != null) {
                        fVar2.b = new ba.o(fVar.b(str3, "userlog"));
                    }
                    fa.f fVar3 = this.g;
                    aa.g gVar = this.e;
                    ba.h hVar = new ba.h(fVar3);
                    i3 = 4;
                    o3 o3Var = new o3(str3, fVar3, gVar);
                    i10 = 8;
                    ((ba.e) ((AtomicMarkableReference) ((b4.n) o3Var.d).b).getReference()).d(hVar.c(str3, false));
                    ((ba.e) ((AtomicMarkableReference) ((b4.n) o3Var.e).b).getReference()).d(hVar.c(str3, true));
                    ((AtomicMarkableReference) o3Var.g).set(hVar.d(str3), false);
                    e5.u uVar = (e5.u) o3Var.f;
                    File b10 = fVar3.b(str3, "rollouts-state");
                    if (!b10.exists() || b10.length() == 0) {
                        ba.h.g(b10, "The file has a length of zero for session: " + str3);
                        list2 = Collections.EMPTY_LIST;
                    } else {
                        try {
                            fileInputStream2 = new FileInputStream(b10);
                            try {
                                try {
                                    list2 = ba.h.b(g.j(fileInputStream2));
                                    String str4 = "Loaded rollouts state:\n" + list2 + "\nfor session " + str3;
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", str4, null);
                                    }
                                    g.b(fileInputStream2, "Failed to close rollouts state file.");
                                } catch (Exception e10) {
                                    e = e10;
                                    Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                    ba.h.f(b10);
                                    g.b(fileInputStream2, "Failed to close rollouts state file.");
                                    list2 = Collections.EMPTY_LIST;
                                    synchronized (uVar) {
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                fileInputStream = fileInputStream2;
                                g.b(fileInputStream, "Failed to close rollouts state file.");
                                throw th;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            fileInputStream2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                            fileInputStream = null;
                            g.b(fileInputStream, "Failed to close rollouts state file.");
                            throw th;
                        }
                    }
                    synchronized (uVar) {
                        ((ArrayList) uVar.c).clear();
                        if (list2.size() > uVar.b) {
                            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + uVar.b, null);
                            ((ArrayList) uVar.c).addAll(list2.subList(0, uVar.b));
                        } else {
                            ((ArrayList) uVar.c).addAll(list2);
                        }
                    }
                    x xVar = this.m;
                    ApplicationExitInfo e12 = xVar.e(str3, historicalProcessExitReasons, new t1(6));
                    if (e12 == null) {
                        String f10 = t4.c.f("No relevant ApplicationExitInfo occurred during session: ", str3);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", f10, null);
                        }
                        arrayList = arrayList2;
                    } else {
                        q qVar = xVar.a;
                        try {
                            traceInputStream = e12.getTraceInputStream();
                        } catch (IOException e13) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + e12.toString() + " Error: " + e13, null);
                        }
                        if (traceInputStream != null) {
                            str2 = x.c(traceInputStream);
                            e0 e0Var = new e0();
                            e0Var.d = e12.getImportance();
                            e0Var.j = (byte) (e0Var.j | 4);
                            processName = e12.getProcessName();
                            if (processName != null) {
                                throw new NullPointerException("Null processName");
                            }
                            e0Var.b = processName;
                            e0Var.c = e12.getReason();
                            e0Var.j = (byte) (e0Var.j | 2);
                            e0Var.g = e12.getTimestamp();
                            e0Var.j = (byte) (e0Var.j | 32);
                            e0Var.a = e12.getPid();
                            e0Var.j = (byte) (e0Var.j | 1);
                            e0Var.e = e12.getPss();
                            e0Var.j = (byte) (e0Var.j | 8);
                            e0Var.f = e12.getRss();
                            e0Var.j = (byte) (e0Var.j | 16);
                            e0Var.h = str2;
                            f0 a12 = e0Var.a();
                            int i13 = qVar.a.getResources().getConfiguration().orientation;
                            s0 s0Var = new s0();
                            s0Var.b = "anr";
                            long j10 = a12.g;
                            s0Var.a = j10;
                            s0Var.g = (byte) (s0Var.g | 1);
                            a aVar = qVar.c;
                            if (!qVar.e.b().b.c || aVar.c.size() <= 0) {
                                arrayList = arrayList2;
                                i11 = i13;
                                list3 = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = aVar.c;
                                int size = arrayList4.size();
                                i11 = i13;
                                int i14 = 0;
                                while (i14 < size) {
                                    Object obj = arrayList4.get(i14);
                                    int i15 = i14 + 1;
                                    int i16 = size;
                                    d dVar = (d) obj;
                                    String str5 = dVar.a;
                                    if (str5 == null) {
                                        throw new NullPointerException("Null libraryName");
                                    }
                                    ArrayList arrayList5 = arrayList4;
                                    String str6 = dVar.b;
                                    if (str6 == null) {
                                        throw new NullPointerException("Null arch");
                                    }
                                    String str7 = dVar.c;
                                    if (str7 == null) {
                                        throw new NullPointerException("Null buildId");
                                    }
                                    arrayList3.add(new g0(str6, str5, str7));
                                    size = i16;
                                    i14 = i15;
                                    arrayList4 = arrayList5;
                                    arrayList2 = arrayList2;
                                }
                                arrayList = arrayList2;
                                list3 = DesugarCollections.unmodifiableList(arrayList3);
                            }
                            e0 e0Var2 = new e0();
                            e0Var2.d = a12.d;
                            byte b11 = (byte) (e0Var2.j | 4);
                            e0Var2.j = b11;
                            String str8 = a12.b;
                            if (str8 == null) {
                                throw new NullPointerException("Null processName");
                            }
                            e0Var2.b = str8;
                            e0Var2.c = a12.c;
                            e0Var2.g = j10;
                            e0Var2.a = a12.a;
                            e0Var2.e = a12.e;
                            e0Var2.f = a12.f;
                            e0Var2.j = (byte) (((byte) (((byte) (((byte) (((byte) (b11 | 2)) | 32)) | 1)) | 8)) | 16);
                            e0Var2.h = a12.h;
                            e0Var2.i = list3;
                            f0 a13 = e0Var2.a();
                            Boolean valueOf = Boolean.valueOf(a13.d != 100);
                            String processName2 = a13.b;
                            int i17 = a13.a;
                            int i18 = a13.d;
                            kotlin.jvm.internal.j.e(processName2, "processName");
                            if ((8 & 4) != 0) {
                                i18 = 0;
                            }
                            d1 d1Var = new d1();
                            d1Var.a = processName2;
                            d1Var.b = i17;
                            byte b12 = (byte) (d1Var.e | 1);
                            d1Var.c = i18;
                            d1Var.d = false;
                            d1Var.e = (byte) (((byte) (b12 | 2)) | 4);
                            e1 a14 = d1Var.a();
                            byte b13 = (byte) 1;
                            z0 e14 = q.e();
                            List a15 = qVar.a();
                            if (a15 == null) {
                                throw new NullPointerException("Null binaries");
                            }
                            w0 w0Var = new w0(null, null, a13, null, e14, a15);
                            if (b13 != 1) {
                                StringBuilder sb2 = new StringBuilder();
                                if (b13 == 0) {
                                    sb2.append(" uiOrientation");
                                }
                                throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
                            }
                            s0Var.c = new v0(w0Var, null, null, valueOf, a14, null, i11);
                            s0Var.d = qVar.b(i11);
                            t0 a16 = s0Var.a();
                            String f11 = t4.c.f("Persisting anr for session ", str3);
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", f11, null);
                            }
                            xVar.b.e(x.b(x.a(a16, fVar2, o3Var, Collections.EMPTY_MAP), o3Var), str3, true);
                        }
                        str2 = null;
                        e0 e0Var3 = new e0();
                        e0Var3.d = e12.getImportance();
                        e0Var3.j = (byte) (e0Var3.j | 4);
                        processName = e12.getProcessName();
                        if (processName != null) {
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    i3 = 4;
                    i10 = 8;
                    String f12 = t4.c.f("No ApplicationExitInfo available. Session: ", str3);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", f12, null);
                    }
                }
            } else {
                arrayList = arrayList2;
                i3 = 4;
                i10 = 8;
                String i19 = p1.i(i12, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", i19, null);
                }
            }
        } else {
            arrayList = arrayList2;
            i3 = 4;
            i10 = 8;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
            }
        }
        if (z11 && this.j.c(str3)) {
            String f13 = t4.c.f("Finalizing native report for session ", str3);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                th2 = null;
                Log.v("FirebaseCrashlytics", f13, null);
            } else {
                th2 = null;
            }
            this.j.a(str3).getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str3, th2);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str3, th2);
            Log.w("FirebaseCrashlytics", "No native core present", th2);
        }
        if (Build.VERSION.SDK_INT >= 37) {
            ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
            fa.f fVar4 = this.g;
            fa.a aVar2 = new fa.a(4);
            fVar4.getClass();
            File file = new File((File) fVar4.e, str3);
            file.mkdirs();
            List list4 = (List) Collection.-EL.stream(fa.f.i(file.listFiles(aVar2))).map(new fa.b(15)).filter(new t1(5)).collect(Collectors.toList());
            final List<ApplicationExitInfo> historicalProcessExitReasons2 = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
            final x xVar2 = this.m;
            xVar2.getClass();
            Collection.-EL.stream(list4).findFirst().or(new Supplier() { // from class: z9.w
                @Override // java.util.function.Supplier
                public final Object get() {
                    return x.this.e(str3, historicalProcessExitReasons2, new t1(7)) != null ? Optional.of(7) : Optional.empty();
                }
            }).ifPresent(new bi.d0(2, xVar2, str3));
        }
        if (z10 != 0) {
            z12 = false;
            str = (String) arrayList.get(0);
        } else {
            z12 = false;
            this.l.b(null);
            str = null;
        }
        x xVar3 = this.m;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        fa.d dVar2 = xVar3.b;
        fa.f fVar5 = dVar2.b;
        fVar5.a(".com.google.firebase.crashlytics");
        fVar5.a(".com.google.firebase.crashlytics-ndk");
        if (!((String) fVar5.b).isEmpty()) {
            fVar5.a(".com.google.firebase.crashlytics.files.v1");
            final String str9 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file2 = (File) fVar5.c;
            if (file2.exists() && (list = file2.list(new FilenameFilter() { // from class: fa.e
                @Override // java.io.FilenameFilter
                public final boolean accept(File file3, String str10) {
                    return str10.startsWith(str9);
                }
            })) != null) {
                int length = list.length;
                for (?? r11 = z12; r11 < length; r11++) {
                    fVar5.a(list[r11]);
                }
            }
        }
        NavigableSet<String> d = dVar2.d();
        if (str != null) {
            d.remove(str);
        }
        int i20 = i10;
        if (d.size() > i20) {
            while (d.size() > i20) {
                String str10 = (String) d.last();
                String f14 = t4.c.f("Removing session over cap: ", str10);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", f14, null);
                }
                fa.f.h(new File((File) fVar5.e, str10));
                d.remove(str10);
            }
        }
        for (String str11 : d) {
            String f15 = t4.c.f("Finalizing report for session ", str11);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", f15, null);
            }
            da.a aVar3 = fa.d.g;
            fa.a aVar4 = fa.d.i;
            File file3 = new File((File) fVar5.e, str11);
            file3.mkdirs();
            List<File> i21 = fa.f.i(file3.listFiles(aVar4));
            if (i21.isEmpty()) {
                String q10 = a1.g.q("Session ", str11, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", q10, null);
                }
            } else {
                Collections.sort(i21);
                ArrayList arrayList6 = new ArrayList();
                boolean z14 = z12;
                for (File file4 : i21) {
                    try {
                        String f16 = fa.d.f(file4);
                        aVar3.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(f16));
                            try {
                                t0 e15 = da.a.e(jsonReader);
                                jsonReader.close();
                                arrayList6.add(dVar2.a(str11, e15));
                            } finally {
                            }
                        } catch (IllegalStateException e16) {
                            throw new IOException(e16);
                        }
                    } catch (IOException e17) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file4, e17);
                    }
                    if (!z14) {
                        String name = file4.getName();
                        if (!name.startsWith("event") || !name.endsWith("_")) {
                            z13 = false;
                            z14 = z13;
                        }
                    }
                    z13 = true;
                    z14 = z13;
                }
                if (arrayList6.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str11, null);
                } else {
                    String d10 = new ba.h(fVar5).d(str11);
                    String a17 = dVar2.d.a(str11);
                    File b14 = fVar5.b(str11, "report");
                    try {
                        String f17 = fa.d.f(b14);
                        aVar3.getClass();
                        d0 j11 = da.a.j(f17);
                        c0 a18 = j11.a();
                        t2 t2Var2 = j11.k;
                        if (t2Var2 != null) {
                            try {
                                a10 = t2Var2.a();
                                a10.e = Long.valueOf(currentTimeMillis);
                                a10.f = z14;
                            } catch (IOException e18) {
                                e = e18;
                            }
                            try {
                                a10.m = (byte) (a10.m | 2);
                                if (d10 != null) {
                                    a10.h = new o1(d10);
                                }
                                a18.j = a10.a();
                            } catch (IOException e19) {
                                e = e19;
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b14, e);
                                fa.f.h(new File((File) fVar5.e, str11));
                                z12 = false;
                            }
                        }
                        d0 a19 = a18.a();
                        c0 a20 = a19.a();
                        a20.g = a17;
                        t2 t2Var3 = a19.k;
                        if (t2Var3 != null) {
                            m0 a21 = t2Var3.a();
                            a21.c = a17;
                            a20.j = a21.a();
                        }
                        a11 = a20.a();
                        t2Var = a11.k;
                    } catch (IOException e20) {
                        e = e20;
                    }
                    if (t2Var == null) {
                        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                    }
                    c0 a22 = a11.a();
                    m0 a23 = t2Var.a();
                    a23.k = arrayList6;
                    a22.j = a23.a();
                    d0 a24 = a22.a();
                    t2 t2Var4 = a24.k;
                    if (t2Var4 != null) {
                        String str12 = "appQualitySessionId: " + a17;
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                try {
                                    Log.d("FirebaseCrashlytics", str12, null);
                                } catch (IOException e21) {
                                    e = e21;
                                }
                            }
                            fa.d.g(z14 ? new File((File) fVar5.h, ((n0) t2Var4).b) : new File((File) fVar5.f, ((n0) t2Var4).b), da.a.a.d2(a24));
                        } catch (IOException e22) {
                            e = e22;
                        }
                    }
                    fa.f.h(new File((File) fVar5.e, str11));
                    z12 = false;
                    e = e21;
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b14, e);
                    fa.f.h(new File((File) fVar5.e, str11));
                    z12 = false;
                }
            }
            fa.f.h(new File((File) fVar5.e, str11));
            z12 = false;
        }
        a7.l lVar = dVar2.c.b().a;
        ArrayList c2 = dVar2.c();
        int size2 = c2.size();
        int i22 = i3;
        if (size2 <= i22) {
            return;
        }
        Iterator it = c2.subList(i22, size2).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public final void d(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        String str5;
        int i3;
        Integer num;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String f10 = t4.c.f("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", f10, null);
        }
        Locale locale = Locale.US;
        v vVar = this.f;
        a aVar = this.h;
        q1 q1Var = new q1(vVar.c, aVar.f, aVar.g, vVar.c().a, t4.c.b(aVar.d != null ? 4 : 1), aVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        s1 s1Var = new s1(g.h());
        Context context = this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        f fVar = f.a;
        String str8 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str8)) {
            f fVar2 = (f) f.b.get(str8.toLowerCase(locale));
            if (fVar2 != null) {
                fVar = fVar2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int ordinal = fVar.ordinal();
        String str9 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long a10 = g.a(context);
        boolean g7 = g.g();
        int d = g.d();
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        this.j.d(str, currentTimeMillis, new ca.p1(q1Var, s1Var, new r1(ordinal, availableProcessors, d, a10, blockCount, g7)));
        if (!bool.booleanValue() || str == null) {
            str2 = str7;
            str3 = str10;
            str4 = str11;
            str5 = str9;
            i3 = 4;
        } else {
            o3 o3Var = this.d;
            synchronized (((String) o3Var.c)) {
                o3Var.c = str;
                str4 = str11;
                str5 = str9;
                str2 = str7;
                str3 = str10;
                i3 = 4;
                ((aa.g) o3Var.b).b.a(new z3(o3Var, str, ((ba.e) ((AtomicMarkableReference) ((b4.n) o3Var.d).b).getReference()).a(), ((e5.u) o3Var.f).l(), 2));
            }
        }
        ba.f fVar3 = this.i;
        ((ba.d) fVar3.b).b();
        fVar3.b = ba.f.c;
        if (str != null) {
            fVar3.b = new ba.o(((fa.f) fVar3.a).b(str, "userlog"));
        }
        this.l.b(str);
        x xVar = this.m;
        q qVar = xVar.a;
        Charset charset = u2.a;
        c0 c0Var = new c0();
        c0Var.a = "20.1.1";
        a aVar2 = qVar.c;
        String str12 = aVar2.a;
        if (str12 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        c0Var.b = str12;
        v vVar2 = qVar.b;
        String str13 = vVar2.c().a;
        if (str13 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        c0Var.d = str13;
        c0Var.e = vVar2.c().b;
        c0Var.f = vVar2.c().c;
        String str14 = aVar2.f;
        if (str14 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        c0Var.h = str14;
        String str15 = aVar2.g;
        if (str15 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        c0Var.i = str15;
        c0Var.c = i3;
        c0Var.m = (byte) (c0Var.m | 1);
        m0 m0Var = new m0();
        m0Var.f = false;
        byte b10 = (byte) (m0Var.m | 2);
        m0Var.d = currentTimeMillis;
        m0Var.m = (byte) (b10 | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        m0Var.b = str;
        String str16 = q.g;
        if (str16 == null) {
            throw new NullPointerException("Null generator");
        }
        m0Var.a = str16;
        String str17 = vVar2.c;
        if (str17 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str18 = vVar2.c().a;
        w9.b bVar = aVar2.h;
        if (((e5.a) bVar.c) == null) {
            bVar.c = new e5.a(bVar);
        }
        e5.a aVar3 = (e5.a) bVar.c;
        String str19 = aVar3.b;
        if (aVar3 == null) {
            bVar.c = new e5.a(bVar);
        }
        m0Var.g = new o0(str17, str14, str15, str18, str19, ((e5.a) bVar.c).c);
        m1 m1Var = new m1();
        m1Var.a = 3;
        m1Var.e = (byte) (m1Var.e | 1);
        if (str6 == null) {
            throw new NullPointerException("Null version");
        }
        m1Var.b = str6;
        if (str2 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        m1Var.c = str2;
        m1Var.d = g.h();
        m1Var.e = (byte) (m1Var.e | 2);
        m0Var.i = m1Var.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int i10 = 7;
        if (!TextUtils.isEmpty(str8) && (num = (Integer) q.f.get(str8.toLowerCase(locale))) != null) {
            i10 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long a11 = g.a(qVar.a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean g10 = g.g();
        int d10 = g.d();
        q0 q0Var = new q0();
        q0Var.a = i10;
        byte b11 = (byte) (q0Var.j | 1);
        q0Var.j = b11;
        if (str5 == null) {
            throw new NullPointerException("Null model");
        }
        q0Var.b = str5;
        q0Var.c = availableProcessors2;
        q0Var.d = a11;
        q0Var.e = blockCount2;
        q0Var.f = g10;
        q0Var.g = d10;
        q0Var.j = (byte) (((byte) (((byte) (((byte) (((byte) (b11 | 2)) | 4)) | 8)) | 16)) | 32);
        String str20 = str3;
        if (str20 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        q0Var.h = str20;
        String str21 = str4;
        if (str21 == null) {
            throw new NullPointerException("Null modelClass");
        }
        q0Var.i = str21;
        m0Var.j = q0Var.a();
        m0Var.l = 3;
        m0Var.m = (byte) (m0Var.m | 4);
        c0Var.j = m0Var.a();
        d0 a12 = c0Var.a();
        fa.f fVar4 = xVar.b.b;
        t2 t2Var = a12.k;
        if (t2Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str22 = ((n0) t2Var).b;
        try {
            fa.d.g.getClass();
            fa.d.g(fVar4.b(str22, "report"), da.a.a.d2(a12));
            File b12 = fVar4.b(str22, "start-time");
            long j10 = ((n0) t2Var).d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), fa.d.e);
            try {
                outputStreamWriter.write("");
                b12.setLastModified(j10 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e10) {
            String f11 = t4.c.f("Could not persist report for session ", str22);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", f11, e10);
            }
        }
    }

    public final void e(String str) {
        ExecutorService executorService = this.e.b.a;
        ProfilingManager profilingManager = (ProfilingManager) this.a.getSystemService(ProfilingManager.class);
        int i3 = 1;
        Object[] objArr = {new ProfilingTrigger.Builder(7).build(), new ProfilingTrigger.Builder(8).build()};
        ArrayList arrayList = new ArrayList(2);
        for (int i10 = 0; i10 < 2; i10++) {
            Object obj = objArr[i10];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        profilingManager.addProfilingTriggers(DesugarCollections.unmodifiableList(arrayList));
        profilingManager.registerForAllProfilingResults(executorService, new bi.d0(i3, this, str));
    }

    public final boolean f(ha.c cVar) {
        aa.g.a();
        r rVar = this.n;
        if (rVar != null && rVar.e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            c(true, cVar, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    public final String g() {
        NavigableSet d = this.m.b.d();
        if (d.isEmpty()) {
            return null;
        }
        return (String) d.first();
    }

    public final String h() {
        InputStream resourceAsStream;
        Context context = this.a;
        int e10 = g.e(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = e10 == 0 ? null : context.getResources().getString(e10);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(s), 0);
        }
        ClassLoader classLoader = m.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = resourceAsStream.read(bArr);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String encodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return encodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                resourceAsStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void i() {
        try {
            String h = h();
            if (h != null) {
                try {
                    ((b4.n) this.d.e).B("com.crashlytics.version-control-info", h);
                } catch (IllegalArgumentException e10) {
                    Context context = this.a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e10;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e11) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e11);
        }
    }

    public final void j(Task task) {
        Task task2;
        Task a10;
        TaskCompletionSource taskCompletionSource = this.o;
        fa.f fVar = this.m.b.b;
        if (fa.f.i(((File) fVar.f).listFiles()).isEmpty() && fa.f.i(((File) fVar.h).listFiles()).isEmpty() && fa.f.i(((File) fVar.n).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        w9.c cVar = w9.c.a;
        cVar.c("Crash reports are available to be sent.");
        s sVar = this.b;
        if (sVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            a10 = Tasks.forResult(Boolean.TRUE);
        } else {
            cVar.b("Automatic data collection is disabled.");
            cVar.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (sVar.c) {
                task2 = sVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new mb.b(29));
            cVar.b("Waiting for send/deleteUnsentReports to be called.");
            a10 = aa.b.a(onSuccessTask, this.p.getTask());
        }
        a10.onSuccessTask(this.e.a, new ua.b(this, task, false, 9));
    }
}
