package org.telegram.ui.web;

import android.webkit.PermissionRequest;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;
    public final /* synthetic */ PermissionRequest c;
    public final /* synthetic */ String[] d;

    public /* synthetic */ q0(w0 w0Var, PermissionRequest permissionRequest, String[] strArr, int i10) {
        this.a = i10;
        this.b = w0Var;
        this.c = permissionRequest;
        this.d = strArr;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                w0 w0Var = this.b;
                if (w0Var.a != null) {
                    w0Var.a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.c;
                    if (!booleanValue) {
                        permissionRequest.deny();
                        break;
                    } else {
                        d1.a(w0Var.e.Q, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new q0(w0Var, permissionRequest, this.d, 1));
                        break;
                    }
                }
                break;
            default:
                w0 w0Var2 = this.b;
                w0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.c;
                if (!booleanValue2) {
                    permissionRequest2.deny();
                    break;
                } else {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    w0Var2.e.Q.T = true;
                    break;
                }
        }
    }
}
