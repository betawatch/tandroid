// default package

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class tw2 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ vw2 b;

    public tw2(vw2 vw2Var, boolean z) {
        this.b = vw2Var;
        this.a = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00fa  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        File file;
        File file2;
        String str;
        String r;
        File I;
        TLRPC.Document document;
        vw2 vw2Var = this.b;
        int i = vw2Var.d;
        byte b = vw2Var.Q;
        String str2 = null;
        if (b == 5 || b == 3) {
            TLRPC.Document document2 = vw2Var.M;
            if (document2 != null) {
                str2 = xb4.r(null, document2);
                xb4.G(i);
                file = xb4.I(vw2Var.M);
            } else {
                if (vw2Var.K.content instanceof TLRPC.TL_webDocument) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Utilities.a(vw2Var.K.content.url));
                    sb.append(".");
                    sb.append(in5.x(vw2Var.K.content.url, vw2Var.Q == 5 ? "mp3" : "ogg"));
                    str2 = sb.toString();
                    file = new File(xb4.z(4), str2);
                }
                str = null;
                file2 = null;
            }
            file2 = file;
            str = str2;
        } else {
            if (vw2Var.R) {
                TLRPC.BotInlineResult botInlineResult = vw2Var.K;
                if (botInlineResult != null) {
                    TLRPC.Document document3 = botInlineResult.document;
                    if (document3 instanceof TLRPC.TL_document) {
                        r = xb4.r(null, document3);
                        xb4.G(i);
                        I = xb4.I(vw2Var.K.document);
                    } else {
                        TLRPC.Photo photo = botInlineResult.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            TLRPC.PhotoSize w = xb4.w(photo.sizes, hl.Y0(false), true, null, false);
                            vw2Var.P = w;
                            r = xb4.r(null, w);
                            xb4.G(i);
                            I = xb4.I(vw2Var.P);
                        } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(Utilities.a(vw2Var.K.content.url));
                            sb2.append(".");
                            TLRPC.WebDocument webDocument = vw2Var.K.content;
                            sb2.append(in5.x(webDocument.url, xb4.H(webDocument.mime_type)));
                            r = sb2.toString();
                            I = new File(xb4.z(4), r);
                            if (vw2Var.Q == 2) {
                                TLRPC.WebDocument webDocument2 = vw2Var.K.thumb;
                                if ((webDocument2 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument2.mime_type)) {
                                    r = null;
                                }
                            }
                        } else {
                            if (botInlineResult.thumb instanceof TLRPC.TL_webDocument) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(Utilities.a(vw2Var.K.thumb.url));
                                sb3.append(".");
                                TLRPC.WebDocument webDocument3 = vw2Var.K.thumb;
                                sb3.append(in5.x(webDocument3.url, xb4.H(webDocument3.mime_type)));
                                r = sb3.toString();
                                I = new File(xb4.z(4), r);
                            }
                            I = null;
                            r = null;
                        }
                    }
                    document = vw2Var.M;
                    if (document == null && vw2Var.Q == 2 && r47.J0(document) != null) {
                        file2 = I;
                        str = str2;
                    } else {
                        file2 = I;
                        str = r;
                    }
                } else {
                    TLRPC.Document document4 = vw2Var.M;
                    if (document4 != null) {
                        r = xb4.r(null, document4);
                        xb4.G(i);
                        I = xb4.I(vw2Var.M);
                        document = vw2Var.M;
                        if (document == null) {
                        }
                        file2 = I;
                        str = r;
                    }
                    I = null;
                    r = null;
                    document = vw2Var.M;
                    if (document == null) {
                    }
                    file2 = I;
                    str = r;
                }
            }
            str = null;
            file2 = null;
        }
        hl.c3(new ba1(this, str, file2, !TextUtils.isEmpty(str) && file2.exists(), this.a));
    }
}
