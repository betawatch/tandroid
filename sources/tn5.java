// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tn5 extends jb8 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ wn5 b;

    public tn5(wn5 wn5Var, ArrayList arrayList) {
        this.b = wn5Var;
        this.a = arrayList;
    }

    @Override // jb8, pb8
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        this.b.s((jo6) this.a.get(0));
    }

    @Override // jb8, pb8
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        vn5 vn5Var = this.b.b;
        if (vn5Var == null) {
            return null;
        }
        return vn5Var.getCloseIntoObject();
    }

    @Override // jb8, pb8
    public final boolean U() {
        return false;
    }

    @Override // jb8, pb8
    public final boolean y() {
        return false;
    }
}
