// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sa8 extends ry5 {
    public boolean i2;
    public final /* synthetic */ PhotoViewer j2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa8(PhotoViewer photoViewer, Context context, Activity activity, int i, Bitmap bitmap, Bitmap bitmap2, int i2, ArrayList arrayList, ao6 ao6Var, n88 n88Var, ylb ylbVar) {
        super(context, activity, i, bitmap, bitmap2, i2, arrayList, ao6Var, n88Var, ylbVar);
        this.j2 = photoViewer;
    }

    @Override // ry5
    public final FrameLayout getCaptionsBulletinContainer() {
        return this.j2.f0;
    }

    @Override // ry5
    public final long getCaptionsTrimEnd() {
        x98 x98Var = this.j2.X7;
        if (x98Var == null) {
            return 0L;
        }
        return (long) (x98Var.getRightProgress() * r3.z0());
    }

    @Override // ry5
    public final long getCaptionsTrimStart() {
        x98 x98Var = this.j2.X7;
        if (x98Var == null) {
            return 0L;
        }
        return (long) (x98Var.getLeftProgress() * r3.z0());
    }

    @Override // ry5
    public final File getCaptionsVideoFile() {
        int i;
        PhotoViewer photoViewer = this.j2;
        if (!photoViewer.s1 || photoViewer.d5 == null || (i = photoViewer.d2) == 1 || i == 11) {
            return null;
        }
        return new File(photoViewer.d5);
    }

    @Override // ry5
    public final long getCaptionsVideoPosition() {
        ndc ndcVar = this.j2.G2;
        if (ndcVar != null) {
            return ndcVar.S();
        }
        return 0L;
    }

    @Override // ry5
    public final int getPKeyboardHeight() {
        mx5 mx5Var = this.j2.L1;
        if (mx5Var != null) {
            return mx5Var.l;
        }
        return 0;
    }

    @Override // ry5
    public final void q0(boolean z) {
        PhotoViewer photoViewer = this.j2;
        if (photoViewer.G2 != null) {
            photoViewer.H2 = false;
            photoViewer.m();
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
