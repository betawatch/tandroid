package ph;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
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
                    MediaController.saveFile(this.c.getAbsolutePath(), n0Var.getContext(), 1, null, null, new j0(n0Var, 1), false);
                    break;
                }
                break;
            case 1:
                n0 n0Var2 = this.b;
                t6 t6Var = n0Var2.r;
                File file = this.c;
                t6Var.c(file);
                if (n0Var2.c && n0Var2.r != null) {
                    AndroidUtilities.runOnUIThread(new i0(n0Var2, file, 2));
                    break;
                }
                break;
            default:
                String absolutePath = this.c.getAbsolutePath();
                n0 n0Var3 = this.b;
                MediaController.saveFile(absolutePath, n0Var3.getContext(), 0, null, null, new j0(n0Var3, 2), false);
                break;
        }
    }
}
