package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class qg1 extends org.telegram.ui.ActionBar.m2 {
    public og1 a;
    public org.telegram.ui.Components.mm0 b;
    public long c;
    public ArrayList d;
    public HashSet e;

    public static void U(qg1 qg1Var, int i10) {
        qg1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(qg1Var.c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = qg1Var.getMessagesController().getInputPeer(qg1Var.c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        qg1Var.getConnectionsManager().sendRequest(updatenotifysettings, new bi.g7(8));
    }

    public final void V() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (this.isPaused || this.a == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        }
        arrayList2.clear();
        arrayList2.add(new pg1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.e.contains(Integer.valueOf(topics.get(i10).id))) {
                    arrayList2.add(new pg1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new pg1(3, null));
            arrayList2.add(new pg1(4, null));
        }
        arrayList2.add(new pg1(3, null));
        og1 og1Var = this.a;
        if (og1Var != null) {
            og1Var.E(arrayList, arrayList2);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        i2.d.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new w41(this, 8));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.b = new org.telegram.ui.Components.mm0(context, null);
        s4.k kVar = new s4.k();
        kVar.C = false;
        kVar.m = false;
        this.b.setItemAnimator(kVar);
        this.b.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.mm0 mm0Var = this.b;
        og1 og1Var = new og1(this);
        this.a = og1Var;
        mm0Var.setAdapter(og1Var);
        this.b.setOnItemClickListener(new ng1(this));
        frameLayout.addView(this.b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.a7, false));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        this.c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
