// default package

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zv2 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ bw2 b;

    public zv2(bw2 bw2Var, boolean z) {
        this.b = bw2Var;
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
        bw2 bw2Var = this.b;
        int i = bw2Var.d;
        byte b = bw2Var.Q;
        String str2 = null;
        if (b == 5 || b == 3) {
            TLRPC.Document document2 = bw2Var.M;
            if (document2 != null) {
                str2 = ba4.r(null, document2);
                ba4.G(i);
                file = ba4.I(bw2Var.M);
            } else {
                if (bw2Var.K.content instanceof TLRPC.TL_webDocument) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Utilities.a(bw2Var.K.content.url));
                    sb.append(".");
                    sb.append(fl5.x(bw2Var.K.content.url, bw2Var.Q == 5 ? "mp3" : "ogg"));
                    str2 = sb.toString();
                    file = new File(ba4.z(4), str2);
                }
                str = null;
                file2 = null;
            }
            file2 = file;
            str = str2;
        } else {
            if (bw2Var.R) {
                TLRPC.BotInlineResult botInlineResult = bw2Var.K;
                if (botInlineResult != null) {
                    TLRPC.Document document3 = botInlineResult.document;
                    if (document3 instanceof TLRPC.TL_document) {
                        r = ba4.r(null, document3);
                        ba4.G(i);
                        I = ba4.I(bw2Var.K.document);
                    } else {
                        TLRPC.Photo photo = botInlineResult.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            TLRPC.PhotoSize w = ba4.w(photo.sizes, gl.Y0(false), true, null, false);
                            bw2Var.P = w;
                            r = ba4.r(null, w);
                            ba4.G(i);
                            I = ba4.I(bw2Var.P);
                        } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(Utilities.a(bw2Var.K.content.url));
                            sb2.append(".");
                            TLRPC.WebDocument webDocument = bw2Var.K.content;
                            sb2.append(fl5.x(webDocument.url, ba4.H(webDocument.mime_type)));
                            r = sb2.toString();
                            I = new File(ba4.z(4), r);
                            if (bw2Var.Q == 2) {
                                TLRPC.WebDocument webDocument2 = bw2Var.K.thumb;
                                if ((webDocument2 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument2.mime_type)) {
                                    r = null;
                                }
                            }
                        } else {
                            if (botInlineResult.thumb instanceof TLRPC.TL_webDocument) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(Utilities.a(bw2Var.K.thumb.url));
                                sb3.append(".");
                                TLRPC.WebDocument webDocument3 = bw2Var.K.thumb;
                                sb3.append(fl5.x(webDocument3.url, ba4.H(webDocument3.mime_type)));
                                r = sb3.toString();
                                I = new File(ba4.z(4), r);
                            }
                            I = null;
                            r = null;
                        }
                    }
                    document = bw2Var.M;
                    if (document == null && bw2Var.Q == 2 && k27.J0(document) != null) {
                        file2 = I;
                        str = str2;
                    } else {
                        file2 = I;
                        str = r;
                    }
                } else {
                    TLRPC.Document document4 = bw2Var.M;
                    if (document4 != null) {
                        r = ba4.r(null, document4);
                        ba4.G(i);
                        I = ba4.I(bw2Var.M);
                        document = bw2Var.M;
                        if (document == null) {
                        }
                        file2 = I;
                        str = r;
                    }
                    I = null;
                    r = null;
                    document = bw2Var.M;
                    if (document == null) {
                    }
                    file2 = I;
                    str = r;
                }
            }
            str = null;
            file2 = null;
        }
        gl.c3(new s91(this, str, file2, !TextUtils.isEmpty(str) && file2.exists(), this.a));
    }
}
