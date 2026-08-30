package t5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.s;
import android.view.KeyEvent;
import b6.m;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import q5.p;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class g extends s {
    public final /* synthetic */ h a;

    public g(h hVar) {
        this.a = hVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.support.v4.media.session.s
    public final void onCustomAction(String str, Bundle bundle) {
        h.v.b("onCustomAction with action = %s", str);
        int hashCode = str.hashCode();
        h hVar = this.a;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    long j10 = -hVar.e.c;
                    s5.h hVar2 = hVar.n;
                    if (hVar2 == null) {
                        return;
                    }
                    long min = Math.min(hVar2.g(), Math.max(0L, hVar2.a() + j10));
                    s5.h hVar3 = hVar.n;
                    if (hVar3 == null) {
                        return;
                    }
                    hVar3.q(new p(min));
                    return;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    r5.g gVar = hVar.d;
                    if (gVar != null) {
                        gVar.b(true);
                        return;
                    }
                    return;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    r5.g gVar2 = hVar.d;
                    if (gVar2 != null) {
                        gVar2.b(false);
                        return;
                    }
                    return;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    long j11 = hVar.e.c;
                    s5.h hVar4 = hVar.n;
                    if (hVar4 == null) {
                        return;
                    }
                    long min2 = Math.min(hVar4.g(), Math.max(0L, hVar4.a() + j11));
                    s5.h hVar5 = hVar.n;
                    if (hVar5 == null) {
                        return;
                    }
                    hVar5.q(new p(min2));
                    return;
                }
                break;
        }
        Intent intent = new Intent(str);
        intent.setComponent(hVar.g);
        hVar.a.sendBroadcast(intent);
    }

    @Override // android.support.v4.media.session.s
    public final boolean onMediaButtonEvent(Intent intent) {
        s5.h hVar;
        h.v.b("onMediaButtonEvent", new Object[0]);
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if ((keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) || (hVar = this.a.n) == null) {
            return true;
        }
        hVar.r();
        return true;
    }

    @Override // android.support.v4.media.session.s
    public final void onPause() {
        h.v.b("onPause", new Object[0]);
        s5.h hVar = this.a.n;
        if (hVar != null) {
            hVar.r();
        }
    }

    @Override // android.support.v4.media.session.s
    public final void onPlay() {
        h.v.b("onPlay", new Object[0]);
        s5.h hVar = this.a.n;
        if (hVar != null) {
            hVar.r();
        }
    }

    @Override // android.support.v4.media.session.s
    public final void onSeekTo(long j10) {
        h.v.b("onSeekTo %d", Long.valueOf(j10));
        s5.h hVar = this.a.n;
        if (hVar == null) {
            return;
        }
        hVar.q(new p(j10));
    }

    @Override // android.support.v4.media.session.s
    public final void onSkipToNext() {
        h.v.b("onSkipToNext", new Object[0]);
        s5.h hVar = this.a.n;
        if (hVar != null) {
            m.e("Must be called from the main thread.");
            if (hVar.w()) {
                s5.h.x(new s5.i(hVar, 2));
            } else {
                s5.h.t();
            }
        }
    }

    @Override // android.support.v4.media.session.s
    public final void onSkipToPrevious() {
        h.v.b("onSkipToPrevious", new Object[0]);
        s5.h hVar = this.a.n;
        if (hVar != null) {
            m.e("Must be called from the main thread.");
            if (hVar.w()) {
                s5.h.x(new s5.i(hVar, 1));
            } else {
                s5.h.t();
            }
        }
    }
}
