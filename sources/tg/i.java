package tg;

import a8.r9;
import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class i extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public int d;
    public final w5 e;
    public boolean f;
    public final /* synthetic */ j h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Context context) {
        super(context);
        this.h = jVar;
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        this.c = paint3;
        this.e = new w5(this, 0L, 250L, xq.h);
        this.f = true;
        setWillNotDraw(false);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new DashPathEffect(new float[]{org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f)}, 0.5f));
        paint.setShadowLayer(org.telegram.messenger.g0.N(0.75f), 0.0f, 0.0f, 1342177280);
        paint2.setColor(-15033089);
        paint3.setColor(-1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.N(2.66f));
        paint3.setShadowLayer(org.telegram.messenger.g0.N(0.75f), 0.0f, 0.0f, 1342177280);
    }

    public abstract int a(float f10, float f11);

    public final void b() {
        j jVar = this.h;
        ki0 selectionBounds = jVar.getSelectionBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) selectionBounds.a;
        layoutParams.topMargin = (int) selectionBounds.b;
        layoutParams.width = (int) selectionBounds.c;
        layoutParams.height = (int) selectionBounds.d;
        setLayoutParams(layoutParams);
        setRotation(jVar.getRotation());
    }

    public float getShowAlpha() {
        return this.e.d(this.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        if (r0 != 3) goto L53;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        double atan2;
        h hVar;
        int actionMasked = motionEvent.getActionMasked();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        j jVar = this.h;
        h hVar2 = jVar.F;
        e eVar = jVar.I;
        float[] fArr = jVar.g0;
        float[] fArr2 = jVar.f0;
        float[] fArr3 = jVar.e0;
        hVar2.v(rawX, rawY, fArr3);
        boolean z10 = motionEvent.getPointerCount() > 1 && this.d == 3;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 29) {
                jVar.F.v(motionEvent.getRawX(1), motionEvent.getRawY(1), fArr2);
            } else {
                z10 = false;
            }
        }
        if (z10) {
            fArr[0] = (fArr3[0] + fArr2[0]) / 2.0f;
            fArr[1] = (fArr3[1] + fArr2[1]) / 2.0f;
        } else {
            fArr[0] = fArr3[0];
            fArr[1] = fArr3[1];
        }
        if (jVar.c0 != z10) {
            jVar.b = fArr3[0];
            jVar.c = fArr3[1];
            jVar.d = fArr2[0];
            jVar.e = fArr2[1];
            jVar.f = fArr[0];
            jVar.h = fArr[1];
            this.f = !z10;
            invalidate();
        }
        jVar.c0 = z10;
        float[] fArr4 = jVar.g0;
        float f10 = fArr4[0];
        float f11 = fArr4[1];
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i7 = this.d;
                    if (i7 == 3) {
                        float[] fArr5 = jVar.e0;
                        float f12 = fArr5[0];
                        float f13 = fArr5[1];
                        float[] fArr6 = jVar.f0;
                        z9 = jVar.c(f12, f13, fArr6[0], fArr6[1], z10);
                    } else if (i7 != 0) {
                        float f14 = f10 - jVar.b;
                        float f15 = f11 - jVar.c;
                        if (jVar.s || Math.abs(f14) > org.telegram.messenger.g0.L(2.0f) || Math.abs(f15) > org.telegram.messenger.g0.L(2.0f)) {
                            if (!jVar.s && (hVar = jVar.F) != null) {
                                hVar.y();
                            }
                            jVar.s = true;
                            org.telegram.messenger.g0.r(eVar);
                            int[] n10 = jVar.F.n(jVar);
                            float a10 = r9.a(n10[0], n10[1], jVar.b, jVar.c);
                            float a11 = r9.a(n10[0], n10[1], f10, f11);
                            float f16 = 0.0f;
                            if (a10 > 0.0f) {
                                jVar.j(a11 / a10);
                            }
                            int i10 = this.d;
                            if (i10 == 1) {
                                atan2 = Math.atan2(n10[1] - f11, n10[0] - f10);
                            } else {
                                if (i10 == 2) {
                                    atan2 = Math.atan2(f11 - n10[1], f10 - n10[0]);
                                }
                                jVar.f((float) Math.toDegrees(f16));
                                jVar.b = f10;
                                jVar.c = f11;
                            }
                            f16 = (float) atan2;
                            jVar.f((float) Math.toDegrees(f16));
                            jVar.b = f10;
                            jVar.c = f11;
                        }
                        z9 = true;
                    }
                }
                z9 = false;
            }
            jVar.d(actionMasked == 3);
            this.d = 0;
            this.f = true;
            invalidate();
            z9 = true;
        } else {
            jVar.d0 = false;
            int a12 = a(motionEvent.getX(), motionEvent.getY());
            if (a12 != 0) {
                this.d = a12;
                jVar.b = fArr3[0];
                jVar.c = fArr3[1];
                jVar.f = f10;
                jVar.h = f11;
                jVar.r = false;
                if (getParent() instanceof d) {
                    ((d) getParent()).invalidate();
                }
                if (a12 == 3 && (jVar instanceof q1)) {
                    org.telegram.messenger.g0.i3(eVar, ViewConfiguration.getLongPressTimeout());
                }
                z9 = true;
            }
            z9 = false;
        }
        jVar.d0 = z10;
        return super.onTouchEvent(motionEvent) || z9;
    }
}
