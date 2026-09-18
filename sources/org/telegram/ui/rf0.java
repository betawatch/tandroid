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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.a = i10;
        this.b = callback;
        this.c = tLObject;
        this.d = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:416:0x0a6c, code lost:
    
        if (r7 != 16) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0a76, code lost:
    
        if (r7 == 3) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0a82, code lost:
    
        if (r7 == 16) goto L378;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0a8b  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0aba  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0a96  */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v53 */
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
        xt xtVar;
        String[] strArr;
        char c10;
        ArrayList arrayList;
        TLRPC.Chat chat;
        String translitString;
        String str;
        int i17;
        ?? r32;
        int i18;
        int i19;
        int i20;
        int i21;
        TLRPC.Message message;
        int i22 = 2;
        rn rnVar = null;
        int i23 = 1;
        switch (this.a) {
            case 0:
                bg0 bg0Var = (bg0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.c;
                int i24 = bg0Var.f0;
                yg0 yg0Var = bg0Var.s0;
                bg0Var.z(false);
                bg0Var.d0 = false;
                if (tL_error == null) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    bg0Var.w();
                    bg0Var.v();
                    i11 = ((org.telegram.ui.ActionBar.o2) yg0Var).currentAccount;
                    UserConfig.getInstance(i11).setCurrentUser(user);
                    i12 = ((org.telegram.ui.ActionBar.o2) yg0Var).currentAccount;
                    UserConfig.getInstance(i12).saveConfig(true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    i13 = ((org.telegram.ui.ActionBar.o2) yg0Var).currentAccount;
                    MessagesStorage.getInstance(i13).putUsersAndChats(arrayList2, null, true, true);
                    i14 = ((org.telegram.ui.ActionBar.o2) yg0Var).currentAccount;
                    MessagesController.getInstance(i14).putUser(user, false);
                    i15 = ((org.telegram.ui.ActionBar.o2) yg0Var).currentAccount;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                    yg0Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                    if (i24 == 3) {
                        AndroidUtilities.endIncomingCall();
                    }
                    bg0Var.q(new of0(bg0Var, 5));
                    break;
                } else {
                    bg0Var.e0 = tL_error.text;
                    bg0Var.d0 = false;
                    yg0Var.v1(false, true);
                    if (i24 == 3) {
                        int i25 = bg0Var.g0;
                        if (i25 != 4) {
                            i10 = 2;
                            if (i25 != 2) {
                                if (i25 != 17) {
                                    break;
                                }
                            }
                        }
                        bg0Var.u();
                        if (i24 == 15) {
                            NotificationCenter.getGlobalInstance().addObserver(bg0Var, NotificationCenter.didReceiveSmsCode);
                            z10 = true;
                        } else if (i24 == 2) {
                            z10 = true;
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(bg0Var, NotificationCenter.didReceiveSmsCode);
                        } else {
                            z10 = true;
                            if (i24 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(bg0Var, NotificationCenter.didReceiveCall);
                            }
                        }
                        bg0Var.c0 = z10;
                        if (i24 != 3) {
                            if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                            } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                bg0Var.y();
                                break;
                            } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                bg0Var.c(true);
                                yg0Var.u1(0, true, null, true);
                                yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            } else {
                                yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                            }
                            int i26 = 0;
                            while (true) {
                                fs fsVar = bg0Var.f;
                                is[] isVarArr = fsVar.f;
                                if (i26 >= isVarArr.length) {
                                    fsVar.e = false;
                                    isVarArr[0].requestFocus();
                                    break;
                                } else {
                                    isVarArr[i26].setText("");
                                    i26++;
                                }
                            }
                        }
                    } else {
                        i10 = 2;
                    }
                    if (i24 == i10) {
                        int i27 = bg0Var.g0;
                        if (i27 != 4) {
                        }
                        bg0Var.u();
                        if (i24 == 15) {
                        }
                        bg0Var.c0 = z10;
                        if (i24 != 3) {
                        }
                    }
                    if (i24 == 4) {
                        int i28 = bg0Var.g0;
                        if (i28 != i10) {
                            if (i28 != 17) {
                                break;
                            }
                        }
                        bg0Var.u();
                    }
                    if (i24 == 15) {
                    }
                    bg0Var.c0 = z10;
                    if (i24 != 3) {
                    }
                }
                break;
            case 1:
                bg0 bg0Var2 = (bg0) this.b;
                Bundle bundle = (Bundle) this.d;
                TLObject tLObject2 = (TLObject) this.c;
                bg0Var2.o0 = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                bg0Var2.p0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    bg0Var2.g0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    bg0Var2.g0 = 16;
                }
                bg0Var2.s0.g1(bundle, tL_auth_sentCode, true);
                break;
            case 2:
                hg0 hg0Var = (hg0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                ci.d dVar = hg0Var.b;
                yg0 yg0Var2 = hg0Var.v;
                hg0Var.s = -1;
                if (tLObject3 instanceof TLRPC.auth_SentCode) {
                    hg0Var.f = false;
                    dVar.setLoading(false);
                    org.telegram.ui.ActionBar.e5 parentLayout = yg0Var2.getParentLayout();
                    if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentStack.isEmpty() ? null : (org.telegram.ui.ActionBar.o2) org.telegram.ui.Cells.p6.g(1, fragmentStack);
                        ArrayList arrayList3 = new ArrayList(fragmentStack);
                        int size = arrayList3.size();
                        int i29 = 0;
                        while (i29 < size) {
                            Object obj = arrayList3.get(i29);
                            i29++;
                            org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj;
                            if ((o2Var2 instanceof yo0) && o2Var2 != o2Var) {
                                o2Var2.removeSelfFromStack();
                            }
                        }
                        if (o2Var instanceof yo0) {
                            z11 = true;
                            ((ActionBarLayout) parentLayout).l(true, false);
                            yg0Var2.g1(hg0Var.d, (TLRPC.auth_SentCode) tLObject3, z11);
                            break;
                        }
                    }
                    z11 = true;
                    yg0Var2.g1(hg0Var.d, (TLRPC.auth_SentCode) tLObject3, z11);
                } else if (tL_error2 != null) {
                    String str2 = tL_error2.text;
                    if (str2 == null || !str2.startsWith("FLOOD_WAIT_")) {
                        String str3 = tL_error2.text;
                        if (str3 == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(str3)) {
                            hg0Var.e = tL_error2.text;
                            hg0Var.f = false;
                            dVar.setLoading(false);
                            new org.telegram.ui.Components.vc(yg0Var2.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error2.text));
                            break;
                        } else {
                            yg0Var2.u1(0, true, null, true);
                            yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new dg0(hg0Var, 2), Integer.parseInt(tL_error2.text.substring(11)) * MediaDataController.MAX_STYLE_RUNS_COUNT);
                        break;
                    }
                }
                break;
            case 3:
                hg0 hg0Var2 = (hg0) this.b;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.c;
                yg0 yg0Var3 = hg0Var2.v;
                yg0Var3.e = true;
                yg0 yg0Var4 = (yg0) LaunchActivity.N();
                if (yg0Var4 == null) {
                    i16 = ((org.telegram.ui.ActionBar.o2) yg0Var3).currentAccount;
                    yg0Var4 = new yg0(i16);
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(yg0Var4);
                    }
                }
                yg0Var4.q1(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
                break;
            case 4:
                xg0 xg0Var = (xg0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                HashMap hashMap = (HashMap) this.d;
                ck0 ck0Var = xg0Var.a;
                if (tLObject4 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject4;
                    if (ck0Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList4 = xg0Var.E;
                        if (((String) hashMap.get(upperCase)) != null && arrayList4 != null) {
                            int i30 = 0;
                            while (true) {
                                if (i30 >= arrayList4.size()) {
                                    xtVar = null;
                                } else if (arrayList4.get(i30) == null || !((xt) arrayList4.get(i30)).a.equals(upperCase)) {
                                    i30++;
                                } else {
                                    xtVar = (xt) arrayList4.get(i30);
                                }
                            }
                            if (xtVar != null) {
                                ck0Var.setText(xtVar.c);
                                xg0Var.x = 0;
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                ai0 ai0Var = (ai0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.c;
                if (tL_error3 != null) {
                    ai0Var.getClass();
                    break;
                } else {
                    ai0 ai0Var2 = ai0Var.s0.a;
                    int i31 = 0;
                    while (true) {
                        ArrayList arrayList5 = ai0Var2.j0;
                        if (i31 >= arrayList5.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList5.get(i31)).link.equals(tL_chatInviteExported.link)) {
                            rh0 f02 = ai0Var2.f0();
                            arrayList5.remove(i31);
                            ai0Var2.h0(f02);
                            break;
                        } else {
                            i31++;
                        }
                    }
                }
            case 6:
                AndroidUtilities.runOnUIThread(new oa0(27, (oj0) this.c, MessagesStorage.getInstance(((ek0) this.b).currentAccount).getUser(((TLRPC.TL_contact) this.d).user_id)));
                break;
            case 7:
                ek0.m((ek0) this.b, (TLObject) this.c, (oj0) this.d);
                break;
            case 8:
                sk0 sk0Var = (sk0) this.b;
                String str4 = (String) this.d;
                ArrayList arrayList6 = (ArrayList) this.c;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = sk0Var.n;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kn0(sk0Var, new ArrayList(), new ArrayList(), new ArrayList(), 25));
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
                        vk0 vk0Var = (vk0) arrayList6.get(i33);
                        if (DialogObject.isEncryptedDialog(vk0Var.d)) {
                            TLRPC.EncryptedChat m10 = org.telegram.messenger.w1.m(notificationsCustomSettingsActivity.getMessagesController(), vk0Var.d);
                            if (m10 != null) {
                                strArr = strArr2;
                                c10 = 0;
                                TLRPC.User user2 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(m10.user_id));
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
                            if (DialogObject.isUserDialog(vk0Var.d)) {
                                TLRPC.User user3 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(vk0Var.d));
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
                                    i17 = 0;
                                    boolean z12 = false;
                                    while (i17 < i32) {
                                        String str6 = strArr[i17];
                                        String str7 = strArr3[0];
                                        arrayList = arrayList6;
                                        if ((str7 == null || !(str7.startsWith(str6) || org.telegram.messenger.w1.w(" ", str6, strArr3[0]))) && (translitString == null || !(translitString.startsWith(str6) || org.telegram.messenger.w1.w(" ", str6, translitString)))) {
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
                                            arrayList8.add(vk0Var);
                                            if (chat != null) {
                                                arrayList7.add(chat);
                                            }
                                        } else {
                                            i17++;
                                            z12 = r32;
                                            arrayList6 = arrayList;
                                        }
                                    }
                                }
                                arrayList = arrayList6;
                            } else {
                                TLRPC.Chat chat2 = notificationsCustomSettingsActivity.getMessagesController().getChat(Long.valueOf(-vk0Var.d));
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
                                        i17 = 0;
                                        boolean z122 = false;
                                        while (i17 < i32) {
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
                        i17 = 0;
                        boolean z1222 = false;
                        while (i17 < i32) {
                        }
                        arrayList = arrayList6;
                        i33++;
                        strArr2 = strArr;
                        arrayList6 = arrayList;
                        i23 = 1;
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kn0(sk0Var, arrayList8, arrayList9, arrayList7, 25));
                    break;
                }
                break;
            case 9:
                NotificationsSettingsActivity.W((NotificationsSettingsActivity) this.b, (ArrayList) this.d, (Runnable) this.c);
                break;
            case 10:
                qn0 qn0Var = (qn0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                qn0Var.x1();
                if (tL_error4 == null) {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject5;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qn0Var.getParentActivity());
                    alertDialog$Builder.a.T = LocaleController.formatString("RestoreEmailSent", R.string.RestoreEmailSent, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RestoreEmailSentTitle);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new f20(23, qn0Var, tL_auth_passwordRecovery));
                    Dialog showDialog = qn0Var.showDialog(alertDialog$Builder.a);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error4.text).intValue();
                    qn0Var.M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    break;
                } else {
                    qn0Var.M1(LocaleController.getString(R.string.AppName), tL_error4.text);
                    break;
                }
                break;
            case 11:
                ((en0) this.b).b(((TLRPC.TL_error) this.d).text, (String) this.c);
                break;
            case 12:
                cn0 cn0Var = (cn0) this.b;
                byte[] bArr = (byte[]) this.d;
                String str9 = (String) this.c;
                SecureRandom secureRandom = Utilities.random;
                qn0 qn0Var2 = cn0Var.e;
                secureRandom.setSeed(qn0Var2.J.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = qn0Var2.J;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] p12 = qn0.p1();
                qn0Var2.c1 = p12;
                qn0Var2.b1 = Utilities.bytesToLong(Utilities.computeSHA256(p12));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = qn0Var2.J.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] computePBKDF2 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str9), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    qn0Var2.e1 = computePBKDF2;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(computePBKDF2, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(qn0Var2.e1, 32, bArr3, 0, 16);
                    byte[] bArr4 = qn0Var2.c1;
                    Utilities.aesCbcEncryptionByteArraySafe(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = qn0Var2.c1;
                    tL_secureSecretSettings.secure_secret_id = qn0Var2.b1;
                    passwordinputsettings.flags |= 4;
                }
                i18 = ((org.telegram.ui.ActionBar.o2) qn0Var2).currentAccount;
                ConnectionsManager.getInstance(i18).sendRequest(updatepasswordsettings, new an0(cn0Var, i22));
                break;
            case 13:
                mn0 mn0Var = (mn0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.c;
                int i34 = mn0Var.L;
                qn0 qn0Var3 = mn0Var.Q;
                qn0Var3.x1();
                mn0Var.J = false;
                if (tL_error5 == null) {
                    mn0Var.s();
                    mn0Var.r();
                    ((tm0) qn0Var3.B1).c(qn0Var3.E, (String) qn0Var3.s1.get("phone"), null, null, null, null, null, null, null, null, new zl0(qn0Var3, 6), null);
                    break;
                } else {
                    mn0Var.K = tL_error5.text;
                    if ((i34 == 3 && ((i21 = mn0Var.M) == 4 || i21 == 2)) || ((i34 == 2 && ((i19 = mn0Var.M) == 4 || i19 == 3)) || (i34 == 4 && mn0Var.M == 2))) {
                        mn0Var.q();
                    }
                    if (i34 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(mn0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i34 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(mn0Var, NotificationCenter.didReceiveCall);
                    }
                    mn0Var.I = true;
                    if (i34 != 3) {
                        i20 = ((org.telegram.ui.ActionBar.o2) qn0Var3).currentAccount;
                        org.telegram.ui.Components.c5.f0(i20, tL_error5, qn0Var3, verifyphone, new Object[0]);
                    }
                    qn0Var3.N1(true, false);
                    if (!tL_error5.text.contains("PHONE_CODE_EMPTY") && !tL_error5.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error5.text.contains("PHONE_CODE_EXPIRED")) {
                            mn0Var.c(true);
                            qn0Var3.K1(null, 0, true);
                            break;
                        }
                    } else {
                        int i35 = 0;
                        while (true) {
                            EditTextBoldCursor[] editTextBoldCursorArr = mn0Var.d;
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
                yo0.U((yo0) this.b, (TL_account.Password) this.d, (byte[]) this.c);
                break;
            case 15:
                yo0.b0((yo0) this.b, (TLRPC.TL_error) this.d, (TLRPC.TL_payments_sendPaymentForm) this.c);
                break;
            case 16:
                yo0 yo0Var = (yo0) this.b;
                TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.d;
                pl0 pl0Var = (pl0) this.c;
                yo0Var.E0 = tL_payments_validatedRequestedInfo;
                pl0Var.run();
                yo0Var.D0(false);
                yo0Var.H0(true, false);
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
                kr0 kr0Var = (kr0) this.c;
                photoViewer2.C4.setImageBitmap(bitmap);
                photoViewer2.t5.setUndoCutState(true);
                photoViewer2.Z2(true, true);
                AndroidUtilities.cancelRunOnUIThread(kr0Var);
                AndroidUtilities.runOnUIThread(kr0Var, 800L);
                break;
            case 19:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                boolean[] zArr = (boolean[]) this.d;
                gs0 gs0Var = (gs0) this.c;
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
                    gs0Var.run();
                    break;
                }
                break;
            case 20:
                lu0 lu0Var = (lu0) this.b;
                lu0 lu0Var2 = (lu0) this.d;
                int[] iArr = (int[]) this.c;
                PhotoViewer photoViewer4 = lu0Var.d;
                if (photoViewer4.y != null && lu0Var2 == photoViewer4.x8) {
                    photoViewer4.x8 = null;
                    photoViewer4.q8 = iArr[5];
                    photoViewer4.i8 = iArr[4];
                    photoViewer4.j8 = iArr[7];
                    float f7 = photoViewer4.g8 / 8;
                    PhotoViewer photoViewer5 = lu0Var.d;
                    photoViewer4.r8 = (long) ((f7 * photoViewer5.i8) / 1000.0f);
                    if (photoViewer5.k8) {
                        PhotoViewer photoViewer6 = lu0Var.d;
                        photoViewer6.b8 = iArr[8];
                        photoViewer6.C3();
                        if (lu0Var.d.Y7 > lu0Var.d.Z7 - 1) {
                            PhotoViewer photoViewer7 = lu0Var.d;
                            photoViewer7.Y7 = photoViewer7.Z7 - 1;
                        }
                        PhotoViewer photoViewer8 = lu0Var.d;
                        if (!photoViewer8.J4) {
                            org.telegram.ui.Components.t61 t61Var = photoViewer8.j1;
                            boolean z13 = photoViewer8.Z7 > 1;
                            PhotoViewer photoViewer9 = lu0Var.d;
                            t61Var.a(Math.min(photoViewer9.e8, lu0Var.d.f8), z13, photoViewer9.r);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb2 = new StringBuilder("compressionsCount = ");
                            sb2.append(lu0Var.d.Z7);
                            sb2.append(" w = ");
                            sb2.append(lu0Var.d.c8);
                            sb2.append(" h = ");
                            sb2.append(lu0Var.d.d8);
                            sb2.append(" r = ");
                            hg.k0.p(lu0Var.d.b8, sb2);
                        }
                        lu0Var.d.O7.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = lu0Var.d;
                        if (!photoViewer10.J4) {
                            photoViewer10.j1.a(Math.min(photoViewer10.e8, lu0Var.d.f8), false, photoViewer10.r);
                        }
                        lu0Var.d.Z7 = 0;
                    }
                    lu0Var.d.A3();
                    lu0Var.d.w3();
                    break;
                }
                break;
            case 21:
                ow0 ow0Var = (ow0) this.b;
                bo boVar = (bo) this.d;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                MessageObject messageObject = ow0Var.H;
                byte[] bArr5 = pollAnswer.option;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaPoll)) {
                    messageObject.getDialogId();
                    rnVar = new rn();
                    rnVar.a = messageObject;
                    rnVar.b = -1;
                    rnVar.c = -1;
                    rnVar.h = true;
                    rnVar.e = bArr5;
                    rnVar.e();
                }
                boVar.Cb(messageObject, rnVar);
                ow0Var.c(false);
                break;
            case 22:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.c;
                if (tL_error6 != null) {
                    org.telegram.ui.Components.vc.b0(tL_error6);
                    break;
                } else if (!(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.messenger.w1.p(R.string.UnknownError, org.telegram.ui.Components.vc.a0(premiumPreviewFragment), null);
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
                org.telegram.ui.Components.eo eoVar = (org.telegram.ui.Components.eo) this.d;
                bo boVar2 = (bo) this.c;
                org.telegram.ui.Components.zn znVar = eoVar.e;
                ViewGroup viewGroup = (ViewGroup) boVar2.fragmentView;
                RectF rectF = hh.k.h;
                hh.k.c(znVar, viewGroup, rectF);
                profileActivity2.O5 = rectF.left;
                profileActivity2.N3();
                break;
            case 25:
                org.telegram.ui.Components.vc.D((wb) this.b, (TLRPC.User) this.d, ((TLRPC.Chat) this.c).title).j();
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
                ci.n6 n6Var = secretMediaViewer.e;
                if (n6Var != null) {
                    n6Var.setLayerType(0, null);
                    secretMediaViewer.e.invalidate();
                    d51 d51Var = secretMediaViewer.n;
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    long j3 = message2.destroyTimeMillis;
                    long j10 = message2.ttl;
                    d51Var.e = false;
                    d51Var.f = j3;
                    d51Var.h = j10;
                    d51Var.n.start();
                    d51Var.invalidate();
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
                n81 n81Var = (n81) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.c;
                SessionsActivity sessionsActivity = n81Var.f0;
                if (tL_error7 == null) {
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.f.remove(tL_authorization);
                    sessionsActivity.m0();
                    r81 r81Var = sessionsActivity.a;
                    if (r81Var != null) {
                        r81Var.l();
                    }
                    sessionsActivity.k0(true);
                    break;
                }
                break;
            case 28:
                o81 o81Var = (o81) this.b;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) this.c;
                SessionsActivity sessionsActivity2 = o81Var.a;
                if (tL_error8 == null) {
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.f.remove(tL_authorization2);
                    sessionsActivity2.m0();
                    r81 r81Var2 = sessionsActivity2.a;
                    if (r81Var2 != null) {
                        r81Var2.l();
                        break;
                    }
                }
                break;
            default:
                q81 q81Var = (q81) this.b;
                String str11 = (String) this.d;
                n9 n9Var = (n9) this.c;
                try {
                    byte[] decode = Base64.decode(str11.substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    q81Var.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new dc0(21, q81Var, n9Var));
                    break;
                } catch (Exception e) {
                    FileLog.e("Failed to pass qr code auth", e);
                    AndroidUtilities.runOnUIThread(new p81(q81Var, i23));
                    n9Var.run();
                }
        }
    }

    public /* synthetic */ rf0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }
}
