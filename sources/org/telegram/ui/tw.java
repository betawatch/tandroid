package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ py b;

    public /* synthetic */ tw(py pyVar, int i10) {
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
                qy qyVar = pyVar.H;
                my myVar = pyVar.a;
                if (myVar != null && myVar.getScrollState() == 0 && pyVar.a.getChildCount() > 0 && pyVar.a.getLayoutManager() != null) {
                    int i10 = 1;
                    boolean z4 = pyVar.s == 0 && qyVar.Z3() && pyVar.v == 2;
                    float f10 = qyVar.K;
                    f2.i0 i0Var = (f2.i0) pyVar.a.getLayoutManager();
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
                        if (qyVar.H) {
                            f10 = 0.0f;
                        }
                        if (pyVar.a.getScrollState() != 1) {
                            if (z4 && i12 == 0 && ((pyVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
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
                py pyVar2 = this.b;
                pyVar2.d.W(pyVar2.F);
                pyVar2.H.N = true;
                my myVar2 = pyVar2.a;
                myVar2.a3 = true;
                pyVar2.E = false;
                myVar2.invalidate();
                break;
        }
    }
}
