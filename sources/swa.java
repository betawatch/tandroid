// default package

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class swa extends oec {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ uxa e;

    public swa(uxa uxaVar, boolean z, boolean z2, boolean z3, FrameLayout frameLayout) {
        this.e = uxaVar;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = frameLayout;
    }

    @Override // oec
    public final View d(int i) {
        uxa uxaVar = this.e;
        if (uxaVar.o0) {
            return uxaVar.j0;
        }
        if (this.a) {
            if (i != 0) {
                i--;
            }
            return this.d;
        }
        if (this.b) {
            if (i == 0) {
                return uxaVar.j0;
            }
            i--;
        }
        if (this.c && i == 0) {
            return uxaVar.k0;
        }
        return this.d;
    }

    @Override // oec
    public final int e() {
        if (this.e.o0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // oec
    public final int h(int i) {
        return i;
    }

    @Override // oec
    public final void b(View view, int i, int i2) {
    }
}
