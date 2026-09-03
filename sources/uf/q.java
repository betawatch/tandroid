package uf;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.b2;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.h4;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
import ph.ga;
import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class q extends b61 implements NotificationCenter.NotificationCenterDelegate {
    public static d2 d;

    public static void Y(q qVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        b0(qVar.getParentActivity(), qVar.currentAccount, tL_businessChatLink, qVar.resourceProvider);
    }

    public static int a0(ArrayList arrayList) {
        char c3 = 65535;
        boolean z4 = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i10);
            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants)) {
                if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants)) {
                    if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowUsers)) {
                        if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers)) {
                            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) && c3 == 65535) {
                                c3 = privacyRule instanceof TLRPC.TL_privacyValueAllowAll ? (char) 0 : privacyRule instanceof TLRPC.TL_privacyValueDisallowAll ? (char) 1 : (char) 2;
                            }
                        }
                    }
                }
                z4 = true;
            }
        }
        if (c3 == 0 || (c3 == 65535 && z4)) {
            return 0;
        }
        return c3 == 2 ? 2 : 1;
    }

    public static void b0(Activity activity, int i10, TL_account.TL_businessChatLink tL_businessChatLink, f6 f6Var) {
        p2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z4 = R != null && (R.getFragmentView() instanceof qv0) && ((qv0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        View view = currentFocus;
        d2[] d2VarArr = new d2[1];
        AlertDialog$Builder g2Var = z4 ? new g2(activity, 0, f6Var) : new AlertDialog$Builder(activity, 0, f6Var);
        String string = LocaleController.getString(R.string.BusinessLinksRenameTitle);
        d2 d2Var = g2Var.a;
        d2Var.O = string;
        n nVar = new n(activity, f6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        nVar.setInputType(49153);
        nVar.setTextSize(1, 18.0f);
        nVar.setText(tL_businessChatLink.title);
        int i11 = j6.j5;
        nVar.setTextColor(j6.v0(i11, f6Var));
        nVar.setHintColor(j6.v0(j6.Xh, f6Var));
        nVar.setCursorColor(j6.w0(null, j6.Wd, false));
        nVar.setHintText(LocaleController.getString(R.string.BusinessLinksNamePlaceholder));
        nVar.setSingleLine(true);
        nVar.setFocusable(true);
        nVar.setLineColors(j6.v0(j6.k6, f6Var), j6.v0(j6.l6, f6Var), j6.v0(j6.p7, f6Var));
        nVar.setImeOptions(6);
        nVar.setBackgroundDrawable(null);
        nVar.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout h = kf.k0.h(activity, 1);
        TextView textView = new TextView(activity);
        org.telegram.ui.b.l(i11, f6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.BusinessLinksRenameMessage));
        h.addView(textView, b6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        h.addView(nVar, b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        g2Var.n(h);
        d2Var.a = AndroidUtilities.dp(292.0f);
        nVar.setOnEditorActionListener(new b2(nVar, i10, tL_businessChatLink, d2VarArr, view, 1));
        g2Var.k(LocaleController.getString(R.string.Done), new e3.d(nVar, i10, tL_businessChatLink, 16));
        g2Var.h(LocaleController.getString(R.string.Cancel), new s0.b(13));
        if (z4) {
            d = d2Var;
            d2VarArr[0] = d2Var;
            d2Var.setOnDismissListener(new m(0, view));
            d.setOnShowListener(new kh.j(2, nVar));
            d.q(250L);
        } else {
            d2Var.L = new ph.s1(15, view, nVar);
            d2VarArr[0] = d2Var;
            d2Var.setOnDismissListener(new eg.d0(nVar, 11));
            d2VarArr[0].setOnShowListener(new org.telegram.messenger.voip.r0(view, nVar, 1));
            d2VarArr[0].show();
        }
        d2VarArr[0].e0 = false;
        nVar.setSelection(nVar.getText().length());
    }

    @Override // org.telegram.ui.Components.b61
    public final void U(ArrayList arrayList, w51 w51Var) {
        String string = LocaleController.getString(R.string.BusinessLinks);
        String string2 = LocaleController.getString(R.string.BusinessLinksInfo);
        int i10 = R.raw.biz_links;
        i51 i51Var = new i51(2);
        i51Var.l = string;
        i51Var.o = string2;
        i51Var.k = i10;
        arrayList.add(i51Var);
        w51Var.U();
        t d10 = t.d(this.currentAccount);
        if (d10.b.size() < MessagesController.getInstance(d10.a).businessChatLinksLimit) {
            i51 c3 = i51.c(1, R.drawable.menu_link_create, LocaleController.getString(R.string.BusinessLinksAdd));
            c3.q = true;
            arrayList.add(c3);
        }
        ArrayList arrayList2 = t.d(this.currentAccount).b;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            p pVar = new p();
            pVar.a = (TL_account.TL_businessChatLink) obj;
            i51 i51Var2 = new i51(29);
            i51Var2.G = pVar;
            arrayList.add(i51Var2);
        }
        w51Var.T();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        String r10 = android.support.v4.media.a.r(new StringBuilder(), MessagesController.getInstance(this.currentAccount).linkPrefix, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String publicUsername = UserObject.getPublicUsername(currentUser);
        if (publicUsername != null) {
            arrayList3.add(r10 + publicUsername);
        }
        ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
        if (!TextUtils.isEmpty(currentUser.phone) && privacyRules != null && privacyRules2 != null && (a0(privacyRules) != 1 || a0(privacyRules2) != 2)) {
            StringBuilder f10 = w2.f(r10, "+");
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
                h4 h4Var = new h4(w2.e("https://", str), (s01) null);
                h4Var.f = this;
                spannableString.setSpan(h4Var, indexOf, str.length() + indexOf, 33);
            }
        }
        arrayList.add(i51.B(spannableString));
    }

    @Override // org.telegram.ui.Components.b61
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessLinks);
    }

    @Override // org.telegram.ui.Components.b61
    public final void W(i51 i51Var, View view) {
        if (i51Var.d == 1) {
            t d10 = t.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d10.a).sendRequest(createbusinesschatlink, new s(d10, 1));
            return;
        }
        if (i51Var.a == 29) {
            Object obj = i51Var.G;
            if (obj instanceof p) {
                Bundle h = android.support.v4.media.a.h(6, "chatMode");
                h.putString("business_link", ((p) obj).a.link);
                presentFragment(new zn(h));
            }
        }
    }

    @Override // org.telegram.ui.Components.b61
    public final boolean X(i51 i51Var, View view) {
        if (i51Var.a == 29) {
            Object obj = i51Var.G;
            if (obj instanceof p) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((p) obj).a;
                p70 H = p70.H(this, view);
                H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new ga(tL_businessChatLink, 18), false);
                final int i10 = 0;
                H.c(R.drawable.msg_share, LocaleController.getString(R.string.LinkActionShare), new Runnable(this) { // from class: uf.l
                    public final /* synthetic */ q b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                q qVar = this.b;
                                qVar.getClass();
                                Intent intent = new Intent(qVar.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                qVar.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                q.Y(this.b, tL_businessChatLink);
                                break;
                            default:
                                q qVar2 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qVar2.getParentActivity(), 0, qVar2.getResourceProvider());
                                alertDialog$Builder.a.O = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.a.Q = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.web.m(8, qVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                d2 d2Var = alertDialog$Builder.a;
                                qVar2.showDialog(d2Var);
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(qVar2.getThemedColor(j6.q7));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i11 = 1;
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Rename), new Runnable(this) { // from class: uf.l
                    public final /* synthetic */ q b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                q qVar = this.b;
                                qVar.getClass();
                                Intent intent = new Intent(qVar.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                qVar.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                q.Y(this.b, tL_businessChatLink);
                                break;
                            default:
                                q qVar2 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qVar2.getParentActivity(), 0, qVar2.getResourceProvider());
                                alertDialog$Builder.a.O = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.a.Q = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.web.m(8, qVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                d2 d2Var = alertDialog$Builder.a;
                                qVar2.showDialog(d2Var);
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(qVar2.getThemedColor(j6.q7));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i12 = 2;
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) { // from class: uf.l
                    public final /* synthetic */ q b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                q qVar = this.b;
                                qVar.getClass();
                                Intent intent = new Intent(qVar.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                qVar.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                q.Y(this.b, tL_businessChatLink);
                                break;
                            default:
                                q qVar2 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qVar2.getParentActivity(), 0, qVar2.getResourceProvider());
                                alertDialog$Builder.a.O = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.a.Q = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.web.m(8, qVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                d2 d2Var = alertDialog$Builder.a;
                                qVar2.showDialog(d2Var);
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(qVar2.getThemedColor(j6.q7));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                H.W(this.a.U0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.b61, org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        super.createView(context);
        this.a.o1();
        a61 a61Var = this.a;
        a61Var.V2.r = false;
        this.actionBar.A(a61Var, true);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w51 w51Var;
        if (i10 == NotificationCenter.businessLinksUpdated || i10 == NotificationCenter.privacyRulesUpdated) {
            a61 a61Var = this.a;
            if (a61Var == null || (w51Var = a61Var.V2) == null) {
                return;
            }
            w51Var.N(true);
            return;
        }
        if (i10 != NotificationCenter.businessLinkCreated) {
            if (i10 == NotificationCenter.needDeleteBusinessLink) {
                t.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
            }
        } else {
            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) objArr[0];
            Bundle h = android.support.v4.media.a.h(6, "chatMode");
            h.putString("business_link", tL_businessChatLink.link);
            presentFragment(new zn(h));
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        d2 d2Var = d;
        if (d2Var == null || !d2Var.isShowing()) {
            return super.onBackPressed(z4);
        }
        if (!z4) {
            return false;
        }
        d.dismiss();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.businessLinksUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.businessLinkCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.needDeleteBusinessLink);
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        t d10 = t.d(this.currentAccount);
        if (d10.d) {
            d10.e(false, true);
        } else {
            d10.e(true, true);
        }
        ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.businessLinksUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.businessLinkCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.needDeleteBusinessLink);
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        ic.e();
        super.onFragmentDestroy();
    }
}
