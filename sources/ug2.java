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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ug2 extends kg5 {
    public final /* synthetic */ byte X0 = 0;
    public final Object Y0;
    public final Object Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug2(Activity activity) {
        super(activity, 3);
        int i = 0;
        this.Y0 = new b29[2];
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
            ((b29[]) this.Y0)[i] = new b29(i == 0 ? R.raw.ticks_single : R.raw.ticks_double, hl.L(24.0f), hl.L(24.0f));
            ((b29[]) this.Y0)[i].setCallback(this);
            if (i > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "x");
            spannableStringBuilder.setSpan(new tg2(((b29[]) this.Y0)[i]), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) ob6.M0(i == 0 ? 2131749052 : 2131749053, null));
            i++;
        }
        t(spannableStringBuilder);
    }

    @Override // kg5
    public final void c(Canvas canvas, float f) {
        switch (this.X0) {
            case 1:
                Paint paint = (Paint) this.Y0;
                kjc kjcVar = (kjc) this.Z0;
                paint.setShader(kjcVar.b().getShader());
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (Math.min(this.G.getAlpha(), kjcVar.b().getAlpha()) * f), 31);
                Path path = this.F0;
                canvas.drawPath(path, paint);
                if (kjcVar.e) {
                    paint.setShader(((Paint) kjcVar.d.a).getShader());
                    canvas.drawPath(path, paint);
                }
                canvas.restore();
                break;
            default:
                super.c(canvas, f);
                break;
        }
    }

    @Override // kg5, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.X0) {
            case 1:
                ((kjc) this.Z0).d(getX(), getY());
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // kg5, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.X0) {
            case 0:
                b29[] b29VarArr = (b29[]) this.Y0;
                return (b29VarArr != null && (drawable == b29VarArr[0] || drawable == b29VarArr[1])) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public ug2(Activity activity, int i, kjc kjcVar, boolean z) {
        super(activity, i);
        Paint paint = new Paint(1);
        this.Y0 = paint;
        this.Z0 = kjcVar;
        kjcVar.a(this);
        paint.setPathEffect(new CornerPathEffect(this.w));
        if (z) {
            j(true);
        }
    }
}
