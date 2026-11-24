// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class qh4 extends View {
    public static final byte E;
    public static final int[] F;
    public static final int[] G;
    public static final int[] H;
    public static final Paint[] s;
    public static Drawable[] w;
    public static Drawable[] x;
    public static final byte y;
    public final RectF a;
    public long b;
    public boolean c;
    public boolean d;
    public float e;
    public int f;
    public boolean h;
    public boolean n;
    public final ArrayList r;

    static {
        y = gba.o() == 0 ? (byte) 50 : (byte) 60;
        E = gba.o() == 0 ? (byte) 20 : (byte) 30;
        F = new int[]{-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        G = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        H = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        s = new Paint[6];
        int i = 0;
        while (true) {
            Paint[] paintArr = s;
            if (i >= paintArr.length) {
                return;
            }
            Paint paint = new Paint(1);
            paintArr[i] = paint;
            paint.setColor(F[i]);
            i++;
        }
    }

    public qh4(Context context) {
        super(context);
        this.a = new RectF();
        this.e = 1.0f;
        this.r = new ArrayList(y + E);
    }

    private int getHeightForAnimation() {
        return getMeasuredHeight() == 0 ? ((View) getParent()).getHeight() : getMeasuredHeight();
    }

    private int getWidthForAnimation() {
        return getMeasuredWidth() == 0 ? ((View) getParent()).getWidth() : getMeasuredWidth();
    }

    public final ph4 a(boolean z) {
        ph4 ph4Var = new ph4(this);
        try {
            SecureRandom secureRandom = Utilities.b;
            byte nextInt = (byte) secureRandom.nextInt(2);
            ph4Var.a = nextInt;
            if (this.h && nextInt == 0) {
                ph4Var.a = (byte) 2;
                ph4Var.b = (byte) secureRandom.nextInt(G.length);
            } else if (this.n && secureRandom.nextBoolean()) {
                ph4Var.a = (byte) 2;
                ph4Var.b = (byte) secureRandom.nextInt(H.length);
            } else {
                ph4Var.b = (byte) secureRandom.nextInt(F.length);
            }
            ph4Var.c = (byte) secureRandom.nextInt(2);
            ph4Var.f = (byte) (secureRandom.nextInt(2) + 1);
            byte b = ph4Var.a;
            if (b == 0 || b == 2) {
                ph4Var.d = (byte) ((secureRandom.nextFloat() * 2.0f) + 4.0f);
            } else {
                ph4Var.d = (byte) ((secureRandom.nextFloat() * 4.0f) + 4.0f);
            }
            if (z) {
                ph4Var.h = (-secureRandom.nextFloat()) * getHeightForAnimation() * 1.2f;
                ph4Var.g = gl.L(5.0f) + secureRandom.nextInt(Math.max(1, getWidthForAnimation() - gl.L(10.0f)));
                ph4Var.e = ph4Var.f;
                return ph4Var;
            }
            int L = gl.L(secureRandom.nextInt(10) + 4);
            int heightForAnimation = getHeightForAnimation() / 4;
            if (ph4Var.c == 0) {
                ph4Var.g = -L;
            } else {
                ph4Var.g = getWidthForAnimation() + L;
            }
            ph4Var.j = ((secureRandom.nextFloat() * gl.L(4.0f)) + gl.L(1.2f)) * (ph4Var.c == 0 ? 1 : -1);
            ph4Var.k = -((secureRandom.nextFloat() * gl.L(4.0f)) + gl.L(4.0f));
            ph4Var.h = (heightForAnimation / 2) + secureRandom.nextInt(Math.max(1, heightForAnimation << 1));
            return ph4Var;
        } catch (Exception e) {
            fa4.g(e, true);
            return ph4Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r4 != 14) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(boolean z) {
        this.n = z;
        setLayerType(2, null);
        boolean z2 = true;
        this.c = true;
        this.d = false;
        this.f = 0;
        this.e = 1.0f;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i = calendar.get(5);
        if (calendar.get(2) == 1) {
            boolean z3 = w01.a;
        }
        z2 = false;
        this.h = z2;
        if (z2) {
            if (w == null) {
                w = new Drawable[G.length];
                int i2 = 0;
                while (true) {
                    Drawable[] drawableArr = w;
                    if (i2 >= drawableArr.length) {
                        break;
                    }
                    drawableArr[i2] = b00.d(a.b, R.drawable.heart_confetti);
                    w[i2].setColorFilter(new PorterDuffColorFilter(G[i2], PorterDuff.Mode.MULTIPLY));
                    i2++;
                }
            }
        } else if (z && x == null) {
            x = new Drawable[H.length];
            int i3 = 0;
            while (true) {
                Drawable[] drawableArr2 = x;
                if (i3 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i3] = b00.d(a.b, R.drawable.msg_settings_premium);
                x[i3].setColorFilter(new PorterDuffColorFilter(H[i3], PorterDuff.Mode.MULTIPLY));
                i3++;
            }
        }
        byte b = y;
        int j = Utilities.j(b - this.r.size(), b, b / 3);
        for (int i4 = 0; i4 < j; i4++) {
            this.r.add(a(false));
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float A;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = (int) (elapsedRealtime - this.b);
        this.b = elapsedRealtime;
        if (i > 18) {
            i = 16;
        }
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            ph4 ph4Var = (ph4) arrayList.get(i2);
            qh4 qh4Var = ph4Var.l;
            byte b = ph4Var.a;
            Paint[] paintArr = s;
            if (b == 0) {
                f = 2.0f;
                canvas.drawCircle(ph4Var.g, ph4Var.h, gl.L(ph4Var.d), paintArr[ph4Var.b]);
                f2 = 16.0f;
            } else {
                f = 2.0f;
                if (b == 1) {
                    RectF rectF = qh4Var.a;
                    f2 = 16.0f;
                    rectF.set(ph4Var.g - gl.L(ph4Var.d), ph4Var.h - gl.L(2.0f), ph4Var.g + gl.L(ph4Var.d), ph4Var.h + gl.L(2.0f));
                    canvas.save();
                    canvas.rotate(ph4Var.i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), paintArr[ph4Var.b]);
                    canvas.restore();
                } else {
                    f2 = 16.0f;
                    if (b == 2) {
                        Drawable[] drawableArr = x;
                        Drawable drawable = drawableArr != null ? drawableArr[ph4Var.b] : null;
                        Drawable[] drawableArr2 = w;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[ph4Var.b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i3 = (int) ph4Var.g;
                            int i4 = (int) ph4Var.h;
                            drawable.setBounds(i3 - intrinsicWidth, i4 - intrinsicHeight, i3 + intrinsicWidth, i4 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(ph4Var.i, ph4Var.g, ph4Var.h);
                            float f3 = ph4Var.d / 6.0f;
                            canvas.scale(f3, f3, ph4Var.g, ph4Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            qh4 qh4Var2 = ph4Var.l;
            float f4 = i / f2;
            float f5 = ph4Var.g;
            float f6 = ph4Var.j;
            ph4Var.g = (f6 * f4) + f5;
            ph4Var.h = (ph4Var.k * f4) + ph4Var.h;
            if (ph4Var.e != 0) {
                float L = gl.L(1.0f) * 0.5f;
                byte b2 = ph4Var.e;
                float f7 = ph4Var.j;
                if (b2 == 1) {
                    float w2 = b00.w(L, f4, 0.05f, f7);
                    ph4Var.j = w2;
                    if (w2 >= L) {
                        ph4Var.e = (byte) 2;
                    }
                } else {
                    float v = oo1.v(L, f4, 0.05f, f7);
                    ph4Var.j = v;
                    if (v <= (-L)) {
                        ph4Var.e = (byte) 1;
                    }
                }
            } else if (ph4Var.c == 0) {
                if (f6 > 0.0f) {
                    float f8 = f6 - (0.05f * f4);
                    ph4Var.j = f8;
                    if (f8 <= 0.0f) {
                        ph4Var.j = 0.0f;
                        ph4Var.e = ph4Var.f;
                    }
                }
            } else if (f6 < 0.0f) {
                float f9 = (0.05f * f4) + f6;
                ph4Var.j = f9;
                if (f9 >= 0.0f) {
                    ph4Var.j = 0.0f;
                    ph4Var.e = ph4Var.f;
                }
            }
            float f10 = (-gl.L(1.0f)) / f;
            float f11 = ph4Var.k;
            boolean z = f11 < f10;
            if (f11 > f10) {
                A = ((gl.L(1.0f) / 3.0f) * f4 * qh4Var2.e) + f11;
                ph4Var.k = A;
            } else {
                A = b00.A(gl.L(1.0f), 3.0f, f4, f11);
                ph4Var.k = A;
            }
            if (z && A > f10) {
                qh4Var2.f++;
            }
            byte b3 = ph4Var.a;
            if (b3 == 1 || b3 == 2) {
                short s2 = (short) ((f4 * 10.0f) + ph4Var.i);
                ph4Var.i = s2;
                if (s2 > 360) {
                    ph4Var.i = (short) (s2 - 360);
                }
            }
            if (ph4Var.h >= qh4Var2.getHeightForAnimation()) {
                arrayList.remove(i2);
                i2--;
                size--;
            }
            i2++;
        }
        if (this.f >= y / 2 && this.e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i5 = 0; i5 < E; i5++) {
                    arrayList.add(a(true));
                }
            }
            float x2 = de9.x(i, 16.0f, 0.15f, this.e);
            this.e = x2;
            if (x2 < 0.2f) {
                this.e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.c = false;
        gl.d3(new s54((Object) this, (byte) 17));
        b();
    }

    public void b() {
    }
}
