// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class qy1 extends ry8 {
    public final lm E;
    public final ny1 F;
    public oy1 r;
    public py1 s;
    public final byte w;
    public boolean x;
    public Drawable y;

    /* JADX WARN: Multi-variable type inference failed */
    public qy1(Context context, int i) {
        super(context);
        this.E = new lm(this, 0L, 320L, s33.h);
        this.F = new ny1(this, (byte) 0);
        this.w = i;
    }

    public oy1 getCurrentState() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(oy1 oy1Var, boolean z) {
        py1 py1Var;
        int ordinal;
        py1 py1Var2;
        py1 py1Var3;
        if (z && oy1Var == this.r) {
            return;
        }
        oy1 oy1Var2 = this.r;
        this.r = oy1Var;
        ny1 ny1Var = this.F;
        if (z && oy1Var2 != null) {
            py1[] values = py1.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    py1Var2 = null;
                    break;
                }
                py1Var2 = values[i];
                if (py1Var2.a == oy1Var2 && py1Var2.b == oy1Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (py1Var2 != null) {
                oy1 oy1Var3 = this.r;
                py1[] values2 = py1.values();
                int length2 = values2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        py1Var3 = null;
                        break;
                    }
                    py1Var3 = values2[i2];
                    if (py1Var3.a == oy1Var2 && py1Var3.b == oy1Var3) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (py1Var3 != this.s) {
                    this.s = py1Var3;
                    oy8 oy8Var = (oy8) ny1Var.get(py1Var3);
                    oy8Var.stop();
                    if (py1Var3 == py1.e) {
                        oy8Var.K(30);
                        oy8Var.O(false, 0.0f);
                    } else if (py1Var3 == py1.d) {
                        oy8Var.K(60);
                        oy8Var.O(false, 0.5f);
                    } else {
                        oy8Var.O(false, 0.0f);
                    }
                    oy8Var.F(0);
                    oy8Var.u0 = new hq1(this, (byte) 12);
                    setAnimation(oy8Var);
                    gl.c3(new pk1(oy8Var, (byte) 8));
                    ordinal = oy1Var.ordinal();
                    if (ordinal != 0) {
                        setContentDescription(k96.M0(2131754733, null));
                        return;
                    } else {
                        if (ordinal != 1) {
                            return;
                        }
                        setContentDescription(k96.M0(2131754735, null));
                        return;
                    }
                }
                return;
            }
        }
        oy1 oy1Var4 = this.r;
        py1[] values3 = py1.values();
        int length3 = values3.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                py1Var = null;
                break;
            }
            py1Var = values3[i3];
            if (py1Var.a == oy1Var4) {
                break;
            } else {
                i3++;
            }
        }
        oy8 oy8Var2 = (oy8) ny1Var.get(py1Var);
        oy8Var2.stop();
        oy8Var2.O(false, oy1Var != oy1.a ? 0.0f : 0.5f);
        setAnimation(oy8Var2);
        ordinal = oy1Var.ordinal();
        if (ordinal != 0) {
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.E.d(this.x);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        if (d < 1.0f) {
            if (d > 0.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - d) * 255.0f), 31);
            } else {
                canvas2 = canvas;
                canvas2.save();
            }
            float A = tb4.A(1.0f, d, 0.6f, 0.4f);
            canvas2.scale(A, A, width, height);
            super.onDraw(canvas);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (d > 0.0f) {
            Drawable drawable = this.y;
            if (drawable == null) {
                drawable = getContext().getResources().getDrawable(R.drawable.msg_edit).mutate();
                this.y = drawable;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
            int intrinsicHeight = this.y.getIntrinsicHeight() / 2;
            int i = (int) width;
            int i2 = (int) height;
            this.y.setBounds(i - intrinsicWidth, i2 - intrinsicHeight, i + intrinsicWidth, i2 + intrinsicHeight);
            this.y.setColorFilter(getColorFilter());
            this.y.setAlpha((int) (255.0f * d));
            canvas2.save();
            float f = (d * 0.6f) + 0.4f;
            canvas2.scale(f, f, width, height);
            this.y.draw(canvas2);
            canvas2.restore();
        }
    }

    public qy1(Context context) {
        this(context, 32);
    }
}
