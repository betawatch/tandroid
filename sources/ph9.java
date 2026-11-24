// default package

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ph9 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ qh9 b;
    public final /* synthetic */ rh9 c;
    public final /* synthetic */ View d;

    public /* synthetic */ ph9(qh9 qh9Var, rh9 rh9Var, View view) {
        this.b = qh9Var;
        this.c = rh9Var;
        this.d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        View view = this.d;
        rh9 rh9Var = this.c;
        qh9 qh9Var = this.b;
        switch (b) {
            case 0:
                qh9Var.getClass();
                if (view != null) {
                    view.post(new ph9(qh9Var, rh9Var, view));
                    break;
                }
                break;
            default:
                if (rh9Var != null) {
                    qh9Var.getClass();
                    k27 k27Var = rh9Var.b;
                    if (k27Var != null) {
                        k27Var.N0 = true;
                    }
                    ArrayList arrayList = rh9Var.n;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        pib pibVar = (pib) obj;
                        if (pibVar instanceof qh9) {
                            ((qh9) pibVar).x.clear();
                        }
                    }
                } else {
                    qh9Var.x.clear();
                }
                view.invalidate();
                break;
        }
    }

    public /* synthetic */ ph9(qh9 qh9Var, View view, rh9 rh9Var) {
        this.b = qh9Var;
        this.d = view;
        this.c = rh9Var;
    }
}
