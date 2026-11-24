// default package

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pf implements ed, us2 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ pf(kp kpVar, f86 f86Var, fr6 fr6Var, IOException iOException, boolean z) {
        this.c = kpVar;
        this.d = f86Var;
        this.e = fr6Var;
        this.f = iOException;
        this.b = z;
    }

    @Override // us2
    public final void accept(Object obj) {
        kp kpVar = (kp) this.c;
        ((vx6) obj).w(kpVar.b, (rx6) kpVar.c, (f86) this.d, (fr6) this.e, (IOException) this.f, this.b);
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        int i2;
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                hn7 hn7Var = (hn7) obj4;
                hn7 hn7Var2 = (hn7) obj3;
                hn7 hn7Var3 = (hn7) obj2;
                zf zfVar = (zf) obj;
                if (z) {
                    ij.d(hn7Var, hn7Var2, hn7Var3);
                }
                int value = hn7Var3.getValue();
                int value2 = hn7Var2.getValue();
                int value3 = hn7Var.getValue();
                vx7 vx7Var = (vx7) zfVar.c;
                int i3 = zfVar.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) zfVar.d;
                if (i3 == 8) {
                    int[] iArr = vx7Var.y;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                break;
            case 1:
                wt1 wt1Var = (wt1) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                mu1 mu1Var = wt1Var.a;
                x0 x0Var = new x0(wt1Var, (gb2) obj3, (byte) 26);
                if (!((boolean[]) obj2)[0]) {
                    x0Var.a(Boolean.FALSE);
                    break;
                } else if (!z && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    x0Var.a(Boolean.TRUE);
                    break;
                } else {
                    Activity parentActivity = mu1Var.getParentActivity();
                    i2 = ((d) mu1Var).currentAccount;
                    ThemeActivity.G0(i2, mu1Var.getResourceProvider(), new x0(wt1Var, x0Var, (byte) 27), parentActivity);
                    break;
                }
            default:
                mu1 mu1Var2 = (mu1) obj;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                yv1 yv1Var = new yv1(mu1Var2, (k27) obj3, (z3a) obj4, (TL_keyboard.KeyboardButtonProto) obj2, twoStepVerificationActivity, this.b);
                twoStepVerificationActivity.a0 = (byte) 0;
                twoStepVerificationActivity.c0 = yv1Var;
                mu1Var2.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    public /* synthetic */ pf(wt1 wt1Var, gb2 gb2Var, boolean[] zArr, boolean z, TL_account.contentSettings contentsettings) {
        this.c = wt1Var;
        this.d = gb2Var;
        this.e = zArr;
        this.b = z;
        this.f = contentsettings;
    }

    public /* synthetic */ pf(z3a z3aVar, boolean z, k27 k27Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto, mu1 mu1Var) {
        this.c = z3aVar;
        this.b = z;
        this.d = k27Var;
        this.e = keyboardButtonProto;
        this.f = mu1Var;
    }

    public /* synthetic */ pf(boolean z, hn7 hn7Var, hn7 hn7Var2, hn7 hn7Var3, zf zfVar) {
        this.b = z;
        this.c = hn7Var;
        this.d = hn7Var2;
        this.e = hn7Var3;
        this.f = zfVar;
    }
}
