package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.KeyEvent;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class xb1 extends org.telegram.ui.Components.voip.o2 {
    public final Path s;
    public final RectF w;
    public sn0 x;
    public final /* synthetic */ ec1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb1(Activity activity, boolean z9, ec1 ec1Var) {
        super(activity);
        this.y = ec1Var;
        this.c = new h2.f((int[]) null);
        this.a = activity;
        setSystemUiVisibility(1792);
        org.telegram.messenger.g0.g2(activity);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z9) {
            this.e = true;
        }
        this.s = new Path();
        this.w = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ec1 ec1Var = this.y;
        if (!ec1Var.D0 || getAlpha() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        float scaleX = ec1Var.c0.getScaleX() * ec1Var.c0.getWidth();
        float scaleY = ec1Var.c0.getScaleY() * ec1Var.c0.getHeight();
        float x10 = ec1Var.c0.getX() + ((ec1Var.c0.getWidth() - scaleX) / 2.0f);
        float y10 = ec1Var.c0.getY() + ((ec1Var.c0.getHeight() - scaleY) / 2.0f);
        canvas.save();
        Path path = this.s;
        path.rewind();
        RectF rectF = this.w;
        rectF.set(x10, y10, scaleX + x10, scaleY + y10);
        float L = org.telegram.messenger.g0.L(4.0f);
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        path.close();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        VoIPServiceState sharedState;
        ec1 ec1Var = this.y;
        if (ec1Var.F0 || ec1Var.D0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4 && keyEvent.getAction() == 1) {
            ec1Var.g();
            return true;
        }
        if ((keyCode != 25 && keyCode != 24) || ec1Var.o0 != 15 || (sharedState = VoIPService.getSharedState()) == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        sharedState.stopRinging();
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.y.k1) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT < 33 || this.x != null) {
            return;
        }
        this.x = g0.a.h(this, new qb1(this.y, 14));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        sn0 sn0Var;
        if (Build.VERSION.SDK_INT >= 33 && (sn0Var = this.x) != null) {
            g0.a.j(this, sn0Var);
            this.x = null;
        }
        super.onDetachedFromWindow();
    }
}
