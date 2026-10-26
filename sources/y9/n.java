package y9;

import a8.ff;
import aa.a0;
import aa.b0;
import aa.c0;
import aa.c1;
import aa.d0;
import aa.d1;
import aa.e1;
import aa.f1;
import aa.f2;
import aa.g1;
import aa.g2;
import aa.h0;
import aa.i0;
import aa.j0;
import aa.m0;
import aa.n0;
import aa.o0;
import aa.p0;
import aa.s0;
import aa.v0;
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
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d5.z;
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
import m.r3;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class n {
    public static final da.a r = new da.a(4);
    public final Context a;
    public final s b;
    public final m4.c c;
    public final r3 d;
    public final com.google.firebase.messaging.q e;
    public final v f;
    public final da.c g;
    public final a h;
    public final z9.e i;
    public final v9.a j;
    public final w9.a k;
    public final j l;
    public final m0 m;
    public r n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public n(Context context, com.google.firebase.messaging.q qVar, v vVar, s sVar, da.c cVar, m4.c cVar2, a aVar, r3 r3Var, z9.e eVar, m0 m0Var, v9.a aVar2, w9.a aVar3, j jVar) {
        new AtomicBoolean(false);
        this.a = context;
        this.e = qVar;
        this.f = vVar;
        this.b = sVar;
        this.g = cVar;
        this.c = cVar2;
        this.h = aVar;
        this.d = r3Var;
        this.i = eVar;
        this.j = aVar2;
        this.k = aVar3;
        this.l = jVar;
        this.m = m0Var;
    }

    public static void a(n nVar, String str, Boolean bool) {
        long j10;
        Integer num;
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String j11 = b10.j("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", j11, null);
        }
        Locale locale = Locale.US;
        v vVar = nVar.f;
        a aVar = nVar.h;
        e1 e1Var = new e1(vVar.c, aVar.f, aVar.g, vVar.b().a, b10.d(aVar.d != null ? 4 : 1), aVar.h);
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        g1 g1Var = new g1(h.h());
        Context context = nVar.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        g gVar = g.a;
        String str4 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str4)) {
            g gVar2 = (g) g.b.get(str4.toLowerCase(locale));
            if (gVar2 != null) {
                gVar = gVar2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int ordinal = gVar.ordinal();
        String str5 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b10 = h.b(context);
        boolean g7 = h.g();
        int d = h.d();
        String str6 = Build.MANUFACTURER;
        String str7 = Build.PRODUCT;
        nVar.j.d(str, currentTimeMillis, new d1(e1Var, g1Var, new f1(ordinal, availableProcessors, d, b10, blockCount, g7)));
        if (!bool.booleanValue() || str == null) {
            j10 = currentTimeMillis;
        } else {
            r3 r3Var = nVar.d;
            synchronized (((String) r3Var.c)) {
                try {
                    r3Var.c = str;
                    Map a2 = ((z9.d) ((AtomicMarkableReference) ((c2.b) r3Var.d).b).getReference()).a();
                    List l4 = ((z) r3Var.f).l();
                    if (((String) ((AtomicMarkableReference) r3Var.h).getReference()) != null) {
                        j10 = currentTimeMillis;
                        ((z9.f) r3Var.a).i(str, (String) ((AtomicMarkableReference) r3Var.h).getReference());
                    } else {
                        j10 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((z9.f) r3Var.a).g(str, a2, false);
                    }
                    if (!l4.isEmpty()) {
                        ((z9.f) r3Var.a).h(str, l4);
                    }
                } finally {
                }
            }
        }
        z9.e eVar = nVar.i;
        ((z9.c) eVar.b).a();
        eVar.b = z9.e.c;
        if (str != null) {
            eVar.b = new z9.k(((da.c) eVar.a).b(str, "userlog"));
        }
        nVar.l.b(str);
        m0 m0Var = nVar.m;
        q qVar = (q) m0Var.a;
        Charset charset = g2.a;
        ff ffVar = new ff();
        ffVar.a = "18.6.0";
        a aVar2 = qVar.c;
        String str8 = aVar2.a;
        if (str8 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        ffVar.b = str8;
        v vVar2 = qVar.b;
        String str9 = vVar2.b().a;
        if (str9 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        ffVar.d = str9;
        ffVar.e = vVar2.b().b;
        String str10 = aVar2.f;
        if (str10 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        ffVar.g = str10;
        String str11 = aVar2.g;
        if (str11 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        ffVar.h = str11;
        ffVar.c = 4;
        h0 h0Var = new h0();
        h0Var.f = Boolean.FALSE;
        h0Var.d = Long.valueOf(j10);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        h0Var.b = str;
        String str12 = q.g;
        if (str12 == null) {
            throw new NullPointerException("Null generator");
        }
        h0Var.a = str12;
        String str13 = vVar2.c;
        if (str13 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str14 = vVar2.b().a;
        m4.c cVar = aVar2.h;
        if (((m2.t) cVar.c) == null) {
            cVar.c = new m2.t(cVar);
        }
        m2.t tVar = (m2.t) cVar.c;
        String str15 = tVar.b;
        if (tVar == null) {
            cVar.c = new m2.t(cVar);
        }
        h0Var.g = new j0(str13, str10, str11, str14, str15, ((m2.t) cVar.c).c);
        ti.e eVar2 = new ti.e(2, false);
        eVar2.b = 3;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        eVar2.c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        eVar2.d = str3;
        eVar2.e = Boolean.valueOf(h.h());
        h0Var.i = eVar2.d();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int i10 = 7;
        if (!TextUtils.isEmpty(str4) && (num = (Integer) q.f.get(str4.toLowerCase(locale))) != null) {
            i10 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long b11 = h.b(qVar.a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean g10 = h.g();
        int d10 = h.d();
        b0 b0Var = new b0();
        b0Var.a = Integer.valueOf(i10);
        if (str5 == null) {
            throw new NullPointerException("Null model");
        }
        b0Var.b = str5;
        b0Var.c = Integer.valueOf(availableProcessors2);
        b0Var.d = Long.valueOf(b11);
        b0Var.e = Long.valueOf(blockCount2);
        b0Var.h = Boolean.valueOf(g10);
        b0Var.f = Integer.valueOf(d10);
        if (str6 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        b0Var.g = str6;
        if (str7 == null) {
            throw new NullPointerException("Null modelClass");
        }
        b0Var.i = str7;
        h0Var.j = b0Var.b();
        h0Var.l = 3;
        ffVar.i = h0Var.a();
        a0 a10 = ffVar.a();
        da.c cVar2 = ((da.b) m0Var.b).b;
        f2 f2Var = a10.j;
        if (f2Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str16 = ((i0) f2Var).b;
        try {
            da.b.g.getClass();
            da.b.f(cVar2.b(str16, "report"), ba.a.a.c(a10));
            File b12 = cVar2.b(str16, "start-time");
            long j12 = ((i0) f2Var).d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), da.b.e);
            try {
                outputStreamWriter.write("");
                b12.setLastModified(j12 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e) {
            String j13 = b10.j("Could not persist report for session ", str16);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", j13, e);
            }
        }
    }

    public static Task b(n nVar) {
        Task call;
        nVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : da.c.e(nVar.g.b.listFiles(r))) {
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
    /* JADX WARN: Removed duplicated region for block: B:207:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r29v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z10, b0 b0Var) {
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
        ArrayList arrayList = new ArrayList(((da.b) this.m.b).c());
        FileInputStream fileInputStream2 = null;
        if (arrayList.size() <= z10) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str4 = (String) arrayList.get(z10 == true ? 1 : 0);
        if (b0Var.d().b.b) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    da.c cVar = this.g;
                    z9.e eVar = new z9.e(cVar);
                    eVar.b = z9.e.c;
                    if (str4 != null) {
                        eVar.b = new z9.k(cVar.b(str4, "userlog"));
                    }
                    da.c cVar2 = this.g;
                    com.google.firebase.messaging.q qVar = this.e;
                    z9.f fVar = new z9.f(cVar2);
                    r3 r3Var = new r3(str4, cVar2, qVar);
                    i10 = 4;
                    ((z9.d) ((AtomicMarkableReference) ((c2.b) r3Var.d).b).getReference()).d(fVar.c(str4, false));
                    ((z9.d) ((AtomicMarkableReference) ((c2.b) r3Var.e).b).getReference()).d(fVar.c(str4, true));
                    ((AtomicMarkableReference) r3Var.h).set(fVar.d(str4), false);
                    z zVar = (z) r3Var.f;
                    File b10 = cVar2.b(str4, "rollouts-state");
                    if (!b10.exists() || b10.length() == 0) {
                        z9.f.f(b10);
                        list = Collections.EMPTY_LIST;
                    } else {
                        try {
                            fileInputStream = new FileInputStream(b10);
                            try {
                                try {
                                    list = z9.f.b(h.j(fileInputStream));
                                    String str5 = "Loaded rollouts state:\n" + list + "\nfor session " + str4;
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", str5, null);
                                    }
                                    h.c(fileInputStream, "Failed to close rollouts state file.");
                                } catch (Exception e) {
                                    e = e;
                                    Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                    z9.f.f(b10);
                                    h.c(fileInputStream, "Failed to close rollouts state file.");
                                    list = Collections.EMPTY_LIST;
                                    synchronized (zVar) {
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
                    synchronized (zVar) {
                        ((ArrayList) zVar.c).clear();
                        if (list.size() > zVar.b) {
                            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + zVar.b, null);
                            ((ArrayList) zVar.c).addAll(list.subList(0, zVar.b));
                        } else {
                            ((ArrayList) zVar.c).addAll(list);
                        }
                    }
                    m0 m0Var = this.m;
                    da.b bVar = (da.b) m0Var.b;
                    long lastModified = bVar.b.b(str4, "start-time").lastModified();
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
                        String j11 = b10.j("No relevant ApplicationExitInfo occurred during session: ", str4);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", j11, null);
                        }
                    } else {
                        q qVar2 = (q) m0Var.a;
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
                            b0 b0Var2 = new b0();
                            b0Var2.f = Integer.valueOf(applicationExitInfo.getImportance());
                            processName = applicationExitInfo.getProcessName();
                            if (processName != null) {
                                throw new NullPointerException("Null processName");
                            }
                            b0Var2.b = processName;
                            b0Var2.c = Integer.valueOf(applicationExitInfo.getReason());
                            b0Var2.h = Long.valueOf(applicationExitInfo.getTimestamp());
                            b0Var2.a = Integer.valueOf(applicationExitInfo.getPid());
                            b0Var2.d = Long.valueOf(applicationExitInfo.getPss());
                            b0Var2.e = Long.valueOf(applicationExitInfo.getRss());
                            b0Var2.g = str3;
                            c0 a2 = b0Var2.a();
                            int i13 = qVar2.a.getResources().getConfiguration().orientation;
                            m0 m0Var2 = new m0();
                            m0Var2.b = "anr";
                            long j12 = a2.g;
                            m0Var2.a = Long.valueOf(j12);
                            a aVar = qVar2.c;
                            if (!qVar2.e.d().b.c || aVar.c.size() <= 0) {
                                i11 = i13;
                                j10 = j12;
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
                                    arrayList2.add(new d0(str7, str6, str8));
                                    i14 = i15;
                                    size = i16;
                                    arrayList3 = arrayList4;
                                    j12 = j12;
                                }
                                j10 = j12;
                                list2 = DesugarCollections.unmodifiableList(arrayList2);
                            }
                            b0 b0Var3 = new b0();
                            b0Var3.f = Integer.valueOf(a2.d);
                            String str9 = a2.b;
                            if (str9 == null) {
                                throw new NullPointerException("Null processName");
                            }
                            b0Var3.b = str9;
                            b0Var3.c = Integer.valueOf(a2.c);
                            b0Var3.h = Long.valueOf(j10);
                            b0Var3.a = Integer.valueOf(a2.a);
                            b0Var3.d = Long.valueOf(a2.e);
                            b0Var3.e = Long.valueOf(a2.f);
                            b0Var3.g = a2.h;
                            b0Var3.i = list2;
                            c0 a10 = b0Var3.a();
                            Boolean valueOf = Boolean.valueOf(a10.d != 100);
                            String processName2 = a10.b;
                            int i17 = a10.a;
                            int i18 = a10.d;
                            kotlin.jvm.internal.i.e(processName2, "processName");
                            if ((8 & 4) != 0) {
                                i18 = 0;
                            }
                            ti.e eVar3 = new ti.e(1, false);
                            eVar3.b = processName2;
                            eVar3.c = Integer.valueOf(i17);
                            eVar3.d = Integer.valueOf(i18);
                            eVar3.e = Boolean.FALSE;
                            v0 c10 = eVar3.c();
                            s0 s0Var = new s0(0L, "0", "0");
                            List a11 = qVar2.a();
                            if (a11 == null) {
                                throw new NullPointerException("Null binaries");
                            }
                            m0Var2.c = new o0(new p0(null, null, a10, s0Var, a11), null, null, valueOf, c10, null, i11);
                            m0Var2.d = qVar2.b(i11);
                            n0 f7 = m0Var2.f();
                            String j13 = b10.j("Persisting anr for session ", str4);
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", j13, null);
                            }
                            bVar.d(m0.c(m0.a(f7, eVar, r3Var), r3Var), str4, true);
                        }
                        str3 = null;
                        b0 b0Var22 = new b0();
                        b0Var22.f = Integer.valueOf(applicationExitInfo.getImportance());
                        processName = applicationExitInfo.getProcessName();
                        if (processName != null) {
                        }
                    }
                } else {
                    i10 = 4;
                    String j14 = b10.j("No ApplicationExitInfo available. Session: ", str4);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", j14, null);
                    }
                }
            } else {
                i10 = 4;
                String i19 = ic.a.i(i12, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", i19, null);
                }
            }
        } else {
            i10 = 4;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
            }
        }
        if (this.j.c(str4)) {
            String j15 = b10.j("Finalizing native report for session ", str4);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                r52 = 0;
                Log.v("FirebaseCrashlytics", j15, null);
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
        m0 m0Var3 = this.m;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        da.b bVar2 = (da.b) m0Var3.b;
        da.c cVar3 = bVar2.b;
        cVar3.getClass();
        File file = cVar3.a;
        da.c.a(new File(file, ".com.google.firebase.crashlytics"));
        da.c.a(new File(file, ".com.google.firebase.crashlytics-ndk"));
        if (Build.VERSION.SDK_INT >= 28) {
            da.c.a(new File(file, ".com.google.firebase.crashlytics.files.v1"));
        }
        NavigableSet<String> c11 = bVar2.c();
        if (str2 != null) {
            c11.remove(str2);
        }
        if (c11.size() > 8) {
            while (c11.size() > 8) {
                String str10 = (String) c11.last();
                String j16 = b10.j("Removing session over cap: ", str10);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", j16, null);
                }
                da.c.d(new File(cVar3.c, str10));
                c11.remove(str10);
            }
        }
        for (String str11 : c11) {
            String j17 = b10.j("Finalizing report for session ", str11);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", j17, null);
            }
            ba.a aVar2 = da.b.g;
            da.a aVar3 = da.b.i;
            File file2 = new File(cVar3.c, str11);
            file2.mkdirs();
            List<File> e12 = da.c.e(file2.listFiles(aVar3));
            if (e12.isEmpty()) {
                String p10 = a1.g.p("Session ", str11, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", p10, null);
                }
            } else {
                Collections.sort(e12);
                ArrayList arrayList5 = new ArrayList();
                boolean z13 = z11;
                for (File file3 : e12) {
                    try {
                        String e13 = da.b.e(file3);
                        aVar2.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(e13));
                            try {
                                n0 e14 = ba.a.e(jsonReader);
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
                    String d = new z9.f(cVar3).d(str11);
                    String a12 = bVar2.d.a(str11);
                    File b11 = cVar3.b(str11, "report");
                    try {
                        String e17 = da.b.e(b11);
                        aVar2.getClass();
                        a0 i20 = ba.a.i(e17);
                        ff a13 = i20.a();
                        f2 f2Var = i20.j;
                        if (f2Var != null) {
                            h0 a14 = f2Var.a();
                            a14.e = Long.valueOf(currentTimeMillis);
                            a14.f = Boolean.valueOf(z13);
                            if (d != null) {
                                a14.h = new c1(d);
                            }
                            a13.i = a14.a();
                        }
                        a0 a15 = a13.a();
                        ff a16 = a15.a();
                        a16.f = a12;
                        f2 f2Var2 = a15.j;
                        if (f2Var2 != null) {
                            h0 a17 = f2Var2.a();
                            a17.c = a12;
                            a16.i = a17.a();
                        }
                        a0 a18 = a16.a();
                        f2 f2Var3 = a18.j;
                        if (f2Var3 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        ff a19 = a18.a();
                        h0 a20 = f2Var3.a();
                        a20.k = arrayList5;
                        a19.i = a20.a();
                        a0 a21 = a19.a();
                        f2 f2Var4 = a21.j;
                        if (f2Var4 != null) {
                            String str12 = "appQualitySessionId: " + a12;
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    try {
                                        Log.d("FirebaseCrashlytics", str12, null);
                                    } catch (IOException e18) {
                                        e = e18;
                                    }
                                }
                                da.b.f(z13 ? new File(cVar3.e, ((i0) f2Var4).b) : new File(cVar3.d, ((i0) f2Var4).b), ba.a.a.c(a21));
                            } catch (IOException e19) {
                                e = e19;
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b11, e);
                                da.c.d(new File(cVar3.c, str11));
                                z11 = false;
                            }
                        }
                        e = e18;
                    } catch (IOException e20) {
                        e = e20;
                    }
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b11, e);
                }
                da.c.d(new File(cVar3.c, str11));
                z11 = false;
            }
            da.c.d(new File(cVar3.c, str11));
            z11 = false;
        }
        ag.j jVar = bVar2.c.d().a;
        ArrayList b12 = bVar2.b();
        int size2 = b12.size();
        int i21 = i10;
        if (size2 <= i21) {
            return;
        }
        Iterator it2 = b12.subList(i21, size2).iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    public final boolean d(b0 b0Var) {
        if (!Boolean.TRUE.equals(((ThreadLocal) this.e.d).get())) {
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
            c(true, b0Var);
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
        NavigableSet c10 = ((da.b) this.m.b).c();
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
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e10);
        }
    }

    public final Task h(Task task) {
        Task task2;
        Task task3;
        TaskCompletionSource taskCompletionSource = this.o;
        da.c cVar = ((da.b) this.m.b).b;
        if (da.c.e(cVar.d.listFiles()).isEmpty() && da.c.e(cVar.e.listFiles()).isEmpty() && da.c.e(cVar.f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        v9.b bVar = v9.b.a;
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
            Task onSuccessTask = task2.onSuccessTask(new qb.a(27));
            bVar.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.p.getTask();
            ExecutorService executorService = x.a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            w wVar = new w(1, taskCompletionSource2);
            onSuccessTask.continueWith(wVar);
            task4.continueWith(wVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new l(this, task));
    }
}
