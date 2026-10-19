package re;

import java.util.HashMap;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class c {
    public b b;
    public final HashMap c = new HashMap();
    public final boolean a = true;

    public final boolean a(Long l4) {
        boolean z10;
        synchronized (this.c) {
            try {
                b bVar = (b) this.c.get(l4);
                z10 = (bVar == null || bVar.isEmpty()) ? false : true;
            } finally {
            }
        }
        return z10;
    }
}
