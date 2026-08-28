package w2;

import android.content.Context;
import com.google.firebase.messaging.t;
import j$.util.DesugarCollections;
import j3.r0;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q {
    public static volatile j e;
    public final f3.a a;
    public final f3.a b;
    public final b3.c c;
    public final c3.h d;

    public q(f3.a aVar, f3.a aVar2, b3.c cVar, c3.h hVar, t tVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = cVar;
        this.d = hVar;
        ((Executor) tVar.b).execute(new af.e(tVar, 19));
    }

    public static q a() {
        j jVar = e;
        if (jVar != null) {
            return (q) jVar.f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (q.class) {
                try {
                    if (e == null) {
                        k0.b bVar = new k0.b();
                        context.getClass();
                        bVar.a = context;
                        e = bVar.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final o c(k kVar) {
        byte[] bytes;
        Set unmodifiableSet = kVar != null ? DesugarCollections.unmodifiableSet(u2.a.d) : Collections.singleton(new t2.c("proto"));
        t5.c a2 = i.a();
        kVar.getClass();
        a2.c = "cct";
        u2.a aVar = (u2.a) kVar;
        String str = aVar.a;
        String str2 = aVar.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = r0.o("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.b = bytes;
        return new o(unmodifiableSet, a2.b(), this);
    }
}
