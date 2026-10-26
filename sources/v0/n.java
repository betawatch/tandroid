package v0;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
