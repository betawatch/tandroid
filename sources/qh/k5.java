package qh;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.mg1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n5 b;

    public /* synthetic */ k5(n5 n5Var, int i10) {
        this.a = i10;
        this.b = n5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        f8.n nVar;
        switch (this.a) {
            case 0:
                n5 n5Var = this.b;
                if (n5Var.a.get() != null && n5Var.f != null && !n5Var.b.get()) {
                    TextureView textureView = n5Var.f.getTextureView();
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
                        Bitmap bitmap = n5Var.g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != n5Var.g.getHeight()) {
                            n5Var.g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(n5Var.g);
                        Bitmap bitmap2 = n5Var.g;
                        String str = n5Var.e;
                        l5 l5Var = null;
                        if (bitmap2 != null && (nVar = (f8.n) n5Var.a.get()) != null && nVar.b.k()) {
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
                                    l5Var = new l5(trim, pointFArr);
                                }
                            }
                        }
                        l5 l5Var2 = n5Var.d;
                        if ((l5Var2 != null) == (l5Var != null)) {
                            if (l5Var != null && l5Var2 != null) {
                                PointF[] pointFArr2 = l5Var.b;
                                PointF[] pointFArr3 = l5Var2.b;
                                if (TextUtils.equals(l5Var.a, l5Var2.a)) {
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
                        n5Var.d = l5Var;
                        AndroidUtilities.runOnUIThread(new mg1(27, n5Var, l5Var));
                    }
                    if (!n5Var.b.get()) {
                        Utilities.globalQueue.cancelRunnable(n5Var.h);
                        Utilities.globalQueue.postRunnable(n5Var.h, n5Var.b());
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
