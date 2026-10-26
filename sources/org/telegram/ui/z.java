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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        cy cyVar;
        org.telegram.ui.ActionBar.k3 k3Var;
        int i10 = this.a;
        int i11 = 3;
        int i12 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                j4 j4Var = (j4) obj3;
                String str = (String) obj2;
                m3 m3Var = (m3) obj;
                j4Var.h0.k(false);
                AndroidUtilities.hideKeyboard(j4Var.h0.b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.wc(m3Var.f, null).k(false).k(true);
                break;
            case 1:
                h7 h7Var = (h7) obj3;
                c7 c7Var = (c7) obj;
                Bundle bundle = new Bundle();
                ci.a aVar = ((q7) obj2).d;
                long j10 = aVar.b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putInt("message_id", aVar.g);
                c7Var.presentFragment(new un(bundle));
                h7Var.f.F.dismiss();
                org.telegram.ui.ActionBar.o1 o1Var = h7Var.a;
                if (o1Var != null) {
                    o1Var.d(true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.pk0 pk0Var = (org.telegram.ui.Components.pk0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (pk0Var == null || pk0Var.w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    break;
                }
                break;
            case 3:
                un unVar = (un) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (unVar.getParentActivity() != null) {
                    if (unVar.a1.getVisibility() != 0 || bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        unVar.Y.Z(keyboardInlineButton, messageObject, messageObject, null);
                        break;
                    }
                }
                break;
            case 4:
                ((un) obj3).Ea((org.telegram.ui.Cells.z) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                break;
            case 5:
                un.i0((un) obj3, (boolean[]) obj2, (Context) obj);
                break;
            case 6:
                un.Z0((un) obj3, (jk) obj2, (boolean[]) obj);
                break;
            case 7:
                fn fnVar = (fn) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                org.telegram.ui.ActionBar.r2 r2Var = fnVar.a;
                r2Var.finishPreviewFragment();
                chat.left = false;
                if (s1Var != null && s1Var.v != null) {
                    r2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(s1Var.v.e));
                }
                r2Var.getMessagesController().addUserToChat(chat.id, r2Var.getUserConfig().getCurrentUser(), 0, null, r2Var, new tm(fnVar, chat, i11));
                break;
            case 8:
                mo moVar = (mo) obj3;
                org.telegram.ui.Cells.n6[] n6VarArr = (org.telegram.ui.Cells.n6[]) obj2;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj;
                Integer num = (Integer) view.getTag();
                n6VarArr[0].a(num.intValue() == 0);
                n6VarArr[1].a(num.intValue() == 1);
                moVar.I0 = num.intValue() == 1;
                runnable = e3Var.a.dismissRunnable;
                runnable.run();
                moVar.q0(true, true);
                break;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((or) obj3).c.a;
                Drawable[] drawableArr = PhotoViewer.U8;
                ArrayList arrayList = ((org.telegram.ui.Components.o81) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj4 = arrayList.get(i13);
                            i13++;
                            org.telegram.ui.Components.q81 q81Var = (org.telegram.ui.Components.q81) obj4;
                            if (q81Var.b()) {
                                document = q81Var.g;
                            }
                        } else {
                            long j11 = Long.MAX_VALUE;
                            org.telegram.ui.Components.q81 q81Var2 = null;
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                org.telegram.ui.Components.q81 q81Var3 = (org.telegram.ui.Components.q81) arrayList.get(i14);
                                if (q81Var3.k < j11 && org.telegram.ui.Components.s81.Y(q81Var3.m)) {
                                    j11 = q81Var3.k;
                                    q81Var2 = q81Var3;
                                }
                            }
                            document = q81Var2 != null ? q81Var2.g : ((org.telegram.ui.Components.q81) arrayList.get(0)).g;
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
                        MediaController.saveFilesFromMessages(photoViewer.y, AccountInstance.getInstance(photoViewer.T), arrayList2, new wa(photoViewer, i11));
                    } else {
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.y, 1, null, null, new dr0(photoViewer, i12));
                    }
                    photoViewer.o0.U(null, null);
                    break;
                }
                break;
            case 10:
                js jsVar = (js) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.g5.N((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new bs(jsVar, user, i12), jsVar.r).p();
                break;
            case 11:
                pg0 pg0Var = (pg0) obj3;
                ((org.telegram.ui.Components.k80) obj2).u();
                int i15 = ((MessagesController.DialogFilter) obj).id;
                if (pg0Var.c.getCurrentPosition() != 0 || (cyVar = pg0Var.I) == null) {
                    if (pg0Var.I == null) {
                        pg0Var.i0(null);
                    }
                    pg0Var.H = Integer.valueOf(i15);
                    pg0Var.j0(0, true);
                    pg0Var.c.E(0);
                    break;
                } else {
                    cyVar.E4(i15);
                    break;
                }
            case 12:
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.k3 k3Var2 = k3VarArr[0];
                if (k3Var2 != null) {
                    k3Var2.dismiss();
                    k3VarArr[0] = null;
                    callback.run(str2);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.k3[] k3VarArr2 = (org.telegram.ui.ActionBar.k3[]) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (!((fi.d) obj3).Q && (k3Var = k3VarArr2[0]) != null) {
                    k3Var.dismiss();
                    k3VarArr2[0] = null;
                    runnable2.run();
                    break;
                }
                break;
            case 14:
                ProfileActivity.n0((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.b6) obj);
                break;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.o1) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveGalleryExceptions);
                saveToGallerySettingsActivity.b0();
                break;
        }
    }

    public /* synthetic */ z(org.telegram.ui.ActionBar.k3[] k3VarArr, Utilities.Callback callback, String str) {
        this.a = 12;
        this.b = k3VarArr;
        this.d = callback;
        this.c = str;
    }
}
