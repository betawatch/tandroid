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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class h0 implements View.OnLongClickListener {
    public final /* synthetic */ v0 a;

    public h0(v0 v0Var) {
        this.a = v0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.a.getHitTestResult();
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            final int i10 = 0;
            org.telegram.messenger.i0.g3(new Runnable(this) { // from class: org.telegram.ui.web.f0
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
                    int i11 = i10;
                    final String str6 = extra;
                    final h0 h0Var = this.b;
                    final int i12 = 0;
                    final int i13 = 1;
                    switch (i11) {
                        case 0:
                            v0 v0Var = h0Var.a;
                            z2 k10 = m5.k(1, v0Var.getContext(), null, false);
                            try {
                                parse = Uri.parse(str6);
                            } catch (Exception e) {
                                e = e;
                                c10 = 2;
                            }
                            if (parse != null) {
                                c10 = 2;
                                try {
                                } catch (Exception e7) {
                                    e = e7;
                                    try {
                                        f8.g(e, false);
                                        str = str6;
                                        str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                                    } catch (Exception e10) {
                                        e = e10;
                                        str = str6;
                                        f8.g(e, true);
                                        str2 = str;
                                        k10.Q = true;
                                        k10.O = str2;
                                        k10.P = false;
                                        String L0 = cd.L0(2131747808, null);
                                        String L02 = cd.L0(2131747810, null);
                                        String L03 = cd.L0(2131751767, null);
                                        CharSequence[] charSequenceArr = new CharSequence[3];
                                        charSequenceArr[0] = L0;
                                        charSequenceArr[1] = L02;
                                        charSequenceArr[c10] = L03;
                                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i14) {
                                                int i15 = i13;
                                                String str7 = str6;
                                                h0 h0Var2 = h0Var;
                                                switch (i15) {
                                                    case 0:
                                                        v0 v0Var2 = h0Var2.a;
                                                        if (i14 != 0) {
                                                            if (i14 != 1) {
                                                                if (i14 == 2) {
                                                                    org.telegram.messenger.i0.g(str7);
                                                                    z0 z0Var = v0Var2.Q;
                                                                    if (z0Var != null) {
                                                                        new cc(z0Var, z0Var.e).k(false).k(true);
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
                                                                    request.setDescription(cd.L0(2131742954, null));
                                                                    request.setNotificationVisibility(1);
                                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                    DownloadManager downloadManager = (DownloadManager) v0Var2.getContext().getSystemService("download");
                                                                    if (downloadManager != null) {
                                                                        downloadManager.enqueue(request);
                                                                    }
                                                                    z0 z0Var2 = v0Var2.Q;
                                                                    if (z0Var2 != null) {
                                                                        new cc(z0Var2, z0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131742953, guessFileName))).k(true);
                                                                        break;
                                                                    }
                                                                } catch (Exception e11) {
                                                                    f8.g(e11, true);
                                                                    return;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                intent.putExtra("create_new_tab", true);
                                                                intent.putExtra("com.android.browser.application_id", v0Var2.getContext().getPackageName());
                                                                v0Var2.getContext().startActivity(intent);
                                                                break;
                                                            } catch (Exception e12) {
                                                                f8.g(e12, true);
                                                                v0Var2.loadUrl(str7);
                                                                return;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        v0 v0Var3 = h0Var2.a;
                                                        if (i14 != 0) {
                                                            if (i14 != 1) {
                                                                if (i14 == 2) {
                                                                    org.telegram.messenger.i0.g(str7);
                                                                    z0 z0Var3 = v0Var3.Q;
                                                                    if (z0Var3 != null) {
                                                                        new cc(z0Var3, z0Var3.e).k(false).k(true);
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                try {
                                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                    intent2.putExtra("create_new_tab", true);
                                                                    intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                                    v0Var3.getContext().startActivity(intent2);
                                                                    break;
                                                                } catch (Exception e13) {
                                                                    f8.g(e13, true);
                                                                    v0Var3.loadUrl(str7);
                                                                    return;
                                                                }
                                                            }
                                                        } else {
                                                            v0Var3.loadUrl(str7);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        };
                                        k10.L = charSequenceArr;
                                        k10.K = onClickListener;
                                        k10.show();
                                        v0Var.F = k10;
                                        return;
                                    }
                                    k10.Q = true;
                                    k10.O = str2;
                                    k10.P = false;
                                    String L04 = cd.L0(2131747808, null);
                                    String L022 = cd.L0(2131747810, null);
                                    String L032 = cd.L0(2131751767, null);
                                    CharSequence[] charSequenceArr2 = new CharSequence[3];
                                    charSequenceArr2[0] = L04;
                                    charSequenceArr2[1] = L022;
                                    charSequenceArr2[c10] = L032;
                                    DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i14) {
                                            int i15 = i13;
                                            String str7 = str6;
                                            h0 h0Var2 = h0Var;
                                            switch (i15) {
                                                case 0:
                                                    v0 v0Var2 = h0Var2.a;
                                                    if (i14 != 0) {
                                                        if (i14 != 1) {
                                                            if (i14 == 2) {
                                                                org.telegram.messenger.i0.g(str7);
                                                                z0 z0Var = v0Var2.Q;
                                                                if (z0Var != null) {
                                                                    new cc(z0Var, z0Var.e).k(false).k(true);
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
                                                                request.setDescription(cd.L0(2131742954, null));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) v0Var2.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                z0 z0Var2 = v0Var2.Q;
                                                                if (z0Var2 != null) {
                                                                    new cc(z0Var2, z0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131742953, guessFileName))).k(true);
                                                                    break;
                                                                }
                                                            } catch (Exception e11) {
                                                                f8.g(e11, true);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", v0Var2.getContext().getPackageName());
                                                            v0Var2.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e12) {
                                                            f8.g(e12, true);
                                                            v0Var2.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    v0 v0Var3 = h0Var2.a;
                                                    if (i14 != 0) {
                                                        if (i14 != 1) {
                                                            if (i14 == 2) {
                                                                org.telegram.messenger.i0.g(str7);
                                                                z0 z0Var3 = v0Var3.Q;
                                                                if (z0Var3 != null) {
                                                                    new cc(z0Var3, z0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                                v0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e13) {
                                                                f8.g(e13, true);
                                                                v0Var3.loadUrl(str7);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        v0Var3.loadUrl(str7);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    k10.L = charSequenceArr2;
                                    k10.K = onClickListener2;
                                    k10.show();
                                    v0Var.F = k10;
                                    return;
                                }
                                if (!parse.getScheme().equalsIgnoreCase("data")) {
                                    str3 = gf.f.u(parse, null, null, gf.f.a(parse.getHost()), null);
                                    str = str3;
                                    str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                                    k10.Q = true;
                                    k10.O = str2;
                                    k10.P = false;
                                    String L042 = cd.L0(2131747808, null);
                                    String L0222 = cd.L0(2131747810, null);
                                    String L0322 = cd.L0(2131751767, null);
                                    CharSequence[] charSequenceArr22 = new CharSequence[3];
                                    charSequenceArr22[0] = L042;
                                    charSequenceArr22[1] = L0222;
                                    charSequenceArr22[c10] = L0322;
                                    DialogInterface.OnClickListener onClickListener22 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i14) {
                                            int i15 = i13;
                                            String str7 = str6;
                                            h0 h0Var2 = h0Var;
                                            switch (i15) {
                                                case 0:
                                                    v0 v0Var2 = h0Var2.a;
                                                    if (i14 != 0) {
                                                        if (i14 != 1) {
                                                            if (i14 == 2) {
                                                                org.telegram.messenger.i0.g(str7);
                                                                z0 z0Var = v0Var2.Q;
                                                                if (z0Var != null) {
                                                                    new cc(z0Var, z0Var.e).k(false).k(true);
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
                                                                request.setDescription(cd.L0(2131742954, null));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) v0Var2.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                z0 z0Var2 = v0Var2.Q;
                                                                if (z0Var2 != null) {
                                                                    new cc(z0Var2, z0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131742953, guessFileName))).k(true);
                                                                    break;
                                                                }
                                                            } catch (Exception e11) {
                                                                f8.g(e11, true);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", v0Var2.getContext().getPackageName());
                                                            v0Var2.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e12) {
                                                            f8.g(e12, true);
                                                            v0Var2.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    v0 v0Var3 = h0Var2.a;
                                                    if (i14 != 0) {
                                                        if (i14 != 1) {
                                                            if (i14 == 2) {
                                                                org.telegram.messenger.i0.g(str7);
                                                                z0 z0Var3 = v0Var3.Q;
                                                                if (z0Var3 != null) {
                                                                    new cc(z0Var3, z0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                                v0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e13) {
                                                                f8.g(e13, true);
                                                                v0Var3.loadUrl(str7);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        v0Var3.loadUrl(str7);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    k10.L = charSequenceArr22;
                                    k10.K = onClickListener22;
                                    k10.show();
                                    v0Var.F = k10;
                                }
                            } else {
                                c10 = 2;
                            }
                            str3 = str6;
                            str = str3;
                            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                            k10.Q = true;
                            k10.O = str2;
                            k10.P = false;
                            String L0422 = cd.L0(2131747808, null);
                            String L02222 = cd.L0(2131747810, null);
                            String L03222 = cd.L0(2131751767, null);
                            CharSequence[] charSequenceArr222 = new CharSequence[3];
                            charSequenceArr222[0] = L0422;
                            charSequenceArr222[1] = L02222;
                            charSequenceArr222[c10] = L03222;
                            DialogInterface.OnClickListener onClickListener222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i14) {
                                    int i15 = i13;
                                    String str7 = str6;
                                    h0 h0Var2 = h0Var;
                                    switch (i15) {
                                        case 0:
                                            v0 v0Var2 = h0Var2.a;
                                            if (i14 != 0) {
                                                if (i14 != 1) {
                                                    if (i14 == 2) {
                                                        org.telegram.messenger.i0.g(str7);
                                                        z0 z0Var = v0Var2.Q;
                                                        if (z0Var != null) {
                                                            new cc(z0Var, z0Var.e).k(false).k(true);
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
                                                        request.setDescription(cd.L0(2131742954, null));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) v0Var2.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        z0 z0Var2 = v0Var2.Q;
                                                        if (z0Var2 != null) {
                                                            new cc(z0Var2, z0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131742953, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e11) {
                                                        f8.g(e11, true);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", v0Var2.getContext().getPackageName());
                                                    v0Var2.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e12) {
                                                    f8.g(e12, true);
                                                    v0Var2.loadUrl(str7);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            v0 v0Var3 = h0Var2.a;
                                            if (i14 != 0) {
                                                if (i14 != 1) {
                                                    if (i14 == 2) {
                                                        org.telegram.messenger.i0.g(str7);
                                                        z0 z0Var3 = v0Var3.Q;
                                                        if (z0Var3 != null) {
                                                            new cc(z0Var3, z0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                        v0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e13) {
                                                        f8.g(e13, true);
                                                        v0Var3.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                v0Var3.loadUrl(str7);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            k10.L = charSequenceArr222;
                            k10.K = onClickListener222;
                            k10.show();
                            v0Var.F = k10;
                        default:
                            v0 v0Var2 = h0Var.a;
                            z2 k11 = m5.k(1, v0Var2.getContext(), null, false);
                            try {
                                Uri parse2 = Uri.parse(str6);
                                str4 = gf.f.u(parse2, null, null, gf.f.a(parse2.getHost()), null);
                            } catch (Exception e11) {
                                try {
                                    f8.g(e11, false);
                                    str4 = str6;
                                } catch (Exception e12) {
                                    e = e12;
                                    str4 = str6;
                                    f8.g(e, true);
                                    str5 = str4;
                                    k11.Q = true;
                                    k11.O = str5;
                                    k11.P = false;
                                    CharSequence[] charSequenceArr3 = {cd.L0(2131747810, null), cd.L0(2131754938, null), cd.L0(2131751762, null)};
                                    DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i14) {
                                            int i15 = i12;
                                            String str7 = str6;
                                            h0 h0Var2 = h0Var;
                                            switch (i15) {
                                                case 0:
                                                    v0 v0Var22 = h0Var2.a;
                                                    if (i14 != 0) {
                                                        if (i14 != 1) {
                                                            if (i14 == 2) {
                                                                org.telegram.messenger.i0.g(str7);
                                                                z0 z0Var = v0Var22.Q;
                                                                if (z0Var != null) {
                                                                    new cc(z0Var, z0Var.e).k(false).k(true);
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
                                                                request.setDescription(cd.L0(2131742954, null));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) v0Var22.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                z0 z0Var2 = v0Var22.Q;
                                                                if (z0Var2 != null) {
                                                                    new cc(z0Var2, z0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131742953, guessFileName))).k(true);
                                                                    break;
                                                                }
                                                            } catch (Exception e112) {
                                                                f8.g(e112, true);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", v0Var22.getContext().getPackageName());
                                                            v0Var22.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e122) {
                                                            f8.g(e122, true);
                                                            v0Var22.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    v0 v0Var3 = h0Var2.a;
                                                    if (i14 != 0) {
                                                        if (i14 != 1) {
                                                            if (i14 == 2) {
                                                                org.telegram.messenger.i0.g(str7);
                                                                z0 z0Var3 = v0Var3.Q;
                                                                if (z0Var3 != null) {
                                                                    new cc(z0Var3, z0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                                v0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e13) {
                                                                f8.g(e13, true);
                                                                v0Var3.loadUrl(str7);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        v0Var3.loadUrl(str7);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    k11.L = charSequenceArr3;
                                    k11.K = onClickListener3;
                                    k11.show();
                                    v0Var2.F = k11;
                                }
                            }
                            try {
                                str5 = URLDecoder.decode(str4.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e13) {
                                e = e13;
                                f8.g(e, true);
                                str5 = str4;
                                k11.Q = true;
                                k11.O = str5;
                                k11.P = false;
                                CharSequence[] charSequenceArr32 = {cd.L0(2131747810, null), cd.L0(2131754938, null), cd.L0(2131751762, null)};
                                DialogInterface.OnClickListener onClickListener32 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i14) {
                                        int i15 = i12;
                                        String str7 = str6;
                                        h0 h0Var2 = h0Var;
                                        switch (i15) {
                                            case 0:
                                                v0 v0Var22 = h0Var2.a;
                                                if (i14 != 0) {
                                                    if (i14 != 1) {
                                                        if (i14 == 2) {
                                                            org.telegram.messenger.i0.g(str7);
                                                            z0 z0Var = v0Var22.Q;
                                                            if (z0Var != null) {
                                                                new cc(z0Var, z0Var.e).k(false).k(true);
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
                                                            request.setDescription(cd.L0(2131742954, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) v0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            z0 z0Var2 = v0Var22.Q;
                                                            if (z0Var2 != null) {
                                                                new cc(z0Var2, z0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131742953, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e112) {
                                                            f8.g(e112, true);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", v0Var22.getContext().getPackageName());
                                                        v0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e122) {
                                                        f8.g(e122, true);
                                                        v0Var22.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                v0 v0Var3 = h0Var2.a;
                                                if (i14 != 0) {
                                                    if (i14 != 1) {
                                                        if (i14 == 2) {
                                                            org.telegram.messenger.i0.g(str7);
                                                            z0 z0Var3 = v0Var3.Q;
                                                            if (z0Var3 != null) {
                                                                new cc(z0Var3, z0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                            v0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e132) {
                                                            f8.g(e132, true);
                                                            v0Var3.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    v0Var3.loadUrl(str7);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                k11.L = charSequenceArr32;
                                k11.K = onClickListener32;
                                k11.show();
                                v0Var2.F = k11;
                            }
                            k11.Q = true;
                            k11.O = str5;
                            k11.P = false;
                            CharSequence[] charSequenceArr322 = {cd.L0(2131747810, null), cd.L0(2131754938, null), cd.L0(2131751762, null)};
                            DialogInterface.OnClickListener onClickListener322 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i14) {
                                    int i15 = i12;
                                    String str7 = str6;
                                    h0 h0Var2 = h0Var;
                                    switch (i15) {
                                        case 0:
                                            v0 v0Var22 = h0Var2.a;
                                            if (i14 != 0) {
                                                if (i14 != 1) {
                                                    if (i14 == 2) {
                                                        org.telegram.messenger.i0.g(str7);
                                                        z0 z0Var = v0Var22.Q;
                                                        if (z0Var != null) {
                                                            new cc(z0Var, z0Var.e).k(false).k(true);
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
                                                        request.setDescription(cd.L0(2131742954, null));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) v0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        z0 z0Var2 = v0Var22.Q;
                                                        if (z0Var2 != null) {
                                                            new cc(z0Var2, z0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131742953, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e112) {
                                                        f8.g(e112, true);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", v0Var22.getContext().getPackageName());
                                                    v0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e122) {
                                                    f8.g(e122, true);
                                                    v0Var22.loadUrl(str7);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            v0 v0Var3 = h0Var2.a;
                                            if (i14 != 0) {
                                                if (i14 != 1) {
                                                    if (i14 == 2) {
                                                        org.telegram.messenger.i0.g(str7);
                                                        z0 z0Var3 = v0Var3.Q;
                                                        if (z0Var3 != null) {
                                                            new cc(z0Var3, z0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                        v0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e132) {
                                                        f8.g(e132, true);
                                                        v0Var3.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                v0Var3.loadUrl(str7);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            k11.L = charSequenceArr322;
                            k11.K = onClickListener322;
                            k11.show();
                            v0Var2.F = k11;
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
        org.telegram.messenger.i0.g3(new Runnable(this) { // from class: org.telegram.ui.web.f0
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
                int i112 = i11;
                final String str6 = extra2;
                final h0 h0Var = this.b;
                final int i12 = 0;
                final int i13 = 1;
                switch (i112) {
                    case 0:
                        v0 v0Var = h0Var.a;
                        z2 k10 = m5.k(1, v0Var.getContext(), null, false);
                        try {
                            parse = Uri.parse(str6);
                        } catch (Exception e) {
                            e = e;
                            c10 = 2;
                        }
                        if (parse != null) {
                            c10 = 2;
                            try {
                            } catch (Exception e7) {
                                e = e7;
                                try {
                                    f8.g(e, false);
                                    str = str6;
                                    str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                                } catch (Exception e10) {
                                    e = e10;
                                    str = str6;
                                    f8.g(e, true);
                                    str2 = str;
                                    k10.Q = true;
                                    k10.O = str2;
                                    k10.P = false;
                                    String L0422 = cd.L0(2131747808, null);
                                    String L02222 = cd.L0(2131747810, null);
                                    String L03222 = cd.L0(2131751767, null);
                                    CharSequence[] charSequenceArr222 = new CharSequence[3];
                                    charSequenceArr222[0] = L0422;
                                    charSequenceArr222[1] = L02222;
                                    charSequenceArr222[c10] = L03222;
                                    DialogInterface.OnClickListener onClickListener222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i14) {
                                            int i15 = i13;
                                            String str7 = str6;
                                            h0 h0Var2 = h0Var;
                                            switch (i15) {
                                                case 0:
                                                    v0 v0Var22 = h0Var2.a;
                                                    if (i14 != 0) {
                                                        if (i14 != 1) {
                                                            if (i14 == 2) {
                                                                org.telegram.messenger.i0.g(str7);
                                                                z0 z0Var = v0Var22.Q;
                                                                if (z0Var != null) {
                                                                    new cc(z0Var, z0Var.e).k(false).k(true);
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
                                                                request.setDescription(cd.L0(2131742954, null));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) v0Var22.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                z0 z0Var2 = v0Var22.Q;
                                                                if (z0Var2 != null) {
                                                                    new cc(z0Var2, z0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131742953, guessFileName))).k(true);
                                                                    break;
                                                                }
                                                            } catch (Exception e112) {
                                                                f8.g(e112, true);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", v0Var22.getContext().getPackageName());
                                                            v0Var22.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e122) {
                                                            f8.g(e122, true);
                                                            v0Var22.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    v0 v0Var3 = h0Var2.a;
                                                    if (i14 != 0) {
                                                        if (i14 != 1) {
                                                            if (i14 == 2) {
                                                                org.telegram.messenger.i0.g(str7);
                                                                z0 z0Var3 = v0Var3.Q;
                                                                if (z0Var3 != null) {
                                                                    new cc(z0Var3, z0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                                v0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e132) {
                                                                f8.g(e132, true);
                                                                v0Var3.loadUrl(str7);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        v0Var3.loadUrl(str7);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    k10.L = charSequenceArr222;
                                    k10.K = onClickListener222;
                                    k10.show();
                                    v0Var.F = k10;
                                    return;
                                }
                                k10.Q = true;
                                k10.O = str2;
                                k10.P = false;
                                String L04222 = cd.L0(2131747808, null);
                                String L022222 = cd.L0(2131747810, null);
                                String L032222 = cd.L0(2131751767, null);
                                CharSequence[] charSequenceArr2222 = new CharSequence[3];
                                charSequenceArr2222[0] = L04222;
                                charSequenceArr2222[1] = L022222;
                                charSequenceArr2222[c10] = L032222;
                                DialogInterface.OnClickListener onClickListener2222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i14) {
                                        int i15 = i13;
                                        String str7 = str6;
                                        h0 h0Var2 = h0Var;
                                        switch (i15) {
                                            case 0:
                                                v0 v0Var22 = h0Var2.a;
                                                if (i14 != 0) {
                                                    if (i14 != 1) {
                                                        if (i14 == 2) {
                                                            org.telegram.messenger.i0.g(str7);
                                                            z0 z0Var = v0Var22.Q;
                                                            if (z0Var != null) {
                                                                new cc(z0Var, z0Var.e).k(false).k(true);
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
                                                            request.setDescription(cd.L0(2131742954, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) v0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            z0 z0Var2 = v0Var22.Q;
                                                            if (z0Var2 != null) {
                                                                new cc(z0Var2, z0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131742953, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e112) {
                                                            f8.g(e112, true);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", v0Var22.getContext().getPackageName());
                                                        v0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e122) {
                                                        f8.g(e122, true);
                                                        v0Var22.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                v0 v0Var3 = h0Var2.a;
                                                if (i14 != 0) {
                                                    if (i14 != 1) {
                                                        if (i14 == 2) {
                                                            org.telegram.messenger.i0.g(str7);
                                                            z0 z0Var3 = v0Var3.Q;
                                                            if (z0Var3 != null) {
                                                                new cc(z0Var3, z0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                            v0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e132) {
                                                            f8.g(e132, true);
                                                            v0Var3.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    v0Var3.loadUrl(str7);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                k10.L = charSequenceArr2222;
                                k10.K = onClickListener2222;
                                k10.show();
                                v0Var.F = k10;
                                return;
                            }
                            if (!parse.getScheme().equalsIgnoreCase("data")) {
                                str3 = gf.f.u(parse, null, null, gf.f.a(parse.getHost()), null);
                                str = str3;
                                str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                                k10.Q = true;
                                k10.O = str2;
                                k10.P = false;
                                String L042222 = cd.L0(2131747808, null);
                                String L0222222 = cd.L0(2131747810, null);
                                String L0322222 = cd.L0(2131751767, null);
                                CharSequence[] charSequenceArr22222 = new CharSequence[3];
                                charSequenceArr22222[0] = L042222;
                                charSequenceArr22222[1] = L0222222;
                                charSequenceArr22222[c10] = L0322222;
                                DialogInterface.OnClickListener onClickListener22222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i14) {
                                        int i15 = i13;
                                        String str7 = str6;
                                        h0 h0Var2 = h0Var;
                                        switch (i15) {
                                            case 0:
                                                v0 v0Var22 = h0Var2.a;
                                                if (i14 != 0) {
                                                    if (i14 != 1) {
                                                        if (i14 == 2) {
                                                            org.telegram.messenger.i0.g(str7);
                                                            z0 z0Var = v0Var22.Q;
                                                            if (z0Var != null) {
                                                                new cc(z0Var, z0Var.e).k(false).k(true);
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
                                                            request.setDescription(cd.L0(2131742954, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) v0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            z0 z0Var2 = v0Var22.Q;
                                                            if (z0Var2 != null) {
                                                                new cc(z0Var2, z0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131742953, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e112) {
                                                            f8.g(e112, true);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", v0Var22.getContext().getPackageName());
                                                        v0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e122) {
                                                        f8.g(e122, true);
                                                        v0Var22.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                v0 v0Var3 = h0Var2.a;
                                                if (i14 != 0) {
                                                    if (i14 != 1) {
                                                        if (i14 == 2) {
                                                            org.telegram.messenger.i0.g(str7);
                                                            z0 z0Var3 = v0Var3.Q;
                                                            if (z0Var3 != null) {
                                                                new cc(z0Var3, z0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                            v0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e132) {
                                                            f8.g(e132, true);
                                                            v0Var3.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    v0Var3.loadUrl(str7);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                k10.L = charSequenceArr22222;
                                k10.K = onClickListener22222;
                                k10.show();
                                v0Var.F = k10;
                            }
                        } else {
                            c10 = 2;
                        }
                        str3 = str6;
                        str = str3;
                        str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                        k10.Q = true;
                        k10.O = str2;
                        k10.P = false;
                        String L0422222 = cd.L0(2131747808, null);
                        String L02222222 = cd.L0(2131747810, null);
                        String L03222222 = cd.L0(2131751767, null);
                        CharSequence[] charSequenceArr222222 = new CharSequence[3];
                        charSequenceArr222222[0] = L0422222;
                        charSequenceArr222222[1] = L02222222;
                        charSequenceArr222222[c10] = L03222222;
                        DialogInterface.OnClickListener onClickListener222222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i14) {
                                int i15 = i13;
                                String str7 = str6;
                                h0 h0Var2 = h0Var;
                                switch (i15) {
                                    case 0:
                                        v0 v0Var22 = h0Var2.a;
                                        if (i14 != 0) {
                                            if (i14 != 1) {
                                                if (i14 == 2) {
                                                    org.telegram.messenger.i0.g(str7);
                                                    z0 z0Var = v0Var22.Q;
                                                    if (z0Var != null) {
                                                        new cc(z0Var, z0Var.e).k(false).k(true);
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
                                                    request.setDescription(cd.L0(2131742954, null));
                                                    request.setNotificationVisibility(1);
                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                    DownloadManager downloadManager = (DownloadManager) v0Var22.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    z0 z0Var2 = v0Var22.Q;
                                                    if (z0Var2 != null) {
                                                        new cc(z0Var2, z0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131742953, guessFileName))).k(true);
                                                        break;
                                                    }
                                                } catch (Exception e112) {
                                                    f8.g(e112, true);
                                                    return;
                                                }
                                            }
                                        } else {
                                            try {
                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                intent.putExtra("create_new_tab", true);
                                                intent.putExtra("com.android.browser.application_id", v0Var22.getContext().getPackageName());
                                                v0Var22.getContext().startActivity(intent);
                                                break;
                                            } catch (Exception e122) {
                                                f8.g(e122, true);
                                                v0Var22.loadUrl(str7);
                                                return;
                                            }
                                        }
                                        break;
                                    default:
                                        v0 v0Var3 = h0Var2.a;
                                        if (i14 != 0) {
                                            if (i14 != 1) {
                                                if (i14 == 2) {
                                                    org.telegram.messenger.i0.g(str7);
                                                    z0 z0Var3 = v0Var3.Q;
                                                    if (z0Var3 != null) {
                                                        new cc(z0Var3, z0Var3.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                    v0Var3.getContext().startActivity(intent2);
                                                    break;
                                                } catch (Exception e132) {
                                                    f8.g(e132, true);
                                                    v0Var3.loadUrl(str7);
                                                    return;
                                                }
                                            }
                                        } else {
                                            v0Var3.loadUrl(str7);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        k10.L = charSequenceArr222222;
                        k10.K = onClickListener222222;
                        k10.show();
                        v0Var.F = k10;
                    default:
                        v0 v0Var2 = h0Var.a;
                        z2 k11 = m5.k(1, v0Var2.getContext(), null, false);
                        try {
                            Uri parse2 = Uri.parse(str6);
                            str4 = gf.f.u(parse2, null, null, gf.f.a(parse2.getHost()), null);
                        } catch (Exception e11) {
                            try {
                                f8.g(e11, false);
                                str4 = str6;
                            } catch (Exception e12) {
                                e = e12;
                                str4 = str6;
                                f8.g(e, true);
                                str5 = str4;
                                k11.Q = true;
                                k11.O = str5;
                                k11.P = false;
                                CharSequence[] charSequenceArr322 = {cd.L0(2131747810, null), cd.L0(2131754938, null), cd.L0(2131751762, null)};
                                DialogInterface.OnClickListener onClickListener322 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i14) {
                                        int i15 = i12;
                                        String str7 = str6;
                                        h0 h0Var2 = h0Var;
                                        switch (i15) {
                                            case 0:
                                                v0 v0Var22 = h0Var2.a;
                                                if (i14 != 0) {
                                                    if (i14 != 1) {
                                                        if (i14 == 2) {
                                                            org.telegram.messenger.i0.g(str7);
                                                            z0 z0Var = v0Var22.Q;
                                                            if (z0Var != null) {
                                                                new cc(z0Var, z0Var.e).k(false).k(true);
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
                                                            request.setDescription(cd.L0(2131742954, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) v0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            z0 z0Var2 = v0Var22.Q;
                                                            if (z0Var2 != null) {
                                                                new cc(z0Var2, z0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131742953, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e112) {
                                                            f8.g(e112, true);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", v0Var22.getContext().getPackageName());
                                                        v0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e122) {
                                                        f8.g(e122, true);
                                                        v0Var22.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                v0 v0Var3 = h0Var2.a;
                                                if (i14 != 0) {
                                                    if (i14 != 1) {
                                                        if (i14 == 2) {
                                                            org.telegram.messenger.i0.g(str7);
                                                            z0 z0Var3 = v0Var3.Q;
                                                            if (z0Var3 != null) {
                                                                new cc(z0Var3, z0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                            v0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e132) {
                                                            f8.g(e132, true);
                                                            v0Var3.loadUrl(str7);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    v0Var3.loadUrl(str7);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                k11.L = charSequenceArr322;
                                k11.K = onClickListener322;
                                k11.show();
                                v0Var2.F = k11;
                            }
                        }
                        try {
                            str5 = URLDecoder.decode(str4.replaceAll("\\+", "%2b"), "UTF-8");
                        } catch (Exception e13) {
                            e = e13;
                            f8.g(e, true);
                            str5 = str4;
                            k11.Q = true;
                            k11.O = str5;
                            k11.P = false;
                            CharSequence[] charSequenceArr3222 = {cd.L0(2131747810, null), cd.L0(2131754938, null), cd.L0(2131751762, null)};
                            DialogInterface.OnClickListener onClickListener3222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i14) {
                                    int i15 = i12;
                                    String str7 = str6;
                                    h0 h0Var2 = h0Var;
                                    switch (i15) {
                                        case 0:
                                            v0 v0Var22 = h0Var2.a;
                                            if (i14 != 0) {
                                                if (i14 != 1) {
                                                    if (i14 == 2) {
                                                        org.telegram.messenger.i0.g(str7);
                                                        z0 z0Var = v0Var22.Q;
                                                        if (z0Var != null) {
                                                            new cc(z0Var, z0Var.e).k(false).k(true);
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
                                                        request.setDescription(cd.L0(2131742954, null));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) v0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        z0 z0Var2 = v0Var22.Q;
                                                        if (z0Var2 != null) {
                                                            new cc(z0Var2, z0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131742953, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e112) {
                                                        f8.g(e112, true);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", v0Var22.getContext().getPackageName());
                                                    v0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e122) {
                                                    f8.g(e122, true);
                                                    v0Var22.loadUrl(str7);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            v0 v0Var3 = h0Var2.a;
                                            if (i14 != 0) {
                                                if (i14 != 1) {
                                                    if (i14 == 2) {
                                                        org.telegram.messenger.i0.g(str7);
                                                        z0 z0Var3 = v0Var3.Q;
                                                        if (z0Var3 != null) {
                                                            new cc(z0Var3, z0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                        v0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e132) {
                                                        f8.g(e132, true);
                                                        v0Var3.loadUrl(str7);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                v0Var3.loadUrl(str7);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            k11.L = charSequenceArr3222;
                            k11.K = onClickListener3222;
                            k11.show();
                            v0Var2.F = k11;
                        }
                        k11.Q = true;
                        k11.O = str5;
                        k11.P = false;
                        CharSequence[] charSequenceArr32222 = {cd.L0(2131747810, null), cd.L0(2131754938, null), cd.L0(2131751762, null)};
                        DialogInterface.OnClickListener onClickListener32222 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.g0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i14) {
                                int i15 = i12;
                                String str7 = str6;
                                h0 h0Var2 = h0Var;
                                switch (i15) {
                                    case 0:
                                        v0 v0Var22 = h0Var2.a;
                                        if (i14 != 0) {
                                            if (i14 != 1) {
                                                if (i14 == 2) {
                                                    org.telegram.messenger.i0.g(str7);
                                                    z0 z0Var = v0Var22.Q;
                                                    if (z0Var != null) {
                                                        new cc(z0Var, z0Var.e).k(false).k(true);
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
                                                    request.setDescription(cd.L0(2131742954, null));
                                                    request.setNotificationVisibility(1);
                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                    DownloadManager downloadManager = (DownloadManager) v0Var22.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    z0 z0Var2 = v0Var22.Q;
                                                    if (z0Var2 != null) {
                                                        new cc(z0Var2, z0Var2.e).Q(R.raw.ic_download, 36, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131742953, guessFileName))).k(true);
                                                        break;
                                                    }
                                                } catch (Exception e112) {
                                                    f8.g(e112, true);
                                                    return;
                                                }
                                            }
                                        } else {
                                            try {
                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                intent.putExtra("create_new_tab", true);
                                                intent.putExtra("com.android.browser.application_id", v0Var22.getContext().getPackageName());
                                                v0Var22.getContext().startActivity(intent);
                                                break;
                                            } catch (Exception e122) {
                                                f8.g(e122, true);
                                                v0Var22.loadUrl(str7);
                                                return;
                                            }
                                        }
                                        break;
                                    default:
                                        v0 v0Var3 = h0Var2.a;
                                        if (i14 != 0) {
                                            if (i14 != 1) {
                                                if (i14 == 2) {
                                                    org.telegram.messenger.i0.g(str7);
                                                    z0 z0Var3 = v0Var3.Q;
                                                    if (z0Var3 != null) {
                                                        new cc(z0Var3, z0Var3.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str7));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", v0Var3.getContext().getPackageName());
                                                    v0Var3.getContext().startActivity(intent2);
                                                    break;
                                                } catch (Exception e132) {
                                                    f8.g(e132, true);
                                                    v0Var3.loadUrl(str7);
                                                    return;
                                                }
                                            }
                                        } else {
                                            v0Var3.loadUrl(str7);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        k11.L = charSequenceArr32222;
                        k11.K = onClickListener32222;
                        k11.show();
                        v0Var2.F = k11;
                }
            }
        });
        return true;
    }
}
