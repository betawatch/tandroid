package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class t81 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u91 b;

    public /* synthetic */ t81(u91 u91Var, int i10) {
        this.a = i10;
        this.b = u91Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        u91 u91Var;
        bh.f fVar2;
        u91 u91Var2;
        bh.f fVar3;
        switch (this.a) {
            case 0:
                u91 u91Var3 = this.b;
                if (u91Var3.r0.size() != u91Var3.s0.size() && !u91Var3.w0 && u91Var3.U.N0() > u91Var3.X.c0 - 20) {
                    u91Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = u91Var3.E0) != null) {
                    fVar.f(i10, i11);
                    u91.W(u91Var3);
                    break;
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = (u91Var = this.b).E0) != null) {
                    fVar2.f(i10, i11);
                    u91.W(u91Var);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar3 = (u91Var2 = this.b).E0) != null) {
                    fVar3.f(i10, i11);
                    u91.W(u91Var2);
                    break;
                }
                break;
        }
    }
}
