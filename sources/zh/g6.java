package zh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class g6 extends View {
    public Paint a;
    public boolean b;
    public sg.a1 c;
    public org.telegram.ui.Components.d6 d;
    public org.telegram.ui.Components.d6 e;
    public float f;

    public final void a(boolean z10) {
        sg.a1 a1Var = this.c;
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
            this.e.d(f10, true);
        }
        invalidate();
        this.b = true;
        AndroidUtilities.cancelRunOnUIThread(a1Var);
        AndroidUtilities.runOnUIThread(a1Var, 2000L);
    }

    public final void b() {
        sg.a1 a1Var = this.c;
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
        this.e.d(f7, true);
        this.b = true;
        invalidate();
        AndroidUtilities.cancelRunOnUIThread(a1Var);
        AndroidUtilities.runOnUIThread(a1Var, 2000L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.a;
        super.onDraw(canvas);
        org.telegram.ui.Components.d6 d6Var = this.e;
        d6Var.d(this.f, false);
        org.telegram.ui.Components.d6 d6Var2 = this.d;
        d6Var2.d(this.b ? 1.0f : 0.0f, false);
        if (d6Var2.c != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            paint.setAlpha((int) (d6Var2.c * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * d6Var.c, getMeasuredHeight());
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
