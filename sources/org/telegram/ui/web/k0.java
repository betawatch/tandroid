package org.telegram.ui.web;

import android.webkit.PermissionRequest;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ PermissionRequest c;
    public final /* synthetic */ String d;

    public /* synthetic */ k0(r0 r0Var, PermissionRequest permissionRequest, String str, int i7) {
        this.a = i7;
        this.b = r0Var;
        this.c = permissionRequest;
        this.d = str;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                r0 r0Var = this.b;
                if (r0Var.a != null) {
                    r0Var.a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.c;
                    if (!booleanValue) {
                        permissionRequest.deny();
                        break;
                    } else {
                        x0.a(r0Var.e.Q, new String[]{"android.permission.RECORD_AUDIO"}, new k0(r0Var, permissionRequest, this.d, 2));
                        break;
                    }
                }
                break;
            case 1:
                r0 r0Var2 = this.b;
                if (r0Var2.a != null) {
                    r0Var2.a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.c;
                    if (!booleanValue2) {
                        permissionRequest2.deny();
                        break;
                    } else {
                        x0.a(r0Var2.e.Q, new String[]{"android.permission.CAMERA"}, new k0(r0Var2, permissionRequest2, this.d, 3));
                        break;
                    }
                }
                break;
            case 2:
                r0 r0Var3 = this.b;
                r0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.c;
                if (!booleanValue3) {
                    permissionRequest3.deny();
                    break;
                } else {
                    permissionRequest3.grant(new String[]{this.d});
                    r0Var3.e.Q.T = true;
                    break;
                }
            default:
                r0 r0Var4 = this.b;
                r0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.c;
                if (!booleanValue4) {
                    permissionRequest4.deny();
                    break;
                } else {
                    permissionRequest4.grant(new String[]{this.d});
                    r0Var4.e.Q.T = true;
                    break;
                }
        }
    }
}
