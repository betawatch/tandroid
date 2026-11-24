// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class q88 extends rw5 {
    public boolean i2;
    public final /* synthetic */ PhotoViewer j2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q88(PhotoViewer photoViewer, Context context, Activity activity, int i, Bitmap bitmap, Bitmap bitmap2, int i2, ArrayList arrayList, zl6 zl6Var, l68 l68Var, wjb wjbVar) {
        super(context, activity, i, bitmap, bitmap2, i2, arrayList, zl6Var, l68Var, wjbVar);
        this.j2 = photoViewer;
    }

    @Override // rw5
    public final FrameLayout getCaptionsBulletinContainer() {
        return this.j2.f0;
    }

    @Override // rw5
    public final long getCaptionsTrimEnd() {
        u78 u78Var = this.j2.X7;
        if (u78Var == null) {
            return 0L;
        }
        return (long) (u78Var.getRightProgress() * r3.z0());
    }

    @Override // rw5
    public final long getCaptionsTrimStart() {
        u78 u78Var = this.j2.X7;
        if (u78Var == null) {
            return 0L;
        }
        return (long) (u78Var.getLeftProgress() * r3.z0());
    }

    @Override // rw5
    public final File getCaptionsVideoFile() {
        int i;
        PhotoViewer photoViewer = this.j2;
        if (!photoViewer.s1 || photoViewer.d5 == null || (i = photoViewer.d2) == 1 || i == 11) {
            return null;
        }
        return new File(photoViewer.d5);
    }

    @Override // rw5
    public final long getCaptionsVideoPosition() {
        lbc lbcVar = this.j2.G2;
        if (lbcVar != null) {
            return lbcVar.S();
        }
        return 0L;
    }

    @Override // rw5
    public final int getPKeyboardHeight() {
        mv5 mv5Var = this.j2.L1;
        if (mv5Var != null) {
            return mv5Var.l;
        }
        return 0;
    }

    @Override // rw5
    public final void q0(boolean z) {
        PhotoViewer photoViewer = this.j2;
        if (photoViewer.G2 != null) {
            photoViewer.H2 = false;
            photoViewer.n();
            if (z) {
                photoViewer.G2.f0();
            } else {
                if (photoViewer.T0()) {
                    return;
                }
                photoViewer.G2.g0();
            }
        }
    }
}
