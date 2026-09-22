package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        ah.h hVar;
        za1 za1Var;
        ah.h hVar2;
        za1 za1Var2;
        ah.h hVar3;
        switch (this.a) {
            case 0:
                za1 za1Var3 = this.b;
                if (za1Var3.r0.size() != za1Var3.s0.size() && !za1Var3.w0 && za1Var3.U.N0() > za1Var3.X.c0 - 20) {
                    za1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = za1Var3.C0) != null) {
                    hVar.f(i10, i11);
                    za1.W(za1Var3);
                    break;
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (hVar2 = (za1Var = this.b).C0) != null) {
                    hVar2.f(i10, i11);
                    za1.W(za1Var);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (hVar3 = (za1Var2 = this.b).C0) != null) {
                    hVar3.f(i10, i11);
                    za1.W(za1Var2);
                    break;
                }
                break;
        }
    }
}
