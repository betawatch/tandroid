package org.telegram.ui.web;

import ai.g3;
import ci.z7;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ a1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a0(a1 a1Var, z7 z7Var, String str, gi.p1 p1Var, String str2) {
        this.b = a1Var;
        this.e = z7Var;
        this.c = str;
        this.f = p1Var;
        this.d = str2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                z7 z7Var = (z7) this.e;
                gi.p1 p1Var = (gi.p1) this.f;
                String str = this.d;
                String str2 = (String) obj;
                a1 a1Var = this.b;
                String str3 = this.c;
                if (str2 == null) {
                    a1Var.x(z7Var, "secure_storage_failed", a1.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    break;
                } else {
                    try {
                        p1Var.j(str2);
                        a1Var.x(z7Var, "secure_storage_key_restored", a1.B("req_id", str3, "value", (String) p1Var.f(str).first));
                        break;
                    } catch (Exception e) {
                        a1Var.x(z7Var, "secure_storage_failed", a1.B("req_id", str3, "error", e.getMessage()));
                        return;
                    }
                }
            default:
                a1 a1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new g3(a1Var2, (File) obj, (org.telegram.ui.ActionBar.b2) this.e, this.c, this.d, (String) this.f, 26));
                break;
        }
    }

    public /* synthetic */ a0(a1 a1Var, org.telegram.ui.ActionBar.b2 b2Var, String str, String str2, String str3) {
        this.b = a1Var;
        this.e = b2Var;
        this.c = str;
        this.d = str2;
        this.f = str3;
    }
}
