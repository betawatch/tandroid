package org.telegram.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class zk0 extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ml0 c;

    public /* synthetic */ zk0(ml0 ml0Var, Context context, int i7) {
        this.a = i7;
        this.c = ml0Var;
        this.b = context;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        switch (this.a) {
            case 0:
                super.onPageFinished(webView, str);
                ml0 ml0Var = this.c;
                ml0Var.A0 = false;
                ml0Var.N0(true, false);
                ml0Var.Q0();
                break;
            default:
                super.onPageFinished(webView, str);
                ml0 ml0Var2 = this.c;
                ml0Var2.A0 = false;
                ml0Var2.N0(true, false);
                ml0Var2.Q0();
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i7 = this.a;
        ml0 ml0Var = this.c;
        switch (i7) {
            case 0:
                try {
                    if (!org.telegram.messenger.g0.M1(ml0Var.getParentActivity())) {
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ml0Var.getParentActivity(), ml0Var.Z0);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = org.telegram.messenger.hd.N0(2131752092, null);
                        t1Var.U = org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131752093, null), new hf0(this, 10));
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                        alertDialog$Builder.p();
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return false;
                }
            default:
                try {
                    if (!org.telegram.messenger.g0.M1(ml0Var.getParentActivity())) {
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, ml0Var.getParentActivity(), ml0Var.Z0);
                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                        t1Var2.S = org.telegram.messenger.hd.N0(2131752092, null);
                        t1Var2.U = org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131752093, null), new hf0(this, 12));
                        alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131747637, null), null);
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
        ml0 ml0Var = this.c;
        switch (i7) {
            case 0:
                try {
                    Uri parse2 = Uri.parse(str);
                    if ("t.me".equals(parse2.getHost())) {
                        ml0Var.z0();
                    } else if (!ml0.i1.contains(parse2.getScheme())) {
                        if (ml0.h1.contains(parse2.getScheme())) {
                            return false;
                        }
                        try {
                            if (ml0Var.getParentActivity() != null) {
                                ml0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse2), 210);
                            }
                        } catch (ActivityNotFoundException unused) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = ml0Var.q0;
                            t1Var.U = org.telegram.messenger.hd.N0(2131747235, null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                            alertDialog$Builder.p();
                        }
                    }
                    return true;
                } catch (Exception unused2) {
                    return false;
                }
            default:
                ml0Var.E = !str.equals(ml0Var.y);
                try {
                    parse = Uri.parse(str);
                } catch (Exception unused3) {
                    z10 = super.shouldOverrideUrlLoading(webView, str);
                }
                if ("t.me".equals(parse.getHost())) {
                    ml0Var.z0();
                } else if (!ml0.i1.contains(parse.getScheme())) {
                    if (!ml0.h1.contains(parse.getScheme())) {
                        try {
                            if (ml0Var.getParentActivity() != null) {
                                ml0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                            }
                        } catch (ActivityNotFoundException unused4) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                            t1Var2.S = ml0Var.q0;
                            t1Var2.U = org.telegram.messenger.hd.N0(2131747235, null);
                            alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                            alertDialog$Builder2.p();
                        }
                    }
                    z10 = super.shouldOverrideUrlLoading(webView, str);
                }
                return z10;
        }
    }
}
