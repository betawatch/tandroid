package w7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class u7 {
    public static LanguageIdentifierImpl a() {
        vb.a aVar = (vb.a) rb.g.c().a(vb.a.class);
        vb.e eVar = aVar.b;
        eVar.getClass();
        v7.y8 y8Var = aVar.a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, y8Var, (Executor) aVar.c.a.get());
        qi.e eVar2 = new qi.e();
        eVar2.c = languageIdentifierImpl.f;
        t0.h hVar = new t0.h(6, false);
        hVar.c = LanguageIdentifierImpl.k();
        eVar2.d = new v7.g7(hVar);
        a5.a aVar2 = new a5.a(eVar2, 1);
        Task task = y8Var.e;
        rb.m.a.execute(new com.google.android.gms.internal.cast.p(y8Var, aVar2, v7.j6.c, task.isSuccessful() ? (String) task.getResult() : n6.i.c.a(y8Var.g), 6));
        ((vb.e) languageIdentifierImpl.d.get()).b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
