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
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class l0 implements View.OnLongClickListener {
    public final /* synthetic */ y0 a;

    public l0(y0 y0Var) {
        this.a = y0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.a.getHitTestResult();
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            final int i10 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.web.j0
                public final /* synthetic */ l0 b;

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
                    final l0 l0Var = this.b;
                    final int i12 = 1;
                    final int i13 = 0;
                    switch (i11) {
                        case 0:
                            y0 y0Var = l0Var.a;
                            h3 i14 = em.i(1, y0Var.getContext(), null, false);
                            try {
                                parse = Uri.parse(str5);
                            } catch (Exception e) {
                                try {
                                    FileLog.e((Throwable) e, false);
                                } catch (Exception e7) {
                                    e = e7;
                                    str = str5;
                                    FileLog.e(e);
                                    str2 = str;
                                    i14.multipleLinesTitle = true;
                                    i14.title = str2;
                                    i14.bigTitle = false;
                                    CharSequence[] charSequenceArr = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.k0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i15) {
                                            int i16 = i12;
                                            String str6 = str5;
                                            l0 l0Var2 = l0Var;
                                            switch (i16) {
                                                case 0:
                                                    y0 y0Var2 = l0Var2.a;
                                                    if (i15 != 0) {
                                                        if (i15 != 1) {
                                                            if (i15 == 2) {
                                                                AndroidUtilities.addToClipboard(str6);
                                                                c1 c1Var = y0Var2.Q;
                                                                if (c1Var != null) {
                                                                    new wc(c1Var, c1Var.e).k(false).k(true);
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
                                                                DownloadManager downloadManager = (DownloadManager) y0Var2.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                c1 c1Var2 = y0Var2.Q;
                                                                if (c1Var2 != null) {
                                                                    new wc(c1Var2, c1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                                    break;
                                                                }
                                                            } catch (Exception e10) {
                                                                FileLog.e(e10);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", y0Var2.getContext().getPackageName());
                                                            y0Var2.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e11) {
                                                            FileLog.e(e11);
                                                            y0Var2.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    y0 y0Var3 = l0Var2.a;
                                                    if (i15 != 0) {
                                                        if (i15 != 1) {
                                                            if (i15 == 2) {
                                                                AndroidUtilities.addToClipboard(str6);
                                                                c1 c1Var3 = y0Var3.Q;
                                                                if (c1Var3 != null) {
                                                                    new wc(c1Var3, c1Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", y0Var3.getContext().getPackageName());
                                                                y0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e12) {
                                                                FileLog.e(e12);
                                                                y0Var3.loadUrl(str6);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        y0Var3.loadUrl(str6);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    i14.items = charSequenceArr;
                                    i14.onClickListener = onClickListener;
                                    i14.show();
                                    y0Var.F = i14;
                                    return;
                                }
                            }
                            if (parse != null && !parse.getScheme().equalsIgnoreCase("data")) {
                                str = nf.f.v(parse, null, null, nf.f.a(parse.getHost()), null);
                                str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                                i14.multipleLinesTitle = true;
                                i14.title = str2;
                                i14.bigTitle = false;
                                CharSequence[] charSequenceArr2 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                                DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.k0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i15) {
                                        int i16 = i12;
                                        String str6 = str5;
                                        l0 l0Var2 = l0Var;
                                        switch (i16) {
                                            case 0:
                                                y0 y0Var2 = l0Var2.a;
                                                if (i15 != 0) {
                                                    if (i15 != 1) {
                                                        if (i15 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            c1 c1Var = y0Var2.Q;
                                                            if (c1Var != null) {
                                                                new wc(c1Var, c1Var.e).k(false).k(true);
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
                                                            DownloadManager downloadManager = (DownloadManager) y0Var2.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            c1 c1Var2 = y0Var2.Q;
                                                            if (c1Var2 != null) {
                                                                new wc(c1Var2, c1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e10) {
                                                            FileLog.e(e10);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", y0Var2.getContext().getPackageName());
                                                        y0Var2.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
                                                        y0Var2.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                y0 y0Var3 = l0Var2.a;
                                                if (i15 != 0) {
                                                    if (i15 != 1) {
                                                        if (i15 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            c1 c1Var3 = y0Var3.Q;
                                                            if (c1Var3 != null) {
                                                                new wc(c1Var3, c1Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", y0Var3.getContext().getPackageName());
                                                            y0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e12) {
                                                            FileLog.e(e12);
                                                            y0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    y0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                i14.items = charSequenceArr2;
                                i14.onClickListener = onClickListener2;
                                i14.show();
                                y0Var.F = i14;
                            }
                            str = str5;
                            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                            i14.multipleLinesTitle = true;
                            i14.title = str2;
                            i14.bigTitle = false;
                            CharSequence[] charSequenceArr22 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                            DialogInterface.OnClickListener onClickListener22 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.k0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i15) {
                                    int i16 = i12;
                                    String str6 = str5;
                                    l0 l0Var2 = l0Var;
                                    switch (i16) {
                                        case 0:
                                            y0 y0Var2 = l0Var2.a;
                                            if (i15 != 0) {
                                                if (i15 != 1) {
                                                    if (i15 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        c1 c1Var = y0Var2.Q;
                                                        if (c1Var != null) {
                                                            new wc(c1Var, c1Var.e).k(false).k(true);
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
                                                        DownloadManager downloadManager = (DownloadManager) y0Var2.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        c1 c1Var2 = y0Var2.Q;
                                                        if (c1Var2 != null) {
                                                            new wc(c1Var2, c1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", y0Var2.getContext().getPackageName());
                                                    y0Var2.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e11) {
                                                    FileLog.e(e11);
                                                    y0Var2.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            y0 y0Var3 = l0Var2.a;
                                            if (i15 != 0) {
                                                if (i15 != 1) {
                                                    if (i15 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        c1 c1Var3 = y0Var3.Q;
                                                        if (c1Var3 != null) {
                                                            new wc(c1Var3, c1Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", y0Var3.getContext().getPackageName());
                                                        y0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e12) {
                                                        FileLog.e(e12);
                                                        y0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                y0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            i14.items = charSequenceArr22;
                            i14.onClickListener = onClickListener22;
                            i14.show();
                            y0Var.F = i14;
                            break;
                        default:
                            y0 y0Var2 = l0Var.a;
                            h3 i15 = em.i(1, y0Var2.getContext(), null, false);
                            try {
                                Uri parse2 = Uri.parse(str5);
                                str3 = nf.f.v(parse2, null, null, nf.f.a(parse2.getHost()), null);
                            } catch (Exception e10) {
                                try {
                                    FileLog.e((Throwable) e10, false);
                                    str3 = str5;
                                } catch (Exception e11) {
                                    e = e11;
                                    str3 = str5;
                                    FileLog.e(e);
                                    str4 = str3;
                                    i15.multipleLinesTitle = true;
                                    i15.title = str4;
                                    i15.bigTitle = false;
                                    CharSequence[] charSequenceArr3 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                                    DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.k0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i152) {
                                            int i16 = i13;
                                            String str6 = str5;
                                            l0 l0Var2 = l0Var;
                                            switch (i16) {
                                                case 0:
                                                    y0 y0Var22 = l0Var2.a;
                                                    if (i152 != 0) {
                                                        if (i152 != 1) {
                                                            if (i152 == 2) {
                                                                AndroidUtilities.addToClipboard(str6);
                                                                c1 c1Var = y0Var22.Q;
                                                                if (c1Var != null) {
                                                                    new wc(c1Var, c1Var.e).k(false).k(true);
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
                                                                DownloadManager downloadManager = (DownloadManager) y0Var22.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                c1 c1Var2 = y0Var22.Q;
                                                                if (c1Var2 != null) {
                                                                    new wc(c1Var2, c1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                                    break;
                                                                }
                                                            } catch (Exception e102) {
                                                                FileLog.e(e102);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", y0Var22.getContext().getPackageName());
                                                            y0Var22.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e112) {
                                                            FileLog.e(e112);
                                                            y0Var22.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    y0 y0Var3 = l0Var2.a;
                                                    if (i152 != 0) {
                                                        if (i152 != 1) {
                                                            if (i152 == 2) {
                                                                AndroidUtilities.addToClipboard(str6);
                                                                c1 c1Var3 = y0Var3.Q;
                                                                if (c1Var3 != null) {
                                                                    new wc(c1Var3, c1Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", y0Var3.getContext().getPackageName());
                                                                y0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e12) {
                                                                FileLog.e(e12);
                                                                y0Var3.loadUrl(str6);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        y0Var3.loadUrl(str6);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    i15.items = charSequenceArr3;
                                    i15.onClickListener = onClickListener3;
                                    i15.show();
                                    y0Var2.F = i15;
                                }
                            }
                            try {
                                str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e12) {
                                e = e12;
                                FileLog.e(e);
                                str4 = str3;
                                i15.multipleLinesTitle = true;
                                i15.title = str4;
                                i15.bigTitle = false;
                                CharSequence[] charSequenceArr32 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                                DialogInterface.OnClickListener onClickListener32 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.k0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i152) {
                                        int i16 = i13;
                                        String str6 = str5;
                                        l0 l0Var2 = l0Var;
                                        switch (i16) {
                                            case 0:
                                                y0 y0Var22 = l0Var2.a;
                                                if (i152 != 0) {
                                                    if (i152 != 1) {
                                                        if (i152 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            c1 c1Var = y0Var22.Q;
                                                            if (c1Var != null) {
                                                                new wc(c1Var, c1Var.e).k(false).k(true);
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
                                                            DownloadManager downloadManager = (DownloadManager) y0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            c1 c1Var2 = y0Var22.Q;
                                                            if (c1Var2 != null) {
                                                                new wc(c1Var2, c1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e102) {
                                                            FileLog.e(e102);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", y0Var22.getContext().getPackageName());
                                                        y0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e112) {
                                                        FileLog.e(e112);
                                                        y0Var22.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                y0 y0Var3 = l0Var2.a;
                                                if (i152 != 0) {
                                                    if (i152 != 1) {
                                                        if (i152 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            c1 c1Var3 = y0Var3.Q;
                                                            if (c1Var3 != null) {
                                                                new wc(c1Var3, c1Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", y0Var3.getContext().getPackageName());
                                                            y0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e122) {
                                                            FileLog.e(e122);
                                                            y0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    y0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                i15.items = charSequenceArr32;
                                i15.onClickListener = onClickListener32;
                                i15.show();
                                y0Var2.F = i15;
                            }
                            i15.multipleLinesTitle = true;
                            i15.title = str4;
                            i15.bigTitle = false;
                            CharSequence[] charSequenceArr322 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                            DialogInterface.OnClickListener onClickListener322 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.k0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i152) {
                                    int i16 = i13;
                                    String str6 = str5;
                                    l0 l0Var2 = l0Var;
                                    switch (i16) {
                                        case 0:
                                            y0 y0Var22 = l0Var2.a;
                                            if (i152 != 0) {
                                                if (i152 != 1) {
                                                    if (i152 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        c1 c1Var = y0Var22.Q;
                                                        if (c1Var != null) {
                                                            new wc(c1Var, c1Var.e).k(false).k(true);
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
                                                        DownloadManager downloadManager = (DownloadManager) y0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        c1 c1Var2 = y0Var22.Q;
                                                        if (c1Var2 != null) {
                                                            new wc(c1Var2, c1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e102) {
                                                        FileLog.e(e102);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", y0Var22.getContext().getPackageName());
                                                    y0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e112) {
                                                    FileLog.e(e112);
                                                    y0Var22.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            y0 y0Var3 = l0Var2.a;
                                            if (i152 != 0) {
                                                if (i152 != 1) {
                                                    if (i152 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        c1 c1Var3 = y0Var3.Q;
                                                        if (c1Var3 != null) {
                                                            new wc(c1Var3, c1Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", y0Var3.getContext().getPackageName());
                                                        y0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e122) {
                                                        FileLog.e(e122);
                                                        y0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                y0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            i15.items = charSequenceArr322;
                            i15.onClickListener = onClickListener322;
                            i15.show();
                            y0Var2.F = i15;
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
        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.web.j0
            public final /* synthetic */ l0 b;

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
                final l0 l0Var = this.b;
                final int i12 = 1;
                final int i13 = 0;
                switch (i112) {
                    case 0:
                        y0 y0Var = l0Var.a;
                        h3 i14 = em.i(1, y0Var.getContext(), null, false);
                        try {
                            parse = Uri.parse(str5);
                        } catch (Exception e) {
                            try {
                                FileLog.e((Throwable) e, false);
                            } catch (Exception e7) {
                                e = e7;
                                str = str5;
                                FileLog.e(e);
                                str2 = str;
                                i14.multipleLinesTitle = true;
                                i14.title = str2;
                                i14.bigTitle = false;
                                CharSequence[] charSequenceArr22 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                                DialogInterface.OnClickListener onClickListener22 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.k0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i152) {
                                        int i16 = i12;
                                        String str6 = str5;
                                        l0 l0Var2 = l0Var;
                                        switch (i16) {
                                            case 0:
                                                y0 y0Var22 = l0Var2.a;
                                                if (i152 != 0) {
                                                    if (i152 != 1) {
                                                        if (i152 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            c1 c1Var = y0Var22.Q;
                                                            if (c1Var != null) {
                                                                new wc(c1Var, c1Var.e).k(false).k(true);
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
                                                            DownloadManager downloadManager = (DownloadManager) y0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            c1 c1Var2 = y0Var22.Q;
                                                            if (c1Var2 != null) {
                                                                new wc(c1Var2, c1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e102) {
                                                            FileLog.e(e102);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", y0Var22.getContext().getPackageName());
                                                        y0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e112) {
                                                        FileLog.e(e112);
                                                        y0Var22.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                y0 y0Var3 = l0Var2.a;
                                                if (i152 != 0) {
                                                    if (i152 != 1) {
                                                        if (i152 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            c1 c1Var3 = y0Var3.Q;
                                                            if (c1Var3 != null) {
                                                                new wc(c1Var3, c1Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", y0Var3.getContext().getPackageName());
                                                            y0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e122) {
                                                            FileLog.e(e122);
                                                            y0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    y0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                i14.items = charSequenceArr22;
                                i14.onClickListener = onClickListener22;
                                i14.show();
                                y0Var.F = i14;
                                return;
                            }
                        }
                        if (parse != null && !parse.getScheme().equalsIgnoreCase("data")) {
                            str = nf.f.v(parse, null, null, nf.f.a(parse.getHost()), null);
                            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                            i14.multipleLinesTitle = true;
                            i14.title = str2;
                            i14.bigTitle = false;
                            CharSequence[] charSequenceArr222 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                            DialogInterface.OnClickListener onClickListener222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.k0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i152) {
                                    int i16 = i12;
                                    String str6 = str5;
                                    l0 l0Var2 = l0Var;
                                    switch (i16) {
                                        case 0:
                                            y0 y0Var22 = l0Var2.a;
                                            if (i152 != 0) {
                                                if (i152 != 1) {
                                                    if (i152 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        c1 c1Var = y0Var22.Q;
                                                        if (c1Var != null) {
                                                            new wc(c1Var, c1Var.e).k(false).k(true);
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
                                                        DownloadManager downloadManager = (DownloadManager) y0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        c1 c1Var2 = y0Var22.Q;
                                                        if (c1Var2 != null) {
                                                            new wc(c1Var2, c1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e102) {
                                                        FileLog.e(e102);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", y0Var22.getContext().getPackageName());
                                                    y0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e112) {
                                                    FileLog.e(e112);
                                                    y0Var22.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            y0 y0Var3 = l0Var2.a;
                                            if (i152 != 0) {
                                                if (i152 != 1) {
                                                    if (i152 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        c1 c1Var3 = y0Var3.Q;
                                                        if (c1Var3 != null) {
                                                            new wc(c1Var3, c1Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", y0Var3.getContext().getPackageName());
                                                        y0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e122) {
                                                        FileLog.e(e122);
                                                        y0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                y0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            i14.items = charSequenceArr222;
                            i14.onClickListener = onClickListener222;
                            i14.show();
                            y0Var.F = i14;
                        }
                        str = str5;
                        str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                        i14.multipleLinesTitle = true;
                        i14.title = str2;
                        i14.bigTitle = false;
                        CharSequence[] charSequenceArr2222 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                        DialogInterface.OnClickListener onClickListener2222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.k0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i152) {
                                int i16 = i12;
                                String str6 = str5;
                                l0 l0Var2 = l0Var;
                                switch (i16) {
                                    case 0:
                                        y0 y0Var22 = l0Var2.a;
                                        if (i152 != 0) {
                                            if (i152 != 1) {
                                                if (i152 == 2) {
                                                    AndroidUtilities.addToClipboard(str6);
                                                    c1 c1Var = y0Var22.Q;
                                                    if (c1Var != null) {
                                                        new wc(c1Var, c1Var.e).k(false).k(true);
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
                                                    DownloadManager downloadManager = (DownloadManager) y0Var22.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    c1 c1Var2 = y0Var22.Q;
                                                    if (c1Var2 != null) {
                                                        new wc(c1Var2, c1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                        break;
                                                    }
                                                } catch (Exception e102) {
                                                    FileLog.e(e102);
                                                    return;
                                                }
                                            }
                                        } else {
                                            try {
                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                intent.putExtra("create_new_tab", true);
                                                intent.putExtra("com.android.browser.application_id", y0Var22.getContext().getPackageName());
                                                y0Var22.getContext().startActivity(intent);
                                                break;
                                            } catch (Exception e112) {
                                                FileLog.e(e112);
                                                y0Var22.loadUrl(str6);
                                                return;
                                            }
                                        }
                                        break;
                                    default:
                                        y0 y0Var3 = l0Var2.a;
                                        if (i152 != 0) {
                                            if (i152 != 1) {
                                                if (i152 == 2) {
                                                    AndroidUtilities.addToClipboard(str6);
                                                    c1 c1Var3 = y0Var3.Q;
                                                    if (c1Var3 != null) {
                                                        new wc(c1Var3, c1Var3.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", y0Var3.getContext().getPackageName());
                                                    y0Var3.getContext().startActivity(intent2);
                                                    break;
                                                } catch (Exception e122) {
                                                    FileLog.e(e122);
                                                    y0Var3.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                        } else {
                                            y0Var3.loadUrl(str6);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        i14.items = charSequenceArr2222;
                        i14.onClickListener = onClickListener2222;
                        i14.show();
                        y0Var.F = i14;
                        break;
                    default:
                        y0 y0Var2 = l0Var.a;
                        h3 i15 = em.i(1, y0Var2.getContext(), null, false);
                        try {
                            Uri parse2 = Uri.parse(str5);
                            str3 = nf.f.v(parse2, null, null, nf.f.a(parse2.getHost()), null);
                        } catch (Exception e10) {
                            try {
                                FileLog.e((Throwable) e10, false);
                                str3 = str5;
                            } catch (Exception e11) {
                                e = e11;
                                str3 = str5;
                                FileLog.e(e);
                                str4 = str3;
                                i15.multipleLinesTitle = true;
                                i15.title = str4;
                                i15.bigTitle = false;
                                CharSequence[] charSequenceArr322 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                                DialogInterface.OnClickListener onClickListener322 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.k0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i152) {
                                        int i16 = i13;
                                        String str6 = str5;
                                        l0 l0Var2 = l0Var;
                                        switch (i16) {
                                            case 0:
                                                y0 y0Var22 = l0Var2.a;
                                                if (i152 != 0) {
                                                    if (i152 != 1) {
                                                        if (i152 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            c1 c1Var = y0Var22.Q;
                                                            if (c1Var != null) {
                                                                new wc(c1Var, c1Var.e).k(false).k(true);
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
                                                            DownloadManager downloadManager = (DownloadManager) y0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            c1 c1Var2 = y0Var22.Q;
                                                            if (c1Var2 != null) {
                                                                new wc(c1Var2, c1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e102) {
                                                            FileLog.e(e102);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", y0Var22.getContext().getPackageName());
                                                        y0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e112) {
                                                        FileLog.e(e112);
                                                        y0Var22.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                y0 y0Var3 = l0Var2.a;
                                                if (i152 != 0) {
                                                    if (i152 != 1) {
                                                        if (i152 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            c1 c1Var3 = y0Var3.Q;
                                                            if (c1Var3 != null) {
                                                                new wc(c1Var3, c1Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", y0Var3.getContext().getPackageName());
                                                            y0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e122) {
                                                            FileLog.e(e122);
                                                            y0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    y0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                i15.items = charSequenceArr322;
                                i15.onClickListener = onClickListener322;
                                i15.show();
                                y0Var2.F = i15;
                            }
                        }
                        try {
                            str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                        } catch (Exception e12) {
                            e = e12;
                            FileLog.e(e);
                            str4 = str3;
                            i15.multipleLinesTitle = true;
                            i15.title = str4;
                            i15.bigTitle = false;
                            CharSequence[] charSequenceArr3222 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                            DialogInterface.OnClickListener onClickListener3222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.k0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i152) {
                                    int i16 = i13;
                                    String str6 = str5;
                                    l0 l0Var2 = l0Var;
                                    switch (i16) {
                                        case 0:
                                            y0 y0Var22 = l0Var2.a;
                                            if (i152 != 0) {
                                                if (i152 != 1) {
                                                    if (i152 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        c1 c1Var = y0Var22.Q;
                                                        if (c1Var != null) {
                                                            new wc(c1Var, c1Var.e).k(false).k(true);
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
                                                        DownloadManager downloadManager = (DownloadManager) y0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        c1 c1Var2 = y0Var22.Q;
                                                        if (c1Var2 != null) {
                                                            new wc(c1Var2, c1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e102) {
                                                        FileLog.e(e102);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", y0Var22.getContext().getPackageName());
                                                    y0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e112) {
                                                    FileLog.e(e112);
                                                    y0Var22.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            y0 y0Var3 = l0Var2.a;
                                            if (i152 != 0) {
                                                if (i152 != 1) {
                                                    if (i152 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        c1 c1Var3 = y0Var3.Q;
                                                        if (c1Var3 != null) {
                                                            new wc(c1Var3, c1Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", y0Var3.getContext().getPackageName());
                                                        y0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e122) {
                                                        FileLog.e(e122);
                                                        y0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                y0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            i15.items = charSequenceArr3222;
                            i15.onClickListener = onClickListener3222;
                            i15.show();
                            y0Var2.F = i15;
                        }
                        i15.multipleLinesTitle = true;
                        i15.title = str4;
                        i15.bigTitle = false;
                        CharSequence[] charSequenceArr32222 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                        DialogInterface.OnClickListener onClickListener32222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.k0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i152) {
                                int i16 = i13;
                                String str6 = str5;
                                l0 l0Var2 = l0Var;
                                switch (i16) {
                                    case 0:
                                        y0 y0Var22 = l0Var2.a;
                                        if (i152 != 0) {
                                            if (i152 != 1) {
                                                if (i152 == 2) {
                                                    AndroidUtilities.addToClipboard(str6);
                                                    c1 c1Var = y0Var22.Q;
                                                    if (c1Var != null) {
                                                        new wc(c1Var, c1Var.e).k(false).k(true);
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
                                                    DownloadManager downloadManager = (DownloadManager) y0Var22.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    c1 c1Var2 = y0Var22.Q;
                                                    if (c1Var2 != null) {
                                                        new wc(c1Var2, c1Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                        break;
                                                    }
                                                } catch (Exception e102) {
                                                    FileLog.e(e102);
                                                    return;
                                                }
                                            }
                                        } else {
                                            try {
                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                intent.putExtra("create_new_tab", true);
                                                intent.putExtra("com.android.browser.application_id", y0Var22.getContext().getPackageName());
                                                y0Var22.getContext().startActivity(intent);
                                                break;
                                            } catch (Exception e112) {
                                                FileLog.e(e112);
                                                y0Var22.loadUrl(str6);
                                                return;
                                            }
                                        }
                                        break;
                                    default:
                                        y0 y0Var3 = l0Var2.a;
                                        if (i152 != 0) {
                                            if (i152 != 1) {
                                                if (i152 == 2) {
                                                    AndroidUtilities.addToClipboard(str6);
                                                    c1 c1Var3 = y0Var3.Q;
                                                    if (c1Var3 != null) {
                                                        new wc(c1Var3, c1Var3.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", y0Var3.getContext().getPackageName());
                                                    y0Var3.getContext().startActivity(intent2);
                                                    break;
                                                } catch (Exception e122) {
                                                    FileLog.e(e122);
                                                    y0Var3.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                        } else {
                                            y0Var3.loadUrl(str6);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        i15.items = charSequenceArr32222;
                        i15.onClickListener = onClickListener32222;
                        i15.show();
                        y0Var2.F = i15;
                }
            }
        });
        return true;
    }
}
