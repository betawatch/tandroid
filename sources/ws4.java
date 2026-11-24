// default package

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ws4 {
    public final List a;
    public final boolean b;

    public ws4(List list, boolean z) {
        this.a = list;
        this.b = z;
        if (list.isEmpty()) {
            w26.j("credentialOptions should not be empty");
            throw null;
        }
        if (list.size() > 1) {
            List list2 = list;
            int i = 0;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if ((((r13) it.next()) instanceof ys4) && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            if (i > 0 && i != this.a.size()) {
                w26.j("Digital Credential Option cannot be used with other credential option.");
                throw null;
            }
            for (r13 r13Var : this.a) {
            }
        }
    }
}
