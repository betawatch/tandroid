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
import org.telegram.messenger.wl;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class m0 implements View.OnLongClickListener {
    public final /* synthetic */ z0 a;

    public m0(z0 z0Var) {
        this.a = z0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.a.getHitTestResult();
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            final int i10 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.web.k0
                public final /* synthetic */ m0 b;

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
                    final m0 m0Var = this.b;
                    final int i12 = 1;
                    final int i13 = 0;
                    switch (i11) {
                        case 0:
                            z0 z0Var = m0Var.a;
                            f3 i14 = wl.i(1, z0Var.getContext(), null, false);
                            try {
                                parse = Uri.parse(str5);
                            } catch (Exception e7) {
                                try {
                                    FileLog.e((Throwable) e7, false);
                                } catch (Exception e10) {
                                    e = e10;
                                    str = str5;
                                    FileLog.e(e);
                                    str2 = str;
                                    i14.multipleLinesTitle = true;
                                    i14.title = str2;
                                    i14.bigTitle = false;
                                    CharSequence[] charSequenceArr = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.l0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i15) {
                                            int i16 = i12;
                                            String str6 = str5;
                                            m0 m0Var2 = m0Var;
                                            switch (i16) {
                                                case 0:
                                                    z0 z0Var2 = m0Var2.a;
                                                    if (i15 != 0) {
                                                        if (i15 != 1) {
                                                            if (i15 == 2) {
                                                                AndroidUtilities.addToClipboard(str6);
                                                                d1 d1Var = z0Var2.Q;
                                                                if (d1Var != null) {
                                                                    new yc(d1Var, d1Var.e).k(false).k(true);
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
                                                                DownloadManager downloadManager = (DownloadManager) z0Var2.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                d1 d1Var2 = z0Var2.Q;
                                                                if (d1Var2 != null) {
                                                                    new yc(d1Var2, d1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
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
                                                            intent.putExtra("com.android.browser.application_id", z0Var2.getContext().getPackageName());
                                                            z0Var2.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e12) {
                                                            FileLog.e(e12);
                                                            z0Var2.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    z0 z0Var3 = m0Var2.a;
                                                    if (i15 != 0) {
                                                        if (i15 != 1) {
                                                            if (i15 == 2) {
                                                                AndroidUtilities.addToClipboard(str6);
                                                                d1 d1Var3 = z0Var3.Q;
                                                                if (d1Var3 != null) {
                                                                    new yc(d1Var3, d1Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", z0Var3.getContext().getPackageName());
                                                                z0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e13) {
                                                                FileLog.e(e13);
                                                                z0Var3.loadUrl(str6);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        z0Var3.loadUrl(str6);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    i14.items = charSequenceArr;
                                    i14.onClickListener = onClickListener;
                                    i14.show();
                                    z0Var.F = i14;
                                    return;
                                }
                            }
                            if (parse != null && !parse.getScheme().equalsIgnoreCase("data")) {
                                str = of.f.v(parse, null, null, of.f.a(parse.getHost()), null);
                                str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                                i14.multipleLinesTitle = true;
                                i14.title = str2;
                                i14.bigTitle = false;
                                CharSequence[] charSequenceArr2 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                                DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.l0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i15) {
                                        int i16 = i12;
                                        String str6 = str5;
                                        m0 m0Var2 = m0Var;
                                        switch (i16) {
                                            case 0:
                                                z0 z0Var2 = m0Var2.a;
                                                if (i15 != 0) {
                                                    if (i15 != 1) {
                                                        if (i15 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            d1 d1Var = z0Var2.Q;
                                                            if (d1Var != null) {
                                                                new yc(d1Var, d1Var.e).k(false).k(true);
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
                                                            DownloadManager downloadManager = (DownloadManager) z0Var2.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            d1 d1Var2 = z0Var2.Q;
                                                            if (d1Var2 != null) {
                                                                new yc(d1Var2, d1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
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
                                                        intent.putExtra("com.android.browser.application_id", z0Var2.getContext().getPackageName());
                                                        z0Var2.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e12) {
                                                        FileLog.e(e12);
                                                        z0Var2.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                z0 z0Var3 = m0Var2.a;
                                                if (i15 != 0) {
                                                    if (i15 != 1) {
                                                        if (i15 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            d1 d1Var3 = z0Var3.Q;
                                                            if (d1Var3 != null) {
                                                                new yc(d1Var3, d1Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", z0Var3.getContext().getPackageName());
                                                            z0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e13) {
                                                            FileLog.e(e13);
                                                            z0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    z0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                i14.items = charSequenceArr2;
                                i14.onClickListener = onClickListener2;
                                i14.show();
                                z0Var.F = i14;
                            }
                            str = str5;
                            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                            i14.multipleLinesTitle = true;
                            i14.title = str2;
                            i14.bigTitle = false;
                            CharSequence[] charSequenceArr22 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                            DialogInterface.OnClickListener onClickListener22 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.l0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i15) {
                                    int i16 = i12;
                                    String str6 = str5;
                                    m0 m0Var2 = m0Var;
                                    switch (i16) {
                                        case 0:
                                            z0 z0Var2 = m0Var2.a;
                                            if (i15 != 0) {
                                                if (i15 != 1) {
                                                    if (i15 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        d1 d1Var = z0Var2.Q;
                                                        if (d1Var != null) {
                                                            new yc(d1Var, d1Var.e).k(false).k(true);
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
                                                        DownloadManager downloadManager = (DownloadManager) z0Var2.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        d1 d1Var2 = z0Var2.Q;
                                                        if (d1Var2 != null) {
                                                            new yc(d1Var2, d1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
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
                                                    intent.putExtra("com.android.browser.application_id", z0Var2.getContext().getPackageName());
                                                    z0Var2.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e12) {
                                                    FileLog.e(e12);
                                                    z0Var2.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            z0 z0Var3 = m0Var2.a;
                                            if (i15 != 0) {
                                                if (i15 != 1) {
                                                    if (i15 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        d1 d1Var3 = z0Var3.Q;
                                                        if (d1Var3 != null) {
                                                            new yc(d1Var3, d1Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", z0Var3.getContext().getPackageName());
                                                        z0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e13) {
                                                        FileLog.e(e13);
                                                        z0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                z0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            i14.items = charSequenceArr22;
                            i14.onClickListener = onClickListener22;
                            i14.show();
                            z0Var.F = i14;
                            break;
                        default:
                            z0 z0Var2 = m0Var.a;
                            f3 i15 = wl.i(1, z0Var2.getContext(), null, false);
                            try {
                                Uri parse2 = Uri.parse(str5);
                                str3 = of.f.v(parse2, null, null, of.f.a(parse2.getHost()), null);
                            } catch (Exception e11) {
                                try {
                                    FileLog.e((Throwable) e11, false);
                                    str3 = str5;
                                } catch (Exception e12) {
                                    e = e12;
                                    str3 = str5;
                                    FileLog.e(e);
                                    str4 = str3;
                                    i15.multipleLinesTitle = true;
                                    i15.title = str4;
                                    i15.bigTitle = false;
                                    CharSequence[] charSequenceArr3 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                                    DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.l0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i152) {
                                            int i16 = i13;
                                            String str6 = str5;
                                            m0 m0Var2 = m0Var;
                                            switch (i16) {
                                                case 0:
                                                    z0 z0Var22 = m0Var2.a;
                                                    if (i152 != 0) {
                                                        if (i152 != 1) {
                                                            if (i152 == 2) {
                                                                AndroidUtilities.addToClipboard(str6);
                                                                d1 d1Var = z0Var22.Q;
                                                                if (d1Var != null) {
                                                                    new yc(d1Var, d1Var.e).k(false).k(true);
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
                                                                DownloadManager downloadManager = (DownloadManager) z0Var22.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                d1 d1Var2 = z0Var22.Q;
                                                                if (d1Var2 != null) {
                                                                    new yc(d1Var2, d1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
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
                                                            intent.putExtra("com.android.browser.application_id", z0Var22.getContext().getPackageName());
                                                            z0Var22.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e122) {
                                                            FileLog.e(e122);
                                                            z0Var22.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    z0 z0Var3 = m0Var2.a;
                                                    if (i152 != 0) {
                                                        if (i152 != 1) {
                                                            if (i152 == 2) {
                                                                AndroidUtilities.addToClipboard(str6);
                                                                d1 d1Var3 = z0Var3.Q;
                                                                if (d1Var3 != null) {
                                                                    new yc(d1Var3, d1Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", z0Var3.getContext().getPackageName());
                                                                z0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e13) {
                                                                FileLog.e(e13);
                                                                z0Var3.loadUrl(str6);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        z0Var3.loadUrl(str6);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    i15.items = charSequenceArr3;
                                    i15.onClickListener = onClickListener3;
                                    i15.show();
                                    z0Var2.F = i15;
                                }
                            }
                            try {
                                str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e13) {
                                e = e13;
                                FileLog.e(e);
                                str4 = str3;
                                i15.multipleLinesTitle = true;
                                i15.title = str4;
                                i15.bigTitle = false;
                                CharSequence[] charSequenceArr32 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                                DialogInterface.OnClickListener onClickListener32 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.l0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i152) {
                                        int i16 = i13;
                                        String str6 = str5;
                                        m0 m0Var2 = m0Var;
                                        switch (i16) {
                                            case 0:
                                                z0 z0Var22 = m0Var2.a;
                                                if (i152 != 0) {
                                                    if (i152 != 1) {
                                                        if (i152 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            d1 d1Var = z0Var22.Q;
                                                            if (d1Var != null) {
                                                                new yc(d1Var, d1Var.e).k(false).k(true);
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
                                                            DownloadManager downloadManager = (DownloadManager) z0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            d1 d1Var2 = z0Var22.Q;
                                                            if (d1Var2 != null) {
                                                                new yc(d1Var2, d1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
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
                                                        intent.putExtra("com.android.browser.application_id", z0Var22.getContext().getPackageName());
                                                        z0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e122) {
                                                        FileLog.e(e122);
                                                        z0Var22.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                z0 z0Var3 = m0Var2.a;
                                                if (i152 != 0) {
                                                    if (i152 != 1) {
                                                        if (i152 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            d1 d1Var3 = z0Var3.Q;
                                                            if (d1Var3 != null) {
                                                                new yc(d1Var3, d1Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", z0Var3.getContext().getPackageName());
                                                            z0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e132) {
                                                            FileLog.e(e132);
                                                            z0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    z0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                i15.items = charSequenceArr32;
                                i15.onClickListener = onClickListener32;
                                i15.show();
                                z0Var2.F = i15;
                            }
                            i15.multipleLinesTitle = true;
                            i15.title = str4;
                            i15.bigTitle = false;
                            CharSequence[] charSequenceArr322 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                            DialogInterface.OnClickListener onClickListener322 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.l0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i152) {
                                    int i16 = i13;
                                    String str6 = str5;
                                    m0 m0Var2 = m0Var;
                                    switch (i16) {
                                        case 0:
                                            z0 z0Var22 = m0Var2.a;
                                            if (i152 != 0) {
                                                if (i152 != 1) {
                                                    if (i152 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        d1 d1Var = z0Var22.Q;
                                                        if (d1Var != null) {
                                                            new yc(d1Var, d1Var.e).k(false).k(true);
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
                                                        DownloadManager downloadManager = (DownloadManager) z0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        d1 d1Var2 = z0Var22.Q;
                                                        if (d1Var2 != null) {
                                                            new yc(d1Var2, d1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
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
                                                    intent.putExtra("com.android.browser.application_id", z0Var22.getContext().getPackageName());
                                                    z0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e122) {
                                                    FileLog.e(e122);
                                                    z0Var22.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            z0 z0Var3 = m0Var2.a;
                                            if (i152 != 0) {
                                                if (i152 != 1) {
                                                    if (i152 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        d1 d1Var3 = z0Var3.Q;
                                                        if (d1Var3 != null) {
                                                            new yc(d1Var3, d1Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", z0Var3.getContext().getPackageName());
                                                        z0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e132) {
                                                        FileLog.e(e132);
                                                        z0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                z0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            i15.items = charSequenceArr322;
                            i15.onClickListener = onClickListener322;
                            i15.show();
                            z0Var2.F = i15;
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
        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.web.k0
            public final /* synthetic */ m0 b;

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
                final m0 m0Var = this.b;
                final int i12 = 1;
                final int i13 = 0;
                switch (i112) {
                    case 0:
                        z0 z0Var = m0Var.a;
                        f3 i14 = wl.i(1, z0Var.getContext(), null, false);
                        try {
                            parse = Uri.parse(str5);
                        } catch (Exception e7) {
                            try {
                                FileLog.e((Throwable) e7, false);
                            } catch (Exception e10) {
                                e = e10;
                                str = str5;
                                FileLog.e(e);
                                str2 = str;
                                i14.multipleLinesTitle = true;
                                i14.title = str2;
                                i14.bigTitle = false;
                                CharSequence[] charSequenceArr22 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                                DialogInterface.OnClickListener onClickListener22 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.l0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i152) {
                                        int i16 = i12;
                                        String str6 = str5;
                                        m0 m0Var2 = m0Var;
                                        switch (i16) {
                                            case 0:
                                                z0 z0Var22 = m0Var2.a;
                                                if (i152 != 0) {
                                                    if (i152 != 1) {
                                                        if (i152 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            d1 d1Var = z0Var22.Q;
                                                            if (d1Var != null) {
                                                                new yc(d1Var, d1Var.e).k(false).k(true);
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
                                                            DownloadManager downloadManager = (DownloadManager) z0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            d1 d1Var2 = z0Var22.Q;
                                                            if (d1Var2 != null) {
                                                                new yc(d1Var2, d1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
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
                                                        intent.putExtra("com.android.browser.application_id", z0Var22.getContext().getPackageName());
                                                        z0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e122) {
                                                        FileLog.e(e122);
                                                        z0Var22.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                z0 z0Var3 = m0Var2.a;
                                                if (i152 != 0) {
                                                    if (i152 != 1) {
                                                        if (i152 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            d1 d1Var3 = z0Var3.Q;
                                                            if (d1Var3 != null) {
                                                                new yc(d1Var3, d1Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", z0Var3.getContext().getPackageName());
                                                            z0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e132) {
                                                            FileLog.e(e132);
                                                            z0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    z0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                i14.items = charSequenceArr22;
                                i14.onClickListener = onClickListener22;
                                i14.show();
                                z0Var.F = i14;
                                return;
                            }
                        }
                        if (parse != null && !parse.getScheme().equalsIgnoreCase("data")) {
                            str = of.f.v(parse, null, null, of.f.a(parse.getHost()), null);
                            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                            i14.multipleLinesTitle = true;
                            i14.title = str2;
                            i14.bigTitle = false;
                            CharSequence[] charSequenceArr222 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                            DialogInterface.OnClickListener onClickListener222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.l0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i152) {
                                    int i16 = i12;
                                    String str6 = str5;
                                    m0 m0Var2 = m0Var;
                                    switch (i16) {
                                        case 0:
                                            z0 z0Var22 = m0Var2.a;
                                            if (i152 != 0) {
                                                if (i152 != 1) {
                                                    if (i152 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        d1 d1Var = z0Var22.Q;
                                                        if (d1Var != null) {
                                                            new yc(d1Var, d1Var.e).k(false).k(true);
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
                                                        DownloadManager downloadManager = (DownloadManager) z0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        d1 d1Var2 = z0Var22.Q;
                                                        if (d1Var2 != null) {
                                                            new yc(d1Var2, d1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
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
                                                    intent.putExtra("com.android.browser.application_id", z0Var22.getContext().getPackageName());
                                                    z0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e122) {
                                                    FileLog.e(e122);
                                                    z0Var22.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            z0 z0Var3 = m0Var2.a;
                                            if (i152 != 0) {
                                                if (i152 != 1) {
                                                    if (i152 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        d1 d1Var3 = z0Var3.Q;
                                                        if (d1Var3 != null) {
                                                            new yc(d1Var3, d1Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", z0Var3.getContext().getPackageName());
                                                        z0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e132) {
                                                        FileLog.e(e132);
                                                        z0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                z0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            i14.items = charSequenceArr222;
                            i14.onClickListener = onClickListener222;
                            i14.show();
                            z0Var.F = i14;
                        }
                        str = str5;
                        str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                        i14.multipleLinesTitle = true;
                        i14.title = str2;
                        i14.bigTitle = false;
                        CharSequence[] charSequenceArr2222 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                        DialogInterface.OnClickListener onClickListener2222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.l0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i152) {
                                int i16 = i12;
                                String str6 = str5;
                                m0 m0Var2 = m0Var;
                                switch (i16) {
                                    case 0:
                                        z0 z0Var22 = m0Var2.a;
                                        if (i152 != 0) {
                                            if (i152 != 1) {
                                                if (i152 == 2) {
                                                    AndroidUtilities.addToClipboard(str6);
                                                    d1 d1Var = z0Var22.Q;
                                                    if (d1Var != null) {
                                                        new yc(d1Var, d1Var.e).k(false).k(true);
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
                                                    DownloadManager downloadManager = (DownloadManager) z0Var22.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    d1 d1Var2 = z0Var22.Q;
                                                    if (d1Var2 != null) {
                                                        new yc(d1Var2, d1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
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
                                                intent.putExtra("com.android.browser.application_id", z0Var22.getContext().getPackageName());
                                                z0Var22.getContext().startActivity(intent);
                                                break;
                                            } catch (Exception e122) {
                                                FileLog.e(e122);
                                                z0Var22.loadUrl(str6);
                                                return;
                                            }
                                        }
                                        break;
                                    default:
                                        z0 z0Var3 = m0Var2.a;
                                        if (i152 != 0) {
                                            if (i152 != 1) {
                                                if (i152 == 2) {
                                                    AndroidUtilities.addToClipboard(str6);
                                                    d1 d1Var3 = z0Var3.Q;
                                                    if (d1Var3 != null) {
                                                        new yc(d1Var3, d1Var3.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", z0Var3.getContext().getPackageName());
                                                    z0Var3.getContext().startActivity(intent2);
                                                    break;
                                                } catch (Exception e132) {
                                                    FileLog.e(e132);
                                                    z0Var3.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                        } else {
                                            z0Var3.loadUrl(str6);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        i14.items = charSequenceArr2222;
                        i14.onClickListener = onClickListener2222;
                        i14.show();
                        z0Var.F = i14;
                        break;
                    default:
                        z0 z0Var2 = m0Var.a;
                        f3 i15 = wl.i(1, z0Var2.getContext(), null, false);
                        try {
                            Uri parse2 = Uri.parse(str5);
                            str3 = of.f.v(parse2, null, null, of.f.a(parse2.getHost()), null);
                        } catch (Exception e11) {
                            try {
                                FileLog.e((Throwable) e11, false);
                                str3 = str5;
                            } catch (Exception e12) {
                                e = e12;
                                str3 = str5;
                                FileLog.e(e);
                                str4 = str3;
                                i15.multipleLinesTitle = true;
                                i15.title = str4;
                                i15.bigTitle = false;
                                CharSequence[] charSequenceArr322 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                                DialogInterface.OnClickListener onClickListener322 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.l0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i152) {
                                        int i16 = i13;
                                        String str6 = str5;
                                        m0 m0Var2 = m0Var;
                                        switch (i16) {
                                            case 0:
                                                z0 z0Var22 = m0Var2.a;
                                                if (i152 != 0) {
                                                    if (i152 != 1) {
                                                        if (i152 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            d1 d1Var = z0Var22.Q;
                                                            if (d1Var != null) {
                                                                new yc(d1Var, d1Var.e).k(false).k(true);
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
                                                            DownloadManager downloadManager = (DownloadManager) z0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            d1 d1Var2 = z0Var22.Q;
                                                            if (d1Var2 != null) {
                                                                new yc(d1Var2, d1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
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
                                                        intent.putExtra("com.android.browser.application_id", z0Var22.getContext().getPackageName());
                                                        z0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e122) {
                                                        FileLog.e(e122);
                                                        z0Var22.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                z0 z0Var3 = m0Var2.a;
                                                if (i152 != 0) {
                                                    if (i152 != 1) {
                                                        if (i152 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            d1 d1Var3 = z0Var3.Q;
                                                            if (d1Var3 != null) {
                                                                new yc(d1Var3, d1Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", z0Var3.getContext().getPackageName());
                                                            z0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e132) {
                                                            FileLog.e(e132);
                                                            z0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    z0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                i15.items = charSequenceArr322;
                                i15.onClickListener = onClickListener322;
                                i15.show();
                                z0Var2.F = i15;
                            }
                        }
                        try {
                            str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                        } catch (Exception e13) {
                            e = e13;
                            FileLog.e(e);
                            str4 = str3;
                            i15.multipleLinesTitle = true;
                            i15.title = str4;
                            i15.bigTitle = false;
                            CharSequence[] charSequenceArr3222 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                            DialogInterface.OnClickListener onClickListener3222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.l0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i152) {
                                    int i16 = i13;
                                    String str6 = str5;
                                    m0 m0Var2 = m0Var;
                                    switch (i16) {
                                        case 0:
                                            z0 z0Var22 = m0Var2.a;
                                            if (i152 != 0) {
                                                if (i152 != 1) {
                                                    if (i152 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        d1 d1Var = z0Var22.Q;
                                                        if (d1Var != null) {
                                                            new yc(d1Var, d1Var.e).k(false).k(true);
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
                                                        DownloadManager downloadManager = (DownloadManager) z0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        d1 d1Var2 = z0Var22.Q;
                                                        if (d1Var2 != null) {
                                                            new yc(d1Var2, d1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
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
                                                    intent.putExtra("com.android.browser.application_id", z0Var22.getContext().getPackageName());
                                                    z0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e122) {
                                                    FileLog.e(e122);
                                                    z0Var22.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            z0 z0Var3 = m0Var2.a;
                                            if (i152 != 0) {
                                                if (i152 != 1) {
                                                    if (i152 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        d1 d1Var3 = z0Var3.Q;
                                                        if (d1Var3 != null) {
                                                            new yc(d1Var3, d1Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", z0Var3.getContext().getPackageName());
                                                        z0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e132) {
                                                        FileLog.e(e132);
                                                        z0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                z0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            i15.items = charSequenceArr3222;
                            i15.onClickListener = onClickListener3222;
                            i15.show();
                            z0Var2.F = i15;
                        }
                        i15.multipleLinesTitle = true;
                        i15.title = str4;
                        i15.bigTitle = false;
                        CharSequence[] charSequenceArr32222 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                        DialogInterface.OnClickListener onClickListener32222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.l0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i152) {
                                int i16 = i13;
                                String str6 = str5;
                                m0 m0Var2 = m0Var;
                                switch (i16) {
                                    case 0:
                                        z0 z0Var22 = m0Var2.a;
                                        if (i152 != 0) {
                                            if (i152 != 1) {
                                                if (i152 == 2) {
                                                    AndroidUtilities.addToClipboard(str6);
                                                    d1 d1Var = z0Var22.Q;
                                                    if (d1Var != null) {
                                                        new yc(d1Var, d1Var.e).k(false).k(true);
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
                                                    DownloadManager downloadManager = (DownloadManager) z0Var22.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    d1 d1Var2 = z0Var22.Q;
                                                    if (d1Var2 != null) {
                                                        new yc(d1Var2, d1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
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
                                                intent.putExtra("com.android.browser.application_id", z0Var22.getContext().getPackageName());
                                                z0Var22.getContext().startActivity(intent);
                                                break;
                                            } catch (Exception e122) {
                                                FileLog.e(e122);
                                                z0Var22.loadUrl(str6);
                                                return;
                                            }
                                        }
                                        break;
                                    default:
                                        z0 z0Var3 = m0Var2.a;
                                        if (i152 != 0) {
                                            if (i152 != 1) {
                                                if (i152 == 2) {
                                                    AndroidUtilities.addToClipboard(str6);
                                                    d1 d1Var3 = z0Var3.Q;
                                                    if (d1Var3 != null) {
                                                        new yc(d1Var3, d1Var3.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", z0Var3.getContext().getPackageName());
                                                    z0Var3.getContext().startActivity(intent2);
                                                    break;
                                                } catch (Exception e132) {
                                                    FileLog.e(e132);
                                                    z0Var3.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                        } else {
                                            z0Var3.loadUrl(str6);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        i15.items = charSequenceArr32222;
                        i15.onClickListener = onClickListener32222;
                        i15.show();
                        z0Var2.F = i15;
                }
            }
        });
        return true;
    }
}
