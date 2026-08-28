package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.VelocityTracker;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qq0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qq0(pr0 pr0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.e = pr0Var;
        this.f = iArr;
        this.h = iArr2;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        Object obj = this.h;
        Serializable serializable = this.f;
        Object obj2 = this.e;
        switch (i9) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                File file = (File) serializable;
                MessageObject messageObject = (MessageObject) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(file);
                int i10 = photoViewer.R3;
                photoViewer.R3 = i10 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z10 = this.b;
                MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i10, 0L, absolutePath, z10 ? 0 : ((Integer) imageOrientation.first).intValue(), z10, 0, 0, 0L).setOrientation(imageOrientation);
                photoViewer.Y1 = 2;
                photoViewer.q2 = false;
                photoViewer.d = new ct0(photoViewer, photoViewer.d, messageObject, orientation, this.c, this.d);
                photoViewer.l1.l();
                if (photoViewer.Q6 == null) {
                    photoViewer.Q6 = VelocityTracker.obtain();
                }
                photoViewer.x7 = 3;
                photoViewer.p3(false, false);
                photoViewer.j3(true, false);
                qn qnVar = photoViewer.h4;
                if (qnVar == null || qnVar.U == null || !qnVar.x9()) {
                    photoViewer.R1();
                } else {
                    photoViewer.h4.U.O();
                }
                photoViewer.H0.setAlpha(255);
                photoViewer.a0.setAlpha(1.0f);
                photoViewer.Y1(null, null, null, null, null, null, Collections.singletonList(orientation), 0, null);
                photoViewer.L0.setTranslationY(AndroidUtilities.dp(photoViewer.n1 ? 154.0f : 96.0f));
                photoViewer.O0.setTranslationY(AndroidUtilities.dp(photoViewer.n1 ? 154.0f : 96.0f));
                photoViewer.B.setTranslationY(-r1.getHeight());
                photoViewer.M1.setTranslationY(AndroidUtilities.dp(photoViewer.n1 ? 154.0f : 96.0f));
                photoViewer.K0();
                photoViewer.g3();
                photoViewer.x7 = 0;
                break;
            default:
                pr0 pr0Var = (pr0) obj2;
                int[] iArr = (int[]) serializable;
                int i11 = iArr[0] + 1;
                iArr[0] = i11;
                int i12 = ((int[]) obj)[0];
                if (i11 == i12) {
                    tt0 tt0Var = pr0Var.b.a0;
                    boolean z11 = this.b;
                    int i13 = (this.c ? 1 : 0) + (z11 ? 1 : 0);
                    boolean z12 = this.d;
                    new org.telegram.ui.Components.oc(tt0Var, null).m(i13 + (z12 ? 1 : 0) > 1 ? org.telegram.ui.Components.nc.v : z12 ? i12 > 1 ? org.telegram.ui.Components.nc.s : org.telegram.ui.Components.nc.r : z11 ? i12 > 1 ? org.telegram.ui.Components.nc.n : org.telegram.ui.Components.nc.h : i12 > 1 ? org.telegram.ui.Components.nc.f : org.telegram.ui.Components.nc.e, i12, -115203550, -1, null).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ qq0(PhotoViewer photoViewer, File file, boolean z10, MessageObject messageObject, boolean z11, boolean z12) {
        this.e = photoViewer;
        this.f = file;
        this.b = z10;
        this.h = messageObject;
        this.c = z11;
        this.d = z12;
    }
}
