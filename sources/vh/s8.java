package vh;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s8 {
    public final org.telegram.ui.Components.t5 a;
    public final int b;
    public final short[] d;
    public short e;
    public final MediaExtractor f;
    public final MediaFormat g;
    public final long h;
    public final FfmpegAudioWaveformLoader k;
    public final /* synthetic */ z8 l;
    public int c = 0;
    public final Object i = new Object();
    public boolean j = false;

    public s8(z8 z8Var, String str, int i10) {
        this.l = z8Var;
        this.a = new org.telegram.ui.Components.t5(z8Var, 0L, 600L, gr.h);
        int i11 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i11 < trackCount) {
                    MediaFormat trackFormat = this.f.getTrackFormat(i11);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f.selectTrack(i11);
                        this.g = trackFormat;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        int min = Math.min(Math.round((((this.h * 1000) / Math.min(z8Var.h != null ? r8.e : !z8Var.s.isEmpty() ? z8Var.getBaseDuration() : z8Var.E ? z8Var.H : this.h * 1000, z8Var.getMaxScrollDuration())) * i10) / Math.round(org.telegram.messenger.i0.N(3.3333f))), 4000);
        this.b = min;
        this.d = new short[min];
        if (this.h <= 0 || this.g == null) {
            return;
        }
        if ("audio/mpeg".equals(str2) || "audio/mp3".equals(str2) || "audio/mp4a".equals(str2) || "audio/mp4a-latm".equals(str2)) {
            this.k = new FfmpegAudioWaveformLoader(str, min, new qh.d(this, 23));
        } else {
            Utilities.h.c(new d0(this, 20));
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.h.a(new d0(this, 20));
        synchronized (this.i) {
            this.j = true;
        }
    }

    public final void b(short[] sArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.c;
            int i13 = i12 + i11;
            short[] sArr2 = this.d;
            if (i13 >= sArr2.length) {
                break;
            }
            sArr2[i12 + i11] = sArr[i11];
            short s10 = this.e;
            short s11 = sArr[i11];
            if (s10 < s11) {
                this.e = s11;
            }
        }
        this.c += i10;
        this.l.invalidate();
    }
}
