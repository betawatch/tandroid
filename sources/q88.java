// default package

import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class q88 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ qb8 c;

    public /* synthetic */ q88(PhotoViewer photoViewer, qb8 qb8Var, byte b) {
        this.a = b;
        this.b = photoViewer;
        this.c = qb8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bfa bfaVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        byte b = this.a;
        int i = 0;
        qb8 qb8Var = this.c;
        PhotoViewer photoViewer = this.b;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.i0.setImageBitmap(null);
                if (qb8Var != null && !gm.O1() && (bfaVar = qb8Var.m) != null) {
                    bfaVar.setImageBitmap(null);
                }
                try {
                    if (photoViewer.h0.getParent() != null) {
                        ((WindowManager) photoViewer.E.getSystemService("window")).removeView(photoViewer.h0);
                        photoViewer.a1();
                        break;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.d9;
                photoViewer.o4 = null;
                photoViewer.f0.setLayerType(0, null);
                photoViewer.m4 = (byte) 0;
                photoViewer.H0();
                photoViewer.c1(qb8Var);
                MediaController.w().E0();
                if (photoViewer.A7 && !photoViewer.B7 && (arrayList = photoViewer.f7) != null) {
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        if (obj instanceof jo6) {
                            ((jo6) obj).h();
                        }
                    }
                    break;
                }
                break;
            default:
                Drawable[] drawableArr3 = PhotoViewer.d9;
                photoViewer.o4 = null;
                lb8 lb8Var = photoViewer.f0;
                if (lb8Var != null) {
                    lb8Var.setLayerType(0, null);
                    photoViewer.m4 = (byte) 0;
                    photoViewer.c1(qb8Var);
                    photoViewer.f0.setScaleX(1.0f);
                    photoViewer.f0.setScaleY(1.0f);
                    MediaController.w().E0();
                    if (photoViewer.A7 && !photoViewer.B7 && (arrayList2 = photoViewer.f7) != null) {
                        int size2 = arrayList2.size();
                        while (i < size2) {
                            Object obj2 = arrayList2.get(i);
                            i++;
                            if (obj2 instanceof jo6) {
                                ((jo6) obj2).h();
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
