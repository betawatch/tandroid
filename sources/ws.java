// default package

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ws implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o b;

    public /* synthetic */ ws(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        o oVar = this.b;
        switch (b) {
            case 0:
                a6 a6Var = oVar.r0;
                float f = -((Integer) obj).intValue();
                oVar.q0 = f;
                a6Var.setTranslationY(((1.0f - oVar.a1) * gl.L(51.0f)) + f);
                break;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    oVar.i0.c0.setText(str);
                    ps0 ps0Var = oVar.i0.c0;
                    ps0Var.setSelection(ps0Var.getText().length());
                    gl.E3(oVar.i0.c0);
                    break;
                }
                break;
            case 2:
                String str2 = (String) obj;
                if (oVar.M != null && str2 != null) {
                    oVar.i0.k(false);
                    if (!d01.g(Uri.parse(str2), false, null)) {
                        if (!d01.m(oVar.M, str2, false)) {
                            m mVar = oVar.v0[0];
                            if (mVar != null && mVar.getWebView() != null) {
                                oVar.v0[0].getWebView().loadUrl(str2);
                                break;
                            } else {
                                d01.o(str2);
                                break;
                            }
                        }
                    } else {
                        sw swVar = oVar.L;
                        if (swVar != null) {
                            swVar.a(true);
                        }
                        d01.l(oVar.M, str2, false, false, null);
                        break;
                    }
                }
                break;
            default:
                e01 e01Var = (e01) obj;
                if (oVar.M != null && e01Var != null) {
                    oVar.i0.k(false);
                    m mVar2 = oVar.v0[0];
                    if (mVar2 != null && mVar2.getWebView() != null) {
                        oVar.v0[0].getWebView().d(e01Var.c, e01Var.d);
                        break;
                    } else {
                        d01.o(e01Var.c);
                        break;
                    }
                }
                break;
        }
    }
}
