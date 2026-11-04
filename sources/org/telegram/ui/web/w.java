package org.telegram.ui.web;

import ei.p7;
import java.io.File;
import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements u10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ w0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w(w0 w0Var, p7 p7Var, String str, ii.n1 n1Var, String str2) {
        this.b = w0Var;
        this.e = p7Var;
        this.c = str;
        this.f = n1Var;
        this.d = str2;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                p7 p7Var = (p7) this.e;
                ii.n1 n1Var = (ii.n1) this.f;
                String str = this.d;
                String str2 = (String) obj;
                w0 w0Var = this.b;
                String str3 = this.c;
                if (str2 == null) {
                    w0Var.x(p7Var, "secure_storage_failed", w0.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    break;
                } else {
                    try {
                        n1Var.j(str2);
                        w0Var.x(p7Var, "secure_storage_key_restored", w0.B("req_id", str3, "value", (String) n1Var.f(str).first));
                        break;
                    } catch (Exception e10) {
                        w0Var.x(p7Var, "secure_storage_failed", w0.B("req_id", str3, "error", e10.getMessage()));
                        return;
                    }
                }
            default:
                w0 w0Var2 = this.b;
                org.telegram.messenger.g0.h3(new ai.w1(w0Var2, (File) obj, (org.telegram.ui.ActionBar.s1) this.e, this.c, this.d, (String) this.f, 27, false));
                break;
        }
    }

    public /* synthetic */ w(w0 w0Var, org.telegram.ui.ActionBar.s1 s1Var, String str, String str2, String str3) {
        this.b = w0Var;
        this.e = s1Var;
        this.c = str;
        this.d = str2;
        this.f = str3;
    }
}
