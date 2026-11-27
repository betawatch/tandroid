// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.secretmedia.EncryptedFileInputStream;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class xm5 implements Runnable {
    public Thread a;
    public final Object b = new Object();
    public final wm5 c;
    public boolean d;
    public final /* synthetic */ in5 e;

    public xm5(in5 in5Var, wm5 wm5Var) {
        this.e = in5Var;
        this.c = wm5Var;
    }

    public static Bitmap a(Bitmap bitmap, TLRPC.WallPaper wallPaper) {
        int g;
        if (!wallPaper.pattern || wallPaper.settings == null) {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            return (wallPaperSettings == null || !wallPaperSettings.blur) ? bitmap : Utilities.e(bitmap);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper.settings;
        boolean z = true;
        if (wallPaperSettings2.second_background_color == 0) {
            g = hl.U0(wallPaperSettings2.background_color, false);
            canvas.drawColor(vm2.o(wallPaper.settings.background_color, jn7.d4));
        } else {
            int i = wallPaperSettings2.third_background_color;
            int i2 = wallPaperSettings2.background_color;
            if (i == 0) {
                int o = vm2.o(i2, jn7.d4);
                int o2 = vm2.o(wallPaper.settings.second_background_color, jn7.d4);
                int w0 = hl.w0(o, o2);
                GradientDrawable gradientDrawable = new GradientDrawable(yd0.c(wallPaper.settings.rotation), new int[]{o, o2});
                gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                gradientDrawable.draw(canvas);
                g = w0;
            } else {
                int o3 = vm2.o(i2, jn7.d4);
                int o4 = vm2.o(wallPaper.settings.second_background_color, jn7.d4);
                int o5 = vm2.o(wallPaper.settings.third_background_color, jn7.d4);
                int i3 = wallPaper.settings.fourth_background_color;
                int o6 = i3 == 0 ? 0 : vm2.o(i3, jn7.d4);
                g = hh7.g(o3, o4, o5, o6);
                hh7 hh7Var = new hh7();
                hh7Var.n(true, o3, o4, o5, o6);
                hh7Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                hh7Var.r(wallPaper.settings.intensity, bitmap);
                hh7Var.draw(canvas);
                z = false;
            }
        }
        if (z) {
            Paint paint = new Paint(2);
            paint.setColorFilter(new PorterDuffColorFilter(g, PorterDuff.Mode.SRC_IN));
            paint.setAlpha((int) ((wallPaper.settings.intensity / 100.0f) * 255.0f));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        }
        return createBitmap;
    }

    public final void b(b29 b29Var, int i, int i2, boolean z, boolean z2) {
        Bitmap.Config config;
        Bitmap createBitmap;
        Canvas canvas;
        BitmapDrawable bitmapDrawable;
        if (z && z2) {
            float f = i * 1.2f;
            float f2 = i2 * 1.2f;
            config = Bitmap.Config.ARGB_8888;
            createBitmap = Bitmap.createBitmap((int) f, (int) f2, config);
            canvas = new Canvas(createBitmap);
            canvas.scale(2.0f, 2.0f, f / 2.0f, f2 / 2.0f);
        } else {
            config = Bitmap.Config.ARGB_8888;
            createBitmap = Bitmap.createBitmap(i, i2, config);
            canvas = new Canvas(createBitmap);
        }
        b29Var.b();
        Bitmap createBitmap2 = Bitmap.createBitmap(b29Var.b, b29Var.c, config);
        b29Var.D0 = z ? b29Var.e[0] - 1 : 0;
        b29Var.a(createBitmap2);
        b29Var.c();
        canvas.save();
        if (!z || !z2) {
            canvas.scale(createBitmap2.getWidth() / i, createBitmap2.getHeight() / i2, i / 2.0f, i2 / 2.0f);
        }
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        if (z && z2) {
            canvas.drawBitmap(createBitmap2, (createBitmap.getWidth() - createBitmap2.getWidth()) / 2.0f, (createBitmap.getHeight() - createBitmap2.getHeight()) / 2.0f, paint);
            bitmapDrawable = new pn5(createBitmap);
        } else {
            canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, paint);
            bitmapDrawable = new BitmapDrawable(createBitmap);
        }
        b29Var.x(false);
        createBitmap2.recycle();
        c(bitmapDrawable);
    }

    public final void c(BitmapDrawable bitmapDrawable) {
        hl.c3(new tg5(this, bitmapDrawable, (byte) 7));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:892|(2:894|(12:896|897|898|(1:900)(1:922)|901|902|903|904|(2:910|(1:912))|(1:914)(1:917)|915|916))|925|897|898|(0)(0)|901|902|903|904|(4:906|908|910|(0))|(0)(0)|915|916) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:(6:72|73|74|75|(1:77)(1:123)|78)|(3:80|81|(9:83|84|85|(1:117)|(3:102|(1:116)(4:105|(1:109)|110|(1:114))|115)(1:91)|92|(1:101)(1:96)|(1:98)(1:100)|99))|122|84|85|(0)|117|(0)|102|(0)|116|115|92|(1:94)|101|(0)(0)|99) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:343|(1:891)(1:350)|351|(2:353|(1:889)(1:357))(1:890)|358|(15:360|(3:362|(1:364)(1:876)|365)(2:877|(3:879|(1:881)(1:883)|882)(2:884|(2:886|887)))|366|367|368|(18:370|371|372|(6:828|829|830|831|832|833)(1:374)|375|376|377|378|379|(1:381)(2:810|(1:812)(2:813|(1:815)(2:816|(1:818)(1:819))))|382|383|384|385|(1:387)(2:801|(1:803))|388|(1:800)(9:392|394|(2:763|(12:765|(4:767|768|769|(9:771|(1:773)|774|775|776|(1:785)(1:780)|781|782|(1:784)))(1:790)|787|(0)|774|775|776|(1:778)|785|781|782|(0))(3:791|(1:793)(1:795)|794))(2:(4:753|754|755|756)(1:398)|399)|400|(1:752)(1:404)|405|(1:407)|408|(1:751)(3:414|(2:415|(1:418)(1:417))|419))|420)(3:844|(11:846|847|848|(1:850)(1:870)|851|852|853|(1:855)|856|(3:858|(2:859|(1:862)(1:861))|863)(1:866)|864)(1:872)|865)|421|422|423|(3:663|664|881)(4:425|426|427|a0d)|462|(3:465|(1:467)(1:469)|468)|(2:475|(1:477))|478|(3:(1:491)(1:494)|492|493)(3:(1:483)(1:486)|484|485))|888|887|366|367|368|(0)(0)|421|422|423|(0)(0)|462|(3:465|(0)(0)|468)|(4:471|473|475|(0))|478|(1:480)|(0)(0)|492|493) */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0205, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0206, code lost:
    
        cc4.f(r0);
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:874:0x0861, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x0862, code lost:
    
        r35 = r3;
        r22 = r6;
        r23 = r7;
        r21 = 2;
        r32 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:919:0x0d4b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:920:0x0d4f, code lost:
    
        cc4.f(r0);
        r0 = r3;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:923:0x0d4d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:924:0x0d4e, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0236 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0a38 A[Catch: all -> 0x0c74, TryCatch #13 {all -> 0x0c74, blocks: (B:427:0x0a08, B:428:0x0a0d, B:437:0x0a18, B:440:0x0a20, B:442:0x0a26, B:443:0x0a2f, B:447:0x0a38, B:449:0x0a42, B:454:0x0a60, B:495:0x0a71, B:496:0x0a81, B:500:0x0a96, B:501:0x0aad, B:504:0x0ab7, B:506:0x0abb, B:629:0x0ac9, B:654:0x0a9e, B:655:0x0aa8, B:658:0x0a2b, B:661:0x0c71, B:430:0x0a0e, B:432:0x0a12, B:435:0x0a15), top: B:426:0x0a08, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0c88 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0c93  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0c95  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0caa  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0cc8  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0cd4  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0cf2  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0cf8  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0a81 A[Catch: all -> 0x0c74, TryCatch #13 {all -> 0x0c74, blocks: (B:427:0x0a08, B:428:0x0a0d, B:437:0x0a18, B:440:0x0a20, B:442:0x0a26, B:443:0x0a2f, B:447:0x0a38, B:449:0x0a42, B:454:0x0a60, B:495:0x0a71, B:496:0x0a81, B:500:0x0a96, B:501:0x0aad, B:504:0x0ab7, B:506:0x0abb, B:629:0x0ac9, B:654:0x0a9e, B:655:0x0aa8, B:658:0x0a2b, B:661:0x0c71, B:430:0x0a0e, B:432:0x0a12, B:435:0x0a15), top: B:426:0x0a08, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0ba4  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0bbb A[Catch: all -> 0x0c6d, TryCatch #5 {all -> 0x0c6d, blocks: (B:511:0x0b16, B:541:0x0ba6, B:543:0x0bb0, B:545:0x0bb6, B:547:0x0bbb, B:549:0x0bc1, B:553:0x0bd5, B:559:0x0be3, B:561:0x0be9, B:563:0x0c06, B:565:0x0bf3, B:567:0x0bf9, B:570:0x0c0e, B:572:0x0c1b, B:573:0x0c24), top: B:510:0x0b16 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0c06 A[Catch: all -> 0x0c6d, TryCatch #5 {all -> 0x0c6d, blocks: (B:511:0x0b16, B:541:0x0ba6, B:543:0x0bb0, B:545:0x0bb6, B:547:0x0bbb, B:549:0x0bc1, B:553:0x0bd5, B:559:0x0be3, B:561:0x0be9, B:563:0x0c06, B:565:0x0bf3, B:567:0x0bf9, B:570:0x0c0e, B:572:0x0c1b, B:573:0x0c24), top: B:510:0x0b16 }] */
    /* JADX WARN: Removed duplicated region for block: B:657:0x0b9d  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x087c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:773:0x0705 A[Catch: all -> 0x0733, TryCatch #10 {all -> 0x0733, blocks: (B:769:0x06fc, B:773:0x0705, B:774:0x070a), top: B:768:0x06fc }] */
    /* JADX WARN: Removed duplicated region for block: B:784:0x072f A[Catch: all -> 0x079a, TryCatch #40 {all -> 0x079a, blocks: (B:400:0x0753, B:404:0x0761, B:408:0x0778, B:415:0x0788, B:419:0x0791, B:751:0x0796, B:752:0x076a, B:776:0x0716, B:778:0x071c, B:782:0x0728, B:784:0x072f, B:793:0x073d, B:794:0x074c, B:795:0x0747), top: B:394:0x06a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:844:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0223 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0228 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:900:0x0d38  */
    /* JADX WARN: Removed duplicated region for block: B:906:0x0d56  */
    /* JADX WARN: Removed duplicated region for block: B:912:0x0d74  */
    /* JADX WARN: Removed duplicated region for block: B:914:0x0d7c  */
    /* JADX WARN: Removed duplicated region for block: B:917:0x0d81  */
    /* JADX WARN: Removed duplicated region for block: B:922:0x0d3b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0274  */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v112 */
    /* JADX WARN: Type inference failed for: r2v113 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r41v0, types: [xm5] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v31, types: [int] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v63 */
    /* JADX WARN: Type inference failed for: r8v65 */
    /* JADX WARN: Type inference failed for: r8v66 */
    /* JADX WARN: Type inference failed for: r8v67 */
    /* JADX WARN: Type inference failed for: r8v68 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        qqb qqbVar;
        boolean z;
        boolean z2;
        Bitmap bitmap;
        Object obj;
        byte[] bArr;
        py9 py9Var;
        boolean z3;
        boolean z4;
        String str;
        Long l;
        boolean z5;
        boolean z6;
        boolean z7;
        String str2;
        Long l2;
        boolean z8;
        float f;
        float f2;
        float f3;
        boolean z9;
        Bitmap bitmap2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i;
        boolean z15;
        ?? r14;
        boolean z16;
        int i2;
        int i3;
        ?? r9;
        float f4;
        boolean z17;
        Bitmap createScaledBitmap;
        String str3;
        Object obj2;
        ?? r8;
        boolean z18;
        Bitmap createScaledBitmap2;
        Bitmap bitmap3;
        boolean z19;
        boolean z20;
        int i4;
        Bitmap bitmap4;
        Rect rect;
        String str4;
        String str5;
        int i5;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        int i6;
        boolean z27;
        Long l3;
        String str6;
        byte[] bArr2;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        boolean z32;
        Bitmap bitmap5;
        MediaMetadataRetriever mediaMetadataRetriever;
        bk0 bk0Var;
        long j;
        int i7;
        boolean z33;
        lm lmVar;
        int i8;
        int i9;
        boolean z34;
        String str7;
        int i10;
        boolean z35;
        int i11;
        int i12;
        int i13;
        boolean z36;
        boolean z37;
        boolean z38;
        boolean z39;
        boolean z40;
        int i14;
        String str8;
        ?? r2;
        Throwable th;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        boolean z41;
        bk0 bk0Var2;
        bk0 bk0Var3;
        int i15;
        int i16;
        b29 b29Var;
        b29 b29Var2;
        byte[] bArr3;
        boolean z42;
        int i17;
        boolean z43;
        boolean z44;
        boolean z45;
        boolean z46;
        int i18;
        int i19;
        String str9;
        int i20;
        int i21;
        synchronized (this.b) {
            this.a = Thread.currentThread();
            Thread.interrupted();
            if (this.d) {
                return;
            }
            wm5 wm5Var = this.c;
            jn5 jn5Var = wm5Var.i;
            TLRPC.PhotoSize photoSize = jn5Var.k;
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                Bitmap B = in5.B("b", ((TLRPC.TL_photoStrippedSize) photoSize).bytes);
                c(B != null ? new BitmapDrawable(B) : null);
                return;
            }
            byte b = wm5Var.l;
            if (b == 5) {
                try {
                    wm5 wm5Var2 = this.c;
                    qqbVar = new qqb(wm5Var2.p, (kp3) wm5Var2.i.i);
                } catch (Throwable th2) {
                    cc4.f(th2);
                    qqbVar = null;
                }
                c(qqbVar);
                return;
            }
            boolean z47 = false;
            if (b == 3 || b == 4) {
                Point point = hl.q;
                int i22 = point.x;
                int i23 = point.y;
                String str10 = wm5Var.f;
                if (str10 != null) {
                    String[] split = str10.split("_");
                    if (split.length >= 2) {
                        z = false;
                        float parseFloat = Float.parseFloat(split[0]);
                        z2 = true;
                        float parseFloat2 = Float.parseFloat(split[1]);
                        float f5 = hl.p;
                        int i24 = (int) (parseFloat2 * f5);
                        i22 = (int) (parseFloat * f5);
                        i23 = i24;
                        wm5 wm5Var3 = this.c;
                        egb egbVar = hgb.l(wm5Var3.p, i22, i23, wm5Var3.l != 4 ? z2 : z);
                        bitmap = egbVar.d();
                        egb egbVar2 = egbVar;
                        if (bitmap != null && !TextUtils.isEmpty(this.c.f) && this.c.f.contains("wallpaper")) {
                            obj = this.c.j;
                            if (obj instanceof TLRPC.WallPaper) {
                                bitmap = a(bitmap, (TLRPC.WallPaper) obj);
                            }
                        }
                        c(hvc.a(bitmap, egbVar2 != null ? egbVar2.e() : null));
                        return;
                    }
                }
                z = false;
                z2 = true;
                wm5 wm5Var32 = this.c;
                egb egbVar3 = hgb.l(wm5Var32.p, i22, i23, wm5Var32.l != 4 ? z2 : z);
                bitmap = egbVar3.d();
                egb egbVar22 = egbVar3;
                if (bitmap != null) {
                    obj = this.c.j;
                    if (obj instanceof TLRPC.WallPaper) {
                    }
                }
                c(hvc.a(bitmap, egbVar22 != null ? egbVar22.e() : null));
                return;
            }
            if (b == 1) {
                int min = Math.min(512, hl.L(170.6f));
                int min2 = Math.min(512, hl.L(170.6f));
                String str11 = this.c.f;
                if (str11 != null) {
                    String[] split2 = str11.split("_");
                    if (split2.length >= 2) {
                        float parseFloat3 = Float.parseFloat(split2[0]);
                        float parseFloat4 = Float.parseFloat(split2[1]);
                        int i25 = (int) (hl.p * parseFloat3);
                        int min3 = Math.min(512, i25);
                        int i26 = (int) (parseFloat4 * hl.p);
                        int min4 = Math.min(512, i26);
                        if (parseFloat3 > 90.0f || parseFloat4 > 90.0f || this.c.f.contains("nolimit")) {
                            min2 = min4;
                            z43 = false;
                            i21 = min3;
                        } else {
                            int min5 = Math.min(i25, jn7.p2);
                            min2 = Math.min(i26, jn7.p2);
                            z43 = true;
                            i21 = min5;
                        }
                        boolean z48 = (split2.length >= 3 && "pcache".equals(split2[2])) || this.c.f.contains("pcache") || !(this.c.f.contains("nolimit") || xea.o() == 2);
                        z39 = this.c.f.contains("lastframe");
                        i17 = 4;
                        z45 = this.c.f.contains("lastreactframe");
                        if (z45) {
                            z39 = true;
                        }
                        if (this.c.f.contains("firstframe")) {
                            z44 = true;
                            i18 = i21;
                            z46 = z48;
                        } else {
                            z44 = false;
                            i18 = i21;
                            z46 = z48;
                        }
                    } else {
                        i17 = 4;
                        z43 = false;
                        z44 = false;
                        z45 = false;
                        z46 = false;
                        z39 = false;
                        i18 = min;
                    }
                    if (split2.length >= 3) {
                        i19 = 3;
                        if ("nr".equals(split2[2])) {
                            i13 = 2;
                        } else if ("nrs".equals(split2[2])) {
                            i13 = 3;
                        } else if ("dice".equals(split2[2])) {
                            str9 = split2[3];
                            i13 = 2;
                            if (split2.length >= 5) {
                                if (!"c1".equals(split2[i17])) {
                                    if ("c2".equals(split2[i17])) {
                                        i12 = i18;
                                        z40 = z43;
                                        i14 = i19;
                                    } else if ("c3".equals(split2[i17])) {
                                        i12 = i18;
                                        z40 = z43;
                                        i14 = i17;
                                    } else if ("c4".equals(split2[i17])) {
                                        i12 = i18;
                                        z40 = z43;
                                        i14 = 5;
                                    } else {
                                        i20 = "c5".equals(split2[i17]) ? 6 : 12;
                                    }
                                    i11 = min2;
                                    str8 = str9;
                                    z37 = z45;
                                    r2 = i18;
                                    z36 = z44;
                                    z38 = z46;
                                }
                                z40 = z43;
                                i14 = i20;
                                i11 = min2;
                                i12 = i18;
                                str8 = str9;
                                z37 = z45;
                                r2 = i18;
                                z36 = z44;
                                z38 = z46;
                            }
                            i12 = i18;
                            z40 = z43;
                            i14 = 0;
                            i11 = min2;
                            str8 = str9;
                            z37 = z45;
                            r2 = i18;
                            z36 = z44;
                            z38 = z46;
                        }
                        str9 = null;
                        if (split2.length >= 5) {
                        }
                        i12 = i18;
                        z40 = z43;
                        i14 = 0;
                        i11 = min2;
                        str8 = str9;
                        z37 = z45;
                        r2 = i18;
                        z36 = z44;
                        z38 = z46;
                    } else {
                        i19 = 3;
                    }
                    i13 = 1;
                    str9 = null;
                    if (split2.length >= 5) {
                    }
                    i12 = i18;
                    z40 = z43;
                    i14 = 0;
                    i11 = min2;
                    str8 = str9;
                    z37 = z45;
                    r2 = i18;
                    z36 = z44;
                    z38 = z46;
                } else {
                    i11 = min2;
                    i12 = min;
                    i13 = 1;
                    z36 = false;
                    z37 = false;
                    z38 = false;
                    z39 = false;
                    z40 = false;
                    i14 = 0;
                    str8 = null;
                    r2 = min;
                }
                try {
                    if (str8 != null) {
                        b29Var2 = "🎰".equals(str8) ? new lna(str8, i12, i11) : new a29(str8, i12, i11);
                        i15 = i11;
                        i16 = i12;
                    } else {
                        try {
                            randomAccessFile2 = new RandomAccessFile(this.c.p, "r");
                            try {
                                bArr3 = this.c.m == 1 ? in5.L : in5.K;
                                randomAccessFile2.readFully(bArr3, 0, 2);
                            } catch (Exception e) {
                                e = e;
                                cc4.g(e, false);
                                if (randomAccessFile2 != null) {
                                    try {
                                        randomAccessFile2.close();
                                    } catch (Exception e2) {
                                        cc4.f(e2);
                                    }
                                }
                                z41 = false;
                                if (!z39) {
                                }
                                z38 = false;
                                if (z38) {
                                }
                                bk0Var2 = new bk0();
                                if (z39) {
                                }
                                bk0Var2.c = true;
                                bk0Var3 = bk0Var2;
                                jn5 jn5Var2 = this.c.i;
                                if (jn5Var2 == null) {
                                }
                                if (z41) {
                                }
                                b29Var2 = b29Var;
                                if (z39) {
                                }
                                b(b29Var2, i15, i16, z39, z37);
                            }
                        } catch (Exception e3) {
                            e = e3;
                            randomAccessFile2 = null;
                        } catch (Throwable th3) {
                            th = th3;
                            randomAccessFile = null;
                            if (randomAccessFile == null) {
                                throw th;
                            }
                            try {
                                randomAccessFile.close();
                                throw th;
                            } catch (Exception e4) {
                                cc4.f(e4);
                                throw th;
                            }
                        }
                        if (bArr3[0] == 31) {
                            if (bArr3[1] == -117) {
                                z42 = true;
                                randomAccessFile2.close();
                                z41 = z42;
                                if (!z39 || z36) {
                                    z38 = false;
                                }
                                if (!z38 || z39 || z36) {
                                    bk0Var2 = new bk0();
                                    if (!z39 || z36) {
                                        bk0Var2.c = true;
                                    } else {
                                        String str12 = this.c.f;
                                        if (str12 != null && str12.contains("compress")) {
                                            bk0Var2.a = (byte) 60;
                                        }
                                        String str13 = this.c.f;
                                        if (str13 != null && str13.contains("flbk")) {
                                            bk0Var2.b = true;
                                        }
                                    }
                                    bk0Var3 = bk0Var2;
                                } else {
                                    bk0Var3 = null;
                                }
                                jn5 jn5Var22 = this.c.i;
                                boolean z49 = jn5Var22 == null && r47.B4(jn5Var22.i);
                                if (z41) {
                                    File file = this.c.p;
                                    i15 = i11;
                                    i16 = i12;
                                    b29Var = new b29(file, in5.k(file), i16, i15, bk0Var3, z40, i14, z49);
                                } else {
                                    i15 = i11;
                                    i16 = i12;
                                    b29Var = new b29(this.c.p, null, i16, i15, bk0Var3, z40, i14, z49);
                                }
                                b29Var2 = b29Var;
                            }
                        }
                        z42 = false;
                        randomAccessFile2.close();
                        z41 = z42;
                        if (!z39) {
                        }
                        z38 = false;
                        if (z38) {
                        }
                        bk0Var2 = new bk0();
                        if (z39) {
                        }
                        bk0Var2.c = true;
                        bk0Var3 = bk0Var2;
                        jn5 jn5Var222 = this.c.i;
                        if (jn5Var222 == null) {
                        }
                        if (z41) {
                        }
                        b29Var2 = b29Var;
                    }
                    if (!z39 || z36) {
                        b(b29Var2, i15, i16, z39, z37);
                    } else {
                        b29Var2.F(i13);
                        c(b29Var2);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    randomAccessFile = r2;
                }
            } else {
                int i27 = 4;
                if (b != 2) {
                    File file2 = wm5Var.p;
                    boolean z50 = (wm5Var.h == null && (wm5Var.r == null || file2 == null || !file2.getAbsolutePath().endsWith(".enc"))) ? false : true;
                    wm5 wm5Var4 = this.c;
                    oy9 oy9Var = wm5Var4.h;
                    if (oy9Var != null) {
                        py9Var = oy9Var.a;
                        TLRPC.TL_secureFile tL_secureFile = oy9Var.b;
                        bArr = (tL_secureFile == null || (bArr2 = tL_secureFile.file_hash) == null) ? oy9Var.f : bArr2;
                    } else {
                        bArr = null;
                        py9Var = null;
                    }
                    String str14 = wm5Var4.i.g;
                    if (str14 != null) {
                        if (str14.startsWith("thumb://")) {
                            int indexOf = str14.indexOf(":", 8);
                            if (indexOf >= 0) {
                                l = Long.valueOf(Long.parseLong(str14.substring(8, indexOf)));
                                str6 = str14.substring(indexOf + 1);
                            } else {
                                str6 = null;
                                l = null;
                            }
                            str = str6;
                            z6 = false;
                            z5 = false;
                        } else if (str14.startsWith("vthumb://")) {
                            int indexOf2 = str14.indexOf(":", 9);
                            if (indexOf2 >= 0) {
                                l3 = Long.valueOf(Long.parseLong(str14.substring(9, indexOf2)));
                                z27 = true;
                            } else {
                                z27 = false;
                                l3 = null;
                            }
                            l = l3;
                            z6 = z27;
                            z5 = false;
                            str = null;
                        } else if (!str14.startsWith("http")) {
                            z4 = false;
                            z3 = false;
                            str = null;
                            l = null;
                            z6 = z4;
                            z5 = z3;
                        }
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = 1;
                        boolean z51 = this.e.z;
                        str5 = this.c.f;
                        if (str5 == null) {
                            f = 0.0f;
                            try {
                                String[] split3 = str5.split("_");
                                if (split3.length >= 2) {
                                    try {
                                        f2 = Float.parseFloat(split3[0]) * hl.p;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        z7 = z50;
                                        str2 = str;
                                        l2 = l;
                                        z23 = 2;
                                        z10 = false;
                                        f2 = 0.0f;
                                        f3 = 0.0f;
                                        z24 = z51;
                                    }
                                    try {
                                        f3 = Float.parseFloat(split3[1]) * hl.p;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        z7 = z50;
                                        str2 = str;
                                        l2 = l;
                                        z23 = 2;
                                        z10 = false;
                                        f3 = 0.0f;
                                        z24 = z51;
                                        bitmap2 = null;
                                        z14 = z24;
                                        z13 = z23;
                                        i = 1;
                                        cc4.g(th, !(th instanceof FileNotFoundException));
                                        r14 = z14;
                                        z15 = z13;
                                        float f6 = f3;
                                        if (this.c.m != i) {
                                        }
                                        Thread.interrupted();
                                        if (f11.a) {
                                        }
                                        if (bitmap2 != null) {
                                        }
                                        str3 = this.c.f;
                                        if (str3 == null) {
                                        }
                                        c(bitmap2 != null ? new p74(bitmap2, i3, i2) : null);
                                        return;
                                    }
                                } else {
                                    f2 = 0.0f;
                                    f3 = 0.0f;
                                }
                                try {
                                    boolean z52 = 2;
                                    try {
                                        z10 = this.c.f.contains("b2r") ? 4 : this.c.f.contains("b2") ? 3 : this.c.f.contains("b1") ? 2 : this.c.f.contains("b");
                                        try {
                                            z47 = this.c.f.contains("i");
                                            try {
                                                if (this.c.f.contains("f")) {
                                                    z51 = true;
                                                } else {
                                                    z51 = z51;
                                                    if (this.c.f.contains("F")) {
                                                        z51 = false;
                                                    }
                                                }
                                                if (f2 == 0.0f || f3 == 0.0f) {
                                                    z7 = z50;
                                                    str2 = str;
                                                    l2 = l;
                                                    z25 = z10;
                                                } else {
                                                    options.inJustDecodeBounds = true;
                                                    try {
                                                        try {
                                                            if (l == null || str != null) {
                                                                str2 = str;
                                                                l2 = l;
                                                                if (py9Var != null) {
                                                                    RandomAccessFile randomAccessFile3 = new RandomAccessFile(file2, "r");
                                                                    int length = (int) randomAccessFile3.length();
                                                                    ThreadLocal threadLocal = in5.I;
                                                                    byte[] bArr4 = (byte[]) threadLocal.get();
                                                                    if (bArr4 != null) {
                                                                        z7 = z50;
                                                                        try {
                                                                            if (bArr4.length >= length) {
                                                                                if (bArr4 == null) {
                                                                                    bArr4 = new byte[length];
                                                                                    threadLocal.set(bArr4);
                                                                                }
                                                                                randomAccessFile3.readFully(bArr4, 0, length);
                                                                                randomAccessFile3.close();
                                                                                EncryptedFileInputStream.decryptBytesWithKeyFile(bArr4, 0, length, py9Var);
                                                                                z25 = z10;
                                                                                z26 = (bArr == null && Arrays.equals(Utilities.o((long) length, bArr4), bArr)) ? false : true;
                                                                                int i28 = bArr4[0] & 255;
                                                                                int i29 = length - i28;
                                                                                if (!z26) {
                                                                                    BitmapFactory.decodeByteArray(bArr4, i28, i29, options);
                                                                                }
                                                                            }
                                                                        } catch (Throwable th7) {
                                                                            th = th7;
                                                                            z24 = z51;
                                                                            z23 = z52;
                                                                            bitmap2 = null;
                                                                            z14 = z24;
                                                                            z13 = z23;
                                                                            i = 1;
                                                                            cc4.g(th, !(th instanceof FileNotFoundException));
                                                                            r14 = z14;
                                                                            z15 = z13;
                                                                            float f62 = f3;
                                                                            if (this.c.m != i) {
                                                                            }
                                                                            Thread.interrupted();
                                                                            if (f11.a) {
                                                                            }
                                                                            if (bitmap2 != null) {
                                                                            }
                                                                            str3 = this.c.f;
                                                                            if (str3 == null) {
                                                                            }
                                                                            c(bitmap2 != null ? new p74(bitmap2, i3, i2) : null);
                                                                            return;
                                                                        }
                                                                    } else {
                                                                        z7 = z50;
                                                                    }
                                                                    bArr4 = null;
                                                                    if (bArr4 == null) {
                                                                    }
                                                                    randomAccessFile3.readFully(bArr4, 0, length);
                                                                    randomAccessFile3.close();
                                                                    EncryptedFileInputStream.decryptBytesWithKeyFile(bArr4, 0, length, py9Var);
                                                                    z25 = z10;
                                                                    if (bArr == null) {
                                                                    }
                                                                    int i282 = bArr4[0] & 255;
                                                                    int i292 = length - i282;
                                                                    if (!z26) {
                                                                    }
                                                                } else {
                                                                    z7 = z50;
                                                                    z25 = z10;
                                                                    FileInputStream encryptedFileInputStream = z7 ? new EncryptedFileInputStream(file2, this.c.r) : new FileInputStream(file2);
                                                                    BitmapFactory.decodeStream(encryptedFileInputStream, null, options);
                                                                    encryptedFileInputStream.close();
                                                                }
                                                            } else {
                                                                if (z6) {
                                                                    try {
                                                                        str2 = str;
                                                                        l2 = l;
                                                                        MediaStore.Video.Thumbnails.getThumbnail(a.b.getContentResolver(), l2.longValue(), 1, options);
                                                                    } catch (Throwable th8) {
                                                                        th = th8;
                                                                        str2 = str;
                                                                        l2 = l;
                                                                        z7 = z50;
                                                                        z24 = z51;
                                                                        z23 = z52;
                                                                        bitmap2 = null;
                                                                        z14 = z24;
                                                                        z13 = z23;
                                                                        i = 1;
                                                                        cc4.g(th, !(th instanceof FileNotFoundException));
                                                                        r14 = z14;
                                                                        z15 = z13;
                                                                        float f622 = f3;
                                                                        if (this.c.m != i) {
                                                                        }
                                                                        Thread.interrupted();
                                                                        if (f11.a) {
                                                                        }
                                                                        if (bitmap2 != null) {
                                                                        }
                                                                        str3 = this.c.f;
                                                                        if (str3 == null) {
                                                                        }
                                                                        c(bitmap2 != null ? new p74(bitmap2, i3, i2) : null);
                                                                        return;
                                                                    }
                                                                } else {
                                                                    str2 = str;
                                                                    l2 = l;
                                                                    MediaStore.Images.Thumbnails.getThumbnail(a.b.getContentResolver(), l2.longValue(), 1, options);
                                                                }
                                                                z7 = z50;
                                                                z25 = z10;
                                                            }
                                                            float f7 = options.outWidth;
                                                            float f8 = options.outHeight;
                                                            float min6 = (f2 < f3 || f7 <= f8) ? Math.min(f7 / f2, f8 / f3) : Math.max(f7 / f2, f8 / f3);
                                                            if (min6 < 1.2f) {
                                                                min6 = 1.0f;
                                                            }
                                                            options.inJustDecodeBounds = false;
                                                            if (min6 <= 1.0f || (f7 <= f2 && f8 <= f3)) {
                                                                options.inSampleSize = (int) min6;
                                                            } else {
                                                                int i30 = 1;
                                                                while (true) {
                                                                    i6 = i30 << 1;
                                                                    if ((i30 << 2) >= min6) {
                                                                        break;
                                                                    } else {
                                                                        i30 = i6;
                                                                    }
                                                                }
                                                                options.inSampleSize = i6;
                                                            }
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                        }
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                        z10 = z50;
                                                        z24 = z51;
                                                        z23 = z52;
                                                    }
                                                }
                                                z10 = z25;
                                                bitmap2 = null;
                                                z22 = z51;
                                                z21 = z52;
                                            } catch (Throwable th11) {
                                                th = th11;
                                                z7 = z50;
                                                str2 = str;
                                                l2 = l;
                                                z24 = z51;
                                                z23 = z52;
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            z7 = z50;
                                            str2 = str;
                                            l2 = l;
                                            bitmap2 = null;
                                            z12 = z52;
                                            z47 = false;
                                            z14 = z51;
                                            z13 = z12;
                                            i = 1;
                                            cc4.g(th, !(th instanceof FileNotFoundException));
                                            r14 = z14;
                                            z15 = z13;
                                            float f6222 = f3;
                                            if (this.c.m != i) {
                                            }
                                            Thread.interrupted();
                                            if (f11.a) {
                                            }
                                            if (bitmap2 != null) {
                                            }
                                            str3 = this.c.f;
                                            if (str3 == null) {
                                            }
                                            c(bitmap2 != null ? new p74(bitmap2, i3, i2) : null);
                                            return;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        z7 = z50;
                                        str2 = str;
                                        l2 = l;
                                        z11 = z52;
                                        bitmap2 = null;
                                        z9 = z11;
                                        z10 = false;
                                        z12 = z9;
                                        z47 = false;
                                        z14 = z51;
                                        z13 = z12;
                                        i = 1;
                                        cc4.g(th, !(th instanceof FileNotFoundException));
                                        r14 = z14;
                                        z15 = z13;
                                        float f62222 = f3;
                                        if (this.c.m != i) {
                                        }
                                        Thread.interrupted();
                                        if (f11.a) {
                                        }
                                        if (bitmap2 != null) {
                                        }
                                        str3 = this.c.f;
                                        if (str3 == null) {
                                        }
                                        c(bitmap2 != null ? new p74(bitmap2, i3, i2) : null);
                                        return;
                                    }
                                } catch (Throwable th14) {
                                    th = th14;
                                    z7 = z50;
                                    str2 = str;
                                    l2 = l;
                                    z11 = 2;
                                }
                            } catch (Throwable th15) {
                                th = th15;
                                z7 = z50;
                                str2 = str;
                                l2 = l;
                                z8 = 2;
                                f2 = f;
                                f3 = f2;
                                z11 = z8;
                                bitmap2 = null;
                                z9 = z11;
                                z10 = false;
                                z12 = z9;
                                z47 = false;
                                z14 = z51;
                                z13 = z12;
                                i = 1;
                                cc4.g(th, !(th instanceof FileNotFoundException));
                                r14 = z14;
                                z15 = z13;
                                float f622222 = f3;
                                if (this.c.m != i) {
                                }
                                Thread.interrupted();
                                if (f11.a) {
                                }
                                if (bitmap2 != null) {
                                }
                                str3 = this.c.f;
                                if (str3 == null) {
                                }
                                c(bitmap2 != null ? new p74(bitmap2, i3, i2) : null);
                                return;
                            }
                        } else {
                            z7 = z50;
                            str2 = str;
                            l2 = l;
                            z8 = 2;
                            f = 0.0f;
                            if (str2 != null) {
                                try {
                                    options.inJustDecodeBounds = true;
                                    options.inPreferredConfig = z51 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                                    FileInputStream fileInputStream = new FileInputStream(file2);
                                    bitmap2 = BitmapFactory.decodeStream(fileInputStream, null, options);
                                    try {
                                        fileInputStream.close();
                                        int i31 = options.outWidth;
                                        int i32 = options.outHeight;
                                        options.inJustDecodeBounds = false;
                                        float min7 = (Math.min(i32, i31) / Math.max(66, Math.min(hl.b1().x, hl.b1().y))) * 6.0f;
                                        if (min7 < 1.0f) {
                                            min7 = 1.0f;
                                        }
                                        if (min7 > 1.0f) {
                                            int i33 = 1;
                                            while (true) {
                                                i5 = i33 << 1;
                                                if ((i33 << 2) > min7) {
                                                    break;
                                                } else {
                                                    i33 = i5;
                                                }
                                            }
                                            options.inSampleSize = i5;
                                        } else {
                                            options.inSampleSize = (int) min7;
                                        }
                                        f2 = 0.0f;
                                        f3 = 0.0f;
                                    } catch (Throwable th16) {
                                        th = th16;
                                        f2 = 0.0f;
                                        f3 = 0.0f;
                                        z9 = z8;
                                        z10 = false;
                                        z12 = z9;
                                        z47 = false;
                                        z14 = z51;
                                        z13 = z12;
                                        i = 1;
                                        cc4.g(th, !(th instanceof FileNotFoundException));
                                        r14 = z14;
                                        z15 = z13;
                                        float f6222222 = f3;
                                        if (this.c.m != i) {
                                        }
                                        Thread.interrupted();
                                        if (f11.a) {
                                        }
                                        if (bitmap2 != null) {
                                        }
                                        str3 = this.c.f;
                                        if (str3 == null) {
                                        }
                                        c(bitmap2 != null ? new p74(bitmap2, i3, i2) : null);
                                        return;
                                    }
                                } catch (Throwable th17) {
                                    th = th17;
                                    f2 = f;
                                    f3 = f2;
                                    z11 = z8;
                                    bitmap2 = null;
                                    z9 = z11;
                                    z10 = false;
                                    z12 = z9;
                                    z47 = false;
                                    z14 = z51;
                                    z13 = z12;
                                    i = 1;
                                    cc4.g(th, !(th instanceof FileNotFoundException));
                                    r14 = z14;
                                    z15 = z13;
                                    float f62222222 = f3;
                                    if (this.c.m != i) {
                                    }
                                    Thread.interrupted();
                                    if (f11.a) {
                                    }
                                    if (bitmap2 != null) {
                                    }
                                    str3 = this.c.f;
                                    if (str3 == null) {
                                    }
                                    c(bitmap2 != null ? new p74(bitmap2, i3, i2) : null);
                                    return;
                                }
                            } else {
                                f2 = 0.0f;
                                f3 = 0.0f;
                                bitmap2 = null;
                            }
                            z10 = false;
                            z47 = false;
                            z22 = z51;
                            z21 = z8;
                        }
                        i = 1;
                        r14 = z22;
                        z15 = z21;
                        float f622222222 = f3;
                        if (this.c.m != i) {
                            try {
                                SystemClock.elapsedRealtime();
                            } catch (Throwable th18) {
                                th = th18;
                                z16 = false;
                            }
                            synchronized (this.b) {
                                if (this.d) {
                                    return;
                                }
                                if (py9Var != null) {
                                    RandomAccessFile randomAccessFile4 = new RandomAccessFile(file2, "r");
                                    int length2 = (int) randomAccessFile4.length();
                                    ThreadLocal threadLocal2 = in5.J;
                                    byte[] bArr5 = (byte[]) threadLocal2.get();
                                    if (bArr5 == null || bArr5.length < length2) {
                                        bArr5 = null;
                                    }
                                    if (bArr5 == null) {
                                        bArr5 = new byte[length2];
                                        threadLocal2.set(bArr5);
                                    }
                                    randomAccessFile4.readFully(bArr5, 0, length2);
                                    randomAccessFile4.close();
                                    EncryptedFileInputStream.decryptBytesWithKeyFile(bArr5, 0, length2, py9Var);
                                    boolean z53 = z10;
                                    f4 = 20.0f;
                                    boolean z54 = bArr == null || !Arrays.equals(Utilities.o((long) length2, bArr5), bArr);
                                    int i34 = bArr5[0] & 255;
                                    int i35 = length2 - i34;
                                    r9 = z53;
                                    if (!z54) {
                                        bitmap2 = BitmapFactory.decodeByteArray(bArr5, i34, i35, options);
                                        r9 = z53;
                                    }
                                } else {
                                    r9 = z10;
                                    f4 = 20.0f;
                                    FileInputStream encryptedFileInputStream2 = z7 ? new EncryptedFileInputStream(file2, this.c.r) : new FileInputStream(file2);
                                    bitmap2 = BitmapFactory.decodeStream(encryptedFileInputStream2, null, options);
                                    encryptedFileInputStream2.close();
                                }
                                if (bitmap2 == null) {
                                    if (file2.length() == 0 || this.c.f == null) {
                                        file2.delete();
                                    }
                                    z16 = false;
                                } else {
                                    if (this.c.f != null) {
                                        float width = bitmap2.getWidth();
                                        float height = bitmap2.getHeight();
                                        if (f2 != f && width != f2 && width > f2 + f4 && bitmap2 != (createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, (int) f2, (int) (height / (width / f2)), true))) {
                                            bitmap2.recycle();
                                            bitmap2 = createScaledBitmap;
                                        }
                                    }
                                    if (z47) {
                                        z16 = Utilities.needInvert(bitmap2) != 0;
                                    } else {
                                        z16 = false;
                                    }
                                    try {
                                        if (r9 == 1) {
                                            if (bitmap2.getConfig() == Bitmap.Config.ARGB_8888) {
                                                Utilities.blurBitmap(bitmap2, 3);
                                            }
                                        } else if (r9 != z15) {
                                            if (r9 != 3) {
                                                z17 = 4;
                                                if (r9 == 4) {
                                                }
                                            } else {
                                                z17 = 4;
                                            }
                                            if (bitmap2.getConfig() == Bitmap.Config.ARGB_8888) {
                                                if (r9 == z17) {
                                                    Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), bitmap2.getConfig());
                                                    Canvas canvas = new Canvas(createBitmap);
                                                    canvas.save();
                                                    canvas.scale(1.2f, 1.2f, bitmap2.getWidth() / 2.0f, bitmap2.getHeight() / 2.0f);
                                                    float f9 = f;
                                                    canvas.drawBitmap(bitmap2, f9, f9, (Paint) null);
                                                    canvas.restore();
                                                    Path path = new Path();
                                                    path.addCircle(bitmap2.getWidth() / 2.0f, bitmap2.getHeight() / 2.0f, Math.min(bitmap2.getWidth(), bitmap2.getHeight()) / 2.0f, Path.Direction.CW);
                                                    canvas.clipPath(path);
                                                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                                                    bitmap2.recycle();
                                                    bitmap2 = createBitmap;
                                                }
                                                Utilities.blurBitmap(bitmap2, 7);
                                                Utilities.blurBitmap(bitmap2, 7);
                                                Utilities.blurBitmap(bitmap2, 7);
                                            }
                                        } else if (bitmap2.getConfig() == Bitmap.Config.ARGB_8888) {
                                            Utilities.blurBitmap(bitmap2, 1);
                                        }
                                    } catch (Throwable th19) {
                                        th = th19;
                                        cc4.g(th, !(th instanceof FileNotFoundException));
                                        i2 = 0;
                                        i3 = 0;
                                        Thread.interrupted();
                                        if (f11.a) {
                                        }
                                        if (bitmap2 != null) {
                                        }
                                        str3 = this.c.f;
                                        if (str3 == null) {
                                        }
                                        c(bitmap2 != null ? new p74(bitmap2, i3, i2) : null);
                                        return;
                                    }
                                }
                                i2 = 0;
                                i3 = 0;
                            }
                        } else {
                            boolean z55 = z10;
                            try {
                                SystemClock.elapsedRealtime();
                            } catch (Throwable th20) {
                                th = th20;
                            }
                            synchronized (this.b) {
                                if (this.d) {
                                    return;
                                }
                                if (r14 == 0) {
                                    wm5 wm5Var5 = this.c;
                                    if (wm5Var5.f != null && !z55 && wm5Var5.i.g == null) {
                                        options.inPreferredConfig = Bitmap.Config.RGB_565;
                                        options.inDither = false;
                                        if (l2 != null && str2 == null) {
                                            if (z6) {
                                                bitmap2 = MediaStore.Images.Thumbnails.getThumbnail(a.b.getContentResolver(), l2.longValue(), 1, options);
                                            } else if (l2.longValue() == 0) {
                                                try {
                                                    lm lmVar2 = new lm(file2, true, 0L, 0, null, null, null, 0L, 0, true);
                                                    bitmap2 = lmVar2.q(0L, true);
                                                    lmVar2.u();
                                                } catch (Throwable th21) {
                                                    th = th21;
                                                    file2 = file2;
                                                    z16 = false;
                                                    r8 = 0;
                                                    i27 = 0;
                                                    cc4.g(th, !(th instanceof FileNotFoundException));
                                                    i2 = i27;
                                                    i3 = r8;
                                                    Thread.interrupted();
                                                    if (f11.a) {
                                                    }
                                                    if (bitmap2 != null) {
                                                    }
                                                    str3 = this.c.f;
                                                    if (str3 == null) {
                                                    }
                                                    c(bitmap2 != null ? new p74(bitmap2, i3, i2) : null);
                                                    return;
                                                }
                                            } else {
                                                bitmap2 = MediaStore.Video.Thumbnails.getThumbnail(a.b.getContentResolver(), l2.longValue(), 1, options);
                                            }
                                        }
                                        if (bitmap2 != null) {
                                            if (bitmap2 == null) {
                                                FileInputStream encryptedFileInputStream3 = py9Var != null ? new EncryptedFileInputStream(file2, py9Var) : z7 ? new EncryptedFileInputStream(file2, this.c.r) : new FileInputStream(file2);
                                                wm5 wm5Var6 = this.c;
                                                r8 = wm5Var6.i.i instanceof TLRPC.TL_document;
                                                try {
                                                    if (r8 != 0 || ((str4 = wm5Var6.f) != null && str4.contains("exif"))) {
                                                        Pair M0 = hl.M0(encryptedFileInputStream3);
                                                        r8 = ((Integer) M0.first).intValue();
                                                        try {
                                                            int intValue = ((Integer) M0.second).intValue();
                                                            if (py9Var == null) {
                                                                try {
                                                                    if (this.c.r == null) {
                                                                        bitmap4 = bitmap2;
                                                                        i27 = intValue;
                                                                        encryptedFileInputStream3.getChannel().position(0L);
                                                                        rect = null;
                                                                        r8 = r8;
                                                                        r14 = bitmap4;
                                                                    }
                                                                } catch (Throwable th22) {
                                                                    th = th22;
                                                                    i27 = intValue;
                                                                    z16 = false;
                                                                    cc4.g(th, !(th instanceof FileNotFoundException));
                                                                    i2 = i27;
                                                                    i3 = r8;
                                                                    Thread.interrupted();
                                                                    if (f11.a) {
                                                                    }
                                                                    if (bitmap2 != null) {
                                                                    }
                                                                    str3 = this.c.f;
                                                                    if (str3 == null) {
                                                                    }
                                                                    c(bitmap2 != null ? new p74(bitmap2, i3, i2) : null);
                                                                    return;
                                                                }
                                                            }
                                                            Bitmap bitmap6 = bitmap2;
                                                            i27 = intValue;
                                                            encryptedFileInputStream3.close();
                                                            bitmap4 = bitmap6;
                                                            if (py9Var != null) {
                                                                encryptedFileInputStream3 = new EncryptedFileInputStream(file2, py9Var);
                                                                bitmap4 = bitmap6;
                                                            } else if (z7) {
                                                                encryptedFileInputStream3 = new EncryptedFileInputStream(file2, this.c.r);
                                                                bitmap4 = bitmap6;
                                                            }
                                                            rect = null;
                                                            r8 = r8;
                                                            r14 = bitmap4;
                                                        } catch (Throwable th23) {
                                                            th = th23;
                                                            z16 = false;
                                                            r8 = r8;
                                                            i27 = 0;
                                                            cc4.g(th, !(th instanceof FileNotFoundException));
                                                            i2 = i27;
                                                            i3 = r8;
                                                            Thread.interrupted();
                                                            if (f11.a) {
                                                            }
                                                            if (bitmap2 != null) {
                                                            }
                                                            str3 = this.c.f;
                                                            if (str3 == null) {
                                                            }
                                                            c(bitmap2 != null ? new p74(bitmap2, i3, i2) : null);
                                                            return;
                                                        }
                                                    } else {
                                                        r14 = bitmap2;
                                                        r8 = 0;
                                                        rect = null;
                                                        i27 = 0;
                                                    }
                                                    bitmap2 = BitmapFactory.decodeStream(encryptedFileInputStream3, rect, options);
                                                    try {
                                                        encryptedFileInputStream3.close();
                                                        r8 = r8;
                                                    } catch (Throwable th24) {
                                                        th = th24;
                                                        z16 = false;
                                                        cc4.g(th, !(th instanceof FileNotFoundException));
                                                        i2 = i27;
                                                        i3 = r8;
                                                        Thread.interrupted();
                                                        if (f11.a) {
                                                        }
                                                        if (bitmap2 != null) {
                                                        }
                                                        str3 = this.c.f;
                                                        if (str3 == null) {
                                                        }
                                                        c(bitmap2 != null ? new p74(bitmap2, i3, i2) : null);
                                                        return;
                                                    }
                                                } catch (Throwable th25) {
                                                    th = th25;
                                                    bitmap2 = r14;
                                                }
                                            } else {
                                                r8 = 0;
                                                i27 = 0;
                                            }
                                            if (bitmap2 != null || (py9Var == null && !z7)) {
                                                bitmap3 = bitmap2;
                                                z19 = z5;
                                            } else {
                                                try {
                                                    RandomAccessFile randomAccessFile5 = new RandomAccessFile(file2, "r");
                                                    z19 = z5;
                                                    try {
                                                        int length3 = (int) randomAccessFile5.length();
                                                        ThreadLocal threadLocal3 = in5.I;
                                                        byte[] bArr6 = (byte[]) threadLocal3.get();
                                                        if (bArr6 == null || bArr6.length < length3) {
                                                            bArr6 = null;
                                                        }
                                                        if (bArr6 == null) {
                                                            bArr6 = new byte[length3];
                                                            threadLocal3.set(bArr6);
                                                        }
                                                        bitmap3 = null;
                                                        randomAccessFile5.readFully(bArr6, 0, length3);
                                                        randomAccessFile5.close();
                                                        try {
                                                            if (py9Var != null) {
                                                                EncryptedFileInputStream.decryptBytesWithKeyFile(bArr6, 0, length3, py9Var);
                                                                bitmap3 = bitmap2;
                                                                z20 = bArr == null || !Arrays.equals(Utilities.o((long) length3, bArr6), bArr);
                                                                i4 = bArr6[0] & 255;
                                                                length3 -= i4;
                                                            } else {
                                                                bitmap3 = bitmap2;
                                                                if (z7) {
                                                                    EncryptedFileInputStream.decryptBytesWithKeyFile(bArr6, 0, length3, this.c.r);
                                                                }
                                                                z20 = false;
                                                                i4 = 0;
                                                            }
                                                            if (!z20) {
                                                                bitmap2 = BitmapFactory.decodeByteArray(bArr6, i4, length3, options);
                                                                r8 = r8;
                                                                z18 = z19;
                                                            }
                                                        } catch (Throwable th26) {
                                                            th = th26;
                                                            try {
                                                                cc4.f(th);
                                                                bitmap2 = bitmap3;
                                                                r8 = r8;
                                                                z18 = z19;
                                                                if (bitmap2 == null) {
                                                                }
                                                                z16 = false;
                                                            } catch (Throwable th27) {
                                                                th = th27;
                                                                bitmap2 = bitmap3;
                                                                z16 = false;
                                                                cc4.g(th, !(th instanceof FileNotFoundException));
                                                                i2 = i27;
                                                                i3 = r8;
                                                                Thread.interrupted();
                                                                if (f11.a) {
                                                                }
                                                                if (bitmap2 != null) {
                                                                }
                                                                str3 = this.c.f;
                                                                if (str3 == null) {
                                                                }
                                                                c(bitmap2 != null ? new p74(bitmap2, i3, i2) : null);
                                                                return;
                                                            }
                                                            i2 = i27;
                                                            i3 = r8;
                                                            Thread.interrupted();
                                                            if (f11.a) {
                                                            }
                                                            if (bitmap2 != null) {
                                                            }
                                                            str3 = this.c.f;
                                                            if (str3 == null) {
                                                            }
                                                            c(bitmap2 != null ? new p74(bitmap2, i3, i2) : null);
                                                            return;
                                                        }
                                                    } catch (Throwable th28) {
                                                        th = th28;
                                                        bitmap3 = bitmap2;
                                                    }
                                                } catch (Throwable th29) {
                                                    th = th29;
                                                    bitmap3 = bitmap2;
                                                    z19 = z5;
                                                }
                                            }
                                            bitmap2 = bitmap3;
                                            r8 = r8;
                                            z18 = z19;
                                        } else {
                                            z18 = z5;
                                            r8 = 0;
                                            i27 = 0;
                                        }
                                        if (bitmap2 == null) {
                                            if (z18 && (file2.length() == 0 || this.c.f == null)) {
                                                file2.delete();
                                            }
                                        } else if (this.c.f != null) {
                                            float width2 = bitmap2.getWidth();
                                            float height2 = bitmap2.getHeight();
                                            if (f2 != 0.0f && width2 != f2 && width2 > f2 + 20.0f) {
                                                if (width2 <= height2 || f2 <= f622222222) {
                                                    float f10 = height2 / f622222222;
                                                    if (f10 > 1.0f) {
                                                        createScaledBitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width2 / f10), (int) f622222222, true);
                                                        if (bitmap2 != createScaledBitmap2) {
                                                            bitmap2.recycle();
                                                            bitmap2 = createScaledBitmap2;
                                                        }
                                                    }
                                                    createScaledBitmap2 = bitmap2;
                                                    if (bitmap2 != createScaledBitmap2) {
                                                    }
                                                } else {
                                                    float f11 = width2 / f2;
                                                    if (f11 > 1.0f) {
                                                        createScaledBitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) f2, (int) (height2 / f11), true);
                                                        if (bitmap2 != createScaledBitmap2) {
                                                        }
                                                    }
                                                    createScaledBitmap2 = bitmap2;
                                                    if (bitmap2 != createScaledBitmap2) {
                                                    }
                                                }
                                            }
                                            if (bitmap2 != null) {
                                                if (z47) {
                                                    Bitmap createScaledBitmap3 = bitmap2.getWidth() * bitmap2.getHeight() > 22500 ? Bitmap.createScaledBitmap(bitmap2, 100, 100, false) : bitmap2;
                                                    boolean z56 = Utilities.needInvert(createScaledBitmap3) != 0;
                                                    if (createScaledBitmap3 != bitmap2) {
                                                        try {
                                                            createScaledBitmap3.recycle();
                                                        } catch (Throwable th30) {
                                                            th = th30;
                                                            z16 = z56;
                                                            cc4.g(th, !(th instanceof FileNotFoundException));
                                                            i2 = i27;
                                                            i3 = r8;
                                                            Thread.interrupted();
                                                            if (f11.a) {
                                                            }
                                                            if (bitmap2 != null) {
                                                            }
                                                            str3 = this.c.f;
                                                            if (str3 == null) {
                                                            }
                                                            c(bitmap2 != null ? new p74(bitmap2, i3, i2) : null);
                                                            return;
                                                        }
                                                    }
                                                    z16 = z56;
                                                } else {
                                                    z16 = false;
                                                }
                                                if (z55 && (height2 > 100.0f || width2 > 100.0f)) {
                                                    try {
                                                        height2 = 80.0f;
                                                        bitmap2 = Bitmap.createScaledBitmap(bitmap2, 80, 80, false);
                                                        width2 = 80.0f;
                                                    } catch (Throwable th31) {
                                                        th = th31;
                                                        cc4.g(th, !(th instanceof FileNotFoundException));
                                                        i2 = i27;
                                                        i3 = r8;
                                                        Thread.interrupted();
                                                        if (f11.a) {
                                                        }
                                                        if (bitmap2 != null) {
                                                        }
                                                        str3 = this.c.f;
                                                        if (str3 == null) {
                                                        }
                                                        c(bitmap2 != null ? new p74(bitmap2, i3, i2) : null);
                                                        return;
                                                    }
                                                }
                                                if (z55 && height2 < 100.0f && width2 < 100.0f && bitmap2.getConfig() == Bitmap.Config.ARGB_8888) {
                                                    Utilities.blurBitmap(bitmap2, 3);
                                                }
                                                i2 = i27;
                                                i3 = r8;
                                            }
                                        }
                                        z16 = false;
                                        i2 = i27;
                                        i3 = r8;
                                    }
                                }
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = false;
                                if (l2 != null) {
                                    if (z6) {
                                    }
                                }
                                if (bitmap2 != null) {
                                }
                                if (bitmap2 == null) {
                                }
                                z16 = false;
                                i2 = i27;
                                i3 = r8;
                            }
                        }
                        Thread.interrupted();
                        if (f11.a && z7) {
                            StringBuilder sb = new StringBuilder("Image Loader image is empty = ");
                            sb.append(bitmap2 != null);
                            sb.append(" ");
                            sb.append(file2);
                            cc4.d(sb.toString());
                        }
                        if (bitmap2 != null && !TextUtils.isEmpty(this.c.f) && this.c.f.contains("wallpaper")) {
                            obj2 = this.c.j;
                            if (obj2 instanceof TLRPC.WallPaper) {
                                bitmap2 = a(bitmap2, (TLRPC.WallPaper) obj2);
                            }
                        }
                        str3 = this.c.f;
                        if ((str3 == null && str3.contains("ignoreOrientation")) || (!z16 && i3 == 0 && i2 == 0)) {
                            c(bitmap2 != null ? new BitmapDrawable(bitmap2) : null);
                            return;
                        } else {
                            c(bitmap2 != null ? new p74(bitmap2, i3, i2) : null);
                            return;
                        }
                    }
                    z3 = true;
                    z4 = false;
                    str = null;
                    l = null;
                    z6 = z4;
                    z5 = z3;
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = 1;
                    boolean z512 = this.e.z;
                    str5 = this.c.f;
                    if (str5 == null) {
                    }
                    i = 1;
                    r14 = z22;
                    z15 = z21;
                    float f6222222222 = f3;
                    if (this.c.m != i) {
                    }
                    Thread.interrupted();
                    if (f11.a) {
                        StringBuilder sb2 = new StringBuilder("Image Loader image is empty = ");
                        sb2.append(bitmap2 != null);
                        sb2.append(" ");
                        sb2.append(file2);
                        cc4.d(sb2.toString());
                    }
                    if (bitmap2 != null) {
                        obj2 = this.c.j;
                        if (obj2 instanceof TLRPC.WallPaper) {
                        }
                    }
                    str3 = this.c.f;
                    if (str3 == null) {
                    }
                    c(bitmap2 != null ? new p74(bitmap2, i3, i2) : null);
                    return;
                }
                long j2 = jn5Var.j;
                String str15 = wm5Var.f;
                if (str15 != null) {
                    String[] split4 = str15.split("_");
                    if (split4.length >= 2) {
                        float parseFloat5 = Float.parseFloat(split4[0]);
                        float parseFloat6 = Float.parseFloat(split4[1]);
                        if (parseFloat5 <= 90.0f && parseFloat6 <= 90.0f && !this.c.f.contains("nolimit")) {
                            z28 = true;
                            i10 = 0;
                            z35 = false;
                            boolean z57 = false;
                            boolean z58 = false;
                            boolean z59 = false;
                            while (i10 < split4.length) {
                                boolean z60 = z57;
                                if ("pcache".equals(split4[i10])) {
                                    z60 = true;
                                }
                                if ("firstframe".equals(split4[i10])) {
                                    z35 = true;
                                }
                                boolean z61 = z59;
                                if ("nostream".equals(split4[i10])) {
                                    z61 = true;
                                }
                                if ("pframe".equals(split4[i10])) {
                                    z58 = true;
                                }
                                i10++;
                                z57 = z60;
                                z58 = z58;
                                z59 = z61;
                            }
                            if (z35) {
                                z59 = true;
                            }
                            z32 = z35;
                            z29 = z57;
                            z30 = z58;
                            z31 = z59;
                        }
                    }
                    z28 = false;
                    i10 = 0;
                    z35 = false;
                    boolean z572 = false;
                    boolean z582 = false;
                    boolean z592 = false;
                    while (i10 < split4.length) {
                    }
                    if (z35) {
                    }
                    z32 = z35;
                    z29 = z572;
                    z30 = z582;
                    z31 = z592;
                } else {
                    z28 = false;
                    z29 = false;
                    z30 = false;
                    z31 = false;
                    z32 = false;
                }
                if (z30) {
                    try {
                        mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(this.c.p.getAbsolutePath());
                        bitmap5 = mediaMetadataRetriever.getFrameAtTime(2L);
                    } catch (Exception e5) {
                        e = e5;
                        bitmap5 = null;
                    }
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Exception e6) {
                        e = e6;
                        e.printStackTrace();
                        Thread.interrupted();
                        if (bitmap5 != null) {
                        }
                    }
                    Thread.interrupted();
                    if (bitmap5 != null) {
                        c(null);
                        return;
                    } else {
                        c(new BitmapDrawable(bitmap5));
                        return;
                    }
                }
                if (!z29 || z32) {
                    bk0Var = null;
                } else {
                    bk0 bk0Var4 = new bk0();
                    String str16 = this.c.f;
                    if (str16 != null && str16.contains("compress")) {
                        bk0Var4.a = (byte) 60;
                    }
                    bk0Var = bk0Var4;
                }
                if (in5.E(this.c.f) || "g".equals(this.c.f) || "gl".equals(this.c.f)) {
                    TLRPC.Document document = this.c.i.i;
                    if (!(document instanceof TLRPC.TL_documentEncrypted) && !z29) {
                        TLRPC.Document document2 = ik8.A(document) ? this.c.i.i : null;
                        wm5 wm5Var7 = this.c;
                        if (document2 != null) {
                            j = wm5Var7.k;
                            i7 = 1;
                        } else {
                            j = wm5Var7.i.r;
                            i7 = 0;
                        }
                        int i36 = wm5Var7.n;
                        int i37 = i36 > 1 ? i36 : i7;
                        wm5 wm5Var8 = this.c;
                        lm lmVar3 = new lm(wm5Var8.p, z32, z31 ? 0L : j, wm5Var8.a ? 1 : 0, z31 ? null : document2, (document2 != null || z31) ? null : wm5Var8.i, wm5Var8.j, j2, wm5Var8.o, false, 0, 0, bk0Var, i37, !"gl".equals(wm5Var8.f));
                        z33 = z32;
                        boolean z62 = (document2 != null && "video/webm".equals(document2.mime_type)) || r47.M4(document2) || in5.E(this.c.f);
                        lmVar3.o0 = z62;
                        if (z62) {
                            lmVar3.b = false;
                            lmVar3.w0 = true;
                        }
                        lmVar = lmVar3;
                        if (!z33) {
                            lmVar.A(z28);
                            Thread.interrupted();
                            c(lmVar);
                            return;
                        }
                        Bitmap q = lmVar.q(0L, false);
                        Thread.interrupted();
                        lmVar.u();
                        if (q == null) {
                            c(null);
                            return;
                        } else {
                            c(new BitmapDrawable(q));
                            return;
                        }
                    }
                }
                z33 = z32;
                String str17 = this.c.f;
                if (str17 != null) {
                    String[] split5 = str17.split("_");
                    if (split5.length >= 2) {
                        float parseFloat7 = Float.parseFloat(split5[0]);
                        float parseFloat8 = Float.parseFloat(split5[1]);
                        float f12 = hl.p;
                        i9 = (int) (parseFloat8 * f12);
                        i8 = (int) (parseFloat7 * f12);
                        boolean z63 = !z33 || ((str7 = this.c.f) != null && ("d".equals(str7) || this.c.f.contains("_d")));
                        int i38 = (!z31 ? null : this.c.i.i) == null ? 1 : 0;
                        int i39 = this.c.n;
                        int i40 = i39 <= 1 ? i39 : i38;
                        wm5 wm5Var9 = this.c;
                        lmVar = new lm(wm5Var9.p, z63, 0L, wm5Var9.a ? 1 : 0, !z31 ? null : wm5Var9.i.i, null, null, j2, wm5Var9.o, false, i8, i9, bk0Var, i40, true);
                        TLRPC.Document document3 = this.c.i.i;
                        z34 = (document3 == null && "video/webm".equals(document3.mime_type)) || r47.M4(this.c.i.i) || in5.E(this.c.f);
                        lmVar.o0 = z34;
                        if (z34) {
                            lmVar.b = false;
                            lmVar.w0 = true;
                        }
                        if (!z33) {
                        }
                    }
                }
                i8 = 0;
                i9 = 0;
                if (z33) {
                }
                if ((!z31 ? null : this.c.i.i) == null) {
                }
                int i392 = this.c.n;
                if (i392 <= 1) {
                }
                wm5 wm5Var92 = this.c;
                lmVar = new lm(wm5Var92.p, z63, 0L, wm5Var92.a ? 1 : 0, !z31 ? null : wm5Var92.i.i, null, null, j2, wm5Var92.o, false, i8, i9, bk0Var, i40, true);
                TLRPC.Document document32 = this.c.i.i;
                if (document32 == null) {
                }
                lmVar.o0 = z34;
                if (z34) {
                }
                if (!z33) {
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            d();
            synchronized (this.b) {
                this.a = null;
            }
            Thread.interrupted();
        } catch (Throwable th) {
            synchronized (this.b) {
                this.a = null;
                Thread.interrupted();
                throw th;
            }
        }
    }
}
