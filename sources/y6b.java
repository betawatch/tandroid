// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class y6b extends View {
    public Paint a;
    public boolean b;
    public bva c;
    public mm d;
    public mm e;
    public float f;

    public final void a(boolean z) {
        bva bvaVar = this.c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        float f = streamMaxVolume;
        int max = (int) Math.max(1.0f, f / 15.0f);
        if (z) {
            int i = streamVolume + max;
            if (i <= streamMaxVolume) {
                streamMaxVolume = i;
            }
        } else {
            streamMaxVolume = streamVolume - max;
            if (streamMaxVolume < 0) {
                streamMaxVolume = 0;
            }
        }
        audioManager.setStreamVolume(3, streamMaxVolume, 0);
        float f2 = streamMaxVolume / f;
        this.f = f2;
        if (!this.b) {
            this.e.e(true, f2);
        }
        invalidate();
        this.b = true;
        hl.r(bvaVar);
        hl.d3(bvaVar, 2000L);
    }

    public final void b() {
        bva bvaVar = this.c;
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
        float f = streamVolume / streamMaxVolume;
        this.f = f;
        this.e.e(true, f);
        this.b = true;
        invalidate();
        hl.r(bvaVar);
        hl.d3(bvaVar, 2000L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.a;
        super.onDraw(canvas);
        mm mmVar = this.e;
        mmVar.e(false, this.f);
        mm mmVar2 = this.d;
        mmVar2.e(false, this.b ? 1.0f : 0.0f);
        if (mmVar2.c != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            paint.setAlpha((int) (mmVar2.c * 255.0f));
            RectF rectF = hl.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * mmVar.c, getMeasuredHeight());
            canvas.drawRoundRect(rectF, measuredHeight, measuredHeight, paint);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i == 24) {
            a(true);
            return true;
        }
        if (keyEvent.getAction() != 0 || i != 25) {
            return super.onKeyDown(i, keyEvent);
        }
        a(false);
        return true;
    }
}
