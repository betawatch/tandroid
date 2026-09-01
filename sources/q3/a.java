package q3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.s;
import cb.e;
import h5.g;
import i5.y;
import j3.a2;
import j3.c1;
import j3.e1;
import j3.o2;
import j3.q2;
import j3.t1;
import j3.v1;
import j3.w1;
import j3.x1;
import j3.y1;
import j3.z1;
import java.util.ArrayList;
import java.util.List;
import l3.d;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a extends s implements y1 {
    public int a;
    public int b;
    public final /* synthetic */ c c;

    public a(c cVar) {
        this.c = cVar;
    }

    @Override // android.support.v4.media.session.s
    public final void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        this.c.getClass();
    }

    @Override // android.support.v4.media.session.s
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        c cVar = this.c;
        ArrayList arrayList = cVar.e;
        ArrayList arrayList2 = cVar.d;
        if (cVar.i != null) {
            if (arrayList2.size() > 0) {
                arrayList2.get(0).getClass();
                throw new ClassCastException();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    @Override // j3.y1
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // android.support.v4.media.session.s
    public final void onCustomAction(String str, Bundle bundle) {
        c cVar = this.c;
        if (cVar.i == null || !cVar.g.containsKey(str)) {
            return;
        }
        cVar.g.get(str).getClass();
        throw new ClassCastException();
    }

    @Override // j3.y1
    public final void onEvents(a2 a2Var, x1 x1Var) {
        boolean z4;
        boolean z10;
        g gVar = x1Var.a;
        if (gVar.a.get(11)) {
            z4 = this.a != a2Var.x();
            z10 = true;
        } else {
            z4 = false;
            z10 = false;
        }
        if (gVar.a.get(0)) {
            int o10 = a2Var.z().o();
            int x10 = a2Var.x();
            if (this.b != o10 || this.a != x10) {
                z10 = true;
            }
            this.b = o10;
            z4 = true;
        }
        this.a = a2Var.x();
        int[] iArr = {4, 5, 7, 8, 12};
        int i10 = 0;
        while (true) {
            if (i10 >= 5) {
                break;
            }
            if (gVar.a.get(iArr[i10])) {
                z10 = true;
                break;
            }
            i10++;
        }
        boolean z11 = gVar.a.get(new int[]{9}[0]) ? true : z10;
        c cVar = this.c;
        if (z11) {
            cVar.c();
        }
        if (z4) {
            cVar.b();
        }
    }

    @Override // android.support.v4.media.session.s
    public final void onFastForward() {
        c cVar = this.c;
        if (c.a(cVar, 64L)) {
            e eVar = (e) cVar.i;
            long C = eVar.C() + eVar.q();
            long duration = eVar.getDuration();
            if (duration != -9223372036854775807L) {
                C = Math.min(C, duration);
            }
            eVar.K(eVar.x(), 12, Math.max(C, 0L));
        }
    }

    @Override // android.support.v4.media.session.s
    public final boolean onMediaButtonEvent(Intent intent) {
        this.c.getClass();
        return super.onMediaButtonEvent(intent);
    }

    @Override // android.support.v4.media.session.s
    public final void onPause() {
        c cVar = this.c;
        if (c.a(cVar, 2L)) {
            ((e) cVar.i).p(false);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void onPlay() {
        c cVar = this.c;
        if (c.a(cVar, 4L)) {
            if (cVar.i.b() == 1) {
                cVar.i.a();
            } else if (cVar.i.b() == 4) {
                a2 a2Var = cVar.i;
                ((e) a2Var).K(a2Var.x(), 10, -9223372036854775807L);
            }
            a2 a2Var2 = cVar.i;
            a2Var2.getClass();
            ((e) a2Var2).p(true);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        this.c.getClass();
    }

    @Override // android.support.v4.media.session.s
    public final void onPlayFromSearch(String str, Bundle bundle) {
        this.c.getClass();
    }

    @Override // android.support.v4.media.session.s
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        this.c.getClass();
    }

    @Override // j3.y1
    public final /* synthetic */ void onPositionDiscontinuity(int i10) {
    }

    @Override // android.support.v4.media.session.s
    public final void onPrepare() {
        this.c.getClass();
    }

    @Override // android.support.v4.media.session.s
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        this.c.getClass();
    }

    @Override // android.support.v4.media.session.s
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        this.c.getClass();
    }

    @Override // android.support.v4.media.session.s
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        this.c.getClass();
    }

    @Override // android.support.v4.media.session.s
    public final void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        this.c.getClass();
    }

    @Override // android.support.v4.media.session.s
    public final void onRewind() {
        c cVar = this.c;
        if (c.a(cVar, 8L)) {
            e eVar = (e) cVar.i;
            long C = eVar.C() + (-eVar.D());
            long duration = eVar.getDuration();
            if (duration != -9223372036854775807L) {
                C = Math.min(C, duration);
            }
            eVar.K(eVar.x(), 11, Math.max(C, 0L));
        }
    }

    @Override // android.support.v4.media.session.s
    public final void onSeekTo(long j10) {
        c cVar = this.c;
        if (c.a(cVar, 256L)) {
            a2 a2Var = cVar.i;
            ((e) a2Var).K(a2Var.x(), 10, j10);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void onSetCaptioningEnabled(boolean z4) {
        this.c.getClass();
    }

    @Override // android.support.v4.media.session.s
    public final void onSetPlaybackSpeed(float f10) {
        c cVar = this.c;
        if (!c.a(cVar, 4194304L) || f10 <= 0.0f) {
            return;
        }
        a2 a2Var = cVar.i;
        a2Var.c(new v1(f10, a2Var.d().b));
    }

    @Override // android.support.v4.media.session.s
    public final void onSetRating(RatingCompat ratingCompat) {
        this.c.getClass();
    }

    @Override // android.support.v4.media.session.s
    public final void onSetRepeatMode(int i10) {
        c cVar = this.c;
        if (c.a(cVar, 262144L)) {
            int i11 = 1;
            if (i10 != 1) {
                i11 = 2;
                if (i10 != 2 && i10 != 3) {
                    i11 = 0;
                }
            }
            cVar.i.e(i11);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void onSetShuffleMode(int i10) {
        c cVar = this.c;
        if (c.a(cVar, 2097152L)) {
            boolean z4 = true;
            if (i10 != 1 && i10 != 2) {
                z4 = false;
            }
            cVar.i.k(z4);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void onSkipToNext() {
        this.c.getClass();
    }

    @Override // android.support.v4.media.session.s
    public final void onSkipToPrevious() {
        this.c.getClass();
    }

    @Override // android.support.v4.media.session.s
    public final void onSkipToQueueItem(long j10) {
        this.c.getClass();
    }

    @Override // android.support.v4.media.session.s
    public final void onStop() {
        c cVar = this.c;
        if (c.a(cVar, 1L)) {
            cVar.i.stop();
            if (cVar.k) {
                ((e) cVar.i).l();
            }
        }
    }

    @Override // j3.y1
    public final /* synthetic */ void onCues(v4.c cVar) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onPositionDiscontinuity(z1 z1Var, z1 z1Var2, int i10) {
    }

    @Override // android.support.v4.media.session.s
    public final void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        this.c.getClass();
    }

    @Override // android.support.v4.media.session.s
    public final void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
        this.c.getClass();
    }

    @Override // j3.y1
    public final /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // j3.y1
    public final /* synthetic */ void onAudioAttributesChanged(d dVar) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onAvailableCommandsChanged(w1 w1Var) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onIsLoadingChanged(boolean z4) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onIsPlayingChanged(boolean z4) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onLoadingChanged(boolean z4) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onMediaMetadataChanged(e1 e1Var) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onMetadata(e4.c cVar) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onPlaybackParametersChanged(v1 v1Var) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onPlaybackStateChanged(int i10) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onPlayerError(t1 t1Var) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onPlayerErrorChanged(t1 t1Var) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onRepeatModeChanged(int i10) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z4) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z4) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onTracksChanged(q2 q2Var) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onVideoSizeChanged(y yVar) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onVolumeChanged(float f10) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onMediaItemTransition(c1 c1Var, int i10) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z4, int i10) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onPlayerStateChanged(boolean z4, int i10) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onTimelineChanged(o2 o2Var, int i10) {
    }
}
