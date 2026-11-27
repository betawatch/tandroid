// default package

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class wc0 extends iv5 {
    public static final /* synthetic */ long n = fx.a.objectFieldOffset(wc0.class.getDeclaredField("_disposer$volatile"));
    private volatile /* synthetic */ Object _disposer$volatile;
    public final va1 e;
    public ep3 f;
    public final /* synthetic */ yc0 h;

    public wc0(yc0 yc0Var, va1 va1Var) {
        this.h = yc0Var;
        this.e = va1Var;
    }

    @Override // iv5
    public final void l(Throwable th) {
        va1 va1Var = this.e;
        if (th != null) {
            ow5 E = va1Var.E(new yp2(th, false), null);
            if (E != null) {
                va1Var.e(E);
                xc0 xc0Var = (xc0) fx.a.getObjectVolatile(this, n);
                if (xc0Var != null) {
                    xc0Var.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = yc0.b;
        yc0 yc0Var = this.h;
        if (atomicIntegerFieldUpdater.decrementAndGet(yc0Var) == 0) {
            rd3[] rd3VarArr = yc0Var.a;
            ArrayList arrayList = new ArrayList(rd3VarArr.length);
            for (rd3 rd3Var : rd3VarArr) {
                arrayList.add(rd3Var.getCompleted());
            }
            va1Var.resumeWith(arrayList);
        }
    }
}
