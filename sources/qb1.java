// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class qb1 extends Drawable {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final oy8 h;
    public final j7b i;
    public final /* synthetic */ j7b j;

    public qb1(j7b j7bVar, j7b j7bVar2) {
        this.j = j7bVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = 1.0f;
        this.i = j7bVar2;
        oy8 oy8Var = new oy8(R.raw.chat_audio_record_delete_3, gl.L(28.0f), gl.L(28.0f), false, null);
        this.h = oy8Var;
        oy8Var.p0 = true;
        paint.setColor(-2406842);
        oy8Var.a0 = true;
        oy8Var.L(-2406842, "Cup Red");
        oy8Var.L(-2406842, "Box");
        oy8Var.j();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z = this.g;
        oy8 oy8Var = this.h;
        if (z) {
            oy8Var.setAlpha((int) (this.b * 255.0f * this.c));
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
        oy8Var.setBounds(getBounds());
        if (this.g) {
            oy8Var.draw(canvas);
        }
        if (!this.g || !oy8Var.p()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), gl.L(5.0f), paint);
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
