package vi;

import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import bi.cb;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import li.e3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Cells.k5;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y9;
import org.telegram.ui.ProfileActivity;
import zh.a1;
import zh.g1;
import zh.m2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        int i10 = 4;
        switch (this.a) {
            case 0:
                ((s0) ((e3) this.b).b).h((Exception) this.c);
                break;
            case 1:
                wh.i iVar = (wh.i) this.b;
                iVar.b.add((String) this.c);
                iVar.invalidate();
                break;
            case 2:
                xf.c cVar = (xf.c) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList = tL_savedRingtones.ringtones;
                        ArrayList arrayList2 = cVar.e;
                        if (!cVar.f) {
                            cVar.f(false);
                            cVar.f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList2.get(i11);
                            i11++;
                            xf.b bVar = (xf.b) obj;
                            if (bVar.b != null && (document = bVar.a) != null) {
                                hashMap.put(Long.valueOf(document.id), bVar.b);
                            }
                        }
                        arrayList2.clear();
                        SharedPreferences d = cVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, arrayList.size());
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            TLRPC.Document document3 = arrayList.get(i12);
                            String str = (String) hashMap.get(Long.valueOf(document3.id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i12, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i12, str);
                            }
                            xf.b bVar2 = new xf.b();
                            bVar2.a = document3;
                            bVar2.b = str;
                            int i13 = cVar.d;
                            cVar.d = i13 + 1;
                            bVar2.c = i13;
                            arrayList2.add(bVar2);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(cVar.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar.d().edit();
                        long j10 = tL_savedRingtones.hash;
                        xf.c.g = j10;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j10);
                        long currentTimeMillis = System.currentTimeMillis();
                        xf.c.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    cVar.b();
                    break;
                }
                break;
            case 3:
                xf.c cVar2 = (xf.c) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    xf.b bVar3 = (xf.b) arrayList3.get(i14);
                    if (bVar3 != null && ((TextUtils.isEmpty(bVar3.b) || !new File(bVar3.b).exists()) && (document2 = bVar3.a) != null && ((pathToAttach = FileLoader.getInstance(cVar2.c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new i0(i10, cVar2, document2));
                    }
                }
                break;
            case 4:
                xf.c cVar3 = (xf.c) this.b;
                TLRPC.Document document4 = (TLRPC.Document) this.c;
                FileLoader.getInstance(cVar3.c).loadFile(document4, document4, 0, 0);
                break;
            case 5:
                xf.d dVar = (xf.d) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                int i15 = dVar.a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(i15).ringtoneDurationMax)));
                    break;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(i15).ringtoneSizeMax / 1024)));
                    break;
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat));
                    break;
                }
            case 6:
                ((ig.o) this.b).run((TLRPC.Chat) this.c);
                break;
            case 7:
                yh.k kVar = (yh.k) this.b;
                k5 k5Var = (k5) this.c;
                int i16 = kVar.k;
                r2 r2Var = kVar.g;
                TLRPC.TL_chatInviteImporter importer = k5Var.getImporter();
                kVar.r = importer;
                LongSparseArray longSparseArray = kVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    r2Var.getMessagesController().putUser(user, false);
                    Point point = AndroidUtilities.displaySize;
                    boolean z10 = point.x > point.y;
                    if (user.photo != null && !z10) {
                        if (kVar.s == null) {
                            yh.j jVar = new yh.j(kVar, r2Var.getParentActivity(), (mm0) k5Var.getParent(), r2Var.getResourceProvider(), kVar.a);
                            kVar.s = jVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.r;
                            y9 avatarImageView = k5Var.getAvatarImageView();
                            TextView textView = jVar.e;
                            ni0 ni0Var = jVar.h;
                            jVar.r = tL_chatInviteImporter;
                            jVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i16).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i16, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i16, user2, 1);
                            if (MessagesController.getInstance(i16).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i16).loadUserInfo(user2, false, 0);
                            }
                            ni0Var.setParentAvatarImage(avatarImageView);
                            ni0Var.M(tL_chatInviteImporter.user_id, true);
                            ni0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            jVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                            jVar.y.requestLayout();
                            kVar.s.setOnDismissListener(new cb(kVar, 14));
                            kVar.s.show();
                            break;
                        }
                    } else {
                        kVar.b = true;
                        r2Var.dismissCurrentDialog();
                        Bundle bundle = new Bundle();
                        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                        bundle.putLong("user_id", user.id);
                        bundle.putBoolean("removeFragmentOnChatOpen", false);
                        r2Var.presentFragment(profileActivity);
                        break;
                    }
                }
                break;
            case 8:
                zh.b bVar4 = (zh.b) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                bVar4.getClass();
                onClickListener.onClick(bVar4);
                break;
            case 9:
                ((a1) this.b).getBulletinFactory().g0((TLRPC.TL_error) this.c, false);
                break;
            case 10:
                g1 g1Var = (g1) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                g1Var.getClass();
                if (!savedStarGift.unsaved) {
                    g1Var.F.setVisibility(8);
                    break;
                }
                break;
            case 11:
                vs0 vs0Var = (vs0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                vs0Var.h(tL_starGiftCollection.title, new org.telegram.ui.Wallet.s(19, vs0Var, tL_starGiftCollection));
                break;
            default:
                m2 m2Var = (m2) this.b;
                AndroidUtilities.addToClipboard((String) this.c);
                wc.b0(m2Var.a.a).k(false).j();
                break;
        }
    }
}
