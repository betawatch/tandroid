package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x5 implements oy, org.telegram.ui.ActionBar.a2, v4, org.telegram.ui.Components.b5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.oj0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, ug1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x5(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.b5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 4:
                bo boVar = (bo) this.b;
                Uri uri = (Uri) this.c;
                boVar.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(boVar.getAccountInstance(), null, uri, boVar.T5, boVar.n5, boVar.X3, boVar.l5, null, null, null, null, 0, boVar.p5, z10, i10, boVar.R3, boVar.C8());
                break;
            case 5:
            default:
                nn nnVar = (nn) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                if (!z10) {
                    nnVar.getClass();
                    break;
                } else {
                    nnVar.a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.id, i10);
                    break;
                }
            case 6:
                bo boVar2 = (bo) this.b;
                boVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.c, boVar2.T5, boVar2.n5, boVar2.X3, null, false, null, null, null, z10, i10, 0, null, false));
                boVar2.Y.setFieldText("");
                boVar2.e9(false);
                break;
        }
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean K(uy uyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.oj0
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        hi hiVar = (hi) this.b;
        MessageObject messageObject = (MessageObject) this.c;
        bo boVar = hiVar.p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", boVar.T5);
        boVar.presentFragment(new ProfileActivity(bundle, null));
        boVar.A7(true);
    }

    @Override // org.telegram.ui.v4
    public void b(d5 d5Var) {
        lb lbVar = (lb) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        int ordinal = d5Var.ordinal();
        if (ordinal == 0) {
            lbVar.a(user);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        qb qbVar = lbVar.a;
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.n2 n2Var = qbVar.n;
            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                n2Var.presentFragment(new bo(bundle));
            }
        }
    }

    @Override // org.telegram.ui.ug1
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((pq) this.b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                nf.f.o(((ub) this.b).getParentActivity(), (String) this.c, true);
                break;
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            default:
                org.telegram.ui.Components.mf mfVar = (org.telegram.ui.Components.mf) this.b;
                boolean[] zArr = (boolean[]) this.c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                uy uyVar = (uy) mfVar.b;
                ArrayList arrayList = (ArrayList) mfVar.c;
                uyVar.getClass();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Long l4 = (Long) arrayList.get(i11);
                    long longValue = l4.longValue();
                    if (z10) {
                        uyVar.getMessagesController().reportSpam(longValue, uyVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        uyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    uyVar.getMessagesController().blockPeer(longValue);
                }
                uyVar.b4(false);
                break;
            case 3:
                ld.V((ld) this.b, (TLRPC.Chat) this.c);
                break;
            case 13:
                kp kpVar = (kp) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
                tL_channels_updateUsername.username = "";
                kpVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new xo(kpVar, 0), 64);
                break;
            case 17:
                org.telegram.ui.Components.e0.P((org.telegram.ui.Components.e0) this.b, (TL_aicompose.TL_aiComposeTone) this.c, b2Var);
                break;
            case 18:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                q0.a aVar = (q0.a) this.c;
                atomicBoolean.set(true);
                aVar.accept(Boolean.FALSE);
                break;
            case 19:
                int[] iArr = (int[]) this.b;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.c;
                int i12 = iArr[0];
                intCallback.run(i12 == 0 ? RichMessageLayout.PART_MAX_HEIGHT_DP : i12 == 1 ? 3600 : i12 == 2 ? 28800 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            case 20:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.b;
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                LocaleController.LocaleInfo languageFromDict = LocaleController.getInstance().getLanguageFromDict(tL_langPackLanguage.official ? "remote_" + tL_langPackLanguage.lang_code : "unofficial_" + tL_langPackLanguage.lang_code);
                if (languageFromDict == null) {
                    languageFromDict = new LocaleController.LocaleInfo();
                    languageFromDict.name = tL_langPackLanguage.native_name;
                    languageFromDict.nameEnglish = tL_langPackLanguage.name;
                    languageFromDict.shortName = tL_langPackLanguage.lang_code;
                    languageFromDict.baseLangCode = tL_langPackLanguage.base_lang_code;
                    languageFromDict.pluralLangCode = tL_langPackLanguage.plural_code;
                    languageFromDict.isRtl = tL_langPackLanguage.rtl;
                    if (tL_langPackLanguage.official) {
                        languageFromDict.pathToFile = "remote";
                    } else {
                        languageFromDict.pathToFile = "unofficial";
                    }
                }
                LocaleController.getInstance().applyLanguage(languageFromDict, true, false, false, true, UserConfig.selectedAccount, null);
                launchActivity.u0(true);
                break;
            case 21:
                nf nfVar = (nf) this.b;
                EditText editText = (EditText) this.c;
                b2Var.dismiss();
                nfVar.run(editText.getText().toString());
                break;
            case 22:
                org.telegram.ui.Components.d4 d4Var = (org.telegram.ui.Components.d4) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String trim = d4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim) ? false : org.telegram.ui.Components.c5.a.matcher(trim.trim()).matches()) {
                    callback.run(trim);
                    b2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(d4Var);
                    break;
                }
            case 23:
                String str = (String) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(n2Var.getCurrentAccount()).getInviteText(1));
                    n2Var.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 24:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.b;
                org.telegram.ui.Components.uc0 uc0Var = (org.telegram.ui.Components.uc0) this.c;
                int i13 = encryptedChat.ttl;
                int value = uc0Var.getValue();
                if (value >= 0 && value < 16) {
                    encryptedChat.ttl = value;
                } else if (value == 16) {
                    encryptedChat.ttl = 30;
                } else if (value == 17) {
                    encryptedChat.ttl = 60;
                } else if (value == 18) {
                    encryptedChat.ttl = 3600;
                } else if (value == 19) {
                    encryptedChat.ttl = 86400;
                } else if (value == 20) {
                    encryptedChat.ttl = 604800;
                }
                if (i13 != encryptedChat.ttl) {
                    SecretChatHelper.getInstance(UserConfig.selectedAccount).sendTTLMessage(encryptedChat, null);
                    MessagesStorage.getInstance(UserConfig.selectedAccount).updateEncryptedChatTTL(encryptedChat);
                    break;
                }
                break;
            case 25:
                ((da) this.b).run(((boolean[]) this.c)[0]);
                break;
            case 26:
                String str2 = (String) this.b;
                Runnable runnable = (Runnable) this.c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + str2);
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 27:
                ((MessagesStorage.BooleanCallback) this.b).run(((boolean[]) this.c)[0]);
                break;
            case 28:
                ((Utilities.Callback) this.b).run(Boolean.valueOf(((boolean[]) this.c)[0]));
                break;
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        zn znVar = (zn) this.b;
        org.telegram.ui.Components.cc0 cc0Var = (org.telegram.ui.Components.cc0) this.c;
        Pair pair = (Pair) obj;
        znVar.getClass();
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = (Bitmap) pair.second;
        org.telegram.ui.ActionBar.d4 d4Var = znVar.f;
        if (d4Var == null || longValue != d4Var.i(znVar.G ? 1 : 0) || bitmap == null) {
            return;
        }
        cc0Var.x = bitmap;
        cc0Var.i();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        bo.g0((bo) this.b, (Context) this.c, tL_error);
        return false;
    }

    @Override // org.telegram.ui.oy
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        b6 b6Var = (b6) this.b;
        uy uyVar2 = (uy) this.c;
        ArrayList arrayList2 = b6Var.c;
        uyVar2.finishFragment();
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean z12 = true;
            if (i13 >= arrayList.size()) {
                break;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= b6Var.d.size()) {
                    z12 = false;
                    break;
                }
                if (((CacheByChatsController.KeepMediaException) b6Var.d.get(i14)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId) {
                    keepMediaException = (CacheByChatsController.KeepMediaException) b6Var.d.get(i14);
                    break;
                }
                i14++;
            }
            if (!z12) {
                int i15 = CacheByChatsController.KEEP_MEDIA_FOREVER;
                if (b6Var.getMessagesController().getCacheByChatsController().getKeepMedia(b6Var.e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = b6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        b6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(b6Var.e, b6Var.d);
        b6Var.U();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((a6) arrayList2.get(i16)).c != null && ((a6) arrayList2.get(i16)).c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            b6Var.b.u0(i12);
            AndroidUtilities.runOnUIThread(new l4(2, b6Var, keepMediaException), 150L);
        }
        return true;
    }

    public /* synthetic */ x5(lb lbVar, org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        this.a = 2;
        this.b = lbVar;
        this.c = user;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        switch (this.a) {
            case 12:
                wo woVar = (wo) this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                woVar.getClass();
                b2Var.dismiss();
                woVar.N0 = false;
                if (j3 != 0) {
                    woVar.w0 = j3;
                    TLRPC.Chat chat = woVar.getMessagesController().getChat(Long.valueOf(j3));
                    woVar.x0 = chat;
                    TLRPC.ChatFull chatFull = woVar.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    boolean z10 = chat.forum_tabs != woVar.H0;
                    woVar.getMessagesController().toggleChannelForum(woVar.w0, woVar.F0, woVar.H0);
                    TLRPC.Chat chat2 = woVar.x0;
                    chat2.forum = woVar.F0;
                    chat2.forum_tabs = woVar.H0;
                    if (z10) {
                        woVar.q0();
                        break;
                    }
                }
                break;
            case 13:
            default:
                sp spVar = (sp) this.b;
                Runnable runnable = (Runnable) this.c;
                if (j3 == 0) {
                    spVar.getClass();
                    break;
                } else {
                    wp wpVar = spVar.x.d;
                    if (wpVar.s) {
                        wpVar.v.set(0, wpVar.getMessagesController().getChat(Long.valueOf(j3)));
                    } else {
                        wpVar.E = j3;
                        wpVar.f = wpVar.getMessagesController().getChat(Long.valueOf(j3));
                    }
                    runnable.run();
                    break;
                }
            case 14:
                wp wpVar2 = (wp) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                if (j3 == 0) {
                    wpVar2.getClass();
                    break;
                } else {
                    wpVar2.getMessagesController().toggleChannelInvitesHistory(j3, false);
                    wpVar2.Y(wpVar2.getMessagesController().getChat(Long.valueOf(j3)), n2Var);
                    break;
                }
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        nj njVar = (nj) this.b;
        long j3 = ((TLRPC.User) this.c).id;
        bo boVar = njVar.b;
        long j10 = boVar.d4;
        if (j3 != j10) {
            return;
        }
        boVar.qa(j10, false);
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
        AtomicReference atomicReference = (AtomicReference) this.c;
        FileLog.e("mlkit: failed to detect language in message");
        atomicBoolean.set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }
}
