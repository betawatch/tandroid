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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ye0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i9) {
        this.a = i9;
        this.b = callback;
        this.c = tLObject;
        this.d = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:416:0x0a69, code lost:
    
        if (r7 != 16) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0a73, code lost:
    
        if (r7 == 3) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0a7f, code lost:
    
        if (r7 == 16) goto L378;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0a88  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0ab7  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0a93  */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v53 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i9;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z11;
        int i15;
        lt ltVar;
        String[] strArr;
        char c10;
        ArrayList arrayList;
        TLRPC.Chat chat;
        String translitString;
        String str;
        int i16;
        ?? r32;
        int i17;
        int i18;
        int i19;
        int i20;
        TLRPC.Message message;
        int i21 = 3;
        int i22 = 2;
        gn gnVar = null;
        int i23 = 1;
        switch (this.a) {
            case 0:
                jf0 jf0Var = (jf0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.c;
                int i24 = jf0Var.b0;
                fg0 fg0Var = jf0Var.o0;
                jf0Var.z(false);
                jf0Var.W = false;
                if (tL_error == null) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    jf0Var.w();
                    jf0Var.v();
                    i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                    UserConfig.getInstance(i10).setCurrentUser(user);
                    i11 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                    UserConfig.getInstance(i11).saveConfig(true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    i12 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                    MessagesStorage.getInstance(i12).putUsersAndChats(arrayList2, null, true, true);
                    i13 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                    MessagesController.getInstance(i13).putUser(user, false);
                    i14 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                    fg0Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                    if (i24 == 3) {
                        AndroidUtilities.endIncomingCall();
                    }
                    jf0Var.q(new ve0(jf0Var, 5));
                    break;
                } else {
                    jf0Var.a0 = tL_error.text;
                    jf0Var.W = false;
                    fg0Var.v1(false, true);
                    if (i24 == 3) {
                        int i25 = jf0Var.c0;
                        if (i25 != 4) {
                            i9 = 2;
                            if (i25 != 2) {
                                if (i25 != 17) {
                                    break;
                                }
                            }
                        }
                        jf0Var.t();
                        if (i24 == 15) {
                            NotificationCenter.getGlobalInstance().addObserver(jf0Var, NotificationCenter.didReceiveSmsCode);
                            z10 = true;
                        } else if (i24 == 2) {
                            z10 = true;
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(jf0Var, NotificationCenter.didReceiveSmsCode);
                        } else {
                            z10 = true;
                            if (i24 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(jf0Var, NotificationCenter.didReceiveCall);
                            }
                        }
                        jf0Var.V = z10;
                        if (i24 != 3) {
                            if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                            } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                jf0Var.y();
                                break;
                            } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                jf0Var.c(true);
                                fg0Var.u1(0, true, null, true);
                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            } else {
                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                            }
                            int i26 = 0;
                            while (true) {
                                sr srVar = jf0Var.f;
                                vr[] vrVarArr = srVar.f;
                                if (i26 >= vrVarArr.length) {
                                    srVar.e = false;
                                    vrVarArr[0].requestFocus();
                                    break;
                                } else {
                                    vrVarArr[i26].setText("");
                                    i26++;
                                }
                            }
                        }
                    } else {
                        i9 = 2;
                    }
                    if (i24 == i9) {
                        int i27 = jf0Var.c0;
                        if (i27 != 4) {
                        }
                        jf0Var.t();
                        if (i24 == 15) {
                        }
                        jf0Var.V = z10;
                        if (i24 != 3) {
                        }
                    }
                    if (i24 == 4) {
                        int i28 = jf0Var.c0;
                        if (i28 != i9) {
                            if (i28 != 17) {
                                break;
                            }
                        }
                        jf0Var.t();
                    }
                    if (i24 == 15) {
                    }
                    jf0Var.V = z10;
                    if (i24 != 3) {
                    }
                }
                break;
            case 1:
                jf0 jf0Var2 = (jf0) this.b;
                Bundle bundle = (Bundle) this.d;
                TLObject tLObject2 = (TLObject) this.c;
                jf0Var2.k0 = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                jf0Var2.l0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    jf0Var2.c0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    jf0Var2.c0 = 16;
                }
                jf0Var2.o0.g1(bundle, tL_auth_sentCode, true);
                break;
            case 2:
                of0 of0Var = (of0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                kh.d dVar = of0Var.b;
                fg0 fg0Var2 = of0Var.v;
                of0Var.s = -1;
                if (tLObject3 instanceof TLRPC.auth_SentCode) {
                    of0Var.f = false;
                    dVar.setLoading(false);
                    org.telegram.ui.ActionBar.b5 parentLayout = fg0Var2.getParentLayout();
                    if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentStack.isEmpty() ? null : (org.telegram.ui.ActionBar.o2) j3.r0.k(1, fragmentStack);
                        ArrayList arrayList3 = new ArrayList(fragmentStack);
                        int size = arrayList3.size();
                        int i29 = 0;
                        while (i29 < size) {
                            Object obj = arrayList3.get(i29);
                            i29++;
                            org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj;
                            if ((o2Var2 instanceof co0) && o2Var2 != o2Var) {
                                o2Var2.removeSelfFromStack();
                            }
                        }
                        if (o2Var instanceof co0) {
                            z11 = true;
                            ((ActionBarLayout) parentLayout).l(true, false);
                            fg0Var2.g1(of0Var.d, (TLRPC.auth_SentCode) tLObject3, z11);
                            break;
                        }
                    }
                    z11 = true;
                    fg0Var2.g1(of0Var.d, (TLRPC.auth_SentCode) tLObject3, z11);
                } else if (tL_error2 != null) {
                    String str2 = tL_error2.text;
                    if (str2 == null || !str2.startsWith("FLOOD_WAIT_")) {
                        String str3 = tL_error2.text;
                        if (str3 == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(str3)) {
                            of0Var.e = tL_error2.text;
                            of0Var.f = false;
                            dVar.setLoading(false);
                            new org.telegram.ui.Components.oc(fg0Var2.V, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error2.text));
                            break;
                        } else {
                            fg0Var2.u1(0, true, null, true);
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new lf0(of0Var, 2), Integer.parseInt(tL_error2.text.substring(11)) * MediaDataController.MAX_STYLE_RUNS_COUNT);
                        break;
                    }
                }
                break;
            case 3:
                of0 of0Var2 = (of0) this.b;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.c;
                fg0 fg0Var3 = of0Var2.v;
                fg0Var3.e = true;
                fg0 fg0Var4 = (fg0) LaunchActivity.N();
                if (fg0Var4 == null) {
                    i15 = ((org.telegram.ui.ActionBar.o2) fg0Var3).currentAccount;
                    fg0Var4 = new fg0(i15);
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(fg0Var4);
                    }
                }
                fg0Var4.q1(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
                break;
            case 4:
                eg0 eg0Var = (eg0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                HashMap hashMap = (HashMap) this.d;
                kj0 kj0Var = eg0Var.a;
                if (tLObject4 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject4;
                    if (kj0Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList4 = eg0Var.A;
                        if (((String) hashMap.get(upperCase)) != null && arrayList4 != null) {
                            int i30 = 0;
                            while (true) {
                                if (i30 >= arrayList4.size()) {
                                    ltVar = null;
                                } else if (arrayList4.get(i30) == null || !((lt) arrayList4.get(i30)).a.equals(upperCase)) {
                                    i30++;
                                } else {
                                    ltVar = (lt) arrayList4.get(i30);
                                }
                            }
                            if (ltVar != null) {
                                kj0Var.setText(ltVar.c);
                                eg0Var.x = 0;
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                hh0 hh0Var = (hh0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.c;
                if (tL_error3 != null) {
                    hh0Var.getClass();
                    break;
                } else {
                    hh0 hh0Var2 = hh0Var.o0.a;
                    int i31 = 0;
                    while (true) {
                        ArrayList arrayList5 = hh0Var2.f0;
                        if (i31 >= arrayList5.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList5.get(i31)).link.equals(tL_chatInviteExported.link)) {
                            yg0 e02 = hh0Var2.e0();
                            arrayList5.remove(i31);
                            hh0Var2.g0(e02);
                            break;
                        } else {
                            i31++;
                        }
                    }
                }
            case 6:
                AndroidUtilities.runOnUIThread(new cf0(9, (eb0) this.c, MessagesStorage.getInstance(((nj0) this.b).currentAccount).getUser(((TLRPC.TL_contact) this.d).user_id)));
                break;
            case 7:
                nj0.m((nj0) this.b, (TLObject) this.c, (eb0) this.d);
                break;
            case 8:
                bk0 bk0Var = (bk0) this.b;
                String str4 = (String) this.d;
                ArrayList arrayList6 = (ArrayList) this.c;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = bk0Var.n;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0(bk0Var, new ArrayList(), new ArrayList(), new ArrayList(), 24));
                    break;
                } else {
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString2) || translitString2.length() == 0) {
                        translitString2 = null;
                    }
                    int i32 = (translitString2 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i32];
                    strArr2[0] = lowerCase;
                    if (translitString2 != null) {
                        strArr2[1] = translitString2;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    String[] strArr3 = new String[2];
                    int i33 = 0;
                    while (i33 < arrayList6.size()) {
                        ek0 ek0Var = (ek0) arrayList6.get(i33);
                        if (DialogObject.isEncryptedDialog(ek0Var.d)) {
                            TLRPC.EncryptedChat l10 = org.telegram.messenger.l0.l(notificationsCustomSettingsActivity.getMessagesController(), ek0Var.d);
                            if (l10 != null) {
                                strArr = strArr2;
                                c10 = 0;
                                TLRPC.User user2 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(l10.user_id));
                                if (user2 != null) {
                                    strArr3[0] = ContactsController.formatName(user2.first_name, user2.last_name);
                                    strArr3[i23] = UserObject.getPublicUsername(user2);
                                }
                            } else {
                                strArr = strArr2;
                                c10 = 0;
                            }
                        } else {
                            strArr = strArr2;
                            c10 = 0;
                            if (DialogObject.isUserDialog(ek0Var.d)) {
                                TLRPC.User user3 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(ek0Var.d));
                                if (user3 != null && !user3.deleted) {
                                    strArr3[0] = ContactsController.formatName(user3.first_name, user3.last_name);
                                    strArr3[i23] = UserObject.getPublicUsername(user3);
                                    chat = user3;
                                    String str5 = strArr3[c10];
                                    strArr3[c10] = str5.toLowerCase();
                                    translitString = LocaleController.getInstance().getTranslitString(strArr3[c10]);
                                    str = strArr3[c10];
                                    if (str != null && str.equals(translitString)) {
                                        translitString = null;
                                    }
                                    i16 = 0;
                                    boolean z12 = false;
                                    while (i16 < i32) {
                                        String str6 = strArr[i16];
                                        String str7 = strArr3[0];
                                        arrayList = arrayList6;
                                        if ((str7 == null || !(str7.startsWith(str6) || org.telegram.messenger.l0.w(" ", str6, strArr3[0]))) && (translitString == null || !(translitString.startsWith(str6) || org.telegram.messenger.l0.w(" ", str6, translitString)))) {
                                            String str8 = strArr3[1];
                                            r32 = (str8 == null || !str8.startsWith(str6)) ? z12 : 2;
                                        } else {
                                            r32 = 1;
                                        }
                                        if (r32 != 0) {
                                            if (r32 == 1) {
                                                arrayList9.add(AndroidUtilities.generateSearchName(str5, null, str6));
                                            } else {
                                                arrayList9.add(AndroidUtilities.generateSearchName("@" + strArr3[1], null, "@" + str6));
                                            }
                                            arrayList8.add(ek0Var);
                                            if (chat != null) {
                                                arrayList7.add(chat);
                                            }
                                        } else {
                                            i16++;
                                            z12 = r32;
                                            arrayList6 = arrayList;
                                        }
                                    }
                                }
                                arrayList = arrayList6;
                            } else {
                                TLRPC.Chat chat2 = notificationsCustomSettingsActivity.getMessagesController().getChat(Long.valueOf(-ek0Var.d));
                                if (chat2 != null) {
                                    if (!chat2.left && !chat2.kicked && chat2.migrated_to == null) {
                                        strArr3[0] = chat2.title;
                                        strArr3[i23] = ChatObject.getPublicUsername(chat2);
                                        chat = chat2;
                                        String str52 = strArr3[c10];
                                        strArr3[c10] = str52.toLowerCase();
                                        translitString = LocaleController.getInstance().getTranslitString(strArr3[c10]);
                                        str = strArr3[c10];
                                        if (str != null) {
                                            translitString = null;
                                        }
                                        i16 = 0;
                                        boolean z122 = false;
                                        while (i16 < i32) {
                                        }
                                    }
                                    arrayList = arrayList6;
                                }
                            }
                            i33++;
                            strArr2 = strArr;
                            arrayList6 = arrayList;
                            i23 = 1;
                        }
                        chat = null;
                        String str522 = strArr3[c10];
                        strArr3[c10] = str522.toLowerCase();
                        translitString = LocaleController.getInstance().getTranslitString(strArr3[c10]);
                        str = strArr3[c10];
                        if (str != null) {
                        }
                        i16 = 0;
                        boolean z1222 = false;
                        while (i16 < i32) {
                        }
                        arrayList = arrayList6;
                        i33++;
                        strArr2 = strArr;
                        arrayList6 = arrayList;
                        i23 = 1;
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0(bk0Var, arrayList8, arrayList9, arrayList7, 24));
                    break;
                }
                break;
            case 9:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) this.b, (ArrayList) this.d, (Runnable) this.c);
                break;
            case 10:
                wm0 wm0Var = (wm0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                wm0Var.x1();
                if (tL_error4 == null) {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject5;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wm0Var.getParentActivity());
                    alertDialog$Builder.a.P = LocaleController.formatString("RestoreEmailSent", R.string.RestoreEmailSent, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.a.N = LocaleController.getString(R.string.RestoreEmailSentTitle);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new nl0(i21, wm0Var, tL_auth_passwordRecovery));
                    Dialog showDialog = wm0Var.showDialog(alertDialog$Builder.a);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error4.text).intValue();
                    wm0Var.M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    break;
                } else {
                    wm0Var.M1(LocaleController.getString(R.string.AppName), tL_error4.text);
                    break;
                }
                break;
            case 11:
                ((lm0) this.b).T(((TLRPC.TL_error) this.d).text, (String) this.c);
                break;
            case 12:
                jm0 jm0Var = (jm0) this.b;
                byte[] bArr = (byte[]) this.d;
                String str9 = (String) this.c;
                SecureRandom secureRandom = Utilities.random;
                wm0 wm0Var2 = jm0Var.e;
                secureRandom.setSeed(wm0Var2.F.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = wm0Var2.F;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] p12 = wm0.p1();
                wm0Var2.Y0 = p12;
                wm0Var2.X0 = Utilities.bytesToLong(Utilities.computeSHA256(p12));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = wm0Var2.F.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] computePBKDF2 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str9), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    wm0Var2.a1 = computePBKDF2;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(computePBKDF2, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(wm0Var2.a1, 32, bArr3, 0, 16);
                    byte[] bArr4 = wm0Var2.Y0;
                    Utilities.aesCbcEncryptionByteArraySafe(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = wm0Var2.Y0;
                    tL_secureSecretSettings.secure_secret_id = wm0Var2.X0;
                    passwordinputsettings.flags |= 4;
                }
                i17 = ((org.telegram.ui.ActionBar.o2) wm0Var2).currentAccount;
                ConnectionsManager.getInstance(i17).sendRequest(updatepasswordsettings, new hm0(jm0Var, i22));
                break;
            case 13:
                sm0 sm0Var = (sm0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.c;
                int i34 = sm0Var.H;
                wm0 wm0Var3 = sm0Var.M;
                wm0Var3.x1();
                sm0Var.F = false;
                if (tL_error5 == null) {
                    sm0Var.s();
                    sm0Var.r();
                    ((am0) wm0Var3.x1).c(wm0Var3.A, (String) wm0Var3.o1.get("phone"), null, null, null, null, null, null, null, null, new hl0(wm0Var3, 6), null);
                    break;
                } else {
                    sm0Var.G = tL_error5.text;
                    if ((i34 == 3 && ((i20 = sm0Var.I) == 4 || i20 == 2)) || ((i34 == 2 && ((i18 = sm0Var.I) == 4 || i18 == 3)) || (i34 == 4 && sm0Var.I == 2))) {
                        sm0Var.q();
                    }
                    if (i34 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(sm0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i34 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(sm0Var, NotificationCenter.didReceiveCall);
                    }
                    sm0Var.E = true;
                    if (i34 != 3) {
                        i19 = ((org.telegram.ui.ActionBar.o2) wm0Var3).currentAccount;
                        org.telegram.ui.Components.y4.f0(i19, tL_error5, wm0Var3, verifyphone, new Object[0]);
                    }
                    wm0Var3.N1(true, false);
                    if (!tL_error5.text.contains("PHONE_CODE_EMPTY") && !tL_error5.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error5.text.contains("PHONE_CODE_EXPIRED")) {
                            sm0Var.c(true);
                            wm0Var3.K1(0, true, null);
                            break;
                        }
                    } else {
                        int i35 = 0;
                        while (true) {
                            EditTextBoldCursor[] editTextBoldCursorArr = sm0Var.d;
                            if (i35 >= editTextBoldCursorArr.length) {
                                editTextBoldCursorArr[0].requestFocus();
                                break;
                            } else {
                                editTextBoldCursorArr[i35].setText("");
                                i35++;
                            }
                        }
                    }
                }
                break;
            case 14:
                co0.T((co0) this.b, (TL_account.Password) this.d, (byte[]) this.c);
                break;
            case 15:
                co0.a0((co0) this.b, (TLRPC.TL_error) this.d, (TLRPC.TL_payments_sendPaymentForm) this.c);
                break;
            case 16:
                co0 co0Var = (co0) this.b;
                TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.d;
                cf0 cf0Var = (cf0) this.c;
                co0Var.A0 = tL_payments_validatedRequestedInfo;
                cf0Var.run();
                co0Var.C0(false);
                co0Var.G0(true, false);
                break;
            case 17:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ImageReceiver.BitmapHolder bitmapHolder = (ImageReceiver.BitmapHolder) this.d;
                String str10 = (String) this.c;
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.getClass();
                bitmapHolder.release();
                if (str10.equals(photoViewer.y4.getImageKey())) {
                    photoViewer.s4 = 2;
                    photoViewer.t4 = str10;
                    break;
                }
                break;
            case 18:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Bitmap bitmap = (Bitmap) this.d;
                gq0 gq0Var = (gq0) this.c;
                photoViewer2.y4.setImageBitmap(bitmap);
                photoViewer2.p5.setUndoCutState(true);
                photoViewer2.a3(true, true);
                AndroidUtilities.cancelRunOnUIThread(gq0Var);
                AndroidUtilities.runOnUIThread(gq0Var, 800L);
                break;
            case 19:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                boolean[] zArr = (boolean[]) this.d;
                br0 br0Var = (br0) this.c;
                Drawable[] drawableArr2 = PhotoViewer.P8;
                if (!zArr[0]) {
                    ImageView imageView = photoViewer3.t3;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    SurfaceView surfaceView = photoViewer3.y2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    zArr[0] = true;
                    br0Var.run();
                    break;
                }
                break;
            case 20:
                ht0 ht0Var = (ht0) this.b;
                ht0 ht0Var2 = (ht0) this.d;
                int[] iArr = (int[]) this.c;
                PhotoViewer photoViewer4 = ht0Var.d;
                if (photoViewer4.y != null && ht0Var2 == photoViewer4.s8) {
                    photoViewer4.s8 = null;
                    photoViewer4.l8 = iArr[5];
                    photoViewer4.d8 = iArr[4];
                    photoViewer4.e8 = iArr[7];
                    float f10 = photoViewer4.b8 / 8;
                    PhotoViewer photoViewer5 = ht0Var.d;
                    photoViewer4.m8 = (long) ((f10 * photoViewer5.d8) / 1000.0f);
                    if (photoViewer5.f8) {
                        PhotoViewer photoViewer6 = ht0Var.d;
                        photoViewer6.W7 = iArr[8];
                        photoViewer6.D3();
                        if (ht0Var.d.T7 > ht0Var.d.U7 - 1) {
                            PhotoViewer photoViewer7 = ht0Var.d;
                            photoViewer7.T7 = photoViewer7.U7 - 1;
                        }
                        PhotoViewer photoViewer8 = ht0Var.d;
                        if (!photoViewer8.F4) {
                            org.telegram.ui.Components.w51 w51Var = photoViewer8.f1;
                            boolean z13 = photoViewer8.U7 > 1;
                            PhotoViewer photoViewer9 = ht0Var.d;
                            w51Var.a(Math.min(photoViewer9.Z7, ht0Var.d.a8), z13, photoViewer9.r);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb2 = new StringBuilder("compressionsCount = ");
                            sb2.append(ht0Var.d.U7);
                            sb2.append(" w = ");
                            sb2.append(ht0Var.d.X7);
                            sb2.append(" h = ");
                            sb2.append(ht0Var.d.Y7);
                            sb2.append(" r = ");
                            org.telegram.messenger.l0.n(ht0Var.d.W7, sb2);
                        }
                        ht0Var.d.J7.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = ht0Var.d;
                        if (!photoViewer10.F4) {
                            photoViewer10.f1.a(Math.min(photoViewer10.Z7, ht0Var.d.a8), false, photoViewer10.r);
                        }
                        ht0Var.d.U7 = 0;
                    }
                    ht0Var.d.B3();
                    ht0Var.d.x3();
                    break;
                }
                break;
            case 21:
                iv0 iv0Var = (iv0) this.b;
                qn qnVar = (qn) this.d;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                MessageObject messageObject = iv0Var.D;
                byte[] bArr5 = pollAnswer.option;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaPoll)) {
                    messageObject.getDialogId();
                    gnVar = new gn();
                    gnVar.a = messageObject;
                    gnVar.b = -1;
                    gnVar.c = -1;
                    gnVar.h = true;
                    gnVar.e = bArr5;
                    gnVar.e();
                }
                qnVar.Cb(messageObject, gnVar);
                iv0Var.c(false);
                break;
            case 22:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.c;
                if (tL_error6 != null) {
                    org.telegram.ui.Components.oc.b0(tL_error6);
                    break;
                } else if (!(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.messenger.ll.p(R.string.UnknownError, org.telegram.ui.Components.oc.a0(premiumPreviewFragment), null);
                    break;
                }
                break;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ArrayList arrayList10 = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.c;
                profileActivity.getClass();
                int size2 = arrayList10.size();
                for (int i36 = 0; i36 < size2; i36++) {
                    TLRPC.User user4 = (TLRPC.User) arrayList10.get(i36);
                    if (!hashSet.contains(Long.valueOf(user4.id))) {
                        TLRPC.ChatFull chatFull = profileActivity.q2;
                        if (chatFull.participants == null) {
                            chatFull.participants = new TLRPC.TL_chatParticipants();
                        }
                        if (ChatObject.isChannel(profileActivity.A2)) {
                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                            TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                            tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                            tL_channelParticipant.inviter_id = profileActivity.getUserConfig().getClientUserId();
                            tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                            channelParticipant.peer.user_id = user4.id;
                            channelParticipant.date = profileActivity.getConnectionsManager().getCurrentTime();
                            tL_chatChannelParticipant.user_id = user4.id;
                            profileActivity.q2.participants.participants.add(tL_chatChannelParticipant);
                        } else {
                            TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                            tL_chatParticipant.user_id = user4.id;
                            tL_chatParticipant.inviter_id = profileActivity.getAccountInstance().getUserConfig().clientUserId;
                            profileActivity.q2.participants.participants.add(tL_chatParticipant);
                        }
                        profileActivity.q2.participants_count++;
                        profileActivity.getMessagesController().putUser(user4, false);
                    }
                }
                profileActivity.e5(true, false);
                break;
            case 24:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                org.telegram.ui.Components.tn tnVar = (org.telegram.ui.Components.tn) this.d;
                qn qnVar2 = (qn) this.c;
                org.telegram.ui.Components.pn pnVar = tnVar.e;
                ViewGroup viewGroup = (ViewGroup) qnVar2.fragmentView;
                RectF rectF = pg.i.h;
                pg.i.c(pnVar, viewGroup, rectF);
                profileActivity2.K5 = rectF.left;
                profileActivity2.N3();
                break;
            case 25:
                org.telegram.ui.Components.oc.D((pb) this.b, (TLRPC.User) this.d, ((TLRPC.Chat) this.c).title).j();
                break;
            case 26:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                Runnable runnable = (Runnable) this.d;
                MessageObject messageObject2 = (MessageObject) this.c;
                secretMediaViewer.i0 = 0;
                secretMediaViewer.G0 = null;
                if (runnable != null) {
                    runnable.run();
                }
                fh.v vVar = secretMediaViewer.e;
                if (vVar != null) {
                    vVar.setLayerType(0, null);
                    secretMediaViewer.e.invalidate();
                    w31 w31Var = secretMediaViewer.n;
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    long j10 = message2.destroyTimeMillis;
                    long j11 = message2.ttl;
                    w31Var.e = false;
                    w31Var.f = j10;
                    w31Var.h = j11;
                    w31Var.n.start();
                    w31Var.invalidate();
                    if (secretMediaViewer.d1) {
                        secretMediaViewer.e(true, true);
                        break;
                    } else if (secretMediaViewer.m1 && MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) < 3) {
                        secretMediaViewer.l();
                        break;
                    }
                }
                break;
            case 27:
                g71 g71Var = (g71) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.c;
                SessionsActivity sessionsActivity = g71Var.b0;
                if (tL_error7 == null) {
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.f.remove(tL_authorization);
                    sessionsActivity.l0();
                    k71 k71Var = sessionsActivity.a;
                    if (k71Var != null) {
                        k71Var.l();
                    }
                    sessionsActivity.j0(true);
                    break;
                }
                break;
            case 28:
                h71 h71Var = (h71) this.b;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) this.c;
                SessionsActivity sessionsActivity2 = h71Var.a;
                if (tL_error8 == null) {
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.f.remove(tL_authorization2);
                    sessionsActivity2.l0();
                    k71 k71Var2 = sessionsActivity2.a;
                    if (k71Var2 != null) {
                        k71Var2.l();
                        break;
                    }
                }
                break;
            default:
                j71 j71Var = (j71) this.b;
                String str11 = (String) this.d;
                j9 j9Var = (j9) this.c;
                try {
                    byte[] decode = Base64.decode(str11.substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    j71Var.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new v40(28, j71Var, j9Var));
                    break;
                } catch (Exception e10) {
                    FileLog.e("Failed to pass qr code auth", e10);
                    AndroidUtilities.runOnUIThread(new i71(j71Var, i23));
                    j9Var.run();
                }
        }
    }

    public /* synthetic */ ye0(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }
}
