// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class qoc extends pn2 {
    public final /* synthetic */ soc M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qoc(soc socVar) {
        super(R.drawable.wallet_gram_large, 0);
        this.M = socVar;
    }

    @Override // pn2, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        soc socVar = this.M;
        FrameLayout.LayoutParams layoutParams = socVar.Q;
        if (socVar.j0) {
            return;
        }
        this.x = 1.0f;
        if (socVar.a) {
            float max = Math.max(0.0f, Math.min(1.0f, socVar.U));
            if (max == 0.0f) {
                float intrinsicWidth = this.c.getIntrinsicWidth() * socVar.b;
                float intrinsicHeight = this.c.getIntrinsicHeight();
                float f2 = socVar.b;
                float f3 = intrinsicHeight * f2;
                float f4 = (f2 * f) + layoutParams.leftMargin;
                float height = ((socVar.O.getHeight() / 2.0f) - (f3 / 2.0f)) + layoutParams.topMargin;
                socVar.f.set(f4, height, intrinsicWidth + f4, f3 + height);
            }
            if (max < 1.0f) {
                if (socVar.i0 == null) {
                    socVar.i0 = new bpc(this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight());
                    socVar.m();
                }
                Drawable drawable = this.c;
                socVar.i0.setBounds(drawable.getBounds());
                bpc bpcVar = socVar.i0;
                bpcVar.i = socVar.g0.c;
                this.c = bpcVar;
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
