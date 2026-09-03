package qh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hj0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class o extends Drawable {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final hj0 h;
    public final q9 i;
    public final /* synthetic */ q9 j;

    public o(q9 q9Var, q9 q9Var2) {
        this.j = q9Var;
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = 1.0f;
        this.i = q9Var2;
        hj0 hj0Var = new hj0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = hj0Var;
        hj0Var.m0 = true;
        paint.setColor(-2406842);
        hj0Var.X = true;
        hj0Var.O(-2406842, "Cup Red");
        hj0Var.O(-2406842, "Box");
        hj0Var.m();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z4 = this.g;
        hj0 hj0Var = this.h;
        if (z4) {
            hj0Var.setAlpha((int) (this.b * 255.0f * this.c));
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
        hj0Var.setBounds(getBounds());
        if (this.g) {
            hj0Var.draw(canvas);
        }
        if (!this.g || !hj0Var.s()) {
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
