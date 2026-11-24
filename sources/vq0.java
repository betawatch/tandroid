// default package

import android.text.TextUtils;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vq0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x02 b;

    public /* synthetic */ vq0(x02 x02Var, byte b) {
        this.a = b;
        this.b = x02Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p02 p02Var;
        m52 m52Var;
        byte b = this.a;
        boolean z = false;
        x02 x02Var = this.b;
        switch (b) {
            case 0:
                x02Var.hide();
                break;
            case 1:
                rt3 rt3Var = x02Var.W1 ? x02Var.M2 : x02Var.B2;
                x02Var.w1(rt3Var.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(rt3Var.getText().toString().trim()));
                break;
            case 2:
                x02Var.A0 = null;
                x02Var.B0 = (byte) 0;
                x02Var.I();
                break;
            case 3:
                x02 x02Var2 = this.b;
                bx1 bx1Var = x02Var2.b2;
                long i = bx1Var != null ? bx1Var.i() : 0L;
                e02 e02Var = x02Var2.F2;
                x02Var2.K2 = i;
                e02Var.setEffect(i);
                p02 p02Var2 = x02Var2.v2;
                if (p02Var2 == x02Var2.d2 || p02Var2 == x02Var2.k2) {
                    z = x02Var2.p1(false, 0, 0, i, x02Var2.a1());
                } else if (!p02Var2.M(false, 0, 0, i, x02Var2.a1())) {
                    x02Var2.dismiss();
                }
                bx1 bx1Var2 = x02Var2.b2;
                if (bx1Var2 != null) {
                    bx1Var2.f(!z);
                    x02Var2.b2 = null;
                    break;
                }
                break;
            case 4:
                x02Var.a(true);
                d dVar = x02Var.Z1;
                if (dVar != null) {
                    dVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 5:
                x02Var.o1();
                break;
            default:
                x02Var.q3 = null;
                p02 p02Var3 = x02Var.v2;
                if (p02Var3 != x02Var.d2 && (p02Var = x02Var.w2) != (m52Var = x02Var.k2) && p02Var3 != p02Var && p02Var3 != m52Var) {
                    x02Var.b.removeView(p02Var3);
                }
                x02Var.v2.setVisibility(8);
                x02Var.v2.u();
                x02Var.w2.J();
                x02Var.v2 = x02Var.w2;
                x02Var.w2 = null;
                int[] iArr = x02Var.Y3;
                iArr[0] = iArr[1];
                x02Var.q1(x02Var.W1, false);
                x02Var.G1();
                break;
        }
    }
}
