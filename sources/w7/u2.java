package w7;

import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
