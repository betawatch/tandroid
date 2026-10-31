package zg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i {
    public static final Rect f = new Rect();
    public final hi.c a = new hi.c();
    public final hi.b b = new hi.b();
    public final q5.d c = new q5.d(new zf.g(1));
    public final q5.d d = new q5.d(new zf.g(2));
    public final q5.d e = new q5.d(new zf.g(3));

    public final int a(hi.a aVar) {
        if (aVar instanceof hi.c) {
            return ((hi.c) aVar).b;
        }
        if (aVar instanceof hi.b) {
            return ((Integer) this.d.k(((hi.b) aVar).d)).intValue();
        }
        if (aVar instanceof hi.g) {
            return a(((hi.g) aVar).a);
        }
        return 0;
    }

    public final int b(hi.a aVar) {
        if (aVar instanceof hi.c) {
            return ((hi.c) aVar).b;
        }
        if (aVar instanceof hi.b) {
            return ((Integer) this.e.k(((hi.b) aVar).d)).intValue();
        }
        if (aVar instanceof hi.g) {
            return b(((hi.g) aVar).a);
        }
        return 0;
    }

    public final hi.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        hi.c cVar = this.a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof jb0;
        hi.b bVar = this.b;
        if (z11) {
            jb0 jb0Var = (jb0) drawable;
            if (jb0Var.q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(jb0Var.k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        q5.d dVar = this.c;
        if (z12) {
            bVar.a((Bitmap) dVar.k(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        }
        if (drawable instanceof xn) {
            return c(((xn) drawable).c(false));
        }
        if (drawable != null) {
            bVar.getClass();
            float f7 = 120;
            float f10 = f7 / 1.0f;
            int round = Math.round(f10);
            int round2 = Math.round(f10);
            Bitmap bitmap = bVar.f;
            if (bitmap == null || bitmap.isRecycled() || bVar.f.getWidth() != round2 || bVar.f.getHeight() != round2) {
                bVar.f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
            } else {
                bVar.f.eraseColor(0);
            }
            Canvas canvas = new Canvas(bVar.f);
            canvas.scale(f7 / round, zs.q2 / round2);
            Rect bounds = drawable.getBounds();
            Rect rect = f;
            rect.set(bounds);
            drawable.setBounds(0, 0, 120, zs.q2);
            drawable.draw(canvas);
            drawable.setBounds(rect);
            bVar.a(bVar.f);
            bVar.f = null;
            bVar.a((Bitmap) dVar.k(bVar.d));
        }
        return bVar;
    }
}
