package pg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.fk0;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j {
    public static final Rect f = new Rect();
    public final ng.c a = new ng.c();
    public final ng.b b = new ng.b();
    public final j4.c c = new j4.c(new fk0(17));
    public final j4.c d = new j4.c(new fk0(18));
    public final j4.c e = new j4.c(new fk0(19));

    public final int a(ng.a aVar) {
        if (aVar instanceof ng.c) {
            return ((ng.c) aVar).a.getColor();
        }
        if (aVar instanceof ng.b) {
            return ((Integer) this.d.r(((ng.b) aVar).d)).intValue();
        }
        if (aVar instanceof ng.e) {
            return a(((ng.e) aVar).a);
        }
        return 0;
    }

    public final int b(ng.a aVar) {
        if (aVar instanceof ng.c) {
            return ((ng.c) aVar).a.getColor();
        }
        if (aVar instanceof ng.b) {
            return ((Integer) this.e.r(((ng.b) aVar).d)).intValue();
        }
        if (aVar instanceof ng.e) {
            return b(((ng.e) aVar).a);
        }
        return 0;
    }

    public final ng.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        ng.c cVar = this.a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof jb0;
        ng.b bVar = this.b;
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
        j4.c cVar2 = this.c;
        if (z12) {
            bVar.a((Bitmap) cVar2.r(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        }
        if (drawable instanceof tn) {
            return c(((tn) drawable).c(false));
        }
        if (drawable != null) {
            bVar.getClass();
            float f10 = 120;
            float f11 = f10 / 1.0f;
            int round = Math.round(f11);
            int round2 = Math.round(f11);
            Bitmap bitmap = bVar.f;
            if (bitmap == null || bitmap.isRecycled() || bVar.f.getWidth() != round2 || bVar.f.getHeight() != round2) {
                bVar.f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
            } else {
                bVar.f.eraseColor(0);
            }
            Canvas canvas = new Canvas(bVar.f);
            canvas.scale(f10 / round, 160 / round2);
            Rect bounds = drawable.getBounds();
            Rect rect = f;
            rect.set(bounds);
            drawable.setBounds(0, 0, 120, 160);
            drawable.draw(canvas);
            drawable.setBounds(rect);
            bVar.a(bVar.f);
            bVar.f = null;
            bVar.a((Bitmap) cVar2.r(bVar.d));
        }
        return bVar;
    }
}
