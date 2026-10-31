package org.telegram.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qq(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0859 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        int i10;
        pr prVar;
        int i11;
        int i12;
        int i13;
        a0.h hVar;
        ArrayList arrayList2;
        int size;
        int i14;
        pr prVar2;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        ActionBarLayout actionBarLayout;
        int i15 = 8;
        int i16 = 6;
        int i17 = 2;
        TLRPC.UserFull userFull = null;
        boolean z10 = false;
        int i18 = 1;
        switch (this.a) {
            case 0:
                int i19 = 3;
                pr prVar3 = (pr) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                a0.h hVar2 = prVar3.K;
                a0.h hVar3 = prVar3.L;
                int i20 = prVar3.d1;
                a0.h hVar4 = prVar3.J;
                int i21 = prVar3.N;
                ArrayList arrayList5 = prVar3.E;
                int i22 = 0;
                int i23 = 0;
                while (i23 < arrayList3.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList3.get(i23);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList4.get(i23);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        arrayList = arrayList3;
                        i10 = 6;
                        prVar = prVar3;
                        i11 = i19;
                        i22 = i22;
                    } else {
                        if (i21 == i18) {
                            i13 = i18;
                            i12 = i22;
                            prVar3.getMessagesController().F3(prVar3.M, tL_channels_channelParticipants);
                        } else {
                            i12 = i22;
                            i13 = i18;
                        }
                        prVar3.getMessagesController().V3(tL_channels_channelParticipants.users, z10);
                        prVar3.getMessagesController().P3(tL_channels_channelParticipants.chats, z10);
                        long e = prVar3.getUserConfig().e();
                        if (i20 != 0) {
                            ?? r12 = z10;
                            while (true) {
                                if (r12 < tL_channels_channelParticipants.participants.size()) {
                                    if (org.telegram.messenger.jj.C1(tL_channels_channelParticipants.participants.get(r12).peer) == e) {
                                        tL_channels_channelParticipants.participants.remove((int) r12);
                                    } else {
                                        r12++;
                                    }
                                }
                            }
                        }
                        if (i21 == 2) {
                            prVar3.j1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList2 = prVar3.G;
                                hVar = hVar3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList2 = prVar3.F;
                                hVar = hVar2;
                            }
                            arrayList2.clear();
                            arrayList2.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            i14 = 0;
                            while (i14 < size) {
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i14);
                                pr prVar4 = prVar3;
                                ArrayList arrayList6 = arrayList3;
                                if (channelParticipant.user_id == e) {
                                    arrayList2.remove(channelParticipant);
                                } else {
                                    hVar.k(channelParticipant, org.telegram.messenger.jj.C1(channelParticipant.peer));
                                }
                                i14++;
                                prVar3 = prVar4;
                                arrayList3 = arrayList6;
                            }
                            prVar2 = prVar3;
                            arrayList = arrayList3;
                            int size2 = arrayList2.size() + i12;
                            if (i21 == 2) {
                                int size3 = arrayList5.size();
                                int i24 = 0;
                                while (i24 < size3) {
                                    TLObject tLObject = (TLObject) arrayList5.get(i24);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        long C1 = org.telegram.messenger.jj.C1(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (hVar3.f(C1) != null || hVar2.f(C1) != null || (i20 == i13 && C1 > 0 && org.telegram.messenger.h20.x(prVar2.getMessagesController().Z1(Long.valueOf(C1))))) {
                                            arrayList5.remove(i24);
                                            hVar4.l(C1);
                                            i24--;
                                            size3--;
                                        }
                                    } else {
                                        arrayList5.remove(i24);
                                        i24--;
                                        size3--;
                                    }
                                    i24++;
                                    i13 = 1;
                                }
                            }
                            i11 = i19;
                            if (i21 != 0 || i21 == i11 || i21 == 2) {
                                prVar = prVar2;
                                chat = prVar.n;
                                if (chat != null && chat.megagroup) {
                                    chatFull = prVar.r;
                                    if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                        prVar.D0(arrayList2);
                                        i10 = 6;
                                        i22 = size2;
                                    }
                                }
                            } else {
                                prVar = prVar2;
                            }
                            if (i21 == 1) {
                                try {
                                    i10 = 6;
                                    try {
                                        Collections.sort(arrayList5, new f6(i10));
                                    } catch (Exception e7) {
                                        e = e7;
                                        org.telegram.messenger.f8.g(e, true);
                                        i22 = size2;
                                        i23++;
                                        i19 = i11;
                                        prVar3 = prVar;
                                        arrayList3 = arrayList;
                                        z10 = false;
                                        i18 = 1;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    i10 = 6;
                                }
                                i22 = size2;
                            }
                            i10 = 6;
                            i22 = size2;
                        } else {
                            hVar4.b();
                        }
                        hVar = hVar4;
                        arrayList2 = arrayList5;
                        arrayList2.clear();
                        arrayList2.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        i14 = 0;
                        while (i14 < size) {
                        }
                        prVar2 = prVar3;
                        arrayList = arrayList3;
                        int size22 = arrayList2.size() + i12;
                        if (i21 == 2) {
                        }
                        i11 = i19;
                        if (i21 != 0) {
                        }
                        prVar = prVar2;
                        chat = prVar.n;
                        if (chat != null) {
                            chatFull = prVar.r;
                            if (chatFull instanceof TLRPC.TL_channelFull) {
                                prVar.D0(arrayList2);
                                i10 = 6;
                                i22 = size22;
                            }
                        }
                        if (i21 == 1) {
                        }
                        i10 = 6;
                        i22 = size22;
                    }
                    i23++;
                    i19 = i11;
                    prVar3 = prVar;
                    arrayList3 = arrayList;
                    z10 = false;
                    i18 = 1;
                }
                int i25 = i22;
                pr prVar5 = prVar3;
                if (i21 != 2 || prVar5.j1 <= 0) {
                    lr lrVar = prVar5.a;
                    prVar5.C0(lrVar != null ? lrVar.d.c1 : 0);
                    prVar5.P = false;
                    prVar5.Q = true;
                    org.telegram.ui.ActionBar.p5 p5Var = prVar5.f;
                    if (p5Var != null) {
                        p5Var.setVisibility((i21 != 0 || i25 > 5) ? 0 : 8);
                    }
                }
                prVar5.F0();
                lr lrVar2 = prVar5.a;
                if (lrVar2 != null) {
                    ag.b1 b1Var = prVar5.c;
                    b1Var.W1 = prVar5.A1;
                    b1Var.X1 = 0;
                    lrVar2.f();
                    org.telegram.ui.Components.dw0 dw0Var = prVar5.b;
                    if (dw0Var != null && prVar5.a.d.c1 == 0 && prVar5.Q) {
                        dw0Var.e(false, true);
                    }
                }
                prVar5.resumeDelayedFragmentAnimation();
                break;
            case 1:
                ay ayVar = (ay) this.b;
                kd kdVar = (kd) this.c;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.d;
                ayVar.removeSelfFromStack();
                kdVar.removeSelfFromStack();
                k2Var.finishFragment();
                break;
            case 2:
                ay ayVar2 = (ay) this.b;
                ayVar2.F4((zx) this.c);
                qx qxVar = ayVar2.z0;
                if (qxVar != null && qxVar.getVisibility() == 0) {
                    ayVar2.z0.c();
                    break;
                }
                break;
            case 3:
                rx rxVar = (rx) this.b;
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.messenger.ap apVar = (org.telegram.messenger.ap) this.d;
                ay ayVar3 = rxVar.b;
                if (!zArr[0]) {
                    wz.f1(ayVar3, apVar, null);
                    break;
                } else {
                    ayVar3.presentFragment(new iz(apVar, null));
                    break;
                }
            case 4:
                ly lyVar = (ly) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) this.d;
                lyVar.getClass();
                lyVar.o((TLRPC.TL_messages_stickerSet) tLObject2, jjVar);
                break;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                ArrayList arrayList7 = ExternalActionActivity.y;
                try {
                    x1Var.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.ActionBar.x1 w02 = org.telegram.ui.Components.s4.w0(externalActionActivity, org.telegram.messenger.cd.L0(2131743846, null), true);
                        if (w02 != null) {
                            w02.setOnDismissListener(new mg.g(i16, externalActionActivity, tL_error));
                        } else {
                            externalActionActivity.setResult(1, new Intent().putExtra("error", tL_error.text));
                            externalActionActivity.finish();
                        }
                    } else {
                        if (!"BOT_INVALID".equals(tL_error.text) && !"PUBLIC_KEY_REQUIRED".equals(tL_error.text) && !"PUBLIC_KEY_INVALID".equals(tL_error.text) && !"SCOPE_EMPTY".equals(tL_error.text) && !"PAYLOAD_EMPTY".equals(tL_error.text)) {
                            externalActionActivity.setResult(0);
                            externalActionActivity.finish();
                        }
                        externalActionActivity.setResult(1, new Intent().putExtra("error", tL_error.text));
                        externalActionActivity.finish();
                    }
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.f8.g(e11, true);
                    return;
                }
                break;
            case 6:
                i00 i00Var = (i00) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                i00.w0(tL_error2, i00Var, org.telegram.ui.Components.cc.a0(i00Var));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    org.telegram.messenger.vp.d1().edit().putBoolean("n_0", true).apply();
                    i00Var.getMessagesController().a3(true, null);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3;
                    iz izVar = new iz(i00Var.r, tL_chatlists_exportedChatlistInvite.invite);
                    izVar.y = new lz(i00Var, i18);
                    izVar.x = new lz(i00Var, i17);
                    i00Var.presentFragment(izVar);
                    org.telegram.messenger.i0.h3(new xs(18, i00Var, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                wz wzVar = (wz) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                org.telegram.ui.ActionBar.k2 k2Var2 = wzVar.o1;
                i00.w0(tL_error3, k2Var2, new org.telegram.ui.Components.cc(wzVar.S1, null));
                if (tLObject4 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    org.telegram.messenger.vp.d1().edit().putBoolean("n_0", true).apply();
                    wzVar.dismiss();
                    k2Var2.getMessagesController().a3(true, null);
                    k2Var2.presentFragment(new iz(wzVar.Q1, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject4).invite));
                    break;
                }
                break;
            case 8:
                c00 c00Var = (c00) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                b00 b00Var = (b00) this.d;
                if (tL_error4 != null) {
                    org.telegram.ui.Components.cc.a0(c00Var.a).t(org.telegram.messenger.cd.L0(2131743904, null), null).j();
                    org.telegram.messenger.i0.r(b00Var);
                    break;
                }
                break;
            case 9:
                f10 f10Var = (f10) this.b;
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) this.c;
                org.telegram.messenger.ap apVar2 = (org.telegram.messenger.ap) this.d;
                FiltersSetupActivity filtersSetupActivity = f10Var.e;
                if (x1Var2 != null) {
                    try {
                        x1Var2.dismiss();
                    } catch (Exception e12) {
                        org.telegram.messenger.f8.g(e12, true);
                    }
                }
                filtersSetupActivity.getMessagesController().e4(apVar2);
                org.telegram.messenger.hs messagesStorage = filtersSetupActivity.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.oi(29, messagesStorage, apVar2));
                break;
            case 10:
                t50 t50Var = (t50) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                v50 v50Var = t50Var.I;
                zf.m1 m1Var = t50Var.f;
                if (t50Var.n) {
                    t50Var.h = null;
                    t50Var.d = arrayList8;
                    t50Var.e = arrayList9;
                    m1Var.f(arrayList8, null);
                    v50Var.u0(t50Var.H);
                    t50Var.f();
                    if (t50Var.n && !m1Var.e() && t50Var.b() == 0) {
                        v50Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                s60 s60Var = (s60) this.b;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) this.c;
                String str = (String) this.d;
                if (!s60Var.M) {
                    s60Var.f.setText(tL_langPackString.value);
                    org.telegram.messenger.vp.d1().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                v60 v60Var = (v60) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                if (v60Var.h) {
                    v60Var.d = arrayList10;
                    v60Var.e = arrayList11;
                    v60Var.f();
                    v60Var.n.r.e(false, true);
                    break;
                }
                break;
            case 13:
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                un unVar = (un) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                Pattern pattern = LaunchActivity.D1;
                if (tL_error5 == null) {
                    if (user != null && !org.telegram.messenger.h20.B(user)) {
                        org.telegram.messenger.z20.s(org.telegram.messenger.cd.a0(null, null, 2131748201, org.telegram.messenger.h20.j(user, true)), org.telegram.ui.Components.cc.a0(unVar), R.raw.contact_check, 36);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.cc.a0(unVar).f0(tL_error5, false);
                    break;
                }
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                f70 f70Var = (f70) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                Pattern pattern2 = LaunchActivity.D1;
                try {
                    f70Var.run();
                } catch (Exception e13) {
                    org.telegram.messenger.f8.g(e13, true);
                }
                if (tLObject5 instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject5;
                    org.telegram.ui.Components.s4.w0(launchActivity, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                f70 f70Var2 = (f70) this.c;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                Pattern pattern3 = LaunchActivity.D1;
                try {
                    f70Var2.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error6.text)) {
                        org.telegram.ui.Components.s4.w0(launchActivity2, org.telegram.messenger.cd.L0(2131743846, null), true);
                    } else {
                        launchActivity2.F0(org.telegram.ui.Components.s4.M(launchActivity2, null, org.telegram.messenger.cd.L0(2131751106, null) + "\n" + tL_error6.text));
                    }
                    break;
                } catch (Exception e14) {
                    org.telegram.messenger.f8.g(e14, true);
                    return;
                }
            case 16:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) this.c;
                File file = (File) this.d;
                Pattern pattern4 = LaunchActivity.D1;
                s6Var.d(file, s6Var.c);
                org.telegram.messenger.i0.g3(new q70(launchActivity3, i15));
                break;
            case 17:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                int[] iArr = (int[]) this.c;
                long[] jArr = (long[]) this.d;
                Pattern pattern5 = LaunchActivity.D1;
                int i26 = iArr[0] - 1;
                iArr[0] = i26;
                if (i26 == 0) {
                    org.telegram.messenger.zs.f(launchActivity4.O).k(org.telegram.messenger.zs.v5, new Object[0]);
                    launchActivity4.p0(jArr, false);
                    break;
                }
                break;
            case 18:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                org.telegram.ui.ActionBar.s6 s6Var2 = (org.telegram.ui.ActionBar.s6) this.d;
                if (!(tLObject6 instanceof TLRPC.TL_wallPaper)) {
                    Pattern pattern6 = LaunchActivity.D1;
                    launchActivity5.i0();
                    break;
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject6;
                    launchActivity5.T0 = s6Var2;
                    launchActivity5.R0 = org.telegram.messenger.b8.r(null, tL_wallPaper.document);
                    launchActivity5.S0 = tL_wallPaper;
                    org.telegram.messenger.b8.G(s6Var2.E).X(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    break;
                }
            case 19:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                v80 v80Var = (v80) this.d;
                Pattern pattern7 = LaunchActivity.D1;
                org.telegram.messenger.vp.r1(launchActivity6.O).U3(user2, true, false);
                v80Var.a(user2);
                break;
            case 20:
                androidx.mediarouter.app.f fVar = (androidx.mediarouter.app.f) this.b;
                String str2 = (String) this.c;
                String str3 = (String) this.d;
                LaunchActivity launchActivity7 = (LaunchActivity) fVar.b;
                Pattern pattern8 = LaunchActivity.D1;
                if (!"rebuild".equals(str2)) {
                    if (!"keys".equals(str2)) {
                        SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("themeconfig", 0);
                        String str4 = "Blue";
                        String string = sharedPreferences.getString("lastDayTheme", "Blue");
                        if (org.telegram.ui.ActionBar.t6.Q0(string) != null && !org.telegram.ui.ActionBar.t6.Q0(string).q()) {
                            str4 = string;
                        }
                        String str5 = "Dark Blue";
                        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                        if (org.telegram.ui.ActionBar.t6.Q0(string2) != null && org.telegram.ui.ActionBar.t6.Q0(string2).q()) {
                            str5 = string2;
                        }
                        boolean z11 = "night".equals(str2) || !("day".equals(str2) || org.telegram.ui.ActionBar.t6.I.q());
                        if (z11) {
                            str4 = str5;
                        }
                        org.telegram.ui.ActionBar.s6 Q0 = org.telegram.ui.ActionBar.t6.Q0(str4);
                        StringBuilder sb2 = new StringBuilder("DEBUG_THEME ");
                        sb2.append(z11 ? "night" : "day");
                        sb2.append(" (");
                        sb2.append(Q0.m());
                        sb2.append("), style ");
                        sb2.append(str3);
                        Log.i("tmessages", sb2.toString());
                        if (!"instant".equals(str3)) {
                            if (!"fade".equals(str3)) {
                                org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.t4, Q0, Boolean.FALSE, new int[]{launchActivity7.z0.getMeasuredWidth() / 2, launchActivity7.z0.getMeasuredHeight() / 2}, -1, Boolean.valueOf(z11), null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.t6.K1(Q0, false, -1, null);
                                break;
                            }
                        } else {
                            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.t4, Q0, Boolean.FALSE, null, -1);
                            break;
                        }
                    } else {
                        HashSet s10 = org.telegram.ui.ActionBar.a7.s();
                        StringBuilder sb3 = new StringBuilder();
                        Iterator it = s10.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            if (sb3.length() > 0) {
                                sb3.append(',');
                            }
                            sb3.append(org.telegram.ui.ActionBar.d5.c(intValue));
                        }
                        Log.i("tmessages", "DEBUG_THEME keys on screen (" + s10.size() + "): " + ((Object) sb3));
                        break;
                    }
                } else {
                    try {
                        launchActivity7.y0(true);
                        if (org.telegram.messenger.i0.Q1() && (actionBarLayout = launchActivity7.s0) != null) {
                            actionBarLayout.W(true, true);
                        }
                        Log.i("tmessages", "DEBUG_THEME rebuilt fragment views");
                        break;
                    } catch (Exception e15) {
                        org.telegram.messenger.f8.g(e15, true);
                        return;
                    }
                }
                break;
            case 21:
                ua0 ua0Var = (ua0) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                String str6 = (String) this.d;
                ua0Var.c();
                if (tLObject7 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    if (!TwoStepVerificationActivity.m0(password, false)) {
                        org.telegram.ui.Components.s4.w0(ua0Var.a, org.telegram.messenger.cd.L0(2131743846, null), true);
                    }
                    qa0 qa0Var = new qa0(ua0Var, str6, 2);
                    if (!password.has_password) {
                        tc1 tc1Var = new tc1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        tc1Var.j0 = qa0Var;
                        ua0Var.u(tc1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.I = password;
                        twoStepVerificationActivity.J = false;
                        ua0Var.u(twoStepVerificationActivity, false);
                        qa0Var.run();
                        break;
                    }
                }
                break;
            case 22:
                ra0 ra0Var = (ra0) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.User user3 = (TLRPC.User) this.d;
                if (tLObject8 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject8;
                    ra0Var.getMessagesController().V3(tL_users_userFull.users, false);
                    ra0Var.getMessagesController().P3(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                }
                TLRPC.UserFull userFull2 = userFull;
                org.telegram.ui.Components.voip.m1.m(user3, false, userFull2 != null && userFull2.video_calls_available, ra0Var.getParentActivity(), userFull2, ra0Var.getAccountInstance());
                break;
            case 23:
                yb0 yb0Var = (yb0) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.d;
                ImageView imageView = new ImageView(yb0Var.getParentActivity());
                imageView.setImageBitmap(bitmap);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e16) {
                    org.telegram.messenger.f8.g(e16, true);
                }
                org.telegram.messenger.i0.h3(new qq(yb0Var, viewGroup, gLSurfaceView, 24), 100L);
                break;
            case 24:
                yb0 yb0Var2 = (yb0) this.b;
                try {
                    ((ViewGroup) this.c).removeView((GLSurfaceView) this.d);
                } catch (Exception e17) {
                    org.telegram.messenger.f8.g(e17, true);
                }
                yb0Var2.K = true;
                yb0Var2.finishFragment();
                break;
            case 25:
                yb0 yb0Var3 = (yb0) this.b;
                org.telegram.ui.ActionBar.x1[] x1VarArr = (org.telegram.ui.ActionBar.x1[]) this.c;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.d;
                yb0Var3.getClass();
                try {
                    x1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                x1VarArr[0] = null;
                yb0Var3.N0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                yb0Var3.finishFragment();
                break;
            case 26:
                ((hf0) this.b).y1((String) this.c, (TLRPC.auth_SentCode) this.d);
                break;
            case 27:
                hf0 hf0Var = (hf0) this.b;
                Bundle bundle = (Bundle) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                hf0Var.getClass();
                hf0Var.o1(bundle, (TLRPC.auth_SentCode) tLObject9, true);
                break;
            case 28:
                ag.u2 u2Var = (ag.u2) this.b;
                EditText editText = (EditText) this.c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                u2Var.getClass();
                editText.removeTextChangedListener(u2Var);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            default:
                wc0 wc0Var = (wc0) this.b;
                TLObject tLObject10 = (TLObject) this.c;
                Bundle bundle2 = (Bundle) this.d;
                hf0 hf0Var2 = wc0Var.W;
                if (!(tLObject10 instanceof TL_account.TL_emailVerified) || hf0Var2.F != 3) {
                    if (!(tLObject10 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject10 instanceof TLRPC.TL_auth_authorization) {
                            hf0Var2.w1((TLRPC.TL_auth_authorization) tLObject10, false);
                            break;
                        }
                    } else {
                        hf0Var2.o1(bundle2, ((TL_account.TL_emailVerifiedLogin) tLObject10).sent_code, true);
                        break;
                    }
                } else {
                    hf0Var2.finishFragment();
                    hf0Var2.d0.run();
                    break;
                }
                break;
        }
    }
}
