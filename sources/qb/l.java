package qb;

import ai.aa;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class l extends PhantomReference {
    public final Set a;
    public final aa b;

    public /* synthetic */ l(a aVar, ReferenceQueue referenceQueue, Set set, aa aaVar) {
        super(aVar, referenceQueue);
        this.a = set;
        this.b = aaVar;
    }
}
