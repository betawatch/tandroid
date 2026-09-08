package qb;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class l extends PhantomReference {
    public final Set a;
    public final androidx.emoji2.text.n b;

    public /* synthetic */ l(a aVar, ReferenceQueue referenceQueue, Set set, androidx.emoji2.text.n nVar) {
        super(aVar, referenceQueue);
        this.a = set;
        this.b = nVar;
    }
}
