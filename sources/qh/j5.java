package qh;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.bh1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;

    public /* synthetic */ j5(m5 m5Var, int i10) {
        this.a = i10;
        this.b = m5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        f8.n nVar;
        switch (this.a) {
            case 0:
                m5 m5Var = this.b;
                if (m5Var.a.get() != null && m5Var.f != null && !m5Var.b.get()) {
                    TextureView textureView = m5Var.f.getTextureView();
                    if (textureView != null) {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        if (width > 720 || height > 720) {
                            float f10 = width;
                            float f11 = height;
                            float min = Math.min(720.0f / f10, 720.0f / f11);
                            width = (int) (f10 * min);
                            height = (int) (f11 * min);
                        }
                        int max = Math.max(1, width);
                        int max2 = Math.max(1, height);
                        Bitmap bitmap = m5Var.g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != m5Var.g.getHeight()) {
                            m5Var.g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(m5Var.g);
                        Bitmap bitmap2 = m5Var.g;
                        String str = m5Var.e;
                        k5 k5Var = null;
                        if (bitmap2 != null && (nVar = (f8.n) m5Var.a.get()) != null && nVar.b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            androidx.biometric.e eVar = new androidx.biometric.e(15);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            eVar.d = bitmap2;
                            e8.a aVar = (e8.a) eVar.b;
                            aVar.a = width3;
                            aVar.b = height3;
                            SparseArray L = nVar.L(eVar);
                            for (int i11 = 0; i11 < L.size(); i11++) {
                                f8.m mVar = (f8.m) L.valueAt(i11);
                                String str2 = mVar.b;
                                Point[] pointArr = mVar.e;
                                if (str2 != null) {
                                    String trim = str2.trim();
                                    if (!trim.startsWith(str)) {
                                        if (!trim.startsWith("https://" + str)) {
                                            if (!trim.startsWith("http://" + str)) {
                                            }
                                        }
                                    }
                                    PointF[] pointFArr = new PointF[pointArr.length];
                                    for (int i12 = 0; i12 < pointArr.length; i12++) {
                                        Point point = pointArr[i12];
                                        pointFArr[i12] = new PointF(point.x / width2, point.y / height2);
                                    }
                                    k5Var = new k5(trim, pointFArr);
                                }
                            }
                        }
                        k5 k5Var2 = m5Var.d;
                        if ((k5Var2 != null) == (k5Var != null)) {
                            if (k5Var != null && k5Var2 != null) {
                                PointF[] pointFArr2 = k5Var.b;
                                PointF[] pointFArr3 = k5Var2.b;
                                if (TextUtils.equals(k5Var.a, k5Var2.a)) {
                                    if (pointFArr2 != pointFArr3) {
                                        if (pointFArr2.length == pointFArr3.length) {
                                            while (i10 < pointFArr2.length) {
                                                i10 = (Math.abs(pointFArr2[i10].x - pointFArr3[i10].x) <= 0.001f && Math.abs(pointFArr2[i10].y - pointFArr3[i10].y) <= 0.001f) ? i10 + 1 : 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        m5Var.d = k5Var;
                        AndroidUtilities.runOnUIThread(new bh1(26, m5Var, k5Var));
                    }
                    if (!m5Var.b.get()) {
                        Utilities.globalQueue.cancelRunnable(m5Var.h);
                        Utilities.globalQueue.postRunnable(m5Var.h, m5Var.b());
                        break;
                    }
                }
                break;
            default:
                this.b.c.run(null);
                break;
        }
    }
}
