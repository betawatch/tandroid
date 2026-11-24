// default package

import android.app.Activity;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xl6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cm6 b;

    public /* synthetic */ xl6(cm6 cm6Var, byte b) {
        this.a = b;
        this.b = cm6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cm6 cm6Var = this.b;
        switch (b) {
            case 0:
                cm6Var.b0();
                break;
            default:
                Activity parentActivity = cm6Var.getParentActivity();
                Activity parentActivity2 = cm6Var.getParentActivity();
                np3 np3Var = hba.m;
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
