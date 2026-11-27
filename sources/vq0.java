// default package

import android.text.TextUtils;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vq0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n12 b;

    public /* synthetic */ vq0(n12 n12Var, byte b) {
        this.a = b;
        this.b = n12Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f12 f12Var;
        c62 c62Var;
        byte b = this.a;
        boolean z = false;
        n12 n12Var = this.b;
        switch (b) {
            case 0:
                n12Var.hide();
                break;
            case 1:
                iu3 iu3Var = n12Var.W1 ? n12Var.M2 : n12Var.B2;
                n12Var.x1(iu3Var.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(iu3Var.getText().toString().trim()));
                break;
            case 2:
                n12Var.A0 = null;
                n12Var.B0 = (byte) 0;
                n12Var.H();
                break;
            case 3:
                n12 n12Var2 = this.b;
                ox1 ox1Var = n12Var2.b2;
                long i = ox1Var != null ? ox1Var.i() : 0L;
                u02 u02Var = n12Var2.F2;
                n12Var2.K2 = i;
                u02Var.setEffect(i);
                f12 f12Var2 = n12Var2.v2;
                if (f12Var2 == n12Var2.d2 || f12Var2 == n12Var2.k2) {
                    z = n12Var2.q1(false, 0, 0, i, n12Var2.b1());
                } else if (!f12Var2.K(false, 0, 0, i, n12Var2.b1())) {
                    n12Var2.dismiss();
                }
                ox1 ox1Var2 = n12Var2.b2;
                if (ox1Var2 != null) {
                    ox1Var2.f(!z);
                    n12Var2.b2 = null;
                    break;
                }
                break;
            case 4:
                n12Var.p1();
                break;
            case 5:
                n12Var.a(true);
                e eVar = n12Var.Z1;
                if (eVar != null) {
                    eVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            default:
                n12Var.q3 = null;
                f12 f12Var3 = n12Var.v2;
                if (f12Var3 != n12Var.d2 && (f12Var = n12Var.w2) != (c62Var = n12Var.k2) && f12Var3 != f12Var && f12Var3 != c62Var) {
                    n12Var.b.removeView(f12Var3);
                }
                n12Var.v2.setVisibility(8);
                n12Var.v2.u();
                n12Var.w2.I();
                n12Var.v2 = n12Var.w2;
                n12Var.w2 = null;
                int[] iArr = n12Var.Y3;
                iArr[0] = iArr[1];
                n12Var.r1(n12Var.W1, false);
                n12Var.H1();
                break;
        }
    }
}
