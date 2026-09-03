package org.telegram.ui.web;

import java.io.File;
import nh.j7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a0(c1 c1Var, j7 j7Var, String str, rh.i1 i1Var, String str2) {
        this.b = c1Var;
        this.e = j7Var;
        this.c = str;
        this.f = i1Var;
        this.d = str2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                j7 j7Var = (j7) this.e;
                rh.i1 i1Var = (rh.i1) this.f;
                String str = this.d;
                String str2 = (String) obj;
                c1 c1Var = this.b;
                String str3 = this.c;
                if (str2 == null) {
                    c1Var.z(j7Var, "secure_storage_failed", c1.C("req_id", str3, "error", "RESTORE_CANCELLED"));
                    break;
                } else {
                    try {
                        i1Var.j(str2);
                        c1Var.z(j7Var, "secure_storage_key_restored", c1.C("req_id", str3, "value", (String) i1Var.f(str).first));
                        break;
                    } catch (Exception e) {
                        c1Var.z(j7Var, "secure_storage_failed", c1.C("req_id", str3, "error", e.getMessage()));
                        return;
                    }
                }
            default:
                c1 c1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new kh.e1(c1Var2, (File) obj, (org.telegram.ui.ActionBar.d2) this.e, this.c, this.d, (String) this.f, 19, false));
                break;
        }
    }

    public /* synthetic */ a0(c1 c1Var, org.telegram.ui.ActionBar.d2 d2Var, String str, String str2, String str3) {
        this.b = c1Var;
        this.e = d2Var;
        this.c = str;
        this.d = str2;
        this.f = str3;
    }
}
