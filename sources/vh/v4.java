package vh;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class v4 implements NotificationCenter.NotificationCenterDelegate {
    public volatile String B;
    public String C;
    public TLRPC.InputFile D;
    public boolean E;
    public final int a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int h;
    public final int n;
    public final TLRPC.Document r;
    public final u4 s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    public v4(int i10, String str, boolean z4, int i11, int i12, int i13, f3 f3Var) {
        this.a = i10;
        this.b = str;
        this.c = z4;
        this.d = false;
        this.e = false;
        this.f = i11;
        this.h = i12;
        this.n = i13;
        this.r = null;
        this.s = f3Var;
    }

    public final void a(String str) {
        if (this.w || this.x) {
            return;
        }
        this.B = str;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.a);
        notificationCenter.addObserver(this, NotificationCenter.fileUploaded);
        notificationCenter.addObserver(this, NotificationCenter.fileUploadFailed);
        notificationCenter.addObserver(this, NotificationCenter.fileUploadProgressChanged);
        FileLoader.getInstance(this.a).uploadFile(this.B, false, (this.c || this.d || this.e) ? false : true, this.c ? 33554432 : this.d ? ConnectionsManager.FileTypeAudio : this.e ? 67108864 : 16777216);
    }

    public final void b() {
        if (this.x || this.w) {
            return;
        }
        this.w = true;
        try {
            if (this.B != null) {
                FileLoader.getInstance(this.a).cancelFileUpload(this.B, false);
            }
        } catch (Throwable unused) {
        }
        if (this.y != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.y, true);
            this.y = 0;
        }
        e();
    }

    public final void c(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2) {
        String str;
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        if (this.c) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = "video/mp4";
            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
            tL_documentAttributeVideo.supports_streaming = true;
            tL_documentAttributeVideo.duration = this.n;
            tL_documentAttributeVideo.w = this.f;
            tL_documentAttributeVideo.h = this.h;
            tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        } else {
            boolean z4 = this.d;
            boolean z10 = this.e;
            if (z4 || z10) {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument2.file = inputFile;
                TLRPC.Document document = this.r;
                if (z10) {
                    str = "application/octet-stream";
                } else if (document == null || (str = document.mime_type) == null) {
                    str = "audio/mpeg";
                }
                tL_inputMediaUploadedDocument2.mime_type = str;
                if (document != null) {
                    if (z10) {
                        ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i10);
                            i10++;
                            TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeFilename) {
                                tL_inputMediaUploadedDocument2.attributes.add(documentAttribute2);
                            }
                        }
                    } else {
                        tL_inputMediaUploadedDocument2.attributes.addAll(document.attributes);
                    }
                }
                if (z10) {
                    tL_inputMediaUploadedDocument2.force_file = true;
                    if (inputFile2 != null) {
                        tL_inputMediaUploadedDocument2.thumb = inputFile2;
                        tL_inputMediaUploadedDocument2.flags |= 4;
                    }
                }
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument2;
            } else {
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = inputFile;
                tL_messages_uploadMedia.media = tL_inputMediaUploadedPhoto;
            }
        }
        this.y = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_uploadMedia, new ff.a(this, 29));
    }

    public final void d() {
        int i10;
        int i11;
        if (this.v || this.w || this.x) {
            return;
        }
        this.v = true;
        if (this.c) {
            u4 u4Var = this.s;
            int i12 = this.f;
            if (i12 > 0 && (i11 = this.h) > 0) {
                u4Var.a(i12, i11);
            }
            a(this.b);
            return;
        }
        if (this.e) {
            Utilities.globalQueue.postRunnable(new t4(this, 0));
            return;
        }
        if (this.d) {
            a(this.b);
            return;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(this.b, options);
            int i13 = options.outWidth;
            if (i13 > 0 && (i10 = options.outHeight) > 0) {
                this.s.a(i13, i10);
            }
        } catch (Exception unused) {
        }
        Utilities.globalQueue.postRunnable(new t4(this, 1));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.InputFile inputFile;
        if (i11 != this.a || this.w || this.x) {
            return;
        }
        String str = (String) objArr[0];
        if (this.B == null || !this.B.equals(str)) {
            return;
        }
        if (i10 == NotificationCenter.fileUploaded) {
            TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
            if (this.e && !this.E && !TextUtils.isEmpty(this.C)) {
                this.D = inputFile2;
                this.E = true;
                this.B = this.C;
                FileLoader.getInstance(this.a).uploadFile(this.B, false, true, 16777216);
                return;
            }
            if (this.e && this.E) {
                c(this.D, inputFile2);
                return;
            } else {
                c(inputFile2, null);
                return;
            }
        }
        if (i10 == NotificationCenter.fileUploadFailed) {
            if (this.e && this.E && (inputFile = this.D) != null) {
                c(inputFile, null);
                return;
            }
            this.x = true;
            e();
            this.s.onError();
            return;
        }
        if (i10 == NotificationCenter.fileUploadProgressChanged) {
            long longValue = ((Long) objArr[1]).longValue();
            long longValue2 = ((Long) objArr[2]).longValue();
            u4 u4Var = this.s;
            if (this.E) {
                return;
            }
            u4Var.f(longValue2 > 0 ? longValue / longValue2 : 0.0f);
        }
    }

    public final void e() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.a);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploaded);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadFailed);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadProgressChanged);
    }

    public v4(int i10, String str, TLRPC.Document document, d3 d3Var) {
        this.a = i10;
        this.b = str;
        this.c = false;
        this.d = true;
        this.e = false;
        this.f = 0;
        this.h = 0;
        this.n = 0;
        this.r = document;
        this.s = d3Var;
    }

    public v4(int i10, String str, TLRPC.Document document, c3 c3Var) {
        this.a = i10;
        this.b = str;
        this.c = false;
        this.d = false;
        this.e = true;
        this.f = 0;
        this.h = 0;
        this.n = 0;
        this.r = document;
        this.s = c3Var;
    }
}
