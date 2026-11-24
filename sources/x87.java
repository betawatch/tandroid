// default package

import android.app.Activity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
