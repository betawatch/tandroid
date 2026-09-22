package p2;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
