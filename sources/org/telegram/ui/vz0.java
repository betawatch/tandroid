package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vz0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ProfileActivity b;

    public vz0(ProfileActivity profileActivity, Context context) {
        this.b = profileActivity;
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:244:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x07bd  */
    @Override // org.telegram.ui.ActionBar.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i10) {
        long j10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        TLRPC.User user;
        int i16;
        int i17;
        int i18;
        TL_bots.BotInfo botInfo;
        int i19;
        int i20;
        org.telegram.ui.Components.ns0 ns0Var;
        if (this.b.getParentActivity() == null) {
            return;
        }
        if (i10 == -1) {
            ProfileActivity profileActivity = this.b;
            zz0 zz0Var = profileActivity.L;
            if (zz0Var == null || (ns0Var = zz0Var.F0) == null || !ns0Var.k0) {
                profileActivity.finishFragment();
                return;
            } else {
                profileActivity.R4();
                return;
            }
        }
        final int i21 = 2;
        boolean z4 = false;
        if (i10 == 2) {
            this.b.n4(false);
            return;
        }
        final int i22 = 1;
        if (i10 == 1) {
            TLRPC.User user2 = this.b.getMessagesController().getUser(Long.valueOf(this.b.b1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user2.id);
            bundle.putBoolean("addContact", true);
            ProfileActivity profileActivity2 = this.b;
            os osVar = new os(bundle, profileActivity2.w0);
            osVar.L = new xx0(profileActivity2, user2);
            profileActivity2.presentFragment(osVar);
            return;
        }
        if (i10 == 3) {
            Bundle e6 = org.telegram.messenger.y3.e(3, "onlySelect", "dialogsType", true);
            e6.putString("selectAlertString", LocaleController.getString(R.string.SendContactToText));
            e6.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
            py pyVar = new py(e6);
            ProfileActivity profileActivity3 = this.b;
            pyVar.z2 = profileActivity3;
            profileActivity3.presentFragment(pyVar);
            return;
        }
        if (i10 == 4) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", this.b.b1);
            ProfileActivity profileActivity4 = this.b;
            profileActivity4.presentFragment(new os(bundle2, profileActivity4.w0));
            return;
        }
        int i23 = 14;
        if (i10 == 5) {
            TLRPC.User user3 = this.b.getMessagesController().getUser(Long.valueOf(this.b.b1));
            if (user3 == null || this.b.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b.getParentActivity(), 0, this.b.w0);
            alertDialog$Builder.a.O = LocaleController.getString(R.string.DeleteContact);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.AreYouSureDeleteContact);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new vl0(i23, this, user3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            this.b.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.q7, this.b.w0));
                return;
            }
            return;
        }
        if (i10 == 7) {
            this.b.i4(false);
            return;
        }
        if (i10 == 45) {
            this.b.i4(true);
            return;
        }
        final int i24 = 0;
        if (i10 == 46) {
            if (!this.b.getUserConfig().isPremium()) {
                ProfileActivity profileActivity5 = this.b;
                Activity parentActivity = profileActivity5.getParentActivity();
                i20 = ((org.telegram.ui.ActionBar.p2) this.b).currentAccount;
                new fg.n1(profileActivity5, parentActivity, i20, false, 41, false, null).show();
                return;
            }
            Context context = this.a;
            org.telegram.ui.ActionBar.g6 g6Var = this.b.w0;
            sz0 sz0Var = new sz0(this, 0);
            Pattern pattern = org.telegram.ui.Components.z4.a;
            if (context == null) {
                return;
            }
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(context, null, false, false);
            Runnable runnable = o10.dismissRunnable;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(context);
            linearLayout.addView(kj0Var, k7.c6.t(110, 110, 17, 0, 21, 0, 11));
            kj0Var.f(R.raw.raised_hand, 110, 110, null);
            kj0Var.setAutoRepeat(false);
            kj0Var.d();
            TextView textView2 = new TextView(context);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setGravity(17);
            textView2.setText(LocaleController.getString(R.string.DisableSharingInfoHeader));
            textView2.setTextSize(1, 20.0f);
            int i25 = org.telegram.ui.ActionBar.k6.G6;
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i25, g6Var));
            linearLayout.addView(textView2, k7.c6.t(-1, -2, 17, 20, 0, 20, 14));
            gw0 gw0Var = new gw0(context, g6Var);
            gw0Var.a.l(LocaleController.getString(R.string.DisableSharingInfoHeader1), false);
            gw0Var.b.setText(LocaleController.getString(R.string.DisableSharingInfoText1));
            gw0Var.d.setVisibility(8);
            gw0Var.c.setImageResource(R.drawable.menu_photo_off_24);
            gw0Var.c.setColorFilter(org.telegram.ui.ActionBar.k6.v0(i25, g6Var));
            linearLayout.addView(gw0Var, k7.c6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            gw0 gw0Var2 = new gw0(context, g6Var);
            gw0Var2.a.l(LocaleController.getString(R.string.DisableSharingInfoHeader2), false);
            gw0Var2.b.setText(LocaleController.getString(R.string.DisableSharingInfoText2));
            gw0Var2.d.setVisibility(8);
            gw0Var2.c.setImageResource(R.drawable.menu_share_off_24);
            gw0Var2.c.setColorFilter(org.telegram.ui.ActionBar.k6.v0(i25, g6Var));
            linearLayout.addView(gw0Var2, k7.c6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            gw0 gw0Var3 = new gw0(context, g6Var);
            gw0Var3.a.l(LocaleController.getString(R.string.DisableSharingInfoHeader3), false);
            gw0Var3.b.setText(LocaleController.getString(R.string.DisableSharingInfoText3));
            gw0Var3.d.setVisibility(8);
            gw0Var3.c.setImageResource(R.drawable.menu_download_off_24);
            gw0Var3.c.setColorFilter(org.telegram.ui.ActionBar.k6.v0(i25, g6Var));
            linearLayout.addView(gw0Var3, k7.c6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            qh.d dVar = new qh.d(context, g6Var, true);
            dVar.setOnClickListener(new org.telegram.ui.Components.w2(i24, zArr, runnable));
            dVar.e();
            dVar.g(LocaleController.getString(R.string.DisableSharingInfoButton), false, true);
            linearLayout.addView(dVar, k7.c6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            o10.customView = linearLayout;
            o10.show();
            o10.setOnDismissListener(new mp(7, zArr, sz0Var));
            return;
        }
        if (i10 == 47) {
            ProfileActivity profileActivity6 = this.b;
            profileActivity6.getMessagesController().toggleChatNoForwards(profileActivity6.b1, 0, false, new ry0(z4, profileActivity6, i24));
            return;
        }
        int i26 = 6;
        if (i10 == 23) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.b.getParentActivity());
            alertDialog$Builder2.a.O = LocaleController.getPluralString("DeleteTopics", 1);
            i19 = ((org.telegram.ui.ActionBar.p2) this.b).currentAccount;
            TopicsController topicsController = MessagesController.getInstance(i19).getTopicsController();
            ProfileActivity profileActivity7 = this.b;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(profileActivity7.c1, profileActivity7.d1);
            alertDialog$Builder2.a.Q = LocaleController.formatString("DeleteSelectedTopic", R.string.DeleteSelectedTopic, findTopic == null ? "topic" : findTopic.title);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.tz0
                public final /* synthetic */ vz0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0270 */
                @Override // org.telegram.ui.ActionBar.c2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i27) {
                    org.telegram.ui.ActionBar.f5 f5Var;
                    org.telegram.ui.ActionBar.f5 f5Var2;
                    org.telegram.ui.ActionBar.f5 f5Var3;
                    org.telegram.ui.ActionBar.f5 f5Var4;
                    int i28;
                    int i29;
                    boolean z10;
                    MessagesController.DialogPhotos dialogPhotos;
                    TLRPC.Photo photo;
                    int i30 = i24;
                    vz0 vz0Var = this.b;
                    switch (i30) {
                        case 0:
                            ArrayList<Integer> arrayList = new ArrayList<>();
                            ProfileActivity profileActivity8 = vz0Var.b;
                            arrayList.add(Integer.valueOf((int) profileActivity8.d1));
                            profileActivity8.getMessagesController().getTopicsController().deleteTopics(profileActivity8.c1, arrayList);
                            profileActivity8.G1 = 0;
                            f5Var = ((org.telegram.ui.ActionBar.p2) profileActivity8).parentLayout;
                            if (f5Var != null) {
                                f5Var2 = ((org.telegram.ui.ActionBar.p2) profileActivity8).parentLayout;
                                if (f5Var2.getFragmentStack() != null) {
                                    for (int i31 = 0; i31 < f5Var3.getFragmentStack().size(); i31++) {
                                        f5Var4 = ((org.telegram.ui.ActionBar.p2) profileActivity8).parentLayout;
                                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) f5Var4.getFragmentStack().get(i31);
                                        if ((p2Var instanceof xn) && ((xn) p2Var).b() == profileActivity8.d1) {
                                            p2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity8.finishFragment();
                            Activity parentActivity2 = profileActivity8.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(parentActivity2), profileActivity8.w0).Q(R.raw.ic_delete, 36, LocaleController.getPluralString("TopicsDeleted", 1)).j();
                            }
                            d2Var2.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity9 = vz0Var.b;
                            i28 = ((org.telegram.ui.ActionBar.p2) profileActivity9).currentAccount;
                            if (MessagesController.getInstance(i28).isFrozen()) {
                                i29 = ((org.telegram.ui.ActionBar.p2) profileActivity9).currentAccount;
                                c.b(i29);
                                break;
                            } else {
                                profileActivity9.g1 = true;
                                profileActivity9.getSecretChatHelper().startSecretChat(profileActivity9.getParentActivity(), profileActivity9.getMessagesController().getUser(Long.valueOf(profileActivity9.b1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity10 = vz0Var.b;
                            int realPosition = profileActivity10.k0.getRealPosition();
                            TLRPC.Photo F = profileActivity10.k0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity10.s2;
                            if (profileActivity10.F2 == null || realPosition != 0) {
                                if (profileActivity10.m5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity10.getMessagesStorage().updateUserInfo(userFull, true);
                                    profileActivity10.i5(false);
                                }
                                if (profileActivity10.k0.getRealCount() == 1) {
                                    ProfileActivity.s3(profileActivity10, true);
                                }
                                if (F == null || profileActivity10.k0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity10.k0.F(1);
                                    if (F2 != null) {
                                        profileActivity10.getUserConfig().getCurrentUser().photo = new TLRPC.TL_userProfilePhoto();
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(F2.sizes, 90);
                                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(F2.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                        if (closestPhotoSizeWithSize != null && closestPhotoSizeWithSize2 != null) {
                                            profileActivity10.getUserConfig().getCurrentUser().photo.photo_small = closestPhotoSizeWithSize.location;
                                            profileActivity10.getUserConfig().getCurrentUser().photo.photo_big = closestPhotoSizeWithSize2.location;
                                        }
                                    } else {
                                        profileActivity10.getUserConfig().getCurrentUser().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                    }
                                    profileActivity10.getMessagesController().deleteUserPhoto(null);
                                } else {
                                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                    tL_inputPhoto.id = F.id;
                                    tL_inputPhoto.access_hash = F.access_hash;
                                    byte[] bArr = F.file_reference;
                                    tL_inputPhoto.file_reference = bArr;
                                    if (bArr == null) {
                                        tL_inputPhoto.file_reference = new byte[0];
                                    }
                                    profileActivity10.getMessagesController().deleteUserPhoto(tL_inputPhoto);
                                    profileActivity10.getMessagesStorage().clearUserPhoto(profileActivity10.b1, F.id);
                                }
                                dz0 dz0Var = profileActivity10.k0;
                                ArrayList arrayList2 = dz0Var.U0;
                                ArrayList arrayList3 = dz0Var.S0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    z10 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (dialogPhotos = dz0Var.P0) == null) {
                                        arrayList3.remove(realPosition);
                                        dz0Var.R0.remove(realPosition);
                                        dz0Var.Q0.remove(realPosition);
                                        dz0Var.T0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        dz0Var.V0.remove(realPosition);
                                        dz0Var.W0.remove(realPosition);
                                        dz0Var.X0.remove(realPosition);
                                        dz0Var.a1.delete(realPosition);
                                        dz0Var.Y0.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            dz0Var.M0 = (ImageLocation) arrayList2.get(0);
                                            dz0Var.N0 = null;
                                            dz0Var.O0 = null;
                                        }
                                        dz0Var.A0.g();
                                        z10 = arrayList3.isEmpty();
                                    } else {
                                        dialogPhotos.removePhoto(photo2.id);
                                        z10 = true;
                                    }
                                }
                                if (z10 || profileActivity10.k0.getRealCount() <= 0) {
                                    profileActivity10.k0.setVisibility(8);
                                    profileActivity10.b0.setForegroundAlpha(1.0f);
                                    profileActivity10.V.setVisibility(0);
                                    profileActivity10.E0 = true;
                                    View m9 = profileActivity10.c.m(0);
                                    if (m9 != null) {
                                        profileActivity10.a.v0(0, m9.getTop() - profileActivity10.T3(), org.telegram.ui.Components.pr.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity10.n0.c();
                                if (profileActivity10.P5 != 0) {
                                    profileActivity10.getConnectionsManager().cancelRequest(profileActivity10.P5, true);
                                }
                                profileActivity10.l2 = (AndroidUtilities.isTablet() || profileActivity10.k2 || !profileActivity10.b0.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
                                profileActivity10.F2 = null;
                                profileActivity10.G2 = null;
                                dz0 dz0Var2 = profileActivity10.k0;
                                dz0Var2.E0 = true;
                                dz0Var2.H0 = profileActivity10.H2;
                                dz0Var2.n1 = null;
                                dz0Var2.o1 = null;
                                dz0Var2.setCreateThumbFromParent(false);
                                profileActivity10.i5(true);
                                profileActivity10.P4(false, true);
                                profileActivity10.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                                profileActivity10.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                                profileActivity10.getUserConfig().saveConfig(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new cl0(6));
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
            d2Var2.show();
            TextView textView3 = (TextView) d2Var2.d(-1);
            if (textView3 != null) {
                textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
                return;
            }
            return;
        }
        if (i10 == 24) {
            ProfileActivity profileActivity8 = this.b;
            q31.K(profileActivity8.a(), profileActivity8);
            return;
        }
        if (i10 == 12) {
            ProfileActivity profileActivity9 = this.b;
            if (profileActivity9.n1) {
                profileActivity9.presentFragment(oe1.a0(profileActivity9.c1, profileActivity9.d1));
                return;
            }
            Bundle bundle3 = new Bundle();
            ProfileActivity profileActivity10 = this.b;
            long j11 = profileActivity10.c1;
            if (j11 != 0) {
                bundle3.putLong("chat_id", j11);
            } else if (profileActivity10.o2) {
                bundle3.putLong("user_id", profileActivity10.b1);
            }
            po poVar = new po(bundle3);
            ProfileActivity profileActivity11 = this.b;
            TLRPC.ChatFull chatFull = profileActivity11.r2;
            if (chatFull != null) {
                poVar.l0(chatFull);
            } else {
                poVar.m0(profileActivity11.s2);
            }
            this.b.presentFragment(poVar);
            return;
        }
        if (i10 == 41) {
            this.b.presentFragment(new UserInfoActivity());
            return;
        }
        int i27 = 19;
        if (i10 == 9) {
            TLRPC.User user4 = this.b.getMessagesController().getUser(Long.valueOf(this.b.b1));
            if (user4 == null) {
                return;
            }
            Bundle e10 = org.telegram.messenger.y3.e(2, "onlySelect", "dialogsType", true);
            e10.putBoolean("resetDelegate", false);
            e10.putBoolean("closeFragment", false);
            py pyVar2 = new py(e10);
            pyVar2.z2 = new d7(this, user4, pyVar2, i27);
            this.b.presentFragment(pyVar2);
            return;
        }
        if (i10 == 10) {
            this.b.s4();
            return;
        }
        if (i10 == 14) {
            try {
                ProfileActivity profileActivity12 = this.b;
                if (profileActivity12.A2 != null) {
                    j10 = DialogObject.makeEncryptedDialogId(r2.id);
                } else {
                    j10 = profileActivity12.b1;
                    if (j10 == 0) {
                        long j12 = profileActivity12.c1;
                        if (j12 == 0) {
                            return;
                        } else {
                            j10 = -j12;
                        }
                    }
                }
                this.b.getMediaDataController().installShortcut(j10, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                return;
            } catch (Exception e11) {
                FileLog.e(e11);
                return;
            }
        }
        if (i10 == 15 || i10 == 16) {
            this.b.o4(i10 == 16);
            return;
        }
        if (i10 == 17) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", this.b.c1);
            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle4.putBoolean("open_search", true);
            qr qrVar = new qr(bundle4);
            qrVar.x0(this.b.r2);
            this.b.presentFragment(qrVar);
            return;
        }
        if (i10 == 18) {
            this.b.v4();
            return;
        }
        if (i10 == 19) {
            this.b.presentFragment(na1.d0(this.b.getMessagesController().getChat(Long.valueOf(this.b.c1)), false));
            return;
        }
        if (i10 == 22) {
            this.b.y4();
            return;
        }
        if (i10 == 38) {
            this.b.p4();
            return;
        }
        if (i10 == 39) {
            Bundle h = android.support.v4.media.a.h(2, TeXSymbolParser.TYPE_ATTR);
            h.putLong("dialog_id", -this.b.c1);
            org.telegram.ui.Components.fa0 fa0Var = new org.telegram.ui.Components.fa0(h, null);
            ProfileActivity profileActivity13 = this.b;
            fa0Var.c = profileActivity13.r2;
            profileActivity13.presentFragment(fa0Var);
            return;
        }
        if (i10 == 20) {
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this.b.getParentActivity(), 0, this.b.w0);
            alertDialog$Builder3.a.O = LocaleController.getString(R.string.AreYouSureSecretChatTitle);
            alertDialog$Builder3.a.Q = LocaleController.getString(R.string.AreYouSureSecretChat);
            alertDialog$Builder3.k(LocaleController.getString(R.string.Start), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.tz0
                public final /* synthetic */ vz0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0270 */
                @Override // org.telegram.ui.ActionBar.c2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void j(org.telegram.ui.ActionBar.d2 d2Var22, int i272) {
                    org.telegram.ui.ActionBar.f5 f5Var;
                    org.telegram.ui.ActionBar.f5 f5Var2;
                    org.telegram.ui.ActionBar.f5 f5Var3;
                    org.telegram.ui.ActionBar.f5 f5Var4;
                    int i28;
                    int i29;
                    boolean z10;
                    MessagesController.DialogPhotos dialogPhotos;
                    TLRPC.Photo photo;
                    int i30 = i22;
                    vz0 vz0Var = this.b;
                    switch (i30) {
                        case 0:
                            ArrayList<Integer> arrayList = new ArrayList<>();
                            ProfileActivity profileActivity82 = vz0Var.b;
                            arrayList.add(Integer.valueOf((int) profileActivity82.d1));
                            profileActivity82.getMessagesController().getTopicsController().deleteTopics(profileActivity82.c1, arrayList);
                            profileActivity82.G1 = 0;
                            f5Var = ((org.telegram.ui.ActionBar.p2) profileActivity82).parentLayout;
                            if (f5Var != null) {
                                f5Var2 = ((org.telegram.ui.ActionBar.p2) profileActivity82).parentLayout;
                                if (f5Var2.getFragmentStack() != null) {
                                    for (int i31 = 0; i31 < f5Var3.getFragmentStack().size(); i31++) {
                                        f5Var4 = ((org.telegram.ui.ActionBar.p2) profileActivity82).parentLayout;
                                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) f5Var4.getFragmentStack().get(i31);
                                        if ((p2Var instanceof xn) && ((xn) p2Var).b() == profileActivity82.d1) {
                                            p2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity82.finishFragment();
                            Activity parentActivity2 = profileActivity82.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(parentActivity2), profileActivity82.w0).Q(R.raw.ic_delete, 36, LocaleController.getPluralString("TopicsDeleted", 1)).j();
                            }
                            d2Var22.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity92 = vz0Var.b;
                            i28 = ((org.telegram.ui.ActionBar.p2) profileActivity92).currentAccount;
                            if (MessagesController.getInstance(i28).isFrozen()) {
                                i29 = ((org.telegram.ui.ActionBar.p2) profileActivity92).currentAccount;
                                c.b(i29);
                                break;
                            } else {
                                profileActivity92.g1 = true;
                                profileActivity92.getSecretChatHelper().startSecretChat(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().getUser(Long.valueOf(profileActivity92.b1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity102 = vz0Var.b;
                            int realPosition = profileActivity102.k0.getRealPosition();
                            TLRPC.Photo F = profileActivity102.k0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity102.s2;
                            if (profileActivity102.F2 == null || realPosition != 0) {
                                if (profileActivity102.m5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity102.getMessagesStorage().updateUserInfo(userFull, true);
                                    profileActivity102.i5(false);
                                }
                                if (profileActivity102.k0.getRealCount() == 1) {
                                    ProfileActivity.s3(profileActivity102, true);
                                }
                                if (F == null || profileActivity102.k0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity102.k0.F(1);
                                    if (F2 != null) {
                                        profileActivity102.getUserConfig().getCurrentUser().photo = new TLRPC.TL_userProfilePhoto();
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(F2.sizes, 90);
                                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(F2.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                        if (closestPhotoSizeWithSize != null && closestPhotoSizeWithSize2 != null) {
                                            profileActivity102.getUserConfig().getCurrentUser().photo.photo_small = closestPhotoSizeWithSize.location;
                                            profileActivity102.getUserConfig().getCurrentUser().photo.photo_big = closestPhotoSizeWithSize2.location;
                                        }
                                    } else {
                                        profileActivity102.getUserConfig().getCurrentUser().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                    }
                                    profileActivity102.getMessagesController().deleteUserPhoto(null);
                                } else {
                                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                    tL_inputPhoto.id = F.id;
                                    tL_inputPhoto.access_hash = F.access_hash;
                                    byte[] bArr = F.file_reference;
                                    tL_inputPhoto.file_reference = bArr;
                                    if (bArr == null) {
                                        tL_inputPhoto.file_reference = new byte[0];
                                    }
                                    profileActivity102.getMessagesController().deleteUserPhoto(tL_inputPhoto);
                                    profileActivity102.getMessagesStorage().clearUserPhoto(profileActivity102.b1, F.id);
                                }
                                dz0 dz0Var = profileActivity102.k0;
                                ArrayList arrayList2 = dz0Var.U0;
                                ArrayList arrayList3 = dz0Var.S0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    z10 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (dialogPhotos = dz0Var.P0) == null) {
                                        arrayList3.remove(realPosition);
                                        dz0Var.R0.remove(realPosition);
                                        dz0Var.Q0.remove(realPosition);
                                        dz0Var.T0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        dz0Var.V0.remove(realPosition);
                                        dz0Var.W0.remove(realPosition);
                                        dz0Var.X0.remove(realPosition);
                                        dz0Var.a1.delete(realPosition);
                                        dz0Var.Y0.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            dz0Var.M0 = (ImageLocation) arrayList2.get(0);
                                            dz0Var.N0 = null;
                                            dz0Var.O0 = null;
                                        }
                                        dz0Var.A0.g();
                                        z10 = arrayList3.isEmpty();
                                    } else {
                                        dialogPhotos.removePhoto(photo2.id);
                                        z10 = true;
                                    }
                                }
                                if (z10 || profileActivity102.k0.getRealCount() <= 0) {
                                    profileActivity102.k0.setVisibility(8);
                                    profileActivity102.b0.setForegroundAlpha(1.0f);
                                    profileActivity102.V.setVisibility(0);
                                    profileActivity102.E0 = true;
                                    View m9 = profileActivity102.c.m(0);
                                    if (m9 != null) {
                                        profileActivity102.a.v0(0, m9.getTop() - profileActivity102.T3(), org.telegram.ui.Components.pr.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity102.n0.c();
                                if (profileActivity102.P5 != 0) {
                                    profileActivity102.getConnectionsManager().cancelRequest(profileActivity102.P5, true);
                                }
                                profileActivity102.l2 = (AndroidUtilities.isTablet() || profileActivity102.k2 || !profileActivity102.b0.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
                                profileActivity102.F2 = null;
                                profileActivity102.G2 = null;
                                dz0 dz0Var2 = profileActivity102.k0;
                                dz0Var2.E0 = true;
                                dz0Var2.H0 = profileActivity102.H2;
                                dz0Var2.n1 = null;
                                dz0Var2.o1 = null;
                                dz0Var2.setCreateThumbFromParent(false);
                                profileActivity102.i5(true);
                                profileActivity102.P4(false, true);
                                profileActivity102.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                                profileActivity102.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                                profileActivity102.getUserConfig().saveConfig(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
            this.b.showDialog(alertDialog$Builder3.a);
            return;
        }
        if (i10 == 44) {
            i18 = ((org.telegram.ui.ActionBar.p2) this.b).currentAccount;
            long j13 = this.b.b1;
            TLRPC.UserFull userFull = MessagesController.getInstance(i18).getUserFull(j13);
            if (userFull == null || (botInfo = userFull.bot_info) == null) {
                return;
            }
            String str2 = botInfo.privacy_policy_url;
            if (str2 == null && str2 == null) {
                ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
                int size = arrayList.size();
                int i28 = 0;
                while (true) {
                    if (i28 >= size) {
                        str2 = LocaleController.getString(R.string.BotDefaultPrivacyPolicy);
                        break;
                    }
                    TLRPC.BotCommand botCommand = arrayList.get(i28);
                    i28++;
                    if ("privacy".equals(botCommand.command)) {
                        break;
                    }
                }
            }
            if (str2 != null) {
                af.g.s(ApplicationLoader.applicationContext, str2);
                return;
            }
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U == null) {
                return;
            }
            if (!(U instanceof xn) || ((xn) U).a() != j13) {
                U.presentFragment(xn.R9(j13));
            }
            AndroidUtilities.runOnUIThread(new mh.b8(i18, j13), 150L);
            return;
        }
        if (i10 == 21) {
            if (this.b.getParentActivity() == null) {
                return;
            }
            int i29 = Build.VERSION.SDK_INT;
            if (i29 >= 23 && ((i29 <= 28 || BuildVars.NO_SCOPED_STORAGE) && this.b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                this.b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            dz0 dz0Var = this.b.k0;
            ImageLocation D = dz0Var.D(dz0Var.getRealPosition());
            if (D == null) {
                return;
            }
            boolean z10 = D.imageType == 2;
            i17 = ((org.telegram.ui.ActionBar.p2) this.b).currentAccount;
            File pathToAttach = FileLoader.getInstance(i17).getPathToAttach(D.location, z10 ? "mp4" : null, true);
            if (z10 && !pathToAttach.exists()) {
                pathToAttach = new File(FileLoader.getDirectory(0), FileLoader.getAttachFileName(D.location, "mp4"));
            }
            if (pathToAttach.exists()) {
                MediaController.saveFile(pathToAttach.toString(), this.b.getParentActivity(), 0, null, null, new mh.m6(i21, this, z10));
                return;
            }
            return;
        }
        if (i10 == 30) {
            this.b.presentFragment(new UserInfoActivity());
            return;
        }
        if (i10 == 40) {
            ProfileActivity profileActivity14 = this.b;
            np0 np0Var = new np0();
            np0Var.E = this.b;
            profileActivity14.presentFragment(np0Var);
            return;
        }
        if (i10 == 42) {
            AndroidUtilities.addToClipboard(this.b.getMessagesController().linkPrefix + "/" + UserObject.getPublicUsername(this.b.getMessagesController().getUser(Long.valueOf(this.b.b1))));
            return;
        }
        if (i10 == 43) {
            this.b.presentFragment(new pa(null));
            return;
        }
        if (i10 == 31) {
            this.b.presentFragment(new qg0(null));
            return;
        }
        if (i10 != 33) {
            if (i10 == 34) {
                i11 = ((org.telegram.ui.ActionBar.p2) this.b).currentAccount;
                if (MessagesController.getInstance(i11).isFrozen()) {
                    i14 = ((org.telegram.ui.ActionBar.p2) this.b).currentAccount;
                    c.b(i14);
                    return;
                }
                int realPosition = this.b.k0.getRealPosition();
                ImageLocation D2 = this.b.k0.D(realPosition);
                if (D2 == null) {
                    return;
                }
                i12 = ((org.telegram.ui.ActionBar.p2) this.b).currentAccount;
                FileLoader fileLoader = FileLoader.getInstance(i12);
                Drawable[] drawableArr = PhotoViewer.Q8;
                File pathToAttach2 = fileLoader.getPathToAttach(D2.location, PhotoViewer.q1(D2), true);
                boolean z11 = D2.imageType == 2;
                if (z11) {
                    ImageLocation G = this.b.k0.G(realPosition);
                    i13 = ((org.telegram.ui.ActionBar.p2) this.b).currentAccount;
                    str = FileLoader.getInstance(i13).getPathToAttach(G == null ? null : G.location, PhotoViewer.q1(G), true).getAbsolutePath();
                } else {
                    str = null;
                }
                this.b.n0.q(pathToAttach2.getAbsolutePath(), str, z11);
                return;
            }
            if (i10 != 35) {
                if (i10 == 36) {
                    this.b.u4();
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this.b.getParentActivity(), 0, this.b.w0);
            dz0 dz0Var2 = this.b.k0;
            ImageLocation D3 = dz0Var2.D(dz0Var2.getRealPosition());
            if (D3 == null) {
                return;
            }
            if (D3.imageType == 2) {
                alertDialog$Builder4.a.O = LocaleController.getString(R.string.AreYouSureDeleteVideoTitle);
                alertDialog$Builder4.a.Q = LocaleController.getString(R.string.AreYouSureDeleteVideo);
            } else {
                alertDialog$Builder4.a.O = LocaleController.getString(R.string.AreYouSureDeletePhotoTitle);
                alertDialog$Builder4.a.Q = LocaleController.getString(R.string.AreYouSureDeletePhoto);
            }
            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.tz0
                public final /* synthetic */ vz0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0270 */
                @Override // org.telegram.ui.ActionBar.c2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void j(org.telegram.ui.ActionBar.d2 d2Var22, int i272) {
                    org.telegram.ui.ActionBar.f5 f5Var;
                    org.telegram.ui.ActionBar.f5 f5Var2;
                    org.telegram.ui.ActionBar.f5 f5Var3;
                    org.telegram.ui.ActionBar.f5 f5Var4;
                    int i282;
                    int i292;
                    boolean z102;
                    MessagesController.DialogPhotos dialogPhotos;
                    TLRPC.Photo photo;
                    int i30 = i21;
                    vz0 vz0Var = this.b;
                    switch (i30) {
                        case 0:
                            ArrayList<Integer> arrayList2 = new ArrayList<>();
                            ProfileActivity profileActivity82 = vz0Var.b;
                            arrayList2.add(Integer.valueOf((int) profileActivity82.d1));
                            profileActivity82.getMessagesController().getTopicsController().deleteTopics(profileActivity82.c1, arrayList2);
                            profileActivity82.G1 = 0;
                            f5Var = ((org.telegram.ui.ActionBar.p2) profileActivity82).parentLayout;
                            if (f5Var != null) {
                                f5Var2 = ((org.telegram.ui.ActionBar.p2) profileActivity82).parentLayout;
                                if (f5Var2.getFragmentStack() != null) {
                                    for (int i31 = 0; i31 < f5Var3.getFragmentStack().size(); i31++) {
                                        f5Var4 = ((org.telegram.ui.ActionBar.p2) profileActivity82).parentLayout;
                                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) f5Var4.getFragmentStack().get(i31);
                                        if ((p2Var instanceof xn) && ((xn) p2Var).b() == profileActivity82.d1) {
                                            p2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity82.finishFragment();
                            Activity parentActivity2 = profileActivity82.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(parentActivity2), profileActivity82.w0).Q(R.raw.ic_delete, 36, LocaleController.getPluralString("TopicsDeleted", 1)).j();
                            }
                            d2Var22.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity92 = vz0Var.b;
                            i282 = ((org.telegram.ui.ActionBar.p2) profileActivity92).currentAccount;
                            if (MessagesController.getInstance(i282).isFrozen()) {
                                i292 = ((org.telegram.ui.ActionBar.p2) profileActivity92).currentAccount;
                                c.b(i292);
                                break;
                            } else {
                                profileActivity92.g1 = true;
                                profileActivity92.getSecretChatHelper().startSecretChat(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().getUser(Long.valueOf(profileActivity92.b1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity102 = vz0Var.b;
                            int realPosition2 = profileActivity102.k0.getRealPosition();
                            TLRPC.Photo F = profileActivity102.k0.F(realPosition2);
                            TLRPC.UserFull userFull2 = profileActivity102.s2;
                            if (profileActivity102.F2 == null || realPosition2 != 0) {
                                if (profileActivity102.m5 && F != null && userFull2 != null && (photo = userFull2.fallback_photo) != null && photo.id == F.id) {
                                    userFull2.fallback_photo = null;
                                    userFull2.flags &= -4194305;
                                    profileActivity102.getMessagesStorage().updateUserInfo(userFull2, true);
                                    profileActivity102.i5(false);
                                }
                                if (profileActivity102.k0.getRealCount() == 1) {
                                    ProfileActivity.s3(profileActivity102, true);
                                }
                                if (F == null || profileActivity102.k0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity102.k0.F(1);
                                    if (F2 != null) {
                                        profileActivity102.getUserConfig().getCurrentUser().photo = new TLRPC.TL_userProfilePhoto();
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(F2.sizes, 90);
                                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(F2.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                        if (closestPhotoSizeWithSize != null && closestPhotoSizeWithSize2 != null) {
                                            profileActivity102.getUserConfig().getCurrentUser().photo.photo_small = closestPhotoSizeWithSize.location;
                                            profileActivity102.getUserConfig().getCurrentUser().photo.photo_big = closestPhotoSizeWithSize2.location;
                                        }
                                    } else {
                                        profileActivity102.getUserConfig().getCurrentUser().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                    }
                                    profileActivity102.getMessagesController().deleteUserPhoto(null);
                                } else {
                                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                    tL_inputPhoto.id = F.id;
                                    tL_inputPhoto.access_hash = F.access_hash;
                                    byte[] bArr = F.file_reference;
                                    tL_inputPhoto.file_reference = bArr;
                                    if (bArr == null) {
                                        tL_inputPhoto.file_reference = new byte[0];
                                    }
                                    profileActivity102.getMessagesController().deleteUserPhoto(tL_inputPhoto);
                                    profileActivity102.getMessagesStorage().clearUserPhoto(profileActivity102.b1, F.id);
                                }
                                dz0 dz0Var3 = profileActivity102.k0;
                                ArrayList arrayList22 = dz0Var3.U0;
                                ArrayList arrayList3 = dz0Var3.S0;
                                if (realPosition2 < 0 || realPosition2 >= arrayList3.size()) {
                                    z102 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition2);
                                    if (photo2 == null || (dialogPhotos = dz0Var3.P0) == null) {
                                        arrayList3.remove(realPosition2);
                                        dz0Var3.R0.remove(realPosition2);
                                        dz0Var3.Q0.remove(realPosition2);
                                        dz0Var3.T0.remove(realPosition2);
                                        arrayList22.remove(realPosition2);
                                        dz0Var3.V0.remove(realPosition2);
                                        dz0Var3.W0.remove(realPosition2);
                                        dz0Var3.X0.remove(realPosition2);
                                        dz0Var3.a1.delete(realPosition2);
                                        dz0Var3.Y0.remove(realPosition2);
                                        if (realPosition2 == 0 && !arrayList22.isEmpty()) {
                                            dz0Var3.M0 = (ImageLocation) arrayList22.get(0);
                                            dz0Var3.N0 = null;
                                            dz0Var3.O0 = null;
                                        }
                                        dz0Var3.A0.g();
                                        z102 = arrayList3.isEmpty();
                                    } else {
                                        dialogPhotos.removePhoto(photo2.id);
                                        z102 = true;
                                    }
                                }
                                if (z102 || profileActivity102.k0.getRealCount() <= 0) {
                                    profileActivity102.k0.setVisibility(8);
                                    profileActivity102.b0.setForegroundAlpha(1.0f);
                                    profileActivity102.V.setVisibility(0);
                                    profileActivity102.E0 = true;
                                    View m9 = profileActivity102.c.m(0);
                                    if (m9 != null) {
                                        profileActivity102.a.v0(0, m9.getTop() - profileActivity102.T3(), org.telegram.ui.Components.pr.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity102.n0.c();
                                if (profileActivity102.P5 != 0) {
                                    profileActivity102.getConnectionsManager().cancelRequest(profileActivity102.P5, true);
                                }
                                profileActivity102.l2 = (AndroidUtilities.isTablet() || profileActivity102.k2 || !profileActivity102.b0.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
                                profileActivity102.F2 = null;
                                profileActivity102.G2 = null;
                                dz0 dz0Var22 = profileActivity102.k0;
                                dz0Var22.E0 = true;
                                dz0Var22.H0 = profileActivity102.H2;
                                dz0Var22.n1 = null;
                                dz0Var22.o1 = null;
                                dz0Var22.setCreateThumbFromParent(false);
                                profileActivity102.i5(true);
                                profileActivity102.P4(false, true);
                                profileActivity102.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                                profileActivity102.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                                profileActivity102.getUserConfig().saveConfig(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder4.a;
            this.b.showDialog(d2Var3);
            TextView textView4 = (TextView) d2Var3.d(-1);
            if (textView4 != null) {
                textView4.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.q7, this.b.w0));
                return;
            }
            return;
        }
        int realPosition2 = this.b.k0.getRealPosition();
        TLRPC.Photo F = this.b.k0.F(realPosition2);
        if (F == null) {
            return;
        }
        dz0 dz0Var3 = this.b.k0;
        ArrayList arrayList2 = dz0Var3.Y0;
        ArrayList arrayList3 = dz0Var3.X0;
        ArrayList arrayList4 = dz0Var3.W0;
        ArrayList arrayList5 = dz0Var3.V0;
        ArrayList arrayList6 = dz0Var3.T0;
        ArrayList arrayList7 = dz0Var3.R0;
        ArrayList arrayList8 = dz0Var3.U0;
        ArrayList arrayList9 = dz0Var3.S0;
        MessagesController.DialogPhotos dialogPhotos = dz0Var3.P0;
        if (dialogPhotos != null) {
            dialogPhotos.moveToStart(realPosition2);
        } else if (realPosition2 > 0 && realPosition2 < arrayList9.size()) {
            dz0Var3.Z0++;
            TLRPC.Photo photo = (TLRPC.Photo) arrayList9.get(realPosition2);
            arrayList9.remove(realPosition2);
            i15 = 1;
            arrayList9.add(0, photo);
            String str3 = (String) arrayList7.get(realPosition2);
            arrayList7.remove(realPosition2);
            arrayList7.add(0, str3);
            ArrayList arrayList10 = dz0Var3.Q0;
            arrayList10.add(0, (String) arrayList10.remove(realPosition2));
            ImageLocation imageLocation = (ImageLocation) arrayList6.get(realPosition2);
            arrayList6.remove(realPosition2);
            arrayList6.add(0, imageLocation);
            ImageLocation imageLocation2 = (ImageLocation) arrayList8.get(realPosition2);
            arrayList8.remove(realPosition2);
            arrayList8.add(0, imageLocation2);
            ImageLocation imageLocation3 = (ImageLocation) arrayList5.get(realPosition2);
            arrayList5.remove(realPosition2);
            arrayList5.add(0, imageLocation3);
            org.telegram.ui.Components.t61 t61Var = (org.telegram.ui.Components.t61) arrayList4.get(realPosition2);
            arrayList4.remove(realPosition2);
            arrayList4.add(0, t61Var);
            Integer num = (Integer) arrayList3.get(realPosition2);
            arrayList3.remove(realPosition2);
            arrayList3.add(0, num);
            Float f10 = (Float) arrayList2.get(realPosition2);
            arrayList2.remove(realPosition2);
            arrayList2.add(0, f10);
            dz0Var3.M0 = (ImageLocation) arrayList8.get(0);
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.id = tL_inputPhoto;
            tL_inputPhoto.id = F.id;
            tL_inputPhoto.access_hash = F.access_hash;
            tL_inputPhoto.file_reference = F.file_reference;
            UserConfig userConfig = this.b.getUserConfig();
            this.b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new yr0(this, userConfig, F, i26));
            ProfileActivity profileActivity15 = this.b;
            profileActivity15.J.m(profileActivity15.b1, !F.video_sizes.isEmpty() ? null : Integer.valueOf(i15), 22);
            user = this.b.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 800);
            if (user != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 90);
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                userProfilePhoto.photo_id = F.id;
                userProfilePhoto.photo_small = closestPhotoSizeWithSize2.location;
                userProfilePhoto.photo_big = closestPhotoSizeWithSize.location;
                userConfig.setCurrentUser(user);
                userConfig.saveConfig(true);
                i16 = ((org.telegram.ui.ActionBar.p2) this.b).currentAccount;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                this.b.i5(true);
            }
            dz0 dz0Var4 = this.b.k0;
            dz0Var4.A0.g();
            dz0Var4.L();
        }
        i15 = 1;
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto2 = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto2 = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto2.id = tL_inputPhoto2;
        tL_inputPhoto2.id = F.id;
        tL_inputPhoto2.access_hash = F.access_hash;
        tL_inputPhoto2.file_reference = F.file_reference;
        UserConfig userConfig2 = this.b.getUserConfig();
        this.b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto2, new yr0(this, userConfig2, F, i26));
        ProfileActivity profileActivity152 = this.b;
        profileActivity152.J.m(profileActivity152.b1, !F.video_sizes.isEmpty() ? null : Integer.valueOf(i15), 22);
        user = this.b.getMessagesController().getUser(Long.valueOf(userConfig2.clientUserId));
        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 800);
        if (user != null) {
        }
        dz0 dz0Var42 = this.b.k0;
        dz0Var42.A0.g();
        dz0Var42.L();
    }
}
