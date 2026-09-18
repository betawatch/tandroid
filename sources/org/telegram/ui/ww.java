package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ww implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty b;

    public /* synthetic */ ww(ty tyVar, int i10) {
        this.a = i10;
        this.b = tyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.l();
                break;
            case 1:
                ty tyVar = this.b;
                uy uyVar = tyVar.K;
                qy qyVar = tyVar.a;
                if (qyVar != null && qyVar.getScrollState() == 0 && tyVar.a.getChildCount() > 0 && tyVar.a.getLayoutManager() != null) {
                    int i10 = 1;
                    boolean z10 = tyVar.s == 0 && uyVar.Z3() && tyVar.v == 2;
                    float f7 = uyVar.N;
                    s4.c0 c0Var = (s4.c0) tyVar.a.getLayoutManager();
                    View view = null;
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = -1;
                    for (int i13 = 0; i13 < tyVar.a.getChildCount(); i13++) {
                        int S = RecyclerView.S(tyVar.a.getChildAt(i13));
                        View childAt = tyVar.a.getChildAt(i13);
                        if (S != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = S;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - tyVar.a.getPaddingTop();
                        if (uyVar.K) {
                            f7 = 0.0f;
                        }
                        if (tyVar.a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((tyVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
                                top = f7;
                            } else {
                                i10 = i12;
                            }
                            c0Var.h1(i10, (int) top);
                            break;
                        }
                    }
                }
                break;
            default:
                ty tyVar2 = this.b;
                tyVar2.d.W(tyVar2.I);
                tyVar2.K.Q = true;
                qy qyVar2 = tyVar2.a;
                qyVar2.d3 = true;
                tyVar2.H = false;
                qyVar2.invalidate();
                break;
        }
    }
}
