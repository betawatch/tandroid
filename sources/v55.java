// default package

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class v55 extends u55 {
    public final ArrayList Q;
    public boolean R;

    public v55(boolean z) {
        super(1000, z);
        this.Q = new ArrayList(4);
        this.R = true;
    }

    public boolean A1(View view) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d6, code lost:
    
        r15 = r15 + r1;
        q79.N(r8, r1, r7, r15, r2);
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01df, code lost:
    
        if (r24.f != (-1)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e1, code lost:
    
        r1 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01eb, code lost:
    
        if (r13.a.j() != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f3, code lost:
    
        if (r13.a.m() == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f8, code lost:
    
        r25.d |= r8.hasFocusable();
        r10 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f5, code lost:
    
        r25.c = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01e3, code lost:
    
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01d4, code lost:
    
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01aa, code lost:
    
        r2 = r1 + r7;
        r2 = r2 + r14;
        r1 = r21.m;
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0204, code lost:
    
        r1 = r24.b;
        r5 = r25.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0209, code lost:
    
        if (r2 != (-1)) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x020b, code lost:
    
        r1 = r1 - r5;
        r2 = r1 - r14;
        r2 = r1;
        r1 = r21.m;
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x021e, code lost:
    
        r7 = r1;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0220, code lost:
    
        if (r1 >= r10) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0222, code lost:
    
        r8 = r21.L[r1];
        r13 = (t55) r8.getLayoutParams();
        r15 = r21.q.c(r8);
        r17 = r1;
        r19 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0239, code lost:
    
        if (r24.f != (-1)) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x023b, code lost:
    
        r7 = r7 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x023c, code lost:
    
        r15 = r15 + r7;
        q79.N(r8, r7, r5, r15, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0243, code lost:
    
        if (r24.f != 1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0245, code lost:
    
        r7 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x024c, code lost:
    
        if (r13.a.j() != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0254, code lost:
    
        if (r13.a.m() == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0259, code lost:
    
        r25.d |= r8.hasFocusable();
        r1 = r17 + 1;
        r6 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0256, code lost:
    
        r25.c = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0217, code lost:
    
        r2 = r1 + r5;
        r5 = r2;
        r2 = r2 + r14;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x019b, code lost:
    
        if (r2 == 1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00d8, code lost:
    
        r25.b = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00dc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0195, code lost:
    
        if (r2 != (-1)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019d, code lost:
    
        r1 = r24.b;
        r7 = r25.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a1, code lost:
    
        if (r2 != r13) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a3, code lost:
    
        r1 = r1 - r7;
        r7 = r1 - r14;
        r2 = r1;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b6, code lost:
    
        r10 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b8, code lost:
    
        if (r10 < 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ba, code lost:
    
        r8 = r21.L[r10];
        r13 = (t55) r8.getLayoutParams();
        r15 = r21.q.c(r8);
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01cf, code lost:
    
        if (r24.f != 1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d1, code lost:
    
        r1 = r17 - r15;
     */
    @Override // u55, x46
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y0(oh2 oh2Var, c89 c89Var, v46 v46Var, u46 u46Var) {
        boolean z;
        View[] viewArr;
        int i;
        int i2;
        boolean z2;
        View c;
        int i3;
        boolean z3;
        oh2 oh2Var2 = oh2Var;
        c89 c89Var2 = c89Var;
        int i4 = this.q.i();
        int i5 = 0;
        boolean z4 = true;
        boolean z5 = v46Var.e == 1;
        u46Var.a = 0;
        int i6 = v46Var.d;
        boolean z6 = this.v;
        Rect rect = this.P;
        ArrayList arrayList = this.Q;
        int i7 = -1;
        if (z6 && v46Var.f != -1 && z1(i6) && m(v46Var.d + 1) == null) {
            boolean z1 = z1(v46Var.d + 1);
            int i8 = v46Var.d;
            if (z1) {
                i3 = i8 + 3;
                v46Var.d = i3;
            } else {
                i3 = i8 + 2;
                v46Var.d = i3;
            }
            int i9 = i3;
            while (i9 > i6) {
                View c2 = v46Var.c(oh2Var2);
                if (c2 != null) {
                    arrayList.add(c2);
                    if (i9 != i3) {
                        c(c2, rect);
                        v1(i4, c2, false);
                        z3 = z4;
                        int b = this.q.b(c2);
                        v46Var.b -= b;
                        v46Var.c += b;
                        i9--;
                        z4 = z3;
                    }
                }
                z3 = z4;
                i9--;
                z4 = z3;
            }
            z = z4;
            v46Var.d = i3;
        } else {
            z = true;
        }
        boolean z7 = z;
        while (z7) {
            int i10 = this.J;
            boolean z8 = !arrayList.isEmpty();
            int i11 = i5;
            while (i11 < this.J && v46Var.b(c89Var2) && i10 > 0) {
                int i12 = v46Var.d;
                i10 -= u1(i12, oh2Var2, c89Var2);
                if (i10 < 0) {
                    break;
                }
                if (arrayList.isEmpty()) {
                    c = v46Var.c(oh2Var2);
                } else {
                    c = (View) arrayList.get(i5);
                    arrayList.remove(i5);
                    v46Var.d--;
                }
                if (c == null) {
                    break;
                }
                this.L[i11] = c;
                i11++;
                if (v46Var.f == i7 && i10 <= 0 && z1(i12)) {
                    z8 = z;
                }
                i5 = 0;
            }
            o1(i11, oh2Var2, c89Var2, z5);
            float f = 0.0f;
            int i13 = 0;
            for (int i14 = 0; i14 < i11; i14++) {
                View view = this.L[i14];
                if (v46Var.k == null) {
                    if (z5) {
                        a(-1, view, false);
                    } else {
                        a(0, view, false);
                    }
                    z2 = false;
                } else if (z5) {
                    a(-1, view, true);
                    z2 = false;
                } else {
                    z2 = false;
                    a(0, view, true);
                }
                c(view, rect);
                v1(i4, view, z2);
                int b2 = this.q.b(view);
                if (b2 > i13) {
                    i13 = b2;
                }
                float c3 = (this.q.c(view) * 1.0f) / ((t55) view.getLayoutParams()).f;
                if (c3 > f) {
                    f = c3;
                }
            }
            int i15 = 0;
            while (true) {
                viewArr = this.L;
                if (i15 >= i11) {
                    break;
                }
                View view2 = viewArr[i15];
                if (this.q.b(view2) != i13) {
                    t55 t55Var = (t55) view2.getLayoutParams();
                    Rect rect2 = t55Var.b;
                    i = i15;
                    i2 = i4;
                    w1(q79.s(false, this.K[t55Var.f], TLObject.FLAG_30, rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) t55Var).leftMargin + ((ViewGroup.MarginLayoutParams) t55Var).rightMargin, ((ViewGroup.MarginLayoutParams) t55Var).width), View.MeasureSpec.makeMeasureSpec(i13 - (((rect2.top + rect2.bottom) + ((ViewGroup.MarginLayoutParams) t55Var).topMargin) + ((ViewGroup.MarginLayoutParams) t55Var).bottomMargin), TLObject.FLAG_30), view2, true);
                } else {
                    i = i15;
                    i2 = i4;
                }
                i15 = i + 1;
                i4 = i2;
            }
            int i16 = i4;
            boolean A1 = A1(viewArr[0]);
            int i17 = v46Var.f;
            int i18 = A1 ? -1 : -1;
            u46Var.a += i13;
            Arrays.fill(this.L, (Object) null);
            c89Var2 = c89Var;
            z = true;
            z7 = z8;
            i4 = i16;
            z5 = z5;
            i5 = 0;
            i7 = -1;
            oh2Var2 = oh2Var;
        }
    }

    @Override // x46
    public final void d1(oh2 oh2Var, int i, int i2) {
        if (i >= 0) {
            int r = r();
            if (!this.v) {
                for (int i3 = 0; i3 < r; i3++) {
                    View q = q(i3);
                    if (q.getBottom() + ((ViewGroup.MarginLayoutParams) ((r79) q.getLayoutParams())).bottomMargin <= i) {
                        if (q.getHeight() + q.getTop() <= i) {
                        }
                    }
                    c1(oh2Var, 0, i3);
                    return;
                }
                return;
            }
            int i4 = r - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View q2 = q(i5);
                if (q2.getBottom() + ((ViewGroup.MarginLayoutParams) ((r79) q2.getLayoutParams())).bottomMargin <= i) {
                    if (q2.getHeight() + q2.getTop() <= i) {
                    }
                }
                c1(oh2Var, i4, i5);
                return;
            }
        }
    }

    @Override // x46, q79
    public final boolean e() {
        return this.R;
    }

    @Override // u55
    public final int[] p1(int i, int i2, int[] iArr) {
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        iArr[0] = 0;
        for (int i3 = 1; i3 <= i; i3++) {
            iArr[i3] = (int) Math.ceil((i3 / i) * i2);
        }
        return iArr;
    }

    @Override // u55
    public final void v1(int i, View view, boolean z) {
        t55 t55Var = (t55) view.getLayoutParams();
        Rect rect = t55Var.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) t55Var).topMargin + ((ViewGroup.MarginLayoutParams) t55Var).bottomMargin;
        w1(q79.s(false, this.K[t55Var.f], i, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) t55Var).leftMargin + ((ViewGroup.MarginLayoutParams) t55Var).rightMargin, ((ViewGroup.MarginLayoutParams) t55Var).width), q79.s(true, this.q.k(), this.l, i2, ((ViewGroup.MarginLayoutParams) t55Var).height), view, z);
    }

    public abstract boolean z1(int i);
}
