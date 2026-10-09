package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sy b;

    public /* synthetic */ vw(sy syVar, int i10) {
        this.a = i10;
        this.b = syVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.l();
                break;
            case 1:
                sy syVar = this.b;
                ty tyVar = syVar.K;
                py pyVar = syVar.a;
                if (pyVar != null && pyVar.getScrollState() == 0 && syVar.a.getChildCount() > 0 && syVar.a.getLayoutManager() != null) {
                    int i10 = 1;
                    boolean z10 = syVar.s == 0 && tyVar.W3() && syVar.v == 2;
                    float f7 = tyVar.N;
                    s4.d0 d0Var = (s4.d0) syVar.a.getLayoutManager();
                    View view = null;
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = -1;
                    for (int i13 = 0; i13 < syVar.a.getChildCount(); i13++) {
                        int R = RecyclerView.R(syVar.a.getChildAt(i13));
                        View childAt = syVar.a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - syVar.a.getPaddingTop();
                        if (tyVar.K) {
                            f7 = 0.0f;
                        }
                        if (syVar.a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((syVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
                                top = f7;
                            } else {
                                i10 = i12;
                            }
                            d0Var.h1(i10, (int) top);
                            break;
                        }
                    }
                }
                break;
            default:
                sy syVar2 = this.b;
                syVar2.d.W(syVar2.I);
                syVar2.K.Q = true;
                py pyVar2 = syVar2.a;
                pyVar2.b3 = true;
                syVar2.H = false;
                pyVar2.invalidate();
                break;
        }
    }
}
