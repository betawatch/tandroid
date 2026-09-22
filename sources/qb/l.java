package qb;

import ai.z9;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
