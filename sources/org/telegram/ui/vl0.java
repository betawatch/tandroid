package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vl0 implements org.telegram.ui.ActionBar.c2, zt, FileLoader.FileResolver, org.telegram.ui.Components.y4, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.il0, org.telegram.ui.Components.jl0, lv0, MessagesStorage.BooleanCallback, k11, OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vl0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        switch (this.a) {
            case 8:
                ev0 ev0Var = (ev0) this.b;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.c;
                mv0 mv0Var = ev0Var.a;
                mv0Var.b0.a(tL_messageMediaToDo);
                mv0Var.finishFragment();
                break;
            default:
                ev0 ev0Var2 = (ev0) this.b;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.c;
                mv0 mv0Var2 = ev0Var2.a;
                mv0Var2.b0.a(tL_messageMediaPoll);
                mv0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.zt
    public void Y0(ut utVar) {
        fn0 fn0Var = (fn0) this.b;
        int intValue = ((Integer) ((View) this.c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = fn0Var.V[intValue];
        if (intValue == 5) {
            fn0Var.s = utVar.d;
        } else {
            fn0Var.v = utVar.d;
        }
        editTextBoldCursor.setText(utVar.a);
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ boolean Z0(View view) {
        return false;
    }

    @Override // org.telegram.ui.lv0
    public void a(TLRPC.MessageMedia messageMedia) {
        yd1 yd1Var = (yd1) this.b;
        zn znVar = (zn) this.c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = yd1Var.D.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        yd1Var.D.messageOwner.media = messageMedia;
        znVar.getSendMessagesHelper().editMessage(yd1Var.D, null, null, null, null, null, null, false, false, null);
    }

    @Override // org.telegram.ui.Components.il0
    public void c(float f10, float f11, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.b, (Context) this.c, view, i10, f10);
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean d(int i10, View view) {
        final tb1 tb1Var = (tb1) this.b;
        final vb1 vb1Var = (vb1) this.c;
        ThemeActivity themeActivity = tb1Var.e;
        if (i10 >= 0 && i10 < vb1Var.e.size()) {
            final org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) vb1Var.e.get(i10);
            if (h6Var.a >= 100 && !h6Var.z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = h6Var.r;
                CharSequence[] charSequenceArr = {string, string2, (tL_theme == null || !tL_theme.creator) ? null : LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl), LocaleController.getString("DeleteTheme", R.string.DeleteTheme)};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.nb1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        tb1 tb1Var2 = tb1.this;
                        ThemeActivity themeActivity2 = tb1Var2.e;
                        if (themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                        if (i11 == 0) {
                            org.telegram.ui.Components.z4.W(themeActivity2, i11 != 1 ? 1 : 2, h6Var2.b, h6Var2);
                            return;
                        }
                        if (i11 == 1) {
                            if (h6Var2.r == null) {
                                themeActivity2.getMessagesController().saveThemeToServer(h6Var2.b, h6Var2);
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, h6Var2.b, h6Var2);
                                return;
                            }
                            String str = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + h6Var2.r.slug;
                            themeActivity2.showDialog(new org.telegram.ui.Components.lq0(themeActivity2.getParentActivity(), null, str, false, str, false, null));
                            return;
                        }
                        if (i11 == 2) {
                            themeActivity2.presentFragment(new od1(h6Var2.b, h6Var2, false));
                            return;
                        }
                        if (i11 != 3 || themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                        String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder2.a;
                        d2Var.O = string3;
                        d2Var.Q = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                        alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new f7(tb1Var2, vb1Var, h6Var2, 22));
                        alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        themeActivity2.showDialog(d2Var);
                        TextView textView = (TextView) d2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                        }
                    }
                };
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.M = charSequenceArr;
                d2Var.N = iArr;
                d2Var.J = onClickListener;
                themeActivity.showDialog(d2Var);
                d2Var.l(d2Var.K0.size() - 1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.FileLoader.FileResolver
    public File getFile() {
        switch (this.a) {
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                return FileLoader.getInstance(photoViewer.Q).getPathToAttach((TLObject) this.c, true);
            default:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                return FileLoader.getInstance(photoViewer2.Q).getPathToMessage((TLRPC.Message) this.c);
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ArrayList<Long> arrayList;
        TLRPC.EncryptedChat encryptedChat;
        boolean z4;
        org.telegram.ui.ActionBar.e5 e5Var;
        switch (this.a) {
            case 0:
                fn0 fn0Var = (fn0) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                int[] iArr = fn0Var.x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                editTextBoldCursor.setText(LocaleController.getString(R.string.PassportNoExpireDate));
                break;
            case 1:
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 15:
            case 16:
            case 20:
            case 21:
            case 23:
            case 24:
            case 25:
            default:
                h5.d dVar = (h5.d) this.b;
                boolean[] zArr = (boolean[]) this.c;
                dVar.accept(Boolean.TRUE);
                zArr[0] = true;
                d2Var.dismiss();
                break;
            case 2:
                fn0.U((fn0) this.b, (TLRPC.TL_auth_passwordRecovery) this.c);
                break;
            case 3:
                lo0 lo0Var = (lo0) this.b;
                String str = (String) this.c;
                lo0Var.Y = true;
                lo0Var.X.email_unconfirmed_pattern = str;
                lo0Var.J0();
                break;
            case 6:
                PhotoViewer.C(((ds0) this.b).b, (ArrayList) this.c);
                break;
            case 7:
                ds0 ds0Var = (ds0) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                PhotoViewer photoViewer = ds0Var.b;
                ou0 ou0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.X6;
                ArrayList arrayList3 = photoViewer.a7;
                ArrayList arrayList4 = photoViewer.V6;
                ArrayList arrayList5 = photoViewer.b7;
                ArrayList arrayList6 = photoViewer.c7;
                if (!ou0Var.M()) {
                    photoViewer.G0(false, false);
                    break;
                } else if (!arrayList4.isEmpty()) {
                    int i11 = photoViewer.M4;
                    if (i11 >= 0 && i11 < arrayList4.size()) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(photoViewer.M4);
                        if (messageObject.isSent()) {
                            photoViewer.G0(false, false);
                            ArrayList<Integer> arrayList7 = new ArrayList<>();
                            int i12 = photoViewer.v;
                            if (i12 != 0) {
                                arrayList7.add(Integer.valueOf(i12));
                            } else {
                                arrayList7.add(Integer.valueOf(messageObject.getId()));
                            }
                            if (!DialogObject.isEncryptedDialog(messageObject.getDialogId()) || messageObject.messageOwner.random_id == 0) {
                                arrayList = null;
                                encryptedChat = null;
                            } else {
                                ArrayList<Long> arrayList8 = new ArrayList<>();
                                arrayList8.add(Long.valueOf(messageObject.messageOwner.random_id));
                                encryptedChat = MessagesController.getInstance(photoViewer.Q).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(messageObject.getDialogId())));
                                arrayList = arrayList8;
                            }
                            MessagesController.getInstance(photoViewer.Q).deleteMessages(arrayList7, arrayList, encryptedChat, messageObject.getDialogId(), messageObject.getQuickReplyId(), zArr2[0], messageObject.getChatMode());
                            break;
                        }
                    }
                } else if (!arrayList6.isEmpty()) {
                    int i13 = photoViewer.M4;
                    if (i13 >= 0 && i13 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.M4);
                        if (message != null) {
                            ArrayList<Integer> arrayList9 = new ArrayList<>();
                            arrayList9.add(Integer.valueOf(message.id));
                            MessagesController.getInstance(photoViewer.Q).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.Q).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (!photoViewer.I1()) {
                            TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.M4);
                            if (photo != null) {
                                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                tL_inputPhoto.id = photo.id;
                                tL_inputPhoto.access_hash = photo.access_hash;
                                byte[] bArr = photo.file_reference;
                                tL_inputPhoto.file_reference = bArr;
                                if (bArr == null) {
                                    tL_inputPhoto.file_reference = new byte[0];
                                }
                                if (photoViewer.w5 > 0) {
                                    MessagesController.getInstance(photoViewer.Q).deleteUserPhoto(tL_inputPhoto);
                                }
                                MessagesStorage.getInstance(photoViewer.Q).clearUserPhoto(photoViewer.w5, photo.id);
                                arrayList2.remove(photoViewer.M4);
                                photoViewer.Z6.remove(photoViewer.M4);
                                photoViewer.Y6.remove(photoViewer.M4);
                                arrayList3.remove(photoViewer.M4);
                                arrayList6.remove(photoViewer.M4);
                                if (arrayList2.isEmpty()) {
                                    photoViewer.G0(false, false);
                                } else {
                                    int i14 = photoViewer.M4;
                                    if (i14 >= arrayList6.size()) {
                                        i14 = arrayList6.size() - 1;
                                    }
                                    photoViewer.M4 = -1;
                                    photoViewer.B2(i14);
                                }
                                if (message == null) {
                                    NotificationCenter.getInstance(photoViewer.Q).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                                    break;
                                }
                            }
                        } else {
                            if (photoViewer.w5 > 0) {
                                MessagesController.getInstance(photoViewer.Q).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.Q).changeChatAvatar(-photoViewer.w5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            break;
                        }
                    }
                } else if (!arrayList5.isEmpty() && photoViewer.d != null) {
                    arrayList5.remove(photoViewer.M4);
                    photoViewer.d.B(photoViewer.M4);
                    if (!arrayList5.isEmpty()) {
                        int i15 = photoViewer.M4;
                        if (i15 >= arrayList5.size()) {
                            i15 = arrayList5.size() - 1;
                        }
                        photoViewer.M4 = -1;
                        photoViewer.B2(i15);
                        break;
                    } else {
                        photoViewer.G0(false, false);
                        break;
                    }
                }
                break;
            case 11:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                SharedPreferences sharedPreferences = (SharedPreferences) this.c;
                privacyControlActivity.t0();
                sharedPreferences.edit().putBoolean("privacyAlertShowed", true).commit();
                break;
            case 12:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) this.c;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr3 = privacySettingsActivity.W;
                tL_payments_clearSavedInfo.credentials = zArr3[1];
                tL_payments_clearSavedInfo.info = zArr3[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new ub0(14, privacySettingsActivity, r8Var));
                break;
            case 13:
                ProfileActivity.c0((ProfileActivity) this.b, (org.telegram.ui.Cells.y1[]) this.c);
                break;
            case 14:
                vz0 vz0Var = (vz0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                vz0Var.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ProfileActivity profileActivity = vz0Var.b;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    break;
                }
                break;
            case 17:
                i71 i71Var = (i71) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    i71Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    f7 f7Var = new f7(i71Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.W = 0;
                    twoStepVerificationActivity.Y = f7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    break;
                }
                break;
            case 18:
                wa1.m((wa1) this.b, (qy) this.c);
                break;
            case 19:
                ThemeActivity.X((ThemeActivity) this.b, (b11) this.c);
                break;
            case 22:
                tb1 tb1Var = (tb1) this.b;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.c;
                tb1Var.getClass();
                MessagesController.getInstance(i6Var.B).saveTheme(i6Var, null, i6Var == org.telegram.ui.ActionBar.j6.J, true);
                HashMap hashMap = org.telegram.ui.ActionBar.j6.H;
                if (i6Var.b == null) {
                    z4 = false;
                } else {
                    if (org.telegram.ui.ActionBar.j6.I == i6Var) {
                        org.telegram.ui.ActionBar.j6.t(org.telegram.ui.ActionBar.j6.L, true, false);
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (i6Var == org.telegram.ui.ActionBar.j6.J) {
                        org.telegram.ui.ActionBar.j6.J = (org.telegram.ui.ActionBar.i6) hashMap.get("Dark Blue");
                    }
                    i6Var.t();
                    org.telegram.ui.ActionBar.j6.G.remove(i6Var);
                    hashMap.remove(i6Var.a);
                    org.telegram.ui.ActionBar.c6 c6Var = i6Var.f0;
                    if (c6Var != null) {
                        org.telegram.ui.ActionBar.c6.a(c6Var);
                    }
                    org.telegram.ui.ActionBar.j6.F.remove(i6Var);
                    new File(i6Var.b).delete();
                    org.telegram.ui.ActionBar.j6.s1(true, false);
                }
                if (z4) {
                    e5Var = ((org.telegram.ui.ActionBar.p2) tb1Var.e).parentLayout;
                    ((ActionBarLayout) e5Var).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                break;
            case 26:
                wg1.W((wg1) this.b, (byte[]) this.c);
                break;
            case 27:
                ii1 ii1Var = (ii1) this.b;
                boolean[] zArr4 = (boolean[]) this.c;
                ii1Var.getClass();
                zArr4[0] = true;
                ii1Var.m0 = 17;
                Intent intent = new Intent(ii1Var.b, (Class<?>) VoIPService.class);
                intent.putExtra("user_id", ii1Var.d.id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", ii1Var.a);
                try {
                    ii1Var.b.startService(intent);
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        c5.j jVar = (c5.j) this.b;
        ph.d dVar = (ph.d) this.c;
        FileLog.d("wear-auth: /token delivered to " + ((String) jVar.c));
        dVar.setLoading(false);
        zi1.d = null;
        org.telegram.ui.ActionBar.g3 g3Var = zi1.c;
        if (g3Var != null) {
            g3Var.dismiss();
            zi1.c = null;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        uw0 uw0Var = (uw0) this.b;
        tw0 tw0Var = (tw0) this.c;
        PremiumPreviewFragment premiumPreviewFragment = uw0Var.d.n;
        premiumPreviewFragment.k0.d(0, 0.0f, 0, tw0Var.getMeasuredWidth(), -tw0Var.getTier().h, premiumPreviewFragment.L);
        return premiumPreviewFragment.k0.f;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z4) {
        cf1 cf1Var = (cf1) this.b;
        TLRPC.Chat chat = (TLRPC.Chat) this.c;
        sf1 sf1Var = cf1Var.b;
        NotificationCenter notificationCenter = sf1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(sf1Var, i10);
        sf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        sf1Var.finishFragment();
        sf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.id), null, chat, Boolean.valueOf(z4));
    }

    @Override // org.telegram.ui.k11
    public void v(lk0 lk0Var) {
        vf1 vf1Var = (vf1) this.b;
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.c;
        yf1 yf1Var = vf1Var.a;
        yf1Var.e.add(Integer.valueOf(tL_forumTopic.id));
        yf1Var.V();
    }

    public /* synthetic */ vl0(ev0 ev0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.a = 9;
        this.b = ev0Var;
        this.c = tL_messageMediaPoll;
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        Runnable runnable = (Runnable) this.c;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                    if (Emoji.getEmojiDrawable(fixEmoji) != null) {
                        linkedHashSet.add(fixEmoji);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override // org.telegram.ui.k11
    public /* synthetic */ void b0() {
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ void n0(View view, float f10, float f11) {
    }
}
