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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        uy uyVar;
        org.telegram.ui.ActionBar.f3 f3Var;
        int i10 = this.a;
        int i11 = 3;
        int i12 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                i4 i4Var = (i4) obj3;
                String str = (String) obj2;
                m3 m3Var = (m3) obj;
                i4Var.h0.k(false);
                AndroidUtilities.hideKeyboard(i4Var.h0.b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.yc(m3Var.f, null).k(false).k(true);
                break;
            case 1:
                e7 e7Var = (e7) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                Bundle bundle = new Bundle();
                ai.b bVar = ((m7) obj2).d;
                long j3 = bVar.b;
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putInt("message_id", bVar.g);
                n2Var.presentFragment(new co(bundle));
                e7Var.d.v.dismiss();
                org.telegram.ui.ActionBar.n1 n1Var = e7Var.a;
                if (n1Var != null) {
                    n1Var.d(true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.pj0 pj0Var = (org.telegram.ui.Components.pj0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (pj0Var == null || pj0Var.w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    break;
                }
                break;
            case 3:
                co coVar = (co) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (coVar.getParentActivity() != null) {
                    if (coVar.O0.getVisibility() != 0 || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        coVar.Y.c0(keyboardInlineButton, messageObject, messageObject, null);
                        break;
                    }
                }
                break;
            case 4:
                ((co) obj3).va((org.telegram.ui.Cells.a0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                break;
            case 5:
                co.j1((co) obj3, (boolean[]) obj2, (Context) obj);
                break;
            case 6:
                co.F0((co) obj3, (pk) obj2, (boolean[]) obj);
                break;
            case 7:
                on onVar = (on) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = onVar.a;
                n2Var2.finishPreviewFragment();
                chat.left = false;
                if (t1Var != null && t1Var.v != null) {
                    n2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(t1Var.v.e));
                }
                n2Var2.getMessagesController().addUserToChat(chat.id, n2Var2.getUserConfig().getCurrentUser(), 0, null, n2Var2, new cn(onVar, chat, i11));
                break;
            case 8:
                xo xoVar = (xo) obj3;
                org.telegram.ui.Cells.i6[] i6VarArr = (org.telegram.ui.Cells.i6[]) obj2;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj;
                Integer num = (Integer) view.getTag();
                i6VarArr[0].a(num.intValue() == 0);
                i6VarArr[1].a(num.intValue() == 1);
                xoVar.J0 = num.intValue() == 1;
                runnable = a3Var.a.dismissRunnable;
                runnable.run();
                xoVar.p0(true, true);
                break;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((xr) obj3).c.a;
                Drawable[] drawableArr = PhotoViewer.T8;
                ArrayList arrayList = ((org.telegram.ui.Components.c71) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj4 = arrayList.get(i13);
                            i13++;
                            org.telegram.ui.Components.e71 e71Var = (org.telegram.ui.Components.e71) obj4;
                            if (e71Var.b()) {
                                document = e71Var.g;
                            }
                        } else {
                            long j10 = Long.MAX_VALUE;
                            org.telegram.ui.Components.e71 e71Var2 = null;
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                org.telegram.ui.Components.e71 e71Var3 = (org.telegram.ui.Components.e71) arrayList.get(i14);
                                if (e71Var3.k < j10 && org.telegram.ui.Components.g71.Y(e71Var3.m)) {
                                    j10 = e71Var3.k;
                                    e71Var2 = e71Var3;
                                }
                            }
                            document = e71Var2 != null ? e71Var2.g : ((org.telegram.ui.Components.e71) arrayList.get(0)).g;
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
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.y, 1, null, null, new or0(photoViewer, i12));
                    }
                    photoViewer.o0.M(null, null);
                    break;
                }
                break;
            case 10:
                ss ssVar = (ss) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.e5.O((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new js(ssVar, user, i12), ssVar.r).o();
                break;
            case 11:
                eh0 eh0Var = (eh0) obj3;
                ((org.telegram.ui.Components.n70) obj2).u();
                int i15 = ((MessagesController.DialogFilter) obj).id;
                if (eh0Var.c.getCurrentPosition() != 0 || (uyVar = eh0Var.J) == null) {
                    if (eh0Var.J == null) {
                        eh0Var.l0(null);
                    }
                    eh0Var.I = Integer.valueOf(i15);
                    eh0Var.m0(0, true);
                    eh0Var.c.D(0);
                    break;
                } else {
                    uyVar.w4(i15);
                    break;
                }
            case 12:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.f3 f3Var2 = f3VarArr[0];
                if (f3Var2 != null) {
                    f3Var2.dismiss();
                    f3VarArr[0] = null;
                    callback.run(str2);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.f3[] f3VarArr2 = (org.telegram.ui.ActionBar.f3[]) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (!((di.d) obj3).N && (f3Var = f3VarArr2[0]) != null) {
                    f3Var.dismiss();
                    f3VarArr2[0] = null;
                    runnable2.run();
                    break;
                }
                break;
            case 14:
                ProfileActivity.U((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.j5) obj);
                break;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.n1) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveGalleryExceptions);
                saveToGallerySettingsActivity.Z();
                break;
        }
    }

    public /* synthetic */ z(org.telegram.ui.ActionBar.f3[] f3VarArr, Utilities.Callback callback, String str) {
        this.a = 12;
        this.b = f3VarArr;
        this.d = callback;
        this.c = str;
    }
}
