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
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Components.fc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class h0 implements View.OnLongClickListener {
    public final /* synthetic */ t0 a;

    public h0(t0 t0Var) {
        this.a = t0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.a.getHitTestResult();
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            final int i3 = 0;
            org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.web.f0
                public final /* synthetic */ h0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(8:23|(2:24|25)|(5:27|28|29|30|(5:32|33|34|35|36))(1:51)|42|33|34|35|36) */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
                
                    r0 = e;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    char c2;
                    String str;
                    String str2;
                    Uri parse;
                    String str3;
                    String str4;
                    String str5;
                    int i10 = i3;
                    final String str6 = extra;
                    final h0 h0Var = this.b;
                    final int i11 = 0;
                    final int i12 = 1;
                    switch (i10) {
                        case 0:
                            t0 t0Var = h0Var.a;
                            t2 l10 = k5.l(1, t0Var.getContext(), null, false);
                            try {
                                parse = Uri.parse(str6);
                            } catch (Exception e10) {
                                e = e10;
                                c2 = 2;
                            }
                            if (parse != null) {
                                c2 = 2;
                                try {
                                } catch (Exception e11) {
                                    e = e11;
                                    try {
                                        a8.g(e, false);
                                        str = str6;
                                        str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                                    } catch (Exception e12) {
                                        e = e12;
                                        str = str6;
                                        a8.g(e, true);
                                        str2 = str;
                                        l10.R = true;
                                        l10.P = str2;
                                        l10.Q = false;
                                        String M0 = bd.M0(2131747800, null);
                                        String M02 = bd.M0(2131747802, null);
                                        String M03 = bd.M0(2131751767, null);
                                        CharSequence[] charSequenceArr = new CharSequence[3];
                                        charSequenceArr[0] = M0;
                                        charSequenceArr[1] = M02;
                                        charSequenceArr[c2] = M03;
                                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i13) {
                                                int i14 = i12;
                                                String str7 = str6;
                                                h0 h0Var2 = h0Var;
                                                switch (i14) {
                                                    case 0:
                                                        t0 t0Var2 = h0Var2.a;
                                                        if (i13 != 0) {
                                                            if (i13 != 1) {
                                                                if (i13 == 2) {
                                                                    org.telegram.messenger.g0.g(str7);
                                                                    w0 w0Var = t0Var2.R;
                                                                    if (w0Var != null) {
                                                                        new fc(w0Var, w0Var.e).k(false).k(true);
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                try {
                                                                    String guessFileName = URLUtil.guessFileName(str7, null, "image/*");
                                                                    if (guessFileName == null) {
                                                                        guessFileName = "image.png";
                                                                    }
                                                                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str7));
                                                                    request.setMimeType("image/*");
                                                                    request.setDescription(bd.M0(2131742938, null));
                                                                    request.setNotificationVisibility(1);
                                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                    DownloadManager downloadManager = (DownloadManager) t0Var2.getContext().getSystemService("download");
                                                                    if (downloadManager != null) {
                                                                        downloadManager.enqueue(request);
                                                                    }
                                                                    w0 w0Var2 = t0Var2.R;
                                                                    if (w0Var2 != null) {
                                                                        new fc(w0Var2, w0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131742937, guessFileName))).k(true);
                                                                        break;
                                                                    }
                                                                } catch (Exception e13) {
                                                                    a8.g(e13, true);
                                                                    return;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                intent.putExtra("create_new_tab", true);
                                                                intent.putExtra("com.android.browser.application_id", t0Var2.getContext().getPackageName());
                                                                t0Var2.getContext().startActivity(intent);
                                                                break;
                                                            } catch (Exception e14) {
                                                                a8.g(e14, true);
                                                                t0Var2.loadUrl(str7);
                                                                return;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        t0 t0Var3 = h0Var2.a;
                                                        if (i13 != 0) {
                                                            if (i13 != 1) {
                                                                if (i13 == 2) {
                                                                    org.telegram.messenger.g0.g(str7);
                                                                    w0 w0Var3 = t0Var3.R;
                                                                    if (w0Var3 != null) {
                                                                        new fc(w0Var3, w0Var3.e).k(false).k(true);
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                try {
                                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                    intent2.putExtra("create_new_tab", true);
                                                                    intent2.putExtra("com.android.browser.application_id", t0Var3.getContext().getPackageName());
                                                                    t0Var3.getContext().startActivity(intent2);
                                                                    break;
                                                                } catch (Exception e15) {
                                                                    a8.g(e15, true);
                                                                    t0Var3.loadUrl(str7);
                                                                    return;
                                                                }
                                                            }
                                                        } else {
                                                            t0Var3.loadUrl(str7);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        };
                                        l10.M = charSequenceArr;
                                        l10.L = onClickListener;
                                        l10.show();
                                        t0Var.G = l10;
                                        return;
                                    }
                                    l10.R = true;
                                    l10.P = str2;
                                    l10.Q = false;
                                    String M04 = bd.M0(2131747800, null);
                                    String M022 = bd.M0(2131747802, null);
                                    String M032 = bd.M0(2131751767, null);
                                    CharSequence[] charSequenceArr2 = new CharSequence[3];
                                    charSequenceArr2[0] = M04;
                                    charSequenceArr2[1] = M022;
                                    charSequenceArr2[c2] = M032;
                                    DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i13) {
                                            int i14 = i12;
                                            String str7 = str6;
                                            h0 h0Var2 = h0Var;
                                            switch (i14) {
                                                case 0:
                                                    t0 t0Var2 = h0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                w0 w0Var = t0Var2.R;
                                                                if (w0Var != null) {
                                                                    new fc(w0Var, w0Var.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                String guessFileName = URLUtil.guessFileName(str7, null, "image/*");
                                                                if (guessFileName == null) {
                                                                    guessFileName = "image.png";
                                                                }
                                                                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str7));
                                                                request.setMimeType("image/*");
                                                                request.setDescription(bd.M0(2131742938, null));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) t0Var2.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                w0 w0Var2 = t0Var2.R;
                                                                if (w0Var2 != null) {
                                                                    new fc(w0Var2, w0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131742937, guessFileName))).k(true);
                                                                    break;
                                                                }
                                                            } catch (Exception e13) {
                                                                a8.g(e13, true);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", t0Var2.getContext().getPackageName());
                                                            t0Var2.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e14) {
                                                            a8.g(e14, true);
                                                            t0Var2.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    t0 t0Var3 = h0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                w0 w0Var3 = t0Var3.R;
                                                                if (w0Var3 != null) {
                                                                    new fc(w0Var3, w0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", t0Var3.getContext().getPackageName());
                                                                t0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e15) {
                                                                a8.g(e15, true);
                                                                t0Var3.loadUrl(str7);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        t0Var3.loadUrl(str7);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    l10.M = charSequenceArr2;
                                    l10.L = onClickListener2;
                                    l10.show();
                                    t0Var.G = l10;
                                    return;
                                }
                                if (!parse.getScheme().equalsIgnoreCase("data")) {
                                    str3 = sf.c.w(parse, null, null, sf.c.a(parse.getHost()), null);
                                    str = str3;
                                    str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                                    l10.R = true;
                                    l10.P = str2;
                                    l10.Q = false;
                                    String M042 = bd.M0(2131747800, null);
                                    String M0222 = bd.M0(2131747802, null);
                                    String M0322 = bd.M0(2131751767, null);
                                    CharSequence[] charSequenceArr22 = new CharSequence[3];
                                    charSequenceArr22[0] = M042;
                                    charSequenceArr22[1] = M0222;
                                    charSequenceArr22[c2] = M0322;
                                    DialogInterface.OnClickListener onClickListener22 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i13) {
                                            int i14 = i12;
                                            String str7 = str6;
                                            h0 h0Var2 = h0Var;
                                            switch (i14) {
                                                case 0:
                                                    t0 t0Var2 = h0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                w0 w0Var = t0Var2.R;
                                                                if (w0Var != null) {
                                                                    new fc(w0Var, w0Var.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                String guessFileName = URLUtil.guessFileName(str7, null, "image/*");
                                                                if (guessFileName == null) {
                                                                    guessFileName = "image.png";
                                                                }
                                                                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str7));
                                                                request.setMimeType("image/*");
                                                                request.setDescription(bd.M0(2131742938, null));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) t0Var2.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                w0 w0Var2 = t0Var2.R;
                                                                if (w0Var2 != null) {
                                                                    new fc(w0Var2, w0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131742937, guessFileName))).k(true);
                                                                    break;
                                                                }
                                                            } catch (Exception e13) {
                                                                a8.g(e13, true);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", t0Var2.getContext().getPackageName());
                                                            t0Var2.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e14) {
                                                            a8.g(e14, true);
                                                            t0Var2.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    t0 t0Var3 = h0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                w0 w0Var3 = t0Var3.R;
                                                                if (w0Var3 != null) {
                                                                    new fc(w0Var3, w0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", t0Var3.getContext().getPackageName());
                                                                t0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e15) {
                                                                a8.g(e15, true);
                                                                t0Var3.loadUrl(str7);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        t0Var3.loadUrl(str7);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    l10.M = charSequenceArr22;
                                    l10.L = onClickListener22;
                                    l10.show();
                                    t0Var.G = l10;
                                }
                            } else {
                                c2 = 2;
                            }
                            str3 = str6;
                            str = str3;
                            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                            l10.R = true;
                            l10.P = str2;
                            l10.Q = false;
                            String M0422 = bd.M0(2131747800, null);
                            String M02222 = bd.M0(2131747802, null);
                            String M03222 = bd.M0(2131751767, null);
                            CharSequence[] charSequenceArr222 = new CharSequence[3];
                            charSequenceArr222[0] = M0422;
                            charSequenceArr222[1] = M02222;
                            charSequenceArr222[c2] = M03222;
                            DialogInterface.OnClickListener onClickListener222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i13) {
                                    int i14 = i12;
                                    String str7 = str6;
                                    h0 h0Var2 = h0Var;
                                    switch (i14) {
                                        case 0:
                                            t0 t0Var2 = h0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        org.telegram.messenger.g0.g(str7);
                                                        w0 w0Var = t0Var2.R;
                                                        if (w0Var != null) {
                                                            new fc(w0Var, w0Var.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        String guessFileName = URLUtil.guessFileName(str7, null, "image/*");
                                                        if (guessFileName == null) {
                                                            guessFileName = "image.png";
                                                        }
                                                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str7));
                                                        request.setMimeType("image/*");
                                                        request.setDescription(bd.M0(2131742938, null));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) t0Var2.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        w0 w0Var2 = t0Var2.R;
                                                        if (w0Var2 != null) {
                                                            new fc(w0Var2, w0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131742937, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e13) {
                                                        a8.g(e13, true);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", t0Var2.getContext().getPackageName());
                                                    t0Var2.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e14) {
                                                    a8.g(e14, true);
                                                    t0Var2.loadUrl(str7);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            t0 t0Var3 = h0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        org.telegram.messenger.g0.g(str7);
                                                        w0 w0Var3 = t0Var3.R;
                                                        if (w0Var3 != null) {
                                                            new fc(w0Var3, w0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", t0Var3.getContext().getPackageName());
                                                        t0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e15) {
                                                        a8.g(e15, true);
                                                        t0Var3.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                t0Var3.loadUrl(str7);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            l10.M = charSequenceArr222;
                            l10.L = onClickListener222;
                            l10.show();
                            t0Var.G = l10;
                        default:
                            t0 t0Var2 = h0Var.a;
                            t2 l11 = k5.l(1, t0Var2.getContext(), null, false);
                            try {
                                Uri parse2 = Uri.parse(str6);
                                str4 = sf.c.w(parse2, null, null, sf.c.a(parse2.getHost()), null);
                            } catch (Exception e13) {
                                try {
                                    a8.g(e13, false);
                                    str4 = str6;
                                } catch (Exception e14) {
                                    e = e14;
                                    str4 = str6;
                                    a8.g(e, true);
                                    str5 = str4;
                                    l11.R = true;
                                    l11.P = str5;
                                    l11.Q = false;
                                    CharSequence[] charSequenceArr3 = {bd.M0(2131747802, null), bd.M0(2131754938, null), bd.M0(2131751762, null)};
                                    DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i13) {
                                            int i14 = i11;
                                            String str7 = str6;
                                            h0 h0Var2 = h0Var;
                                            switch (i14) {
                                                case 0:
                                                    t0 t0Var22 = h0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                w0 w0Var = t0Var22.R;
                                                                if (w0Var != null) {
                                                                    new fc(w0Var, w0Var.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                String guessFileName = URLUtil.guessFileName(str7, null, "image/*");
                                                                if (guessFileName == null) {
                                                                    guessFileName = "image.png";
                                                                }
                                                                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str7));
                                                                request.setMimeType("image/*");
                                                                request.setDescription(bd.M0(2131742938, null));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) t0Var22.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                w0 w0Var2 = t0Var22.R;
                                                                if (w0Var2 != null) {
                                                                    new fc(w0Var2, w0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131742937, guessFileName))).k(true);
                                                                    break;
                                                                }
                                                            } catch (Exception e132) {
                                                                a8.g(e132, true);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", t0Var22.getContext().getPackageName());
                                                            t0Var22.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e142) {
                                                            a8.g(e142, true);
                                                            t0Var22.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    t0 t0Var3 = h0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                w0 w0Var3 = t0Var3.R;
                                                                if (w0Var3 != null) {
                                                                    new fc(w0Var3, w0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", t0Var3.getContext().getPackageName());
                                                                t0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e15) {
                                                                a8.g(e15, true);
                                                                t0Var3.loadUrl(str7);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        t0Var3.loadUrl(str7);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    l11.M = charSequenceArr3;
                                    l11.L = onClickListener3;
                                    l11.show();
                                    t0Var2.G = l11;
                                }
                            }
                            try {
                                str5 = URLDecoder.decode(str4.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e15) {
                                e = e15;
                                a8.g(e, true);
                                str5 = str4;
                                l11.R = true;
                                l11.P = str5;
                                l11.Q = false;
                                CharSequence[] charSequenceArr32 = {bd.M0(2131747802, null), bd.M0(2131754938, null), bd.M0(2131751762, null)};
                                DialogInterface.OnClickListener onClickListener32 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        int i14 = i11;
                                        String str7 = str6;
                                        h0 h0Var2 = h0Var;
                                        switch (i14) {
                                            case 0:
                                                t0 t0Var22 = h0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            w0 w0Var = t0Var22.R;
                                                            if (w0Var != null) {
                                                                new fc(w0Var, w0Var.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            String guessFileName = URLUtil.guessFileName(str7, null, "image/*");
                                                            if (guessFileName == null) {
                                                                guessFileName = "image.png";
                                                            }
                                                            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str7));
                                                            request.setMimeType("image/*");
                                                            request.setDescription(bd.M0(2131742938, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) t0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            w0 w0Var2 = t0Var22.R;
                                                            if (w0Var2 != null) {
                                                                new fc(w0Var2, w0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131742937, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e132) {
                                                            a8.g(e132, true);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", t0Var22.getContext().getPackageName());
                                                        t0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e142) {
                                                        a8.g(e142, true);
                                                        t0Var22.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                t0 t0Var3 = h0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            w0 w0Var3 = t0Var3.R;
                                                            if (w0Var3 != null) {
                                                                new fc(w0Var3, w0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", t0Var3.getContext().getPackageName());
                                                            t0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e152) {
                                                            a8.g(e152, true);
                                                            t0Var3.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    t0Var3.loadUrl(str7);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                l11.M = charSequenceArr32;
                                l11.L = onClickListener32;
                                l11.show();
                                t0Var2.G = l11;
                            }
                            l11.R = true;
                            l11.P = str5;
                            l11.Q = false;
                            CharSequence[] charSequenceArr322 = {bd.M0(2131747802, null), bd.M0(2131754938, null), bd.M0(2131751762, null)};
                            DialogInterface.OnClickListener onClickListener322 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i13) {
                                    int i14 = i11;
                                    String str7 = str6;
                                    h0 h0Var2 = h0Var;
                                    switch (i14) {
                                        case 0:
                                            t0 t0Var22 = h0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        org.telegram.messenger.g0.g(str7);
                                                        w0 w0Var = t0Var22.R;
                                                        if (w0Var != null) {
                                                            new fc(w0Var, w0Var.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        String guessFileName = URLUtil.guessFileName(str7, null, "image/*");
                                                        if (guessFileName == null) {
                                                            guessFileName = "image.png";
                                                        }
                                                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str7));
                                                        request.setMimeType("image/*");
                                                        request.setDescription(bd.M0(2131742938, null));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) t0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        w0 w0Var2 = t0Var22.R;
                                                        if (w0Var2 != null) {
                                                            new fc(w0Var2, w0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131742937, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e132) {
                                                        a8.g(e132, true);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", t0Var22.getContext().getPackageName());
                                                    t0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e142) {
                                                    a8.g(e142, true);
                                                    t0Var22.loadUrl(str7);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            t0 t0Var3 = h0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        org.telegram.messenger.g0.g(str7);
                                                        w0 w0Var3 = t0Var3.R;
                                                        if (w0Var3 != null) {
                                                            new fc(w0Var3, w0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", t0Var3.getContext().getPackageName());
                                                        t0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e152) {
                                                        a8.g(e152, true);
                                                        t0Var3.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                t0Var3.loadUrl(str7);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            l11.M = charSequenceArr322;
                            l11.L = onClickListener322;
                            l11.show();
                            t0Var2.G = l11;
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
        org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.web.f0
            public final /* synthetic */ h0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(8:23|(2:24|25)|(5:27|28|29|30|(5:32|33|34|35|36))(1:51)|42|33|34|35|36) */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
            
                r0 = e;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                char c2;
                String str;
                String str2;
                Uri parse;
                String str3;
                String str4;
                String str5;
                int i102 = i10;
                final String str6 = extra2;
                final h0 h0Var = this.b;
                final int i11 = 0;
                final int i12 = 1;
                switch (i102) {
                    case 0:
                        t0 t0Var = h0Var.a;
                        t2 l10 = k5.l(1, t0Var.getContext(), null, false);
                        try {
                            parse = Uri.parse(str6);
                        } catch (Exception e10) {
                            e = e10;
                            c2 = 2;
                        }
                        if (parse != null) {
                            c2 = 2;
                            try {
                            } catch (Exception e11) {
                                e = e11;
                                try {
                                    a8.g(e, false);
                                    str = str6;
                                    str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                                } catch (Exception e12) {
                                    e = e12;
                                    str = str6;
                                    a8.g(e, true);
                                    str2 = str;
                                    l10.R = true;
                                    l10.P = str2;
                                    l10.Q = false;
                                    String M0422 = bd.M0(2131747800, null);
                                    String M02222 = bd.M0(2131747802, null);
                                    String M03222 = bd.M0(2131751767, null);
                                    CharSequence[] charSequenceArr222 = new CharSequence[3];
                                    charSequenceArr222[0] = M0422;
                                    charSequenceArr222[1] = M02222;
                                    charSequenceArr222[c2] = M03222;
                                    DialogInterface.OnClickListener onClickListener222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i13) {
                                            int i14 = i12;
                                            String str7 = str6;
                                            h0 h0Var2 = h0Var;
                                            switch (i14) {
                                                case 0:
                                                    t0 t0Var22 = h0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                w0 w0Var = t0Var22.R;
                                                                if (w0Var != null) {
                                                                    new fc(w0Var, w0Var.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                String guessFileName = URLUtil.guessFileName(str7, null, "image/*");
                                                                if (guessFileName == null) {
                                                                    guessFileName = "image.png";
                                                                }
                                                                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str7));
                                                                request.setMimeType("image/*");
                                                                request.setDescription(bd.M0(2131742938, null));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) t0Var22.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                w0 w0Var2 = t0Var22.R;
                                                                if (w0Var2 != null) {
                                                                    new fc(w0Var2, w0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131742937, guessFileName))).k(true);
                                                                    break;
                                                                }
                                                            } catch (Exception e132) {
                                                                a8.g(e132, true);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", t0Var22.getContext().getPackageName());
                                                            t0Var22.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e142) {
                                                            a8.g(e142, true);
                                                            t0Var22.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    t0 t0Var3 = h0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                w0 w0Var3 = t0Var3.R;
                                                                if (w0Var3 != null) {
                                                                    new fc(w0Var3, w0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", t0Var3.getContext().getPackageName());
                                                                t0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e152) {
                                                                a8.g(e152, true);
                                                                t0Var3.loadUrl(str7);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        t0Var3.loadUrl(str7);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    l10.M = charSequenceArr222;
                                    l10.L = onClickListener222;
                                    l10.show();
                                    t0Var.G = l10;
                                    return;
                                }
                                l10.R = true;
                                l10.P = str2;
                                l10.Q = false;
                                String M04222 = bd.M0(2131747800, null);
                                String M022222 = bd.M0(2131747802, null);
                                String M032222 = bd.M0(2131751767, null);
                                CharSequence[] charSequenceArr2222 = new CharSequence[3];
                                charSequenceArr2222[0] = M04222;
                                charSequenceArr2222[1] = M022222;
                                charSequenceArr2222[c2] = M032222;
                                DialogInterface.OnClickListener onClickListener2222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        int i14 = i12;
                                        String str7 = str6;
                                        h0 h0Var2 = h0Var;
                                        switch (i14) {
                                            case 0:
                                                t0 t0Var22 = h0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            w0 w0Var = t0Var22.R;
                                                            if (w0Var != null) {
                                                                new fc(w0Var, w0Var.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            String guessFileName = URLUtil.guessFileName(str7, null, "image/*");
                                                            if (guessFileName == null) {
                                                                guessFileName = "image.png";
                                                            }
                                                            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str7));
                                                            request.setMimeType("image/*");
                                                            request.setDescription(bd.M0(2131742938, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) t0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            w0 w0Var2 = t0Var22.R;
                                                            if (w0Var2 != null) {
                                                                new fc(w0Var2, w0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131742937, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e132) {
                                                            a8.g(e132, true);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", t0Var22.getContext().getPackageName());
                                                        t0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e142) {
                                                        a8.g(e142, true);
                                                        t0Var22.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                t0 t0Var3 = h0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            w0 w0Var3 = t0Var3.R;
                                                            if (w0Var3 != null) {
                                                                new fc(w0Var3, w0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", t0Var3.getContext().getPackageName());
                                                            t0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e152) {
                                                            a8.g(e152, true);
                                                            t0Var3.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    t0Var3.loadUrl(str7);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                l10.M = charSequenceArr2222;
                                l10.L = onClickListener2222;
                                l10.show();
                                t0Var.G = l10;
                                return;
                            }
                            if (!parse.getScheme().equalsIgnoreCase("data")) {
                                str3 = sf.c.w(parse, null, null, sf.c.a(parse.getHost()), null);
                                str = str3;
                                str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                                l10.R = true;
                                l10.P = str2;
                                l10.Q = false;
                                String M042222 = bd.M0(2131747800, null);
                                String M0222222 = bd.M0(2131747802, null);
                                String M0322222 = bd.M0(2131751767, null);
                                CharSequence[] charSequenceArr22222 = new CharSequence[3];
                                charSequenceArr22222[0] = M042222;
                                charSequenceArr22222[1] = M0222222;
                                charSequenceArr22222[c2] = M0322222;
                                DialogInterface.OnClickListener onClickListener22222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        int i14 = i12;
                                        String str7 = str6;
                                        h0 h0Var2 = h0Var;
                                        switch (i14) {
                                            case 0:
                                                t0 t0Var22 = h0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            w0 w0Var = t0Var22.R;
                                                            if (w0Var != null) {
                                                                new fc(w0Var, w0Var.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            String guessFileName = URLUtil.guessFileName(str7, null, "image/*");
                                                            if (guessFileName == null) {
                                                                guessFileName = "image.png";
                                                            }
                                                            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str7));
                                                            request.setMimeType("image/*");
                                                            request.setDescription(bd.M0(2131742938, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) t0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            w0 w0Var2 = t0Var22.R;
                                                            if (w0Var2 != null) {
                                                                new fc(w0Var2, w0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131742937, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e132) {
                                                            a8.g(e132, true);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", t0Var22.getContext().getPackageName());
                                                        t0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e142) {
                                                        a8.g(e142, true);
                                                        t0Var22.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                t0 t0Var3 = h0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            w0 w0Var3 = t0Var3.R;
                                                            if (w0Var3 != null) {
                                                                new fc(w0Var3, w0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", t0Var3.getContext().getPackageName());
                                                            t0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e152) {
                                                            a8.g(e152, true);
                                                            t0Var3.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    t0Var3.loadUrl(str7);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                l10.M = charSequenceArr22222;
                                l10.L = onClickListener22222;
                                l10.show();
                                t0Var.G = l10;
                            }
                        } else {
                            c2 = 2;
                        }
                        str3 = str6;
                        str = str3;
                        str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                        l10.R = true;
                        l10.P = str2;
                        l10.Q = false;
                        String M0422222 = bd.M0(2131747800, null);
                        String M02222222 = bd.M0(2131747802, null);
                        String M03222222 = bd.M0(2131751767, null);
                        CharSequence[] charSequenceArr222222 = new CharSequence[3];
                        charSequenceArr222222[0] = M0422222;
                        charSequenceArr222222[1] = M02222222;
                        charSequenceArr222222[c2] = M03222222;
                        DialogInterface.OnClickListener onClickListener222222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i13) {
                                int i14 = i12;
                                String str7 = str6;
                                h0 h0Var2 = h0Var;
                                switch (i14) {
                                    case 0:
                                        t0 t0Var22 = h0Var2.a;
                                        if (i13 != 0) {
                                            if (i13 != 1) {
                                                if (i13 == 2) {
                                                    org.telegram.messenger.g0.g(str7);
                                                    w0 w0Var = t0Var22.R;
                                                    if (w0Var != null) {
                                                        new fc(w0Var, w0Var.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    String guessFileName = URLUtil.guessFileName(str7, null, "image/*");
                                                    if (guessFileName == null) {
                                                        guessFileName = "image.png";
                                                    }
                                                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str7));
                                                    request.setMimeType("image/*");
                                                    request.setDescription(bd.M0(2131742938, null));
                                                    request.setNotificationVisibility(1);
                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                    DownloadManager downloadManager = (DownloadManager) t0Var22.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    w0 w0Var2 = t0Var22.R;
                                                    if (w0Var2 != null) {
                                                        new fc(w0Var2, w0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131742937, guessFileName))).k(true);
                                                        break;
                                                    }
                                                } catch (Exception e132) {
                                                    a8.g(e132, true);
                                                    return;
                                                }
                                            }
                                        } else {
                                            try {
                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                intent.putExtra("create_new_tab", true);
                                                intent.putExtra("com.android.browser.application_id", t0Var22.getContext().getPackageName());
                                                t0Var22.getContext().startActivity(intent);
                                                break;
                                            } catch (Exception e142) {
                                                a8.g(e142, true);
                                                t0Var22.loadUrl(str7);
                                                return;
                                            }
                                        }
                                        break;
                                    default:
                                        t0 t0Var3 = h0Var2.a;
                                        if (i13 != 0) {
                                            if (i13 != 1) {
                                                if (i13 == 2) {
                                                    org.telegram.messenger.g0.g(str7);
                                                    w0 w0Var3 = t0Var3.R;
                                                    if (w0Var3 != null) {
                                                        new fc(w0Var3, w0Var3.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", t0Var3.getContext().getPackageName());
                                                    t0Var3.getContext().startActivity(intent2);
                                                    break;
                                                } catch (Exception e152) {
                                                    a8.g(e152, true);
                                                    t0Var3.loadUrl(str7);
                                                    return;
                                                }
                                            }
                                        } else {
                                            t0Var3.loadUrl(str7);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        l10.M = charSequenceArr222222;
                        l10.L = onClickListener222222;
                        l10.show();
                        t0Var.G = l10;
                    default:
                        t0 t0Var2 = h0Var.a;
                        t2 l11 = k5.l(1, t0Var2.getContext(), null, false);
                        try {
                            Uri parse2 = Uri.parse(str6);
                            str4 = sf.c.w(parse2, null, null, sf.c.a(parse2.getHost()), null);
                        } catch (Exception e13) {
                            try {
                                a8.g(e13, false);
                                str4 = str6;
                            } catch (Exception e14) {
                                e = e14;
                                str4 = str6;
                                a8.g(e, true);
                                str5 = str4;
                                l11.R = true;
                                l11.P = str5;
                                l11.Q = false;
                                CharSequence[] charSequenceArr322 = {bd.M0(2131747802, null), bd.M0(2131754938, null), bd.M0(2131751762, null)};
                                DialogInterface.OnClickListener onClickListener322 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        int i14 = i11;
                                        String str7 = str6;
                                        h0 h0Var2 = h0Var;
                                        switch (i14) {
                                            case 0:
                                                t0 t0Var22 = h0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            w0 w0Var = t0Var22.R;
                                                            if (w0Var != null) {
                                                                new fc(w0Var, w0Var.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            String guessFileName = URLUtil.guessFileName(str7, null, "image/*");
                                                            if (guessFileName == null) {
                                                                guessFileName = "image.png";
                                                            }
                                                            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str7));
                                                            request.setMimeType("image/*");
                                                            request.setDescription(bd.M0(2131742938, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) t0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            w0 w0Var2 = t0Var22.R;
                                                            if (w0Var2 != null) {
                                                                new fc(w0Var2, w0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131742937, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e132) {
                                                            a8.g(e132, true);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", t0Var22.getContext().getPackageName());
                                                        t0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e142) {
                                                        a8.g(e142, true);
                                                        t0Var22.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                t0 t0Var3 = h0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            w0 w0Var3 = t0Var3.R;
                                                            if (w0Var3 != null) {
                                                                new fc(w0Var3, w0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", t0Var3.getContext().getPackageName());
                                                            t0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e152) {
                                                            a8.g(e152, true);
                                                            t0Var3.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    t0Var3.loadUrl(str7);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                l11.M = charSequenceArr322;
                                l11.L = onClickListener322;
                                l11.show();
                                t0Var2.G = l11;
                            }
                        }
                        try {
                            str5 = URLDecoder.decode(str4.replaceAll("\\+", "%2b"), "UTF-8");
                        } catch (Exception e15) {
                            e = e15;
                            a8.g(e, true);
                            str5 = str4;
                            l11.R = true;
                            l11.P = str5;
                            l11.Q = false;
                            CharSequence[] charSequenceArr3222 = {bd.M0(2131747802, null), bd.M0(2131754938, null), bd.M0(2131751762, null)};
                            DialogInterface.OnClickListener onClickListener3222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i13) {
                                    int i14 = i11;
                                    String str7 = str6;
                                    h0 h0Var2 = h0Var;
                                    switch (i14) {
                                        case 0:
                                            t0 t0Var22 = h0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        org.telegram.messenger.g0.g(str7);
                                                        w0 w0Var = t0Var22.R;
                                                        if (w0Var != null) {
                                                            new fc(w0Var, w0Var.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        String guessFileName = URLUtil.guessFileName(str7, null, "image/*");
                                                        if (guessFileName == null) {
                                                            guessFileName = "image.png";
                                                        }
                                                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str7));
                                                        request.setMimeType("image/*");
                                                        request.setDescription(bd.M0(2131742938, null));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) t0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        w0 w0Var2 = t0Var22.R;
                                                        if (w0Var2 != null) {
                                                            new fc(w0Var2, w0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131742937, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e132) {
                                                        a8.g(e132, true);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", t0Var22.getContext().getPackageName());
                                                    t0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e142) {
                                                    a8.g(e142, true);
                                                    t0Var22.loadUrl(str7);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            t0 t0Var3 = h0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        org.telegram.messenger.g0.g(str7);
                                                        w0 w0Var3 = t0Var3.R;
                                                        if (w0Var3 != null) {
                                                            new fc(w0Var3, w0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", t0Var3.getContext().getPackageName());
                                                        t0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e152) {
                                                        a8.g(e152, true);
                                                        t0Var3.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                t0Var3.loadUrl(str7);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            l11.M = charSequenceArr3222;
                            l11.L = onClickListener3222;
                            l11.show();
                            t0Var2.G = l11;
                        }
                        l11.R = true;
                        l11.P = str5;
                        l11.Q = false;
                        CharSequence[] charSequenceArr32222 = {bd.M0(2131747802, null), bd.M0(2131754938, null), bd.M0(2131751762, null)};
                        DialogInterface.OnClickListener onClickListener32222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i13) {
                                int i14 = i11;
                                String str7 = str6;
                                h0 h0Var2 = h0Var;
                                switch (i14) {
                                    case 0:
                                        t0 t0Var22 = h0Var2.a;
                                        if (i13 != 0) {
                                            if (i13 != 1) {
                                                if (i13 == 2) {
                                                    org.telegram.messenger.g0.g(str7);
                                                    w0 w0Var = t0Var22.R;
                                                    if (w0Var != null) {
                                                        new fc(w0Var, w0Var.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    String guessFileName = URLUtil.guessFileName(str7, null, "image/*");
                                                    if (guessFileName == null) {
                                                        guessFileName = "image.png";
                                                    }
                                                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str7));
                                                    request.setMimeType("image/*");
                                                    request.setDescription(bd.M0(2131742938, null));
                                                    request.setNotificationVisibility(1);
                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                    DownloadManager downloadManager = (DownloadManager) t0Var22.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    w0 w0Var2 = t0Var22.R;
                                                    if (w0Var2 != null) {
                                                        new fc(w0Var2, w0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131742937, guessFileName))).k(true);
                                                        break;
                                                    }
                                                } catch (Exception e132) {
                                                    a8.g(e132, true);
                                                    return;
                                                }
                                            }
                                        } else {
                                            try {
                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                intent.putExtra("create_new_tab", true);
                                                intent.putExtra("com.android.browser.application_id", t0Var22.getContext().getPackageName());
                                                t0Var22.getContext().startActivity(intent);
                                                break;
                                            } catch (Exception e142) {
                                                a8.g(e142, true);
                                                t0Var22.loadUrl(str7);
                                                return;
                                            }
                                        }
                                        break;
                                    default:
                                        t0 t0Var3 = h0Var2.a;
                                        if (i13 != 0) {
                                            if (i13 != 1) {
                                                if (i13 == 2) {
                                                    org.telegram.messenger.g0.g(str7);
                                                    w0 w0Var3 = t0Var3.R;
                                                    if (w0Var3 != null) {
                                                        new fc(w0Var3, w0Var3.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", t0Var3.getContext().getPackageName());
                                                    t0Var3.getContext().startActivity(intent2);
                                                    break;
                                                } catch (Exception e152) {
                                                    a8.g(e152, true);
                                                    t0Var3.loadUrl(str7);
                                                    return;
                                                }
                                            }
                                        } else {
                                            t0Var3.loadUrl(str7);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        l11.M = charSequenceArr32222;
                        l11.L = onClickListener32222;
                        l11.show();
                        t0Var2.G = l11;
                }
            }
        });
        return true;
    }
}
