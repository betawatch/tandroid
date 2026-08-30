package vf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class f {
    public Bitmap a;
    public Canvas b;
    public final RectF c = new RectF();
    public final Paint d;
    public final f6 e;
    public int f;
    public boolean g;

    public f(f6 f6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f = 0;
        this.g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.e = f6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f || this.g) {
            this.g = false;
            this.f = i12;
            this.a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.b = new Canvas(this.a);
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.b.drawColor(j6.v0(j6.d6, this.e));
            this.b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.a;
    }
}
