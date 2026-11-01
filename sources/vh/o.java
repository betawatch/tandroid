package vh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ci0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class o extends Drawable {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final ci0 h;
    public final e8 i;
    public final /* synthetic */ e8 j;

    public o(e8 e8Var, e8 e8Var2) {
        this.j = e8Var;
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = 1.0f;
        this.i = e8Var2;
        ci0 ci0Var = new ci0(R.raw.chat_audio_record_delete_3, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), false, null);
        this.h = ci0Var;
        ci0Var.o0 = true;
        paint.setColor(-2406842);
        ci0Var.Z = true;
        ci0Var.Q(-2406842, "Cup Red");
        ci0Var.Q(-2406842, "Box");
        ci0Var.o();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10 = this.g;
        ci0 ci0Var = this.h;
        if (z10) {
            ci0Var.setAlpha((int) (this.b * 255.0f * this.c));
        }
        int i10 = (int) (this.b * 255.0f * this.c);
        Paint paint = this.a;
        paint.setAlpha(i10);
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (this.e || this.g) {
            float f7 = (currentTimeMillis / 600.0f) + this.b;
            this.b = f7;
            if (f7 >= 1.0f) {
                this.b = 1.0f;
                this.e = false;
            }
        } else {
            float f10 = this.b - (currentTimeMillis / 600.0f);
            this.b = f10;
            if (f10 <= 0.0f) {
                this.b = 0.0f;
                this.e = true;
            }
        }
        this.d = System.currentTimeMillis();
        ci0Var.setBounds(getBounds());
        if (this.g) {
            ci0Var.draw(canvas);
        }
        if (!this.g || !ci0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), org.telegram.messenger.i0.L(5.0f), paint);
        }
        this.j.invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.c = i10 / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
