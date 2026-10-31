package th;

import java.util.ArrayList;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.vp;
import org.telegram.messenger.xd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements NativeInstance.PayloadCallback, RequestDelegateTimestamp, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ k0(s0 s0Var, int i10) {
        this.a = i10;
        this.b = s0Var;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.PayloadCallback
    public void run(int i10, String str) {
        s0 s0Var = this.b;
        s0Var.K = i10;
        TL_phone.joinGroupCall joingroupcall = new TL_phone.joinGroupCall();
        boolean z10 = !s0Var.n;
        joingroupcall.muted = z10;
        joingroupcall.video_stopped = z10;
        joingroupcall.call = s0Var.f;
        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
        joingroupcall.params = tL_dataJSON;
        tL_dataJSON.data = str;
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        joingroupcall.join_as = tL_inputPeerUser;
        int i11 = s0Var.e;
        tL_inputPeerUser.user_id = d20.i(org.telegram.messenger.c.a(i11).a).e();
        ConnectionsManager.getInstance(i11).sendRequest(joingroupcall, new l0(s0Var, 0));
    }

    @Override // org.telegram.tgnet.RequestDelegateTimestamp
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        if (tL_error == null) {
            s0 s0Var = this.b;
            if (s0Var.E == null || s0Var.x) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i10 = 0;
            if (!groupcallstreamchannels.channels.isEmpty()) {
                long j11 = groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            }
            if (groupcallstreamchannels.channels.isEmpty()) {
                org.telegram.messenger.i0.g3(new n0(s0Var, 8));
            }
            if (s0Var.G == null) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                s0Var.G = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = vp.r1(s0Var.e).y1(s0Var.b);
                s0Var.G.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i10 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i10);
                    i10++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                s0Var.G.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = s0Var.G;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = s0Var.E;
                NativeInstance.SsrcGroup[] d = s0.d(tL_groupCallParticipantVideo);
                s0Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, s0Var.H, org.telegram.messenger.o5.o(s0Var.G.peer));
            }
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.VideoSourcesCallback
    public void run(long j10, int[] iArr) {
        s0 s0Var = this.b;
        if (s0Var.E == null) {
            return;
        }
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = s0Var.f;
        getgroupparticipants.offset = "";
        int i10 = 0;
        while (i10 < iArr.length) {
            i10 = c3.i0.j(iArr[i10], i10, 1, getgroupparticipants.sources);
        }
        ConnectionsManager.getInstance(s0Var.e).sendRequest(getgroupparticipants, new mg.x(s0Var, iArr, j10, 7));
    }

    @Override // org.telegram.messenger.voip.NativeInstance.RequestBroadcastPartCallback
    public void run(final long j10, final long j11, final int i10, final int i11) {
        String str;
        switch (this.a) {
            case 3:
                final s0 s0Var = this.b;
                if (s0Var.w != null) {
                    StringBuilder sb2 = new StringBuilder("[LivePlayer] sending getFile time_ms=");
                    sb2.append(j10);
                    sb2.append(j11 == 500 ? ", scale = 1" : "");
                    sb2.append(", video_channel = ");
                    sb2.append(i10);
                    sb2.append(", video_quality = ");
                    sb2.append(i11);
                    f8.b(sb2.toString());
                    final long currentTimeMillis = System.currentTimeMillis();
                    TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
                    tL_upload_getFile.limit = 131072;
                    TLRPC.TL_inputGroupCallStream tL_inputGroupCallStream = new TLRPC.TL_inputGroupCallStream();
                    tL_inputGroupCallStream.call = s0Var.f;
                    tL_inputGroupCallStream.time_ms = j10;
                    if (j11 == 500) {
                        tL_inputGroupCallStream.scale = 1;
                    }
                    if (i10 != 0) {
                        tL_inputGroupCallStream.flags |= 1;
                        tL_inputGroupCallStream.video_channel = i10;
                        tL_inputGroupCallStream.video_quality = i11;
                    }
                    tL_upload_getFile.location = tL_inputGroupCallStream;
                    if (i10 == 0) {
                        str = a1.g.l(j10, "");
                    } else {
                        str = i10 + "_" + j10 + "_" + i11;
                    }
                    final String str2 = str;
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.x0(s0Var, str2, ConnectionsManager.getInstance(org.telegram.messenger.c.a(s0Var.e).a).sendRequest(tL_upload_getFile, new RequestDelegateTimestamp() { // from class: th.m0
                        @Override // org.telegram.tgnet.RequestDelegateTimestamp
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j12) {
                            s0 s0Var2 = s0.this;
                            if (s0Var2.x || s0Var2.E == null) {
                                return;
                            }
                            org.telegram.messenger.i0.g3(new o0(0, s0Var2, str2));
                            long j13 = currentTimeMillis;
                            long j14 = j10;
                            long j15 = j11;
                            int i12 = i10;
                            int i13 = i11;
                            if (tLObject != null) {
                                TLRPC.TL_upload_file tL_upload_file = (TLRPC.TL_upload_file) tLObject;
                                StringBuilder sb3 = new StringBuilder("[LivePlayer] received in ");
                                sb3.append(System.currentTimeMillis() - j13);
                                sb3.append("ms getFile{time_ms=");
                                sb3.append(j14);
                                sb3.append(j15 == 500 ? ", scale = 1" : "");
                                sb3.append(", video_channel = ");
                                sb3.append(i12);
                                sb3.append(", video_quality = ");
                                sb3.append(i13);
                                sb3.append("}: ");
                                sb3.append(tL_upload_file.bytes.limit());
                                sb3.append(" bytes");
                                f8.b(sb3.toString());
                                NativeInstance nativeInstance = s0Var2.E;
                                NativeByteBuffer nativeByteBuffer = tL_upload_file.bytes;
                                nativeInstance.onStreamPartAvailable(j14, nativeByteBuffer.buffer, nativeByteBuffer.limit(), j12, i12, i13);
                                return;
                            }
                            if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                                s0Var2.E.onStreamPartAvailable(j14, null, -1, j12, i12, i13);
                                org.telegram.messenger.i0.g3(new n0(s0Var2, 4));
                                return;
                            }
                            if ("GROUPCALL_JOIN_MISSING".equals(tL_error.text)) {
                                org.telegram.messenger.i0.g3(new n0(s0Var2, 6));
                                StringBuilder sb4 = new StringBuilder("[LivePlayer] received in ");
                                sb4.append(System.currentTimeMillis() - j13);
                                sb4.append("ms getFile{time_ms=");
                                sb4.append(j14);
                                sb4.append(j15 == 500 ? ", scale = 1" : "");
                                sb4.append(", video_channel = ");
                                sb4.append(i12);
                                sb4.append(", video_quality = ");
                                sb4.append(i13);
                                sb4.append("}: ");
                                sb4.append(tL_error.text);
                                sb4.append(" => rejoining");
                                f8.b(sb4.toString());
                                return;
                            }
                            int i14 = ("TIME_TOO_BIG".equals(tL_error.text) || tL_error.text.startsWith("FLOOD_WAIT")) ? 0 : -1;
                            StringBuilder sb5 = new StringBuilder("[LivePlayer] received in ");
                            sb5.append(System.currentTimeMillis() - j13);
                            sb5.append("ms getFile{time_ms=");
                            sb5.append(j14);
                            sb5.append(j15 == 500 ? ", scale = 1" : "");
                            sb5.append(", video_channel = ");
                            sb5.append(i12);
                            sb5.append(", video_quality = ");
                            sb5.append(i13);
                            sb5.append("}: ");
                            sb5.append(tL_error.text);
                            sb5.append(" => ");
                            sb5.append(i14);
                            f8.b(sb5.toString());
                            s0Var2.E.onStreamPartAvailable(j14, null, i14, j12, i12, i13);
                        }
                    }, 2, 2, s0Var.h()), 16));
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder("[LivePlayer] cancelling getFile time_ms=");
                sb3.append(j10);
                sb3.append(j11 == 500 ? ", scale = 1" : "");
                sb3.append(i10 != 0 ? a1.g.j(i10, i11, ", video_channel = ", ", video_quality = ") : "");
                f8.b(sb3.toString());
                org.telegram.messenger.i0.g3(new xd(i10, i11, 3, j10, this.b));
                break;
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.RequestCurrentTimeCallback
    public void run(long j10) {
        s0 s0Var = this.b;
        int i10 = s0Var.e;
        TLRPC.GroupCall groupCall = s0Var.w;
        if (groupCall != null && groupCall.rtmp_stream) {
            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
            getgroupcallstreamchannels.call = s0Var.f;
            if (s0Var.w == null || s0Var.E == null) {
                return;
            }
            ConnectionsManager.getInstance(i10).sendRequest(getgroupcallstreamchannels, new m4.x0(s0Var, j10, 12), 65536, 2, s0Var.h());
            return;
        }
        NativeInstance nativeInstance = s0Var.E;
        if (nativeInstance != null) {
            nativeInstance.onRequestTimeComplete(j10, ConnectionsManager.getInstance(i10).getCurrentTimeMillis());
        }
    }
}
