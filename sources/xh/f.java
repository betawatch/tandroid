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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.v50;
import org.telegram.ui.o41;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class f {
    public static HashMap n;
    public final double a;
    public final double b;
    public final int c;
    public final o41 d;
    public final k60 e;
    public e f;
    public final int g;
    public final int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public int l = 0;
    public final d m = new d(this, 0);

    public f(int i10, o41 o41Var, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.a = d;
        this.b = d * 4.0d;
        this.c = i10;
        this.g = i11;
        this.h = i12;
        this.d = o41Var;
        k60 k60Var = new k60(this, o41Var.getContext(), 1);
        this.e = k60Var;
        k60Var.setSurfaceTextureListener(new v50(this, 5));
        k60Var.setOpaque(false);
        o41Var.addView(k60Var);
    }

    public static f d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view == null) {
            return null;
        }
        if (n == null) {
            n = new HashMap();
        }
        f fVar = (f) n.get(Integer.valueOf(i10));
        if (fVar == null) {
            int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
            if (devicePerformanceClass == 1) {
                Point point = AndroidUtilities.displaySize;
                min = Math.min(RichMessageLayout.PART_MAX_HEIGHT_DP, (int) (((point.x + point.y) / 2.0f) * 0.8f));
            } else if (devicePerformanceClass != 2) {
                Point point2 = AndroidUtilities.displaySize;
                min = Math.min(720, (int) (((point2.x + point2.y) / 2.0f) * 0.7f));
            } else {
                Point point3 = AndroidUtilities.displaySize;
                min = Math.min(1280, (int) (((point3.x + point3.y) / 2.0f) * 1.0f));
            }
            if (viewGroup == null) {
                return null;
            }
            HashMap hashMap = n;
            Integer valueOf = Integer.valueOf(i10);
            o41 o41Var = new o41(viewGroup.getContext(), 11);
            viewGroup.addView(o41Var);
            f fVar2 = new f(i10, o41Var, min, min);
            hashMap.put(valueOf, fVar2);
            fVar = fVar2;
        }
        fVar.a(view);
        return fVar;
    }

    public static f e(View view) {
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        ViewGroup viewGroup = null;
        if (findActivity != null) {
            View rootView = findActivity.findViewById(R.id.content).getRootView();
            if (rootView instanceof ViewGroup) {
                viewGroup = (ViewGroup) rootView;
            }
        }
        return d(0, view, viewGroup);
    }

    public static void f(boolean z10) {
        e eVar;
        HashMap hashMap = n;
        if (hashMap == null) {
            return;
        }
        for (f fVar : hashMap.values()) {
            if (fVar.c == 0 && (eVar = fVar.f) != null) {
                eVar.b = z10;
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
        int i10 = this.l;
        this.l = i10 + 1;
        this.k.put(view, Integer.valueOf(i10));
    }

    public final void b(View view) {
        this.j.remove(view);
        this.k.remove(view);
        if (this.i) {
            return;
        }
        d dVar = this.m;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 30L);
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f7, boolean z10) {
        if (canvas == null || view == null) {
            return;
        }
        canvas.save();
        Integer num = (Integer) this.k.get(view);
        if (num == null) {
            num = 0;
        }
        int i12 = this.g;
        int i13 = this.h;
        if (i10 > i12 || i11 > i13) {
            float max = Math.max(i10 / i12, i11 / i13);
            canvas.scale(max, max);
        }
        if (num.intValue() % 4 == 1) {
            canvas.rotate(180.0f, i12 / 2.0f, i13 / 2.0f);
        }
        if (num.intValue() % 4 == 2) {
            canvas.scale(-1.0f, 1.0f, i12 / 2.0f, i13 / 2.0f);
        }
        if (num.intValue() % 4 == 3) {
            canvas.scale(1.0f, -1.0f, i12 / 2.0f, i13 / 2.0f);
        }
        k60 k60Var = this.e;
        if (z10) {
            Bitmap bitmap = k60Var.getBitmap();
            if (bitmap != null) {
                Paint paint = new Paint(7);
                paint.setColor(-1);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                bitmap.recycle();
            }
        } else {
            k60Var.setAlpha(f7);
            k60Var.draw(canvas);
        }
        canvas.restore();
    }
}
