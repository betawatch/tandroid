package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        ai.l2 l2Var;
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
                byte[] bArr = (byte[]) this.c;
                org.telegram.messenger.zy C = org.telegram.messenger.zy.C(as0Var.I.K1);
                org.telegram.messenger.fj fjVar = as0Var.I;
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
                as0Var.c(true);
                break;
            case 1:
                PrivacyControlActivity.b0((PrivacyControlActivity) this.b, (TLObject) this.c);
                break;
            case 2:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.I0();
                    break;
                }
                break;
            case 3:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.d = (TL_account.Password) this.c;
                privacySettingsActivity.D0();
                break;
            case 4:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.b;
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) this.c;
                boolean z12 = !privacySettingsActivity2.W;
                privacySettingsActivity2.W = z12;
                s8Var.setChecked(z12);
                break;
            case 5:
                ((st0) this.b).getMessagesController().r5(null, ((Long) this.c).longValue());
                break;
            case 6:
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
            case 7:
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
            case 8:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                RectF rectF2 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g("https://" + profileActivity3.getMessagesController().X2 + "/" + org.telegram.messenger.v3.K(chat, false));
                break;
            case 9:
                ProfileActivity profileActivity4 = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                RectF rectF3 = ProfileActivity.Z6;
                profileActivity4.getClass();
                org.telegram.ui.Components.gc.e();
                vf.c.t(profileActivity4.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 10:
                ProfileActivity profileActivity5 = (ProfileActivity) this.b;
                org.telegram.ui.Components.ao aoVar = (org.telegram.ui.Components.ao) this.c;
                RectF rectF4 = ProfileActivity.Z6;
                org.telegram.ui.Components.wn wnVar = aoVar.e;
                cx cxVar = profileActivity5.l5;
                View E = (cxVar == null || cxVar.getFragmentView() == null) ? profileActivity5.m5.E() : profileActivity5.l5.getFragmentView();
                RectF rectF5 = profileActivity5.l6;
                profileActivity5.k6 = jh.k.c(wnVar, E, rectF5) ? rectF5.left : 0.0f;
                profileActivity5.d4();
                break;
            case 11:
                ProfileActivity profileActivity6 = (ProfileActivity) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                RectF rectF6 = ProfileActivity.Z6;
                profileActivity6.F2 = profileActivity6.getMessagesStorage().O(profileActivity6.f1);
                countDownLatch.countDown();
                break;
            case 12:
                ProfileActivity profileActivity7 = (ProfileActivity) this.b;
                View view = (View) this.c;
                RectF rectF7 = ProfileActivity.Z6;
                profileActivity7.getClass();
                ((org.telegram.ui.Cells.n8) view).setChecked(profileActivity7.t2.g());
                break;
            case 13:
                ProfileActivity profileActivity8 = (ProfileActivity) this.b;
                TLObject tLObject = (TLObject) this.c;
                RectF rectF8 = ProfileActivity.Z6;
                profileActivity8.getClass();
                profileActivity8.H2 = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                break;
            case 14:
                ProfileActivity profileActivity9 = (ProfileActivity) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                RectF rectF9 = ProfileActivity.Z6;
                if (!zArr2[0] && (l2Var = profileActivity9.D5) != null) {
                    l2Var.run();
                }
                profileActivity9.D5 = null;
                break;
            case 15:
                vu0 vu0Var = (vu0) this.b;
                a0.h hVar = (a0.h) this.c;
                ProfileActivity profileActivity10 = vu0Var.V2.c;
                org.telegram.ui.Components.lc.x(profileActivity10.getParentActivity(), profileActivity10.s5, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.wj, vu0Var.J0), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.yj, vu0Var.J0)).j();
                break;
            case 16:
                kv0 kv0Var = (kv0) this.b;
                a0.h hVar2 = (a0.h) this.c;
                ProfileActivity profileActivity11 = kv0Var.V2;
                org.telegram.ui.Components.lc.x(profileActivity11.getParentActivity(), profileActivity11.s5, hVar2.m(), hVar2.m() == 1 ? ((TLRPC.Dialog) hVar2.n(0)).id : 0L, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.wj, kv0Var.J0), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.yj, kv0Var.J0)).j();
                break;
            case 17:
                ((lw0) this.b).e.presentFragment(ProfileActivity.D4(((Long) this.c).longValue()));
                break;
            case 18:
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.b;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.c;
                y9 y9Var = new y9(null);
                y9Var.d = i6Var;
                h2Var.presentFragment(y9Var);
                break;
            case 19:
                ww0 ww0Var = (ww0) this.b;
                String str7 = (String) this.c;
                ArrayList arrayList2 = ww0Var.d;
                org.telegram.ui.ActionBar.h2 h2Var2 = ww0Var.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String str8 = " ";
                String[] split = str7.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i13 = 0; i13 < split.length; i13++) {
                    String S0 = org.telegram.messenger.gd.E0().S0(split[i13], true, false);
                    strArr2[i13] = S0;
                    if (S0.equals(split[i13])) {
                        strArr2[i13] = null;
                    }
                }
                int i14 = 0;
                while (true) {
                    vw0[] vw0VarArr = ww0Var.c;
                    if (i14 >= vw0VarArr.length) {
                        String[] strArr3 = strArr2;
                        String str9 = str7;
                        if (ww0Var.F != null) {
                            int size = arrayList2.size();
                            int i15 = 0;
                            while (i15 < size) {
                                org.telegram.messenger.yo yoVar = (org.telegram.messenger.yo) arrayList2.get(i15);
                                String str10 = str8 + yoVar.a.toLowerCase();
                                SpannableStringBuilder spannableStringBuilder2 = null;
                                int i16 = 0;
                                while (true) {
                                    if (i16 < split.length) {
                                        if (split[i16].length() != 0) {
                                            String str11 = split[i16];
                                            arrayList = arrayList2;
                                            int indexOf = str10.indexOf(str8 + str11);
                                            if (indexOf >= 0 || (str2 = strArr3[i16]) == null) {
                                                i11 = indexOf;
                                            } else {
                                                str11 = str2;
                                                i11 = str10.indexOf(str8.concat(str2));
                                            }
                                            if (i11 >= 0) {
                                                if (spannableStringBuilder2 == null) {
                                                    str = str8;
                                                    spannableStringBuilder2 = new SpannableStringBuilder(yoVar.a);
                                                } else {
                                                    str = str8;
                                                }
                                                i10 = size;
                                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(h2Var2.getThemedColor(org.telegram.ui.ActionBar.n6.q6)), i11, str11.length() + i11, 33);
                                            }
                                        } else {
                                            arrayList = arrayList2;
                                            str = str8;
                                            i10 = size;
                                        }
                                        if (spannableStringBuilder2 != null && i16 == split.length - 1) {
                                            arrayList4.add(yoVar);
                                            arrayList5.add(spannableStringBuilder2);
                                        }
                                        i16++;
                                        size = i10;
                                        arrayList2 = arrayList;
                                        str8 = str;
                                    } else {
                                        arrayList = arrayList2;
                                    }
                                }
                                i15++;
                                size = size;
                                arrayList2 = arrayList;
                                str8 = str8;
                            }
                        }
                        org.telegram.messenger.g0.g3(new wt0(ww0Var, str9, arrayList3, arrayList4, arrayList5, 4));
                        break;
                    } else {
                        vw0 vw0Var = vw0VarArr[i14];
                        if (vw0Var == null) {
                            i12 = i14;
                            z10 = z11;
                        } else {
                            String str12 = vw0Var.a;
                            z10 = z11;
                            String str13 = " " + str12.toLowerCase();
                            i12 = i14;
                            SpannableStringBuilder spannableStringBuilder3 = null;
                            int i17 = 0;
                            while (i17 < split.length) {
                                if (split[i17].length() != 0) {
                                    String str14 = split[i17];
                                    strArr = strArr2;
                                    int indexOf2 = str13.indexOf(" " + str14);
                                    if (indexOf2 >= 0 || (str6 = strArr[i17]) == null) {
                                        str6 = str14;
                                    } else {
                                        indexOf2 = str13.indexOf(" ".concat(str6));
                                    }
                                    if (indexOf2 >= 0) {
                                        str3 = str13;
                                        spannableStringBuilder = spannableStringBuilder3 == null ? new SpannableStringBuilder(str12) : spannableStringBuilder3;
                                        String str15 = str6;
                                        str4 = str7;
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(h2Var2.getThemedColor(org.telegram.ui.ActionBar.n6.q6));
                                        int length = str15.length() + indexOf2;
                                        str5 = str12;
                                        spannableStringBuilder.setSpan(foregroundColorSpan, indexOf2, length, 33);
                                    } else {
                                        i14 = i12 + 1;
                                        z11 = z10;
                                        strArr2 = strArr;
                                        str7 = str7;
                                    }
                                } else {
                                    str3 = str13;
                                    strArr = strArr2;
                                    str4 = str7;
                                    str5 = str12;
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
                                str13 = str3;
                                str12 = str5;
                                str7 = str4;
                            }
                        }
                        strArr = strArr2;
                        i14 = i12 + 1;
                        z11 = z10;
                        strArr2 = strArr;
                        str7 = str7;
                    }
                }
                break;
            case 20:
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
            case 21:
                ax0 ax0Var = (ax0) this.b;
                ax0Var.f.add((cx0) this.c);
                ax0Var.a();
                break;
            case 22:
                View[] viewArr = (View[]) this.b;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.c;
                py0 py0Var = (py0) viewArr[0];
                py0Var.b = tL_channels_sponsoredMessageReportResultChooseOption;
                py0Var.c = null;
                py0Var.d = null;
                py0Var.f.g3.O(false);
                break;
            case 23:
                ((py0) ((View[]) this.b)[0]).b((TLRPC.TL_reportResultAddComment) this.c);
                break;
            case 24:
                View[] viewArr2 = (View[]) this.b;
                TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = (TLRPC.TL_reportResultChooseOption) this.c;
                py0 py0Var2 = (py0) viewArr2[0];
                py0Var2.b = null;
                py0Var2.c = tL_reportResultChooseOption;
                py0Var2.d = null;
                py0Var2.f.g3.O(false);
                break;
            case 25:
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.b;
                org.telegram.ui.Components.lc lcVar = (org.telegram.ui.Components.lc) this.c;
                aVar.run();
                lcVar.c(org.telegram.messenger.gd.M0(2131754486, null)).j();
                break;
            case 26:
                org.telegram.ui.ActionBar.h2 h2Var3 = (org.telegram.ui.ActionBar.h2) this.b;
                org.telegram.ui.Components.dw dwVar = (org.telegram.ui.Components.dw) this.c;
                org.telegram.ui.Components.lc.b0(h2Var3).c(org.telegram.messenger.gd.M0(2131754486, null)).j();
                org.telegram.messenger.g0.g3(dwVar);
                break;
            case 27:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                wq0 wq0Var = (wq0) this.c;
                secretMediaViewer.L = false;
                wq0Var.a.O0(false, true);
                break;
            case 28:
                ((SecretMediaViewer) ((ji.j) this.b).c).i((File) this.c);
                break;
            default:
                r11 r11Var = (r11) this.b;
                org.telegram.ui.ActionBar.h2 h2Var4 = (org.telegram.ui.ActionBar.h2) this.c;
                r11Var.v(null, false, false);
                h2Var4.presentFragment(new StickersActivity(5, r11Var.M0));
                Runnable runnable = r11Var.V1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ tr0(org.telegram.ui.Components.yo0 yo0Var, a0.h hVar, int i7, int i10) {
        this.a = i10;
        this.b = yo0Var;
        this.c = hVar;
    }
}
