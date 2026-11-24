// default package

import java.io.File;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class t20 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tg2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ml6 d;
    public final /* synthetic */ File e;

    public /* synthetic */ t20(tg2 tg2Var, long j, ml6 ml6Var, File file, byte b) {
        this.a = b;
        this.b = tg2Var;
        this.c = j;
        this.d = ml6Var;
        this.e = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        File file = this.e;
        ml6 ml6Var = this.d;
        long j = this.c;
        tg2 tg2Var = this.b;
        switch (b) {
            case 0:
                if (((HashSet) ((u20) tg2Var.c).h).remove(Long.valueOf(j))) {
                    s60.b(file);
                    MediaController mediaController = ml6Var.a;
                    if (file.equals(mediaController.k1)) {
                        mediaController.k1 = null;
                        break;
                    }
                }
                break;
            default:
                u20 u20Var = (u20) tg2Var.c;
                if (!u20Var.c) {
                    ((HashSet) u20Var.h).add(Long.valueOf(j));
                    Set set = s60.a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        s60.a.add(absolutePath);
                    }
                    ml6Var.a.k1 = file;
                    break;
                }
                break;
        }
    }
}
