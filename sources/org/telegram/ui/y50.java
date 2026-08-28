package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y50 extends xc {
    public pc v0;
    public float w0;
    public boolean x0;

    public y50(long j10) {
        super(j10);
        this.d = true;
    }

    public static void e1(y50 y50Var, int i9, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost == null || y50Var.getParentActivity() == null) {
            y50Var.x0 = false;
            return;
        }
        x50 x50Var = new x50(y50Var, y50Var, y50Var.getParentActivity(), i9, y50Var.currentAccount, y50Var.resourceProvider);
        x50Var.G1(canApplyBoost);
        x50Var.F1(y50Var.c, true);
        x50Var.H1(y50Var.a);
        x50Var.show();
    }

    @Override // org.telegram.ui.xc
    public final int A0() {
        return R.string.GroupEmojiPack;
    }

    @Override // org.telegram.ui.xc
    public final int D0() {
        return R.string.GroupEmojiStatusInfo;
    }

    @Override // org.telegram.ui.xc
    public final int E0() {
        return getMessagesController().groupEmojiStatusLevelMin;
    }

    @Override // org.telegram.ui.xc
    public final int F0() {
        return R.string.GroupEmojiStatus;
    }

    @Override // org.telegram.ui.xc
    public final int G0() {
        return getMessagesController().groupEmojiStickersLevelMin;
    }

    @Override // org.telegram.ui.xc
    public final int H0() {
        return 4;
    }

    @Override // org.telegram.ui.xc
    public final int I0() {
        return getMessagesController().groupProfileBgIconLevelMin;
    }

    @Override // org.telegram.ui.xc
    public final int K0() {
        return R.string.GroupProfileInfo;
    }

    @Override // org.telegram.ui.xc
    public final int L0() {
        return R.string.GroupStickerPackInfo;
    }

    @Override // org.telegram.ui.xc
    public final int M0() {
        return R.string.GroupStickerPack;
    }

    @Override // org.telegram.ui.xc
    public final int N0() {
        return R.string.GroupWallpaper2Info;
    }

    @Override // org.telegram.ui.xc
    public final int O0() {
        return getMessagesController().groupWallpaperLevelMin;
    }

    @Override // org.telegram.ui.xc
    public final int P0() {
        return R.string.GroupWallpaper;
    }

    @Override // org.telegram.ui.xc
    public final boolean R0() {
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.a)));
    }

    @Override // org.telegram.ui.xc
    public final void T0(int i9) {
        if (this.c == null || this.x0) {
            return;
        }
        this.x0 = true;
        MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.a, this.c, new kh.e4(this, i9, 1));
    }

    @Override // org.telegram.ui.xc
    public final void X0(boolean z10) {
        super.X0(z10);
        pc pcVar = this.v0;
        if (pcVar != null) {
            TextView textView = pcVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.c;
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, new Object[0])));
        }
    }

    @Override // org.telegram.ui.xc
    public final void Z0(boolean z10) {
        super.Z0(z10);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, this.resourceProvider)), org.telegram.ui.ActionBar.f6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7), 0, 0);
        fqVar.w = true;
        this.K.setBackground(fqVar);
        pc pcVar = this.v0;
        if (pcVar == null || z10) {
            return;
        }
        pcVar.a.b(this.currentAccount, this.s, false);
        this.v0.b.b(this.s, false);
        this.v0.d();
    }

    @Override // org.telegram.ui.xc
    public final void c1() {
        ic icVar;
        ic icVar2;
        this.V = 0;
        int i9 = 1 + 1;
        this.W = 1;
        this.X = i9;
        int i10 = i9 + 2;
        this.N = i10;
        this.Y = i9 + 1;
        if (this.w != 0 || this.s >= 0) {
            boolean z10 = this.a0 >= 0;
            this.N = i9 + 3;
            this.a0 = i10;
            if (!z10 && (icVar = this.J) != null) {
                icVar.o(i10);
                this.J.m(this.Y);
                this.I.u0(0);
            }
        } else {
            int i11 = this.a0;
            this.a0 = -1;
            if (i11 >= 0 && (icVar2 = this.J) != null) {
                icVar2.u(i11);
                this.J.m(this.Y);
            }
        }
        int i12 = this.N;
        this.Z = i12;
        this.d0 = i12 + 1;
        this.e0 = i12 + 2;
        this.b0 = i12 + 3;
        this.N = i12 + 5;
        this.c0 = i12 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.a);
        if (chatFull == null || !chatFull.can_set_stickers) {
            this.f0 = -1;
            this.g0 = -1;
        } else {
            int i13 = this.N;
            this.f0 = i13;
            this.N = i13 + 2;
            this.g0 = i13 + 1;
        }
        int i14 = this.N;
        this.O = i14;
        this.S = i14 + 1;
        this.T = i14 + 2;
        this.N = i14 + 4;
        this.U = i14 + 3;
    }

    @Override // org.telegram.ui.xc, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        View createView = super.createView(context);
        Z0(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new v50(this, (FrameLayout) createView));
        return createView;
    }

    @Override // org.telegram.ui.xc, org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        super.didReceivedNotification(i9, i10, objArr);
        if (i9 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).id == (-this.a)) {
            b1();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        pc pcVar = this.v0;
        if (pcVar != null) {
            pcVar.a();
        }
    }

    @Override // org.telegram.ui.xc, org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.xc, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override // org.telegram.ui.xc
    public final void w0() {
        w50 w50Var = new w50(this, getParentActivity(), this.resourceProvider, 0);
        this.I = w50Var;
        w50Var.setOnScrollListener(new l3(this, 12));
        this.I.setSections(true);
    }

    @Override // org.telegram.ui.xc
    public final int y0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }

    @Override // org.telegram.ui.xc
    public final int z0() {
        return R.string.GroupEmojiPackInfo;
    }
}
