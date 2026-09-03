package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rc implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rc(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        org.telegram.ui.Components.j81 j81Var;
        switch (this.a) {
            case 0:
                uc ucVar = (uc) this.c;
                View view = (View) obj;
                tc tcVar = (tc) view;
                ucVar.b.getClass();
                boolean z4 = RecyclerView.R(view) == ucVar.e;
                tcVar.s = z4;
                if (!this.b) {
                    tcVar.v.f(z4, true);
                }
                tcVar.invalidate();
                break;
            case 1:
                zn znVar = (zn) this.c;
                View view2 = (View) obj;
                boolean z10 = view2 instanceof org.telegram.ui.Cells.s1;
                boolean z11 = this.b;
                if (!z10) {
                    if (view2 instanceof org.telegram.ui.Cells.v0) {
                        ((org.telegram.ui.Cells.v0) view2).b0 = z11;
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view2;
                    if ((s1Var.B8 && s1Var.D8) != z11 && znVar.B9()) {
                        s1Var.B8 = z11;
                        s1Var.D8 = znVar.B9();
                        s1Var.k8 = true;
                        s1Var.forceLayout();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Components.k81 k81Var = (org.telegram.ui.Components.k81) this.c;
                View view3 = (View) obj;
                k81Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof org.telegram.ui.Components.i81) {
                    ((org.telegram.ui.Components.i81) view3).setReordering(this.b && (j81Var = k81Var.y) != null && ((org.telegram.ui.Components.tp0) j81Var).j(R));
                    break;
                }
                break;
        }
    }
}
