package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rr0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sk skVar;
        org.telegram.messenger.r8 r8Var;
        int i10 = this.a;
        int i11 = 16;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                n41.U(photoViewer.E, photoViewer.m4, false, (bi.b) obj, null);
                break;
            case 1:
                PhotoViewer photoViewer2 = (PhotoViewer) obj2;
                mt0 mt0Var = (mt0) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (mt0Var.getWindow() != null) {
                    mt0Var.setFocusable(true);
                    fo foVar = photoViewer2.l4;
                    if (foVar != null && (skVar = foVar.Y) != null) {
                        skVar.k0(false);
                        break;
                    }
                }
                break;
            case 2:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                ((bi.i) obj2).run((Bitmap) obj);
                break;
            case 3:
                PhotoViewer photoViewer3 = (PhotoViewer) obj2;
                rg.y0 y0Var = (rg.y0) obj;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                y0Var.e.h();
                y0Var.c.postRunnable(new b31(i11));
                photoViewer3.e0.removeView(photoViewer3.N1);
                break;
            case 4:
                org.telegram.ui.Components.f6 f6Var = (org.telegram.ui.Components.f6) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                if (f6Var != null) {
                    ArrayList arrayList = f6Var.h;
                    org.telegram.ui.Components.c6 c6Var = f6Var.n;
                    if (c6Var != null) {
                        arrayList.add(c6Var);
                    }
                    org.telegram.ui.Components.c6 c6Var2 = f6Var.r;
                    if (c6Var2 != null) {
                        arrayList.add(c6Var2);
                    }
                    org.telegram.ui.Components.c6 c6Var3 = f6Var.s;
                    if (c6Var3 != null) {
                        arrayList.add(c6Var3);
                    }
                    f6Var.n = new org.telegram.ui.Components.c6(bitmap);
                    f6Var.r = null;
                    f6Var.s = null;
                    f6Var.t();
                    break;
                }
                break;
            case 5:
                ms0 ms0Var = (ms0) obj2;
                ms0Var.getClass();
                ((View) obj).setOutlineProvider(null);
                PhotoViewer photoViewer4 = ms0Var.c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                av0 av0Var = photoViewer4.E2;
                if (av0Var != null) {
                    av0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 6:
                xt0 xt0Var = (xt0) obj2;
                org.telegram.ui.Components.i81 i81Var = (org.telegram.ui.Components.i81) obj;
                xt0Var.getClass();
                if (i81Var.p() > 0 && i81Var.n() >= i81Var.p() - 590) {
                    xt0Var.a.e0.invalidate();
                    break;
                }
                break;
            case 7:
                bu0 bu0Var = (bu0) obj2;
                rg.y0 y0Var2 = (rg.y0) obj;
                y0Var2.e.h();
                y0Var2.c.postRunnable(new b31(i11));
                try {
                    bu0Var.b.e0.removeView(y0Var2);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 8:
                ah.v vVar = (ah.v) obj;
                PhotoViewer photoViewer5 = ((gt0) obj2).b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) vVar.b).setImageBitmap(photoViewer5.C3);
                    break;
                }
                break;
            case 9:
                ((lu0) obj2).r.l7.lock();
                ((AnimatorSet) obj).start();
                break;
            case 10:
                jv0 jv0Var = (jv0) obj;
                ((lu0) obj2).r.s4 = false;
                if (!jv0Var.s) {
                    jv0Var.a.setVisible(false, true);
                    break;
                }
                break;
            case 11:
                rw0 rw0Var = (rw0) obj2;
                rw0Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                rw0Var.c(true);
                break;
            case 12:
                rw0 rw0Var2 = (rw0) obj2;
                rw0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) obj).text, false));
                rw0Var2.c(true);
                break;
            case 13:
                rw0 rw0Var3 = (rw0) obj2;
                SendMessagesHelper.getInstance(rw0Var3.H.currentAccount).deletePollOption(rw0Var3.H, (byte[]) obj);
                rw0Var3.c(true);
                break;
            case 14:
                PrivacyControlActivity.W((PrivacyControlActivity) obj2, (TLObject) obj);
                break;
            case 15:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    break;
                }
                break;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.d = (TL_account.Password) obj;
                privacySettingsActivity.y0();
                break;
            case 17:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) obj2;
                boolean z10 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z10;
                ((org.telegram.ui.Cells.w8) obj).setChecked(z10);
                break;
            case 18:
                ((my0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                break;
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i12 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i12);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) ((Object[]) obj)[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity.presentFragment(new fo(bundle), true);
                break;
            case 20:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j10 = profileActivity2.A2;
                if (j10 == 0) {
                    NotificationCenter notificationCenter2 = profileActivity2.getNotificationCenter();
                    int i13 = NotificationCenter.closeChats;
                    notificationCenter2.removeObserver(profileActivity2, i13);
                    if (AndroidUtilities.isTablet()) {
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i13, Long.valueOf(-profileActivity2.f1));
                    } else {
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i13, new Object[0]);
                    }
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                    profileActivity2.J1 = 0;
                    profileActivity2.finishFragment();
                    break;
                } else {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j10));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f1, user);
                    if (profileActivity2.E2 != null && user != null && org.telegram.ui.Components.zc.a(profileActivity2)) {
                        org.telegram.ui.Components.zc.D(profileActivity2, user, profileActivity2.E2.title).j();
                    }
                    if (profileActivity2.u2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.e5(true, false);
                        break;
                    }
                }
                break;
            case 21:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                break;
            case 22:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.sc.e();
                pf.d.r(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                break;
            case 23:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.E2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.f1);
                ((CountDownLatch) obj).countDown();
                break;
            case 24:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                profileActivity5.G2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                break;
            case 25:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.r8) ((View) obj)).setChecked(profileActivity6.s2.g());
                break;
            case 26:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (r8Var = profileActivity7.x5) != null) {
                    r8Var.run();
                }
                profileActivity7.x5 = null;
                break;
            case 27:
                pz0 pz0Var = (pz0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity8 = pz0Var.b1.c;
                org.telegram.ui.Components.zc.x(profileActivity8.getParentActivity(), profileActivity8.m5, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, pz0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Fi), pz0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Hi)).j();
                break;
            case 28:
                e01 e01Var = (e01) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity9 = e01Var.b1;
                org.telegram.ui.Components.zc.x(profileActivity9.getParentActivity(), profileActivity9.m5, hVar2.m(), hVar2.m() == 1 ? ((TLRPC.Dialog) hVar2.n(0)).id : 0L, e01Var.getThemedColor(org.telegram.ui.ActionBar.g6.Fi), e01Var.getThemedColor(org.telegram.ui.ActionBar.g6.Hi)).j();
                break;
            default:
                ((e11) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                break;
        }
    }

    public /* synthetic */ rr0(org.telegram.ui.Components.ir0 ir0Var, a0.h hVar, int i10, int i11) {
        this.a = i11;
        this.b = ir0Var;
        this.c = hVar;
    }
}
