package ve;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b extends a {
    public final MediaMetadataRetriever r;
    public final boolean s;

    public b(File file) {
        long j10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.a = "OTHER";
            try {
                j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j10 = 0;
            }
            this.b = j10;
            this.c = c(7);
            this.d = c(2);
            this.e = c(13);
            this.f = c(1);
            this.g = b(8);
            this.h = c(6);
            this.j = b(0);
            b(10);
            this.k = b(14);
            this.m = c(4);
            byte[] embeddedPicture = this.r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            if (this.o != null) {
                float max = Math.max(r5.getWidth(), this.o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    this.p = Bitmap.createScaledBitmap(this.o, (int) (r0.getWidth() / max), (int) (this.o.getHeight() / max), true);
                } else {
                    this.p = this.o;
                }
            }
        } catch (Exception e) {
            this.s = true;
            FileLog.e(e);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.r;
            if (mediaMetadataRetriever2 != null) {
                ai.t(mediaMetadataRetriever2);
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
