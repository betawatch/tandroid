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
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class x0 implements DownloadListener {
    public final /* synthetic */ y0 a;

    public x0(y0 y0Var) {
        this.a = y0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.substring(r6 + 1)) == false) goto L13;
     */
    @Override // android.webkit.DownloadListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j3) {
        String guessFileName;
        StringBuilder w10 = a4.a.w("onDownloadStart ", str, " ", str2, " ");
        a4.a.z(w10, str3, " ", str4, " ");
        w10.append(j3);
        String sb2 = w10.toString();
        y0 y0Var = this.a;
        y0Var.c(sb2);
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
            if (DownloadController.getInstance(UserConfig.selectedAccount).canDownloadMedia(8, j3)) {
                b0Var.run();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y0Var.getContext());
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.R = LocaleController.getString(R.string.WebDownloadAlertTitle);
            d2Var.T = AndroidUtilities.replaceTags(j3 > 0 ? LocaleController.formatString(R.string.WebDownloadAlertInfoWithSize, escape, AndroidUtilities.formatFileSize(j3)) : LocaleController.formatString(R.string.WebDownloadAlertInfo, escape));
            alertDialog$Builder.k(LocaleController.getString(R.string.WebDownloadAlertYes), new org.telegram.tgnet.j(b0Var, 6));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            TextView textView = (TextView) alertDialog$Builder.o().d(-2);
            if (textView != null) {
                textView.setTextColor(j6.w0(null, j6.q7, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
