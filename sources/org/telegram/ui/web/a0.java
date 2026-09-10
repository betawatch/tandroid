package org.telegram.ui.web;

import bi.te;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a0(c1 c1Var, org.telegram.ui.ActionBar.d2 d2Var, String str, String str2, String str3) {
        this.b = c1Var;
        this.e = d2Var;
        this.c = str;
        this.d = str2;
        this.f = str3;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                a1 a1Var = (a1) this.e;
                di.w1 w1Var = (di.w1) this.f;
                String str = this.d;
                String str2 = (String) obj;
                c1 c1Var = this.b;
                String str3 = this.c;
                if (str2 == null) {
                    c1Var.z(a1Var, "secure_storage_failed", c1.C("req_id", str3, "error", "RESTORE_CANCELLED"));
                    break;
                } else {
                    try {
                        w1Var.j(str2);
                        c1Var.z(a1Var, "secure_storage_key_restored", c1.C("req_id", str3, "value", (String) w1Var.f(str).first));
                        break;
                    } catch (Exception e) {
                        c1Var.z(a1Var, "secure_storage_failed", c1.C("req_id", str3, "error", e.getMessage()));
                        return;
                    }
                }
            default:
                c1 c1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new te(c1Var2, (File) obj, (org.telegram.ui.ActionBar.d2) this.e, this.c, this.d, (String) this.f, 13));
                break;
        }
    }

    public /* synthetic */ a0(c1 c1Var, a1 a1Var, String str, di.w1 w1Var, String str2) {
        this.b = c1Var;
        this.e = a1Var;
        this.c = str;
        this.f = w1Var;
        this.d = str2;
    }
}
