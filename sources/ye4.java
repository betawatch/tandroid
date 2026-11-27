// default package

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ye4 extends hf4 {
    public final /* synthetic */ ze4 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye4(ze4 ze4Var, Context context, int i, int i2) {
        super(context, null, i, i2);
        this.F = ze4Var;
    }

    @Override // hf4
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        af4 af4Var = this.F.d;
        af4Var.U1.remove(tL_exportedChatlistInvite);
        af4Var.c1();
        af4Var.d1(true);
    }

    @Override // hf4
    public final void c() {
        fu5 G = fu5.G(this.F.d.c, null, this);
        final byte b = 0;
        G.b(R.drawable.msg_copy, ob6.M0(2131751727, null), new Runnable(this) { // from class: xe4
            public final /* synthetic */ ye4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                ye4 ye4Var = this.b;
                switch (b2) {
                    case 0:
                        String str = ye4Var.y;
                        if (str != null && hl.g(str)) {
                            new d31(ye4Var.F.d.V1, null).k(false).j();
                            break;
                        }
                        break;
                    case 1:
                        ye4Var.d();
                        break;
                    default:
                        ye4Var.a();
                        break;
                }
            }
        }, false);
        final byte b2 = 1;
        G.b(R.drawable.msg_qrcode, ob6.M0(2131750433, null), new Runnable(this) { // from class: xe4
            public final /* synthetic */ ye4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                ye4 ye4Var = this.b;
                switch (b22) {
                    case 0:
                        String str = ye4Var.y;
                        if (str != null && hl.g(str)) {
                            new d31(ye4Var.F.d.V1, null).k(false).j();
                            break;
                        }
                        break;
                    case 1:
                        ye4Var.d();
                        break;
                    default:
                        ye4Var.a();
                        break;
                }
            }
        }, false);
        final byte b3 = 2;
        G.b(R.drawable.msg_delete, ob6.M0(2131751499, null), new Runnable(this) { // from class: xe4
            public final /* synthetic */ ye4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b3;
                ye4 ye4Var = this.b;
                switch (b22) {
                    case 0:
                        String str = ye4Var.y;
                        if (str != null && hl.g(str)) {
                            new d31(ye4Var.F.d.V1, null).k(false).j();
                            break;
                        }
                        break;
                    case 1:
                        ye4Var.d();
                        break;
                    default:
                        ye4Var.a();
                        break;
                }
            }
        }, true);
        if (ob6.a0) {
            G.i = (byte) 3;
        }
        G.a0();
    }
}
