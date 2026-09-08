package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class x51 extends s4.s {
    public final /* synthetic */ int Q;
    public final /* synthetic */ j71 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x51(j71 j71Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = j71Var;
    }

    @Override // s4.c0, s4.o0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    di.m1 m1Var = new di.m1(this, recyclerView.getContext(), 3);
                    m1Var.a = i10;
                    w0(m1Var);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            default:
                try {
                    di.m1 m1Var2 = new di.m1(this, recyclerView.getContext(), 5);
                    m1Var2.a = i10;
                    w0(m1Var2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
