package s2;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class q implements w2.a {
    public final String a;
    public final List b;
    public final boolean c;

    public q(String str, List list, boolean z9) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = z9;
    }
}
