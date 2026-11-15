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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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

    /* JADX WARN: Code restructure failed: missing block: B:333:0x081b, code lost:
    
        if (org.telegram.messenger.q10.x(r2.getMessagesController().a2(java.lang.Long.valueOf(r0))) != false) goto L302;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0865 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [int] */
    /* JADX WARN: Type inference failed for: r12v18 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i7;
        int i10;
        int i11;
        a0.h hVar;
        ArrayList arrayList3;
        int size;
        int i12;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        int i13;
        ArrayList arrayList4;
        ActionBarLayout actionBarLayout;
        int i14 = 8;
        int i15 = 2;
        TLRPC.UserFull userFull = null;
        boolean z10 = false;
        int i16 = 1;
        switch (this.a) {
            case 0:
                int i17 = 3;
                qq qqVar = (qq) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                a0.h hVar2 = qqVar.L;
                a0.h hVar3 = qqVar.M;
                int i18 = qqVar.e1;
                a0.h hVar4 = qqVar.K;
                int i19 = qqVar.O;
                ArrayList arrayList7 = qqVar.F;
                int i20 = 0;
                int i21 = 0;
                while (i21 < arrayList5.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList5.get(i21);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList6.get(i21);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        i7 = i17;
                        i20 = i20;
                    } else {
                        if (i19 == i16) {
                            i11 = i16;
                            i10 = i20;
                            qqVar.getMessagesController().I3(qqVar.N, tL_channels_channelParticipants);
                        } else {
                            i10 = i20;
                            i11 = i16;
                        }
                        qqVar.getMessagesController().Y3(tL_channels_channelParticipants.users, z10);
                        qqVar.getMessagesController().S3(tL_channels_channelParticipants.chats, z10);
                        long e10 = qqVar.getUserConfig().e();
                        if (i18 != 0) {
                            ?? r12 = z10;
                            while (true) {
                                if (r12 < tL_channels_channelParticipants.participants.size()) {
                                    if (org.telegram.messenger.gj.B1(tL_channels_channelParticipants.participants.get(r12).peer) == e10) {
                                        tL_channels_channelParticipants.participants.remove((int) r12);
                                    } else {
                                        r12++;
                                    }
                                }
                            }
                        }
                        if (i19 == 2) {
                            qqVar.k1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList3 = qqVar.H;
                                hVar = hVar3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList3 = qqVar.G;
                                hVar = hVar2;
                            }
                            arrayList3.clear();
                            arrayList3.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            i12 = 0;
                            while (i12 < size) {
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i12);
                                ArrayList arrayList8 = arrayList5;
                                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants2 = tL_channels_channelParticipants;
                                if (channelParticipant.user_id == e10) {
                                    arrayList3.remove(channelParticipant);
                                } else {
                                    hVar.k(channelParticipant, org.telegram.messenger.gj.B1(channelParticipant.peer));
                                }
                                i12++;
                                arrayList5 = arrayList8;
                                tL_channels_channelParticipants = tL_channels_channelParticipants2;
                            }
                            arrayList = arrayList5;
                            int size2 = arrayList3.size() + i10;
                            if (i19 == 2) {
                                int size3 = arrayList7.size();
                                int i22 = 0;
                                while (i22 < size3) {
                                    TLObject tLObject = (TLObject) arrayList7.get(i22);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        int i23 = size3;
                                        i13 = size2;
                                        long B1 = org.telegram.messenger.gj.B1(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (hVar3.f(B1) == null && hVar2.f(B1) == null) {
                                            if (i18 == i11 && B1 > 0) {
                                                arrayList4 = arrayList6;
                                                break;
                                            } else {
                                                arrayList4 = arrayList6;
                                            }
                                            size3 = i23;
                                        } else {
                                            arrayList4 = arrayList6;
                                        }
                                        arrayList7.remove(i22);
                                        hVar4.l(B1);
                                        i22--;
                                        size3 = i23 - 1;
                                    } else {
                                        arrayList7.remove(i22);
                                        i22--;
                                        size3--;
                                        i13 = size2;
                                        arrayList4 = arrayList6;
                                    }
                                    i22++;
                                    size2 = i13;
                                    arrayList6 = arrayList4;
                                    i11 = 1;
                                }
                            }
                            int i24 = size2;
                            arrayList2 = arrayList6;
                            if ((i19 != 0 || i19 == i17 || i19 == 2) && (chat = qqVar.n) != null && chat.megagroup) {
                                chatFull = qqVar.r;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    qqVar.E0(arrayList3);
                                    i7 = 3;
                                    i20 = i24;
                                }
                            }
                            if (i19 == 1) {
                                try {
                                    i7 = 3;
                                    try {
                                        Collections.sort(arrayList7, new me(i7));
                                    } catch (Exception e11) {
                                        e = e11;
                                        org.telegram.messenger.a8.g(e, true);
                                        i20 = i24;
                                        i21++;
                                        i17 = i7;
                                        arrayList6 = arrayList2;
                                        arrayList5 = arrayList;
                                        z10 = false;
                                        i16 = 1;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    i7 = 3;
                                }
                                i20 = i24;
                            }
                            i7 = 3;
                            i20 = i24;
                        } else {
                            hVar4.b();
                        }
                        hVar = hVar4;
                        arrayList3 = arrayList7;
                        arrayList3.clear();
                        arrayList3.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        i12 = 0;
                        while (i12 < size) {
                        }
                        arrayList = arrayList5;
                        int size22 = arrayList3.size() + i10;
                        if (i19 == 2) {
                        }
                        int i242 = size22;
                        arrayList2 = arrayList6;
                        if (i19 != 0) {
                        }
                        chatFull = qqVar.r;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            qqVar.E0(arrayList3);
                            i7 = 3;
                            i20 = i242;
                        }
                        if (i19 == 1) {
                        }
                        i7 = 3;
                        i20 = i242;
                    }
                    i21++;
                    i17 = i7;
                    arrayList6 = arrayList2;
                    arrayList5 = arrayList;
                    z10 = false;
                    i16 = 1;
                }
                int i25 = i20;
                if (i19 != 2 || qqVar.k1 <= 0) {
                    mq mqVar = qqVar.a;
                    qqVar.D0(mqVar != null ? mqVar.d.d1 : 0);
                    qqVar.Q = false;
                    qqVar.R = true;
                    org.telegram.ui.ActionBar.d5 d5Var = qqVar.f;
                    if (d5Var != null) {
                        d5Var.setVisibility((i19 != 0 || i25 > 5) ? 0 : 8);
                    }
                }
                qqVar.G0();
                mq mqVar2 = qqVar.a;
                if (mqVar2 != null) {
                    di.c1 c1Var = qqVar.c;
                    c1Var.X1 = qqVar.B1;
                    c1Var.Y1 = 0;
                    mqVar2.f();
                    org.telegram.ui.Components.cv0 cv0Var = qqVar.b;
                    if (cv0Var != null && qqVar.a.d.d1 == 0 && qqVar.R) {
                        cv0Var.e(false, true);
                    }
                }
                qqVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                yw ywVar = (yw) this.b;
                ad adVar = (ad) this.c;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.d;
                ywVar.removeSelfFromStack();
                adVar.removeSelfFromStack();
                e2Var.finishFragment();
                break;
            case 2:
                yw ywVar2 = (yw) this.b;
                ywVar2.G4((xw) this.c);
                ow owVar = ywVar2.A0;
                if (owVar != null && owVar.getVisibility() == 0) {
                    ywVar2.A0.c();
                    break;
                }
                break;
            case 3:
                pw pwVar = (pw) this.b;
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.messenger.so soVar = (org.telegram.messenger.so) this.d;
                yw ywVar3 = pwVar.b;
                if (!zArr[0]) {
                    wy.f1(ywVar3, soVar, null);
                    break;
                } else {
                    ywVar3.presentFragment(new hy(soVar, null));
                    break;
                }
            case 4:
                jx jxVar = (jx) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.d;
                jxVar.getClass();
                jxVar.o((TLRPC.TL_messages_stickerSet) tLObject2, gjVar);
                break;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                ArrayList arrayList9 = ExternalActionActivity.y;
                try {
                    t1Var.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.ActionBar.t1 u02 = org.telegram.ui.Components.t4.u0(externalActionActivity, org.telegram.messenger.hd.M0(2131743820, null), true);
                        if (u02 != null) {
                            u02.setOnDismissListener(new di.a3(10, externalActionActivity, tL_error));
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
                hz hzVar = (hz) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                hz.x0(tL_error2, hzVar, org.telegram.ui.Components.cc.a0(hzVar));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    org.telegram.messenger.np.e1().edit().putBoolean("n_0", true).apply();
                    hzVar.getMessagesController().c3(true, null);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3;
                    hy hyVar = new hy(hzVar.r, tL_chatlists_exportedChatlistInvite.invite);
                    hyVar.y = new ly(hzVar, i16);
                    hyVar.x = new ly(hzVar, 2);
                    hzVar.presentFragment(hyVar);
                    org.telegram.messenger.g0.i3(new org.telegram.ui.Components.voip.u(21, hzVar, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                wy wyVar = (wy) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                org.telegram.ui.ActionBar.e2 e2Var2 = wyVar.s1;
                hz.x0(tL_error3, e2Var2, new org.telegram.ui.Components.cc(wyVar.W1, null));
                if (tLObject4 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    org.telegram.messenger.np.e1().edit().putBoolean("n_0", true).apply();
                    wyVar.dismiss();
                    e2Var2.getMessagesController().c3(true, null);
                    e2Var2.presentFragment(new hy(wyVar.U1, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject4).invite));
                    break;
                }
                break;
            case 8:
                bz bzVar = (bz) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                az azVar = (az) this.d;
                if (tL_error4 != null) {
                    org.telegram.ui.Components.cc.a0(bzVar.a).t(org.telegram.messenger.hd.M0(2131743879, null), null).j();
                    org.telegram.messenger.g0.r(azVar);
                    break;
                }
                break;
            case 9:
                g00 g00Var = (g00) this.b;
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.c;
                org.telegram.messenger.so soVar2 = (org.telegram.messenger.so) this.d;
                FiltersSetupActivity filtersSetupActivity = g00Var.e;
                if (t1Var2 != null) {
                    try {
                        t1Var2.dismiss();
                    } catch (Exception e14) {
                        org.telegram.messenger.a8.g(e14, true);
                    }
                }
                filtersSetupActivity.getMessagesController().h4(soVar2);
                org.telegram.messenger.vr messagesStorage = filtersSetupActivity.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.pq(i15, messagesStorage, soVar2));
                break;
            case 10:
                u40 u40Var = (u40) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                w40 w40Var = u40Var.J;
                jg.z1 z1Var = u40Var.f;
                if (u40Var.n) {
                    u40Var.h = null;
                    u40Var.d = arrayList10;
                    u40Var.e = arrayList11;
                    z1Var.f(arrayList10, null);
                    w40Var.v0(u40Var.I);
                    u40Var.f();
                    if (u40Var.n && !z1Var.e() && u40Var.b() == 0) {
                        w40Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                t50 t50Var = (t50) this.b;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) this.c;
                String str = (String) this.d;
                if (!t50Var.N) {
                    t50Var.f.setText(tL_langPackString.value);
                    org.telegram.messenger.np.e1().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                v50 v50Var = (v50) this.b;
                ArrayList arrayList12 = (ArrayList) this.c;
                ArrayList arrayList13 = (ArrayList) this.d;
                if (v50Var.h) {
                    v50Var.d = arrayList12;
                    v50Var.e = arrayList13;
                    v50Var.f();
                    v50Var.n.r.e(false, true);
                    break;
                }
                break;
            case 13:
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                an anVar = (an) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = LaunchActivity.C1;
                if (tL_error5 == null) {
                    if (user != null && !org.telegram.messenger.q10.B(user)) {
                        org.telegram.messenger.i20.t(org.telegram.messenger.hd.a0(null, null, 2131748184, org.telegram.messenger.q10.j(user, true)), org.telegram.ui.Components.cc.a0(anVar), R.raw.contact_check, 36);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.cc.a0(anVar).f0(tL_error5, false);
                    break;
                }
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                g50 g50Var = (g50) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                String str3 = LaunchActivity.C1;
                try {
                    g50Var.run();
                } catch (Exception e15) {
                    org.telegram.messenger.a8.g(e15, true);
                }
                if (tLObject5 instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject5;
                    org.telegram.ui.Components.t4.u0(launchActivity, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                g50 g50Var2 = (g50) this.c;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                String str4 = LaunchActivity.C1;
                try {
                    g50Var2.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error6.text)) {
                        org.telegram.ui.Components.t4.u0(launchActivity2, org.telegram.messenger.hd.M0(2131743820, null), true);
                    } else {
                        launchActivity2.F0(org.telegram.ui.Components.t4.K(launchActivity2, null, org.telegram.messenger.hd.M0(2131751105, null) + "\n" + tL_error6.text));
                    }
                    break;
                } catch (Exception e16) {
                    org.telegram.messenger.a8.g(e16, true);
                    return;
                }
            case 16:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.c;
                File file = (File) this.d;
                String str5 = LaunchActivity.C1;
                i6Var.d(file, i6Var.c);
                org.telegram.messenger.g0.h3(new q60(launchActivity3, i14));
                break;
            case 17:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                int[] iArr = (int[]) this.c;
                long[] jArr = (long[]) this.d;
                String str6 = LaunchActivity.C1;
                int i26 = iArr[0] - 1;
                iArr[0] = i26;
                if (i26 == 0) {
                    org.telegram.messenger.ns.f(launchActivity4.P).k(org.telegram.messenger.ns.v5, new Object[0]);
                    launchActivity4.p0(jArr, false);
                    break;
                }
                break;
            case 18:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) this.d;
                if (!(tLObject6 instanceof TLRPC.TL_wallPaper)) {
                    String str7 = LaunchActivity.C1;
                    launchActivity5.i0();
                    break;
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject6;
                    launchActivity5.S0 = i6Var2;
                    launchActivity5.Q0 = org.telegram.messenger.w7.r(null, tL_wallPaper.document);
                    launchActivity5.R0 = tL_wallPaper;
                    org.telegram.messenger.w7.G(i6Var2.F).W(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    break;
                }
            case 19:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                w70 w70Var = (w70) this.d;
                String str8 = LaunchActivity.C1;
                org.telegram.messenger.np.s1(launchActivity6.P).X3(user2, true, false);
                w70Var.a(user2);
                break;
            case 20:
                androidx.mediarouter.app.f fVar = (androidx.mediarouter.app.f) this.b;
                String str9 = (String) this.c;
                String str10 = (String) this.d;
                LaunchActivity launchActivity7 = (LaunchActivity) fVar.b;
                String str11 = LaunchActivity.C1;
                if (!"rebuild".equals(str9)) {
                    if (!"keys".equals(str9)) {
                        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                        String str12 = "Blue";
                        String string = sharedPreferences.getString("lastDayTheme", "Blue");
                        if (org.telegram.ui.ActionBar.j6.Q0(string) != null && !org.telegram.ui.ActionBar.j6.Q0(string).q()) {
                            str12 = string;
                        }
                        String str13 = "Dark Blue";
                        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                        if (org.telegram.ui.ActionBar.j6.Q0(string2) != null && org.telegram.ui.ActionBar.j6.Q0(string2).q()) {
                            str13 = string2;
                        }
                        boolean z11 = "night".equals(str9) || !("day".equals(str9) || org.telegram.ui.ActionBar.j6.I.q());
                        if (z11) {
                            str12 = str13;
                        }
                        org.telegram.ui.ActionBar.i6 Q0 = org.telegram.ui.ActionBar.j6.Q0(str12);
                        StringBuilder sb2 = new StringBuilder("DEBUG_THEME ");
                        sb2.append(z11 ? "night" : "day");
                        sb2.append(" (");
                        sb2.append(Q0.m());
                        sb2.append("), style ");
                        sb2.append(str10);
                        Log.i("tmessages", sb2.toString());
                        if (!"instant".equals(str10)) {
                            if (!"fade".equals(str10)) {
                                org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.t4, Q0, Boolean.FALSE, new int[]{launchActivity7.y0.getMeasuredWidth() / 2, launchActivity7.y0.getMeasuredHeight() / 2}, -1, Boolean.valueOf(z11), null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.j6.K1(Q0, false, -1, null);
                                break;
                            }
                        } else {
                            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.t4, Q0, Boolean.FALSE, null, -1);
                            break;
                        }
                    } else {
                        HashSet r10 = org.telegram.ui.ActionBar.q6.r();
                        StringBuilder sb3 = new StringBuilder();
                        Iterator it = r10.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            if (sb3.length() > 0) {
                                sb3.append(',');
                            }
                            sb3.append(org.telegram.ui.ActionBar.s4.c(intValue));
                        }
                        Log.i("tmessages", "DEBUG_THEME keys on screen (" + r10.size() + "): " + ((Object) sb3));
                        break;
                    }
                } else {
                    try {
                        launchActivity7.y0(true);
                        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = launchActivity7.r0) != null) {
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
                q90 q90Var = (q90) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                String str14 = (String) this.d;
                q90Var.c();
                if (tLObject7 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    if (!TwoStepVerificationActivity.n0(password, false)) {
                        org.telegram.ui.Components.t4.u0(q90Var.a, org.telegram.messenger.hd.M0(2131743820, null), true);
                    }
                    m90 m90Var = new m90(q90Var, str14, 2);
                    if (!password.has_password) {
                        xa1 xa1Var = new xa1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        xa1Var.k0 = m90Var;
                        q90Var.u(xa1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.J = password;
                        twoStepVerificationActivity.K = false;
                        q90Var.u(twoStepVerificationActivity, false);
                        m90Var.run();
                        break;
                    }
                }
                break;
            case 22:
                n90 n90Var = (n90) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.User user3 = (TLRPC.User) this.d;
                if (tLObject8 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject8;
                    n90Var.getMessagesController().Y3(tL_users_userFull.users, false);
                    n90Var.getMessagesController().S3(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                }
                TLRPC.UserFull userFull2 = userFull;
                org.telegram.ui.Components.voip.c2.m(user3, false, userFull2 != null && userFull2.video_calls_available, n90Var.getParentActivity(), userFull2, n90Var.getAccountInstance());
                break;
            case 23:
                pa0 pa0Var = (pa0) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.d;
                ImageView imageView = new ImageView(pa0Var.getParentActivity());
                imageView.setImageBitmap(bitmap);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e18) {
                    org.telegram.messenger.a8.g(e18, true);
                }
                org.telegram.messenger.g0.i3(new tp(pa0Var, viewGroup, gLSurfaceView, 25), 100L);
                break;
            case 24:
                pa0 pa0Var2 = (pa0) this.b;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.c;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.d;
                pa0Var2.getClass();
                try {
                    t1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                t1VarArr[0] = null;
                pa0Var2.H0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                pa0Var2.finishFragment();
                break;
            case 25:
                pa0 pa0Var3 = (pa0) this.b;
                try {
                    ((ViewGroup) this.c).removeView((GLSurfaceView) this.d);
                } catch (Exception e19) {
                    org.telegram.messenger.a8.g(e19, true);
                }
                pa0Var3.J = true;
                pa0Var3.finishFragment();
                break;
            case 26:
                ((ce0) this.b).I1((String) this.c, (TLRPC.auth_SentCode) this.d);
                break;
            case 27:
                ce0 ce0Var = (ce0) this.b;
                Bundle bundle = (Bundle) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                ce0Var.getClass();
                ce0Var.y1(bundle, (TLRPC.auth_SentCode) tLObject9, true);
                break;
            case 28:
                bi.v vVar = (bi.v) this.b;
                EditText editText = (EditText) this.c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                vVar.getClass();
                editText.removeTextChangedListener(vVar);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            default:
                ob0 ob0Var = (ob0) this.b;
                TLObject tLObject10 = (TLObject) this.c;
                Bundle bundle2 = (Bundle) this.d;
                ce0 ce0Var2 = ob0Var.a0;
                if (!(tLObject10 instanceof TL_account.TL_emailVerified) || ce0Var2.G != 3) {
                    if (!(tLObject10 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject10 instanceof TLRPC.TL_auth_authorization) {
                            ce0Var2.G1((TLRPC.TL_auth_authorization) tLObject10, false);
                            break;
                        }
                    } else {
                        ce0Var2.y1(bundle2, ((TL_account.TL_emailVerifiedLogin) tLObject10).sent_code, true);
                        break;
                    }
                } else {
                    ce0Var2.finishFragment();
                    ce0Var2.e0.run();
                    break;
                }
                break;
        }
    }
}
