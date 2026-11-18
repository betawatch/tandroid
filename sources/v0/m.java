package v0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
            List list2 = list;
            int i7 = 0;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if ((((h) it.next()) instanceof o) && (i7 = i7 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            if (i7 > 0 && i7 != this.a.size()) {
                throw new IllegalArgumentException("Digital Credential Option cannot be used with other credential option.");
            }
            for (h hVar : this.a) {
            }
        }
    }
}
