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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qd0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        HashSet hashSet = (HashSet) this.d;
        RectF rectF = ProfileActivity.R6;
        profileActivity.getClass();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i10);
            if (!hashSet.contains(Long.valueOf(user.id))) {
                TLRPC.ChatFull chatFull = profileActivity.t2;
                if (chatFull.participants == null) {
                    chatFull.participants = new TLRPC.TL_chatParticipants();
                }
                if (org.telegram.messenger.w3.T(profileActivity.D2)) {
                    TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                    TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                    tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                    tL_channelParticipant.inviter_id = profileActivity.getUserConfig().e();
                    tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                    TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                    channelParticipant.peer.user_id = user.id;
                    channelParticipant.date = profileActivity.getConnectionsManager().getCurrentTime();
                    tL_chatChannelParticipant.user_id = user.id;
                    profileActivity.t2.participants.participants.add(tL_chatChannelParticipant);
                } else {
                    TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                    tL_chatParticipant.user_id = user.id;
                    tL_chatParticipant.inviter_id = org.telegram.messenger.d20.i(profileActivity.getAccountInstance().a).n;
                    profileActivity.t2.participants.participants.add(tL_chatParticipant);
                }
                profileActivity.t2.participants_count++;
                profileActivity.getMessagesController().U3(user, false, false);
            }
        }
        profileActivity.C5(true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:386:0x0995, code lost:
    
        if (r10 != 16) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x099f, code lost:
    
        if (r10 == 3) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x09ad, code lost:
    
        if (r10 == 16) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0ad4, code lost:
    
        if (r10 != 16) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0ade, code lost:
    
        if (r10 == 3) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0aec, code lost:
    
        if (r10 == 16) goto L424;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:195:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x09e8  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x09c4  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0af8  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0b27  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0b39  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0b03  */
    /* JADX WARN: Type inference failed for: r26v1 */
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
        nt ntVar;
        TLRPC.User user;
        int i19;
        boolean z13;
        boolean z14;
        ArrayList arrayList;
        si0 si0Var;
        TLRPC.Chat chat;
        String R0;
        String str;
        int i20;
        int i21;
        char c10;
        String G;
        int i22;
        int i23;
        boolean z15;
        int i24;
        int i25;
        TLRPC.Message message;
        int i26 = 2;
        int i27 = 5;
        kn knVar = null;
        switch (this.a) {
            case 0:
                wd0 wd0Var = (wd0) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                hf0 hf0Var = wd0Var.O;
                wd0Var.H = false;
                if (!(tLObject instanceof TLRPC.TL_auth_authorization)) {
                    hf0Var.s1(false, true);
                    if (!tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                            if (!tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                if (!tL_error.text.contains("FIRSTNAME_INVALID")) {
                                    if (!tL_error.text.contains("LASTNAME_INVALID")) {
                                        hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error.text);
                                        break;
                                    } else {
                                        hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749190, "InvalidLastName"));
                                        break;
                                    }
                                } else {
                                    hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749192, "InvalidFirstName"));
                                    break;
                                }
                            } else {
                                wd0Var.c(true);
                                hf0Var.C1(0, true, null, true);
                                hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, "CodeExpired"));
                                break;
                            }
                        } else {
                            hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749193, "InvalidCode"));
                            break;
                        }
                    } else {
                        hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749189, "InvalidPhoneNumber"));
                        break;
                    }
                } else {
                    wd0Var.n();
                    hf0Var.D1(false, true);
                    wd0Var.postDelayed(new f70(20, wd0Var, tLObject), 150L);
                    break;
                }
                break;
            case 1:
                wd0 wd0Var2 = (wd0) this.b;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.FileLocation fileLocation = photoSize.location;
                wd0Var2.M = fileLocation;
                wd0Var2.N = photoSize2.location;
                wd0Var2.e.j(org.telegram.messenger.ic.e(fileLocation), "50_50", wd0Var2.f, null);
                break;
            case 2:
                me0 me0Var = (me0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) this.c;
                int i28 = me0Var.h0;
                hf0 hf0Var2 = me0Var.u0;
                me0Var.y(false);
                me0Var.f0 = false;
                if (tL_error2 == null) {
                    Activity parentActivity = hf0Var2.getParentActivity();
                    if (parentActivity != null) {
                        me0Var.p(new f70(23, me0Var, parentActivity));
                        break;
                    }
                } else {
                    me0Var.g0 = tL_error2.text;
                    if (i28 == 3) {
                        int i29 = me0Var.i0;
                        i10 = 2;
                        if (i29 != 4) {
                            if (i29 != 2) {
                                if (i29 != 17) {
                                    break;
                                }
                            }
                        }
                        me0Var.s();
                        if (i28 == 15) {
                            org.telegram.messenger.zs.e().b(me0Var, org.telegram.messenger.zs.g4);
                            z10 = true;
                        } else if (i28 == 2) {
                            z10 = true;
                            org.telegram.messenger.i0.D3(true);
                            org.telegram.messenger.zs.e().b(me0Var, org.telegram.messenger.zs.g4);
                        } else {
                            z10 = true;
                            if (i28 == 3) {
                                org.telegram.messenger.i0.C3(true);
                                org.telegram.messenger.zs.e().b(me0Var, org.telegram.messenger.zs.h4);
                            }
                        }
                        me0Var.e0 = z10;
                        if (i28 != 3) {
                            i11 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                            org.telegram.ui.Components.s4.e0(i11, tL_error2, hf0Var2, confirmphone, new Object[0]);
                        }
                        if (tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                me0Var.c(true);
                                hf0Var2.C1(0, true, null, true);
                                break;
                            }
                        } else {
                            me0Var.w();
                            break;
                        }
                    } else {
                        i10 = 2;
                    }
                    if (i28 == i10) {
                        int i30 = me0Var.i0;
                        if (i30 != 4) {
                        }
                        me0Var.s();
                        if (i28 == 15) {
                        }
                        me0Var.e0 = z10;
                        if (i28 != 3) {
                        }
                        if (tL_error2.text.contains("PHONE_CODE_EMPTY")) {
                        }
                        me0Var.w();
                    }
                    if (i28 == 4) {
                        int i31 = me0Var.i0;
                        if (i31 != i10) {
                            if (i31 != 17) {
                                break;
                            }
                        }
                        me0Var.s();
                    }
                    if (i28 == 15) {
                    }
                    me0Var.e0 = z10;
                    if (i28 != 3) {
                    }
                    if (tL_error2.text.contains("PHONE_CODE_EMPTY")) {
                    }
                    me0Var.w();
                }
                break;
            case 3:
                me0 me0Var2 = (me0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.c;
                int i32 = me0Var2.h0;
                hf0 hf0Var3 = me0Var2.u0;
                me0Var2.y(false);
                me0Var2.f0 = false;
                if (tL_error3 == null) {
                    TLRPC.User user2 = (TLRPC.User) tLObject2;
                    me0Var2.u();
                    me0Var2.t();
                    i13 = ((org.telegram.ui.ActionBar.k2) hf0Var3).currentAccount;
                    org.telegram.messenger.d20.i(i13).w(user2);
                    i14 = ((org.telegram.ui.ActionBar.k2) hf0Var3).currentAccount;
                    org.telegram.messenger.d20.i(i14).v(true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user2);
                    i15 = ((org.telegram.ui.ActionBar.k2) hf0Var3).currentAccount;
                    org.telegram.messenger.hs.a0(i15).m1(arrayList2, null, true, true);
                    i16 = ((org.telegram.ui.ActionBar.k2) hf0Var3).currentAccount;
                    org.telegram.messenger.vp.r1(i16).U3(user2, false, false);
                    i17 = ((org.telegram.ui.ActionBar.k2) hf0Var3).currentAccount;
                    org.telegram.messenger.zs.f(i17).k(46, new Object[0]);
                    hf0Var3.getMessagesController().h4(0L, "VALIDATE_PHONE_NUMBER");
                    if (i32 == 3) {
                        org.telegram.messenger.i0.T();
                    }
                    me0Var2.p(new ae0(me0Var2, 5));
                    break;
                } else {
                    me0Var2.g0 = tL_error3.text;
                    me0Var2.f0 = false;
                    hf0Var3.D1(false, true);
                    if (i32 == 3) {
                        int i33 = me0Var2.i0;
                        if (i33 != 4) {
                            i12 = 2;
                            if (i33 != 2) {
                                if (i33 != 17) {
                                    break;
                                }
                            }
                        }
                        me0Var2.s();
                        if (i32 == 15) {
                            org.telegram.messenger.zs.e().b(me0Var2, org.telegram.messenger.zs.g4);
                            z11 = true;
                        } else if (i32 == 2) {
                            z11 = true;
                            org.telegram.messenger.i0.D3(true);
                            org.telegram.messenger.zs.e().b(me0Var2, org.telegram.messenger.zs.g4);
                        } else {
                            z11 = true;
                            if (i32 == 3) {
                                org.telegram.messenger.i0.C3(true);
                                org.telegram.messenger.zs.e().b(me0Var2, org.telegram.messenger.zs.h4);
                            }
                        }
                        me0Var2.e0 = z11;
                        if (i32 != 3) {
                            if (tL_error3.text.contains("PHONE_NUMBER_INVALID")) {
                                hf0Var3.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749189, "InvalidPhoneNumber"));
                            } else if (tL_error3.text.contains("PHONE_CODE_EMPTY") || tL_error3.text.contains("PHONE_CODE_INVALID")) {
                                me0Var2.w();
                                break;
                            } else if (tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                                me0Var2.c(true);
                                hf0Var3.C1(0, true, null, true);
                                hf0Var3.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, "CodeExpired"));
                            } else if (tL_error3.text.startsWith("FLOOD_WAIT")) {
                                hf0Var3.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131750688, "FloodWait"));
                            } else {
                                String L0 = org.telegram.messenger.cd.L0(2131746088, null);
                                StringBuilder sb2 = new StringBuilder();
                                org.telegram.messenger.z20.q("ErrorOccurred", 2131751106, sb2, "\n");
                                sb2.append(tL_error3.text);
                                hf0Var3.t1(L0, sb2.toString());
                            }
                            int i34 = 0;
                            while (true) {
                                zr zrVar = me0Var2.f;
                                bs[] bsVarArr = zrVar.f;
                                if (i34 >= bsVarArr.length) {
                                    zrVar.e = false;
                                    bsVarArr[0].requestFocus();
                                    break;
                                } else {
                                    bsVarArr[i34].setText("");
                                    i34++;
                                }
                            }
                        }
                    } else {
                        i12 = 2;
                    }
                    if (i32 == i12) {
                        int i35 = me0Var2.i0;
                        if (i35 != 4) {
                        }
                        me0Var2.s();
                        if (i32 == 15) {
                        }
                        me0Var2.e0 = z11;
                        if (i32 != 3) {
                        }
                    }
                    if (i32 == 4) {
                        int i36 = me0Var2.i0;
                        if (i36 != i12) {
                            if (i36 != 17) {
                                break;
                            }
                        }
                        me0Var2.s();
                    }
                    if (i32 == 15) {
                    }
                    me0Var2.e0 = z11;
                    if (i32 != 3) {
                    }
                }
                break;
            case 4:
                me0 me0Var3 = (me0) this.b;
                Bundle bundle = (Bundle) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                me0Var3.q0 = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject3;
                me0Var3.r0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    me0Var3.i0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    me0Var3.i0 = 16;
                }
                me0Var3.u0.o1(bundle, tL_auth_sentCode, true);
                break;
            case 5:
                se0 se0Var = (se0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                vh.d dVar = se0Var.b;
                hf0 hf0Var4 = se0Var.w;
                se0Var.s = -1;
                if (!(tLObject4 instanceof TLRPC.auth_SentCode)) {
                    if (tL_error4 != null) {
                        String str2 = tL_error4.text;
                        if (str2 != null && str2.startsWith("FLOOD_WAIT_")) {
                            org.telegram.messenger.i0.h3(new ne0(se0Var, 0), Integer.parseInt(tL_error4.text.substring(11)) * 1000);
                            break;
                        } else {
                            String str3 = tL_error4.text;
                            if (str3 != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(str3)) {
                                hf0Var4.C1(0, true, null, true);
                                hf0Var4.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, null));
                                break;
                            } else {
                                se0Var.e = tL_error4.text;
                                se0Var.f = false;
                                dVar.setLoading(false);
                                new org.telegram.ui.Components.cc(hf0Var4.Z, null).H(R.raw.error, org.telegram.messenger.cd.a0(null, null, 2131743903, tL_error4.text));
                                break;
                            }
                        }
                    }
                } else {
                    se0Var.f = false;
                    dVar.setLoading(false);
                    org.telegram.ui.ActionBar.z4 parentLayout = hf0Var4.getParentLayout();
                    if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        org.telegram.ui.ActionBar.k2 k2Var = fragmentStack.isEmpty() ? null : (org.telegram.ui.ActionBar.k2) sc.e.g(1, fragmentStack);
                        ArrayList arrayList3 = new ArrayList(fragmentStack);
                        int size = arrayList3.size();
                        int i37 = 0;
                        while (i37 < size) {
                            Object obj = arrayList3.get(i37);
                            i37++;
                            org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj;
                            if ((k2Var2 instanceof sm0) && k2Var2 != k2Var) {
                                k2Var2.removeSelfFromStack();
                            }
                        }
                        if (k2Var instanceof sm0) {
                            z12 = true;
                            ((ActionBarLayout) parentLayout).l(true, false);
                            hf0Var4.o1(se0Var.d, (TLRPC.auth_SentCode) tLObject4, z12);
                            break;
                        }
                    }
                    z12 = true;
                    hf0Var4.o1(se0Var.d, (TLRPC.auth_SentCode) tLObject4, z12);
                }
                break;
            case 6:
                se0 se0Var2 = (se0) this.b;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.c;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.d;
                hf0 hf0Var5 = se0Var2.w;
                hf0Var5.e = true;
                hf0 hf0Var6 = (hf0) LaunchActivity.L();
                if (hf0Var6 == null) {
                    i18 = ((org.telegram.ui.ActionBar.k2) hf0Var5).currentAccount;
                    hf0Var6 = new hf0(i18);
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(hf0Var6);
                    }
                }
                hf0Var6.y1(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
                break;
            case 7:
                gf0 gf0Var = (gf0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                HashMap hashMap = (HashMap) this.d;
                ef0 ef0Var = gf0Var.a;
                if (tLObject5 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject5;
                    if (ef0Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList4 = gf0Var.G;
                        if (((String) hashMap.get(upperCase)) != null && arrayList4 != null) {
                            int i38 = 0;
                            while (true) {
                                if (i38 >= arrayList4.size()) {
                                    ntVar = null;
                                } else if (arrayList4.get(i38) == null || !((nt) arrayList4.get(i38)).a.equals(upperCase)) {
                                    i38++;
                                } else {
                                    ntVar = (nt) arrayList4.get(i38);
                                }
                            }
                            if (ntVar != null) {
                                ef0Var.setText(ntVar.c);
                                gf0Var.E = 0;
                                break;
                            }
                        }
                    }
                }
                break;
            case 8:
                kg0 kg0Var = (kg0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.c;
                if (tL_error5 != null) {
                    kg0Var.getClass();
                    break;
                } else {
                    kg0 kg0Var2 = kg0Var.s0.a;
                    int i39 = 0;
                    while (true) {
                        ArrayList arrayList5 = kg0Var2.j0;
                        if (i39 >= arrayList5.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList5.get(i39)).link.equals(tL_chatInviteExported.link)) {
                            bg0 k02 = kg0Var2.k0();
                            arrayList5.remove(i39);
                            kg0Var2.m0(k02);
                            break;
                        } else {
                            i39++;
                        }
                    }
                }
            case 9:
                org.telegram.messenger.i0.g3(new uf0(i27, (org.telegram.ui.Components.vg) this.d, org.telegram.messenger.hs.a0(((gi0) this.b).a).j0(((TLRPC.TL_contact) this.c).user_id)));
                break;
            case 10:
                gi0 gi0Var = (gi0) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                org.telegram.ui.Components.vg vgVar = (org.telegram.ui.Components.vg) this.d;
                if (tLObject6 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject6;
                    org.telegram.messenger.vp.r1(gi0Var.a).V3(tL_contacts_resolvedPeer.users, false);
                    org.telegram.messenger.vp.r1(gi0Var.a).P3(tL_contacts_resolvedPeer.chats, false);
                    long o10 = org.telegram.messenger.o5.o(tL_contacts_resolvedPeer.peer);
                    if (o10 >= 0) {
                        user = org.telegram.messenger.vp.r1(gi0Var.a).Z1(Long.valueOf(o10));
                        vgVar.a(user);
                        break;
                    }
                }
                user = null;
                vgVar.a(user);
            case 11:
                si0 si0Var2 = (si0) this.b;
                String str4 = (String) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = si0Var2.n;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    String R02 = org.telegram.messenger.cd.D0().R0(lowerCase, true, false);
                    if (lowerCase.equals(R02) || R02.length() == 0) {
                        R02 = null;
                    }
                    int i40 = (R02 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i40];
                    strArr[0] = lowerCase;
                    if (R02 != null) {
                        strArr[1] = R02;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    String[] strArr2 = new String[2];
                    int i41 = 0;
                    while (i41 < arrayList6.size()) {
                        ui0 ui0Var = (ui0) arrayList6.get(i41);
                        if (org.telegram.messenger.o5.C(ui0Var.d)) {
                            i19 = i41;
                            TLRPC.EncryptedChat Z0 = notificationsCustomSettingsActivity.getMessagesController().Z0(Integer.valueOf((int) (ui0Var.d & 4294967295L)));
                            if (Z0 != null) {
                                z13 = r15;
                                TLRPC.User Z1 = notificationsCustomSettingsActivity.getMessagesController().Z1(Long.valueOf(Z0.user_id));
                                if (Z1 != null) {
                                    strArr2[0] = org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name);
                                    strArr2[z13 ? 1 : 0] = org.telegram.messenger.h20.n(Z1);
                                }
                            } else {
                                z13 = r15;
                            }
                        } else {
                            i19 = i41;
                            z13 = r15;
                            if (org.telegram.messenger.o5.E(ui0Var.d)) {
                                TLRPC.User Z12 = notificationsCustomSettingsActivity.getMessagesController().Z1(Long.valueOf(ui0Var.d));
                                if (Z12 != null && !Z12.deleted) {
                                    strArr2[0] = org.telegram.messenger.i5.m(0, Z12.first_name, Z12.last_name);
                                    strArr2[z13 ? 1 : 0] = org.telegram.messenger.h20.n(Z12);
                                    z14 = false;
                                    chat = Z12;
                                    String str5 = strArr2[z14 ? 1 : 0];
                                    strArr2[z14 ? 1 : 0] = str5.toLowerCase();
                                    arrayList = arrayList6;
                                    R0 = org.telegram.messenger.cd.D0().R0(strArr2[z14 ? 1 : 0], z13, z14);
                                    str = strArr2[z14 ? 1 : 0];
                                    if (str != null && str.equals(R0)) {
                                        R0 = null;
                                    }
                                    i20 = z14 ? 1 : 0;
                                    int i42 = i20;
                                    while (i20 < i40) {
                                        ?? r26 = z14;
                                        String str6 = strArr[i20];
                                        int i43 = i20;
                                        String str7 = strArr2[r26];
                                        si0Var = si0Var2;
                                        if ((str7 == null || !(str7.startsWith(str6) || sc.e.y(" ", str6, strArr2[r26]))) && (R0 == null || !(R0.startsWith(str6) || sc.e.y(" ", str6, R0)))) {
                                            i21 = 1;
                                            String str8 = strArr2[1];
                                            if (str8 != null && str8.startsWith(str6)) {
                                                i42 = 2;
                                            }
                                        } else {
                                            i21 = 1;
                                            i42 = 1;
                                        }
                                        if (i42 != 0) {
                                            if (i42 == i21) {
                                                arrayList9.add(org.telegram.messenger.i0.r0(str5, null, str6));
                                            } else {
                                                arrayList9.add(org.telegram.messenger.i0.r0("@" + strArr2[i21], null, "@" + str6));
                                            }
                                            arrayList8.add(ui0Var);
                                            if (chat != null) {
                                                arrayList7.add(chat);
                                            }
                                        } else {
                                            i20 = i43 + 1;
                                            si0Var2 = si0Var;
                                            z14 = false;
                                        }
                                    }
                                    si0Var = si0Var2;
                                }
                                arrayList = arrayList6;
                                si0Var = si0Var2;
                            } else {
                                TLRPC.Chat L02 = notificationsCustomSettingsActivity.getMessagesController().L0(Long.valueOf(-ui0Var.d));
                                if (L02 != null) {
                                    if (!L02.left && !L02.kicked && L02.migrated_to == null) {
                                        z14 = false;
                                        strArr2[0] = L02.title;
                                        strArr2[z13 ? 1 : 0] = org.telegram.messenger.w3.K(L02, false);
                                        chat = L02;
                                        String str52 = strArr2[z14 ? 1 : 0];
                                        strArr2[z14 ? 1 : 0] = str52.toLowerCase();
                                        arrayList = arrayList6;
                                        R0 = org.telegram.messenger.cd.D0().R0(strArr2[z14 ? 1 : 0], z13, z14);
                                        str = strArr2[z14 ? 1 : 0];
                                        if (str != null) {
                                            R0 = null;
                                        }
                                        i20 = z14 ? 1 : 0;
                                        int i422 = i20;
                                        while (i20 < i40) {
                                        }
                                        si0Var = si0Var2;
                                    }
                                    arrayList = arrayList6;
                                    si0Var = si0Var2;
                                }
                            }
                            i41 = i19 + 1;
                            arrayList6 = arrayList;
                            si0Var2 = si0Var;
                            r15 = true;
                        }
                        z14 = false;
                        chat = null;
                        String str522 = strArr2[z14 ? 1 : 0];
                        strArr2[z14 ? 1 : 0] = str522.toLowerCase();
                        arrayList = arrayList6;
                        R0 = org.telegram.messenger.cd.D0().R0(strArr2[z14 ? 1 : 0], z13, z14);
                        str = strArr2[z14 ? 1 : 0];
                        if (str != null) {
                        }
                        i20 = z14 ? 1 : 0;
                        int i4222 = i20;
                        while (i20 < i40) {
                        }
                        si0Var = si0Var2;
                        i41 = i19 + 1;
                        arrayList6 = arrayList;
                        si0Var2 = si0Var;
                        r15 = true;
                    }
                    org.telegram.messenger.i0.g3(new w50(si0Var2, arrayList8, arrayList9, arrayList7, 14));
                    break;
                } else {
                    org.telegram.messenger.i0.g3(new w50(si0Var2, new ArrayList(), new ArrayList(), new ArrayList(), 14));
                    break;
                }
                break;
            case 12:
                NotificationsSettingsActivity.a0((NotificationsSettingsActivity) this.b, (ArrayList) this.c, (Runnable) this.d);
                break;
            case 13:
                ll0 ll0Var = (ll0) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.c;
                ll0Var.A1();
                if (tL_error6 != null) {
                    if (!tL_error6.text.startsWith("FLOOD_WAIT")) {
                        ll0Var.P1(org.telegram.messenger.cd.L0(R.string.AppName, null), tL_error6.text);
                        break;
                    } else {
                        int intValue = Utilities.z(tL_error6.text).intValue();
                        if (intValue < 60) {
                            c10 = 0;
                            G = org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            c10 = 0;
                            G = org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        String L03 = org.telegram.messenger.cd.L0(R.string.AppName, null);
                        Object[] objArr = new Object[1];
                        objArr[c10] = G;
                        ll0Var.P1(L03, org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, objArr));
                        break;
                    }
                } else {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject7;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ll0Var.getParentActivity());
                    alertDialog$Builder.a.T = org.telegram.messenger.cd.a0("RestoreEmailSent", null, 2131746097, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(2131746095, null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), new rv(28, ll0Var, tL_auth_passwordRecovery));
                    Dialog showDialog = ll0Var.showDialog(alertDialog$Builder.a);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                }
                break;
            case 14:
                ((zk0) this.b).d(((TLRPC.TL_error) this.d).text, (String) this.c);
                break;
            case 15:
                yk0 yk0Var = (yk0) this.b;
                byte[] bArr = (byte[]) this.c;
                String str9 = (String) this.d;
                SecureRandom secureRandom = Utilities.b;
                ll0 ll0Var2 = yk0Var.e;
                secureRandom.setSeed(ll0Var2.J.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = ll0Var2.J;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = org.telegram.messenger.aw.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] s12 = ll0.s1();
                ll0Var2.c1 = s12;
                ll0Var2.b1 = Utilities.g(Utilities.o(32, s12));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = ll0Var2.J.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] m10 = Utilities.m(org.telegram.messenger.i0.h1(str9), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    ll0Var2.e1 = m10;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(m10, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(ll0Var2.e1, 32, bArr3, 0, 16);
                    byte[] bArr4 = ll0Var2.c1;
                    Utilities.b(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = ll0Var2.c1;
                    tL_secureSecretSettings.secure_secret_id = ll0Var2.b1;
                    passwordinputsettings.flags |= 4;
                }
                i22 = ((org.telegram.ui.ActionBar.k2) ll0Var2).currentAccount;
                ConnectionsManager.getInstance(i22).sendRequest(updatepasswordsettings, new wk0(yk0Var, i26));
                break;
            case 16:
                hl0 hl0Var = (hl0) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.d;
                TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.c;
                int i44 = hl0Var.L;
                ll0 ll0Var3 = hl0Var.Q;
                ll0Var3.A1();
                hl0Var.J = false;
                if (tL_error7 != null) {
                    hl0Var.K = tL_error7.text;
                    if ((i44 == 3 && ((i25 = hl0Var.M) == 4 || i25 == 2)) || ((i44 == 2 && ((i23 = hl0Var.M) == 4 || i23 == 3)) || (i44 == 4 && hl0Var.M == 2))) {
                        hl0Var.p();
                    }
                    if (i44 == 2) {
                        org.telegram.messenger.i0.D3(true);
                        org.telegram.messenger.zs.e().b(hl0Var, org.telegram.messenger.zs.g4);
                    } else if (i44 == 3) {
                        org.telegram.messenger.i0.C3(true);
                        org.telegram.messenger.zs.e().b(hl0Var, org.telegram.messenger.zs.h4);
                    }
                    hl0Var.I = true;
                    if (i44 != 3) {
                        i24 = ((org.telegram.ui.ActionBar.k2) ll0Var3).currentAccount;
                        z15 = false;
                        org.telegram.ui.Components.s4.e0(i24, tL_error7, ll0Var3, verifyphone, new Object[0]);
                    } else {
                        z15 = false;
                    }
                    ll0Var3.Q1(true, z15);
                    if (!tL_error7.text.contains("PHONE_CODE_EMPTY") && !tL_error7.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                            hl0Var.c(true);
                            ll0Var3.N1(null, 0, true);
                            break;
                        }
                    } else {
                        int i45 = 0;
                        while (true) {
                            EditTextBoldCursor[] editTextBoldCursorArr = hl0Var.d;
                            if (i45 >= editTextBoldCursorArr.length) {
                                editTextBoldCursorArr[0].requestFocus();
                                break;
                            } else {
                                editTextBoldCursorArr[i45].setText("");
                                i45++;
                            }
                        }
                    }
                } else {
                    hl0Var.r();
                    hl0Var.q();
                    ((pk0) ll0Var3.B1).c(ll0Var3.E, (String) ll0Var3.s1.get("phone"), null, null, null, null, null, null, null, null, new xj0(ll0Var3, 6), null);
                    break;
                }
                break;
            case 17:
                sm0.Y((sm0) this.b, (TL_account.Password) this.c, (byte[]) this.d);
                break;
            case 18:
                sm0.f0((sm0) this.b, (TLRPC.TL_error) this.d, (TLRPC.TL_payments_sendPaymentForm) this.c);
                break;
            case 19:
                sm0 sm0Var = (sm0) this.b;
                TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.c;
                uf0 uf0Var = (uf0) this.d;
                sm0Var.E0 = tL_payments_validatedRequestedInfo;
                uf0Var.run();
                sm0Var.I0(false);
                sm0Var.M0(true, false);
                break;
            case 20:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.messenger.kc kcVar = (org.telegram.messenger.kc) this.c;
                String str10 = (String) this.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                kcVar.a();
                if (str10.equals(photoViewer.C4.Q)) {
                    photoViewer.w4 = 2;
                    photoViewer.x4 = str10;
                    break;
                }
                break;
            case 21:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                qo0 qo0Var = (qo0) this.d;
                photoViewer2.C4.v0(bitmap);
                photoViewer2.t5.setUndoCutState(true);
                photoViewer2.d3(true, true);
                org.telegram.messenger.i0.r(qo0Var);
                org.telegram.messenger.i0.h3(qo0Var, 800L);
                break;
            case 22:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                boolean[] zArr = (boolean[]) this.c;
                mp0 mp0Var = (mp0) this.d;
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
                    mp0Var.run();
                    break;
                }
                break;
            case 23:
                nr0 nr0Var = (nr0) this.b;
                nr0 nr0Var2 = (nr0) this.c;
                int[] iArr = (int[]) this.d;
                PhotoViewer photoViewer4 = nr0Var.d;
                if (photoViewer4.D != null && nr0Var2 == photoViewer4.x8) {
                    photoViewer4.x8 = null;
                    photoViewer4.q8 = iArr[5];
                    photoViewer4.i8 = iArr[4];
                    photoViewer4.j8 = iArr[7];
                    float f7 = photoViewer4.g8 / 8;
                    PhotoViewer photoViewer5 = nr0Var.d;
                    photoViewer4.r8 = (long) ((f7 * photoViewer5.i8) / 1000.0f);
                    if (photoViewer5.k8) {
                        PhotoViewer photoViewer6 = nr0Var.d;
                        photoViewer6.b8 = iArr[8];
                        photoViewer6.G3();
                        if (nr0Var.d.Y7 > nr0Var.d.Z7 - 1) {
                            PhotoViewer photoViewer7 = nr0Var.d;
                            photoViewer7.Y7 = photoViewer7.Z7 - 1;
                        }
                        PhotoViewer photoViewer8 = nr0Var.d;
                        if (!photoViewer8.J4) {
                            org.telegram.ui.Components.i61 i61Var = photoViewer8.j1;
                            r15 = photoViewer8.Z7 > 1;
                            PhotoViewer photoViewer9 = nr0Var.d;
                            i61Var.a(Math.min(photoViewer9.e8, nr0Var.d.f8), r15, photoViewer9.r);
                        }
                        if (org.telegram.messenger.v2.a) {
                            StringBuilder sb3 = new StringBuilder("compressionsCount = ");
                            sb3.append(nr0Var.d.Z7);
                            sb3.append(" w = ");
                            sb3.append(nr0Var.d.c8);
                            sb3.append(" h = ");
                            sb3.append(nr0Var.d.d8);
                            sb3.append(" r = ");
                            i0.a.p(nr0Var.d.b8, sb3);
                        }
                        nr0Var.d.O7.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = nr0Var.d;
                        if (!photoViewer10.J4) {
                            photoViewer10.j1.a(Math.min(photoViewer10.e8, nr0Var.d.f8), false, photoViewer10.r);
                        }
                        nr0Var.d.Z7 = 0;
                    }
                    nr0Var.d.E3();
                    nr0Var.d.A3();
                    break;
                }
                break;
            case 24:
                kt0 kt0Var = (kt0) this.b;
                un unVar = (un) this.c;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.d;
                org.telegram.messenger.jj jjVar = kt0Var.H;
                byte[] bArr5 = pollAnswer.option;
                if (jjVar != null && (message = jjVar.k) != null && (message.media instanceof TLRPC.TL_messageMediaPoll)) {
                    org.telegram.messenger.jj.B0(message);
                    knVar = new kn();
                    knVar.a = jjVar;
                    knVar.b = -1;
                    knVar.c = -1;
                    knVar.h = true;
                    knVar.e = bArr5;
                    knVar.f();
                }
                unVar.Vb(jjVar, knVar);
                kt0Var.c(false);
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.d;
                TLObject tLObject8 = (TLObject) this.c;
                if (tL_error8 == null) {
                    if (!(tLObject8 instanceof TLRPC.TL_boolTrue)) {
                        org.telegram.messenger.m5.o(null, 2131743904, org.telegram.ui.Components.cc.a0(premiumPreviewFragment), null);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.cc.d0(tL_error8);
                    break;
                }
                break;
            case 26:
                a();
                break;
            case 27:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                org.telegram.ui.Components.sn snVar = (org.telegram.ui.Components.sn) this.c;
                un unVar2 = (un) this.d;
                RectF rectF = ProfileActivity.R6;
                org.telegram.ui.Components.on onVar = snVar.e;
                ViewGroup viewGroup = (ViewGroup) unVar2.fragmentView;
                RectF rectF2 = zg.h.h;
                zg.h.c(onVar, viewGroup, rectF2);
                profileActivity.d6 = rectF2.left;
                profileActivity.c4();
                break;
            case 28:
                org.telegram.ui.Components.cc.D((sb) this.b, (TLRPC.User) this.c, ((TLRPC.Chat) this.d).title).j();
                break;
            default:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                Runnable runnable = (Runnable) this.c;
                org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) this.d;
                secretMediaViewer.k0 = 0;
                secretMediaViewer.I0 = null;
                if (runnable != null) {
                    runnable.run();
                }
                fg.i iVar = secretMediaViewer.e;
                if (iVar != null) {
                    iVar.setLayerType(0, null);
                    secretMediaViewer.e.invalidate();
                    a11 a11Var = secretMediaViewer.n;
                    TLRPC.Message message2 = jjVar2.k;
                    long j10 = message2.destroyTimeMillis;
                    long j11 = message2.ttl;
                    a11Var.e = false;
                    a11Var.f = j10;
                    a11Var.h = j11;
                    a11Var.n.start();
                    a11Var.invalidate();
                    if (!secretMediaViewer.f1) {
                        if (secretMediaViewer.o1 && org.telegram.messenger.vp.d1().getInt("viewoncehint", 0) < 3) {
                            secretMediaViewer.m();
                            break;
                        }
                    } else {
                        secretMediaViewer.e(true, true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ qd0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }
}
