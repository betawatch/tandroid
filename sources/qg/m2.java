package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class m2 {
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
    public final /* synthetic */ p2 t;
    public final e6 a = new e6(0.0f, (View) null, 0, 320, rr.h);
    public final RectF h = new RectF();
    public final RectF i = new RectF();
    public final Path l = new Path();
    public final Path m = new Path();
    public final Paint p = new Paint(1);
    public final Paint q = new Paint(1);

    public m2(p2 p2Var) {
        this.t = p2Var;
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
