package qh;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                r6 r6Var = n0Var2.r;
                File file = this.c;
                r6Var.c(file);
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
