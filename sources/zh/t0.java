package zh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;

    public /* synthetic */ t0(r3 r3Var, int i10) {
        this.a = i10;
        this.b = r3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.onBackPressed();
                break;
            case 1:
                this.b.x1();
                break;
            case 2:
                this.b.onBackPressed();
                break;
            case 3:
                this.b.b2();
                break;
            case 4:
                this.b.dismiss();
                break;
            case 5:
                this.b.b2();
                break;
            case 6:
                this.b.onBackPressed();
                break;
            case 7:
                this.b.R1();
                break;
            case 8:
                this.b.b2();
                break;
            case 9:
                this.b.onBackPressed();
                break;
            case 10:
                this.b.X1(true);
                break;
            case 11:
                this.b.b2();
                break;
            case 12:
                r3 r3Var = this.b;
                if (!r3Var.k0.N) {
                    r3Var.w0.a(!r7.a.q, true);
                    break;
                }
                break;
            case 13:
                r3.U0(this.b, view);
                break;
            case 14:
                this.b.X1(true);
                break;
            case 15:
                float alpha = view.getAlpha();
                r3 r3Var2 = this.b;
                if (alpha >= 0.99f) {
                    r3Var2.Z1();
                    break;
                } else {
                    r3Var2.v1();
                    break;
                }
            case 16:
                r3.c1(this.b);
                break;
            case 17:
                this.b.T1();
                break;
            case 18:
                this.b.S1(view);
                break;
            case 19:
                this.b.V1();
                break;
            case 20:
                if (view.getAlpha() >= 1.0f) {
                    r3 r3Var3 = this.b;
                    di.d dVar = r3Var3.k0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new t0(r3Var3, 22));
                    r3Var3.f0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    r3Var3.s2(3, true, null);
                    break;
                }
                break;
            case 21:
                r3 r3Var4 = this.b;
                r3Var4.W0 = true;
                r3Var4.t2(false);
                break;
            case 22:
                this.b.X1(false);
                break;
            case 23:
                e3 e3Var = this.b.N0;
                e3Var.h.e();
                e3Var.i.e();
                e3Var.j.e();
                e3Var.k.e();
                break;
            case 24:
                this.b.R1();
                break;
            case 25:
                this.b.onBackPressed();
                break;
            default:
                r3 r3Var5 = this.b;
                r3Var5.W0 = true;
                r3Var5.t2(false);
                break;
        }
    }
}
