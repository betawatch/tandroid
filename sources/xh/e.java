package xh;

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
import org.telegram.messenger.g0;
import org.telegram.messenger.iz;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.w30;
import org.telegram.ui.sq0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class e {
    public static HashMap n;
    public final double a;
    public final double b;
    public final int c;
    public final sq0 d;
    public final k40 e;
    public d f;
    public final int g;
    public final int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public int l = 0;
    public final c m = new c(this, 0);

    public e(int i7, sq0 sq0Var, int i10, int i11) {
        double d = 1.0d / ((int) g0.r);
        this.a = d;
        this.b = d * 4.0d;
        this.c = i7;
        this.g = i10;
        this.h = i11;
        this.d = sq0Var;
        k40 k40Var = new k40(2, sq0Var.getContext(), this);
        this.e = k40Var;
        k40Var.setSurfaceTextureListener(new w30(this, 5));
        k40Var.setOpaque(false);
        sq0Var.addView(k40Var);
    }

    public static e d(int i7, View view, ViewGroup viewGroup) {
        int min;
        if (view == null) {
            return null;
        }
        if (n == null) {
            n = new HashMap();
        }
        e eVar = (e) n.get(Integer.valueOf(i7));
        if (eVar == null) {
            int o4 = iz.o();
            if (o4 == 1) {
                Point point = g0.q;
                min = Math.min(900, (int) (((point.x + point.y) / 2.0f) * 0.8f));
            } else if (o4 != 2) {
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
            Integer valueOf = Integer.valueOf(i7);
            sq0 sq0Var = new sq0(viewGroup.getContext(), 20);
            viewGroup.addView(sq0Var);
            e eVar2 = new e(i7, sq0Var, min, min);
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

    public static void f(boolean z9) {
        d dVar;
        HashMap hashMap = n;
        if (hashMap == null) {
            return;
        }
        for (e eVar : hashMap.values()) {
            if (eVar.c == 0 && (dVar = eVar.f) != null) {
                dVar.b = z9;
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
        int i7 = this.l;
        this.l = i7 + 1;
        this.k.put(view, Integer.valueOf(i7));
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

    public final void c(Canvas canvas, View view, int i7, int i10, float f10, boolean z9) {
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
        if (i7 > i11 || i10 > i12) {
            float max = Math.max(i7 / i11, i10 / i12);
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
        k40 k40Var = this.e;
        if (z9) {
            Bitmap bitmap = k40Var.getBitmap();
            if (bitmap != null) {
                Paint paint = new Paint(7);
                paint.setColor(-1);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                bitmap.recycle();
            }
        } else {
            k40Var.setAlpha(f10);
            k40Var.draw(canvas);
        }
        canvas.restore();
    }
}
