package qf;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.rl;
import org.telegram.messenger.y1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.g4;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.Components.z1;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.di1;
import org.telegram.ui.ib0;
import org.telegram.ui.j70;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s extends f51 implements NotificationCenter.NotificationCenterDelegate {
    public static b2 d;

    public static void Y(s sVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        b0(sVar.getParentActivity(), sVar.currentAccount, tL_businessChatLink, sVar.resourceProvider);
    }

    public static int a0(ArrayList arrayList) {
        char c10 = 65535;
        boolean z10 = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i10);
            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants)) {
                if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants)) {
                    if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowUsers)) {
                        if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers)) {
                            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) && c10 == 65535) {
                                c10 = privacyRule instanceof TLRPC.TL_privacyValueAllowAll ? (char) 0 : privacyRule instanceof TLRPC.TL_privacyValueDisallowAll ? (char) 1 : (char) 2;
                            }
                        }
                    }
                }
                z10 = true;
            }
        }
        if (c10 == 0 || (c10 == 65535 && z10)) {
            return 0;
        }
        return c10 == 2 ? 2 : 1;
    }

    public static void b0(Activity activity, int i10, TL_account.TL_businessChatLink tL_businessChatLink, c6 c6Var) {
        n2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof zu0) && ((zu0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        View view = currentFocus;
        b2[] b2VarArr = new b2[1];
        AlertDialog$Builder e2Var = z10 ? new e2(activity, 0, c6Var) : new AlertDialog$Builder(activity, 0, c6Var);
        String string = LocaleController.getString(R.string.BusinessLinksRenameTitle);
        b2 b2Var = e2Var.a;
        b2Var.N = string;
        p pVar = new p(activity, c6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        pVar.setInputType(49153);
        pVar.setTextSize(1, 18.0f);
        pVar.setText(tL_businessChatLink.title);
        int i11 = g6.j5;
        pVar.setTextColor(g6.v0(i11, c6Var));
        pVar.setHintColor(g6.v0(g6.Xh, c6Var));
        pVar.setCursorColor(g6.w0(null, g6.Wd, false));
        pVar.setHintText(LocaleController.getString(R.string.BusinessLinksNamePlaceholder));
        pVar.setSingleLine(true);
        pVar.setFocusable(true);
        pVar.setLineColors(g6.v0(g6.k6, c6Var), g6.v0(g6.l6, c6Var), g6.v0(g6.p7, c6Var));
        pVar.setImeOptions(6);
        pVar.setBackgroundDrawable(null);
        pVar.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f10 = y1.f(activity, 1);
        TextView textView = new TextView(activity);
        rl.l(i11, c6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.BusinessLinksRenameMessage));
        f10.addView(textView, z5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(pVar, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        e2Var.n(f10);
        b2Var.a = AndroidUtilities.dp(292.0f);
        pVar.setOnEditorActionListener(new z1(pVar, i10, tL_businessChatLink, b2VarArr, view, 1));
        e2Var.k(LocaleController.getString(R.string.Done), new c3.d(pVar, i10, tL_businessChatLink, 16));
        e2Var.h(LocaleController.getString(R.string.Cancel), new j70(21));
        if (z10) {
            d = b2Var;
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new o(0, view));
            d.setOnShowListener(new gh.k(2, pVar));
            d.q(250L);
        } else {
            b2Var.K = new ib0(17, view, pVar);
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new ag.j0(pVar, 11));
            b2VarArr[0].setOnShowListener(new org.telegram.messenger.voip.q0(view, pVar, 1));
            b2VarArr[0].show();
        }
        b2VarArr[0].d0 = false;
        pVar.setSelection(pVar.getText().length());
    }

    @Override // org.telegram.ui.Components.f51
    public final void U(ArrayList arrayList, b51 b51Var) {
        String string = LocaleController.getString(R.string.BusinessLinks);
        String string2 = LocaleController.getString(R.string.BusinessLinksInfo);
        int i10 = R.raw.biz_links;
        n41 n41Var = new n41(2);
        n41Var.l = string;
        n41Var.o = string2;
        n41Var.k = i10;
        arrayList.add(n41Var);
        b51Var.U();
        v d10 = v.d(this.currentAccount);
        if (d10.b.size() < MessagesController.getInstance(d10.a).businessChatLinksLimit) {
            n41 c10 = n41.c(1, R.drawable.menu_link_create, LocaleController.getString(R.string.BusinessLinksAdd));
            c10.q = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = v.d(this.currentAccount).b;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            r rVar = new r();
            rVar.a = (TL_account.TL_businessChatLink) obj;
            n41 n41Var2 = new n41(29);
            n41Var2.G = rVar;
            arrayList.add(n41Var2);
        }
        b51Var.T();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        String p6 = a9.p.p(new StringBuilder(), MessagesController.getInstance(this.currentAccount).linkPrefix, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String publicUsername = UserObject.getPublicUsername(currentUser);
        if (publicUsername != null) {
            arrayList3.add(p6 + publicUsername);
        }
        ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
        if (!TextUtils.isEmpty(currentUser.phone) && privacyRules != null && privacyRules2 != null && (a0(privacyRules) != 1 || a0(privacyRules2) != 2)) {
            StringBuilder f10 = s3.c.f(p6, "+");
            f10.append(currentUser.phone);
            arrayList3.add(f10.toString());
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        String formatString = arrayList3.size() == 2 ? LocaleController.formatString(R.string.BusinessLinksFooterTwoLinks, arrayList3.get(0), arrayList3.get(1)) : LocaleController.formatString(R.string.BusinessLinksFooterOneLink, arrayList3.get(0));
        SpannableString spannableString = new SpannableString(formatString);
        int size2 = arrayList3.size();
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            String str = (String) obj2;
            int indexOf = formatString.indexOf(str);
            if (indexOf > -1) {
                g4 g4Var = new g4(s3.c.e("https://", str), (xz0) null);
                g4Var.f = this;
                spannableString.setSpan(g4Var, indexOf, str.length() + indexOf, 33);
            }
        }
        arrayList.add(n41.B(spannableString));
    }

    @Override // org.telegram.ui.Components.f51
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessLinks);
    }

    @Override // org.telegram.ui.Components.f51
    public final void W(n41 n41Var, View view) {
        if (n41Var.d == 1) {
            v d10 = v.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d10.a).sendRequest(createbusinesschatlink, new u(d10, 1));
            return;
        }
        if (n41Var.a == 29) {
            Object obj = n41Var.G;
            if (obj instanceof r) {
                Bundle g10 = a9.p.g(6, "chatMode");
                g10.putString("business_link", ((r) obj).a.link);
                presentFragment(new rn(g10));
            }
        }
    }

    @Override // org.telegram.ui.Components.f51
    public final boolean X(n41 n41Var, View view) {
        if (n41Var.a == 29) {
            Object obj = n41Var.G;
            if (obj instanceof r) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((r) obj).a;
                b70 H = b70.H(this, view);
                H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new b(tL_businessChatLink, 1), false);
                final int i10 = 0;
                H.c(R.drawable.msg_share, LocaleController.getString(R.string.LinkActionShare), new Runnable(this) { // from class: qf.n
                    public final /* synthetic */ s b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                s sVar = this.b;
                                sVar.getClass();
                                Intent intent = new Intent(sVar.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                sVar.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                s.Y(this.b, tL_businessChatLink);
                                break;
                            default:
                                s sVar2 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sVar2.getParentActivity(), 0, sVar2.getResourceProvider());
                                alertDialog$Builder.a.N = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new di1(6, sVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                b2 b2Var = alertDialog$Builder.a;
                                sVar2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(sVar2.getThemedColor(g6.q7));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i11 = 1;
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Rename), new Runnable(this) { // from class: qf.n
                    public final /* synthetic */ s b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                s sVar = this.b;
                                sVar.getClass();
                                Intent intent = new Intent(sVar.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                sVar.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                s.Y(this.b, tL_businessChatLink);
                                break;
                            default:
                                s sVar2 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sVar2.getParentActivity(), 0, sVar2.getResourceProvider());
                                alertDialog$Builder.a.N = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new di1(6, sVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                b2 b2Var = alertDialog$Builder.a;
                                sVar2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(sVar2.getThemedColor(g6.q7));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i12 = 2;
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) { // from class: qf.n
                    public final /* synthetic */ s b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                s sVar = this.b;
                                sVar.getClass();
                                Intent intent = new Intent(sVar.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                sVar.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                s.Y(this.b, tL_businessChatLink);
                                break;
                            default:
                                s sVar2 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sVar2.getParentActivity(), 0, sVar2.getResourceProvider());
                                alertDialog$Builder.a.N = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new di1(6, sVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                b2 b2Var = alertDialog$Builder.a;
                                sVar2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(sVar2.getThemedColor(g6.q7));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                H.W(this.a.V0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.f51, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        super.createView(context);
        this.a.p1();
        e51 e51Var = this.a;
        e51Var.U2.r = false;
        this.actionBar.B(e51Var, true);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b51 b51Var;
        if (i10 == NotificationCenter.businessLinksUpdated || i10 == NotificationCenter.privacyRulesUpdated) {
            e51 e51Var = this.a;
            if (e51Var == null || (b51Var = e51Var.U2) == null) {
                return;
            }
            b51Var.N(true);
            return;
        }
        if (i10 != NotificationCenter.businessLinkCreated) {
            if (i10 == NotificationCenter.needDeleteBusinessLink) {
                v.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
            }
        } else {
            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) objArr[0];
            Bundle g10 = a9.p.g(6, "chatMode");
            g10.putString("business_link", tL_businessChatLink.link);
            presentFragment(new rn(g10));
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        b2 b2Var = d;
        if (b2Var == null || !b2Var.isShowing()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        d.dismiss();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.businessLinksUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.businessLinkCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.needDeleteBusinessLink);
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        v d10 = v.d(this.currentAccount);
        if (d10.d) {
            d10.e(false, true);
        } else {
            d10.e(true, true);
        }
        ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.businessLinksUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.businessLinkCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.needDeleteBusinessLink);
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        ec.e();
        super.onFragmentDestroy();
    }
}
