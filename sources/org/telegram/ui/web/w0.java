package org.telegram.ui.web;

import android.net.Uri;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class w0 implements DownloadListener {
    public final /* synthetic */ x0 a;

    public w0(x0 x0Var) {
        this.a = x0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.substring(r6 + 1)) == false) goto L13;
     */
    @Override // android.webkit.DownloadListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        String guessFileName;
        StringBuilder w10 = a1.g.w("onDownloadStart ", str, " ", str2, " ");
        c3.h0.r(w10, str3, " ", str4, " ");
        w10.append(j10);
        String sb2 = w10.toString();
        x0 x0Var = this.a;
        x0Var.c(sb2);
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
            String escape = AndroidUtilities.escape(guessFileName);
            b0 b0Var = new b0(this, str, str4, str2, escape, 4);
            if (DownloadController.getInstance(UserConfig.selectedAccount).canDownloadMedia(8, j10)) {
                b0Var.run();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x0Var.getContext());
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.R = LocaleController.getString(R.string.WebDownloadAlertTitle);
            int i10 = 2;
            e2Var.T = AndroidUtilities.replaceTags(j10 > 0 ? LocaleController.formatString(R.string.WebDownloadAlertInfoWithSize, escape, AndroidUtilities.formatFileSize(j10)) : LocaleController.formatString(R.string.WebDownloadAlertInfo, escape));
            alertDialog$Builder.k(LocaleController.getString(R.string.WebDownloadAlertYes), new org.telegram.ui.Components.voip.j1(b0Var, i10));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            TextView textView = (TextView) alertDialog$Builder.p().d(-2);
            if (textView != null) {
                f7.V(textView, y6.q7, null);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
