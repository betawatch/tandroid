package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class z91 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ab1 b;

    public /* synthetic */ z91(ab1 ab1Var, int i10) {
        this.a = i10;
        this.b = ab1Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.i iVar;
        ab1 ab1Var;
        ah.i iVar2;
        ab1 ab1Var2;
        ah.i iVar3;
        switch (this.a) {
            case 0:
                ab1 ab1Var3 = this.b;
                if (ab1Var3.r0.size() != ab1Var3.s0.size() && !ab1Var3.w0 && ab1Var3.U.N0() > ab1Var3.X.c0 - 20) {
                    ab1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar = ab1Var3.C0) != null) {
                    iVar.f(i10, i11);
                    ab1.W(ab1Var3);
                    break;
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (iVar2 = (ab1Var = this.b).C0) != null) {
                    iVar2.f(i10, i11);
                    ab1.W(ab1Var);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (iVar3 = (ab1Var2 = this.b).C0) != null) {
                    iVar3.f(i10, i11);
                    ab1.W(ab1Var2);
                    break;
                }
                break;
        }
    }
}
