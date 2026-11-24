// default package

import android.view.KeyEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class z02 implements nac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ z02(KeyEvent.Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    @Override // nac
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                i22 i22Var = (i22) callback;
                CharSequence charSequence = (CharSequence) obj;
                k12 k12Var = i22Var.B2;
                k12Var.setText(charSequence);
                k12Var.w(charSequence.length(), charSequence.length());
                i22Var.i1();
                break;
            case 1:
                i22 i22Var2 = (i22) callback;
                CharSequence charSequence2 = (CharSequence) obj;
                m12 m12Var = i22Var2.M2;
                m12Var.setText(charSequence2);
                m12Var.w(charSequence2.length(), charSequence2.length());
                i22Var2.i1();
                break;
            default:
                tc1 tc1Var = (tc1) callback;
                jc1 jc1Var = tc1Var.f;
                jc1Var.setText((CharSequence) obj);
                jc1Var.d();
                jc1Var.k(true);
                hc1 hc1Var = tc1Var.d0;
                gm.r(hc1Var);
                hc1Var.run();
                break;
        }
    }
}
