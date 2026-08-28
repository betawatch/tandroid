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
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.oc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class i0 implements View.OnLongClickListener {
    public final /* synthetic */ v0 a;

    public i0(v0 v0Var) {
        this.a = v0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.a.getHitTestResult();
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            final int i9 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.web.g0
                public final /* synthetic */ i0 b;

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
                    int i10 = i9;
                    final String str5 = extra;
                    final i0 i0Var = this.b;
                    final int i11 = 1;
                    final int i12 = 0;
                    switch (i10) {
                        case 0:
                            v0 v0Var = i0Var.a;
                            f3 j10 = ll.j(v0Var.getContext(), null, false, false);
                            try {
                                parse = Uri.parse(str5);
                            } catch (Exception e10) {
                                try {
                                    FileLog.e((Throwable) e10, false);
                                } catch (Exception e11) {
                                    e = e11;
                                    str = str5;
                                    FileLog.e(e);
                                    str2 = str;
                                    j10.multipleLinesTitle = true;
                                    j10.title = str2;
                                    j10.bigTitle = false;
                                    CharSequence[] charSequenceArr = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.h0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i13) {
                                            int i14 = i11;
                                            String str6 = str5;
                                            i0 i0Var2 = i0Var;
                                            switch (i14) {
                                                case 0:
                                                    v0 v0Var2 = i0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                AndroidUtilities.addToClipboard(str6);
                                                                y0 y0Var = v0Var2.M;
                                                                if (y0Var != null) {
                                                                    new oc(y0Var, y0Var.e).k(false).k(true);
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
                                                                DownloadManager downloadManager = (DownloadManager) v0Var2.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                y0 y0Var2 = v0Var2.M;
                                                                if (y0Var2 != null) {
                                                                    new oc(y0Var2, y0Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                                    break;
                                                                }
                                                            } catch (Exception e12) {
                                                                FileLog.e(e12);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", v0Var2.getContext().getPackageName());
                                                            v0Var2.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e13) {
                                                            FileLog.e(e13);
                                                            v0Var2.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    v0 v0Var3 = i0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                AndroidUtilities.addToClipboard(str6);
                                                                y0 y0Var3 = v0Var3.M;
                                                                if (y0Var3 != null) {
                                                                    new oc(y0Var3, y0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                                v0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e14) {
                                                                FileLog.e(e14);
                                                                v0Var3.loadUrl(str6);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        v0Var3.loadUrl(str6);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    j10.items = charSequenceArr;
                                    j10.onClickListener = onClickListener;
                                    j10.show();
                                    v0Var.B = j10;
                                    return;
                                }
                            }
                            if (parse != null && !parse.getScheme().equalsIgnoreCase("data")) {
                                str = ve.e.v(parse, null, null, ve.e.a(parse.getHost()), null);
                                str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                                j10.multipleLinesTitle = true;
                                j10.title = str2;
                                j10.bigTitle = false;
                                CharSequence[] charSequenceArr2 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                                DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.h0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        int i14 = i11;
                                        String str6 = str5;
                                        i0 i0Var2 = i0Var;
                                        switch (i14) {
                                            case 0:
                                                v0 v0Var2 = i0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            y0 y0Var = v0Var2.M;
                                                            if (y0Var != null) {
                                                                new oc(y0Var, y0Var.e).k(false).k(true);
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
                                                            DownloadManager downloadManager = (DownloadManager) v0Var2.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            y0 y0Var2 = v0Var2.M;
                                                            if (y0Var2 != null) {
                                                                new oc(y0Var2, y0Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e12) {
                                                            FileLog.e(e12);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", v0Var2.getContext().getPackageName());
                                                        v0Var2.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e13) {
                                                        FileLog.e(e13);
                                                        v0Var2.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                v0 v0Var3 = i0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            y0 y0Var3 = v0Var3.M;
                                                            if (y0Var3 != null) {
                                                                new oc(y0Var3, y0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                            v0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e14) {
                                                            FileLog.e(e14);
                                                            v0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    v0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                j10.items = charSequenceArr2;
                                j10.onClickListener = onClickListener2;
                                j10.show();
                                v0Var.B = j10;
                            }
                            str = str5;
                            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                            j10.multipleLinesTitle = true;
                            j10.title = str2;
                            j10.bigTitle = false;
                            CharSequence[] charSequenceArr22 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                            DialogInterface.OnClickListener onClickListener22 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.h0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i13) {
                                    int i14 = i11;
                                    String str6 = str5;
                                    i0 i0Var2 = i0Var;
                                    switch (i14) {
                                        case 0:
                                            v0 v0Var2 = i0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        y0 y0Var = v0Var2.M;
                                                        if (y0Var != null) {
                                                            new oc(y0Var, y0Var.e).k(false).k(true);
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
                                                        DownloadManager downloadManager = (DownloadManager) v0Var2.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        y0 y0Var2 = v0Var2.M;
                                                        if (y0Var2 != null) {
                                                            new oc(y0Var2, y0Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e12) {
                                                        FileLog.e(e12);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", v0Var2.getContext().getPackageName());
                                                    v0Var2.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e13) {
                                                    FileLog.e(e13);
                                                    v0Var2.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            v0 v0Var3 = i0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        y0 y0Var3 = v0Var3.M;
                                                        if (y0Var3 != null) {
                                                            new oc(y0Var3, y0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                        v0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e14) {
                                                        FileLog.e(e14);
                                                        v0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                v0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            j10.items = charSequenceArr22;
                            j10.onClickListener = onClickListener22;
                            j10.show();
                            v0Var.B = j10;
                            break;
                        default:
                            v0 v0Var2 = i0Var.a;
                            f3 j11 = ll.j(v0Var2.getContext(), null, false, false);
                            try {
                                Uri parse2 = Uri.parse(str5);
                                str3 = ve.e.v(parse2, null, null, ve.e.a(parse2.getHost()), null);
                            } catch (Exception e12) {
                                try {
                                    FileLog.e((Throwable) e12, false);
                                    str3 = str5;
                                } catch (Exception e13) {
                                    e = e13;
                                    str3 = str5;
                                    FileLog.e(e);
                                    str4 = str3;
                                    j11.multipleLinesTitle = true;
                                    j11.title = str4;
                                    j11.bigTitle = false;
                                    CharSequence[] charSequenceArr3 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                                    DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.h0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i13) {
                                            int i14 = i12;
                                            String str6 = str5;
                                            i0 i0Var2 = i0Var;
                                            switch (i14) {
                                                case 0:
                                                    v0 v0Var22 = i0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                AndroidUtilities.addToClipboard(str6);
                                                                y0 y0Var = v0Var22.M;
                                                                if (y0Var != null) {
                                                                    new oc(y0Var, y0Var.e).k(false).k(true);
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
                                                                DownloadManager downloadManager = (DownloadManager) v0Var22.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                y0 y0Var2 = v0Var22.M;
                                                                if (y0Var2 != null) {
                                                                    new oc(y0Var2, y0Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                                    break;
                                                                }
                                                            } catch (Exception e122) {
                                                                FileLog.e(e122);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", v0Var22.getContext().getPackageName());
                                                            v0Var22.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e132) {
                                                            FileLog.e(e132);
                                                            v0Var22.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    v0 v0Var3 = i0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                AndroidUtilities.addToClipboard(str6);
                                                                y0 y0Var3 = v0Var3.M;
                                                                if (y0Var3 != null) {
                                                                    new oc(y0Var3, y0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                                v0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e14) {
                                                                FileLog.e(e14);
                                                                v0Var3.loadUrl(str6);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        v0Var3.loadUrl(str6);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    j11.items = charSequenceArr3;
                                    j11.onClickListener = onClickListener3;
                                    j11.show();
                                    v0Var2.B = j11;
                                }
                            }
                            try {
                                str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e14) {
                                e = e14;
                                FileLog.e(e);
                                str4 = str3;
                                j11.multipleLinesTitle = true;
                                j11.title = str4;
                                j11.bigTitle = false;
                                CharSequence[] charSequenceArr32 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                                DialogInterface.OnClickListener onClickListener32 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.h0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        int i14 = i12;
                                        String str6 = str5;
                                        i0 i0Var2 = i0Var;
                                        switch (i14) {
                                            case 0:
                                                v0 v0Var22 = i0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            y0 y0Var = v0Var22.M;
                                                            if (y0Var != null) {
                                                                new oc(y0Var, y0Var.e).k(false).k(true);
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
                                                            DownloadManager downloadManager = (DownloadManager) v0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            y0 y0Var2 = v0Var22.M;
                                                            if (y0Var2 != null) {
                                                                new oc(y0Var2, y0Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e122) {
                                                            FileLog.e(e122);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", v0Var22.getContext().getPackageName());
                                                        v0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e132) {
                                                        FileLog.e(e132);
                                                        v0Var22.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                v0 v0Var3 = i0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            y0 y0Var3 = v0Var3.M;
                                                            if (y0Var3 != null) {
                                                                new oc(y0Var3, y0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                            v0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e142) {
                                                            FileLog.e(e142);
                                                            v0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    v0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                j11.items = charSequenceArr32;
                                j11.onClickListener = onClickListener32;
                                j11.show();
                                v0Var2.B = j11;
                            }
                            j11.multipleLinesTitle = true;
                            j11.title = str4;
                            j11.bigTitle = false;
                            CharSequence[] charSequenceArr322 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                            DialogInterface.OnClickListener onClickListener322 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.h0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i13) {
                                    int i14 = i12;
                                    String str6 = str5;
                                    i0 i0Var2 = i0Var;
                                    switch (i14) {
                                        case 0:
                                            v0 v0Var22 = i0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        y0 y0Var = v0Var22.M;
                                                        if (y0Var != null) {
                                                            new oc(y0Var, y0Var.e).k(false).k(true);
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
                                                        DownloadManager downloadManager = (DownloadManager) v0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        y0 y0Var2 = v0Var22.M;
                                                        if (y0Var2 != null) {
                                                            new oc(y0Var2, y0Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e122) {
                                                        FileLog.e(e122);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", v0Var22.getContext().getPackageName());
                                                    v0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e132) {
                                                    FileLog.e(e132);
                                                    v0Var22.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            v0 v0Var3 = i0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        y0 y0Var3 = v0Var3.M;
                                                        if (y0Var3 != null) {
                                                            new oc(y0Var3, y0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                        v0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e142) {
                                                        FileLog.e(e142);
                                                        v0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                v0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            j11.items = charSequenceArr322;
                            j11.onClickListener = onClickListener322;
                            j11.show();
                            v0Var2.B = j11;
                    }
                }
            });
            return true;
        }
        if (hitTestResult.getType() != 5) {
            return false;
        }
        final String extra2 = hitTestResult.getExtra();
        final int i10 = 1;
        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.web.g0
            public final /* synthetic */ i0 b;

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
                int i102 = i10;
                final String str5 = extra2;
                final i0 i0Var = this.b;
                final int i11 = 1;
                final int i12 = 0;
                switch (i102) {
                    case 0:
                        v0 v0Var = i0Var.a;
                        f3 j10 = ll.j(v0Var.getContext(), null, false, false);
                        try {
                            parse = Uri.parse(str5);
                        } catch (Exception e10) {
                            try {
                                FileLog.e((Throwable) e10, false);
                            } catch (Exception e11) {
                                e = e11;
                                str = str5;
                                FileLog.e(e);
                                str2 = str;
                                j10.multipleLinesTitle = true;
                                j10.title = str2;
                                j10.bigTitle = false;
                                CharSequence[] charSequenceArr22 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                                DialogInterface.OnClickListener onClickListener22 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.h0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        int i14 = i11;
                                        String str6 = str5;
                                        i0 i0Var2 = i0Var;
                                        switch (i14) {
                                            case 0:
                                                v0 v0Var22 = i0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            y0 y0Var = v0Var22.M;
                                                            if (y0Var != null) {
                                                                new oc(y0Var, y0Var.e).k(false).k(true);
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
                                                            DownloadManager downloadManager = (DownloadManager) v0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            y0 y0Var2 = v0Var22.M;
                                                            if (y0Var2 != null) {
                                                                new oc(y0Var2, y0Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e122) {
                                                            FileLog.e(e122);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", v0Var22.getContext().getPackageName());
                                                        v0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e132) {
                                                        FileLog.e(e132);
                                                        v0Var22.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                v0 v0Var3 = i0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            y0 y0Var3 = v0Var3.M;
                                                            if (y0Var3 != null) {
                                                                new oc(y0Var3, y0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                            v0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e142) {
                                                            FileLog.e(e142);
                                                            v0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    v0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                j10.items = charSequenceArr22;
                                j10.onClickListener = onClickListener22;
                                j10.show();
                                v0Var.B = j10;
                                return;
                            }
                        }
                        if (parse != null && !parse.getScheme().equalsIgnoreCase("data")) {
                            str = ve.e.v(parse, null, null, ve.e.a(parse.getHost()), null);
                            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                            j10.multipleLinesTitle = true;
                            j10.title = str2;
                            j10.bigTitle = false;
                            CharSequence[] charSequenceArr222 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                            DialogInterface.OnClickListener onClickListener222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.h0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i13) {
                                    int i14 = i11;
                                    String str6 = str5;
                                    i0 i0Var2 = i0Var;
                                    switch (i14) {
                                        case 0:
                                            v0 v0Var22 = i0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        y0 y0Var = v0Var22.M;
                                                        if (y0Var != null) {
                                                            new oc(y0Var, y0Var.e).k(false).k(true);
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
                                                        DownloadManager downloadManager = (DownloadManager) v0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        y0 y0Var2 = v0Var22.M;
                                                        if (y0Var2 != null) {
                                                            new oc(y0Var2, y0Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e122) {
                                                        FileLog.e(e122);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", v0Var22.getContext().getPackageName());
                                                    v0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e132) {
                                                    FileLog.e(e132);
                                                    v0Var22.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            v0 v0Var3 = i0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        y0 y0Var3 = v0Var3.M;
                                                        if (y0Var3 != null) {
                                                            new oc(y0Var3, y0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                        v0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e142) {
                                                        FileLog.e(e142);
                                                        v0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                v0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            j10.items = charSequenceArr222;
                            j10.onClickListener = onClickListener222;
                            j10.show();
                            v0Var.B = j10;
                        }
                        str = str5;
                        str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                        j10.multipleLinesTitle = true;
                        j10.title = str2;
                        j10.bigTitle = false;
                        CharSequence[] charSequenceArr2222 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                        DialogInterface.OnClickListener onClickListener2222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.h0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i13) {
                                int i14 = i11;
                                String str6 = str5;
                                i0 i0Var2 = i0Var;
                                switch (i14) {
                                    case 0:
                                        v0 v0Var22 = i0Var2.a;
                                        if (i13 != 0) {
                                            if (i13 != 1) {
                                                if (i13 == 2) {
                                                    AndroidUtilities.addToClipboard(str6);
                                                    y0 y0Var = v0Var22.M;
                                                    if (y0Var != null) {
                                                        new oc(y0Var, y0Var.e).k(false).k(true);
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
                                                    DownloadManager downloadManager = (DownloadManager) v0Var22.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    y0 y0Var2 = v0Var22.M;
                                                    if (y0Var2 != null) {
                                                        new oc(y0Var2, y0Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                        break;
                                                    }
                                                } catch (Exception e122) {
                                                    FileLog.e(e122);
                                                    return;
                                                }
                                            }
                                        } else {
                                            try {
                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                intent.putExtra("create_new_tab", true);
                                                intent.putExtra("com.android.browser.application_id", v0Var22.getContext().getPackageName());
                                                v0Var22.getContext().startActivity(intent);
                                                break;
                                            } catch (Exception e132) {
                                                FileLog.e(e132);
                                                v0Var22.loadUrl(str6);
                                                return;
                                            }
                                        }
                                        break;
                                    default:
                                        v0 v0Var3 = i0Var2.a;
                                        if (i13 != 0) {
                                            if (i13 != 1) {
                                                if (i13 == 2) {
                                                    AndroidUtilities.addToClipboard(str6);
                                                    y0 y0Var3 = v0Var3.M;
                                                    if (y0Var3 != null) {
                                                        new oc(y0Var3, y0Var3.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                    v0Var3.getContext().startActivity(intent2);
                                                    break;
                                                } catch (Exception e142) {
                                                    FileLog.e(e142);
                                                    v0Var3.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                        } else {
                                            v0Var3.loadUrl(str6);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        j10.items = charSequenceArr2222;
                        j10.onClickListener = onClickListener2222;
                        j10.show();
                        v0Var.B = j10;
                        break;
                    default:
                        v0 v0Var2 = i0Var.a;
                        f3 j11 = ll.j(v0Var2.getContext(), null, false, false);
                        try {
                            Uri parse2 = Uri.parse(str5);
                            str3 = ve.e.v(parse2, null, null, ve.e.a(parse2.getHost()), null);
                        } catch (Exception e12) {
                            try {
                                FileLog.e((Throwable) e12, false);
                                str3 = str5;
                            } catch (Exception e13) {
                                e = e13;
                                str3 = str5;
                                FileLog.e(e);
                                str4 = str3;
                                j11.multipleLinesTitle = true;
                                j11.title = str4;
                                j11.bigTitle = false;
                                CharSequence[] charSequenceArr322 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                                DialogInterface.OnClickListener onClickListener322 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.h0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        int i14 = i12;
                                        String str6 = str5;
                                        i0 i0Var2 = i0Var;
                                        switch (i14) {
                                            case 0:
                                                v0 v0Var22 = i0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            y0 y0Var = v0Var22.M;
                                                            if (y0Var != null) {
                                                                new oc(y0Var, y0Var.e).k(false).k(true);
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
                                                            DownloadManager downloadManager = (DownloadManager) v0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            y0 y0Var2 = v0Var22.M;
                                                            if (y0Var2 != null) {
                                                                new oc(y0Var2, y0Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e122) {
                                                            FileLog.e(e122);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", v0Var22.getContext().getPackageName());
                                                        v0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e132) {
                                                        FileLog.e(e132);
                                                        v0Var22.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                v0 v0Var3 = i0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            AndroidUtilities.addToClipboard(str6);
                                                            y0 y0Var3 = v0Var3.M;
                                                            if (y0Var3 != null) {
                                                                new oc(y0Var3, y0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                            v0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e142) {
                                                            FileLog.e(e142);
                                                            v0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    v0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                j11.items = charSequenceArr322;
                                j11.onClickListener = onClickListener322;
                                j11.show();
                                v0Var2.B = j11;
                            }
                        }
                        try {
                            str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                        } catch (Exception e14) {
                            e = e14;
                            FileLog.e(e);
                            str4 = str3;
                            j11.multipleLinesTitle = true;
                            j11.title = str4;
                            j11.bigTitle = false;
                            CharSequence[] charSequenceArr3222 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                            DialogInterface.OnClickListener onClickListener3222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.h0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i13) {
                                    int i14 = i12;
                                    String str6 = str5;
                                    i0 i0Var2 = i0Var;
                                    switch (i14) {
                                        case 0:
                                            v0 v0Var22 = i0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        y0 y0Var = v0Var22.M;
                                                        if (y0Var != null) {
                                                            new oc(y0Var, y0Var.e).k(false).k(true);
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
                                                        DownloadManager downloadManager = (DownloadManager) v0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        y0 y0Var2 = v0Var22.M;
                                                        if (y0Var2 != null) {
                                                            new oc(y0Var2, y0Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e122) {
                                                        FileLog.e(e122);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", v0Var22.getContext().getPackageName());
                                                    v0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e132) {
                                                    FileLog.e(e132);
                                                    v0Var22.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            v0 v0Var3 = i0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        AndroidUtilities.addToClipboard(str6);
                                                        y0 y0Var3 = v0Var3.M;
                                                        if (y0Var3 != null) {
                                                            new oc(y0Var3, y0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                        v0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e142) {
                                                        FileLog.e(e142);
                                                        v0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                v0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            j11.items = charSequenceArr3222;
                            j11.onClickListener = onClickListener3222;
                            j11.show();
                            v0Var2.B = j11;
                        }
                        j11.multipleLinesTitle = true;
                        j11.title = str4;
                        j11.bigTitle = false;
                        CharSequence[] charSequenceArr32222 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                        DialogInterface.OnClickListener onClickListener32222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.h0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i13) {
                                int i14 = i12;
                                String str6 = str5;
                                i0 i0Var2 = i0Var;
                                switch (i14) {
                                    case 0:
                                        v0 v0Var22 = i0Var2.a;
                                        if (i13 != 0) {
                                            if (i13 != 1) {
                                                if (i13 == 2) {
                                                    AndroidUtilities.addToClipboard(str6);
                                                    y0 y0Var = v0Var22.M;
                                                    if (y0Var != null) {
                                                        new oc(y0Var, y0Var.e).k(false).k(true);
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
                                                    DownloadManager downloadManager = (DownloadManager) v0Var22.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    y0 y0Var2 = v0Var22.M;
                                                    if (y0Var2 != null) {
                                                        new oc(y0Var2, y0Var2.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).k(true);
                                                        break;
                                                    }
                                                } catch (Exception e122) {
                                                    FileLog.e(e122);
                                                    return;
                                                }
                                            }
                                        } else {
                                            try {
                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                intent.putExtra("create_new_tab", true);
                                                intent.putExtra("com.android.browser.application_id", v0Var22.getContext().getPackageName());
                                                v0Var22.getContext().startActivity(intent);
                                                break;
                                            } catch (Exception e132) {
                                                FileLog.e(e132);
                                                v0Var22.loadUrl(str6);
                                                return;
                                            }
                                        }
                                        break;
                                    default:
                                        v0 v0Var3 = i0Var2.a;
                                        if (i13 != 0) {
                                            if (i13 != 1) {
                                                if (i13 == 2) {
                                                    AndroidUtilities.addToClipboard(str6);
                                                    y0 y0Var3 = v0Var3.M;
                                                    if (y0Var3 != null) {
                                                        new oc(y0Var3, y0Var3.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                    v0Var3.getContext().startActivity(intent2);
                                                    break;
                                                } catch (Exception e142) {
                                                    FileLog.e(e142);
                                                    v0Var3.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                        } else {
                                            v0Var3.loadUrl(str6);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        j11.items = charSequenceArr32222;
                        j11.onClickListener = onClickListener32222;
                        j11.show();
                        v0Var2.B = j11;
                }
            }
        });
        return true;
    }
}
