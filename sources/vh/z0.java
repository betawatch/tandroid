package vh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.jc;
import org.telegram.messenger.sc;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.ts;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z0 extends ts {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final boolean Q = sc.e(8200);
    public final /* synthetic */ b1 R;

    public z0(b1 b1Var) {
        this.R = b1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.f5 f5Var, a1 a1Var, float f7) {
        if (f5Var != null) {
            f5Var.setAlpha((int) (f7 * 255.0f));
            f5Var.draw(canvas);
        } else if (a1Var.f != null) {
            canvas.save();
            ImageReceiver imageReceiver = a1Var.f;
            canvas.clipRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), a1Var.f.A());
            a1Var.f.setAlpha(f7);
            a1Var.f.h(canvas, null);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.ts
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        if (this.O == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = this.R.b0() || this.O.size() <= 4 || !this.Q;
        if (!z11) {
            for (int i12 = 0; i12 < this.O.size(); i12++) {
                if (((a1) this.O.get(i12)).getScale() != 1.0f) {
                    break;
                }
            }
        }
        z10 = z11;
        if (!z10) {
            super.a(canvas, j10, i10, i11, f7);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f7);
        k();
    }

    @Override // org.telegram.ui.Components.ts
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            a1 a1Var = (a1) arrayList.get(i10);
            a1Var.getClass();
            org.telegram.ui.Components.f5 f5Var = a1Var.d;
            if (f5Var != null) {
                f5Var.setColorFilter(this.R.o3);
            }
            a1Var.r.h(canvas, a1Var.n[this.K]);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.ts
    public final void d(Canvas canvas, float f7) {
        org.telegram.ui.Components.f5 f5Var;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            for (int i10 = 0; i10 < this.O.size(); i10++) {
                a1 a1Var = (a1) this.O.get(i10);
                a1Var.getClass();
                float scale = a1Var.getScale();
                float alpha = a1Var.getAlpha() * f7;
                Rect rect = org.telegram.messenger.i0.Q;
                rect.set(a1Var.getPaddingLeft() + ((int) a1Var.getX()), a1Var.getPaddingTop(), (a1Var.getWidth() + ((int) a1Var.getX())) - a1Var.getPaddingRight(), a1Var.getHeight() - a1Var.getPaddingBottom());
                org.telegram.ui.Components.f5 f5Var2 = a1Var.d;
                if (f5Var2 != null) {
                    f5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = a1Var.f;
                if (imageReceiver != null) {
                    imageReceiver.z0(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.R.o3;
                if (porterDuffColorFilter != null && (f5Var = a1Var.d) != null) {
                    f5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, f5Var2, a1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, f5Var2, a1Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.ts
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                this.R.invalidate();
                return;
            }
            jc jcVar = ((a1) arrayList.get(i10)).n[this.K];
            if (jcVar != null) {
                jcVar.a();
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    @Override // org.telegram.ui.Components.ts
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j10) {
        float intrinsicWidth;
        float width;
        int height;
        float f7;
        int i10;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i11 = 0; i11 < this.O.size(); i11++) {
            a1 a1Var = (a1) this.O.get(i11);
            a1Var.getClass();
            jc[] jcVarArr = a1Var.n;
            org.telegram.ui.Components.f5 f5Var = a1Var.d;
            ImageReceiver imageReceiver = f5Var != null ? f5Var.k : a1Var.f;
            if (imageReceiver != null) {
                imageReceiver.setAlpha(a1Var.getAlpha());
                org.telegram.ui.Components.f5 f5Var2 = a1Var.d;
                if (f5Var2 != null) {
                    f5Var2.setColorFilter(this.R.o3);
                }
                int i12 = this.K;
                jc e02 = imageReceiver.e0(jcVarArr[i12], i12);
                jcVarArr[i12] = e02;
                e02.c = j10;
                a1Var.r = imageReceiver;
                if (imageReceiver.B() != null) {
                    a1Var.r.B().V(j10);
                }
                if (a1Var.r.m() != null) {
                    a1Var.r.m().D(j10);
                }
                Rect rect = org.telegram.messenger.i0.Q;
                rect.set(a1Var.getPaddingLeft(), a1Var.getPaddingTop(), a1Var.getWidth() - a1Var.getPaddingRight(), a1Var.getHeight() - a1Var.getPaddingBottom());
                bi0 B = imageReceiver.B();
                if (B == null || (i10 = B.c) == 0) {
                    org.telegram.ui.Components.s5 m10 = imageReceiver.m();
                    if (m10 == null || m10.getIntrinsicHeight() == 0) {
                        Bitmap n10 = imageReceiver.n();
                        if (n10 != null) {
                            width = n10.getWidth();
                            height = n10.getHeight();
                        } else {
                            Drawable drawable = imageReceiver.m0;
                            intrinsicWidth = (drawable == null || drawable.getIntrinsicHeight() == 0) ? 1.0f : drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
                            if (intrinsicWidth >= 1.0f) {
                                float height2 = (rect.height() * intrinsicWidth) / 2.0f;
                                int centerX = (int) (rect.centerX() - height2);
                                rect.left = centerX;
                                rect.right = (int) (rect.centerX() + height2);
                            } else if (intrinsicWidth > 1.0f) {
                                float width2 = (rect.width() / intrinsicWidth) / 2.0f;
                                int centerY = (int) (rect.centerY() - width2);
                                rect.top = centerY;
                                rect.bottom = (int) (rect.centerY() + width2);
                            }
                            rect.offset((a1Var.getLeft() + ((int) a1Var.getTranslationX())) - this.N, 0);
                            jcVarArr[i12].b(rect);
                            arrayList.add(a1Var);
                        }
                    } else {
                        width = m10.getIntrinsicWidth();
                        height = m10.getIntrinsicHeight();
                    }
                    f7 = height;
                } else {
                    width = B.b;
                    f7 = i10;
                }
                intrinsicWidth = width / f7;
                if (intrinsicWidth >= 1.0f) {
                }
                rect.offset((a1Var.getLeft() + ((int) a1Var.getTranslationX())) - this.N, 0);
                jcVarArr[i12].b(rect);
                arrayList.add(a1Var);
            }
        }
    }
}
