package org.telegram.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xk0 extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ kl0 c;

    public /* synthetic */ xk0(kl0 kl0Var, Context context, int i7) {
        this.a = i7;
        this.c = kl0Var;
        this.b = context;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        switch (this.a) {
            case 0:
                super.onPageFinished(webView, str);
                kl0 kl0Var = this.c;
                kl0Var.A0 = false;
                kl0Var.N0(true, false);
                kl0Var.Q0();
                break;
            default:
                super.onPageFinished(webView, str);
                kl0 kl0Var2 = this.c;
                kl0Var2.A0 = false;
                kl0Var2.N0(true, false);
                kl0Var2.Q0();
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i7 = this.a;
        kl0 kl0Var = this.c;
        switch (i7) {
            case 0:
                try {
                    if (!org.telegram.messenger.g0.M1(kl0Var.getParentActivity())) {
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, kl0Var.getParentActivity(), kl0Var.Z0);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = org.telegram.messenger.hd.M0(2131752104, null);
                        t1Var.U = org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752105, null), new ef0(this, 10));
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                        alertDialog$Builder.p();
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return false;
                }
            default:
                try {
                    if (!org.telegram.messenger.g0.M1(kl0Var.getParentActivity())) {
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, kl0Var.getParentActivity(), kl0Var.Z0);
                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                        t1Var2.S = org.telegram.messenger.hd.M0(2131752104, null);
                        t1Var2.U = org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752105, null), new ef0(this, 12));
                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747831, null), null);
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
        boolean z10 = true;
        kl0 kl0Var = this.c;
        switch (i7) {
            case 0:
                try {
                    Uri parse2 = Uri.parse(str);
                    if ("t.me".equals(parse2.getHost())) {
                        kl0Var.z0();
                    } else if (!kl0.i1.contains(parse2.getScheme())) {
                        if (kl0.h1.contains(parse2.getScheme())) {
                            return false;
                        }
                        try {
                            if (kl0Var.getParentActivity() != null) {
                                kl0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse2), org.telegram.messenger.ns.n3);
                            }
                        } catch (ActivityNotFoundException unused) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = kl0Var.q0;
                            t1Var.U = org.telegram.messenger.hd.M0(2131747429, null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                            alertDialog$Builder.p();
                        }
                    }
                    return true;
                } catch (Exception unused2) {
                    return false;
                }
            default:
                kl0Var.E = !str.equals(kl0Var.y);
                try {
                    parse = Uri.parse(str);
                } catch (Exception unused3) {
                    z10 = super.shouldOverrideUrlLoading(webView, str);
                }
                if ("t.me".equals(parse.getHost())) {
                    kl0Var.z0();
                } else if (!kl0.i1.contains(parse.getScheme())) {
                    if (!kl0.h1.contains(parse.getScheme())) {
                        try {
                            if (kl0Var.getParentActivity() != null) {
                                kl0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), org.telegram.messenger.ns.n3);
                            }
                        } catch (ActivityNotFoundException unused4) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                            t1Var2.S = kl0Var.q0;
                            t1Var2.U = org.telegram.messenger.hd.M0(2131747429, null);
                            alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                            alertDialog$Builder2.p();
                        }
                    }
                    z10 = super.shouldOverrideUrlLoading(webView, str);
                }
                return z10;
        }
    }
}
