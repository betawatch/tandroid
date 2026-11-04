package z9;

import android.app.ApplicationExitInfo;
import android.content.Context;
import android.util.Log;
import ca.a1;
import ca.c0;
import ca.d0;
import ca.e1;
import ca.h0;
import ca.h1;
import ca.i1;
import ca.j2;
import ca.k1;
import ca.l1;
import ca.q2;
import ca.s0;
import ca.t0;
import ca.u0;
import ca.v0;
import ca.w0;
import ca.y0;
import ca.z0;
import com.google.android.gms.common.api.internal.j1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.function.Predicate;
import m.o3;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x {
    public final q a;
    public final fa.d b;
    public final ga.a c;
    public final ba.f d;
    public final o3 e;
    public final v f;
    public final aa.g g;

    public x(q qVar, fa.d dVar, ga.a aVar, ba.f fVar, o3 o3Var, v vVar, aa.g gVar) {
        this.a = qVar;
        this.b = dVar;
        this.c = aVar;
        this.d = fVar;
        this.e = o3Var;
        this.f = vVar;
        this.g = gVar;
    }

    public static t0 a(t0 t0Var, ba.f fVar, o3 o3Var, Map map) {
        Map unmodifiableMap;
        s0 a10 = t0Var.a();
        String D = ((ba.d) fVar.b).D();
        if (D != null) {
            a10.e = new h1(D);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        b4.n nVar = (b4.n) o3Var.d;
        if (map.isEmpty()) {
            unmodifiableMap = ((ba.e) ((AtomicMarkableReference) nVar.b).getReference()).a();
        } else {
            HashMap hashMap = new HashMap(((ba.e) ((AtomicMarkableReference) nVar.b).getReference()).a());
            int i3 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String b10 = ba.e.b(1024, (String) entry.getKey());
                if (hashMap.size() < 64 || hashMap.containsKey(b10)) {
                    hashMap.put(b10, ba.e.b(1024, (String) entry.getValue()));
                } else {
                    i3++;
                }
            }
            if (i3 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i3 + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap);
        }
        List f10 = f(unmodifiableMap);
        List f11 = f(((ba.e) ((AtomicMarkableReference) ((b4.n) o3Var.e).b).getReference()).a());
        if (!f10.isEmpty() || !f11.isEmpty()) {
            u0 a11 = t0Var.c.a();
            a11.b = f10;
            a11.c = f11;
            a10.c = a11.a();
        }
        return a10.a();
    }

    public static q2 b(t0 t0Var, o3 o3Var) {
        List l10 = ((e5.u) o3Var.f).l();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < l10.size(); i3++) {
            ba.p pVar = (ba.p) l10.get(i3);
            pVar.getClass();
            i1 i1Var = new i1();
            ba.b bVar = (ba.b) pVar;
            String str = bVar.e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = bVar.b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            i1Var.a = new k1(str2, str);
            String str3 = bVar.c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            i1Var.b = str3;
            String str4 = bVar.d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            i1Var.c = str4;
            i1Var.d = bVar.f;
            i1Var.e = (byte) (i1Var.e | 1);
            arrayList.add(i1Var.a());
        }
        if (arrayList.isEmpty()) {
            return t0Var;
        }
        s0 a10 = t0Var.a();
        a10.f = new l1(arrayList);
        return a10.a();
    }

    public static String c(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[TLObject.FLAG_13];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return byteArrayOutputStream2;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static x d(Context context, v vVar, fa.f fVar, a aVar, ba.f fVar2, o3 o3Var, tf.b bVar, ha.c cVar, ua.b bVar2, i iVar, aa.g gVar) {
        q qVar = new q(context, vVar, aVar, bVar, cVar);
        fa.d dVar = new fa.d(fVar, cVar, iVar);
        da.a aVar2 = ga.a.b;
        n5.s.b(context);
        return new x(qVar, dVar, new ga.a(new ga.c(n5.s.a().c(new l5.a(ga.a.c, ga.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new k5.c("json"), ga.a.e), cVar.b(), bVar2)), fVar2, o3Var, vVar, gVar);
    }

    public static List f(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new h0(str, str2));
        }
        Collections.sort(arrayList, new vg.i1(11));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final ApplicationExitInfo e(String str, List list, Predicate predicate) {
        long lastModified = this.b.b.b(str, "start-time").lastModified();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) it.next();
            if (applicationExitInfo.getTimestamp() >= lastModified && predicate.test(applicationExitInfo)) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    public final void g(Throwable th2, Thread thread, String str, ba.c cVar, boolean z10) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        byte b10;
        boolean equals = str.equals("crash");
        long j10 = cVar.b;
        q qVar = this.a;
        Context context = qVar.a;
        int i3 = context.getResources().getConfiguration().orientation;
        tf.b bVar = qVar.d;
        Stack stack = new Stack();
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
            stack.push(th3);
        }
        za.p pVar = null;
        while (!stack.isEmpty()) {
            Throwable th4 = (Throwable) stack.pop();
            pVar = new za.p(th4.getLocalizedMessage(), th4.getClass().getName(), bVar.A(th4.getStackTrace()), pVar);
        }
        s0 s0Var = new s0();
        s0Var.b = str;
        s0Var.a = j10;
        s0Var.g = (byte) (s0Var.g | 1);
        j2 b11 = w9.d.a.b(context);
        int i10 = ((e1) b11).c;
        Boolean valueOf = i10 > 0 ? Boolean.valueOf(i10 != 100) : null;
        ArrayList a10 = w9.d.a(context);
        byte b12 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) pVar.c;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b13 = (byte) 1;
        List d = q.d(stackTraceElementArr, 4);
        if (d == null) {
            throw new NullPointerException("Null frames");
        }
        Boolean bool = valueOf;
        if (b13 != 1) {
            StringBuilder sb2 = new StringBuilder();
            if (b13 == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
        }
        arrayList.add(new a1(name, 4, d));
        if (z10) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    it = it2;
                    b10 = b13;
                } else {
                    StackTraceElement[] A = bVar.A(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    it = it2;
                    List d10 = q.d(A, 0);
                    if (d10 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    if (b13 != 1) {
                        byte b14 = b13;
                        StringBuilder sb3 = new StringBuilder();
                        if (b14 == 0) {
                            sb3.append(" importance");
                        }
                        throw new IllegalStateException(t4.c.g("Missing required properties:", sb3));
                    }
                    b10 = b13;
                    arrayList.add(new a1(name2, 0, d10));
                }
                it2 = it;
                b13 = b10;
            }
        }
        List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        y0 c2 = q.c(pVar, 0);
        z0 e10 = q.e();
        List a11 = qVar.a();
        if (a11 == null) {
            throw new NullPointerException("Null binaries");
        }
        w0 w0Var = new w0(unmodifiableList, c2, null, null, e10, a11);
        if (b12 != 1) {
            StringBuilder sb4 = new StringBuilder();
            if (b12 == 0) {
                sb4.append(" uiOrientation");
            }
            throw new IllegalStateException(t4.c.g("Missing required properties:", sb4));
        }
        s0Var.c = new v0(w0Var, null, null, bool, b11, a10, i3);
        s0Var.d = qVar.b(i3);
        t0 a12 = s0Var.a();
        Map map = cVar.c;
        ba.f fVar = this.d;
        o3 o3Var = this.e;
        q2 b15 = b(a(a12, fVar, o3Var, map), o3Var);
        if (z10) {
            this.b.e(b15, cVar.a, equals);
        } else {
            this.g.b.a(new rn(this, b15, cVar, equals, 18));
        }
    }

    public final Task h(String str, Executor executor) {
        TaskCompletionSource taskCompletionSource;
        ArrayList c2 = this.b.c();
        ArrayList arrayList = new ArrayList();
        int size = c2.size();
        int i3 = 0;
        while (i3 < size) {
            int i10 = i3 + 1;
            File file = (File) c2.get(i3);
            try {
                da.a aVar = fa.d.g;
                String f10 = fa.d.f(file);
                aVar.getClass();
                arrayList.add(new b(da.a.j(f10), file.getName(), file));
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
            i3 = i10;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            b bVar = (b) obj;
            if (str == null || str.equals(bVar.b)) {
                ga.a aVar2 = this.c;
                d0 d0Var = bVar.a;
                if (d0Var.f == null || d0Var.g == null) {
                    u b10 = this.f.b(true);
                    d0 d0Var2 = bVar.a;
                    String str2 = b10.a;
                    c0 a10 = d0Var2.a();
                    a10.e = str2;
                    d0 a11 = a10.a();
                    String str3 = b10.b;
                    c0 a12 = a11.a();
                    a12.f = str3;
                    bVar = new b(a12.a(), bVar.b, bVar.c);
                }
                boolean z10 = str != null;
                ga.c cVar = aVar2.a;
                synchronized (cVar.f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z10) {
                            ((AtomicInteger) cVar.i.b).getAndIncrement();
                            if (cVar.f.size() < cVar.e) {
                                w9.c cVar2 = w9.c.a;
                                cVar2.b("Enqueueing report: " + bVar.b);
                                cVar2.b("Queue size: " + cVar.f.size());
                                cVar.g.execute(new j1(cVar, bVar, taskCompletionSource, 4));
                                cVar2.b("Closing task for report: " + bVar.b);
                                taskCompletionSource.trySetResult(bVar);
                            } else {
                                cVar.a();
                                String str4 = "Dropping report due to queue being full: " + bVar.b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) cVar.i.c).getAndIncrement();
                                taskCompletionSource.trySetResult(bVar);
                            }
                        } else {
                            cVar.b(bVar, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new j(this)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }
}
