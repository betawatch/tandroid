// default package

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class pi2 {
    public final ReferenceQueue a = new ReferenceQueue();
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());
}
