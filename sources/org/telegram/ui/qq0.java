package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ lu0 c;

    public /* synthetic */ qq0(PhotoViewer photoViewer, lu0 lu0Var, int i10) {
        this.a = i10;
        this.b = photoViewer;
        this.c = lu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                photoViewer.e0.setImageBitmap(null);
                lu0 lu0Var = this.c;
                if (lu0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = lu0Var.m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.d0.getParent() != null) {
                        ((WindowManager) photoViewer.y.getSystemService("window")).removeView(photoViewer.d0);
                        photoViewer.V1();
                        break;
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                photoViewer2.m4 = null;
                int i10 = 0;
                photoViewer2.b0.setLayerType(0, null);
                photoViewer2.k4 = 0;
                photoViewer2.F1();
                photoViewer2.X1(this.c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.s7 && !photoViewer2.t7 && (arrayList = photoViewer2.d7) != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (obj instanceof MediaController.PhotoEntry) {
                            ((MediaController.PhotoEntry) obj).deleteAll();
                        }
                    }
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer3 = this.b;
                photoViewer3.m4 = null;
                du0 du0Var = photoViewer3.b0;
                if (du0Var != null) {
                    int i11 = 0;
                    du0Var.setLayerType(0, null);
                    photoViewer3.k4 = 0;
                    photoViewer3.X1(this.c);
                    photoViewer3.b0.setScaleX(1.0f);
                    photoViewer3.b0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.s7 && !photoViewer3.t7 && (arrayList2 = photoViewer3.d7) != null) {
                        int size2 = arrayList2.size();
                        while (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            if (obj2 instanceof MediaController.PhotoEntry) {
                                ((MediaController.PhotoEntry) obj2).deleteAll();
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
