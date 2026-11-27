// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wn5 extends yc8 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ zn5 b;

    public wn5(zn5 zn5Var, ArrayList arrayList) {
        this.b = zn5Var;
        this.a = arrayList;
    }

    @Override // yc8, ed8
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        this.b.s((no6) this.a.get(0));
    }

    @Override // yc8, ed8
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        yn5 yn5Var = this.b.b;
        if (yn5Var == null) {
            return null;
        }
        return yn5Var.getCloseIntoObject();
    }

    @Override // yc8, ed8
    public final boolean T() {
        return false;
    }

    @Override // yc8, ed8
    public final boolean y() {
        return false;
    }
}
