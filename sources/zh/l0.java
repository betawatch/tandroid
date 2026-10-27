package zh;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p1 b;
    public final /* synthetic */ Utilities.Callback c;

    public /* synthetic */ l0(p1 p1Var, Utilities.Callback callback, int i10) {
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
