package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r41 extends f2.w {
    public final /* synthetic */ int Q;
    public final /* synthetic */ d61 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r41(d61 d61Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = d61Var;
    }

    @Override // f2.j0, f2.w0
    public final void v0(RecyclerView recyclerView, f2.k1 k1Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    nh.k1 k1Var2 = new nh.k1(this, recyclerView.getContext(), 3);
                    k1Var2.a = i10;
                    w0(k1Var2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            default:
                try {
                    nh.k1 k1Var3 = new nh.k1(this, recyclerView.getContext(), 5);
                    k1Var3.a = i10;
                    w0(k1Var3);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
