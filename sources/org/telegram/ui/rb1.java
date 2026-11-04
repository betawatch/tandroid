package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rb1 extends org.telegram.ui.Components.voip.d2 {
    public final Path s;
    public final RectF w;
    public final /* synthetic */ zb1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb1(Activity activity, boolean z10, zb1 zb1Var) {
        super(activity);
        this.x = zb1Var;
        this.c = new g2.g((int[]) null);
        this.a = activity;
        setSystemUiVisibility(1792);
        org.telegram.messenger.g0.g2(activity);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.e = true;
        }
        this.s = new Path();
        this.w = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        zb1 zb1Var = this.x;
        if (!zb1Var.F0 || getAlpha() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        float scaleX = zb1Var.d0.getScaleX() * zb1Var.d0.getWidth();
        float scaleY = zb1Var.d0.getScaleY() * zb1Var.d0.getHeight();
        float x10 = zb1Var.d0.getX() + ((zb1Var.d0.getWidth() - scaleX) / 2.0f);
        float y9 = zb1Var.d0.getY() + ((zb1Var.d0.getHeight() - scaleY) / 2.0f);
        canvas.save();
        Path path = this.s;
        path.rewind();
        RectF rectF = this.w;
        rectF.set(x10, y9, scaleX + x10, scaleY + y9);
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
        zb1 zb1Var = this.x;
        if (zb1Var.H0 || zb1Var.F0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4 && keyEvent.getAction() == 1) {
            zb1Var.j();
            return true;
        }
        if ((keyCode != 25 && keyCode != 24) || zb1Var.q0 != 15 || (sharedState = VoIPService.getSharedState()) == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        sharedState.stopRinging();
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.x.n1) {
            return;
        }
        super.draw(canvas);
    }
}
