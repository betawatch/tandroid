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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class t60 extends bd {
    public float A0;
    public boolean B0;
    public uc z0;

    public t60(long j3) {
        super(j3);
        this.d = true;
    }

    public static void e1(t60 t60Var, int i10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost == null || t60Var.getParentActivity() == null) {
            t60Var.B0 = false;
            return;
        }
        s60 s60Var = new s60(t60Var, t60Var, t60Var.getParentActivity(), i10, t60Var.currentAccount, t60Var.resourceProvider);
        s60Var.G1(canApplyBoost);
        s60Var.F1(t60Var.c, true);
        s60Var.H1(t60Var.a);
        s60Var.show();
    }

    @Override // org.telegram.ui.bd
    public final int A0() {
        return R.string.GroupEmojiPackInfo;
    }

    @Override // org.telegram.ui.bd
    public final int B0() {
        return R.string.GroupEmojiPack;
    }

    @Override // org.telegram.ui.bd
    public final int E0() {
        return R.string.GroupEmojiStatusInfo;
    }

    @Override // org.telegram.ui.bd
    public final int F0() {
        return getMessagesController().groupEmojiStatusLevelMin;
    }

    @Override // org.telegram.ui.bd
    public final int G0() {
        return R.string.GroupEmojiStatus;
    }

    @Override // org.telegram.ui.bd
    public final int H0() {
        return getMessagesController().groupEmojiStickersLevelMin;
    }

    @Override // org.telegram.ui.bd
    public final int I0() {
        return 4;
    }

    @Override // org.telegram.ui.bd
    public final int J0() {
        return getMessagesController().groupProfileBgIconLevelMin;
    }

    @Override // org.telegram.ui.bd
    public final int K0() {
        return R.string.GroupProfileInfo;
    }

    @Override // org.telegram.ui.bd
    public final int L0() {
        return R.string.GroupStickerPackInfo;
    }

    @Override // org.telegram.ui.bd
    public final int M0() {
        return R.string.GroupStickerPack;
    }

    @Override // org.telegram.ui.bd
    public final int N0() {
        return R.string.GroupWallpaper2Info;
    }

    @Override // org.telegram.ui.bd
    public final int O0() {
        return getMessagesController().groupWallpaperLevelMin;
    }

    @Override // org.telegram.ui.bd
    public final int P0() {
        return R.string.GroupWallpaper;
    }

    @Override // org.telegram.ui.bd
    public final boolean R0() {
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.a)));
    }

    @Override // org.telegram.ui.bd
    public final void T0(int i10) {
        if (this.c == null || this.B0) {
            return;
        }
        this.B0 = true;
        MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.a, this.c, new di.m4(this, i10, 2));
    }

    @Override // org.telegram.ui.bd
    public final void X0(boolean z10) {
        super.X0(z10);
        uc ucVar = this.z0;
        if (ucVar != null) {
            TextView textView = ucVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.c;
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, new Object[0])));
        }
    }

    @Override // org.telegram.ui.bd
    public final void Z0(boolean z10) {
        super.Z0(z10);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, this.resourceProvider)), org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7), 0, 0);
        oqVar.w = true;
        this.O.setBackground(oqVar);
        uc ucVar = this.z0;
        if (ucVar == null || z10) {
            return;
        }
        ucVar.a.b(this.currentAccount, this.s, false);
        this.z0.b.b(this.s, false);
        this.z0.d();
    }

    @Override // org.telegram.ui.bd
    public final void c1() {
        oc ocVar;
        oc ocVar2;
        this.Z = 0;
        int i10 = 1 + 1;
        this.a0 = 1;
        this.b0 = i10;
        int i11 = i10 + 2;
        this.R = i11;
        this.c0 = i10 + 1;
        if (this.w != 0 || this.s >= 0) {
            boolean z10 = this.e0 >= 0;
            this.R = i10 + 3;
            this.e0 = i11;
            if (!z10 && (ocVar = this.N) != null) {
                ocVar.o(i11);
                this.N.m(this.c0);
                this.M.u0(0);
            }
        } else {
            int i12 = this.e0;
            this.e0 = -1;
            if (i12 >= 0 && (ocVar2 = this.N) != null) {
                ocVar2.u(i12);
                this.N.m(this.c0);
            }
        }
        int i13 = this.R;
        this.d0 = i13;
        this.h0 = i13 + 1;
        this.i0 = i13 + 2;
        this.f0 = i13 + 3;
        this.R = i13 + 5;
        this.g0 = i13 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.a);
        if (chatFull == null || !chatFull.can_set_stickers) {
            this.j0 = -1;
            this.k0 = -1;
        } else {
            int i14 = this.R;
            this.j0 = i14;
            this.R = i14 + 2;
            this.k0 = i14 + 1;
        }
        int i15 = this.R;
        this.S = i15;
        this.W = i15 + 1;
        this.X = i15 + 2;
        this.R = i15 + 4;
        this.Y = i15 + 3;
    }

    @Override // org.telegram.ui.bd, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        View createView = super.createView(context);
        Z0(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new q60(this, (FrameLayout) createView));
        return createView;
    }

    @Override // org.telegram.ui.bd, org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).id == (-this.a)) {
            b1();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        uc ucVar = this.z0;
        if (ucVar != null) {
            ucVar.a();
        }
    }

    @Override // org.telegram.ui.bd, org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.bd, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override // org.telegram.ui.bd
    public final void x0() {
        r60 r60Var = new r60(this, getParentActivity(), this.resourceProvider, 0);
        this.M = r60Var;
        r60Var.setOnScrollListener(new i3(this, 12));
        this.M.setSections(true);
    }

    @Override // org.telegram.ui.bd
    public final int z0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }
}
