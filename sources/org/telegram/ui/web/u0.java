package org.telegram.ui.web;

import android.net.Uri;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.b6;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class u0 implements DownloadListener {
    public final /* synthetic */ v0 a;

    public u0(v0 v0Var) {
        this.a = v0Var;
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
        StringBuilder v = a1.g.v("onDownloadStart ", str, " ", str2, " ");
        c3.i0.r(v, str3, " ", str4, " ");
        v.append(j10);
        String sb2 = v.toString();
        v0 v0Var = this.a;
        v0Var.c(sb2);
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
            String U = org.telegram.messenger.i0.U(guessFileName);
            x xVar = new x(this, str, str4, str2, U, 4);
            if (b6.q(e20.s0).c(8, j10)) {
                xVar.run();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v0Var.getContext());
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = dd.L0(2131742956, null);
            x1Var.T = org.telegram.messenger.i0.W2(j10 > 0 ? dd.a0(null, null, 2131742957, U, org.telegram.messenger.i0.i0(j10, false, false)) : dd.a0(null, null, 2131742958, U));
            alertDialog$Builder.k(dd.L0(2131742955, null), new mg.l(xVar, 17));
            alertDialog$Builder.h(dd.L0(2131752589, null), null);
            TextView textView = (TextView) alertDialog$Builder.p().d(-2);
            if (textView != null) {
                a7.V(textView, t6.q7, null);
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
