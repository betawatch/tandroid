// default package

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ys7 extends yab {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(yw7 yw7Var, byte[] bArr) {
        if (yw7Var.a() < bArr.length) {
            return false;
        }
        int i = yw7Var.b;
        byte[] bArr2 = new byte[bArr.length];
        yw7Var.k(0, bArr.length, bArr2);
        yw7Var.N(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // yab
    public final long b(yw7 yw7Var) {
        byte[] bArr = yw7Var.a;
        return (this.i * jse.b(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // yab
    public final boolean c(yw7 yw7Var, long j, xab xabVar) {
        if (e(yw7Var, o)) {
            byte[] copyOf = Arrays.copyOf(yw7Var.a, yw7Var.c);
            int i = copyOf[9] & 255;
            ArrayList a = jse.a(copyOf);
            if (((go4) xabVar.b) == null) {
                fo4 fo4Var = new fo4();
                fo4Var.r = wf7.n("audio/ogg");
                fo4Var.s = wf7.n("audio/opus");
                fo4Var.M = i;
                fo4Var.O = 48000;
                fo4Var.v = a;
                xabVar.b = new go4(fo4Var);
                return true;
            }
        } else {
            boolean e = e(yw7Var, p);
            go4 go4Var = (go4) xabVar.b;
            if (!e) {
                go4Var.getClass();
                return false;
            }
            go4Var.getClass();
            if (!this.n) {
                this.n = true;
                yw7Var.O(8);
                nf7 a2 = zlc.a(mo5.r((String[]) c0f.b(yw7Var, false, false).b));
                if (a2 != null) {
                    fo4 a3 = ((go4) xabVar.b).a();
                    a3.l = a2.b(((go4) xabVar.b).m);
                    xabVar.b = new go4(a3);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // yab
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
