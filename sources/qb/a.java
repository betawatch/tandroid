package qb;

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class a {
    public final ReferenceQueue a = new ReferenceQueue();
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());
}
