package p2;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class q implements t2.a {
    public final String a;
    public final List b;
    public final boolean c;

    public q(String str, List list, boolean z10) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = z10;
    }
}
