package uh;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.s7;
import s4.m0;
import s4.z0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d extends m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ d(i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
    }

    @Override // s4.m0
    public final void c(Rect rect, View view, RecyclerView recyclerView, z0 z0Var) {
        switch (this.a) {
            case 0:
                if (!(view instanceof s7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    s7 s7Var = (s7) view;
                    i iVar = this.b;
                    iVar.f.getClass();
                    int R = RecyclerView.R(s7Var);
                    int i10 = iVar.h.J;
                    s7Var.a0 = R < i10;
                    int i11 = R % i10;
                    s7Var.V = i11 == 0;
                    s7Var.W = i11 == i10 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
            default:
                if (!(view instanceof s7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    s7 s7Var2 = (s7) view;
                    i iVar2 = this.b;
                    iVar2.r.getClass();
                    int R2 = RecyclerView.R(s7Var2);
                    int i12 = iVar2.s.J;
                    s7Var2.a0 = R2 < i12;
                    int i13 = R2 % i12;
                    s7Var2.V = i13 == 0;
                    s7Var2.W = i13 == i12 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
        }
    }
}
