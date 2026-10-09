package w7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class l7 {
    public static LanguageIdentifierImpl a() {
        ub.a aVar = (ub.a) qb.g.c().a(ub.a.class);
        ub.e eVar = aVar.b;
        eVar.getClass();
        v7.z8 z8Var = aVar.a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, z8Var, (Executor) aVar.c.a.get());
        oi.f fVar = new oi.f();
        fVar.c = languageIdentifierImpl.f;
        v7.k kVar = new v7.k(4, false);
        kVar.c = LanguageIdentifierImpl.k();
        fVar.d = new v7.h7(kVar);
        a5.a aVar2 = new a5.a(fVar, 1);
        Task task = z8Var.e;
        qb.m.a.execute(new com.google.android.gms.internal.cast.p(z8Var, aVar2, v7.k6.c, task.isSuccessful() ? (String) task.getResult() : n6.i.c.a(z8Var.g), 6));
        ((ub.e) languageIdentifierImpl.d.get()).b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
