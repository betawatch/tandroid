package org.telegram.ui.web;

import java.io.File;
import org.telegram.messenger.q20;
import org.telegram.ui.v8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements q20 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ z0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v(z0 z0Var, org.telegram.ui.ActionBar.x1 x1Var, String str, String str2, String str3) {
        this.b = z0Var;
        this.e = x1Var;
        this.c = str;
        this.d = str2;
        this.f = str3;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                x0 x0Var = (x0) this.e;
                xh.g1 g1Var = (xh.g1) this.f;
                String str = this.d;
                String str2 = (String) obj;
                z0 z0Var = this.b;
                String str3 = this.c;
                if (str2 == null) {
                    z0Var.y(x0Var, "secure_storage_failed", z0.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    break;
                } else {
                    try {
                        g1Var.j(str2);
                        z0Var.y(x0Var, "secure_storage_key_restored", z0.B("req_id", str3, "value", (String) g1Var.f(str).first));
                        break;
                    } catch (Exception e) {
                        z0Var.y(x0Var, "secure_storage_failed", z0.B("req_id", str3, "error", e.getMessage()));
                        return;
                    }
                }
            default:
                z0 z0Var2 = this.b;
                org.telegram.messenger.i0.g3(new v8(z0Var2, (File) obj, (org.telegram.ui.ActionBar.x1) this.e, this.c, this.d, (String) this.f, 16));
                break;
        }
    }

    public /* synthetic */ v(z0 z0Var, x0 x0Var, String str, xh.g1 g1Var, String str2) {
        this.b = z0Var;
        this.e = x0Var;
        this.c = str;
        this.f = g1Var;
        this.d = str2;
    }
}
