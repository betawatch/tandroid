// default package

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class x36 extends qa5 {
    public x36(a46 a46Var, Bundle bundle) {
        super(bundle);
    }

    @Override // qa5
    public final void q0(HashSet hashSet) {
        if (hashSet.size() == 1) {
            TLRPC.User V1 = getMessagesController().V1((Long) hashSet.iterator().next());
            TLRPC.UserFull W1 = getMessagesController().W1(V1.id);
            if (W1 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = getMessagesController().m1(V1.id);
                getConnectionsManager().sendRequest(tL_users_getFullUser, new rv3(this, V1, (byte) 17));
                return;
            }
            rgc.m(V1, false, W1.video_calls_available, getParentActivity(), W1, getAccountInstance());
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new rv3(this, hashSet, (byte) 18));
        }
        finishFragment();
    }

    public final void y0(TLObject tLObject, HashSet hashSet, TLRPC.TL_error tL_error) {
        int i = 0;
        if (!(tLObject instanceof TLRPC.Updates)) {
            if (!(tLObject instanceof TL_phone.groupCall)) {
                if (tL_error != null) {
                    a46.d().g0(tL_error, false);
                    return;
                }
                return;
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            na7.q1(this.currentAccount).a4(groupcall.users, false);
            na7.q1(this.currentAccount).U3(groupcall.chats, false);
            if (LaunchActivity.H1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                TLRPC.GroupCall groupCall = groupcall.call;
                tL_inputGroupCall.id = groupCall.id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                rgc.g(LaunchActivity.H1, this.currentAccount, tL_inputGroupCall, false, groupCall, hashSet);
                return;
            }
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        na7.q1(this.currentAccount).a4(updates.users, false);
        na7.q1(this.currentAccount).U3(updates.chats, false);
        ArrayList x0 = na7.x0(updates, TL_update.TL_updateGroupCall.class);
        int size = x0.size();
        TLRPC.GroupCall groupCall2 = null;
        while (i < size) {
            Object obj = x0.get(i);
            i++;
            groupCall2 = ((TL_update.TL_updateGroupCall) obj).call;
        }
        if (LaunchActivity.H1 == null || groupCall2 == null) {
            return;
        }
        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
        tL_inputGroupCall2.id = groupCall2.id;
        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
        rgc.g(LaunchActivity.H1, this.currentAccount, tL_inputGroupCall2, false, groupCall2, hashSet);
    }
}
