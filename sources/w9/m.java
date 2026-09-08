package w9;

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
import c5.b0;
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
import m.p3;
import n7.z0;
import org.telegram.ui.Cells.p6;
import v7.c8;
import y9.a0;
import y9.a1;
import y9.b1;
import y9.c0;
import y9.c1;
import y9.d1;
import y9.d2;
import y9.e1;
import y9.e2;
import y9.g0;
import y9.h0;
import y9.i0;
import y9.l0;
import y9.m0;
import y9.n0;
import y9.q0;
import y9.t0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class m {
    public static final ba.a r = new ba.a(3);
    public final Context a;
    public final r b;
    public final o0.a c;
    public final p3 d;
    public final com.google.firebase.messaging.s e;
    public final u f;
    public final ba.c g;
    public final a h;
    public final x9.e i;
    public final t9.a j;
    public final u9.a k;
    public final j l;
    public final com.google.firebase.messaging.n m;
    public q n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public m(Context context, com.google.firebase.messaging.s sVar, u uVar, r rVar, ba.c cVar, o0.a aVar, a aVar2, p3 p3Var, x9.e eVar, com.google.firebase.messaging.n nVar, t9.a aVar3, u9.a aVar4, j jVar) {
        new AtomicBoolean(false);
        this.a = context;
        this.e = sVar;
        this.f = uVar;
        this.b = rVar;
        this.g = cVar;
        this.c = aVar;
        this.h = aVar2;
        this.d = p3Var;
        this.i = eVar;
        this.j = aVar3;
        this.k = aVar4;
        this.l = jVar;
        this.m = nVar;
    }

    public static void a(m mVar, String str, Boolean bool) {
        int i10;
        long j3;
        Integer num;
        mVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String i11 = p6.i("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", i11, null);
        }
        Locale locale = Locale.US;
        u uVar = mVar.f;
        a aVar = mVar.h;
        c1 c1Var = new c1(uVar.c, aVar.f, aVar.g, uVar.b().a, w.f.c(aVar.d != null ? 4 : 1), aVar.h);
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        e1 e1Var = new e1(h.h());
        Context context = mVar.a;
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
        mVar.j.d(str, currentTimeMillis, new b1(c1Var, e1Var, new d1(ordinal, availableProcessors, d, b10, blockCount, g10)));
        if (!bool.booleanValue() || str == null) {
            j3 = currentTimeMillis;
        } else {
            p3 p3Var = mVar.d;
            synchronized (((String) p3Var.c)) {
                try {
                    p3Var.c = str;
                    Map a2 = ((x9.d) ((AtomicMarkableReference) ((com.google.firebase.messaging.m) p3Var.d).b).getReference()).a();
                    List g11 = ((b0) p3Var.f).g();
                    if (((String) ((AtomicMarkableReference) p3Var.h).getReference()) != null) {
                        j3 = currentTimeMillis;
                        ((x9.f) p3Var.a).i(str, (String) ((AtomicMarkableReference) p3Var.h).getReference());
                    } else {
                        j3 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((x9.f) p3Var.a).g(str, a2, false);
                    }
                    if (!g11.isEmpty()) {
                        ((x9.f) p3Var.a).h(str, g11);
                    }
                } finally {
                }
            }
        }
        x9.e eVar = mVar.i;
        ((x9.c) eVar.b).b();
        eVar.b = x9.e.c;
        if (str != null) {
            eVar.b = new x9.k(((ba.c) eVar.a).b(str, "userlog"));
        }
        mVar.l.b(str);
        com.google.firebase.messaging.n nVar = mVar.m;
        p pVar = (p) nVar.a;
        Charset charset = e2.a;
        c8 c8Var = new c8();
        c8Var.a = "18.6.0";
        a aVar2 = pVar.c;
        String str8 = aVar2.a;
        if (str8 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        c8Var.b = str8;
        u uVar2 = pVar.b;
        String str9 = uVar2.b().a;
        if (str9 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        c8Var.c = str9;
        c8Var.d = uVar2.b().b;
        String str10 = aVar2.f;
        if (str10 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        c8Var.k = str10;
        String str11 = aVar2.g;
        if (str11 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        c8Var.f = str11;
        c8Var.i = 4;
        g0 g0Var = new g0();
        g0Var.f = Boolean.FALSE;
        g0Var.d = Long.valueOf(j3);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        g0Var.b = str;
        String str12 = p.g;
        if (str12 == null) {
            throw new NullPointerException("Null generator");
        }
        g0Var.a = str12;
        String str13 = uVar2.c;
        if (str13 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str14 = uVar2.b().a;
        z0 z0Var = aVar2.h;
        if (((c5.a) z0Var.c) == null) {
            z0Var.c = new c5.a(z0Var);
        }
        c5.a aVar3 = (c5.a) z0Var.c;
        String str15 = aVar3.a;
        if (aVar3 == null) {
            z0Var.c = new c5.a(z0Var);
        }
        g0Var.g = new i0(str13, str10, str11, str14, str15, ((c5.a) z0Var.c).b);
        fg.f fVar = new fg.f();
        Integer valueOf = Integer.valueOf(i10);
        fVar.a = valueOf;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        fVar.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        fVar.c = str3;
        fVar.d = Boolean.valueOf(h.h());
        g0Var.i = fVar.h();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int i12 = 7;
        if (!TextUtils.isEmpty(str4) && (num = (Integer) p.f.get(str4.toLowerCase(locale))) != null) {
            i12 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long b11 = h.b(pVar.a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean g12 = h.g();
        int d10 = h.d();
        da.b bVar = new da.b();
        bVar.a = Integer.valueOf(i12);
        if (str5 == null) {
            throw new NullPointerException("Null model");
        }
        bVar.b = str5;
        bVar.c = Integer.valueOf(availableProcessors2);
        bVar.d = Long.valueOf(b11);
        bVar.e = Long.valueOf(blockCount2);
        bVar.f = Boolean.valueOf(g12);
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
        c8Var.g = g0Var.a();
        a0 a10 = c8Var.a();
        ba.c cVar = ((ba.b) nVar.b).b;
        d2 d2Var = a10.j;
        if (d2Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str16 = ((h0) d2Var).b;
        try {
            ba.b.g.getClass();
            ba.b.f(cVar.b(str16, "report"), z9.b.a.y(a10));
            File b12 = cVar.b(str16, "start-time");
            long j10 = ((h0) d2Var).d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), ba.b.e);
            try {
                outputStreamWriter.write("");
                b12.setLastModified(j10 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e7) {
            String i13 = p6.i("Could not persist report for session ", str16);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", i13, e7);
            }
        }
    }

    public static Task b(m mVar) {
        Task call;
        mVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : ba.c.e(mVar.g.b.listFiles(r))) {
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

    /* JADX WARN: Removed duplicated region for block: B:6:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String f() {
        InputStream resourceAsStream;
        ClassLoader classLoader = m.class.getClassLoader();
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
    /* JADX WARN: Removed duplicated region for block: B:207:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r29v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z10, da.b bVar) {
        String str;
        String str2;
        boolean z11;
        ?? r52;
        List list;
        ApplicationExitInfo applicationExitInfo;
        String str3;
        String processName;
        int i10;
        long j3;
        List list2;
        InputStream traceInputStream;
        FileInputStream fileInputStream;
        ArrayList arrayList = new ArrayList(((ba.b) this.m.b).c());
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
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    ba.c cVar = this.g;
                    x9.e eVar = new x9.e(cVar);
                    eVar.b = x9.e.c;
                    if (str4 != null) {
                        eVar.b = new x9.k(cVar.b(str4, "userlog"));
                    }
                    ba.c cVar2 = this.g;
                    com.google.firebase.messaging.s sVar = this.e;
                    x9.f fVar = new x9.f(cVar2);
                    p3 p3Var = new p3(str4, cVar2, sVar);
                    ((x9.d) ((AtomicMarkableReference) ((com.google.firebase.messaging.m) p3Var.d).b).getReference()).d(fVar.c(str4, false));
                    ((x9.d) ((AtomicMarkableReference) ((com.google.firebase.messaging.m) p3Var.e).b).getReference()).d(fVar.c(str4, true));
                    ((AtomicMarkableReference) p3Var.h).set(fVar.d(str4), false);
                    b0 b0Var = (b0) p3Var.f;
                    File b10 = cVar2.b(str4, "rollouts-state");
                    if (!b10.exists() || b10.length() == 0) {
                        x9.f.f(b10);
                        list = Collections.EMPTY_LIST;
                    } else {
                        try {
                            fileInputStream = new FileInputStream(b10);
                            try {
                                try {
                                    list = x9.f.b(h.j(fileInputStream));
                                    String str5 = "Loaded rollouts state:\n" + list + "\nfor session " + str4;
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", str5, null);
                                    }
                                    h.c(fileInputStream, "Failed to close rollouts state file.");
                                } catch (Exception e7) {
                                    e = e7;
                                    Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                    x9.f.f(b10);
                                    h.c(fileInputStream, "Failed to close rollouts state file.");
                                    list = Collections.EMPTY_LIST;
                                    synchronized (b0Var) {
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileInputStream2 = fileInputStream;
                                h.c(fileInputStream2, "Failed to close rollouts state file.");
                                throw th;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            fileInputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            h.c(fileInputStream2, "Failed to close rollouts state file.");
                            throw th;
                        }
                    }
                    synchronized (b0Var) {
                        ((ArrayList) b0Var.c).clear();
                        if (list.size() > b0Var.b) {
                            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + b0Var.b, null);
                            ((ArrayList) b0Var.c).addAll(list.subList(0, b0Var.b));
                        } else {
                            ((ArrayList) b0Var.c).addAll(list);
                        }
                    }
                    com.google.firebase.messaging.n nVar = this.m;
                    ba.b bVar2 = (ba.b) nVar.b;
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
                        String i12 = p6.i("No relevant ApplicationExitInfo occurred during session: ", str4);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", i12, null);
                        }
                    } else {
                        p pVar = (p) nVar.a;
                        try {
                            traceInputStream = applicationExitInfo.getTraceInputStream();
                        } catch (IOException e11) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e11, null);
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
                            da.b bVar3 = new da.b();
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
                            y9.b0 a2 = bVar3.a();
                            int i13 = pVar.a.getResources().getConfiguration().orientation;
                            com.google.firebase.messaging.n nVar2 = new com.google.firebase.messaging.n();
                            nVar2.b = "anr";
                            long j10 = a2.g;
                            nVar2.a = Long.valueOf(j10);
                            a aVar = pVar.c;
                            if (!pVar.e.d().b.c || aVar.c.size() <= 0) {
                                i10 = i13;
                                j3 = j10;
                                list2 = null;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = aVar.c;
                                int size = arrayList3.size();
                                i10 = i13;
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
                                    arrayList2.add(new c0(str7, str6, str8));
                                    i14 = i15;
                                    size = i16;
                                    arrayList3 = arrayList4;
                                    j10 = j10;
                                }
                                j3 = j10;
                                list2 = DesugarCollections.unmodifiableList(arrayList2);
                            }
                            da.b bVar4 = new da.b();
                            bVar4.d = Integer.valueOf(a2.d);
                            String str9 = a2.b;
                            if (str9 == null) {
                                throw new NullPointerException("Null processName");
                            }
                            bVar4.b = str9;
                            bVar4.c = Integer.valueOf(a2.c);
                            bVar4.g = Long.valueOf(j3);
                            bVar4.a = Integer.valueOf(a2.a);
                            bVar4.e = Long.valueOf(a2.e);
                            bVar4.f = Long.valueOf(a2.f);
                            bVar4.h = a2.h;
                            bVar4.i = list2;
                            y9.b0 a10 = bVar4.a();
                            Boolean valueOf = Boolean.valueOf(a10.d != 100);
                            String processName2 = a10.b;
                            int i17 = a10.a;
                            int i18 = a10.d;
                            kotlin.jvm.internal.i.e(processName2, "processName");
                            if ((8 & 4) != 0) {
                                i18 = 0;
                            }
                            fg.f fVar2 = new fg.f();
                            fVar2.a = processName2;
                            fVar2.b = Integer.valueOf(i17);
                            fVar2.c = Integer.valueOf(i18);
                            fVar2.d = Boolean.FALSE;
                            t0 g10 = fVar2.g();
                            q0 q0Var = new q0(0L, "0", "0");
                            List a11 = pVar.a();
                            if (a11 == null) {
                                throw new NullPointerException("Null binaries");
                            }
                            nVar2.c = new m0(new n0(null, null, a10, q0Var, a11), null, null, valueOf, g10, null, i10);
                            nVar2.d = pVar.b(i10);
                            l0 i19 = nVar2.i();
                            String i20 = p6.i("Persisting anr for session ", str4);
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", i20, null);
                            }
                            bVar2.d(com.google.firebase.messaging.n.d(com.google.firebase.messaging.n.b(i19, eVar, p3Var), p3Var), str4, true);
                        }
                        str3 = null;
                        da.b bVar32 = new da.b();
                        bVar32.d = Integer.valueOf(applicationExitInfo.getImportance());
                        processName = applicationExitInfo.getProcessName();
                        if (processName != null) {
                        }
                    }
                } else {
                    String i21 = p6.i("No ApplicationExitInfo available. Session: ", str4);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", i21, null);
                    }
                }
            } else {
                String i22 = i2.g.i(i11, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", i22, null);
                }
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
        }
        if (this.j.c(str4)) {
            String i23 = p6.i("Finalizing native report for session ", str4);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                r52 = 0;
                Log.v("FirebaseCrashlytics", i23, null);
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
            str2 = (String) arrayList.get(0);
        } else {
            this.l.b(str);
            str2 = null;
        }
        com.google.firebase.messaging.n nVar3 = this.m;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        ba.b bVar5 = (ba.b) nVar3.b;
        ba.c cVar3 = bVar5.b;
        cVar3.getClass();
        File file = cVar3.a;
        ba.c.a(new File(file, ".com.google.firebase.crashlytics"));
        ba.c.a(new File(file, ".com.google.firebase.crashlytics-ndk"));
        if (Build.VERSION.SDK_INT >= 28) {
            ba.c.a(new File(file, ".com.google.firebase.crashlytics.files.v1"));
        }
        NavigableSet<String> c10 = bVar5.c();
        if (str2 != null) {
            c10.remove(str2);
        }
        if (c10.size() > 8) {
            while (c10.size() > 8) {
                String str10 = (String) c10.last();
                String i24 = p6.i("Removing session over cap: ", str10);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", i24, null);
                }
                ba.c.d(new File(cVar3.c, str10));
                c10.remove(str10);
            }
        }
        for (String str11 : c10) {
            String i25 = p6.i("Finalizing report for session ", str11);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", i25, null);
            }
            z9.b bVar6 = ba.b.g;
            ba.a aVar2 = ba.b.i;
            File file2 = new File(cVar3.c, str11);
            file2.mkdirs();
            List<File> e12 = ba.c.e(file2.listFiles(aVar2));
            if (e12.isEmpty()) {
                String p5 = a4.a.p("Session ", str11, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", p5, null);
                }
            } else {
                Collections.sort(e12);
                ArrayList arrayList5 = new ArrayList();
                boolean z12 = false;
                for (File file3 : e12) {
                    try {
                        String e13 = ba.b.e(file3);
                        bVar6.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(e13));
                            try {
                                l0 e14 = z9.b.e(jsonReader);
                                jsonReader.close();
                                arrayList5.add(e14);
                            } finally {
                            }
                        } catch (IllegalStateException e15) {
                            throw new IOException(e15);
                        }
                    } catch (IOException e16) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file3, e16);
                    }
                    if (!z12) {
                        String name = file3.getName();
                        if (!name.startsWith("event") || !name.endsWith("_")) {
                            z11 = false;
                            z12 = z11;
                        }
                    }
                    z11 = true;
                    z12 = z11;
                }
                if (arrayList5.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str11, null);
                } else {
                    String d = new x9.f(cVar3).d(str11);
                    String a12 = bVar5.d.a(str11);
                    File b11 = cVar3.b(str11, "report");
                    try {
                        String e17 = ba.b.e(b11);
                        bVar6.getClass();
                        a0 i26 = z9.b.i(e17);
                        c8 a13 = i26.a();
                        d2 d2Var = i26.j;
                        if (d2Var != null) {
                            g0 a14 = d2Var.a();
                            a14.e = Long.valueOf(currentTimeMillis);
                            a14.f = Boolean.valueOf(z12);
                            if (d != null) {
                                a14.h = new a1(d);
                            }
                            a13.g = a14.a();
                        }
                        a0 a15 = a13.a();
                        c8 a16 = a15.a();
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
                        c8 a19 = a18.a();
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
                                    } catch (IOException e18) {
                                        e = e18;
                                    }
                                }
                                ba.b.f(z12 ? new File(cVar3.e, ((h0) d2Var4).b) : new File(cVar3.d, ((h0) d2Var4).b), z9.b.a.y(a21));
                            } catch (IOException e19) {
                                e = e19;
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b11, e);
                                ba.c.d(new File(cVar3.c, str11));
                            }
                        }
                        e = e18;
                    } catch (IOException e20) {
                        e = e20;
                    }
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b11, e);
                }
                ba.c.d(new File(cVar3.c, str11));
            }
            ba.c.d(new File(cVar3.c, str11));
        }
        com.google.android.gms.internal.cast.a aVar3 = bVar5.c.d().a;
        ArrayList b12 = bVar5.b();
        int size2 = b12.size();
        if (size2 <= 4) {
            return;
        }
        Iterator it2 = b12.subList(4, size2).iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    public final boolean d(da.b bVar) {
        if (!Boolean.TRUE.equals(((ThreadLocal) this.e.e).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        q qVar = this.n;
        if (qVar != null && qVar.e.get()) {
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
        } catch (Exception e7) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e7);
            return false;
        }
    }

    public final String e() {
        NavigableSet c10 = ((ba.b) this.m.b).c();
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
                    ((com.google.firebase.messaging.m) this.d.e).u("com.crashlytics.version-control-info", f7);
                } catch (IllegalArgumentException e7) {
                    Context context = this.a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e7;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e10);
        }
    }

    public final Task h(Task task) {
        Task task2;
        Task task3;
        TaskCompletionSource taskCompletionSource = this.o;
        ba.c cVar = ((ba.b) this.m.b).b;
        if (ba.c.e(cVar.d.listFiles()).isEmpty() && ba.c.e(cVar.e.listFiles()).isEmpty() && ba.c.e(cVar.f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        t9.b bVar = t9.b.a;
        bVar.c("Crash reports are available to be sent.");
        r rVar = this.b;
        if (rVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            bVar.b("Automatic data collection is disabled.");
            bVar.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (rVar.c) {
                task2 = rVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new na.d());
            bVar.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.p.getTask();
            ExecutorService executorService = w.a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            v vVar = new v(1, taskCompletionSource2);
            onSuccessTask.continueWith(vVar);
            task4.continueWith(vVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new z0(this, task, false, 23));
    }
}
