package org.telegram.ui;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class yb0 {
    public final LaunchActivity a;
    public final int b;
    public final ze.c c;
    public final boolean d;
    public org.telegram.ui.ActionBar.d2 e;
    public boolean f;
    public boolean g;
    public int h = -1;

    public yb0(LaunchActivity launchActivity, int i10, ze.c cVar, boolean z4) {
        this.a = launchActivity;
        this.b = i10;
        this.c = cVar;
        this.d = z4;
    }

    public static org.telegram.ui.Components.qc b() {
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        return U == null ? org.telegram.ui.Components.qc.X() : org.telegram.ui.Components.qc.a0(U);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0144, code lost:
    
        if (r1.equals("joinchat") != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x003d, code lost:
    
        if (r2.equals("http") != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0154 A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:6:0x0004, B:9:0x000f, B:12:0x0016, B:20:0x002b, B:23:0x003f, B:26:0x0046, B:28:0x0060, B:30:0x0068, B:33:0x0072, B:36:0x0083, B:38:0x008f, B:39:0x0092, B:41:0x0098, B:43:0x009f, B:46:0x00aa, B:48:0x00b0, B:51:0x00bd, B:52:0x00c1, B:54:0x0147, B:57:0x0154, B:61:0x00c6, B:65:0x00d0, B:68:0x00da, B:71:0x00e4, B:74:0x00ed, B:77:0x00f6, B:80:0x00ff, B:83:0x0108, B:86:0x0111, B:89:0x011a, B:92:0x0123, B:95:0x012c, B:98:0x0135, B:101:0x013e, B:103:0x015e, B:105:0x0164, B:107:0x0037, B:109:0x0170, B:111:0x0178, B:113:0x0180, B:115:0x0188), top: B:5:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean l(String str) {
        Uri parse;
        String scheme;
        String path;
        String str2;
        if (str == null) {
            return false;
        }
        try {
            parse = Uri.parse(str);
            scheme = parse.getScheme();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (scheme == null || (path = parse.getPath()) == null) {
            return false;
        }
        int hashCode = scheme.hashCode();
        if (hashCode != 3699) {
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && scheme.equals("https")) {
                }
            }
            if (path.isEmpty()) {
                return false;
            }
            String lowerCase = parse.getHost().toLowerCase();
            boolean find = LaunchActivity.y1.matcher(lowerCase).find();
            if (lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog") || find) {
                ArrayList arrayList = new ArrayList(parse.getPathSegments());
                if (arrayList.size() > 0 && ((String) arrayList.get(0)).equals("s")) {
                    arrayList.remove(0);
                }
                if (arrayList.size() <= 0 || (arrayList.size() >= 3 && "s".equals(arrayList.get(1)))) {
                    return false;
                }
                if (arrayList.size() > 1) {
                    String str3 = (String) arrayList.get(0);
                    if (TextUtils.isEmpty(str3)) {
                        return false;
                    }
                    switch (str3.hashCode()) {
                        case -1401304190:
                            break;
                        case -1268966290:
                            if (str3.equals("folder")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2) && !str2.matches("^\\d+$")) {
                            }
                            break;
                        case -1230486459:
                            if (str3.equals("addemoji")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                                break;
                            }
                            break;
                        case -1216792120:
                            if (str3.equals("addtheme")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        case -1147866945:
                            if (str3.equals("addlist")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        case 99:
                            if (str3.equals("c")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        case 108417:
                            if (str3.equals("msg")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        case 93922211:
                            if (str3.equals("boost")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        case 103149417:
                            if (str3.equals("login")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        case 109400031:
                            if (str3.equals("share")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        case 311086522:
                            if (str3.equals("setlanguage")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        case 492791415:
                            if (str3.equals("addstickers")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        case 951526432:
                            if (str3.equals("contact")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        case 2112655022:
                            if (str3.equals("confirmphone")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        default:
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                    }
                    return false;
                }
                if (arrayList.size() == 1) {
                    return !TextUtils.isEmpty(parse.getQueryParameter("startapp"));
                }
            }
        } else if (scheme.equals("tg") && (str.startsWith("tg:resolve") || str.startsWith("tg://resolve"))) {
            return !TextUtils.isEmpty(parse.getQueryParameter("appname"));
        }
        return false;
    }

    public final void a() {
        if (this.g) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.e;
        if (d2Var != null) {
            d2Var.dismiss();
        }
        ze.c cVar = this.c;
        if (cVar != null) {
            cVar.b();
        }
        this.g = true;
    }

    public final org.telegram.ui.ActionBar.e5 c() {
        return this.a.O();
    }

    public final UserConfig d() {
        return UserConfig.getInstance(this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v23, types: [int] */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r2v25, types: [ph.f7, ph.w8] */
    public final boolean e(Uri uri) {
        String scheme;
        String schemeSpecificPart;
        if (uri != null) {
            String scheme2 = uri.getScheme();
            boolean equalsIgnoreCase = "tonsite".equalsIgnoreCase(scheme2);
            LaunchActivity launchActivity = this.a;
            if (equalsIgnoreCase) {
                ze.d.p(launchActivity, uri, true, true);
                return true;
            }
            if ("http".equalsIgnoreCase(scheme2) || "https".equalsIgnoreCase(scheme2)) {
                String host = uri.getHost();
                if (host != null) {
                    Matcher matcher = LaunchActivity.y1.matcher(host.toLowerCase());
                    boolean find = matcher.find();
                    if ("telegram.me".equalsIgnoreCase(host) || "t.me".equalsIgnoreCase(host) || "telegram.dog".equalsIgnoreCase(host) || find) {
                        if (find) {
                            StringBuilder sb = new StringBuilder("https://t.me/");
                            sb.append(matcher.group(1));
                            String str = "";
                            sb.append(TextUtils.isEmpty(uri.getPath()) ? "" : uri.getPath());
                            if (!TextUtils.isEmpty(uri.getQuery())) {
                                str = "?" + uri.getQuery();
                            }
                            sb.append(str);
                            uri = Uri.parse(sb.toString());
                        }
                        String path = uri.getPath();
                        if (path != null && path.length() > 1) {
                            String substring = path.substring(1);
                            List<String> pathSegments = uri.getPathSegments();
                            if (pathSegments != null && !pathSegments.isEmpty()) {
                                String str2 = pathSegments.get(0);
                                String str3 = pathSegments.size() > 1 ? pathSegments.get(1) : null;
                                if ("$".equalsIgnoreCase(str2)) {
                                    return g(substring.substring(1));
                                }
                                if ("invoice".equalsIgnoreCase(str2)) {
                                    return g(str3);
                                }
                                if ("addstyle".equalsIgnoreCase(str2)) {
                                    return f(str3);
                                }
                                if ("oauth".equalsIgnoreCase(str2)) {
                                    return i(uri, uri.getQueryParameter("startapp"));
                                }
                                if ("newbot".equalsIgnoreCase(str2)) {
                                    if (pathSegments.size() >= 2) {
                                        h(str3, pathSegments.size() >= 3 ? pathSegments.get(2) : null, uri.getQueryParameter("name"));
                                        return true;
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else if ("tg".equalsIgnoreCase(scheme2)) {
                if (uri.isOpaque() && (scheme = uri.getScheme()) != null && uri.getAuthority() == null && (schemeSpecificPart = uri.getSchemeSpecificPart()) != null) {
                    uri = Uri.parse(scheme + "://" + schemeSpecificPart);
                }
                List<String> pathSegments2 = uri.getPathSegments();
                if (pathSegments2 != null) {
                    ArrayList arrayList = new ArrayList(pathSegments2);
                    String authority = uri.getAuthority();
                    if (!TextUtils.isEmpty(authority)) {
                        arrayList.add(0, authority);
                    }
                    if (!arrayList.isEmpty()) {
                        String str4 = (String) arrayList.get(0);
                        String str5 = arrayList.size() > 1 ? (String) arrayList.get(1) : null;
                        if ("newbot".equalsIgnoreCase(str4)) {
                            h(uri.getQueryParameter("manager"), uri.getQueryParameter("username"), uri.getQueryParameter("name"));
                            return true;
                        }
                        if ("resolve".equalsIgnoreCase(str4)) {
                            List<String> pathSegments3 = uri.getPathSegments();
                            if (pathSegments3 != null) {
                                ArrayList arrayList2 = new ArrayList(pathSegments3);
                                String authority2 = uri.getAuthority();
                                if (!TextUtils.isEmpty(authority2)) {
                                    arrayList2.add(0, authority2);
                                }
                                if (!arrayList2.isEmpty()) {
                                    arrayList2.remove(0);
                                    String queryParameter = uri.getQueryParameter("domain");
                                    String queryParameter2 = uri.getQueryParameter("startapp");
                                    if ("oauth".equalsIgnoreCase(queryParameter) && !TextUtils.isEmpty(queryParameter2)) {
                                        return i(uri, queryParameter2);
                                    }
                                }
                            }
                        } else {
                            if ("invoice".equalsIgnoreCase(str4)) {
                                return g(uri.getQueryParameter("slug"));
                            }
                            if ("oauth".equalsIgnoreCase(str4)) {
                                return i(uri, uri.getQueryParameter("token"));
                            }
                            if ("settings".equalsIgnoreCase(str4)) {
                                return j(arrayList.subList(1, arrayList.size()));
                            }
                            if ("chats".equalsIgnoreCase(str4)) {
                                "search".equalsIgnoreCase(str5);
                                "edit".equalsIgnoreCase(str5);
                                "emoji-status".equalsIgnoreCase(str5);
                            }
                            if ("new".equalsIgnoreCase(str4)) {
                                if ("group".equalsIgnoreCase(str5)) {
                                    n(new a70(new Bundle()), false);
                                    return true;
                                }
                                if ("contact".equalsIgnoreCase(str5)) {
                                    new uj0(launchActivity, LaunchActivity.U()).show();
                                    return true;
                                }
                                if (!"channel".equalsIgnoreCase(str5)) {
                                    n(new ContactsActivity(android.support.v4.media.a.i("destroyAfterSelect", true)), false);
                                    return true;
                                }
                                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                                if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                                    n(new pd(android.support.v4.media.a.h(0, "step")), false);
                                    return true;
                                }
                                n(new i(0), false);
                                globalMainSettings.edit().putBoolean("channel_intro", true).commit();
                                return true;
                            }
                            if ("post".equalsIgnoreCase(str4)) {
                                ?? r15 = MediaStreamTrack.VIDEO_TRACK_KIND.equalsIgnoreCase(str5);
                                if ("live".equalsIgnoreCase(str5)) {
                                    r15 = -1;
                                }
                                ph.da E = ph.da.E(launchActivity, this.b);
                                if (E.L1 != r15) {
                                    E.L1 = r15;
                                    ?? r22 = E.N0;
                                    if (r22 != 0) {
                                        r22.a(r15);
                                    }
                                    E.i0(r15 == 1, true);
                                    ph.u uVar = E.F0;
                                    if (uVar != null) {
                                        uVar.a(false, true);
                                    }
                                    E.m0(false);
                                }
                                E.R(null);
                                return true;
                            }
                            if ("contacts".equalsIgnoreCase(str4)) {
                                if ("new".equalsIgnoreCase(str5)) {
                                    new uj0(launchActivity, LaunchActivity.U()).show();
                                    return true;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("needPhonebook", true);
                                bundle.putBoolean("needFinishFragment", true);
                                n(new ContactsActivity(bundle), false);
                                "search".equalsIgnoreCase(str5);
                                "sort".equalsIgnoreCase(str5);
                                if ("invite".equalsIgnoreCase(str5)) {
                                    o("phonebookRow");
                                    return true;
                                }
                                return true;
                            }
                            if ("addstyle".equalsIgnoreCase(str4)) {
                                return f(uri.getQueryParameter("slug"));
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        TL_aicompose.getTone gettone = new TL_aicompose.getTone();
        TL_aicompose.inputAiComposeToneSlug inputaicomposetoneslug = new TL_aicompose.inputAiComposeToneSlug();
        inputaicomposetoneslug.slug = str;
        gettone.tone = inputaicomposetoneslug;
        k();
        ConnectionsManager.getInstance(this.b).sendRequestTyped(gettone, new org.telegram.messenger.a(), new f5(this, 14));
        return true;
    }

    public final boolean g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        k();
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
        tL_inputInvoiceSlug.slug = str;
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
        this.h = ConnectionsManager.getInstance(this.b).sendRequest(tL_payments_getPaymentForm, new da((Object) this, (TLObject) tL_inputInvoiceSlug, str, 18));
        return true;
    }

    public final void h(String str, String str2, String str3) {
        TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot = new TLRPC.TL_requestPeerTypeCreateBot();
        tL_requestPeerTypeCreateBot.bot_managed = true;
        if (!TextUtils.isEmpty(str3)) {
            tL_requestPeerTypeCreateBot.flags |= 2;
            tL_requestPeerTypeCreateBot.suggested_name = str3;
        }
        if (!TextUtils.isEmpty(str2)) {
            tL_requestPeerTypeCreateBot.flags |= 4;
            tL_requestPeerTypeCreateBot.suggested_username = str2;
        }
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null || U.getContext() == null) {
            return;
        }
        k();
        TLRPC.User[] userArr = {null};
        MessagesController.getInstance(this.b).getUserNameResolver().resolve(str, new lh(this, userArr, new c30(this, U, userArr, tL_requestPeerTypeCreateBot, 6), 3));
    }

    public final boolean i(Uri uri, String str) {
        if (!this.d) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        k();
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
        tL_messages_requestUrlAuth.flags |= 4;
        tL_messages_requestUrlAuth.url = uri.toString();
        ConnectionsManager.getInstance(this.b).sendRequestTyped(tL_messages_requestUrlAuth, new org.telegram.messenger.a(), new dh.v(21, this, tL_messages_requestUrlAuth));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:603:0x0a74  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0a81  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0a99  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0aa6  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0ab3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(List list) {
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.p2 U;
        xg0 xg0Var;
        ApplicationLoader applicationLoader;
        org.telegram.ui.ActionBar.p2 openSettings;
        if (list == null) {
            return false;
        }
        if (list.isEmpty()) {
            m(new w81());
            return true;
        }
        String str = (String) list.get(0);
        String str2 = list.size() > 1 ? (String) list.get(1) : null;
        String str3 = list.size() > 2 ? (String) list.get(2) : null;
        String str4 = list.size() > 3 ? (String) list.get(3) : null;
        String str5 = list.size() > 4 ? (String) list.get(4) : null;
        if ("theme".equalsIgnoreCase(str) || "themes".equalsIgnoreCase(str)) {
            m(new ThemeActivity(0));
            return true;
        }
        if ("devices".equalsIgnoreCase(str)) {
            SessionsActivity sessionsActivity = new SessionsActivity(0);
            if ("link-desktop".equalsIgnoreCase(str2)) {
                sessionsActivity.l0();
            }
            m(sessionsActivity);
            if ("terminate-sessions".equalsIgnoreCase(str2)) {
                o("terminateAllSessionsRow");
            }
            if ("auto-terminate".equalsIgnoreCase(str2)) {
                o("ttlRow");
                return true;
            }
        } else if ("folders".equalsIgnoreCase(str)) {
            FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
            m(new FiltersSetupActivity());
            if ("create".equalsIgnoreCase(str2)) {
                AndroidUtilities.runOnUIThread(new w10(this, filtersSetupActivity), 300L);
            }
            if ("show-tags".equalsIgnoreCase(str2)) {
                o("showTagsRow");
                return true;
            }
        } else {
            if ("change_number".equalsIgnoreCase(str)) {
                n(new i(3), true);
                return true;
            }
            if ("language".equalsIgnoreCase(str)) {
                if ("do-not-translate".equalsIgnoreCase(str2)) {
                    m(new t31());
                    return true;
                }
                m(new LanguageSelectActivity());
                if ("show-button".equalsIgnoreCase(str2)) {
                    o("manualTranslationPosition");
                }
                if ("translate-chats".equalsIgnoreCase(str2)) {
                    o("autoTranslationPosition");
                    return true;
                }
            } else {
                if ("auto_delete".equalsIgnoreCase(str)) {
                    m(new u4());
                    return true;
                }
                if ("phone_privacy".equalsIgnoreCase(str)) {
                    m(new PrivacyControlActivity(6));
                    return true;
                }
                if ("premium_sms".equalsIgnoreCase(str) && (applicationLoader = ApplicationLoader.applicationLoaderInstance) != null && (openSettings = applicationLoader.openSettings(13)) != null) {
                    m(openSettings);
                    return true;
                }
                boolean equalsIgnoreCase = "login_email".equalsIgnoreCase(str);
                int i13 = this.b;
                if (equalsIgnoreCase) {
                    k();
                    this.h = ConnectionsManager.getInstance(i13).sendRequest(new TL_account.getPassword(), new o(this, 10), 10);
                    return true;
                }
                if ("chats".equalsIgnoreCase(str)) {
                    org.telegram.ui.ActionBar.e5 c3 = c();
                    int size = c3.getFragmentStack().size() - 1;
                    while (true) {
                        if (size < 0) {
                            xg0Var = null;
                            break;
                        }
                        if (c3.getFragmentStack().get(size) instanceof xg0) {
                            xg0Var = (xg0) c3.getFragmentStack().get(size);
                            break;
                        }
                        if (size > 0) {
                            ((ActionBarLayout) c3).Y(size);
                        }
                        size++;
                    }
                    if (xg0Var != null && "search".equalsIgnoreCase(str2)) {
                        xg0Var.c.D(2);
                        return true;
                    }
                }
                if ("saved-messages".equalsIgnoreCase(str)) {
                    m(zn.R9(d().getClientUserId()));
                    return true;
                }
                if ("calls".equalsIgnoreCase(str)) {
                    if ("start-call".equalsIgnoreCase(str2)) {
                        m(new vb0(this, android.support.v4.media.a.i("isCall", true)));
                        return true;
                    }
                    m(new n9());
                    return true;
                }
                if ("qr-code".equalsIgnoreCase(str)) {
                    if ("scan".equalsIgnoreCase(str2) && (U = LaunchActivity.U()) != null) {
                        u21.f0(U);
                        return true;
                    }
                    if ("share".equalsIgnoreCase(str2)) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", d().getClientUserId());
                        m(new wb0(bundle));
                        return true;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", d().getClientUserId());
                    m(new u21(bundle2));
                    return true;
                }
                if (!"chat".equalsIgnoreCase(str) || !"browser".equalsIgnoreCase(str2)) {
                    String str6 = str5;
                    if (!"edit".equalsIgnoreCase(str)) {
                        if ("my-profile".equalsIgnoreCase(str)) {
                            if ("edit".equalsIgnoreCase(str2)) {
                                m(new UserInfoActivity());
                                return true;
                            }
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("user_id", d().getClientUserId());
                            bundle3.putBoolean("my_profile", true);
                            if ("gifts".equalsIgnoreCase(str2)) {
                                bundle3.putBoolean("open_gifts", true);
                            }
                            ProfileActivity profileActivity = new ProfileActivity(bundle3);
                            if ("gifts".equalsIgnoreCase(str2)) {
                                profileActivity.whenFullyVisible(new qb0(profileActivity, 2));
                            }
                            if ("posts".equalsIgnoreCase(str2)) {
                                profileActivity.whenFullyVisible(new qb0(profileActivity, 3));
                            }
                            m(profileActivity);
                            return true;
                        }
                        String str7 = str3;
                        if ("notifications".equalsIgnoreCase(str)) {
                            if (!TextUtils.isEmpty(str7) && ("private-chats".equalsIgnoreCase(str2) || "groups".equalsIgnoreCase(str2) || "channels".equalsIgnoreCase(str2) || "stories".equalsIgnoreCase(str2) || "reactions".equalsIgnoreCase(str2))) {
                                if ("private-chats".equalsIgnoreCase(str2)) {
                                    i12 = 1;
                                } else {
                                    if (!"groups".equalsIgnoreCase(str2)) {
                                        if ("channels".equalsIgnoreCase(str2)) {
                                            i12 = 2;
                                        } else if ("stories".equalsIgnoreCase(str2)) {
                                            i12 = 3;
                                        } else if ("reactions".equalsIgnoreCase(str2)) {
                                            i12 = 4;
                                        }
                                    }
                                    i12 = 0;
                                }
                                NotificationsSettingsActivity notificationsSettingsActivity = new NotificationsSettingsActivity();
                                k();
                                notificationsSettingsActivity.A0(new et(this, notificationsSettingsActivity, i12, str7, 3));
                                return true;
                            }
                            m(new NotificationsSettingsActivity());
                            if ("accounts".equalsIgnoreCase(str2)) {
                                o("accountsAllRow");
                            }
                            if ("private-chats".equalsIgnoreCase(str2)) {
                                o("privateRow");
                            }
                            if ("groups".equalsIgnoreCase(str2)) {
                                o("groupRow");
                            }
                            if ("channels".equalsIgnoreCase(str2)) {
                                o("channelsRow");
                            }
                            if ("stories".equalsIgnoreCase(str2)) {
                                o("storiesRow");
                            }
                            if ("reactions".equalsIgnoreCase(str2)) {
                                o("reactionsRow");
                            }
                            if ("in-app-sounds".equalsIgnoreCase(str2)) {
                                o("inappSoundRow");
                            }
                            if ("in-app-vibrate".equalsIgnoreCase(str2)) {
                                o("inappVibrateRow");
                            }
                            if ("in-app-preview".equalsIgnoreCase(str2)) {
                                o("inappPreviewRow");
                            }
                            if ("in-chat-sounds".equalsIgnoreCase(str2)) {
                                o("inchatSoundRow");
                            }
                            if ("in-app-popup".equalsIgnoreCase(str2)) {
                                o("inappPriorityRow");
                            }
                            if ("show-badge-icon".equalsIgnoreCase(str2)) {
                                o("badgeNumberShowRow");
                            }
                            if ("include-muted-chats".equalsIgnoreCase(str2)) {
                                o("badgeNumberMutedRow");
                            }
                            if ("count-unread-messages".equalsIgnoreCase(str2)) {
                                o("badgeNumberMessagesRow");
                            }
                            if ("new-contacts".equalsIgnoreCase(str2)) {
                                o("contactJoinedRow");
                            }
                            if ("pinned-messages".equalsIgnoreCase(str2)) {
                                o("pinnedMessageRow");
                            }
                            if ("reset".equalsIgnoreCase(str2)) {
                                o("resetNotificationsRow");
                                return true;
                            }
                        } else if ("privacy".equalsIgnoreCase(str)) {
                            if ("data-settings".equalsIgnoreCase(str2) && "delete-cloud-drafts".equalsIgnoreCase(str7)) {
                                m(new DataSettingsActivity());
                                o("clearDraftsRow");
                                return true;
                            }
                            if (!TextUtils.isEmpty(str7) && "blocked".equalsIgnoreCase(str2)) {
                                m(new tx0());
                                return true;
                            }
                            if (!TextUtils.isEmpty(str7) && "active-websites".equalsIgnoreCase(str2)) {
                                m(new SessionsActivity(1));
                                if ("disconnect-all".equalsIgnoreCase(str7)) {
                                    o("terminateAllSessionsRow");
                                    return true;
                                }
                            } else if (!TextUtils.isEmpty(str7) && "passcode".equalsIgnoreCase(str2)) {
                                sb0 sb0Var = new sb0(this, str7, 1);
                                org.telegram.ui.ActionBar.p2 b02 = PasscodeActivity.b0();
                                m(b02);
                                if (b02 instanceof i) {
                                    ((i) b02).a0(sb0Var);
                                    return true;
                                }
                                if (b02 instanceof PasscodeActivity) {
                                    ((PasscodeActivity) b02).j0(sb0Var);
                                    return true;
                                }
                            } else {
                                if (!TextUtils.isEmpty(str7) && "2sv".equalsIgnoreCase(str2)) {
                                    k();
                                    this.h = ConnectionsManager.getInstance(i13).sendRequest(new TL_account.getPassword(), new no(28, this, str7), 10);
                                    return true;
                                }
                                if (!TextUtils.isEmpty(str7) && "passkey".equalsIgnoreCase(str2) && Build.VERSION.SDK_INT >= 28) {
                                    k();
                                    this.h = ConnectionsManager.getInstance(i13).sendRequestTyped(new TL_account.getPasskeys(), new tb0(0), new dh.v(20, this, str7));
                                    return true;
                                }
                                if (!TextUtils.isEmpty(str7) && "auto-delete".equalsIgnoreCase(str2) && d().getGlobalTTl() >= 0) {
                                    m(new u4());
                                    return true;
                                }
                                if (!TextUtils.isEmpty(str7) && ("phone-number".equalsIgnoreCase(str2) || "last-seen".equalsIgnoreCase(str2) || "profile-photos".equalsIgnoreCase(str2) || "bio".equalsIgnoreCase(str2) || "gifts".equalsIgnoreCase(str2) || "birthday".equalsIgnoreCase(str2) || "saved-music".equalsIgnoreCase(str2) || "forwards".equalsIgnoreCase(str2) || "calls".equalsIgnoreCase(str2) || "voice".equalsIgnoreCase(str2) || "messages".equalsIgnoreCase(str2) || "invites".equalsIgnoreCase(str2))) {
                                    if ("phone-number".equalsIgnoreCase(str2)) {
                                        i11 = 6;
                                    } else {
                                        if (!"last-seen".equalsIgnoreCase(str2)) {
                                            if ("profile-photos".equalsIgnoreCase(str2)) {
                                                i11 = 4;
                                            } else if ("bio".equalsIgnoreCase(str2)) {
                                                i11 = 9;
                                            } else if ("gifts".equalsIgnoreCase(str2)) {
                                                i11 = 12;
                                            } else if ("birthday".equalsIgnoreCase(str2)) {
                                                i11 = 11;
                                            } else if ("saved-music".equalsIgnoreCase(str2)) {
                                                i11 = 14;
                                            } else if ("forwards".equalsIgnoreCase(str2)) {
                                                i11 = 5;
                                            } else if ("calls".equalsIgnoreCase(str2)) {
                                                i11 = "p2p".equalsIgnoreCase(str7) ? 3 : 2;
                                            } else if ("voice".equalsIgnoreCase(str2)) {
                                                i11 = 8;
                                            } else if ("messages".equalsIgnoreCase(str2)) {
                                                i11 = 10;
                                            } else if ("invites".equalsIgnoreCase(str2)) {
                                                i11 = 1;
                                            }
                                        }
                                        i11 = 0;
                                    }
                                    m(new PrivacyControlActivity(i11));
                                    if ("birthday".equalsIgnoreCase(str2) && "add".equalsIgnoreCase(str7)) {
                                        o("setBirthdayRow");
                                    }
                                    if ("always-share".equalsIgnoreCase(str7) || "always-share".equalsIgnoreCase(str4) || "always".equalsIgnoreCase(str7) || "always".equalsIgnoreCase(str4)) {
                                        o("everybodyRow");
                                    }
                                    if ("never-share".equalsIgnoreCase(str7) || "never-share".equalsIgnoreCase(str4) || "never".equalsIgnoreCase(str7) || "never".equalsIgnoreCase(str4)) {
                                        o("nobodyRow");
                                    }
                                    if ("gifts".equalsIgnoreCase(str2) && "show-icon".equalsIgnoreCase(str7)) {
                                        o("showGiftIconRow");
                                    }
                                    if ("gifts".equalsIgnoreCase(str2) && "accepted-types".equalsIgnoreCase(str7)) {
                                        o("giftTypesHeaderRow");
                                    }
                                    if ("messages".equalsIgnoreCase(str2) && "set-price".equalsIgnoreCase(str7)) {
                                        o("priceRow");
                                    }
                                    if ("messages".equalsIgnoreCase(str2) && "remove-fee".equalsIgnoreCase(str7)) {
                                        o("alwaysShareRow");
                                    }
                                    if ("last-seen".equalsIgnoreCase(str2) && "hide-read-time".equalsIgnoreCase(str7)) {
                                        o("readRow");
                                    }
                                    if ("profile-photos".equalsIgnoreCase(str2)) {
                                        if ("set-public".equalsIgnoreCase(str7)) {
                                            o("photoForRestRow");
                                        }
                                        if ("update-public".equalsIgnoreCase(str7)) {
                                            o("photoForRestRow");
                                        }
                                        if ("remove-public".equalsIgnoreCase(str7)) {
                                            o("currentPhotoForRestRow");
                                            return true;
                                        }
                                    }
                                } else if (MessagesController.getInstance(i13).autoarchiveAvailable || !"archive-and-mute".equalsIgnoreCase(str2)) {
                                    m(new PrivacySettingsActivity());
                                    if ("blocked".equalsIgnoreCase(str2)) {
                                        o("blockedRow");
                                    }
                                    if ("active-websites".equalsIgnoreCase(str2)) {
                                        o("webSessionsRow");
                                    }
                                    if ("passcode".equalsIgnoreCase(str2)) {
                                        o("passcodeRow");
                                    }
                                    if ("2sv".equalsIgnoreCase(str2)) {
                                        o("passwordRow");
                                    }
                                    if ("passkey".equalsIgnoreCase(str2)) {
                                        o("passkeysRow");
                                    }
                                    if ("auto-delete".equalsIgnoreCase(str2)) {
                                        o("autoDeleteMesages");
                                    }
                                    if ("login-email".equalsIgnoreCase(str2)) {
                                        o("emailLoginRow");
                                    }
                                    if ("phone-number".equalsIgnoreCase(str2)) {
                                        o("phoneNumberRow");
                                    }
                                    if ("last-seen".equalsIgnoreCase(str2)) {
                                        o("lastSeenRow");
                                    }
                                    if ("profile-photos".equalsIgnoreCase(str2)) {
                                        o("profilePhotoRow");
                                    }
                                    if ("bio".equalsIgnoreCase(str2)) {
                                        o("bioRow");
                                    }
                                    if ("gifts".equalsIgnoreCase(str2)) {
                                        o("giftsRow");
                                    }
                                    if ("birthday".equalsIgnoreCase(str2)) {
                                        o("birthdayRow");
                                    }
                                    if ("saved-music".equalsIgnoreCase(str2)) {
                                        o("musicRow");
                                    }
                                    if ("forwards".equalsIgnoreCase(str2)) {
                                        o("forwardsRow");
                                    }
                                    if ("calls".equalsIgnoreCase(str2)) {
                                        o("callsRow");
                                    }
                                    if ("voice".equalsIgnoreCase(str2)) {
                                        o("voicesRow");
                                    }
                                    if ("messages".equalsIgnoreCase(str2)) {
                                        o("noncontactsRow");
                                    }
                                    if ("invites".equalsIgnoreCase(str2)) {
                                        o("groupsRow");
                                    }
                                    if ("self-destruct".equalsIgnoreCase(str2)) {
                                        o("deleteAccountRow");
                                    }
                                    if ("archive-and-mute".equalsIgnoreCase(str2)) {
                                        o("newChatsRow");
                                    }
                                    if ("data-settings".equalsIgnoreCase(str2)) {
                                        if ("sync-contacts".equalsIgnoreCase(str7)) {
                                            o("contactsSyncRow");
                                        }
                                        if ("delete-synced".equalsIgnoreCase(str7)) {
                                            o("contactsDeleteRow");
                                        }
                                        if ("suggest-contacts".equalsIgnoreCase(str7)) {
                                            o("contactsSuggestRow");
                                        }
                                        if ("clear-payment-info".equalsIgnoreCase(str7)) {
                                            o("paymentsClearRow");
                                        }
                                        if ("link-previews".equalsIgnoreCase(str7)) {
                                            o("secretWebpageRow");
                                        }
                                        if ("map-provider".equalsIgnoreCase(str7)) {
                                            o("secretMapRow");
                                            return true;
                                        }
                                    }
                                }
                            }
                        } else if ("data".equalsIgnoreCase(str)) {
                            if ("storage".equalsIgnoreCase(str2)) {
                                "clear-cache".equalsIgnoreCase(str7);
                                m(new d7());
                                return true;
                            }
                            if ("usage".equalsIgnoreCase(str2)) {
                                zu zuVar = new zu();
                                m(zuVar);
                                if ("mobile".equalsIgnoreCase(str7)) {
                                    zuVar.b.d(1, 1);
                                }
                                if ("wifi".equalsIgnoreCase(str7)) {
                                    zuVar.b.d(2, 2);
                                }
                                if ("roaming".equalsIgnoreCase(str7)) {
                                    zuVar.b.d(3, 3);
                                }
                                if ("reset".equalsIgnoreCase(str7)) {
                                    zuVar.r0();
                                    return true;
                                }
                            } else {
                                if ("auto-download".equalsIgnoreCase(str2)) {
                                    if ("mobile".equalsIgnoreCase(str7) || "wifi".equalsIgnoreCase(str7) || "roaming".equalsIgnoreCase(str7)) {
                                        if (!"mobile".equalsIgnoreCase(str7)) {
                                            if ("wifi".equalsIgnoreCase(str7)) {
                                                i10 = 1;
                                            } else if ("roaming".equalsIgnoreCase(str7)) {
                                                i10 = 2;
                                            }
                                            m(new DataAutoDownloadActivity(i10));
                                            if ("enable".equalsIgnoreCase(str4)) {
                                                o("autoDownloadRow");
                                            }
                                            if ("usage".equalsIgnoreCase(str4)) {
                                                o("usageProgressRow");
                                            }
                                            if ("photos".equalsIgnoreCase(str4)) {
                                                o("photosRow");
                                            }
                                            if ("stories".equalsIgnoreCase(str4)) {
                                                o("storiesRow");
                                            }
                                            if ("videos".equalsIgnoreCase(str4)) {
                                                o("videosRow");
                                            }
                                            if ("files".equalsIgnoreCase(str4)) {
                                                o("filesRow");
                                                return true;
                                            }
                                        }
                                        i10 = 0;
                                        m(new DataAutoDownloadActivity(i10));
                                        if ("enable".equalsIgnoreCase(str4)) {
                                        }
                                        if ("usage".equalsIgnoreCase(str4)) {
                                        }
                                        if ("photos".equalsIgnoreCase(str4)) {
                                        }
                                        if ("stories".equalsIgnoreCase(str4)) {
                                        }
                                        if ("videos".equalsIgnoreCase(str4)) {
                                        }
                                        if ("files".equalsIgnoreCase(str4)) {
                                        }
                                    } else if ("reset".equalsIgnoreCase(str7)) {
                                        m(new DataSettingsActivity());
                                        o("resetDownloadRow");
                                        return true;
                                    }
                                }
                                if (!TextUtils.isEmpty(str4) && "save-to-photos".equalsIgnoreCase(str2)) {
                                    m(new SaveToGallerySettingsActivity(android.support.v4.media.a.h("groups".equalsIgnoreCase(str7) ? 2 : "channels".equalsIgnoreCase(str7) ? 4 : 1, TeXSymbolParser.TYPE_ATTR)));
                                    if ("max-video-size".equalsIgnoreCase(str4)) {
                                        o("maxVideoSizeRow");
                                    }
                                    if ("add-exception".equalsIgnoreCase(str4)) {
                                        o("addExceptionRow");
                                    }
                                    if ("delete-all".equalsIgnoreCase(str4)) {
                                        o("deleteAllExceptionsRow");
                                        return true;
                                    }
                                } else if (!TextUtils.isEmpty(str7) && "proxy".equalsIgnoreCase(str2)) {
                                    m(new ProxyListActivity());
                                    if ("use-proxy".equalsIgnoreCase(str7)) {
                                        o("useProxyRow");
                                    }
                                    if ("add-proxy".equalsIgnoreCase(str7)) {
                                        o("proxyAddRow");
                                    }
                                    if ("use-for-calls".equalsIgnoreCase(str7)) {
                                        o("callsRow");
                                        return true;
                                    }
                                } else {
                                    if ("pause-music".equalsIgnoreCase(str2)) {
                                        m(new ThemeActivity(0));
                                        o("pauseOnMediaRow");
                                        return true;
                                    }
                                    if ("pause-music-on-record".equalsIgnoreCase(str2)) {
                                        m(new ThemeActivity(0));
                                        o("pauseOnRecordRow");
                                        return true;
                                    }
                                    if ("raise-to-listen".equalsIgnoreCase(str2)) {
                                        m(new ThemeActivity(0));
                                        o("raiseToListenRow");
                                        return true;
                                    }
                                    if ("raise-to-speak".equalsIgnoreCase(str2)) {
                                        m(new ThemeActivity(0));
                                        o("raiseToSpeakRow");
                                        return true;
                                    }
                                    if ("show-18-contnet".equalsIgnoreCase(str2)) {
                                        m(new ThemeActivity(0));
                                        o("sensitiveContentRow");
                                        return true;
                                    }
                                    m(new DataSettingsActivity());
                                    if ("save-to-photos".equalsIgnoreCase(str2)) {
                                        if ("chats".equalsIgnoreCase(str7)) {
                                            o("saveToGalleryPeerRow");
                                        }
                                        if ("groups".equalsIgnoreCase(str7)) {
                                            o("saveToGalleryGroupsRow");
                                        }
                                        if ("channels".equalsIgnoreCase(str7)) {
                                            o("saveToGalleryChannelsRow");
                                        }
                                    }
                                    if ("use-less-data".equalsIgnoreCase(str2)) {
                                        o("useLessDataForCallsRow");
                                    }
                                    if ("proxy".equalsIgnoreCase(str2)) {
                                        o("proxyRow");
                                        return true;
                                    }
                                }
                            }
                        } else if ("appearance".equalsIgnoreCase(str)) {
                            if ("themes".equalsIgnoreCase(str2) || "theme".equalsIgnoreCase(str2)) {
                                m(new ThemeActivity(3));
                                if ("create".equalsIgnoreCase(str7)) {
                                    o("createNewThemeRow");
                                    return true;
                                }
                            } else if (!TextUtils.isEmpty(str7) && ("wallpaper".equalsIgnoreCase(str2) || "wallpapers".equalsIgnoreCase(str2))) {
                                m(new WallpapersListActivity(0));
                                if ("set".equalsIgnoreCase(str7) || "choose-photo".equalsIgnoreCase(str7)) {
                                    o("uploadImageRow");
                                    return true;
                                }
                            } else {
                                if (!TextUtils.isEmpty(str7) && ("your-color".equalsIgnoreCase(str2) || "color".equalsIgnoreCase(str2))) {
                                    m(new np0());
                                    return true;
                                }
                                if (TextUtils.isEmpty(str7) || !"stickers-and-emoji".equalsIgnoreCase(str2)) {
                                    m(new ThemeActivity(0));
                                    if ("wallpaper".equalsIgnoreCase(str2) || "wallpapers".equalsIgnoreCase(str2)) {
                                        o("backgroundRow");
                                    }
                                    if ("your-color".equalsIgnoreCase(str2) || "color".equalsIgnoreCase(str2)) {
                                        o("changeUserColor");
                                    }
                                    if ("auto-night-mode".equalsIgnoreCase(str2)) {
                                        o("nightThemeRow");
                                    }
                                    if ("text-size".equalsIgnoreCase(str2)) {
                                        o("textSizeRow");
                                    }
                                    if ("message-corners".equalsIgnoreCase(str2)) {
                                        o("bubbleRadiusRow");
                                    }
                                    if ("animations".equalsIgnoreCase(str2)) {
                                        o("liteModeRow");
                                    }
                                    if ("stickers-and-emoji".equalsIgnoreCase(str2)) {
                                        o("stickersRow");
                                    }
                                    if ("app-icon".equalsIgnoreCase(str2)) {
                                        o("appIconSelectorRow");
                                    }
                                    if ("tap-for-next-media".equalsIgnoreCase(str2)) {
                                        o("nextMediaTapRow");
                                        return true;
                                    }
                                } else {
                                    if (!TextUtils.isEmpty(str4) && "archived".equalsIgnoreCase(str7)) {
                                        m(new r(0));
                                        return true;
                                    }
                                    if (!"emoji".equalsIgnoreCase(str7) || TextUtils.isEmpty(str4) || "large".equalsIgnoreCase(str4) || "dynamic-order".equalsIgnoreCase(str4)) {
                                        m(new StickersActivity(0, null));
                                        if ("trending".equalsIgnoreCase(str7)) {
                                            o("featuredRow");
                                        }
                                        if ("archived".equalsIgnoreCase(str7)) {
                                            o("archivedRow");
                                        }
                                        if ("emoji".equalsIgnoreCase(str7) && "large".equalsIgnoreCase(str4)) {
                                            o("largeEmojiRow");
                                            return true;
                                        }
                                        if ("emoji".equalsIgnoreCase(str7) && "dynamic-order".equalsIgnoreCase(str4)) {
                                            o("dynamicPackOrder");
                                            return true;
                                        }
                                        if ("emoji".equalsIgnoreCase(str7)) {
                                            o("emojiPacksRow");
                                            return true;
                                        }
                                    } else {
                                        if (!TextUtils.isEmpty(str6) && "archived".equalsIgnoreCase(str4)) {
                                            m(new r(5));
                                            return true;
                                        }
                                        m(new StickersActivity(5, null));
                                        if ("suggest".equalsIgnoreCase(str4)) {
                                            o("suggestRow");
                                            return true;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (!"power-saving".equalsIgnoreCase(str)) {
                                boolean equalsIgnoreCase2 = "stars".equalsIgnoreCase(str);
                                LaunchActivity launchActivity = this.a;
                                if (equalsIgnoreCase2) {
                                    if ("top-up".equalsIgnoreCase(str2)) {
                                        new lh.aa(launchActivity, null).show();
                                        return true;
                                    }
                                    if ("stats".equalsIgnoreCase(str2)) {
                                        m(new lh.q(0, d().getClientUserId()));
                                        return true;
                                    }
                                    if ("gift".equalsIgnoreCase(str2)) {
                                        lh.t7.w(i13).u();
                                        gg.v2.e0(1, BirthdayController.getInstance(i13).getState());
                                        return true;
                                    }
                                    if ("earn".equalsIgnoreCase(str2)) {
                                        m(new rh.d3(d().getClientUserId()));
                                        return true;
                                    }
                                    m(new lh.ja());
                                    return true;
                                }
                                if ("premium".equalsIgnoreCase(str)) {
                                    m(new PremiumPreviewFragment());
                                    return true;
                                }
                                if ("business".equalsIgnoreCase(str)) {
                                    m(new PremiumPreviewFragment(1, "link"));
                                    if (!"do-not-hide-ads".equalsIgnoreCase(str2)) {
                                        return true;
                                    }
                                    o("showAdsRow");
                                    return true;
                                }
                                if ("ton".equalsIgnoreCase(str)) {
                                    m(new qh.g());
                                    return true;
                                }
                                if ("send-gift".equalsIgnoreCase(str)) {
                                    if ("self".equalsIgnoreCase(str2)) {
                                        new kh.g2(launchActivity, this.b, d().getClientUserId(), null, null).show();
                                        return true;
                                    }
                                    gg.v2.e0(0, BirthdayController.getInstance(i13).getState());
                                    return true;
                                }
                                if ("ask-question".equalsIgnoreCase(str) || "ask-a-question".equalsIgnoreCase(str)) {
                                    org.telegram.ui.Components.z4.U(LaunchActivity.U(), null).show();
                                    return true;
                                }
                                if ("faq".equalsIgnoreCase(str)) {
                                    ze.d.s(launchActivity, LocaleController.getString(R.string.TelegramFaqUrl));
                                    return true;
                                }
                                if ("features".equalsIgnoreCase(str)) {
                                    ze.d.s(launchActivity, LocaleController.getString(R.string.TelegramFeaturesUrl));
                                    return true;
                                }
                                if ("privacy-policy".equalsIgnoreCase(str)) {
                                    ze.d.s(launchActivity, LocaleController.getString(R.string.PrivacyPolicyUrl));
                                    return true;
                                }
                                m(new w81());
                                return true;
                            }
                            gc0 gc0Var = new gc0();
                            m(gc0Var);
                            if ("videos".equalsIgnoreCase(str2)) {
                                gc0Var.V(1024);
                            }
                            if ("gifs".equalsIgnoreCase(str2)) {
                                gc0Var.V(2048);
                            }
                            if ("stickers".equalsIgnoreCase(str2)) {
                                gc0Var.V(3);
                            }
                            if ("emoji".equalsIgnoreCase(str2)) {
                                gc0Var.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            }
                            if ("effects".equalsIgnoreCase(str2)) {
                                gc0Var.V(LiteMode.FLAGS_CHAT);
                            }
                            if ("call-animations".equalsIgnoreCase(str2)) {
                                gc0Var.V(512);
                            }
                            if ("particles".equalsIgnoreCase(str2)) {
                                gc0Var.V(131072);
                            }
                            if ("transitions".equalsIgnoreCase(str2)) {
                                int i14 = 0;
                                while (true) {
                                    ArrayList arrayList = gc0Var.s;
                                    if (i14 >= arrayList.size()) {
                                        break;
                                    }
                                    if (((ac0) arrayList.get(i14)).f == 1) {
                                        gc0Var.b.d1(new gg.m2(gc0Var, i14, 12), 700, true);
                                        return true;
                                    }
                                    i14++;
                                }
                            }
                        }
                        return true;
                    }
                    m(new UserInfoActivity());
                    if ("first-name".equalsIgnoreCase(str2)) {
                        o("firstNameRow");
                    }
                    if ("last-name".equalsIgnoreCase(str2)) {
                        o("lastNameRow");
                    }
                    if ("bio".equalsIgnoreCase(str2)) {
                        o("bioRow");
                    }
                    if ("birthday".equalsIgnoreCase(str2)) {
                        o("birthdayRow");
                    }
                    if ("change-number".equalsIgnoreCase(str2)) {
                        o("numberRow");
                    }
                    if ("username".equalsIgnoreCase(str2)) {
                        o("usernameRow");
                    }
                    if ("channel".equalsIgnoreCase(str2)) {
                        o("channelRow");
                    }
                    if ("add-account".equalsIgnoreCase(str2)) {
                        o("addAccountRow");
                    }
                    if ("log-out".equalsIgnoreCase(str2)) {
                        o("logoutRow");
                        return true;
                    }
                } else {
                    if (TextUtils.isEmpty(str3)) {
                        m(new ThemeActivity(0));
                        o("browserRow");
                        return true;
                    }
                    m(new org.telegram.ui.web.y1(null));
                    if ("enable-browser".equalsIgnoreCase(str3)) {
                        o("enableRow");
                    }
                    if ("clear-cookies".equalsIgnoreCase(str3)) {
                        o("clearCookiesRow");
                    }
                    if ("clear-cache".equalsIgnoreCase(str3)) {
                        o("clearCacheRow");
                    }
                    if ("history".equalsIgnoreCase(str3)) {
                        o("historyRow");
                    }
                    if ("clear-history".equalsIgnoreCase(str3)) {
                        o("clearHistoryRow");
                    }
                    if ("never-open".equalsIgnoreCase(str3)) {
                        o("neverOpenRow");
                    }
                    if ("clear-list".equalsIgnoreCase(str3)) {
                        o("clearListRow");
                    }
                    if ("search".equalsIgnoreCase(str3)) {
                        o("searchRow");
                        return true;
                    }
                }
            }
        }
        return true;
    }

    public final void k() {
        if (this.f || this.g) {
            return;
        }
        ze.c cVar = this.c;
        if (cVar == null) {
            if (this.e == null) {
                this.e = new org.telegram.ui.ActionBar.d2(this.a, 3, null);
            }
            this.e.setOnCancelListener(new kg(this, 3));
            this.e.q(300L);
        } else {
            cVar.b = new rb0(this, 0);
            cVar.d();
        }
        this.f = true;
    }

    public final void m(org.telegram.ui.ActionBar.p2 p2Var) {
        n(p2Var, false);
    }

    public final void n(org.telegram.ui.ActionBar.p2 p2Var, boolean z4) {
        LaunchActivity launchActivity = this.a;
        launchActivity.q0(p2Var, z4, false);
        if (AndroidUtilities.isTablet()) {
            launchActivity.n0.U(true, true);
            launchActivity.p0.U(true, true);
        }
    }

    public final void o(String str) {
        AndroidUtilities.scrollToFragmentRow(this.a.O(), str);
    }
}
