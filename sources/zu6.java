// default package

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.d;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class zu6 {
    public final MediaSession a;
    public final d b;
    public final MediaSessionCompat$Token c;
    public final Object d = new Object();
    public final RemoteCallbackList e = new RemoteCallbackList();
    public PlaybackStateCompat f;
    public ArrayList g;
    public MediaMetadataCompat h;
    public byte i;
    public int j;
    public yu6 k;
    public nw6 l;

    public zu6(Context context, String str) {
        MediaSession a = a(context, str);
        this.a = a;
        d dVar = new d(this);
        this.b = dVar;
        this.c = new MediaSessionCompat$Token(a.getSessionToken(), dVar);
        a.setFlags(3);
    }

    public MediaSession a(Context context, String str) {
        return new MediaSession(context, str);
    }

    public final yu6 b() {
        yu6 yu6Var;
        synchronized (this.d) {
            yu6Var = this.k;
        }
        return yu6Var;
    }

    public nw6 c() {
        nw6 nw6Var;
        synchronized (this.d) {
            nw6Var = this.l;
        }
        return nw6Var;
    }

    public final void d(yu6 yu6Var, Handler handler) {
        synchronized (this.d) {
            this.k = yu6Var;
            this.a.setCallback(yu6Var == null ? null : (xu6) yu6Var.e, handler);
            if (yu6Var != null) {
                yu6Var.c0(this, handler);
            }
        }
    }

    public void e(nw6 nw6Var) {
        synchronized (this.d) {
            this.l = nw6Var;
        }
    }
}
