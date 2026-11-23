package org.telegram.ui.web;

import bi.l2;
import fi.f7;
import java.io.File;
import org.telegram.messenger.y10;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements y10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v(v0 v0Var, f7 f7Var, String str, ki.k1 k1Var, String str2) {
        this.b = v0Var;
        this.e = f7Var;
        this.c = str;
        this.f = k1Var;
        this.d = str2;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                f7 f7Var = (f7) this.e;
                ki.k1 k1Var = (ki.k1) this.f;
                String str = this.d;
                String str2 = (String) obj;
                v0 v0Var = this.b;
                String str3 = this.c;
                if (str2 == null) {
                    v0Var.x(f7Var, "secure_storage_failed", v0.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    break;
                } else {
                    try {
                        k1Var.j(str2);
                        v0Var.x(f7Var, "secure_storage_key_restored", v0.B("req_id", str3, "value", (String) k1Var.f(str).first));
                        break;
                    } catch (Exception e10) {
                        v0Var.x(f7Var, "secure_storage_failed", v0.B("req_id", str3, "error", e10.getMessage()));
                        return;
                    }
                }
            default:
                v0 v0Var2 = this.b;
                org.telegram.messenger.g0.g3(new l2(v0Var2, (File) obj, (org.telegram.ui.ActionBar.t1) this.e, this.c, this.d, (String) this.f, 29, false));
                break;
        }
    }

    public /* synthetic */ v(v0 v0Var, org.telegram.ui.ActionBar.t1 t1Var, String str, String str2, String str3) {
        this.b = v0Var;
        this.e = t1Var;
        this.c = str;
        this.d = str2;
        this.f = str3;
    }
}
