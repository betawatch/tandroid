// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class p18 {
    public Path a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public ArrayList g;

    public final void a(String str, float f) {
        float f2 = this.e;
        float f3 = this.d;
        float f4 = this.c;
        try {
            m18 m18Var = new m18();
            m18Var.a = new ArrayList();
            m18Var.b = f * this.f;
            String[] split = str.split(" ");
            int i = 0;
            while (i < split.length) {
                char charAt = split[i].charAt(0);
                if (charAt == 'C') {
                    l18 l18Var = new l18();
                    l18Var.c = (Float.parseFloat(split[i + 1]) + f3) * f4;
                    l18Var.d = (Float.parseFloat(split[i + 2]) + f2) * f4;
                    l18Var.e = (Float.parseFloat(split[i + 3]) + f3) * f4;
                    l18Var.f = (Float.parseFloat(split[i + 4]) + f2) * f4;
                    l18Var.a = (Float.parseFloat(split[i + 5]) + f3) * f4;
                    i += 6;
                    l18Var.b = (Float.parseFloat(split[i]) + f2) * f4;
                    m18Var.a.add(l18Var);
                } else if (charAt == 'L') {
                    n18 n18Var = new n18();
                    n18Var.a = (Float.parseFloat(split[i + 1]) + f3) * f4;
                    i += 2;
                    n18Var.b = (Float.parseFloat(split[i]) + f2) * f4;
                    m18Var.a.add(n18Var);
                } else if (charAt == 'M') {
                    o18 o18Var = new o18();
                    o18Var.a = (Float.parseFloat(split[i + 1]) + f3) * f4;
                    i += 2;
                    o18Var.b = (Float.parseFloat(split[i]) + f2) * f4;
                    m18Var.a.add(o18Var);
                }
                i++;
            }
            this.g.add(m18Var);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r9 < r11) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, Paint paint, float f) {
        m18 m18Var;
        m18 m18Var2;
        float f2;
        float f3;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f) {
            this.b = f;
            int size = arrayList.size();
            m18 m18Var3 = null;
            m18 m18Var4 = null;
            for (int i = 0; i < size; i++) {
                m18 m18Var5 = (m18) arrayList.get(i);
                if (m18Var4 != null) {
                    float f4 = m18Var4.b;
                    f3 = m18Var5.b;
                }
                f3 = m18Var5.b;
                if (f3 <= f) {
                    m18Var4 = m18Var5;
                }
                if ((m18Var3 == null || m18Var3.b > f3) && f3 >= f) {
                    m18Var3 = m18Var5;
                }
            }
            if (m18Var3 == m18Var4) {
                m18Var4 = null;
            }
            if (m18Var4 == null || m18Var3 != null) {
                m18Var = m18Var3;
                m18Var2 = m18Var4;
            } else {
                m18Var = m18Var4;
                m18Var2 = null;
            }
            if (m18Var == null) {
                return;
            }
            ArrayList arrayList2 = m18Var.a;
            if (m18Var2 != null && m18Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Object obj = m18Var2 != null ? m18Var2.a.get(i2) : null;
                Object obj2 = arrayList2.get(i2);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (m18Var2 != null) {
                    float f5 = m18Var2.b;
                    f2 = (f - f5) / (m18Var.b - f5);
                } else {
                    f2 = 1.0f;
                }
                if (obj2 instanceof o18) {
                    o18 o18Var = (o18) obj2;
                    o18 o18Var2 = (o18) obj;
                    if (o18Var2 != null) {
                        float f6 = o18Var2.a;
                        float N = hl.N(((o18Var.a - f6) * f2) + f6);
                        float f7 = o18Var2.b;
                        path.moveTo(N, hl.N(((o18Var.b - f7) * f2) + f7));
                    } else {
                        path.moveTo(hl.N(o18Var.a), hl.N(o18Var.b));
                    }
                } else if (obj2 instanceof n18) {
                    n18 n18Var = (n18) obj2;
                    n18 n18Var2 = (n18) obj;
                    if (n18Var2 != null) {
                        float f8 = n18Var2.a;
                        float N2 = hl.N(((n18Var.a - f8) * f2) + f8);
                        float f9 = n18Var2.b;
                        path.lineTo(N2, hl.N(((n18Var.b - f9) * f2) + f9));
                    } else {
                        path.lineTo(hl.N(n18Var.a), hl.N(n18Var.b));
                    }
                } else if (obj2 instanceof l18) {
                    l18 l18Var = (l18) obj2;
                    l18 l18Var2 = (l18) obj;
                    if (l18Var2 != null) {
                        float f10 = l18Var2.c;
                        float N3 = hl.N(((l18Var.c - f10) * f2) + f10);
                        float f11 = l18Var2.d;
                        float N4 = hl.N(((l18Var.d - f11) * f2) + f11);
                        float f12 = l18Var2.e;
                        float N5 = hl.N(((l18Var.e - f12) * f2) + f12);
                        float f13 = l18Var2.f;
                        float N6 = hl.N(((l18Var.f - f13) * f2) + f13);
                        float f14 = l18Var2.a;
                        float N7 = hl.N(((l18Var.a - f14) * f2) + f14);
                        float f15 = l18Var2.b;
                        path.cubicTo(N3, N4, N5, N6, N7, hl.N(((l18Var.b - f15) * f2) + f15));
                    } else {
                        path.cubicTo(hl.N(l18Var.c), hl.N(l18Var.d), hl.N(l18Var.e), hl.N(l18Var.f), hl.N(l18Var.a), hl.N(l18Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}
