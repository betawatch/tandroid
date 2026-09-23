package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.a2, ly, w4, org.telegram.ui.Components.d5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.pj0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, mg1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ly
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 6:
                xn xnVar = (xn) this.b;
                Uri uri = (Uri) this.c;
                xnVar.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(xnVar.getAccountInstance(), null, uri, xnVar.T5, xnVar.n5, xnVar.X3, xnVar.l5, null, null, null, null, 0, xnVar.p5, z10, i10, xnVar.R3, xnVar.C8());
                break;
            case 7:
            default:
                jn jnVar = (jn) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                if (!z10) {
                    jnVar.getClass();
                    break;
                } else {
                    jnVar.a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.id, i10);
                    break;
                }
            case 8:
                xn xnVar2 = (xn) this.b;
                xnVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.c, xnVar2.T5, xnVar2.n5, xnVar2.X3, null, false, null, null, null, z10, i10, 0, null, false));
                xnVar2.Y.setFieldText("");
                xnVar2.e9(false);
                break;
        }
    }

    @Override // org.telegram.ui.ly
    public /* synthetic */ boolean K(ry ryVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.pj0
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        ei eiVar = (ei) this.b;
        MessageObject messageObject = (MessageObject) this.c;
        xn xnVar = eiVar.p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", xnVar.T5);
        xnVar.presentFragment(new ProfileActivity(bundle, null));
        xnVar.A7(true);
    }

    @Override // org.telegram.ui.w4
    public void b(e5 e5Var) {
        lb lbVar = (lb) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        int ordinal = e5Var.ordinal();
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
                n2Var.presentFragment(new xn(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
        i4 i4Var = (i4) this.b;
        m3 m3Var = (m3) this.c;
        if (i4Var.K == null || i10 - 1 >= 0) {
            org.telegram.ui.Cells.r9 r9Var = i4Var.O0;
            if (r9Var != null) {
                if (r9Var.y()) {
                    i4Var.O0.f(false);
                    return;
                }
                i4Var.O0.f(false);
            }
            g4 adapter = m3Var.getAdapter();
            if ((view instanceof p3) && adapter.E != null) {
                p3 p3Var = (p3) view;
                if (i4Var.G0 == 0) {
                    if ((!p3Var.c || f7 >= view.getMeasuredWidth() / 2) && !p3Var.d) {
                        TLObject userOrChat = MessagesController.getInstance(i4Var.X).getUserOrChat("previews");
                        if (userOrChat instanceof TLRPC.TL_user) {
                            i4Var.P(adapter.E.id, (TLRPC.User) userOrChat);
                            return;
                        }
                        int i11 = UserConfig.selectedAccount;
                        long j3 = adapter.E.id;
                        i4Var.b0(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        i4Var.G0 = ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new org.telegram.messenger.ce(i4Var, i11, j3));
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 < 0 || i10 >= adapter.d.size()) {
                return;
            }
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i10);
            TL_iv.PageBlock z10 = i4.z(pageBlock);
            if (z10 instanceof w3) {
                z10 = ((w3) z10).b;
            }
            if (z10 instanceof TL_iv.pageBlockChannel) {
                MessagesController.getInstance(i4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z10).channel), i4Var.M, 2);
                i4Var.o(false, true);
                return;
            }
            if (z10 instanceof c4) {
                c4 c4Var = (c4) z10;
                i4Var.Q(c4Var.a.articles.get(c4Var.b).url, null, null);
                return;
            }
            if (z10 instanceof TL_iv.pageBlockDetails) {
                View y3 = i4.y(view);
                if (y3 instanceof m1) {
                    i4Var.d = null;
                    i4Var.f = null;
                    if (adapter.e.indexOf(pageBlock) < 0) {
                        return;
                    }
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z10;
                    pageblockdetails.open = !pageblockdetails.open;
                    int h = adapter.h();
                    adapter.M();
                    int abs = Math.abs(adapter.h() - h);
                    m1 m1Var = (m1) y3;
                    m1Var.f.a(pageblockdetails.open ? 0.0f : 1.0f);
                    m1Var.invalidate();
                    if (abs != 0) {
                        if (pageblockdetails.open) {
                            adapter.s(i10 + 1, abs);
                        } else {
                            adapter.t(i10 + 1, abs);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.mg1
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((lq) this.b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        String str;
        switch (this.a) {
            case 1:
                q4 q4Var = (q4) this.b;
                View view = (View) this.c;
                q4Var.getClass();
                b2Var.dismiss();
                q4Var.W(view, true);
                break;
            case 3:
                nf.f.o(((ub) this.b).getParentActivity(), (String) this.c, true);
                break;
            case 5:
                ld.V((ld) this.b, (TLRPC.Chat) this.c);
                break;
            case 15:
                gp gpVar = (gp) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
                tL_channels_updateUsername.username = "";
                gpVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new to(gpVar, 0), 64);
                break;
            case 19:
                org.telegram.ui.Components.e0.P((org.telegram.ui.Components.e0) this.b, (TL_aicompose.TL_aiComposeTone) this.c, b2Var);
                break;
            case 20:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                q0.a aVar = (q0.a) this.c;
                atomicBoolean.set(true);
                aVar.accept(Boolean.FALSE);
                break;
            case 21:
                int[] iArr = (int[]) this.b;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.c;
                int i11 = iArr[0];
                intCallback.run(i11 == 0 ? RichMessageLayout.PART_MAX_HEIGHT_DP : i11 == 1 ? 3600 : i11 == 2 ? 28800 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            case 22:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.b;
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                if (tL_langPackLanguage.official) {
                    str = "remote_" + tL_langPackLanguage.lang_code;
                } else {
                    str = "unofficial_" + tL_langPackLanguage.lang_code;
                }
                LocaleController.LocaleInfo languageFromDict = LocaleController.getInstance().getLanguageFromDict(str);
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
            case 23:
                oc ocVar = (oc) this.b;
                EditText editText = (EditText) this.c;
                b2Var.dismiss();
                ocVar.run(editText.getText().toString());
                break;
            case 24:
                org.telegram.ui.Components.f4 f4Var = (org.telegram.ui.Components.f4) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String trim = f4Var.getText().toString().trim();
                if (!(TextUtils.isEmpty(trim) ? false : org.telegram.ui.Components.e5.a.matcher(trim.trim()).matches())) {
                    AndroidUtilities.shakeView(f4Var);
                    break;
                } else {
                    callback.run(trim);
                    b2Var.dismiss();
                    break;
                }
            case 25:
                String str2 = (String) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str2, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(n2Var.getCurrentAccount()).getInviteText(1));
                    n2Var.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 26:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.b;
                org.telegram.ui.Components.tc0 tc0Var = (org.telegram.ui.Components.tc0) this.c;
                int i12 = encryptedChat.ttl;
                int value = tc0Var.getValue();
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
                if (i12 != encryptedChat.ttl) {
                    SecretChatHelper.getInstance(UserConfig.selectedAccount).sendTTLMessage(encryptedChat, null);
                    MessagesStorage.getInstance(UserConfig.selectedAccount).updateEncryptedChatTTL(encryptedChat);
                    break;
                }
                break;
            case 27:
                ((da) this.b).run(((boolean[]) this.c)[0]);
                break;
            case 28:
                String str3 = (String) this.b;
                Runnable runnable = (Runnable) this.c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + str3);
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                ((MessagesStorage.BooleanCallback) this.b).run(((boolean[]) this.c)[0]);
                break;
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        vn vnVar = (vn) this.b;
        org.telegram.ui.Components.bc0 bc0Var = (org.telegram.ui.Components.bc0) this.c;
        Pair pair = (Pair) obj;
        vnVar.getClass();
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = (Bitmap) pair.second;
        org.telegram.ui.ActionBar.c4 c4Var = vnVar.f;
        if (c4Var == null || longValue != c4Var.i(vnVar.G ? 1 : 0) || bitmap == null) {
            return;
        }
        bc0Var.x = bitmap;
        bc0Var.i();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        xn.h0((xn) this.b, (Context) this.c, tL_error);
        return false;
    }

    @Override // org.telegram.ui.ly
    public boolean u(ry ryVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        b6 b6Var = (b6) this.b;
        ry ryVar2 = (ry) this.c;
        ArrayList arrayList2 = b6Var.c;
        ryVar2.finishFragment();
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
            AndroidUtilities.runOnUIThread(new m4(2, b6Var, keepMediaException), 150L);
        }
        return true;
    }

    public /* synthetic */ u(lb lbVar, org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        this.a = 4;
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
            case 14:
                so soVar = (so) this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                soVar.getClass();
                b2Var.dismiss();
                soVar.N0 = false;
                if (j3 != 0) {
                    soVar.w0 = j3;
                    TLRPC.Chat chat = soVar.getMessagesController().getChat(Long.valueOf(j3));
                    soVar.x0 = chat;
                    TLRPC.ChatFull chatFull = soVar.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    boolean z10 = chat.forum_tabs != soVar.H0;
                    soVar.getMessagesController().toggleChannelForum(soVar.w0, soVar.F0, soVar.H0);
                    TLRPC.Chat chat2 = soVar.x0;
                    chat2.forum = soVar.F0;
                    chat2.forum_tabs = soVar.H0;
                    if (z10) {
                        soVar.q0();
                        break;
                    }
                }
                break;
            case 15:
            default:
                op opVar = (op) this.b;
                Runnable runnable = (Runnable) this.c;
                if (j3 == 0) {
                    opVar.getClass();
                    break;
                } else {
                    sp spVar = opVar.x.d;
                    if (spVar.s) {
                        spVar.v.set(0, spVar.getMessagesController().getChat(Long.valueOf(j3)));
                    } else {
                        spVar.E = j3;
                        spVar.f = spVar.getMessagesController().getChat(Long.valueOf(j3));
                    }
                    runnable.run();
                    break;
                }
            case 16:
                sp spVar2 = (sp) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                if (j3 == 0) {
                    spVar2.getClass();
                    break;
                } else {
                    spVar2.getMessagesController().toggleChannelInvitesHistory(j3, false);
                    spVar2.Y(spVar2.getMessagesController().getChat(Long.valueOf(j3)), n2Var);
                    break;
                }
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        kj kjVar = (kj) this.b;
        long j3 = ((TLRPC.User) this.c).id;
        xn xnVar = kjVar.b;
        long j10 = xnVar.d4;
        if (j3 != j10) {
            return;
        }
        xnVar.qa(j10, false);
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

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
