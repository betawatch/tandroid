// default package

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xu4 {
    public final List a;
    public final boolean b;

    public xu4(List list, boolean z) {
        this.a = list;
        this.b = z;
        if (list.isEmpty()) {
            u36.j("credentialOptions should not be empty");
            throw null;
        }
        if (list.size() > 1) {
            List list2 = list;
            int i = 0;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if ((((c33) it.next()) instanceof zu4) && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            if (i > 0 && i != this.a.size()) {
                u36.j("Digital Credential Option cannot be used with other credential option.");
                throw null;
            }
            for (c33 c33Var : this.a) {
            }
        }
    }
}
