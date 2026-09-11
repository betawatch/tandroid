package rg;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.pr;
import v7.z6;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public abstract class j extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public int d;
    public final e6 e;
    public boolean f;
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Context context) {
        super(context);
        this.h = kVar;
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        this.c = paint3;
        this.e = new e6(this, 0L, 250L, pr.h);
        this.f = true;
        setWillNotDraw(false);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f)}, 0.5f));
        paint.setShadowLayer(AndroidUtilities.dpf2(0.75f), 0.0f, 0.0f, 1342177280);
        paint2.setColor(-15033089);
        paint3.setColor(-1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint3.setShadowLayer(AndroidUtilities.dpf2(0.75f), 0.0f, 0.0f, 1342177280);
    }

    public abstract int a(float f7, float f10);

    public final void b() {
        k kVar = this.h;
        hk0 selectionBounds = kVar.getSelectionBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) selectionBounds.a;
        layoutParams.topMargin = (int) selectionBounds.b;
        layoutParams.width = (int) selectionBounds.c;
        layoutParams.height = (int) selectionBounds.d;
        setLayoutParams(layoutParams);
        setRotation(kVar.getRotation());
    }

    public float getShowAlpha() {
        return this.e.e(this.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        if (r0 != 3) goto L53;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        double atan2;
        i iVar;
        int actionMasked = motionEvent.getActionMasked();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        k kVar = this.h;
        i iVar2 = kVar.F;
        e eVar = kVar.I;
        float[] fArr = kVar.g0;
        float[] fArr2 = kVar.f0;
        float[] fArr3 = kVar.e0;
        iVar2.u(rawX, rawY, fArr3);
        boolean z11 = motionEvent.getPointerCount() > 1 && this.d == 3;
        if (z11) {
            if (Build.VERSION.SDK_INT >= 29) {
                kVar.F.u(motionEvent.getRawX(1), motionEvent.getRawY(1), fArr2);
            } else {
                z11 = false;
            }
        }
        if (z11) {
            fArr[0] = (fArr3[0] + fArr2[0]) / 2.0f;
            fArr[1] = (fArr3[1] + fArr2[1]) / 2.0f;
        } else {
            fArr[0] = fArr3[0];
            fArr[1] = fArr3[1];
        }
        if (kVar.c0 != z11) {
            kVar.b = fArr3[0];
            kVar.c = fArr3[1];
            kVar.d = fArr2[0];
            kVar.e = fArr2[1];
            kVar.f = fArr[0];
            kVar.h = fArr[1];
            this.f = !z11;
            invalidate();
        }
        kVar.c0 = z11;
        float[] fArr4 = kVar.g0;
        float f7 = fArr4[0];
        float f10 = fArr4[1];
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i10 = this.d;
                    if (i10 == 3) {
                        float[] fArr5 = kVar.e0;
                        float f11 = fArr5[0];
                        float f12 = fArr5[1];
                        float[] fArr6 = kVar.f0;
                        z10 = kVar.c(f11, f12, z11, fArr6[0], fArr6[1]);
                    } else if (i10 != 0) {
                        float f13 = f7 - kVar.b;
                        float f14 = f10 - kVar.c;
                        if (kVar.s || Math.abs(f13) > AndroidUtilities.dp(2.0f) || Math.abs(f14) > AndroidUtilities.dp(2.0f)) {
                            if (!kVar.s && (iVar = kVar.F) != null) {
                                iVar.y();
                            }
                            kVar.s = true;
                            AndroidUtilities.cancelRunOnUIThread(eVar);
                            int[] w10 = kVar.F.w(kVar);
                            float a2 = z6.a(w10[0], w10[1], kVar.b, kVar.c);
                            float a10 = z6.a(w10[0], w10[1], f7, f10);
                            float f15 = 0.0f;
                            if (a2 > 0.0f) {
                                kVar.j(a10 / a2);
                            }
                            int i11 = this.d;
                            if (i11 == 1) {
                                atan2 = Math.atan2(w10[1] - f10, w10[0] - f7);
                            } else {
                                if (i11 == 2) {
                                    atan2 = Math.atan2(f10 - w10[1], f7 - w10[0]);
                                }
                                kVar.f((float) Math.toDegrees(f15));
                                kVar.b = f7;
                                kVar.c = f10;
                            }
                            f15 = (float) atan2;
                            kVar.f((float) Math.toDegrees(f15));
                            kVar.b = f7;
                            kVar.c = f10;
                        }
                        z10 = true;
                    }
                }
                z10 = false;
            }
            kVar.d(actionMasked == 3);
            this.d = 0;
            this.f = true;
            invalidate();
            z10 = true;
        } else {
            kVar.d0 = false;
            int a11 = a(motionEvent.getX(), motionEvent.getY());
            if (a11 != 0) {
                this.d = a11;
                kVar.b = fArr3[0];
                kVar.c = fArr3[1];
                kVar.f = f7;
                kVar.h = f10;
                kVar.r = false;
                if (getParent() instanceof d) {
                    ((d) getParent()).invalidate();
                }
                if (a11 == 3 && (kVar instanceof c2)) {
                    AndroidUtilities.runOnUIThread(eVar, ViewConfiguration.getLongPressTimeout());
                }
                z10 = true;
            }
            z10 = false;
        }
        kVar.d0 = z11;
        return super.onTouchEvent(motionEvent) || z10;
    }
}
