// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class qx2 extends og0 {
    private final cy2 _context;
    private transient px2 intercepted;

    public qx2(px2 px2Var) {
        this(px2Var, px2Var != null ? px2Var.getContext() : null);
    }

    @Override // px2
    public cy2 getContext() {
        cy2 cy2Var = this._context;
        cy2Var.getClass();
        return cy2Var;
    }

    public final px2 intercepted() {
        px2 px2Var = this.intercepted;
        if (px2Var != null) {
            return px2Var;
        }
        fy2 fy2Var = (fy2) getContext().get(jk2.b);
        px2 rp3Var = fy2Var != null ? new rp3(fy2Var, this) : this;
        this.intercepted = rp3Var;
        return rp3Var;
    }

    @Override // og0
    public void releaseIntercepted() {
        Unsafe unsafe;
        long j;
        px2 px2Var = this.intercepted;
        if (px2Var != null && px2Var != this) {
            ay2 ay2Var = getContext().get(jk2.b);
            ay2Var.getClass();
            rp3 rp3Var = (rp3) px2Var;
            do {
                unsafe = fy.a;
                j = rp3.n;
            } while (unsafe.getObjectVolatile(rp3Var, j) == r5c.b);
            Object objectVolatile = unsafe.getObjectVolatile(rp3Var, j);
            vb1 vb1Var = objectVolatile instanceof vb1 ? (vb1) objectVolatile : null;
            if (vb1Var != null) {
                vb1Var.n();
            }
        }
        this.intercepted = pq2.b;
    }

    public qx2(px2 px2Var, cy2 cy2Var) {
        super(px2Var);
        this._context = cy2Var;
    }
}
