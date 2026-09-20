package x3;

import b2.r;
import b2.r0;
import b2.s;
import c3.u;
import e2.v;
import java.util.Arrays;
import org.telegram.ui.Cells.f3;
import u2.y0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class c extends i {
    public u n;
    public y0 o;

    @Override // x3.i
    public final long b(v vVar) {
        byte[] bArr = vVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i10 = (bArr[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            vVar.K(4);
            vVar.E();
        }
        int t10 = c3.b.t(i10, vVar);
        vVar.J(0);
        return t10;
    }

    @Override // x3.i
    public final boolean c(v vVar, long j3, f3 f3Var) {
        byte[] bArr = vVar.a;
        u uVar = this.n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.n = uVar2;
            r a2 = uVar2.c(Arrays.copyOfRange(bArr, 9, vVar.c), null).a();
            a2.p = r0.n("audio/ogg");
            f3Var.b = new s(a2);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) != 3) {
            if (b10 != -1) {
                return true;
            }
            y0 y0Var = this.o;
            if (y0Var != null) {
                y0Var.a = j3;
                f3Var.c = y0Var;
            }
            ((s) f3Var.b).getClass();
            return false;
        }
        of.b u10 = c3.b.u(vVar);
        u uVar3 = new u(uVar.a, uVar.b, uVar.c, uVar.d, uVar.e, uVar.g, uVar.h, uVar.j, u10, uVar.l);
        this.n = uVar3;
        y0 y0Var2 = new y0();
        y0Var2.c = uVar3;
        y0Var2.d = u10;
        y0Var2.a = -1L;
        y0Var2.b = -1L;
        this.o = y0Var2;
        return true;
    }

    @Override // x3.i
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.n = null;
            this.o = null;
        }
    }
}
