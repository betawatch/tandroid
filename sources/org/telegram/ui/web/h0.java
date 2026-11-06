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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class h0 implements View.OnLongClickListener {
    public final /* synthetic */ u0 a;

    public h0(u0 u0Var) {
        this.a = u0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.a.getHitTestResult();
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            final int i7 = 0;
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
                    char c10;
                    String str;
                    String str2;
                    Uri parse;
                    String str3;
                    String str4;
                    String str5;
                    int i10 = i7;
                    final String str6 = extra;
                    final h0 h0Var = this.b;
                    final int i11 = 0;
                    final int i12 = 1;
                    switch (i10) {
                        case 0:
                            u0 u0Var = h0Var.a;
                            v2 l10 = k5.l(1, u0Var.getContext(), null, false);
                            try {
                                parse = Uri.parse(str6);
                            } catch (Exception e10) {
                                e = e10;
                                c10 = 2;
                            }
                            if (parse != null) {
                                c10 = 2;
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
                                        l10.Q = true;
                                        l10.O = str2;
                                        l10.P = false;
                                        String M0 = hd.M0(2131747791, null);
                                        String M02 = hd.M0(2131747793, null);
                                        String M03 = hd.M0(2131751767, null);
                                        CharSequence[] charSequenceArr = new CharSequence[3];
                                        charSequenceArr[0] = M0;
                                        charSequenceArr[1] = M02;
                                        charSequenceArr[c10] = M03;
                                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i13) {
                                                int i14 = i12;
                                                String str7 = str6;
                                                h0 h0Var2 = h0Var;
                                                switch (i14) {
                                                    case 0:
                                                        u0 u0Var2 = h0Var2.a;
                                                        if (i13 != 0) {
                                                            if (i13 != 1) {
                                                                if (i13 == 2) {
                                                                    org.telegram.messenger.g0.g(str7);
                                                                    x0 x0Var = u0Var2.Q;
                                                                    if (x0Var != null) {
                                                                        new hc(x0Var, x0Var.e).k(false).k(true);
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
                                                                    request.setDescription(hd.M0(2131742929, null));
                                                                    request.setNotificationVisibility(1);
                                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                    DownloadManager downloadManager = (DownloadManager) u0Var2.getContext().getSystemService("download");
                                                                    if (downloadManager != null) {
                                                                        downloadManager.enqueue(request);
                                                                    }
                                                                    x0 x0Var2 = u0Var2.Q;
                                                                    if (x0Var2 != null) {
                                                                        new hc(x0Var2, x0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131742928, guessFileName))).k(true);
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
                                                                intent.putExtra("com.android.browser.application_id", u0Var2.getContext().getPackageName());
                                                                u0Var2.getContext().startActivity(intent);
                                                                break;
                                                            } catch (Exception e14) {
                                                                a8.g(e14, true);
                                                                u0Var2.loadUrl(str7);
                                                                return;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        u0 u0Var3 = h0Var2.a;
                                                        if (i13 != 0) {
                                                            if (i13 != 1) {
                                                                if (i13 == 2) {
                                                                    org.telegram.messenger.g0.g(str7);
                                                                    x0 x0Var3 = u0Var3.Q;
                                                                    if (x0Var3 != null) {
                                                                        new hc(x0Var3, x0Var3.e).k(false).k(true);
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                try {
                                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                    intent2.putExtra("create_new_tab", true);
                                                                    intent2.putExtra("com.android.browser.application_id", u0Var3.getContext().getPackageName());
                                                                    u0Var3.getContext().startActivity(intent2);
                                                                    break;
                                                                } catch (Exception e15) {
                                                                    a8.g(e15, true);
                                                                    u0Var3.loadUrl(str7);
                                                                    return;
                                                                }
                                                            }
                                                        } else {
                                                            u0Var3.loadUrl(str7);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        };
                                        l10.L = charSequenceArr;
                                        l10.K = onClickListener;
                                        l10.show();
                                        u0Var.F = l10;
                                        return;
                                    }
                                    l10.Q = true;
                                    l10.O = str2;
                                    l10.P = false;
                                    String M04 = hd.M0(2131747791, null);
                                    String M022 = hd.M0(2131747793, null);
                                    String M032 = hd.M0(2131751767, null);
                                    CharSequence[] charSequenceArr2 = new CharSequence[3];
                                    charSequenceArr2[0] = M04;
                                    charSequenceArr2[1] = M022;
                                    charSequenceArr2[c10] = M032;
                                    DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i13) {
                                            int i14 = i12;
                                            String str7 = str6;
                                            h0 h0Var2 = h0Var;
                                            switch (i14) {
                                                case 0:
                                                    u0 u0Var2 = h0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                x0 x0Var = u0Var2.Q;
                                                                if (x0Var != null) {
                                                                    new hc(x0Var, x0Var.e).k(false).k(true);
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
                                                                request.setDescription(hd.M0(2131742929, null));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) u0Var2.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                x0 x0Var2 = u0Var2.Q;
                                                                if (x0Var2 != null) {
                                                                    new hc(x0Var2, x0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131742928, guessFileName))).k(true);
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
                                                            intent.putExtra("com.android.browser.application_id", u0Var2.getContext().getPackageName());
                                                            u0Var2.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e14) {
                                                            a8.g(e14, true);
                                                            u0Var2.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    u0 u0Var3 = h0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                x0 x0Var3 = u0Var3.Q;
                                                                if (x0Var3 != null) {
                                                                    new hc(x0Var3, x0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", u0Var3.getContext().getPackageName());
                                                                u0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e15) {
                                                                a8.g(e15, true);
                                                                u0Var3.loadUrl(str7);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        u0Var3.loadUrl(str7);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    l10.L = charSequenceArr2;
                                    l10.K = onClickListener2;
                                    l10.show();
                                    u0Var.F = l10;
                                    return;
                                }
                                if (!parse.getScheme().equalsIgnoreCase("data")) {
                                    str3 = vf.c.w(parse, null, null, vf.c.a(parse.getHost()), null);
                                    str = str3;
                                    str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                                    l10.Q = true;
                                    l10.O = str2;
                                    l10.P = false;
                                    String M042 = hd.M0(2131747791, null);
                                    String M0222 = hd.M0(2131747793, null);
                                    String M0322 = hd.M0(2131751767, null);
                                    CharSequence[] charSequenceArr22 = new CharSequence[3];
                                    charSequenceArr22[0] = M042;
                                    charSequenceArr22[1] = M0222;
                                    charSequenceArr22[c10] = M0322;
                                    DialogInterface.OnClickListener onClickListener22 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i13) {
                                            int i14 = i12;
                                            String str7 = str6;
                                            h0 h0Var2 = h0Var;
                                            switch (i14) {
                                                case 0:
                                                    u0 u0Var2 = h0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                x0 x0Var = u0Var2.Q;
                                                                if (x0Var != null) {
                                                                    new hc(x0Var, x0Var.e).k(false).k(true);
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
                                                                request.setDescription(hd.M0(2131742929, null));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) u0Var2.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                x0 x0Var2 = u0Var2.Q;
                                                                if (x0Var2 != null) {
                                                                    new hc(x0Var2, x0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131742928, guessFileName))).k(true);
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
                                                            intent.putExtra("com.android.browser.application_id", u0Var2.getContext().getPackageName());
                                                            u0Var2.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e14) {
                                                            a8.g(e14, true);
                                                            u0Var2.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    u0 u0Var3 = h0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                x0 x0Var3 = u0Var3.Q;
                                                                if (x0Var3 != null) {
                                                                    new hc(x0Var3, x0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", u0Var3.getContext().getPackageName());
                                                                u0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e15) {
                                                                a8.g(e15, true);
                                                                u0Var3.loadUrl(str7);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        u0Var3.loadUrl(str7);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    l10.L = charSequenceArr22;
                                    l10.K = onClickListener22;
                                    l10.show();
                                    u0Var.F = l10;
                                }
                            } else {
                                c10 = 2;
                            }
                            str3 = str6;
                            str = str3;
                            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                            l10.Q = true;
                            l10.O = str2;
                            l10.P = false;
                            String M0422 = hd.M0(2131747791, null);
                            String M02222 = hd.M0(2131747793, null);
                            String M03222 = hd.M0(2131751767, null);
                            CharSequence[] charSequenceArr222 = new CharSequence[3];
                            charSequenceArr222[0] = M0422;
                            charSequenceArr222[1] = M02222;
                            charSequenceArr222[c10] = M03222;
                            DialogInterface.OnClickListener onClickListener222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i13) {
                                    int i14 = i12;
                                    String str7 = str6;
                                    h0 h0Var2 = h0Var;
                                    switch (i14) {
                                        case 0:
                                            u0 u0Var2 = h0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        org.telegram.messenger.g0.g(str7);
                                                        x0 x0Var = u0Var2.Q;
                                                        if (x0Var != null) {
                                                            new hc(x0Var, x0Var.e).k(false).k(true);
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
                                                        request.setDescription(hd.M0(2131742929, null));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) u0Var2.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        x0 x0Var2 = u0Var2.Q;
                                                        if (x0Var2 != null) {
                                                            new hc(x0Var2, x0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131742928, guessFileName))).k(true);
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
                                                    intent.putExtra("com.android.browser.application_id", u0Var2.getContext().getPackageName());
                                                    u0Var2.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e14) {
                                                    a8.g(e14, true);
                                                    u0Var2.loadUrl(str7);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            u0 u0Var3 = h0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        org.telegram.messenger.g0.g(str7);
                                                        x0 x0Var3 = u0Var3.Q;
                                                        if (x0Var3 != null) {
                                                            new hc(x0Var3, x0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", u0Var3.getContext().getPackageName());
                                                        u0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e15) {
                                                        a8.g(e15, true);
                                                        u0Var3.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                u0Var3.loadUrl(str7);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            l10.L = charSequenceArr222;
                            l10.K = onClickListener222;
                            l10.show();
                            u0Var.F = l10;
                        default:
                            u0 u0Var2 = h0Var.a;
                            v2 l11 = k5.l(1, u0Var2.getContext(), null, false);
                            try {
                                Uri parse2 = Uri.parse(str6);
                                str4 = vf.c.w(parse2, null, null, vf.c.a(parse2.getHost()), null);
                            } catch (Exception e13) {
                                try {
                                    a8.g(e13, false);
                                    str4 = str6;
                                } catch (Exception e14) {
                                    e = e14;
                                    str4 = str6;
                                    a8.g(e, true);
                                    str5 = str4;
                                    l11.Q = true;
                                    l11.O = str5;
                                    l11.P = false;
                                    CharSequence[] charSequenceArr3 = {hd.M0(2131747793, null), hd.M0(2131754938, null), hd.M0(2131751762, null)};
                                    DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i13) {
                                            int i14 = i11;
                                            String str7 = str6;
                                            h0 h0Var2 = h0Var;
                                            switch (i14) {
                                                case 0:
                                                    u0 u0Var22 = h0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                x0 x0Var = u0Var22.Q;
                                                                if (x0Var != null) {
                                                                    new hc(x0Var, x0Var.e).k(false).k(true);
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
                                                                request.setDescription(hd.M0(2131742929, null));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) u0Var22.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                x0 x0Var2 = u0Var22.Q;
                                                                if (x0Var2 != null) {
                                                                    new hc(x0Var2, x0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131742928, guessFileName))).k(true);
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
                                                            intent.putExtra("com.android.browser.application_id", u0Var22.getContext().getPackageName());
                                                            u0Var22.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e142) {
                                                            a8.g(e142, true);
                                                            u0Var22.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    u0 u0Var3 = h0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                x0 x0Var3 = u0Var3.Q;
                                                                if (x0Var3 != null) {
                                                                    new hc(x0Var3, x0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", u0Var3.getContext().getPackageName());
                                                                u0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e15) {
                                                                a8.g(e15, true);
                                                                u0Var3.loadUrl(str7);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        u0Var3.loadUrl(str7);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    l11.L = charSequenceArr3;
                                    l11.K = onClickListener3;
                                    l11.show();
                                    u0Var2.F = l11;
                                }
                            }
                            try {
                                str5 = URLDecoder.decode(str4.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e15) {
                                e = e15;
                                a8.g(e, true);
                                str5 = str4;
                                l11.Q = true;
                                l11.O = str5;
                                l11.P = false;
                                CharSequence[] charSequenceArr32 = {hd.M0(2131747793, null), hd.M0(2131754938, null), hd.M0(2131751762, null)};
                                DialogInterface.OnClickListener onClickListener32 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        int i14 = i11;
                                        String str7 = str6;
                                        h0 h0Var2 = h0Var;
                                        switch (i14) {
                                            case 0:
                                                u0 u0Var22 = h0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            x0 x0Var = u0Var22.Q;
                                                            if (x0Var != null) {
                                                                new hc(x0Var, x0Var.e).k(false).k(true);
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
                                                            request.setDescription(hd.M0(2131742929, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) u0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            x0 x0Var2 = u0Var22.Q;
                                                            if (x0Var2 != null) {
                                                                new hc(x0Var2, x0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131742928, guessFileName))).k(true);
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
                                                        intent.putExtra("com.android.browser.application_id", u0Var22.getContext().getPackageName());
                                                        u0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e142) {
                                                        a8.g(e142, true);
                                                        u0Var22.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                u0 u0Var3 = h0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            x0 x0Var3 = u0Var3.Q;
                                                            if (x0Var3 != null) {
                                                                new hc(x0Var3, x0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", u0Var3.getContext().getPackageName());
                                                            u0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e152) {
                                                            a8.g(e152, true);
                                                            u0Var3.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    u0Var3.loadUrl(str7);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                l11.L = charSequenceArr32;
                                l11.K = onClickListener32;
                                l11.show();
                                u0Var2.F = l11;
                            }
                            l11.Q = true;
                            l11.O = str5;
                            l11.P = false;
                            CharSequence[] charSequenceArr322 = {hd.M0(2131747793, null), hd.M0(2131754938, null), hd.M0(2131751762, null)};
                            DialogInterface.OnClickListener onClickListener322 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i13) {
                                    int i14 = i11;
                                    String str7 = str6;
                                    h0 h0Var2 = h0Var;
                                    switch (i14) {
                                        case 0:
                                            u0 u0Var22 = h0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        org.telegram.messenger.g0.g(str7);
                                                        x0 x0Var = u0Var22.Q;
                                                        if (x0Var != null) {
                                                            new hc(x0Var, x0Var.e).k(false).k(true);
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
                                                        request.setDescription(hd.M0(2131742929, null));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) u0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        x0 x0Var2 = u0Var22.Q;
                                                        if (x0Var2 != null) {
                                                            new hc(x0Var2, x0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131742928, guessFileName))).k(true);
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
                                                    intent.putExtra("com.android.browser.application_id", u0Var22.getContext().getPackageName());
                                                    u0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e142) {
                                                    a8.g(e142, true);
                                                    u0Var22.loadUrl(str7);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            u0 u0Var3 = h0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        org.telegram.messenger.g0.g(str7);
                                                        x0 x0Var3 = u0Var3.Q;
                                                        if (x0Var3 != null) {
                                                            new hc(x0Var3, x0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", u0Var3.getContext().getPackageName());
                                                        u0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e152) {
                                                        a8.g(e152, true);
                                                        u0Var3.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                u0Var3.loadUrl(str7);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            l11.L = charSequenceArr322;
                            l11.K = onClickListener322;
                            l11.show();
                            u0Var2.F = l11;
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
                char c10;
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
                        u0 u0Var = h0Var.a;
                        v2 l10 = k5.l(1, u0Var.getContext(), null, false);
                        try {
                            parse = Uri.parse(str6);
                        } catch (Exception e10) {
                            e = e10;
                            c10 = 2;
                        }
                        if (parse != null) {
                            c10 = 2;
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
                                    l10.Q = true;
                                    l10.O = str2;
                                    l10.P = false;
                                    String M0422 = hd.M0(2131747791, null);
                                    String M02222 = hd.M0(2131747793, null);
                                    String M03222 = hd.M0(2131751767, null);
                                    CharSequence[] charSequenceArr222 = new CharSequence[3];
                                    charSequenceArr222[0] = M0422;
                                    charSequenceArr222[1] = M02222;
                                    charSequenceArr222[c10] = M03222;
                                    DialogInterface.OnClickListener onClickListener222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i13) {
                                            int i14 = i12;
                                            String str7 = str6;
                                            h0 h0Var2 = h0Var;
                                            switch (i14) {
                                                case 0:
                                                    u0 u0Var22 = h0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                x0 x0Var = u0Var22.Q;
                                                                if (x0Var != null) {
                                                                    new hc(x0Var, x0Var.e).k(false).k(true);
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
                                                                request.setDescription(hd.M0(2131742929, null));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) u0Var22.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                x0 x0Var2 = u0Var22.Q;
                                                                if (x0Var2 != null) {
                                                                    new hc(x0Var2, x0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131742928, guessFileName))).k(true);
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
                                                            intent.putExtra("com.android.browser.application_id", u0Var22.getContext().getPackageName());
                                                            u0Var22.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e142) {
                                                            a8.g(e142, true);
                                                            u0Var22.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    u0 u0Var3 = h0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                x0 x0Var3 = u0Var3.Q;
                                                                if (x0Var3 != null) {
                                                                    new hc(x0Var3, x0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", u0Var3.getContext().getPackageName());
                                                                u0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e152) {
                                                                a8.g(e152, true);
                                                                u0Var3.loadUrl(str7);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        u0Var3.loadUrl(str7);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    l10.L = charSequenceArr222;
                                    l10.K = onClickListener222;
                                    l10.show();
                                    u0Var.F = l10;
                                    return;
                                }
                                l10.Q = true;
                                l10.O = str2;
                                l10.P = false;
                                String M04222 = hd.M0(2131747791, null);
                                String M022222 = hd.M0(2131747793, null);
                                String M032222 = hd.M0(2131751767, null);
                                CharSequence[] charSequenceArr2222 = new CharSequence[3];
                                charSequenceArr2222[0] = M04222;
                                charSequenceArr2222[1] = M022222;
                                charSequenceArr2222[c10] = M032222;
                                DialogInterface.OnClickListener onClickListener2222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        int i14 = i12;
                                        String str7 = str6;
                                        h0 h0Var2 = h0Var;
                                        switch (i14) {
                                            case 0:
                                                u0 u0Var22 = h0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            x0 x0Var = u0Var22.Q;
                                                            if (x0Var != null) {
                                                                new hc(x0Var, x0Var.e).k(false).k(true);
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
                                                            request.setDescription(hd.M0(2131742929, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) u0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            x0 x0Var2 = u0Var22.Q;
                                                            if (x0Var2 != null) {
                                                                new hc(x0Var2, x0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131742928, guessFileName))).k(true);
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
                                                        intent.putExtra("com.android.browser.application_id", u0Var22.getContext().getPackageName());
                                                        u0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e142) {
                                                        a8.g(e142, true);
                                                        u0Var22.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                u0 u0Var3 = h0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            x0 x0Var3 = u0Var3.Q;
                                                            if (x0Var3 != null) {
                                                                new hc(x0Var3, x0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", u0Var3.getContext().getPackageName());
                                                            u0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e152) {
                                                            a8.g(e152, true);
                                                            u0Var3.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    u0Var3.loadUrl(str7);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                l10.L = charSequenceArr2222;
                                l10.K = onClickListener2222;
                                l10.show();
                                u0Var.F = l10;
                                return;
                            }
                            if (!parse.getScheme().equalsIgnoreCase("data")) {
                                str3 = vf.c.w(parse, null, null, vf.c.a(parse.getHost()), null);
                                str = str3;
                                str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                                l10.Q = true;
                                l10.O = str2;
                                l10.P = false;
                                String M042222 = hd.M0(2131747791, null);
                                String M0222222 = hd.M0(2131747793, null);
                                String M0322222 = hd.M0(2131751767, null);
                                CharSequence[] charSequenceArr22222 = new CharSequence[3];
                                charSequenceArr22222[0] = M042222;
                                charSequenceArr22222[1] = M0222222;
                                charSequenceArr22222[c10] = M0322222;
                                DialogInterface.OnClickListener onClickListener22222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        int i14 = i12;
                                        String str7 = str6;
                                        h0 h0Var2 = h0Var;
                                        switch (i14) {
                                            case 0:
                                                u0 u0Var22 = h0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            x0 x0Var = u0Var22.Q;
                                                            if (x0Var != null) {
                                                                new hc(x0Var, x0Var.e).k(false).k(true);
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
                                                            request.setDescription(hd.M0(2131742929, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) u0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            x0 x0Var2 = u0Var22.Q;
                                                            if (x0Var2 != null) {
                                                                new hc(x0Var2, x0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131742928, guessFileName))).k(true);
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
                                                        intent.putExtra("com.android.browser.application_id", u0Var22.getContext().getPackageName());
                                                        u0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e142) {
                                                        a8.g(e142, true);
                                                        u0Var22.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                u0 u0Var3 = h0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            x0 x0Var3 = u0Var3.Q;
                                                            if (x0Var3 != null) {
                                                                new hc(x0Var3, x0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", u0Var3.getContext().getPackageName());
                                                            u0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e152) {
                                                            a8.g(e152, true);
                                                            u0Var3.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    u0Var3.loadUrl(str7);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                l10.L = charSequenceArr22222;
                                l10.K = onClickListener22222;
                                l10.show();
                                u0Var.F = l10;
                            }
                        } else {
                            c10 = 2;
                        }
                        str3 = str6;
                        str = str3;
                        str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                        l10.Q = true;
                        l10.O = str2;
                        l10.P = false;
                        String M0422222 = hd.M0(2131747791, null);
                        String M02222222 = hd.M0(2131747793, null);
                        String M03222222 = hd.M0(2131751767, null);
                        CharSequence[] charSequenceArr222222 = new CharSequence[3];
                        charSequenceArr222222[0] = M0422222;
                        charSequenceArr222222[1] = M02222222;
                        charSequenceArr222222[c10] = M03222222;
                        DialogInterface.OnClickListener onClickListener222222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i13) {
                                int i14 = i12;
                                String str7 = str6;
                                h0 h0Var2 = h0Var;
                                switch (i14) {
                                    case 0:
                                        u0 u0Var22 = h0Var2.a;
                                        if (i13 != 0) {
                                            if (i13 != 1) {
                                                if (i13 == 2) {
                                                    org.telegram.messenger.g0.g(str7);
                                                    x0 x0Var = u0Var22.Q;
                                                    if (x0Var != null) {
                                                        new hc(x0Var, x0Var.e).k(false).k(true);
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
                                                    request.setDescription(hd.M0(2131742929, null));
                                                    request.setNotificationVisibility(1);
                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                    DownloadManager downloadManager = (DownloadManager) u0Var22.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    x0 x0Var2 = u0Var22.Q;
                                                    if (x0Var2 != null) {
                                                        new hc(x0Var2, x0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131742928, guessFileName))).k(true);
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
                                                intent.putExtra("com.android.browser.application_id", u0Var22.getContext().getPackageName());
                                                u0Var22.getContext().startActivity(intent);
                                                break;
                                            } catch (Exception e142) {
                                                a8.g(e142, true);
                                                u0Var22.loadUrl(str7);
                                                return;
                                            }
                                        }
                                        break;
                                    default:
                                        u0 u0Var3 = h0Var2.a;
                                        if (i13 != 0) {
                                            if (i13 != 1) {
                                                if (i13 == 2) {
                                                    org.telegram.messenger.g0.g(str7);
                                                    x0 x0Var3 = u0Var3.Q;
                                                    if (x0Var3 != null) {
                                                        new hc(x0Var3, x0Var3.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", u0Var3.getContext().getPackageName());
                                                    u0Var3.getContext().startActivity(intent2);
                                                    break;
                                                } catch (Exception e152) {
                                                    a8.g(e152, true);
                                                    u0Var3.loadUrl(str7);
                                                    return;
                                                }
                                            }
                                        } else {
                                            u0Var3.loadUrl(str7);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        l10.L = charSequenceArr222222;
                        l10.K = onClickListener222222;
                        l10.show();
                        u0Var.F = l10;
                    default:
                        u0 u0Var2 = h0Var.a;
                        v2 l11 = k5.l(1, u0Var2.getContext(), null, false);
                        try {
                            Uri parse2 = Uri.parse(str6);
                            str4 = vf.c.w(parse2, null, null, vf.c.a(parse2.getHost()), null);
                        } catch (Exception e13) {
                            try {
                                a8.g(e13, false);
                                str4 = str6;
                            } catch (Exception e14) {
                                e = e14;
                                str4 = str6;
                                a8.g(e, true);
                                str5 = str4;
                                l11.Q = true;
                                l11.O = str5;
                                l11.P = false;
                                CharSequence[] charSequenceArr322 = {hd.M0(2131747793, null), hd.M0(2131754938, null), hd.M0(2131751762, null)};
                                DialogInterface.OnClickListener onClickListener322 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        int i14 = i11;
                                        String str7 = str6;
                                        h0 h0Var2 = h0Var;
                                        switch (i14) {
                                            case 0:
                                                u0 u0Var22 = h0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            x0 x0Var = u0Var22.Q;
                                                            if (x0Var != null) {
                                                                new hc(x0Var, x0Var.e).k(false).k(true);
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
                                                            request.setDescription(hd.M0(2131742929, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) u0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            x0 x0Var2 = u0Var22.Q;
                                                            if (x0Var2 != null) {
                                                                new hc(x0Var2, x0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131742928, guessFileName))).k(true);
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
                                                        intent.putExtra("com.android.browser.application_id", u0Var22.getContext().getPackageName());
                                                        u0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e142) {
                                                        a8.g(e142, true);
                                                        u0Var22.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                u0 u0Var3 = h0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            x0 x0Var3 = u0Var3.Q;
                                                            if (x0Var3 != null) {
                                                                new hc(x0Var3, x0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", u0Var3.getContext().getPackageName());
                                                            u0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e152) {
                                                            a8.g(e152, true);
                                                            u0Var3.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    u0Var3.loadUrl(str7);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                l11.L = charSequenceArr322;
                                l11.K = onClickListener322;
                                l11.show();
                                u0Var2.F = l11;
                            }
                        }
                        try {
                            str5 = URLDecoder.decode(str4.replaceAll("\\+", "%2b"), "UTF-8");
                        } catch (Exception e15) {
                            e = e15;
                            a8.g(e, true);
                            str5 = str4;
                            l11.Q = true;
                            l11.O = str5;
                            l11.P = false;
                            CharSequence[] charSequenceArr3222 = {hd.M0(2131747793, null), hd.M0(2131754938, null), hd.M0(2131751762, null)};
                            DialogInterface.OnClickListener onClickListener3222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i13) {
                                    int i14 = i11;
                                    String str7 = str6;
                                    h0 h0Var2 = h0Var;
                                    switch (i14) {
                                        case 0:
                                            u0 u0Var22 = h0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        org.telegram.messenger.g0.g(str7);
                                                        x0 x0Var = u0Var22.Q;
                                                        if (x0Var != null) {
                                                            new hc(x0Var, x0Var.e).k(false).k(true);
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
                                                        request.setDescription(hd.M0(2131742929, null));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) u0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        x0 x0Var2 = u0Var22.Q;
                                                        if (x0Var2 != null) {
                                                            new hc(x0Var2, x0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131742928, guessFileName))).k(true);
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
                                                    intent.putExtra("com.android.browser.application_id", u0Var22.getContext().getPackageName());
                                                    u0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e142) {
                                                    a8.g(e142, true);
                                                    u0Var22.loadUrl(str7);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            u0 u0Var3 = h0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        org.telegram.messenger.g0.g(str7);
                                                        x0 x0Var3 = u0Var3.Q;
                                                        if (x0Var3 != null) {
                                                            new hc(x0Var3, x0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", u0Var3.getContext().getPackageName());
                                                        u0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e152) {
                                                        a8.g(e152, true);
                                                        u0Var3.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                u0Var3.loadUrl(str7);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            l11.L = charSequenceArr3222;
                            l11.K = onClickListener3222;
                            l11.show();
                            u0Var2.F = l11;
                        }
                        l11.Q = true;
                        l11.O = str5;
                        l11.P = false;
                        CharSequence[] charSequenceArr32222 = {hd.M0(2131747793, null), hd.M0(2131754938, null), hd.M0(2131751762, null)};
                        DialogInterface.OnClickListener onClickListener32222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i13) {
                                int i14 = i11;
                                String str7 = str6;
                                h0 h0Var2 = h0Var;
                                switch (i14) {
                                    case 0:
                                        u0 u0Var22 = h0Var2.a;
                                        if (i13 != 0) {
                                            if (i13 != 1) {
                                                if (i13 == 2) {
                                                    org.telegram.messenger.g0.g(str7);
                                                    x0 x0Var = u0Var22.Q;
                                                    if (x0Var != null) {
                                                        new hc(x0Var, x0Var.e).k(false).k(true);
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
                                                    request.setDescription(hd.M0(2131742929, null));
                                                    request.setNotificationVisibility(1);
                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                    DownloadManager downloadManager = (DownloadManager) u0Var22.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    x0 x0Var2 = u0Var22.Q;
                                                    if (x0Var2 != null) {
                                                        new hc(x0Var2, x0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131742928, guessFileName))).k(true);
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
                                                intent.putExtra("com.android.browser.application_id", u0Var22.getContext().getPackageName());
                                                u0Var22.getContext().startActivity(intent);
                                                break;
                                            } catch (Exception e142) {
                                                a8.g(e142, true);
                                                u0Var22.loadUrl(str7);
                                                return;
                                            }
                                        }
                                        break;
                                    default:
                                        u0 u0Var3 = h0Var2.a;
                                        if (i13 != 0) {
                                            if (i13 != 1) {
                                                if (i13 == 2) {
                                                    org.telegram.messenger.g0.g(str7);
                                                    x0 x0Var3 = u0Var3.Q;
                                                    if (x0Var3 != null) {
                                                        new hc(x0Var3, x0Var3.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", u0Var3.getContext().getPackageName());
                                                    u0Var3.getContext().startActivity(intent2);
                                                    break;
                                                } catch (Exception e152) {
                                                    a8.g(e152, true);
                                                    u0Var3.loadUrl(str7);
                                                    return;
                                                }
                                            }
                                        } else {
                                            u0Var3.loadUrl(str7);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        l11.L = charSequenceArr32222;
                        l11.K = onClickListener32222;
                        l11.show();
                        u0Var2.F = l11;
                }
            }
        });
        return true;
    }
}
