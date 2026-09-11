package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class l2 {
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
    public final /* synthetic */ o2 t;
    public final e6 a = new e6(0.0f, (View) null, 0, 320, pr.h);
    public final RectF h = new RectF();
    public final RectF i = new RectF();
    public final Path l = new Path();
    public final Path m = new Path();
    public final Paint p = new Paint(1);
    public final Paint q = new Paint(1);

    public l2(o2 o2Var) {
        this.t = o2Var;
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
