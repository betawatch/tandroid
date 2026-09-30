package vh;

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
import org.telegram.ui.Components.a60;
import org.telegram.ui.m51;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class f {
    public static HashMap n;
    public final double a;
    public final double b;
    public final int c;
    public final m51 d;
    public final a60 e;
    public e f;
    public final int g;
    public final int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public int l = 0;
    public final d m = new d(this, 0);

    public f(int i10, m51 m51Var, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.a = d;
        this.b = d * 4.0d;
        this.c = i10;
        this.g = i11;
        this.h = i12;
        this.d = m51Var;
        a60 a60Var = new a60(this, m51Var.getContext(), 1);
        this.e = a60Var;
        a60Var.setSurfaceTextureListener(new ki.d(this, 5));
        a60Var.setOpaque(false);
        m51Var.addView(a60Var);
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
            m51 m51Var = new m51(viewGroup.getContext(), 11);
            viewGroup.addView(m51Var);
            f fVar2 = new f(i10, m51Var, min, min);
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
        a60 a60Var = this.e;
        if (z10) {
            Bitmap bitmap = a60Var.getBitmap();
            if (bitmap != null) {
                Paint paint = new Paint(7);
                paint.setColor(-1);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                bitmap.recycle();
            }
        } else {
            a60Var.setAlpha(f7);
            a60Var.draw(canvas);
        }
        canvas.restore();
    }
}
