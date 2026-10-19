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
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
        StringBuilder w9 = a1.g.w("onDownloadStart ", str, " ", str2, " ");
        a1.g.A(w9, str3, " ", str4, " ");
        w9.append(j10);
        String sb2 = w9.toString();
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
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.R = LocaleController.getString(R.string.WebDownloadAlertTitle);
            b2Var.T = AndroidUtilities.replaceTags(j10 > 0 ? LocaleController.formatString(R.string.WebDownloadAlertInfoWithSize, escape, AndroidUtilities.formatFileSize(j10)) : LocaleController.formatString(R.string.WebDownloadAlertInfo, escape));
            alertDialog$Builder.k(LocaleController.getString(R.string.WebDownloadAlertYes), new j5.b(b0Var, 28));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            TextView textView = (TextView) alertDialog$Builder.o().d(-2);
            if (textView != null) {
                textView.setTextColor(h6.x0(null, h6.q7, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
