package sf;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
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
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.d2;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.k4;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fi1;
import org.telegram.ui.tn;
import org.telegram.ui.yu0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r extends p51 implements NotificationCenter.NotificationCenterDelegate {
    public static c2 d;

    public static void Y(r rVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        b0(rVar.getParentActivity(), rVar.currentAccount, tL_businessChatLink, rVar.resourceProvider);
    }

    public static int a0(ArrayList arrayList) {
        char c3 = 65535;
        boolean z10 = false;
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
                z10 = true;
            }
        }
        if (c3 == 0 || (c3 == 65535 && z10)) {
            return 0;
        }
        return c3 == 2 ? 2 : 1;
    }

    public static void b0(Activity activity, int i10, TL_account.TL_businessChatLink tL_businessChatLink, c6 c6Var) {
        o2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof hv0) && ((hv0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        View view = currentFocus;
        c2[] c2VarArr = new c2[1];
        AlertDialog$Builder f2Var = z10 ? new f2(activity, 0, c6Var) : new AlertDialog$Builder(activity, 0, c6Var);
        String string = LocaleController.getString(R.string.BusinessLinksRenameTitle);
        c2 c2Var = f2Var.a;
        c2Var.N = string;
        o oVar = new o(activity, c6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        oVar.setInputType(49153);
        oVar.setTextSize(1, 18.0f);
        oVar.setText(tL_businessChatLink.title);
        int i11 = g6.j5;
        oVar.setTextColor(g6.v0(i11, c6Var));
        oVar.setHintColor(g6.v0(g6.Xh, c6Var));
        oVar.setCursorColor(g6.w0(null, g6.Wd, false));
        oVar.setHintText(LocaleController.getString(R.string.BusinessLinksNamePlaceholder));
        oVar.setSingleLine(true);
        oVar.setFocusable(true);
        oVar.setLineColors(g6.v0(g6.k6, c6Var), g6.v0(g6.l6, c6Var), g6.v0(g6.p7, c6Var));
        oVar.setImeOptions(6);
        oVar.setBackgroundDrawable(null);
        oVar.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f9 = x3.f(activity, 1);
        TextView textView = new TextView(activity);
        org.telegram.ui.b.m(i11, c6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.BusinessLinksRenameMessage));
        f9.addView(textView, f6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f9.addView(oVar, f6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        f2Var.n(f9);
        c2Var.a = AndroidUtilities.dp(292.0f);
        oVar.setOnEditorActionListener(new d2(oVar, i10, tL_businessChatLink, c2VarArr, view, 1));
        f2Var.k(LocaleController.getString(R.string.Done), new e3.d(oVar, i10, tL_businessChatLink, 16));
        f2Var.h(LocaleController.getString(R.string.Cancel), new r.a(27));
        if (z10) {
            d = c2Var;
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new n(0, view));
            d.setOnShowListener(new ih.k(2, oVar));
            d.q(250L);
        } else {
            c2Var.K = new yu0(17, view, oVar);
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new cg.d0(oVar, 11));
            c2VarArr[0].setOnShowListener(new org.telegram.messenger.voip.q0(view, oVar, 1));
            c2VarArr[0].show();
        }
        c2VarArr[0].d0 = false;
        oVar.setSelection(oVar.getText().length());
    }

    @Override // org.telegram.ui.Components.p51
    public final void U(ArrayList arrayList, k51 k51Var) {
        String string = LocaleController.getString(R.string.BusinessLinks);
        String string2 = LocaleController.getString(R.string.BusinessLinksInfo);
        int i10 = R.raw.biz_links;
        w41 w41Var = new w41(2);
        w41Var.l = string;
        w41Var.o = string2;
        w41Var.k = i10;
        arrayList.add(w41Var);
        k51Var.U();
        u d10 = u.d(this.currentAccount);
        if (d10.b.size() < MessagesController.getInstance(d10.a).businessChatLinksLimit) {
            w41 c3 = w41.c(1, R.drawable.menu_link_create, LocaleController.getString(R.string.BusinessLinksAdd));
            c3.q = true;
            arrayList.add(c3);
        }
        ArrayList arrayList2 = u.d(this.currentAccount).b;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            q qVar = new q();
            qVar.a = (TL_account.TL_businessChatLink) obj;
            w41 w41Var2 = new w41(29);
            w41Var2.G = qVar;
            arrayList.add(w41Var2);
        }
        k51Var.T();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        String q6 = a4.w.q(new StringBuilder(), MessagesController.getInstance(this.currentAccount).linkPrefix, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String publicUsername = UserObject.getPublicUsername(currentUser);
        if (publicUsername != null) {
            arrayList3.add(q6 + publicUsername);
        }
        ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
        if (!TextUtils.isEmpty(currentUser.phone) && privacyRules != null && privacyRules2 != null && (a0(privacyRules) != 1 || a0(privacyRules2) != 2)) {
            StringBuilder f9 = u3.c.f(q6, "+");
            f9.append(currentUser.phone);
            arrayList3.add(f9.toString());
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
                k4 k4Var = new k4(u3.c.e("https://", str), (h01) null);
                k4Var.f = this;
                spannableString.setSpan(k4Var, indexOf, str.length() + indexOf, 33);
            }
        }
        arrayList.add(w41.B(spannableString));
    }

    @Override // org.telegram.ui.Components.p51
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessLinks);
    }

    @Override // org.telegram.ui.Components.p51
    public final void W(w41 w41Var, View view) {
        if (w41Var.d == 1) {
            u d10 = u.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d10.a).sendRequest(createbusinesschatlink, new t(d10, 1));
            return;
        }
        if (w41Var.a == 29) {
            Object obj = w41Var.G;
            if (obj instanceof q) {
                Bundle h = a4.w.h(6, "chatMode");
                h.putString("business_link", ((q) obj).a.link);
                presentFragment(new tn(h));
            }
        }
    }

    @Override // org.telegram.ui.Components.p51
    public final boolean X(w41 w41Var, View view) {
        if (w41Var.a == 29) {
            Object obj = w41Var.G;
            if (obj instanceof q) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((q) obj).a;
                j70 H = j70.H(this, view);
                H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new org.telegram.ui.web.t1(tL_businessChatLink, 15), false);
                final int i10 = 0;
                H.c(R.drawable.msg_share, LocaleController.getString(R.string.LinkActionShare), new Runnable(this) { // from class: sf.m
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
                                r.Y(this.b, tL_businessChatLink);
                                break;
                            default:
                                r rVar2 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rVar2.getParentActivity(), 0, rVar2.getResourceProvider());
                                alertDialog$Builder.a.N = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new fi1(8, rVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                c2 c2Var = alertDialog$Builder.a;
                                rVar2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(rVar2.getThemedColor(g6.q7));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i11 = 1;
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Rename), new Runnable(this) { // from class: sf.m
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
                                r.Y(this.b, tL_businessChatLink);
                                break;
                            default:
                                r rVar2 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rVar2.getParentActivity(), 0, rVar2.getResourceProvider());
                                alertDialog$Builder.a.N = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new fi1(8, rVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                c2 c2Var = alertDialog$Builder.a;
                                rVar2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(rVar2.getThemedColor(g6.q7));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i12 = 2;
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) { // from class: sf.m
                    public final /* synthetic */ r b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
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
                                r.Y(this.b, tL_businessChatLink);
                                break;
                            default:
                                r rVar2 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rVar2.getParentActivity(), 0, rVar2.getResourceProvider());
                                alertDialog$Builder.a.N = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new fi1(8, rVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                c2 c2Var = alertDialog$Builder.a;
                                rVar2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(rVar2.getThemedColor(g6.q7));
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

    @Override // org.telegram.ui.Components.p51, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        super.createView(context);
        this.a.p1();
        o51 o51Var = this.a;
        o51Var.U2.r = false;
        this.actionBar.A(o51Var, true);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k51 k51Var;
        if (i10 == NotificationCenter.businessLinksUpdated || i10 == NotificationCenter.privacyRulesUpdated) {
            o51 o51Var = this.a;
            if (o51Var == null || (k51Var = o51Var.U2) == null) {
                return;
            }
            k51Var.N(true);
            return;
        }
        if (i10 != NotificationCenter.businessLinkCreated) {
            if (i10 == NotificationCenter.needDeleteBusinessLink) {
                u.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
            }
        } else {
            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) objArr[0];
            Bundle h = a4.w.h(6, "chatMode");
            h.putString("business_link", tL_businessChatLink.link);
            presentFragment(new tn(h));
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
        u d10 = u.d(this.currentAccount);
        if (d10.d) {
            d10.e(false, true);
        } else {
            d10.e(true, true);
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
        mc.e();
        super.onFragmentDestroy();
    }
}
