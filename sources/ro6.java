// default package

import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ro6 extends go6 {
    public String B;
    public String C;
    public String D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public CharSequence I;
    public TLRPC.Document J;
    public TLRPC.Photo K;
    public TLRPC.PhotoSize L;
    public TLRPC.PhotoSize M;
    public TLRPC.BotInlineResult N;
    public HashMap O;

    @Override // go6
    public final String a() {
        if (this.L != null) {
            xb4.G(yac.t0);
            return xb4.J(this.L, null, true, true).getAbsolutePath();
        }
        if (this.J == null) {
            return in5.w(this.C).getAbsolutePath();
        }
        xb4.G(yac.t0);
        return xb4.J(this.J, null, true, true).getAbsolutePath();
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final ro6 clone() {
        ro6 ro6Var = new ro6();
        ro6Var.B = this.B;
        ro6Var.C = this.C;
        ro6Var.D = this.D;
        ro6Var.E = this.E;
        ro6Var.F = this.F;
        ro6Var.G = this.G;
        ro6Var.H = this.H;
        ro6Var.I = this.I;
        ro6Var.J = this.J;
        ro6Var.K = this.K;
        ro6Var.L = this.L;
        ro6Var.M = this.M;
        ro6Var.N = this.N;
        ro6Var.O = this.O;
        return ro6Var;
    }

    public final String g() {
        if (this.L != null) {
            xb4.G(yac.t0);
            return xb4.J(this.L, null, true, true).getAbsolutePath();
        }
        if (this.J == null) {
            return this.C;
        }
        xb4.G(yac.t0);
        return xb4.J(this.J, null, true, true).getAbsolutePath();
    }
}
