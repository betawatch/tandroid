package qh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ j(n nVar, int i10) {
        this.a = i10;
        this.b = nVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        switch (this.a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                n nVar = this.b;
                nVar.getClass();
                if (tL_error != null) {
                    tc.a0(nVar).d0(tL_error, false);
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                n nVar2 = this.b;
                m mVar = nVar2.r;
                w41 w41Var = new w41(-4);
                w41Var.d = 140;
                w41Var.c = mVar;
                w41Var.z = -1;
                arrayList2.add(w41Var);
                int i10 = 0;
                if (ChatObject.canUserDoAdminAction(nVar2.D, 1)) {
                    w41 c3 = w41.c(141, R.drawable.outline_profile_photo, LocaleController.getString(ChatObject.hasPhoto(nVar2.D) ? R.string.CommunitySettingsChangePhoto : R.string.CommunitySettingsSetPhoto));
                    c3.q = true;
                    arrayList2.add(c3);
                    arrayList2.add(w41.D(2, AndroidUtilities.dp(14.0f)));
                    arrayList2.add(w41.s(0, LocaleController.getString(R.string.CommunitySectionCommunityName)));
                    arrayList2.add(w41.j(7, nVar2.n));
                    arrayList2.add(w41.D(1, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.canBlockUsers(nVar2.D)) {
                    arrayList2.add(w41.s(3, LocaleController.getString(R.string.CommunitySectionWhoCanAddChats)));
                    w41 x4 = w41.x(ImageReceiver.DEFAULT_CROSSFADE_DURATION, LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembers), LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembersInfo));
                    x4.K(nVar2.h);
                    arrayList2.add(x4);
                    w41 x10 = w41.x(151, LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdmins), LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdminsInfo));
                    x10.K(!nVar2.h);
                    arrayList2.add(x10);
                    arrayList2.add(w41.D(4, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.hasAdminRights(nVar2.D)) {
                    int i11 = R.drawable.msg_admins;
                    String string = LocaleController.getString(R.string.CommunityAdministrators);
                    TLRPC.ChatFull chatFull = nVar2.E;
                    arrayList2.add(w41.d(142, i11, string, chatFull != null ? Integer.toString(chatFull.admins_count) : ""));
                    int i12 = R.drawable.community_requests_outline_24;
                    String string2 = LocaleController.getString(R.string.CommunityPendingRequests);
                    TLRPC.ChatFull chatFull2 = nVar2.E;
                    arrayList2.add(w41.d(143, i12, string2, chatFull2 != null ? Integer.toString(chatFull2.requests_pending) : ""));
                    int i13 = R.drawable.msg_user_remove;
                    String string3 = LocaleController.getString(R.string.CommunityRemovedUsers);
                    TLRPC.ChatFull chatFull3 = nVar2.E;
                    arrayList2.add(w41.d(144, i13, string3, chatFull3 != null ? Integer.toString(chatFull3.kicked_count) : ""));
                }
                arrayList2.add(w41.D(5, AndroidUtilities.dp(14.0f)));
                w41 c6 = w41.c(146, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityMenuAddChat));
                c6.q = true;
                arrayList2.add(c6);
                TLRPC.ChatFull chatFull4 = nVar2.E;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                        i10++;
                        arrayList2.add(w41.v(nVar2.getMessagesController().getUserOrChat(DialogObject.getPeerDialogId(communityPeer.peer))));
                    }
                    break;
                }
                break;
        }
    }
}
