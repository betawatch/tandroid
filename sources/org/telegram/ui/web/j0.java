package org.telegram.ui.web;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.WebView;
import java.net.URLDecoder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class j0 implements View.OnLongClickListener {
    public final /* synthetic */ x0 a;

    public j0(x0 x0Var) {
        this.a = x0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.a.getHitTestResult();
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            final int i10 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.web.h0
                public final /* synthetic */ j0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(7:22|(2:23|24)|(4:28|29|30|31)|37|29|30|31) */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
                
                    r3 = e;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    String str;
                    String str2;
                    Uri parse;
                    String str3;
                    String str4;
                    int i11 = i10;
                    final String str5 = extra;
                    final j0 j0Var = this.b;
                    final int i12 = 1;
                    final int i13 = 0;
                    switch (i11) {
                        case 0:
                            x0 x0Var = j0Var.a;
                            h3 o10 = y3.o(x0Var.getContext(), null, false, false);
                            try {
                                parse = Uri.parse(str5);
                            } catch (Exception e6) {
                                try {
                                    FileLog.e((Throwable) e6, false);
                                } catch (Exception e10) {
                                    e = e10;
                                    str = str5;
                                    FileLog.e(e);
                                    str2 = str;
                                    o10.multipleLinesTitle = true;
                                    o10.title = str2;
                                    o10.bigTitle = false;
                                    CharSequence[] charSequenceArr = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.i0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i14) {
                                            int i15 = i12;
                                            String str6 = str5;
                                            j0 j0Var2 = j0Var;
                                            switch (i15) {
                                                case 0:
                                                    x0 x0Var2 = j0Var2.a;
                                                    if (i14 != 0) {
                                                        if (i14 != 1) {
                                                            if (i14 == 2) {
                                                                AndroidUtilities.addToClipboard(str6);
                                                                a1 a1Var = x0Var2.N;
                                                                if (a1Var != null) {
                                                                    new qc(a1Var, a1Var.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                String guessFileName = URLUtil.guessFileName(str6, null, "image/*");
                                                                if (guessFileName == null) {
                                                                    guessFileName = "image.png";
                                                                }
                                                                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str6));
                                                                request.setMimeType("image/*");
                                                                request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) x0Var2.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                a1 a1Var2 = x0Var2.N;
                                                                if (a1Var2 != null) {
                                                                    new qc(a1Var2, a1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                                    break;
                                                                }
                                                            } catch (Exception e11) {
                                                                FileLog.e(e11);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", x0Var2.getContext().getPackageName());
                                                            x0Var2.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e12) {
                                                            FileLog.e(e12);
                                                            x0Var2.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    x0 x0Var3 = j0Var2.a;
                                                    if (i14 != 0) {
                                                        if (i14 != 1) {
                                                            if (i14 == 2) {
                                                                AndroidUtilities.addToClipboard(str6);
                                                                a1 a1Var3 = x0Var3.N;
                                                                if (a1Var3 != null) {
                                                                    new qc(a1Var3, a1Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", x0Var3.getContext().getPackageName());
                                                                x0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e13) {
                                                                FileLog.e(e13);
                                                                x0Var3.loadUrl(str6);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        x0Var3.loadUrl(str6);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    o10.items = charSequenceArr;
                                    o10.onClickListener = onClickListener;
                                    o10.show();
                                    x0Var.C = o10;
                                    return;
                                }
                            }
                            if (parse != null && !parse.getScheme().equalsIgnoreCase("data")) {
                                str = af.g.v(parse, null, null, af.g.a(parse.getHost()), null);
                                str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                                o10.multipleLinesTitle = true;
                                o10.title = str2;
                                o10.bigTitle = false;
                                CharSequence[] charSequenceArr2 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                                DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.i0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i14) {
                                        int i15 = i12;
                                        String str6 = str5;
                                        j0 j0Var2 = j0Var;
                                        switch (i15) {
                                            case 0:
                                                x0 x0Var2 = j0Var2.a;
                                                if (i14 != 0) {
                                                    if (i14 != 1) {
                                                        if (i14 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            a1 a1Var = x0Var2.N;
                                                            if (a1Var != null) {
                                                                new qc(a1Var, a1Var.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            String guessFileName = URLUtil.guessFileName(str6, null, "image/*");
                                                            if (guessFileName == null) {
                                                                guessFileName = "image.png";
                                                            }
                                                            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str6));
                                                            request.setMimeType("image/*");
                                                            request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) x0Var2.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            a1 a1Var2 = x0Var2.N;
                                                            if (a1Var2 != null) {
                                                                new qc(a1Var2, a1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e11) {
                                                            FileLog.e(e11);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", x0Var2.getContext().getPackageName());
                                                        x0Var2.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e12) {
                                                        FileLog.e(e12);
                                                        x0Var2.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                x0 x0Var3 = j0Var2.a;
                                                if (i14 != 0) {
                                                    if (i14 != 1) {
                                                        if (i14 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            a1 a1Var3 = x0Var3.N;
                                                            if (a1Var3 != null) {
                                                                new qc(a1Var3, a1Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", x0Var3.getContext().getPackageName());
                                                            x0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e13) {
                                                            FileLog.e(e13);
                                                            x0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    x0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                o10.items = charSequenceArr2;
                                o10.onClickListener = onClickListener2;
                                o10.show();
                                x0Var.C = o10;
                            }
                            str = str5;
                            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                            o10.multipleLinesTitle = true;
                            o10.title = str2;
                            o10.bigTitle = false;
                            CharSequence[] charSequenceArr22 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                            DialogInterface.OnClickListener onClickListener22 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.i0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i14) {
                                    int i15 = i12;
                                    String str6 = str5;
                                    j0 j0Var2 = j0Var;
                                    switch (i15) {
                                        case 0:
                                            x0 x0Var2 = j0Var2.a;
                                            if (i14 != 0) {
                                                if (i14 != 1) {
                                                    if (i14 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        a1 a1Var = x0Var2.N;
                                                        if (a1Var != null) {
                                                            new qc(a1Var, a1Var.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        String guessFileName = URLUtil.guessFileName(str6, null, "image/*");
                                                        if (guessFileName == null) {
                                                            guessFileName = "image.png";
                                                        }
                                                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str6));
                                                        request.setMimeType("image/*");
                                                        request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) x0Var2.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        a1 a1Var2 = x0Var2.N;
                                                        if (a1Var2 != null) {
                                                            new qc(a1Var2, a1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", x0Var2.getContext().getPackageName());
                                                    x0Var2.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e12) {
                                                    FileLog.e(e12);
                                                    x0Var2.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            x0 x0Var3 = j0Var2.a;
                                            if (i14 != 0) {
                                                if (i14 != 1) {
                                                    if (i14 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        a1 a1Var3 = x0Var3.N;
                                                        if (a1Var3 != null) {
                                                            new qc(a1Var3, a1Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", x0Var3.getContext().getPackageName());
                                                        x0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e13) {
                                                        FileLog.e(e13);
                                                        x0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                x0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            o10.items = charSequenceArr22;
                            o10.onClickListener = onClickListener22;
                            o10.show();
                            x0Var.C = o10;
                            break;
                        default:
                            x0 x0Var2 = j0Var.a;
                            h3 o11 = y3.o(x0Var2.getContext(), null, false, false);
                            try {
                                Uri parse2 = Uri.parse(str5);
                                str3 = af.g.v(parse2, null, null, af.g.a(parse2.getHost()), null);
                            } catch (Exception e11) {
                                try {
                                    FileLog.e((Throwable) e11, false);
                                    str3 = str5;
                                } catch (Exception e12) {
                                    e = e12;
                                    str3 = str5;
                                    FileLog.e(e);
                                    str4 = str3;
                                    o11.multipleLinesTitle = true;
                                    o11.title = str4;
                                    o11.bigTitle = false;
                                    CharSequence[] charSequenceArr3 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                                    DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.i0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i14) {
                                            int i15 = i13;
                                            String str6 = str5;
                                            j0 j0Var2 = j0Var;
                                            switch (i15) {
                                                case 0:
                                                    x0 x0Var22 = j0Var2.a;
                                                    if (i14 != 0) {
                                                        if (i14 != 1) {
                                                            if (i14 == 2) {
                                                                AndroidUtilities.addToClipboard(str6);
                                                                a1 a1Var = x0Var22.N;
                                                                if (a1Var != null) {
                                                                    new qc(a1Var, a1Var.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                String guessFileName = URLUtil.guessFileName(str6, null, "image/*");
                                                                if (guessFileName == null) {
                                                                    guessFileName = "image.png";
                                                                }
                                                                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str6));
                                                                request.setMimeType("image/*");
                                                                request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) x0Var22.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                a1 a1Var2 = x0Var22.N;
                                                                if (a1Var2 != null) {
                                                                    new qc(a1Var2, a1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                                    break;
                                                                }
                                                            } catch (Exception e112) {
                                                                FileLog.e(e112);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", x0Var22.getContext().getPackageName());
                                                            x0Var22.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e122) {
                                                            FileLog.e(e122);
                                                            x0Var22.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    x0 x0Var3 = j0Var2.a;
                                                    if (i14 != 0) {
                                                        if (i14 != 1) {
                                                            if (i14 == 2) {
                                                                AndroidUtilities.addToClipboard(str6);
                                                                a1 a1Var3 = x0Var3.N;
                                                                if (a1Var3 != null) {
                                                                    new qc(a1Var3, a1Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", x0Var3.getContext().getPackageName());
                                                                x0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e13) {
                                                                FileLog.e(e13);
                                                                x0Var3.loadUrl(str6);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        x0Var3.loadUrl(str6);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    o11.items = charSequenceArr3;
                                    o11.onClickListener = onClickListener3;
                                    o11.show();
                                    x0Var2.C = o11;
                                }
                            }
                            try {
                                str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e13) {
                                e = e13;
                                FileLog.e(e);
                                str4 = str3;
                                o11.multipleLinesTitle = true;
                                o11.title = str4;
                                o11.bigTitle = false;
                                CharSequence[] charSequenceArr32 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                                DialogInterface.OnClickListener onClickListener32 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.i0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i14) {
                                        int i15 = i13;
                                        String str6 = str5;
                                        j0 j0Var2 = j0Var;
                                        switch (i15) {
                                            case 0:
                                                x0 x0Var22 = j0Var2.a;
                                                if (i14 != 0) {
                                                    if (i14 != 1) {
                                                        if (i14 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            a1 a1Var = x0Var22.N;
                                                            if (a1Var != null) {
                                                                new qc(a1Var, a1Var.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            String guessFileName = URLUtil.guessFileName(str6, null, "image/*");
                                                            if (guessFileName == null) {
                                                                guessFileName = "image.png";
                                                            }
                                                            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str6));
                                                            request.setMimeType("image/*");
                                                            request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) x0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            a1 a1Var2 = x0Var22.N;
                                                            if (a1Var2 != null) {
                                                                new qc(a1Var2, a1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e112) {
                                                            FileLog.e(e112);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", x0Var22.getContext().getPackageName());
                                                        x0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e122) {
                                                        FileLog.e(e122);
                                                        x0Var22.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                x0 x0Var3 = j0Var2.a;
                                                if (i14 != 0) {
                                                    if (i14 != 1) {
                                                        if (i14 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            a1 a1Var3 = x0Var3.N;
                                                            if (a1Var3 != null) {
                                                                new qc(a1Var3, a1Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", x0Var3.getContext().getPackageName());
                                                            x0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e132) {
                                                            FileLog.e(e132);
                                                            x0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    x0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                o11.items = charSequenceArr32;
                                o11.onClickListener = onClickListener32;
                                o11.show();
                                x0Var2.C = o11;
                            }
                            o11.multipleLinesTitle = true;
                            o11.title = str4;
                            o11.bigTitle = false;
                            CharSequence[] charSequenceArr322 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                            DialogInterface.OnClickListener onClickListener322 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.i0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i14) {
                                    int i15 = i13;
                                    String str6 = str5;
                                    j0 j0Var2 = j0Var;
                                    switch (i15) {
                                        case 0:
                                            x0 x0Var22 = j0Var2.a;
                                            if (i14 != 0) {
                                                if (i14 != 1) {
                                                    if (i14 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        a1 a1Var = x0Var22.N;
                                                        if (a1Var != null) {
                                                            new qc(a1Var, a1Var.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        String guessFileName = URLUtil.guessFileName(str6, null, "image/*");
                                                        if (guessFileName == null) {
                                                            guessFileName = "image.png";
                                                        }
                                                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str6));
                                                        request.setMimeType("image/*");
                                                        request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) x0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        a1 a1Var2 = x0Var22.N;
                                                        if (a1Var2 != null) {
                                                            new qc(a1Var2, a1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e112) {
                                                        FileLog.e(e112);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", x0Var22.getContext().getPackageName());
                                                    x0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e122) {
                                                    FileLog.e(e122);
                                                    x0Var22.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            x0 x0Var3 = j0Var2.a;
                                            if (i14 != 0) {
                                                if (i14 != 1) {
                                                    if (i14 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        a1 a1Var3 = x0Var3.N;
                                                        if (a1Var3 != null) {
                                                            new qc(a1Var3, a1Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", x0Var3.getContext().getPackageName());
                                                        x0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e132) {
                                                        FileLog.e(e132);
                                                        x0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                x0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            o11.items = charSequenceArr322;
                            o11.onClickListener = onClickListener322;
                            o11.show();
                            x0Var2.C = o11;
                    }
                }
            });
            return true;
        }
        if (hitTestResult.getType() != 5) {
            return false;
        }
        final String extra2 = hitTestResult.getExtra();
        final int i11 = 1;
        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.web.h0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(7:22|(2:23|24)|(4:28|29|30|31)|37|29|30|31) */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
            
                r3 = e;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                String str;
                String str2;
                Uri parse;
                String str3;
                String str4;
                int i112 = i11;
                final String str5 = extra2;
                final j0 j0Var = this.b;
                final int i12 = 1;
                final int i13 = 0;
                switch (i112) {
                    case 0:
                        x0 x0Var = j0Var.a;
                        h3 o10 = y3.o(x0Var.getContext(), null, false, false);
                        try {
                            parse = Uri.parse(str5);
                        } catch (Exception e6) {
                            try {
                                FileLog.e((Throwable) e6, false);
                            } catch (Exception e10) {
                                e = e10;
                                str = str5;
                                FileLog.e(e);
                                str2 = str;
                                o10.multipleLinesTitle = true;
                                o10.title = str2;
                                o10.bigTitle = false;
                                CharSequence[] charSequenceArr22 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                                DialogInterface.OnClickListener onClickListener22 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.i0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i14) {
                                        int i15 = i12;
                                        String str6 = str5;
                                        j0 j0Var2 = j0Var;
                                        switch (i15) {
                                            case 0:
                                                x0 x0Var22 = j0Var2.a;
                                                if (i14 != 0) {
                                                    if (i14 != 1) {
                                                        if (i14 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            a1 a1Var = x0Var22.N;
                                                            if (a1Var != null) {
                                                                new qc(a1Var, a1Var.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            String guessFileName = URLUtil.guessFileName(str6, null, "image/*");
                                                            if (guessFileName == null) {
                                                                guessFileName = "image.png";
                                                            }
                                                            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str6));
                                                            request.setMimeType("image/*");
                                                            request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) x0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            a1 a1Var2 = x0Var22.N;
                                                            if (a1Var2 != null) {
                                                                new qc(a1Var2, a1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e112) {
                                                            FileLog.e(e112);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", x0Var22.getContext().getPackageName());
                                                        x0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e122) {
                                                        FileLog.e(e122);
                                                        x0Var22.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                x0 x0Var3 = j0Var2.a;
                                                if (i14 != 0) {
                                                    if (i14 != 1) {
                                                        if (i14 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            a1 a1Var3 = x0Var3.N;
                                                            if (a1Var3 != null) {
                                                                new qc(a1Var3, a1Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", x0Var3.getContext().getPackageName());
                                                            x0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e132) {
                                                            FileLog.e(e132);
                                                            x0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    x0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                o10.items = charSequenceArr22;
                                o10.onClickListener = onClickListener22;
                                o10.show();
                                x0Var.C = o10;
                                return;
                            }
                        }
                        if (parse != null && !parse.getScheme().equalsIgnoreCase("data")) {
                            str = af.g.v(parse, null, null, af.g.a(parse.getHost()), null);
                            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                            o10.multipleLinesTitle = true;
                            o10.title = str2;
                            o10.bigTitle = false;
                            CharSequence[] charSequenceArr222 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                            DialogInterface.OnClickListener onClickListener222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.i0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i14) {
                                    int i15 = i12;
                                    String str6 = str5;
                                    j0 j0Var2 = j0Var;
                                    switch (i15) {
                                        case 0:
                                            x0 x0Var22 = j0Var2.a;
                                            if (i14 != 0) {
                                                if (i14 != 1) {
                                                    if (i14 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        a1 a1Var = x0Var22.N;
                                                        if (a1Var != null) {
                                                            new qc(a1Var, a1Var.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        String guessFileName = URLUtil.guessFileName(str6, null, "image/*");
                                                        if (guessFileName == null) {
                                                            guessFileName = "image.png";
                                                        }
                                                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str6));
                                                        request.setMimeType("image/*");
                                                        request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) x0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        a1 a1Var2 = x0Var22.N;
                                                        if (a1Var2 != null) {
                                                            new qc(a1Var2, a1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e112) {
                                                        FileLog.e(e112);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", x0Var22.getContext().getPackageName());
                                                    x0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e122) {
                                                    FileLog.e(e122);
                                                    x0Var22.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            x0 x0Var3 = j0Var2.a;
                                            if (i14 != 0) {
                                                if (i14 != 1) {
                                                    if (i14 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        a1 a1Var3 = x0Var3.N;
                                                        if (a1Var3 != null) {
                                                            new qc(a1Var3, a1Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", x0Var3.getContext().getPackageName());
                                                        x0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e132) {
                                                        FileLog.e(e132);
                                                        x0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                x0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            o10.items = charSequenceArr222;
                            o10.onClickListener = onClickListener222;
                            o10.show();
                            x0Var.C = o10;
                        }
                        str = str5;
                        str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                        o10.multipleLinesTitle = true;
                        o10.title = str2;
                        o10.bigTitle = false;
                        CharSequence[] charSequenceArr2222 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                        DialogInterface.OnClickListener onClickListener2222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.i0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i14) {
                                int i15 = i12;
                                String str6 = str5;
                                j0 j0Var2 = j0Var;
                                switch (i15) {
                                    case 0:
                                        x0 x0Var22 = j0Var2.a;
                                        if (i14 != 0) {
                                            if (i14 != 1) {
                                                if (i14 == 2) {
                                                    AndroidUtilities.addToClipboard(str6);
                                                    a1 a1Var = x0Var22.N;
                                                    if (a1Var != null) {
                                                        new qc(a1Var, a1Var.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    String guessFileName = URLUtil.guessFileName(str6, null, "image/*");
                                                    if (guessFileName == null) {
                                                        guessFileName = "image.png";
                                                    }
                                                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str6));
                                                    request.setMimeType("image/*");
                                                    request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                    request.setNotificationVisibility(1);
                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                    DownloadManager downloadManager = (DownloadManager) x0Var22.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    a1 a1Var2 = x0Var22.N;
                                                    if (a1Var2 != null) {
                                                        new qc(a1Var2, a1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                        break;
                                                    }
                                                } catch (Exception e112) {
                                                    FileLog.e(e112);
                                                    return;
                                                }
                                            }
                                        } else {
                                            try {
                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                intent.putExtra("create_new_tab", true);
                                                intent.putExtra("com.android.browser.application_id", x0Var22.getContext().getPackageName());
                                                x0Var22.getContext().startActivity(intent);
                                                break;
                                            } catch (Exception e122) {
                                                FileLog.e(e122);
                                                x0Var22.loadUrl(str6);
                                                return;
                                            }
                                        }
                                        break;
                                    default:
                                        x0 x0Var3 = j0Var2.a;
                                        if (i14 != 0) {
                                            if (i14 != 1) {
                                                if (i14 == 2) {
                                                    AndroidUtilities.addToClipboard(str6);
                                                    a1 a1Var3 = x0Var3.N;
                                                    if (a1Var3 != null) {
                                                        new qc(a1Var3, a1Var3.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", x0Var3.getContext().getPackageName());
                                                    x0Var3.getContext().startActivity(intent2);
                                                    break;
                                                } catch (Exception e132) {
                                                    FileLog.e(e132);
                                                    x0Var3.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                        } else {
                                            x0Var3.loadUrl(str6);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        o10.items = charSequenceArr2222;
                        o10.onClickListener = onClickListener2222;
                        o10.show();
                        x0Var.C = o10;
                        break;
                    default:
                        x0 x0Var2 = j0Var.a;
                        h3 o11 = y3.o(x0Var2.getContext(), null, false, false);
                        try {
                            Uri parse2 = Uri.parse(str5);
                            str3 = af.g.v(parse2, null, null, af.g.a(parse2.getHost()), null);
                        } catch (Exception e11) {
                            try {
                                FileLog.e((Throwable) e11, false);
                                str3 = str5;
                            } catch (Exception e12) {
                                e = e12;
                                str3 = str5;
                                FileLog.e(e);
                                str4 = str3;
                                o11.multipleLinesTitle = true;
                                o11.title = str4;
                                o11.bigTitle = false;
                                CharSequence[] charSequenceArr322 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                                DialogInterface.OnClickListener onClickListener322 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.i0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i14) {
                                        int i15 = i13;
                                        String str6 = str5;
                                        j0 j0Var2 = j0Var;
                                        switch (i15) {
                                            case 0:
                                                x0 x0Var22 = j0Var2.a;
                                                if (i14 != 0) {
                                                    if (i14 != 1) {
                                                        if (i14 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            a1 a1Var = x0Var22.N;
                                                            if (a1Var != null) {
                                                                new qc(a1Var, a1Var.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            String guessFileName = URLUtil.guessFileName(str6, null, "image/*");
                                                            if (guessFileName == null) {
                                                                guessFileName = "image.png";
                                                            }
                                                            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str6));
                                                            request.setMimeType("image/*");
                                                            request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) x0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            a1 a1Var2 = x0Var22.N;
                                                            if (a1Var2 != null) {
                                                                new qc(a1Var2, a1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e112) {
                                                            FileLog.e(e112);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", x0Var22.getContext().getPackageName());
                                                        x0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e122) {
                                                        FileLog.e(e122);
                                                        x0Var22.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                x0 x0Var3 = j0Var2.a;
                                                if (i14 != 0) {
                                                    if (i14 != 1) {
                                                        if (i14 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            a1 a1Var3 = x0Var3.N;
                                                            if (a1Var3 != null) {
                                                                new qc(a1Var3, a1Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", x0Var3.getContext().getPackageName());
                                                            x0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e132) {
                                                            FileLog.e(e132);
                                                            x0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    x0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                o11.items = charSequenceArr322;
                                o11.onClickListener = onClickListener322;
                                o11.show();
                                x0Var2.C = o11;
                            }
                        }
                        try {
                            str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                        } catch (Exception e13) {
                            e = e13;
                            FileLog.e(e);
                            str4 = str3;
                            o11.multipleLinesTitle = true;
                            o11.title = str4;
                            o11.bigTitle = false;
                            CharSequence[] charSequenceArr3222 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                            DialogInterface.OnClickListener onClickListener3222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.i0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i14) {
                                    int i15 = i13;
                                    String str6 = str5;
                                    j0 j0Var2 = j0Var;
                                    switch (i15) {
                                        case 0:
                                            x0 x0Var22 = j0Var2.a;
                                            if (i14 != 0) {
                                                if (i14 != 1) {
                                                    if (i14 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        a1 a1Var = x0Var22.N;
                                                        if (a1Var != null) {
                                                            new qc(a1Var, a1Var.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        String guessFileName = URLUtil.guessFileName(str6, null, "image/*");
                                                        if (guessFileName == null) {
                                                            guessFileName = "image.png";
                                                        }
                                                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str6));
                                                        request.setMimeType("image/*");
                                                        request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) x0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        a1 a1Var2 = x0Var22.N;
                                                        if (a1Var2 != null) {
                                                            new qc(a1Var2, a1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e112) {
                                                        FileLog.e(e112);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", x0Var22.getContext().getPackageName());
                                                    x0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e122) {
                                                    FileLog.e(e122);
                                                    x0Var22.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            x0 x0Var3 = j0Var2.a;
                                            if (i14 != 0) {
                                                if (i14 != 1) {
                                                    if (i14 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        a1 a1Var3 = x0Var3.N;
                                                        if (a1Var3 != null) {
                                                            new qc(a1Var3, a1Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", x0Var3.getContext().getPackageName());
                                                        x0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e132) {
                                                        FileLog.e(e132);
                                                        x0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                x0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            o11.items = charSequenceArr3222;
                            o11.onClickListener = onClickListener3222;
                            o11.show();
                            x0Var2.C = o11;
                        }
                        o11.multipleLinesTitle = true;
                        o11.title = str4;
                        o11.bigTitle = false;
                        CharSequence[] charSequenceArr32222 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                        DialogInterface.OnClickListener onClickListener32222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.i0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i14) {
                                int i15 = i13;
                                String str6 = str5;
                                j0 j0Var2 = j0Var;
                                switch (i15) {
                                    case 0:
                                        x0 x0Var22 = j0Var2.a;
                                        if (i14 != 0) {
                                            if (i14 != 1) {
                                                if (i14 == 2) {
                                                    AndroidUtilities.addToClipboard(str6);
                                                    a1 a1Var = x0Var22.N;
                                                    if (a1Var != null) {
                                                        new qc(a1Var, a1Var.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    String guessFileName = URLUtil.guessFileName(str6, null, "image/*");
                                                    if (guessFileName == null) {
                                                        guessFileName = "image.png";
                                                    }
                                                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str6));
                                                    request.setMimeType("image/*");
                                                    request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                    request.setNotificationVisibility(1);
                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                    DownloadManager downloadManager = (DownloadManager) x0Var22.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    a1 a1Var2 = x0Var22.N;
                                                    if (a1Var2 != null) {
                                                        new qc(a1Var2, a1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                        break;
                                                    }
                                                } catch (Exception e112) {
                                                    FileLog.e(e112);
                                                    return;
                                                }
                                            }
                                        } else {
                                            try {
                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                intent.putExtra("create_new_tab", true);
                                                intent.putExtra("com.android.browser.application_id", x0Var22.getContext().getPackageName());
                                                x0Var22.getContext().startActivity(intent);
                                                break;
                                            } catch (Exception e122) {
                                                FileLog.e(e122);
                                                x0Var22.loadUrl(str6);
                                                return;
                                            }
                                        }
                                        break;
                                    default:
                                        x0 x0Var3 = j0Var2.a;
                                        if (i14 != 0) {
                                            if (i14 != 1) {
                                                if (i14 == 2) {
                                                    AndroidUtilities.addToClipboard(str6);
                                                    a1 a1Var3 = x0Var3.N;
                                                    if (a1Var3 != null) {
                                                        new qc(a1Var3, a1Var3.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", x0Var3.getContext().getPackageName());
                                                    x0Var3.getContext().startActivity(intent2);
                                                    break;
                                                } catch (Exception e132) {
                                                    FileLog.e(e132);
                                                    x0Var3.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                        } else {
                                            x0Var3.loadUrl(str6);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        o11.items = charSequenceArr32222;
                        o11.onClickListener = onClickListener32222;
                        o11.show();
                        x0Var2.C = o11;
                }
            }
        });
        return true;
    }
}
