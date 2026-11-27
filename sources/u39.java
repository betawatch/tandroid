// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class u39 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i49 b;

    public /* synthetic */ u39(i49 i49Var, byte b) {
        this.a = b;
        this.b = i49Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        i49 i49Var = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                ArrayList arrayList = i49Var.d;
                i49Var.b.getClass();
                int S = RecyclerView.S(view);
                if (S >= 0 && S < arrayList.size() && (view instanceof g49)) {
                    ((g49) view).f(((y39) arrayList.get(S)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof g49) {
                    g49 g49Var = (g49) view;
                    f49 f49Var = g49Var.b;
                    g49Var.O = false;
                    f49Var.setAlpha(1.0f);
                    if (!i49Var.O0) {
                        g49Var.c();
                        break;
                    } else {
                        f49Var.setScaleX(g49Var.J * (g49Var.x ? 0.76f : 1.0f));
                        f49Var.setScaleY(g49Var.J * (g49Var.x ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
