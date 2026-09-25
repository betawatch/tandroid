package qb;

import ai.z9;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
