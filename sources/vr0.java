// default package

import android.text.TextUtils;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vr0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i22 b;

    public /* synthetic */ vr0(i22 i22Var, byte b) {
        this.a = b;
        this.b = i22Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a22 a22Var;
        x62 x62Var;
        byte b = this.a;
        boolean z = false;
        i22 i22Var = this.b;
        switch (b) {
            case 0:
                i22Var.hide();
                break;
            case 1:
                cv3 cv3Var = i22Var.W1 ? i22Var.M2 : i22Var.B2;
                i22Var.w1(cv3Var.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(cv3Var.getText().toString().trim()));
                break;
            case 2:
                i22Var.A0 = null;
                i22Var.B0 = (byte) 0;
                i22Var.H();
                break;
            case 3:
                i22 i22Var2 = this.b;
                oy1 oy1Var = i22Var2.b2;
                long i = oy1Var != null ? oy1Var.i() : 0L;
                p12 p12Var = i22Var2.F2;
                i22Var2.K2 = i;
                p12Var.setEffect(i);
                a22 a22Var2 = i22Var2.v2;
                if (a22Var2 == i22Var2.d2 || a22Var2 == i22Var2.k2) {
                    z = i22Var2.p1(false, 0, 0, i, i22Var2.a1());
                } else if (!a22Var2.K(false, 0, 0, i, i22Var2.a1())) {
                    i22Var2.dismiss();
                }
                oy1 oy1Var2 = i22Var2.b2;
                if (oy1Var2 != null) {
                    oy1Var2.f(!z);
                    i22Var2.b2 = null;
                    break;
                }
                break;
            case 4:
                i22Var.a(true);
                d dVar = i22Var.Z1;
                if (dVar != null) {
                    dVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 5:
                i22Var.o1();
                break;
            default:
                i22Var.q3 = null;
                a22 a22Var3 = i22Var.v2;
                if (a22Var3 != i22Var.d2 && (a22Var = i22Var.w2) != (x62Var = i22Var.k2) && a22Var3 != a22Var && a22Var3 != x62Var) {
                    i22Var.b.removeView(a22Var3);
                }
                i22Var.v2.setVisibility(8);
                i22Var.v2.t();
                i22Var.w2.I();
                i22Var.v2 = i22Var.w2;
                i22Var.w2 = null;
                int[] iArr = i22Var.Y3;
                iArr[0] = iArr[1];
                i22Var.q1(i22Var.W1, false);
                i22Var.G1();
                break;
        }
    }
}
