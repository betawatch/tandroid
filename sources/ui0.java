// default package

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ui0 implements cr7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bj0 b;

    public /* synthetic */ ui0(bj0 bj0Var, byte b) {
        this.a = b;
        this.b = bj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    @Override // cr7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S0(Object obj) {
        qj7 qj7Var;
        byte b = this.a;
        bj0 bj0Var = this.b;
        switch (b) {
            case 0:
                qi0 qi0Var = (qi0) obj;
                if (qi0Var != null) {
                    int i = qi0Var.a;
                    CharSequence charSequence = qi0Var.b;
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
                    Context n = bj0Var.n();
                    int i2 = Build.VERSION.SDK_INT;
                    int i3 = 0;
                    if (i2 < 29 && ((i == 7 || i == 9) && n != null)) {
                        KeyguardManager a = tx5.a(n);
                        if ((a == null ? false : tx5.b(a)) && nrd.b(bj0Var.m0.c())) {
                            bj0Var.T();
                            mj0 mj0Var = bj0Var.m0;
                            qj7Var = mj0Var.q;
                            if (qj7Var == null) {
                                qj7Var = new qj7();
                                mj0Var.q = qj7Var;
                            }
                            mj0.f(qj7Var, null);
                            break;
                        }
                    }
                    if (bj0Var.S()) {
                        if (charSequence == null) {
                            charSequence = gke.a(bj0Var.n(), i);
                        }
                        mj0 mj0Var2 = bj0Var.m0;
                        if (i == 5) {
                            byte b2 = mj0Var2.j;
                            if (b2 == 0 || b2 == 3) {
                                bj0Var.V(i, charSequence);
                            }
                            bj0Var.P();
                        } else {
                            if (mj0Var2.u) {
                                bj0Var.U(i, charSequence);
                            } else {
                                bj0Var.X(charSequence);
                                Handler handler = bj0Var.l0;
                                ri0 ri0Var = new ri0(bj0Var, i, charSequence, (byte) 1);
                                Context n2 = bj0Var.n();
                                if (n2 != null) {
                                    String str = Build.MODEL;
                                    if (i2 == 28 && str != null) {
                                        for (String str2 : n2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                            if (str.startsWith(str2)) {
                                                handler.postDelayed(ri0Var, i3);
                                            }
                                        }
                                    }
                                }
                                i3 = 2000;
                                handler.postDelayed(ri0Var, i3);
                            }
                            bj0Var.m0.u = true;
                        }
                    } else {
                        if (charSequence == null) {
                            charSequence = bj0Var.q(R.string.default_error_msg) + " " + i;
                        }
                        bj0Var.U(i, charSequence);
                    }
                    mj0 mj0Var3 = bj0Var.m0;
                    qj7Var = mj0Var3.q;
                    if (qj7Var == null) {
                    }
                    mj0.f(qj7Var, null);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    bj0Var.O(1);
                    bj0Var.P();
                    mj0 mj0Var4 = bj0Var.m0;
                    qj7 qj7Var2 = mj0Var4.v;
                    if (qj7Var2 == null) {
                        qj7Var2 = new qj7();
                        mj0Var4.v = qj7Var2;
                    }
                    mj0.f(qj7Var2, Boolean.FALSE);
                    break;
                }
                break;
        }
    }
}
