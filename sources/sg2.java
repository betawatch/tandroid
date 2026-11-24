// default package

import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class sg2 extends h69 {
    public final i69 a;
    public final j6a b;
    public final ed1 c;
    public yg2 d;
    public int e;
    public int f;
    public int g;
    public int h;

    public sg2(ed1 ed1Var, j6a j6aVar, i69 i69Var) {
        this.c = ed1Var;
        this.b = j6aVar;
        this.a = i69Var;
    }

    @Override // h69
    public final void a() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.c.a());
    }

    @Override // h69
    public final void b(MediaError mediaError) {
        StringBuilder sb = new StringBuilder("onMediaError ");
        sb.append(this.c.a());
        sb.append(" ");
        Integer num = mediaError.c;
        sb.append(num);
        sb.append(" ");
        sb.append(mediaError.b);
        Log.d("CAST_CLIENT", sb.toString());
        this.e = num != null ? num.intValue() : -1;
    }

    @Override // h69
    public final void c() {
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.c.a());
    }

    @Override // h69
    public final void d() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.c.a());
    }

    @Override // h69
    public final void e() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.c.a());
    }

    @Override // h69
    public final void f() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.c.a());
    }

    @Override // h69
    public final void g() {
        Log.d("CAST_CLIENT", "onStatusUpdated " + this.c.a());
        int b = this.a.b();
        if (b != this.f) {
            Log.d("CAST_CLIENT", "idleReason " + b);
            this.f = b;
            if (b == 2) {
                this.b.b(true);
                return;
            }
            if (b == 4) {
                int i = this.e;
                if (i == 104) {
                    q(true);
                } else if (i == 102) {
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
        String h = vg2.h();
        xg2 h2 = this.g < this.d.b.size() ? this.d.h(this.g) : vg2.l;
        gr6 gr6Var = new gr6(new MediaInfo(vg2.i(h, h2.d).concat("?index=" + this.g + "&attempt=" + this.h), 1, h2.a, h2.b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null), null, Boolean.TRUE, -1L, 1.0d, null, null, null, null, null, null, 0L);
        fre.e("Must be called from the main thread.");
        i69 i69Var = this.a;
        if (i69Var.w()) {
            i69.x(new o9d(i69Var, gr6Var, (byte) 1));
        } else {
            i69.t();
        }
    }

    public final void q(boolean z) {
        if (z) {
            this.g++;
        } else {
            int i = this.h + 1;
            this.h = i;
            if (i > 3) {
                this.h = 0;
                this.g++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.e + " " + this.g + " " + this.h);
        p();
    }
}
