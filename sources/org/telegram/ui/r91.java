package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class r91 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa1 b;

    public /* synthetic */ r91(sa1 sa1Var, int i10) {
        this.a = i10;
        this.b = sa1Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        sa1 sa1Var;
        ah.h hVar2;
        sa1 sa1Var2;
        ah.h hVar3;
        switch (this.a) {
            case 0:
                sa1 sa1Var3 = this.b;
                if (sa1Var3.r0.size() != sa1Var3.s0.size() && !sa1Var3.w0 && sa1Var3.U.N0() > sa1Var3.X.c0 - 20) {
                    sa1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = sa1Var3.C0) != null) {
                    hVar.f(i10, i11);
                    sa1.W(sa1Var3);
                    break;
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (hVar2 = (sa1Var = this.b).C0) != null) {
                    hVar2.f(i10, i11);
                    sa1.W(sa1Var);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (hVar3 = (sa1Var2 = this.b).C0) != null) {
                    hVar3.f(i10, i11);
                    sa1.W(sa1Var2);
                    break;
                }
                break;
        }
    }
}
