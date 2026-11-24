// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class p96 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s96 b;
    public final /* synthetic */ int c;

    public /* synthetic */ p96(s96 s96Var, int i, byte b) {
        this.a = b;
        this.b = s96Var;
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2 A[LOOP:3: B:38:0x00e0->B:39:0x00e2, LOOP_END] */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int size;
        TLRPC.GroupCall groupCall;
        switch (this.a) {
            case 0:
                s96 s96Var = this.b;
                int i = this.c;
                int i2 = 0;
                s96Var.F = false;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                            s96Var.w(tL_error);
                            break;
                        } else {
                            gm.c3(new q96(s96Var, (byte) 5));
                            break;
                        }
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    oc7.r1(s96Var.e).d4(updates.users, false);
                    oc7.r1(s96Var.e).X3(updates.chats, false);
                    ArrayList w0 = oc7.w0(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = w0.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj = w0.get(i3);
                        i3++;
                        s96Var.s = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    gm.c3(new k16(s96Var, oc7.x0(updates, TL_update.TL_updateGroupCallMessage.class), (byte) 12));
                    oc7.r1(s96Var.e).T3(updates, false);
                    boolean z = s96Var.q() || ((groupCall = s96Var.s) != null && groupCall.rtmp_stream);
                    ArrayList w02 = oc7.w0(updates, TL_update.TL_updateGroupCallParticipants.class);
                    int size3 = w02.size();
                    int i4 = 0;
                    while (i4 < size3) {
                        Object obj2 = w02.get(i4);
                        i4++;
                        TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) obj2;
                        if (tL_updateGroupCallParticipants.call.id == s96Var.j() && !z) {
                            int i5 = 0;
                            while (true) {
                                if (i5 < tL_updateGroupCallParticipants.participants.size()) {
                                    if (pg3.n(tL_updateGroupCallParticipants.participants.get(i5).peer) == s96Var.b) {
                                        s96Var.y = tL_updateGroupCallParticipants.participants.get(i5);
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            if (s96Var.y != null) {
                                ArrayList w03 = oc7.w0(updates, TL_update.TL_updateGroupCallConnection.class);
                                size = w03.size();
                                TLRPC.TL_dataJSON tL_dataJSON = null;
                                while (i2 < size) {
                                    Object obj3 = w03.get(i2);
                                    i2++;
                                    tL_dataJSON = ((TL_update.TL_updateGroupCallConnection) obj3).params;
                                }
                                wi8.q(s96Var.f.id, new StringBuilder("[LivePlayer] joined call "));
                                s96Var.x = true;
                                if (!s96Var.w || !s96Var.c()) {
                                    TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                                    leavegroupcall.call = s96Var.f;
                                    leavegroupcall.source = i;
                                    ConnectionsManager.getInstance(s96Var.e).sendRequest(leavegroupcall, new r96(s96Var, (byte) 2));
                                    break;
                                } else {
                                    s96Var.y(tL_dataJSON, z);
                                    gm.c3(new q96(s96Var, (byte) 4));
                                    break;
                                }
                            }
                        }
                    }
                    ArrayList w032 = oc7.w0(updates, TL_update.TL_updateGroupCallConnection.class);
                    size = w032.size();
                    TLRPC.TL_dataJSON tL_dataJSON2 = null;
                    while (i2 < size) {
                    }
                    wi8.q(s96Var.f.id, new StringBuilder("[LivePlayer] joined call "));
                    s96Var.x = true;
                    if (!s96Var.w) {
                    }
                    TL_phone.leaveGroupCall leavegroupcall2 = new TL_phone.leaveGroupCall();
                    leavegroupcall2.call = s96Var.f;
                    leavegroupcall2.source = i;
                    ConnectionsManager.getInstance(s96Var.e).sendRequest(leavegroupcall2, new r96(s96Var, (byte) 2));
                }
                break;
            default:
                s96 s96Var2 = this.b;
                int i6 = this.c;
                s96Var2.getClass();
                gm.c3(new v36((Object) s96Var2, i6, (Object) tLObject, (Object) tL_error, (byte) 1));
                break;
        }
    }
}
