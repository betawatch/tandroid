package org.telegram.ui.web;

import android.net.Uri;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.widget.TextView;
import java.util.List;
import mh.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        StringBuilder m9 = yh.m("onDownloadStart ", str, " ", str2, " ");
        yh.w(m9, str3, " ", str4, " ");
        m9.append(j10);
        String sb = m9.toString();
        x0 x0Var = this.a;
        x0Var.c(sb);
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
            z zVar = new z(this, str, str4, str2, escape, 2);
            if (DownloadController.getInstance(UserConfig.selectedAccount).canDownloadMedia(8, j10)) {
                zVar.run();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x0Var.getContext());
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.O = LocaleController.getString(R.string.WebDownloadAlertTitle);
            d2Var.Q = AndroidUtilities.replaceTags(j10 > 0 ? LocaleController.formatString(R.string.WebDownloadAlertInfoWithSize, escape, AndroidUtilities.formatFileSize(j10)) : LocaleController.formatString(R.string.WebDownloadAlertInfo, escape));
            alertDialog$Builder.k(LocaleController.getString(R.string.WebDownloadAlertYes), new m5(zVar, 20));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            TextView textView = (TextView) alertDialog$Builder.o().d(-2);
            if (textView != null) {
                textView.setTextColor(k6.w0(null, k6.q7, false));
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }
}
