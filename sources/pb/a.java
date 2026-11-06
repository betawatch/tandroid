package pb;

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class a {
    public final ReferenceQueue a = new ReferenceQueue();
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());
}
