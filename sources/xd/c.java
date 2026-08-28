package xd;

import java.util.HashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
