package yh;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.az;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.s30;
import org.telegram.ui.yg0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e {
    public static HashMap n;
    public final double a;
    public final double b;
    public final int c;
    public final yg0 d;
    public final g40 e;
    public d f;
    public final int g;
    public final int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public int l = 0;
    public final c m = new c(this, 0);

    public e(int i3, yg0 yg0Var, int i10, int i11) {
        double d = 1.0d / ((int) g0.r);
        this.a = d;
        this.b = d * 4.0d;
        this.c = i3;
        this.g = i10;
        this.h = i11;
        this.d = yg0Var;
        g40 g40Var = new g40(2, yg0Var.getContext(), this);
        this.e = g40Var;
        g40Var.setSurfaceTextureListener(new s30(this, 5));
        g40Var.setOpaque(false);
        yg0Var.addView(g40Var);
    }

    public static e d(int i3, View view, ViewGroup viewGroup) {
        int min;
        if (view == null) {
            return null;
        }
        if (n == null) {
            n = new HashMap();
        }
        e eVar = (e) n.get(Integer.valueOf(i3));
        if (eVar == null) {
            int o10 = az.o();
            if (o10 == 1) {
                Point point = g0.q;
                min = Math.min(900, (int) (((point.x + point.y) / 2.0f) * 0.8f));
            } else if (o10 != 2) {
                Point point2 = g0.q;
                min = Math.min(720, (int) (((point2.x + point2.y) / 2.0f) * 0.7f));
            } else {
                Point point3 = g0.q;
                min = Math.min(1280, (int) (((point3.x + point3.y) / 2.0f) * 1.0f));
            }
            if (viewGroup == null) {
                return null;
            }
            HashMap hashMap = n;
            Integer valueOf = Integer.valueOf(i3);
            yg0 yg0Var = new yg0(viewGroup.getContext(), 22);
            viewGroup.addView(yg0Var);
            e eVar2 = new e(i3, yg0Var, min, min);
            hashMap.put(valueOf, eVar2);
            eVar = eVar2;
        }
        eVar.a(view);
        return eVar;
    }

    public static e e(View view) {
        Activity W = g0.W(view.getContext());
        ViewGroup viewGroup = null;
        if (W != null) {
            View rootView = W.findViewById(R.id.content).getRootView();
            if (rootView instanceof ViewGroup) {
                viewGroup = (ViewGroup) rootView;
            }
        }
        return d(0, view, viewGroup);
    }

    public static void f(boolean z10) {
        d dVar;
        HashMap hashMap = n;
        if (hashMap == null) {
            return;
        }
        for (e eVar : hashMap.values()) {
            if (eVar.c == 0 && (dVar = eVar.f) != null) {
                dVar.b = z10;
            }
        }
    }

    public final void a(View view) {
        if (this.i) {
            return;
        }
        ArrayList arrayList = this.j;
        if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
        int i3 = this.l;
        this.l = i3 + 1;
        this.k.put(view, Integer.valueOf(i3));
    }

    public final void b(View view) {
        this.j.remove(view);
        this.k.remove(view);
        if (this.i) {
            return;
        }
        c cVar = this.m;
        g0.r(cVar);
        g0.i3(cVar, 30L);
    }

    public final void c(Canvas canvas, View view, int i3, int i10, float f10, boolean z10) {
        if (canvas == null || view == null) {
            return;
        }
        canvas.save();
        Integer num = (Integer) this.k.get(view);
        if (num == null) {
            num = 0;
        }
        int i11 = this.g;
        int i12 = this.h;
        if (i3 > i11 || i10 > i12) {
            float max = Math.max(i3 / i11, i10 / i12);
            canvas.scale(max, max);
        }
        if (num.intValue() % 4 == 1) {
            canvas.rotate(180.0f, i11 / 2.0f, i12 / 2.0f);
        }
        if (num.intValue() % 4 == 2) {
            canvas.scale(-1.0f, 1.0f, i11 / 2.0f, i12 / 2.0f);
        }
        if (num.intValue() % 4 == 3) {
            canvas.scale(1.0f, -1.0f, i11 / 2.0f, i12 / 2.0f);
        }
        g40 g40Var = this.e;
        if (z10) {
            Bitmap bitmap = g40Var.getBitmap();
            if (bitmap != null) {
                Paint paint = new Paint(7);
                paint.setColor(-1);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                bitmap.recycle();
            }
        } else {
            g40Var.setAlpha(f10);
            g40Var.draw(canvas);
        }
        canvas.restore();
    }
}
