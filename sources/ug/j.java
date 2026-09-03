package ug;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.co;
import s5.m;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j {
    public static final Rect f = new Rect();
    public final sg.c a = new sg.c();
    public final sg.b b = new sg.b();
    public final m c = new m(new s0.b(15));
    public final m d = new m(new s0.b(16));
    public final m e = new m(new s0.b(17));

    public final int a(sg.a aVar) {
        if (aVar instanceof sg.c) {
            return ((sg.c) aVar).a.getColor();
        }
        if (aVar instanceof sg.b) {
            return ((Integer) this.d.i(((sg.b) aVar).d)).intValue();
        }
        if (aVar instanceof sg.e) {
            return a(((sg.e) aVar).a);
        }
        return 0;
    }

    public final int b(sg.a aVar) {
        if (aVar instanceof sg.c) {
            return ((sg.c) aVar).a.getColor();
        }
        if (aVar instanceof sg.b) {
            return ((Integer) this.e.i(((sg.b) aVar).d)).intValue();
        }
        if (aVar instanceof sg.e) {
            return b(((sg.e) aVar).a);
        }
        return 0;
    }

    public final sg.a c(Drawable drawable) {
        boolean z4 = drawable instanceof ColorDrawable;
        sg.c cVar = this.a;
        if (z4) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z10 = drawable instanceof ec0;
        sg.b bVar = this.b;
        if (z10) {
            ec0 ec0Var = (ec0) drawable;
            if (ec0Var.q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(ec0Var.k);
            return bVar;
        }
        boolean z11 = drawable instanceof BitmapDrawable;
        m mVar = this.c;
        if (z11) {
            bVar.a((Bitmap) mVar.i(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        }
        if (drawable instanceof co) {
            return c(((co) drawable).c(false));
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
            bVar.a((Bitmap) mVar.i(bVar.d));
        }
        return bVar;
    }
}
