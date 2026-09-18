package yh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class w7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    public /* synthetic */ w7(o8 o8Var, int i10) {
        this.a = i10;
        this.b = o8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o8 o8Var = this.b;
                o8Var.R = true;
                o8Var.o(null);
                AndroidUtilities.runOnUIThread(new w7(o8Var, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                c8 c8Var = this.b.r;
                c8Var.F = false;
                c8Var.invalidate();
                break;
        }
    }
}
