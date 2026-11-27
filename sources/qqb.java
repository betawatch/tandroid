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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qqb extends BitmapDrawable {
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
    public qqb(File file, kp3 kp3Var) {
        super(r9);
        int i;
        int i2;
        int i3;
        BitmapDrawable bitmapDrawable;
        int i4;
        t37[] t37VarArr;
        hh7 hh7Var;
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
        Bitmap a = lc1.a(560, 678);
        Canvas canvas = new Canvas(a);
        SparseIntArray R0 = aob.R0(null, kp3Var.c.d, null);
        SparseIntArray clone = R0.clone();
        kp3Var.d.d(R0, clone);
        int G0 = aob.G0(clone, aob.s8);
        int G02 = aob.G0(clone, aob.v8);
        int G03 = aob.G0(clone, aob.Je);
        int G04 = aob.G0(clone, aob.Oe);
        int G05 = aob.G0(clone, aob.ra);
        int G06 = aob.G0(clone, aob.rb);
        int i10 = clone.get(aob.Ee);
        int i11 = clone.get(aob.Fe);
        int i12 = clone.get(aob.Ge);
        int i13 = clone.get(aob.He);
        int i14 = clone.get(aob.Ie);
        Drawable mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
        aob.A1(G02, mutate);
        Drawable mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
        aob.A1(G02, mutate2);
        Drawable mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
        aob.A1(G04, mutate3);
        Drawable mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
        aob.A1(G04, mutate4);
        int i15 = 2;
        t37[] t37VarArr2 = new t37[2];
        int i16 = 0;
        while (true) {
            byte b = 1;
            i = i15;
            if (i16 >= i15) {
                break;
            }
            int i17 = G05;
            mnb mnbVar = new mnb(i16 == 1, clone, b);
            t37VarArr2[i16] = mnbVar;
            aob.A1(i16 == 1 ? G06 : i17, mnbVar);
            i16++;
            G05 = i17;
            i15 = i;
        }
        if (i12 != 0) {
            hh7Var = new hh7(i10, i11, i12, i13, true, false);
            i2 = i10;
            i3 = i11;
            i4 = 120;
            t37VarArr = t37VarArr2;
            bitmapDrawable = null;
            i5 = i10;
        } else {
            i2 = i10;
            i3 = i11;
            int width = a.getWidth();
            int height = a.getHeight() - jn7.E1;
            GradientDrawable.Orientation c = yd0.c(i14);
            i4 = 120;
            Resources resources = a.b.getResources();
            Rect d = yd0.d(c, width, height);
            t37VarArr = t37VarArr2;
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Utilities.drawDitheredGradient(createBitmap, new int[]{i2, i3}, d.left, d.top, d.right, d.bottom);
            bitmapDrawable = new BitmapDrawable(resources, createBitmap);
            hh7Var = null;
            i5 = createBitmap;
        }
        int U0 = hl.U0(hl.w0(i2, i3), false);
        if (bitmapDrawable != null) {
            bitmapDrawable.setBounds(0, i4, a.getWidth(), a.getHeight() - 120);
            bitmapDrawable.draw(canvas);
        }
        if (file != null) {
            if ("application/x-tgwallpattern".equals(kp3Var.mime_type)) {
                double[] dArr = hgb.a;
                Bitmap bitmap2 = null;
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                            egb egbVar = new egb(560, 678, null, false, 1.0f, 1);
                            i5 = 1143570432;
                            i9 = 1143570432;
                            try {
                                egbVar.F = true;
                                xMLReader.setContentHandler(egbVar);
                                xMLReader.parse(new InputSource(fileInputStream));
                                Bitmap bitmap3 = egbVar.b;
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
                        cc4.g(e, true);
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
                        t37VarArr[1].setBounds(jn7.q2, jn7.s3, a.getWidth() - 20, jn7.e5);
                        t37VarArr[1].o(i6, 560, 522);
                        t37VarArr[1].draw(canvas);
                        t37VarArr[1].setBounds(jn7.q2, 430, a.getWidth() - 20, 522);
                        t37VarArr[1].o(430, 560, 522);
                        t37VarArr[1].draw(canvas);
                        t37VarArr[i6].setBounds(20, jn7.t5, 399, 415);
                        t37VarArr[i6].o(jn7.t5, 560, 522);
                        t37VarArr[i6].draw(canvas);
                        paint.setColor(G03);
                        canvas.drawRect(0.0f, a.getHeight() - 120, a.getWidth(), a.getHeight(), paint);
                        if (mutate3 != null) {
                        }
                        if (mutate4 != null) {
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    cc4.g(e, true);
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
                    t37VarArr[1].setBounds(jn7.q2, jn7.s3, a.getWidth() - 20, jn7.e5);
                    t37VarArr[1].o(i6, 560, 522);
                    t37VarArr[1].draw(canvas);
                    t37VarArr[1].setBounds(jn7.q2, 430, a.getWidth() - 20, 522);
                    t37VarArr[1].o(430, 560, 522);
                    t37VarArr[1].draw(canvas);
                    t37VarArr[i6].setBounds(20, jn7.t5, 399, 415);
                    t37VarArr[i6].o(jn7.t5, 560, 522);
                    t37VarArr[i6].draw(canvas);
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
                if (hh7Var != null) {
                    hh7Var.r((int) (kp3Var.d.p * 100.0f), decodeFile);
                    hh7Var.setBounds(0, jn7.E1, a.getWidth(), a.getHeight() - jn7.E1);
                    hh7Var.draw(canvas);
                } else {
                    Paint paint2 = new Paint(i);
                    if (kp3Var.d.p >= 0.0f) {
                        paint2.setColorFilter(new PorterDuffColorFilter(U0, PorterDuff.Mode.SRC_IN));
                    }
                    paint2.setAlpha(jn7.d4);
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
        if (bitmap == null || hh7Var == null) {
            i6 = 0;
        } else {
            i6 = 0;
            hh7Var.setBounds(0, jn7.E1, a.getWidth(), a.getHeight() - jn7.E1);
            hh7Var.draw(canvas);
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
        t37VarArr[1].setBounds(jn7.q2, jn7.s3, a.getWidth() - 20, jn7.e5);
        t37VarArr[1].o(i6, 560, 522);
        t37VarArr[1].draw(canvas);
        t37VarArr[1].setBounds(jn7.q2, 430, a.getWidth() - 20, 522);
        t37VarArr[1].o(430, 560, 522);
        t37VarArr[1].draw(canvas);
        t37VarArr[i6].setBounds(20, jn7.t5, 399, 415);
        t37VarArr[i6].o(jn7.t5, 560, 522);
        t37VarArr[i6].draw(canvas);
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
