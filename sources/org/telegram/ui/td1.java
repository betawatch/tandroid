package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class td1 extends org.telegram.ui.Components.voip.c2 {
    public final Path s;
    public final RectF w;
    public final /* synthetic */ be1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td1(Activity activity, boolean z10, be1 be1Var) {
        super(activity);
        this.x = be1Var;
        this.c = new e2.f(null);
        this.a = activity;
        setSystemUiVisibility(1792);
        org.telegram.messenger.i0.g2(activity);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.e = true;
        }
        this.s = new Path();
        this.w = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        be1 be1Var = this.x;
        if (!be1Var.E0 || getAlpha() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        float scaleX = be1Var.c0.getScaleX() * be1Var.c0.getWidth();
        float scaleY = be1Var.c0.getScaleY() * be1Var.c0.getHeight();
        float x10 = be1Var.c0.getX() + ((be1Var.c0.getWidth() - scaleX) / 2.0f);
        float y3 = be1Var.c0.getY() + ((be1Var.c0.getHeight() - scaleY) / 2.0f);
        canvas.save();
        Path path = this.s;
        path.rewind();
        RectF rectF = this.w;
        rectF.set(x10, y3, scaleX + x10, scaleY + y3);
        float L = org.telegram.messenger.i0.L(4.0f);
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        path.close();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        VoIPServiceState sharedState;
        be1 be1Var = this.x;
        if (be1Var.G0 || be1Var.E0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4 && keyEvent.getAction() == 1) {
            be1Var.j();
            return true;
        }
        if ((keyCode != 25 && keyCode != 24) || be1Var.p0 != 15 || (sharedState = VoIPService.getSharedState()) == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        sharedState.stopRinging();
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.x.m1) {
            return;
        }
        super.draw(canvas);
    }
}
