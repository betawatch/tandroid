package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class t41 extends s4.t {
    public final /* synthetic */ int Q;
    public final /* synthetic */ f61 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t41(f61 f61Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = f61Var;
    }

    @Override // s4.c0, s4.p0
    public final void v0(RecyclerView recyclerView, s4.b1 b1Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    fi.k1 k1Var = new fi.k1(this, recyclerView.getContext(), 3);
                    k1Var.a = i10;
                    w0(k1Var);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            default:
                try {
                    fi.k1 k1Var2 = new fi.k1(this, recyclerView.getContext(), 5);
                    k1Var2.a = i10;
                    w0(k1Var2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
