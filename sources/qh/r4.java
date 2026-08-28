package qh;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class r4 implements NotificationCenter.NotificationCenterDelegate {
    public volatile String A;
    public String B;
    public TLRPC.InputFile C;
    public boolean D;
    public final int a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int h;
    public final int n;
    public final TLRPC.Document r;
    public final q4 s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    public r4(int i9, String str, boolean z10, int i10, int i11, int i12, b3 b3Var) {
        this.a = i9;
        this.b = str;
        this.c = z10;
        this.d = false;
        this.e = false;
        this.f = i10;
        this.h = i11;
        this.n = i12;
        this.r = null;
        this.s = b3Var;
    }

    public final void a(String str) {
        if (this.w || this.x) {
            return;
        }
        this.A = str;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.a);
        notificationCenter.addObserver(this, NotificationCenter.fileUploaded);
        notificationCenter.addObserver(this, NotificationCenter.fileUploadFailed);
        notificationCenter.addObserver(this, NotificationCenter.fileUploadProgressChanged);
        FileLoader.getInstance(this.a).uploadFile(this.A, false, (this.c || this.d || this.e) ? false : true, this.c ? 33554432 : this.d ? ConnectionsManager.FileTypeAudio : this.e ? 67108864 : 16777216);
    }

    public final void b() {
        if (this.x || this.w) {
            return;
        }
        this.w = true;
        try {
            if (this.A != null) {
                FileLoader.getInstance(this.a).cancelFileUpload(this.A, false);
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
            boolean z10 = this.d;
            boolean z11 = this.e;
            if (z10 || z11) {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument2.file = inputFile;
                TLRPC.Document document = this.r;
                if (z11) {
                    str = "application/octet-stream";
                } else if (document == null || (str = document.mime_type) == null) {
                    str = "audio/mpeg";
                }
                tL_inputMediaUploadedDocument2.mime_type = str;
                if (document != null) {
                    if (z11) {
                        ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                        int size = arrayList.size();
                        int i9 = 0;
                        while (i9 < size) {
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i9);
                            i9++;
                            TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeFilename) {
                                tL_inputMediaUploadedDocument2.attributes.add(documentAttribute2);
                            }
                        }
                    } else {
                        tL_inputMediaUploadedDocument2.attributes.addAll(document.attributes);
                    }
                }
                if (z11) {
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
        this.y = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_uploadMedia, new bf.a(this, 29));
    }

    public final void d() {
        int i9;
        int i10;
        if (this.v || this.w || this.x) {
            return;
        }
        this.v = true;
        if (this.c) {
            q4 q4Var = this.s;
            int i11 = this.f;
            if (i11 > 0 && (i10 = this.h) > 0) {
                q4Var.a(i11, i10);
            }
            a(this.b);
            return;
        }
        if (this.e) {
            Utilities.globalQueue.postRunnable(new p4(this, 0));
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
            int i12 = options.outWidth;
            if (i12 > 0 && (i9 = options.outHeight) > 0) {
                this.s.a(i12, i9);
            }
        } catch (Exception unused) {
        }
        Utilities.globalQueue.postRunnable(new p4(this, 1));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TLRPC.InputFile inputFile;
        if (i10 != this.a || this.w || this.x) {
            return;
        }
        String str = (String) objArr[0];
        if (this.A == null || !this.A.equals(str)) {
            return;
        }
        if (i9 == NotificationCenter.fileUploaded) {
            TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
            if (this.e && !this.D && !TextUtils.isEmpty(this.B)) {
                this.C = inputFile2;
                this.D = true;
                this.A = this.B;
                FileLoader.getInstance(this.a).uploadFile(this.A, false, true, 16777216);
                return;
            }
            if (this.e && this.D) {
                c(this.C, inputFile2);
                return;
            } else {
                c(inputFile2, null);
                return;
            }
        }
        if (i9 == NotificationCenter.fileUploadFailed) {
            if (this.e && this.D && (inputFile = this.C) != null) {
                c(inputFile, null);
                return;
            }
            this.x = true;
            e();
            this.s.onError();
            return;
        }
        if (i9 == NotificationCenter.fileUploadProgressChanged) {
            long longValue = ((Long) objArr[1]).longValue();
            long longValue2 = ((Long) objArr[2]).longValue();
            q4 q4Var = this.s;
            if (this.D) {
                return;
            }
            q4Var.f(longValue2 > 0 ? longValue / longValue2 : 0.0f);
        }
    }

    public final void e() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.a);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploaded);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadFailed);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadProgressChanged);
    }

    public r4(int i9, String str, TLRPC.Document document, z2 z2Var) {
        this.a = i9;
        this.b = str;
        this.c = false;
        this.d = true;
        this.e = false;
        this.f = 0;
        this.h = 0;
        this.n = 0;
        this.r = document;
        this.s = z2Var;
    }

    public r4(int i9, String str, TLRPC.Document document, y2 y2Var) {
        this.a = i9;
        this.b = str;
        this.c = false;
        this.d = false;
        this.e = true;
        this.f = 0;
        this.h = 0;
        this.n = 0;
        this.r = document;
        this.s = y2Var;
    }
}
