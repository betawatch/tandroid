// default package

import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class u36 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a46 b;
    public final /* synthetic */ String c;

    public /* synthetic */ u36(a46 a46Var, String str, byte b) {
        this.a = b;
        this.b = a46Var;
        this.c = str;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        String str = this.c;
        a46 a46Var = this.b;
        switch (b) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                a46Var.c();
                if (passkeys != null) {
                    a46Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str)) {
                        a46Var.x("addPasskeyRow");
                        break;
                    }
                }
                break;
            default:
                r25 r25Var = (r25) obj;
                String str2 = (String) obj2;
                a46Var.c();
                if (r25Var != null) {
                    d S = LaunchActivity.S();
                    if (S != null && S.getContext() != null) {
                        w25.D(S.getContext(), a46Var.b, r25Var, null, S.getResourceProvider(), null, new t36(a46Var, str, (byte) 1));
                        break;
                    }
                } else {
                    if (str2 == null) {
                        str2 = k96.M0(2131742728, null);
                    }
                    u21.c0(str2);
                    break;
                }
                break;
        }
    }
}
