package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class sh1 extends org.telegram.ui.Components.voip.w2 {
    public final Path s;
    public final RectF v;
    public final /* synthetic */ ai1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh1(Activity activity, boolean z4, ai1 ai1Var) {
        super(activity);
        this.w = ai1Var;
        this.c = new AnimationNotificationsLocker();
        this.a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z4) {
            this.e = true;
        }
        this.s = new Path();
        this.v = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ai1 ai1Var = this.w;
        if (!ai1Var.B0 || getAlpha() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        float scaleX = ai1Var.Z.getScaleX() * ai1Var.Z.getWidth();
        float scaleY = ai1Var.Z.getScaleY() * ai1Var.Z.getHeight();
        float x10 = ai1Var.Z.getX() + ((ai1Var.Z.getWidth() - scaleX) / 2.0f);
        float y10 = ai1Var.Z.getY() + ((ai1Var.Z.getHeight() - scaleY) / 2.0f);
        canvas.save();
        Path path = this.s;
        path.rewind();
        RectF rectF = this.v;
        rectF.set(x10, y10, scaleX + x10, scaleY + y10);
        float dp = AndroidUtilities.dp(4.0f);
        path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        path.close();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        VoIPServiceState sharedState;
        ai1 ai1Var = this.w;
        if (ai1Var.D0 || ai1Var.B0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4 && keyEvent.getAction() == 1) {
            ai1Var.p();
            return true;
        }
        if ((keyCode != 25 && keyCode != 24) || ai1Var.m0 != 15 || (sharedState = VoIPService.getSharedState()) == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        sharedState.stopRinging();
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.w.j1) {
            return;
        }
        super.draw(canvas);
    }
}
