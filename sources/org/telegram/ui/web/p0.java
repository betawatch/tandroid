package org.telegram.ui.web;

import android.webkit.PermissionRequest;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;
    public final /* synthetic */ PermissionRequest c;
    public final /* synthetic */ String d;

    public /* synthetic */ p0(w0 w0Var, PermissionRequest permissionRequest, String str, int i10) {
        this.a = i10;
        this.b = w0Var;
        this.c = permissionRequest;
        this.d = str;
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
                        d1.a(w0Var.e.Q, new String[]{"android.permission.RECORD_AUDIO"}, new p0(w0Var, permissionRequest, this.d, 2));
                        break;
                    }
                }
                break;
            case 1:
                w0 w0Var2 = this.b;
                if (w0Var2.a != null) {
                    w0Var2.a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.c;
                    if (!booleanValue2) {
                        permissionRequest2.deny();
                        break;
                    } else {
                        d1.a(w0Var2.e.Q, new String[]{"android.permission.CAMERA"}, new p0(w0Var2, permissionRequest2, this.d, 3));
                        break;
                    }
                }
                break;
            case 2:
                w0 w0Var3 = this.b;
                w0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.c;
                if (!booleanValue3) {
                    permissionRequest3.deny();
                    break;
                } else {
                    permissionRequest3.grant(new String[]{this.d});
                    w0Var3.e.Q.T = true;
                    break;
                }
            default:
                w0 w0Var4 = this.b;
                w0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.c;
                if (!booleanValue4) {
                    permissionRequest4.deny();
                    break;
                } else {
                    permissionRequest4.grant(new String[]{this.d});
                    w0Var4.e.Q.T = true;
                    break;
                }
        }
    }
}
