// default package

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class th2 {
    public final ReferenceQueue a = new ReferenceQueue();
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());
}
