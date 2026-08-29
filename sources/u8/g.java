package u8;

import a9.j;
import a9.q;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.emoji2.text.v;
import b9.m;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import v5.n;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g {
    public static final Object k = new Object();
    public static final a0.f l = new a0.f(0);
    public final Context a;
    public final String b;
    public final i c;
    public final j d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final q g;
    public final z9.b h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;

    public g(Context context, String str, i iVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        this.j = new CopyOnWriteArrayList();
        this.a = context;
        l.f(str);
        this.b = str;
        this.c = iVar;
        a aVar = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList o10 = new ze.b(context, new m5.i(ComponentDiscoveryService.class, 1)).o();
        Trace.endSection();
        Trace.beginSection("Runtime");
        m mVar = m.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(o10);
        int i10 = 1;
        arrayList.add(new a9.d(new FirebaseCommonRegistrar(), i10));
        arrayList.add(new a9.d(new ExecutorsRegistrar(), i10));
        arrayList2.add(a9.b.c(context, Context.class, new Class[0]));
        arrayList2.add(a9.b.c(this, g.class, new Class[0]));
        arrayList2.add(a9.b.c(iVar, i.class, new Class[0]));
        x9.d dVar = new x9.d(12);
        if ((Build.VERSION.SDK_INT >= 24 ? v.g(context) : true) && FirebaseInitProvider.b.get()) {
            arrayList2.add(a9.b.c(aVar, a.class, new Class[0]));
        }
        j jVar = new j(mVar, arrayList, arrayList2, dVar);
        this.d = jVar;
        Trace.endSection();
        this.g = new q(new a9.i(1, this, context));
        this.h = jVar.c(x9.c.class);
        d dVar2 = new d(this);
        a();
        if (atomicBoolean.get()) {
            com.google.android.gms.common.api.internal.d.e.a.get();
        }
        copyOnWriteArrayList.add(dVar2);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (k) {
            try {
                gVar = (g) l.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + g6.d.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((x9.c) gVar.h.get()).c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static g f(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return c();
                }
                i a2 = i.a(context);
                if (a2 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, a2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static g g(Context context, i iVar) {
        g gVar;
        AtomicReference atomicReference = e.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        com.google.android.gms.common.api.internal.d.b(application);
                        com.google.android.gms.common.api.internal.d.e.a(eVar);
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
            a0.f fVar = l;
            l.j("FirebaseApp name [DEFAULT] already exists!", !fVar.containsKey("[DEFAULT]"));
            l.i(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", iVar);
            fVar.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
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
        sb2.append(g6.b.c(this.b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(g6.b.c(this.c.b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.a;
        boolean g10 = i10 >= 24 ? v.g(context) : true;
        String str = this.b;
        if (g10) {
            StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
            a();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            a();
            this.d.h("[DEFAULT]".equals(str));
            ((x9.c) this.h.get()).c();
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
        a();
        sb3.append(str);
        Log.i("FirebaseApp", sb3.toString());
        AtomicReference atomicReference = f.b;
        if (atomicReference.get() == null) {
            f fVar = new f(context);
            while (!atomicReference.compareAndSet(null, fVar)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.b.equals(gVar.b);
    }

    public final boolean h() {
        boolean z10;
        a();
        ea.a aVar = (ea.a) this.g.get();
        synchronized (aVar) {
            z10 = aVar.a;
        }
        return z10;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        n nVar = new n(this);
        nVar.g(this.b, "name");
        nVar.g(this.c, "options");
        return nVar.toString();
    }
}
