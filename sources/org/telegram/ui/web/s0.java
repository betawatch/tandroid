package org.telegram.ui.web;

import android.net.Uri;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.z5;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class s0 implements DownloadListener {
    public final /* synthetic */ t0 a;

    public s0(t0 t0Var) {
        this.a = t0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.substring(r2 + 1)) == false) goto L12;
     */
    @Override // android.webkit.DownloadListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        String guessFileName;
        StringBuilder n4 = com.google.android.recaptcha.internal.a.n("onDownloadStart ", str, " ", str2, " ");
        com.google.android.recaptcha.internal.a.s(n4, str3, " ", str4, " ");
        n4.append(j10);
        String sb2 = n4.toString();
        t0 t0Var = this.a;
        t0Var.c(sb2);
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
            y yVar = new y(this, str, str4, str2, U, 4);
            if (z5.q(h10.t0).c(8, j10)) {
                yVar.run();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(t0Var.getContext());
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = bd.M0(2131742940, null);
            s1Var.U = org.telegram.messenger.g0.X2(j10 > 0 ? bd.a0(null, null, 2131742941, U, org.telegram.messenger.g0.i0(j10, false, false)) : bd.a0(null, null, 2131742942, U));
            alertDialog$Builder.k(bd.M0(2131742939, null), new e3(yVar, 5));
            alertDialog$Builder.h(bd.M0(2131752589, null), null);
            TextView textView = (TextView) alertDialog$Builder.p().d(-2);
            if (textView != null) {
                r6.V(textView, k6.q7, null);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
