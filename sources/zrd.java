// default package

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
