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
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class u0 implements DownloadListener {
    public final /* synthetic */ v0 a;

    public u0(v0 v0Var) {
        this.a = v0Var;
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
        StringBuilder q10 = j3.r0.q("onDownloadStart ", str, " ", str2, " ");
        j3.r0.A(q10, str3, " ", str4, " ");
        q10.append(j10);
        String sb2 = q10.toString();
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
            String escape = AndroidUtilities.escape(guessFileName);
            y yVar = new y(this, str, str4, str2, escape, 2);
            if (DownloadController.getInstance(UserConfig.selectedAccount).canDownloadMedia(8, j10)) {
                yVar.run();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v0Var.getContext());
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = LocaleController.getString(R.string.WebDownloadAlertTitle);
            c2Var.P = AndroidUtilities.replaceTags(j10 > 0 ? LocaleController.formatString(R.string.WebDownloadAlertInfoWithSize, escape, AndroidUtilities.formatFileSize(j10)) : LocaleController.formatString(R.string.WebDownloadAlertInfo, escape));
            alertDialog$Builder.k(LocaleController.getString(R.string.WebDownloadAlertYes), new kh.p(yVar, 14));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            TextView textView = (TextView) alertDialog$Builder.o().d(-2);
            if (textView != null) {
                textView.setTextColor(f6.w0(null, f6.q7, false));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
