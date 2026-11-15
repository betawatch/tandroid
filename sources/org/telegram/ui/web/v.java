package org.telegram.ui.web;

import fi.i7;
import java.io.File;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements z10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v(v0 v0Var, i7 i7Var, String str, ki.n1 n1Var, String str2) {
        this.b = v0Var;
        this.e = i7Var;
        this.c = str;
        this.f = n1Var;
        this.d = str2;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                i7 i7Var = (i7) this.e;
                ki.n1 n1Var = (ki.n1) this.f;
                String str = this.d;
                String str2 = (String) obj;
                v0 v0Var = this.b;
                String str3 = this.c;
                if (str2 == null) {
                    v0Var.x(i7Var, "secure_storage_failed", v0.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    break;
                } else {
                    try {
                        n1Var.j(str2);
                        v0Var.x(i7Var, "secure_storage_key_restored", v0.B("req_id", str3, "value", (String) n1Var.f(str).first));
                        break;
                    } catch (Exception e10) {
                        v0Var.x(i7Var, "secure_storage_failed", v0.B("req_id", str3, "error", e10.getMessage()));
                        return;
                    }
                }
            default:
                v0 v0Var2 = this.b;
                org.telegram.messenger.g0.h3(new bi.p1(v0Var2, (File) obj, (org.telegram.ui.ActionBar.t1) this.e, this.c, this.d, (String) this.f, 28, false));
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
