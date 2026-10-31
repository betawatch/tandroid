package th;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Components.ew;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b6 extends View {
    public Paint a;
    public boolean b;
    public ew c;
    public org.telegram.ui.Components.t5 d;
    public org.telegram.ui.Components.t5 e;
    public float f;

    public final void a(boolean z10) {
        ew ewVar = this.c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        float f7 = streamMaxVolume;
        int max = (int) Math.max(1.0f, f7 / 15.0f);
        if (z10) {
            int i10 = streamVolume + max;
            if (i10 <= streamMaxVolume) {
                streamMaxVolume = i10;
            }
        } else {
            streamMaxVolume = streamVolume - max;
            if (streamMaxVolume < 0) {
                streamMaxVolume = 0;
            }
        }
        audioManager.setStreamVolume(3, streamMaxVolume, 0);
        float f10 = streamMaxVolume / f7;
        this.f = f10;
        if (!this.b) {
            this.e.e(true, f10);
        }
        invalidate();
        this.b = true;
        org.telegram.messenger.i0.r(ewVar);
        org.telegram.messenger.i0.h3(ewVar, 2000L);
    }

    public final void b() {
        ew ewVar = this.c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamMinVolume = Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0;
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamVolume <= streamMinVolume) {
            a(true);
            return;
        }
        if (this.b) {
            return;
        }
        float f7 = streamVolume / streamMaxVolume;
        this.f = f7;
        this.e.e(true, f7);
        this.b = true;
        invalidate();
        org.telegram.messenger.i0.r(ewVar);
        org.telegram.messenger.i0.h3(ewVar, 2000L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.a;
        super.onDraw(canvas);
        org.telegram.ui.Components.t5 t5Var = this.e;
        t5Var.e(false, this.f);
        org.telegram.ui.Components.t5 t5Var2 = this.d;
        t5Var2.e(false, this.b ? 1.0f : 0.0f);
        if (t5Var2.c != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            paint.setAlpha((int) (t5Var2.c * 255.0f));
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * t5Var.c, getMeasuredHeight());
            canvas.drawRoundRect(rectF, measuredHeight, measuredHeight, paint);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i10 == 24) {
            a(true);
            return true;
        }
        if (keyEvent.getAction() != 0 || i10 != 25) {
            return super.onKeyDown(i10, keyEvent);
        }
        a(false);
        return true;
    }
}
