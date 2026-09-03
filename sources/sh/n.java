package sh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import dg.v3;
import eg.s0;
import java.util.WeakHashMap;
import k7.b6;
import k7.d6;
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
import org.telegram.messenger.ed;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.w40;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ai;
import org.telegram.ui.qu0;
import org.telegram.ui.rr;
import org.telegram.ui.s61;
import org.telegram.ui.zn;
import ph.q9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class n extends p2 implements w40, NotificationCenter.NotificationCenterDelegate, xd.b {
    public x40 B;
    public TLRPC.FileLocation C;
    public s0 D;
    public TLRPC.Chat E;
    public TLRPC.ChatFull F;
    public final d2[] G;
    public final l H;
    public final xd.a a;
    public long b;
    public v3 c;
    public g61 d;
    public String e;
    public boolean f;
    public boolean h;
    public q9 n;
    public m r;
    public eg.i0 s;
    public p9 v;
    public AnimatorSet w;
    public RadialProgressView x;
    public z8 y;

    public n(Bundle bundle) {
        super(bundle);
        this.a = new xd.a(0, this, mr.h, 320L, false);
        this.G = new d2[1];
        this.H = new l(this);
    }

    public static boolean U(n nVar, i51 i51Var, View view) {
        long j10;
        boolean canRemoveBotFromCommunity;
        boolean z4;
        boolean z10;
        Object obj = i51Var.G;
        if (!(obj instanceof TLRPC.Chat)) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j10 = user.id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, nVar.E);
                z4 = isBot;
                z10 = false;
            }
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        j10 = -chat.id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, nVar.E);
        z10 = isChannelAndNotMegaGroup;
        z4 = false;
        boolean z11 = canRemoveBotFromCommunity;
        long j11 = j10;
        int b10 = o0.b(nVar.currentAccount, j11);
        boolean z12 = b10 == 1 || b10 == 2;
        if (z11 || z12) {
            p70 F = p70.F(nVar.c, null, view);
            F.l(R.drawable.msg_viewintopic, LocaleController.getString(z4 ? R.string.CommunityMenuViewBot : z10 ? R.string.CommunityMenuViewChannel : R.string.CommunityMenuViewGroup), new h(nVar, j11, 1), z12);
            F.m(z11, R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), true, new ed(nVar, z4, z10, j11, 2));
            F.W(nVar.d.U0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void V(n nVar, i51 i51Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = i51Var.d;
        if (i10 == 140) {
            if (nVar.B.h() || (chatPhoto = (chat = nVar.getMessagesController().getChat(Long.valueOf(nVar.b))).photo) == null || chatPhoto.photo_big == null) {
                return;
            }
            ImageLocation imageLocation = null;
            PhotoViewer.t1().K2(null, nVar, null);
            TLRPC.ChatPhoto chatPhoto2 = chat.photo;
            int i11 = chatPhoto2.dc_id;
            if (i11 != 0) {
                chatPhoto2.photo_big.dc_id = i11;
            }
            TLRPC.ChatFull chatFull = nVar.F;
            if (chatFull != null) {
                TLRPC.Photo photo = chatFull.chat_photo;
                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                    imageLocation = ImageLocation.getForPhoto(nVar.F.chat_photo.video_sizes.get(0), nVar.F.chat_photo);
                }
            }
            PhotoViewer.t1().e2(null, chat.photo.photo_big, null, imageLocation, null, null, null, 0, nVar.H, null, 0L, 0L, 0L, true, null, null);
            return;
        }
        if (i10 == 141) {
            nVar.B.o(nVar.C != null, new i(nVar, 0), new dg.e0(6), 0);
            return;
        }
        if (i10 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", nVar.b);
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            rr rrVar = new rr(bundle);
            rrVar.x0(nVar.F);
            nVar.presentFragment(rrVar);
            return;
        }
        if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", nVar.b);
            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            rr rrVar2 = new rr(bundle2);
            rrVar2.x0(nVar.F);
            nVar.presentFragment(rrVar2);
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
            z4.s(nVar, false, nVar.E, null, false, true, true, false, new k(nVar));
            return;
        }
        if (i10 == 146) {
            o0.e(nVar.G, nVar, nVar.currentAccount, nVar.E);
            return;
        }
        Object obj = i51Var.G;
        if (obj instanceof TLRPC.Chat) {
            nVar.presentFragment(zn.R9(-((TLRPC.Chat) obj).id));
        } else if (obj instanceof TLRPC.User) {
            nVar.presentFragment(zn.R9(((TLRPC.User) obj).id));
        }
    }

    public static /* synthetic */ void W(n nVar) {
        nVar.C = null;
        MessagesController.getInstance(nVar.currentAccount).changeChatAvatar(nVar.b, null, null, null, null, 0.0d, null, null, null, null);
        nVar.a0(false, true);
        nVar.v.h(null, null, nVar.y, nVar.E);
    }

    @Override // org.telegram.ui.Components.w40
    public final void D(float f10) {
        RadialProgressView radialProgressView = this.x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.w40
    public final void K(boolean z4, boolean z10) {
        RadialProgressView radialProgressView = this.x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        this.D.setAlpha(f10);
        this.D.setScaleX(AndroidUtilities.lerp(0.75f, 1.0f, f10));
        this.D.setScaleY(AndroidUtilities.lerp(0.75f, 1.0f, f10));
        this.D.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.w40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ed(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    public final void Y() {
        this.a.a((this.f == this.h && TextUtils.equals(((lh.n) this.n.b).getText().toString(), this.e)) ? false : true, true);
    }

    public final void Z(boolean z4) {
        if (this.h == z4) {
            return;
        }
        h6 h6Var = (h6) this.d.x1(151);
        if (h6Var != null) {
            h6Var.a(!z4);
        }
        h6 h6Var2 = (h6) this.d.x1(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
        if (h6Var2 != null) {
            h6Var2.a(z4);
        }
        this.h = z4;
        Y();
    }

    public final void a0(boolean z4, boolean z10) {
        if (this.x == null) {
            return;
        }
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w = null;
        }
        if (!z10) {
            if (z4) {
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
        if (z4) {
            this.x.setVisibility(0);
            this.s.setVisibility(0);
            AnimatorSet animatorSet3 = this.w;
            RadialProgressView radialProgressView = this.x;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<eg.i0, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.x;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<eg.i0, Float>) property2, 0.0f));
        }
        this.w.setDuration(180L);
        this.w.addListener(new s61(15, this, z4));
        this.w.start();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        ai.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new e(this, i10));
        sg.c cVar = new sg.c();
        cVar.a(getThemedColor(j6.d6));
        this.actionBar.M(new ng.a(cVar), rg.b.o(this.resourceProvider), false);
        this.actionBar.M0 = true;
        v3 v3Var = new v3(this, context);
        this.c = v3Var;
        v3Var.setBackgroundColor(j6.w0(null, j6.a7, false));
        this.y = new z8(this.E);
        m mVar = new m(context);
        this.r = mVar;
        mVar.a.e(this.E, this.y);
        this.v = this.r.a;
        String name = DialogObject.getName(this.E);
        this.e = name;
        f6 f6Var = this.resourceProvider;
        q9 q9Var = new q9(context);
        lh.n nVar = new lh.n(context, 5);
        q9Var.b = nVar;
        nVar.setTextColor(j6.v0(j6.G6, f6Var));
        nVar.setLinkTextColor(j6.v0(j6.gc, f6Var));
        nVar.setHintTextColor(j6.v0(j6.H6, f6Var));
        nVar.setTextSize(1, 16.0f);
        nVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        nVar.setBackground(null);
        nVar.setImeOptions(nVar.getImeOptions() | TLObject.FLAG_28);
        nVar.setInputType(nVar.getInputType() | 16384);
        nVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        nVar.setMinHeight(AndroidUtilities.dp(50.0f));
        q9Var.addView(nVar, b6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.n = q9Var;
        nVar.setText(name);
        ((lh.n) this.n.b).setSelection(name.length());
        ((lh.n) this.n.b).addTextChangedListener(new dh.c(this, 17));
        s0 s0Var = new s0(this, context);
        this.D = s0Var;
        s0Var.setTextColor(getThemedColor(j6.Sh));
        this.D.setText(LocaleController.getString(R.string.Save));
        this.D.setTypeface(AndroidUtilities.bold());
        this.D.setTextSize(1, 14.0f);
        this.D.setGravity(17);
        this.D.setVisibility(8);
        this.D.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.D.setOnClickListener(new oh.n(this, 16));
        d6.a(this.D);
        this.actionBar.addView(this.D, b6.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        eg.i0 i0Var = new eg.i0(this, context);
        this.s = i0Var;
        this.r.addView(i0Var, b6.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.x = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.x.setProgressColor(-1);
        this.x.setNoProgress(false);
        this.r.addView(this.x, b6.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        a0(false, false);
        g61 g61Var = new g61(this, new j(this, i10), new k(this), new k(this));
        this.d = g61Var;
        g61Var.setClipToPadding(false);
        g61 g61Var2 = this.d;
        g61Var2.V2.r = false;
        g61Var2.o1();
        this.actionBar.setBackground(null);
        this.c.addView(this.d, b6.c(-1.0f, -1));
        this.c.addView(this.actionBar, b6.e(-1, -2, 48));
        v3 v3Var2 = this.c;
        k kVar = new k(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(v3Var2, kVar);
        v3 v3Var3 = this.c;
        this.fragmentView = v3Var3;
        return v3Var3;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.b) {
                this.F = chatFull;
                this.d.V2.N(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void dismissCurrentDialog() {
        if (this.B.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.B.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ qu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.w40
    public final String getInitialSearchString() {
        return ((lh.n) this.n.b).getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.B.i(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.b = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.b));
        this.E = chat;
        boolean z4 = chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers);
        this.f = z4;
        this.h = z4;
        this.F = getMessagesController().getChatFull(this.b);
        x40 x40Var = new x40(3, true, true);
        this.B = x40Var;
        x40Var.a = this;
        x40Var.b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        x40 x40Var = this.B;
        if (x40Var != null) {
            x40Var.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        this.B.j();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.B.k(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        this.B.l();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void restoreSelfArgs(Bundle bundle) {
        x40 x40Var = this.B;
        if (x40Var != null) {
            x40Var.f = bundle.getString("path");
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        x40 x40Var = this.B;
        if (x40Var != null && (str = x40Var.f) != null) {
            bundle.putString("path", str);
        }
        q9 q9Var = this.n;
        if (q9Var != null) {
            String obj = ((lh.n) q9Var.b).getText().toString();
            if (obj.isEmpty()) {
                return;
            }
            bundle.putString("nameTextView", obj);
        }
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ void P() {
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
