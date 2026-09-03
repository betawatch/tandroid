package vg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.ao;
import s5.m;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class j {
    public static final Rect f = new Rect();
    public final tg.c a = new tg.c();
    public final tg.b b = new tg.b();
    public final m c = new m(new sg.a(21));
    public final m d = new m(new sg.a(22));
    public final m e = new m(new sg.a(23));

    public final int a(tg.a aVar) {
        if (aVar instanceof tg.c) {
            return ((tg.c) aVar).a.getColor();
        }
        if (aVar instanceof tg.b) {
            return ((Integer) this.d.i(((tg.b) aVar).d)).intValue();
        }
        if (aVar instanceof tg.e) {
            return a(((tg.e) aVar).a);
        }
        return 0;
    }

    public final int b(tg.a aVar) {
        if (aVar instanceof tg.c) {
            return ((tg.c) aVar).a.getColor();
        }
        if (aVar instanceof tg.b) {
            return ((Integer) this.e.i(((tg.b) aVar).d)).intValue();
        }
        if (aVar instanceof tg.e) {
            return b(((tg.e) aVar).a);
        }
        return 0;
    }

    public final tg.a c(Drawable drawable) {
        boolean z4 = drawable instanceof ColorDrawable;
        tg.c cVar = this.a;
        if (z4) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z10 = drawable instanceof fc0;
        tg.b bVar = this.b;
        if (z10) {
            fc0 fc0Var = (fc0) drawable;
            if (fc0Var.q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(fc0Var.k);
            return bVar;
        }
        boolean z11 = drawable instanceof BitmapDrawable;
        m mVar = this.c;
        if (z11) {
            bVar.a((Bitmap) mVar.i(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        }
        if (drawable instanceof ao) {
            return c(((ao) drawable).c(false));
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
