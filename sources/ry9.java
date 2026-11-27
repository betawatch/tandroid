// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class ry9 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float a;
    public int f;
    public int g;
    public qy9 h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean p;
    public float q;
    public float r;
    public View s;
    public ArrayList u;
    public CharSequence v;
    public long w;
    public StaticLayout[] z;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public boolean e = false;
    public final RectF n = new RectF();
    public final int o = hl.L(2.0f);
    public float t = 1.0f;
    public float x = 0.0f;
    public int y = -1;
    public float B = 1.0f;

    public ry9(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.s = view;
        E = hl.L(24.0f);
        this.r = hl.L(6.0f);
    }

    public final void a() {
        this.u = null;
        this.y = -1;
        this.x = 0.0f;
        StaticLayout[] staticLayoutArr = this.z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.w = -1L;
    }

    public final void b(Canvas canvas) {
        Canvas canvas2;
        float f = this.t;
        if (f > 0.0f) {
            if (f < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f, this.g, (int) (f * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i = E / 2;
            int i2 = this.g / 2;
            int i3 = this.o / 2;
            RectF rectF = this.n;
            rectF.set(i, i2 - i3, this.f - i, i2 + i3);
            D.setColor(this.p ? this.m : this.i);
            c(canvas2, rectF, D);
            if (this.q > 0.0f) {
                D.setColor(this.p ? this.m : this.j);
                float f2 = E / 2;
                int i4 = this.g / 2;
                rectF.set(f2, i4 - i3, (this.q * (this.f - r12)) + f2, i4 + i3);
                c(canvas2, rectF, D);
            }
            float f3 = E / 2;
            int i5 = this.g / 2;
            rectF.set(f3, i5 - i3, r12 + (this.e ? this.c : this.b), i3 + i5);
            D.setColor(this.l);
            c(canvas2, rectF, D);
            D.setColor(this.k);
            float L = hl.L(this.e ? 8.0f : 6.0f);
            if (this.r != L) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f4 = this.r;
                if (f4 < L) {
                    float B = c00.B(elapsedRealtime, 60.0f, hl.L(1.0f), f4);
                    this.r = B;
                    if (B > L) {
                        this.r = L;
                    }
                } else {
                    float x = uh9.x(elapsedRealtime, 60.0f, hl.L(1.0f), f4);
                    this.r = x;
                    if (x < L) {
                        this.r = L;
                    }
                }
                View view = this.s;
                if (view != null) {
                    view.invalidate();
                }
            }
            canvas2.drawCircle((E / 2) + (this.e ? this.c : this.b), this.g / 2, this.r, D);
            if (this.t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.u;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            float f5 = (this.e ? this.c : this.b) / (this.f - E);
            int size = this.u.size() - 1;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                } else if (((Float) ((Pair) this.u.get(size)).first).floatValue() - 0.001f <= f5) {
                    break;
                } else {
                    size--;
                }
            }
            if (this.z == null) {
                this.z = new StaticLayout[2];
            }
            Typeface typeface = hl.a;
            if (size != this.y) {
                if (this.e) {
                    hl.W3(this.s);
                }
                this.y = size;
                if (size >= 0 && size < this.u.size()) {
                    d((f8c) ((Pair) this.u.get(this.y)).second);
                }
            }
            if (this.B < 1.0f) {
                this.B = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C)) / (this.u.size() > 8 ? 160.0f : 220.0f)) + this.B, 1.0f);
                View view2 = this.s;
                if (view2 != null) {
                    view2.invalidate();
                }
                this.C = SystemClock.elapsedRealtime();
            }
            if (this.x < 1.0f) {
                this.x = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C)) / 200.0f) + this.x, 1.0f);
                View view3 = this.s;
                if (view3 != null) {
                    view3.invalidate();
                }
                SystemClock.elapsedRealtime();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    public final void c(Canvas canvas, RectF rectF, Paint paint) {
        int i;
        char c;
        float floatValue;
        ?? r17;
        float f;
        float f2 = E / 2.0f;
        ArrayList arrayList = this.u;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, f2, f2, paint);
            return;
        }
        float f3 = E / 2.0f;
        float f4 = this.f - f3;
        hl.P.set(rectF);
        float L = hl.L(this.x * 1.0f) / 2.0f;
        Path path = G;
        if (path == null) {
            path = new Path();
            G = path;
        }
        path.reset();
        float L2 = hl.L(4.0f) / (f4 - f3);
        int i2 = 0;
        while (true) {
            i = -1;
            if (i2 >= this.u.size()) {
                i2 = -1;
                break;
            } else if (((Float) ((Pair) this.u.get(i2)).first).floatValue() >= L2) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            i2 = 0;
        }
        boolean z = true;
        int size = this.u.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (1.0f - ((Float) ((Pair) this.u.get(size)).first).floatValue() >= L2) {
                i = size + 1;
                break;
            }
            size--;
        }
        if (i < 0) {
            i = this.u.size();
        }
        int i3 = i2;
        while (i3 <= i) {
            if (i3 == i2) {
                floatValue = 0.0f;
                c = 0;
            } else {
                c = 0;
                floatValue = ((Float) ((Pair) this.u.get(i3 - 1)).first).floatValue();
            }
            float floatValue2 = i3 == i ? 1.0f : ((Float) ((Pair) this.u.get(i3)).first).floatValue();
            while (i3 != i && i3 != 0) {
                r17 = z;
                if (i3 >= this.u.size() - 1 || ((Float) ((Pair) this.u.get(i3)).first).floatValue() - floatValue > L2) {
                    break;
                }
                i3++;
                floatValue2 = ((Float) ((Pair) this.u.get(i3)).first).floatValue();
                z = r17 == true ? 1 : 0;
            }
            r17 = z;
            RectF rectF2 = hl.P;
            rectF2.left = hl.R1(f3, f4, floatValue) + (i3 > 0 ? L : 0.0f);
            float R1 = hl.R1(f3, f4, floatValue2) - (i3 < i ? L : 0.0f);
            rectF2.right = R1;
            float f5 = rectF.right;
            char c2 = R1 > f5 ? r17 : c;
            if (c2 != 0) {
                rectF2.right = f5;
                R1 = f5;
            }
            float f6 = rectF.left;
            if (R1 >= f6) {
                float f7 = rectF2.left;
                if (f7 < f6) {
                    rectF2.left = f6;
                } else {
                    f6 = f7;
                }
                float[] fArr = F;
                if (fArr == null) {
                    fArr = new float[8];
                    F = fArr;
                }
                f = L2;
                if (i3 == i2 || (c2 != 0 && f6 >= rectF.left)) {
                    fArr[7] = f2;
                    fArr[6] = f2;
                    fArr[r17] = f2;
                    fArr[c] = f2;
                    float f8 = 0.7f * f2 * this.x;
                    fArr[5] = f8;
                    fArr[4] = f8;
                    fArr[3] = f8;
                    fArr[2] = f8;
                } else {
                    float f9 = 0.7f * f2 * this.x;
                    if (i3 >= i) {
                        fArr[7] = f9;
                        fArr[6] = f9;
                        fArr[r17] = f9;
                        fArr[c] = f9;
                        fArr[5] = f2;
                        fArr[4] = f2;
                        fArr[3] = f2;
                        fArr[2] = f2;
                    } else {
                        fArr[5] = f9;
                        fArr[4] = f9;
                        fArr[3] = f9;
                        fArr[2] = f9;
                        fArr[7] = f9;
                        fArr[6] = f9;
                        fArr[r17] = f9;
                        fArr[c] = f9;
                    }
                }
                G.addRoundRect(rectF2, fArr, Path.Direction.CW);
                if (c2 != 0) {
                    break;
                }
            } else {
                f = L2;
            }
            i3++;
            z = r17;
            L2 = f;
        }
        canvas.drawPath(G, paint);
    }

    public final boolean e(float f, float f2, int i) {
        qy9 qy9Var;
        int i2 = 0;
        if (i == 0) {
            int i3 = this.g;
            int i4 = E;
            int i5 = (i3 - i4) / 2;
            if (f >= (-i5)) {
                int i6 = this.f;
                if (f <= i6 + i5 && f2 >= 0.0f && f2 <= i3) {
                    int i7 = this.b;
                    if (i7 - i5 > f || f > i7 + i4 + i5) {
                        i7 = ((int) f) - (i4 / 2);
                        this.b = i7;
                        if (i7 < 0) {
                            this.b = 0;
                        } else {
                            i2 = i6 - i4;
                            if (i7 > i2) {
                                this.b = i2;
                            }
                        }
                        this.e = true;
                        this.c = i2;
                        this.d = (int) (f - i2);
                        return true;
                    }
                    i2 = i7;
                    this.e = true;
                    this.c = i2;
                    this.d = (int) (f - i2);
                    return true;
                }
            }
        } else if (i == 1 || i == 3) {
            if (this.e) {
                int i8 = this.c;
                this.b = i8;
                if (i == 1 && (qy9Var = this.h) != null) {
                    qy9Var.g(i8 / (this.f - E));
                }
                this.e = false;
                return true;
            }
        } else if (i == 2 && this.e) {
            int i9 = (int) (f - this.d);
            this.c = i9;
            if (i9 < 0) {
                this.c = 0;
            } else {
                i2 = this.f - E;
                if (i9 > i2) {
                    this.c = i2;
                } else {
                    i2 = i9;
                }
            }
            qy9 qy9Var2 = this.h;
            if (qy9Var2 != null) {
                qy9Var2.h(i2 / (this.f - E));
            }
            return true;
        }
        return false;
    }

    public final void f(int i, int i2, int i3, int i4, int i5) {
        this.i = i;
        this.j = i2;
        this.k = i4;
        this.l = i3;
        this.m = i5;
    }

    public final void g(float f) {
        this.a = f;
        int ceil = (int) Math.ceil((this.f - E) * f);
        this.b = ceil;
        if (ceil < 0) {
            this.b = 0;
            return;
        }
        int i = this.f;
        int i2 = E;
        if (ceil > i - i2) {
            this.b = i - i2;
        }
    }

    public final void h(int i, int i2) {
        if (this.f == i && this.g == i2) {
            return;
        }
        this.f = i;
        this.g = i2;
        g(this.a);
    }

    public final void i(r47 r47Var) {
        String str;
        if (r47Var == null) {
            a();
            return;
        }
        Long valueOf = Long.valueOf(((long) r47Var.L0()) * 1000);
        if (valueOf.longValue() < 0) {
            a();
            return;
        }
        CharSequence charSequence = r47Var.z;
        if (r47Var.d5()) {
            if (r47Var.B == null && (str = r47Var.k.media.webpage.description) != null) {
                r47Var.B = SpannableString.valueOf(str);
                r47.h(r47Var.N3(), r47Var.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = r47Var.B;
        }
        if (charSequence == this.v && this.w == valueOf.longValue()) {
            return;
        }
        this.v = charSequence;
        this.w = valueOf.longValue();
        if (!(charSequence instanceof Spanned)) {
            this.u = null;
            this.y = -1;
            this.x = 0.0f;
            StaticLayout[] staticLayoutArr = this.z;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
                return;
            }
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        try {
            f8c[] f8cVarArr = (f8c[]) spanned.getSpans(0, spanned.length(), f8c.class);
            this.u = new ArrayList();
            this.x = 0.0f;
            if (this.A == null) {
                TextPaint textPaint = new TextPaint(1);
                this.A = textPaint;
                textPaint.setTextSize(hl.L(12.0f));
                this.A.setColor(-1);
            }
            for (f8c f8cVar : f8cVarArr) {
                try {
                    if (f8cVar != null && f8cVar.getURL() != null && f8cVar.d != null && f8cVar.getURL().startsWith("audio?")) {
                        if (Utilities.z(f8cVar.getURL().substring(6)).intValue() >= 0) {
                            pv3.l(new SpannableStringBuilder(f8cVar.d), this.A.getFontMetricsInt(), false);
                            this.u.add(new Pair(Float.valueOf((r5.intValue() * 1000) / valueOf.longValue()), f8cVar));
                        }
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
            Collections.sort(this.u, new qq7((byte) 22));
        } catch (Exception e2) {
            cc4.g(e2, true);
            this.u = null;
            this.y = -1;
            this.x = 0.0f;
            StaticLayout[] staticLayoutArr2 = this.z;
            if (staticLayoutArr2 != null) {
                staticLayoutArr2[1] = null;
                staticLayoutArr2[0] = null;
            }
        }
    }

    public void d(f8c f8cVar) {
    }
}
