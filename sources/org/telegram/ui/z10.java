package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsLoadingObserver;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class z10 implements org.telegram.ui.Components.al0, org.telegram.ui.ActionBar.a2, oy, ContactsLoadingObserver.Callback, org.telegram.ui.Components.av0, org.telegram.ui.Components.bl0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, au, FileLoader.FileResolver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z10(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean K(uy uyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean a(int i10, View view) {
        id0 id0Var = (id0) this.b;
        Context context = (Context) this.c;
        if (id0Var.G0 == 2) {
            Object J = id0Var.T.J(i10);
            if (J instanceof cd0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, id0Var.getParentActivity(), id0Var.getResourceProvider(), true, true);
                f1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                f1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                f1Var.setOnClickListener(new tv(16, id0Var, (cd0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                ad0 ad0Var = new ad0(id0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                id0Var.I0 = ad0Var;
                ad0Var.setOutsideTouchable(true);
                id0Var.I0.setClippingEnabled(true);
                id0Var.I0.setInputMethodMode(2);
                id0Var.I0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                id0Var.I0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                id0Var.I0.b();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.au
    public void a1(vt vtVar) {
        pn0 pn0Var = (pn0) this.b;
        int intValue = ((Integer) ((View) this.c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = pn0Var.Y[intValue];
        if (intValue == 5) {
            pn0Var.s = vtVar.d;
        } else {
            pn0Var.v = vtVar.d;
        }
        editTextBoldCursor.setText(vtVar.a);
    }

    @Override // org.telegram.ui.Components.av0
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        int[] iArr = (int[]) this.c;
        Pattern pattern = LaunchActivity.B1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        id0 id0Var = new id0(2);
        id0Var.u0(sharingLocationInfo.messageObject);
        id0Var.F0 = new bi.p1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.p0(id0Var);
    }

    @Override // org.telegram.ui.Components.al0
    public void d(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 0:
                FiltersSetupActivity.U((FiltersSetupActivity) this.b, (Context) this.c, view, i10);
                break;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.b, (Context) this.c, view, i10, f7, f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean d1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap g02;
        id0 id0Var = (id0) this.b;
        cd0 cd0Var = (cd0) this.c;
        id0Var.getClass();
        if (!z10 || z11 || cd0Var.e == null || (g02 = id0Var.g0(cd0Var)) == null) {
            return;
        }
        cd0Var.e.setIcon(g02);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ConferenceCall conferenceCall;
        ArrayList<Long> arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i11 = this.a;
        org.telegram.ui.ActionBar.b2 b2Var2 = null;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 1:
                e20 e20Var = (e20) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = e20Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(filtersSetupActivity.getParentActivity(), 3, null);
                    b2Var3.g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = dialogFilter.id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new aa(e20Var, b2Var2, dialogFilter, 10));
                break;
            case 2:
                j60 j60Var = (j60) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = j60Var.d;
                if (!j60Var.o1()) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(j60Var.i1(), (TLRPC.User) null, chat, false, false);
                        j60Var.k1().k(0L, 32, chat, null, null, null);
                        break;
                    } else {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(j60Var.i1(), user);
                        j60Var.k1().k(0L, 32, user, null, null, null);
                        break;
                    }
                } else {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user2 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user2.id);
                        j60Var.a1.addKickedUser(user2.id);
                        j60Var.k1().k(0L, 102, user2, null, null, null);
                        break;
                    }
                }
                break;
            case 3:
                f70 f70Var = (f70) obj2;
                f70Var.x.i((TLRPC.User) obj);
                if (f70Var.f.r.length() > 0) {
                    f70Var.f.r.setText((CharSequence) null);
                    break;
                }
                break;
            case 4:
                f70 f70Var2 = (f70) obj2;
                f70Var2.getClass();
                org.telegram.ui.Cells.z1 z1Var = ((org.telegram.ui.Cells.z1[]) obj)[0];
                if (z1Var != null && z1Var.b()) {
                    i12 = 100;
                }
                f70Var2.m0(i12);
                break;
            case 5:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 20:
            case 23:
            case 26:
            case 27:
            default:
                boolean[] zArr = (boolean[]) obj;
                PhotoViewer photoViewer = ((rs0) obj2).b;
                av0 av0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.a7;
                ArrayList arrayList3 = photoViewer.d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!av0Var.M()) {
                    photoViewer.G0(false, false);
                    break;
                } else if (!arrayList4.isEmpty()) {
                    int i13 = photoViewer.P4;
                    if (i13 >= 0 && i13 < arrayList4.size()) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(photoViewer.P4);
                        if (messageObject.isSent()) {
                            photoViewer.G0(false, false);
                            ArrayList<Integer> arrayList7 = new ArrayList<>();
                            int i14 = photoViewer.v;
                            if (i14 != 0) {
                                arrayList7.add(Integer.valueOf(i14));
                            } else {
                                arrayList7.add(Integer.valueOf(messageObject.getId()));
                            }
                            if (!DialogObject.isEncryptedDialog(messageObject.getDialogId()) || messageObject.messageOwner.random_id == 0) {
                                arrayList = null;
                                encryptedChat = null;
                            } else {
                                ArrayList<Long> arrayList8 = new ArrayList<>();
                                arrayList8.add(Long.valueOf(messageObject.messageOwner.random_id));
                                arrayList = arrayList8;
                                encryptedChat = MessagesController.getInstance(photoViewer.T).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(messageObject.getDialogId())));
                            }
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList7, arrayList, encryptedChat, messageObject.getDialogId(), messageObject.getQuickReplyId(), zArr[0], messageObject.getChatMode());
                            break;
                        }
                    }
                } else if (!arrayList6.isEmpty()) {
                    int i15 = photoViewer.P4;
                    if (i15 >= 0 && i15 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.P4);
                        if (message != null) {
                            ArrayList<Integer> arrayList9 = new ArrayList<>();
                            arrayList9.add(Integer.valueOf(message.id));
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (!photoViewer.I1()) {
                            TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                            if (photo != null) {
                                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                tL_inputPhoto.id = photo.id;
                                tL_inputPhoto.access_hash = photo.access_hash;
                                byte[] bArr = photo.file_reference;
                                tL_inputPhoto.file_reference = bArr;
                                if (bArr == null) {
                                    tL_inputPhoto.file_reference = new byte[0];
                                }
                                if (photoViewer.z5 > 0) {
                                    MessagesController.getInstance(photoViewer.T).deleteUserPhoto(tL_inputPhoto);
                                }
                                MessagesStorage.getInstance(photoViewer.T).clearUserPhoto(photoViewer.z5, photo.id);
                                arrayList2.remove(photoViewer.P4);
                                photoViewer.c7.remove(photoViewer.P4);
                                photoViewer.b7.remove(photoViewer.P4);
                                arrayList3.remove(photoViewer.P4);
                                arrayList6.remove(photoViewer.P4);
                                if (arrayList2.isEmpty()) {
                                    photoViewer.G0(false, false);
                                } else {
                                    int i16 = photoViewer.P4;
                                    if (i16 >= arrayList6.size()) {
                                        i16 = arrayList6.size() - 1;
                                    }
                                    photoViewer.P4 = -1;
                                    photoViewer.B2(i16);
                                }
                                if (message == null) {
                                    NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                                    break;
                                }
                            }
                        } else {
                            if (photoViewer.z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.T).changeChatAvatar(-photoViewer.z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            break;
                        }
                    }
                } else if (!arrayList5.isEmpty() && photoViewer.d != null) {
                    arrayList5.remove(photoViewer.P4);
                    photoViewer.d.B(photoViewer.P4);
                    if (!arrayList5.isEmpty()) {
                        int i17 = photoViewer.P4;
                        if (i17 >= arrayList5.size()) {
                            i17 = arrayList5.size() - 1;
                        }
                        photoViewer.P4 = -1;
                        photoViewer.B2(i17);
                        break;
                    } else {
                        photoViewer.G0(false, false);
                        break;
                    }
                }
                break;
            case 6:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                break;
            case 7:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).p0((wg0) obj);
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.u0(true);
                break;
            case 16:
                ((me0) obj2).E.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
            case 17:
                pe0 pe0Var = (pe0) obj2;
                pe0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", pe0Var.r);
                bundle.putString("requestPhone", pe0Var.s);
                bundle.putString("phoneHash", pe0Var.v);
                bundle.putString("phoneCode", pe0Var.w);
                pe0Var.y.u1(7, true, bundle, false);
                break;
            case 19:
                zf0.o((zf0) obj2, (Context) obj);
                break;
            case 21:
                pn0 pn0Var = (pn0) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!pn0Var.v0) {
                    pn0Var.s1.clear();
                }
                pn0Var.t1.clear();
                sm0 sm0Var = (sm0) pn0Var.B1;
                sm0Var.d.j1(pn0Var.E, pn0Var.F, pn0Var.G, zArr2[0], null, null, sm0Var.b);
                pn0Var.finishFragment();
                break;
            case 22:
                int[] iArr = ((pn0) obj2).x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                break;
            case 24:
                pn0.U((pn0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                break;
            case 25:
                xo0 xo0Var = (xo0) obj2;
                xo0Var.b0 = true;
                xo0Var.a0.email_unconfirmed_pattern = (String) obj;
                xo0Var.J0();
                break;
            case 28:
                PhotoViewer.C(((rs0) obj2).b, (ArrayList) obj);
                break;
        }
    }

    @Override // org.telegram.messenger.FileLoader.FileResolver
    public File getFile() {
        switch (this.a) {
            case 26:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                return FileLoader.getInstance(photoViewer.T).getPathToAttach((TLObject) this.c, true);
            default:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                return FileLoader.getInstance(photoViewer2.T).getPathToMessage((TLRPC.Message) this.c);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 15:
                ge0 ge0Var = (ge0) this.b;
                com.google.android.gms.internal.clearcut.u0 u0Var = (com.google.android.gms.internal.clearcut.u0) this.c;
                wg0 wg0Var = ge0Var.W;
                if (wg0Var.getParentActivity() != null) {
                    wg0Var.getParentActivity().startActivityForResult(u0Var.f(), 200);
                    break;
                }
                break;
            default:
                lf0 lf0Var = (lf0) this.b;
                com.google.android.gms.internal.clearcut.u0 u0Var2 = (com.google.android.gms.internal.clearcut.u0) this.c;
                wg0 wg0Var2 = lf0Var.E;
                if (wg0Var2.getParentActivity() != null && !wg0Var2.getParentActivity().isFinishing()) {
                    wg0Var2.getParentActivity().startActivityForResult(u0Var2.f(), 200);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ContactsLoadingObserver.Callback
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        Intent intent = (Intent) this.c;
        Pattern pattern = LaunchActivity.B1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void q0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.oy
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        p80 p80Var = (p80) this.b;
        uy uyVar2 = (uy) this.c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = p80Var.f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        p80Var.d0.saveKeepMediaExceptions(p80Var.c0, p80Var.f0);
        Bundle bundle = new Bundle();
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, p80Var.c0);
        m80 m80Var = new m80(bundle, uyVar2);
        m80Var.d = p80Var.f0;
        m80Var.U();
        p80Var.g0.presentFragment(m80Var);
        AndroidUtilities.runOnUIThread(new yt(29, m80Var, keepMediaException), 150L);
        return true;
    }

    private final /* synthetic */ void c(View view, float f7, float f10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }
}
