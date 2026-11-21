package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tr0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        ai.n2 n2Var;
        ArrayList arrayList;
        String str;
        int i10;
        int i11;
        String str2;
        boolean z10;
        int i12;
        String str3;
        String[] strArr;
        String str4;
        String str5;
        SpannableStringBuilder spannableStringBuilder;
        String str6;
        boolean z11 = true;
        switch (this.a) {
            case 0:
                as0 as0Var = (as0) this.b;
                String str7 = (String) this.c;
                as0Var.getClass();
                org.telegram.messenger.g0.g(str7);
                as0Var.c(true);
                break;
            case 1:
                as0 as0Var2 = (as0) this.b;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                as0Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.fj.h0(pollAnswer.text, false));
                as0Var2.c(true);
                break;
            case 2:
                as0 as0Var3 = (as0) this.b;
                byte[] bArr = (byte[]) this.c;
                org.telegram.messenger.zy C = org.telegram.messenger.zy.C(as0Var3.I.K1);
                org.telegram.messenger.fj fjVar = as0Var3.I;
                if (fjVar != null && (org.telegram.messenger.fj.m1(fjVar) instanceof TLRPC.TL_messageMediaPoll)) {
                    long B0 = org.telegram.messenger.fj.B0(fjVar.k);
                    int e12 = fjVar.e1();
                    TLRPC.TL_messages_deletePollAnswer tL_messages_deletePollAnswer = new TLRPC.TL_messages_deletePollAnswer();
                    tL_messages_deletePollAnswer.peer = C.getMessagesController().l1(B0);
                    tL_messages_deletePollAnswer.msg_id = e12;
                    tL_messages_deletePollAnswer.option = bArr;
                    ConnectionsManager connectionsManager = C.getConnectionsManager();
                    org.telegram.messenger.q5 q5Var = Utilities.d;
                    Objects.requireNonNull(q5Var);
                    connectionsManager.sendRequestTyped(tL_messages_deletePollAnswer, new org.telegram.messenger.x3(q5Var), new org.telegram.messenger.d(C, 7));
                }
                as0Var3.c(true);
                break;
            case 3:
                PrivacyControlActivity.b0((PrivacyControlActivity) this.b, (TLObject) this.c);
                break;
            case 4:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.I0();
                    break;
                }
                break;
            case 5:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.d = (TL_account.Password) this.c;
                privacySettingsActivity.D0();
                break;
            case 6:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.b;
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) this.c;
                boolean z12 = !privacySettingsActivity2.W;
                privacySettingsActivity2.W = z12;
                s8Var.setChecked(z12);
                break;
            case 7:
                ((st0) this.b).getMessagesController().r5(null, ((Long) this.c).longValue());
                break;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                Object[] objArr = (Object[]) this.c;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getNotificationCenter().n(profileActivity, 4);
                profileActivity.getNotificationCenter().k(4, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity.presentFragment(new bn(bundle), true);
                break;
            case 9:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.c;
                long j3 = profileActivity2.B2;
                if (j3 != 0) {
                    TLRPC.User c22 = profileActivity2.getMessagesController().c2(Long.valueOf(j3));
                    profileActivity2.getMessagesController().f0(profileActivity2.f1, c22);
                    if (profileActivity2.F2 != null && c22 != null && org.telegram.ui.Components.lc.a(profileActivity2)) {
                        org.telegram.ui.Components.lc.D(profileActivity2, c22, profileActivity2.F2.title).j();
                    }
                    if (profileActivity2.v2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.H5(true, false);
                        break;
                    }
                } else {
                    profileActivity2.getNotificationCenter().n(profileActivity2, 4);
                    if (org.telegram.messenger.g0.Q1()) {
                        i7 = 0;
                        profileActivity2.getNotificationCenter().k(4, Long.valueOf(-profileActivity2.f1));
                    } else {
                        i7 = 0;
                        profileActivity2.getNotificationCenter().k(4, new Object[0]);
                    }
                    profileActivity2.getMessagesController().f0(profileActivity2.f1, profileActivity2.getMessagesController().c2(Long.valueOf(profileActivity2.getUserConfig().e())));
                    profileActivity2.J1 = i7;
                    profileActivity2.finishFragment();
                    break;
                }
                break;
            case 10:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                RectF rectF2 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g("https://" + profileActivity3.getMessagesController().X2 + "/" + org.telegram.messenger.v3.K(chat, false));
                break;
            case 11:
                ProfileActivity profileActivity4 = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                RectF rectF3 = ProfileActivity.Z6;
                profileActivity4.getClass();
                org.telegram.ui.Components.gc.e();
                vf.c.t(profileActivity4.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 12:
                ProfileActivity profileActivity5 = (ProfileActivity) this.b;
                org.telegram.ui.Components.co coVar = (org.telegram.ui.Components.co) this.c;
                RectF rectF4 = ProfileActivity.Z6;
                org.telegram.ui.Components.yn ynVar = coVar.e;
                cx cxVar = profileActivity5.l5;
                View E = (cxVar == null || cxVar.getFragmentView() == null) ? profileActivity5.m5.E() : profileActivity5.l5.getFragmentView();
                RectF rectF5 = profileActivity5.l6;
                profileActivity5.k6 = jh.k.c(ynVar, E, rectF5) ? rectF5.left : 0.0f;
                profileActivity5.d4();
                break;
            case 13:
                ProfileActivity profileActivity6 = (ProfileActivity) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                RectF rectF6 = ProfileActivity.Z6;
                profileActivity6.F2 = profileActivity6.getMessagesStorage().O(profileActivity6.f1);
                countDownLatch.countDown();
                break;
            case 14:
                ProfileActivity profileActivity7 = (ProfileActivity) this.b;
                View view = (View) this.c;
                RectF rectF7 = ProfileActivity.Z6;
                profileActivity7.getClass();
                ((org.telegram.ui.Cells.n8) view).setChecked(profileActivity7.t2.g());
                break;
            case 15:
                ProfileActivity profileActivity8 = (ProfileActivity) this.b;
                TLObject tLObject = (TLObject) this.c;
                RectF rectF8 = ProfileActivity.Z6;
                profileActivity8.getClass();
                profileActivity8.H2 = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                break;
            case 16:
                ProfileActivity profileActivity9 = (ProfileActivity) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                RectF rectF9 = ProfileActivity.Z6;
                if (!zArr2[0] && (n2Var = profileActivity9.D5) != null) {
                    n2Var.run();
                }
                profileActivity9.D5 = null;
                break;
            case 17:
                vu0 vu0Var = (vu0) this.b;
                a0.h hVar = (a0.h) this.c;
                ProfileActivity profileActivity10 = vu0Var.V2.c;
                org.telegram.ui.Components.lc.x(profileActivity10.getParentActivity(), profileActivity10.s5, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, vu0Var.J0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.yj, vu0Var.J0)).j();
                break;
            case 18:
                kv0 kv0Var = (kv0) this.b;
                a0.h hVar2 = (a0.h) this.c;
                ProfileActivity profileActivity11 = kv0Var.V2;
                org.telegram.ui.Components.lc.x(profileActivity11.getParentActivity(), profileActivity11.s5, hVar2.m(), hVar2.m() == 1 ? ((TLRPC.Dialog) hVar2.n(0)).id : 0L, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, kv0Var.J0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.yj, kv0Var.J0)).j();
                break;
            case 19:
                ((lw0) this.b).e.presentFragment(ProfileActivity.D4(((Long) this.c).longValue()));
                break;
            case 20:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.b;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.c;
                y9 y9Var = new y9(null);
                y9Var.d = h6Var;
                g2Var.presentFragment(y9Var);
                break;
            case 21:
                ww0 ww0Var = (ww0) this.b;
                String str8 = (String) this.c;
                ArrayList arrayList2 = ww0Var.d;
                org.telegram.ui.ActionBar.g2 g2Var2 = ww0Var.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String str9 = " ";
                String[] split = str8.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i13 = 0; i13 < split.length; i13++) {
                    String T0 = org.telegram.messenger.gd.E0().T0(split[i13], true, false);
                    strArr2[i13] = T0;
                    if (T0.equals(split[i13])) {
                        strArr2[i13] = null;
                    }
                }
                int i14 = 0;
                while (true) {
                    vw0[] vw0VarArr = ww0Var.c;
                    if (i14 >= vw0VarArr.length) {
                        String[] strArr3 = strArr2;
                        String str10 = str8;
                        if (ww0Var.F != null) {
                            int size = arrayList2.size();
                            int i15 = 0;
                            while (i15 < size) {
                                org.telegram.messenger.yo yoVar = (org.telegram.messenger.yo) arrayList2.get(i15);
                                String str11 = str9 + yoVar.a.toLowerCase();
                                SpannableStringBuilder spannableStringBuilder2 = null;
                                int i16 = 0;
                                while (true) {
                                    if (i16 < split.length) {
                                        if (split[i16].length() != 0) {
                                            String str12 = split[i16];
                                            arrayList = arrayList2;
                                            int indexOf = str11.indexOf(str9 + str12);
                                            if (indexOf >= 0 || (str2 = strArr3[i16]) == null) {
                                                i11 = indexOf;
                                            } else {
                                                str12 = str2;
                                                i11 = str11.indexOf(str9.concat(str2));
                                            }
                                            if (i11 >= 0) {
                                                if (spannableStringBuilder2 == null) {
                                                    str = str9;
                                                    spannableStringBuilder2 = new SpannableStringBuilder(yoVar.a);
                                                } else {
                                                    str = str9;
                                                }
                                                i10 = size;
                                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(g2Var2.getThemedColor(org.telegram.ui.ActionBar.m6.q6)), i11, str12.length() + i11, 33);
                                            }
                                        } else {
                                            arrayList = arrayList2;
                                            str = str9;
                                            i10 = size;
                                        }
                                        if (spannableStringBuilder2 != null && i16 == split.length - 1) {
                                            arrayList4.add(yoVar);
                                            arrayList5.add(spannableStringBuilder2);
                                        }
                                        i16++;
                                        size = i10;
                                        arrayList2 = arrayList;
                                        str9 = str;
                                    } else {
                                        arrayList = arrayList2;
                                    }
                                }
                                i15++;
                                size = size;
                                arrayList2 = arrayList;
                                str9 = str9;
                            }
                        }
                        org.telegram.messenger.g0.g3(new wt0(ww0Var, str10, arrayList3, arrayList4, arrayList5, 4));
                        break;
                    } else {
                        vw0 vw0Var = vw0VarArr[i14];
                        if (vw0Var == null) {
                            i12 = i14;
                            z10 = z11;
                        } else {
                            String str13 = vw0Var.a;
                            z10 = z11;
                            String str14 = " " + str13.toLowerCase();
                            i12 = i14;
                            SpannableStringBuilder spannableStringBuilder3 = null;
                            int i17 = 0;
                            while (i17 < split.length) {
                                if (split[i17].length() != 0) {
                                    String str15 = split[i17];
                                    strArr = strArr2;
                                    int indexOf2 = str14.indexOf(" " + str15);
                                    if (indexOf2 >= 0 || (str6 = strArr[i17]) == null) {
                                        str6 = str15;
                                    } else {
                                        indexOf2 = str14.indexOf(" ".concat(str6));
                                    }
                                    if (indexOf2 >= 0) {
                                        str3 = str14;
                                        spannableStringBuilder = spannableStringBuilder3 == null ? new SpannableStringBuilder(str13) : spannableStringBuilder3;
                                        String str16 = str6;
                                        str4 = str8;
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(g2Var2.getThemedColor(org.telegram.ui.ActionBar.m6.q6));
                                        int length = str16.length() + indexOf2;
                                        str5 = str13;
                                        spannableStringBuilder.setSpan(foregroundColorSpan, indexOf2, length, 33);
                                    } else {
                                        i14 = i12 + 1;
                                        z11 = z10;
                                        strArr2 = strArr;
                                        str8 = str8;
                                    }
                                } else {
                                    str3 = str14;
                                    strArr = strArr2;
                                    str4 = str8;
                                    str5 = str13;
                                    spannableStringBuilder = spannableStringBuilder3;
                                }
                                if (spannableStringBuilder != null && i17 == split.length - 1) {
                                    if (vw0Var.f == 502) {
                                        int i18 = 0;
                                        while (true) {
                                            if (i18 >= 4) {
                                                i18 = -1;
                                            } else if (org.telegram.messenger.j10.i(i18).p()) {
                                                i18++;
                                            }
                                        }
                                        if (i18 < 0) {
                                        }
                                    }
                                    arrayList3.add(vw0Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i17++;
                                spannableStringBuilder3 = spannableStringBuilder;
                                strArr2 = strArr;
                                str14 = str3;
                                str13 = str5;
                                str8 = str4;
                            }
                        }
                        strArr = strArr2;
                        i14 = i12 + 1;
                        z11 = z10;
                        strArr2 = strArr;
                        str8 = str8;
                    }
                }
                break;
            case 22:
                ww0 ww0Var2 = (ww0) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                ww0Var2.d.addAll(arrayList6);
                int i19 = ww0Var2.f;
                org.telegram.messenger.mp.u1(i19).s2 = arrayList6;
                org.telegram.messenger.mp.u1(i19).t2 = ww0Var2.F;
                if (!ww0Var2.x) {
                    ww0Var2.f();
                    break;
                }
                break;
            case 23:
                ax0 ax0Var = (ax0) this.b;
                ax0Var.f.add((cx0) this.c);
                ax0Var.a();
                break;
            case 24:
                View[] viewArr = (View[]) this.b;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.c;
                py0 py0Var = (py0) viewArr[0];
                py0Var.b = tL_channels_sponsoredMessageReportResultChooseOption;
                py0Var.c = null;
                py0Var.d = null;
                py0Var.f.g3.O(false);
                break;
            case 25:
                ((py0) ((View[]) this.b)[0]).b((TLRPC.TL_reportResultAddComment) this.c);
                break;
            case 26:
                View[] viewArr2 = (View[]) this.b;
                TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = (TLRPC.TL_reportResultChooseOption) this.c;
                py0 py0Var2 = (py0) viewArr2[0];
                py0Var2.b = null;
                py0Var2.c = tL_reportResultChooseOption;
                py0Var2.d = null;
                py0Var2.f.g3.O(false);
                break;
            case 27:
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.b;
                org.telegram.ui.Components.lc lcVar = (org.telegram.ui.Components.lc) this.c;
                aVar.run();
                lcVar.c(org.telegram.messenger.gd.N0(2131754485, null)).j();
                break;
            case 28:
                org.telegram.ui.ActionBar.g2 g2Var3 = (org.telegram.ui.ActionBar.g2) this.b;
                org.telegram.ui.Components.ou ouVar = (org.telegram.ui.Components.ou) this.c;
                org.telegram.ui.Components.lc.b0(g2Var3).c(org.telegram.messenger.gd.N0(2131754485, null)).j();
                org.telegram.messenger.g0.g3(ouVar);
                break;
            default:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                wq0 wq0Var = (wq0) this.c;
                secretMediaViewer.L = false;
                wq0Var.a.O0(false, true);
                break;
        }
    }

    public /* synthetic */ tr0(org.telegram.ui.Components.ap0 ap0Var, a0.h hVar, int i7, int i10) {
        this.a = i10;
        this.b = ap0Var;
        this.c = hVar;
    }
}
