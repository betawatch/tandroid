// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class yb1 extends Drawable {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final b29 h;
    public final ibb i;
    public final /* synthetic */ ibb j;

    public yb1(ibb ibbVar, ibb ibbVar2) {
        this.j = ibbVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = 1.0f;
        this.i = ibbVar2;
        b29 b29Var = new b29(R.raw.chat_audio_record_delete_3, hl.L(28.0f), hl.L(28.0f), false, null);
        this.h = b29Var;
        b29Var.p0 = true;
        paint.setColor(-2406842);
        b29Var.a0 = true;
        b29Var.L(-2406842, "Cup Red");
        b29Var.L(-2406842, "Box");
        b29Var.j();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z = this.g;
        b29 b29Var = this.h;
        if (z) {
            b29Var.setAlpha((int) (this.b * 255.0f * this.c));
        }
        int i = (int) (this.b * 255.0f * this.c);
        Paint paint = this.a;
        paint.setAlpha(i);
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (this.e || this.g) {
            float f = (currentTimeMillis / 600.0f) + this.b;
            this.b = f;
            if (f >= 1.0f) {
                this.b = 1.0f;
                this.e = false;
            }
        } else {
            float f2 = this.b - (currentTimeMillis / 600.0f);
            this.b = f2;
            if (f2 <= 0.0f) {
                this.b = 0.0f;
                this.e = true;
            }
        }
        this.d = System.currentTimeMillis();
        b29Var.setBounds(getBounds());
        if (this.g) {
            b29Var.draw(canvas);
        }
        if (!this.g || !b29Var.p()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), hl.L(5.0f), paint);
        }
        this.j.invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c = i / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
