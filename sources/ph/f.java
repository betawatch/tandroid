package ph;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f2.j1;
import f2.v0;
import org.telegram.ui.Cells.r7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class f extends v0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ f(l lVar, int i10) {
        this.a = i10;
        this.b = lVar;
    }

    @Override // f2.v0
    public final void a(Rect rect, View view, RecyclerView recyclerView, j1 j1Var) {
        switch (this.a) {
            case 0:
                if (!(view instanceof r7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    r7 r7Var = (r7) view;
                    l lVar = this.b;
                    lVar.f.getClass();
                    int R = RecyclerView.R(r7Var);
                    int i10 = lVar.h.J;
                    r7Var.U = R < i10;
                    int i11 = R % i10;
                    r7Var.S = i11 == 0;
                    r7Var.T = i11 == i10 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
            default:
                if (!(view instanceof r7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    r7 r7Var2 = (r7) view;
                    l lVar2 = this.b;
                    lVar2.r.getClass();
                    int R2 = RecyclerView.R(r7Var2);
                    int i12 = lVar2.s.J;
                    r7Var2.U = R2 < i12;
                    int i13 = R2 % i12;
                    r7Var2.S = i13 == 0;
                    r7Var2.T = i13 == i12 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
        }
    }
}
