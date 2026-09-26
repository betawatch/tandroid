package p2;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public abstract class p implements t2.a {
    public final String a;
    public final List b;
    public final boolean c;

    public p(String str, List list, boolean z10) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = z10;
    }
}
