package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class zi1 extends org.telegram.ui.Components.yl0 {
    public final /* synthetic */ WallpapersListActivity E;
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public boolean f = true;
    public String h;
    public String n;
    public String r;
    public int s;
    public int v;
    public boolean w;
    public String x;
    public e91 y;

    public zi1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.E = wallpapersListActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f != 2;
    }

    public final void E(String str, boolean z10) {
        int i10;
        if (str != null && this.n != null) {
            str = a4.a.r(this.n, " ", str, new StringBuilder("#color"));
        }
        e91 e91Var = this.y;
        if (e91Var != null) {
            AndroidUtilities.cancelRunOnUIThread(e91Var);
            this.y = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f = true;
            this.h = null;
            if (this.s != 0) {
                i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.s, true);
                this.s = 0;
            }
            wallpapersListActivity.L.c();
        } else {
            wallpapersListActivity.L.b();
            if (z10) {
                arrayList.clear();
                hashMap.clear();
                this.f = true;
                F(str, "", true);
                this.h = str;
                l();
            } else {
                e91 e91Var2 = new e91(21, this, str);
                this.y = e91Var2;
                AndroidUtilities.runOnUIThread(e91Var2, 500L);
            }
        }
        l();
    }

    public final void F(String str, String str2, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = this.s;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (i19 != 0) {
            i18 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i18).cancelRequest(this.s, true);
            this.s = 0;
        }
        this.x = str;
        i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        i11 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
        TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i11).imageSearchBot);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (!z10 || this.w) {
                return;
            }
            this.w = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            i16 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
            tL_contacts_resolveUsername.username = MessagesController.getInstance(i16).imageSearchBot;
            i17 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i17).sendRequest(tL_contacts_resolveUsername, new m(this, 25));
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = sa.e.i("#wallpaper ", str);
        i12 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser((TLRPC.User) userOrChat);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i20 = this.v + 1;
        this.v = i20;
        i13 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
        this.s = ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getInlineBotResults, new ai.i8(this, i20, 7));
        i14 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
        int i21 = this.s;
        i15 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).classGuid;
        connectionsManager.bindRequestToGuid(i21, i15);
    }

    @Override // s4.h0
    public final int h() {
        if (TextUtils.isEmpty(this.h)) {
            return 2;
        }
        return (int) Math.ceil(this.d.size() / this.E.P);
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (TextUtils.isEmpty(this.h)) {
            return i10 == 0 ? 2 : 1;
        }
        return 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 != 0) {
            if (i11 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.getString(R.string.SearchByColor));
            return;
        }
        org.telegram.ui.Cells.eb ebVar = (org.telegram.ui.Cells.eb) view;
        WallpapersListActivity wallpapersListActivity = this.E;
        int i12 = i10 * wallpapersListActivity.P;
        ArrayList arrayList = this.d;
        int ceil = (int) Math.ceil(arrayList.size() / wallpapersListActivity.P);
        int i13 = wallpapersListActivity.P;
        ebVar.d(i13, i12 == 0, i12 / i13 == ceil - 1);
        for (int i14 = 0; i14 < wallpapersListActivity.P; i14++) {
            int i15 = i12 + i14;
            ebVar.e(wallpapersListActivity.r, i15 < arrayList.size() ? arrayList.get(i15) : null, "", i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView, org.telegram.ui.Components.zl0, org.telegram.ui.xb1] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout ljVar;
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 != 0) {
            ljVar = null;
            if (i10 == 1) {
                ?? xb1Var = new xb1(context, 13, false ? 1 : 0);
                xb1Var.setItemAnimator(null);
                xb1Var.setLayoutAnimation(null);
                gg.b0 b0Var = new gg.b0(20);
                xb1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                xb1Var.setClipToPadding(false);
                b0Var.j1(0);
                xb1Var.setLayoutManager(b0Var);
                xb1Var.setAdapter(new gg.n0(this, 4));
                xb1Var.setOnItemClickListener(new t21(this, 14));
                frameLayout = xb1Var;
            } else if (i10 == 2) {
                frameLayout = new org.telegram.ui.Cells.v3(context, null);
            }
            ljVar = frameLayout;
        } else {
            ljVar = new org.telegram.ui.Components.lj(this, context, 2);
            ljVar.setTag(-33024);
        }
        if (i10 == 1) {
            ljVar.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(60.0f)));
        } else {
            ljVar.setLayoutParams(new s4.p0(-1, -2));
        }
        return new org.telegram.ui.Components.il0(ljVar);
    }
}
