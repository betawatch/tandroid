package ph;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.sg1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ l5(o5 o5Var, int i10) {
        this.a = i10;
        this.b = o5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        f8.n nVar;
        switch (this.a) {
            case 0:
                o5 o5Var = this.b;
                if (o5Var.a.get() != null && o5Var.f != null && !o5Var.b.get()) {
                    TextureView textureView = o5Var.f.getTextureView();
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
                        Bitmap bitmap = o5Var.g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != o5Var.g.getHeight()) {
                            o5Var.g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(o5Var.g);
                        Bitmap bitmap2 = o5Var.g;
                        String str = o5Var.e;
                        m5 m5Var = null;
                        if (bitmap2 != null && (nVar = (f8.n) o5Var.a.get()) != null && nVar.b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            af.d dVar = new af.d(15);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            dVar.d = bitmap2;
                            e8.a aVar = (e8.a) dVar.b;
                            aVar.a = width3;
                            aVar.b = height3;
                            SparseArray L = nVar.L(dVar);
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
                                    m5Var = new m5(trim, pointFArr);
                                }
                            }
                        }
                        m5 m5Var2 = o5Var.d;
                        if ((m5Var2 != null) == (m5Var != null)) {
                            if (m5Var != null && m5Var2 != null) {
                                PointF[] pointFArr2 = m5Var.b;
                                PointF[] pointFArr3 = m5Var2.b;
                                if (TextUtils.equals(m5Var.a, m5Var2.a)) {
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
                        o5Var.d = m5Var;
                        AndroidUtilities.runOnUIThread(new sg1(27, o5Var, m5Var));
                    }
                    if (!o5Var.b.get()) {
                        Utilities.globalQueue.cancelRunnable(o5Var.h);
                        Utilities.globalQueue.postRunnable(o5Var.h, o5Var.b());
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
