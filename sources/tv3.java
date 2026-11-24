// default package

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tv3 extends OrientationEventListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tv3(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        Activity activity;
        oa8 oa8Var;
        Activity activity2;
        byte b;
        byte b2 = this.a;
        Object obj = this.b;
        switch (b2) {
            case 0:
                zv3 zv3Var = (zv3) obj;
                tvc tvcVar = zv3Var.m1;
                if (zv3Var.z1 != null && tvcVar.getVisibility() == 0 && (activity = zv3Var.s1) != null && tvcVar.U && zv3Var.G1) {
                    if (i >= 240 && i <= 300) {
                        zv3Var.H1 = true;
                        break;
                    } else if (zv3Var.H1 && i > 0) {
                        if (i >= 330 || i <= 30) {
                            activity.setRequestedOrientation(zv3Var.F1);
                            zv3Var.G1 = false;
                            zv3Var.H1 = false;
                            break;
                        }
                    }
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.W3 != null && (oa8Var = photoViewer.z2) != null && oa8Var.getVisibility() == 0 && (activity2 = photoViewer.E) != null && (b = photoViewer.Y3) != 0) {
                    if (b != 1) {
                        if (i > 0 && (i >= 330 || i <= 30)) {
                            photoViewer.Z3 = true;
                            break;
                        } else if (photoViewer.Z3 && i >= 240 && i <= 300) {
                            activity2.setRequestedOrientation(photoViewer.X3);
                            photoViewer.Y3 = (byte) 0;
                            photoViewer.Z3 = false;
                            break;
                        }
                    } else if (i >= 240 && i <= 300) {
                        photoViewer.Z3 = true;
                        break;
                    } else if (photoViewer.Z3 && i > 0) {
                        if (i >= 330 || i <= 30) {
                            activity2.setRequestedOrientation(photoViewer.X3);
                            photoViewer.Y3 = (byte) 0;
                            photoViewer.Z3 = false;
                            break;
                        }
                    }
                }
                break;
        }
    }
}
