package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xe0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:407:0x0a1f, code lost:
    
        if (r5 != 16) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0a29, code lost:
    
        if (r5 == 3) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0a33, code lost:
    
        if (r5 == 16) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0b59, code lost:
    
        if (r6 != 16) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0b63, code lost:
    
        if (r6 == 3) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0b6d, code lost:
    
        if (r6 == 16) goto L432;
     */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0a3f  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0b79  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0ba8  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0bba  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0b84  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z12;
        int i18;
        kt ktVar;
        int i19;
        ArrayList arrayList;
        int i20;
        String[] strArr;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity;
        int i21;
        TLRPC.Chat chat;
        String translitString;
        String str;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        TLRPC.Message message;
        int i28 = 2;
        in inVar = null;
        int i29 = 0;
        int i30 = 5;
        int i31 = 1;
        switch (this.a) {
            case 0:
                if0 if0Var = (if0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) this.d;
                int i32 = if0Var.f0;
                eg0 eg0Var = if0Var.s0;
                if0Var.z(false);
                if0Var.d0 = false;
                if (tL_error == null) {
                    Activity parentActivity = eg0Var.getParentActivity();
                    if (parentActivity != null) {
                        if0Var.q(new b80(22, if0Var, parentActivity));
                        break;
                    }
                } else {
                    if0Var.e0 = tL_error.text;
                    if (i32 == 3) {
                        int i33 = if0Var.g0;
                        if (i33 != 4) {
                            i10 = 2;
                            if (i33 != 2) {
                                if (i33 != 17) {
                                }
                            }
                        }
                        if0Var.t();
                        if (i32 == 15) {
                            NotificationCenter.getGlobalInstance().addObserver(if0Var, NotificationCenter.didReceiveSmsCode);
                            z10 = true;
                        } else if (i32 == 2) {
                            z10 = true;
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(if0Var, NotificationCenter.didReceiveSmsCode);
                        } else {
                            z10 = true;
                            if (i32 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(if0Var, NotificationCenter.didReceiveCall);
                            }
                        }
                        if0Var.c0 = z10;
                        if (i32 != 3) {
                            i11 = ((org.telegram.ui.ActionBar.n2) eg0Var).currentAccount;
                            org.telegram.ui.Components.f5.e0(i11, tL_error, eg0Var, confirmphone, new Object[0]);
                        }
                        if (!tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                            if0Var.y();
                            break;
                        } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            if0Var.c(true);
                            eg0Var.u1(0, true, null, true);
                            break;
                        }
                    } else {
                        i10 = 2;
                    }
                    if (i32 == i10) {
                        int i34 = if0Var.g0;
                        if (i34 != 4) {
                        }
                        if0Var.t();
                        if (i32 == 15) {
                        }
                        if0Var.c0 = z10;
                        if (i32 != 3) {
                        }
                        if (!tL_error.text.contains("PHONE_CODE_EMPTY")) {
                        }
                        if0Var.y();
                    }
                    if (i32 == 4) {
                        int i35 = if0Var.g0;
                        if (i35 != i10) {
                            if (i35 != 17) {
                            }
                        }
                        if0Var.t();
                    }
                    if (i32 == 15) {
                    }
                    if0Var.c0 = z10;
                    if (i32 != 3) {
                    }
                    if (!tL_error.text.contains("PHONE_CODE_EMPTY")) {
                    }
                    if0Var.y();
                }
                break;
            case 1:
                if0 if0Var2 = (if0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                int i36 = if0Var2.f0;
                eg0 eg0Var2 = if0Var2.s0;
                if0Var2.z(false);
                if0Var2.d0 = false;
                if (tL_error2 == null) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if0Var2.w();
                    if0Var2.u();
                    i13 = ((org.telegram.ui.ActionBar.n2) eg0Var2).currentAccount;
                    UserConfig.getInstance(i13).setCurrentUser(user);
                    i14 = ((org.telegram.ui.ActionBar.n2) eg0Var2).currentAccount;
                    UserConfig.getInstance(i14).saveConfig(true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    i15 = ((org.telegram.ui.ActionBar.n2) eg0Var2).currentAccount;
                    MessagesStorage.getInstance(i15).putUsersAndChats(arrayList2, null, true, true);
                    i16 = ((org.telegram.ui.ActionBar.n2) eg0Var2).currentAccount;
                    MessagesController.getInstance(i16).putUser(user, false);
                    i17 = ((org.telegram.ui.ActionBar.n2) eg0Var2).currentAccount;
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                    eg0Var2.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                    if (i36 == 3) {
                        AndroidUtilities.endIncomingCall();
                    }
                    if0Var2.q(new ue0(if0Var2, i30));
                    break;
                } else {
                    if0Var2.e0 = tL_error2.text;
                    if0Var2.d0 = false;
                    eg0Var2.v1(false, true);
                    if (i36 == 3) {
                        int i37 = if0Var2.g0;
                        if (i37 != 4) {
                            i12 = 2;
                            if (i37 != 2) {
                                if (i37 != 17) {
                                }
                            }
                        }
                        if0Var2.t();
                        if (i36 == 15) {
                            NotificationCenter.getGlobalInstance().addObserver(if0Var2, NotificationCenter.didReceiveSmsCode);
                            z11 = true;
                        } else if (i36 == 2) {
                            z11 = true;
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(if0Var2, NotificationCenter.didReceiveSmsCode);
                        } else {
                            z11 = true;
                            if (i36 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(if0Var2, NotificationCenter.didReceiveCall);
                            }
                        }
                        if0Var2.c0 = z11;
                        if (i36 != 3) {
                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                eg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                if0Var2.y();
                                break;
                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                if0Var2.c(true);
                                eg0Var2.u1(0, true, null, true);
                                eg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                eg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            } else {
                                eg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                            }
                            int i38 = 0;
                            while (true) {
                                sr srVar = if0Var2.f;
                                vr[] vrVarArr = srVar.f;
                                if (i38 >= vrVarArr.length) {
                                    srVar.e = false;
                                    vrVarArr[0].requestFocus();
                                    break;
                                } else {
                                    vrVarArr[i38].setText("");
                                    i38++;
                                }
                            }
                        }
                    } else {
                        i12 = 2;
                    }
                    if (i36 == i12) {
                        int i39 = if0Var2.g0;
                        if (i39 != 4) {
                        }
                        if0Var2.t();
                        if (i36 == 15) {
                        }
                        if0Var2.c0 = z11;
                        if (i36 != 3) {
                        }
                    }
                    if (i36 == 4) {
                        int i40 = if0Var2.g0;
                        if (i40 != i12) {
                            if (i40 != 17) {
                            }
                        }
                        if0Var2.t();
                    }
                    if (i36 == 15) {
                    }
                    if0Var2.c0 = z11;
                    if (i36 != 3) {
                    }
                }
                break;
            case 2:
                if0 if0Var3 = (if0) this.b;
                Bundle bundle = (Bundle) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                if0Var3.o0 = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                if0Var3.p0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    if0Var3.g0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    if0Var3.g0 = 16;
                }
                if0Var3.s0.g1(bundle, tL_auth_sentCode, true);
                break;
            case 3:
                nf0 nf0Var = (nf0) this.b;
                TLObject tLObject3 = (TLObject) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                ei.d dVar = nf0Var.b;
                eg0 eg0Var3 = nf0Var.v;
                nf0Var.s = -1;
                if (tLObject3 instanceof TLRPC.auth_SentCode) {
                    nf0Var.f = false;
                    dVar.setLoading(false);
                    org.telegram.ui.ActionBar.d5 parentLayout = eg0Var3.getParentLayout();
                    if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentStack.isEmpty() ? null : (org.telegram.ui.ActionBar.n2) r4.c.f(1, fragmentStack);
                        ArrayList arrayList3 = new ArrayList(fragmentStack);
                        int size = arrayList3.size();
                        int i41 = 0;
                        while (i41 < size) {
                            Object obj = arrayList3.get(i41);
                            i41++;
                            org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj;
                            if ((n2Var2 instanceof go0) && n2Var2 != n2Var) {
                                n2Var2.removeSelfFromStack();
                            }
                        }
                        if (n2Var instanceof go0) {
                            z12 = true;
                            ((ActionBarLayout) parentLayout).l(true, false);
                            eg0Var3.g1(nf0Var.d, (TLRPC.auth_SentCode) tLObject3, z12);
                            break;
                        }
                    }
                    z12 = true;
                    eg0Var3.g1(nf0Var.d, (TLRPC.auth_SentCode) tLObject3, z12);
                } else if (tL_error3 != null) {
                    String str2 = tL_error3.text;
                    if (str2 == null || !str2.startsWith("FLOOD_WAIT_")) {
                        String str3 = tL_error3.text;
                        if (str3 == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(str3)) {
                            nf0Var.e = tL_error3.text;
                            nf0Var.f = false;
                            dVar.setLoading(false);
                            new org.telegram.ui.Components.xc(eg0Var3.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error3.text));
                            break;
                        } else {
                            eg0Var3.u1(0, true, null, true);
                            eg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new kf0(nf0Var, 2), Integer.parseInt(tL_error3.text.substring(11)) * MediaDataController.MAX_STYLE_RUNS_COUNT);
                        break;
                    }
                }
                break;
            case 4:
                nf0 nf0Var2 = (nf0) this.b;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.c;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.d;
                eg0 eg0Var4 = nf0Var2.v;
                eg0Var4.e = true;
                eg0 eg0Var5 = (eg0) LaunchActivity.N();
                if (eg0Var5 == null) {
                    i18 = ((org.telegram.ui.ActionBar.n2) eg0Var4).currentAccount;
                    eg0Var5 = new eg0(i18);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(eg0Var5);
                    }
                }
                eg0Var5.q1(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
                break;
            case 5:
                dg0 dg0Var = (dg0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                HashMap hashMap = (HashMap) this.d;
                lj0 lj0Var = dg0Var.a;
                if (tLObject4 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject4;
                    if (lj0Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList4 = dg0Var.E;
                        if (((String) hashMap.get(upperCase)) != null && arrayList4 != null) {
                            int i42 = 0;
                            while (true) {
                                if (i42 >= arrayList4.size()) {
                                    ktVar = null;
                                } else if (arrayList4.get(i42) == null || !((kt) arrayList4.get(i42)).a.equals(upperCase)) {
                                    i42++;
                                } else {
                                    ktVar = (kt) arrayList4.get(i42);
                                }
                            }
                            if (ktVar != null) {
                                lj0Var.setText(ktVar.c);
                                dg0Var.x = 0;
                                break;
                            }
                        }
                    }
                }
                break;
            case 6:
                jh0 jh0Var = (jh0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error4 != null) {
                    jh0Var.getClass();
                    break;
                } else {
                    jh0 jh0Var2 = jh0Var.s0.a;
                    int i43 = 0;
                    while (true) {
                        ArrayList arrayList5 = jh0Var2.j0;
                        if (i43 >= arrayList5.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList5.get(i43)).link.equals(tL_chatInviteExported.link)) {
                            ah0 f02 = jh0Var2.f0();
                            arrayList5.remove(i43);
                            jh0Var2.h0(f02);
                            break;
                        } else {
                            i43++;
                        }
                    }
                }
            case 7:
                AndroidUtilities.runOnUIThread(new yg0(4, (org.telegram.ui.Components.qy) this.d, MessagesStorage.getInstance(((oj0) this.b).currentAccount).getUser(((TLRPC.TL_contact) this.c).user_id)));
                break;
            case 8:
                oj0.n((oj0) this.b, (TLObject) this.c, (org.telegram.ui.Components.qy) this.d);
                break;
            case 9:
                ck0 ck0Var = (ck0) this.b;
                String str4 = (String) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = ck0Var.n;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90(ck0Var, new ArrayList(), new ArrayList(), new ArrayList(), 29));
                    break;
                } else {
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString2) || translitString2.length() == 0) {
                        translitString2 = null;
                    }
                    int i44 = (translitString2 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i44];
                    strArr2[0] = lowerCase;
                    if (translitString2 != null) {
                        strArr2[1] = translitString2;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    String[] strArr3 = strArr2;
                    ArrayList arrayList9 = new ArrayList();
                    String[] strArr4 = new String[2];
                    int i45 = 0;
                    while (i45 < arrayList6.size()) {
                        gk0 gk0Var = (gk0) arrayList6.get(i45);
                        if (DialogObject.isEncryptedDialog(gk0Var.d)) {
                            i19 = i29;
                            arrayList = arrayList6;
                            TLRPC.EncryptedChat l4 = org.telegram.messenger.g0.l(notificationsCustomSettingsActivity2.getMessagesController(), gk0Var.d);
                            if (l4 != null) {
                                i20 = i31;
                                strArr = strArr3;
                                TLRPC.User user2 = notificationsCustomSettingsActivity2.getMessagesController().getUser(Long.valueOf(l4.user_id));
                                if (user2 != null) {
                                    strArr4[i19] = ContactsController.formatName(user2.first_name, user2.last_name);
                                    strArr4[i20] = UserObject.getPublicUsername(user2);
                                }
                            } else {
                                i20 = i31;
                                strArr = strArr3;
                            }
                        } else {
                            i19 = i29;
                            arrayList = arrayList6;
                            i20 = i31;
                            strArr = strArr3;
                            if (DialogObject.isUserDialog(gk0Var.d)) {
                                TLRPC.User user3 = notificationsCustomSettingsActivity2.getMessagesController().getUser(Long.valueOf(gk0Var.d));
                                if (user3 != null && !user3.deleted) {
                                    strArr4[i19] = ContactsController.formatName(user3.first_name, user3.last_name);
                                    strArr4[i20] = UserObject.getPublicUsername(user3);
                                    chat = user3;
                                    String str5 = strArr4[i19];
                                    strArr4[i19] = str5.toLowerCase();
                                    translitString = LocaleController.getInstance().getTranslitString(strArr4[i19]);
                                    str = strArr4[i19];
                                    if (str != null && str.equals(translitString)) {
                                        translitString = null;
                                    }
                                    i22 = i19;
                                    int i46 = i22;
                                    while (i22 < i44) {
                                        int i47 = i20;
                                        String str6 = strArr[i22];
                                        i21 = i19;
                                        String str7 = strArr4[i21];
                                        notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                                        if ((str7 == null || !(str7.startsWith(str6) || org.telegram.messenger.g0.w(" ", str6, strArr4[i21]))) && (translitString == null || !(translitString.startsWith(str6) || org.telegram.messenger.g0.w(" ", str6, translitString)))) {
                                            String str8 = strArr4[i47];
                                            i23 = (str8 == null || !str8.startsWith(str6)) ? i46 : 2;
                                        } else {
                                            i23 = i47;
                                        }
                                        if (i23 != 0) {
                                            if (i23 == i47) {
                                                arrayList9.add(AndroidUtilities.generateSearchName(str5, null, str6));
                                            } else {
                                                arrayList9.add(AndroidUtilities.generateSearchName("@" + strArr4[i47], null, "@" + str6));
                                            }
                                            arrayList8.add(gk0Var);
                                            if (chat != null) {
                                                arrayList7.add(chat);
                                            }
                                        } else {
                                            i22++;
                                            i46 = i23;
                                            i19 = i21;
                                            notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
                                            i20 = 1;
                                        }
                                    }
                                }
                                notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                                i21 = i19;
                            } else {
                                TLRPC.Chat chat2 = notificationsCustomSettingsActivity2.getMessagesController().getChat(Long.valueOf(-gk0Var.d));
                                if (chat2 != null) {
                                    if (!chat2.left && !chat2.kicked && chat2.migrated_to == null) {
                                        strArr4[i19] = chat2.title;
                                        strArr4[i20] = ChatObject.getPublicUsername(chat2);
                                        chat = chat2;
                                        String str52 = strArr4[i19];
                                        strArr4[i19] = str52.toLowerCase();
                                        translitString = LocaleController.getInstance().getTranslitString(strArr4[i19]);
                                        str = strArr4[i19];
                                        if (str != null) {
                                            translitString = null;
                                        }
                                        i22 = i19;
                                        int i462 = i22;
                                        while (i22 < i44) {
                                        }
                                    }
                                    notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                                    i21 = i19;
                                }
                            }
                            i45++;
                            arrayList6 = arrayList;
                            strArr3 = strArr;
                            i29 = i21;
                            notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
                            i31 = 1;
                        }
                        chat = null;
                        String str522 = strArr4[i19];
                        strArr4[i19] = str522.toLowerCase();
                        translitString = LocaleController.getInstance().getTranslitString(strArr4[i19]);
                        str = strArr4[i19];
                        if (str != null) {
                        }
                        i22 = i19;
                        int i4622 = i22;
                        while (i22 < i44) {
                        }
                        notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                        i21 = i19;
                        i45++;
                        arrayList6 = arrayList;
                        strArr3 = strArr;
                        i29 = i21;
                        notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
                        i31 = 1;
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90(ck0Var, arrayList8, arrayList9, arrayList7, 29));
                    break;
                }
                break;
            case 10:
                NotificationsSettingsActivity.W((NotificationsSettingsActivity) this.b, (ArrayList) this.c, (Runnable) this.d);
                break;
            case 11:
                xm0 xm0Var = (xm0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                xm0Var.w1();
                if (tL_error5 == null) {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject5;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xm0Var.getParentActivity());
                    alertDialog$Builder.a.T = LocaleController.formatString("RestoreEmailSent", R.string.RestoreEmailSent, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RestoreEmailSentTitle);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new zu(29, xm0Var, tL_auth_passwordRecovery));
                    Dialog showDialog = xm0Var.showDialog(alertDialog$Builder.a);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                } else if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error5.text).intValue();
                    xm0Var.L1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    break;
                } else {
                    xm0Var.L1(LocaleController.getString(R.string.AppName), tL_error5.text);
                    break;
                }
                break;
            case 12:
                ((mm0) this.b).p(((TLRPC.TL_error) this.c).text, (String) this.d);
                break;
            case 13:
                km0 km0Var = (km0) this.b;
                byte[] bArr = (byte[]) this.c;
                String str9 = (String) this.d;
                SecureRandom secureRandom = Utilities.random;
                xm0 xm0Var2 = km0Var.e;
                secureRandom.setSeed(xm0Var2.J.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = xm0Var2.J;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] o12 = xm0.o1();
                xm0Var2.c1 = o12;
                xm0Var2.b1 = Utilities.bytesToLong(Utilities.computeSHA256(o12));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = xm0Var2.J.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] computePBKDF2 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str9), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    xm0Var2.e1 = computePBKDF2;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(computePBKDF2, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(xm0Var2.e1, 32, bArr3, 0, 16);
                    byte[] bArr4 = xm0Var2.c1;
                    Utilities.aesCbcEncryptionByteArraySafe(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = xm0Var2.c1;
                    tL_secureSecretSettings.secure_secret_id = xm0Var2.b1;
                    passwordinputsettings.flags |= 4;
                }
                i24 = ((org.telegram.ui.ActionBar.n2) xm0Var2).currentAccount;
                ConnectionsManager.getInstance(i24).sendRequest(updatepasswordsettings, new im0(km0Var, i28));
                break;
            case 14:
                tm0 tm0Var = (tm0) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.c;
                TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.d;
                int i48 = tm0Var.L;
                xm0 xm0Var3 = tm0Var.Q;
                xm0Var3.w1();
                tm0Var.J = false;
                if (tL_error6 == null) {
                    tm0Var.s();
                    tm0Var.r();
                    ((bm0) xm0Var3.B1).c(xm0Var3.E, (String) xm0Var3.s1.get("phone"), null, null, null, null, null, null, null, null, new jl0(xm0Var3, 6), null);
                    break;
                } else {
                    tm0Var.K = tL_error6.text;
                    if ((i48 == 3 && ((i27 = tm0Var.M) == 4 || i27 == 2)) || ((i48 == 2 && ((i25 = tm0Var.M) == 4 || i25 == 3)) || (i48 == 4 && tm0Var.M == 2))) {
                        tm0Var.q();
                    }
                    if (i48 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(tm0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i48 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(tm0Var, NotificationCenter.didReceiveCall);
                    }
                    tm0Var.I = true;
                    if (i48 != 3) {
                        i26 = ((org.telegram.ui.ActionBar.n2) xm0Var3).currentAccount;
                        org.telegram.ui.Components.f5.e0(i26, tL_error6, xm0Var3, verifyphone, new Object[0]);
                    }
                    xm0Var3.M1(true, false);
                    if (!tL_error6.text.contains("PHONE_CODE_EMPTY") && !tL_error6.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error6.text.contains("PHONE_CODE_EXPIRED")) {
                            tm0Var.c(true);
                            xm0Var3.J1(null, 0, true);
                            break;
                        }
                    } else {
                        int i49 = 0;
                        while (true) {
                            EditTextBoldCursor[] editTextBoldCursorArr = tm0Var.d;
                            if (i49 >= editTextBoldCursorArr.length) {
                                editTextBoldCursorArr[0].requestFocus();
                                break;
                            } else {
                                editTextBoldCursorArr[i49].setText("");
                                i49++;
                            }
                        }
                    }
                }
                break;
            case 15:
                go0.U((go0) this.b, (TL_account.Password) this.c, (byte[]) this.d);
                break;
            case 16:
                go0.b0((go0) this.b, (TLRPC.TL_error) this.c, (TLRPC.TL_payments_sendPaymentForm) this.d);
                break;
            case 17:
                go0 go0Var = (go0) this.b;
                TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.c;
                yg0 yg0Var = (yg0) this.d;
                go0Var.E0 = tL_payments_validatedRequestedInfo;
                yg0Var.run();
                go0Var.D0(false);
                go0Var.H0(true, false);
                break;
            case 18:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ImageReceiver.BitmapHolder bitmapHolder = (ImageReceiver.BitmapHolder) this.c;
                String str10 = (String) this.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                bitmapHolder.release();
                if (str10.equals(photoViewer.C4.getImageKey())) {
                    photoViewer.w4 = 2;
                    photoViewer.x4 = str10;
                    break;
                }
                break;
            case 19:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                sq0 sq0Var = (sq0) this.d;
                photoViewer2.C4.setImageBitmap(bitmap);
                photoViewer2.t5.setUndoCutState(true);
                photoViewer2.a3(true, true);
                AndroidUtilities.cancelRunOnUIThread(sq0Var);
                AndroidUtilities.runOnUIThread(sq0Var, 800L);
                break;
            case 20:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                boolean[] zArr = (boolean[]) this.c;
                nr0 nr0Var = (nr0) this.d;
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
                    nr0Var.run();
                    break;
                }
                break;
            case 21:
                rt0 rt0Var = (rt0) this.b;
                rt0 rt0Var2 = (rt0) this.c;
                int[] iArr = (int[]) this.d;
                PhotoViewer photoViewer4 = rt0Var.d;
                if (photoViewer4.y != null && rt0Var2 == photoViewer4.x8) {
                    photoViewer4.x8 = null;
                    photoViewer4.q8 = iArr[5];
                    photoViewer4.i8 = iArr[4];
                    photoViewer4.j8 = iArr[7];
                    float f7 = photoViewer4.g8 / 8;
                    PhotoViewer photoViewer5 = rt0Var.d;
                    photoViewer4.r8 = (long) ((f7 * photoViewer5.i8) / 1000.0f);
                    if (photoViewer5.k8) {
                        PhotoViewer photoViewer6 = rt0Var.d;
                        photoViewer6.b8 = iArr[8];
                        photoViewer6.D3();
                        if (rt0Var.d.Y7 > rt0Var.d.Z7 - 1) {
                            PhotoViewer photoViewer7 = rt0Var.d;
                            photoViewer7.Y7 = photoViewer7.Z7 - 1;
                        }
                        PhotoViewer photoViewer8 = rt0Var.d;
                        if (!photoViewer8.J4) {
                            org.telegram.ui.Components.n71 n71Var = photoViewer8.j1;
                            boolean z13 = photoViewer8.Z7 > 1;
                            PhotoViewer photoViewer9 = rt0Var.d;
                            n71Var.a(Math.min(photoViewer9.e8, rt0Var.d.f8), z13, photoViewer9.r);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb2 = new StringBuilder("compressionsCount = ");
                            sb2.append(rt0Var.d.Z7);
                            sb2.append(" w = ");
                            sb2.append(rt0Var.d.c8);
                            sb2.append(" h = ");
                            sb2.append(rt0Var.d.d8);
                            sb2.append(" r = ");
                            org.telegram.messenger.g0.o(rt0Var.d.b8, sb2);
                        }
                        rt0Var.d.O7.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = rt0Var.d;
                        if (!photoViewer10.J4) {
                            photoViewer10.j1.a(Math.min(photoViewer10.e8, rt0Var.d.f8), false, photoViewer10.r);
                        }
                        rt0Var.d.Z7 = 0;
                    }
                    rt0Var.d.B3();
                    rt0Var.d.x3();
                    break;
                }
                break;
            case 22:
                sv0 sv0Var = (sv0) this.b;
                sn snVar = (sn) this.c;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.d;
                MessageObject messageObject = sv0Var.H;
                byte[] bArr5 = pollAnswer.option;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaPoll)) {
                    messageObject.getDialogId();
                    inVar = new in();
                    inVar.a = messageObject;
                    inVar.b = -1;
                    inVar.c = -1;
                    inVar.h = true;
                    inVar.e = bArr5;
                    inVar.f();
                }
                snVar.Gb(messageObject, inVar);
                sv0Var.c(false);
                break;
            case 23:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                if (tL_error7 != null) {
                    org.telegram.ui.Components.xc.d0(tL_error7);
                    break;
                } else if (!(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.messenger.lk.q(R.string.UnknownError, org.telegram.ui.Components.xc.a0(premiumPreviewFragment), null);
                    break;
                }
                break;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                HashSet hashSet = (HashSet) this.d;
                profileActivity.getClass();
                int size2 = arrayList10.size();
                for (int i50 = 0; i50 < size2; i50++) {
                    TLRPC.User user4 = (TLRPC.User) arrayList10.get(i50);
                    if (!hashSet.contains(Long.valueOf(user4.id))) {
                        TLRPC.ChatFull chatFull = profileActivity.v2;
                        if (chatFull.participants == null) {
                            chatFull.participants = new TLRPC.TL_chatParticipants();
                        }
                        if (ChatObject.isChannel(profileActivity.F2)) {
                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                            TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                            tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                            tL_channelParticipant.inviter_id = profileActivity.getUserConfig().getClientUserId();
                            tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                            channelParticipant.peer.user_id = user4.id;
                            channelParticipant.date = profileActivity.getConnectionsManager().getCurrentTime();
                            tL_chatChannelParticipant.user_id = user4.id;
                            profileActivity.v2.participants.participants.add(tL_chatChannelParticipant);
                        } else {
                            TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                            tL_chatParticipant.user_id = user4.id;
                            tL_chatParticipant.inviter_id = profileActivity.getAccountInstance().getUserConfig().clientUserId;
                            profileActivity.v2.participants.participants.add(tL_chatParticipant);
                        }
                        profileActivity.v2.participants_count++;
                        profileActivity.getMessagesController().putUser(user4, false);
                    }
                }
                profileActivity.e5(true, false);
                break;
            case 25:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                org.telegram.ui.Components.oo ooVar = (org.telegram.ui.Components.oo) this.c;
                sn snVar2 = (sn) this.d;
                org.telegram.ui.Components.ko koVar = ooVar.e;
                ViewGroup viewGroup = (ViewGroup) snVar2.fragmentView;
                RectF rectF = ih.j.h;
                ih.j.c(koVar, viewGroup, rectF);
                profileActivity2.Q5 = rectF.left;
                profileActivity2.N3();
                break;
            case 26:
                org.telegram.ui.Components.xc.D((xb) this.b, (TLRPC.User) this.c, ((TLRPC.Chat) this.d).title).j();
                break;
            case 27:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                Runnable runnable = (Runnable) this.c;
                MessageObject messageObject2 = (MessageObject) this.d;
                secretMediaViewer.m0 = 0;
                secretMediaViewer.K0 = null;
                if (runnable != null) {
                    runnable.run();
                }
                ah.v vVar = secretMediaViewer.e;
                if (vVar != null) {
                    vVar.setLayerType(0, null);
                    secretMediaViewer.e.invalidate();
                    s31 s31Var = secretMediaViewer.n;
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    long j10 = message2.destroyTimeMillis;
                    long j11 = message2.ttl;
                    s31Var.e = false;
                    s31Var.f = j10;
                    s31Var.h = j11;
                    s31Var.n.start();
                    s31Var.invalidate();
                    if (secretMediaViewer.h1) {
                        secretMediaViewer.e(true, true);
                        break;
                    } else if (secretMediaViewer.q1 && MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) < 3) {
                        secretMediaViewer.l();
                        break;
                    }
                }
                break;
            case 28:
                e71 e71Var = (e71) this.b;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                SessionsActivity sessionsActivity = e71Var.f0;
                if (tL_error8 == null) {
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.f.remove(tL_authorization);
                    sessionsActivity.m0();
                    j71 j71Var = sessionsActivity.a;
                    if (j71Var != null) {
                        j71Var.l();
                    }
                    sessionsActivity.k0(true);
                    break;
                }
                break;
            default:
                f71 f71Var = (f71) this.b;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.c;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) this.d;
                SessionsActivity sessionsActivity2 = f71Var.a;
                if (tL_error9 == null) {
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.f.remove(tL_authorization2);
                    sessionsActivity2.m0();
                    j71 j71Var2 = sessionsActivity2.a;
                    if (j71Var2 != null) {
                        j71Var2.l();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ xe0(nf0 nf0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 3;
        this.b = nf0Var;
        this.d = tLObject;
        this.c = tL_error;
    }
}
