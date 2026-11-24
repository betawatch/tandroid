// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class tl5 extends i98 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ wl5 b;

    public tl5(wl5 wl5Var, ArrayList arrayList) {
        this.b = wl5Var;
        this.a = arrayList;
    }

    @Override // i98, o98
    public final void L(int i, oac oacVar, boolean z, int i2, int i3, boolean z2) {
        this.b.s((jm6) this.a.get(0));
    }

    @Override // i98, o98
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        vl5 vl5Var = this.b.b;
        if (vl5Var == null) {
            return null;
        }
        return vl5Var.getCloseIntoObject();
    }

    @Override // i98, o98
    public final boolean T() {
        return false;
    }

    @Override // i98, o98
    public final boolean y() {
        return false;
    }
}
