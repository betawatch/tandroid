package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ py b;

    public /* synthetic */ sw(py pyVar, int i10) {
        this.a = i10;
        this.b = pyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.l();
                break;
            case 1:
                py pyVar = this.b;
                qy qyVar = pyVar.K;
                my myVar = pyVar.a;
                if (myVar != null && myVar.getScrollState() == 0 && pyVar.a.getChildCount() > 0 && pyVar.a.getLayoutManager() != null) {
                    int i10 = 1;
                    boolean z10 = pyVar.s == 0 && qyVar.Z3() && pyVar.v == 2;
                    float f7 = qyVar.N;
                    s4.c0 c0Var = (s4.c0) pyVar.a.getLayoutManager();
                    View view = null;
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = -1;
                    for (int i13 = 0; i13 < pyVar.a.getChildCount(); i13++) {
                        int R = RecyclerView.R(pyVar.a.getChildAt(i13));
                        View childAt = pyVar.a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - pyVar.a.getPaddingTop();
                        if (qyVar.K) {
                            f7 = 0.0f;
                        }
                        if (pyVar.a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((pyVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                py pyVar2 = this.b;
                pyVar2.d.W(pyVar2.I);
                pyVar2.K.Q = true;
                my myVar2 = pyVar2.a;
                myVar2.d3 = true;
                pyVar2.H = false;
                myVar2.invalidate();
                break;
        }
    }
}
