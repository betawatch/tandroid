package org.telegram.ui.web;

import bi.a3;
import di.o7;
import java.io.File;
import org.telegram.messenger.c20;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements c20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ x0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u(x0 x0Var, o7 o7Var, String str, hi.m1 m1Var, String str2) {
        this.b = x0Var;
        this.e = o7Var;
        this.c = str;
        this.f = m1Var;
        this.d = str2;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                o7 o7Var = (o7) this.e;
                hi.m1 m1Var = (hi.m1) this.f;
                String str = this.d;
                String str2 = (String) obj;
                x0 x0Var = this.b;
                String str3 = this.c;
                if (str2 == null) {
                    x0Var.x(o7Var, "secure_storage_failed", x0.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    break;
                } else {
                    try {
                        m1Var.j(str2);
                        x0Var.x(o7Var, "secure_storage_key_restored", x0.B("req_id", str3, "value", (String) m1Var.f(str).first));
                        break;
                    } catch (Exception e10) {
                        x0Var.x(o7Var, "secure_storage_failed", x0.B("req_id", str3, "error", e10.getMessage()));
                        return;
                    }
                }
            default:
                x0 x0Var2 = this.b;
                org.telegram.messenger.g0.h3(new a3(x0Var2, (File) obj, (org.telegram.ui.ActionBar.u1) this.e, this.c, this.d, (String) this.f, 26));
                break;
        }
    }

    public /* synthetic */ u(x0 x0Var, org.telegram.ui.ActionBar.u1 u1Var, String str, String str2, String str3) {
        this.b = x0Var;
        this.e = u1Var;
        this.c = str;
        this.d = str2;
        this.f = str3;
    }
}
