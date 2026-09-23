package yh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class u0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;

    public /* synthetic */ u0(y3 y3Var, int i10) {
        this.a = i10;
        this.b = y3Var;
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
                y3 y3Var = this.b;
                if (!y3Var.j0.N) {
                    y3Var.v0.a(!r7.a.q, true);
                    break;
                }
                break;
            case 13:
                y3.T0(this.b, view);
                break;
            case 14:
                this.b.W1(true);
                break;
            case 15:
                float alpha = view.getAlpha();
                y3 y3Var2 = this.b;
                if (alpha >= 0.99f) {
                    y3Var2.Y1();
                    break;
                } else {
                    y3Var2.u1();
                    break;
                }
            case 16:
                y3.b1(this.b);
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
                    y3 y3Var3 = this.b;
                    ci.d dVar = y3Var3.j0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new u0(y3Var3, 22));
                    y3Var3.e0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    y3Var3.q2(3, true, null);
                    break;
                }
                break;
            case 21:
                y3 y3Var4 = this.b;
                y3Var4.V0 = true;
                y3Var4.r2(false);
                break;
            case 22:
                this.b.W1(false);
                break;
            case 23:
                k3 k3Var = this.b.M0;
                k3Var.h.e();
                k3Var.i.e();
                k3Var.j.e();
                k3Var.k.e();
                break;
            case 24:
                this.b.Q1();
                break;
            case 25:
                this.b.onBackPressed();
                break;
            default:
                y3 y3Var5 = this.b;
                y3Var5.V0 = true;
                y3Var5.r2(false);
                break;
        }
    }
}
