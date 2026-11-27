// default package

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class wrc extends it4 {
    public final /* synthetic */ yrc j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrc(yrc yrcVar, Context context) {
        super(context, 1, 4);
        this.j0 = yrcVar;
    }

    @Override // it4
    public final void h() {
        yrc yrcVar = this.j0;
        if (yrcVar.e == this) {
            yrcVar.h();
        }
    }

    @Override // it4, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        int round = Math.round(Math.min(i, i2) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        super.onSurfaceTextureAvailable(surfaceTexture, round, round);
    }

    @Override // it4, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        int round = Math.round(Math.min(i, i2) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        this.E = round;
        this.y = round;
    }

    @Override // it4, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int round = Math.round(Math.min(getWidth(), getHeight()) * 3.5f);
        if (round > 0) {
            surfaceTexture.setDefaultBufferSize(round, round);
        }
    }

    @Override // it4, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.j0.y && super.onTouchEvent(motionEvent);
    }
}
