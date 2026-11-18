package org.telegram.ui.web;

import android.webkit.PermissionRequest;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;
    public final /* synthetic */ PermissionRequest c;
    public final /* synthetic */ String d;

    public /* synthetic */ j0(p0 p0Var, PermissionRequest permissionRequest, String str, int i7) {
        this.a = i7;
        this.b = p0Var;
        this.c = permissionRequest;
        this.d = str;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                p0 p0Var = this.b;
                if (p0Var.a != null) {
                    p0Var.a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.c;
                    if (!booleanValue) {
                        permissionRequest.deny();
                        break;
                    } else {
                        v0.a(p0Var.e.R, new String[]{"android.permission.RECORD_AUDIO"}, new j0(p0Var, permissionRequest, this.d, 2));
                        break;
                    }
                }
                break;
            case 1:
                p0 p0Var2 = this.b;
                if (p0Var2.a != null) {
                    p0Var2.a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.c;
                    if (!booleanValue2) {
                        permissionRequest2.deny();
                        break;
                    } else {
                        v0.a(p0Var2.e.R, new String[]{"android.permission.CAMERA"}, new j0(p0Var2, permissionRequest2, this.d, 3));
                        break;
                    }
                }
                break;
            case 2:
                p0 p0Var3 = this.b;
                p0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.c;
                if (!booleanValue3) {
                    permissionRequest3.deny();
                    break;
                } else {
                    permissionRequest3.grant(new String[]{this.d});
                    p0Var3.e.R.U = true;
                    break;
                }
            default:
                p0 p0Var4 = this.b;
                p0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.c;
                if (!booleanValue4) {
                    permissionRequest4.deny();
                    break;
                } else {
                    permissionRequest4.grant(new String[]{this.d});
                    p0Var4.e.R.U = true;
                    break;
                }
        }
    }
}
