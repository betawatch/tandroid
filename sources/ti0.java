// default package

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ti0 implements co7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aj0 b;

    public /* synthetic */ ti0(aj0 aj0Var, byte b) {
        this.a = b;
        this.b = aj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    @Override // co7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D2(Object obj) {
        hh7 hh7Var;
        byte b = this.a;
        aj0 aj0Var = this.b;
        switch (b) {
            case 0:
                pi0 pi0Var = (pi0) obj;
                if (pi0Var != null) {
                    int i = pi0Var.a;
                    CharSequence charSequence = pi0Var.b;
                    switch (i) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        case 6:
                        default:
                            i = 8;
                            break;
                    }
                    Context n = aj0Var.n();
                    int i2 = Build.VERSION.SDK_INT;
                    int i3 = 0;
                    if (i2 < 29 && ((i == 7 || i == 9) && n != null)) {
                        KeyguardManager a = ov5.a(n);
                        if ((a == null ? false : ov5.b(a)) && wmd.b(aj0Var.m0.c())) {
                            aj0Var.T();
                            lj0 lj0Var = aj0Var.m0;
                            hh7Var = lj0Var.q;
                            if (hh7Var == null) {
                                hh7Var = new hh7();
                                lj0Var.q = hh7Var;
                            }
                            lj0.f(hh7Var, null);
                            break;
                        }
                    }
                    if (aj0Var.S()) {
                        if (charSequence == null) {
                            charSequence = pfe.a(aj0Var.n(), i);
                        }
                        lj0 lj0Var2 = aj0Var.m0;
                        if (i == 5) {
                            byte b2 = lj0Var2.j;
                            if (b2 == 0 || b2 == 3) {
                                aj0Var.V(i, charSequence);
                            }
                            aj0Var.P();
                        } else {
                            if (lj0Var2.u) {
                                aj0Var.U(i, charSequence);
                            } else {
                                aj0Var.X(charSequence);
                                Handler handler = aj0Var.l0;
                                qi0 qi0Var = new qi0(aj0Var, i, charSequence, (byte) 1);
                                Context n2 = aj0Var.n();
                                if (n2 != null) {
                                    String str = Build.MODEL;
                                    if (i2 == 28 && str != null) {
                                        for (String str2 : n2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                            if (str.startsWith(str2)) {
                                                handler.postDelayed(qi0Var, i3);
                                            }
                                        }
                                    }
                                }
                                i3 = 2000;
                                handler.postDelayed(qi0Var, i3);
                            }
                            aj0Var.m0.u = true;
                        }
                    } else {
                        if (charSequence == null) {
                            charSequence = aj0Var.q(R.string.default_error_msg) + " " + i;
                        }
                        aj0Var.U(i, charSequence);
                    }
                    lj0 lj0Var3 = aj0Var.m0;
                    hh7Var = lj0Var3.q;
                    if (hh7Var == null) {
                    }
                    lj0.f(hh7Var, null);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    aj0Var.O(1);
                    aj0Var.P();
                    lj0 lj0Var4 = aj0Var.m0;
                    hh7 hh7Var2 = lj0Var4.v;
                    if (hh7Var2 == null) {
                        hh7Var2 = new hh7();
                        lj0Var4.v = hh7Var2;
                    }
                    lj0.f(hh7Var2, Boolean.FALSE);
                    break;
                }
                break;
        }
    }
}
