package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class x40 extends org.telegram.ui.ActionBar.h5 {
    public LinearGradient I0;
    public int J0;
    public final Matrix K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public float P0;
    public long Q0;
    public final /* synthetic */ s50 R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x40(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.R0 = s50Var;
        this.K0 = new Matrix();
        this.L0 = -1.0f;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void d(int i10) {
        super.d(i10);
        int textWidth = getTextWidth();
        if (textWidth != this.J0) {
            float f10 = textWidth;
            this.P0 = 1.3f * f10;
            float textHeight = getTextHeight();
            float f11 = f10 * 2.0f;
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ih, false);
            int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kh, false);
            int i11 = org.telegram.ui.ActionBar.g6.jh;
            this.I0 = new LinearGradient(0.0f, textHeight, f11, 0.0f, new int[]{w02, w03, org.telegram.ui.ActionBar.g6.w0(null, i11, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
            getPaint().setShader(this.I0);
            this.J0 = textWidth;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    @Override // org.telegram.ui.ActionBar.h5, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f10;
        long j10;
        float f11;
        float d;
        float f12;
        if (this.I0 != null) {
            s50 s50Var = this.R0;
            ChatObject.Call call = s50Var.W0;
            if (call != null && call.isScheduled()) {
                long currentTimeMillis = (s50Var.W0.call.schedule_date * 1000) - s50Var.d.getConnectionsManager().getCurrentTimeMillis();
                if (currentTimeMillis < 0) {
                    f10 = 1.0f;
                } else if (currentTimeMillis < 5000) {
                    f10 = 1.0f - (currentTimeMillis / 5000.0f);
                }
                Matrix matrix = this.K0;
                matrix.reset();
                matrix.postTranslate((-this.J0) * 0.7f * f10, 0.0f);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j10 = elapsedRealtime - this.Q0;
                if (j10 > 20) {
                    j10 = 17;
                }
                this.Q0 = elapsedRealtime;
                f11 = this.N0;
                if (f11 != 0.0f || this.O0 >= f11) {
                    this.N0 = Utilities.random.nextInt(200) + 1500;
                    this.O0 = 0.0f;
                    if (this.L0 == -1.0f) {
                        this.L0 = ((Utilities.random.nextInt(100) - 50) * 0.2f) / 50.0f;
                    }
                    this.M0 = this.L0;
                    this.L0 = ((Utilities.random.nextInt(100) - 50) * 0.2f) / 50.0f;
                }
                float f13 = j10;
                d = com.google.android.recaptcha.internal.a.d(f13 * 0.02f, s50Var.K0, 1.0f * f13, this.O0);
                this.O0 = d;
                f12 = this.N0;
                if (d > f12) {
                    this.O0 = f12;
                }
                float interpolation = org.telegram.ui.Components.er.g.getInterpolation(this.O0 / f12);
                float f14 = this.P0;
                float f15 = this.M0;
                matrix.postTranslate(((((this.L0 - f15) * interpolation) + f15) * f14) - (f14 / 2.0f), 0.0f);
                this.I0.setLocalMatrix(matrix);
                invalidate();
            }
            f10 = 0.0f;
            Matrix matrix2 = this.K0;
            matrix2.reset();
            matrix2.postTranslate((-this.J0) * 0.7f * f10, 0.0f);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            j10 = elapsedRealtime2 - this.Q0;
            if (j10 > 20) {
            }
            this.Q0 = elapsedRealtime2;
            f11 = this.N0;
            if (f11 != 0.0f) {
            }
            this.N0 = Utilities.random.nextInt(200) + 1500;
            this.O0 = 0.0f;
            if (this.L0 == -1.0f) {
            }
            this.M0 = this.L0;
            this.L0 = ((Utilities.random.nextInt(100) - 50) * 0.2f) / 50.0f;
            float f132 = j10;
            d = com.google.android.recaptcha.internal.a.d(f132 * 0.02f, s50Var.K0, 1.0f * f132, this.O0);
            this.O0 = d;
            f12 = this.N0;
            if (d > f12) {
            }
            float interpolation2 = org.telegram.ui.Components.er.g.getInterpolation(this.O0 / f12);
            float f142 = this.P0;
            float f152 = this.M0;
            matrix2.postTranslate(((((this.L0 - f152) * interpolation2) + f152) * f142) - (f142 / 2.0f), 0.0f);
            this.I0.setLocalMatrix(matrix2);
            invalidate();
        }
        super.onDraw(canvas);
    }
}
