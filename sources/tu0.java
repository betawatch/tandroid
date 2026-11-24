// default package

import android.webkit.GeolocationPermissions;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tu0 implements vs2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu0 b;
    public final /* synthetic */ GeolocationPermissions.Callback c;
    public final /* synthetic */ String d;

    public /* synthetic */ tu0(zu0 zu0Var, GeolocationPermissions.Callback callback, String str, byte b) {
        this.a = b;
        this.b = zu0Var;
        this.c = callback;
        this.d = str;
    }

    @Override // vs2
    public final void accept(Object obj) {
        byte b = this.a;
        byte b2 = 1;
        String str = this.d;
        GeolocationPermissions.Callback callback = this.c;
        zu0 zu0Var = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                if (zu0Var.a != null) {
                    zu0Var.a = null;
                    if (!bool.booleanValue()) {
                        callback.invoke(str, false, false);
                        break;
                    } else {
                        tu0 tu0Var = new tu0(zu0Var, callback, str, b2);
                        boolean z = hv0.R0;
                        zu0Var.e.R.R(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, tu0Var);
                        break;
                    }
                }
                break;
            default:
                callback.invoke(str, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    zu0Var.e.R.U = true;
                    break;
                }
                break;
        }
    }
}
