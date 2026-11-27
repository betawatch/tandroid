// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pt4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qt4 b;
    public final /* synthetic */ st4 c;

    public /* synthetic */ pt4(qt4 qt4Var, st4 st4Var, byte b) {
        this.a = b;
        this.b = qt4Var;
        this.c = st4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        st4 st4Var = this.c;
        qt4 qt4Var = this.b;
        switch (b) {
            case 0:
                gu guVar = qt4Var.c.d;
                guVar.getClass();
                int S = RecyclerView.S(st4Var);
                if (S != -1) {
                    r69 r69Var = guVar.U0;
                    if (r69Var == null) {
                        s69 s69Var = guVar.V0;
                        if (s69Var != null) {
                            s69Var.d(0.0f, 0.0f, S, st4Var);
                            break;
                        }
                    } else {
                        r69Var.e(S, st4Var);
                        break;
                    }
                }
                break;
            default:
                gu guVar2 = qt4Var.c.d;
                guVar2.getClass();
                int S2 = RecyclerView.S(st4Var);
                if (S2 != -1) {
                    t69 t69Var = guVar2.W0;
                    if (t69Var == null) {
                        u69 u69Var = guVar2.X0;
                        if (u69Var != null) {
                            u69Var.d(0.0f, 0.0f, S2, st4Var);
                            break;
                        }
                    } else {
                        t69Var.e(S2, st4Var);
                        break;
                    }
                }
                break;
        }
    }
}
