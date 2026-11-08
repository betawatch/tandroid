package org.telegram.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class uk0 extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ hl0 c;

    public /* synthetic */ uk0(hl0 hl0Var, Context context, int i7) {
        this.a = i7;
        this.c = hl0Var;
        this.b = context;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        switch (this.a) {
            case 0:
                super.onPageFinished(webView, str);
                hl0 hl0Var = this.c;
                hl0Var.z0 = false;
                hl0Var.N0(true, false);
                hl0Var.Q0();
                break;
            default:
                super.onPageFinished(webView, str);
                hl0 hl0Var2 = this.c;
                hl0Var2.z0 = false;
                hl0Var2.N0(true, false);
                hl0Var2.Q0();
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i7 = this.a;
        hl0 hl0Var = this.c;
        switch (i7) {
            case 0:
                try {
                    if (!org.telegram.messenger.g0.M1(hl0Var.getParentActivity())) {
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, hl0Var.getParentActivity(), hl0Var.Y0);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = org.telegram.messenger.id.M0(2131752104, null);
                        u1Var.T = org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131752105, null), new ef0(this, 10));
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
                        alertDialog$Builder.p();
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return false;
                }
            default:
                try {
                    if (!org.telegram.messenger.g0.M1(hl0Var.getParentActivity())) {
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, hl0Var.getParentActivity(), hl0Var.Y0);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                        u1Var2.R = org.telegram.messenger.id.M0(2131752104, null);
                        u1Var2.T = org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131752105, null), new ef0(this, 12));
                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747832, null), null);
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
        int i7 = this.a;
        Context context = this.b;
        boolean z9 = true;
        hl0 hl0Var = this.c;
        switch (i7) {
            case 0:
                try {
                    Uri parse2 = Uri.parse(str);
                    if ("t.me".equals(parse2.getHost())) {
                        hl0Var.z0();
                    } else if (!hl0.h1.contains(parse2.getScheme())) {
                        if (hl0.g1.contains(parse2.getScheme())) {
                            return false;
                        }
                        try {
                            if (hl0Var.getParentActivity() != null) {
                                hl0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse2), org.telegram.messenger.qs.n3);
                            }
                        } catch (ActivityNotFoundException unused) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.R = hl0Var.p0;
                            u1Var.T = org.telegram.messenger.id.M0(2131747430, null);
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
                            alertDialog$Builder.p();
                        }
                    }
                    return true;
                } catch (Exception unused2) {
                    return false;
                }
            default:
                hl0Var.D = !str.equals(hl0Var.y);
                try {
                    parse = Uri.parse(str);
                } catch (Exception unused3) {
                    z9 = super.shouldOverrideUrlLoading(webView, str);
                }
                if ("t.me".equals(parse.getHost())) {
                    hl0Var.z0();
                } else if (!hl0.h1.contains(parse.getScheme())) {
                    if (!hl0.g1.contains(parse.getScheme())) {
                        try {
                            if (hl0Var.getParentActivity() != null) {
                                hl0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), org.telegram.messenger.qs.n3);
                            }
                        } catch (ActivityNotFoundException unused4) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                            u1Var2.R = hl0Var.p0;
                            u1Var2.T = org.telegram.messenger.id.M0(2131747430, null);
                            alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747832, null), null);
                            alertDialog$Builder2.p();
                        }
                    }
                    z9 = super.shouldOverrideUrlLoading(webView, str);
                }
                return z9;
        }
    }
}
