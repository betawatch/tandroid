package w7;

import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class u2 implements ka.d {
    public static final u2 a = new u2();
    public static final ka.c b = new ka.c("identifyLanguageConfidenceThreshold", ic.a.m(b10.m(h.class, new e(1))));
    public static final ka.c c = new ka.c("identifyAllLanguagesConfidenceThreshold", ic.a.m(b10.m(h.class, new e(2))));
    public static final ka.c d = new ka.c("confidenceThreshold", ic.a.m(b10.m(h.class, new e(3))));

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        ka.e eVar = (ka.e) obj2;
        eVar.a(b, null);
        eVar.a(c, null);
        eVar.a(d, ((i6) obj).a);
    }
}
