// default package

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x91 extends k69 {
    public boolean a;
    public final /* synthetic */ ia1 b;

    public x91(ia1 ia1Var) {
        this.b = ia1Var;
    }

    @Override // k69
    public final void b(RecyclerView recyclerView, int i, int i2) {
        ia1 ia1Var = this.b;
        ArrayList arrayList = ia1Var.x;
        int K0 = ia1Var.b.K0();
        int abs = K0 == -1 ? 0 : Math.abs(ia1Var.b.M0() - K0) + 1;
        if (abs > 0) {
            int size = ia1Var.c.g3.E.size();
            if (!ia1Var.F && !ia1Var.y && !arrayList.isEmpty() && K0 + abs >= size - 5) {
                gm.c3(new y31(this, (fa1) b10.f(1, arrayList), (byte) 7));
            }
        }
        if (i2 != 0 && this.a) {
            ia1Var.f.e(i2 < 0, true);
        }
        this.a = true;
    }
}
