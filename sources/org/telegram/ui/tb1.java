package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class tb1 extends org.telegram.ui.ActionBar.k2 {
    public rb1 a;
    public org.telegram.ui.Components.uk0 b;
    public long c;
    public ArrayList d;
    public HashSet e;

    public static void Z(tb1 tb1Var, int i10) {
        org.telegram.messenger.qt qtVar = tb1Var.getNotificationsController().g0;
        qtVar.getClass();
        String v = org.telegram.messenger.pt.v(tb1Var.c, i10, true);
        qtVar.b().edit().remove("notify2_" + v).remove("custom_" + v).remove("notifyuntil_" + v).remove("content_preview_" + v).remove("silent_" + v).remove("stories_" + v).apply();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = tb1Var.getMessagesController().i1(tb1Var.c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        tb1Var.getConnectionsManager().sendRequest(updatenotifysettings, new ag.c3(4));
    }

    public final void a0() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (this.isPaused || this.a == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        }
        arrayList2.clear();
        arrayList2.add(new sb1(1, null));
        ArrayList l4 = getMessagesController().r7.l(-this.c);
        int i10 = 0;
        if (l4 != null) {
            int i11 = 0;
            while (i10 < l4.size()) {
                if (this.e.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l4.get(i10)).id))) {
                    arrayList2.add(new sb1(2, (TLRPC.TL_forumTopic) l4.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new sb1(3, null));
            arrayList2.add(new sb1(4, null));
        }
        arrayList2.add(new sb1(3, null));
        rb1 rb1Var = this.a;
        if (rb1Var != null) {
            rb1Var.E(arrayList, arrayList2);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new z01(this, 7));
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131747928, null));
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.b = uk0Var;
        uk0Var.r1();
        this.b.setSectionsDrawBackground(true);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.m = false;
        this.b.setItemAnimator(jVar);
        this.b.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.uk0 uk0Var2 = this.b;
        rb1 rb1Var = new rb1(this);
        this.a = rb1Var;
        uk0Var2.setAdapter(rb1Var);
        this.b.setOnItemClickListener(new qb1(this));
        frameLayout.addView(this.b);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        this.c = this.arguments.getLong("dialog_id");
        a0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
