package org.telegram.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class wk0 extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ jl0 c;

    public /* synthetic */ wk0(jl0 jl0Var, Context context, int i7) {
        this.a = i7;
        this.c = jl0Var;
        this.b = context;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        switch (this.a) {
            case 0:
                super.onPageFinished(webView, str);
                jl0 jl0Var = this.c;
                jl0Var.z0 = false;
                jl0Var.N0(true, false);
                jl0Var.Q0();
                break;
            default:
                super.onPageFinished(webView, str);
                jl0 jl0Var2 = this.c;
                jl0Var2.z0 = false;
                jl0Var2.N0(true, false);
                jl0Var2.Q0();
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i7 = this.a;
        jl0 jl0Var = this.c;
        switch (i7) {
            case 0:
                try {
                    if (!org.telegram.messenger.g0.M1(jl0Var.getParentActivity())) {
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jl0Var.getParentActivity(), jl0Var.Y0);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = org.telegram.messenger.id.M0(2131752104, null);
                        u1Var.T = org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131752105, null), new gf0(this, 10));
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                        alertDialog$Builder.p();
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return false;
                }
            default:
                try {
                    if (!org.telegram.messenger.g0.M1(jl0Var.getParentActivity())) {
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, jl0Var.getParentActivity(), jl0Var.Y0);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                        u1Var2.R = org.telegram.messenger.id.M0(2131752104, null);
                        u1Var2.T = org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131752105, null), new gf0(this, 12));
                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747831, null), null);
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
        jl0 jl0Var = this.c;
        switch (i7) {
            case 0:
                try {
                    Uri parse2 = Uri.parse(str);
                    if ("t.me".equals(parse2.getHost())) {
                        jl0Var.z0();
                    } else if (!jl0.h1.contains(parse2.getScheme())) {
                        if (jl0.g1.contains(parse2.getScheme())) {
                            return false;
                        }
                        try {
                            if (jl0Var.getParentActivity() != null) {
                                jl0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse2), org.telegram.messenger.qs.n3);
                            }
                        } catch (ActivityNotFoundException unused) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.R = jl0Var.p0;
                            u1Var.T = org.telegram.messenger.id.M0(2131747429, null);
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                            alertDialog$Builder.p();
                        }
                    }
                    return true;
                } catch (Exception unused2) {
                    return false;
                }
            default:
                jl0Var.D = !str.equals(jl0Var.y);
                try {
                    parse = Uri.parse(str);
                } catch (Exception unused3) {
                    z9 = super.shouldOverrideUrlLoading(webView, str);
                }
                if ("t.me".equals(parse.getHost())) {
                    jl0Var.z0();
                } else if (!jl0.h1.contains(parse.getScheme())) {
                    if (!jl0.g1.contains(parse.getScheme())) {
                        try {
                            if (jl0Var.getParentActivity() != null) {
                                jl0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), org.telegram.messenger.qs.n3);
                            }
                        } catch (ActivityNotFoundException unused4) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                            u1Var2.R = jl0Var.p0;
                            u1Var2.T = org.telegram.messenger.id.M0(2131747429, null);
                            alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747831, null), null);
                            alertDialog$Builder2.p();
                        }
                    }
                    z9 = super.shouldOverrideUrlLoading(webView, str);
                }
                return z9;
        }
    }
}
