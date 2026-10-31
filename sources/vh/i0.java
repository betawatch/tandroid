package vh;

import java.io.File;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;
    public final /* synthetic */ File c;

    public /* synthetic */ i0(n0 n0Var, File file, int i10) {
        this.a = i10;
        this.b = n0Var;
        this.c = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n0 n0Var = this.b;
                if (n0Var.c && n0Var.r != null) {
                    MediaController.d0(this.c.getAbsolutePath(), n0Var.getContext(), 1, null, null, new j0(n0Var, 1));
                    break;
                }
                break;
            case 1:
                n0 n0Var2 = this.b;
                n5 n5Var = n0Var2.r;
                File file = this.c;
                n5Var.c(file);
                if (n0Var2.c && n0Var2.r != null) {
                    org.telegram.messenger.i0.g3(new i0(n0Var2, file, 2));
                    break;
                }
                break;
            default:
                String absolutePath = this.c.getAbsolutePath();
                n0 n0Var3 = this.b;
                MediaController.d0(absolutePath, n0Var3.getContext(), 0, null, null, new j0(n0Var3, 2));
                break;
        }
    }
}
