package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        TLRPC.Document document;
        ey eyVar;
        org.telegram.ui.ActionBar.h3 h3Var;
        int i10 = this.a;
        int i11 = 3;
        int i12 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                k4 k4Var = (k4) obj3;
                String str = (String) obj2;
                n3 n3Var = (n3) obj;
                k4Var.h0.k(false);
                AndroidUtilities.hideKeyboard(k4Var.h0.b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.xc(n3Var.f, null).k(false).k(true);
                break;
            case 1:
                h7 h7Var = (h7) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                Bundle bundle = new Bundle();
                bi.b bVar = ((p7) obj2).d;
                long j10 = bVar.b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putInt("message_id", bVar.g);
                o2Var.presentFragment(new sn(bundle));
                h7Var.d.w.dismiss();
                org.telegram.ui.ActionBar.m1 m1Var = h7Var.a;
                if (m1Var != null) {
                    m1Var.d(true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.qk0 qk0Var = (org.telegram.ui.Components.qk0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (qk0Var == null || qk0Var.w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    break;
                }
                break;
            case 3:
                sn snVar = (sn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (snVar.getParentActivity() != null) {
                    if (snVar.a1.getVisibility() != 0 || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        snVar.Y.Z(keyboardInlineButton, messageObject, messageObject, null);
                        break;
                    }
                }
                break;
            case 4:
                ((sn) obj3).za((org.telegram.ui.Cells.z) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                break;
            case 5:
                sn.y1((sn) obj3, (boolean[]) obj2, (Context) obj);
                break;
            case 6:
                sn.D0((sn) obj3, (ik) obj2, (boolean[]) obj);
                break;
            case 7:
                dn dnVar = (dn) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                org.telegram.ui.ActionBar.o2 o2Var2 = dnVar.a;
                o2Var2.finishPreviewFragment();
                chat.left = false;
                if (t1Var != null && t1Var.v != null) {
                    o2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(t1Var.v.e));
                }
                o2Var2.getMessagesController().addUserToChat(chat.id, o2Var2.getUserConfig().getCurrentUser(), 0, null, o2Var2, new rm(dnVar, chat, i11));
                break;
            case 8:
                ko koVar = (ko) obj3;
                org.telegram.ui.Cells.j6[] j6VarArr = (org.telegram.ui.Cells.j6[]) obj2;
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) obj;
                Integer num = (Integer) view.getTag();
                j6VarArr[0].a(num.intValue() == 0);
                j6VarArr[1].a(num.intValue() == 1);
                koVar.I0 = num.intValue() == 1;
                runnable = b3Var.a.dismissRunnable;
                runnable.run();
                koVar.p0(true, true);
                break;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((lr) obj3).c.a;
                Drawable[] drawableArr = PhotoViewer.U8;
                ArrayList arrayList = ((org.telegram.ui.Components.f81) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj4 = arrayList.get(i13);
                            i13++;
                            org.telegram.ui.Components.h81 h81Var = (org.telegram.ui.Components.h81) obj4;
                            if (h81Var.b()) {
                                document = h81Var.g;
                            }
                        } else {
                            long j11 = Long.MAX_VALUE;
                            org.telegram.ui.Components.h81 h81Var2 = null;
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                org.telegram.ui.Components.h81 h81Var3 = (org.telegram.ui.Components.h81) arrayList.get(i14);
                                if (h81Var3.k < j11 && org.telegram.ui.Components.j81.Y(h81Var3.m)) {
                                    j11 = h81Var3.k;
                                    h81Var2 = h81Var3;
                                }
                            }
                            document = h81Var2 != null ? h81Var2.g : ((org.telegram.ui.Components.h81) arrayList.get(0)).g;
                        }
                    }
                }
                if (document != null) {
                    File pathToAttach = FileLoader.getInstance(photoViewer.T).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(photoViewer.T).getPathToAttach(document, null, true, true);
                    }
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        ArrayList arrayList2 = new ArrayList();
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.y, AccountInstance.getInstance(photoViewer.T), arrayList2, new va(photoViewer, i11));
                    } else {
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.y, 1, null, null, new zq0(photoViewer, i12));
                    }
                    photoViewer.o0.M(null, null);
                    break;
                }
                break;
            case 10:
                hs hsVar = (hs) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.f5.O((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new zr(hsVar, user, i12), hsVar.r).p();
                break;
            case 11:
                rg0 rg0Var = (rg0) obj3;
                ((org.telegram.ui.Components.j80) obj2).u();
                int i15 = ((MessagesController.DialogFilter) obj).id;
                if (rg0Var.c.getCurrentPosition() != 0 || (eyVar = rg0Var.J) == null) {
                    if (rg0Var.J == null) {
                        rg0Var.l0(null);
                    }
                    rg0Var.I = Integer.valueOf(i15);
                    rg0Var.m0(0, true);
                    rg0Var.c.D(0);
                    break;
                } else {
                    eyVar.u4(i15);
                    break;
                }
            case 12:
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.h3 h3Var2 = h3VarArr[0];
                if (h3Var2 != null) {
                    h3Var2.dismiss();
                    h3VarArr[0] = null;
                    callback.run(str2);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.h3[] h3VarArr2 = (org.telegram.ui.ActionBar.h3[]) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (!((ei.d) obj3).Q && (h3Var = h3VarArr2[0]) != null) {
                    h3Var.dismiss();
                    h3VarArr2[0] = null;
                    runnable2.run();
                    break;
                }
                break;
            case 14:
                ProfileActivity.b0((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.n5) obj);
                break;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.m1) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveGalleryExceptions);
                saveToGallerySettingsActivity.a0();
                break;
        }
    }

    public /* synthetic */ z(org.telegram.ui.ActionBar.h3[] h3VarArr, Utilities.Callback callback, String str) {
        this.a = 12;
        this.b = h3VarArr;
        this.d = callback;
        this.c = str;
    }
}
