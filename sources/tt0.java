// default package

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class tt0 implements View.OnFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tt0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        float f;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                wt0 wt0Var = ((au0) obj).W;
                f = z ? 1.0f : 0.0f;
                wt0Var.b(f, f, true);
                break;
            case 1:
                wt0 wt0Var2 = ((ik1) obj).K0;
                f = z ? 1.0f : 0.0f;
                wt0Var2.b(f, f, true);
                break;
            case 2:
                EditTextBoldCursor editTextBoldCursor = ((jn2) obj).c;
                if (!z && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    break;
                }
                break;
            case 3:
                EditTextBoldCursor editTextBoldCursor2 = ((kn2) obj).d;
                if (!z && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    break;
                }
                break;
            case 4:
                k92 k92Var = (k92) obj;
                if (!z) {
                    k92Var.J();
                    break;
                } else {
                    k92Var.K(true);
                    Runnable runnable = k92Var.g2;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 5:
                nk3 nk3Var = (nk3) obj;
                if (z) {
                    nk3Var.Z.b(true);
                    break;
                }
                break;
            case 6:
                mh6 mh6Var = ((ze6) obj).a0;
                if (z) {
                    mh6Var.c.setEditText((EditText) view);
                    mh6Var.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 7:
                gt7 gt7Var = (gt7) obj;
                f = z ? 1.0f : 0.0f;
                gt7Var.b(f, f, true);
                break;
            case 8:
                gt7 gt7Var2 = ((if6) obj).y;
                f = z ? 1.0f : 0.0f;
                gt7Var2.b(f, f, true);
                break;
            case 9:
                gt7 gt7Var3 = ((pf6) obj).b;
                f = z ? 1.0f : 0.0f;
                gt7Var3.b(f, f, true);
                break;
            case 10:
                mh6 mh6Var2 = ((sf6) obj).E;
                if (z) {
                    mh6Var2.c.setEditText((EditText) view);
                    mh6Var2.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 11:
                gt7 gt7Var4 = ((cg6) obj).a;
                f = z ? 1.0f : 0.0f;
                gt7Var4.b(f, f, true);
                break;
            case 12:
                mh6 mh6Var3 = ((rg6) obj).v0;
                if (z) {
                    mh6Var3.c.setEditText((EditText) view);
                    mh6Var3.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 13:
                gt7 gt7Var5 = ((lh6) obj).e;
                f = z ? 1.0f : 0.0f;
                gt7Var5.b(f, f, true);
                break;
            case 14:
                ((u67) obj).o1.c(z, !TextUtils.isEmpty(r5.p1.getText()));
                break;
            case 15:
                gt7 gt7Var6 = ((PasscodeActivity) obj).f;
                f = z ? 1.0f : 0.0f;
                gt7Var6.b(f, f, true);
                break;
            case 16:
                ((xk9) obj).o(z);
                break;
            case 17:
                ((q2a) obj).l1.c(z, !TextUtils.isEmpty(r5.m1.getText()));
                break;
            case 18:
                njb njbVar = ((zob) obj).d;
                if (!z) {
                    njbVar.setText(gm.S2(jb6.M0(2131743870, null)));
                    break;
                } else {
                    njbVar.setText(gm.S2(jb6.M0(2131743869, null)));
                    break;
                }
            case 19:
                gt7 gt7Var7 = ((TwoStepVerificationActivity) obj).w;
                f = z ? 1.0f : 0.0f;
                gt7Var7.b(f, f, true);
                break;
            default:
                nsc nscVar = (nsc) obj;
                if (z) {
                    nscVar.setError(false);
                    nscVar.e();
                    String lowerCase = nscVar.a.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty()) {
                        nscVar.a();
                    } else {
                        nscVar.f(lowerCase);
                    }
                } else {
                    nscVar.a();
                    if (!nscVar.w && !nscVar.b()) {
                        nscVar.setError(true);
                    }
                }
                nscVar.d();
                break;
        }
    }
}
