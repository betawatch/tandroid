package tf;

import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import e6.k;
import g6.g;
import g6.h;
import g6.j;
import mi.z3;
import p6.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends g {
    public final h a;
    public final f6.g b;
    public final f6.c c;
    public z3 d;
    public int e;
    public int f;
    public int g;
    public int h;

    public a(f6.c cVar, f6.g gVar, h hVar) {
        this.c = cVar;
        this.b = gVar;
        this.a = hVar;
    }

    @Override // g6.g
    public final void a() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.c.a());
    }

    @Override // g6.g
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

    @Override // g6.g
    public final void c() {
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.c.a());
    }

    @Override // g6.g
    public final void d() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.c.a());
    }

    @Override // g6.g
    public final void e() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.c.a());
    }

    @Override // g6.g
    public final void f() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.c.a());
    }

    @Override // g6.g
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
                int i3 = this.e;
                if (i3 == 104) {
                    q(true);
                } else if (i3 == 102) {
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
        String i3 = d.i();
        f c2 = this.g < this.d.a.size() ? this.d.c(this.g) : d.l;
        MediaInfo mediaInfo = new MediaInfo(d.j(i3, c2.d) + ("?index=" + this.g + "&attempt=" + this.h), 1, c2.a, c2.b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
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

    public final void q(boolean z10) {
        if (z10) {
            this.g++;
        } else {
            int i3 = this.h + 1;
            this.h = i3;
            if (i3 > 3) {
                this.h = 0;
                this.g++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.e + " " + this.g + " " + this.h);
        p();
    }
}
