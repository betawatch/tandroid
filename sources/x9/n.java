package x9;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import c5.c0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.q3;
import v7.d8;
import z9.a0;
import z9.a1;
import z9.b0;
import z9.b1;
import z9.c1;
import z9.d1;
import z9.d2;
import z9.e1;
import z9.e2;
import z9.g0;
import z9.h0;
import z9.i0;
import z9.l0;
import z9.m0;
import z9.n0;
import z9.q0;
import z9.t0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class n {
    public static final ca.a r = new ca.a(3);
    public final Context a;
    public final s b;
    public final l c;
    public final q3 d;
    public final com.google.firebase.messaging.s e;
    public final v f;
    public final ca.c g;
    public final a h;
    public final y9.e i;
    public final u9.a j;
    public final v9.a k;
    public final j l;
    public final com.google.firebase.messaging.m m;
    public r n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public n(Context context, com.google.firebase.messaging.s sVar, v vVar, s sVar2, ca.c cVar, l lVar, a aVar, q3 q3Var, y9.e eVar, com.google.firebase.messaging.m mVar, u9.a aVar2, v9.a aVar3, j jVar) {
        new AtomicBoolean(false);
        this.a = context;
        this.e = sVar;
        this.f = vVar;
        this.b = sVar2;
        this.g = cVar;
        this.c = lVar;
        this.h = aVar;
        this.d = q3Var;
        this.i = eVar;
        this.j = aVar2;
        this.k = aVar3;
        this.l = jVar;
        this.m = mVar;
    }

    public static void a(n nVar, String str, Boolean bool) {
        int i10;
        long j10;
        Integer num;
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String h = t8.b.h("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", h, null);
        }
        Locale locale = Locale.US;
        v vVar = nVar.f;
        a aVar = nVar.h;
        c1 c1Var = new c1(vVar.c, aVar.f, aVar.g, vVar.b().a, t8.b.b(aVar.d != null ? 4 : 1), aVar.h);
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        e1 e1Var = new e1(h.h());
        Context context = nVar.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        g gVar = g.a;
        String str4 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str4)) {
            i10 = 3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            i10 = 3;
            g gVar2 = (g) g.b.get(str4.toLowerCase(locale));
            if (gVar2 != null) {
                gVar = gVar2;
            }
        }
        int ordinal = gVar.ordinal();
        String str5 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b10 = h.b(context);
        boolean g10 = h.g();
        int d = h.d();
        String str6 = Build.MANUFACTURER;
        String str7 = Build.PRODUCT;
        nVar.j.d(str, currentTimeMillis, new b1(c1Var, e1Var, new d1(ordinal, availableProcessors, d, b10, blockCount, g10)));
        if (!bool.booleanValue() || str == null) {
            j10 = currentTimeMillis;
        } else {
            q3 q3Var = nVar.d;
            synchronized (((String) q3Var.c)) {
                try {
                    q3Var.c = str;
                    Map a2 = ((y9.d) ((AtomicMarkableReference) ((c2.b) q3Var.d).b).getReference()).a();
                    List o10 = ((c0) q3Var.f).o();
                    if (((String) ((AtomicMarkableReference) q3Var.h).getReference()) != null) {
                        j10 = currentTimeMillis;
                        ((y9.f) q3Var.a).i(str, (String) ((AtomicMarkableReference) q3Var.h).getReference());
                    } else {
                        j10 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((y9.f) q3Var.a).g(str, a2, false);
                    }
                    if (!o10.isEmpty()) {
                        ((y9.f) q3Var.a).h(str, o10);
                    }
                } finally {
                }
            }
        }
        y9.e eVar = nVar.i;
        ((y9.c) eVar.b).a();
        eVar.b = y9.e.c;
        if (str != null) {
            eVar.b = new y9.k(((ca.c) eVar.a).b(str, "userlog"));
        }
        nVar.l.b(str);
        com.google.firebase.messaging.m mVar = nVar.m;
        q qVar = (q) mVar.a;
        Charset charset = e2.a;
        d8 d8Var = new d8();
        d8Var.a = "18.6.0";
        a aVar2 = qVar.c;
        String str8 = aVar2.a;
        if (str8 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        d8Var.b = str8;
        v vVar2 = qVar.b;
        String str9 = vVar2.b().a;
        if (str9 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        d8Var.c = str9;
        d8Var.d = vVar2.b().b;
        String str10 = aVar2.f;
        if (str10 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        d8Var.k = str10;
        String str11 = aVar2.g;
        if (str11 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        d8Var.f = str11;
        d8Var.i = 4;
        g0 g0Var = new g0();
        g0Var.f = Boolean.FALSE;
        g0Var.d = Long.valueOf(j10);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        g0Var.b = str;
        String str12 = q.g;
        if (str12 == null) {
            throw new NullPointerException("Null generator");
        }
        g0Var.a = str12;
        String str13 = vVar2.c;
        if (str13 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str14 = vVar2.b().a;
        m4.c cVar = aVar2.h;
        if (((c5.a) cVar.c) == null) {
            cVar.c = new c5.a(cVar);
        }
        c5.a aVar3 = (c5.a) cVar.c;
        String str15 = aVar3.b;
        if (aVar3 == null) {
            cVar.c = new c5.a(cVar);
        }
        g0Var.g = new i0(str13, str10, str11, str14, str15, ((c5.a) cVar.c).c);
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(14, false);
        Integer valueOf = Integer.valueOf(i10);
        sVar.d = valueOf;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        sVar.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        sVar.e = str3;
        sVar.c = Boolean.valueOf(h.h());
        g0Var.i = sVar.d();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int i11 = 7;
        if (!TextUtils.isEmpty(str4) && (num = (Integer) q.f.get(str4.toLowerCase(locale))) != null) {
            i11 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long b11 = h.b(qVar.a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean g11 = h.g();
        int d10 = h.d();
        ea.b bVar = new ea.b();
        bVar.a = Integer.valueOf(i11);
        if (str5 == null) {
            throw new NullPointerException("Null model");
        }
        bVar.b = str5;
        bVar.c = Integer.valueOf(availableProcessors2);
        bVar.d = Long.valueOf(b11);
        bVar.e = Long.valueOf(blockCount2);
        bVar.f = Boolean.valueOf(g11);
        bVar.g = Integer.valueOf(d10);
        if (str6 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        bVar.h = str6;
        if (str7 == null) {
            throw new NullPointerException("Null modelClass");
        }
        bVar.i = str7;
        g0Var.j = bVar.b();
        g0Var.l = valueOf;
        d8Var.g = g0Var.a();
        a0 a10 = d8Var.a();
        ca.c cVar2 = ((ca.b) mVar.b).b;
        d2 d2Var = a10.j;
        if (d2Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", i10)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str16 = ((h0) d2Var).b;
        try {
            ca.b.g.getClass();
            ca.b.f(cVar2.b(str16, "report"), aa.b.a.N(a10));
            File b12 = cVar2.b(str16, "start-time");
            long j11 = ((h0) d2Var).d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), ca.b.e);
            try {
                outputStreamWriter.write("");
                b12.setLastModified(j11 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e) {
            String h10 = t8.b.h("Could not persist report for session ", str16);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", h10, e);
            }
        }
    }

    public static Task b(n nVar) {
        Task call;
        nVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : ca.c.e(nVar.g.b.listFiles(r))) {
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
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new m(nVar, parseLong));
                }
                arrayList.add(call);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String f() {
        InputStream resourceAsStream;
        ClassLoader classLoader = n.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
            if (resourceAsStream == null) {
                Log.i("FirebaseCrashlytics", "No version control information found", null);
            }
            if (resourceAsStream != null) {
                return null;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = resourceAsStream.read(bArr);
                if (read == -1) {
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }
        resourceAsStream = null;
        if (resourceAsStream != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r29v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z10, ea.b bVar) {
        int i10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        ?? r52;
        List list;
        ApplicationExitInfo applicationExitInfo;
        String str3;
        String processName;
        int i11;
        long j10;
        List list2;
        InputStream traceInputStream;
        FileInputStream fileInputStream;
        ArrayList arrayList = new ArrayList(((ca.b) this.m.b).c());
        FileInputStream fileInputStream2 = null;
        if (arrayList.size() <= z10) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str4 = (String) arrayList.get(z10 == true ? 1 : 0);
        if (bVar.d().b.b) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    ca.c cVar = this.g;
                    y9.e eVar = new y9.e(cVar);
                    eVar.b = y9.e.c;
                    if (str4 != null) {
                        eVar.b = new y9.k(cVar.b(str4, "userlog"));
                    }
                    ca.c cVar2 = this.g;
                    com.google.firebase.messaging.s sVar = this.e;
                    y9.f fVar = new y9.f(cVar2);
                    q3 q3Var = new q3(str4, cVar2, sVar);
                    i10 = 4;
                    ((y9.d) ((AtomicMarkableReference) ((c2.b) q3Var.d).b).getReference()).d(fVar.c(str4, false));
                    ((y9.d) ((AtomicMarkableReference) ((c2.b) q3Var.e).b).getReference()).d(fVar.c(str4, true));
                    ((AtomicMarkableReference) q3Var.h).set(fVar.d(str4), false);
                    c0 c0Var = (c0) q3Var.f;
                    File b10 = cVar2.b(str4, "rollouts-state");
                    if (!b10.exists() || b10.length() == 0) {
                        y9.f.f(b10);
                        list = Collections.EMPTY_LIST;
                    } else {
                        try {
                            fileInputStream = new FileInputStream(b10);
                            try {
                                try {
                                    list = y9.f.b(h.j(fileInputStream));
                                    String str5 = "Loaded rollouts state:\n" + list + "\nfor session " + str4;
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", str5, null);
                                    }
                                    h.c(fileInputStream, "Failed to close rollouts state file.");
                                } catch (Exception e) {
                                    e = e;
                                    Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                    y9.f.f(b10);
                                    h.c(fileInputStream, "Failed to close rollouts state file.");
                                    list = Collections.EMPTY_LIST;
                                    synchronized (c0Var) {
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileInputStream2 = fileInputStream;
                                h.c(fileInputStream2, "Failed to close rollouts state file.");
                                throw th;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            fileInputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            h.c(fileInputStream2, "Failed to close rollouts state file.");
                            throw th;
                        }
                    }
                    synchronized (c0Var) {
                        ((ArrayList) c0Var.c).clear();
                        if (list.size() > c0Var.b) {
                            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + c0Var.b, null);
                            ((ArrayList) c0Var.c).addAll(list.subList(0, c0Var.b));
                        } else {
                            ((ArrayList) c0Var.c).addAll(list);
                        }
                    }
                    com.google.firebase.messaging.m mVar = this.m;
                    ca.b bVar2 = (ca.b) mVar.b;
                    long lastModified = bVar2.b.b(str4, "start-time").lastModified();
                    Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
                    while (it.hasNext()) {
                        applicationExitInfo = it.next();
                        if (applicationExitInfo.getTimestamp() < lastModified) {
                            break;
                        }
                        if (applicationExitInfo.getReason() == 6) {
                            break;
                        }
                    }
                    applicationExitInfo = null;
                    if (applicationExitInfo == null) {
                        String h = t8.b.h("No relevant ApplicationExitInfo occurred during session: ", str4);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", h, null);
                        }
                    } else {
                        q qVar = (q) mVar.a;
                        try {
                            traceInputStream = applicationExitInfo.getTraceInputStream();
                        } catch (IOException e10) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e10, null);
                        }
                        if (traceInputStream != null) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int read = traceInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                } else {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                }
                            }
                            str3 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                            ea.b bVar3 = new ea.b();
                            bVar3.d = Integer.valueOf(applicationExitInfo.getImportance());
                            processName = applicationExitInfo.getProcessName();
                            if (processName != null) {
                                throw new NullPointerException("Null processName");
                            }
                            bVar3.b = processName;
                            bVar3.c = Integer.valueOf(applicationExitInfo.getReason());
                            bVar3.g = Long.valueOf(applicationExitInfo.getTimestamp());
                            bVar3.a = Integer.valueOf(applicationExitInfo.getPid());
                            bVar3.e = Long.valueOf(applicationExitInfo.getPss());
                            bVar3.f = Long.valueOf(applicationExitInfo.getRss());
                            bVar3.h = str3;
                            b0 a2 = bVar3.a();
                            int i13 = qVar.a.getResources().getConfiguration().orientation;
                            com.google.firebase.messaging.m mVar2 = new com.google.firebase.messaging.m();
                            mVar2.b = "anr";
                            long j11 = a2.g;
                            mVar2.a = Long.valueOf(j11);
                            a aVar = qVar.c;
                            if (!qVar.e.d().b.c || aVar.c.size() <= 0) {
                                i11 = i13;
                                j10 = j11;
                                list2 = null;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = aVar.c;
                                int size = arrayList3.size();
                                i11 = i13;
                                int i14 = 0;
                                while (i14 < size) {
                                    Object obj = arrayList3.get(i14);
                                    int i15 = i14 + 1;
                                    int i16 = size;
                                    e eVar2 = (e) obj;
                                    String str6 = eVar2.a;
                                    if (str6 == null) {
                                        throw new NullPointerException("Null libraryName");
                                    }
                                    ArrayList arrayList4 = arrayList3;
                                    String str7 = eVar2.b;
                                    if (str7 == null) {
                                        throw new NullPointerException("Null arch");
                                    }
                                    String str8 = eVar2.c;
                                    if (str8 == null) {
                                        throw new NullPointerException("Null buildId");
                                    }
                                    arrayList2.add(new z9.c0(str7, str6, str8));
                                    i14 = i15;
                                    size = i16;
                                    arrayList3 = arrayList4;
                                    j11 = j11;
                                }
                                j10 = j11;
                                list2 = DesugarCollections.unmodifiableList(arrayList2);
                            }
                            ea.b bVar4 = new ea.b();
                            bVar4.d = Integer.valueOf(a2.d);
                            String str9 = a2.b;
                            if (str9 == null) {
                                throw new NullPointerException("Null processName");
                            }
                            bVar4.b = str9;
                            bVar4.c = Integer.valueOf(a2.c);
                            bVar4.g = Long.valueOf(j10);
                            bVar4.a = Integer.valueOf(a2.a);
                            bVar4.e = Long.valueOf(a2.e);
                            bVar4.f = Long.valueOf(a2.f);
                            bVar4.h = a2.h;
                            bVar4.i = list2;
                            b0 a10 = bVar4.a();
                            Boolean valueOf = Boolean.valueOf(a10.d != 100);
                            String processName2 = a10.b;
                            int i17 = a10.a;
                            int i18 = a10.d;
                            kotlin.jvm.internal.i.e(processName2, "processName");
                            if ((8 & 4) != 0) {
                                i18 = 0;
                            }
                            com.google.firebase.messaging.s sVar2 = new com.google.firebase.messaging.s(13, false);
                            sVar2.b = processName2;
                            sVar2.d = Integer.valueOf(i17);
                            sVar2.e = Integer.valueOf(i18);
                            sVar2.c = Boolean.FALSE;
                            t0 c10 = sVar2.c();
                            q0 q0Var = new q0(0L, "0", "0");
                            List a11 = qVar.a();
                            if (a11 == null) {
                                throw new NullPointerException("Null binaries");
                            }
                            mVar2.c = new m0(new n0(null, null, a10, q0Var, a11), null, null, valueOf, c10, null, i11);
                            mVar2.d = qVar.b(i11);
                            l0 i19 = mVar2.i();
                            String h10 = t8.b.h("Persisting anr for session ", str4);
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", h10, null);
                            }
                            bVar2.d(com.google.firebase.messaging.m.d(com.google.firebase.messaging.m.b(i19, eVar, q3Var), q3Var), str4, true);
                        }
                        str3 = null;
                        ea.b bVar32 = new ea.b();
                        bVar32.d = Integer.valueOf(applicationExitInfo.getImportance());
                        processName = applicationExitInfo.getProcessName();
                        if (processName != null) {
                        }
                    }
                } else {
                    i10 = 4;
                    String h11 = t8.b.h("No ApplicationExitInfo available. Session: ", str4);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", h11, null);
                    }
                }
            } else {
                i10 = 4;
                String i20 = i2.d.i(i12, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", i20, null);
                }
            }
        } else {
            i10 = 4;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
            }
        }
        if (this.j.c(str4)) {
            String h12 = t8.b.h("Finalizing native report for session ", str4);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                r52 = 0;
                Log.v("FirebaseCrashlytics", h12, null);
            } else {
                r52 = 0;
            }
            this.j.a(str4).getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str4, r52);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str4, r52);
            Log.w("FirebaseCrashlytics", "No native core present", r52);
            str = r52;
        } else {
            str = null;
        }
        if (z10 != 0) {
            z11 = false;
            str2 = (String) arrayList.get(0);
        } else {
            z11 = false;
            this.l.b(str);
            str2 = null;
        }
        com.google.firebase.messaging.m mVar3 = this.m;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        ca.b bVar5 = (ca.b) mVar3.b;
        ca.c cVar3 = bVar5.b;
        cVar3.getClass();
        File file = cVar3.a;
        ca.c.a(new File(file, ".com.google.firebase.crashlytics"));
        ca.c.a(new File(file, ".com.google.firebase.crashlytics-ndk"));
        if (Build.VERSION.SDK_INT >= 28) {
            ca.c.a(new File(file, ".com.google.firebase.crashlytics.files.v1"));
        }
        NavigableSet<String> c11 = bVar5.c();
        if (str2 != null) {
            c11.remove(str2);
        }
        if (c11.size() > 8) {
            while (c11.size() > 8) {
                String str10 = (String) c11.last();
                String h13 = t8.b.h("Removing session over cap: ", str10);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", h13, null);
                }
                ca.c.d(new File(cVar3.c, str10));
                c11.remove(str10);
            }
        }
        for (String str11 : c11) {
            String h14 = t8.b.h("Finalizing report for session ", str11);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", h14, null);
            }
            aa.b bVar6 = ca.b.g;
            ca.a aVar2 = ca.b.i;
            File file2 = new File(cVar3.c, str11);
            file2.mkdirs();
            List<File> e11 = ca.c.e(file2.listFiles(aVar2));
            if (e11.isEmpty()) {
                String p5 = a1.g.p("Session ", str11, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", p5, null);
                }
            } else {
                Collections.sort(e11);
                ArrayList arrayList5 = new ArrayList();
                boolean z13 = z11;
                for (File file3 : e11) {
                    try {
                        String e12 = ca.b.e(file3);
                        bVar6.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(e12));
                            try {
                                l0 e13 = aa.b.e(jsonReader);
                                jsonReader.close();
                                arrayList5.add(e13);
                            } finally {
                            }
                        } catch (IllegalStateException e14) {
                            throw new IOException(e14);
                        }
                    } catch (IOException e15) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file3, e15);
                    }
                    if (!z13) {
                        String name = file3.getName();
                        if (!name.startsWith("event") || !name.endsWith("_")) {
                            z12 = false;
                            z13 = z12;
                        }
                    }
                    z12 = true;
                    z13 = z12;
                }
                if (arrayList5.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str11, null);
                } else {
                    String d = new y9.f(cVar3).d(str11);
                    String a12 = bVar5.d.a(str11);
                    File b11 = cVar3.b(str11, "report");
                    try {
                        String e16 = ca.b.e(b11);
                        bVar6.getClass();
                        a0 i21 = aa.b.i(e16);
                        d8 a13 = i21.a();
                        d2 d2Var = i21.j;
                        if (d2Var != null) {
                            g0 a14 = d2Var.a();
                            a14.e = Long.valueOf(currentTimeMillis);
                            a14.f = Boolean.valueOf(z13);
                            if (d != null) {
                                a14.h = new a1(d);
                            }
                            a13.g = a14.a();
                        }
                        a0 a15 = a13.a();
                        d8 a16 = a15.a();
                        a16.e = a12;
                        d2 d2Var2 = a15.j;
                        if (d2Var2 != null) {
                            g0 a17 = d2Var2.a();
                            a17.c = a12;
                            a16.g = a17.a();
                        }
                        a0 a18 = a16.a();
                        d2 d2Var3 = a18.j;
                        if (d2Var3 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        d8 a19 = a18.a();
                        g0 a20 = d2Var3.a();
                        a20.k = arrayList5;
                        a19.g = a20.a();
                        a0 a21 = a19.a();
                        d2 d2Var4 = a21.j;
                        if (d2Var4 != null) {
                            String str12 = "appQualitySessionId: " + a12;
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    try {
                                        Log.d("FirebaseCrashlytics", str12, null);
                                    } catch (IOException e17) {
                                        e = e17;
                                    }
                                }
                                ca.b.f(z13 ? new File(cVar3.e, ((h0) d2Var4).b) : new File(cVar3.d, ((h0) d2Var4).b), aa.b.a.N(a21));
                            } catch (IOException e18) {
                                e = e18;
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b11, e);
                                ca.c.d(new File(cVar3.c, str11));
                                z11 = false;
                            }
                        }
                        e = e17;
                    } catch (IOException e19) {
                        e = e19;
                    }
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b11, e);
                }
                ca.c.d(new File(cVar3.c, str11));
                z11 = false;
            }
            ca.c.d(new File(cVar3.c, str11));
            z11 = false;
        }
        com.google.android.gms.internal.cast.a aVar3 = bVar5.c.d().a;
        ArrayList b12 = bVar5.b();
        int size2 = b12.size();
        int i22 = i10;
        if (size2 <= i22) {
            return;
        }
        Iterator it2 = b12.subList(i22, size2).iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    public final boolean d(ea.b bVar) {
        if (!Boolean.TRUE.equals(((ThreadLocal) this.e.e).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        r rVar = this.n;
        if (rVar != null && rVar.e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            c(true, bVar);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final String e() {
        NavigableSet c10 = ((ca.b) this.m.b).c();
        if (c10.isEmpty()) {
            return null;
        }
        return (String) c10.first();
    }

    public final void g() {
        try {
            String f7 = f();
            if (f7 != null) {
                try {
                    ((c2.b) this.d.e).x("com.crashlytics.version-control-info", f7);
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
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e7);
        }
    }

    public final Task h(Task task) {
        Task task2;
        Task task3;
        TaskCompletionSource taskCompletionSource = this.o;
        ca.c cVar = ((ca.b) this.m.b).b;
        if (ca.c.e(cVar.d.listFiles()).isEmpty() && ca.c.e(cVar.e.listFiles()).isEmpty() && ca.c.e(cVar.f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        u9.b bVar = u9.b.a;
        bVar.c("Crash reports are available to be sent.");
        s sVar = this.b;
        if (sVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            bVar.b("Automatic data collection is disabled.");
            bVar.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (sVar.c) {
                task2 = sVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new sb.a(26));
            bVar.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.p.getTask();
            ExecutorService executorService = x.a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            w wVar = new w(1, taskCompletionSource2);
            onSuccessTask.continueWith(wVar);
            task4.continueWith(wVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new n6.o(this, task, false, 25));
    }
}
