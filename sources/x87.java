// default package

import android.app.Activity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class x87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ hd c;

    public /* synthetic */ x87(Activity activity, hd hdVar, byte b) {
        this.a = b;
        this.b = activity;
        this.c = hdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hd hdVar = this.c;
        Activity activity = this.b;
        switch (b) {
            case 0:
                if (!activity.isFinishing()) {
                    try {
                        hdVar.dismiss();
                        break;
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                }
                break;
            default:
                try {
                    if (!activity.isFinishing()) {
                        hdVar.dismiss();
                        break;
                    }
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
                break;
        }
    }
}
