package pc;

import java.util.Locale;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public enum m extends a2 {
    public m() {
        super("RcdataLessthanSign", 10);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        if (aVar.m('/')) {
            kVar.e();
            kVar.a(a2.v);
            return;
        }
        if (aVar.o() && kVar.o != null) {
            String str = "</" + kVar.o;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str.toLowerCase(locale);
            String upperCase = str.toUpperCase(locale);
            if (aVar.p(lowerCase) <= -1 && aVar.p(upperCase) <= -1) {
                j d = kVar.d(false);
                String str2 = kVar.o;
                d.c = str2;
                d.d = str2 != null ? str2.toLowerCase(locale) : "";
                kVar.i = d;
                kVar.k();
                aVar.q();
                kVar.c = a2.a;
                return;
            }
        }
        kVar.g("<");
        kVar.c = a2.c;
    }
}
