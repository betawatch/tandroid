package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ny b;

    public /* synthetic */ rw(ny nyVar, int i10) {
        this.a = i10;
        this.b = nyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.l();
                break;
            case 1:
                ny nyVar = this.b;
                oy oyVar = nyVar.H;
                ky kyVar = nyVar.a;
                if (kyVar != null && kyVar.getScrollState() == 0 && nyVar.a.getChildCount() > 0 && nyVar.a.getLayoutManager() != null) {
                    int i10 = 1;
                    boolean z4 = nyVar.s == 0 && oyVar.Z3() && nyVar.v == 2;
                    float f10 = oyVar.K;
                    f2.i0 i0Var = (f2.i0) nyVar.a.getLayoutManager();
                    View view = null;
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = -1;
                    for (int i13 = 0; i13 < nyVar.a.getChildCount(); i13++) {
                        int R = RecyclerView.R(nyVar.a.getChildAt(i13));
                        View childAt = nyVar.a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - nyVar.a.getPaddingTop();
                        if (oyVar.H) {
                            f10 = 0.0f;
                        }
                        if (nyVar.a.getScrollState() != 1) {
                            if (z4 && i12 == 0 && ((nyVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
                                top = f10;
                            } else {
                                i10 = i12;
                            }
                            i0Var.h1(i10, (int) top);
                            break;
                        }
                    }
                }
                break;
            default:
                ny nyVar2 = this.b;
                nyVar2.d.W(nyVar2.F);
                nyVar2.H.N = true;
                ky kyVar2 = nyVar2.a;
                kyVar2.a3 = true;
                nyVar2.E = false;
                kyVar2.invalidate();
                break;
        }
    }
}
