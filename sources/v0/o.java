package v0;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class o {
    public final List a;
    public final boolean b;

    public o(List list, boolean z10) {
        this.a = list;
        this.b = z10;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("credentialOptions should not be empty");
        }
        if (list.size() > 1) {
            List<q> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (q qVar : list2) {
                }
            }
            for (q qVar2 : this.a) {
            }
        }
    }
}
