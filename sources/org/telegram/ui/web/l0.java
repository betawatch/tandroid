package org.telegram.ui.web;

import android.webkit.PermissionRequest;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;
    public final /* synthetic */ PermissionRequest c;
    public final /* synthetic */ String d;

    public /* synthetic */ l0(t0 t0Var, PermissionRequest permissionRequest, String str, int i10) {
        this.a = i10;
        this.b = t0Var;
        this.c = permissionRequest;
        this.d = str;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                t0 t0Var = this.b;
                if (t0Var.a != null) {
                    t0Var.a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.c;
                    if (!booleanValue) {
                        permissionRequest.deny();
                        break;
                    } else {
                        a1.a(t0Var.e.N, new String[]{"android.permission.RECORD_AUDIO"}, new l0(t0Var, permissionRequest, this.d, 2));
                        break;
                    }
                }
                break;
            case 1:
                t0 t0Var2 = this.b;
                if (t0Var2.a != null) {
                    t0Var2.a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.c;
                    if (!booleanValue2) {
                        permissionRequest2.deny();
                        break;
                    } else {
                        a1.a(t0Var2.e.N, new String[]{"android.permission.CAMERA"}, new l0(t0Var2, permissionRequest2, this.d, 3));
                        break;
                    }
                }
                break;
            case 2:
                t0 t0Var3 = this.b;
                t0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.c;
                if (!booleanValue3) {
                    permissionRequest3.deny();
                    break;
                } else {
                    permissionRequest3.grant(new String[]{this.d});
                    t0Var3.e.N.Q = true;
                    break;
                }
            default:
                t0 t0Var4 = this.b;
                t0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.c;
                if (!booleanValue4) {
                    permissionRequest4.deny();
                    break;
                } else {
                    permissionRequest4.grant(new String[]{this.d});
                    t0Var4.e.N.Q = true;
                    break;
                }
        }
    }
}
