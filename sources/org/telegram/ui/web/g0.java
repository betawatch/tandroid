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
import org.telegram.messenger.f3;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class g0 implements View.OnLongClickListener {
    public final /* synthetic */ s0 a;

    public g0(s0 s0Var) {
        this.a = s0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.a.getHitTestResult();
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            final int i7 = 0;
            org.telegram.messenger.g0.g3(new Runnable(this) { // from class: org.telegram.ui.web.e0
                public final /* synthetic */ g0 b;

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
                    final g0 g0Var = this.b;
                    final int i11 = 0;
                    final int i12 = 1;
                    switch (i10) {
                        case 0:
                            s0 s0Var = g0Var.a;
                            w2 j3 = f3.j(1, s0Var.getContext(), null, false);
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
                                        j3.R = true;
                                        j3.P = str2;
                                        j3.Q = false;
                                        String N0 = hd.N0(2131747598, null);
                                        String N02 = hd.N0(2131747600, null);
                                        String N03 = hd.N0(2131751755, null);
                                        CharSequence[] charSequenceArr = new CharSequence[3];
                                        charSequenceArr[0] = N0;
                                        charSequenceArr[1] = N02;
                                        charSequenceArr[c10] = N03;
                                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.f0
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i13) {
                                                int i14 = i12;
                                                String str7 = str6;
                                                g0 g0Var2 = g0Var;
                                                switch (i14) {
                                                    case 0:
                                                        s0 s0Var2 = g0Var2.a;
                                                        if (i13 != 0) {
                                                            if (i13 != 1) {
                                                                if (i13 == 2) {
                                                                    org.telegram.messenger.g0.g(str7);
                                                                    v0 v0Var = s0Var2.R;
                                                                    if (v0Var != null) {
                                                                        new lc(v0Var, v0Var.e).k(false).k(true);
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
                                                                    request.setDescription(hd.N0(2131742662, null));
                                                                    request.setNotificationVisibility(1);
                                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                    DownloadManager downloadManager = (DownloadManager) s0Var2.getContext().getSystemService("download");
                                                                    if (downloadManager != null) {
                                                                        downloadManager.enqueue(request);
                                                                    }
                                                                    v0 v0Var2 = s0Var2.R;
                                                                    if (v0Var2 != null) {
                                                                        new lc(v0Var2, v0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131742661, guessFileName))).k(true);
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
                                                                intent.putExtra("com.android.browser.application_id", s0Var2.getContext().getPackageName());
                                                                s0Var2.getContext().startActivity(intent);
                                                                break;
                                                            } catch (Exception e14) {
                                                                a8.g(e14, true);
                                                                s0Var2.loadUrl(str7);
                                                                return;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        s0 s0Var3 = g0Var2.a;
                                                        if (i13 != 0) {
                                                            if (i13 != 1) {
                                                                if (i13 == 2) {
                                                                    org.telegram.messenger.g0.g(str7);
                                                                    v0 v0Var3 = s0Var3.R;
                                                                    if (v0Var3 != null) {
                                                                        new lc(v0Var3, v0Var3.e).k(false).k(true);
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                try {
                                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                    intent2.putExtra("create_new_tab", true);
                                                                    intent2.putExtra("com.android.browser.application_id", s0Var3.getContext().getPackageName());
                                                                    s0Var3.getContext().startActivity(intent2);
                                                                    break;
                                                                } catch (Exception e15) {
                                                                    a8.g(e15, true);
                                                                    s0Var3.loadUrl(str7);
                                                                    return;
                                                                }
                                                            }
                                                        } else {
                                                            s0Var3.loadUrl(str7);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        };
                                        j3.M = charSequenceArr;
                                        j3.L = onClickListener;
                                        j3.show();
                                        s0Var.G = j3;
                                        return;
                                    }
                                    j3.R = true;
                                    j3.P = str2;
                                    j3.Q = false;
                                    String N04 = hd.N0(2131747598, null);
                                    String N022 = hd.N0(2131747600, null);
                                    String N032 = hd.N0(2131751755, null);
                                    CharSequence[] charSequenceArr2 = new CharSequence[3];
                                    charSequenceArr2[0] = N04;
                                    charSequenceArr2[1] = N022;
                                    charSequenceArr2[c10] = N032;
                                    DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.f0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i13) {
                                            int i14 = i12;
                                            String str7 = str6;
                                            g0 g0Var2 = g0Var;
                                            switch (i14) {
                                                case 0:
                                                    s0 s0Var2 = g0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                v0 v0Var = s0Var2.R;
                                                                if (v0Var != null) {
                                                                    new lc(v0Var, v0Var.e).k(false).k(true);
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
                                                                request.setDescription(hd.N0(2131742662, null));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) s0Var2.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                v0 v0Var2 = s0Var2.R;
                                                                if (v0Var2 != null) {
                                                                    new lc(v0Var2, v0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131742661, guessFileName))).k(true);
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
                                                            intent.putExtra("com.android.browser.application_id", s0Var2.getContext().getPackageName());
                                                            s0Var2.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e14) {
                                                            a8.g(e14, true);
                                                            s0Var2.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    s0 s0Var3 = g0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                v0 v0Var3 = s0Var3.R;
                                                                if (v0Var3 != null) {
                                                                    new lc(v0Var3, v0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", s0Var3.getContext().getPackageName());
                                                                s0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e15) {
                                                                a8.g(e15, true);
                                                                s0Var3.loadUrl(str7);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        s0Var3.loadUrl(str7);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    j3.M = charSequenceArr2;
                                    j3.L = onClickListener2;
                                    j3.show();
                                    s0Var.G = j3;
                                    return;
                                }
                                if (!parse.getScheme().equalsIgnoreCase("data")) {
                                    str3 = vf.c.w(parse, null, null, vf.c.a(parse.getHost()), null);
                                    str = str3;
                                    str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                                    j3.R = true;
                                    j3.P = str2;
                                    j3.Q = false;
                                    String N042 = hd.N0(2131747598, null);
                                    String N0222 = hd.N0(2131747600, null);
                                    String N0322 = hd.N0(2131751755, null);
                                    CharSequence[] charSequenceArr22 = new CharSequence[3];
                                    charSequenceArr22[0] = N042;
                                    charSequenceArr22[1] = N0222;
                                    charSequenceArr22[c10] = N0322;
                                    DialogInterface.OnClickListener onClickListener22 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.f0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i13) {
                                            int i14 = i12;
                                            String str7 = str6;
                                            g0 g0Var2 = g0Var;
                                            switch (i14) {
                                                case 0:
                                                    s0 s0Var2 = g0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                v0 v0Var = s0Var2.R;
                                                                if (v0Var != null) {
                                                                    new lc(v0Var, v0Var.e).k(false).k(true);
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
                                                                request.setDescription(hd.N0(2131742662, null));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) s0Var2.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                v0 v0Var2 = s0Var2.R;
                                                                if (v0Var2 != null) {
                                                                    new lc(v0Var2, v0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131742661, guessFileName))).k(true);
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
                                                            intent.putExtra("com.android.browser.application_id", s0Var2.getContext().getPackageName());
                                                            s0Var2.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e14) {
                                                            a8.g(e14, true);
                                                            s0Var2.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    s0 s0Var3 = g0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                v0 v0Var3 = s0Var3.R;
                                                                if (v0Var3 != null) {
                                                                    new lc(v0Var3, v0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", s0Var3.getContext().getPackageName());
                                                                s0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e15) {
                                                                a8.g(e15, true);
                                                                s0Var3.loadUrl(str7);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        s0Var3.loadUrl(str7);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    j3.M = charSequenceArr22;
                                    j3.L = onClickListener22;
                                    j3.show();
                                    s0Var.G = j3;
                                }
                            } else {
                                c10 = 2;
                            }
                            str3 = str6;
                            str = str3;
                            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                            j3.R = true;
                            j3.P = str2;
                            j3.Q = false;
                            String N0422 = hd.N0(2131747598, null);
                            String N02222 = hd.N0(2131747600, null);
                            String N03222 = hd.N0(2131751755, null);
                            CharSequence[] charSequenceArr222 = new CharSequence[3];
                            charSequenceArr222[0] = N0422;
                            charSequenceArr222[1] = N02222;
                            charSequenceArr222[c10] = N03222;
                            DialogInterface.OnClickListener onClickListener222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.f0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i13) {
                                    int i14 = i12;
                                    String str7 = str6;
                                    g0 g0Var2 = g0Var;
                                    switch (i14) {
                                        case 0:
                                            s0 s0Var2 = g0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        org.telegram.messenger.g0.g(str7);
                                                        v0 v0Var = s0Var2.R;
                                                        if (v0Var != null) {
                                                            new lc(v0Var, v0Var.e).k(false).k(true);
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
                                                        request.setDescription(hd.N0(2131742662, null));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) s0Var2.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        v0 v0Var2 = s0Var2.R;
                                                        if (v0Var2 != null) {
                                                            new lc(v0Var2, v0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131742661, guessFileName))).k(true);
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
                                                    intent.putExtra("com.android.browser.application_id", s0Var2.getContext().getPackageName());
                                                    s0Var2.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e14) {
                                                    a8.g(e14, true);
                                                    s0Var2.loadUrl(str7);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            s0 s0Var3 = g0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        org.telegram.messenger.g0.g(str7);
                                                        v0 v0Var3 = s0Var3.R;
                                                        if (v0Var3 != null) {
                                                            new lc(v0Var3, v0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", s0Var3.getContext().getPackageName());
                                                        s0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e15) {
                                                        a8.g(e15, true);
                                                        s0Var3.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                s0Var3.loadUrl(str7);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            j3.M = charSequenceArr222;
                            j3.L = onClickListener222;
                            j3.show();
                            s0Var.G = j3;
                        default:
                            s0 s0Var2 = g0Var.a;
                            w2 j10 = f3.j(1, s0Var2.getContext(), null, false);
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
                                    j10.R = true;
                                    j10.P = str5;
                                    j10.Q = false;
                                    CharSequence[] charSequenceArr3 = {hd.N0(2131747600, null), hd.N0(2131754938, null), hd.N0(2131751750, null)};
                                    DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.f0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i13) {
                                            int i14 = i11;
                                            String str7 = str6;
                                            g0 g0Var2 = g0Var;
                                            switch (i14) {
                                                case 0:
                                                    s0 s0Var22 = g0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                v0 v0Var = s0Var22.R;
                                                                if (v0Var != null) {
                                                                    new lc(v0Var, v0Var.e).k(false).k(true);
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
                                                                request.setDescription(hd.N0(2131742662, null));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) s0Var22.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                v0 v0Var2 = s0Var22.R;
                                                                if (v0Var2 != null) {
                                                                    new lc(v0Var2, v0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131742661, guessFileName))).k(true);
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
                                                            intent.putExtra("com.android.browser.application_id", s0Var22.getContext().getPackageName());
                                                            s0Var22.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e142) {
                                                            a8.g(e142, true);
                                                            s0Var22.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    s0 s0Var3 = g0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                v0 v0Var3 = s0Var3.R;
                                                                if (v0Var3 != null) {
                                                                    new lc(v0Var3, v0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", s0Var3.getContext().getPackageName());
                                                                s0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e15) {
                                                                a8.g(e15, true);
                                                                s0Var3.loadUrl(str7);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        s0Var3.loadUrl(str7);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    j10.M = charSequenceArr3;
                                    j10.L = onClickListener3;
                                    j10.show();
                                    s0Var2.G = j10;
                                }
                            }
                            try {
                                str5 = URLDecoder.decode(str4.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e15) {
                                e = e15;
                                a8.g(e, true);
                                str5 = str4;
                                j10.R = true;
                                j10.P = str5;
                                j10.Q = false;
                                CharSequence[] charSequenceArr32 = {hd.N0(2131747600, null), hd.N0(2131754938, null), hd.N0(2131751750, null)};
                                DialogInterface.OnClickListener onClickListener32 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.f0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        int i14 = i11;
                                        String str7 = str6;
                                        g0 g0Var2 = g0Var;
                                        switch (i14) {
                                            case 0:
                                                s0 s0Var22 = g0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            v0 v0Var = s0Var22.R;
                                                            if (v0Var != null) {
                                                                new lc(v0Var, v0Var.e).k(false).k(true);
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
                                                            request.setDescription(hd.N0(2131742662, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) s0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            v0 v0Var2 = s0Var22.R;
                                                            if (v0Var2 != null) {
                                                                new lc(v0Var2, v0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131742661, guessFileName))).k(true);
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
                                                        intent.putExtra("com.android.browser.application_id", s0Var22.getContext().getPackageName());
                                                        s0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e142) {
                                                        a8.g(e142, true);
                                                        s0Var22.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                s0 s0Var3 = g0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            v0 v0Var3 = s0Var3.R;
                                                            if (v0Var3 != null) {
                                                                new lc(v0Var3, v0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", s0Var3.getContext().getPackageName());
                                                            s0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e152) {
                                                            a8.g(e152, true);
                                                            s0Var3.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    s0Var3.loadUrl(str7);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                j10.M = charSequenceArr32;
                                j10.L = onClickListener32;
                                j10.show();
                                s0Var2.G = j10;
                            }
                            j10.R = true;
                            j10.P = str5;
                            j10.Q = false;
                            CharSequence[] charSequenceArr322 = {hd.N0(2131747600, null), hd.N0(2131754938, null), hd.N0(2131751750, null)};
                            DialogInterface.OnClickListener onClickListener322 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.f0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i13) {
                                    int i14 = i11;
                                    String str7 = str6;
                                    g0 g0Var2 = g0Var;
                                    switch (i14) {
                                        case 0:
                                            s0 s0Var22 = g0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        org.telegram.messenger.g0.g(str7);
                                                        v0 v0Var = s0Var22.R;
                                                        if (v0Var != null) {
                                                            new lc(v0Var, v0Var.e).k(false).k(true);
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
                                                        request.setDescription(hd.N0(2131742662, null));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) s0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        v0 v0Var2 = s0Var22.R;
                                                        if (v0Var2 != null) {
                                                            new lc(v0Var2, v0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131742661, guessFileName))).k(true);
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
                                                    intent.putExtra("com.android.browser.application_id", s0Var22.getContext().getPackageName());
                                                    s0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e142) {
                                                    a8.g(e142, true);
                                                    s0Var22.loadUrl(str7);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            s0 s0Var3 = g0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        org.telegram.messenger.g0.g(str7);
                                                        v0 v0Var3 = s0Var3.R;
                                                        if (v0Var3 != null) {
                                                            new lc(v0Var3, v0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", s0Var3.getContext().getPackageName());
                                                        s0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e152) {
                                                        a8.g(e152, true);
                                                        s0Var3.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                s0Var3.loadUrl(str7);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            j10.M = charSequenceArr322;
                            j10.L = onClickListener322;
                            j10.show();
                            s0Var2.G = j10;
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
        org.telegram.messenger.g0.g3(new Runnable(this) { // from class: org.telegram.ui.web.e0
            public final /* synthetic */ g0 b;

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
                final g0 g0Var = this.b;
                final int i11 = 0;
                final int i12 = 1;
                switch (i102) {
                    case 0:
                        s0 s0Var = g0Var.a;
                        w2 j3 = f3.j(1, s0Var.getContext(), null, false);
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
                                    j3.R = true;
                                    j3.P = str2;
                                    j3.Q = false;
                                    String N0422 = hd.N0(2131747598, null);
                                    String N02222 = hd.N0(2131747600, null);
                                    String N03222 = hd.N0(2131751755, null);
                                    CharSequence[] charSequenceArr222 = new CharSequence[3];
                                    charSequenceArr222[0] = N0422;
                                    charSequenceArr222[1] = N02222;
                                    charSequenceArr222[c10] = N03222;
                                    DialogInterface.OnClickListener onClickListener222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.f0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i13) {
                                            int i14 = i12;
                                            String str7 = str6;
                                            g0 g0Var2 = g0Var;
                                            switch (i14) {
                                                case 0:
                                                    s0 s0Var22 = g0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                v0 v0Var = s0Var22.R;
                                                                if (v0Var != null) {
                                                                    new lc(v0Var, v0Var.e).k(false).k(true);
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
                                                                request.setDescription(hd.N0(2131742662, null));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) s0Var22.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                v0 v0Var2 = s0Var22.R;
                                                                if (v0Var2 != null) {
                                                                    new lc(v0Var2, v0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131742661, guessFileName))).k(true);
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
                                                            intent.putExtra("com.android.browser.application_id", s0Var22.getContext().getPackageName());
                                                            s0Var22.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e142) {
                                                            a8.g(e142, true);
                                                            s0Var22.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    s0 s0Var3 = g0Var2.a;
                                                    if (i13 != 0) {
                                                        if (i13 != 1) {
                                                            if (i13 == 2) {
                                                                org.telegram.messenger.g0.g(str7);
                                                                v0 v0Var3 = s0Var3.R;
                                                                if (v0Var3 != null) {
                                                                    new lc(v0Var3, v0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", s0Var3.getContext().getPackageName());
                                                                s0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e152) {
                                                                a8.g(e152, true);
                                                                s0Var3.loadUrl(str7);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        s0Var3.loadUrl(str7);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    j3.M = charSequenceArr222;
                                    j3.L = onClickListener222;
                                    j3.show();
                                    s0Var.G = j3;
                                    return;
                                }
                                j3.R = true;
                                j3.P = str2;
                                j3.Q = false;
                                String N04222 = hd.N0(2131747598, null);
                                String N022222 = hd.N0(2131747600, null);
                                String N032222 = hd.N0(2131751755, null);
                                CharSequence[] charSequenceArr2222 = new CharSequence[3];
                                charSequenceArr2222[0] = N04222;
                                charSequenceArr2222[1] = N022222;
                                charSequenceArr2222[c10] = N032222;
                                DialogInterface.OnClickListener onClickListener2222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.f0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        int i14 = i12;
                                        String str7 = str6;
                                        g0 g0Var2 = g0Var;
                                        switch (i14) {
                                            case 0:
                                                s0 s0Var22 = g0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            v0 v0Var = s0Var22.R;
                                                            if (v0Var != null) {
                                                                new lc(v0Var, v0Var.e).k(false).k(true);
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
                                                            request.setDescription(hd.N0(2131742662, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) s0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            v0 v0Var2 = s0Var22.R;
                                                            if (v0Var2 != null) {
                                                                new lc(v0Var2, v0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131742661, guessFileName))).k(true);
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
                                                        intent.putExtra("com.android.browser.application_id", s0Var22.getContext().getPackageName());
                                                        s0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e142) {
                                                        a8.g(e142, true);
                                                        s0Var22.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                s0 s0Var3 = g0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            v0 v0Var3 = s0Var3.R;
                                                            if (v0Var3 != null) {
                                                                new lc(v0Var3, v0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", s0Var3.getContext().getPackageName());
                                                            s0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e152) {
                                                            a8.g(e152, true);
                                                            s0Var3.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    s0Var3.loadUrl(str7);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                j3.M = charSequenceArr2222;
                                j3.L = onClickListener2222;
                                j3.show();
                                s0Var.G = j3;
                                return;
                            }
                            if (!parse.getScheme().equalsIgnoreCase("data")) {
                                str3 = vf.c.w(parse, null, null, vf.c.a(parse.getHost()), null);
                                str = str3;
                                str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                                j3.R = true;
                                j3.P = str2;
                                j3.Q = false;
                                String N042222 = hd.N0(2131747598, null);
                                String N0222222 = hd.N0(2131747600, null);
                                String N0322222 = hd.N0(2131751755, null);
                                CharSequence[] charSequenceArr22222 = new CharSequence[3];
                                charSequenceArr22222[0] = N042222;
                                charSequenceArr22222[1] = N0222222;
                                charSequenceArr22222[c10] = N0322222;
                                DialogInterface.OnClickListener onClickListener22222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.f0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        int i14 = i12;
                                        String str7 = str6;
                                        g0 g0Var2 = g0Var;
                                        switch (i14) {
                                            case 0:
                                                s0 s0Var22 = g0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            v0 v0Var = s0Var22.R;
                                                            if (v0Var != null) {
                                                                new lc(v0Var, v0Var.e).k(false).k(true);
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
                                                            request.setDescription(hd.N0(2131742662, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) s0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            v0 v0Var2 = s0Var22.R;
                                                            if (v0Var2 != null) {
                                                                new lc(v0Var2, v0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131742661, guessFileName))).k(true);
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
                                                        intent.putExtra("com.android.browser.application_id", s0Var22.getContext().getPackageName());
                                                        s0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e142) {
                                                        a8.g(e142, true);
                                                        s0Var22.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                s0 s0Var3 = g0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            v0 v0Var3 = s0Var3.R;
                                                            if (v0Var3 != null) {
                                                                new lc(v0Var3, v0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", s0Var3.getContext().getPackageName());
                                                            s0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e152) {
                                                            a8.g(e152, true);
                                                            s0Var3.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    s0Var3.loadUrl(str7);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                j3.M = charSequenceArr22222;
                                j3.L = onClickListener22222;
                                j3.show();
                                s0Var.G = j3;
                            }
                        } else {
                            c10 = 2;
                        }
                        str3 = str6;
                        str = str3;
                        str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                        j3.R = true;
                        j3.P = str2;
                        j3.Q = false;
                        String N0422222 = hd.N0(2131747598, null);
                        String N02222222 = hd.N0(2131747600, null);
                        String N03222222 = hd.N0(2131751755, null);
                        CharSequence[] charSequenceArr222222 = new CharSequence[3];
                        charSequenceArr222222[0] = N0422222;
                        charSequenceArr222222[1] = N02222222;
                        charSequenceArr222222[c10] = N03222222;
                        DialogInterface.OnClickListener onClickListener222222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.f0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i13) {
                                int i14 = i12;
                                String str7 = str6;
                                g0 g0Var2 = g0Var;
                                switch (i14) {
                                    case 0:
                                        s0 s0Var22 = g0Var2.a;
                                        if (i13 != 0) {
                                            if (i13 != 1) {
                                                if (i13 == 2) {
                                                    org.telegram.messenger.g0.g(str7);
                                                    v0 v0Var = s0Var22.R;
                                                    if (v0Var != null) {
                                                        new lc(v0Var, v0Var.e).k(false).k(true);
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
                                                    request.setDescription(hd.N0(2131742662, null));
                                                    request.setNotificationVisibility(1);
                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                    DownloadManager downloadManager = (DownloadManager) s0Var22.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    v0 v0Var2 = s0Var22.R;
                                                    if (v0Var2 != null) {
                                                        new lc(v0Var2, v0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131742661, guessFileName))).k(true);
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
                                                intent.putExtra("com.android.browser.application_id", s0Var22.getContext().getPackageName());
                                                s0Var22.getContext().startActivity(intent);
                                                break;
                                            } catch (Exception e142) {
                                                a8.g(e142, true);
                                                s0Var22.loadUrl(str7);
                                                return;
                                            }
                                        }
                                        break;
                                    default:
                                        s0 s0Var3 = g0Var2.a;
                                        if (i13 != 0) {
                                            if (i13 != 1) {
                                                if (i13 == 2) {
                                                    org.telegram.messenger.g0.g(str7);
                                                    v0 v0Var3 = s0Var3.R;
                                                    if (v0Var3 != null) {
                                                        new lc(v0Var3, v0Var3.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", s0Var3.getContext().getPackageName());
                                                    s0Var3.getContext().startActivity(intent2);
                                                    break;
                                                } catch (Exception e152) {
                                                    a8.g(e152, true);
                                                    s0Var3.loadUrl(str7);
                                                    return;
                                                }
                                            }
                                        } else {
                                            s0Var3.loadUrl(str7);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        j3.M = charSequenceArr222222;
                        j3.L = onClickListener222222;
                        j3.show();
                        s0Var.G = j3;
                    default:
                        s0 s0Var2 = g0Var.a;
                        w2 j10 = f3.j(1, s0Var2.getContext(), null, false);
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
                                j10.R = true;
                                j10.P = str5;
                                j10.Q = false;
                                CharSequence[] charSequenceArr322 = {hd.N0(2131747600, null), hd.N0(2131754938, null), hd.N0(2131751750, null)};
                                DialogInterface.OnClickListener onClickListener322 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.f0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        int i14 = i11;
                                        String str7 = str6;
                                        g0 g0Var2 = g0Var;
                                        switch (i14) {
                                            case 0:
                                                s0 s0Var22 = g0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            v0 v0Var = s0Var22.R;
                                                            if (v0Var != null) {
                                                                new lc(v0Var, v0Var.e).k(false).k(true);
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
                                                            request.setDescription(hd.N0(2131742662, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) s0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            v0 v0Var2 = s0Var22.R;
                                                            if (v0Var2 != null) {
                                                                new lc(v0Var2, v0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131742661, guessFileName))).k(true);
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
                                                        intent.putExtra("com.android.browser.application_id", s0Var22.getContext().getPackageName());
                                                        s0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e142) {
                                                        a8.g(e142, true);
                                                        s0Var22.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                s0 s0Var3 = g0Var2.a;
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 == 2) {
                                                            org.telegram.messenger.g0.g(str7);
                                                            v0 v0Var3 = s0Var3.R;
                                                            if (v0Var3 != null) {
                                                                new lc(v0Var3, v0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", s0Var3.getContext().getPackageName());
                                                            s0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e152) {
                                                            a8.g(e152, true);
                                                            s0Var3.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    s0Var3.loadUrl(str7);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                j10.M = charSequenceArr322;
                                j10.L = onClickListener322;
                                j10.show();
                                s0Var2.G = j10;
                            }
                        }
                        try {
                            str5 = URLDecoder.decode(str4.replaceAll("\\+", "%2b"), "UTF-8");
                        } catch (Exception e15) {
                            e = e15;
                            a8.g(e, true);
                            str5 = str4;
                            j10.R = true;
                            j10.P = str5;
                            j10.Q = false;
                            CharSequence[] charSequenceArr3222 = {hd.N0(2131747600, null), hd.N0(2131754938, null), hd.N0(2131751750, null)};
                            DialogInterface.OnClickListener onClickListener3222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.f0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i13) {
                                    int i14 = i11;
                                    String str7 = str6;
                                    g0 g0Var2 = g0Var;
                                    switch (i14) {
                                        case 0:
                                            s0 s0Var22 = g0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        org.telegram.messenger.g0.g(str7);
                                                        v0 v0Var = s0Var22.R;
                                                        if (v0Var != null) {
                                                            new lc(v0Var, v0Var.e).k(false).k(true);
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
                                                        request.setDescription(hd.N0(2131742662, null));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) s0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        v0 v0Var2 = s0Var22.R;
                                                        if (v0Var2 != null) {
                                                            new lc(v0Var2, v0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131742661, guessFileName))).k(true);
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
                                                    intent.putExtra("com.android.browser.application_id", s0Var22.getContext().getPackageName());
                                                    s0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e142) {
                                                    a8.g(e142, true);
                                                    s0Var22.loadUrl(str7);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            s0 s0Var3 = g0Var2.a;
                                            if (i13 != 0) {
                                                if (i13 != 1) {
                                                    if (i13 == 2) {
                                                        org.telegram.messenger.g0.g(str7);
                                                        v0 v0Var3 = s0Var3.R;
                                                        if (v0Var3 != null) {
                                                            new lc(v0Var3, v0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", s0Var3.getContext().getPackageName());
                                                        s0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e152) {
                                                        a8.g(e152, true);
                                                        s0Var3.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                s0Var3.loadUrl(str7);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            j10.M = charSequenceArr3222;
                            j10.L = onClickListener3222;
                            j10.show();
                            s0Var2.G = j10;
                        }
                        j10.R = true;
                        j10.P = str5;
                        j10.Q = false;
                        CharSequence[] charSequenceArr32222 = {hd.N0(2131747600, null), hd.N0(2131754938, null), hd.N0(2131751750, null)};
                        DialogInterface.OnClickListener onClickListener32222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.f0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i13) {
                                int i14 = i11;
                                String str7 = str6;
                                g0 g0Var2 = g0Var;
                                switch (i14) {
                                    case 0:
                                        s0 s0Var22 = g0Var2.a;
                                        if (i13 != 0) {
                                            if (i13 != 1) {
                                                if (i13 == 2) {
                                                    org.telegram.messenger.g0.g(str7);
                                                    v0 v0Var = s0Var22.R;
                                                    if (v0Var != null) {
                                                        new lc(v0Var, v0Var.e).k(false).k(true);
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
                                                    request.setDescription(hd.N0(2131742662, null));
                                                    request.setNotificationVisibility(1);
                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                    DownloadManager downloadManager = (DownloadManager) s0Var22.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    v0 v0Var2 = s0Var22.R;
                                                    if (v0Var2 != null) {
                                                        new lc(v0Var2, v0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131742661, guessFileName))).k(true);
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
                                                intent.putExtra("com.android.browser.application_id", s0Var22.getContext().getPackageName());
                                                s0Var22.getContext().startActivity(intent);
                                                break;
                                            } catch (Exception e142) {
                                                a8.g(e142, true);
                                                s0Var22.loadUrl(str7);
                                                return;
                                            }
                                        }
                                        break;
                                    default:
                                        s0 s0Var3 = g0Var2.a;
                                        if (i13 != 0) {
                                            if (i13 != 1) {
                                                if (i13 == 2) {
                                                    org.telegram.messenger.g0.g(str7);
                                                    v0 v0Var3 = s0Var3.R;
                                                    if (v0Var3 != null) {
                                                        new lc(v0Var3, v0Var3.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", s0Var3.getContext().getPackageName());
                                                    s0Var3.getContext().startActivity(intent2);
                                                    break;
                                                } catch (Exception e152) {
                                                    a8.g(e152, true);
                                                    s0Var3.loadUrl(str7);
                                                    return;
                                                }
                                            }
                                        } else {
                                            s0Var3.loadUrl(str7);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        j10.M = charSequenceArr32222;
                        j10.L = onClickListener32222;
                        j10.show();
                        s0Var2.G = j10;
                }
            }
        });
        return true;
    }
}
