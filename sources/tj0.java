// default package

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tj0 implements fq7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ak0 b;

    public /* synthetic */ tj0(ak0 ak0Var, byte b) {
        this.a = b;
        this.b = ak0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    @Override // fq7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j1(Object obj) {
        kj7 kj7Var;
        byte b = this.a;
        ak0 ak0Var = this.b;
        switch (b) {
            case 0:
                pj0 pj0Var = (pj0) obj;
                if (pj0Var != null) {
                    int i = pj0Var.a;
                    CharSequence charSequence = pj0Var.b;
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
                    Context n = ak0Var.n();
                    int i2 = Build.VERSION.SDK_INT;
                    int i3 = 0;
                    if (i2 < 29 && ((i == 7 || i == 9) && n != null)) {
                        KeyguardManager a = ox5.a(n);
                        if ((a == null ? false : ox5.b(a)) && zod.b(ak0Var.m0.c())) {
                            ak0Var.T();
                            lk0 lk0Var = ak0Var.m0;
                            kj7Var = lk0Var.q;
                            if (kj7Var == null) {
                                kj7Var = new kj7();
                                lk0Var.q = kj7Var;
                            }
                            lk0.f(kj7Var, null);
                            break;
                        }
                    }
                    if (ak0Var.S()) {
                        if (charSequence == null) {
                            charSequence = qhe.a(ak0Var.n(), i);
                        }
                        lk0 lk0Var2 = ak0Var.m0;
                        if (i == 5) {
                            byte b2 = lk0Var2.j;
                            if (b2 == 0 || b2 == 3) {
                                ak0Var.V(i, charSequence);
                            }
                            ak0Var.P();
                        } else {
                            if (lk0Var2.u) {
                                ak0Var.U(i, charSequence);
                            } else {
                                ak0Var.X(charSequence);
                                Handler handler = ak0Var.l0;
                                qj0 qj0Var = new qj0(ak0Var, i, charSequence, (byte) 1);
                                Context n2 = ak0Var.n();
                                if (n2 != null) {
                                    String str = Build.MODEL;
                                    if (i2 == 28 && str != null) {
                                        for (String str2 : n2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                            if (str.startsWith(str2)) {
                                                handler.postDelayed(qj0Var, i3);
                                            }
                                        }
                                    }
                                }
                                i3 = 2000;
                                handler.postDelayed(qj0Var, i3);
                            }
                            ak0Var.m0.u = true;
                        }
                    } else {
                        if (charSequence == null) {
                            charSequence = ak0Var.q(R.string.default_error_msg) + " " + i;
                        }
                        ak0Var.U(i, charSequence);
                    }
                    lk0 lk0Var3 = ak0Var.m0;
                    kj7Var = lk0Var3.q;
                    if (kj7Var == null) {
                    }
                    lk0.f(kj7Var, null);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    ak0Var.O(1);
                    ak0Var.P();
                    lk0 lk0Var4 = ak0Var.m0;
                    kj7 kj7Var2 = lk0Var4.v;
                    if (kj7Var2 == null) {
                        kj7Var2 = new kj7();
                        lk0Var4.v = kj7Var2;
                    }
                    lk0.f(kj7Var2, Boolean.FALSE);
                    break;
                }
                break;
        }
    }
}
