package wh;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p1 b;
    public final /* synthetic */ Utilities.Callback c;

    public /* synthetic */ n0(p1 p1Var, Utilities.Callback callback, int i10) {
        this.a = i10;
        this.b = p1Var;
        this.c = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p1 p1Var = this.b;
                Utilities.Callback callback = this.c;
                if (callback != null) {
                    p1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                p1Var.dismiss();
                break;
            case 1:
                p1 p1Var2 = this.b;
                Utilities.Callback callback2 = this.c;
                if (callback2 != null) {
                    p1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                p1Var2.dismiss();
                break;
            default:
                p1 p1Var3 = this.b;
                Utilities.Callback callback3 = this.c;
                if (callback3 != null) {
                    p1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                p1Var3.dismiss();
                break;
        }
    }
}
