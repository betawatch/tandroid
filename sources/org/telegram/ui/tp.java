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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tp(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:308:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0868 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i7;
        ArrayList arrayList3;
        int i10;
        ArrayList arrayList4;
        a0.h hVar;
        ArrayList arrayList5;
        int size;
        int i11;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        ActionBarLayout actionBarLayout;
        int i12 = 8;
        int i13 = 4;
        int i14 = 2;
        TLRPC.UserFull userFull = null;
        int i15 = 0;
        switch (this.a) {
            case 0:
                int i16 = 3;
                rq rqVar = (rq) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                a0.h hVar2 = rqVar.K;
                a0.h hVar3 = rqVar.L;
                int i17 = rqVar.d1;
                a0.h hVar4 = rqVar.J;
                int i18 = rqVar.N;
                ArrayList arrayList8 = rqVar.E;
                int i19 = 0;
                int i20 = 0;
                while (i20 < arrayList6.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList6.get(i20);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList7.get(i20);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        arrayList = arrayList6;
                        arrayList2 = arrayList7;
                        i7 = i13;
                        arrayList3 = arrayList8;
                        i10 = i16;
                    } else {
                        if (i18 == 1) {
                            arrayList4 = arrayList8;
                            rqVar.getMessagesController().I3(rqVar.M, tL_channels_channelParticipants);
                        } else {
                            arrayList4 = arrayList8;
                        }
                        rqVar.getMessagesController().Y3(tL_channels_channelParticipants.users, false);
                        rqVar.getMessagesController().S3(tL_channels_channelParticipants.chats, false);
                        long e10 = rqVar.getUserConfig().e();
                        if (i17 != 0) {
                            int i21 = 0;
                            while (true) {
                                if (i21 < tL_channels_channelParticipants.participants.size()) {
                                    if (org.telegram.messenger.ij.B1(tL_channels_channelParticipants.participants.get(i21).peer) == e10) {
                                        tL_channels_channelParticipants.participants.remove(i21);
                                    } else {
                                        i21++;
                                    }
                                }
                            }
                        }
                        if (i18 == 2) {
                            rqVar.j1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList5 = rqVar.G;
                                hVar = hVar3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList5 = rqVar.F;
                                hVar = hVar2;
                            }
                            arrayList5.clear();
                            arrayList5.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            arrayList = arrayList6;
                            i11 = 0;
                            while (i11 < size) {
                                ArrayList arrayList9 = arrayList7;
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i11);
                                int i22 = i11;
                                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants2 = tL_channels_channelParticipants;
                                if (channelParticipant.user_id == e10) {
                                    arrayList5.remove(channelParticipant);
                                } else {
                                    hVar.k(channelParticipant, org.telegram.messenger.ij.B1(channelParticipant.peer));
                                }
                                i11 = i22 + 1;
                                arrayList7 = arrayList9;
                                tL_channels_channelParticipants = tL_channels_channelParticipants2;
                            }
                            arrayList2 = arrayList7;
                            int size2 = arrayList5.size() + i19;
                            if (i18 == 2) {
                                int size3 = arrayList4.size();
                                int i23 = 0;
                                while (i23 < size3) {
                                    ArrayList arrayList10 = arrayList4;
                                    TLObject tLObject = (TLObject) arrayList10.get(i23);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        long B1 = org.telegram.messenger.ij.B1(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (hVar3.f(B1) != null || hVar2.f(B1) != null || (i17 == 1 && B1 > 0 && org.telegram.messenger.t10.x(rqVar.getMessagesController().a2(Long.valueOf(B1))))) {
                                            arrayList10.remove(i23);
                                            hVar4.l(B1);
                                        }
                                        i23++;
                                        arrayList4 = arrayList10;
                                    } else {
                                        arrayList10.remove(i23);
                                    }
                                    i23--;
                                    size3--;
                                    i23++;
                                    arrayList4 = arrayList10;
                                }
                            }
                            arrayList3 = arrayList4;
                            i10 = i16;
                            if ((i18 != 0 || i18 == i10 || i18 == 2) && (chat = rqVar.n) != null && chat.megagroup) {
                                chatFull = rqVar.r;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    rqVar.E0(arrayList5);
                                    i7 = 4;
                                    i19 = size2;
                                }
                            }
                            if (i18 == 1) {
                                try {
                                    i7 = 4;
                                    try {
                                        Collections.sort(arrayList3, new pe(i7));
                                    } catch (Exception e11) {
                                        e = e11;
                                        org.telegram.messenger.a8.g(e, true);
                                        i19 = size2;
                                        i20++;
                                        i13 = i7;
                                        i16 = i10;
                                        arrayList8 = arrayList3;
                                        arrayList6 = arrayList;
                                        arrayList7 = arrayList2;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    i7 = 4;
                                }
                                i19 = size2;
                            }
                            i7 = 4;
                            i19 = size2;
                        } else {
                            hVar4.b();
                        }
                        hVar = hVar4;
                        arrayList5 = arrayList4;
                        arrayList5.clear();
                        arrayList5.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        arrayList = arrayList6;
                        i11 = 0;
                        while (i11 < size) {
                        }
                        arrayList2 = arrayList7;
                        int size22 = arrayList5.size() + i19;
                        if (i18 == 2) {
                        }
                        arrayList3 = arrayList4;
                        i10 = i16;
                        if (i18 != 0) {
                        }
                        chatFull = rqVar.r;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            rqVar.E0(arrayList5);
                            i7 = 4;
                            i19 = size22;
                        }
                        if (i18 == 1) {
                        }
                        i7 = 4;
                        i19 = size22;
                    }
                    i20++;
                    i13 = i7;
                    i16 = i10;
                    arrayList8 = arrayList3;
                    arrayList6 = arrayList;
                    arrayList7 = arrayList2;
                }
                if (i18 != 2 || rqVar.j1 <= 0) {
                    nq nqVar = rqVar.a;
                    rqVar.D0(nqVar != null ? nqVar.d.c1 : 0);
                    rqVar.P = false;
                    rqVar.Q = true;
                    org.telegram.ui.ActionBar.g5 g5Var = rqVar.f;
                    if (g5Var != null) {
                        g5Var.setVisibility((i18 != 0 || i19 > 5) ? 0 : 8);
                    }
                }
                rqVar.G0();
                nq nqVar2 = rqVar.a;
                if (nqVar2 != null) {
                    bi.q1 q1Var = rqVar.c;
                    q1Var.W1 = rqVar.A1;
                    q1Var.X1 = 0;
                    nqVar2.f();
                    org.telegram.ui.Components.bv0 bv0Var = rqVar.b;
                    if (bv0Var != null && rqVar.a.d.c1 == 0 && rqVar.Q) {
                        bv0Var.e(false, true);
                    }
                }
                rqVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                zw zwVar = (zw) this.b;
                bd bdVar = (bd) this.c;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.d;
                zwVar.removeSelfFromStack();
                bdVar.removeSelfFromStack();
                f2Var.finishFragment();
                break;
            case 2:
                zw zwVar2 = (zw) this.b;
                zwVar2.G4((yw) this.c);
                pw pwVar = zwVar2.z0;
                if (pwVar != null && pwVar.getVisibility() == 0) {
                    zwVar2.z0.c();
                    break;
                }
                break;
            case 3:
                qw qwVar = (qw) this.b;
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) this.d;
                zw zwVar3 = qwVar.b;
                if (!zArr[0]) {
                    yy.f1(zwVar3, voVar, null);
                    break;
                } else {
                    zwVar3.presentFragment(new jy(voVar, null));
                    break;
                }
            case 4:
                lx lxVar = (lx) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.d;
                lxVar.getClass();
                lxVar.o((TLRPC.TL_messages_stickerSet) tLObject2, ijVar);
                break;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                ArrayList arrayList11 = ExternalActionActivity.y;
                try {
                    u1Var.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.ActionBar.u1 u02 = org.telegram.ui.Components.u4.u0(externalActionActivity, org.telegram.messenger.id.M0(2131743820, null), true);
                        if (u02 != null) {
                            u02.setOnDismissListener(new bi.u3(10, externalActionActivity, tL_error));
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
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    return;
                }
                break;
            case 6:
                jz jzVar = (jz) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                jz.x0(tL_error2, jzVar, org.telegram.ui.Components.gc.a0(jzVar));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    org.telegram.messenger.qp.e1().edit().putBoolean("n_0", true).apply();
                    jzVar.getMessagesController().c3(true, null);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3;
                    jy jyVar = new jy(jzVar.r, tL_chatlists_exportedChatlistInvite.invite);
                    jyVar.y = new ny(jzVar, 1);
                    jyVar.x = new ny(jzVar, i14);
                    jzVar.presentFragment(jyVar);
                    org.telegram.messenger.g0.i3(new org.telegram.ui.Components.h41(26, jzVar, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                yy yyVar = (yy) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                org.telegram.ui.ActionBar.f2 f2Var2 = yyVar.r1;
                jz.x0(tL_error3, f2Var2, new org.telegram.ui.Components.gc(yyVar.V1, null));
                if (tLObject4 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    org.telegram.messenger.qp.e1().edit().putBoolean("n_0", true).apply();
                    yyVar.dismiss();
                    f2Var2.getMessagesController().c3(true, null);
                    f2Var2.presentFragment(new jy(yyVar.T1, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject4).invite));
                    break;
                }
                break;
            case 8:
                dz dzVar = (dz) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                cz czVar = (cz) this.d;
                if (tL_error4 != null) {
                    org.telegram.ui.Components.gc.a0(dzVar.a).t(org.telegram.messenger.id.M0(2131743879, null), null).j();
                    org.telegram.messenger.g0.r(czVar);
                    break;
                }
                break;
            case 9:
                h00 h00Var = (h00) this.b;
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.c;
                org.telegram.messenger.vo voVar2 = (org.telegram.messenger.vo) this.d;
                FiltersSetupActivity filtersSetupActivity = h00Var.e;
                if (u1Var2 != null) {
                    try {
                        u1Var2.dismiss();
                    } catch (Exception e14) {
                        org.telegram.messenger.a8.g(e14, true);
                    }
                }
                filtersSetupActivity.getMessagesController().h4(voVar2);
                org.telegram.messenger.yr messagesStorage = filtersSetupActivity.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.zq(i15, messagesStorage, voVar2));
                break;
            case 10:
                x40 x40Var = (x40) this.b;
                ArrayList arrayList12 = (ArrayList) this.c;
                ArrayList arrayList13 = (ArrayList) this.d;
                z40 z40Var = x40Var.I;
                jg.z1 z1Var = x40Var.f;
                if (x40Var.n) {
                    x40Var.h = null;
                    x40Var.d = arrayList12;
                    x40Var.e = arrayList13;
                    z1Var.f(arrayList12, null);
                    z40Var.v0(x40Var.H);
                    x40Var.f();
                    if (x40Var.n && !z1Var.e() && x40Var.b() == 0) {
                        z40Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                x50 x50Var = (x50) this.b;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) this.c;
                String str = (String) this.d;
                if (!x50Var.M) {
                    x50Var.f.setText(tL_langPackString.value);
                    org.telegram.messenger.qp.e1().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                z50 z50Var = (z50) this.b;
                ArrayList arrayList14 = (ArrayList) this.c;
                ArrayList arrayList15 = (ArrayList) this.d;
                if (z50Var.h) {
                    z50Var.d = arrayList14;
                    z50Var.e = arrayList15;
                    z50Var.f();
                    z50Var.n.r.e(false, true);
                    break;
                }
                break;
            case 13:
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                cn cnVar = (cn) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = LaunchActivity.B1;
                if (tL_error5 == null) {
                    if (user != null && !org.telegram.messenger.t10.B(user)) {
                        org.telegram.messenger.camera.q.s(org.telegram.messenger.id.a0(null, null, 2131748184, org.telegram.messenger.t10.j(user, true)), org.telegram.ui.Components.gc.a0(cnVar), R.raw.contact_check, 36);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.gc.a0(cnVar).f0(tL_error5, false);
                    break;
                }
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                f10 f10Var = (f10) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                String str3 = LaunchActivity.B1;
                try {
                    f10Var.run();
                } catch (Exception e15) {
                    org.telegram.messenger.a8.g(e15, true);
                }
                if (tLObject5 instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject5;
                    org.telegram.ui.Components.u4.u0(launchActivity, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                f10 f10Var2 = (f10) this.c;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                String str4 = LaunchActivity.B1;
                try {
                    f10Var2.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error6.text)) {
                        org.telegram.ui.Components.u4.u0(launchActivity2, org.telegram.messenger.id.M0(2131743820, null), true);
                    } else {
                        launchActivity2.F0(org.telegram.ui.Components.u4.K(launchActivity2, null, org.telegram.messenger.id.M0(2131751105, null) + "\n" + tL_error6.text));
                    }
                    break;
                } catch (Exception e16) {
                    org.telegram.messenger.a8.g(e16, true);
                    return;
                }
            case 16:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) this.c;
                File file = (File) this.d;
                String str5 = LaunchActivity.B1;
                l6Var.d(file, l6Var.c);
                org.telegram.messenger.g0.h3(new v60(launchActivity3, i12));
                break;
            case 17:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                int[] iArr = (int[]) this.c;
                long[] jArr = (long[]) this.d;
                String str6 = LaunchActivity.B1;
                int i24 = iArr[0] - 1;
                iArr[0] = i24;
                if (i24 == 0) {
                    org.telegram.messenger.qs.f(launchActivity4.O).k(org.telegram.messenger.qs.v5, new Object[0]);
                    launchActivity4.p0(jArr, false);
                    break;
                }
                break;
            case 18:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                org.telegram.ui.ActionBar.l6 l6Var2 = (org.telegram.ui.ActionBar.l6) this.d;
                if (!(tLObject6 instanceof TLRPC.TL_wallPaper)) {
                    String str7 = LaunchActivity.B1;
                    launchActivity5.i0();
                    break;
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject6;
                    launchActivity5.R0 = l6Var2;
                    launchActivity5.P0 = org.telegram.messenger.w7.r(null, tL_wallPaper.document);
                    launchActivity5.Q0 = tL_wallPaper;
                    org.telegram.messenger.w7.G(l6Var2.E).W(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    break;
                }
            case 19:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                a80 a80Var = (a80) this.d;
                String str8 = LaunchActivity.B1;
                org.telegram.messenger.qp.s1(launchActivity6.O).X3(user2, true, false);
                a80Var.a(user2);
                break;
            case 20:
                androidx.mediarouter.app.f fVar = (androidx.mediarouter.app.f) this.b;
                String str9 = (String) this.c;
                String str10 = (String) this.d;
                LaunchActivity launchActivity7 = (LaunchActivity) fVar.b;
                String str11 = LaunchActivity.B1;
                if (!"rebuild".equals(str9)) {
                    if (!"keys".equals(str9)) {
                        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                        String str12 = "Blue";
                        String string = sharedPreferences.getString("lastDayTheme", "Blue");
                        if (org.telegram.ui.ActionBar.m6.Q0(string) != null && !org.telegram.ui.ActionBar.m6.Q0(string).q()) {
                            str12 = string;
                        }
                        String str13 = "Dark Blue";
                        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                        if (org.telegram.ui.ActionBar.m6.Q0(string2) != null && org.telegram.ui.ActionBar.m6.Q0(string2).q()) {
                            str13 = string2;
                        }
                        boolean z9 = "night".equals(str9) || !("day".equals(str9) || org.telegram.ui.ActionBar.m6.I.q());
                        if (z9) {
                            str12 = str13;
                        }
                        org.telegram.ui.ActionBar.l6 Q0 = org.telegram.ui.ActionBar.m6.Q0(str12);
                        StringBuilder sb2 = new StringBuilder("DEBUG_THEME ");
                        sb2.append(z9 ? "night" : "day");
                        sb2.append(" (");
                        sb2.append(Q0.m());
                        sb2.append("), style ");
                        sb2.append(str10);
                        Log.i("tmessages", sb2.toString());
                        if (!"instant".equals(str10)) {
                            if (!"fade".equals(str10)) {
                                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.t4, Q0, Boolean.FALSE, new int[]{launchActivity7.x0.getMeasuredWidth() / 2, launchActivity7.x0.getMeasuredHeight() / 2}, -1, Boolean.valueOf(z9), null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.m6.K1(Q0, false, -1, null);
                                break;
                            }
                        } else {
                            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.t4, Q0, Boolean.FALSE, null, -1);
                            break;
                        }
                    } else {
                        HashSet r10 = org.telegram.ui.ActionBar.t6.r();
                        StringBuilder sb3 = new StringBuilder();
                        Iterator it = r10.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            if (sb3.length() > 0) {
                                sb3.append(',');
                            }
                            sb3.append(org.telegram.ui.ActionBar.v4.c(intValue));
                        }
                        Log.i("tmessages", "DEBUG_THEME keys on screen (" + r10.size() + "): " + ((Object) sb3));
                        break;
                    }
                } else {
                    try {
                        launchActivity7.y0(true);
                        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = launchActivity7.q0) != null) {
                            actionBarLayout.X(true, true);
                        }
                        Log.i("tmessages", "DEBUG_THEME rebuilt fragment views");
                        break;
                    } catch (Exception e17) {
                        org.telegram.messenger.a8.g(e17, true);
                        return;
                    }
                }
                break;
            case 21:
                s90 s90Var = (s90) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                String str14 = (String) this.d;
                s90Var.c();
                if (tLObject7 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    if (!TwoStepVerificationActivity.n0(password, false)) {
                        org.telegram.ui.Components.u4.u0(s90Var.a, org.telegram.messenger.id.M0(2131743820, null), true);
                    }
                    o90 o90Var = new o90(s90Var, str14, 2);
                    if (!password.has_password) {
                        cb1 cb1Var = new cb1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        cb1Var.j0 = o90Var;
                        s90Var.u(cb1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.I = password;
                        twoStepVerificationActivity.J = false;
                        s90Var.u(twoStepVerificationActivity, false);
                        o90Var.run();
                        break;
                    }
                }
                break;
            case 22:
                p90 p90Var = (p90) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.User user3 = (TLRPC.User) this.d;
                if (tLObject8 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject8;
                    p90Var.getMessagesController().Y3(tL_users_userFull.users, false);
                    p90Var.getMessagesController().S3(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                }
                TLRPC.UserFull userFull2 = userFull;
                org.telegram.ui.Components.voip.y1.m(user3, false, userFull2 != null && userFull2.video_calls_available, p90Var.getParentActivity(), userFull2, p90Var.getAccountInstance());
                break;
            case 23:
                sa0 sa0Var = (sa0) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.d;
                ImageView imageView = new ImageView(sa0Var.getParentActivity());
                imageView.setImageBitmap(bitmap);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e18) {
                    org.telegram.messenger.a8.g(e18, true);
                }
                org.telegram.messenger.g0.i3(new tp(sa0Var, viewGroup, gLSurfaceView, 25), 100L);
                break;
            case 24:
                sa0 sa0Var2 = (sa0) this.b;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.c;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.d;
                sa0Var2.getClass();
                try {
                    u1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                u1VarArr[0] = null;
                sa0Var2.G0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                sa0Var2.finishFragment();
                break;
            case 25:
                sa0 sa0Var3 = (sa0) this.b;
                try {
                    ((ViewGroup) this.c).removeView((GLSurfaceView) this.d);
                } catch (Exception e19) {
                    org.telegram.messenger.a8.g(e19, true);
                }
                sa0Var3.I = true;
                sa0Var3.finishFragment();
                break;
            case 26:
                ((fe0) this.b).I1((String) this.c, (TLRPC.auth_SentCode) this.d);
                break;
            case 27:
                fe0 fe0Var = (fe0) this.b;
                Bundle bundle = (Bundle) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                fe0Var.getClass();
                fe0Var.y1(bundle, (TLRPC.auth_SentCode) tLObject9, true);
                break;
            case 28:
                fi.h7 h7Var = (fi.h7) this.b;
                EditText editText = (EditText) this.c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                h7Var.getClass();
                editText.removeTextChangedListener(h7Var);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            default:
                rb0 rb0Var = (rb0) this.b;
                TLObject tLObject10 = (TLObject) this.c;
                Bundle bundle2 = (Bundle) this.d;
                fe0 fe0Var2 = rb0Var.W;
                if (!(tLObject10 instanceof TL_account.TL_emailVerified) || fe0Var2.F != 3) {
                    if (!(tLObject10 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject10 instanceof TLRPC.TL_auth_authorization) {
                            fe0Var2.G1((TLRPC.TL_auth_authorization) tLObject10, false);
                            break;
                        }
                    } else {
                        fe0Var2.y1(bundle2, ((TL_account.TL_emailVerifiedLogin) tLObject10).sent_code, true);
                        break;
                    }
                } else {
                    fe0Var2.finishFragment();
                    fe0Var2.d0.run();
                    break;
                }
                break;
        }
    }
}
