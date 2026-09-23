package v0;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
