package xh;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q1 b;
    public final /* synthetic */ Utilities.Callback c;

    public /* synthetic */ m0(q1 q1Var, Utilities.Callback callback, int i10) {
        this.a = i10;
        this.b = q1Var;
        this.c = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q1 q1Var = this.b;
                Utilities.Callback callback = this.c;
                if (callback != null) {
                    q1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                q1Var.dismiss();
                break;
            case 1:
                q1 q1Var2 = this.b;
                Utilities.Callback callback2 = this.c;
                if (callback2 != null) {
                    q1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                q1Var2.dismiss();
                break;
            default:
                q1 q1Var3 = this.b;
                Utilities.Callback callback3 = this.c;
                if (callback3 != null) {
                    q1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                q1Var3.dismiss();
                break;
        }
    }
}
