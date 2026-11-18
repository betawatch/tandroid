package org.telegram.ui.web;

import android.net.Uri;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import java.util.List;
import org.telegram.messenger.a6;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class r0 implements DownloadListener {
    public final /* synthetic */ s0 a;

    public r0(s0 s0Var) {
        this.a = s0Var;
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
        StringBuilder n10 = e2.n("onDownloadStart ", str, " ", str2, " ");
        e2.r(n10, str3, " ", str4, " ");
        n10.append(j3);
        String sb2 = n10.toString();
        s0 s0Var = this.a;
        s0Var.c(sb2);
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
            if (a6.q(j10.t0).c(8, j3)) {
                xVar.run();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s0Var.getContext());
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.S = gd.M0(2131742672, null);
            u1Var.U = org.telegram.messenger.g0.W2(j3 > 0 ? gd.a0(null, null, 2131742673, U, org.telegram.messenger.g0.i0(j3, false, false)) : gd.a0(null, null, 2131742674, U));
            alertDialog$Builder.k(gd.M0(2131742671, null), new org.telegram.ui.ActionBar.p(xVar, 10));
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
            TextView textView = (TextView) alertDialog$Builder.p().d(-2);
            if (textView != null) {
                u6.U(textView, n6.q7, null);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
