package yh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class a8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r8 b;

    public /* synthetic */ a8(r8 r8Var, int i10) {
        this.a = i10;
        this.b = r8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r8 r8Var = this.b;
                r8Var.R = true;
                r8Var.o(null);
                AndroidUtilities.runOnUIThread(new a8(r8Var, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                f8 f8Var = this.b.r;
                f8Var.F = false;
                f8Var.invalidate();
                break;
        }
    }
}
