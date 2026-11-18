package org.telegram.ui.web;

import bi.h2;
import fi.f7;
import java.io.File;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements x10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v(v0 v0Var, f7 f7Var, String str, ki.l1 l1Var, String str2) {
        this.b = v0Var;
        this.e = f7Var;
        this.c = str;
        this.f = l1Var;
        this.d = str2;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                f7 f7Var = (f7) this.e;
                ki.l1 l1Var = (ki.l1) this.f;
                String str = this.d;
                String str2 = (String) obj;
                v0 v0Var = this.b;
                String str3 = this.c;
                if (str2 == null) {
                    v0Var.x(f7Var, "secure_storage_failed", v0.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    break;
                } else {
                    try {
                        l1Var.j(str2);
                        v0Var.x(f7Var, "secure_storage_key_restored", v0.B("req_id", str3, "value", (String) l1Var.f(str).first));
                        break;
                    } catch (Exception e10) {
                        v0Var.x(f7Var, "secure_storage_failed", v0.B("req_id", str3, "error", e10.getMessage()));
                        return;
                    }
                }
            default:
                v0 v0Var2 = this.b;
                org.telegram.messenger.g0.g3(new h2(v0Var2, (File) obj, (org.telegram.ui.ActionBar.u1) this.e, this.c, this.d, (String) this.f, 29, false));
                break;
        }
    }

    public /* synthetic */ v(v0 v0Var, org.telegram.ui.ActionBar.u1 u1Var, String str, String str2, String str3) {
        this.b = v0Var;
        this.e = u1Var;
        this.c = str;
        this.d = str2;
        this.f = str3;
    }
}
