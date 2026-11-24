// default package

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class wq7 extends w8b {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(xu7 xu7Var, byte[] bArr) {
        if (xu7Var.a() < bArr.length) {
            return false;
        }
        int i = xu7Var.b;
        byte[] bArr2 = new byte[bArr.length];
        xu7Var.k(0, bArr.length, bArr2);
        xu7Var.N(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // w8b
    public final long b(xu7 xu7Var) {
        byte[] bArr = xu7Var.a;
        return (this.i * gqe.b(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // w8b
    public final boolean c(xu7 xu7Var, long j, v8b v8bVar) {
        if (e(xu7Var, o)) {
            byte[] copyOf = Arrays.copyOf(xu7Var.a, xu7Var.c);
            int i = copyOf[9] & 255;
            ArrayList a = gqe.a(copyOf);
            if (((fm4) v8bVar.b) == null) {
                em4 em4Var = new em4();
                em4Var.r = ud7.n("audio/ogg");
                em4Var.s = ud7.n("audio/opus");
                em4Var.M = i;
                em4Var.O = 48000;
                em4Var.v = a;
                v8bVar.b = new fm4(em4Var);
                return true;
            }
        } else {
            boolean e = e(xu7Var, p);
            fm4 fm4Var = (fm4) v8bVar.b;
            if (!e) {
                fm4Var.getClass();
                return false;
            }
            fm4Var.getClass();
            if (!this.n) {
                this.n = true;
                xu7Var.O(8);
                ld7 a2 = zjc.a(mm5.r((String[]) aye.b(xu7Var, false, false).b));
                if (a2 != null) {
                    em4 a3 = ((fm4) v8bVar.b).a();
                    a3.l = a2.b(((fm4) v8bVar.b).m);
                    v8bVar.b = new fm4(a3);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // w8b
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
