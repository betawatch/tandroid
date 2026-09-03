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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class yf1 extends org.telegram.ui.ActionBar.p2 {
    public wf1 a;
    public org.telegram.ui.Components.sl0 b;
    public long c;
    public ArrayList d;
    public HashSet e;

    public static void U(yf1 yf1Var, int i10) {
        yf1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(yf1Var.c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = yf1Var.getMessagesController().getInputPeer(yf1Var.c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        yf1Var.getConnectionsManager().sendRequest(updatenotifysettings, new oh.p5(4));
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
        arrayList2.add(new xf1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.e.contains(Integer.valueOf(topics.get(i10).id))) {
                    arrayList2.add(new xf1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new xf1(3, null));
            arrayList2.add(new xf1(4, null));
        }
        arrayList2.add(new xf1(3, null));
        wf1 wf1Var = this.a;
        if (wf1Var != null) {
            wf1Var.E(arrayList, arrayList2);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        yh.z(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 22));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.b = new org.telegram.ui.Components.sl0(context, null);
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.m = false;
        this.b.setItemAnimator(lVar);
        this.b.setLayoutManager(new f2.j0());
        org.telegram.ui.Components.sl0 sl0Var = this.b;
        wf1 wf1Var = new wf1(this);
        this.a = wf1Var;
        sl0Var.setAdapter(wf1Var);
        this.b.setOnItemClickListener(new vf1(this));
        frameLayout.addView(this.b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        this.c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
