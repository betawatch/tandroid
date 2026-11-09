package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sn0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        org.telegram.messenger.video.n nVar;
        ArrayList arrayList;
        int i10;
        String str;
        int i11;
        String str2;
        boolean z9;
        int i12;
        String str3;
        String[] strArr;
        String str4;
        String str5;
        SpannableStringBuilder spannableStringBuilder;
        String str6;
        int i13 = 17;
        boolean z10 = true;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                tg.o0 o0Var = (tg.o0) this.c;
                Drawable[] drawableArr = PhotoViewer.Y8;
                o0Var.e.h();
                o0Var.c.postRunnable(new p61(i13));
                photoViewer.e0.removeView(photoViewer.N1);
                break;
            case 1:
                org.telegram.ui.Components.v5 v5Var = (org.telegram.ui.Components.v5) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                if (v5Var != null) {
                    ArrayList arrayList2 = v5Var.h;
                    org.telegram.ui.Components.s5 s5Var = v5Var.n;
                    if (s5Var != null) {
                        arrayList2.add(s5Var);
                    }
                    org.telegram.ui.Components.s5 s5Var2 = v5Var.r;
                    if (s5Var2 != null) {
                        arrayList2.add(s5Var2);
                    }
                    org.telegram.ui.Components.s5 s5Var3 = v5Var.s;
                    if (s5Var3 != null) {
                        arrayList2.add(s5Var3);
                    }
                    v5Var.n = new org.telegram.ui.Components.s5(bitmap);
                    v5Var.r = null;
                    v5Var.s = null;
                    v5Var.t();
                    break;
                }
                break;
            case 2:
                eo0 eo0Var = (eo0) this.b;
                View view = (View) this.c;
                eo0Var.getClass();
                view.setOutlineProvider(null);
                PhotoViewer photoViewer2 = eo0Var.c;
                ImageView imageView = photoViewer2.w3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                qq0 qq0Var = photoViewer2.E2;
                if (qq0Var != null) {
                    qq0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 3:
                op0 op0Var = (op0) this.b;
                org.telegram.ui.Components.u51 u51Var = (org.telegram.ui.Components.u51) this.c;
                op0Var.getClass();
                if (u51Var.U() > 0 && u51Var.S() >= u51Var.U() - 590) {
                    op0Var.a.e0.invalidate();
                    break;
                }
                break;
            case 4:
                rp0 rp0Var = (rp0) this.b;
                tg.o0 o0Var2 = (tg.o0) this.c;
                o0Var2.e.h();
                o0Var2.c.postRunnable(new p61(i13));
                try {
                    rp0Var.b.e0.removeView(o0Var2);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 5:
                bq0 bq0Var = (bq0) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                bq0Var.r.k7.d();
                animatorSet.start();
                break;
            case 6:
                bq0 bq0Var2 = (bq0) this.b;
                yq0 yq0Var = (yq0) this.c;
                bq0Var2.r.r4 = false;
                if (!yq0Var.s) {
                    yq0Var.a.O0(false, true);
                    break;
                }
                break;
            case 7:
                bs0 bs0Var = (bs0) this.b;
                String str7 = (String) this.c;
                bs0Var.getClass();
                org.telegram.messenger.g0.g(str7);
                bs0Var.c(true);
                break;
            case 8:
                bs0 bs0Var2 = (bs0) this.b;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                bs0Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.ij.h0(pollAnswer.text, false));
                bs0Var2.c(true);
                break;
            case 9:
                bs0 bs0Var3 = (bs0) this.b;
                byte[] bArr = (byte[]) this.c;
                org.telegram.messenger.gz C = org.telegram.messenger.gz.C(bs0Var3.H.I1);
                org.telegram.messenger.ij ijVar = bs0Var3.H;
                if (ijVar != null && (org.telegram.messenger.ij.m1(ijVar) instanceof TLRPC.TL_messageMediaPoll)) {
                    long B0 = org.telegram.messenger.ij.B0(ijVar.k);
                    int e12 = ijVar.e1();
                    TLRPC.TL_messages_deletePollAnswer tL_messages_deletePollAnswer = new TLRPC.TL_messages_deletePollAnswer();
                    tL_messages_deletePollAnswer.peer = C.getMessagesController().j1(B0);
                    tL_messages_deletePollAnswer.msg_id = e12;
                    tL_messages_deletePollAnswer.option = bArr;
                    ConnectionsManager connectionsManager = C.getConnectionsManager();
                    org.telegram.messenger.p5 p5Var = Utilities.d;
                    Objects.requireNonNull(p5Var);
                    connectionsManager.sendRequestTyped(tL_messages_deletePollAnswer, new org.telegram.messenger.v3(p5Var), new org.telegram.messenger.d(C, 7));
                }
                bs0Var3.c(true);
                break;
            case 10:
                PrivacyControlActivity.b0((PrivacyControlActivity) this.b, (TLObject) this.c);
                break;
            case 11:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.I0();
                    break;
                }
                break;
            case 12:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.d = (TL_account.Password) this.c;
                privacySettingsActivity.D0();
                break;
            case 13:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.b;
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) this.c;
                boolean z11 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z11;
                r8Var.setChecked(z11);
                break;
            case 14:
                ((ut0) this.b).getMessagesController().f5(null, ((Long) this.c).longValue());
                break;
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                Object[] objArr = (Object[]) this.c;
                RectF rectF = ProfileActivity.V6;
                profileActivity.getNotificationCenter().n(profileActivity, 4);
                profileActivity.getNotificationCenter().k(4, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity.presentFragment(new cn(bundle), true);
                break;
            case 16:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.c;
                long j3 = profileActivity2.z2;
                if (j3 != 0) {
                    TLRPC.User a22 = profileActivity2.getMessagesController().a2(Long.valueOf(j3));
                    profileActivity2.getMessagesController().f0(profileActivity2.e1, a22);
                    if (profileActivity2.D2 != null && a22 != null && org.telegram.ui.Components.hc.a(profileActivity2)) {
                        org.telegram.ui.Components.hc.D(profileActivity2, a22, profileActivity2.D2.title).j();
                    }
                    if (profileActivity2.t2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.G5(true, false);
                        break;
                    }
                } else {
                    profileActivity2.getNotificationCenter().n(profileActivity2, 4);
                    if (org.telegram.messenger.g0.Q1()) {
                        i7 = 0;
                        profileActivity2.getNotificationCenter().k(4, Long.valueOf(-profileActivity2.e1));
                    } else {
                        i7 = 0;
                        profileActivity2.getNotificationCenter().k(4, new Object[0]);
                    }
                    profileActivity2.getMessagesController().f0(profileActivity2.e1, profileActivity2.getMessagesController().a2(Long.valueOf(profileActivity2.getUserConfig().e())));
                    profileActivity2.I1 = i7;
                    profileActivity2.finishFragment();
                    break;
                }
                break;
            case 17:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                RectF rectF2 = ProfileActivity.V6;
                org.telegram.messenger.g0.g("https://" + profileActivity3.getMessagesController().U2 + "/" + org.telegram.messenger.t3.K(chat, false));
                break;
            case 18:
                ProfileActivity profileActivity4 = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                RectF rectF3 = ProfileActivity.V6;
                profileActivity4.getClass();
                org.telegram.ui.Components.cc.e();
                vf.c.t(profileActivity4.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 19:
                ProfileActivity profileActivity5 = (ProfileActivity) this.b;
                org.telegram.ui.Components.kn knVar = (org.telegram.ui.Components.kn) this.c;
                RectF rectF4 = ProfileActivity.V6;
                org.telegram.ui.Components.gn gnVar = knVar.e;
                yw ywVar = profileActivity5.h5;
                View D = (ywVar == null || ywVar.getFragmentView() == null) ? profileActivity5.i5.D() : profileActivity5.h5.getFragmentView();
                RectF rectF5 = profileActivity5.h6;
                profileActivity5.g6 = jh.k.c(gnVar, D, rectF5) ? rectF5.left : 0.0f;
                profileActivity5.d4();
                break;
            case 20:
                ProfileActivity profileActivity6 = (ProfileActivity) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                RectF rectF6 = ProfileActivity.V6;
                profileActivity6.D2 = profileActivity6.getMessagesStorage().O(profileActivity6.e1);
                countDownLatch.countDown();
                break;
            case 21:
                ProfileActivity profileActivity7 = (ProfileActivity) this.b;
                View view2 = (View) this.c;
                RectF rectF7 = ProfileActivity.V6;
                profileActivity7.getClass();
                ((org.telegram.ui.Cells.m8) view2).setChecked(profileActivity7.r2.g());
                break;
            case 22:
                ProfileActivity profileActivity8 = (ProfileActivity) this.b;
                TLObject tLObject = (TLObject) this.c;
                RectF rectF8 = ProfileActivity.V6;
                profileActivity8.getClass();
                profileActivity8.F2 = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                break;
            case 23:
                ProfileActivity profileActivity9 = (ProfileActivity) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                RectF rectF9 = ProfileActivity.V6;
                if (!zArr2[0] && (nVar = profileActivity9.z5) != null) {
                    nVar.run();
                }
                profileActivity9.z5 = null;
                break;
            case 24:
                xu0 xu0Var = (xu0) this.b;
                a0.h hVar = (a0.h) this.c;
                ProfileActivity profileActivity10 = xu0Var.R2.c;
                org.telegram.ui.Components.hc.x(profileActivity10.getParentActivity(), profileActivity10.o5, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.tj, xu0Var.I0), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.vj, xu0Var.I0)).j();
                break;
            case 25:
                mv0 mv0Var = (mv0) this.b;
                a0.h hVar2 = (a0.h) this.c;
                ProfileActivity profileActivity11 = mv0Var.R2;
                org.telegram.ui.Components.hc.x(profileActivity11.getParentActivity(), profileActivity11.o5, hVar2.m(), hVar2.m() == 1 ? ((TLRPC.Dialog) hVar2.n(0)).id : 0L, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.tj, mv0Var.I0), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.vj, mv0Var.I0)).j();
                break;
            case 26:
                ((lw0) this.b).e.presentFragment(ProfileActivity.D4(((Long) this.c).longValue()));
                break;
            case 27:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.b;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                y9 y9Var = new y9(null);
                y9Var.d = g6Var;
                f2Var.presentFragment(y9Var);
                break;
            case 28:
                ww0 ww0Var = (ww0) this.b;
                String str8 = (String) this.c;
                ArrayList arrayList3 = ww0Var.d;
                org.telegram.ui.ActionBar.f2 f2Var2 = ww0Var.e;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                String str9 = " ";
                String[] split = str8.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i14 = 0; i14 < split.length; i14++) {
                    String S0 = org.telegram.messenger.id.E0().S0(split[i14], true, false);
                    strArr2[i14] = S0;
                    if (S0.equals(split[i14])) {
                        strArr2[i14] = null;
                    }
                }
                int i15 = 0;
                while (true) {
                    vw0[] vw0VarArr = ww0Var.c;
                    if (i15 >= vw0VarArr.length) {
                        String[] strArr3 = strArr2;
                        String str10 = str8;
                        if (ww0Var.E != null) {
                            int size = arrayList3.size();
                            int i16 = 0;
                            while (i16 < size) {
                                org.telegram.messenger.cp cpVar = (org.telegram.messenger.cp) arrayList3.get(i16);
                                String str11 = str9 + cpVar.a.toLowerCase();
                                SpannableStringBuilder spannableStringBuilder2 = null;
                                int i17 = 0;
                                while (true) {
                                    if (i17 < split.length) {
                                        if (split[i17].length() != 0) {
                                            String str12 = split[i17];
                                            arrayList = arrayList3;
                                            int indexOf = str11.indexOf(str9 + str12);
                                            if (indexOf >= 0 || (str2 = strArr3[i17]) == null) {
                                                i11 = indexOf;
                                            } else {
                                                str12 = str2;
                                                i11 = str11.indexOf(str9.concat(str2));
                                            }
                                            if (i11 >= 0) {
                                                if (spannableStringBuilder2 == null) {
                                                    i10 = size;
                                                    spannableStringBuilder2 = new SpannableStringBuilder(cpVar.a);
                                                } else {
                                                    i10 = size;
                                                }
                                                str = str9;
                                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(f2Var2.getThemedColor(org.telegram.ui.ActionBar.l6.q6)), i11, str12.length() + i11, 33);
                                            }
                                        } else {
                                            arrayList = arrayList3;
                                            i10 = size;
                                            str = str9;
                                        }
                                        if (spannableStringBuilder2 != null && i17 == split.length - 1) {
                                            arrayList5.add(cpVar);
                                            arrayList6.add(spannableStringBuilder2);
                                        }
                                        i17++;
                                        size = i10;
                                        arrayList3 = arrayList;
                                        str9 = str;
                                    } else {
                                        arrayList = arrayList3;
                                    }
                                }
                                i16++;
                                size = size;
                                arrayList3 = arrayList;
                                str9 = str9;
                            }
                        }
                        org.telegram.messenger.g0.h3(new qw0(ww0Var, str10, arrayList4, arrayList5, arrayList6, 0));
                        break;
                    } else {
                        vw0 vw0Var = vw0VarArr[i15];
                        if (vw0Var == null) {
                            i12 = i15;
                            z9 = z10;
                        } else {
                            String str13 = vw0Var.a;
                            z9 = z10;
                            String str14 = " " + str13.toLowerCase();
                            i12 = i15;
                            SpannableStringBuilder spannableStringBuilder3 = null;
                            int i18 = 0;
                            while (i18 < split.length) {
                                if (split[i18].length() != 0) {
                                    String str15 = split[i18];
                                    strArr = strArr2;
                                    int indexOf2 = str14.indexOf(" " + str15);
                                    if (indexOf2 >= 0 || (str6 = strArr[i18]) == null) {
                                        str6 = str15;
                                    } else {
                                        indexOf2 = str14.indexOf(" ".concat(str6));
                                    }
                                    if (indexOf2 >= 0) {
                                        str3 = str14;
                                        spannableStringBuilder = spannableStringBuilder3 == null ? new SpannableStringBuilder(str13) : spannableStringBuilder3;
                                        String str16 = str6;
                                        str4 = str8;
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(f2Var2.getThemedColor(org.telegram.ui.ActionBar.l6.q6));
                                        int length = str16.length() + indexOf2;
                                        str5 = str13;
                                        spannableStringBuilder.setSpan(foregroundColorSpan, indexOf2, length, 33);
                                    } else {
                                        i15 = i12 + 1;
                                        z10 = z9;
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
                                if (spannableStringBuilder != null && i18 == split.length - 1) {
                                    if (vw0Var.f == 502) {
                                        int i19 = 0;
                                        while (true) {
                                            if (i19 >= 4) {
                                                i19 = -1;
                                            } else if (org.telegram.messenger.p10.i(i19).p()) {
                                                i19++;
                                            }
                                        }
                                        if (i19 < 0) {
                                        }
                                    }
                                    arrayList4.add(vw0Var);
                                    arrayList6.add(spannableStringBuilder);
                                }
                                i18++;
                                spannableStringBuilder3 = spannableStringBuilder;
                                strArr2 = strArr;
                                str14 = str3;
                                str13 = str5;
                                str8 = str4;
                            }
                        }
                        strArr = strArr2;
                        i15 = i12 + 1;
                        z10 = z9;
                        strArr2 = strArr;
                        str8 = str8;
                    }
                }
                break;
            default:
                ww0 ww0Var2 = (ww0) this.b;
                ArrayList arrayList7 = (ArrayList) this.c;
                ww0Var2.d.addAll(arrayList7);
                int i20 = ww0Var2.f;
                org.telegram.messenger.qp.s1(i20).p2 = arrayList7;
                org.telegram.messenger.qp.s1(i20).q2 = ww0Var2.E;
                if (!ww0Var2.x) {
                    ww0Var2.f();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ sn0(org.telegram.ui.Components.no0 no0Var, a0.h hVar, int i7, int i10) {
        this.a = i10;
        this.b = no0Var;
        this.c = hVar;
    }
}
