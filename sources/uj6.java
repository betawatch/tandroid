// default package

import android.app.Activity;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class uj6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zj6 b;

    public /* synthetic */ uj6(zj6 zj6Var, byte b) {
        this.a = b;
        this.b = zj6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        zj6 zj6Var = this.b;
        switch (b) {
            case 0:
                zj6Var.a0();
                break;
            default:
                Activity parentActivity = zj6Var.getParentActivity();
                Activity parentActivity2 = zj6Var.getParentActivity();
                do3 do3Var = h9a.m;
                boolean z = parentActivity2.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false);
                SharedPreferences.Editor edit = parentActivity.getSharedPreferences("shapedetector_conf", 0).edit();
                if (z) {
                    edit.clear();
                } else {
                    edit.putBoolean("learning", true);
                }
                edit.apply();
                break;
        }
    }
}
