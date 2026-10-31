package th;

import android.content.Context;
import android.media.AudioManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.tz;
import org.telegram.messenger.us;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.webrtc.MediaStreamTrack;
import org.webrtc.VideoSink;
import org.webrtc.voiceengine.WebRtcAudioTrack;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s0 implements us, AudioManager.OnAudioFocusChangeListener {
    public static s0 W;
    public int D;
    public NativeInstance E;
    public TLRPC.GroupCallParticipant G;
    public final q0 H;
    public boolean I;
    public long J;
    public int K;
    public boolean L;
    public VideoSink O;
    public boolean P;
    public Runnable Q;
    public Runnable R;
    public ArrayList U;
    public ArrayList V;
    public final TL_stories.StoryItem a;
    public final long b;
    public final int c;
    public final Context d;
    public final int e;
    public final TLRPC.InputGroupCall f;
    public final boolean h;
    public boolean n;
    public TLRPC.GroupCall w;
    public boolean y;
    public boolean r = false;
    public boolean s = false;
    public boolean x = false;
    public final HashMap F = new HashMap();
    public final HashSet M = new HashSet();
    public float N = 1.0f;
    public int S = -1;
    public int T = -1;

    public s0(Context context, int i10, TL_stories.StoryItem storyItem, long j10, int i11, boolean z10, TLRPC.InputGroupCall inputGroupCall, boolean z11, boolean z12) {
        this.I = false;
        this.d = context;
        this.e = i10;
        this.f = inputGroupCall;
        this.a = storyItem;
        this.b = j10;
        this.c = i11;
        this.h = z10;
        this.n = z11;
        this.I = z12;
        q0 q0Var = new q0(this);
        this.H = q0Var;
        f8.b("[LivePlayer] setup to call " + inputGroupCall.id);
        zs.f(i10).b(this, zs.x2);
        if (z11) {
            this.J = NativeInstance.createVideoCapturer(q0Var, z12 ? 1 : 0);
        }
        c();
        k();
    }

    public static NativeInstance.SsrcGroup[] d(TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo) {
        if (tL_groupCallParticipantVideo.source_groups.isEmpty()) {
            return null;
        }
        int size = tL_groupCallParticipantVideo.source_groups.size();
        NativeInstance.SsrcGroup[] ssrcGroupArr = new NativeInstance.SsrcGroup[size];
        for (int i10 = 0; i10 < size; i10++) {
            ssrcGroupArr[i10] = new NativeInstance.SsrcGroup();
            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i10);
            NativeInstance.SsrcGroup ssrcGroup = ssrcGroupArr[i10];
            ssrcGroup.semantics = tL_groupCallParticipantVideoSourceGroup.semantics;
            ssrcGroup.ssrcs = new int[tL_groupCallParticipantVideoSourceGroup.sources.size()];
            int i11 = 0;
            while (true) {
                int[] iArr = ssrcGroupArr[i10].ssrcs;
                if (i11 < iArr.length) {
                    iArr[i11] = tL_groupCallParticipantVideoSourceGroup.sources.get(i11).intValue();
                    i11++;
                }
            }
        }
        return ssrcGroupArr;
    }

    public final boolean a() {
        TLRPC.GroupCall groupCall;
        return (this.x || this.n || !this.s || W != null || (groupCall = this.w) == null || groupCall.rtmp_stream || !groupCall.creator) ? false : true;
    }

    public final boolean b() {
        if (this.w == null || l()) {
            return false;
        }
        return !this.w.messages_enabled;
    }

    public final void c() {
        WebRtcAudioTrack.setAudioTrackUsageAttribute(1);
        WebRtcAudioTrack.setAudioStreamType(TLObject.FLAG_31);
        AudioManager audioManager = (AudioManager) this.d.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (this.h) {
            audioManager.setMode(0);
            audioManager.setBluetoothScoOn(false);
        } else if (this.n) {
            audioManager.setMode(3);
            this.L = audioManager.requestAudioFocus(this, 0, 2) == 1;
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            audioManager.setBluetoothScoOn(false);
            voipAudioManager.setSpeakerphoneOn(true);
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.x2) {
            long longValue = ((Long) objArr[0]).longValue();
            TLRPC.GroupCall groupCall = (TLRPC.GroupCall) objArr[1];
            if (this.b == longValue) {
                sf.d.a(this.w, groupCall);
                this.w = groupCall;
                zs.f(this.e).k(zs.G2, Long.valueOf(groupCall.id));
            }
        }
    }

    public final void e() {
        if (this.x) {
            return;
        }
        this.x = true;
        u(false);
        zs.f(this.e).n(this, zs.x2);
        f8.b("[LivePlayer] destroyed");
        if (this.y) {
            TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
            leavegroupcall.call = this.f;
            ConnectionsManager.getInstance(this.e).sendRequest(leavegroupcall, new l0(this, 5));
        }
        if (this.n) {
            this.H.setTarget(null);
            NativeInstance.destroyVideoCapturer(this.J);
        }
        if (this.E != null) {
            org.telegram.messenger.r5 r5Var = Utilities.e;
            NativeInstance nativeInstance = this.E;
            Objects.requireNonNull(nativeInstance);
            r5Var.c(new org.telegram.messenger.voip.v0(nativeInstance, 3));
            this.M.clear();
            this.E = null;
        }
        if (this.L) {
            ((AudioManager) this.d.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).abandonAudioFocus(this);
            this.L = false;
        }
        if (this.n) {
            VoipAudioManager.get().setSpeakerphoneOn(false);
        }
        if (W == this) {
            W = null;
            zs.f(this.e).k(zs.G2, Long.valueOf(g()));
        }
    }

    public final boolean f(TLRPC.InputGroupCall inputGroupCall) {
        TLRPC.InputGroupCall inputGroupCall2 = this.f;
        return inputGroupCall2 == inputGroupCall || inputGroupCall2.id == inputGroupCall.id;
    }

    public final long g() {
        TLRPC.GroupCall groupCall = this.w;
        if (groupCall != null) {
            return groupCall.id;
        }
        TLRPC.InputGroupCall inputGroupCall = this.f;
        if (inputGroupCall != null) {
            return inputGroupCall.id;
        }
        return 0L;
    }

    public final int h() {
        TLRPC.GroupCall groupCall = this.w;
        return (groupCall == null || (groupCall.flags & 16) == 0) ? ConnectionsManager.DEFAULT_DATACENTER_ID : groupCall.stream_dc_id;
    }

    public final TLRPC.Peer i() {
        TLRPC.GroupCall groupCall = this.w;
        if (groupCall == null) {
            return null;
        }
        return groupCall.default_send_as;
    }

    public final long j() {
        TLRPC.GroupCall groupCall = this.w;
        if (groupCall == null) {
            return 0L;
        }
        return groupCall.send_paid_messages_stars;
    }

    public final void k() {
        if (this.x) {
            return;
        }
        NativeInstance makeGroup = NativeInstance.makeGroup(org.telegram.ui.Components.voip.m1.d("live_" + this.f.id), 0L, false, tz.I0, new k0(this, 0), new rh.x6(24), new k0(this, 2), new k0(this, 3), new k0(this, 4), new k0(this, 5), false);
        this.E = makeGroup;
        makeGroup.setOnStateUpdatedListener(new r0(this));
        this.E.resetGroupInstance(false, false);
    }

    public final boolean l() {
        TLRPC.GroupCall groupCall = this.w;
        if (groupCall != null && groupCall.creator) {
            return true;
        }
        long j10 = this.b;
        int i10 = this.e;
        return j10 >= 0 ? d20.i(i10).e() == j10 : org.telegram.messenger.w3.w(14, vp.r1(i10).L0(Long.valueOf(-j10)));
    }

    public final boolean m() {
        int i10 = this.D;
        return i10 == 3 || i10 == 1 || i10 == 2;
    }

    public final boolean n() {
        return !this.x && this.s;
    }

    public final boolean o() {
        return this.n && this.r;
    }

    public final void p() {
        this.Q = null;
        if (this.x) {
            return;
        }
        TL_phone.checkGroupCall checkgroupcall = new TL_phone.checkGroupCall();
        checkgroupcall.call = this.f;
        checkgroupcall.sources.add(Integer.valueOf(this.K));
        ConnectionsManager.getInstance(this.e).sendRequest(checkgroupcall, new l0(this, 3));
    }

    public final void q() {
        this.R = null;
        if (this.x) {
            return;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = this.f;
        ConnectionsManager.getInstance(this.e).sendRequest(getgroupcall, new l0(this, 1));
    }

    public final void r(NativeInstance.SsrcGroup[] ssrcGroupArr) {
        int i10 = 0;
        while (true) {
            if (i10 >= (ssrcGroupArr == null ? 0 : ssrcGroupArr.length)) {
                x();
                return;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = ssrcGroupArr[i10].ssrcs;
                if (i11 < iArr.length) {
                    this.M.add(Integer.valueOf(iArr[i11]));
                    i11++;
                }
            }
            i10++;
        }
    }

    public final void s(VideoSink videoSink) {
        if (this.O == videoSink) {
            return;
        }
        this.O = videoSink;
        this.H.setTarget(videoSink);
    }

    public final void t(boolean z10) {
        if (this.x || this.s == z10) {
            return;
        }
        if (this.n && z10) {
            return;
        }
        this.s = z10;
        zs.f(this.e).k(zs.G2, Long.valueOf(g()));
    }

    public final void u(boolean z10) {
        if (this.x) {
            z10 = false;
        }
        if (this.P == z10) {
            return;
        }
        this.P = z10;
        if (z10) {
            Runnable runnable = this.Q;
            if (runnable != null) {
                org.telegram.messenger.i0.r(runnable);
            }
            n0 n0Var = new n0(this, 0);
            this.Q = n0Var;
            org.telegram.messenger.i0.h3(n0Var, 4000L);
            Runnable runnable2 = this.R;
            if (runnable2 != null) {
                org.telegram.messenger.i0.r(runnable2);
            }
            n0 n0Var2 = new n0(this, 1);
            this.R = n0Var2;
            org.telegram.messenger.i0.h3(n0Var2, l() ? 5000 : 20000);
            return;
        }
        int i10 = this.S;
        int i11 = this.e;
        if (i10 != -1) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.S, true);
            this.S = -1;
        }
        if (this.T != -1) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.T, true);
            this.T = -1;
        }
        Runnable runnable3 = this.Q;
        if (runnable3 != null) {
            org.telegram.messenger.i0.r(runnable3);
            this.Q = null;
        }
        Runnable runnable4 = this.R;
        if (runnable4 != null) {
            org.telegram.messenger.i0.r(runnable4);
            this.R = null;
        }
    }

    public final void v(float f7) {
        float l4 = Utilities.l(f7);
        w0 w0Var = w0.Z;
        if (w0Var.S && w0Var.w == this) {
            l4 = 1.0f;
        }
        f8.b("setVolume(" + l4 + ")");
        if (Math.abs(l4 - this.N) < 0.01f) {
            return;
        }
        this.N = l4;
        x();
    }

    public final void w() {
        TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
        int i10 = this.e;
        tL_updateStory.peer = vp.r1(i10).y1(this.b);
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_updateStory.story = tL_storyItemDeleted;
        tL_storyItemDeleted.id = this.c;
        vp.r1(i10).O1().c0(tL_updateStory);
        e();
    }

    public final void x() {
        if (this.x || this.E == null) {
            return;
        }
        Iterator it = this.M.iterator();
        while (it.hasNext()) {
            this.E.setVolume(((Integer) it.next()).intValue(), this.N);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
    }
}
