package yf;

import android.content.ComponentName;
import android.text.Editable;
import li.f1;
import li.g0;
import li.g1;
import li.i0;
import li.j0;
import org.telegram.ui.Cells.s9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c implements f1 {
    public final Object a;
    public final Object b;

    public c(f fVar, ComponentName componentName) {
        this.a = fVar;
        this.b = componentName;
    }

    @Override // li.f1
    public void E(g1 g1Var, int i10, int i11) {
        s9 C;
        i0 i0Var = (i0) this.a;
        if (((j0) this.b).d || i10 == i11 || (C = i0Var.C()) == null) {
            return;
        }
        if (C.x() && C.W == i0Var.K()) {
            return;
        }
        g1Var.post(new g0(this, g1Var, i11, C, i0Var, i10));
    }

    @Override // li.f1
    public void T(CharSequence charSequence) {
        ((i0) this.a).I(charSequence);
    }

    @Override // li.f1
    public void Y(Editable editable) {
        ((j0) this.b).i();
        ((i0) this.a).S();
    }

    @Override // li.f1
    public void b(g1 g1Var) {
        ((i0) this.a).b(g1Var);
    }

    @Override // li.f1
    public boolean e() {
        return ((i0) this.a).M();
    }

    @Override // li.f1
    public /* synthetic */ boolean f0(boolean z10) {
        return false;
    }

    @Override // li.f1
    public /* synthetic */ boolean g(g1 g1Var) {
        return false;
    }

    @Override // li.f1
    public void k(int i10, int i11) {
        ((i0) this.a).O(i10, i11);
    }

    @Override // li.f1
    public /* synthetic */ boolean o(g1 g1Var) {
        return false;
    }

    @Override // li.f1
    public void t(g1 g1Var) {
        ((i0) this.a).h();
    }

    public c(j0 j0Var, i0 i0Var) {
        this.b = j0Var;
        this.a = i0Var;
    }

    @Override // li.f1
    public /* synthetic */ void R() {
    }
}
