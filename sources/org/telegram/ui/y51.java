package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class y51 extends s4.s {
    public final /* synthetic */ int Q;
    public final /* synthetic */ k71 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y51(k71 k71Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = k71Var;
    }

    @Override // s4.d0, s4.p0
    public final void v0(RecyclerView recyclerView, s4.a1 a1Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    ci.l1 l1Var = new ci.l1(this, recyclerView.getContext(), 3);
                    l1Var.a = i10;
                    w0(l1Var);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            default:
                try {
                    ci.l1 l1Var2 = new ci.l1(this, recyclerView.getContext(), 5);
                    l1Var2.a = i10;
                    w0(l1Var2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
