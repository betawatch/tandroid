package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oy b;

    public /* synthetic */ sw(oy oyVar, int i10) {
        this.a = i10;
        this.b = oyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.l();
                break;
            case 1:
                oy oyVar = this.b;
                py pyVar = oyVar.H;
                ly lyVar = oyVar.a;
                if (lyVar != null && lyVar.getScrollState() == 0 && oyVar.a.getChildCount() > 0 && oyVar.a.getLayoutManager() != null) {
                    int i10 = 1;
                    boolean z4 = oyVar.s == 0 && pyVar.Z3() && oyVar.v == 2;
                    float f10 = pyVar.K;
                    f2.j0 j0Var = (f2.j0) oyVar.a.getLayoutManager();
                    View view = null;
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = -1;
                    for (int i13 = 0; i13 < oyVar.a.getChildCount(); i13++) {
                        int R = RecyclerView.R(oyVar.a.getChildAt(i13));
                        View childAt = oyVar.a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - oyVar.a.getPaddingTop();
                        if (pyVar.H) {
                            f10 = 0.0f;
                        }
                        if (oyVar.a.getScrollState() != 1) {
                            if (z4 && i12 == 0 && ((oyVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
                                top = f10;
                            } else {
                                i10 = i12;
                            }
                            j0Var.h1(i10, (int) top);
                            break;
                        }
                    }
                }
                break;
            default:
                oy oyVar2 = this.b;
                oyVar2.d.W(oyVar2.F);
                oyVar2.H.N = true;
                ly lyVar2 = oyVar2.a;
                lyVar2.a3 = true;
                oyVar2.E = false;
                lyVar2.invalidate();
                break;
        }
    }
}
