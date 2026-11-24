// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sw3 extends yr3 {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final boolean R = e86.e(8200);
    public final /* synthetic */ uw3 S;

    public sw3(uw3 uw3Var) {
        this.S = uw3Var;
    }

    public static void m(Canvas canvas, vm vmVar, tw3 tw3Var, float f) {
        if (vmVar != null) {
            vmVar.setAlpha((int) (f * 255.0f));
            vmVar.draw(canvas);
        } else if (tw3Var.f != null) {
            canvas.save();
            ImageReceiver imageReceiver = tw3Var.f;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), tw3Var.f.x());
            tw3Var.f.setAlpha(f);
            tw3Var.f.h(canvas, null);
            canvas.restore();
        }
    }

    @Override // yr3
    public final void a(Canvas canvas, long j, int i, int i2, float f) {
        if (this.P == null) {
            return;
        }
        boolean z = true;
        boolean z2 = this.S.c0() || this.P.size() <= 4 || !this.R;
        if (!z2) {
            for (int i3 = 0; i3 < this.P.size(); i3++) {
                if (((tw3) this.P.get(i3)).getScale() != 1.0f) {
                    break;
                }
            }
        }
        z = z2;
        if (!z) {
            super.a(canvas, j, i, i2, f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f);
        k();
    }

    @Override // yr3
    public final void c(Canvas canvas) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i >= arrayList.size()) {
                return;
            }
            tw3 tw3Var = (tw3) arrayList.get(i);
            tw3Var.getClass();
            vm vmVar = tw3Var.d;
            if (vmVar != null) {
                vmVar.setColorFilter(this.S.p3);
            }
            tw3Var.r.h(canvas, tw3Var.n[this.L]);
            i++;
        }
    }

    @Override // yr3
    public final void d(Canvas canvas, float f) {
        vm vmVar;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            for (int i = 0; i < this.P.size(); i++) {
                tw3 tw3Var = (tw3) this.P.get(i);
                tw3Var.getClass();
                float scale = tw3Var.getScale();
                float alpha = tw3Var.getAlpha() * f;
                Rect rect = gm.Q;
                rect.set(tw3Var.getPaddingLeft() + ((int) tw3Var.getX()), tw3Var.getPaddingTop(), (tw3Var.getWidth() + ((int) tw3Var.getX())) - tw3Var.getPaddingRight(), tw3Var.getHeight() - tw3Var.getPaddingBottom());
                vm vmVar2 = tw3Var.d;
                if (vmVar2 != null) {
                    vmVar2.setBounds(rect);
                }
                ImageReceiver imageReceiver = tw3Var.f;
                if (imageReceiver != null) {
                    imageReceiver.j0(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.S.p3;
                if (porterDuffColorFilter != null && (vmVar = tw3Var.d) != null) {
                    vmVar.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, vmVar2, tw3Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, vmVar2, tw3Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override // yr3
    public final void g() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i >= arrayList.size()) {
                this.S.invalidate();
                return;
            }
            in5 in5Var = ((tw3) arrayList.get(i)).n[this.L];
            if (in5Var != null) {
                in5Var.a();
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f7  */
    @Override // yr3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j) {
        float intrinsicWidth;
        float width;
        int height;
        float f;
        int i;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        for (int i2 = 0; i2 < this.P.size(); i2++) {
            tw3 tw3Var = (tw3) this.P.get(i2);
            tw3Var.getClass();
            in5[] in5VarArr = tw3Var.n;
            vm vmVar = tw3Var.d;
            ImageReceiver imageReceiver = vmVar != null ? vmVar.k : tw3Var.f;
            if (imageReceiver != null) {
                imageReceiver.setAlpha(tw3Var.getAlpha());
                vm vmVar2 = tw3Var.d;
                if (vmVar2 != null) {
                    vmVar2.setColorFilter(this.S.p3);
                }
                int i3 = this.L;
                in5 Q = imageReceiver.Q(in5VarArr[i3], i3);
                in5VarArr[i3] = Q;
                Q.c = j;
                tw3Var.r = imageReceiver;
                if (imageReceiver.y() != null) {
                    tw3Var.r.y().Q(j);
                }
                if (tw3Var.r.m() != null) {
                    tw3Var.r.m().D(j);
                }
                Rect rect = gm.Q;
                rect.set(tw3Var.getPaddingLeft(), tw3Var.getPaddingTop(), tw3Var.getWidth() - tw3Var.getPaddingRight(), tw3Var.getHeight() - tw3Var.getPaddingBottom());
                p09 y = imageReceiver.y();
                if (y == null || (i = y.c) == 0) {
                    kn m = imageReceiver.m();
                    if (m == null || m.getIntrinsicHeight() == 0) {
                        Bitmap n = imageReceiver.n();
                        if (n != null) {
                            width = n.getWidth();
                            height = n.getHeight();
                        } else {
                            Drawable drawable = imageReceiver.n0;
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
                            rect.offset((tw3Var.getLeft() + ((int) tw3Var.getTranslationX())) - this.O, 0);
                            in5VarArr[i3].b(rect);
                            arrayList.add(tw3Var);
                        }
                    } else {
                        width = m.getIntrinsicWidth();
                        height = m.getIntrinsicHeight();
                    }
                    f = height;
                } else {
                    width = y.b;
                    f = i;
                }
                intrinsicWidth = width / f;
                if (intrinsicWidth >= 1.0f) {
                }
                rect.offset((tw3Var.getLeft() + ((int) tw3Var.getTranslationX())) - this.O, 0);
                in5VarArr[i3].b(rect);
                arrayList.add(tw3Var);
            }
        }
    }
}
