// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class z78 extends de0 {
    public final Paint H;
    public long I;
    public Drawable J;
    public Drawable K;
    public final /* synthetic */ d88 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z78(d88 d88Var, Context context) {
        super(context);
        this.L = d88Var;
        this.H = new Paint(1);
    }

    @Override // de0, android.view.View
    public final void onDraw(Canvas canvas) {
        no6 no6Var;
        Drawable drawable;
        wl wlVar = this.e;
        ImageReceiver imageReceiver = wlVar != null ? wlVar.k : this.a;
        if (imageReceiver != null) {
            if (this.c == -1 || this.d == -1) {
                imageReceiver.i0(0.0f, 0.0f, getWidth(), getHeight());
                this.b.i0(0.0f, 0.0f, getWidth(), getHeight());
            } else {
                float width = (getWidth() - this.c) / 2;
                int height = getHeight();
                imageReceiver.i0(width, (height - r5) / 2, this.c, this.d);
                ImageReceiver imageReceiver2 = this.b;
                float width2 = (getWidth() - this.c) / 2;
                int height2 = getHeight();
                imageReceiver2.i0(width2, (height2 - r6) / 2, this.c, this.d);
            }
            imageReceiver.h(canvas, null);
            d88 d88Var = this.L;
            if (d88Var.P) {
                this.b.h(canvas, null);
                if (d88Var.O == null) {
                    if (d88Var.N == null) {
                        npa npaVar = new npa();
                        d88Var.N = npaVar;
                        npaVar.h(vm2.o(-1, 82));
                    }
                    d88Var.N.setBounds(0, 0, getWidth(), getHeight());
                    d88Var.N.draw(canvas);
                }
                invalidate();
            }
            float f = d88Var.V;
            Bitmap bitmap = d88Var.T;
            if (f != 1.0f) {
                if (bitmap != null) {
                    int interpolation = (int) (k43.f.getInterpolation(1.0f - f) * 255.0f);
                    Paint paint = this.H;
                    paint.setAlpha(interpolation);
                    canvas.drawBitmap(d88Var.T, 0.0f, 0.0f, paint);
                    long min = Math.min(16L, System.currentTimeMillis() - this.I);
                    Float f2 = d88Var.U;
                    d88Var.V = qu6.z(min, f2 == null ? 250.0f : f2.floatValue(), d88Var.V, 1.0f);
                    this.I = System.currentTimeMillis();
                    invalidate();
                    if (d88Var.O != null) {
                        d88Var.b.invalidate();
                    }
                }
            } else if (bitmap != null) {
                bitmap.recycle();
                d88Var.T = null;
                d88Var.U = null;
                invalidate();
            }
            if (d88Var.s) {
                b88 b88Var = d88Var.W;
                if ((b88Var == null || !((u52) ((rd1) b88Var).b).s) && (no6Var = d88Var.I) != null && no6Var.i() && d88Var.I.d()) {
                    if (d88Var.I.j()) {
                        drawable = this.K;
                        if (drawable == null) {
                            drawable = getContext().getResources().getDrawable(R.drawable.media_live_off).mutate();
                            this.K = drawable;
                        }
                    } else {
                        drawable = this.J;
                        if (drawable == null) {
                            drawable = getContext().getResources().getDrawable(R.drawable.media_live_on).mutate();
                            this.J = drawable;
                        }
                    }
                    drawable.setBounds((int) (imageReceiver.L0 + hl.L(8.0f)), (int) (imageReceiver.M0 + hl.L(8.0f)), (int) (imageReceiver.L0 + hl.L(30.0f)), (int) (imageReceiver.M0 + hl.L(26.0f)));
                    drawable.draw(canvas);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d88 d88Var = this.L;
        no6 no6Var = d88Var.I;
        d88Var.h(no6Var != null && no6Var.M);
    }
}
