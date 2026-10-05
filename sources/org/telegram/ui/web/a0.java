package org.telegram.ui.web;

import ai.da;
import ai.z8;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a0(c1 c1Var, da daVar, String str, ei.u1 u1Var, String str2) {
        this.b = c1Var;
        this.e = daVar;
        this.c = str;
        this.f = u1Var;
        this.d = str2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                da daVar = (da) this.e;
                ei.u1 u1Var = (ei.u1) this.f;
                String str = this.d;
                String str2 = (String) obj;
                c1 c1Var = this.b;
                String str3 = this.c;
                if (str2 == null) {
                    c1Var.y(daVar, "secure_storage_failed", c1.C("req_id", str3, "error", "RESTORE_CANCELLED"));
                    break;
                } else {
                    try {
                        u1Var.j(str2);
                        c1Var.y(daVar, "secure_storage_key_restored", c1.C("req_id", str3, "value", (String) u1Var.f(str).first));
                        break;
                    } catch (Exception e7) {
                        c1Var.y(daVar, "secure_storage_failed", c1.C("req_id", str3, "error", e7.getMessage()));
                        return;
                    }
                }
            default:
                c1 c1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new z8(c1Var2, (File) obj, (org.telegram.ui.ActionBar.b2) this.e, this.c, this.d, (String) this.f, 14));
                break;
        }
    }

    public /* synthetic */ a0(c1 c1Var, org.telegram.ui.ActionBar.b2 b2Var, String str, String str2, String str3) {
        this.b = c1Var;
        this.e = b2Var;
        this.c = str;
        this.d = str2;
        this.f = str3;
    }
}
