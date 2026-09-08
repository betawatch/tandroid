package w7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class g7 {
    public static LanguageIdentifierImpl a() {
        ub.a aVar = (ub.a) qb.g.c().a(ub.a.class);
        ub.e eVar = aVar.b;
        eVar.getClass();
        v7.y8 y8Var = aVar.a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, y8Var, (Executor) aVar.c.a.get());
        fg.f fVar = new fg.f();
        fVar.c = languageIdentifierImpl.f;
        v7.a6 a6Var = new v7.a6(1, false);
        a6Var.c = LanguageIdentifierImpl.k();
        fVar.d = new v7.g7(a6Var);
        a5.a aVar2 = new a5.a(fVar, 1);
        Task task = y8Var.e;
        qb.m.a.execute(new com.google.android.gms.internal.cast.p(y8Var, aVar2, v7.j6.c, task.isSuccessful() ? (String) task.getResult() : n6.i.c.a(y8Var.g), 6));
        ((ub.e) languageIdentifierImpl.d.get()).b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
