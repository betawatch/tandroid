package w2;

import android.content.Context;
import com.google.firebase.messaging.t;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q {
    public static volatile j e;
    public final f3.a a;
    public final f3.a b;
    public final b3.b c;
    public final c3.g d;

    public q(f3.a aVar, f3.a aVar2, b3.b bVar, c3.g gVar, t tVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = bVar;
        this.d = gVar;
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
                        v0.j jVar = new v0.j();
                        context.getClass();
                        jVar.a = context;
                        e = jVar.a();
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
        u2.b a2 = i.a();
        kVar.getClass();
        a2.b = "cct";
        u2.a aVar = (u2.a) kVar;
        String str = aVar.a;
        String str2 = aVar.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = i0.a.n("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.c = bytes;
        return new o(unmodifiableSet, a2.d(), this);
    }
}
