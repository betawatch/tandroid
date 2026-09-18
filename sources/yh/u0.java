package yh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;

    public /* synthetic */ u0(a4 a4Var, int i10) {
        this.a = i10;
        this.b = a4Var;
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
                a4 a4Var = this.b;
                if (!a4Var.j0.N) {
                    a4Var.v0.a(!r7.a.q, true);
                    break;
                }
                break;
            case 13:
                a4.T0(this.b, view);
                break;
            case 14:
                this.b.W1(true);
                break;
            case 15:
                float alpha = view.getAlpha();
                a4 a4Var2 = this.b;
                if (alpha >= 0.99f) {
                    a4Var2.Y1();
                    break;
                } else {
                    a4Var2.u1();
                    break;
                }
            case 16:
                a4.b1(this.b);
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
                    a4 a4Var3 = this.b;
                    ci.d dVar = a4Var3.j0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new u0(a4Var3, 22));
                    a4Var3.e0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    a4Var3.q2(3, true, null);
                    break;
                }
                break;
            case 21:
                a4 a4Var4 = this.b;
                a4Var4.V0 = true;
                a4Var4.r2(false);
                break;
            case 22:
                this.b.W1(false);
                break;
            case 23:
                m3 m3Var = this.b.M0;
                m3Var.h.e();
                m3Var.i.e();
                m3Var.j.e();
                m3Var.k.e();
                break;
            case 24:
                this.b.Q1();
                break;
            case 25:
                this.b.onBackPressed();
                break;
            default:
                a4 a4Var5 = this.b;
                a4Var5.V0 = true;
                a4Var5.r2(false);
                break;
        }
    }
}
