package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vb1 extends org.telegram.ui.ActionBar.k2 {
    public tb1 a;
    public org.telegram.ui.Components.tk0 b;
    public long c;
    public ArrayList d;
    public HashSet e;

    public static void Y(vb1 vb1Var, int i10) {
        org.telegram.messenger.pt ptVar = vb1Var.getNotificationsController().g0;
        ptVar.getClass();
        String v = org.telegram.messenger.ot.v(vb1Var.c, i10, true);
        ptVar.b().edit().remove("notify2_" + v).remove("custom_" + v).remove("notifyuntil_" + v).remove("content_preview_" + v).remove("silent_" + v).remove("stories_" + v).apply();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = vb1Var.getMessagesController().i1(vb1Var.c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        vb1Var.getConnectionsManager().sendRequest(updatenotifysettings, new ag.c3(4));
    }

    public final void Z() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (this.isPaused || this.a == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        }
        arrayList2.clear();
        arrayList2.add(new ub1(1, null));
        ArrayList l4 = getMessagesController().r7.l(-this.c);
        int i10 = 0;
        if (l4 != null) {
            int i11 = 0;
            while (i10 < l4.size()) {
                if (this.e.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l4.get(i10)).id))) {
                    arrayList2.add(new ub1(2, (TLRPC.TL_forumTopic) l4.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new ub1(3, null));
            arrayList2.add(new ub1(4, null));
        }
        arrayList2.add(new ub1(3, null));
        tb1 tb1Var = this.a;
        if (tb1Var != null) {
            tb1Var.E(arrayList, arrayList2);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new y01(this, 7));
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131747928, null));
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.b = tk0Var;
        tk0Var.r1();
        this.b.setSectionsDrawBackground(true);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.m = false;
        this.b.setItemAnimator(jVar);
        this.b.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.tk0 tk0Var2 = this.b;
        tb1 tb1Var = new tb1(this);
        this.a = tb1Var;
        tk0Var2.setAdapter(tb1Var);
        this.b.setOnItemClickListener(new sb1(this));
        frameLayout.addView(this.b);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        this.c = this.arguments.getLong("dialog_id");
        Z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
