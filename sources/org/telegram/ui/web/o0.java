package org.telegram.ui.web;

import android.webkit.PermissionRequest;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ PermissionRequest c;
    public final /* synthetic */ String[] d;

    public /* synthetic */ o0(v0 v0Var, PermissionRequest permissionRequest, String[] strArr, int i10) {
        this.a = i10;
        this.b = v0Var;
        this.c = permissionRequest;
        this.d = strArr;
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
                        c1.a(v0Var.e.N, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new o0(v0Var, permissionRequest, this.d, 1));
                        break;
                    }
                }
                break;
            default:
                v0 v0Var2 = this.b;
                v0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.c;
                if (!booleanValue2) {
                    permissionRequest2.deny();
                    break;
                } else {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    v0Var2.e.N.Q = true;
                    break;
                }
        }
    }
}
