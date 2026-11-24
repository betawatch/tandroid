// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class yv0 implements View.OnLongClickListener {
    public final /* synthetic */ mw0 a;

    public yv0(mw0 mw0Var) {
        this.a = mw0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.a.getHitTestResult();
        final byte b = 0;
        final byte b2 = 1;
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            gm.c3(new Runnable(this) { // from class: wv0
                public final /* synthetic */ yv0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(8:22|23|24|(4:28|30|31|32)|37|30|31|32) */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
                
                    r4 = e;
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
                    byte b3 = b;
                    final String str5 = extra;
                    final yv0 yv0Var = this.b;
                    final byte b4 = 0;
                    final byte b5 = 1;
                    switch (b3) {
                        case 0:
                            mw0 mw0Var = yv0Var.a;
                            my0 h = hg9.h(1, null, mw0Var.getContext(), false);
                            try {
                                parse = Uri.parse(str5);
                            } catch (Exception e) {
                                try {
                                    fc4.g(e, false);
                                } catch (Exception e2) {
                                    e = e2;
                                    str = str5;
                                    fc4.g(e, true);
                                    str2 = str;
                                    h.R = true;
                                    h.P = str2;
                                    h.Q = false;
                                    CharSequence[] charSequenceArr = {jb6.M0(2131747525, null), jb6.M0(2131747527, null), jb6.M0(2131751704, null)};
                                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: xv0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i) {
                                            byte b6 = b5;
                                            String str6 = str5;
                                            yv0 yv0Var2 = yv0Var;
                                            switch (b6) {
                                                case 0:
                                                    mw0 mw0Var2 = yv0Var2.a;
                                                    if (i != 0) {
                                                        if (i != 1) {
                                                            if (i == 2) {
                                                                gm.g(str6);
                                                                qw0 qw0Var = mw0Var2.R;
                                                                if (qw0Var != null) {
                                                                    new c41(qw0Var, qw0Var.e).k(false).k(true);
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
                                                                request.setDescription(jb6.M0(2131742591, null));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) mw0Var2.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                qw0 qw0Var2 = mw0Var2.R;
                                                                if (qw0Var2 != null) {
                                                                    new c41(qw0Var2, qw0Var2.e).Q(R.raw.ic_download, 36, gm.S2(jb6.a0(null, null, 2131742590, guessFileName))).k(true);
                                                                    break;
                                                                }
                                                            } catch (Exception e3) {
                                                                fc4.g(e3, true);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", mw0Var2.getContext().getPackageName());
                                                            mw0Var2.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e4) {
                                                            fc4.g(e4, true);
                                                            mw0Var2.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    mw0 mw0Var3 = yv0Var2.a;
                                                    if (i != 0) {
                                                        if (i != 1) {
                                                            if (i == 2) {
                                                                gm.g(str6);
                                                                qw0 qw0Var3 = mw0Var3.R;
                                                                if (qw0Var3 != null) {
                                                                    new c41(qw0Var3, qw0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", mw0Var3.getContext().getPackageName());
                                                                mw0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e5) {
                                                                fc4.g(e5, true);
                                                                mw0Var3.loadUrl(str6);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        mw0Var3.loadUrl(str6);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    h.M = charSequenceArr;
                                    h.L = onClickListener;
                                    h.show();
                                    mw0Var.G = h;
                                    return;
                                }
                            }
                            if (parse != null && !parse.getScheme().equalsIgnoreCase("data")) {
                                str = l11.x(parse, null, null, l11.a(parse.getHost()), null);
                                str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                                h.R = true;
                                h.P = str2;
                                h.Q = false;
                                CharSequence[] charSequenceArr2 = {jb6.M0(2131747525, null), jb6.M0(2131747527, null), jb6.M0(2131751704, null)};
                                DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: xv0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        byte b6 = b5;
                                        String str6 = str5;
                                        yv0 yv0Var2 = yv0Var;
                                        switch (b6) {
                                            case 0:
                                                mw0 mw0Var2 = yv0Var2.a;
                                                if (i != 0) {
                                                    if (i != 1) {
                                                        if (i == 2) {
                                                            gm.g(str6);
                                                            qw0 qw0Var = mw0Var2.R;
                                                            if (qw0Var != null) {
                                                                new c41(qw0Var, qw0Var.e).k(false).k(true);
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
                                                            request.setDescription(jb6.M0(2131742591, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) mw0Var2.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            qw0 qw0Var2 = mw0Var2.R;
                                                            if (qw0Var2 != null) {
                                                                new c41(qw0Var2, qw0Var2.e).Q(R.raw.ic_download, 36, gm.S2(jb6.a0(null, null, 2131742590, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e3) {
                                                            fc4.g(e3, true);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", mw0Var2.getContext().getPackageName());
                                                        mw0Var2.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e4) {
                                                        fc4.g(e4, true);
                                                        mw0Var2.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                mw0 mw0Var3 = yv0Var2.a;
                                                if (i != 0) {
                                                    if (i != 1) {
                                                        if (i == 2) {
                                                            gm.g(str6);
                                                            qw0 qw0Var3 = mw0Var3.R;
                                                            if (qw0Var3 != null) {
                                                                new c41(qw0Var3, qw0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", mw0Var3.getContext().getPackageName());
                                                            mw0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e5) {
                                                            fc4.g(e5, true);
                                                            mw0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    mw0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                h.M = charSequenceArr2;
                                h.L = onClickListener2;
                                h.show();
                                mw0Var.G = h;
                            }
                            str = str5;
                            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                            h.R = true;
                            h.P = str2;
                            h.Q = false;
                            CharSequence[] charSequenceArr22 = {jb6.M0(2131747525, null), jb6.M0(2131747527, null), jb6.M0(2131751704, null)};
                            DialogInterface.OnClickListener onClickListener22 = new DialogInterface.OnClickListener() { // from class: xv0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    byte b6 = b5;
                                    String str6 = str5;
                                    yv0 yv0Var2 = yv0Var;
                                    switch (b6) {
                                        case 0:
                                            mw0 mw0Var2 = yv0Var2.a;
                                            if (i != 0) {
                                                if (i != 1) {
                                                    if (i == 2) {
                                                        gm.g(str6);
                                                        qw0 qw0Var = mw0Var2.R;
                                                        if (qw0Var != null) {
                                                            new c41(qw0Var, qw0Var.e).k(false).k(true);
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
                                                        request.setDescription(jb6.M0(2131742591, null));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) mw0Var2.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        qw0 qw0Var2 = mw0Var2.R;
                                                        if (qw0Var2 != null) {
                                                            new c41(qw0Var2, qw0Var2.e).Q(R.raw.ic_download, 36, gm.S2(jb6.a0(null, null, 2131742590, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e3) {
                                                        fc4.g(e3, true);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", mw0Var2.getContext().getPackageName());
                                                    mw0Var2.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e4) {
                                                    fc4.g(e4, true);
                                                    mw0Var2.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            mw0 mw0Var3 = yv0Var2.a;
                                            if (i != 0) {
                                                if (i != 1) {
                                                    if (i == 2) {
                                                        gm.g(str6);
                                                        qw0 qw0Var3 = mw0Var3.R;
                                                        if (qw0Var3 != null) {
                                                            new c41(qw0Var3, qw0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", mw0Var3.getContext().getPackageName());
                                                        mw0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e5) {
                                                        fc4.g(e5, true);
                                                        mw0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                mw0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            h.M = charSequenceArr22;
                            h.L = onClickListener22;
                            h.show();
                            mw0Var.G = h;
                            break;
                        default:
                            mw0 mw0Var2 = yv0Var.a;
                            my0 h2 = hg9.h(1, null, mw0Var2.getContext(), false);
                            try {
                                Uri parse2 = Uri.parse(str5);
                                str3 = l11.x(parse2, null, null, l11.a(parse2.getHost()), null);
                            } catch (Exception e3) {
                                try {
                                    fc4.g(e3, false);
                                    str3 = str5;
                                } catch (Exception e4) {
                                    e = e4;
                                    str3 = str5;
                                    fc4.g(e, true);
                                    str4 = str3;
                                    h2.R = true;
                                    h2.P = str4;
                                    h2.Q = false;
                                    CharSequence[] charSequenceArr3 = {jb6.M0(2131747527, null), jb6.M0(2131754938, null), jb6.M0(2131751699, null)};
                                    DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: xv0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i) {
                                            byte b6 = b4;
                                            String str6 = str5;
                                            yv0 yv0Var2 = yv0Var;
                                            switch (b6) {
                                                case 0:
                                                    mw0 mw0Var22 = yv0Var2.a;
                                                    if (i != 0) {
                                                        if (i != 1) {
                                                            if (i == 2) {
                                                                gm.g(str6);
                                                                qw0 qw0Var = mw0Var22.R;
                                                                if (qw0Var != null) {
                                                                    new c41(qw0Var, qw0Var.e).k(false).k(true);
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
                                                                request.setDescription(jb6.M0(2131742591, null));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) mw0Var22.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                qw0 qw0Var2 = mw0Var22.R;
                                                                if (qw0Var2 != null) {
                                                                    new c41(qw0Var2, qw0Var2.e).Q(R.raw.ic_download, 36, gm.S2(jb6.a0(null, null, 2131742590, guessFileName))).k(true);
                                                                    break;
                                                                }
                                                            } catch (Exception e32) {
                                                                fc4.g(e32, true);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", mw0Var22.getContext().getPackageName());
                                                            mw0Var22.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e42) {
                                                            fc4.g(e42, true);
                                                            mw0Var22.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    mw0 mw0Var3 = yv0Var2.a;
                                                    if (i != 0) {
                                                        if (i != 1) {
                                                            if (i == 2) {
                                                                gm.g(str6);
                                                                qw0 qw0Var3 = mw0Var3.R;
                                                                if (qw0Var3 != null) {
                                                                    new c41(qw0Var3, qw0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", mw0Var3.getContext().getPackageName());
                                                                mw0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e5) {
                                                                fc4.g(e5, true);
                                                                mw0Var3.loadUrl(str6);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        mw0Var3.loadUrl(str6);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    h2.M = charSequenceArr3;
                                    h2.L = onClickListener3;
                                    h2.show();
                                    mw0Var2.G = h2;
                                }
                            }
                            try {
                                str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e5) {
                                e = e5;
                                fc4.g(e, true);
                                str4 = str3;
                                h2.R = true;
                                h2.P = str4;
                                h2.Q = false;
                                CharSequence[] charSequenceArr32 = {jb6.M0(2131747527, null), jb6.M0(2131754938, null), jb6.M0(2131751699, null)};
                                DialogInterface.OnClickListener onClickListener32 = new DialogInterface.OnClickListener() { // from class: xv0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        byte b6 = b4;
                                        String str6 = str5;
                                        yv0 yv0Var2 = yv0Var;
                                        switch (b6) {
                                            case 0:
                                                mw0 mw0Var22 = yv0Var2.a;
                                                if (i != 0) {
                                                    if (i != 1) {
                                                        if (i == 2) {
                                                            gm.g(str6);
                                                            qw0 qw0Var = mw0Var22.R;
                                                            if (qw0Var != null) {
                                                                new c41(qw0Var, qw0Var.e).k(false).k(true);
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
                                                            request.setDescription(jb6.M0(2131742591, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) mw0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            qw0 qw0Var2 = mw0Var22.R;
                                                            if (qw0Var2 != null) {
                                                                new c41(qw0Var2, qw0Var2.e).Q(R.raw.ic_download, 36, gm.S2(jb6.a0(null, null, 2131742590, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e32) {
                                                            fc4.g(e32, true);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", mw0Var22.getContext().getPackageName());
                                                        mw0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e42) {
                                                        fc4.g(e42, true);
                                                        mw0Var22.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                mw0 mw0Var3 = yv0Var2.a;
                                                if (i != 0) {
                                                    if (i != 1) {
                                                        if (i == 2) {
                                                            gm.g(str6);
                                                            qw0 qw0Var3 = mw0Var3.R;
                                                            if (qw0Var3 != null) {
                                                                new c41(qw0Var3, qw0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", mw0Var3.getContext().getPackageName());
                                                            mw0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e52) {
                                                            fc4.g(e52, true);
                                                            mw0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    mw0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                h2.M = charSequenceArr32;
                                h2.L = onClickListener32;
                                h2.show();
                                mw0Var2.G = h2;
                            }
                            h2.R = true;
                            h2.P = str4;
                            h2.Q = false;
                            CharSequence[] charSequenceArr322 = {jb6.M0(2131747527, null), jb6.M0(2131754938, null), jb6.M0(2131751699, null)};
                            DialogInterface.OnClickListener onClickListener322 = new DialogInterface.OnClickListener() { // from class: xv0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    byte b6 = b4;
                                    String str6 = str5;
                                    yv0 yv0Var2 = yv0Var;
                                    switch (b6) {
                                        case 0:
                                            mw0 mw0Var22 = yv0Var2.a;
                                            if (i != 0) {
                                                if (i != 1) {
                                                    if (i == 2) {
                                                        gm.g(str6);
                                                        qw0 qw0Var = mw0Var22.R;
                                                        if (qw0Var != null) {
                                                            new c41(qw0Var, qw0Var.e).k(false).k(true);
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
                                                        request.setDescription(jb6.M0(2131742591, null));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) mw0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        qw0 qw0Var2 = mw0Var22.R;
                                                        if (qw0Var2 != null) {
                                                            new c41(qw0Var2, qw0Var2.e).Q(R.raw.ic_download, 36, gm.S2(jb6.a0(null, null, 2131742590, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e32) {
                                                        fc4.g(e32, true);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", mw0Var22.getContext().getPackageName());
                                                    mw0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e42) {
                                                    fc4.g(e42, true);
                                                    mw0Var22.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            mw0 mw0Var3 = yv0Var2.a;
                                            if (i != 0) {
                                                if (i != 1) {
                                                    if (i == 2) {
                                                        gm.g(str6);
                                                        qw0 qw0Var3 = mw0Var3.R;
                                                        if (qw0Var3 != null) {
                                                            new c41(qw0Var3, qw0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", mw0Var3.getContext().getPackageName());
                                                        mw0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e52) {
                                                        fc4.g(e52, true);
                                                        mw0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                mw0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            h2.M = charSequenceArr322;
                            h2.L = onClickListener322;
                            h2.show();
                            mw0Var2.G = h2;
                    }
                }
            });
            return true;
        }
        if (hitTestResult.getType() != 5) {
            return false;
        }
        final String extra2 = hitTestResult.getExtra();
        gm.c3(new Runnable(this) { // from class: wv0
            public final /* synthetic */ yv0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(8:22|23|24|(4:28|30|31|32)|37|30|31|32) */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
            
                r4 = e;
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
                byte b3 = b2;
                final String str5 = extra2;
                final yv0 yv0Var = this.b;
                final byte b4 = 0;
                final byte b5 = 1;
                switch (b3) {
                    case 0:
                        mw0 mw0Var = yv0Var.a;
                        my0 h = hg9.h(1, null, mw0Var.getContext(), false);
                        try {
                            parse = Uri.parse(str5);
                        } catch (Exception e) {
                            try {
                                fc4.g(e, false);
                            } catch (Exception e2) {
                                e = e2;
                                str = str5;
                                fc4.g(e, true);
                                str2 = str;
                                h.R = true;
                                h.P = str2;
                                h.Q = false;
                                CharSequence[] charSequenceArr22 = {jb6.M0(2131747525, null), jb6.M0(2131747527, null), jb6.M0(2131751704, null)};
                                DialogInterface.OnClickListener onClickListener22 = new DialogInterface.OnClickListener() { // from class: xv0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        byte b6 = b5;
                                        String str6 = str5;
                                        yv0 yv0Var2 = yv0Var;
                                        switch (b6) {
                                            case 0:
                                                mw0 mw0Var22 = yv0Var2.a;
                                                if (i != 0) {
                                                    if (i != 1) {
                                                        if (i == 2) {
                                                            gm.g(str6);
                                                            qw0 qw0Var = mw0Var22.R;
                                                            if (qw0Var != null) {
                                                                new c41(qw0Var, qw0Var.e).k(false).k(true);
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
                                                            request.setDescription(jb6.M0(2131742591, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) mw0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            qw0 qw0Var2 = mw0Var22.R;
                                                            if (qw0Var2 != null) {
                                                                new c41(qw0Var2, qw0Var2.e).Q(R.raw.ic_download, 36, gm.S2(jb6.a0(null, null, 2131742590, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e32) {
                                                            fc4.g(e32, true);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", mw0Var22.getContext().getPackageName());
                                                        mw0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e42) {
                                                        fc4.g(e42, true);
                                                        mw0Var22.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                mw0 mw0Var3 = yv0Var2.a;
                                                if (i != 0) {
                                                    if (i != 1) {
                                                        if (i == 2) {
                                                            gm.g(str6);
                                                            qw0 qw0Var3 = mw0Var3.R;
                                                            if (qw0Var3 != null) {
                                                                new c41(qw0Var3, qw0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", mw0Var3.getContext().getPackageName());
                                                            mw0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e52) {
                                                            fc4.g(e52, true);
                                                            mw0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    mw0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                h.M = charSequenceArr22;
                                h.L = onClickListener22;
                                h.show();
                                mw0Var.G = h;
                                return;
                            }
                        }
                        if (parse != null && !parse.getScheme().equalsIgnoreCase("data")) {
                            str = l11.x(parse, null, null, l11.a(parse.getHost()), null);
                            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                            h.R = true;
                            h.P = str2;
                            h.Q = false;
                            CharSequence[] charSequenceArr222 = {jb6.M0(2131747525, null), jb6.M0(2131747527, null), jb6.M0(2131751704, null)};
                            DialogInterface.OnClickListener onClickListener222 = new DialogInterface.OnClickListener() { // from class: xv0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    byte b6 = b5;
                                    String str6 = str5;
                                    yv0 yv0Var2 = yv0Var;
                                    switch (b6) {
                                        case 0:
                                            mw0 mw0Var22 = yv0Var2.a;
                                            if (i != 0) {
                                                if (i != 1) {
                                                    if (i == 2) {
                                                        gm.g(str6);
                                                        qw0 qw0Var = mw0Var22.R;
                                                        if (qw0Var != null) {
                                                            new c41(qw0Var, qw0Var.e).k(false).k(true);
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
                                                        request.setDescription(jb6.M0(2131742591, null));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) mw0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        qw0 qw0Var2 = mw0Var22.R;
                                                        if (qw0Var2 != null) {
                                                            new c41(qw0Var2, qw0Var2.e).Q(R.raw.ic_download, 36, gm.S2(jb6.a0(null, null, 2131742590, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e32) {
                                                        fc4.g(e32, true);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", mw0Var22.getContext().getPackageName());
                                                    mw0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e42) {
                                                    fc4.g(e42, true);
                                                    mw0Var22.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            mw0 mw0Var3 = yv0Var2.a;
                                            if (i != 0) {
                                                if (i != 1) {
                                                    if (i == 2) {
                                                        gm.g(str6);
                                                        qw0 qw0Var3 = mw0Var3.R;
                                                        if (qw0Var3 != null) {
                                                            new c41(qw0Var3, qw0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", mw0Var3.getContext().getPackageName());
                                                        mw0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e52) {
                                                        fc4.g(e52, true);
                                                        mw0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                mw0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            h.M = charSequenceArr222;
                            h.L = onClickListener222;
                            h.show();
                            mw0Var.G = h;
                        }
                        str = str5;
                        str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                        h.R = true;
                        h.P = str2;
                        h.Q = false;
                        CharSequence[] charSequenceArr2222 = {jb6.M0(2131747525, null), jb6.M0(2131747527, null), jb6.M0(2131751704, null)};
                        DialogInterface.OnClickListener onClickListener2222 = new DialogInterface.OnClickListener() { // from class: xv0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                byte b6 = b5;
                                String str6 = str5;
                                yv0 yv0Var2 = yv0Var;
                                switch (b6) {
                                    case 0:
                                        mw0 mw0Var22 = yv0Var2.a;
                                        if (i != 0) {
                                            if (i != 1) {
                                                if (i == 2) {
                                                    gm.g(str6);
                                                    qw0 qw0Var = mw0Var22.R;
                                                    if (qw0Var != null) {
                                                        new c41(qw0Var, qw0Var.e).k(false).k(true);
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
                                                    request.setDescription(jb6.M0(2131742591, null));
                                                    request.setNotificationVisibility(1);
                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                    DownloadManager downloadManager = (DownloadManager) mw0Var22.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    qw0 qw0Var2 = mw0Var22.R;
                                                    if (qw0Var2 != null) {
                                                        new c41(qw0Var2, qw0Var2.e).Q(R.raw.ic_download, 36, gm.S2(jb6.a0(null, null, 2131742590, guessFileName))).k(true);
                                                        break;
                                                    }
                                                } catch (Exception e32) {
                                                    fc4.g(e32, true);
                                                    return;
                                                }
                                            }
                                        } else {
                                            try {
                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                intent.putExtra("create_new_tab", true);
                                                intent.putExtra("com.android.browser.application_id", mw0Var22.getContext().getPackageName());
                                                mw0Var22.getContext().startActivity(intent);
                                                break;
                                            } catch (Exception e42) {
                                                fc4.g(e42, true);
                                                mw0Var22.loadUrl(str6);
                                                return;
                                            }
                                        }
                                        break;
                                    default:
                                        mw0 mw0Var3 = yv0Var2.a;
                                        if (i != 0) {
                                            if (i != 1) {
                                                if (i == 2) {
                                                    gm.g(str6);
                                                    qw0 qw0Var3 = mw0Var3.R;
                                                    if (qw0Var3 != null) {
                                                        new c41(qw0Var3, qw0Var3.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", mw0Var3.getContext().getPackageName());
                                                    mw0Var3.getContext().startActivity(intent2);
                                                    break;
                                                } catch (Exception e52) {
                                                    fc4.g(e52, true);
                                                    mw0Var3.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                        } else {
                                            mw0Var3.loadUrl(str6);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        h.M = charSequenceArr2222;
                        h.L = onClickListener2222;
                        h.show();
                        mw0Var.G = h;
                        break;
                    default:
                        mw0 mw0Var2 = yv0Var.a;
                        my0 h2 = hg9.h(1, null, mw0Var2.getContext(), false);
                        try {
                            Uri parse2 = Uri.parse(str5);
                            str3 = l11.x(parse2, null, null, l11.a(parse2.getHost()), null);
                        } catch (Exception e3) {
                            try {
                                fc4.g(e3, false);
                                str3 = str5;
                            } catch (Exception e4) {
                                e = e4;
                                str3 = str5;
                                fc4.g(e, true);
                                str4 = str3;
                                h2.R = true;
                                h2.P = str4;
                                h2.Q = false;
                                CharSequence[] charSequenceArr322 = {jb6.M0(2131747527, null), jb6.M0(2131754938, null), jb6.M0(2131751699, null)};
                                DialogInterface.OnClickListener onClickListener322 = new DialogInterface.OnClickListener() { // from class: xv0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        byte b6 = b4;
                                        String str6 = str5;
                                        yv0 yv0Var2 = yv0Var;
                                        switch (b6) {
                                            case 0:
                                                mw0 mw0Var22 = yv0Var2.a;
                                                if (i != 0) {
                                                    if (i != 1) {
                                                        if (i == 2) {
                                                            gm.g(str6);
                                                            qw0 qw0Var = mw0Var22.R;
                                                            if (qw0Var != null) {
                                                                new c41(qw0Var, qw0Var.e).k(false).k(true);
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
                                                            request.setDescription(jb6.M0(2131742591, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) mw0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            qw0 qw0Var2 = mw0Var22.R;
                                                            if (qw0Var2 != null) {
                                                                new c41(qw0Var2, qw0Var2.e).Q(R.raw.ic_download, 36, gm.S2(jb6.a0(null, null, 2131742590, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e32) {
                                                            fc4.g(e32, true);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", mw0Var22.getContext().getPackageName());
                                                        mw0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e42) {
                                                        fc4.g(e42, true);
                                                        mw0Var22.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                mw0 mw0Var3 = yv0Var2.a;
                                                if (i != 0) {
                                                    if (i != 1) {
                                                        if (i == 2) {
                                                            gm.g(str6);
                                                            qw0 qw0Var3 = mw0Var3.R;
                                                            if (qw0Var3 != null) {
                                                                new c41(qw0Var3, qw0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", mw0Var3.getContext().getPackageName());
                                                            mw0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e52) {
                                                            fc4.g(e52, true);
                                                            mw0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    mw0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                h2.M = charSequenceArr322;
                                h2.L = onClickListener322;
                                h2.show();
                                mw0Var2.G = h2;
                            }
                        }
                        try {
                            str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                        } catch (Exception e5) {
                            e = e5;
                            fc4.g(e, true);
                            str4 = str3;
                            h2.R = true;
                            h2.P = str4;
                            h2.Q = false;
                            CharSequence[] charSequenceArr3222 = {jb6.M0(2131747527, null), jb6.M0(2131754938, null), jb6.M0(2131751699, null)};
                            DialogInterface.OnClickListener onClickListener3222 = new DialogInterface.OnClickListener() { // from class: xv0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    byte b6 = b4;
                                    String str6 = str5;
                                    yv0 yv0Var2 = yv0Var;
                                    switch (b6) {
                                        case 0:
                                            mw0 mw0Var22 = yv0Var2.a;
                                            if (i != 0) {
                                                if (i != 1) {
                                                    if (i == 2) {
                                                        gm.g(str6);
                                                        qw0 qw0Var = mw0Var22.R;
                                                        if (qw0Var != null) {
                                                            new c41(qw0Var, qw0Var.e).k(false).k(true);
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
                                                        request.setDescription(jb6.M0(2131742591, null));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) mw0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        qw0 qw0Var2 = mw0Var22.R;
                                                        if (qw0Var2 != null) {
                                                            new c41(qw0Var2, qw0Var2.e).Q(R.raw.ic_download, 36, gm.S2(jb6.a0(null, null, 2131742590, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e32) {
                                                        fc4.g(e32, true);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", mw0Var22.getContext().getPackageName());
                                                    mw0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e42) {
                                                    fc4.g(e42, true);
                                                    mw0Var22.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            mw0 mw0Var3 = yv0Var2.a;
                                            if (i != 0) {
                                                if (i != 1) {
                                                    if (i == 2) {
                                                        gm.g(str6);
                                                        qw0 qw0Var3 = mw0Var3.R;
                                                        if (qw0Var3 != null) {
                                                            new c41(qw0Var3, qw0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", mw0Var3.getContext().getPackageName());
                                                        mw0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e52) {
                                                        fc4.g(e52, true);
                                                        mw0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                mw0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            h2.M = charSequenceArr3222;
                            h2.L = onClickListener3222;
                            h2.show();
                            mw0Var2.G = h2;
                        }
                        h2.R = true;
                        h2.P = str4;
                        h2.Q = false;
                        CharSequence[] charSequenceArr32222 = {jb6.M0(2131747527, null), jb6.M0(2131754938, null), jb6.M0(2131751699, null)};
                        DialogInterface.OnClickListener onClickListener32222 = new DialogInterface.OnClickListener() { // from class: xv0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                byte b6 = b4;
                                String str6 = str5;
                                yv0 yv0Var2 = yv0Var;
                                switch (b6) {
                                    case 0:
                                        mw0 mw0Var22 = yv0Var2.a;
                                        if (i != 0) {
                                            if (i != 1) {
                                                if (i == 2) {
                                                    gm.g(str6);
                                                    qw0 qw0Var = mw0Var22.R;
                                                    if (qw0Var != null) {
                                                        new c41(qw0Var, qw0Var.e).k(false).k(true);
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
                                                    request.setDescription(jb6.M0(2131742591, null));
                                                    request.setNotificationVisibility(1);
                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                    DownloadManager downloadManager = (DownloadManager) mw0Var22.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    qw0 qw0Var2 = mw0Var22.R;
                                                    if (qw0Var2 != null) {
                                                        new c41(qw0Var2, qw0Var2.e).Q(R.raw.ic_download, 36, gm.S2(jb6.a0(null, null, 2131742590, guessFileName))).k(true);
                                                        break;
                                                    }
                                                } catch (Exception e32) {
                                                    fc4.g(e32, true);
                                                    return;
                                                }
                                            }
                                        } else {
                                            try {
                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                intent.putExtra("create_new_tab", true);
                                                intent.putExtra("com.android.browser.application_id", mw0Var22.getContext().getPackageName());
                                                mw0Var22.getContext().startActivity(intent);
                                                break;
                                            } catch (Exception e42) {
                                                fc4.g(e42, true);
                                                mw0Var22.loadUrl(str6);
                                                return;
                                            }
                                        }
                                        break;
                                    default:
                                        mw0 mw0Var3 = yv0Var2.a;
                                        if (i != 0) {
                                            if (i != 1) {
                                                if (i == 2) {
                                                    gm.g(str6);
                                                    qw0 qw0Var3 = mw0Var3.R;
                                                    if (qw0Var3 != null) {
                                                        new c41(qw0Var3, qw0Var3.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", mw0Var3.getContext().getPackageName());
                                                    mw0Var3.getContext().startActivity(intent2);
                                                    break;
                                                } catch (Exception e52) {
                                                    fc4.g(e52, true);
                                                    mw0Var3.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                        } else {
                                            mw0Var3.loadUrl(str6);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        h2.M = charSequenceArr32222;
                        h2.L = onClickListener32222;
                        h2.show();
                        mw0Var2.G = h2;
                }
            }
        });
        return true;
    }
}
