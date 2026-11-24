// default package

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sr0 implements Runnable {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ sr0(int i, TLRPC.TL_error tL_error, is0 is0Var, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, wy wyVar, d dVar, long j) {
        this.d = i;
        this.b = tL_error;
        this.e = is0Var;
        this.f = tL_inputCheckPasswordSRP;
        this.h = twoStepVerificationActivity;
        this.n = wyVar;
        this.r = dVar;
        this.c = j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0299, code lost:
    
        if (r0.equals("AVAILABLE_BALANCE_TOO_SMALL") == false) goto L123;
     */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.String, wjb] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        String str;
        int i;
        u21 Y;
        int i2;
        ?? r3;
        u21 b0;
        int i3;
        cj3 cj3Var;
        byte b = this.a;
        char c = 6;
        boolean[] zArr = uz4.a;
        int i4 = this.d;
        Object obj = this.r;
        Object obj2 = this.n;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.b;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                TLObject tLObject = (TLObject) obj5;
                hd hdVar = (hd) obj6;
                Context context = (Context) obj4;
                wjb wjbVar = (wjb) obj3;
                st0 st0Var = (st0) obj2;
                p pVar = (p) obj;
                if (tLObject instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z2 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i5 = this.d;
                    long j = this.c;
                    if (z2) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str2 = tL_botInlineMessageMediaWebPage.url;
                            tr0 tr0Var = new tr0(hdVar, context, i5, j, tL_messages_preparedInlineMessage, wjbVar, st0Var, pVar);
                            int[] iArr = new int[1];
                            gk7[] gk7VarArr = new gk7[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str2;
                            iArr[0] = ConnectionsManager.getInstance(i5).sendRequestTyped(getwebpagepreview, new hc((byte) 0), new e(iArr, tr0Var, gk7VarArr, i5, (byte) 3));
                            hdVar.setOnCancelListener(new ur0(new va7(iArr, i5, gk7VarArr, (byte) 7), (byte) 0));
                            break;
                        }
                    }
                    File[] fileArr = new File[1];
                    vr0 vr0Var = new vr0(hdVar, context, i5, j, tL_messages_preparedInlineMessage, fileArr, wjbVar, st0Var, pVar);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str3 = botInlineResult.content.url;
                            String x = fl5.x(str3, null);
                            String C = TextUtils.isEmpty(x) ? ba4.C(tL_messages_preparedInlineMessage.result.content.mime_type) : b00.h(".", x);
                            File file = new File(ba4.z(4), Utilities.a(str3) + C);
                            if (file.exists()) {
                                vr0Var.run();
                                break;
                            } else {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new x0(fileArr, vr0Var, (byte) 6), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str3);
                                hdVar.setOnCancelListener(new ur0(httpGetFileTask, (byte) 1));
                                break;
                            }
                        }
                    }
                    vr0Var.run();
                    break;
                } else {
                    pVar.a("MESSAGE_EXPIRED", null);
                    break;
                }
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                TLObject tLObject2 = (TLObject) obj5;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj4;
                d dVar = (d) obj3;
                is0 is0Var = (is0) obj2;
                wy wyVar = (wy) obj;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.e0(password);
                    uz4.b(dVar, this.c, twoStepVerificationActivity.d0(), twoStepVerificationActivity, is0Var, wyVar);
                    break;
                } else {
                    zArr[i4] = false;
                    twoStepVerificationActivity.s0();
                    u21.e0(tL_error);
                    break;
                }
            case 2:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                is0 is0Var2 = (is0) obj6;
                TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP = (TLRPC.TL_inputCheckPasswordSRP) obj4;
                TwoStepVerificationActivity twoStepVerificationActivity2 = (TwoStepVerificationActivity) obj3;
                wy wyVar2 = (wy) obj2;
                d dVar2 = (d) obj;
                zArr[i4] = false;
                if (tL_error2 == null || ((!"API_WITHDRAWAL_FEATURE_DISABLED".equals(tL_error2.text) && !"FEATURE_DISABLED".equals(tL_error2.text)) || is0Var2 == null)) {
                    twoStepVerificationActivity2.s0();
                    if (!uz4.h(tL_error2, twoStepVerificationActivity2)) {
                        twoStepVerificationActivity2.finishFragment();
                        if (tL_error2 != null) {
                            String str4 = tL_error2.text;
                            if (str4 == null || !str4.startsWith("FLOOD_WAIT")) {
                                str = null;
                                String str5 = tL_error2.text;
                                if (str5 == null || !str5.startsWith("TMP_PASSWORD")) {
                                    String str6 = tL_error2.text;
                                    str6.getClass();
                                    switch (str6.hashCode()) {
                                        case -1154072843:
                                            if (str6.equals("AMOUNT_TOO_SMALL")) {
                                                c = 0;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -577854011:
                                            if (str6.equals("FEATURE_DISABLED")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -456249281:
                                            if (str6.equals("WALLET_CREATING")) {
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 54255434:
                                            if (str6.equals("API_WITHDRAWAL_FEATURE_DISABLED")) {
                                                c = 3;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 367129409:
                                            if (str6.equals("STARS_REVENUE_ONLY_TON")) {
                                                c = 4;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1149363434:
                                            if (str6.equals("WALLET_UNAVAILABLE")) {
                                                c = 5;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1810617411:
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    switch (c) {
                                        case 0:
                                        case 6:
                                            i = 2131749327;
                                            break;
                                        case 1:
                                        case 3:
                                            i = 2131749320;
                                            break;
                                        case 2:
                                            i = 2131749623;
                                            break;
                                        case 4:
                                            i = 2131749326;
                                            break;
                                        case 5:
                                            i = 2131749621;
                                            break;
                                        default:
                                            i = 0;
                                            break;
                                    }
                                    if (i != 0) {
                                        ir2.v(null, i, wyVar2 != null ? u21.Y() : u21.b0(dVar2), R.raw.error, 36);
                                        break;
                                    } else {
                                        u21.e0(tL_error2);
                                        break;
                                    }
                                } else {
                                    Y = u21.Y();
                                    i2 = 2131749321;
                                }
                            } else {
                                Y = u21.Y();
                                i2 = 2131750670;
                                str = null;
                            }
                            ir2.v(str, i2, Y, R.raw.error, 36);
                            break;
                        } else {
                            if (wyVar2 != null) {
                                wyVar2.run();
                                z = true;
                            } else {
                                int currentAccount = dVar2.getCurrentAccount();
                                tz4 tz4Var = new tz4(currentAccount, this.c, dVar2);
                                uz4.b[currentAccount] = tz4Var;
                                kk7.f(currentAccount).k(kk7.A3, new Object[0]);
                                gl.e3(new qz4(tz4Var, (byte) 0), 1000L);
                                z = true;
                                if (is0Var2 != null) {
                                    gta.v(i4, true).P(true);
                                }
                            }
                            gta.v(i4, z).L();
                            ct0.g(i4).l(y6c.h(i4).e());
                            ct0.g(i4).j(y6c.h(i4).e(), z);
                            c.C(i4).J();
                            break;
                        }
                    }
                } else {
                    is0Var2.a(tL_inputCheckPasswordSRP, twoStepVerificationActivity2);
                    break;
                }
                break;
            case 3:
                pk5 pk5Var = (pk5) obj5;
                String str7 = (String) obj6;
                pk5Var.getClass();
                gl.d3(new pe(this.d, str7, (TLRPC.InputFile) obj4, (TLRPC.InputEncryptedFile) obj3, (byte[]) obj2, (byte[]) obj, this.c));
                pk5Var.b.u.remove(str7);
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLObject tLObject3 = (TLObject) obj5;
                String str8 = (String) obj4;
                String str9 = (String) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str10 = (String) obj;
                String str11 = LaunchActivity.C1;
                ArrayList arrayList = launchActivity.g0;
                ArrayList arrayList2 = launchActivity.e0;
                ArrayList arrayList3 = launchActivity.D0;
                if (tLObject3 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject3;
                    int i6 = this.d;
                    na7.q1(i6).a4(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str8 != null) {
                        LaunchActivity.G0(launchActivity, launchActivity.P, tL_attachMenuBot, str8, false);
                        break;
                    } else {
                        d dVar3 = (d) b00.f(1, arrayList2);
                        if (gl.O1() && !(dVar3 instanceof mu1) && !arrayList.isEmpty()) {
                            dVar3 = (d) b00.f(1, arrayList);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        if (!TextUtils.isEmpty(str9)) {
                            String[] split = str9.split(" ");
                            int length = split.length;
                            int i7 = 0;
                            while (i7 < length) {
                                int i8 = i7;
                                String str12 = split[i8];
                                Pattern pattern = hq6.U1;
                                String[] strArr = split;
                                ArrayList<TLRPC.AttachMenuPeerType> arrayList5 = tL_attachMenuBot.peer_types;
                                int i9 = length;
                                int size = arrayList5.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList5.get(i10);
                                    int i11 = i10 + 1;
                                    TLRPC.AttachMenuPeerType attachMenuPeerType2 = attachMenuPeerType;
                                    ArrayList<TLRPC.AttachMenuPeerType> arrayList6 = arrayList5;
                                    if ((((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeSameBotPM) || (attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBotPM)) && str12.equals("bots")) || (((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBroadcast) && str12.equals("channels")) || (((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeChat) && str12.equals("groups")) || ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypePM) && str12.equals("users"))))) {
                                        arrayList4.add(str12);
                                        i7 = i8 + 1;
                                        split = strArr;
                                        length = i9;
                                    } else {
                                        arrayList5 = arrayList6;
                                        i10 = i11;
                                    }
                                }
                                i7 = i8 + 1;
                                split = strArr;
                                length = i9;
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            cj3Var = null;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putInt("dialogsType", 14);
                            bundle.putBoolean("onlySelect", true);
                            bundle.putBoolean("allowGroups", arrayList4.contains("groups"));
                            bundle.putBoolean("allowMegagroups", arrayList4.contains("groups"));
                            bundle.putBoolean("allowLegacyGroups", arrayList4.contains("groups"));
                            bundle.putBoolean("allowUsers", arrayList4.contains("users"));
                            bundle.putBoolean("allowChannels", arrayList4.contains("channels"));
                            bundle.putBoolean("allowBots", arrayList4.contains("bots"));
                            cj3Var = new cj3(bundle);
                            cj3Var.E2 = new xx5(launchActivity, user, str10, i6);
                        }
                        if (tL_attachMenuBot.inactive) {
                            xx xxVar = new xx(launchActivity);
                            xxVar.setColor(bkb.w0(null, bkb.ha, false));
                            zkb.h(bkb.K5, null, xxVar);
                            xxVar.setAttachBot(tL_attachMenuBot);
                            psc.a(launchActivity, new fh(launchActivity, i6, this.c, cj3Var, dVar3, user, str10), null);
                            break;
                        } else if (cj3Var != null) {
                            if (dVar3 != null) {
                                dVar3.dismissCurrentDialog();
                            }
                            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                if (((Dialog) arrayList3.get(i12)).isShowing()) {
                                    ((Dialog) arrayList3.get(i12)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.t0(cj3Var);
                            break;
                        } else {
                            i3 = 2131753137;
                            if (dVar3 instanceof mu1) {
                                mu1 mu1Var = (mu1) dVar3;
                                if (hq6.v(tL_attachMenuBot, mu1Var.h() != null ? mu1Var.h() : mu1Var.e)) {
                                    mu1Var.Z9(user.id, str10, false);
                                    break;
                                } else {
                                    b0 = u21.b0(dVar3);
                                    r3 = 0;
                                }
                            } else {
                                r3 = 0;
                                b0 = u21.b0(dVar3);
                            }
                        }
                    }
                } else {
                    r3 = 0;
                    b0 = u21.b0((d) b00.f(1, arrayList2));
                    i3 = 2131753106;
                }
                yjb.x(r3, i3, b0, r3);
                break;
        }
    }

    public /* synthetic */ sr0(pk5 pk5Var, int i, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j) {
        this.b = pk5Var;
        this.d = i;
        this.e = str;
        this.f = inputFile;
        this.h = inputEncryptedFile;
        this.n = bArr;
        this.r = bArr2;
        this.c = j;
    }

    public /* synthetic */ sr0(TLObject tLObject, int i, hd hdVar, Context context, long j, wjb wjbVar, st0 st0Var, p pVar) {
        this.b = tLObject;
        this.d = i;
        this.e = hdVar;
        this.f = context;
        this.c = j;
        this.h = wjbVar;
        this.n = st0Var;
        this.r = pVar;
    }

    public /* synthetic */ sr0(TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, d dVar, long j, is0 is0Var, wy wyVar, int i) {
        this.e = tL_error;
        this.b = tLObject;
        this.f = twoStepVerificationActivity;
        this.h = dVar;
        this.c = j;
        this.n = is0Var;
        this.r = wyVar;
        this.d = i;
    }

    public /* synthetic */ sr0(LaunchActivity launchActivity, TLObject tLObject, int i, String str, String str2, TLRPC.User user, String str3, long j) {
        this.e = launchActivity;
        this.b = tLObject;
        this.d = i;
        this.f = str;
        this.h = str2;
        this.n = user;
        this.r = str3;
        this.c = j;
    }
}
