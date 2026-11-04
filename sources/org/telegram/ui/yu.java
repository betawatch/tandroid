package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tw b;

    public /* synthetic */ yu(tw twVar, int i3) {
        this.a = i3;
        this.b = twVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.f();
                break;
            case 1:
                tw twVar = this.b;
                uw uwVar = twVar.L;
                pw pwVar = twVar.a;
                if (pwVar != null && pwVar.getScrollState() == 0 && twVar.a.getChildCount() > 0 && twVar.a.getLayoutManager() != null) {
                    int i3 = 1;
                    boolean z10 = twVar.s == 0 && uwVar.l4() && twVar.w == 2;
                    float f10 = uwVar.O;
                    u4.b0 b0Var = (u4.b0) twVar.a.getLayoutManager();
                    View view = null;
                    int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i11 = -1;
                    for (int i12 = 0; i12 < twVar.a.getChildCount(); i12++) {
                        int R = RecyclerView.R(twVar.a.getChildAt(i12));
                        View childAt = twVar.a.getChildAt(i12);
                        if (R != -1 && childAt != null && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - twVar.a.getPaddingTop();
                        if (uwVar.L) {
                            f10 = 0.0f;
                        }
                        if (twVar.a.getScrollState() != 1) {
                            if (z10 && i11 == 0 && ((twVar.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
                                top = f10;
                            } else {
                                i3 = i11;
                            }
                            b0Var.h1(i3, (int) top);
                            break;
                        }
                    }
                }
                break;
            default:
                tw twVar2 = this.b;
                twVar2.d.X(twVar2.J);
                twVar2.L.R = true;
                pw pwVar2 = twVar2.a;
                pwVar2.k3 = true;
                twVar2.I = false;
                pwVar2.invalidate();
                break;
        }
    }
}
