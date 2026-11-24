// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qh2 extends hg5 {
    public final /* synthetic */ byte X0 = 0;
    public final Object Y0;
    public final Object Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh2(Activity activity) {
        super(activity, 3);
        int i = 0;
        this.Y0 = new p09[2];
        this.Z0 = new int[2];
        p(true);
        this.L = Layout.Alignment.ALIGN_NORMAL;
        this.d = 3200L;
        this.U = true;
        this.e = true;
        m(8.0f, 6.0f, 10.0f, 6.0f);
        this.v0 = 0.0f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        while (i < 2) {
            ((p09[]) this.Y0)[i] = new p09(i == 0 ? R.raw.ticks_single : R.raw.ticks_double, gm.L(24.0f), gm.L(24.0f));
            ((p09[]) this.Y0)[i].setCallback(this);
            if (i > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "x");
            spannableStringBuilder.setSpan(new ph2(((p09[]) this.Y0)[i]), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) jb6.M0(i == 0 ? 2131749055 : 2131749056, null));
            i++;
        }
        t(spannableStringBuilder);
    }

    @Override // hg5
    public final void c(Canvas canvas, float f) {
        switch (this.X0) {
            case 1:
                Paint paint = (Paint) this.Y0;
                lhc lhcVar = (lhc) this.Z0;
                paint.setShader(lhcVar.b().getShader());
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (Math.min(this.G.getAlpha(), lhcVar.b().getAlpha()) * f), 31);
                Path path = this.F0;
                canvas.drawPath(path, paint);
                if (lhcVar.e) {
                    paint.setShader(((Paint) lhcVar.d.a).getShader());
                    canvas.drawPath(path, paint);
                }
                canvas.restore();
                break;
            default:
                super.c(canvas, f);
                break;
        }
    }

    @Override // hg5, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.X0) {
            case 1:
                ((lhc) this.Z0).d(getX(), getY());
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // hg5, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.X0) {
            case 0:
                p09[] p09VarArr = (p09[]) this.Y0;
                return (p09VarArr != null && (drawable == p09VarArr[0] || drawable == p09VarArr[1])) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public qh2(Activity activity, int i, lhc lhcVar, boolean z) {
        super(activity, i);
        Paint paint = new Paint(1);
        this.Y0 = paint;
        this.Z0 = lhcVar;
        lhcVar.a(this);
        paint.setPathEffect(new CornerPathEffect(this.w));
        if (z) {
            j(true);
        }
    }
}
