package w7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public abstract class h7 {
    public static LanguageIdentifierImpl a() {
        ub.a aVar = (ub.a) qb.g.c().a(ub.a.class);
        ub.e eVar = aVar.b;
        eVar.getClass();
        v7.y8 y8Var = aVar.a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, y8Var, (Executor) aVar.c.a.get());
        oi.f fVar = new oi.f();
        fVar.c = languageIdentifierImpl.f;
        v7.r1 r1Var = new v7.r1(3, false);
        r1Var.d = LanguageIdentifierImpl.k();
        fVar.d = new v7.g7(r1Var);
        a5.a aVar2 = new a5.a(fVar, 1);
        Task task = y8Var.e;
        qb.m.a.execute(new com.google.android.gms.internal.cast.p(y8Var, aVar2, v7.j6.c, task.isSuccessful() ? (String) task.getResult() : n6.i.c.a(y8Var.g), 6));
        ((ub.e) languageIdentifierImpl.d.get()).b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
