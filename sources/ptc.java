// default package

import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ptc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ euc b;

    public /* synthetic */ ptc(euc eucVar, byte b) {
        this.a = b;
        this.b = eucVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        byte b = this.a;
        euc eucVar = this.b;
        switch (b) {
            case 0:
                if (eucVar.J && (editTextBoldCursor = eucVar.I) != null && editTextBoldCursor.isAttachedToWindow() && eucVar.I.hasWindowFocus()) {
                    eucVar.I.requestFocus();
                    if (hl.E3(eucVar.I)) {
                        eucVar.J = false;
                        break;
                    }
                }
                break;
            case 1:
                float f = eucVar.c0;
                if (f < 1.0f && eucVar.b0 == null) {
                    vpa vpaVar = new vpa(new xk4(f));
                    eucVar.b0 = vpaVar;
                    wpa wpaVar = new wpa(1.0f);
                    wpaVar.a(0.55f);
                    wpaVar.b(65.0f);
                    vpaVar.m = wpaVar;
                    eucVar.b0.f(0.001f);
                    eucVar.b0.b(new i10(eucVar, (byte) 21));
                    eucVar.b0.a(new iw0(eucVar, (byte) 14));
                    eucVar.b0.h();
                    break;
                }
                break;
            case 2:
                eucVar.e0.setLoading(false);
                break;
            case 3:
                eucVar.e0.setLoading(false);
                break;
            case 4:
                eucVar.u0();
                break;
            case 5:
                eucVar.presentFragment(zu1.ha(eucVar.f.id));
                break;
            default:
                bs2.v(null, 2131742852, d31.b0(eucVar), R.raw.copy, 36);
                break;
        }
    }
}
