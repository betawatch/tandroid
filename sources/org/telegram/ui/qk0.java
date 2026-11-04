package org.telegram.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qk0 extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ dl0 c;

    public /* synthetic */ qk0(dl0 dl0Var, Context context, int i3) {
        this.a = i3;
        this.c = dl0Var;
        this.b = context;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        switch (this.a) {
            case 0:
                super.onPageFinished(webView, str);
                dl0 dl0Var = this.c;
                dl0Var.A0 = false;
                dl0Var.N0(true, false);
                dl0Var.Q0();
                break;
            default:
                super.onPageFinished(webView, str);
                dl0 dl0Var2 = this.c;
                dl0Var2.A0 = false;
                dl0Var2.N0(true, false);
                dl0Var2.Q0();
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i3 = this.a;
        dl0 dl0Var = this.c;
        switch (i3) {
            case 0:
                try {
                    if (!org.telegram.messenger.g0.M1(dl0Var.getParentActivity())) {
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, dl0Var.getParentActivity(), dl0Var.Z0);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = org.telegram.messenger.bd.M0(2131752104, null);
                        s1Var.U = org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131752105, null), new sg0(this, 9));
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        alertDialog$Builder.p();
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return false;
                }
            default:
                try {
                    if (!org.telegram.messenger.g0.M1(dl0Var.getParentActivity())) {
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, dl0Var.getParentActivity(), dl0Var.Z0);
                        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                        s1Var2.S = org.telegram.messenger.bd.M0(2131752104, null);
                        s1Var2.U = org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131752105, null), new sg0(this, 11));
                        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        alertDialog$Builder2.p();
                        break;
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return false;
                }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        r8 = super.shouldOverrideUrlLoading(r13, r14);
     */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse;
        int i3 = this.a;
        Context context = this.b;
        boolean z10 = true;
        dl0 dl0Var = this.c;
        switch (i3) {
            case 0:
                try {
                    Uri parse2 = Uri.parse(str);
                    if ("t.me".equals(parse2.getHost())) {
                        dl0Var.z0();
                    } else if (!dl0.i1.contains(parse2.getScheme())) {
                        if (dl0.h1.contains(parse2.getScheme())) {
                            return false;
                        }
                        try {
                            if (dl0Var.getParentActivity() != null) {
                                dl0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse2), org.telegram.messenger.hs.n3);
                            }
                        } catch (ActivityNotFoundException unused) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            s1Var.S = dl0Var.q0;
                            s1Var.U = org.telegram.messenger.bd.M0(2131747437, null);
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                            alertDialog$Builder.p();
                        }
                    }
                    return true;
                } catch (Exception unused2) {
                    return false;
                }
            default:
                dl0Var.E = !str.equals(dl0Var.y);
                try {
                    parse = Uri.parse(str);
                } catch (Exception unused3) {
                    z10 = super.shouldOverrideUrlLoading(webView, str);
                }
                if ("t.me".equals(parse.getHost())) {
                    dl0Var.z0();
                } else if (!dl0.i1.contains(parse.getScheme())) {
                    if (!dl0.h1.contains(parse.getScheme())) {
                        try {
                            if (dl0Var.getParentActivity() != null) {
                                dl0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), org.telegram.messenger.hs.n3);
                            }
                        } catch (ActivityNotFoundException unused4) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                            s1Var2.S = dl0Var.q0;
                            s1Var2.U = org.telegram.messenger.bd.M0(2131747437, null);
                            alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                            alertDialog$Builder2.p();
                        }
                    }
                    z10 = super.shouldOverrideUrlLoading(webView, str);
                }
                return z10;
        }
    }
}
