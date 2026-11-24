// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vd1 extends Drawable {
    public final /* synthetic */ byte a;
    public float b;
    public Object c;
    public Object d;

    public vd1(Context context, int i) {
        this.a = (byte) 2;
        this.b = 0.75f;
        this.c = b00.d(context, R.drawable.filled_stream_crown);
        tgb tgbVar = new tgb(String.valueOf(i), 8.0f, gl.n1("fonts/num.otf"));
        this.d = tgbVar;
        tgbVar.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                wd1 wd1Var = (wd1) this.d;
                int i = wd1Var.e;
                Matrix matrix = wd1Var.i;
                wd1Var.f = getBounds().width();
                RectF rectF = gl.P;
                rectF.set(getBounds());
                wd1Var.a(this.b, canvas, rectF, null);
                kcb kcbVar = (kcb) this.c;
                if (kcbVar != null) {
                    kcbVar.c = wd1Var.a;
                    int i2 = wd1Var.f;
                    float f = (((i << 1) + i2) * wd1Var.g) - i;
                    int i3 = (int) (i2 * 0.5f);
                    int width = getBounds().width();
                    float f2 = width / kcbVar.e;
                    float height = getBounds().height() / kcbVar.f;
                    float max = kcbVar.s ? Math.max(f2, height) : Math.min(f2, height);
                    matrix.reset();
                    matrix.setScale(1.0f / max, 0.0f, i / 2.0f, 0.0f);
                    matrix.setTranslate((f - kcbVar.getBounds().left) - (i / max), 0.0f);
                    wd1Var.b.setLocalMatrix(matrix);
                    int i4 = i3 / 2;
                    kcbVar.setBounds(getBounds().centerX() - i4, getBounds().centerY() - i4, getBounds().centerX() + i4, getBounds().centerY() + i4);
                    kcbVar.draw(canvas);
                }
                wd1Var.o.invalidate();
                break;
            case 1:
                float f3 = getBounds().left;
                float f4 = getBounds().top;
                float f5 = getBounds().right;
                float f6 = getBounds().bottom;
                float f7 = this.b;
                canvas.drawRoundRect(f3, f4, f5, f6, f7, f7, (Paint) this.d);
                kq3.e((Drawable) this.c, getBounds().exactCenterX(), getBounds().exactCenterY(), gl.L(36.0f), gl.L(36.0f), 17);
                ((Drawable) this.c).draw(canvas);
                break;
            case 2:
                Rect bounds = getBounds();
                canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, kk7.d4, 31);
                Drawable drawable = (Drawable) this.c;
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                ((tgb) this.d).c(bounds.centerX() - (((tgb) this.d).c / 2.0f), gl.L(0.15f) + bounds.centerY(), drawable.getAlpha() / 255.0f, -1, canvas);
                canvas.restore();
                break;
            default:
                Paint paint = (Paint) this.d;
                if (this.b != gl.p) {
                    f();
                }
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                canvas.drawPath((Path) this.c, paint);
                canvas.drawRect(gl.N(7.56f), gl.N(8.0f), gl.L(18.0f) - gl.N(7.56f), gl.N(11.1f), paint);
                canvas.restore();
                break;
        }
    }

    public final void f() {
        int L = gl.L(18.0f);
        Path path = (Path) this.c;
        path.reset();
        float f = L >> 1;
        path.moveTo(f, gl.N(4.98f));
        path.lineTo(gl.N(4.95f), gl.N(9.0f));
        path.lineTo(L - gl.N(4.95f), gl.N(9.0f));
        path.lineTo(f, gl.N(4.98f));
        Paint paint = (Paint) this.d;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(gl.N(1.0f));
        this.b = gl.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        switch (this.a) {
            case 2:
                return ((Drawable) this.c).getAlpha();
            default:
                return super.getAlpha();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 2:
                return (int) (((Drawable) this.c).getIntrinsicHeight() * this.b);
            case 3:
                return gl.L(18.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 2:
                return (int) (((Drawable) this.c).getIntrinsicWidth() * this.b);
            case 3:
                return gl.L(18.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
            case 1:
                return -3;
            case 2:
                return -2;
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                wd1 wd1Var = (wd1) this.d;
                wd1Var.a.setAlpha(i);
                wd1Var.c.setAlpha(i);
                break;
            case 2:
                ((Drawable) this.c).setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 2:
                ((Drawable) this.c).setColorFilter(colorFilter);
                break;
        }
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }

    private final void e(ColorFilter colorFilter) {
    }

    public vd1(Context context, float f) {
        this.a = (byte) 1;
        Paint paint = new Paint(1);
        this.d = paint;
        this.c = context.getResources().getDrawable(R.drawable.msg_filled_menu_groups);
        paint.setColor(bkb.p1(0.1552f, -16777216));
        this.b = f;
    }

    public vd1(wd1 wd1Var, kcb kcbVar) {
        this.a = (byte) 0;
        this.d = wd1Var;
        this.c = kcbVar;
    }

    public /* synthetic */ vd1() {
        this.a = (byte) 3;
    }
}
