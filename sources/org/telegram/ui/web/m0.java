package org.telegram.ui.web;

import android.webkit.PermissionRequest;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ PermissionRequest c;
    public final /* synthetic */ String d;

    public /* synthetic */ m0(u0 u0Var, PermissionRequest permissionRequest, String str, int i10) {
        this.a = i10;
        this.b = u0Var;
        this.c = permissionRequest;
        this.d = str;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                if (u0Var.a != null) {
                    u0Var.a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.c;
                    if (!booleanValue) {
                        permissionRequest.deny();
                        break;
                    } else {
                        a1.a(u0Var.e.N, new String[]{"android.permission.RECORD_AUDIO"}, new m0(u0Var, permissionRequest, this.d, 2));
                        break;
                    }
                }
                break;
            case 1:
                u0 u0Var2 = this.b;
                if (u0Var2.a != null) {
                    u0Var2.a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.c;
                    if (!booleanValue2) {
                        permissionRequest2.deny();
                        break;
                    } else {
                        a1.a(u0Var2.e.N, new String[]{"android.permission.CAMERA"}, new m0(u0Var2, permissionRequest2, this.d, 3));
                        break;
                    }
                }
                break;
            case 2:
                u0 u0Var3 = this.b;
                u0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.c;
                if (!booleanValue3) {
                    permissionRequest3.deny();
                    break;
                } else {
                    permissionRequest3.grant(new String[]{this.d});
                    u0Var3.e.N.Q = true;
                    break;
                }
            default:
                u0 u0Var4 = this.b;
                u0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.c;
                if (!booleanValue4) {
                    permissionRequest4.deny();
                    break;
                } else {
                    permissionRequest4.grant(new String[]{this.d});
                    u0Var4.e.N.Q = true;
                    break;
                }
        }
    }
}
