package xf;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;
    public final /* synthetic */ r0 c;

    public /* synthetic */ b0(d0 d0Var, r0 r0Var, int i9) {
        this.a = i9;
        this.b = d0Var;
        this.c = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.b, this.c, 1));
                break;
            default:
                d0 d0Var = this.b;
                d0Var.getClass();
                d0Var.i = this.c.a;
                break;
        }
    }
}
