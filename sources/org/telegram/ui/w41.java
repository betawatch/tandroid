package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class w41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretMediaViewer b;

    public /* synthetic */ w41(SecretMediaViewer secretMediaViewer, int i10) {
        this.a = i10;
        this.b = secretMediaViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 4;
        SecretMediaViewer secretMediaViewer = this.b;
        switch (i10) {
            case 0:
                secretMediaViewer.K0 = null;
                secretMediaViewer.m0 = 0;
                secretMediaViewer.e.setLayerType(0, null);
                secretMediaViewer.e.setVisibility(4);
                secretMediaViewer.s = false;
                secretMediaViewer.N = null;
                secretMediaViewer.M = false;
                secretMediaViewer.i();
                new ArrayList();
                AndroidUtilities.runOnUIThread(new w41(secretMediaViewer, i11), 50L);
                break;
            case 1:
                ah.w wVar = secretMediaViewer.e;
                if (wVar != null) {
                    wVar.setLayerType(0, null);
                    secretMediaViewer.e.setVisibility(4);
                    secretMediaViewer.m0 = 0;
                    secretMediaViewer.s = false;
                    secretMediaViewer.N = null;
                    secretMediaViewer.M = false;
                    secretMediaViewer.i();
                    new ArrayList();
                    AndroidUtilities.runOnUIThread(new w41(secretMediaViewer, i11), 50L);
                    secretMediaViewer.e.setScaleX(1.0f);
                    secretMediaViewer.e.setScaleY(1.0f);
                    break;
                }
                break;
            case 2:
                c51 c51Var = secretMediaViewer.y;
                if (c51Var != null) {
                    long n10 = c51Var.n();
                    long p5 = secretMediaViewer.y.p();
                    if (p5 == -9223372036854775807L) {
                        n10 = 0;
                        p5 = 0;
                    }
                    if (p5 > 0) {
                        org.telegram.ui.Components.i71 i71Var = secretMediaViewer.Q;
                        if (!i71Var.f) {
                            i71Var.h(n10 / p5, false);
                            secretMediaViewer.R.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.j1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.k1;
                    Arrays.fill(iArr2, 0);
                    c51 c51Var2 = secretMediaViewer.y;
                    if (c51Var2 != null) {
                        long max = Math.max(0L, c51Var2.n()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.y.p()) / 1000;
                        iArr[0] = (int) (max / 60);
                        iArr[1] = (int) (max % 60);
                        iArr2[0] = (int) (max2 / 60);
                        iArr2[1] = (int) (max2 % 60);
                    }
                    int i12 = iArr[0];
                    String format = i12 >= 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i12 / 60), Integer.valueOf(iArr[0] % 60), Integer.valueOf(iArr[1])) : String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(iArr[1]));
                    int i13 = iArr2[0];
                    String format2 = i13 >= 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i13 / 60), Integer.valueOf(iArr2[0] % 60), Integer.valueOf(iArr2[1])) : String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i13), Integer.valueOf(iArr2[1]));
                    org.telegram.ui.ActionBar.j5 j5Var = secretMediaViewer.S;
                    Locale locale = Locale.ROOT;
                    j5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.y.y()) {
                        AndroidUtilities.runOnUIThread(secretMediaViewer.i1, 17L);
                        break;
                    }
                }
                break;
            case 3:
                secretMediaViewer.m(false, true);
                break;
            default:
                ImageReceiver.BitmapHolder bitmapHolder = secretMediaViewer.i0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    secretMediaViewer.i0 = null;
                }
                secretMediaViewer.h.setImageBitmap((Bitmap) null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                secretMediaViewer.j0 = false;
                break;
        }
    }

    public /* synthetic */ w41(SecretMediaViewer secretMediaViewer, cv0 cv0Var, int i10) {
        this.a = i10;
        this.b = secretMediaViewer;
    }
}
