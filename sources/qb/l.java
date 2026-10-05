package qb;

import ai.z9;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class l extends PhantomReference {
    public final Set a;
    public final z9 b;

    public /* synthetic */ l(a aVar, ReferenceQueue referenceQueue, Set set, z9 z9Var) {
        super(aVar, referenceQueue);
        this.a = set;
        this.b = z9Var;
    }
}
