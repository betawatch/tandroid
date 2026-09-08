package org.telegram.ui.web;

import bi.h8;
import bi.k9;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ d1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b0(d1 d1Var, k9 k9Var, String str, fi.t1 t1Var, String str2) {
        this.b = d1Var;
        this.e = k9Var;
        this.c = str;
        this.f = t1Var;
        this.d = str2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                k9 k9Var = (k9) this.e;
                fi.t1 t1Var = (fi.t1) this.f;
                String str = this.d;
                String str2 = (String) obj;
                d1 d1Var = this.b;
                String str3 = this.c;
                if (str2 == null) {
                    d1Var.y(k9Var, "secure_storage_failed", d1.C("req_id", str3, "error", "RESTORE_CANCELLED"));
                    break;
                } else {
                    try {
                        t1Var.j(str2);
                        d1Var.y(k9Var, "secure_storage_key_restored", d1.C("req_id", str3, "value", (String) t1Var.f(str).first));
                        break;
                    } catch (Exception e7) {
                        d1Var.y(k9Var, "secure_storage_failed", d1.C("req_id", str3, "error", e7.getMessage()));
                        return;
                    }
                }
            default:
                d1 d1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new h8(d1Var2, (File) obj, (org.telegram.ui.ActionBar.b2) this.e, this.c, this.d, (String) this.f, 14));
                break;
        }
    }

    public /* synthetic */ b0(d1 d1Var, org.telegram.ui.ActionBar.b2 b2Var, String str, String str2, String str3) {
        this.b = d1Var;
        this.e = b2Var;
        this.c = str;
        this.d = str2;
        this.f = str3;
    }
}
