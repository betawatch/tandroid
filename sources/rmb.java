// default package

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.SparseIntArray;
import java.io.File;
import java.io.FileInputStream;
import javax.xml.parsers.SAXParserFactory;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class rmb extends BitmapDrawable {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rmb(File file, to3 to3Var) {
        super(r9);
        int i;
        int i2;
        int i3;
        BitmapDrawable bitmapDrawable;
        int i4;
        m17[] m17VarArr;
        ye7 ye7Var;
        int i5;
        Bitmap bitmap;
        int i6;
        int i7;
        float f;
        Bitmap decodeFile;
        int i8;
        int i9;
        Paint paint = new Paint();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap a = dc1.a(560, 678);
        Canvas canvas = new Canvas(a);
        SparseIntArray R0 = bkb.R0(null, to3Var.c.d, null);
        SparseIntArray clone = R0.clone();
        to3Var.d.d(R0, clone);
        int G0 = bkb.G0(clone, bkb.r8);
        int G02 = bkb.G0(clone, bkb.u8);
        int G03 = bkb.G0(clone, bkb.Ie);
        int G04 = bkb.G0(clone, bkb.Ne);
        int G05 = bkb.G0(clone, bkb.qa);
        int G06 = bkb.G0(clone, bkb.qb);
        int i10 = clone.get(bkb.De);
        int i11 = clone.get(bkb.Ee);
        int i12 = clone.get(bkb.Fe);
        int i13 = clone.get(bkb.Ge);
        int i14 = clone.get(bkb.He);
        Drawable mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
        bkb.A1(G02, mutate);
        Drawable mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
        bkb.A1(G02, mutate2);
        Drawable mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
        bkb.A1(G04, mutate3);
        Drawable mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
        bkb.A1(G04, mutate4);
        int i15 = 2;
        m17[] m17VarArr2 = new m17[2];
        int i16 = 0;
        while (true) {
            byte b = 1;
            i = i15;
            if (i16 >= i15) {
                break;
            }
            int i17 = G05;
            njb njbVar = new njb(i16 == 1, clone, b);
            m17VarArr2[i16] = njbVar;
            bkb.A1(i16 == 1 ? G06 : i17, njbVar);
            i16++;
            G05 = i17;
            i15 = i;
        }
        if (i12 != 0) {
            ye7Var = new ye7(i10, i11, i12, i13, true, false);
            i2 = i10;
            i3 = i11;
            i4 = 120;
            m17VarArr = m17VarArr2;
            bitmapDrawable = null;
            i5 = i10;
        } else {
            i2 = i10;
            i3 = i11;
            int width = a.getWidth();
            int height = a.getHeight() - 120;
            GradientDrawable.Orientation c = wd0.c(i14);
            i4 = 120;
            Resources resources = a.b.getResources();
            Rect d = wd0.d(c, width, height);
            m17VarArr = m17VarArr2;
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Utilities.drawDitheredGradient(createBitmap, new int[]{i2, i3}, d.left, d.top, d.right, d.bottom);
            bitmapDrawable = new BitmapDrawable(resources, createBitmap);
            ye7Var = null;
            i5 = createBitmap;
        }
        int U0 = gl.U0(gl.w0(i2, i3), false);
        if (bitmapDrawable != null) {
            bitmapDrawable.setBounds(0, i4, a.getWidth(), a.getHeight() - 120);
            bitmapDrawable.draw(canvas);
        }
        if (file != null) {
            if ("application/x-tgwallpattern".equals(to3Var.mime_type)) {
                double[] dArr = lcb.a;
                Bitmap bitmap2 = null;
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                            icb icbVar = new icb(560, 678, null, false, 1.0f, 1);
                            i5 = 1143570432;
                            i9 = 1143570432;
                            try {
                                icbVar.F = true;
                                xMLReader.setContentHandler(icbVar);
                                xMLReader.parse(new InputSource(fileInputStream));
                                Bitmap bitmap3 = icbVar.b;
                                fileInputStream.close();
                                bitmap2 = bitmap3;
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    fileInputStream.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            i5 = 1143570432;
                        }
                    } catch (Exception e) {
                        e = e;
                        i5 = 1143570432;
                        fa4.g(e, true);
                        i9 = i5;
                        decodeFile = bitmap2;
                        f = 560.0f;
                        i7 = i9;
                        if (decodeFile != null) {
                        }
                        bitmap = decodeFile;
                        if (bitmap == null) {
                        }
                        i6 = 0;
                        paint.setColor(G0);
                        canvas.drawRect(0.0f, 0.0f, a.getWidth(), 120.0f, paint);
                        if (mutate != null) {
                        }
                        if (mutate2 != null) {
                        }
                        m17VarArr[1].setBounds(kk7.q2, kk7.s3, a.getWidth() - 20, kk7.e5);
                        m17VarArr[1].o(i6, 560, 522);
                        m17VarArr[1].draw(canvas);
                        m17VarArr[1].setBounds(kk7.q2, 430, a.getWidth() - 20, 522);
                        m17VarArr[1].o(430, 560, 522);
                        m17VarArr[1].draw(canvas);
                        m17VarArr[i6].setBounds(20, kk7.t5, 399, 415);
                        m17VarArr[i6].o(kk7.t5, 560, 522);
                        m17VarArr[i6].draw(canvas);
                        paint.setColor(G03);
                        canvas.drawRect(0.0f, a.getHeight() - 120, a.getWidth(), a.getHeight(), paint);
                        if (mutate3 != null) {
                        }
                        if (mutate4 != null) {
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    fa4.g(e, true);
                    i9 = i5;
                    decodeFile = bitmap2;
                    f = 560.0f;
                    i7 = i9;
                    if (decodeFile != null) {
                    }
                    bitmap = decodeFile;
                    if (bitmap == null) {
                    }
                    i6 = 0;
                    paint.setColor(G0);
                    canvas.drawRect(0.0f, 0.0f, a.getWidth(), 120.0f, paint);
                    if (mutate != null) {
                    }
                    if (mutate2 != null) {
                    }
                    m17VarArr[1].setBounds(kk7.q2, kk7.s3, a.getWidth() - 20, kk7.e5);
                    m17VarArr[1].o(i6, 560, 522);
                    m17VarArr[1].draw(canvas);
                    m17VarArr[1].setBounds(kk7.q2, 430, a.getWidth() - 20, 522);
                    m17VarArr[1].o(430, 560, 522);
                    m17VarArr[1].draw(canvas);
                    m17VarArr[i6].setBounds(20, kk7.t5, 399, 415);
                    m17VarArr[i6].o(kk7.t5, 560, 522);
                    m17VarArr[i6].draw(canvas);
                    paint.setColor(G03);
                    canvas.drawRect(0.0f, a.getHeight() - 120, a.getWidth(), a.getHeight(), paint);
                    if (mutate3 != null) {
                    }
                    if (mutate4 != null) {
                    }
                }
                decodeFile = bitmap2;
                f = 560.0f;
                i7 = i9;
            } else {
                i7 = 1143570432;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 1;
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                float f2 = options.outWidth;
                float f3 = options.outHeight;
                f = 560.0f;
                float min = Math.min(f2 / 560.0f, f3 / 678.0f);
                min = min < 1.2f ? 1.0f : min;
                options.inJustDecodeBounds = false;
                if (min <= 1.0f || (f2 <= 560.0f && f3 <= 678.0f)) {
                    options.inSampleSize = (int) min;
                } else {
                    int i18 = 1;
                    while (true) {
                        i8 = i18 << 1;
                        if ((i18 << 2) >= min) {
                            break;
                        } else {
                            i18 = i8;
                        }
                    }
                    options.inSampleSize = i8;
                }
                decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            }
            if (decodeFile != null) {
                if (ye7Var != null) {
                    ye7Var.r((int) (to3Var.d.p * 100.0f), decodeFile);
                    ye7Var.setBounds(0, 120, a.getWidth(), a.getHeight() - 120);
                    ye7Var.draw(canvas);
                } else {
                    Paint paint2 = new Paint(i);
                    if (to3Var.d.p >= 0.0f) {
                        paint2.setColorFilter(new PorterDuffColorFilter(U0, PorterDuff.Mode.SRC_IN));
                    }
                    paint2.setAlpha(kk7.d4);
                    float max = Math.max(f / decodeFile.getWidth(), i7 / decodeFile.getHeight());
                    int width2 = (int) (decodeFile.getWidth() * max);
                    canvas.save();
                    canvas.translate((560 - width2) / 2, (678 - ((int) (decodeFile.getHeight() * max))) / 2);
                    canvas.scale(max, max);
                    canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint2);
                    canvas.restore();
                }
            }
            bitmap = decodeFile;
        } else {
            bitmap = null;
        }
        if (bitmap == null || ye7Var == null) {
            i6 = 0;
        } else {
            i6 = 0;
            ye7Var.setBounds(0, 120, a.getWidth(), a.getHeight() - 120);
            ye7Var.draw(canvas);
        }
        paint.setColor(G0);
        canvas.drawRect(0.0f, 0.0f, a.getWidth(), 120.0f, paint);
        if (mutate != null) {
            int intrinsicHeight = (120 - mutate.getIntrinsicHeight()) / 2;
            mutate.setBounds(13, intrinsicHeight, mutate.getIntrinsicWidth() + 13, mutate.getIntrinsicHeight() + intrinsicHeight);
            mutate.draw(canvas);
        }
        if (mutate2 != null) {
            int width3 = (a.getWidth() - mutate2.getIntrinsicWidth()) - 10;
            int intrinsicHeight2 = (120 - mutate2.getIntrinsicHeight()) / 2;
            mutate2.setBounds(width3, intrinsicHeight2, mutate2.getIntrinsicWidth() + width3, mutate2.getIntrinsicHeight() + intrinsicHeight2);
            mutate2.draw(canvas);
        }
        m17VarArr[1].setBounds(kk7.q2, kk7.s3, a.getWidth() - 20, kk7.e5);
        m17VarArr[1].o(i6, 560, 522);
        m17VarArr[1].draw(canvas);
        m17VarArr[1].setBounds(kk7.q2, 430, a.getWidth() - 20, 522);
        m17VarArr[1].o(430, 560, 522);
        m17VarArr[1].draw(canvas);
        m17VarArr[i6].setBounds(20, kk7.t5, 399, 415);
        m17VarArr[i6].o(kk7.t5, 560, 522);
        m17VarArr[i6].draw(canvas);
        paint.setColor(G03);
        canvas.drawRect(0.0f, a.getHeight() - 120, a.getWidth(), a.getHeight(), paint);
        if (mutate3 != null) {
            int intrinsicHeight3 = ((120 - mutate3.getIntrinsicHeight()) / 2) + (a.getHeight() - 120);
            mutate3.setBounds(22, intrinsicHeight3, mutate3.getIntrinsicWidth() + 22, mutate3.getIntrinsicHeight() + intrinsicHeight3);
            mutate3.draw(canvas);
        }
        if (mutate4 != null) {
            int width4 = (a.getWidth() - mutate4.getIntrinsicWidth()) - 22;
            int intrinsicHeight4 = ((120 - mutate4.getIntrinsicHeight()) / 2) + (a.getHeight() - 120);
            mutate4.setBounds(width4, intrinsicHeight4, mutate4.getIntrinsicWidth() + width4, mutate4.getIntrinsicHeight() + intrinsicHeight4);
            mutate4.draw(canvas);
        }
    }
}
