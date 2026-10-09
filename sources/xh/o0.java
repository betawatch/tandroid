package xh;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r1 b;
    public final /* synthetic */ Utilities.Callback c;

    public /* synthetic */ o0(r1 r1Var, Utilities.Callback callback, int i10) {
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
