// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class y02 extends rn {
    public final /* synthetic */ byte b;
    public final /* synthetic */ n12 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y02(n12 n12Var, byte b) {
        super("translation", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = n12Var;
                super("openProgress", (byte) 0);
                break;
            default:
                this.c = n12Var;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        if (r7.v2 == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    @Override // rn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Object obj, float f) {
        int i;
        f12 f12Var;
        a72 a72Var;
        float f2;
        byte b = this.b;
        n12 n12Var = this.c;
        int i2 = 0;
        switch (b) {
            case 0:
                n12Var.X1 = f;
                f12 f12Var2 = n12Var.w2;
                if (f12Var2 != null) {
                    if ((f12Var2 instanceof c62) || (n12Var.v2 instanceof c62)) {
                        int max = Math.max(f12Var2.getWidth(), n12Var.v2.getWidth());
                        boolean z = n12Var.w2 instanceof c62;
                        f12 f12Var3 = n12Var.v2;
                        if (z) {
                            f12Var3.setTranslationX((-max) * f);
                            n12Var.w2.setTranslationX((1.0f - f) * max);
                        } else {
                            f12Var3.setTranslationX(max * f);
                            n12Var.w2.setTranslationX((1.0f - f) * (-max));
                        }
                    } else {
                        f12Var2.setAlpha(f);
                        n12Var.w2.w(f);
                        f12 f12Var4 = n12Var.w2;
                        a72 a72Var2 = n12Var.g2;
                        if (f12Var4 != a72Var2) {
                            if (n12Var.v2 == a72Var2) {
                                i = 0;
                            }
                            f12Var = n12Var.w2;
                            a72Var = n12Var.h2;
                            if (f12Var == a72Var) {
                                break;
                            } else {
                                i2 = 1;
                            }
                            n12Var.L1(i2);
                            n12Var.w2.setTranslationY(hl.L(78.0f) * f);
                            n12Var.v2.w(1.0f - Math.min(1.0f, f / 0.7f));
                            n12Var.v2.m(n12Var.i4);
                        } else {
                            i = 1;
                        }
                        n12Var.L1(i);
                        f12Var = n12Var.w2;
                        a72Var = n12Var.h2;
                        if (f12Var == a72Var) {
                        }
                        n12Var.L1(i2);
                        n12Var.w2.setTranslationY(hl.L(78.0f) * f);
                        n12Var.v2.w(1.0f - Math.min(1.0f, f / 0.7f));
                        n12Var.v2.m(n12Var.i4);
                    }
                    if (n12Var.q3 != null) {
                        n12Var.L1(1);
                    }
                    n12Var.b.invalidate();
                    break;
                }
                break;
            default:
                n02 n02Var = n12Var.v3;
                int childCount = n02Var.getChildCount();
                while (i2 < childCount) {
                    float f3 = (3 - i2) * 32.0f;
                    View childAt = n02Var.getChildAt(i2);
                    if (f > f3) {
                        float f4 = f - f3;
                        if (f4 <= 200.0f) {
                            float f5 = f4 / 200.0f;
                            f2 = k43.g.getInterpolation(f5) * 1.1f;
                            childAt.setAlpha(k43.j.getInterpolation(f5));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f6 = f4 - 200.0f;
                            f2 = f6 <= 100.0f ? 1.1f - (k43.i.getInterpolation(f6 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f2 = 0.0f;
                    }
                    if (childAt instanceof i12) {
                        ((i12) childAt).a.setAttachScale(f2);
                    }
                    i2++;
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(this.c.X1);
            default:
                return Float.valueOf(0.0f);
        }
    }
}
