package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ kv0 c;

    public /* synthetic */ qr0(PhotoViewer photoViewer, kv0 kv0Var, int i10) {
        this.a = i10;
        this.b = photoViewer;
        this.c = kv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                photoViewer.h0.setImageBitmap(null);
                kv0 kv0Var = this.c;
                if (kv0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = kv0Var.m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.g0.getParent() != null) {
                        ((WindowManager) photoViewer.y.getSystemService("window")).removeView(photoViewer.g0);
                        photoViewer.W1();
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                photoViewer2.p4 = null;
                int i10 = 0;
                photoViewer2.e0.setLayerType(0, null);
                photoViewer2.n4 = 0;
                photoViewer2.G1();
                photoViewer2.Y1(this.c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.v7 && !photoViewer2.w7 && (arrayList = photoViewer2.g7) != null) {
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
                photoViewer3.p4 = null;
                cv0 cv0Var = photoViewer3.e0;
                if (cv0Var != null) {
                    int i11 = 0;
                    cv0Var.setLayerType(0, null);
                    photoViewer3.n4 = 0;
                    photoViewer3.Y1(this.c);
                    photoViewer3.e0.setScaleX(1.0f);
                    photoViewer3.e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.v7 && !photoViewer3.w7 && (arrayList2 = photoViewer3.g7) != null) {
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
