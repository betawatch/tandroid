// default package

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vya extends ogc {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ xza e;

    public vya(xza xzaVar, boolean z, boolean z2, boolean z3, FrameLayout frameLayout) {
        this.e = xzaVar;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = frameLayout;
    }

    @Override // ogc
    public final View d(int i) {
        xza xzaVar = this.e;
        if (xzaVar.o0) {
            return xzaVar.j0;
        }
        if (this.a) {
            if (i != 0) {
                i--;
            }
            return this.d;
        }
        if (this.b) {
            if (i == 0) {
                return xzaVar.j0;
            }
            i--;
        }
        if (this.c && i == 0) {
            return xzaVar.k0;
        }
        return this.d;
    }

    @Override // ogc
    public final int e() {
        if (this.e.o0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // ogc
    public final int h(int i) {
        return i;
    }

    @Override // ogc
    public final void b(View view, int i, int i2) {
    }
}
