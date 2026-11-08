package x2;

import a8.ia;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class w extends l2.a {
    public final e2.l1 h;
    public final int i;
    public final int j;
    public final int k;

    public w(e2.l1 l1Var, int i7) {
        super(new g1(i7));
        this.h = l1Var;
        int h = l1Var.h();
        this.i = h;
        this.j = l1Var.o();
        this.k = i7;
        if (h > 0) {
            ia.o("LoopingMediaSource contains too many periods", i7 <= ConnectionsManager.DEFAULT_DATACENTER_ID / h);
        }
    }

    @Override // e2.l1
    public final int h() {
        return this.i * this.k;
    }

    @Override // e2.l1
    public final int o() {
        return this.j * this.k;
    }

    @Override // l2.a
    public final int q(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return -1;
    }

    @Override // l2.a
    public final int r(int i7) {
        return i7 / this.i;
    }

    @Override // l2.a
    public final int s(int i7) {
        return i7 / this.j;
    }

    @Override // l2.a
    public final Object t(int i7) {
        return Integer.valueOf(i7);
    }

    @Override // l2.a
    public final int u(int i7) {
        return i7 * this.i;
    }

    @Override // l2.a
    public final int v(int i7) {
        return i7 * this.j;
    }

    @Override // l2.a
    public final e2.l1 x(int i7) {
        return this.h;
    }
}
