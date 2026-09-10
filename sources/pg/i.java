package pg;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.wr;
import v7.a7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class i extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public int d;
    public final d6 e;
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
        this.e = new d6(this, 0L, 250L, wr.h);
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
        j jVar = this.h;
        rk0 selectionBounds = jVar.getSelectionBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) selectionBounds.a;
        layoutParams.topMargin = (int) selectionBounds.b;
        layoutParams.width = (int) selectionBounds.c;
        layoutParams.height = (int) selectionBounds.d;
        setLayoutParams(layoutParams);
        setRotation(jVar.getRotation());
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
        hVar2.t(rawX, rawY, fArr3);
        boolean z11 = motionEvent.getPointerCount() > 1 && this.d == 3;
        if (z11) {
            if (Build.VERSION.SDK_INT >= 29) {
                jVar.F.t(motionEvent.getRawX(1), motionEvent.getRawY(1), fArr2);
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
        if (jVar.c0 != z11) {
            jVar.b = fArr3[0];
            jVar.c = fArr3[1];
            jVar.d = fArr2[0];
            jVar.e = fArr2[1];
            jVar.f = fArr[0];
            jVar.h = fArr[1];
            this.f = !z11;
            invalidate();
        }
        jVar.c0 = z11;
        float[] fArr4 = jVar.g0;
        float f7 = fArr4[0];
        float f10 = fArr4[1];
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i10 = this.d;
                    if (i10 == 3) {
                        float[] fArr5 = jVar.e0;
                        float f11 = fArr5[0];
                        float f12 = fArr5[1];
                        float[] fArr6 = jVar.f0;
                        z10 = jVar.c(f11, f12, z11, fArr6[0], fArr6[1]);
                    } else if (i10 != 0) {
                        float f13 = f7 - jVar.b;
                        float f14 = f10 - jVar.c;
                        if (jVar.s || Math.abs(f13) > AndroidUtilities.dp(2.0f) || Math.abs(f14) > AndroidUtilities.dp(2.0f)) {
                            if (!jVar.s && (hVar = jVar.F) != null) {
                                hVar.v();
                            }
                            jVar.s = true;
                            AndroidUtilities.cancelRunOnUIThread(eVar);
                            int[] z12 = jVar.F.z(jVar);
                            float a2 = a7.a(z12[0], z12[1], jVar.b, jVar.c);
                            float a10 = a7.a(z12[0], z12[1], f7, f10);
                            float f15 = 0.0f;
                            if (a2 > 0.0f) {
                                jVar.j(a10 / a2);
                            }
                            int i11 = this.d;
                            if (i11 == 1) {
                                atan2 = Math.atan2(z12[1] - f10, z12[0] - f7);
                            } else {
                                if (i11 == 2) {
                                    atan2 = Math.atan2(f10 - z12[1], f7 - z12[0]);
                                }
                                jVar.f((float) Math.toDegrees(f15));
                                jVar.b = f7;
                                jVar.c = f10;
                            }
                            f15 = (float) atan2;
                            jVar.f((float) Math.toDegrees(f15));
                            jVar.b = f7;
                            jVar.c = f10;
                        }
                        z10 = true;
                    }
                }
                z10 = false;
            }
            jVar.d(actionMasked == 3);
            this.d = 0;
            this.f = true;
            invalidate();
            z10 = true;
        } else {
            jVar.d0 = false;
            int a11 = a(motionEvent.getX(), motionEvent.getY());
            if (a11 != 0) {
                this.d = a11;
                jVar.b = fArr3[0];
                jVar.c = fArr3[1];
                jVar.f = f7;
                jVar.h = f10;
                jVar.r = false;
                if (getParent() instanceof d) {
                    ((d) getParent()).invalidate();
                }
                if (a11 == 3 && (jVar instanceof a2)) {
                    AndroidUtilities.runOnUIThread(eVar, ViewConfiguration.getLongPressTimeout());
                }
                z10 = true;
            }
            z10 = false;
        }
        jVar.d0 = z11;
        return super.onTouchEvent(motionEvent) || z10;
    }
}
