package y2;

import android.content.Context;
import androidx.biometric.t;
import com.google.firebase.messaging.r;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class q {
    public static volatile j e;
    public final h3.a a;
    public final h3.a b;
    public final d3.b c;
    public final e3.g d;

    public q(h3.a aVar, h3.a aVar2, d3.b bVar, e3.g gVar, r rVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = bVar;
        this.d = gVar;
        ((Executor) rVar.a).execute(new e3.h(rVar, 0));
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
                        t tVar = new t();
                        context.getClass();
                        tVar.a = context;
                        e = tVar.b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final o c(k kVar) {
        byte[] bytes;
        Set unmodifiableSet = kVar != null ? DesugarCollections.unmodifiableSet(w2.a.d) : Collections.singleton(new v2.c("proto"));
        s5.m a2 = i.a();
        kVar.getClass();
        a2.b = "cct";
        w2.a aVar = (w2.a) kVar;
        String str = aVar.a;
        String str2 = aVar.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = e2.c.k("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.c = bytes;
        return new o(unmodifiableSet, a2.f(), this);
    }
}
