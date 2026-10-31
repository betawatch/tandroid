package vh;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x8 {
    public long a;
    public volatile long b;
    public int c;
    public volatile int f;
    public volatile int g;
    public final boolean h;
    public boolean i;
    public long j;
    public Path m;
    public final /* synthetic */ z8 n;
    public final ArrayList d = new ArrayList();
    public boolean k = false;
    public final Paint l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public x8(z8 z8Var, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j10, final long j11, final long j12, final Runnable runnable) {
        this.n = z8Var;
        this.h = z10;
        Utilities.i.c(new Runnable() { // from class: vh.v8
            /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                int i12;
                int i13;
                x8 x8Var = x8.this;
                String str2 = str;
                Long l10 = l4;
                long j13 = j11;
                long j14 = j12;
                int i14 = i11;
                long j15 = j10;
                int i15 = i10;
                Runnable runnable2 = runnable;
                long maxScrollDuration = x8Var.n.getMaxScrollDuration();
                try {
                    x8Var.e.setDataSource(str2);
                    String extractMetadata = x8Var.e.extractMetadata(9);
                    if (extractMetadata != null) {
                        maxScrollDuration = Long.parseLong(extractMetadata);
                        x8Var.a = maxScrollDuration;
                    }
                    String extractMetadata2 = x8Var.e.extractMetadata(18);
                    i13 = extractMetadata2 != null ? Integer.parseInt(extractMetadata2) : 0;
                    try {
                        String extractMetadata3 = x8Var.e.extractMetadata(19);
                        r16 = extractMetadata3 != null ? Integer.parseInt(extractMetadata3) : 0;
                        String extractMetadata4 = x8Var.e.extractMetadata(24);
                        if (extractMetadata4 != null) {
                            int parseInt = Integer.parseInt(extractMetadata4);
                            if (parseInt == 90 || parseInt == 270) {
                                int i16 = r16;
                                r16 = i13;
                                i13 = i16;
                            }
                        }
                        i12 = r16;
                    } catch (Exception e) {
                        e = e;
                        i12 = r16;
                        r16 = i13;
                        x8Var.e = null;
                        org.telegram.messenger.f8.g(e, true);
                        i13 = r16;
                        if (l10 != null) {
                        }
                        if (j13 != -1) {
                            maxScrollDuration = j14 - j13;
                        }
                        float i17 = Utilities.i((i13 != 0 || i12 == 0) ? 1.0f : i13 / i12, 1.3333334f, 0.5625f);
                        x8Var.g = Math.max(1, i14);
                        x8Var.f = Math.max(1, (int) Math.ceil(i14 * i17));
                        int ceil = (int) Math.ceil(((Math.max(maxScrollDuration, j15) / j15) * i15) / x8Var.f);
                        x8Var.c = ceil;
                        x8Var.b = (long) (maxScrollDuration / ceil);
                        x8Var.j = -x8Var.b;
                        if (j13 != -1) {
                        }
                        x8Var.c();
                        org.telegram.messenger.i0.g3(runnable2);
                    }
                } catch (Exception e7) {
                    e = e7;
                    i12 = 0;
                }
                if (l10 != null) {
                    maxScrollDuration = l10.longValue();
                    x8Var.a = maxScrollDuration;
                }
                if (j13 != -1 && j14 != -1) {
                    maxScrollDuration = j14 - j13;
                }
                float i172 = Utilities.i((i13 != 0 || i12 == 0) ? 1.0f : i13 / i12, 1.3333334f, 0.5625f);
                x8Var.g = Math.max(1, i14);
                x8Var.f = Math.max(1, (int) Math.ceil(i14 * i172));
                int ceil2 = (int) Math.ceil(((Math.max(maxScrollDuration, j15) / j15) * i15) / x8Var.f);
                x8Var.c = ceil2;
                x8Var.b = (long) (maxScrollDuration / ceil2);
                x8Var.j = -x8Var.b;
                if (j13 != -1) {
                    x8Var.j = j13 - x8Var.b;
                }
                x8Var.c();
                org.telegram.messenger.i0.g3(runnable2);
            }
        });
    }

    public final void b() {
        this.i = true;
        Utilities.i.a(new d0(this, 22));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((w8) obj).a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e) {
                this.e = null;
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public final void c() {
        if (this.k || this.e == null || this.d.size() >= this.c) {
            return;
        }
        this.k = true;
        this.j += this.b;
        int i10 = 22;
        Utilities.i.a(new d0(this, i10));
        Utilities.i.c(new d0(this, i10));
    }
}
