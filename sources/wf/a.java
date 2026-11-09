package wf;

import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import f6.k;
import h6.g;
import h6.h;
import h6.j;
import q6.m;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class a extends g {
    public final h a;
    public final g6.g b;
    public final g6.c c;
    public g7.c d;
    public int e;
    public int f;
    public int g;
    public int h;

    public a(g6.c cVar, g6.g gVar, h hVar) {
        this.c = cVar;
        this.b = gVar;
        this.a = hVar;
    }

    @Override // h6.g
    public final void a() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.c.a());
    }

    @Override // h6.g
    public final void b(MediaError mediaError) {
        StringBuilder sb2 = new StringBuilder("onMediaError ");
        sb2.append(this.c.a());
        sb2.append(" ");
        Integer num = mediaError.c;
        sb2.append(num);
        sb2.append(" ");
        sb2.append(mediaError.b);
        Log.d("CAST_CLIENT", sb2.toString());
        this.e = num != null ? num.intValue() : -1;
    }

    @Override // h6.g
    public final void c() {
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.c.a());
    }

    @Override // h6.g
    public final void d() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.c.a());
    }

    @Override // h6.g
    public final void e() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.c.a());
    }

    @Override // h6.g
    public final void f() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.c.a());
    }

    @Override // h6.g
    public final void g() {
        Log.d("CAST_CLIENT", "onStatusUpdated " + this.c.a());
        int b10 = this.a.b();
        if (b10 != this.f) {
            Log.d("CAST_CLIENT", "idleReason " + b10);
            this.f = b10;
            if (b10 == 2) {
                this.b.b(true);
                return;
            }
            if (b10 == 4) {
                int i7 = this.e;
                if (i7 == 104) {
                    q(true);
                } else if (i7 == 102) {
                    q(false);
                }
            }
        }
    }

    public final void p() {
        this.e = -1;
        if (this.d == null) {
            this.d = null;
            return;
        }
        String i7 = d.i();
        e a10 = this.g < this.d.a.size() ? this.d.a(this.g) : d.l;
        MediaInfo mediaInfo = new MediaInfo(d.j(i7, a10.d) + ("?index=" + this.g + "&attempt=" + this.h), 1, a10.a, a10.b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        Boolean bool = Boolean.TRUE;
        if (Double.compare(1.0d, 2.0d) > 0 || Double.compare(1.0d, 0.5d) < 0) {
            throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
        }
        k kVar = new k(mediaInfo, null, bool, -1L, 1.0d, null, null, null, null, null, null, 0L);
        m.d("Must be called from the main thread.");
        h hVar = this.a;
        if (hVar.w()) {
            h.x(new j(hVar, kVar, 1));
        } else {
            h.t();
        }
    }

    public final void q(boolean z9) {
        if (z9) {
            this.g++;
        } else {
            int i7 = this.h + 1;
            this.h = i7;
            if (i7 > 3) {
                this.h = 0;
                this.g++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.e + " " + this.g + " " + this.h);
        p();
    }
}
