package org.telegram.ui.web;

import android.net.Uri;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.z5;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class t0 implements DownloadListener {
    public final /* synthetic */ u0 a;

    public t0(u0 u0Var) {
        this.a = u0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.substring(r2 + 1)) == false) goto L12;
     */
    @Override // android.webkit.DownloadListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j3) {
        String guessFileName;
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("onDownloadStart ", str, " ", str2, " ");
        com.google.android.recaptcha.internal.a.s(n10, str3, " ", str4, " ");
        n10.append(j3);
        String sb2 = n10.toString();
        u0 u0Var = this.a;
        u0Var.c(sb2);
        try {
            if (str.startsWith("blob:")) {
                return;
            }
            try {
                List<String> pathSegments = Uri.parse(str).getPathSegments();
                guessFileName = pathSegments.get(pathSegments.size() - 1);
                int lastIndexOf = guessFileName.lastIndexOf(".");
                if (lastIndexOf > 0) {
                }
            } catch (Exception unused) {
            }
            guessFileName = URLUtil.guessFileName(str, str3, str4);
            String U = org.telegram.messenger.g0.U(guessFileName);
            x xVar = new x(this, str, str4, str2, U, 4);
            if (z5.q(p10.s0).c(8, j3)) {
                xVar.run();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u0Var.getContext());
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = id.M0(2131742933, null);
            u1Var.T = org.telegram.messenger.g0.X2(j3 > 0 ? id.a0(null, null, 2131742934, U, org.telegram.messenger.g0.i0(j3, false, false)) : id.a0(null, null, 2131742935, U));
            alertDialog$Builder.k(id.M0(2131742932, null), new m3(xVar, 5));
            alertDialog$Builder.h(id.M0(2131752589, null), null);
            TextView textView = (TextView) alertDialog$Builder.p().d(-2);
            if (textView != null) {
                r6.V(textView, k6.q7, null);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
