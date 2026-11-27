// default package

import java.io.File;
import java.util.Set;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class u20 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lh2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ sn6 d;
    public final /* synthetic */ File e;

    public /* synthetic */ u20(lh2 lh2Var, long j, sn6 sn6Var, File file, byte b) {
        this.a = b;
        this.b = lh2Var;
        this.c = j;
        this.d = sn6Var;
        this.e = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        File file = this.e;
        sn6 sn6Var = this.d;
        long j = this.c;
        lh2 lh2Var = this.b;
        switch (b) {
            case 0:
                if (((v20) lh2Var.c).e.remove(Long.valueOf(j))) {
                    u60.b(file);
                    MediaController mediaController = sn6Var.a;
                    if (file.equals(mediaController.k1)) {
                        mediaController.k1 = null;
                        break;
                    }
                }
                break;
            default:
                v20 v20Var = (v20) lh2Var.c;
                if (!v20Var.h) {
                    v20Var.e.add(Long.valueOf(j));
                    Set set = u60.a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        u60.a.add(absolutePath);
                    }
                    sn6Var.a.k1 = file;
                    break;
                }
                break;
        }
    }
}
