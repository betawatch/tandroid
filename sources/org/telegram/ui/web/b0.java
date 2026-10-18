package org.telegram.ui.web;

import ai.j3;
import ci.y7;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ b1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b0(b1 b1Var, y7 y7Var, String str, gi.p1 p1Var, String str2) {
        this.b = b1Var;
        this.e = y7Var;
        this.c = str;
        this.f = p1Var;
        this.d = str2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                y7 y7Var = (y7) this.e;
                gi.p1 p1Var = (gi.p1) this.f;
                String str = this.d;
                String str2 = (String) obj;
                b1 b1Var = this.b;
                String str3 = this.c;
                if (str2 == null) {
                    b1Var.x(y7Var, "secure_storage_failed", b1.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    break;
                } else {
                    try {
                        p1Var.j(str2);
                        b1Var.x(y7Var, "secure_storage_key_restored", b1.B("req_id", str3, "value", (String) p1Var.f(str).first));
                        break;
                    } catch (Exception e) {
                        b1Var.x(y7Var, "secure_storage_failed", b1.B("req_id", str3, "error", e.getMessage()));
                        return;
                    }
                }
            default:
                b1 b1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new j3(b1Var2, (File) obj, (org.telegram.ui.ActionBar.b2) this.e, this.c, this.d, (String) this.f, 26));
                break;
        }
    }

    public /* synthetic */ b0(b1 b1Var, org.telegram.ui.ActionBar.b2 b2Var, String str, String str2, String str3) {
        this.b = b1Var;
        this.e = b2Var;
        this.c = str;
        this.d = str2;
        this.f = str3;
    }
}
