// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zxb extends d {
    public xxb a;
    public r59 b;
    public long c;
    public ArrayList d;
    public HashSet e;

    public final void Z(int i) {
        ap7 ap7Var = getNotificationsController().h0;
        ap7Var.getClass();
        String p = lo7.p(this.c, i, true);
        ap7Var.b().edit().remove("notify2_" + p).remove("custom_" + p).remove("notifyuntil_" + p).remove("content_preview_" + p).remove("silent_" + p).remove("stories_" + p).apply();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = getMessagesController().i1(this.c);
        tL_inputNotifyForumTopic.top_msg_id = i;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        getConnectionsManager().sendRequest(updatenotifysettings, new nf2((byte) 0));
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
        arrayList2.add(new yxb(1, null));
        ArrayList l = getMessagesController().g4.l(-this.c);
        int i = 0;
        if (l != null) {
            int i2 = 0;
            while (i < l.size()) {
                if (this.e.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l.get(i)).id))) {
                    arrayList2.add(new yxb(2, (TLRPC.TL_forumTopic) l.get(i)));
                    i2 = 1;
                }
                i++;
            }
            i = i2;
        }
        if (i != 0) {
            arrayList2.add(new yxb(3, null));
            arrayList2.add(new yxb(4, null));
        }
        arrayList2.add(new yxb(3, null));
        xxb xxbVar = this.a;
        if (xxbVar != null) {
            xxbVar.E(arrayList, arrayList2);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new ee0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 22));
        this.simpleActionBar.setTitle(jb6.M0(2131747645, null));
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.r1();
        this.b.setSectionsDrawBackground(true);
        sc3 sc3Var = new sc3();
        sc3Var.C = false;
        sc3Var.m = false;
        this.b.setItemAnimator(sc3Var);
        this.b.setLayoutManager(new u46());
        r59 r59Var2 = this.b;
        xxb xxbVar = new xxb(this);
        this.a = xxbVar;
        r59Var2.setAdapter(xxbVar);
        this.b.setOnItemClickListener(new wxb(this));
        frameLayout.addView(this.b);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        this.c = this.arguments.getLong("dialog_id");
        a0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
