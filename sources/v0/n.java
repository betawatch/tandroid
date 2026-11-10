package v0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class n {
    public final List a;
    public final boolean b;

    public n(List list, boolean z9) {
        this.a = list;
        this.b = z9;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("credentialOptions should not be empty");
        }
        if (list.size() > 1) {
            List list2 = list;
            int i7 = 0;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if ((((h) it.next()) instanceof p) && (i7 = i7 + 1) < 0) {
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
