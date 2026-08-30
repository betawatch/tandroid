package ph;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gj0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class o extends Drawable {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final gj0 h;
    public final t9 i;
    public final /* synthetic */ t9 j;

    public o(t9 t9Var, t9 t9Var2) {
        this.j = t9Var;
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = 1.0f;
        this.i = t9Var2;
        int i10 = R.raw.chat_audio_record_delete_3;
        gj0 gj0Var = new gj0(i10, kh.a2.j(i10, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = gj0Var;
        gj0Var.m0 = true;
        paint.setColor(-2406842);
        gj0Var.X = true;
        gj0Var.O(-2406842, "Cup Red");
        gj0Var.O(-2406842, "Box");
        gj0Var.m();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z4 = this.g;
        gj0 gj0Var = this.h;
        if (z4) {
            gj0Var.setAlpha((int) (this.b * 255.0f * this.c));
        }
        int i10 = (int) (this.b * 255.0f * this.c);
        Paint paint = this.a;
        paint.setAlpha(i10);
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (this.e || this.g) {
            float f10 = (currentTimeMillis / 600.0f) + this.b;
            this.b = f10;
            if (f10 >= 1.0f) {
                this.b = 1.0f;
                this.e = false;
            }
        } else {
            float f11 = this.b - (currentTimeMillis / 600.0f);
            this.b = f11;
            if (f11 <= 0.0f) {
                this.b = 0.0f;
                this.e = true;
            }
        }
        this.d = System.currentTimeMillis();
        gj0Var.setBounds(getBounds());
        if (this.g) {
            gj0Var.draw(canvas);
        }
        if (!this.g || !gj0Var.s()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
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
