package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class v9 extends ViewGroup {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(y9 y9Var, Context context) {
        super(context);
        this.c = y9Var;
        this.b = new Path();
    }

    public static RectF a(int i10, int i11, int i12) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        return rectF;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 0:
                Path path = (Path) this.b;
                boolean drawChild = super.drawChild(canvas, view, j10);
                y9 y9Var = (y9) this.c;
                Paint paint = y9Var.r;
                Paint paint2 = y9Var.n;
                if (!y9Var.b0() || view != y9Var.d) {
                    return drawChild;
                }
                float min = Math.min(1.0f, Math.max(0.0f, (SystemClock.elapsedRealtime() - y9Var.L) / 75.0f));
                if (min < 1.0f) {
                    y9Var.fragmentView.invalidate();
                }
                RectF rectF = y9Var.J;
                RectF rectF2 = y9Var.K;
                RectF rectF3 = AndroidUtilities.rectTmp;
                AndroidUtilities.lerp(rectF, rectF2, min, rectF3);
                if (y9Var.b0 < 1.0f) {
                    if (y9Var.c0 == null) {
                        y9Var.i0();
                    }
                    AndroidUtilities.lerp(y9Var.c0, rectF3, y9Var.b0, rectF3);
                }
                int width = (int) (rectF3.width() * view.getWidth());
                int height = (int) (rectF3.height() * view.getHeight());
                int centerX = (int) (rectF3.centerX() * view.getWidth());
                int centerY = (int) (rectF3.centerY() * view.getHeight());
                float f7 = y9Var.E;
                float f10 = (f7 * 0.5f) + 0.5f;
                int i10 = (int) (width * f10);
                int i11 = (int) (f10 * height);
                int i12 = centerX - (i10 / 2);
                int i13 = centerY - (i11 / 2);
                paint2.setAlpha((int) ((1.0f - (Math.min(1.0f, f7) * (1.0f - y9Var.w))) * 255.0f));
                float f11 = i13;
                canvas.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), f11, paint2);
                int i14 = i13 + i11;
                float f12 = i14;
                canvas.drawRect(0.0f, f12, view.getMeasuredWidth(), view.getMeasuredHeight(), paint2);
                float f13 = i12;
                canvas.drawRect(0.0f, f11, f13, f12, paint2);
                int i15 = i12 + i10;
                float f14 = i15;
                canvas.drawRect(f14, f11, view.getMeasuredWidth(), f12, paint2);
                paint2.setAlpha((int) (Math.max(0.0f, 1.0f - y9Var.E) * 255.0f));
                canvas.drawRect(f13, f11, f14, f12, paint2);
                int lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), Math.min(1.0f, y9Var.E * 20.0f));
                int i16 = lerp / 2;
                int lerp2 = AndroidUtilities.lerp(Math.min(i10, i11), AndroidUtilities.dp(20.0f), Math.min(1.2f, (float) Math.pow(y9Var.E, 1.7999999523162842d)));
                paint.setAlpha((int) (Math.min(1.0f, y9Var.E) * 255.0f));
                path.reset();
                int i17 = i13 + lerp2;
                path.arcTo(a(i12, i17, i16), 0.0f, 180.0f);
                float f15 = lerp * 1.5f;
                int i18 = (int) (f13 + f15);
                int i19 = (int) (f11 + f15);
                int i20 = lerp * 2;
                path.arcTo(a(i18, i19, i20), 180.0f, 90.0f);
                int i21 = i12 + lerp2;
                path.arcTo(a(i21, i13, i16), 270.0f, 180.0f);
                path.lineTo(i12 + i16, i13 + i16);
                path.arcTo(a(i18, i19, lerp), 270.0f, -90.0f);
                path.close();
                canvas.drawPath(path, paint);
                path.reset();
                path.arcTo(a(i15, i17, i16), 180.0f, -180.0f);
                int i22 = (int) (f14 - f15);
                path.arcTo(a(i22, i19, i20), 0.0f, -90.0f);
                int i23 = i15 - lerp2;
                path.arcTo(a(i23, i13, i16), 270.0f, -180.0f);
                path.arcTo(a(i22, i19, lerp), 270.0f, 90.0f);
                path.close();
                canvas.drawPath(path, paint);
                path.reset();
                int i24 = i14 - lerp2;
                path.arcTo(a(i12, i24, i16), 0.0f, -180.0f);
                int i25 = (int) (f12 - f15);
                path.arcTo(a(i18, i25, i20), 180.0f, -90.0f);
                path.arcTo(a(i21, i14, i16), 90.0f, -180.0f);
                path.arcTo(a(i18, i25, lerp), 90.0f, 90.0f);
                path.close();
                canvas.drawPath(path, paint);
                path.reset();
                path.arcTo(a(i15, i24, i16), 180.0f, 180.0f);
                path.arcTo(a(i22, i25, i20), 0.0f, 90.0f);
                path.arcTo(a(i23, i14, i16), 90.0f, 180.0f);
                path.arcTo(a(i22, i25, lerp), 90.0f, -90.0f);
                path.close();
                canvas.drawPath(path, paint);
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        int measuredHeight;
        int dp;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        switch (this.a) {
            case 0:
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                y9 y9Var = (y9) this.c;
                int i16 = y9Var.W;
                if (i16 == 0) {
                    CameraView cameraView = y9Var.d;
                    if (cameraView != null) {
                        cameraView.layout(0, 0, cameraView.getMeasuredWidth(), y9Var.d.getMeasuredHeight());
                    }
                    y9Var.h.setTextSize(0, i15 / 22);
                    y9Var.h.setPadding(0, 0, 0, i15 / 15);
                    int i17 = (int) (i15 * 0.65f);
                    y9Var.b.layout(AndroidUtilities.dp(36.0f), i17, y9Var.b.getMeasuredWidth() + AndroidUtilities.dp(36.0f), y9Var.b.getMeasuredHeight() + i17);
                } else {
                    kVar = ((org.telegram.ui.ActionBar.r2) y9Var).actionBar;
                    kVar2 = ((org.telegram.ui.ActionBar.r2) y9Var).actionBar;
                    int measuredWidth = kVar2.getMeasuredWidth();
                    kVar3 = ((org.telegram.ui.ActionBar.r2) y9Var).actionBar;
                    kVar.layout(0, 0, measuredWidth, kVar3.getMeasuredHeight());
                    CameraView cameraView2 = y9Var.d;
                    if (cameraView2 != null) {
                        cameraView2.layout(0, 0, cameraView2.getMeasuredWidth(), y9Var.d.getMeasuredHeight());
                    }
                    int min = (int) (Math.min(i14, i15) / 1.5f);
                    if (i16 == 1) {
                        measuredHeight = ((i15 - min) / 2) - y9Var.b.getMeasuredHeight();
                        dp = AndroidUtilities.dp(30.0f);
                    } else {
                        measuredHeight = ((i15 - min) / 2) - y9Var.b.getMeasuredHeight();
                        dp = AndroidUtilities.dp(64.0f);
                    }
                    int i18 = measuredHeight - dp;
                    y9Var.b.layout(AndroidUtilities.dp(36.0f), i18, y9Var.b.getMeasuredWidth() + AndroidUtilities.dp(36.0f), y9Var.b.getMeasuredHeight() + i18);
                    if (i16 == 3) {
                        int D = org.telegram.messenger.t.D(8.0f, y9Var.b.getMeasuredHeight(), i18);
                        y9Var.c.layout(AndroidUtilities.dp(36.0f), D, y9Var.c.getMeasuredWidth() + AndroidUtilities.dp(36.0f), y9Var.c.getMeasuredHeight() + D);
                    }
                    y9Var.h.layout(0, getMeasuredHeight() - y9Var.h.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                    int measuredWidth2 = (i14 / 2) - (y9Var.s.getMeasuredWidth() / 2);
                    int dp2 = AndroidUtilities.dp(80.0f) + ic.a.A(i15, min, 2, min);
                    ImageView imageView = y9Var.s;
                    imageView.layout(measuredWidth2, dp2, imageView.getMeasuredWidth() + measuredWidth2, y9Var.s.getMeasuredHeight() + dp2);
                }
                if (i16 != 3) {
                    int i19 = (int) (i15 * 0.74f);
                    int i20 = (int) (i14 * 0.05f);
                    TextView textView = y9Var.c;
                    textView.layout(i20, i19, textView.getMeasuredWidth() + i20, y9Var.c.getMeasuredHeight() + i19);
                }
                y9Var.i0();
                break;
            default:
                dg1 dg1Var = (dg1) this.c;
                kVar4 = ((org.telegram.ui.ActionBar.r2) dg1Var).actionBar;
                kVar5 = ((org.telegram.ui.ActionBar.r2) dg1Var).actionBar;
                int measuredWidth3 = kVar5.getMeasuredWidth();
                kVar6 = ((org.telegram.ui.ActionBar.r2) dg1Var).actionBar;
                kVar4.layout(0, 0, measuredWidth3, kVar6.getMeasuredHeight());
                fi.f6 f6Var = dg1Var.y;
                f6Var.layout(0, 0, f6Var.getMeasuredWidth(), dg1Var.y.getMeasuredHeight());
                jl0 jl0Var = (jl0) this.b;
                jl0Var.layout(0, 0, jl0Var.getMeasuredWidth(), jl0Var.getMeasuredHeight());
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                y9 y9Var = (y9) this.c;
                kVar = ((org.telegram.ui.ActionBar.r2) y9Var).actionBar;
                kVar.measure(i10, i11);
                int i12 = y9Var.W;
                if (i12 == 0) {
                    CameraView cameraView = y9Var.d;
                    if (cameraView != null) {
                        cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size * 0.704f), TLObject.FLAG_30));
                    }
                } else {
                    CameraView cameraView2 = y9Var.d;
                    if (cameraView2 != null) {
                        cameraView2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                    }
                    y9Var.h.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    y9Var.s.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), TLObject.FLAG_30));
                }
                y9Var.b.measure(org.telegram.messenger.vh.x(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                if (i12 == 3) {
                    y9Var.c.measure(org.telegram.messenger.vh.x(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                } else {
                    y9Var.c.measure(View.MeasureSpec.makeMeasureSpec((int) (size * 0.9f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                dg1 dg1Var = (dg1) this.c;
                kVar2 = ((org.telegram.ui.ActionBar.r2) dg1Var).actionBar;
                kVar2.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i11);
                fi.f6 f6Var = dg1Var.y;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
                kVar3 = ((org.telegram.ui.ActionBar.r2) dg1Var).actionBar;
                f6Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(3.0f) + kVar3.getMeasuredHeight(), TLObject.FLAG_30));
                ((jl0) this.b).measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i11);
                setMeasuredDimension(size3, size4);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(dg1 dg1Var, Context context, jl0 jl0Var) {
        super(context);
        this.c = dg1Var;
        this.b = jl0Var;
    }
}
