package yh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;

    public /* synthetic */ t0(s3 s3Var, int i10) {
        this.a = i10;
        this.b = s3Var;
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
                s3 s3Var = this.b;
                if (!s3Var.k0.N) {
                    s3Var.w0.a(!r7.a.q, true);
                    break;
                }
                break;
            case 13:
                s3.U0(this.b, view);
                break;
            case 14:
                this.b.X1(true);
                break;
            case 15:
                float alpha = view.getAlpha();
                s3 s3Var2 = this.b;
                if (alpha >= 0.99f) {
                    s3Var2.Z1();
                    break;
                } else {
                    s3Var2.v1();
                    break;
                }
            case 16:
                s3.c1(this.b);
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
                    s3 s3Var3 = this.b;
                    ci.d dVar = s3Var3.k0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new t0(s3Var3, 22));
                    s3Var3.f0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    s3Var3.s2(3, true, null);
                    break;
                }
                break;
            case 21:
                s3 s3Var4 = this.b;
                s3Var4.W0 = true;
                s3Var4.t2(false);
                break;
            case 22:
                this.b.X1(false);
                break;
            case 23:
                f3 f3Var = this.b.N0;
                f3Var.h.e();
                f3Var.i.e();
                f3Var.j.e();
                f3Var.k.e();
                break;
            case 24:
                this.b.R1();
                break;
            case 25:
                this.b.onBackPressed();
                break;
            default:
                s3 s3Var5 = this.b;
                s3Var5.W0 = true;
                s3Var5.t2(false);
                break;
        }
    }
}
