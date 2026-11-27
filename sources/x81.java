// default package

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class x81 extends v79 {
    public boolean a;
    public final /* synthetic */ i91 b;

    public x81(i91 i91Var) {
        this.b = i91Var;
    }

    @Override // v79
    public final void b(RecyclerView recyclerView, int i, int i2) {
        i91 i91Var = this.b;
        ArrayList arrayList = i91Var.x;
        int K0 = i91Var.b.K0();
        int abs = K0 == -1 ? 0 : Math.abs(i91Var.b.M0() - K0) + 1;
        if (abs > 0) {
            int size = i91Var.c.g3.E.size();
            if (!i91Var.F && !i91Var.y && !arrayList.isEmpty() && K0 + abs >= size - 5) {
                hl.c3(new z21(this, (f91) c00.g(1, arrayList), (byte) 6));
            }
        }
        if (i2 != 0 && this.a) {
            i91Var.f.e(i2 < 0, true);
        }
        this.a = true;
    }
}
