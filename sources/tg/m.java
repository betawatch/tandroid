package tg;

import a8.x9;
import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class m extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public int d;
    public final c6 e;
    public boolean f;
    public final /* synthetic */ n h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Context context) {
        super(context);
        this.h = nVar;
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        this.c = paint3;
        this.e = new c6(this, 0L, 250L, kr.h);
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
        n nVar = this.h;
        aj0 selectionBounds = nVar.getSelectionBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) selectionBounds.a;
        layoutParams.topMargin = (int) selectionBounds.b;
        layoutParams.width = (int) selectionBounds.c;
        layoutParams.height = (int) selectionBounds.d;
        setLayoutParams(layoutParams);
        setRotation(nVar.getRotation());
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
        boolean z10;
        double atan2;
        l lVar;
        int actionMasked = motionEvent.getActionMasked();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        n nVar = this.h;
        l lVar2 = nVar.H;
        i iVar = nVar.K;
        float[] fArr = nVar.i0;
        float[] fArr2 = nVar.h0;
        float[] fArr3 = nVar.g0;
        lVar2.v(rawX, rawY, fArr3);
        boolean z11 = motionEvent.getPointerCount() > 1 && this.d == 3;
        if (z11) {
            if (Build.VERSION.SDK_INT >= 29) {
                nVar.H.v(motionEvent.getRawX(1), motionEvent.getRawY(1), fArr2);
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
        if (nVar.e0 != z11) {
            nVar.b = fArr3[0];
            nVar.c = fArr3[1];
            nVar.d = fArr2[0];
            nVar.e = fArr2[1];
            nVar.f = fArr[0];
            nVar.h = fArr[1];
            this.f = !z11;
            invalidate();
        }
        nVar.e0 = z11;
        float[] fArr4 = nVar.i0;
        float f10 = fArr4[0];
        float f11 = fArr4[1];
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i7 = this.d;
                    if (i7 == 3) {
                        float[] fArr5 = nVar.g0;
                        float f12 = fArr5[0];
                        float f13 = fArr5[1];
                        float[] fArr6 = nVar.h0;
                        z10 = nVar.c(f12, f13, fArr6[0], fArr6[1], z11);
                    } else if (i7 != 0) {
                        float f14 = f10 - nVar.b;
                        float f15 = f11 - nVar.c;
                        if (nVar.w || Math.abs(f14) > org.telegram.messenger.g0.L(2.0f) || Math.abs(f15) > org.telegram.messenger.g0.L(2.0f)) {
                            if (!nVar.w && (lVar = nVar.H) != null) {
                                lVar.y();
                            }
                            nVar.w = true;
                            org.telegram.messenger.g0.r(iVar);
                            int[] n10 = nVar.H.n(nVar);
                            float a10 = x9.a(n10[0], n10[1], nVar.b, nVar.c);
                            float a11 = x9.a(n10[0], n10[1], f10, f11);
                            float f16 = 0.0f;
                            if (a10 > 0.0f) {
                                nVar.j(a11 / a10);
                            }
                            int i10 = this.d;
                            if (i10 == 1) {
                                atan2 = Math.atan2(n10[1] - f11, n10[0] - f10);
                            } else {
                                if (i10 == 2) {
                                    atan2 = Math.atan2(f11 - n10[1], f10 - n10[0]);
                                }
                                nVar.f((float) Math.toDegrees(f16));
                                nVar.b = f10;
                                nVar.c = f11;
                            }
                            f16 = (float) atan2;
                            nVar.f((float) Math.toDegrees(f16));
                            nVar.b = f10;
                            nVar.c = f11;
                        }
                        z10 = true;
                    }
                }
                z10 = false;
            }
            nVar.d(actionMasked == 3);
            this.d = 0;
            this.f = true;
            invalidate();
            z10 = true;
        } else {
            nVar.f0 = false;
            int a12 = a(motionEvent.getX(), motionEvent.getY());
            if (a12 != 0) {
                this.d = a12;
                nVar.b = fArr3[0];
                nVar.c = fArr3[1];
                nVar.f = f10;
                nVar.h = f11;
                nVar.r = false;
                nVar.s = true;
                if (getParent() instanceof h) {
                    ((h) getParent()).invalidate();
                }
                if (a12 == 3 && (nVar instanceof v1)) {
                    org.telegram.messenger.g0.h3(iVar, ViewConfiguration.getLongPressTimeout());
                }
                z10 = true;
            }
            z10 = false;
        }
        nVar.f0 = z11;
        return super.onTouchEvent(motionEvent) || z10;
    }
}
