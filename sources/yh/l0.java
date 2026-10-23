package yh;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o1 b;
    public final /* synthetic */ Utilities.Callback c;

    public /* synthetic */ l0(o1 o1Var, Utilities.Callback callback, int i10) {
        this.a = i10;
        this.b = o1Var;
        this.c = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o1 o1Var = this.b;
                Utilities.Callback callback = this.c;
                if (callback != null) {
                    o1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                o1Var.dismiss();
                break;
            case 1:
                o1 o1Var2 = this.b;
                Utilities.Callback callback2 = this.c;
                if (callback2 != null) {
                    o1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                o1Var2.dismiss();
                break;
            default:
                o1 o1Var3 = this.b;
                Utilities.Callback callback3 = this.c;
                if (callback3 != null) {
                    o1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                o1Var3.dismiss();
                break;
        }
    }
}
