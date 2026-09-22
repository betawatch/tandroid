package qb;

import ai.z9;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
