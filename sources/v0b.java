// default package

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class v0b extends nic {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ w1b e;

    public v0b(w1b w1bVar, boolean z, boolean z2, boolean z3, FrameLayout frameLayout) {
        this.e = w1bVar;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = frameLayout;
    }

    @Override // nic
    public final View d(int i) {
        w1b w1bVar = this.e;
        if (w1bVar.o0) {
            return w1bVar.j0;
        }
        if (this.a) {
            if (i != 0) {
                i--;
            }
            return this.d;
        }
        if (this.b) {
            if (i == 0) {
                return w1bVar.j0;
            }
            i--;
        }
        if (this.c && i == 0) {
            return w1bVar.k0;
        }
        return this.d;
    }

    @Override // nic
    public final int e() {
        if (this.e.o0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // nic
    public final int h(int i) {
        return i;
    }

    @Override // nic
    public final void b(View view, int i, int i2) {
    }
}
