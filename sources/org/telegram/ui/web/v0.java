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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class v0 implements DownloadListener {
    public final /* synthetic */ w0 a;

    public v0(w0 w0Var) {
        this.a = w0Var;
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
        StringBuilder k9 = th.k("onDownloadStart ", str, " ", str2, " ");
        th.w(k9, str3, " ", str4, " ");
        k9.append(j10);
        String sb2 = k9.toString();
        w0 w0Var = this.a;
        w0Var.c(sb2);
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
            a0 a0Var = new a0(this, str, str4, str2, escape, 2);
            if (DownloadController.getInstance(UserConfig.selectedAccount).canDownloadMedia(8, j10)) {
                a0Var.run();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w0Var.getContext());
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = LocaleController.getString(R.string.WebDownloadAlertTitle);
            c2Var.P = AndroidUtilities.replaceTags(j10 > 0 ? LocaleController.formatString(R.string.WebDownloadAlertInfoWithSize, escape, AndroidUtilities.formatFileSize(j10)) : LocaleController.formatString(R.string.WebDownloadAlertInfo, escape));
            alertDialog$Builder.k(LocaleController.getString(R.string.WebDownloadAlertYes), new l4.s0(a0Var, 23));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            TextView textView = (TextView) alertDialog$Builder.o().d(-2);
            if (textView != null) {
                textView.setTextColor(g6.w0(null, g6.q7, false));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
