package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class so0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ gs0 c;

    public /* synthetic */ so0(PhotoViewer photoViewer, gs0 gs0Var, int i10) {
        this.a = i10;
        this.b = photoViewer;
        this.c = gs0Var;
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
                gs0 gs0Var = this.c;
                if (gs0Var != null && !org.telegram.messenger.i0.Q1() && (clippingImageView = gs0Var.m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.g0.getParent() != null) {
                        ((WindowManager) photoViewer.D.getSystemService("window")).removeView(photoViewer.g0);
                        photoViewer.Z1();
                        break;
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                photoViewer2.p4 = null;
                int i10 = 0;
                photoViewer2.e0.setLayerType(0, null);
                photoViewer2.n4 = 0;
                photoViewer2.I1();
                photoViewer2.b2(this.c);
                MediaController.B().F0();
                if (photoViewer2.v7 && !photoViewer2.w7 && (arrayList = photoViewer2.g7) != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (obj instanceof org.telegram.messenger.ef) {
                            ((org.telegram.messenger.ef) obj).h();
                        }
                    }
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer3 = this.b;
                photoViewer3.p4 = null;
                as0 as0Var = photoViewer3.e0;
                if (as0Var != null) {
                    int i11 = 0;
                    as0Var.setLayerType(0, null);
                    photoViewer3.n4 = 0;
                    photoViewer3.b2(this.c);
                    photoViewer3.e0.setScaleX(1.0f);
                    photoViewer3.e0.setScaleY(1.0f);
                    MediaController.B().F0();
                    if (photoViewer3.v7 && !photoViewer3.w7 && (arrayList2 = photoViewer3.g7) != null) {
                        int size2 = arrayList2.size();
                        while (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            if (obj2 instanceof org.telegram.messenger.ef) {
                                ((org.telegram.messenger.ef) obj2).h();
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
