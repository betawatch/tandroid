// default package

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ud0 extends ev5 {
    public static final /* synthetic */ long n = fy.a.objectFieldOffset(ud0.class.getDeclaredField("_disposer$volatile"));
    private volatile /* synthetic */ Object _disposer$volatile;
    public final vb1 e;
    public xp3 f;
    public final /* synthetic */ wd0 h;

    public ud0(wd0 wd0Var, vb1 vb1Var) {
        this.h = wd0Var;
        this.e = vb1Var;
    }

    @Override // ev5
    public final void l(Throwable th) {
        vb1 vb1Var = this.e;
        if (th != null) {
            du2 E = vb1Var.E(new qq2(th, false), null);
            if (E != null) {
                vb1Var.e(E);
                vd0 vd0Var = (vd0) fy.a.getObjectVolatile(this, n);
                if (vd0Var != null) {
                    vd0Var.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = wd0.b;
        wd0 wd0Var = this.h;
        if (atomicIntegerFieldUpdater.decrementAndGet(wd0Var) == 0) {
            le3[] le3VarArr = wd0Var.a;
            ArrayList arrayList = new ArrayList(le3VarArr.length);
            for (le3 le3Var : le3VarArr) {
                arrayList.add(le3Var.getCompleted());
            }
            vb1Var.resumeWith(arrayList);
        }
    }
}
