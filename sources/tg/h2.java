package tg;

import hi.s6;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l2 b;

    public /* synthetic */ h2(l2 l2Var, int i7) {
        this.a = i7;
        this.b = l2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                org.telegram.messenger.g0.g3(new h2(this.b, 0));
                break;
            case 2:
                this.b.dismiss();
                break;
            default:
                l2 l2Var = this.b;
                s6 s6Var = l2Var.I;
                if (s6Var != null) {
                    s6Var.a(null);
                    l2Var.I = null;
                }
                l2Var.dismiss();
                break;
        }
    }
}
