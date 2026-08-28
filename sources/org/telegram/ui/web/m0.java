package org.telegram.ui.web;

import android.webkit.PermissionRequest;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ PermissionRequest c;
    public final /* synthetic */ String[] d;

    public /* synthetic */ m0(s0 s0Var, PermissionRequest permissionRequest, String[] strArr, int i9) {
        this.a = i9;
        this.b = s0Var;
        this.c = permissionRequest;
        this.d = strArr;
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
                        y0.a(s0Var.e.M, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new m0(s0Var, permissionRequest, this.d, 1));
                        break;
                    }
                }
                break;
            default:
                s0 s0Var2 = this.b;
                s0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.c;
                if (!booleanValue2) {
                    permissionRequest2.deny();
                    break;
                } else {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    s0Var2.e.M.P = true;
                    break;
                }
        }
    }
}
