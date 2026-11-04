package ug;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z1 {
    public boolean b;
    public int c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f;
    public Bitmap g;
    public float j;
    public float k;
    public int n;
    public float[] o;
    public final Paint r;
    public final Paint s;
    public final /* synthetic */ c2 t;
    public final u5 a = new u5(0.0f, (View) null, 0, 320, xq.h);
    public final RectF h = new RectF();
    public final RectF i = new RectF();
    public final Path l = new Path();
    public final Path m = new Path();
    public final Paint p = new Paint(1);
    public final Paint q = new Paint(1);

    public z1(c2 c2Var) {
        this.t = c2Var;
        new Paint(1);
        this.r = new Paint(1);
        this.s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.g;
        return bitmap != null ? bitmap : this.f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.e;
        return bitmap != null ? bitmap : this.d;
    }

    public final Bitmap c() {
        Bitmap createBitmap = Bitmap.createBitmap(b().getWidth(), b().getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-16777216);
        Paint paint = new Paint(3);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas.drawBitmap(b(), 0.0f, 0.0f, paint);
        return createBitmap;
    }
}
