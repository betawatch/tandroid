// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class qmc extends cm2 {
    public final /* synthetic */ smc M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmc(smc smcVar) {
        super(R.drawable.wallet_gram_large, 0);
        this.M = smcVar;
    }

    @Override // cm2, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        smc smcVar = this.M;
        FrameLayout.LayoutParams layoutParams = smcVar.Q;
        if (smcVar.j0) {
            return;
        }
        this.x = 1.0f;
        if (smcVar.a) {
            float max = Math.max(0.0f, Math.min(1.0f, smcVar.U));
            if (max == 0.0f) {
                float intrinsicWidth = this.c.getIntrinsicWidth() * smcVar.b;
                float intrinsicHeight = this.c.getIntrinsicHeight();
                float f2 = smcVar.b;
                float f3 = intrinsicHeight * f2;
                float f4 = (f2 * f) + layoutParams.leftMargin;
                float height = ((smcVar.O.getHeight() / 2.0f) - (f3 / 2.0f)) + layoutParams.topMargin;
                smcVar.f.set(f4, height, intrinsicWidth + f4, f3 + height);
            }
            if (max < 1.0f) {
                if (smcVar.i0 == null) {
                    smcVar.i0 = new bnc(this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight());
                    smcVar.m();
                }
                Drawable drawable = this.c;
                smcVar.i0.setBounds(drawable.getBounds());
                bnc bncVar = smcVar.i0;
                bncVar.i = smcVar.g0.c;
                this.c = bncVar;
                this.d = false;
                this.x = 1.0f - max;
                super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
                this.c = drawable;
                this.d = true;
            }
            this.x = max;
            if (max == 0.0f) {
                return;
            }
        }
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }
}
