package w8;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.emoji2.text.w;
import b6.m;
import c9.j;
import c9.q;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import d9.l;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
    public final ba.b h;
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
        m.f(str);
        this.b = str;
        this.c = iVar;
        a aVar = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList w10 = new af.c(16, context, new c9.e(ComponentDiscoveryService.class)).w();
        Trace.endSection();
        Trace.beginSection("Runtime");
        l lVar = l.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(w10);
        int i10 = 1;
        arrayList.add(new c9.d(new FirebaseCommonRegistrar(), i10));
        arrayList.add(new c9.d(new ExecutorsRegistrar(), i10));
        arrayList2.add(c9.b.c(context, Context.class, new Class[0]));
        arrayList2.add(c9.b.c(this, g.class, new Class[0]));
        arrayList2.add(c9.b.c(iVar, i.class, new Class[0]));
        ab.a aVar2 = new ab.a(15);
        if ((Build.VERSION.SDK_INT >= 24 ? w.g(context) : true) && FirebaseInitProvider.b.get()) {
            arrayList2.add(c9.b.c(aVar, a.class, new Class[0]));
        }
        j jVar = new j(lVar, arrayList, arrayList2, aVar2);
        this.d = jVar;
        Trace.endSection();
        this.g = new q(new c9.i(1, this, context));
        this.h = jVar.c(z9.c.class);
        d dVar = new d(this);
        a();
        if (atomicBoolean.get()) {
            com.google.android.gms.common.api.internal.d.e.a.get();
        }
        copyOnWriteArrayList.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (k) {
            try {
                gVar = (g) l.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + i6.d.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((z9.c) gVar.h.get()).c();
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
            m.j("FirebaseApp name [DEFAULT] already exists!", !fVar.containsKey("[DEFAULT]"));
            m.i(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", iVar);
            fVar.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        m.j("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(i6.b.c(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(i6.b.c(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void e() {
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.a;
        boolean g10 = i10 >= 24 ? w.g(context) : true;
        String str = this.b;
        if (g10) {
            StringBuilder sb = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
            a();
            sb.append(str);
            Log.i("FirebaseApp", sb.toString());
            a();
            this.d.h("[DEFAULT]".equals(str));
            ((z9.c) this.h.get()).c();
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
        a();
        sb2.append(str);
        Log.i("FirebaseApp", sb2.toString());
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
        boolean z4;
        a();
        ga.a aVar = (ga.a) this.g.get();
        synchronized (aVar) {
            z4 = aVar.a;
        }
        return z4;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        af.c cVar = new af.c((Object) this);
        cVar.s(this.b, "name");
        cVar.s(this.c, "options");
        return cVar.toString();
    }
}
