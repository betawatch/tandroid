package org.telegram.ui.web;

import android.webkit.PermissionRequest;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ PermissionRequest c;
    public final /* synthetic */ String d;

    public /* synthetic */ l0(s0 s0Var, PermissionRequest permissionRequest, String str, int i9) {
        this.a = i9;
        this.b = s0Var;
        this.c = permissionRequest;
        this.d = str;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                s0 s0Var = this.b;
                if (s0Var.a != null) {
                    s0Var.a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.c;
                    if (!booleanValue) {
                        permissionRequest.deny();
                        break;
                    } else {
                        y0.a(s0Var.e.M, new String[]{"android.permission.RECORD_AUDIO"}, new l0(s0Var, permissionRequest, this.d, 2));
                        break;
                    }
                }
                break;
            case 1:
                s0 s0Var2 = this.b;
                if (s0Var2.a != null) {
                    s0Var2.a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.c;
                    if (!booleanValue2) {
                        permissionRequest2.deny();
                        break;
                    } else {
                        y0.a(s0Var2.e.M, new String[]{"android.permission.CAMERA"}, new l0(s0Var2, permissionRequest2, this.d, 3));
                        break;
                    }
                }
                break;
            case 2:
                s0 s0Var3 = this.b;
                s0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.c;
                if (!booleanValue3) {
                    permissionRequest3.deny();
                    break;
                } else {
                    permissionRequest3.grant(new String[]{this.d});
                    s0Var3.e.M.P = true;
                    break;
                }
            default:
                s0 s0Var4 = this.b;
                s0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.c;
                if (!booleanValue4) {
                    permissionRequest4.deny();
                    break;
                } else {
                    permissionRequest4.grant(new String[]{this.d});
                    s0Var4.e.M.P = true;
                    break;
                }
        }
    }
}
