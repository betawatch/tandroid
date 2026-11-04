package org.telegram.ui.web;

import android.webkit.PermissionRequest;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;
    public final /* synthetic */ PermissionRequest c;
    public final /* synthetic */ String[] d;

    public /* synthetic */ l0(q0 q0Var, PermissionRequest permissionRequest, String[] strArr, int i3) {
        this.a = i3;
        this.b = q0Var;
        this.c = permissionRequest;
        this.d = strArr;
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
                        w0.a(q0Var.e.R, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new l0(q0Var, permissionRequest, this.d, 1));
                        break;
                    }
                }
                break;
            default:
                q0 q0Var2 = this.b;
                q0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.c;
                if (!booleanValue2) {
                    permissionRequest2.deny();
                    break;
                } else {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    q0Var2.e.R.U = true;
                    break;
                }
        }
    }
}
