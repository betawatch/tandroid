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
import org.telegram.messenger.ImageLocation;
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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class re0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ re0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:399:0x09f8, code lost:
    
        if (r5 != 16) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0a02, code lost:
    
        if (r5 == 3) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0a0c, code lost:
    
        if (r5 == 16) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0b32, code lost:
    
        if (r6 != 16) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0b3c, code lost:
    
        if (r6 == 3) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0b46, code lost:
    
        if (r6 == 16) goto L426;
     */
    /* JADX WARN: Removed duplicated region for block: B:216:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0b52  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0b81  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0b93  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0b5d  */
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
        lt ltVar;
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
                ue0 ue0Var = (ue0) this.b;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.FileLocation fileLocation = photoSize.location;
                ue0Var.M = fileLocation;
                ue0Var.N = photoSize2.location;
                ue0Var.e.h(ImageLocation.getForLocal(fileLocation), "50_50", ue0Var.f, null);
                break;
            case 1:
                mf0 mf0Var = (mf0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) this.d;
                int i32 = mf0Var.h0;
                ig0 ig0Var = mf0Var.u0;
                mf0Var.y(false);
                mf0Var.f0 = false;
                if (tL_error == null) {
                    Activity parentActivity = ig0Var.getParentActivity();
                    if (parentActivity != null) {
                        mf0Var.p(new f80(22, mf0Var, parentActivity));
                        break;
                    }
                } else {
                    mf0Var.g0 = tL_error.text;
                    if (i32 == 3) {
                        int i33 = mf0Var.i0;
                        if (i33 != 4) {
                            i10 = 2;
                            if (i33 != 2) {
                                if (i33 != 17) {
                                }
                            }
                        }
                        mf0Var.s();
                        if (i32 == 15) {
                            NotificationCenter.getGlobalInstance().addObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                            z10 = true;
                        } else if (i32 == 2) {
                            z10 = true;
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                        } else {
                            z10 = true;
                            if (i32 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(mf0Var, NotificationCenter.didReceiveCall);
                            }
                        }
                        mf0Var.e0 = z10;
                        if (i32 != 3) {
                            i11 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
                            org.telegram.ui.Components.f5.f0(i11, tL_error, ig0Var, confirmphone, new Object[0]);
                        }
                        if (!tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                            mf0Var.x();
                            break;
                        } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            mf0Var.c(true);
                            ig0Var.y1(0, true, null, true);
                            break;
                        }
                    } else {
                        i10 = 2;
                    }
                    if (i32 == i10) {
                        int i34 = mf0Var.i0;
                        if (i34 != 4) {
                        }
                        mf0Var.s();
                        if (i32 == 15) {
                        }
                        mf0Var.e0 = z10;
                        if (i32 != 3) {
                        }
                        if (!tL_error.text.contains("PHONE_CODE_EMPTY")) {
                        }
                        mf0Var.x();
                    }
                    if (i32 == 4) {
                        int i35 = mf0Var.i0;
                        if (i35 != i10) {
                            if (i35 != 17) {
                            }
                        }
                        mf0Var.s();
                    }
                    if (i32 == 15) {
                    }
                    mf0Var.e0 = z10;
                    if (i32 != 3) {
                    }
                    if (!tL_error.text.contains("PHONE_CODE_EMPTY")) {
                    }
                    mf0Var.x();
                }
                break;
            case 2:
                mf0 mf0Var2 = (mf0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                int i36 = mf0Var2.h0;
                ig0 ig0Var2 = mf0Var2.u0;
                mf0Var2.y(false);
                mf0Var2.f0 = false;
                if (tL_error2 == null) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    mf0Var2.u();
                    mf0Var2.t();
                    i13 = ((org.telegram.ui.ActionBar.o2) ig0Var2).currentAccount;
                    UserConfig.getInstance(i13).setCurrentUser(user);
                    i14 = ((org.telegram.ui.ActionBar.o2) ig0Var2).currentAccount;
                    UserConfig.getInstance(i14).saveConfig(true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    i15 = ((org.telegram.ui.ActionBar.o2) ig0Var2).currentAccount;
                    MessagesStorage.getInstance(i15).putUsersAndChats(arrayList2, null, true, true);
                    i16 = ((org.telegram.ui.ActionBar.o2) ig0Var2).currentAccount;
                    MessagesController.getInstance(i16).putUser(user, false);
                    i17 = ((org.telegram.ui.ActionBar.o2) ig0Var2).currentAccount;
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                    ig0Var2.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                    if (i36 == 3) {
                        AndroidUtilities.endIncomingCall();
                    }
                    mf0Var2.p(new ze0(mf0Var2, i30));
                    break;
                } else {
                    mf0Var2.g0 = tL_error2.text;
                    mf0Var2.f0 = false;
                    ig0Var2.z1(false, true);
                    if (i36 == 3) {
                        int i37 = mf0Var2.i0;
                        if (i37 != 4) {
                            i12 = 2;
                            if (i37 != 2) {
                                if (i37 != 17) {
                                }
                            }
                        }
                        mf0Var2.s();
                        if (i36 == 15) {
                            NotificationCenter.getGlobalInstance().addObserver(mf0Var2, NotificationCenter.didReceiveSmsCode);
                            z11 = true;
                        } else if (i36 == 2) {
                            z11 = true;
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(mf0Var2, NotificationCenter.didReceiveSmsCode);
                        } else {
                            z11 = true;
                            if (i36 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(mf0Var2, NotificationCenter.didReceiveCall);
                            }
                        }
                        mf0Var2.e0 = z11;
                        if (i36 != 3) {
                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                mf0Var2.x();
                                break;
                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                mf0Var2.c(true);
                                ig0Var2.y1(0, true, null, true);
                                ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            } else {
                                ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                            }
                            int i38 = 0;
                            while (true) {
                                sr srVar = mf0Var2.f;
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
                        int i39 = mf0Var2.i0;
                        if (i39 != 4) {
                        }
                        mf0Var2.s();
                        if (i36 == 15) {
                        }
                        mf0Var2.e0 = z11;
                        if (i36 != 3) {
                        }
                    }
                    if (i36 == 4) {
                        int i40 = mf0Var2.i0;
                        if (i40 != i12) {
                            if (i40 != 17) {
                            }
                        }
                        mf0Var2.s();
                    }
                    if (i36 == 15) {
                    }
                    mf0Var2.e0 = z11;
                    if (i36 != 3) {
                    }
                }
                break;
            case 3:
                mf0 mf0Var3 = (mf0) this.b;
                Bundle bundle = (Bundle) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                mf0Var3.q0 = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                mf0Var3.r0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    mf0Var3.i0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    mf0Var3.i0 = 16;
                }
                mf0Var3.u0.k1(bundle, tL_auth_sentCode, true);
                break;
            case 4:
                rf0 rf0Var = (rf0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                ei.d dVar = rf0Var.b;
                ig0 ig0Var3 = rf0Var.v;
                rf0Var.s = -1;
                if (tLObject3 instanceof TLRPC.auth_SentCode) {
                    rf0Var.f = false;
                    dVar.setLoading(false);
                    org.telegram.ui.ActionBar.h5 parentLayout = ig0Var3.getParentLayout();
                    if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentStack.isEmpty() ? null : (org.telegram.ui.ActionBar.o2) si.o0.g(1, fragmentStack);
                        ArrayList arrayList3 = new ArrayList(fragmentStack);
                        int size = arrayList3.size();
                        int i41 = 0;
                        while (i41 < size) {
                            Object obj = arrayList3.get(i41);
                            i41++;
                            org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj;
                            if ((o2Var2 instanceof io0) && o2Var2 != o2Var) {
                                o2Var2.removeSelfFromStack();
                            }
                        }
                        if (o2Var instanceof io0) {
                            z12 = true;
                            ((ActionBarLayout) parentLayout).l(true, false);
                            ig0Var3.k1(rf0Var.d, (TLRPC.auth_SentCode) tLObject3, z12);
                            break;
                        }
                    }
                    z12 = true;
                    ig0Var3.k1(rf0Var.d, (TLRPC.auth_SentCode) tLObject3, z12);
                } else if (tL_error3 != null) {
                    String str2 = tL_error3.text;
                    if (str2 == null || !str2.startsWith("FLOOD_WAIT_")) {
                        String str3 = tL_error3.text;
                        if (str3 == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(str3)) {
                            rf0Var.e = tL_error3.text;
                            rf0Var.f = false;
                            dVar.setLoading(false);
                            new org.telegram.ui.Components.xc(ig0Var3.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error3.text));
                            break;
                        } else {
                            ig0Var3.y1(0, true, null, true);
                            ig0Var3.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new of0(rf0Var, 2), Integer.parseInt(tL_error3.text.substring(11)) * MediaDataController.MAX_STYLE_RUNS_COUNT);
                        break;
                    }
                }
                break;
            case 5:
                rf0 rf0Var2 = (rf0) this.b;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.c;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.d;
                ig0 ig0Var4 = rf0Var2.v;
                ig0Var4.e = true;
                ig0 ig0Var5 = (ig0) LaunchActivity.N();
                if (ig0Var5 == null) {
                    i18 = ((org.telegram.ui.ActionBar.o2) ig0Var4).currentAccount;
                    ig0Var5 = new ig0(i18);
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(ig0Var5);
                    }
                }
                ig0Var5.u1(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
                break;
            case 6:
                hg0 hg0Var = (hg0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                HashMap hashMap = (HashMap) this.d;
                pj0 pj0Var = hg0Var.a;
                if (tLObject4 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject4;
                    if (pj0Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList4 = hg0Var.G;
                        if (((String) hashMap.get(upperCase)) != null && arrayList4 != null) {
                            int i42 = 0;
                            while (true) {
                                if (i42 >= arrayList4.size()) {
                                    ltVar = null;
                                } else if (arrayList4.get(i42) == null || !((lt) arrayList4.get(i42)).a.equals(upperCase)) {
                                    i42++;
                                } else {
                                    ltVar = (lt) arrayList4.get(i42);
                                }
                            }
                            if (ltVar != null) {
                                pj0Var.setText(ltVar.c);
                                hg0Var.E = 0;
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                mh0 mh0Var = (mh0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error4 != null) {
                    mh0Var.getClass();
                    break;
                } else {
                    mh0 mh0Var2 = mh0Var.s0.a;
                    int i43 = 0;
                    while (true) {
                        ArrayList arrayList5 = mh0Var2.j0;
                        if (i43 >= arrayList5.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList5.get(i43)).link.equals(tL_chatInviteExported.link)) {
                            dh0 g02 = mh0Var2.g0();
                            arrayList5.remove(i43);
                            mh0Var2.i0(g02);
                            break;
                        } else {
                            i43++;
                        }
                    }
                }
            case 8:
                AndroidUtilities.runOnUIThread(new bh0(4, (org.telegram.ui.Components.qy) this.d, MessagesStorage.getInstance(((rj0) this.b).currentAccount).getUser(((TLRPC.TL_contact) this.c).user_id)));
                break;
            case 9:
                rj0.m((rj0) this.b, (TLObject) this.c, (org.telegram.ui.Components.qy) this.d);
                break;
            case 10:
                fk0 fk0Var = (fk0) this.b;
                String str4 = (String) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = fk0Var.n;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j90(fk0Var, new ArrayList(), new ArrayList(), new ArrayList(), 29));
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
                        ik0 ik0Var = (ik0) arrayList6.get(i45);
                        if (DialogObject.isEncryptedDialog(ik0Var.d)) {
                            i19 = i29;
                            arrayList = arrayList6;
                            TLRPC.EncryptedChat l4 = org.telegram.messenger.v0.l(notificationsCustomSettingsActivity2.getMessagesController(), ik0Var.d);
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
                            if (DialogObject.isUserDialog(ik0Var.d)) {
                                TLRPC.User user3 = notificationsCustomSettingsActivity2.getMessagesController().getUser(Long.valueOf(ik0Var.d));
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
                                        if ((str7 == null || !(str7.startsWith(str6) || org.telegram.messenger.v0.w(" ", str6, strArr4[i21]))) && (translitString == null || !(translitString.startsWith(str6) || org.telegram.messenger.v0.w(" ", str6, translitString)))) {
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
                                            arrayList8.add(ik0Var);
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
                                TLRPC.Chat chat2 = notificationsCustomSettingsActivity2.getMessagesController().getChat(Long.valueOf(-ik0Var.d));
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
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j90(fk0Var, arrayList8, arrayList9, arrayList7, 29));
                    break;
                }
                break;
            case 11:
                NotificationsSettingsActivity.W((NotificationsSettingsActivity) this.b, (ArrayList) this.c, (Runnable) this.d);
                break;
            case 12:
                an0 an0Var = (an0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                an0Var.w1();
                if (tL_error5 == null) {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject5;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(an0Var.getParentActivity());
                    alertDialog$Builder.a.T = LocaleController.formatString("RestoreEmailSent", R.string.RestoreEmailSent, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RestoreEmailSentTitle);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ql0(i31, an0Var, tL_auth_passwordRecovery));
                    Dialog showDialog = an0Var.showDialog(alertDialog$Builder.a);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                } else if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error5.text).intValue();
                    an0Var.L1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    break;
                } else {
                    an0Var.L1(LocaleController.getString(R.string.AppName), tL_error5.text);
                    break;
                }
                break;
            case 13:
                ((om0) this.b).a(((TLRPC.TL_error) this.c).text, (String) this.d);
                break;
            case 14:
                mm0 mm0Var = (mm0) this.b;
                byte[] bArr = (byte[]) this.c;
                String str9 = (String) this.d;
                SecureRandom secureRandom = Utilities.random;
                an0 an0Var2 = mm0Var.e;
                secureRandom.setSeed(an0Var2.J.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = an0Var2.J;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] o12 = an0.o1();
                an0Var2.c1 = o12;
                an0Var2.b1 = Utilities.bytesToLong(Utilities.computeSHA256(o12));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = an0Var2.J.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] computePBKDF2 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str9), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    an0Var2.e1 = computePBKDF2;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(computePBKDF2, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(an0Var2.e1, 32, bArr3, 0, 16);
                    byte[] bArr4 = an0Var2.c1;
                    Utilities.aesCbcEncryptionByteArraySafe(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = an0Var2.c1;
                    tL_secureSecretSettings.secure_secret_id = an0Var2.b1;
                    passwordinputsettings.flags |= 4;
                }
                i24 = ((org.telegram.ui.ActionBar.o2) an0Var2).currentAccount;
                ConnectionsManager.getInstance(i24).sendRequest(updatepasswordsettings, new km0(mm0Var, i28));
                break;
            case 15:
                wm0 wm0Var = (wm0) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.c;
                TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.d;
                int i48 = wm0Var.L;
                an0 an0Var3 = wm0Var.Q;
                an0Var3.w1();
                wm0Var.J = false;
                if (tL_error6 == null) {
                    wm0Var.r();
                    wm0Var.q();
                    ((dm0) an0Var3.B1).c(an0Var3.E, (String) an0Var3.s1.get("phone"), null, null, null, null, null, null, null, null, new kl0(an0Var3, 6), null);
                    break;
                } else {
                    wm0Var.K = tL_error6.text;
                    if ((i48 == 3 && ((i27 = wm0Var.M) == 4 || i27 == 2)) || ((i48 == 2 && ((i25 = wm0Var.M) == 4 || i25 == 3)) || (i48 == 4 && wm0Var.M == 2))) {
                        wm0Var.p();
                    }
                    if (i48 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(wm0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i48 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(wm0Var, NotificationCenter.didReceiveCall);
                    }
                    wm0Var.I = true;
                    if (i48 != 3) {
                        i26 = ((org.telegram.ui.ActionBar.o2) an0Var3).currentAccount;
                        org.telegram.ui.Components.f5.f0(i26, tL_error6, an0Var3, verifyphone, new Object[0]);
                    }
                    an0Var3.M1(true, false);
                    if (!tL_error6.text.contains("PHONE_CODE_EMPTY") && !tL_error6.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error6.text.contains("PHONE_CODE_EXPIRED")) {
                            wm0Var.c(true);
                            an0Var3.J1(null, 0, true);
                            break;
                        }
                    } else {
                        int i49 = 0;
                        while (true) {
                            EditTextBoldCursor[] editTextBoldCursorArr = wm0Var.d;
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
            case 16:
                io0.U((io0) this.b, (TL_account.Password) this.c, (byte[]) this.d);
                break;
            case 17:
                io0.b0((io0) this.b, (TLRPC.TL_error) this.c, (TLRPC.TL_payments_sendPaymentForm) this.d);
                break;
            case 18:
                io0 io0Var = (io0) this.b;
                TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.c;
                bh0 bh0Var = (bh0) this.d;
                io0Var.E0 = tL_payments_validatedRequestedInfo;
                bh0Var.run();
                io0Var.D0(false);
                io0Var.H0(true, false);
                break;
            case 19:
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
            case 20:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                tq0 tq0Var = (tq0) this.d;
                photoViewer2.C4.setImageBitmap(bitmap);
                photoViewer2.t5.setUndoCutState(true);
                photoViewer2.c3(true, true);
                AndroidUtilities.cancelRunOnUIThread(tq0Var);
                AndroidUtilities.runOnUIThread(tq0Var, 800L);
                break;
            case 21:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                boolean[] zArr = (boolean[]) this.c;
                or0 or0Var = (or0) this.d;
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
                    or0Var.run();
                    break;
                }
                break;
            case 22:
                st0 st0Var = (st0) this.b;
                st0 st0Var2 = (st0) this.c;
                int[] iArr = (int[]) this.d;
                PhotoViewer photoViewer4 = st0Var.d;
                if (photoViewer4.y != null && st0Var2 == photoViewer4.x8) {
                    photoViewer4.x8 = null;
                    photoViewer4.q8 = iArr[5];
                    photoViewer4.i8 = iArr[4];
                    photoViewer4.j8 = iArr[7];
                    float f7 = photoViewer4.g8 / 8;
                    PhotoViewer photoViewer5 = st0Var.d;
                    photoViewer4.r8 = (long) ((f7 * photoViewer5.i8) / 1000.0f);
                    if (photoViewer5.k8) {
                        PhotoViewer photoViewer6 = st0Var.d;
                        photoViewer6.b8 = iArr[8];
                        photoViewer6.F3();
                        if (st0Var.d.Y7 > st0Var.d.Z7 - 1) {
                            PhotoViewer photoViewer7 = st0Var.d;
                            photoViewer7.Y7 = photoViewer7.Z7 - 1;
                        }
                        PhotoViewer photoViewer8 = st0Var.d;
                        if (!photoViewer8.J4) {
                            org.telegram.ui.Components.w71 w71Var = photoViewer8.j1;
                            boolean z13 = photoViewer8.Z7 > 1;
                            PhotoViewer photoViewer9 = st0Var.d;
                            w71Var.a(Math.min(photoViewer9.e8, st0Var.d.f8), z13, photoViewer9.r);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb2 = new StringBuilder("compressionsCount = ");
                            sb2.append(st0Var.d.Z7);
                            sb2.append(" w = ");
                            sb2.append(st0Var.d.c8);
                            sb2.append(" h = ");
                            sb2.append(st0Var.d.d8);
                            sb2.append(" r = ");
                            org.telegram.messenger.v0.n(st0Var.d.b8, sb2);
                        }
                        st0Var.d.O7.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = st0Var.d;
                        if (!photoViewer10.J4) {
                            photoViewer10.j1.a(Math.min(photoViewer10.e8, st0Var.d.f8), false, photoViewer10.r);
                        }
                        st0Var.d.Z7 = 0;
                    }
                    st0Var.d.D3();
                    st0Var.d.z3();
                    break;
                }
                break;
            case 23:
                uv0 uv0Var = (uv0) this.b;
                sn snVar = (sn) this.c;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.d;
                MessageObject messageObject = uv0Var.H;
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
                snVar.Ib(messageObject, inVar);
                uv0Var.c(false);
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                if (tL_error7 != null) {
                    org.telegram.ui.Components.xc.d0(tL_error7);
                    break;
                } else if (!(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.messenger.sl.q(R.string.UnknownError, org.telegram.ui.Components.xc.a0(premiumPreviewFragment), null);
                    break;
                }
                break;
            case 25:
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
                profileActivity.i5(true, false);
                break;
            case 26:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                org.telegram.ui.Components.oo ooVar = (org.telegram.ui.Components.oo) this.c;
                sn snVar2 = (sn) this.d;
                org.telegram.ui.Components.ko koVar = ooVar.e;
                ViewGroup viewGroup = (ViewGroup) snVar2.fragmentView;
                RectF rectF = ih.k.h;
                ih.k.c(koVar, viewGroup, rectF);
                profileActivity2.Q5 = rectF.left;
                profileActivity2.P3();
                break;
            case 27:
                org.telegram.ui.Components.xc.D((vb) this.b, (TLRPC.User) this.c, ((TLRPC.Chat) this.d).title).j();
                break;
            case 28:
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
                    u31 u31Var = secretMediaViewer.n;
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    long j10 = message2.destroyTimeMillis;
                    long j11 = message2.ttl;
                    u31Var.e = false;
                    u31Var.f = j10;
                    u31Var.h = j11;
                    u31Var.n.start();
                    u31Var.invalidate();
                    if (secretMediaViewer.h1) {
                        secretMediaViewer.e(true, true);
                        break;
                    } else if (secretMediaViewer.q1 && MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) < 3) {
                        secretMediaViewer.l();
                        break;
                    }
                }
                break;
            default:
                g71 g71Var = (g71) this.b;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                SessionsActivity sessionsActivity = g71Var.j0;
                if (tL_error8 == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.m0();
                    l71 l71Var = sessionsActivity.a;
                    if (l71Var != null) {
                        l71Var.l();
                    }
                    sessionsActivity.k0(true);
                    break;
                }
                break;
        }
    }
}
