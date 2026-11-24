// default package

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zx8 extends Path {
    public final gb2 a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final byte[] g;
    public int h;
    public final Paint i;
    public final pw2 j;
    public final lm k;
    public final ArrayList l;
    public final ArrayList m;
    public final float n;
    public final float o;
    public final float p;
    public yx8 q;
    public final int r;
    public final pib s;
    public final int t;
    public final ArrayList u;

    public zx8(final gb2 gb2Var, final ViewParent viewParent, int i, ArrayList arrayList, int i2, int i3, float f) {
        int i4;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new pw2();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        final byte b = 0;
        this.k = new lm(0.0f, new Runnable() { // from class: xx8
            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                Object obj = viewParent;
                gb2 gb2Var2 = gb2Var;
                switch (b2) {
                    case 0:
                        gb2Var2.invalidate();
                        if (obj instanceof View) {
                            ((View) obj).invalidate();
                            break;
                        }
                        break;
                    default:
                        gb2Var2.invalidate();
                        if (obj instanceof View) {
                            ((View) obj).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, s33.h);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = false;
        this.f = false;
        if (arrayList == null) {
            return;
        }
        int L = gl.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        boolean z = false;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            h27 h27Var = (h27) arrayList.get(i5);
            if (h27Var != null && i2 <= h27Var.r && i3 >= (i4 = h27Var.n)) {
                int max = Math.max(0, i2 - i4);
                int i6 = h27Var.n;
                int min = Math.min(i3 - i6, h27Var.r - i6);
                float f2 = -f;
                this.n = f2;
                if (h27Var.I && !h27Var.J) {
                    this.n = f2 + (h27Var.V ? gl.L(14.0f) : gl.L(10.0f));
                }
                this.o = h27Var.o(arrayList) + h27Var.f;
                this.p = h27Var.J ? gl.L(10.0f) : 0.0f;
                z = z || gl.J1(h27Var.e.getText());
                StaticLayout staticLayout = h27Var.e;
                if (z) {
                    staticLayout.getSelectionPath(max, min, this);
                } else {
                    e(staticLayout, max, min);
                }
                if (h27Var.K && h27Var.f()) {
                    this.m.add(Integer.valueOf(h27Var.c));
                }
            }
        }
        d();
    }

    public static void b(pw2 pw2Var, yx8 yx8Var, float f, float f2, Rect rect, float f3) {
        float x = yx8Var.j != null ? r0.getX() - yx8Var.k : 0.0f;
        float y = yx8Var.j != null ? r2.getY() - yx8Var.l : 0.0f;
        pw2Var.addRect(gl.R1(rect.left - f, yx8Var.a + x, f3), gl.R1(yx8Var.e ? rect.top - f2 : yx8Var.g + y, yx8Var.c + y, f3), gl.R1(rect.right - f, yx8Var.b + x, f3), gl.R1(yx8Var.f ? rect.bottom - f2 : yx8Var.h + y, yx8Var.d + y, f3), Path.Direction.CW);
    }

    public final void a(float f, float f2, float f3, float f4) {
        if (f >= f3) {
            return;
        }
        float f5 = this.p;
        float max = Math.max(f5, f);
        float max2 = Math.max(f5, f3);
        float f6 = this.n;
        float f7 = max + f6;
        float f8 = this.o;
        float f9 = f2 + f8;
        float f10 = max2 + f6;
        yx8 yx8Var = new yx8();
        yx8Var.a = f7 - gl.L(3.0f);
        yx8Var.b = f10 + gl.L(3.0f);
        yx8Var.c = f9;
        yx8Var.d = f4 + f8;
        yx8Var.i = this.r;
        pib pibVar = this.s;
        yx8Var.j = pibVar;
        if (pibVar != null) {
            yx8Var.k = pibVar.getX();
            yx8Var.l = pibVar.getY();
        }
        yx8 yx8Var2 = this.q;
        if (yx8Var2 != null) {
            float f11 = yx8Var2.d;
            yx8Var2.h = (f11 + f9) / 2.0f;
            yx8Var.g = (f11 + f9) / 2.0f;
        }
        this.l.add(yx8Var);
        this.q = yx8Var;
    }

    @Override // android.graphics.Path
    public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        a(f, f2, f3, f4);
    }

    public final void c(Canvas canvas, float f, float f2, Rect rect, float f3) {
        pw2 pw2Var;
        ArrayList arrayList;
        Rect rect2 = rect;
        int i = 0;
        float e = this.k.e(false, 1.0f);
        canvas.save();
        boolean z = this.f;
        pw2 pw2Var2 = this.j;
        gb2 gb2Var = this.a;
        Paint paint = this.i;
        if (z) {
            int U1 = gl.U1(e, gl.L(4.0f), 0);
            if (this.h != U1) {
                this.h = U1;
                paint.setPathEffect(new CornerPathEffect(U1));
            }
            pw2Var2.rewind();
            int Y1 = gb2Var.Y1(this.g);
            RectF rectF = gl.P;
            rectF.set(gb2Var.getBackgroundDrawableLeft(), gb2Var.X1(Y1), gb2Var.getBackgroundDrawableRight(), gb2Var.W1(Y1));
            gl.W1(rect2, rectF, e, rectF);
            pw2Var2.addRect(rectF, Path.Direction.CW);
            pw2Var2.a();
        } else {
            if (!this.e) {
                int i2 = this.t;
                ArrayList arrayList2 = this.l;
                if (i2 <= 1) {
                    canvas.translate(f, f2);
                    pw2Var2.rewind();
                    while (i < arrayList2.size()) {
                        pw2 pw2Var3 = pw2Var2;
                        b(pw2Var3, (yx8) arrayList2.get(i), f, f2, rect2, e);
                        i++;
                        rect2 = rect;
                        pw2Var2 = pw2Var3;
                    }
                    pw2Var = pw2Var2;
                    pw2Var.a();
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (alpha * f3));
                    canvas.drawPath(pw2Var, paint);
                    paint.setAlpha(alpha);
                    canvas.restore();
                }
                canvas.translate(f, f2);
                pw2 pw2Var4 = null;
                int i3 = -1;
                int i4 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.u;
                    if (i4 >= size) {
                        break;
                    }
                    yx8 yx8Var = (yx8) arrayList2.get(i4);
                    if (pw2Var4 != null) {
                        if (yx8Var.e) {
                            pw2Var4.a();
                        }
                        pw2 pw2Var5 = pw2Var4;
                        float f4 = e;
                        Rect rect3 = rect2;
                        b(pw2Var5, yx8Var, f, f2, rect3, f4);
                        pw2Var4 = pw2Var5;
                        rect2 = rect3;
                        e = f4;
                        i4++;
                    }
                    i3++;
                    if (i3 >= arrayList.size()) {
                        arrayList.add(new pw2());
                    }
                    pw2Var4 = (pw2) arrayList.get(i3);
                    pw2Var4.rewind();
                    pw2 pw2Var52 = pw2Var4;
                    float f42 = e;
                    Rect rect32 = rect2;
                    b(pw2Var52, yx8Var, f, f2, rect32, f42);
                    pw2Var4 = pw2Var52;
                    rect2 = rect32;
                    e = f42;
                    i4++;
                }
                if (pw2Var4 != null) {
                    pw2Var4.a();
                }
                int alpha2 = paint.getAlpha();
                canvas.saveLayerAlpha(rect2.left - f, rect2.top - f2, rect2.right - f, rect2.bottom - f2, (int) (alpha2 * f3), 31);
                paint.setAlpha(kk7.d4);
                while (i <= i3) {
                    canvas.drawPath((Path) arrayList.get(i), paint);
                    i++;
                }
                paint.setAlpha(alpha2);
                canvas.restore();
                canvas.restore();
                return;
            }
            int U12 = gl.U1(e, gl.L(4.0f), 0);
            if (this.h != U12) {
                this.h = U12;
                paint.setPathEffect(new CornerPathEffect(U12));
            }
            pw2Var2.rewind();
            int e2 = gb2Var.e2(-this.c);
            RectF rectF2 = gl.P;
            rectF2.set(gb2Var.getBackgroundDrawableLeft(), gb2Var.X1(e2), gb2Var.getBackgroundDrawableRight(), gb2Var.W1(e2));
            gl.W1(rect2, rectF2, e, rectF2);
            pw2Var2.addRect(rectF2, Path.Direction.CW);
            pw2Var2.a();
        }
        pw2Var = pw2Var2;
        int alpha3 = paint.getAlpha();
        paint.setAlpha((int) (alpha3 * f3));
        canvas.drawPath(pw2Var, paint);
        paint.setAlpha(alpha3);
        canvas.restore();
    }

    public final void d() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i >= arrayList.size()) {
                return;
            }
            yx8 yx8Var = (yx8) arrayList.get(i);
            if (i == 0 || ((yx8) arrayList.get(i - 1)).i != yx8Var.i) {
                yx8Var.e = true;
                yx8Var.c -= gl.L(0.66f);
            }
            if (i == arrayList.size() - 1 || ((yx8) arrayList.get(i + 1)).i != yx8Var.i) {
                yx8Var.f = true;
                yx8Var.d += gl.L(0.66f);
            }
            i++;
        }
    }

    public final void e(Layout layout, int i, int i2) {
        if (i != i2) {
            if (i2 < i) {
                i2 = i;
                i = i2;
            }
            int lineForOffset = layout.getLineForOffset(i);
            int lineForOffset2 = layout.getLineForOffset(i2);
            int i3 = lineForOffset;
            while (i3 <= lineForOffset2) {
                int lineStart = layout.getLineStart(i3);
                int lineEnd = layout.getLineEnd(i3);
                if (lineEnd != lineStart && (lineStart + 1 != lineEnd || !Character.isWhitespace(layout.getText().charAt(lineStart)))) {
                    float lineLeft = (i3 != lineForOffset || i <= lineStart) ? layout.getLineLeft(i3) : layout.getPrimaryHorizontal(i);
                    float lineRight = (i3 != lineForOffset2 || i2 >= lineEnd) ? layout.getLineRight(i3) : layout.getPrimaryHorizontal(i2);
                    a(Math.min(lineLeft, lineRight), layout.getLineTop(i3), Math.max(lineLeft, lineRight), layout.getLineBottom(i3));
                }
                i3++;
            }
        }
    }

    public zx8(gb2 gb2Var, int i, byte[] bArr) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new pw2();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = gb2Var;
        this.k = new lm(0.0f, new sa2(gb2Var, (byte) 13), 350L, 420L, s33.h);
        this.b = i;
        this.g = bArr;
        this.c = 0;
        this.d = 0;
        this.e = false;
        this.f = true;
        int L = gl.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public zx8(gb2 gb2Var, int i, int i2) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new pw2();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = gb2Var;
        this.k = new lm(0.0f, new sa2(gb2Var, (byte) 12), 350L, 420L, s33.h);
        this.b = i;
        int i3 = -i2;
        this.c = i3;
        this.d = i3;
        this.e = true;
        this.f = false;
        int L = gl.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public zx8(final gb2 gb2Var, final ViewParent viewParent, int i, rh9 rh9Var, int i2, int i3) {
        final byte b = 1;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new pw2();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        this.k = new lm(0.0f, new Runnable() { // from class: xx8
            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                Object obj = viewParent;
                gb2 gb2Var2 = gb2Var;
                switch (b2) {
                    case 0:
                        gb2Var2.invalidate();
                        if (obj instanceof View) {
                            ((View) obj).invalidate();
                            break;
                        }
                        break;
                    default:
                        gb2Var2.invalidate();
                        if (obj instanceof View) {
                            ((View) obj).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, s33.h);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = false;
        this.f = false;
        if (rh9Var == null) {
            return;
        }
        ArrayList arrayList = rh9Var.n;
        int L = gl.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        this.p = -3.4028235E38f;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            pib pibVar = (pib) arrayList.get(i4);
            Layout a = pibVar == null ? null : pibVar.a();
            if (a != null && a.getText() != null) {
                int intValue = ((Integer) rh9Var.o.get(i4)).intValue();
                int length = a.getText().length();
                int j = Utilities.j(i2 - intValue, length, 0);
                int j2 = Utilities.j(i3 - intValue, length, 0);
                if (j < j2) {
                    this.n = pibVar.getX();
                    this.o = pibVar.getY();
                    this.s = pibVar;
                    this.q = null;
                    int size = this.l.size();
                    if (gl.J1(a.getText())) {
                        a.getSelectionPath(j, j2, this);
                    } else {
                        e(a, j, j2);
                    }
                    if (this.l.size() > size) {
                        this.r++;
                    }
                }
            }
        }
        this.t = Math.max(1, this.r);
        d();
    }
}
