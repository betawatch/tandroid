package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s81 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t91 b;

    public /* synthetic */ s81(t91 t91Var, int i10) {
        this.a = i10;
        this.b = t91Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        lg.e eVar;
        t91 t91Var;
        lg.e eVar2;
        t91 t91Var2;
        lg.e eVar3;
        switch (this.a) {
            case 0:
                t91 t91Var3 = this.b;
                if (t91Var3.n0.size() != t91Var3.o0.size() && !t91Var3.s0 && t91Var3.Q.N0() > t91Var3.T.Y - 20) {
                    t91Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = t91Var3.y0) != null) {
                    eVar.f(i10, i11);
                    t91.W(t91Var3);
                    break;
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = (t91Var = this.b).y0) != null) {
                    eVar2.f(i10, i11);
                    t91.W(t91Var);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = (t91Var2 = this.b).y0) != null) {
                    eVar3.f(i10, i11);
                    t91.W(t91Var2);
                    break;
                }
                break;
        }
    }
}
