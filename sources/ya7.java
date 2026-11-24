// default package

import android.app.Activity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ya7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ he c;

    public /* synthetic */ ya7(Activity activity, he heVar, byte b) {
        this.a = b;
        this.b = activity;
        this.c = heVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        he heVar = this.c;
        Activity activity = this.b;
        switch (b) {
            case 0:
                if (!activity.isFinishing()) {
                    try {
                        heVar.dismiss();
                        break;
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                }
                break;
            default:
                try {
                    if (!activity.isFinishing()) {
                        heVar.dismiss();
                        break;
                    }
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
                break;
        }
    }
}
