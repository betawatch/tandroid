package org.telegram.ui.web;

import android.webkit.PermissionRequest;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;
    public final /* synthetic */ PermissionRequest c;
    public final /* synthetic */ String d;

    public /* synthetic */ k0(q0 q0Var, PermissionRequest permissionRequest, String str, int i3) {
        this.a = i3;
        this.b = q0Var;
        this.c = permissionRequest;
        this.d = str;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                q0 q0Var = this.b;
                if (q0Var.a != null) {
                    q0Var.a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.c;
                    if (!booleanValue) {
                        permissionRequest.deny();
                        break;
                    } else {
                        w0.a(q0Var.e.R, new String[]{"android.permission.RECORD_AUDIO"}, new k0(q0Var, permissionRequest, this.d, 2));
                        break;
                    }
                }
                break;
            case 1:
                q0 q0Var2 = this.b;
                if (q0Var2.a != null) {
                    q0Var2.a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.c;
                    if (!booleanValue2) {
                        permissionRequest2.deny();
                        break;
                    } else {
                        w0.a(q0Var2.e.R, new String[]{"android.permission.CAMERA"}, new k0(q0Var2, permissionRequest2, this.d, 3));
                        break;
                    }
                }
                break;
            case 2:
                q0 q0Var3 = this.b;
                q0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.c;
                if (!booleanValue3) {
                    permissionRequest3.deny();
                    break;
                } else {
                    permissionRequest3.grant(new String[]{this.d});
                    q0Var3.e.R.U = true;
                    break;
                }
            default:
                q0 q0Var4 = this.b;
                q0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.c;
                if (!booleanValue4) {
                    permissionRequest4.deny();
                    break;
                } else {
                    permissionRequest4.grant(new String[]{this.d});
                    q0Var4.e.R.U = true;
                    break;
                }
        }
    }
}
