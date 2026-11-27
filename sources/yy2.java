// default package

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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class yy2 {
    public static final sy2 r = new sy2((byte) 1);
    public static final Charset s = Charset.forName("UTF-8");
    public final Context a;
    public final p63 b;
    public final lh2 c;
    public final gd4 d;
    public final rx6 e;
    public final yl5 f;
    public final gd4 g;
    public final er h;
    public final lh2 i;
    public final az2 j;
    public final sj k;
    public final ty2 l;
    public final faa m;
    public h03 n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public yy2(Context context, yl5 yl5Var, p63 p63Var, gd4 gd4Var, lh2 lh2Var, er erVar, gd4 gd4Var2, lh2 lh2Var2, faa faaVar, az2 az2Var, sj sjVar, ty2 ty2Var, rx6 rx6Var) {
        new AtomicBoolean(false);
        this.a = context;
        this.f = yl5Var;
        this.b = p63Var;
        this.g = gd4Var;
        this.c = lh2Var;
        this.h = erVar;
        this.d = gd4Var2;
        this.i = lh2Var2;
        this.j = az2Var;
        this.k = sjVar;
        this.l = ty2Var;
        this.m = faaVar;
        this.e = rx6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22, types: [int] */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z, oy8 oy8Var, boolean z2) {
        ArrayList arrayList;
        int i;
        byte b;
        boolean z3;
        String str;
        boolean z4;
        String[] list;
        List list2;
        String str2;
        String processName;
        int i2;
        List list3;
        InputStream traceInputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        rx6.v();
        ArrayList arrayList2 = new ArrayList(this.m.b.d());
        if (arrayList2.size() <= z) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        final String str3 = (String) arrayList2.get(z == true ? 1 : 0);
        if (z2 && oy8Var.c().b.b) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    gd4 gd4Var = this.g;
                    lh2 lh2Var = new lh2(gd4Var);
                    lh2Var.c = lh2.f;
                    if (str3 != null) {
                        lh2Var.c = new p09(gd4Var.b(str3, "userlog"));
                    }
                    gd4 gd4Var2 = this.g;
                    rx6 rx6Var = this.e;
                    qf7 qf7Var = new qf7(gd4Var2);
                    i = 8;
                    gd4 gd4Var3 = new gd4(str3, gd4Var2, rx6Var);
                    b = 4;
                    ((vx5) ((AtomicMarkableReference) ((vh4) gd4Var3.d).b).getReference()).d(qf7Var.c(str3, false));
                    ((vx5) ((AtomicMarkableReference) ((vh4) gd4Var3.e).b).getReference()).d(qf7Var.c(str3, true));
                    ((AtomicMarkableReference) gd4Var3.g).set(qf7Var.d(str3), false);
                    qh2 qh2Var = (qh2) gd4Var3.f;
                    File b2 = gd4Var2.b(str3, "rollouts-state");
                    if (!b2.exists() || b2.length() == 0) {
                        qf7.g(b2, "The file has a length of zero for session: " + str3);
                        list2 = Collections.EMPTY_LIST;
                    } else {
                        try {
                            fileInputStream2 = new FileInputStream(b2);
                            try {
                                try {
                                    list2 = qf7.b(jn2.l(fileInputStream2));
                                    String str4 = "Loaded rollouts state:\n" + list2 + "\nfor session " + str3;
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", str4, null);
                                    }
                                    jn2.b(fileInputStream2, "Failed to close rollouts state file.");
                                } catch (Exception e) {
                                    e = e;
                                    Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                    qf7.f(b2);
                                    jn2.b(fileInputStream2, "Failed to close rollouts state file.");
                                    list2 = Collections.EMPTY_LIST;
                                    synchronized (qh2Var) {
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStream2;
                                jn2.b(fileInputStream, "Failed to close rollouts state file.");
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            fileInputStream2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = null;
                            jn2.b(fileInputStream, "Failed to close rollouts state file.");
                            throw th;
                        }
                    }
                    synchronized (qh2Var) {
                        qh2Var.a.clear();
                        if (list2.size() > 128) {
                            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: 128", null);
                            qh2Var.a.addAll(list2.subList(0, 128));
                        } else {
                            qh2Var.a.addAll(list2);
                        }
                    }
                    faa faaVar = this.m;
                    ApplicationExitInfo e3 = faaVar.e(str3, historicalProcessExitReasons, new eh((byte) 6));
                    if (e3 == null) {
                        String i4 = c00.i("No relevant ApplicationExitInfo occurred during session: ", str3);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", i4, null);
                        }
                        arrayList = arrayList2;
                    } else {
                        d03 d03Var = faaVar.a;
                        try {
                            traceInputStream = e3.getTraceInputStream();
                        } catch (IOException e4) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + e3.toString() + " Error: " + e4, null);
                        }
                        if (traceInputStream != null) {
                            str2 = faa.c(traceInputStream);
                            e80 e80Var = new e80();
                            e80Var.d = e3.getImportance();
                            e80Var.j = (byte) (e80Var.j | 4);
                            processName = e3.getProcessName();
                            if (processName != null) {
                                p3d.h("Null processName");
                                return;
                            }
                            e80Var.b = processName;
                            e80Var.c = e3.getReason();
                            e80Var.j = (byte) (e80Var.j | 2);
                            e80Var.g = e3.getTimestamp();
                            e80Var.j = (byte) (e80Var.j | 32);
                            e80Var.a = e3.getPid();
                            e80Var.j = (byte) (e80Var.j | 1);
                            e80Var.e = e3.getPss();
                            e80Var.j = (byte) (e80Var.j | 8);
                            e80Var.f = e3.getRss();
                            e80Var.j = (byte) (e80Var.j | 16);
                            e80Var.h = str2;
                            f80 a = e80Var.a();
                            int i5 = d03Var.a.getResources().getConfiguration().orientation;
                            s80 s80Var = new s80();
                            s80Var.b = "anr";
                            long j = a.g;
                            s80Var.a = j;
                            s80Var.g = (byte) (s80Var.g | 1);
                            er erVar = d03Var.c;
                            if (!d03Var.e.c().b.c || erVar.c.size() <= 0) {
                                arrayList = arrayList2;
                                i2 = i5;
                                list3 = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = erVar.c;
                                int size = arrayList4.size();
                                i2 = i5;
                                int i6 = 0;
                                while (i6 < size) {
                                    Object obj = arrayList4.get(i6);
                                    int i7 = i6 + 1;
                                    int i8 = size;
                                    d11 d11Var = (d11) obj;
                                    String str5 = d11Var.a;
                                    if (str5 == null) {
                                        p3d.h("Null libraryName");
                                        return;
                                    }
                                    ArrayList arrayList5 = arrayList4;
                                    String str6 = d11Var.b;
                                    if (str6 == null) {
                                        p3d.h("Null arch");
                                        return;
                                    }
                                    String str7 = d11Var.c;
                                    if (str7 == null) {
                                        p3d.h("Null buildId");
                                        return;
                                    }
                                    arrayList3.add(new g80(str6, str5, str7));
                                    size = i8;
                                    i6 = i7;
                                    arrayList4 = arrayList5;
                                    arrayList2 = arrayList2;
                                }
                                arrayList = arrayList2;
                                list3 = DesugarCollections.unmodifiableList(arrayList3);
                            }
                            e80 e80Var2 = new e80();
                            e80Var2.d = a.d;
                            byte b3 = (byte) (e80Var2.j | 4);
                            e80Var2.j = b3;
                            String str8 = a.b;
                            if (str8 == null) {
                                p3d.h("Null processName");
                                return;
                            }
                            e80Var2.b = str8;
                            e80Var2.c = a.c;
                            e80Var2.g = j;
                            e80Var2.a = a.a;
                            e80Var2.e = a.e;
                            e80Var2.f = a.f;
                            e80Var2.j = (byte) (((byte) (((byte) (((byte) (((byte) (b3 | 2)) | 32)) | 1)) | 8)) | 16);
                            e80Var2.h = a.h;
                            e80Var2.i = list3;
                            f80 a2 = e80Var2.a();
                            int i9 = a2.d;
                            Boolean valueOf = Boolean.valueOf(i9 != 100);
                            String str9 = a2.b;
                            int i10 = a2.a;
                            str9.getClass();
                            ae5 ae5Var = new ae5();
                            ae5Var.e = str9;
                            ae5Var.a = i10;
                            byte b4 = (byte) (ae5Var.d | 1);
                            ae5Var.b = i9;
                            ae5Var.c = false;
                            ae5Var.d = (byte) (((byte) (b4 | 2)) | 4);
                            d90 a3 = ae5Var.a();
                            z80 e5 = d03.e();
                            List a4 = d03Var.a();
                            if (a4 == null) {
                                p3d.h("Null binaries");
                                return;
                            }
                            s80Var.c = new v80(new w80(null, null, a2, null, e5, a4), null, null, valueOf, a3, null, i2);
                            s80Var.d = d03Var.b(i2);
                            t80 a5 = s80Var.a();
                            String i11 = c00.i("Persisting anr for session ", str3);
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", i11, null);
                            }
                            faaVar.b.e(faa.b(faa.a(a5, lh2Var, gd4Var3, Collections.EMPTY_MAP), gd4Var3), str3, true);
                        }
                        str2 = null;
                        e80 e80Var3 = new e80();
                        e80Var3.d = e3.getImportance();
                        e80Var3.j = (byte) (e80Var3.j | 4);
                        processName = e3.getProcessName();
                        if (processName != null) {
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    i = 8;
                    b = 4;
                    String i12 = c00.i("No ApplicationExitInfo available. Session: ", str3);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", i12, null);
                    }
                }
            } else {
                arrayList = arrayList2;
                i = 8;
                b = 4;
                String k = uh9.k(i3, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", k, null);
                }
            }
        } else {
            arrayList = arrayList2;
            i = 8;
            b = 4;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
            }
        }
        if (z2 && this.j.c()) {
            String i13 = c00.i("Finalizing native report for session ", str3);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", i13, null);
            }
            this.j.a().getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str3, null);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str3, null);
            Log.w("FirebaseCrashlytics", "No native core present", null);
        }
        if (Build.VERSION.SDK_INT >= 37) {
            ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
            gd4 gd4Var4 = this.g;
            sy2 sy2Var = new sy2((byte) 2);
            File file = new File((File) gd4Var4.d, str3);
            file.mkdirs();
            List list4 = (List) Collection.-EL.stream(gd4.e(file.listFiles(sy2Var))).map(new yz(b)).filter(new eh((byte) 3)).collect(Collectors.toList());
            final List<ApplicationExitInfo> historicalProcessExitReasons2 = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
            final faa faaVar2 = this.m;
            Collection.-EL.stream(list4).findFirst().or(new Supplier() { // from class: eaa
                @Override // java.util.function.Supplier
                public final Object get() {
                    return faa.this.e(str3, historicalProcessExitReasons2, new eh((byte) 7)) != null ? Optional.of(7) : Optional.empty();
                }
            }).ifPresent(new vy2(faaVar2, str3, (byte) 3));
        }
        if (z != 0) {
            z3 = false;
            str = (String) arrayList.get(0);
        } else {
            z3 = false;
            this.l.b(null);
            str = null;
        }
        faa faaVar3 = this.m;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        g03 g03Var = faaVar3.b;
        gd4 gd4Var5 = g03Var.b;
        gd4Var5.a(".com.google.firebase.crashlytics");
        gd4Var5.a(".com.google.firebase.crashlytics-ndk");
        if (!((String) gd4Var5.a).isEmpty()) {
            gd4Var5.a(".com.google.firebase.crashlytics.files.v1");
            final String str10 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file2 = (File) gd4Var5.b;
            if (file2.exists() && (list = file2.list(new FilenameFilter() { // from class: fd4
                @Override // java.io.FilenameFilter
                public final boolean accept(File file3, String str11) {
                    return str11.startsWith(str10);
                }
            })) != null) {
                int length = list.length;
                for (?? r10 = z3; r10 < length; r10++) {
                    gd4Var5.a(list[r10]);
                }
            }
        }
        NavigableSet<String> d = g03Var.d();
        if (str != null) {
            d.remove(str);
        }
        int i14 = i;
        if (d.size() > i14) {
            while (d.size() > i14) {
                String str11 = (String) d.last();
                String i15 = c00.i("Removing session over cap: ", str11);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", i15, null);
                }
                gd4.d(new File((File) gd4Var5.d, str11));
                d.remove(str11);
            }
        }
        for (String str12 : d) {
            String i16 = c00.i("Finalizing report for session ", str12);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", i16, null);
            }
            e03 e03Var = g03.g;
            sy2 sy2Var2 = g03.i;
            File file3 = new File((File) gd4Var5.d, str12);
            file3.mkdirs();
            List<File> e6 = gd4.e(file3.listFiles(sy2Var2));
            if (e6.isEmpty()) {
                String y = qd4.y("Session ", str12, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", y, null);
                }
            } else {
                Collections.sort(e6);
                ArrayList arrayList6 = new ArrayList();
                boolean z5 = z3;
                for (File file4 : e6) {
                    try {
                        String f = g03.f(file4);
                        e03Var.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(f));
                            try {
                                t80 d2 = e03.d(jsonReader);
                                jsonReader.close();
                                arrayList6.add(g03Var.a(str12, d2));
                            } finally {
                            }
                        } catch (IllegalStateException e7) {
                            throw new IOException(e7);
                        }
                    } catch (IOException e8) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file4, e8);
                    }
                    if (!z5) {
                        String name = file4.getName();
                        if (!name.startsWith("event") || !name.endsWith("_")) {
                            z4 = z3;
                            z5 = z4;
                        }
                    }
                    z4 = true;
                    z5 = z4;
                }
                if (arrayList6.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str12, null);
                } else {
                    String d3 = new qf7(gd4Var5).d(str12);
                    String a6 = g03Var.d.a(str12);
                    File b5 = gd4Var5.b(str12, "report");
                    try {
                        String f2 = g03.f(b5);
                        e03Var.getClass();
                        c80 j2 = e03.j(f2);
                        b80 a7 = j2.a();
                        n80 n80Var = j2.k;
                        if (n80Var != null) {
                            m80 a8 = n80Var.a();
                            a8.e = Long.valueOf(currentTimeMillis);
                            a8.f = z5;
                            a8.m = (byte) (a8.m | 2);
                            if (d3 != null) {
                                a8.h = new n90(d3);
                            }
                            a7.j = a8.a();
                        }
                        c80 a9 = a7.a();
                        b80 a10 = a9.a();
                        a10.g = a6;
                        n80 n80Var2 = a9.k;
                        if (n80Var2 != null) {
                            m80 a11 = n80Var2.a();
                            a11.c = a6;
                            a10.j = a11.a();
                        }
                        c80 a12 = a10.a();
                        n80 n80Var3 = a12.k;
                        if (n80Var3 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        b80 a13 = a12.a();
                        m80 a14 = n80Var3.a();
                        a14.k = arrayList6;
                        a13.j = a14.a();
                        c80 a15 = a13.a();
                        n80 n80Var4 = a15.k;
                        if (n80Var4 != null) {
                            String str13 = "appQualitySessionId: " + a6;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str13, null);
                            }
                            g03.g(z5 ? new File((File) gd4Var5.f, n80Var4.b) : new File((File) gd4Var5.e, n80Var4.b), e03.a.O(a15));
                        }
                    } catch (IOException e9) {
                        Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b5, e9);
                    }
                }
            }
            gd4.d(new File((File) gd4Var5.d, str12));
            z3 = false;
        }
        h30 h30Var = g03Var.c.c().a;
        ArrayList c = g03Var.c();
        int size2 = c.size();
        if (size2 > 4) {
            Iterator it = c.subList(4, size2).iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
        }
    }

    public final void b(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        Integer num;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String i2 = c00.i("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", i2, null);
        }
        Locale locale = Locale.US;
        yl5 yl5Var = this.f;
        er erVar = this.h;
        pa0 pa0Var = new pa0(yl5Var.c, erVar.f, erVar.g, yl5Var.c().a, bs2.h(erVar.d != null ? 4 : 1), erVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        ra0 ra0Var = new ra0(jn2.i());
        Context context = this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        hn2 hn2Var = hn2.a;
        String str8 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str8)) {
            hn2 hn2Var2 = (hn2) hn2.b.get(str8.toLowerCase(locale));
            if (hn2Var2 != null) {
                hn2Var = hn2Var2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int ordinal = hn2Var.ordinal();
        String str9 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long a = jn2.a(context);
        boolean h = jn2.h();
        int d = jn2.d();
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        this.j.d(str, currentTimeMillis, new oa0(pa0Var, ra0Var, new qa0(ordinal, availableProcessors, d, a, blockCount, h)));
        if (!bool.booleanValue() || str == null) {
            str2 = str7;
            str3 = str10;
            str4 = str11;
            str5 = str9;
            i = 4;
        } else {
            gd4 gd4Var = this.d;
            synchronized (((String) gd4Var.a)) {
                gd4Var.a = str;
                str4 = str11;
                str5 = str9;
                str2 = str7;
                str3 = str10;
                i = 4;
                ((i03) ((rx6) gd4Var.c).c).a(new kta((Object) gd4Var, (Object) str, (Object) ((vx5) ((AtomicMarkableReference) ((vh4) gd4Var.d).b).getReference()).a(), (Object) ((qh2) gd4Var.f).g(), (byte) 21));
            }
        }
        lh2 lh2Var = this.i;
        ((dc4) lh2Var.c).a();
        lh2Var.c = lh2.f;
        if (str != null) {
            lh2Var.c = new p09(((gd4) lh2Var.b).b(str, "userlog"));
        }
        this.l.b(str);
        faa faaVar = this.m;
        d03 d03Var = faaVar.a;
        Charset charset = c03.a;
        b80 b80Var = new b80();
        b80Var.a = "20.1.1";
        er erVar2 = d03Var.c;
        String str12 = erVar2.a;
        if (str12 == null) {
            p3d.h("Null gmpAppId");
            return;
        }
        b80Var.b = str12;
        yl5 yl5Var2 = d03Var.b;
        String str13 = yl5Var2.c().a;
        if (str13 == null) {
            p3d.h("Null installationUuid");
            return;
        }
        b80Var.d = str13;
        b80Var.e = yl5Var2.c().b;
        b80Var.f = yl5Var2.c().c;
        String str14 = erVar2.f;
        if (str14 == null) {
            p3d.h("Null buildVersion");
            return;
        }
        b80Var.h = str14;
        String str15 = erVar2.g;
        if (str15 == null) {
            p3d.h("Null displayVersion");
            return;
        }
        b80Var.i = str15;
        b80Var.c = i;
        b80Var.m = (byte) (b80Var.m | 1);
        m80 m80Var = new m80();
        m80Var.f = false;
        byte b = (byte) (m80Var.m | 2);
        m80Var.d = currentTimeMillis;
        m80Var.m = (byte) (b | 1);
        if (str == null) {
            p3d.h("Null identifier");
            return;
        }
        m80Var.b = str;
        String str16 = d03.g;
        if (str16 == null) {
            p3d.h("Null generator");
            return;
        }
        m80Var.a = str16;
        String str17 = yl5Var2.c;
        if (str17 == null) {
            p3d.h("Null identifier");
            return;
        }
        qx6 qx6Var = erVar2.h;
        String str18 = yl5Var2.c().a;
        we3 we3Var = (we3) qx6Var.c;
        if (we3Var == null) {
            we3Var = new we3(qx6Var);
            qx6Var.c = we3Var;
        }
        we3 we3Var2 = we3Var;
        String str19 = we3Var.a;
        if (we3Var2 == null) {
            we3Var2 = new we3(qx6Var);
            qx6Var.c = we3Var2;
        }
        m80Var.g = new o80(str17, str14, str15, str18, str19, we3Var2.b);
        l90 l90Var = new l90();
        l90Var.a = 3;
        l90Var.e = (byte) (l90Var.e | 1);
        if (str6 == null) {
            p3d.h("Null version");
            return;
        }
        l90Var.b = str6;
        if (str2 == null) {
            p3d.h("Null buildVersion");
            return;
        }
        l90Var.c = str2;
        l90Var.d = jn2.i();
        l90Var.e = (byte) (l90Var.e | 2);
        m80Var.i = l90Var.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int i3 = 7;
        if (!TextUtils.isEmpty(str8) && (num = (Integer) d03.f.get(str8.toLowerCase(locale))) != null) {
            i3 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long a2 = jn2.a(d03Var.a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean h2 = jn2.h();
        int d2 = jn2.d();
        q80 q80Var = new q80();
        q80Var.a = i3;
        byte b2 = (byte) (q80Var.j | 1);
        q80Var.j = b2;
        if (str5 == null) {
            p3d.h("Null model");
            return;
        }
        q80Var.b = str5;
        q80Var.c = availableProcessors2;
        q80Var.d = a2;
        q80Var.e = blockCount2;
        q80Var.f = h2;
        q80Var.g = d2;
        q80Var.j = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
        String str20 = str3;
        if (str20 == null) {
            p3d.h("Null manufacturer");
            return;
        }
        q80Var.h = str20;
        String str21 = str4;
        if (str21 == null) {
            p3d.h("Null modelClass");
            return;
        }
        q80Var.i = str21;
        m80Var.j = q80Var.a();
        m80Var.l = 3;
        m80Var.m = (byte) (m80Var.m | 4);
        b80Var.j = m80Var.a();
        c80 a3 = b80Var.a();
        gd4 gd4Var2 = faaVar.b.b;
        n80 n80Var = a3.k;
        if (n80Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str22 = n80Var.b;
        try {
            g03.g.getClass();
            g03.g(gd4Var2.b(str22, "report"), e03.a.O(a3));
            File b3 = gd4Var2.b(str22, "start-time");
            long j = n80Var.d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b3), g03.e);
            try {
                outputStreamWriter.write("");
                b3.setLastModified(j * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e) {
            String i4 = c00.i("Could not persist report for session ", str22);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", i4, e);
            }
        }
    }

    public final void c(String str) {
        ExecutorService executorService = ((i03) this.e.c).a;
        ProfilingManager profilingManager = (ProfilingManager) this.a.getSystemService(ProfilingManager.class);
        byte b = 0;
        Object[] objArr = {new ProfilingTrigger.Builder(7).build(), new ProfilingTrigger.Builder(8).build()};
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        profilingManager.addProfilingTriggers(DesugarCollections.unmodifiableList(arrayList));
        profilingManager.registerForAllProfilingResults(executorService, new vy2(this, str, b));
    }

    public final boolean d(oy8 oy8Var) {
        rx6.v();
        h03 h03Var = this.n;
        boolean z = h03Var != null && h03Var.e.get();
        sae saeVar = sae.b;
        if (z) {
            saeVar.l("Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        saeVar.k("Finalizing previously open sessions.");
        try {
            a(true, oy8Var, true);
            saeVar.k("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final String e() {
        NavigableSet d = this.m.b.d();
        if (d.isEmpty()) {
            return null;
        }
        return (String) d.first();
    }

    public final String f() {
        InputStream resourceAsStream;
        Context context = this.a;
        int e = jn2.e(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = e == 0 ? null : context.getResources().getString(e);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(s), 0);
        }
        ClassLoader classLoader = yy2.class.getClassLoader();
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
        } catch (Throwable th) {
            try {
                resourceAsStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void g(String str, ProfilingResult profilingResult) {
        int triggerType = profilingResult.getTriggerType();
        String str2 = triggerType == 8 ? "trigger-type-anomaly" : triggerType == 7 ? "trigger-type-oom" : "trigger-type-unknown";
        try {
            if (this.g.b(str, str2).createNewFile()) {
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

    public final Task h() {
        Task call;
        ArrayList arrayList = new ArrayList();
        for (File file : gd4.e(((File) this.g.c).listFiles(r))) {
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
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new xy2(this, parseLong));
                }
                arrayList.add(call);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    public final void i() {
        try {
            String f = f();
            if (f != null) {
                try {
                    ((vh4) this.d.e).H("com.crashlytics.version-control-info", f);
                } catch (IllegalArgumentException e) {
                    Context context = this.a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e2);
        }
    }

    public final void j(Task task) {
        Task task2;
        Task c;
        TaskCompletionSource taskCompletionSource = this.o;
        gd4 gd4Var = this.m.b.b;
        if (gd4.e(((File) gd4Var.e).listFiles()).isEmpty() && gd4.e(((File) gd4Var.f).listFiles()).isEmpty() && gd4.e(((File) gd4Var.g).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        sae saeVar = sae.b;
        saeVar.k("Crash reports are available to be sent.");
        p63 p63Var = this.b;
        byte b = 16;
        if (p63Var.a()) {
            saeVar.f("Automatic data collection is enabled. Allowing upload.");
            taskCompletionSource.trySetResult(Boolean.FALSE);
            c = Tasks.forResult(Boolean.TRUE);
        } else {
            saeVar.f("Automatic data collection is disabled.");
            saeVar.k("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (p63Var.c) {
                task2 = p63Var.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new rg7(b));
            saeVar.f("Waiting for send/deleteUnsentReports to be called.");
            c = ur5.c(onSuccessTask, this.p.getTask());
        }
        c.onSuccessTask((i03) this.e.b, new qx6(this, task, b));
    }
}
