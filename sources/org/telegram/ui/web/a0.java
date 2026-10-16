package org.telegram.ui.web;

import bi.k8;
import bi.n9;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a0(c1 c1Var, n9 n9Var, String str, fi.s1 s1Var, String str2) {
        this.b = c1Var;
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
                c1 c1Var = this.b;
                String str3 = this.c;
                if (str2 == null) {
                    c1Var.x(n9Var, "secure_storage_failed", c1.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    break;
                } else {
                    try {
                        s1Var.j(str2);
                        c1Var.x(n9Var, "secure_storage_key_restored", c1.B("req_id", str3, "value", (String) s1Var.f(str).first));
                        break;
                    } catch (Exception e) {
                        c1Var.x(n9Var, "secure_storage_failed", c1.B("req_id", str3, "error", e.getMessage()));
                        return;
                    }
                }
            default:
                c1 c1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new k8(c1Var2, (File) obj, (org.telegram.ui.ActionBar.a2) this.e, this.c, this.d, (String) this.f, 19));
                break;
        }
    }

    public /* synthetic */ a0(c1 c1Var, org.telegram.ui.ActionBar.a2 a2Var, String str, String str2, String str3) {
        this.b = c1Var;
        this.e = a2Var;
        this.c = str;
        this.d = str2;
        this.f = str3;
    }
}
