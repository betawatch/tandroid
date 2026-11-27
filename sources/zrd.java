// default package

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class zrd extends PhantomReference {
    public final Set a;
    public final tv b;

    public /* synthetic */ zrd(pi2 pi2Var, ReferenceQueue referenceQueue, Set set, tv tvVar) {
        super(pi2Var, referenceQueue);
        this.a = set;
        this.b = tvVar;
    }
}
