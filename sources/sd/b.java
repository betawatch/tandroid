package sd;

import bd.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b extends k implements l {
    public final /* synthetic */ int b;
    public final /* synthetic */ d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i10) {
        super(1);
        this.b = i10;
        this.c = dVar;
    }

    @Override // bd.l
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.e(null);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.g;
                d dVar = this.c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                break;
        }
        return qc.i.a;
    }
}
