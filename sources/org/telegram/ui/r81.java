package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r81 extends f2.d1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s91 b;

    public /* synthetic */ r81(s91 s91Var, int i9) {
        this.a = i9;
        this.b = s91Var;
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ig.e eVar;
        s91 s91Var;
        ig.e eVar2;
        s91 s91Var2;
        ig.e eVar3;
        switch (this.a) {
            case 0:
                s91 s91Var3 = this.b;
                if (s91Var3.n0.size() != s91Var3.o0.size() && !s91Var3.s0 && s91Var3.Q.N0() > s91Var3.T.Y - 20) {
                    s91Var3.g0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = s91Var3.y0) != null) {
                    eVar.f(i9, i10);
                    s91.V(s91Var3);
                    break;
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = (s91Var = this.b).y0) != null) {
                    eVar2.f(i9, i10);
                    s91.V(s91Var);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = (s91Var2 = this.b).y0) != null) {
                    eVar3.f(i9, i10);
                    s91.V(s91Var2);
                    break;
                }
                break;
        }
    }
}
