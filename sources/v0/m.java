package v0;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m {
    public final List a;
    public final boolean b;

    public m(List list, boolean z10) {
        this.a = list;
        this.b = z10;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("credentialOptions should not be empty");
        }
        if (list.size() > 1) {
            List<o> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (o oVar : list2) {
                }
            }
            for (o oVar2 : this.a) {
            }
        }
    }
}
