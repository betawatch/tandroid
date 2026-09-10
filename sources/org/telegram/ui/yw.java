package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class yw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vy b;

    public /* synthetic */ yw(vy vyVar, int i10) {
        this.a = i10;
        this.b = vyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.l();
                break;
            case 1:
                vy vyVar = this.b;
                wy wyVar = vyVar.K;
                sy syVar = vyVar.a;
                if (syVar != null && syVar.getScrollState() == 0 && vyVar.a.getChildCount() > 0 && vyVar.a.getLayoutManager() != null) {
                    int i10 = 1;
                    boolean z10 = vyVar.s == 0 && wyVar.Z3() && vyVar.v == 2;
                    float f7 = wyVar.N;
                    s4.c0 c0Var = (s4.c0) vyVar.a.getLayoutManager();
                    View view = null;
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = -1;
                    for (int i13 = 0; i13 < vyVar.a.getChildCount(); i13++) {
                        int R = RecyclerView.R(vyVar.a.getChildAt(i13));
                        View childAt = vyVar.a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - vyVar.a.getPaddingTop();
                        if (wyVar.K) {
                            f7 = 0.0f;
                        }
                        if (vyVar.a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((vyVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                vy vyVar2 = this.b;
                vyVar2.d.W(vyVar2.I);
                vyVar2.K.Q = true;
                sy syVar2 = vyVar2.a;
                syVar2.d3 = true;
                vyVar2.H = false;
                syVar2.invalidate();
                break;
        }
    }
}
