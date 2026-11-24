// default package

import android.webkit.PermissionRequest;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ru0 implements vs2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu0 b;
    public final /* synthetic */ PermissionRequest c;
    public final /* synthetic */ String d;

    public /* synthetic */ ru0(zu0 zu0Var, PermissionRequest permissionRequest, String str, byte b) {
        this.a = b;
        this.b = zu0Var;
        this.c = permissionRequest;
        this.d = str;
    }

    @Override // vs2
    public final void accept(Object obj) {
        byte b = this.a;
        String str = this.d;
        PermissionRequest permissionRequest = this.c;
        zu0 zu0Var = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                if (zu0Var.a != null) {
                    zu0Var.a = null;
                    if (!bool.booleanValue()) {
                        permissionRequest.deny();
                        break;
                    } else {
                        ru0 ru0Var = new ru0(zu0Var, permissionRequest, str, (byte) 2);
                        boolean z = hv0.R0;
                        zu0Var.e.R.R(new String[]{"android.permission.RECORD_AUDIO"}, ru0Var);
                        break;
                    }
                }
                break;
            case 1:
                if (zu0Var.a != null) {
                    zu0Var.a = null;
                    if (!bool.booleanValue()) {
                        permissionRequest.deny();
                        break;
                    } else {
                        ru0 ru0Var2 = new ru0(zu0Var, permissionRequest, str, (byte) 3);
                        boolean z2 = hv0.R0;
                        zu0Var.e.R.R(new String[]{"android.permission.CAMERA"}, ru0Var2);
                        break;
                    }
                }
                break;
            case 2:
                if (!bool.booleanValue()) {
                    permissionRequest.deny();
                    break;
                } else {
                    permissionRequest.grant(new String[]{str});
                    zu0Var.e.R.U = true;
                    break;
                }
            default:
                if (!bool.booleanValue()) {
                    permissionRequest.deny();
                    break;
                } else {
                    permissionRequest.grant(new String[]{str});
                    zu0Var.e.R.U = true;
                    break;
                }
        }
    }
}
