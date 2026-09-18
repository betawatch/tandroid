package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class y91 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ za1 b;

    public /* synthetic */ y91(za1 za1Var, int i10) {
        this.a = i10;
        this.b = za1Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.i iVar;
        za1 za1Var;
        ah.i iVar2;
        za1 za1Var2;
        ah.i iVar3;
        switch (this.a) {
            case 0:
                za1 za1Var3 = this.b;
                if (za1Var3.r0.size() != za1Var3.s0.size() && !za1Var3.w0 && za1Var3.U.N0() > za1Var3.X.c0 - 20) {
                    za1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar = za1Var3.C0) != null) {
                    iVar.f(i10, i11);
                    za1.W(za1Var3);
                    break;
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (iVar2 = (za1Var = this.b).C0) != null) {
                    iVar2.f(i10, i11);
                    za1.W(za1Var);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (iVar3 = (za1Var2 = this.b).C0) != null) {
                    iVar3.f(i10, i11);
                    za1.W(za1Var2);
                    break;
                }
                break;
        }
    }
}
