// default package

import java.io.File;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class tq3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yq3 b;
    public final /* synthetic */ File c;

    public /* synthetic */ tq3(yq3 yq3Var, File file, byte b) {
        this.a = b;
        this.b = yq3Var;
        this.c = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 2;
        File file = this.c;
        yq3 yq3Var = this.b;
        switch (b) {
            case 0:
                if (yq3Var.c && yq3Var.r != null) {
                    MediaController.d0(file.getAbsolutePath(), yq3Var.getContext(), 1, null, null, new uq3(yq3Var, (byte) 1));
                    break;
                }
                break;
            case 1:
                yq3Var.r.c(file);
                if (yq3Var.c && yq3Var.r != null) {
                    gm.c3(new tq3(yq3Var, file, b2));
                    break;
                }
                break;
            default:
                MediaController.d0(file.getAbsolutePath(), yq3Var.getContext(), 0, null, null, new uq3(yq3Var, (byte) 2));
                break;
        }
    }
}
