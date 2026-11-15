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
import org.telegram.messenger.gz;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.z30;
import org.telegram.ui.eh0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class e {
    public static HashMap n;
    public final double a;
    public final double b;
    public final int c;
    public final eh0 d;
    public final n40 e;
    public d f;
    public final int g;
    public final int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public int l = 0;
    public final c m = new c(this, 0);

    public e(int i7, eh0 eh0Var, int i10, int i11) {
        double d = 1.0d / ((int) g0.r);
        this.a = d;
        this.b = d * 4.0d;
        this.c = i7;
        this.g = i10;
        this.h = i11;
        this.d = eh0Var;
        n40 n40Var = new n40(2, eh0Var.getContext(), this);
        this.e = n40Var;
        n40Var.setSurfaceTextureListener(new z30(this, 4));
        n40Var.setOpaque(false);
        eh0Var.addView(n40Var);
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
            int o4 = gz.o();
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
            eh0 eh0Var = new eh0(viewGroup.getContext(), 22);
            viewGroup.addView(eh0Var);
            e eVar2 = new e(i7, eh0Var, min, min);
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

    public final void c(Canvas canvas, View view, int i7, int i10, float f10, boolean z10) {
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
        n40 n40Var = this.e;
        if (z10) {
            Bitmap bitmap = n40Var.getBitmap();
            if (bitmap != null) {
                Paint paint = new Paint(7);
                paint.setColor(-1);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                bitmap.recycle();
            }
        } else {
            n40Var.setAlpha(f10);
            n40Var.draw(canvas);
        }
        canvas.restore();
    }
}
