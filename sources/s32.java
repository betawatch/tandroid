// default package

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class s32 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r47 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ c79 e;

    public /* synthetic */ s32(c79 c79Var, ViewGroup viewGroup, r47 r47Var, boolean z, byte b) {
        this.a = b;
        this.e = c79Var;
        this.d = viewGroup;
        this.b = r47Var;
        this.c = z;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        byte b = this.a;
        c79 c79Var = this.e;
        ViewGroup viewGroup = this.d;
        r47 r47Var = this.b;
        boolean z = this.c;
        switch (b) {
            case 0:
                zea zeaVar = (zea) viewGroup;
                zeaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                t32 t32Var = (t32) c79Var;
                qg4 qg4Var = t32Var.I;
                u32 u32Var = t32Var.Y;
                if (!u32Var.b.U2.z()) {
                    zeaVar.b(false, z);
                    break;
                } else {
                    int e1 = r47Var.e1();
                    qg4Var.a = r47.B0(r47Var.k);
                    qg4Var.b = e1;
                    zeaVar.b(u32Var.U.containsKey(qg4Var), z);
                    break;
                }
            case 1:
                of3 of3Var = (of3) viewGroup;
                of3Var.getViewTreeObserver().removeOnPreDrawListener(this);
                yg4 yg4Var = ((rg4) c79Var).c;
                if (!yg4Var.p0.u()) {
                    of3Var.d0(false, z);
                    break;
                } else {
                    qg4 qg4Var2 = yg4Var.T;
                    int e12 = r47Var.e1();
                    qg4Var2.a = r47.B0(r47Var.k);
                    qg4Var2.b = e12;
                    of3Var.d0(yg4Var.p0.d(yg4Var.T), z);
                    break;
                }
            case 2:
                zea zeaVar2 = (zea) viewGroup;
                zeaVar2.getViewTreeObserver().removeOnPreDrawListener(this);
                yg4 yg4Var2 = ((tg4) c79Var).w;
                if (!yg4Var2.p0.u()) {
                    zeaVar2.b(false, z);
                    break;
                } else {
                    qg4 qg4Var3 = yg4Var2.T;
                    int e13 = r47Var.e1();
                    qg4Var3.a = r47.B0(r47Var.k);
                    qg4Var3.b = e13;
                    zeaVar2.b(yg4Var2.p0.d(yg4Var2.T), z);
                    break;
                }
            case 3:
                vea veaVar = (vea) viewGroup;
                veaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                yg4 yg4Var3 = ((tg4) c79Var).w;
                if (!yg4Var3.p0.u()) {
                    veaVar.e(false, z);
                    break;
                } else {
                    qg4 qg4Var4 = yg4Var3.T;
                    int e14 = r47Var.e1();
                    qg4Var4.a = r47.B0(r47Var.k);
                    qg4Var4.b = e14;
                    veaVar.e(yg4Var3.p0.d(yg4Var3.T), z);
                    break;
                }
            default:
                cfa cfaVar = (cfa) viewGroup;
                cfaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                yg4 yg4Var4 = ((vg4) c79Var).w;
                if (!yg4Var4.p0.u()) {
                    cfaVar.f(false, z);
                    break;
                } else {
                    qg4 qg4Var5 = yg4Var4.T;
                    int e15 = r47Var.e1();
                    qg4Var5.a = r47.B0(r47Var.k);
                    qg4Var5.b = e15;
                    cfaVar.f(yg4Var4.p0.d(yg4Var4.T), z);
                    break;
                }
        }
        return true;
    }
}
