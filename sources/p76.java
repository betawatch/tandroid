// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class p76 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t76 b;
    public final /* synthetic */ int c;

    public /* synthetic */ p76(t76 t76Var, int i, byte b) {
        this.a = b;
        this.b = t76Var;
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
                t76 t76Var = this.b;
                int i = this.c;
                int i2 = 0;
                t76Var.F = false;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                            t76Var.w(tL_error);
                            break;
                        } else {
                            gl.d3(new r76(t76Var, (byte) 5));
                            break;
                        }
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    na7.q1(t76Var.e).a4(updates.users, false);
                    na7.q1(t76Var.e).U3(updates.chats, false);
                    ArrayList w0 = na7.w0(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = w0.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj = w0.get(i3);
                        i3++;
                        t76Var.s = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    gl.d3(new kz5(t76Var, na7.x0(updates, TL_update.TL_updateGroupCallMessage.class), (byte) 11));
                    na7.q1(t76Var.e).Q3(updates, false);
                    boolean z = t76Var.q() || ((groupCall = t76Var.s) != null && groupCall.rtmp_stream);
                    ArrayList w02 = na7.w0(updates, TL_update.TL_updateGroupCallParticipants.class);
                    int size3 = w02.size();
                    int i4 = 0;
                    while (i4 < size3) {
                        Object obj2 = w02.get(i4);
                        i4++;
                        TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) obj2;
                        if (tL_updateGroupCallParticipants.call.id == t76Var.j() && !z) {
                            int i5 = 0;
                            while (true) {
                                if (i5 < tL_updateGroupCallParticipants.participants.size()) {
                                    if (cf3.n(tL_updateGroupCallParticipants.participants.get(i5).peer) == t76Var.b) {
                                        t76Var.y = tL_updateGroupCallParticipants.participants.get(i5);
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            if (t76Var.y != null) {
                                ArrayList w03 = na7.w0(updates, TL_update.TL_updateGroupCallConnection.class);
                                size = w03.size();
                                TLRPC.TL_dataJSON tL_dataJSON = null;
                                while (i2 < size) {
                                    Object obj3 = w03.get(i2);
                                    i2++;
                                    tL_dataJSON = ((TL_update.TL_updateGroupCallConnection) obj3).params;
                                }
                                ug8.q(t76Var.f.id, new StringBuilder("[LivePlayer] joined call "));
                                t76Var.x = true;
                                if (!t76Var.w || !t76Var.c()) {
                                    TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                                    leavegroupcall.call = t76Var.f;
                                    leavegroupcall.source = i;
                                    ConnectionsManager.getInstance(t76Var.e).sendRequest(leavegroupcall, new s76(t76Var, (byte) 2));
                                    break;
                                } else {
                                    t76Var.y(tL_dataJSON, z);
                                    gl.d3(new r76(t76Var, (byte) 4));
                                    break;
                                }
                            }
                        }
                    }
                    ArrayList w032 = na7.w0(updates, TL_update.TL_updateGroupCallConnection.class);
                    size = w032.size();
                    TLRPC.TL_dataJSON tL_dataJSON2 = null;
                    while (i2 < size) {
                    }
                    ug8.q(t76Var.f.id, new StringBuilder("[LivePlayer] joined call "));
                    t76Var.x = true;
                    if (!t76Var.w) {
                    }
                    TL_phone.leaveGroupCall leavegroupcall2 = new TL_phone.leaveGroupCall();
                    leavegroupcall2.call = t76Var.f;
                    leavegroupcall2.source = i;
                    ConnectionsManager.getInstance(t76Var.e).sendRequest(leavegroupcall2, new s76(t76Var, (byte) 2));
                }
                break;
            default:
                t76 t76Var2 = this.b;
                int i6 = this.c;
                t76Var2.getClass();
                gl.d3(new q76((Object) t76Var2, i6, (Object) tLObject, (Object) tL_error, (byte) 0));
                break;
        }
    }
}
