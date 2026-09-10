package wh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j61;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ p1 b;

    public /* synthetic */ p0(p1 p1Var, int i10) {
        this.a = i10;
        this.b = p1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                p1 p1Var = this.b;
                if (p1Var.s0 != intValue) {
                    p1Var.s0 = intValue;
                    p1Var.k0.g();
                    p1Var.Y.N(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                p1 p1Var2 = this.b;
                if (p1Var2.getContext() != null && p1Var2.isShown()) {
                    ArrayList b10 = sg.s.b(1, list);
                    p1Var2.Z = b10;
                    List c10 = sg.s.c(b10);
                    p1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        p1Var2.W();
                        j61 j61Var = p1Var2.Y;
                        if (j61Var != null) {
                            j61Var.N(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
