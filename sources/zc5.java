// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zc5 extends d implements jm7 {
    public yc5 a;
    public r59 b;
    public r34 c;
    public long d;
    public boolean e;
    public TLRPC.TL_chatInviteExported f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;

    public final void Z(boolean z) {
        this.e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().i1(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new r91((byte) 5, this, z)), this.classGuid);
        yc5 yc5Var = this.a;
        if (yc5Var != null) {
            yc5Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(jb6.M0(2131748906, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 26));
        this.a = new yc5(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r34 r34Var = new r34(context, null);
        this.c = r34Var;
        r34Var.b();
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new u46(1, false));
        this.b.setEmptyView(this.c);
        this.b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.b, qoe.e(-1, -1, 51));
        frameLayout.addView(this.c, qoe.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new kg4(this, (byte) 4));
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        long j = this.d;
        if (i == nm7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            if (chatFull.id == j && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) getMessagesController().r.f(j);
                this.f = tL_chatInviteExported;
                if (tL_chatInviteExported == null) {
                    Z(false);
                    return;
                }
                this.e = false;
                yc5 yc5Var = this.a;
                if (yc5Var != null) {
                    yc5Var.f();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        nm7.f(this.currentAccount).b(this, nm7.T);
        getMessagesController().a3(this.classGuid, this.d, true);
        this.e = true;
        this.h = true;
        this.n = 2;
        this.r = 3;
        this.s = 4;
        this.x = 6;
        this.w = 5;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.f(this.currentAccount).n(this, nm7.T);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        yc5 yc5Var = this.a;
        if (yc5Var != null) {
            yc5Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            r34 r34Var = this.c;
            if (r34Var != null) {
                r34Var.setProgressBarColor(cmb.w0(null, cmb.g6, false));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
