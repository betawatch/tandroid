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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        wy wyVar;
        org.telegram.ui.ActionBar.g3 g3Var;
        int i10 = this.a;
        int i11 = 3;
        int i12 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                h4 h4Var = (h4) obj3;
                String str = (String) obj2;
                l3 l3Var = (l3) obj;
                h4Var.h0.k(false);
                AndroidUtilities.hideKeyboard(h4Var.h0.b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.vc(l3Var.f, null).k(false).k(true);
                break;
            case 1:
                f7 f7Var = (f7) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                Bundle bundle = new Bundle();
                zh.a aVar = ((o7) obj2).d;
                long j3 = aVar.b;
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putInt("message_id", aVar.g);
                o2Var.presentFragment(new bo(bundle));
                f7Var.e.E.dismiss();
                org.telegram.ui.ActionBar.o1 o1Var = f7Var.a;
                if (o1Var != null) {
                    o1Var.d(true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.qj0 qj0Var = (org.telegram.ui.Components.qj0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (qj0Var == null || qj0Var.w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    break;
                }
                break;
            case 3:
                bo boVar = (bo) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (boVar.getParentActivity() != null) {
                    if (boVar.O0.getVisibility() != 0 || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        boVar.Y.d0(keyboardInlineButton, messageObject, messageObject, null);
                        break;
                    }
                }
                break;
            case 4:
                ((bo) obj3).va((org.telegram.ui.Cells.a0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                break;
            case 5:
                bo.j1((bo) obj3, (boolean[]) obj2, (Context) obj);
                break;
            case 6:
                bo.F0((bo) obj3, (qk) obj2, (boolean[]) obj);
                break;
            case 7:
                nn nnVar = (nn) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                org.telegram.ui.ActionBar.o2 o2Var2 = nnVar.a;
                o2Var2.finishPreviewFragment();
                chat.left = false;
                if (t1Var != null && t1Var.v != null) {
                    o2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(t1Var.v.e));
                }
                o2Var2.getMessagesController().addUserToChat(chat.id, o2Var2.getUserConfig().getCurrentUser(), 0, null, o2Var2, new bn(nnVar, chat, i11));
                break;
            case 8:
                wo woVar = (wo) obj3;
                org.telegram.ui.Cells.i6[] i6VarArr = (org.telegram.ui.Cells.i6[]) obj2;
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) obj;
                Integer num = (Integer) view.getTag();
                i6VarArr[0].a(num.intValue() == 0);
                i6VarArr[1].a(num.intValue() == 1);
                woVar.J0 = num.intValue() == 1;
                runnable = b3Var.a.dismissRunnable;
                runnable.run();
                woVar.p0(true, true);
                break;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((yr) obj3).c.a;
                Drawable[] drawableArr = PhotoViewer.U8;
                ArrayList arrayList = ((org.telegram.ui.Components.d71) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj4 = arrayList.get(i13);
                            i13++;
                            org.telegram.ui.Components.f71 f71Var = (org.telegram.ui.Components.f71) obj4;
                            if (f71Var.b()) {
                                document = f71Var.g;
                            }
                        } else {
                            long j10 = Long.MAX_VALUE;
                            org.telegram.ui.Components.f71 f71Var2 = null;
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                org.telegram.ui.Components.f71 f71Var3 = (org.telegram.ui.Components.f71) arrayList.get(i14);
                                if (f71Var3.k < j10 && org.telegram.ui.Components.h71.Y(f71Var3.m)) {
                                    j10 = f71Var3.k;
                                    f71Var2 = f71Var3;
                                }
                            }
                            document = f71Var2 != null ? f71Var2.g : ((org.telegram.ui.Components.f71) arrayList.get(0)).g;
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
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.y, 1, null, null, new qr0(photoViewer, i12));
                    }
                    photoViewer.o0.M(null, null);
                    break;
                }
                break;
            case 10:
                us usVar = (us) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.c5.O((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new ls(usVar, user, i12), usVar.r).o();
                break;
            case 11:
                gh0 gh0Var = (gh0) obj3;
                ((org.telegram.ui.Components.n70) obj2).u();
                int i15 = ((MessagesController.DialogFilter) obj).id;
                if (gh0Var.c.getCurrentPosition() != 0 || (wyVar = gh0Var.J) == null) {
                    if (gh0Var.J == null) {
                        gh0Var.l0(null);
                    }
                    gh0Var.I = Integer.valueOf(i15);
                    gh0Var.m0(0, true);
                    gh0Var.c.E(0);
                    break;
                } else {
                    wyVar.w4(i15);
                    break;
                }
            case 12:
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.g3 g3Var2 = g3VarArr[0];
                if (g3Var2 != null) {
                    g3Var2.dismiss();
                    g3VarArr[0] = null;
                    callback.run(str2);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.g3[] g3VarArr2 = (org.telegram.ui.ActionBar.g3[]) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (!((ci.d) obj3).N && (g3Var = g3VarArr2[0]) != null) {
                    g3Var.dismiss();
                    g3VarArr2[0] = null;
                    runnable2.run();
                    break;
                }
                break;
            case 14:
                ProfileActivity.U((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.k5) obj);
                break;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.o1) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveGalleryExceptions);
                saveToGallerySettingsActivity.Z();
                break;
        }
    }

    public /* synthetic */ z(org.telegram.ui.ActionBar.g3[] g3VarArr, Utilities.Callback callback, String str) {
        this.a = 12;
        this.b = g3VarArr;
        this.d = callback;
        this.c = str;
    }
}
