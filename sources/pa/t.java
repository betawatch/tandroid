package pa;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class t {
    public static final p a;
    public static final q b;
    public static final /* synthetic */ t[] c;

    static {
        p pVar = new p();
        a = pVar;
        q qVar = new q();
        b = qVar;
        c = new t[]{pVar, qVar, new t() { // from class: pa.r
            public static Double b(String str, xa.a aVar) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite() && !valueOf.isNaN()) {
                        return valueOf;
                    }
                    throw new xa.c("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.j());
                } catch (NumberFormatException e6) {
                    StringBuilder t6 = android.support.v4.media.a.t("Cannot parse ", str, "; at path ");
                    t6.append(aVar.j());
                    throw new a7.b(t6.toString(), e6);
                }
            }

            @Override // pa.t
            public final Number a(xa.a aVar) {
                String v = aVar.v();
                if (v.indexOf(46) >= 0) {
                    return b(v, aVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(v));
                } catch (NumberFormatException unused) {
                    return b(v, aVar);
                }
            }
        }, new t() { // from class: pa.s
            @Override // pa.t
            public final Number a(xa.a aVar) {
                String v = aVar.v();
                try {
                    return ra.d.i(v);
                } catch (NumberFormatException e6) {
                    StringBuilder t6 = android.support.v4.media.a.t("Cannot parse ", v, "; at path ");
                    t6.append(aVar.j());
                    throw new a7.b(t6.toString(), e6);
                }
            }
        }};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) c.clone();
    }

    public abstract Number a(xa.a aVar);
}
