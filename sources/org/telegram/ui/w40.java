package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w40 extends org.telegram.ui.ActionBar.h5 {
    public LinearGradient I0;
    public int J0;
    public final Matrix K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public float P0;
    public long Q0;
    public final /* synthetic */ r50 R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w40(r50 r50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.R0 = r50Var;
        this.K0 = new Matrix();
        this.L0 = -1.0f;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void d(int i10) {
        super.d(i10);
        int textWidth = getTextWidth();
        if (textWidth != this.J0) {
            float f9 = textWidth;
            this.P0 = 1.3f * f9;
            float textHeight = getTextHeight();
            float f10 = f9 * 2.0f;
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ih, false);
            int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kh, false);
            int i11 = org.telegram.ui.ActionBar.g6.jh;
            this.I0 = new LinearGradient(0.0f, textHeight, f10, 0.0f, new int[]{w02, w03, org.telegram.ui.ActionBar.g6.w0(null, i11, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
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
        float f9;
        long j10;
        float f10;
        float d;
        float f11;
        if (this.I0 != null) {
            r50 r50Var = this.R0;
            ChatObject.Call call = r50Var.W0;
            if (call != null && call.isScheduled()) {
                long currentTimeMillis = (r50Var.W0.call.schedule_date * 1000) - r50Var.d.getConnectionsManager().getCurrentTimeMillis();
                if (currentTimeMillis < 0) {
                    f9 = 1.0f;
                } else if (currentTimeMillis < 5000) {
                    f9 = 1.0f - (currentTimeMillis / 5000.0f);
                }
                Matrix matrix = this.K0;
                matrix.reset();
                matrix.postTranslate((-this.J0) * 0.7f * f9, 0.0f);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j10 = elapsedRealtime - this.Q0;
                if (j10 > 20) {
                    j10 = 17;
                }
                this.Q0 = elapsedRealtime;
                f10 = this.N0;
                if (f10 != 0.0f || this.O0 >= f10) {
                    this.N0 = Utilities.random.nextInt(200) + 1500;
                    this.O0 = 0.0f;
                    if (this.L0 == -1.0f) {
                        this.L0 = ((Utilities.random.nextInt(100) - 50) * 0.2f) / 50.0f;
                    }
                    this.M0 = this.L0;
                    this.L0 = ((Utilities.random.nextInt(100) - 50) * 0.2f) / 50.0f;
                }
                float f12 = j10;
                d = com.google.android.recaptcha.internal.a.d(f12 * 0.02f, r50Var.K0, 1.0f * f12, this.O0);
                this.O0 = d;
                f11 = this.N0;
                if (d > f11) {
                    this.O0 = f11;
                }
                float interpolation = org.telegram.ui.Components.jr.g.getInterpolation(this.O0 / f11);
                float f13 = this.P0;
                float f14 = this.M0;
                matrix.postTranslate(((((this.L0 - f14) * interpolation) + f14) * f13) - (f13 / 2.0f), 0.0f);
                this.I0.setLocalMatrix(matrix);
                invalidate();
            }
            f9 = 0.0f;
            Matrix matrix2 = this.K0;
            matrix2.reset();
            matrix2.postTranslate((-this.J0) * 0.7f * f9, 0.0f);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            j10 = elapsedRealtime2 - this.Q0;
            if (j10 > 20) {
            }
            this.Q0 = elapsedRealtime2;
            f10 = this.N0;
            if (f10 != 0.0f) {
            }
            this.N0 = Utilities.random.nextInt(200) + 1500;
            this.O0 = 0.0f;
            if (this.L0 == -1.0f) {
            }
            this.M0 = this.L0;
            this.L0 = ((Utilities.random.nextInt(100) - 50) * 0.2f) / 50.0f;
            float f122 = j10;
            d = com.google.android.recaptcha.internal.a.d(f122 * 0.02f, r50Var.K0, 1.0f * f122, this.O0);
            this.O0 = d;
            f11 = this.N0;
            if (d > f11) {
            }
            float interpolation2 = org.telegram.ui.Components.jr.g.getInterpolation(this.O0 / f11);
            float f132 = this.P0;
            float f142 = this.M0;
            matrix2.postTranslate(((((this.L0 - f142) * interpolation2) + f142) * f132) - (f132 / 2.0f), 0.0f);
            this.I0.setLocalMatrix(matrix2);
            invalidate();
        }
        super.onDraw(canvas);
    }
}
