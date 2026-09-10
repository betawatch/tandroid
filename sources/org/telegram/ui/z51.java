package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class z51 extends s4.s {
    public final /* synthetic */ int Q;
    public final /* synthetic */ l71 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z51(l71 l71Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = l71Var;
    }

    @Override // s4.c0, s4.o0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    bi.t1 t1Var = new bi.t1(this, recyclerView.getContext(), 3);
                    t1Var.a = i10;
                    w0(t1Var);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            default:
                try {
                    bi.t1 t1Var2 = new bi.t1(this, recyclerView.getContext(), 5);
                    t1Var2.a = i10;
                    w0(t1Var2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
