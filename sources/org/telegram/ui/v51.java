package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class v51 extends s4.s {
    public final /* synthetic */ int Q;
    public final /* synthetic */ h71 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v51(h71 h71Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = h71Var;
    }

    @Override // s4.c0, s4.o0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    ci.m1 m1Var = new ci.m1(this, recyclerView.getContext(), 3);
                    m1Var.a = i10;
                    w0(m1Var);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            default:
                try {
                    ci.m1 m1Var2 = new ci.m1(this, recyclerView.getContext(), 5);
                    m1Var2.a = i10;
                    w0(m1Var2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
