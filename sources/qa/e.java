package qa;

import java.util.Date;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class e implements na.v {
    @Override // na.v
    public final na.u create(na.g gVar, ua.a aVar) {
        if (aVar.a == Date.class) {
            return new h(g.a);
        }
        return null;
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}
