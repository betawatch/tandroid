package org.telegram.ui;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.a = i10;
        this.b = callback;
        this.c = tLObject;
        this.d = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:416:0x0a74, code lost:
    
        if (r7 != 16) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0a7e, code lost:
    
        if (r7 == 3) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0a8a, code lost:
    
        if (r7 == 16) goto L378;
     */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0a93  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0a9e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z11;
        int i16;
        au auVar;
        int i17;
        String[] strArr;
        ArrayList arrayList;
        int i18;
        TLRPC.Chat chat;
        String translitString;
        String str;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        TLRPC.Message message;
        int i25 = 2;
        un unVar = null;
        int i26 = 5;
        int i27 = 0;
        int i28 = 1;
        switch (this.a) {
            case 0:
                dg0 dg0Var = (dg0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.c;
                int i29 = dg0Var.f0;
                ah0 ah0Var = dg0Var.s0;
                dg0Var.z(false);
                dg0Var.d0 = false;
                if (tL_error == null) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    dg0Var.w();
                    dg0Var.u();
                    i11 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                    UserConfig.getInstance(i11).setCurrentUser(user);
                    i12 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                    UserConfig.getInstance(i12).saveConfig(true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    i13 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                    MessagesStorage.getInstance(i13).putUsersAndChats(arrayList2, null, true, true);
                    i14 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                    MessagesController.getInstance(i14).putUser(user, false);
                    i15 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                    ah0Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                    if (i29 == 3) {
                        AndroidUtilities.endIncomingCall();
                    }
                    dg0Var.q(new qf0(dg0Var, i26));
                    break;
                } else {
                    dg0Var.e0 = tL_error.text;
                    dg0Var.d0 = false;
                    ah0Var.v1(false, true);
                    if (i29 == 3) {
                        int i30 = dg0Var.g0;
                        if (i30 != 4) {
                            i10 = 2;
                            if (i30 != 2) {
                                if (i30 != 17) {
                                    break;
                                }
                            }
                        }
                        dg0Var.t();
                        if (i29 == 15) {
                            NotificationCenter.getGlobalInstance().addObserver(dg0Var, NotificationCenter.didReceiveSmsCode);
                            z10 = true;
                        } else if (i29 == 2) {
                            z10 = true;
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(dg0Var, NotificationCenter.didReceiveSmsCode);
                        } else {
                            z10 = true;
                            if (i29 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(dg0Var, NotificationCenter.didReceiveCall);
                            }
                        }
                        dg0Var.c0 = z10;
                        if (i29 != 3) {
                            if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                            } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                dg0Var.y();
                                break;
                            } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                dg0Var.c(true);
                                ah0Var.u1(0, true, null, true);
                                ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            } else {
                                ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                            }
                            int i31 = 0;
                            while (true) {
                                hs hsVar = dg0Var.f;
                                ks[] ksVarArr = hsVar.f;
                                if (i31 >= ksVarArr.length) {
                                    hsVar.e = false;
                                    ksVarArr[0].requestFocus();
                                    break;
                                } else {
                                    ksVarArr[i31].setText("");
                                    i31++;
                                }
                            }
                        }
                    } else {
                        i10 = 2;
                    }
                    if (i29 == i10) {
                        int i32 = dg0Var.g0;
                        if (i32 != 4) {
                        }
                        dg0Var.t();
                        if (i29 == 15) {
                        }
                        dg0Var.c0 = z10;
                        if (i29 != 3) {
                        }
                    }
                    if (i29 == 4) {
                        int i33 = dg0Var.g0;
                        if (i33 != i10) {
                            if (i33 != 17) {
                                break;
                            }
                        }
                        dg0Var.t();
                    }
                    if (i29 == 15) {
                    }
                    dg0Var.c0 = z10;
                    if (i29 != 3) {
                    }
                }
                break;
            case 1:
                dg0 dg0Var2 = (dg0) this.b;
                Bundle bundle = (Bundle) this.d;
                TLObject tLObject2 = (TLObject) this.c;
                dg0Var2.o0 = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                dg0Var2.p0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    dg0Var2.g0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    dg0Var2.g0 = 16;
                }
                dg0Var2.s0.g1(bundle, tL_auth_sentCode, true);
                break;
            case 2:
                jg0 jg0Var = (jg0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                di.d dVar = jg0Var.b;
                ah0 ah0Var2 = jg0Var.v;
                jg0Var.s = -1;
                if (tLObject3 instanceof TLRPC.auth_SentCode) {
                    jg0Var.f = false;
                    dVar.setLoading(false);
                    org.telegram.ui.ActionBar.b5 parentLayout = ah0Var2.getParentLayout();
                    if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        org.telegram.ui.ActionBar.m2 m2Var = fragmentStack.isEmpty() ? null : (org.telegram.ui.ActionBar.m2) t8.b.g(1, fragmentStack);
                        ArrayList arrayList3 = new ArrayList(fragmentStack);
                        int size = arrayList3.size();
                        int i34 = 0;
                        while (i34 < size) {
                            Object obj = arrayList3.get(i34);
                            i34++;
                            org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj;
                            if ((m2Var2 instanceof ap0) && m2Var2 != m2Var) {
                                m2Var2.removeSelfFromStack();
                            }
                        }
                        if (m2Var instanceof ap0) {
                            z11 = true;
                            ((ActionBarLayout) parentLayout).l(true, false);
                            ah0Var2.g1(jg0Var.d, (TLRPC.auth_SentCode) tLObject3, z11);
                            break;
                        }
                    }
                    z11 = true;
                    ah0Var2.g1(jg0Var.d, (TLRPC.auth_SentCode) tLObject3, z11);
                } else if (tL_error2 != null) {
                    String str2 = tL_error2.text;
                    if (str2 == null || !str2.startsWith("FLOOD_WAIT_")) {
                        String str3 = tL_error2.text;
                        if (str3 == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(str3)) {
                            jg0Var.e = tL_error2.text;
                            jg0Var.f = false;
                            dVar.setLoading(false);
                            new org.telegram.ui.Components.zc(ah0Var2.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error2.text));
                            break;
                        } else {
                            ah0Var2.u1(0, true, null, true);
                            ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new fg0(jg0Var, 2), Integer.parseInt(tL_error2.text.substring(11)) * MediaDataController.MAX_STYLE_RUNS_COUNT);
                        break;
                    }
                }
                break;
            case 3:
                jg0 jg0Var2 = (jg0) this.b;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.c;
                ah0 ah0Var3 = jg0Var2.v;
                ah0Var3.e = true;
                ah0 ah0Var4 = (ah0) LaunchActivity.N();
                if (ah0Var4 == null) {
                    i16 = ((org.telegram.ui.ActionBar.m2) ah0Var3).currentAccount;
                    ah0Var4 = new ah0(i16);
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(ah0Var4);
                    }
                }
                ah0Var4.q1(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
                break;
            case 4:
                zg0 zg0Var = (zg0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                HashMap hashMap = (HashMap) this.d;
                fk0 fk0Var = zg0Var.a;
                if (tLObject4 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject4;
                    if (fk0Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList4 = zg0Var.E;
                        if (((String) hashMap.get(upperCase)) != null && arrayList4 != null) {
                            int i35 = 0;
                            while (true) {
                                if (i35 >= arrayList4.size()) {
                                    auVar = null;
                                } else if (arrayList4.get(i35) == null || !((au) arrayList4.get(i35)).a.equals(upperCase)) {
                                    i35++;
                                } else {
                                    auVar = (au) arrayList4.get(i35);
                                }
                            }
                            if (auVar != null) {
                                fk0Var.setText(auVar.c);
                                zg0Var.x = 0;
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                di0 di0Var = (di0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.c;
                if (tL_error3 != null) {
                    di0Var.getClass();
                    break;
                } else {
                    di0 di0Var2 = di0Var.s0.a;
                    int i36 = 0;
                    while (true) {
                        ArrayList arrayList5 = di0Var2.j0;
                        if (i36 >= arrayList5.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList5.get(i36)).link.equals(tL_chatInviteExported.link)) {
                            uh0 f02 = di0Var2.f0();
                            arrayList5.remove(i36);
                            di0Var2.h0(f02);
                            break;
                        } else {
                            i36++;
                        }
                    }
                }
            case 6:
                AndroidUtilities.runOnUIThread(new se0(16, (mt) this.c, MessagesStorage.getInstance(((hk0) this.b).currentAccount).getUser(((TLRPC.TL_contact) this.d).user_id)));
                break;
            case 7:
                hk0.n((hk0) this.b, (TLObject) this.c, (mt) this.d);
                break;
            case 8:
                vk0 vk0Var = (vk0) this.b;
                String str4 = (String) this.d;
                ArrayList arrayList6 = (ArrayList) this.c;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = vk0Var.n;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0(vk0Var, new ArrayList(), new ArrayList(), new ArrayList(), 23));
                    break;
                } else {
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString2) || translitString2.length() == 0) {
                        translitString2 = null;
                    }
                    int i37 = (translitString2 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i37];
                    strArr2[0] = lowerCase;
                    if (translitString2 != null) {
                        strArr2[1] = translitString2;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    String[] strArr3 = new String[2];
                    int i38 = 0;
                    while (i38 < arrayList6.size()) {
                        zk0 zk0Var = (zk0) arrayList6.get(i38);
                        if (DialogObject.isEncryptedDialog(zk0Var.d)) {
                            TLRPC.EncryptedChat l4 = org.telegram.messenger.g0.l(notificationsCustomSettingsActivity.getMessagesController(), zk0Var.d);
                            if (l4 != null) {
                                i17 = i27;
                                strArr = strArr2;
                                TLRPC.User user2 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(l4.user_id));
                                if (user2 != null) {
                                    strArr3[i17] = ContactsController.formatName(user2.first_name, user2.last_name);
                                    strArr3[i28] = UserObject.getPublicUsername(user2);
                                }
                            } else {
                                i17 = i27;
                                strArr = strArr2;
                            }
                        } else {
                            i17 = i27;
                            strArr = strArr2;
                            if (DialogObject.isUserDialog(zk0Var.d)) {
                                TLRPC.User user3 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(zk0Var.d));
                                if (user3 != null && !user3.deleted) {
                                    strArr3[i17] = ContactsController.formatName(user3.first_name, user3.last_name);
                                    strArr3[i28] = UserObject.getPublicUsername(user3);
                                    chat = user3;
                                    String str5 = strArr3[i17];
                                    strArr3[i17] = str5.toLowerCase();
                                    translitString = LocaleController.getInstance().getTranslitString(strArr3[i17]);
                                    str = strArr3[i17];
                                    if (str != null && str.equals(translitString)) {
                                        translitString = null;
                                    }
                                    i19 = i17;
                                    int i39 = i19;
                                    while (i19 < i37) {
                                        i18 = i17;
                                        String str6 = strArr[i19];
                                        int i40 = i28;
                                        String str7 = strArr3[i18];
                                        arrayList = arrayList6;
                                        if ((str7 == null || !(str7.startsWith(str6) || org.telegram.messenger.g0.w(" ", str6, strArr3[i18]))) && (translitString == null || !(translitString.startsWith(str6) || org.telegram.messenger.g0.w(" ", str6, translitString)))) {
                                            String str8 = strArr3[i40];
                                            i20 = (str8 == null || !str8.startsWith(str6)) ? i39 : 2;
                                        } else {
                                            i20 = i40;
                                        }
                                        if (i20 != 0) {
                                            if (i20 == i40) {
                                                arrayList9.add(AndroidUtilities.generateSearchName(str5, null, str6));
                                            } else {
                                                arrayList9.add(AndroidUtilities.generateSearchName("@" + strArr3[i40], null, "@" + str6));
                                            }
                                            arrayList8.add(zk0Var);
                                            if (chat != null) {
                                                arrayList7.add(chat);
                                            }
                                        } else {
                                            i19++;
                                            i39 = i20;
                                            i17 = i18;
                                            arrayList6 = arrayList;
                                            i28 = 1;
                                        }
                                    }
                                }
                                arrayList = arrayList6;
                                i18 = i17;
                            } else {
                                TLRPC.Chat chat2 = notificationsCustomSettingsActivity.getMessagesController().getChat(Long.valueOf(-zk0Var.d));
                                if (chat2 != null) {
                                    if (!chat2.left && !chat2.kicked && chat2.migrated_to == null) {
                                        strArr3[i17] = chat2.title;
                                        strArr3[i28] = ChatObject.getPublicUsername(chat2);
                                        chat = chat2;
                                        String str52 = strArr3[i17];
                                        strArr3[i17] = str52.toLowerCase();
                                        translitString = LocaleController.getInstance().getTranslitString(strArr3[i17]);
                                        str = strArr3[i17];
                                        if (str != null) {
                                            translitString = null;
                                        }
                                        i19 = i17;
                                        int i392 = i19;
                                        while (i19 < i37) {
                                        }
                                    }
                                    arrayList = arrayList6;
                                    i18 = i17;
                                }
                            }
                            i38++;
                            strArr2 = strArr;
                            i27 = i18;
                            arrayList6 = arrayList;
                            i28 = 1;
                        }
                        chat = null;
                        String str522 = strArr3[i17];
                        strArr3[i17] = str522.toLowerCase();
                        translitString = LocaleController.getInstance().getTranslitString(strArr3[i17]);
                        str = strArr3[i17];
                        if (str != null) {
                        }
                        i19 = i17;
                        int i3922 = i19;
                        while (i19 < i37) {
                        }
                        arrayList = arrayList6;
                        i18 = i17;
                        i38++;
                        strArr2 = strArr;
                        i27 = i18;
                        arrayList6 = arrayList;
                        i28 = 1;
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0(vk0Var, arrayList8, arrayList9, arrayList7, 23));
                    break;
                }
                break;
            case 9:
                NotificationsSettingsActivity.W((NotificationsSettingsActivity) this.b, (ArrayList) this.d, (Runnable) this.c);
                break;
            case 10:
                sn0 sn0Var = (sn0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                sn0Var.w1();
                if (tL_error4 == null) {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject5;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sn0Var.getParentActivity());
                    alertDialog$Builder.a.T = LocaleController.formatString("RestoreEmailSent", R.string.RestoreEmailSent, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RestoreEmailSentTitle);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new qw(27, sn0Var, tL_auth_passwordRecovery));
                    Dialog showDialog = sn0Var.showDialog(alertDialog$Builder.a);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error4.text).intValue();
                    sn0Var.L1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    break;
                } else {
                    sn0Var.L1(LocaleController.getString(R.string.AppName), tL_error4.text);
                    break;
                }
                break;
            case 11:
                ((gn0) this.b).d(((TLRPC.TL_error) this.d).text, (String) this.c);
                break;
            case 12:
                en0 en0Var = (en0) this.b;
                byte[] bArr = (byte[]) this.d;
                String str9 = (String) this.c;
                SecureRandom secureRandom = Utilities.random;
                sn0 sn0Var2 = en0Var.e;
                secureRandom.setSeed(sn0Var2.J.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = sn0Var2.J;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] o12 = sn0.o1();
                sn0Var2.c1 = o12;
                sn0Var2.b1 = Utilities.bytesToLong(Utilities.computeSHA256(o12));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = sn0Var2.J.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] computePBKDF2 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str9), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    sn0Var2.e1 = computePBKDF2;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(computePBKDF2, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(sn0Var2.e1, 32, bArr3, 0, 16);
                    byte[] bArr4 = sn0Var2.c1;
                    Utilities.aesCbcEncryptionByteArraySafe(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = sn0Var2.c1;
                    tL_secureSecretSettings.secure_secret_id = sn0Var2.b1;
                    passwordinputsettings.flags |= 4;
                }
                i21 = ((org.telegram.ui.ActionBar.m2) sn0Var2).currentAccount;
                ConnectionsManager.getInstance(i21).sendRequest(updatepasswordsettings, new cn0(en0Var, i25));
                break;
            case 13:
                on0 on0Var = (on0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.c;
                int i41 = on0Var.L;
                sn0 sn0Var3 = on0Var.Q;
                sn0Var3.w1();
                on0Var.J = false;
                if (tL_error5 == null) {
                    on0Var.s();
                    on0Var.r();
                    ((vm0) sn0Var3.B1).c(sn0Var3.E, (String) sn0Var3.s1.get("phone"), null, null, null, null, null, null, null, null, new cm0(sn0Var3, 6), null);
                    break;
                } else {
                    on0Var.K = tL_error5.text;
                    if ((i41 == 3 && ((i24 = on0Var.M) == 4 || i24 == 2)) || ((i41 == 2 && ((i22 = on0Var.M) == 4 || i22 == 3)) || (i41 == 4 && on0Var.M == 2))) {
                        on0Var.q();
                    }
                    if (i41 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(on0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i41 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(on0Var, NotificationCenter.didReceiveCall);
                    }
                    on0Var.I = true;
                    if (i41 != 3) {
                        i23 = ((org.telegram.ui.ActionBar.m2) sn0Var3).currentAccount;
                        org.telegram.ui.Components.g5.e0(i23, tL_error5, sn0Var3, verifyphone, new Object[0]);
                    }
                    sn0Var3.M1(true, false);
                    if (!tL_error5.text.contains("PHONE_CODE_EMPTY") && !tL_error5.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error5.text.contains("PHONE_CODE_EXPIRED")) {
                            on0Var.c(true);
                            sn0Var3.J1(null, 0, true);
                            break;
                        }
                    } else {
                        int i42 = 0;
                        while (true) {
                            EditTextBoldCursor[] editTextBoldCursorArr = on0Var.d;
                            if (i42 >= editTextBoldCursorArr.length) {
                                editTextBoldCursorArr[0].requestFocus();
                                break;
                            } else {
                                editTextBoldCursorArr[i42].setText("");
                                i42++;
                            }
                        }
                    }
                }
                break;
            case 14:
                ap0.U((ap0) this.b, (TL_account.Password) this.d, (byte[]) this.c);
                break;
            case 15:
                ap0.b0((ap0) this.b, (TLRPC.TL_error) this.d, (TLRPC.TL_payments_sendPaymentForm) this.c);
                break;
            case 16:
                ap0 ap0Var = (ap0) this.b;
                TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.d;
                se0 se0Var = (se0) this.c;
                ap0Var.E0 = tL_payments_validatedRequestedInfo;
                se0Var.run();
                ap0Var.D0(false);
                ap0Var.H0(true, false);
                break;
            case 17:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ImageReceiver.BitmapHolder bitmapHolder = (ImageReceiver.BitmapHolder) this.d;
                String str10 = (String) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                bitmapHolder.release();
                if (str10.equals(photoViewer.C4.getImageKey())) {
                    photoViewer.w4 = 2;
                    photoViewer.x4 = str10;
                    break;
                }
                break;
            case 18:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Bitmap bitmap = (Bitmap) this.d;
                mr0 mr0Var = (mr0) this.c;
                photoViewer2.C4.setImageBitmap(bitmap);
                photoViewer2.t5.setUndoCutState(true);
                photoViewer2.a3(true, true);
                AndroidUtilities.cancelRunOnUIThread(mr0Var);
                AndroidUtilities.runOnUIThread(mr0Var, 800L);
                break;
            case 19:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                boolean[] zArr = (boolean[]) this.d;
                ks0 ks0Var = (ks0) this.c;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                if (!zArr[0]) {
                    ImageView imageView = photoViewer3.x3;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    SurfaceView surfaceView = photoViewer3.C2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    zArr[0] = true;
                    ks0Var.run();
                    break;
                }
                break;
            case 20:
                pu0 pu0Var = (pu0) this.b;
                pu0 pu0Var2 = (pu0) this.d;
                int[] iArr = (int[]) this.c;
                PhotoViewer photoViewer4 = pu0Var.d;
                if (photoViewer4.y != null && pu0Var2 == photoViewer4.x8) {
                    photoViewer4.x8 = null;
                    photoViewer4.q8 = iArr[5];
                    photoViewer4.i8 = iArr[4];
                    photoViewer4.j8 = iArr[7];
                    float f7 = photoViewer4.g8 / 8;
                    PhotoViewer photoViewer5 = pu0Var.d;
                    photoViewer4.r8 = (long) ((f7 * photoViewer5.i8) / 1000.0f);
                    if (photoViewer5.k8) {
                        PhotoViewer photoViewer6 = pu0Var.d;
                        photoViewer6.b8 = iArr[8];
                        photoViewer6.D3();
                        if (pu0Var.d.Y7 > pu0Var.d.Z7 - 1) {
                            PhotoViewer photoViewer7 = pu0Var.d;
                            photoViewer7.Y7 = photoViewer7.Z7 - 1;
                        }
                        PhotoViewer photoViewer8 = pu0Var.d;
                        if (!photoViewer8.J4) {
                            org.telegram.ui.Components.v71 v71Var = photoViewer8.j1;
                            boolean z12 = photoViewer8.Z7 > 1;
                            PhotoViewer photoViewer9 = pu0Var.d;
                            v71Var.a(Math.min(photoViewer9.e8, pu0Var.d.f8), z12, photoViewer9.r);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb2 = new StringBuilder("compressionsCount = ");
                            sb2.append(pu0Var.d.Z7);
                            sb2.append(" w = ");
                            sb2.append(pu0Var.d.c8);
                            sb2.append(" h = ");
                            sb2.append(pu0Var.d.d8);
                            sb2.append(" r = ");
                            org.telegram.messenger.g0.o(pu0Var.d.b8, sb2);
                        }
                        pu0Var.d.O7.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = pu0Var.d;
                        if (!photoViewer10.J4) {
                            photoViewer10.j1.a(Math.min(photoViewer10.e8, pu0Var.d.f8), false, photoViewer10.r);
                        }
                        pu0Var.d.Z7 = 0;
                    }
                    pu0Var.d.B3();
                    pu0Var.d.x3();
                    break;
                }
                break;
            case 21:
                rw0 rw0Var = (rw0) this.b;
                fo foVar = (fo) this.d;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                MessageObject messageObject = rw0Var.H;
                byte[] bArr5 = pollAnswer.option;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaPoll)) {
                    messageObject.getDialogId();
                    unVar = new un();
                    unVar.a = messageObject;
                    unVar.b = -1;
                    unVar.c = -1;
                    unVar.h = true;
                    unVar.e = bArr5;
                    unVar.e();
                }
                foVar.Gb(messageObject, unVar);
                rw0Var.c(false);
                break;
            case 22:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.c;
                if (tL_error6 != null) {
                    org.telegram.ui.Components.zc.d0(tL_error6);
                    break;
                } else if (!(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.messenger.sk.q(R.string.UnknownError, org.telegram.ui.Components.zc.a0(premiumPreviewFragment), null);
                    break;
                }
                break;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ArrayList arrayList10 = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.c;
                profileActivity.getClass();
                int size2 = arrayList10.size();
                for (int i43 = 0; i43 < size2; i43++) {
                    TLRPC.User user4 = (TLRPC.User) arrayList10.get(i43);
                    if (!hashSet.contains(Long.valueOf(user4.id))) {
                        TLRPC.ChatFull chatFull = profileActivity.u2;
                        if (chatFull.participants == null) {
                            chatFull.participants = new TLRPC.TL_chatParticipants();
                        }
                        if (ChatObject.isChannel(profileActivity.E2)) {
                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                            TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                            tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                            tL_channelParticipant.inviter_id = profileActivity.getUserConfig().getClientUserId();
                            tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                            channelParticipant.peer.user_id = user4.id;
                            channelParticipant.date = profileActivity.getConnectionsManager().getCurrentTime();
                            tL_chatChannelParticipant.user_id = user4.id;
                            profileActivity.u2.participants.participants.add(tL_chatChannelParticipant);
                        } else {
                            TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                            tL_chatParticipant.user_id = user4.id;
                            tL_chatParticipant.inviter_id = profileActivity.getAccountInstance().getUserConfig().clientUserId;
                            profileActivity.u2.participants.participants.add(tL_chatParticipant);
                        }
                        profileActivity.u2.participants_count++;
                        profileActivity.getMessagesController().putUser(user4, false);
                    }
                }
                profileActivity.e5(true, false);
                break;
            case 24:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                org.telegram.ui.Components.ro roVar = (org.telegram.ui.Components.ro) this.d;
                fo foVar2 = (fo) this.c;
                org.telegram.ui.Components.no noVar = roVar.e;
                ViewGroup viewGroup = (ViewGroup) foVar2.fragmentView;
                RectF rectF = ih.j.h;
                ih.j.c(noVar, viewGroup, rectF);
                profileActivity2.O5 = rectF.left;
                profileActivity2.N3();
                break;
            case 25:
                org.telegram.ui.Components.zc.D((ac) this.b, (TLRPC.User) this.d, ((TLRPC.Chat) this.c).title).j();
                break;
            case 26:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                Runnable runnable = (Runnable) this.d;
                MessageObject messageObject2 = (MessageObject) this.c;
                secretMediaViewer.m0 = 0;
                secretMediaViewer.K0 = null;
                if (runnable != null) {
                    runnable.run();
                }
                ah.v vVar = secretMediaViewer.e;
                if (vVar != null) {
                    vVar.setLayerType(0, null);
                    secretMediaViewer.e.invalidate();
                    k51 k51Var = secretMediaViewer.n;
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    long j10 = message2.destroyTimeMillis;
                    long j11 = message2.ttl;
                    k51Var.e = false;
                    k51Var.f = j10;
                    k51Var.h = j11;
                    k51Var.n.start();
                    k51Var.invalidate();
                    if (secretMediaViewer.h1) {
                        secretMediaViewer.e(true, true);
                        break;
                    } else if (secretMediaViewer.q1 && MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) < 3) {
                        secretMediaViewer.l();
                        break;
                    }
                }
                break;
            case 27:
                w81 w81Var = (w81) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.c;
                SessionsActivity sessionsActivity = w81Var.f0;
                if (tL_error7 == null) {
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.f.remove(tL_authorization);
                    sessionsActivity.m0();
                    a91 a91Var = sessionsActivity.a;
                    if (a91Var != null) {
                        a91Var.l();
                    }
                    sessionsActivity.k0(true);
                    break;
                }
                break;
            case 28:
                x81 x81Var = (x81) this.b;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) this.c;
                SessionsActivity sessionsActivity2 = x81Var.a;
                if (tL_error8 == null) {
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.f.remove(tL_authorization2);
                    sessionsActivity2.m0();
                    a91 a91Var2 = sessionsActivity2.a;
                    if (a91Var2 != null) {
                        a91Var2.l();
                        break;
                    }
                }
                break;
            default:
                z81 z81Var = (z81) this.b;
                String str11 = (String) this.d;
                o9 o9Var = (o9) this.c;
                try {
                    byte[] decode = Base64.decode(str11.substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    z81Var.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new ec0(21, z81Var, o9Var));
                    break;
                } catch (Exception e) {
                    FileLog.e("Failed to pass qr code auth", e);
                    AndroidUtilities.runOnUIThread(new y81(z81Var, i28));
                    o9Var.run();
                }
        }
    }

    public /* synthetic */ tf0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }
}
