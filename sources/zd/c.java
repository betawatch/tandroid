package zd;

import java.util.HashMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c {
    public b b;
    public final HashMap c = new HashMap();
    public final boolean a = true;

    public final boolean a(Long l10) {
        boolean z10;
        synchronized (this.c) {
            try {
                b bVar = (b) this.c.get(l10);
                z10 = (bVar == null || bVar.isEmpty()) ? false : true;
            } finally {
            }
        }
        return z10;
    }
}
