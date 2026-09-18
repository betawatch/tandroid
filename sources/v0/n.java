package v0;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class n {
    public final List a;
    public final boolean b;

    public n(List list, boolean z10) {
        this.a = list;
        this.b = z10;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("credentialOptions should not be empty");
        }
        if (list.size() > 1) {
            List<p> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (p pVar : list2) {
                }
            }
            for (p pVar2 : this.a) {
            }
        }
    }
}
