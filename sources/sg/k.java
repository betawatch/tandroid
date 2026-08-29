package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import l3.g0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k {
    public static final Rect f = new Rect();
    public final qg.c a = new qg.c();
    public final qg.b b = new qg.b();
    public final g0 c = new g0(new r.a(29));
    public final g0 d = new g0(new j(0));
    public final g0 e = new g0(new j(1));

    public final int a(qg.a aVar) {
        if (aVar instanceof qg.c) {
            return ((qg.c) aVar).a.getColor();
        }
        if (aVar instanceof qg.b) {
            return ((Integer) this.d.o(((qg.b) aVar).d)).intValue();
        }
        if (aVar instanceof qg.e) {
            return a(((qg.e) aVar).a);
        }
        return 0;
    }

    public final int b(qg.a aVar) {
        if (aVar instanceof qg.c) {
            return ((qg.c) aVar).a.getColor();
        }
        if (aVar instanceof qg.b) {
            return ((Integer) this.e.o(((qg.b) aVar).d)).intValue();
        }
        if (aVar instanceof qg.e) {
            return b(((qg.e) aVar).a);
        }
        return 0;
    }

    public final qg.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        qg.c cVar = this.a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof yb0;
        qg.b bVar = this.b;
        if (z11) {
            yb0 yb0Var = (yb0) drawable;
            if (yb0Var.q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(yb0Var.k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        g0 g0Var = this.c;
        if (z12) {
            bVar.a((Bitmap) g0Var.o(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        }
        if (drawable instanceof wn) {
            return c(((wn) drawable).c(false));
        }
        if (drawable != null) {
            bVar.getClass();
            float f9 = 120;
            float f10 = f9 / 1.0f;
            int round = Math.round(f10);
            int round2 = Math.round(f10);
            Bitmap bitmap = bVar.f;
            if (bitmap == null || bitmap.isRecycled() || bVar.f.getWidth() != round2 || bVar.f.getHeight() != round2) {
                bVar.f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
            } else {
                bVar.f.eraseColor(0);
            }
            Canvas canvas = new Canvas(bVar.f);
            canvas.scale(f9 / round, 160 / round2);
            Rect bounds = drawable.getBounds();
            Rect rect = f;
            rect.set(bounds);
            drawable.setBounds(0, 0, 120, 160);
            drawable.draw(canvas);
            drawable.setBounds(rect);
            bVar.a(bVar.f);
            bVar.f = null;
            bVar.a((Bitmap) g0Var.o(bVar.d));
        }
        return bVar;
    }
}
