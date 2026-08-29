package qh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import bg.z3;
import cg.s0;
import i7.f6;
import i7.h6;
import java.util.WeakHashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.dd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.s40;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.z51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.p60;
import org.telegram.ui.th;
import org.telegram.ui.tn;
import org.telegram.ui.wc;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class n extends o2 implements r40, NotificationCenter.NotificationCenterDelegate, vd.b {
    public s40 A;
    public TLRPC.FileLocation B;
    public s0 C;
    public TLRPC.Chat D;
    public TLRPC.ChatFull E;
    public final c2[] F;
    public final l G;
    public final vd.a a;
    public long b;
    public z3 c;
    public u51 d;
    public String e;
    public boolean f;
    public boolean h;
    public z51 n;
    public m r;
    public cg.i0 s;
    public t9 v;
    public AnimatorSet w;
    public RadialProgressView x;
    public e9 y;

    public n(Bundle bundle) {
        super(bundle);
        this.a = new vd.a(0, this, jr.h, 320L, false);
        this.F = new c2[1];
        this.G = new l(this);
    }

    public static boolean U(n nVar, w41 w41Var, View view) {
        long j10;
        boolean canRemoveBotFromCommunity;
        boolean z10;
        boolean z11;
        Object obj = w41Var.G;
        if (!(obj instanceof TLRPC.Chat)) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j10 = user.id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, nVar.D);
                z10 = isBot;
                z11 = false;
            }
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        j10 = -chat.id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, nVar.D);
        z11 = isChannelAndNotMegaGroup;
        z10 = false;
        boolean z12 = canRemoveBotFromCommunity;
        long j11 = j10;
        int b10 = p0.b(nVar.currentAccount, j11);
        boolean z13 = b10 == 1 || b10 == 2;
        if (z12 || z13) {
            j70 F = j70.F(nVar.c, null, view);
            F.l(R.drawable.msg_viewintopic, LocaleController.getString(z10 ? R.string.CommunityMenuViewBot : z11 ? R.string.CommunityMenuViewChannel : R.string.CommunityMenuViewGroup), new h(nVar, j11, 1), z13);
            F.m(z12, R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), true, new dd(nVar, z10, z11, j11, 2));
            F.W(nVar.d.V0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void V(n nVar, w41 w41Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = w41Var.d;
        if (i10 == 140) {
            if (nVar.A.h() || (chatPhoto = (chat = nVar.getMessagesController().getChat(Long.valueOf(nVar.b))).photo) == null || chatPhoto.photo_big == null) {
                return;
            }
            ImageLocation imageLocation = null;
            PhotoViewer.t1().K2(null, nVar, null);
            TLRPC.ChatPhoto chatPhoto2 = chat.photo;
            int i11 = chatPhoto2.dc_id;
            if (i11 != 0) {
                chatPhoto2.photo_big.dc_id = i11;
            }
            TLRPC.ChatFull chatFull = nVar.E;
            if (chatFull != null) {
                TLRPC.Photo photo = chatFull.chat_photo;
                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                    imageLocation = ImageLocation.getForPhoto(nVar.E.chat_photo.video_sizes.get(0), nVar.E.chat_photo);
                }
            }
            PhotoViewer.t1().e2(null, chat.photo.photo_big, null, imageLocation, null, null, null, 0, nVar.G, null, 0L, 0L, 0L, true, null, null);
            return;
        }
        if (i10 == 141) {
            nVar.A.o(nVar.B != null, new i(nVar, 0), new bg.f0(7), 0);
            return;
        }
        if (i10 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", nVar.b);
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            org.telegram.ui.jr jrVar = new org.telegram.ui.jr(bundle);
            jrVar.x0(nVar.E);
            nVar.presentFragment(jrVar);
            return;
        }
        if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", nVar.b);
            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            org.telegram.ui.jr jrVar2 = new org.telegram.ui.jr(bundle2);
            jrVar2.x0(nVar.E);
            nVar.presentFragment(jrVar2);
            return;
        }
        if (i10 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", nVar.b);
            nVar.presentFragment(new q(bundle3));
            return;
        }
        if (i10 == 150) {
            nVar.Z(true);
            return;
        }
        if (i10 == 151) {
            nVar.Z(false);
            return;
        }
        if (i10 == 145) {
            c5.s(nVar, false, nVar.D, null, false, true, true, false, new k(nVar));
            return;
        }
        if (i10 == 146) {
            p0.e(nVar.F, nVar, nVar.currentAccount, nVar.D);
            return;
        }
        Object obj = w41Var.G;
        if (obj instanceof TLRPC.Chat) {
            nVar.presentFragment(tn.R9(-((TLRPC.Chat) obj).id));
        } else if (obj instanceof TLRPC.User) {
            nVar.presentFragment(tn.R9(((TLRPC.User) obj).id));
        }
    }

    public static /* synthetic */ void W(n nVar) {
        nVar.B = null;
        MessagesController.getInstance(nVar.currentAccount).changeChatAvatar(nVar.b, null, null, null, null, 0.0d, null, null, null, null);
        nVar.a0(false, true);
        nVar.v.h(null, null, nVar.y, nVar.D);
    }

    @Override // org.telegram.ui.Components.r40
    public final void D(float f9) {
        RadialProgressView radialProgressView = this.x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f9);
    }

    @Override // org.telegram.ui.Components.r40
    public final void K(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        this.C.setAlpha(f9);
        this.C.setScaleX(AndroidUtilities.lerp(0.75f, 1.0f, f9));
        this.C.setScaleY(AndroidUtilities.lerp(0.75f, 1.0f, f9));
        this.C.setVisibility(f9 > 0.0f ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.r40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new wc(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    public final void Y() {
        this.a.a((this.f == this.h && TextUtils.equals(((jh.m) this.n.b).getText().toString(), this.e)) ? false : true, true);
    }

    public final void Z(boolean z10) {
        if (this.h == z10) {
            return;
        }
        g6 g6Var = (g6) this.d.y1(151);
        if (g6Var != null) {
            g6Var.a(!z10);
        }
        g6 g6Var2 = (g6) this.d.y1(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
        if (g6Var2 != null) {
            g6Var2.a(z10);
        }
        this.h = z10;
        Y();
    }

    public final void a0(boolean z10, boolean z11) {
        if (this.x == null) {
            return;
        }
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w = null;
        }
        if (!z11) {
            if (z10) {
                this.x.setAlpha(1.0f);
                this.x.setVisibility(0);
                this.s.setAlpha(1.0f);
                this.s.setVisibility(0);
                return;
            }
            this.x.setAlpha(0.0f);
            this.x.setVisibility(4);
            this.s.setAlpha(0.0f);
            this.s.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.w = animatorSet2;
        if (z10) {
            this.x.setVisibility(0);
            this.s.setVisibility(0);
            AnimatorSet animatorSet3 = this.w;
            RadialProgressView radialProgressView = this.x;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<cg.i0, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.x;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<cg.i0, Float>) property2, 0.0f));
        }
        this.w.setDuration(180L);
        this.w.addListener(new p60(15, this, z10));
        this.w.start();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        th.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new e(this, i10));
        qg.c cVar = new qg.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        this.actionBar.L(new lg.a(cVar), pg.a.n(this.resourceProvider), false);
        this.actionBar.L0 = true;
        z3 z3Var = new z3(this, context);
        this.c = z3Var;
        z3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        this.y = new e9(this.D);
        m mVar = new m(context);
        this.r = mVar;
        mVar.a.e(this.D, this.y);
        this.v = this.r.a;
        String name = DialogObject.getName(this.D);
        this.e = name;
        c6 c6Var = this.resourceProvider;
        z51 z51Var = new z51(context);
        jh.m mVar2 = new jh.m(context, 5);
        z51Var.b = mVar2;
        mVar2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        mVar2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        mVar2.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6, c6Var));
        mVar2.setTextSize(1, 16.0f);
        mVar2.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        mVar2.setBackground(null);
        mVar2.setImeOptions(mVar2.getImeOptions() | TLObject.FLAG_28);
        mVar2.setInputType(mVar2.getInputType() | 16384);
        mVar2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        mVar2.setMinHeight(AndroidUtilities.dp(50.0f));
        z51Var.addView(mVar2, f6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.n = z51Var;
        mVar2.setText(name);
        ((jh.m) this.n.b).setSelection(name.length());
        ((jh.m) this.n.b).addTextChangedListener(new bh.c(this, 17));
        s0 s0Var = new s0(this, context);
        this.C = s0Var;
        s0Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        this.C.setText(LocaleController.getString(R.string.Save));
        this.C.setTypeface(AndroidUtilities.bold());
        this.C.setTextSize(1, 14.0f);
        this.C.setGravity(17);
        this.C.setVisibility(8);
        this.C.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.C.setOnClickListener(new mh.n(this, 16));
        h6.a(this.C);
        this.actionBar.addView(this.C, f6.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        cg.i0 i0Var = new cg.i0(this, context);
        this.s = i0Var;
        this.r.addView(i0Var, f6.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.x = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.x.setProgressColor(-1);
        this.x.setNoProgress(false);
        this.r.addView(this.x, f6.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        a0(false, false);
        u51 u51Var = new u51(this, new j(this, i10), new k(this), new k(this));
        this.d = u51Var;
        u51Var.setClipToPadding(false);
        u51 u51Var2 = this.d;
        u51Var2.U2.r = false;
        u51Var2.p1();
        this.actionBar.setBackground(null);
        this.c.addView(this.d, f6.c(-1.0f, -1));
        this.c.addView(this.actionBar, f6.e(-1, -2, 48));
        z3 z3Var2 = this.c;
        k kVar = new k(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(z3Var2, kVar);
        z3 z3Var3 = this.c;
        this.fragmentView = z3Var3;
        return z3Var3;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.b) {
                this.E = chatFull;
                this.d.U2.N(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void dismissCurrentDialog() {
        if (this.A.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.A.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ zt0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.r40
    public final String getInitialSearchString() {
        return ((jh.m) this.n.b).getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.A.i(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.b = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.b));
        this.D = chat;
        boolean z10 = chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers);
        this.f = z10;
        this.h = z10;
        this.E = getMessagesController().getChatFull(this.b);
        s40 s40Var = new s40(3, true, true);
        this.A = s40Var;
        s40Var.a = this;
        s40Var.b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        s40 s40Var = this.A;
        if (s40Var != null) {
            s40Var.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        this.A.j();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.A.k(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        this.A.l();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void restoreSelfArgs(Bundle bundle) {
        s40 s40Var = this.A;
        if (s40Var != null) {
            s40Var.f = bundle.getString("path");
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        s40 s40Var = this.A;
        if (s40Var != null && (str = s40Var.f) != null) {
            bundle.putString("path", str);
        }
        z51 z51Var = this.n;
        if (z51Var != null) {
            String obj = ((jh.m) z51Var.b).getText().toString();
            if (obj.isEmpty()) {
                return;
            }
            bundle.putString("nameTextView", obj);
        }
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ void P() {
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}
