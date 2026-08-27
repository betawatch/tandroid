package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.j70;
import org.telegram.ui.un;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class k {
    public static final Rect f = new Rect();
    public final og.c a = new og.c();
    public final og.b b = new og.b();
    public final j9.a c = new j9.a(new j70(23));
    public final j9.a d = new j9.a(new j70(24));
    public final j9.a e = new j9.a(new j70(25));

    public final int a(og.a aVar) {
        if (aVar instanceof og.c) {
            return ((og.c) aVar).a.getColor();
        }
        if (aVar instanceof og.b) {
            return ((Integer) this.d.w(((og.b) aVar).d)).intValue();
        }
        if (aVar instanceof og.e) {
            return a(((og.e) aVar).a);
        }
        return 0;
    }

    public final int b(og.a aVar) {
        if (aVar instanceof og.c) {
            return ((og.c) aVar).a.getColor();
        }
        if (aVar instanceof og.b) {
            return ((Integer) this.e.w(((og.b) aVar).d)).intValue();
        }
        if (aVar instanceof og.e) {
            return b(((og.e) aVar).a);
        }
        return 0;
    }

    public final og.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        og.c cVar = this.a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof nb0;
        og.b bVar = this.b;
        if (z11) {
            nb0 nb0Var = (nb0) drawable;
            if (nb0Var.q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(nb0Var.k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        j9.a aVar = this.c;
        if (z12) {
            bVar.a((Bitmap) aVar.w(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        }
        if (drawable instanceof un) {
            return c(((un) drawable).c(false));
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
            bVar.a((Bitmap) aVar.w(bVar.d));
        }
        return bVar;
    }
}
