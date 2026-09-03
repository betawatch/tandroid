package ph;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.ai;
import org.telegram.ui.ib0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class c7 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public y6 U;
    public final org.telegram.ui.Cells.h3 V;
    public final org.telegram.ui.Cells.h3 W;
    public final FrameLayout X;
    public final d Y;
    public boolean Z;
    public boolean a0;
    public s1 b0;
    public long c0;
    public TLRPC.WebPage d0;
    public boolean e0;
    public int f0;
    public String g0;
    public final v6 h0;
    public Pattern i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;

    public c7(Context context, q4 q4Var, k5 k5Var, s1 s1Var) {
        super(context, null, true, false, false, false, true, 2, q4Var);
        this.h0 = new v6(this, 0);
        this.b0 = s1Var;
        fixNavigationBar();
        J();
        this.F = AndroidUtilities.dp(4.0f);
        this.G = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, q4Var);
        this.V = h3Var;
        v6 v6Var = new v6(this, 1);
        org.telegram.ui.Cells.f3 f3Var = h3Var.b;
        f3Var.setImeOptions(6);
        f3Var.setOnEditorActionListener(new m.u2(v6Var, 2));
        f3Var.setHandlesColor(-12476440);
        f3Var.setCursorColor(-11230757);
        f3Var.setText("https://");
        f3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        ai.o(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.b.e(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, themedColor);
        int l12 = org.telegram.ui.ActionBar.j6.l1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, l1, l12, l12));
        k7.d6.b(textView, 0.1f, 1.5f);
        h3Var.addView(textView, k7.b6.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        e6 e6Var = new e6(3, this, textView);
        textView.setOnClickListener(new ib0(29, this, e6Var));
        e6Var.run();
        f3Var.addTextChangedListener(new w6(this, e6Var));
        org.telegram.ui.Cells.h3 h3Var2 = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, q4Var);
        this.W = h3Var2;
        v6 v6Var2 = new v6(this, 1);
        org.telegram.ui.Cells.f3 f3Var2 = h3Var2.b;
        f3Var2.setImeOptions(6);
        f3Var2.setOnEditorActionListener(new m.u2(v6Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        d dVar = new d(context, q4Var, true);
        this.Y = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new u6(this, 1));
        dVar.setEnabled(V(h3Var.getText().toString()));
        frameLayout.addView(dVar, k7.b6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.L = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        x6 x6Var = new x6(this);
        x6Var.m = false;
        x6Var.C = false;
        x6Var.o(mr.h);
        x6Var.n(350L);
        this.d.setItemAnimator(x6Var);
        rl0 rl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new nh.e0(this, context, k5Var, 3));
        y6 y6Var = this.U;
        if (y6Var != null) {
            y6Var.N(false);
        }
    }

    public static void P(c7 c7Var, Context context, k5 k5Var, View view, int i10) {
        TLRPC.WebPage webPage;
        org.telegram.ui.Cells.h3 h3Var = c7Var.W;
        org.telegram.ui.Cells.h3 h3Var2 = c7Var.V;
        i51 G = c7Var.U.G(i10 - 1);
        if (G == null) {
            return;
        }
        if (!G.G(a7.class) || (webPage = c7Var.d0) == null || W(webPage)) {
            if (G.d == 2 && (view instanceof org.telegram.ui.Cells.r8)) {
                boolean z4 = !c7Var.j0;
                c7Var.j0 = z4;
                ((org.telegram.ui.Cells.r8) view).setChecked(z4);
                c7Var.U.N(true);
                if (c7Var.j0) {
                    h3Var.requestFocus();
                    return;
                } else {
                    h3Var2.requestFocus();
                    return;
                }
            }
            return;
        }
        dg.y3 y3Var = new dg.y3(context, c7Var.currentAccount);
        dg.f1 f1Var = new dg.f1();
        f1Var.c = h3Var2.b.getText().toString();
        f1Var.b = c7Var.j0 ? h3Var.b.getText().toString() : null;
        TLRPC.WebPage webPage2 = c7Var.d0;
        f1Var.d = webPage2;
        f1Var.e = c7Var.l0;
        f1Var.f = c7Var.k0;
        org.telegram.ui.web.a1 a1Var = new org.telegram.ui.web.a1(c7Var, 10);
        y3Var.D = f1Var;
        int i11 = (webPage2 == null || (webPage2.photo == null && !MessageObject.isVideoDocument(webPage2.document))) ? 8 : 0;
        wb0 wb0Var = y3Var.x;
        wb0Var.setVisibility(i11);
        y3Var.f.b(y3Var.a, f1Var, false);
        y3Var.w.a(!f1Var.f, false);
        wb0Var.a(!f1Var.e, false);
        y3Var.E = a1Var;
        y3Var.e.setImageDrawable(new dg.k1(k5Var, 1));
        y3Var.show();
    }

    public static /* synthetic */ void Q(c7 c7Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = c7Var.V.b.getText().toString();
        c7Var.f0 = ConnectionsManager.getInstance(c7Var.currentAccount).sendRequest(getwebpagepreview, new ff.a(c7Var, 18));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void R(c7 c7Var, TLObject tLObject) {
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        y6 y6Var;
        if (tLObject instanceof TL_account.webPagePreview) {
            TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
            MessagesController.getInstance(c7Var.currentAccount).putUsers(webpagepreview.users, false);
            MessagesController.getInstance(c7Var.currentAccount).putChats(webpagepreview.chats, false);
            TLRPC.MessageMedia messageMedia = webpagepreview.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                if (tL_messageMediaWebPage == null) {
                    TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                    c7Var.d0 = webPage;
                    if (W(webPage)) {
                        TLRPC.WebPage webPage2 = c7Var.d0;
                        c7Var.c0 = webPage2 == null ? 0L : webPage2.id;
                        c7Var.d0 = null;
                    } else {
                        c7Var.c0 = 0L;
                    }
                } else {
                    c7Var.d0 = null;
                    c7Var.c0 = 0L;
                }
                c7Var.e0 = c7Var.c0 != 0;
                y6Var = c7Var.U;
                if (y6Var == null) {
                    y6Var.N(true);
                    return;
                }
                return;
            }
        }
        tL_messageMediaWebPage = null;
        if (tL_messageMediaWebPage == null) {
        }
        c7Var.e0 = c7Var.c0 != 0;
        y6Var = c7Var.U;
        if (y6Var == null) {
        }
    }

    public static void S(c7 c7Var, String str) {
        v6 v6Var = c7Var.h0;
        if (str == null || TextUtils.equals(str, c7Var.g0)) {
            return;
        }
        c7Var.g0 = str;
        boolean V = c7Var.V(str);
        AndroidUtilities.cancelRunOnUIThread(v6Var);
        if (V) {
            if (!c7Var.e0 || c7Var.d0 != null) {
                c7Var.e0 = true;
                c7Var.d0 = null;
                y6 y6Var = c7Var.U;
                if (y6Var != null) {
                    y6Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(v6Var, 700L);
        } else if (c7Var.e0 || c7Var.d0 != null) {
            c7Var.e0 = false;
            c7Var.d0 = null;
            if (c7Var.f0 != 0) {
                ConnectionsManager.getInstance(c7Var.currentAccount).cancelRequest(c7Var.f0, true);
                c7Var.f0 = 0;
            }
            y6 y6Var2 = c7Var.U;
            if (y6Var2 != null) {
                y6Var2.N(true);
            }
        }
        c7Var.Y.setEnabled(V);
    }

    public static boolean W(TLRPC.WebPage webPage) {
        if (webPage instanceof TLRPC.TL_webPagePending) {
            return true;
        }
        return TextUtils.isEmpty(webPage.title) && TextUtils.isEmpty(webPage.description);
    }

    public final void U() {
        this.e0 = false;
        this.d0 = null;
        if (this.f0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f0, true);
            this.f0 = 0;
        }
        y6 y6Var = this.U;
        if (y6Var != null) {
            y6Var.N(true);
        }
    }

    public final boolean V(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.i0 == null) {
            this.i0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.i0.matcher(str).find();
    }

    public final void X() {
        if (this.Y.T) {
            if (this.b0 != null) {
                dg.f1 f1Var = new dg.f1();
                f1Var.c = this.V.b.getText().toString();
                f1Var.b = this.j0 ? this.W.b.getText().toString() : null;
                f1Var.d = this.d0;
                f1Var.e = this.l0;
                f1Var.f = this.k0;
                this.b0.run(f1Var);
                this.b0 = null;
            }
            dismiss();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.didReceivedWebpagesInUpdates || this.c0 == 0) {
            return;
        }
        a0.h hVar = (a0.h) objArr[0];
        for (int i12 = 0; i12 < hVar.m(); i12++) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
            if (webPage != null && this.c0 == webPage.id) {
                if (W(webPage)) {
                    webPage = null;
                }
                this.d0 = webPage;
                this.e0 = false;
                this.c0 = 0L;
                y6 y6Var = this.U;
                if (y6Var != null) {
                    y6Var.N(true);
                    return;
                }
                return;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.V.b);
        AndroidUtilities.hideKeyboard(this.W.b);
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        AndroidUtilities.runOnUIThread(new v6(this, 2), 150L);
    }

    @Override // org.telegram.ui.Components.sa
    public final ql0 v(rl0 rl0Var) {
        y6 y6Var = new y6(this.d, getContext(), this.currentAccount, 0, true, new d4(this, 2), this.resourcesProvider);
        this.U = y6Var;
        return y6Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }
}
