package zh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class u0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ u0(w3 w3Var, int i10) {
        this.a = i10;
        this.b = w3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.onBackPressed();
                break;
            case 1:
                this.b.w1();
                break;
            case 2:
                this.b.onBackPressed();
                break;
            case 3:
                this.b.a2();
                break;
            case 4:
                this.b.dismiss();
                break;
            case 5:
                this.b.a2();
                break;
            case 6:
                this.b.onBackPressed();
                break;
            case 7:
                this.b.Q1();
                break;
            case 8:
                this.b.a2();
                break;
            case 9:
                this.b.onBackPressed();
                break;
            case 10:
                this.b.W1(true);
                break;
            case 11:
                this.b.a2();
                break;
            case 12:
                w3 w3Var = this.b;
                if (!w3Var.j0.N) {
                    w3Var.v0.a(!r7.a.q, true);
                    break;
                }
                break;
            case 13:
                w3.T0(this.b, view);
                break;
            case 14:
                this.b.W1(true);
                break;
            case 15:
                float alpha = view.getAlpha();
                w3 w3Var2 = this.b;
                if (alpha >= 0.99f) {
                    w3Var2.Y1();
                    break;
                } else {
                    w3Var2.u1();
                    break;
                }
            case 16:
                w3.b1(this.b);
                break;
            case 17:
                this.b.S1();
                break;
            case 18:
                this.b.R1(view);
                break;
            case 19:
                this.b.U1();
                break;
            case 20:
                if (view.getAlpha() >= 1.0f) {
                    w3 w3Var3 = this.b;
                    di.d dVar = w3Var3.j0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new u0(w3Var3, 22));
                    w3Var3.e0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    w3Var3.q2(3, true, null);
                    break;
                }
                break;
            case 21:
                w3 w3Var4 = this.b;
                w3Var4.V0 = true;
                w3Var4.r2(false);
                break;
            case 22:
                this.b.W1(false);
                break;
            case 23:
                j3 j3Var = this.b.M0;
                j3Var.h.e();
                j3Var.i.e();
                j3Var.j.e();
                j3Var.k.e();
                break;
            case 24:
                this.b.Q1();
                break;
            case 25:
                this.b.onBackPressed();
                break;
            default:
                w3 w3Var5 = this.b;
                w3Var5.V0 = true;
                w3Var5.r2(false);
                break;
        }
    }
}
