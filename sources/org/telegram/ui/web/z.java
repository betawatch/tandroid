package org.telegram.ui.web;

import ai.da;
import ai.z8;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ b1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z(b1 b1Var, da daVar, String str, ei.t1 t1Var, String str2) {
        this.b = b1Var;
        this.e = daVar;
        this.c = str;
        this.f = t1Var;
        this.d = str2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                da daVar = (da) this.e;
                ei.t1 t1Var = (ei.t1) this.f;
                String str = this.d;
                String str2 = (String) obj;
                b1 b1Var = this.b;
                String str3 = this.c;
                if (str2 == null) {
                    b1Var.y(daVar, "secure_storage_failed", b1.C("req_id", str3, "error", "RESTORE_CANCELLED"));
                    break;
                } else {
                    try {
                        t1Var.j(str2);
                        b1Var.y(daVar, "secure_storage_key_restored", b1.C("req_id", str3, "value", (String) t1Var.f(str).first));
                        break;
                    } catch (Exception e) {
                        b1Var.y(daVar, "secure_storage_failed", b1.C("req_id", str3, "error", e.getMessage()));
                        return;
                    }
                }
            default:
                b1 b1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new z8(b1Var2, (File) obj, (org.telegram.ui.ActionBar.b2) this.e, this.c, this.d, (String) this.f, 14));
                break;
        }
    }

    public /* synthetic */ z(b1 b1Var, org.telegram.ui.ActionBar.b2 b2Var, String str, String str2, String str3) {
        this.b = b1Var;
        this.e = b2Var;
        this.c = str;
        this.d = str2;
        this.f = str3;
    }
}
