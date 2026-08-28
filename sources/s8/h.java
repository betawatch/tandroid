package s8;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.emoji2.text.v;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import x5.l;
import y8.n;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h {
    public static final Object k = new Object();
    public static final a0.f l = new a0.f(0);
    public final Context a;
    public final String b;
    public final j c;
    public final y8.g d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final n g;
    public final x9.b h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;

    public h(Context context, String str, j jVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        this.j = new CopyOnWriteArrayList();
        this.a = context;
        l.f(str);
        this.b = str;
        this.c = jVar;
        a aVar = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList e10 = new w4.e(12, context, new na.e(ComponentDiscoveryService.class)).e();
        Trace.endSection();
        Trace.beginSection("Runtime");
        z8.j jVar2 = z8.j.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(e10);
        int i9 = 1;
        arrayList.add(new y8.c(new FirebaseCommonRegistrar(), i9));
        arrayList.add(new y8.c(new ExecutorsRegistrar(), i9));
        arrayList2.add(y8.a.c(context, Context.class, new Class[0]));
        arrayList2.add(y8.a.c(this, h.class, new Class[0]));
        arrayList2.add(y8.a.c(jVar, j.class, new Class[0]));
        v9.d dVar = new v9.d(12);
        if ((Build.VERSION.SDK_INT >= 24 ? v.g(context) : true) && FirebaseInitProvider.b.get()) {
            arrayList2.add(y8.a.c(aVar, a.class, new Class[0]));
        }
        y8.g gVar = new y8.g(jVar2, arrayList, arrayList2, dVar);
        this.d = gVar;
        Trace.endSection();
        this.g = new n(new d(0, this, context));
        this.h = gVar.e(v9.c.class);
        e eVar = new e(this);
        a();
        if (atomicBoolean.get()) {
            com.google.android.gms.common.api.internal.d.e.a.get();
        }
        copyOnWriteArrayList.add(eVar);
        Trace.endSection();
    }

    public static h c() {
        h hVar;
        synchronized (k) {
            try {
                hVar = (h) l.get("[DEFAULT]");
                if (hVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + e6.d.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((v9.c) hVar.h.get()).c();
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public static h f(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return c();
                }
                j a2 = j.a(context);
                if (a2 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, a2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static h g(Context context, j jVar) {
        h hVar;
        AtomicReference atomicReference = f.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = f.a;
            if (atomicReference2.get() == null) {
                f fVar = new f();
                while (true) {
                    if (atomicReference2.compareAndSet(null, fVar)) {
                        com.google.android.gms.common.api.internal.d.b(application);
                        com.google.android.gms.common.api.internal.d.e.a(fVar);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            a0.f fVar2 = l;
            l.j("FirebaseApp name [DEFAULT] already exists!", !fVar2.containsKey("[DEFAULT]"));
            l.i(context, "Application context cannot be null.");
            hVar = new h(context, "[DEFAULT]", jVar);
            fVar2.put("[DEFAULT]", hVar);
        }
        hVar.e();
        return hVar;
    }

    public final void a() {
        l.j("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(e6.b.c(this.b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(e6.b.c(this.c.b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        int i9 = Build.VERSION.SDK_INT;
        Context context = this.a;
        boolean g10 = i9 >= 24 ? v.g(context) : true;
        String str = this.b;
        if (g10) {
            StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
            a();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            a();
            this.d.d("[DEFAULT]".equals(str));
            ((v9.c) this.h.get()).c();
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
        a();
        sb3.append(str);
        Log.i("FirebaseApp", sb3.toString());
        AtomicReference atomicReference = g.b;
        if (atomicReference.get() == null) {
            g gVar = new g(context);
            while (!atomicReference.compareAndSet(null, gVar)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(gVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        hVar.a();
        return this.b.equals(hVar.b);
    }

    public final boolean h() {
        boolean z10;
        a();
        ca.a aVar = (ca.a) this.g.get();
        synchronized (aVar) {
            z10 = aVar.a;
        }
        return z10;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        w4.e eVar = new w4.e((Object) this);
        eVar.c(this.b, "name");
        eVar.c(this.c, "options");
        return eVar.toString();
    }
}
