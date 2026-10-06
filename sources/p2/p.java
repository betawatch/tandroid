package p2;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
