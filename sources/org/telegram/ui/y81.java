package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y81 extends v4.t0 {
    public int a;
    public int b;
    public final /* synthetic */ u91 c;

    public y81(u91 u91Var) {
        this.c = u91Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    @Override // v4.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z10;
        boolean z11;
        u91 u91Var = this.c;
        int L0 = u91Var.G.L0();
        if (L0 != -1) {
            v4.e1 K = recyclerView.K(L0);
            int top = K != null ? K.a.getTop() : 0;
            int i11 = this.a;
            if (i11 == L0) {
                int i12 = this.b;
                int i13 = i12 - top;
                z10 = top < i12;
                if (Math.abs(i13) <= 1) {
                    z11 = false;
                    if (z11) {
                        u91Var.K0(z10 || !u91Var.L, true);
                    }
                    this.a = L0;
                    this.b = top;
                }
            } else {
                z10 = L0 > i11;
            }
            z11 = true;
            if (z11) {
            }
            this.a = L0;
            this.b = top;
        }
    }
}
