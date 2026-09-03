package sa;

import java.util.Date;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class e implements pa.v {
    @Override // pa.v
    public final pa.u create(pa.g gVar, wa.a aVar) {
        if (aVar.a == Date.class) {
            return new h(g.a);
        }
        return null;
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}
