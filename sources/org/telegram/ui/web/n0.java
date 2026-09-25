package org.telegram.ui.web;

import android.webkit.PermissionRequest;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ PermissionRequest c;
    public final /* synthetic */ String d;

    public /* synthetic */ n0(v0 v0Var, PermissionRequest permissionRequest, String str, int i10) {
        this.a = i10;
        this.b = v0Var;
        this.c = permissionRequest;
        this.d = str;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                v0 v0Var = this.b;
                if (v0Var.a != null) {
                    v0Var.a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.c;
                    if (!booleanValue) {
                        permissionRequest.deny();
                        break;
                    } else {
                        b1.a(v0Var.e.Q, new String[]{"android.permission.RECORD_AUDIO"}, new n0(v0Var, permissionRequest, this.d, 2));
                        break;
                    }
                }
                break;
            case 1:
                v0 v0Var2 = this.b;
                if (v0Var2.a != null) {
                    v0Var2.a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.c;
                    if (!booleanValue2) {
                        permissionRequest2.deny();
                        break;
                    } else {
                        b1.a(v0Var2.e.Q, new String[]{"android.permission.CAMERA"}, new n0(v0Var2, permissionRequest2, this.d, 3));
                        break;
                    }
                }
                break;
            case 2:
                v0 v0Var3 = this.b;
                v0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.c;
                if (!booleanValue3) {
                    permissionRequest3.deny();
                    break;
                } else {
                    permissionRequest3.grant(new String[]{this.d});
                    v0Var3.e.Q.T = true;
                    break;
                }
            default:
                v0 v0Var4 = this.b;
                v0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.c;
                if (!booleanValue4) {
                    permissionRequest4.deny();
                    break;
                } else {
                    permissionRequest4.grant(new String[]{this.d});
                    v0Var4.e.Q.T = true;
                    break;
                }
        }
    }
}
