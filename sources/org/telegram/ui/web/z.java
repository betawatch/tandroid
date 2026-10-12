package org.telegram.ui.web;

import bi.k8;
import bi.n9;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ b1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z(b1 b1Var, n9 n9Var, String str, fi.s1 s1Var, String str2) {
        this.b = b1Var;
        this.e = n9Var;
        this.c = str;
        this.f = s1Var;
        this.d = str2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                n9 n9Var = (n9) this.e;
                fi.s1 s1Var = (fi.s1) this.f;
                String str = this.d;
                String str2 = (String) obj;
                b1 b1Var = this.b;
                String str3 = this.c;
                if (str2 == null) {
                    b1Var.x(n9Var, "secure_storage_failed", b1.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    break;
                } else {
                    try {
                        s1Var.j(str2);
                        b1Var.x(n9Var, "secure_storage_key_restored", b1.B("req_id", str3, "value", (String) s1Var.f(str).first));
                        break;
                    } catch (Exception e) {
                        b1Var.x(n9Var, "secure_storage_failed", b1.B("req_id", str3, "error", e.getMessage()));
                        return;
                    }
                }
            default:
                b1 b1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new k8(b1Var2, (File) obj, (org.telegram.ui.ActionBar.a2) this.e, this.c, this.d, (String) this.f, 19));
                break;
        }
    }

    public /* synthetic */ z(b1 b1Var, org.telegram.ui.ActionBar.a2 a2Var, String str, String str2, String str3) {
        this.b = b1Var;
        this.e = a2Var;
        this.c = str;
        this.d = str2;
        this.f = str3;
    }
}
