package pf;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import java.util.ArrayList;
import mh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.g4;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.vz0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.z1;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eb0;
import org.telegram.ui.ei1;
import org.telegram.ui.fk0;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r extends d51 implements NotificationCenter.NotificationCenterDelegate {
    public static c2 d;

    public static void X(r rVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        a0(rVar.getParentActivity(), rVar.currentAccount, tL_businessChatLink, rVar.resourceProvider);
    }

    public static int Z(ArrayList arrayList) {
        char c10 = 65535;
        boolean z10 = false;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i9);
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

    public static void a0(Activity activity, int i9, TL_account.TL_businessChatLink tL_businessChatLink, b6 b6Var) {
        o2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof xu0) && ((xu0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        View view = currentFocus;
        c2[] c2VarArr = new c2[1];
        AlertDialog$Builder f2Var = z10 ? new f2(activity, 0, b6Var) : new AlertDialog$Builder(activity, 0, b6Var);
        String string = LocaleController.getString(R.string.BusinessLinksRenameTitle);
        c2 c2Var = f2Var.a;
        c2Var.N = string;
        o oVar = new o(activity, b6Var);
        MediaDataController.getInstance(i9).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        oVar.setInputType(49153);
        oVar.setTextSize(1, 18.0f);
        oVar.setText(tL_businessChatLink.title);
        int i10 = f6.j5;
        oVar.setTextColor(f6.v0(i10, b6Var));
        oVar.setHintColor(f6.v0(f6.Xh, b6Var));
        oVar.setCursorColor(f6.w0(null, f6.Wd, false));
        oVar.setHintText(LocaleController.getString(R.string.BusinessLinksNamePlaceholder));
        oVar.setSingleLine(true);
        oVar.setFocusable(true);
        oVar.setLineColors(f6.v0(f6.k6, b6Var), f6.v0(f6.l6, b6Var), f6.v0(f6.p7, b6Var));
        oVar.setImeOptions(6);
        oVar.setBackgroundDrawable(null);
        oVar.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f10 = org.telegram.messenger.l0.f(activity, 1);
        TextView textView = new TextView(activity);
        ll.n(i10, b6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.BusinessLinksRenameMessage));
        f10.addView(textView, e6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(oVar, e6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        f2Var.n(f10);
        c2Var.a = AndroidUtilities.dp(292.0f);
        oVar.setOnEditorActionListener(new z1(oVar, i9, tL_businessChatLink, c2VarArr, view, 1));
        f2Var.k(LocaleController.getString(R.string.Done), new c3.e(oVar, i9, tL_businessChatLink, 16));
        f2Var.h(LocaleController.getString(R.string.Cancel), new fk0(15));
        if (z10) {
            d = c2Var;
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new n(0, view));
            d.setOnShowListener(new fh.k(2, oVar));
            d.q(250L);
        } else {
            c2Var.K = new eb0(17, view, oVar);
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new eh.l(oVar, 9));
            c2VarArr[0].setOnShowListener(new org.telegram.messenger.voip.q0(view, oVar, 1));
            c2VarArr[0].show();
        }
        c2VarArr[0].d0 = false;
        oVar.setSelection(oVar.getText().length());
    }

    @Override // org.telegram.ui.Components.d51
    public final void T(ArrayList arrayList, z41 z41Var) {
        String string = LocaleController.getString(R.string.BusinessLinks);
        String string2 = LocaleController.getString(R.string.BusinessLinksInfo);
        int i9 = R.raw.biz_links;
        l41 l41Var = new l41(2);
        l41Var.l = string;
        l41Var.o = string2;
        l41Var.k = i9;
        arrayList.add(l41Var);
        z41Var.U();
        u d9 = u.d(this.currentAccount);
        if (d9.b.size() < MessagesController.getInstance(d9.a).businessChatLinksLimit) {
            l41 c10 = l41.c(1, R.drawable.menu_link_create, LocaleController.getString(R.string.BusinessLinksAdd));
            c10.q = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = u.d(this.currentAccount).b;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            q qVar = new q();
            qVar.a = (TL_account.TL_businessChatLink) obj;
            l41 l41Var2 = new l41(29);
            l41Var2.G = qVar;
            arrayList.add(l41Var2);
        }
        z41Var.T();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        String r10 = aa.d.r(new StringBuilder(), MessagesController.getInstance(this.currentAccount).linkPrefix, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String publicUsername = UserObject.getPublicUsername(currentUser);
        if (publicUsername != null) {
            arrayList3.add(r10 + publicUsername);
        }
        ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
        if (!TextUtils.isEmpty(currentUser.phone) && privacyRules != null && privacyRules2 != null && (Z(privacyRules) != 1 || Z(privacyRules2) != 2)) {
            StringBuilder e10 = ta.b.e(r10, "+");
            e10.append(currentUser.phone);
            arrayList3.add(e10.toString());
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        String formatString = arrayList3.size() == 2 ? LocaleController.formatString(R.string.BusinessLinksFooterTwoLinks, arrayList3.get(0), arrayList3.get(1)) : LocaleController.formatString(R.string.BusinessLinksFooterOneLink, arrayList3.get(0));
        SpannableString spannableString = new SpannableString(formatString);
        int size2 = arrayList3.size();
        while (i10 < size2) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            String str = (String) obj2;
            int indexOf = formatString.indexOf(str);
            if (indexOf > -1) {
                g4 g4Var = new g4(ta.b.d("https://", str), (vz0) null);
                g4Var.f = this;
                spannableString.setSpan(g4Var, indexOf, str.length() + indexOf, 33);
            }
        }
        arrayList.add(l41.B(spannableString));
    }

    @Override // org.telegram.ui.Components.d51
    public final CharSequence U() {
        return LocaleController.getString(R.string.BusinessLinks);
    }

    @Override // org.telegram.ui.Components.d51
    public final void V(l41 l41Var, View view) {
        if (l41Var.d == 1) {
            u d9 = u.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d9.a).sendRequest(createbusinesschatlink, new t(d9, 1));
            return;
        }
        if (l41Var.a == 29) {
            Object obj = l41Var.G;
            if (obj instanceof q) {
                Bundle h = aa.d.h(6, "chatMode");
                h.putString("business_link", ((q) obj).a.link);
                presentFragment(new qn(h));
            }
        }
    }

    @Override // org.telegram.ui.Components.d51
    public final boolean W(l41 l41Var, View view) {
        if (l41Var.a == 29) {
            Object obj = l41Var.G;
            if (obj instanceof q) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((q) obj).a;
                x60 H = x60.H(this, view);
                H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new m2(tL_businessChatLink, 24), false);
                final int i9 = 0;
                H.c(R.drawable.msg_share, LocaleController.getString(R.string.LinkActionShare), new Runnable(this) { // from class: pf.m
                    public final /* synthetic */ r b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                r rVar = this.b;
                                rVar.getClass();
                                Intent intent = new Intent(rVar.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                rVar.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                r.X(this.b, tL_businessChatLink);
                                break;
                            default:
                                r rVar2 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rVar2.getParentActivity(), 0, rVar2.getResourceProvider());
                                alertDialog$Builder.a.N = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ei1(5, rVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                c2 c2Var = alertDialog$Builder.a;
                                rVar2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(rVar2.getThemedColor(f6.q7));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i10 = 1;
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Rename), new Runnable(this) { // from class: pf.m
                    public final /* synthetic */ r b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                r rVar = this.b;
                                rVar.getClass();
                                Intent intent = new Intent(rVar.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                rVar.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                r.X(this.b, tL_businessChatLink);
                                break;
                            default:
                                r rVar2 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rVar2.getParentActivity(), 0, rVar2.getResourceProvider());
                                alertDialog$Builder.a.N = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ei1(5, rVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                c2 c2Var = alertDialog$Builder.a;
                                rVar2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(rVar2.getThemedColor(f6.q7));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i11 = 2;
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) { // from class: pf.m
                    public final /* synthetic */ r b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                r rVar = this.b;
                                rVar.getClass();
                                Intent intent = new Intent(rVar.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                rVar.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                r.X(this.b, tL_businessChatLink);
                                break;
                            default:
                                r rVar2 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rVar2.getParentActivity(), 0, rVar2.getResourceProvider());
                                alertDialog$Builder.a.N = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ei1(5, rVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                c2 c2Var = alertDialog$Builder.a;
                                rVar2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(rVar2.getThemedColor(f6.q7));
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

    @Override // org.telegram.ui.Components.d51, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        super.createView(context);
        this.a.p1();
        c51 c51Var = this.a;
        c51Var.U2.r = false;
        this.actionBar.z(c51Var, true);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        z41 z41Var;
        if (i9 == NotificationCenter.businessLinksUpdated || i9 == NotificationCenter.privacyRulesUpdated) {
            c51 c51Var = this.a;
            if (c51Var == null || (z41Var = c51Var.U2) == null) {
                return;
            }
            z41Var.N(true);
            return;
        }
        if (i9 != NotificationCenter.businessLinkCreated) {
            if (i9 == NotificationCenter.needDeleteBusinessLink) {
                u.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
            }
        } else {
            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) objArr[0];
            Bundle h = aa.d.h(6, "chatMode");
            h.putString("business_link", tL_businessChatLink.link);
            presentFragment(new qn(h));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        c2 c2Var = d;
        if (c2Var == null || !c2Var.isShowing()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        d.dismiss();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.businessLinksUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.businessLinkCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.needDeleteBusinessLink);
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        u d9 = u.d(this.currentAccount);
        if (d9.d) {
            d9.e(false, true);
        } else {
            d9.e(true, true);
        }
        ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.businessLinksUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.businessLinkCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.needDeleteBusinessLink);
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        gc.e();
        super.onFragmentDestroy();
    }
}
