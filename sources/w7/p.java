package w7;

import a8.fg;
import a8.ng;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class p {
    public static LanguageIdentifierImpl a() {
        wb.a aVar = (wb.a) sb.g.c().a(wb.a.class);
        wb.e eVar = aVar.b;
        eVar.getClass();
        d9 d9Var = aVar.a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, d9Var, (Executor) aVar.c.a.get());
        ti.e eVar2 = new ti.e(13, false);
        eVar2.d = languageIdentifierImpl.f;
        s4.d dVar = new s4.d(11, false);
        dVar.c = LanguageIdentifierImpl.k();
        eVar2.e = new k7(dVar);
        ng ngVar = new ng(eVar2, 1);
        Task task = d9Var.e;
        sb.m.a.execute(new fg(d9Var, ngVar, m6.c, task.isSuccessful() ? (String) task.getResult() : o6.i.c.a(d9Var.g), 7));
        ((wb.e) languageIdentifierImpl.d.get()).b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
