package zh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.RLottieNative;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class z implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final TLRPC.Document b;
    public final TLRPC.Document c;
    public final int d;
    public final boolean e;
    public final v0 f;
    public final v0 h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;

    public z(int i10, TLRPC.Document document, TLRPC.Document document2, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i11, boolean z10, v0 v0Var, v0 v0Var2) {
        this.a = i10;
        this.b = document;
        this.c = document2;
        this.d = i11;
        this.e = z10;
        this.f = v0Var;
        this.h = v0Var2;
        this.v = document2 == null;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        FileLoader fileLoader = FileLoader.getInstance(i10);
        if (document2 != null && !b(document2).exists()) {
            fileLoader.loadFile(document2, tL_starGiftUnique, 3, 1);
        }
        if (!b(document).exists()) {
            fileLoader.loadFile(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (this.n) {
            return;
        }
        TLRPC.Document document = this.c;
        if (document != null && !this.r && b(document).exists()) {
            this.r = true;
            final File b10 = b(this.c);
            final int i10 = 0;
            Utilities.globalQueue.postRunnable(new Runnable(this) { // from class: zh.y
                public final /* synthetic */ z b;

                {
                    this.b = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:35:0x00e3, code lost:
                
                    if (r4 == null) goto L36;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x010f, code lost:
                
                    if (r4 != null) goto L46;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:53:0x0111, code lost:
                
                    r4.d();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x0150, code lost:
                
                    if (r4 == null) goto L56;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    RLottieNative rLottieNative;
                    RLottieNative rLottieNative2;
                    int max;
                    Bitmap bitmap;
                    int i11;
                    switch (i10) {
                        case 0:
                            File file = b10;
                            z zVar = this.b;
                            int i12 = zVar.d;
                            Bitmap bitmap2 = null;
                            try {
                                rLottieNative = RLottieNative.a(file.getAbsolutePath(), null, null, null, 0, null);
                                if (rLottieNative != null) {
                                    try {
                                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                        Bitmap createBitmap = Bitmap.createBitmap(i12, i12, config);
                                        rLottieNative.c(0, createBitmap, true);
                                        Bitmap createBitmap2 = Bitmap.createBitmap(i12, i12, config);
                                        Paint paint = new Paint(2);
                                        paint.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                        new Canvas(createBitmap2).drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                                        createBitmap.recycle();
                                        createBitmap2.setHasMipMap(true);
                                        rLottieNative.d();
                                        bitmap2 = createBitmap2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        try {
                                            FileLog.e(th);
                                            break;
                                        } finally {
                                            if (rLottieNative != null) {
                                                rLottieNative.d();
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                rLottieNative = null;
                            }
                            AndroidUtilities.runOnUIThread(new uf.c(24, zVar, bitmap2));
                            return;
                        default:
                            File file2 = b10;
                            z zVar2 = this.b;
                            boolean z10 = zVar2.e;
                            a0 a0Var = null;
                            try {
                                rLottieNative2 = RLottieNative.a(file2.getAbsolutePath(), null, null, null, 0, null);
                            } catch (Throwable th4) {
                                th = th4;
                                rLottieNative2 = null;
                            }
                            if (rLottieNative2 != null) {
                                int[] iArr = rLottieNative2.a;
                                if (z10) {
                                    try {
                                        max = Math.max(1, iArr[0]);
                                    } catch (Throwable th5) {
                                        th = th5;
                                        try {
                                            FileLog.e(th);
                                            break;
                                        } finally {
                                        }
                                    }
                                } else {
                                    max = 1;
                                }
                                int max2 = Math.max(1, iArr[1]);
                                int b11 = e1.b(max, 256, 96);
                                if (b11 != 0) {
                                    int max3 = Math.max(1, (int) Math.ceil(Math.sqrt(Math.max(1, max))));
                                    int i13 = ((max + max3) - 1) / max3;
                                    int i14 = b11 + 4;
                                    int i15 = max3 * i14;
                                    int i16 = i13 * i14;
                                    long j10 = b11;
                                    bitmap = e.a(i15, i16, j10 * j10 * 4);
                                } else {
                                    bitmap = null;
                                }
                                if (bitmap == null) {
                                    b11 = e1.b(1, 256, 8);
                                    int max4 = Math.max(1, (int) Math.ceil(Math.sqrt(Math.max(1, 1))));
                                    int i17 = max4 / max4;
                                    int i18 = b11 + 4;
                                    int i19 = max4 * i18;
                                    int i20 = i17 * i18;
                                    long j11 = b11;
                                    bitmap = e.a(i19, i20, j11 * j11 * 4);
                                    if (bitmap == null) {
                                        AndroidUtilities.runOnUIThread(new uf.c(23, zVar2, a0Var));
                                        return;
                                    }
                                    i11 = 1;
                                } else {
                                    i11 = max;
                                }
                                int i21 = b11;
                                Bitmap bitmap3 = bitmap;
                                bitmap3.setHasMipMap(false);
                                int max5 = Math.max(1, (int) Math.ceil(Math.sqrt(Math.max(1, i11))));
                                int i22 = i21 + 4;
                                Canvas canvas = new Canvas(bitmap3);
                                Bitmap createBitmap3 = Bitmap.createBitmap(i21, i21, Bitmap.Config.ARGB_8888);
                                for (int i23 = 0; i23 < i11; i23++) {
                                    rLottieNative2.c(i23, createBitmap3, true);
                                    canvas.drawBitmap(createBitmap3, ((i23 % max5) * i22) + 2, ((i23 / max5) * i22) + 2, (Paint) null);
                                }
                                createBitmap3.recycle();
                                a0 a0Var2 = new a0(bitmap3, i21, max5, i11, max2);
                                rLottieNative2.d();
                                a0Var = a0Var2;
                                AndroidUtilities.runOnUIThread(new uf.c(23, zVar2, a0Var));
                                return;
                            }
                            break;
                    }
                }
            });
        }
        if (!this.s && b(this.b).exists()) {
            this.s = true;
            final File b11 = b(this.b);
            final int i11 = 1;
            Utilities.globalQueue.postRunnable(new Runnable(this) { // from class: zh.y
                public final /* synthetic */ z b;

                {
                    this.b = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:35:0x00e3, code lost:
                
                    if (r4 == null) goto L36;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x010f, code lost:
                
                    if (r4 != null) goto L46;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:53:0x0111, code lost:
                
                    r4.d();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x0150, code lost:
                
                    if (r4 == null) goto L56;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    RLottieNative rLottieNative;
                    RLottieNative rLottieNative2;
                    int max;
                    Bitmap bitmap;
                    int i112;
                    switch (i11) {
                        case 0:
                            File file = b11;
                            z zVar = this.b;
                            int i12 = zVar.d;
                            Bitmap bitmap2 = null;
                            try {
                                rLottieNative = RLottieNative.a(file.getAbsolutePath(), null, null, null, 0, null);
                                if (rLottieNative != null) {
                                    try {
                                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                        Bitmap createBitmap = Bitmap.createBitmap(i12, i12, config);
                                        rLottieNative.c(0, createBitmap, true);
                                        Bitmap createBitmap2 = Bitmap.createBitmap(i12, i12, config);
                                        Paint paint = new Paint(2);
                                        paint.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                        new Canvas(createBitmap2).drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                                        createBitmap.recycle();
                                        createBitmap2.setHasMipMap(true);
                                        rLottieNative.d();
                                        bitmap2 = createBitmap2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        try {
                                            FileLog.e(th);
                                            break;
                                        } finally {
                                            if (rLottieNative != null) {
                                                rLottieNative.d();
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                rLottieNative = null;
                            }
                            AndroidUtilities.runOnUIThread(new uf.c(24, zVar, bitmap2));
                            return;
                        default:
                            File file2 = b11;
                            z zVar2 = this.b;
                            boolean z10 = zVar2.e;
                            a0 a0Var = null;
                            try {
                                rLottieNative2 = RLottieNative.a(file2.getAbsolutePath(), null, null, null, 0, null);
                            } catch (Throwable th4) {
                                th = th4;
                                rLottieNative2 = null;
                            }
                            if (rLottieNative2 != null) {
                                int[] iArr = rLottieNative2.a;
                                if (z10) {
                                    try {
                                        max = Math.max(1, iArr[0]);
                                    } catch (Throwable th5) {
                                        th = th5;
                                        try {
                                            FileLog.e(th);
                                            break;
                                        } finally {
                                        }
                                    }
                                } else {
                                    max = 1;
                                }
                                int max2 = Math.max(1, iArr[1]);
                                int b112 = e1.b(max, 256, 96);
                                if (b112 != 0) {
                                    int max3 = Math.max(1, (int) Math.ceil(Math.sqrt(Math.max(1, max))));
                                    int i13 = ((max + max3) - 1) / max3;
                                    int i14 = b112 + 4;
                                    int i15 = max3 * i14;
                                    int i16 = i13 * i14;
                                    long j10 = b112;
                                    bitmap = e.a(i15, i16, j10 * j10 * 4);
                                } else {
                                    bitmap = null;
                                }
                                if (bitmap == null) {
                                    b112 = e1.b(1, 256, 8);
                                    int max4 = Math.max(1, (int) Math.ceil(Math.sqrt(Math.max(1, 1))));
                                    int i17 = max4 / max4;
                                    int i18 = b112 + 4;
                                    int i19 = max4 * i18;
                                    int i20 = i17 * i18;
                                    long j11 = b112;
                                    bitmap = e.a(i19, i20, j11 * j11 * 4);
                                    if (bitmap == null) {
                                        AndroidUtilities.runOnUIThread(new uf.c(23, zVar2, a0Var));
                                        return;
                                    }
                                    i112 = 1;
                                } else {
                                    i112 = max;
                                }
                                int i21 = b112;
                                Bitmap bitmap3 = bitmap;
                                bitmap3.setHasMipMap(false);
                                int max5 = Math.max(1, (int) Math.ceil(Math.sqrt(Math.max(1, i112))));
                                int i22 = i21 + 4;
                                Canvas canvas = new Canvas(bitmap3);
                                Bitmap createBitmap3 = Bitmap.createBitmap(i21, i21, Bitmap.Config.ARGB_8888);
                                for (int i23 = 0; i23 < i112; i23++) {
                                    rLottieNative2.c(i23, createBitmap3, true);
                                    canvas.drawBitmap(createBitmap3, ((i23 % max5) * i22) + 2, ((i23 / max5) * i22) + 2, (Paint) null);
                                }
                                createBitmap3.recycle();
                                a0 a0Var2 = new a0(bitmap3, i21, max5, i112, max2);
                                rLottieNative2.d();
                                a0Var = a0Var2;
                                AndroidUtilities.runOnUIThread(new uf.c(23, zVar2, a0Var));
                                return;
                            }
                            break;
                    }
                }
            });
        }
        if ((this.c == null || this.r) && this.s) {
            NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.fileLoaded);
        }
    }

    public final File b(TLRPC.Document document) {
        return FileLoader.getInstance(this.a).getPathToAttach(document, true);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            a();
        }
    }
}
