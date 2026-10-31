package th;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f8;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ l0(s0 s0Var, int i10) {
        this.a = i10;
        this.b = s0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01bc A[LOOP:4: B:78:0x01ba->B:79:0x01bc, LOOP_END] */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        int size;
        int i10;
        ArrayList arrayList;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        switch (this.a) {
            case 0:
                s0 s0Var = this.b;
                TLRPC.InputGroupCall inputGroupCall = s0Var.f;
                int i11 = s0Var.e;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.messenger.i0.g3(new n0(s0Var, 4));
                        break;
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i12 = 0;
                    vp.r1(i11).V3(updates.users, false);
                    vp.r1(i11).P3(updates.chats, false);
                    ArrayList y02 = vp.y0(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = y02.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj = y02.get(i13);
                        i13++;
                        s0Var.w = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    org.telegram.messenger.i0.g3(new rh.o(29, s0Var, vp.z0(updates, TL_update.TL_updateGroupCallMessage.class)));
                    vp.r1(i11).L3(updates, false);
                    TLRPC.GroupCall groupCall = s0Var.w;
                    boolean z10 = groupCall != null && groupCall.rtmp_stream;
                    ArrayList y03 = vp.y0(updates, TL_update.TL_updateGroupCallParticipants.class);
                    int size3 = y03.size();
                    int i14 = 0;
                    while (i14 < size3) {
                        Object obj2 = y03.get(i14);
                        i14++;
                        TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) obj2;
                        if (tL_updateGroupCallParticipants.call.id != s0Var.g() || z10) {
                            arrayList = y03;
                        } else {
                            int i15 = i12;
                            while (true) {
                                if (i15 < tL_updateGroupCallParticipants.participants.size()) {
                                    arrayList = y03;
                                    if (org.telegram.messenger.o5.o(tL_updateGroupCallParticipants.participants.get(i15).peer) == s0Var.b) {
                                        s0Var.G = tL_updateGroupCallParticipants.participants.get(i15);
                                    } else {
                                        i15++;
                                        y03 = arrayList;
                                    }
                                } else {
                                    arrayList = y03;
                                }
                            }
                            if (s0Var.G != null) {
                                ArrayList y04 = vp.y0(updates, TL_update.TL_updateGroupCallConnection.class);
                                size = y04.size();
                                TLRPC.TL_dataJSON tL_dataJSON = null;
                                i10 = 0;
                                while (i10 < size) {
                                    Object obj3 = y04.get(i10);
                                    i10++;
                                    tL_dataJSON = ((TL_update.TL_updateGroupCallConnection) obj3).params;
                                }
                                i0.a.q(inputGroupCall.id, new StringBuilder("[LivePlayer] joined call "));
                                s0Var.y = true;
                                if (s0Var.x && s0Var.E != null) {
                                    if (tL_dataJSON == null || tL_dataJSON.data.startsWith("{\"stream\":true")) {
                                        s0Var.E.prepareForStream(z10);
                                    } else {
                                        s0Var.E.setJoinResponsePayload(tL_dataJSON.data);
                                    }
                                    if (s0Var.n) {
                                        s0Var.E.setMuteMicrophone(s0Var.r);
                                        s0Var.E.activateVideoCapturer(s0Var.J);
                                        s0Var.E.setupOutgoingVideoCreated(s0Var.J);
                                    } else {
                                        TLRPC.GroupCallParticipant groupCallParticipant = s0Var.G;
                                        if (groupCallParticipant != null) {
                                            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2 = groupCallParticipant.video;
                                            if (tL_groupCallParticipantVideo2 != null) {
                                                NativeInstance nativeInstance = s0Var.E;
                                                String str = tL_groupCallParticipantVideo2.endpoint;
                                                NativeInstance.SsrcGroup[] d = s0.d(tL_groupCallParticipantVideo2);
                                                s0Var.r(d);
                                                nativeInstance.addIncomingVideoOutput(2, str, d, s0Var.H, org.telegram.messenger.o5.o(s0Var.G.peer));
                                            } else {
                                                org.telegram.messenger.i0.g3(new n0(s0Var, 2));
                                            }
                                        } else if (z10) {
                                            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
                                            getgroupcallstreamchannels.call = inputGroupCall;
                                            ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamchannels, new k0(s0Var, 1), 65536, 2, s0Var.h());
                                        } else {
                                            TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                                            getgroupcall.call = inputGroupCall;
                                            getgroupcall.limit = 10;
                                            ConnectionsManager.getInstance(i11).sendRequest(getgroupcall, new l0(s0Var, 2));
                                        }
                                    }
                                    org.telegram.messenger.i0.g3(new n0(s0Var, 3));
                                    break;
                                } else {
                                    TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                                    leavegroupcall.call = inputGroupCall;
                                    ConnectionsManager.getInstance(i11).sendRequest(leavegroupcall, new rh.h5(1, s0Var, updates));
                                    break;
                                }
                            }
                        }
                        y03 = arrayList;
                        i12 = 0;
                    }
                    ArrayList y042 = vp.y0(updates, TL_update.TL_updateGroupCallConnection.class);
                    size = y042.size();
                    TLRPC.TL_dataJSON tL_dataJSON2 = null;
                    i10 = 0;
                    while (i10 < size) {
                    }
                    i0.a.q(inputGroupCall.id, new StringBuilder("[LivePlayer] joined call "));
                    s0Var.y = true;
                    if (s0Var.x) {
                    }
                    TL_phone.leaveGroupCall leavegroupcall2 = new TL_phone.leaveGroupCall();
                    leavegroupcall2.call = inputGroupCall;
                    ConnectionsManager.getInstance(i11).sendRequest(leavegroupcall2, new rh.h5(1, s0Var, updates));
                }
                break;
            case 1:
                final int i16 = 0;
                final s0 s0Var2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: th.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                s0 s0Var3 = s0Var2;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i17 = s0Var3.e;
                                if (!s0Var3.x) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                        vp.r1(i17).V3(groupcall.users, false);
                                        vp.r1(i17).P3(groupcall.chats, false);
                                        s0Var3.w = groupcall.call;
                                        zs.f(i17).k(zs.G2, Long.valueOf(s0Var3.w.id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        org.telegram.messenger.i0.g3(new n0(s0Var3, 4));
                                    }
                                    if (s0Var3.P) {
                                        Runnable runnable = s0Var3.R;
                                        if (runnable != null) {
                                            org.telegram.messenger.i0.r(runnable);
                                        }
                                        n0 n0Var = new n0(s0Var3, 11);
                                        s0Var3.R = n0Var;
                                        org.telegram.messenger.i0.h3(n0Var, s0Var3.l() ? 5000 : 20000);
                                        break;
                                    }
                                }
                                break;
                            default:
                                s0 s0Var4 = s0Var2;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!s0Var4.x) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(s0Var4.K))) {
                                            if (s0Var4.E != null) {
                                                org.telegram.messenger.r5 r5Var = Utilities.e;
                                                NativeInstance nativeInstance2 = s0Var4.E;
                                                Objects.requireNonNull(nativeInstance2);
                                                r5Var.c(new org.telegram.messenger.voip.v0(nativeInstance2, 3));
                                                s0Var4.M.clear();
                                                s0Var4.E = null;
                                            }
                                            s0Var4.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject3;
                                        vp.r1(s0Var4.e).V3(groupcall2.users, false);
                                        vp.r1(s0Var4.e).P3(groupcall2.chats, false);
                                        s0Var4.w = groupcall2.call;
                                        zs.f(s0Var4.e).k(zs.G2, Long.valueOf(s0Var4.w.id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            f8.b("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            org.telegram.messenger.i0.g3(new n0(s0Var4, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            org.telegram.messenger.i0.g3(new n0(s0Var4, 4));
                                        }
                                    }
                                    if (s0Var4.P) {
                                        Runnable runnable2 = s0Var4.Q;
                                        if (runnable2 != null) {
                                            org.telegram.messenger.i0.r(runnable2);
                                        }
                                        n0 n0Var2 = new n0(s0Var4, 10);
                                        s0Var4.Q = n0Var2;
                                        org.telegram.messenger.i0.h3(n0Var2, 4000L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                s0 s0Var3 = this.b;
                int i17 = s0Var3.e;
                if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    int i18 = 0;
                    vp.r1(i17).V3(groupcall.users, false);
                    vp.r1(i17).P3(groupcall.chats, false);
                    if (s0Var3.E != null && !s0Var3.x) {
                        while (true) {
                            if (i18 < groupcall.participants.size()) {
                                if (org.telegram.messenger.o5.o(groupcall.participants.get(i18).peer) == s0Var3.b) {
                                    s0Var3.G = groupcall.participants.get(i18);
                                } else {
                                    i18++;
                                }
                            }
                        }
                        TLRPC.GroupCallParticipant groupCallParticipant2 = s0Var3.G;
                        if (groupCallParticipant2 != null && (tL_groupCallParticipantVideo = groupCallParticipant2.video) != null) {
                            NativeInstance nativeInstance2 = s0Var3.E;
                            String str2 = tL_groupCallParticipantVideo.endpoint;
                            NativeInstance.SsrcGroup[] d10 = s0.d(tL_groupCallParticipantVideo);
                            s0Var3.r(d10);
                            nativeInstance2.addIncomingVideoOutput(2, str2, d10, s0Var3.H, org.telegram.messenger.o5.o(s0Var3.G.peer));
                            break;
                        } else {
                            org.telegram.messenger.i0.g3(new n0(s0Var3, 7));
                            break;
                        }
                    }
                }
                break;
            case 3:
                final int i19 = 1;
                final s0 s0Var4 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: th.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i19) {
                            case 0:
                                s0 s0Var32 = s0Var4;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i172 = s0Var32.e;
                                if (!s0Var32.x) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject2;
                                        vp.r1(i172).V3(groupcall2.users, false);
                                        vp.r1(i172).P3(groupcall2.chats, false);
                                        s0Var32.w = groupcall2.call;
                                        zs.f(i172).k(zs.G2, Long.valueOf(s0Var32.w.id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        org.telegram.messenger.i0.g3(new n0(s0Var32, 4));
                                    }
                                    if (s0Var32.P) {
                                        Runnable runnable = s0Var32.R;
                                        if (runnable != null) {
                                            org.telegram.messenger.i0.r(runnable);
                                        }
                                        n0 n0Var = new n0(s0Var32, 11);
                                        s0Var32.R = n0Var;
                                        org.telegram.messenger.i0.h3(n0Var, s0Var32.l() ? 5000 : 20000);
                                        break;
                                    }
                                }
                                break;
                            default:
                                s0 s0Var42 = s0Var4;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!s0Var42.x) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(s0Var42.K))) {
                                            if (s0Var42.E != null) {
                                                org.telegram.messenger.r5 r5Var = Utilities.e;
                                                NativeInstance nativeInstance22 = s0Var42.E;
                                                Objects.requireNonNull(nativeInstance22);
                                                r5Var.c(new org.telegram.messenger.voip.v0(nativeInstance22, 3));
                                                s0Var42.M.clear();
                                                s0Var42.E = null;
                                            }
                                            s0Var42.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall22 = (TL_phone.groupCall) tLObject3;
                                        vp.r1(s0Var42.e).V3(groupcall22.users, false);
                                        vp.r1(s0Var42.e).P3(groupcall22.chats, false);
                                        s0Var42.w = groupcall22.call;
                                        zs.f(s0Var42.e).k(zs.G2, Long.valueOf(s0Var42.w.id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            f8.b("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            org.telegram.messenger.i0.g3(new n0(s0Var42, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            org.telegram.messenger.i0.g3(new n0(s0Var42, 4));
                                        }
                                    }
                                    if (s0Var42.P) {
                                        Runnable runnable2 = s0Var42.Q;
                                        if (runnable2 != null) {
                                            org.telegram.messenger.i0.r(runnable2);
                                        }
                                        n0 n0Var2 = new n0(s0Var42, 10);
                                        s0Var42.Q = n0Var2;
                                        org.telegram.messenger.i0.h3(n0Var2, 4000L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                s0 s0Var5 = this.b;
                int i20 = s0Var5.e;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && "GROUPCALL_ALREADY_DISCARDED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.messenger.i0.g3(new n0(s0Var5, 4));
                        break;
                    }
                } else {
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject;
                    vp.r1(i20).V3(updates2.users, false);
                    vp.r1(i20).P3(updates2.chats, false);
                    vp.r1(i20).L3(updates2, false);
                    break;
                }
                break;
            default:
                boolean z11 = tLObject instanceof TLRPC.Updates;
                s0 s0Var6 = this.b;
                if (!z11) {
                    s0Var6.getClass();
                    break;
                } else {
                    vp.r1(s0Var6.e).L3((TLRPC.Updates) tLObject, false);
                    break;
                }
        }
    }
}
