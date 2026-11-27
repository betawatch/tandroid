// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class v96 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w96 b;
    public final /* synthetic */ int c;

    public /* synthetic */ v96(w96 w96Var, int i, byte b) {
        this.a = b;
        this.b = w96Var;
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd A[LOOP:3: B:35:0x00cb->B:36:0x00cd, LOOP_END] */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int size;
        int i;
        TLRPC.GroupCall groupCall;
        switch (this.a) {
            case 0:
                w96 w96Var = this.b;
                int i2 = this.c;
                w96Var.getClass();
                hl.c3(new y36((Object) w96Var, i2, (Object) tLObject, (Object) tL_error, (byte) 1));
                break;
            default:
                w96 w96Var2 = this.b;
                int i3 = this.c;
                byte b = 0;
                w96Var2.F = false;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                            w96Var2.w(tL_error);
                            break;
                        } else {
                            hl.c3(new u96(w96Var2, (byte) 4));
                            break;
                        }
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    uc7.s1(w96Var2.e).j4(updates.users, false);
                    uc7.s1(w96Var2.e).c4(updates.chats, false);
                    ArrayList y0 = uc7.y0(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = y0.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj = y0.get(i4);
                        i4++;
                        w96Var2.s = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    hl.c3(new z56(w96Var2, uc7.z0(updates, TL_update.TL_updateGroupCallMessage.class), (byte) 8));
                    uc7.s1(w96Var2.e).Y3(updates, false);
                    boolean z = w96Var2.q() || ((groupCall = w96Var2.s) != null && groupCall.rtmp_stream);
                    ArrayList y02 = uc7.y0(updates, TL_update.TL_updateGroupCallParticipants.class);
                    int size3 = y02.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        Object obj2 = y02.get(i5);
                        i5++;
                        TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) obj2;
                        if (tL_updateGroupCallParticipants.call.id == w96Var2.j() && !z) {
                            int i6 = 0;
                            while (true) {
                                if (i6 < tL_updateGroupCallParticipants.participants.size()) {
                                    if (wf3.n(tL_updateGroupCallParticipants.participants.get(i6).peer) == w96Var2.b) {
                                        w96Var2.y = tL_updateGroupCallParticipants.participants.get(i6);
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                            if (w96Var2.y != null) {
                                ArrayList y03 = uc7.y0(updates, TL_update.TL_updateGroupCallConnection.class);
                                size = y03.size();
                                TLRPC.TL_dataJSON tL_dataJSON = null;
                                i = 0;
                                while (i < size) {
                                    Object obj3 = y03.get(i);
                                    i++;
                                    tL_dataJSON = ((TL_update.TL_updateGroupCallConnection) obj3).params;
                                }
                                ik8.q(w96Var2.f.id, new StringBuilder("[LivePlayer] joined call "));
                                w96Var2.x = true;
                                if (!w96Var2.w || !w96Var2.c()) {
                                    TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                                    leavegroupcall.call = w96Var2.f;
                                    leavegroupcall.source = i3;
                                    ConnectionsManager.getInstance(w96Var2.e).sendRequest(leavegroupcall, new t96(w96Var2, b));
                                    break;
                                } else {
                                    w96Var2.y(tL_dataJSON, z);
                                    hl.c3(new u96(w96Var2, (byte) 0));
                                    break;
                                }
                            }
                        }
                    }
                    ArrayList y032 = uc7.y0(updates, TL_update.TL_updateGroupCallConnection.class);
                    size = y032.size();
                    TLRPC.TL_dataJSON tL_dataJSON2 = null;
                    i = 0;
                    while (i < size) {
                    }
                    ik8.q(w96Var2.f.id, new StringBuilder("[LivePlayer] joined call "));
                    w96Var2.x = true;
                    if (!w96Var2.w) {
                    }
                    TL_phone.leaveGroupCall leavegroupcall2 = new TL_phone.leaveGroupCall();
                    leavegroupcall2.call = w96Var2.f;
                    leavegroupcall2.source = i3;
                    ConnectionsManager.getInstance(w96Var2.e).sendRequest(leavegroupcall2, new t96(w96Var2, b));
                }
                break;
        }
    }
}
