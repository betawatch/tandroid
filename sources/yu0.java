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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class yu0 implements View.OnLongClickListener {
    public final /* synthetic */ nv0 a;

    public yu0(nv0 nv0Var) {
        this.a = nv0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.a.getHitTestResult();
        final byte b = 0;
        final byte b2 = 1;
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            hl.c3(new Runnable(this) { // from class: wu0
                public final /* synthetic */ yu0 b;

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
                    final yu0 yu0Var = this.b;
                    final byte b4 = 0;
                    final byte b5 = 1;
                    switch (b3) {
                        case 0:
                            nv0 nv0Var = yu0Var.a;
                            nx0 h = uh9.h(1, null, nv0Var.getContext(), false);
                            try {
                                parse = Uri.parse(str5);
                            } catch (Exception e) {
                                try {
                                    cc4.g(e, false);
                                } catch (Exception e2) {
                                    e = e2;
                                    str = str5;
                                    cc4.g(e, true);
                                    str2 = str;
                                    h.R = true;
                                    h.P = str2;
                                    h.Q = false;
                                    CharSequence[] charSequenceArr = {ob6.M0(2131747519, null), ob6.M0(2131747521, null), ob6.M0(2131751732, null)};
                                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: xu0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i) {
                                            byte b6 = b5;
                                            String str6 = str5;
                                            yu0 yu0Var2 = yu0Var;
                                            switch (b6) {
                                                case 0:
                                                    nv0 nv0Var2 = yu0Var2.a;
                                                    if (i != 0) {
                                                        if (i != 1) {
                                                            if (i == 2) {
                                                                hl.g(str6);
                                                                rv0 rv0Var = nv0Var2.R;
                                                                if (rv0Var != null) {
                                                                    new d31(rv0Var, rv0Var.e).k(false).k(true);
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
                                                                request.setDescription(ob6.M0(2131742559, null));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) nv0Var2.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                rv0 rv0Var2 = nv0Var2.R;
                                                                if (rv0Var2 != null) {
                                                                    new d31(rv0Var2, rv0Var2.e).Q(R.raw.ic_download, 36, hl.S2(ob6.a0(null, null, 2131742558, guessFileName))).k(true);
                                                                    break;
                                                                }
                                                            } catch (Exception e3) {
                                                                cc4.g(e3, true);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", nv0Var2.getContext().getPackageName());
                                                            nv0Var2.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e4) {
                                                            cc4.g(e4, true);
                                                            nv0Var2.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    nv0 nv0Var3 = yu0Var2.a;
                                                    if (i != 0) {
                                                        if (i != 1) {
                                                            if (i == 2) {
                                                                hl.g(str6);
                                                                rv0 rv0Var3 = nv0Var3.R;
                                                                if (rv0Var3 != null) {
                                                                    new d31(rv0Var3, rv0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", nv0Var3.getContext().getPackageName());
                                                                nv0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e5) {
                                                                cc4.g(e5, true);
                                                                nv0Var3.loadUrl(str6);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        nv0Var3.loadUrl(str6);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    h.M = charSequenceArr;
                                    h.L = onClickListener;
                                    h.show();
                                    nv0Var.G = h;
                                    return;
                                }
                            }
                            if (parse != null && !parse.getScheme().equalsIgnoreCase("data")) {
                                str = m01.x(parse, null, null, m01.a(parse.getHost()), null);
                                str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                                h.R = true;
                                h.P = str2;
                                h.Q = false;
                                CharSequence[] charSequenceArr2 = {ob6.M0(2131747519, null), ob6.M0(2131747521, null), ob6.M0(2131751732, null)};
                                DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: xu0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        byte b6 = b5;
                                        String str6 = str5;
                                        yu0 yu0Var2 = yu0Var;
                                        switch (b6) {
                                            case 0:
                                                nv0 nv0Var2 = yu0Var2.a;
                                                if (i != 0) {
                                                    if (i != 1) {
                                                        if (i == 2) {
                                                            hl.g(str6);
                                                            rv0 rv0Var = nv0Var2.R;
                                                            if (rv0Var != null) {
                                                                new d31(rv0Var, rv0Var.e).k(false).k(true);
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
                                                            request.setDescription(ob6.M0(2131742559, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) nv0Var2.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            rv0 rv0Var2 = nv0Var2.R;
                                                            if (rv0Var2 != null) {
                                                                new d31(rv0Var2, rv0Var2.e).Q(R.raw.ic_download, 36, hl.S2(ob6.a0(null, null, 2131742558, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e3) {
                                                            cc4.g(e3, true);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", nv0Var2.getContext().getPackageName());
                                                        nv0Var2.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e4) {
                                                        cc4.g(e4, true);
                                                        nv0Var2.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                nv0 nv0Var3 = yu0Var2.a;
                                                if (i != 0) {
                                                    if (i != 1) {
                                                        if (i == 2) {
                                                            hl.g(str6);
                                                            rv0 rv0Var3 = nv0Var3.R;
                                                            if (rv0Var3 != null) {
                                                                new d31(rv0Var3, rv0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", nv0Var3.getContext().getPackageName());
                                                            nv0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e5) {
                                                            cc4.g(e5, true);
                                                            nv0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    nv0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                h.M = charSequenceArr2;
                                h.L = onClickListener2;
                                h.show();
                                nv0Var.G = h;
                            }
                            str = str5;
                            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                            h.R = true;
                            h.P = str2;
                            h.Q = false;
                            CharSequence[] charSequenceArr22 = {ob6.M0(2131747519, null), ob6.M0(2131747521, null), ob6.M0(2131751732, null)};
                            DialogInterface.OnClickListener onClickListener22 = new DialogInterface.OnClickListener() { // from class: xu0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    byte b6 = b5;
                                    String str6 = str5;
                                    yu0 yu0Var2 = yu0Var;
                                    switch (b6) {
                                        case 0:
                                            nv0 nv0Var2 = yu0Var2.a;
                                            if (i != 0) {
                                                if (i != 1) {
                                                    if (i == 2) {
                                                        hl.g(str6);
                                                        rv0 rv0Var = nv0Var2.R;
                                                        if (rv0Var != null) {
                                                            new d31(rv0Var, rv0Var.e).k(false).k(true);
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
                                                        request.setDescription(ob6.M0(2131742559, null));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) nv0Var2.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        rv0 rv0Var2 = nv0Var2.R;
                                                        if (rv0Var2 != null) {
                                                            new d31(rv0Var2, rv0Var2.e).Q(R.raw.ic_download, 36, hl.S2(ob6.a0(null, null, 2131742558, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e3) {
                                                        cc4.g(e3, true);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", nv0Var2.getContext().getPackageName());
                                                    nv0Var2.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e4) {
                                                    cc4.g(e4, true);
                                                    nv0Var2.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            nv0 nv0Var3 = yu0Var2.a;
                                            if (i != 0) {
                                                if (i != 1) {
                                                    if (i == 2) {
                                                        hl.g(str6);
                                                        rv0 rv0Var3 = nv0Var3.R;
                                                        if (rv0Var3 != null) {
                                                            new d31(rv0Var3, rv0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", nv0Var3.getContext().getPackageName());
                                                        nv0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e5) {
                                                        cc4.g(e5, true);
                                                        nv0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                nv0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            h.M = charSequenceArr22;
                            h.L = onClickListener22;
                            h.show();
                            nv0Var.G = h;
                            break;
                        default:
                            nv0 nv0Var2 = yu0Var.a;
                            nx0 h2 = uh9.h(1, null, nv0Var2.getContext(), false);
                            try {
                                Uri parse2 = Uri.parse(str5);
                                str3 = m01.x(parse2, null, null, m01.a(parse2.getHost()), null);
                            } catch (Exception e3) {
                                try {
                                    cc4.g(e3, false);
                                    str3 = str5;
                                } catch (Exception e4) {
                                    e = e4;
                                    str3 = str5;
                                    cc4.g(e, true);
                                    str4 = str3;
                                    h2.R = true;
                                    h2.P = str4;
                                    h2.Q = false;
                                    CharSequence[] charSequenceArr3 = {ob6.M0(2131747521, null), ob6.M0(2131754934, null), ob6.M0(2131751727, null)};
                                    DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: xu0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i) {
                                            byte b6 = b4;
                                            String str6 = str5;
                                            yu0 yu0Var2 = yu0Var;
                                            switch (b6) {
                                                case 0:
                                                    nv0 nv0Var22 = yu0Var2.a;
                                                    if (i != 0) {
                                                        if (i != 1) {
                                                            if (i == 2) {
                                                                hl.g(str6);
                                                                rv0 rv0Var = nv0Var22.R;
                                                                if (rv0Var != null) {
                                                                    new d31(rv0Var, rv0Var.e).k(false).k(true);
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
                                                                request.setDescription(ob6.M0(2131742559, null));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) nv0Var22.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                rv0 rv0Var2 = nv0Var22.R;
                                                                if (rv0Var2 != null) {
                                                                    new d31(rv0Var2, rv0Var2.e).Q(R.raw.ic_download, 36, hl.S2(ob6.a0(null, null, 2131742558, guessFileName))).k(true);
                                                                    break;
                                                                }
                                                            } catch (Exception e32) {
                                                                cc4.g(e32, true);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", nv0Var22.getContext().getPackageName());
                                                            nv0Var22.getContext().startActivity(intent);
                                                            break;
                                                        } catch (Exception e42) {
                                                            cc4.g(e42, true);
                                                            nv0Var22.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    nv0 nv0Var3 = yu0Var2.a;
                                                    if (i != 0) {
                                                        if (i != 1) {
                                                            if (i == 2) {
                                                                hl.g(str6);
                                                                rv0 rv0Var3 = nv0Var3.R;
                                                                if (rv0Var3 != null) {
                                                                    new d31(rv0Var3, rv0Var3.e).k(false).k(true);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", nv0Var3.getContext().getPackageName());
                                                                nv0Var3.getContext().startActivity(intent2);
                                                                break;
                                                            } catch (Exception e5) {
                                                                cc4.g(e5, true);
                                                                nv0Var3.loadUrl(str6);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        nv0Var3.loadUrl(str6);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    h2.M = charSequenceArr3;
                                    h2.L = onClickListener3;
                                    h2.show();
                                    nv0Var2.G = h2;
                                }
                            }
                            try {
                                str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e5) {
                                e = e5;
                                cc4.g(e, true);
                                str4 = str3;
                                h2.R = true;
                                h2.P = str4;
                                h2.Q = false;
                                CharSequence[] charSequenceArr32 = {ob6.M0(2131747521, null), ob6.M0(2131754934, null), ob6.M0(2131751727, null)};
                                DialogInterface.OnClickListener onClickListener32 = new DialogInterface.OnClickListener() { // from class: xu0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        byte b6 = b4;
                                        String str6 = str5;
                                        yu0 yu0Var2 = yu0Var;
                                        switch (b6) {
                                            case 0:
                                                nv0 nv0Var22 = yu0Var2.a;
                                                if (i != 0) {
                                                    if (i != 1) {
                                                        if (i == 2) {
                                                            hl.g(str6);
                                                            rv0 rv0Var = nv0Var22.R;
                                                            if (rv0Var != null) {
                                                                new d31(rv0Var, rv0Var.e).k(false).k(true);
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
                                                            request.setDescription(ob6.M0(2131742559, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) nv0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            rv0 rv0Var2 = nv0Var22.R;
                                                            if (rv0Var2 != null) {
                                                                new d31(rv0Var2, rv0Var2.e).Q(R.raw.ic_download, 36, hl.S2(ob6.a0(null, null, 2131742558, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e32) {
                                                            cc4.g(e32, true);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", nv0Var22.getContext().getPackageName());
                                                        nv0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e42) {
                                                        cc4.g(e42, true);
                                                        nv0Var22.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                nv0 nv0Var3 = yu0Var2.a;
                                                if (i != 0) {
                                                    if (i != 1) {
                                                        if (i == 2) {
                                                            hl.g(str6);
                                                            rv0 rv0Var3 = nv0Var3.R;
                                                            if (rv0Var3 != null) {
                                                                new d31(rv0Var3, rv0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", nv0Var3.getContext().getPackageName());
                                                            nv0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e52) {
                                                            cc4.g(e52, true);
                                                            nv0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    nv0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                h2.M = charSequenceArr32;
                                h2.L = onClickListener32;
                                h2.show();
                                nv0Var2.G = h2;
                            }
                            h2.R = true;
                            h2.P = str4;
                            h2.Q = false;
                            CharSequence[] charSequenceArr322 = {ob6.M0(2131747521, null), ob6.M0(2131754934, null), ob6.M0(2131751727, null)};
                            DialogInterface.OnClickListener onClickListener322 = new DialogInterface.OnClickListener() { // from class: xu0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    byte b6 = b4;
                                    String str6 = str5;
                                    yu0 yu0Var2 = yu0Var;
                                    switch (b6) {
                                        case 0:
                                            nv0 nv0Var22 = yu0Var2.a;
                                            if (i != 0) {
                                                if (i != 1) {
                                                    if (i == 2) {
                                                        hl.g(str6);
                                                        rv0 rv0Var = nv0Var22.R;
                                                        if (rv0Var != null) {
                                                            new d31(rv0Var, rv0Var.e).k(false).k(true);
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
                                                        request.setDescription(ob6.M0(2131742559, null));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) nv0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        rv0 rv0Var2 = nv0Var22.R;
                                                        if (rv0Var2 != null) {
                                                            new d31(rv0Var2, rv0Var2.e).Q(R.raw.ic_download, 36, hl.S2(ob6.a0(null, null, 2131742558, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e32) {
                                                        cc4.g(e32, true);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", nv0Var22.getContext().getPackageName());
                                                    nv0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e42) {
                                                    cc4.g(e42, true);
                                                    nv0Var22.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            nv0 nv0Var3 = yu0Var2.a;
                                            if (i != 0) {
                                                if (i != 1) {
                                                    if (i == 2) {
                                                        hl.g(str6);
                                                        rv0 rv0Var3 = nv0Var3.R;
                                                        if (rv0Var3 != null) {
                                                            new d31(rv0Var3, rv0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", nv0Var3.getContext().getPackageName());
                                                        nv0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e52) {
                                                        cc4.g(e52, true);
                                                        nv0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                nv0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            h2.M = charSequenceArr322;
                            h2.L = onClickListener322;
                            h2.show();
                            nv0Var2.G = h2;
                    }
                }
            });
            return true;
        }
        if (hitTestResult.getType() != 5) {
            return false;
        }
        final String extra2 = hitTestResult.getExtra();
        hl.c3(new Runnable(this) { // from class: wu0
            public final /* synthetic */ yu0 b;

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
                final yu0 yu0Var = this.b;
                final byte b4 = 0;
                final byte b5 = 1;
                switch (b3) {
                    case 0:
                        nv0 nv0Var = yu0Var.a;
                        nx0 h = uh9.h(1, null, nv0Var.getContext(), false);
                        try {
                            parse = Uri.parse(str5);
                        } catch (Exception e) {
                            try {
                                cc4.g(e, false);
                            } catch (Exception e2) {
                                e = e2;
                                str = str5;
                                cc4.g(e, true);
                                str2 = str;
                                h.R = true;
                                h.P = str2;
                                h.Q = false;
                                CharSequence[] charSequenceArr22 = {ob6.M0(2131747519, null), ob6.M0(2131747521, null), ob6.M0(2131751732, null)};
                                DialogInterface.OnClickListener onClickListener22 = new DialogInterface.OnClickListener() { // from class: xu0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        byte b6 = b5;
                                        String str6 = str5;
                                        yu0 yu0Var2 = yu0Var;
                                        switch (b6) {
                                            case 0:
                                                nv0 nv0Var22 = yu0Var2.a;
                                                if (i != 0) {
                                                    if (i != 1) {
                                                        if (i == 2) {
                                                            hl.g(str6);
                                                            rv0 rv0Var = nv0Var22.R;
                                                            if (rv0Var != null) {
                                                                new d31(rv0Var, rv0Var.e).k(false).k(true);
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
                                                            request.setDescription(ob6.M0(2131742559, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) nv0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            rv0 rv0Var2 = nv0Var22.R;
                                                            if (rv0Var2 != null) {
                                                                new d31(rv0Var2, rv0Var2.e).Q(R.raw.ic_download, 36, hl.S2(ob6.a0(null, null, 2131742558, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e32) {
                                                            cc4.g(e32, true);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", nv0Var22.getContext().getPackageName());
                                                        nv0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e42) {
                                                        cc4.g(e42, true);
                                                        nv0Var22.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                nv0 nv0Var3 = yu0Var2.a;
                                                if (i != 0) {
                                                    if (i != 1) {
                                                        if (i == 2) {
                                                            hl.g(str6);
                                                            rv0 rv0Var3 = nv0Var3.R;
                                                            if (rv0Var3 != null) {
                                                                new d31(rv0Var3, rv0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", nv0Var3.getContext().getPackageName());
                                                            nv0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e52) {
                                                            cc4.g(e52, true);
                                                            nv0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    nv0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                h.M = charSequenceArr22;
                                h.L = onClickListener22;
                                h.show();
                                nv0Var.G = h;
                                return;
                            }
                        }
                        if (parse != null && !parse.getScheme().equalsIgnoreCase("data")) {
                            str = m01.x(parse, null, null, m01.a(parse.getHost()), null);
                            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                            h.R = true;
                            h.P = str2;
                            h.Q = false;
                            CharSequence[] charSequenceArr222 = {ob6.M0(2131747519, null), ob6.M0(2131747521, null), ob6.M0(2131751732, null)};
                            DialogInterface.OnClickListener onClickListener222 = new DialogInterface.OnClickListener() { // from class: xu0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    byte b6 = b5;
                                    String str6 = str5;
                                    yu0 yu0Var2 = yu0Var;
                                    switch (b6) {
                                        case 0:
                                            nv0 nv0Var22 = yu0Var2.a;
                                            if (i != 0) {
                                                if (i != 1) {
                                                    if (i == 2) {
                                                        hl.g(str6);
                                                        rv0 rv0Var = nv0Var22.R;
                                                        if (rv0Var != null) {
                                                            new d31(rv0Var, rv0Var.e).k(false).k(true);
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
                                                        request.setDescription(ob6.M0(2131742559, null));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) nv0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        rv0 rv0Var2 = nv0Var22.R;
                                                        if (rv0Var2 != null) {
                                                            new d31(rv0Var2, rv0Var2.e).Q(R.raw.ic_download, 36, hl.S2(ob6.a0(null, null, 2131742558, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e32) {
                                                        cc4.g(e32, true);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", nv0Var22.getContext().getPackageName());
                                                    nv0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e42) {
                                                    cc4.g(e42, true);
                                                    nv0Var22.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            nv0 nv0Var3 = yu0Var2.a;
                                            if (i != 0) {
                                                if (i != 1) {
                                                    if (i == 2) {
                                                        hl.g(str6);
                                                        rv0 rv0Var3 = nv0Var3.R;
                                                        if (rv0Var3 != null) {
                                                            new d31(rv0Var3, rv0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", nv0Var3.getContext().getPackageName());
                                                        nv0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e52) {
                                                        cc4.g(e52, true);
                                                        nv0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                nv0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            h.M = charSequenceArr222;
                            h.L = onClickListener222;
                            h.show();
                            nv0Var.G = h;
                        }
                        str = str5;
                        str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                        h.R = true;
                        h.P = str2;
                        h.Q = false;
                        CharSequence[] charSequenceArr2222 = {ob6.M0(2131747519, null), ob6.M0(2131747521, null), ob6.M0(2131751732, null)};
                        DialogInterface.OnClickListener onClickListener2222 = new DialogInterface.OnClickListener() { // from class: xu0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                byte b6 = b5;
                                String str6 = str5;
                                yu0 yu0Var2 = yu0Var;
                                switch (b6) {
                                    case 0:
                                        nv0 nv0Var22 = yu0Var2.a;
                                        if (i != 0) {
                                            if (i != 1) {
                                                if (i == 2) {
                                                    hl.g(str6);
                                                    rv0 rv0Var = nv0Var22.R;
                                                    if (rv0Var != null) {
                                                        new d31(rv0Var, rv0Var.e).k(false).k(true);
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
                                                    request.setDescription(ob6.M0(2131742559, null));
                                                    request.setNotificationVisibility(1);
                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                    DownloadManager downloadManager = (DownloadManager) nv0Var22.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    rv0 rv0Var2 = nv0Var22.R;
                                                    if (rv0Var2 != null) {
                                                        new d31(rv0Var2, rv0Var2.e).Q(R.raw.ic_download, 36, hl.S2(ob6.a0(null, null, 2131742558, guessFileName))).k(true);
                                                        break;
                                                    }
                                                } catch (Exception e32) {
                                                    cc4.g(e32, true);
                                                    return;
                                                }
                                            }
                                        } else {
                                            try {
                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                intent.putExtra("create_new_tab", true);
                                                intent.putExtra("com.android.browser.application_id", nv0Var22.getContext().getPackageName());
                                                nv0Var22.getContext().startActivity(intent);
                                                break;
                                            } catch (Exception e42) {
                                                cc4.g(e42, true);
                                                nv0Var22.loadUrl(str6);
                                                return;
                                            }
                                        }
                                        break;
                                    default:
                                        nv0 nv0Var3 = yu0Var2.a;
                                        if (i != 0) {
                                            if (i != 1) {
                                                if (i == 2) {
                                                    hl.g(str6);
                                                    rv0 rv0Var3 = nv0Var3.R;
                                                    if (rv0Var3 != null) {
                                                        new d31(rv0Var3, rv0Var3.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", nv0Var3.getContext().getPackageName());
                                                    nv0Var3.getContext().startActivity(intent2);
                                                    break;
                                                } catch (Exception e52) {
                                                    cc4.g(e52, true);
                                                    nv0Var3.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                        } else {
                                            nv0Var3.loadUrl(str6);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        h.M = charSequenceArr2222;
                        h.L = onClickListener2222;
                        h.show();
                        nv0Var.G = h;
                        break;
                    default:
                        nv0 nv0Var2 = yu0Var.a;
                        nx0 h2 = uh9.h(1, null, nv0Var2.getContext(), false);
                        try {
                            Uri parse2 = Uri.parse(str5);
                            str3 = m01.x(parse2, null, null, m01.a(parse2.getHost()), null);
                        } catch (Exception e3) {
                            try {
                                cc4.g(e3, false);
                                str3 = str5;
                            } catch (Exception e4) {
                                e = e4;
                                str3 = str5;
                                cc4.g(e, true);
                                str4 = str3;
                                h2.R = true;
                                h2.P = str4;
                                h2.Q = false;
                                CharSequence[] charSequenceArr322 = {ob6.M0(2131747521, null), ob6.M0(2131754934, null), ob6.M0(2131751727, null)};
                                DialogInterface.OnClickListener onClickListener322 = new DialogInterface.OnClickListener() { // from class: xu0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        byte b6 = b4;
                                        String str6 = str5;
                                        yu0 yu0Var2 = yu0Var;
                                        switch (b6) {
                                            case 0:
                                                nv0 nv0Var22 = yu0Var2.a;
                                                if (i != 0) {
                                                    if (i != 1) {
                                                        if (i == 2) {
                                                            hl.g(str6);
                                                            rv0 rv0Var = nv0Var22.R;
                                                            if (rv0Var != null) {
                                                                new d31(rv0Var, rv0Var.e).k(false).k(true);
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
                                                            request.setDescription(ob6.M0(2131742559, null));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) nv0Var22.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            rv0 rv0Var2 = nv0Var22.R;
                                                            if (rv0Var2 != null) {
                                                                new d31(rv0Var2, rv0Var2.e).Q(R.raw.ic_download, 36, hl.S2(ob6.a0(null, null, 2131742558, guessFileName))).k(true);
                                                                break;
                                                            }
                                                        } catch (Exception e32) {
                                                            cc4.g(e32, true);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", nv0Var22.getContext().getPackageName());
                                                        nv0Var22.getContext().startActivity(intent);
                                                        break;
                                                    } catch (Exception e42) {
                                                        cc4.g(e42, true);
                                                        nv0Var22.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                                break;
                                            default:
                                                nv0 nv0Var3 = yu0Var2.a;
                                                if (i != 0) {
                                                    if (i != 1) {
                                                        if (i == 2) {
                                                            hl.g(str6);
                                                            rv0 rv0Var3 = nv0Var3.R;
                                                            if (rv0Var3 != null) {
                                                                new d31(rv0Var3, rv0Var3.e).k(false).k(true);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", nv0Var3.getContext().getPackageName());
                                                            nv0Var3.getContext().startActivity(intent2);
                                                            break;
                                                        } catch (Exception e52) {
                                                            cc4.g(e52, true);
                                                            nv0Var3.loadUrl(str6);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    nv0Var3.loadUrl(str6);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                h2.M = charSequenceArr322;
                                h2.L = onClickListener322;
                                h2.show();
                                nv0Var2.G = h2;
                            }
                        }
                        try {
                            str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                        } catch (Exception e5) {
                            e = e5;
                            cc4.g(e, true);
                            str4 = str3;
                            h2.R = true;
                            h2.P = str4;
                            h2.Q = false;
                            CharSequence[] charSequenceArr3222 = {ob6.M0(2131747521, null), ob6.M0(2131754934, null), ob6.M0(2131751727, null)};
                            DialogInterface.OnClickListener onClickListener3222 = new DialogInterface.OnClickListener() { // from class: xu0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    byte b6 = b4;
                                    String str6 = str5;
                                    yu0 yu0Var2 = yu0Var;
                                    switch (b6) {
                                        case 0:
                                            nv0 nv0Var22 = yu0Var2.a;
                                            if (i != 0) {
                                                if (i != 1) {
                                                    if (i == 2) {
                                                        hl.g(str6);
                                                        rv0 rv0Var = nv0Var22.R;
                                                        if (rv0Var != null) {
                                                            new d31(rv0Var, rv0Var.e).k(false).k(true);
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
                                                        request.setDescription(ob6.M0(2131742559, null));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) nv0Var22.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        rv0 rv0Var2 = nv0Var22.R;
                                                        if (rv0Var2 != null) {
                                                            new d31(rv0Var2, rv0Var2.e).Q(R.raw.ic_download, 36, hl.S2(ob6.a0(null, null, 2131742558, guessFileName))).k(true);
                                                            break;
                                                        }
                                                    } catch (Exception e32) {
                                                        cc4.g(e32, true);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent.putExtra("create_new_tab", true);
                                                    intent.putExtra("com.android.browser.application_id", nv0Var22.getContext().getPackageName());
                                                    nv0Var22.getContext().startActivity(intent);
                                                    break;
                                                } catch (Exception e42) {
                                                    cc4.g(e42, true);
                                                    nv0Var22.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            nv0 nv0Var3 = yu0Var2.a;
                                            if (i != 0) {
                                                if (i != 1) {
                                                    if (i == 2) {
                                                        hl.g(str6);
                                                        rv0 rv0Var3 = nv0Var3.R;
                                                        if (rv0Var3 != null) {
                                                            new d31(rv0Var3, rv0Var3.e).k(false).k(true);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", nv0Var3.getContext().getPackageName());
                                                        nv0Var3.getContext().startActivity(intent2);
                                                        break;
                                                    } catch (Exception e52) {
                                                        cc4.g(e52, true);
                                                        nv0Var3.loadUrl(str6);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                nv0Var3.loadUrl(str6);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            h2.M = charSequenceArr3222;
                            h2.L = onClickListener3222;
                            h2.show();
                            nv0Var2.G = h2;
                        }
                        h2.R = true;
                        h2.P = str4;
                        h2.Q = false;
                        CharSequence[] charSequenceArr32222 = {ob6.M0(2131747521, null), ob6.M0(2131754934, null), ob6.M0(2131751727, null)};
                        DialogInterface.OnClickListener onClickListener32222 = new DialogInterface.OnClickListener() { // from class: xu0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                byte b6 = b4;
                                String str6 = str5;
                                yu0 yu0Var2 = yu0Var;
                                switch (b6) {
                                    case 0:
                                        nv0 nv0Var22 = yu0Var2.a;
                                        if (i != 0) {
                                            if (i != 1) {
                                                if (i == 2) {
                                                    hl.g(str6);
                                                    rv0 rv0Var = nv0Var22.R;
                                                    if (rv0Var != null) {
                                                        new d31(rv0Var, rv0Var.e).k(false).k(true);
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
                                                    request.setDescription(ob6.M0(2131742559, null));
                                                    request.setNotificationVisibility(1);
                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                                                    DownloadManager downloadManager = (DownloadManager) nv0Var22.getContext().getSystemService("download");
                                                    if (downloadManager != null) {
                                                        downloadManager.enqueue(request);
                                                    }
                                                    rv0 rv0Var2 = nv0Var22.R;
                                                    if (rv0Var2 != null) {
                                                        new d31(rv0Var2, rv0Var2.e).Q(R.raw.ic_download, 36, hl.S2(ob6.a0(null, null, 2131742558, guessFileName))).k(true);
                                                        break;
                                                    }
                                                } catch (Exception e32) {
                                                    cc4.g(e32, true);
                                                    return;
                                                }
                                            }
                                        } else {
                                            try {
                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                intent.putExtra("create_new_tab", true);
                                                intent.putExtra("com.android.browser.application_id", nv0Var22.getContext().getPackageName());
                                                nv0Var22.getContext().startActivity(intent);
                                                break;
                                            } catch (Exception e42) {
                                                cc4.g(e42, true);
                                                nv0Var22.loadUrl(str6);
                                                return;
                                            }
                                        }
                                        break;
                                    default:
                                        nv0 nv0Var3 = yu0Var2.a;
                                        if (i != 0) {
                                            if (i != 1) {
                                                if (i == 2) {
                                                    hl.g(str6);
                                                    rv0 rv0Var3 = nv0Var3.R;
                                                    if (rv0Var3 != null) {
                                                        new d31(rv0Var3, rv0Var3.e).k(false).k(true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                                                    intent2.putExtra("create_new_tab", true);
                                                    intent2.putExtra("com.android.browser.application_id", nv0Var3.getContext().getPackageName());
                                                    nv0Var3.getContext().startActivity(intent2);
                                                    break;
                                                } catch (Exception e52) {
                                                    cc4.g(e52, true);
                                                    nv0Var3.loadUrl(str6);
                                                    return;
                                                }
                                            }
                                        } else {
                                            nv0Var3.loadUrl(str6);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        h2.M = charSequenceArr32222;
                        h2.L = onClickListener32222;
                        h2.show();
                        nv0Var2.G = h2;
                }
            }
        });
        return true;
    }
}
