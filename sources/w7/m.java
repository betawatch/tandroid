package w7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class m {
    public static LanguageIdentifierImpl a() {
        nb.a aVar = (nb.a) jb.g.c().a(nb.a.class);
        nb.e eVar = aVar.b;
        eVar.getClass();
        v7.x8 x8Var = aVar.a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, x8Var, (Executor) aVar.c.a.get());
        xa.n nVar = new xa.n();
        nVar.c = languageIdentifierImpl.f;
        q5.d dVar = new q5.d(13, false);
        dVar.c = LanguageIdentifierImpl.k();
        nVar.d = new v7.d7(dVar);
        a5.a aVar2 = new a5.a(nVar, 1);
        Task task = x8Var.e;
        jb.m.a.execute(new com.google.android.gms.internal.cast.o(x8Var, aVar2, v7.g6.c, task.isSuccessful() ? (String) task.getResult() : n6.i.c.a(x8Var.g), 6));
        ((nb.e) languageIdentifierImpl.d.get()).b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
