package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class tw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy b;

    public /* synthetic */ tw(qy qyVar, int i10) {
        this.a = i10;
        this.b = qyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.l();
                break;
            case 1:
                qy qyVar = this.b;
                ry ryVar = qyVar.K;
                ny nyVar = qyVar.a;
                if (nyVar != null && nyVar.getScrollState() == 0 && qyVar.a.getChildCount() > 0 && qyVar.a.getLayoutManager() != null) {
                    int i10 = 1;
                    boolean z10 = qyVar.s == 0 && ryVar.Z3() && qyVar.v == 2;
                    float f7 = ryVar.N;
                    s4.c0 c0Var = (s4.c0) qyVar.a.getLayoutManager();
                    View view = null;
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = -1;
                    for (int i13 = 0; i13 < qyVar.a.getChildCount(); i13++) {
                        int R = RecyclerView.R(qyVar.a.getChildAt(i13));
                        View childAt = qyVar.a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - qyVar.a.getPaddingTop();
                        if (ryVar.K) {
                            f7 = 0.0f;
                        }
                        if (qyVar.a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((qyVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                qy qyVar2 = this.b;
                qyVar2.d.W(qyVar2.I);
                qyVar2.K.Q = true;
                ny nyVar2 = qyVar2.a;
                nyVar2.d3 = true;
                qyVar2.H = false;
                nyVar2.invalidate();
                break;
        }
    }
}
