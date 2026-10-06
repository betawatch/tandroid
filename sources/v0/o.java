package v0;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
