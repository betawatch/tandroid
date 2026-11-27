// default package

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
