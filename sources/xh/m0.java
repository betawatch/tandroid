package xh;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r1 b;
    public final /* synthetic */ Utilities.Callback c;

    public /* synthetic */ m0(r1 r1Var, Utilities.Callback callback, int i10) {
        this.a = i10;
        this.b = r1Var;
        this.c = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r1 r1Var = this.b;
                Utilities.Callback callback = this.c;
                if (callback != null) {
                    r1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                r1Var.dismiss();
                break;
            case 1:
                r1 r1Var2 = this.b;
                Utilities.Callback callback2 = this.c;
                if (callback2 != null) {
                    r1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                r1Var2.dismiss();
                break;
            default:
                r1 r1Var3 = this.b;
                Utilities.Callback callback3 = this.c;
                if (callback3 != null) {
                    r1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                r1Var3.dismiss();
                break;
        }
    }
}
