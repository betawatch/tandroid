// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t12 extends ro {
    public final /* synthetic */ byte b;
    public final /* synthetic */ i22 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t12(i22 i22Var, byte b) {
        super("translation", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = i22Var;
                super("openProgress", (byte) 0);
                break;
            default:
                this.c = i22Var;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        if (r7.v2 == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    @Override // ro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Object obj, float f) {
        int i;
        a22 a22Var;
        v72 v72Var;
        float f2;
        byte b = this.b;
        i22 i22Var = this.c;
        int i2 = 0;
        switch (b) {
            case 0:
                i22Var.X1 = f;
                a22 a22Var2 = i22Var.w2;
                if (a22Var2 != null) {
                    if ((a22Var2 instanceof x62) || (i22Var.v2 instanceof x62)) {
                        int max = Math.max(a22Var2.getWidth(), i22Var.v2.getWidth());
                        boolean z = i22Var.w2 instanceof x62;
                        a22 a22Var3 = i22Var.v2;
                        if (z) {
                            a22Var3.setTranslationX((-max) * f);
                            i22Var.w2.setTranslationX((1.0f - f) * max);
                        } else {
                            a22Var3.setTranslationX(max * f);
                            i22Var.w2.setTranslationX((1.0f - f) * (-max));
                        }
                    } else {
                        a22Var2.setAlpha(f);
                        i22Var.w2.v(f);
                        a22 a22Var4 = i22Var.w2;
                        v72 v72Var2 = i22Var.g2;
                        if (a22Var4 != v72Var2) {
                            if (i22Var.v2 == v72Var2) {
                                i = 0;
                            }
                            a22Var = i22Var.w2;
                            v72Var = i22Var.h2;
                            if (a22Var == v72Var) {
                                break;
                            } else {
                                i2 = 1;
                            }
                            i22Var.K1(i2);
                            i22Var.w2.setTranslationY(gm.L(78.0f) * f);
                            i22Var.v2.v(1.0f - Math.min(1.0f, f / 0.7f));
                            i22Var.v2.m(i22Var.i4);
                        } else {
                            i = 1;
                        }
                        i22Var.K1(i);
                        a22Var = i22Var.w2;
                        v72Var = i22Var.h2;
                        if (a22Var == v72Var) {
                        }
                        i22Var.K1(i2);
                        i22Var.w2.setTranslationY(gm.L(78.0f) * f);
                        i22Var.v2.v(1.0f - Math.min(1.0f, f / 0.7f));
                        i22Var.v2.m(i22Var.i4);
                    }
                    if (i22Var.q3 != null) {
                        i22Var.K1(1);
                    }
                    i22Var.b.invalidate();
                    break;
                }
                break;
            default:
                i12 i12Var = i22Var.v3;
                int childCount = i12Var.getChildCount();
                while (i2 < childCount) {
                    float f3 = (3 - i2) * 32.0f;
                    View childAt = i12Var.getChildAt(i2);
                    if (f > f3) {
                        float f4 = f - f3;
                        if (f4 <= 200.0f) {
                            float f5 = f4 / 200.0f;
                            f2 = d53.g.getInterpolation(f5) * 1.1f;
                            childAt.setAlpha(d53.j.getInterpolation(f5));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f6 = f4 - 200.0f;
                            f2 = f6 <= 100.0f ? 1.1f - (d53.i.getInterpolation(f6 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f2 = 0.0f;
                    }
                    if (childAt instanceof d22) {
                        ((d22) childAt).a.setAttachScale(f2);
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
