package pe;

import java.util.HashMap;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
