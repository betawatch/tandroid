package org.telegram.ui.web;

import android.webkit.PermissionRequest;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ PermissionRequest c;
    public final /* synthetic */ String[] d;

    public /* synthetic */ l0(r0 r0Var, PermissionRequest permissionRequest, String[] strArr, int i7) {
        this.a = i7;
        this.b = r0Var;
        this.c = permissionRequest;
        this.d = strArr;
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
                        x0.a(r0Var.e.Q, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new l0(r0Var, permissionRequest, this.d, 1));
                        break;
                    }
                }
                break;
            default:
                r0 r0Var2 = this.b;
                r0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.c;
                if (!booleanValue2) {
                    permissionRequest2.deny();
                    break;
                } else {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    r0Var2.e.Q.T = true;
                    break;
                }
        }
    }
}
