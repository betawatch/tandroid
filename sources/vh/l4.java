package vh;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o4 b;

    public /* synthetic */ l4(o4 o4Var, int i10) {
        this.a = i10;
        this.b = o4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        r8.n nVar;
        switch (this.a) {
            case 0:
                o4 o4Var = this.b;
                if (o4Var.a.get() != null && o4Var.f != null && !o4Var.b.get()) {
                    TextureView textureView = o4Var.f.getTextureView();
                    if (textureView != null) {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        if (width > 720 || height > 720) {
                            float f7 = width;
                            float f10 = height;
                            float min = Math.min(720.0f / f7, 720.0f / f10);
                            width = (int) (f7 * min);
                            height = (int) (f10 * min);
                        }
                        int max = Math.max(1, width);
                        int max2 = Math.max(1, height);
                        Bitmap bitmap = o4Var.g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != o4Var.g.getHeight()) {
                            o4Var.g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(o4Var.g);
                        Bitmap bitmap2 = o4Var.g;
                        String str = o4Var.e;
                        m4 m4Var = null;
                        if (bitmap2 != null && (nVar = (r8.n) o4Var.a.get()) != null && nVar.b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            q5.d dVar = new q5.d(1);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            dVar.d = bitmap2;
                            a3.l lVar = (a3.l) dVar.b;
                            lVar.a = width3;
                            lVar.b = height3;
                            SparseArray e12 = nVar.e1(dVar);
                            for (int i11 = 0; i11 < e12.size(); i11++) {
                                r8.m mVar = (r8.m) e12.valueAt(i11);
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
                                    m4Var = new m4(trim, pointFArr);
                                }
                            }
                        }
                        m4 m4Var2 = o4Var.d;
                        if ((m4Var2 != null) == (m4Var != null)) {
                            if (m4Var != null && m4Var2 != null) {
                                PointF[] pointFArr2 = m4Var.b;
                                PointF[] pointFArr3 = m4Var2.b;
                                if (TextUtils.equals(m4Var.a, m4Var2.a)) {
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
                        o4Var.d = m4Var;
                        org.telegram.messenger.i0.g3(new d1(8, o4Var, m4Var));
                    }
                    if (!o4Var.b.get()) {
                        Utilities.e.a(o4Var.h);
                        Utilities.e.d(o4Var.h, o4Var.b());
                        break;
                    }
                }
                break;
            default:
                this.b.c.a(null);
                break;
        }
    }
}
