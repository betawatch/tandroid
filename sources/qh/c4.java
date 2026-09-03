package qh;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.ih;
import org.telegram.ui.py;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c4 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        char c3;
        String str;
        String upperCase;
        boolean z4;
        w51 w51Var;
        int i10;
        String str2;
        String str3;
        String str4 = "";
        int i11 = 6;
        boolean z10 = false;
        z10 = false;
        switch (this.a) {
            case 0:
                a5 a5Var = (a5) this.b;
                a5Var.d0(a5Var.j0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
            case 1:
                ((aa) this.b).Z((Bitmap) obj, ((Float) obj2).floatValue());
                break;
            case 2:
                a7 a7Var = (a7) this.b;
                ArrayList arrayList = (ArrayList) obj;
                if (a7Var.e0 || a7Var.d0 != null) {
                    TLRPC.WebPage webPage = a7Var.d0;
                    s6 s6Var = new s6(a7Var, 0);
                    int i12 = y6.a;
                    h51 J = h51.J(y6.class);
                    J.G = webPage;
                    J.D = s6Var;
                    arrayList.add(J);
                }
                arrayList.add(h51.k(a7Var.V));
                arrayList.add(h51.A(1, null));
                h51 i13 = h51.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                i13.K(a7Var.j0);
                arrayList.add(i13);
                if (a7Var.j0) {
                    arrayList.add(h51.k(a7Var.W));
                }
                arrayList.add(h51.A(3, null));
                arrayList.add(h51.k(a7Var.X));
                break;
            case 3:
                ba baVar = (ba) this.b;
                Float f10 = (Float) obj2;
                long duration = baVar.U0.getDuration() < 100 ? baVar.H1.h0 : baVar.U0.getDuration();
                float floatValue = ((f10.floatValue() / 0.96f) * 0.04f) + f10.floatValue();
                r6 r6Var = baVar.H1;
                float f11 = r6Var.a0;
                float f12 = r6Var.Z;
                float f13 = (f11 - f12) * floatValue;
                float f14 = duration;
                long j10 = (long) (f13 * f14);
                p9 p9Var = baVar.U0;
                long j11 = (long) ((f12 * f14) + j10);
                baVar.J1 = j11;
                p9Var.m(j11);
                e9 e9Var = baVar.s1;
                if (e9Var != null) {
                    e9Var.setCoverTime(baVar.J1);
                }
                r6 r6Var2 = baVar.H1;
                if (r6Var2 != null && r6Var2.g) {
                    r6Var2.j = true;
                    break;
                }
                break;
            case 4:
                ((ea) this.b).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 5:
                ((rh.g) this.b).C0((ArrayList) obj, (w51) obj2);
                break;
            case 6:
                rh.f fVar = (rh.f) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(h51.k(fVar.V));
                arrayList2.add(h51.k(fVar.W));
                break;
            case 7:
                ((sh.j) this.b).E0((ArrayList) obj, (w51) obj2);
                break;
            case 8:
                sh.r.U((sh.r) this.b, (ArrayList) obj);
                break;
            case 9:
                org.telegram.ui.Components.k6 k6Var = (org.telegram.ui.Components.k6) this.b;
                String str5 = (String) obj;
                Long l10 = (Long) obj2;
                StringBuilder sb = new StringBuilder();
                if (l10.longValue() > 0) {
                    sb.append("~");
                    sb.append(AndroidUtilities.formatFileSize(l10.longValue()));
                }
                if (str5 == null) {
                    upperCase = null;
                } else {
                    if (!str5.isEmpty()) {
                        switch (str5.hashCode()) {
                            case -2008589971:
                                if (str5.equals("application/epub+zip")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1719571662:
                                if (str5.equals("application/vnd.oasis.opendocument.text")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1664118616:
                                if (str5.equals("video/3gpp")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1578389996:
                                if (str5.equals("application/vnd.ms-fontobject")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1348237359:
                                if (str5.equals("application/x-cdf")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1348236892:
                                if (str5.equals("application/x-csh")) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1079884372:
                                if (str5.equals("video/x-msvideo")) {
                                    c3 = 6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1073633483:
                                if (str5.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                                    c3 = 7;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1071817359:
                                if (str5.equals("application/vnd.ms-powerpoint")) {
                                    c3 = '\b';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1050893613:
                                if (str5.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                                    c3 = '\t';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1007601745:
                                if (str5.equals("audio/x-midi")) {
                                    c3 = '\n';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -958424608:
                                if (str5.equals("text/calendar")) {
                                    c3 = 11;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -816908365:
                                if (str5.equals("application/x-httpd-php")) {
                                    c3 = '\f';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -648684635:
                                if (str5.equals("audio/3gpp2")) {
                                    c3 = '\r';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -433129473:
                                if (str5.equals("application/vnd.apple.installer+xml")) {
                                    c3 = 14;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -366307023:
                                if (str5.equals("application/vnd.ms-excel")) {
                                    c3 = 15;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -48069494:
                                if (str5.equals("video/3gpp2")) {
                                    c3 = 16;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -43923783:
                                if (str5.equals("application/gzip")) {
                                    c3 = 17;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -43491031:
                                if (str5.equals("application/x-sh")) {
                                    c3 = 18;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 187091926:
                                if (str5.equals("audio/ogg")) {
                                    c3 = 19;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 817335912:
                                if (str5.equals("text/plain")) {
                                    c3 = 20;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 859118878:
                                if (str5.equals("application/x-abiword")) {
                                    c3 = 21;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 886992732:
                                if (str5.equals("application/ld+json")) {
                                    c3 = 22;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 904647503:
                                if (str5.equals("application/msword")) {
                                    c3 = 23;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1154306387:
                                if (str5.equals("application/x-bzip")) {
                                    c3 = 24;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1154455342:
                                if (str5.equals("application/x-gzip")) {
                                    c3 = 25;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1178484637:
                                if (str5.equals("application/octet-stream")) {
                                    c3 = 26;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1423759679:
                                if (str5.equals("application/x-bzip2")) {
                                    c3 = 27;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1436962847:
                                if (str5.equals("application/vnd.oasis.opendocument.presentation")) {
                                    c3 = 28;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1454024983:
                                if (str5.equals("application/x-7z-compressed")) {
                                    c3 = 29;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1455492626:
                                if (str5.equals("application/x-freearc")) {
                                    c3 = 30;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1503095341:
                                if (str5.equals("audio/3gpp")) {
                                    c3 = 31;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1504831518:
                                if (str5.equals("audio/mpeg")) {
                                    c3 = ' ';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1509238306:
                                if (str5.equals("application/vnd.rar")) {
                                    c3 = '!';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1578362927:
                                if (str5.equals("image/vnd.microsoft.icon")) {
                                    c3 = '\"';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1643664935:
                                if (str5.equals("application/vnd.oasis.opendocument.spreadsheet")) {
                                    c3 = '#';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1672200517:
                                if (str5.equals("application/vnd.amazon.ebook")) {
                                    c3 = '$';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1993842850:
                                if (str5.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                                    c3 = '%';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2049276534:
                                if (str5.equals("application/java-archive")) {
                                    c3 = '&';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2132236175:
                                if (str5.equals("text/javascript")) {
                                    c3 = '\'';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                str = "epub";
                                break;
                            case 1:
                                str = "odt";
                                break;
                            case 2:
                            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                                str = "3gp";
                                break;
                            case 3:
                                str = "eot";
                                break;
                            case 4:
                                str = "cda";
                                break;
                            case 5:
                                str = "csh";
                                break;
                            case 6:
                                str = "avi";
                                break;
                            case 7:
                                str = "pptx";
                                break;
                            case '\b':
                                str = "ppt";
                                break;
                            case '\t':
                                str = "docx";
                                break;
                            case '\n':
                                str = "midi";
                                break;
                            case 11:
                                str = "ics";
                                break;
                            case '\f':
                                str = "php";
                                break;
                            case '\r':
                            case 16:
                                str = "3g2";
                                break;
                            case 14:
                                str = "mpkg";
                                break;
                            case 15:
                                str = "xls";
                                break;
                            case 17:
                            case 25:
                                str = "gz";
                                break;
                            case 18:
                                str = "sh";
                                break;
                            case 19:
                                str = "opus";
                                break;
                            case 20:
                                str = "txt";
                                break;
                            case 21:
                                str = "abw";
                                break;
                            case 22:
                                str = "jsonld";
                                break;
                            case 23:
                                str = "doc";
                                break;
                            case 24:
                                str = "bz";
                                break;
                            case 26:
                                str = "bin";
                                break;
                            case 27:
                                str = "bz2";
                                break;
                            case 28:
                                str = "odp";
                                break;
                            case 29:
                                str = "7z";
                                break;
                            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                                str = "arc";
                                break;
                            case ' ':
                                str = "mp3";
                                break;
                            case '!':
                                str = "rar";
                                break;
                            case '\"':
                                str = "ico";
                                break;
                            case '#':
                                str = "ods";
                                break;
                            case '$':
                                str = "azw";
                                break;
                            case '%':
                                str = "xlsx";
                                break;
                            case '&':
                                str = "jar";
                                break;
                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                str = "js";
                                break;
                            default:
                                if (str5.contains("/")) {
                                    str5 = str5.substring(str5.indexOf("/") + 1);
                                }
                                if (str5.contains("-")) {
                                    str5 = str5.substring(str5.indexOf("-") + 1);
                                }
                                if (str5.contains("+")) {
                                    str5 = str5.substring(0, str5.indexOf("+"));
                                }
                                str = str5.toLowerCase();
                                break;
                        }
                    } else {
                        str = "";
                    }
                    upperCase = str.toUpperCase();
                }
                if (!TextUtils.isEmpty(upperCase)) {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(upperCase.toUpperCase());
                }
                if (sb.length() <= 0) {
                    sb.append(LocaleController.getString(R.string.AttachDocument));
                }
                k6Var.setText(sb);
                break;
            case 10:
                sh.e1 e1Var = (sh.e1) this.b;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(h51.j(-1, e1Var.X));
                arrayList3.add(h51.B(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, e1Var.V))));
                break;
            case 11:
                sh.p2 p2Var = (sh.p2) this.b;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    p2Var.getClass();
                    break;
                } else {
                    sh.y3 y3Var = p2Var.s0;
                    if (y3Var != null) {
                        y3Var.a(tL_webViewResultUrl);
                        p2Var.n();
                        break;
                    }
                }
                break;
            case 12:
                ((sh.d3) this.b).F0((ArrayList) obj, (w51) obj2);
                break;
            case 13:
                ((sh.x3) this.b).U((ArrayList) obj, (w51) obj2);
                break;
            case 14:
                ((th.q) this.b).v.c((ArrayList) obj);
                break;
            case 15:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                wn0 wn0Var = (wn0) ((uf.z) this.b);
                py pyVar = wn0Var.F0;
                AndroidUtilities.hideKeyboard(pyVar.getParentActivity().getCurrentFocus());
                q70 I = q70.I(pyVar, (org.telegram.ui.Cells.h6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z4 = false;
                } else {
                    q70 J2 = I.J();
                    J2.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ec0(I, 24), false);
                    J2.k();
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                        J2.p(13, -1, tL_sponsoredPeer.sponsor_info);
                    }
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                        if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                            J2.k();
                        }
                        J2.p(13, -1, tL_sponsoredPeer.additional_info);
                    }
                    z4 = false;
                    I.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new lh.y2(I, J2, i11), false);
                }
                I.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new ih(wn0Var, pyVar, wn0Var.G0, I, 20), z4);
                I.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new ih((Object) wn0Var, (Object) pyVar, (Object) tL_sponsoredPeer, (Object) I, 21), z4);
                I.k();
                I.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new jp(wn0Var, pyVar, I, 15), z4);
                I.V(LocaleController.isRTL ? 3 : 5);
                I.Y = true;
                I.t = z4;
                I.Z();
                break;
            case 16:
                vf.c.U((vf.c) this.b, (ArrayList) obj, (w51) obj2);
                break;
            case 17:
                vf.k kVar = (vf.k) this.b;
                kVar.I.dismiss();
                kVar.y = (String) obj;
                kVar.B = (TLRPC.InputDocument) obj2;
                kVar.w = false;
                AndroidUtilities.cancelRunOnUIThread(kVar.d);
                kVar.n.setSticker(kVar.y);
                kVar.e0(true);
                a61 a61Var = kVar.a;
                if (a61Var != null && (w51Var = a61Var.V2) != null) {
                    w51Var.N(true);
                    break;
                }
                break;
            case 18:
                vf.e0 e0Var = (vf.e0) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                w51 w51Var2 = (w51) obj2;
                w51Var2.B = 1;
                LinearLayout linearLayout = e0Var.X;
                h51 h51Var = new h51(-4);
                h51Var.d = -5;
                h51Var.c = linearLayout;
                h51Var.z = -1;
                arrayList4.add(h51Var);
                TL_account.TL_connectedBot tL_connectedBot = e0Var.U;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        yh.r(R.string.SessionBotConnectedFrom, arrayList4);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList4.add(h51.f(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i10 = 2;
                            arrayList4.add(h51.f(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i10 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i10)) {
                            arrayList4.add(h51.f(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        arrayList4.add(h51.B(null));
                    }
                    w51Var2.U();
                    yh.r(R.string.BusinessBotChats2, arrayList4);
                    int i14 = vf.e0.d0;
                    h51 w10 = h51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    w10.K(e0Var.b0);
                    arrayList4.add(w10);
                    int i15 = vf.e0.e0;
                    h51 w11 = h51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    w11.K(!e0Var.b0);
                    arrayList4.add(w11);
                    w51Var2.T();
                    arrayList4.add(h51.B(null));
                    vf.v vVar = e0Var.W;
                    if (vVar != null) {
                        vVar.a(arrayList4, w51Var2, true);
                    }
                    yh.A(R.string.BusinessBotChatsInfo2, arrayList4);
                    break;
                }
                break;
            case 19:
                final vf.l0 l0Var = (vf.l0) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                w51 w51Var3 = (w51) obj2;
                LongSparseArray longSparseArray = l0Var.K;
                String string = LocaleController.getString(R.string.BusinessBots2);
                String string2 = LocaleController.getString(R.string.BusinessBots2Info);
                h51 h51Var2 = new h51(2);
                h51Var2.l = string;
                h51Var2.o = string2;
                h51Var2.m = AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2;
                h51Var2.n = "🤖🏝️";
                h51Var2.z = 120;
                arrayList5.add(h51Var2);
                if (l0Var.J != null) {
                    w51Var3.U();
                    long j12 = l0Var.J.id;
                    h51 h51Var3 = new h51(13);
                    h51Var3.x = j12;
                    h51Var3.K(true);
                    final int i16 = z10 ? 1 : 0;
                    h51Var3.D = new View.OnClickListener() { // from class: vf.h0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i16) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.c.V2.N(true);
                                    l0Var2.Y(true);
                                    break;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights = l0Var3.G;
                                    if (tL_businessBotRights.reply && tL_businessBotRights.read_messages && tL_businessBotRights.delete_received_messages && tL_businessBotRights.delete_sent_messages) {
                                        tL_businessBotRights.delete_sent_messages = false;
                                        tL_businessBotRights.delete_received_messages = false;
                                        tL_businessBotRights.read_messages = false;
                                        tL_businessBotRights.reply = false;
                                    } else {
                                        tL_businessBotRights.delete_sent_messages = true;
                                        tL_businessBotRights.delete_received_messages = true;
                                        tL_businessBotRights.read_messages = true;
                                        tL_businessBotRights.reply = true;
                                    }
                                    l0Var3.c.V2.N(true);
                                    l0Var3.Y(true);
                                    break;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = l0Var4.G;
                                    if (!tL_businessBotRights2.edit_name || !tL_businessBotRights2.edit_bio || !tL_businessBotRights2.edit_profile_photo || !tL_businessBotRights2.edit_username) {
                                        l0Var4.X(-14, true, new g0(l0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        l0Var4.c.V2.N(true);
                                        l0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var5.G;
                                    if (!tL_businessBotRights3.view_gifts || !tL_businessBotRights3.sell_gifts || !tL_businessBotRights3.change_gift_settings || !tL_businessBotRights3.transfer_and_upgrade_gifts || !tL_businessBotRights3.transfer_stars) {
                                        l0Var5.X(-17, true, new g0(l0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        l0Var5.c.V2.N(true);
                                        l0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l0 l0Var6 = l0Var;
                                    l0Var6.G.manage_stories = !r0.manage_stories;
                                    l0Var6.c.V2.N(true);
                                    l0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList5.add(h51Var3);
                    w51Var3.T();
                    str2 = "";
                } else {
                    w51Var3.U();
                    arrayList5.add(h51.k(l0Var.e));
                    longSparseArray.clear();
                    int i17 = 0;
                    boolean z11 = false;
                    while (i17 < l0Var.d.d.size()) {
                        TLObject tLObject = (TLObject) l0Var.d.d.get(i17);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                str3 = str4;
                                long j13 = user.id;
                                String str6 = l0Var.y;
                                h51 h51Var4 = new h51(13);
                                h51Var4.x = j13;
                                h51Var4.n = str6;
                                arrayList5.add(h51Var4);
                                longSparseArray.put(user.id, user);
                                z11 = true;
                                i17++;
                                str4 = str3;
                            }
                        }
                        str3 = str4;
                        i17++;
                        str4 = str3;
                    }
                    str2 = str4;
                    for (int i18 = 0; i18 < l0Var.d.e.size(); i18++) {
                        TLObject tLObject2 = (TLObject) l0Var.d.e.get(i18);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j14 = user2.id;
                                String str7 = l0Var.y;
                                h51 h51Var5 = new h51(13);
                                h51Var5.x = j14;
                                h51Var5.n = str7;
                                arrayList5.add(h51Var5);
                                longSparseArray.put(user2.id, user2);
                                z11 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(l0Var.f.getText().toString()) || l0Var.d.e() || l0Var.x)) {
                        arrayList5.add(h51.k(l0Var.n));
                        z11 = true;
                    }
                    l0Var.h.setVisibility(z11 ? 0 : 8);
                    w51Var3.T();
                }
                arrayList5.add(h51.B(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                w51Var3.U();
                h51 t6 = h51.t(LocaleController.getString(R.string.BusinessBotChats2));
                t6.g = l0Var.J != null;
                arrayList5.add(t6);
                h51 w12 = h51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                w12.K(l0Var.F);
                w12.g = l0Var.J != null;
                arrayList5.add(w12);
                h51 w13 = h51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                w13.K(!l0Var.F);
                w13.g = l0Var.J != null;
                arrayList5.add(w13);
                w51Var3.T();
                arrayList5.add(h51.B(null));
                l0Var.v.a(arrayList5, w51Var3, l0Var.J != null);
                yh.A(R.string.BusinessBotChatsInfo2, arrayList5);
                if (l0Var.J != null) {
                    w51Var3.U();
                    yh.r(R.string.BusinessBotPermissions, arrayList5);
                    String string3 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb2 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = l0Var.G;
                    sb2.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb2.append("/5");
                    h51 m9 = h51.m(-4, string3, sb2.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = l0Var.G;
                    m9.K(tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages);
                    m9.f = !l0Var.M;
                    final int i19 = 1;
                    m9.D = new View.OnClickListener() { // from class: vf.h0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i19) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.c.V2.N(true);
                                    l0Var2.Y(true);
                                    break;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var3.G;
                                    if (tL_businessBotRights3.reply && tL_businessBotRights3.read_messages && tL_businessBotRights3.delete_received_messages && tL_businessBotRights3.delete_sent_messages) {
                                        tL_businessBotRights3.delete_sent_messages = false;
                                        tL_businessBotRights3.delete_received_messages = false;
                                        tL_businessBotRights3.read_messages = false;
                                        tL_businessBotRights3.reply = false;
                                    } else {
                                        tL_businessBotRights3.delete_sent_messages = true;
                                        tL_businessBotRights3.delete_received_messages = true;
                                        tL_businessBotRights3.read_messages = true;
                                        tL_businessBotRights3.reply = true;
                                    }
                                    l0Var3.c.V2.N(true);
                                    l0Var3.Y(true);
                                    break;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = l0Var4.G;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        l0Var4.X(-14, true, new g0(l0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        l0Var4.c.V2.N(true);
                                        l0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = l0Var5.G;
                                    if (!tL_businessBotRights32.view_gifts || !tL_businessBotRights32.sell_gifts || !tL_businessBotRights32.change_gift_settings || !tL_businessBotRights32.transfer_and_upgrade_gifts || !tL_businessBotRights32.transfer_stars) {
                                        l0Var5.X(-17, true, new g0(l0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        l0Var5.c.V2.N(true);
                                        l0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l0 l0Var6 = l0Var;
                                    l0Var6.G.manage_stories = !r0.manage_stories;
                                    l0Var6.c.V2.N(true);
                                    l0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList5.add(m9);
                    if (l0Var.M) {
                        h51 y10 = h51.y(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        y10.K(true);
                        y10.g = false;
                        y10.i = 1;
                        arrayList5.add(y10);
                        h51 y11 = h51.y(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        y11.K(l0Var.G.reply);
                        y11.i = 1;
                        arrayList5.add(y11);
                        h51 y12 = h51.y(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        y12.K(l0Var.G.read_messages);
                        y12.i = 1;
                        arrayList5.add(y12);
                        h51 y13 = h51.y(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        y13.K(l0Var.G.delete_sent_messages);
                        y13.i = 1;
                        arrayList5.add(y13);
                        h51 y14 = h51.y(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        y14.K(l0Var.G.delete_received_messages);
                        y14.i = 1;
                        arrayList5.add(y14);
                    }
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var.G;
                    sb3.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb3.append("/4");
                    h51 m10 = h51.m(-10, string4, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = l0Var.G;
                    m10.K(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    m10.f = !l0Var.N;
                    final int i20 = 2;
                    m10.D = new View.OnClickListener() { // from class: vf.h0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i20) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.c.V2.N(true);
                                    l0Var2.Y(true);
                                    break;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = l0Var3.G;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    l0Var3.c.V2.N(true);
                                    l0Var3.Y(true);
                                    break;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = l0Var4.G;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        l0Var4.X(-14, true, new g0(l0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        l0Var4.c.V2.N(true);
                                        l0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = l0Var5.G;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        l0Var5.X(-17, true, new g0(l0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        l0Var5.c.V2.N(true);
                                        l0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l0 l0Var6 = l0Var;
                                    l0Var6.G.manage_stories = !r0.manage_stories;
                                    l0Var6.c.V2.N(true);
                                    l0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList5.add(m10);
                    if (l0Var.N) {
                        h51 y15 = h51.y(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        y15.K(l0Var.G.edit_name);
                        y15.i = 1;
                        arrayList5.add(y15);
                        h51 y16 = h51.y(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        y16.K(l0Var.G.edit_bio);
                        y16.i = 1;
                        arrayList5.add(y16);
                        h51 y17 = h51.y(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        y17.K(l0Var.G.edit_profile_photo);
                        y17.i = 1;
                        arrayList5.add(y17);
                        h51 y18 = h51.y(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        y18.K(l0Var.G.edit_username);
                        y18.i = 1;
                        arrayList5.add(y18);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = l0Var.G;
                    sb4.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb4.append("/5");
                    h51 m11 = h51.m(-15, string5, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = l0Var.G;
                    m11.K(tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars);
                    m11.f = !l0Var.O;
                    final int i21 = 3;
                    m11.D = new View.OnClickListener() { // from class: vf.h0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i21) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.c.V2.N(true);
                                    l0Var2.Y(true);
                                    break;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = l0Var3.G;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    l0Var3.c.V2.N(true);
                                    l0Var3.Y(true);
                                    break;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = l0Var4.G;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        l0Var4.X(-14, true, new g0(l0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        l0Var4.c.V2.N(true);
                                        l0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = l0Var5.G;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        l0Var5.X(-17, true, new g0(l0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        l0Var5.c.V2.N(true);
                                        l0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l0 l0Var6 = l0Var;
                                    l0Var6.G.manage_stories = !r0.manage_stories;
                                    l0Var6.c.V2.N(true);
                                    l0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList5.add(m11);
                    if (l0Var.O) {
                        h51 y19 = h51.y(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        y19.K(l0Var.G.view_gifts);
                        y19.i = 1;
                        arrayList5.add(y19);
                        h51 y20 = h51.y(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        y20.K(l0Var.G.sell_gifts);
                        y20.i = 1;
                        arrayList5.add(y20);
                        h51 y21 = h51.y(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        y21.K(l0Var.G.change_gift_settings);
                        y21.i = 1;
                        arrayList5.add(y21);
                        h51 y22 = h51.y(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        y22.K(l0Var.G.transfer_and_upgrade_gifts);
                        y22.i = 1;
                        arrayList5.add(y22);
                        h51 y23 = h51.y(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        y23.K(l0Var.G.transfer_stars);
                        y23.i = 1;
                        arrayList5.add(y23);
                    }
                    h51 m12 = h51.m(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), str2);
                    m12.K(l0Var.G.manage_stories);
                    final int i22 = 4;
                    m12.D = new View.OnClickListener() { // from class: vf.h0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i22) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.c.V2.N(true);
                                    l0Var2.Y(true);
                                    break;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = l0Var3.G;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    l0Var3.c.V2.N(true);
                                    l0Var3.Y(true);
                                    break;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = l0Var4.G;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        l0Var4.X(-14, true, new g0(l0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        l0Var4.c.V2.N(true);
                                        l0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = l0Var5.G;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        l0Var5.X(-17, true, new g0(l0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        l0Var5.c.V2.N(true);
                                        l0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l0 l0Var6 = l0Var;
                                    l0Var6.G.manage_stories = !r0.manage_stories;
                                    l0Var6.c.V2.N(true);
                                    l0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList5.add(m12);
                    w51Var3.T();
                    arrayList5.add(h51.A(-4, null));
                    arrayList5.add(h51.A(-5, null));
                    arrayList5.add(h51.A(-6, null));
                    arrayList5.add(h51.A(-7, null));
                    break;
                }
                break;
            case 20:
                vf.n0.U((vf.n0) this.b, (ArrayList) obj, (w51) obj2);
                break;
            case 21:
                vf.v0 v0Var = (vf.v0) this.b;
                ArrayList arrayList6 = (ArrayList) obj;
                String string6 = LocaleController.getString(R.string.BusinessLocation);
                String string7 = LocaleController.getString(R.string.BusinessLocationInfo);
                int i23 = R.raw.biz_map;
                h51 h51Var6 = new h51(2);
                h51Var6.l = string6;
                h51Var6.o = string7;
                h51Var6.k = i23;
                arrayList6.add(h51Var6);
                arrayList6.add(h51.k(v0Var.e));
                arrayList6.add(h51.B(null));
                h51 i24 = h51.i(1, LocaleController.getString(R.string.BusinessLocationMap));
                i24.K(v0Var.x != null);
                arrayList6.add(i24);
                if (v0Var.x != null) {
                    arrayList6.add(h51.k(v0Var.h));
                }
                arrayList6.add(h51.B(null));
                if (v0Var.w != null && (v0Var.x != null || !TextUtils.isEmpty(v0Var.y))) {
                    z10 = true;
                }
                v0Var.D = z10;
                if (z10) {
                    h51 e6 = h51.e(2, LocaleController.getString(R.string.BusinessLocationClear));
                    e6.r = true;
                    arrayList6.add(e6);
                    arrayList6.add(h51.B(null));
                }
                v0Var.U(true);
                break;
            case 22:
                vf.x0.V((vf.x0) this.b, (ArrayList) obj);
                break;
            case 23:
                vf.z0 z0Var = (vf.z0) this.b;
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = z0Var.b;
                String string8 = LocaleController.getString(R.string.BusinessHoursDayOpen);
                h51 h51Var7 = new h51(9);
                h51Var7.d = -1;
                h51Var7.l = string8;
                h51Var7.K(z0Var.r);
                arrayList7.add(h51Var7);
                arrayList7.add(h51.B(null));
                if (z0Var.r) {
                    for (int i25 = 0; i25 < arrayList8.size(); i25++) {
                        if (i25 > 0) {
                            arrayList7.add(h51.B(null));
                        }
                        vf.w0 w0Var = (vf.w0) arrayList8.get(i25);
                        if (!z0Var.U()) {
                            int i26 = i25 * 3;
                            arrayList7.add(h51.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), vf.w0.a(w0Var.a), i26));
                            arrayList7.add(h51.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), vf.w0.a(w0Var.b), i26 + 1));
                            h51 e10 = h51.e(i26 + 2, LocaleController.getString(R.string.Remove));
                            e10.r = true;
                            arrayList7.add(e10);
                        }
                    }
                    if (z0Var.V()) {
                        arrayList7.add(h51.B(null));
                        h51 c10 = h51.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                        c10.q = true;
                        arrayList7.add(c10);
                    }
                    yh.A(R.string.BusinessHoursDayInfo, arrayList7);
                    break;
                }
                break;
            case 24:
                vf.r1.V((vf.r1) this.b, (ArrayList) obj, (w51) obj2);
                break;
            case 25:
                vh.a aVar = (vh.a) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                arrayList9.add(h51.D(0, AndroidUtilities.dp(12.0f)));
                arrayList9.add(h51.j(1, aVar.W));
                arrayList9.add(h51.D(2, AndroidUtilities.dp(12.0f)));
                arrayList9.add(h51.s(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
                aVar.Z = arrayList9.size();
                String string9 = LocaleController.getString(R.string.CommunityChatVisibilityVisible);
                boolean z12 = aVar.Y;
                h51 x10 = h51.x(151, string9, LocaleController.getString(z12 ? R.string.CommunityChatVisibilityVisibleBotInfo : R.string.CommunityChatVisibilityVisibleInfo));
                x10.K(!aVar.V);
                arrayList9.add(x10);
                h51 x11 = h51.x(ImageReceiver.DEFAULT_CROSSFADE_DURATION, LocaleController.getString(R.string.CommunityChatVisibilityHidden), LocaleController.getString(z12 ? R.string.CommunityChatVisibilityHiddenBotInfo : R.string.CommunityChatVisibilityHiddenInfo));
                x11.K(aVar.V);
                arrayList9.add(x11);
                arrayList9.add(h51.A(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
                break;
            case 26:
                ((ArrayList) obj).add(h51.j(0, ((vh.b) this.b).U));
                break;
            case 27:
                Utilities.themeQueue.postRunnable(new vf.k0(r13, (String[]) this.b, (Utilities.Callback2) obj2));
                break;
            case 28:
                wh.w wVar = (wh.w) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                arrayList10.add(h51.j(1, wVar.X));
                arrayList10.add(h51.j(3, wVar.a0));
                if (wVar.f0 != null) {
                    arrayList10.add(h51.j(2, wVar.Y));
                    break;
                }
                break;
            default:
                wh.r3.H1((wh.r3[]) this.b, (ArrayList) obj, (w51) obj2);
                break;
        }
    }
}
