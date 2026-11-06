package org.telegram.utils.twidget;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Base64;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.py;
import org.telegram.ui.d10;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
final class WidgetSandboxBackend implements x, c {
    private static final long MEMORY_BUDGET = 33554432;
    private long imageBytes;
    private long layerParseNanos;
    private int nextFont;
    private final h0 owner;
    private m0 text;
    private final ConcurrentHashMap<Integer, Paint> fonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Paint> deviceFonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Bitmap> images = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, d> canvases = new ConcurrentHashMap<>();
    private final HashMap<Integer, JSONArray> pendingLayers = new HashMap<>();
    private HashMap<Long, s> layerContents = new HashMap<>();
    private final y painter = new y();
    private final Rect bounds = new Rect();

    public WidgetSandboxBackend(h0 h0Var) {
        this.owner = h0Var;
    }

    private static void assertWorker() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Native layout and recording must run off UI");
        }
    }

    private void checkCanvasSize(int i7, int i10, int i11) {
        long j3 = i10 * i11;
        if (j3 > 4194304) {
            throw new IllegalArgumentException("Canvas dimensions");
        }
        long j10 = (j3 * 8) + this.imageBytes;
        for (Map.Entry<Integer, d> entry : this.canvases.entrySet()) {
            if (entry.getKey().intValue() != i7) {
                j10 += entry.getValue().o == null ? 0L : r4.getWidth() * r3.o.getHeight() * 8;
            }
        }
        if (j10 > MEMORY_BUDGET) {
            throw new IllegalArgumentException("Canvas memory budget");
        }
    }

    public static String featureSettings(String str) {
        if (str.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : str.split(",")) {
            if (str2.indexOf(61) == 4) {
                String substring = str2.substring(0, 4);
                String substring2 = str2.substring(5);
                if (substring.matches("[\\x20-\\x7e]{4}") && substring.indexOf(34) < 0 && substring2.matches("\\d{1,5}")) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append('\"');
                    sb2.append(substring);
                    sb2.append("\" ");
                    sb2.append(substring2);
                }
            }
        }
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }

    private g0[] layers(JSONObject jSONObject, float f10) {
        int i7;
        JSONArray jSONArray;
        int i10;
        long j3;
        float[] fArr;
        float[] fArr2;
        int i11;
        int i12;
        g fVar;
        JSONArray optJSONArray = jSONObject.optJSONArray("l");
        int i13 = 0;
        int length = optJSONArray == null ? 0 : optJSONArray.length();
        HashMap<Long, s> hashMap = new HashMap<>();
        g0[] g0VarArr = new g0[length];
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i14);
            if (optJSONObject != null) {
                long optLong = optJSONObject.optLong("id");
                long optLong2 = optJSONObject.optLong("cv");
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("b");
                if (optJSONArray2 != null) {
                    double optDouble = optJSONArray2.optDouble(i13);
                    i7 = length;
                    double d = f10;
                    jSONArray = optJSONArray;
                    int floor = (int) Math.floor(optDouble * d);
                    int floor2 = (int) Math.floor(optJSONArray2.optDouble(1) * d);
                    int ceil = (int) Math.ceil((optJSONArray2.optDouble(2) + optJSONArray2.optDouble(0)) * d);
                    int ceil2 = (int) Math.ceil((optJSONArray2.optDouble(3) + optJSONArray2.optDouble(1)) * d);
                    s sVar = this.layerContents.get(Long.valueOf(optLong));
                    JSONArray jSONArray2 = this.pendingLayers.get(Integer.valueOf(i14));
                    if (jSONArray2 != null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            g eVar = new e("widget-sandbox-layer", floor, floor2, ceil, ceil2);
                            i12 = floor;
                            i11 = floor2;
                            i10 = i14;
                            j3 = optLong;
                            fVar = eVar;
                        } else {
                            i10 = i14;
                            j3 = optLong;
                            i11 = floor2;
                            i12 = floor;
                            fVar = new f(i12, i11, ceil, ceil2);
                        }
                        Canvas a10 = fVar.a();
                        try {
                            a10.translate(-i12, -i11);
                            a10.scale(f10, f10);
                            this.painter.f(a10, jSONArray2, this, f10);
                            fVar.e();
                            sVar = new s(fVar, (int) optLong2);
                        } catch (Throwable th2) {
                            fVar.e();
                            throw th2;
                        }
                    } else {
                        i10 = i14;
                        j3 = optLong;
                        if (sVar != null) {
                            if (sVar.b != ((int) optLong2)) {
                            }
                        }
                        i14 = i10 + 1;
                        length = i7;
                        optJSONArray = jSONArray;
                        i13 = 0;
                    }
                    hashMap.put(Long.valueOf(j3), sVar);
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("l");
                    float[] fArr3 = null;
                    if (optJSONArray3 != null) {
                        float[] fArr4 = new float[4];
                        y.d(optJSONArray3, fArr4, 4, new float[0]);
                        JSONArray optJSONArray4 = optJSONObject.optJSONArray("q");
                        if (optJSONArray4 != null) {
                            fArr3 = new float[8];
                            y.d(optJSONArray4, fArr3, 8, new float[0]);
                        }
                        fArr2 = fArr3;
                        fArr = fArr4;
                    } else {
                        fArr = null;
                        fArr2 = null;
                    }
                    JSONArray optJSONArray5 = optJSONObject.optJSONArray("k");
                    int length2 = optJSONArray5 == null ? 0 : (optJSONArray5.length() / 8) * 8;
                    float[] fArr5 = new float[length2];
                    y.d(optJSONArray5, fArr5, length2, new float[0]);
                    int i16 = i15 + 1;
                    g0VarArr[i15] = new g0(sVar.a, fArr, fArr2, optJSONObject.optDouble("ts"), optJSONObject.optDouble("td"), optJSONObject.optInt("tr") != 0, fArr5);
                    i15 = i16;
                    i14 = i10 + 1;
                    length = i7;
                    optJSONArray = jSONArray;
                    i13 = 0;
                }
            }
            jSONArray = optJSONArray;
            i7 = length;
            i10 = i14;
            i14 = i10 + 1;
            length = i7;
            optJSONArray = jSONArray;
            i13 = 0;
        }
        int i17 = length;
        this.layerContents = hashMap;
        if (i15 == i17) {
            return g0VarArr;
        }
        g0[] g0VarArr2 = new g0[i15];
        System.arraycopy(g0VarArr, 0, g0VarArr2, 0, i15);
        return g0VarArr2;
    }

    private static String text(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0167, code lost:
    
        r0 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Typeface typeface(String str, int i7, boolean z9) {
        Typeface typeface;
        Typeface typeface2 = Typeface.SANS_SERIF;
        String[] split = str.split(",");
        int length = split.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                String lowerCase = split[i10].trim().replace("\"", "").replace("'", "").toLowerCase(Locale.ROOT);
                if (!lowerCase.isEmpty()) {
                    switch (lowerCase) {
                        case "sans-serif":
                        case "roboto":
                        case "ui-sans-serif":
                        case "blinkmacsystemfont":
                        case "helvetica neue":
                        case "arial":
                        case "inter":
                        case "segoe ui":
                        case "system-ui":
                        case "helvetica":
                        case "-apple-system":
                            typeface = Typeface.SANS_SERIF;
                            break;
                        case "monospace":
                        case "consolas":
                        case "courier new":
                        case "menlo":
                        case "ui-monospace":
                        case "sf mono":
                            typeface = Typeface.MONOSPACE;
                            break;
                        case "times new roman":
                        case "georgia":
                        case "serif":
                        case "times":
                        case "ui-serif":
                            typeface = Typeface.SERIF;
                            break;
                        default:
                            typeface2 = Typeface.create(lowerCase, 0);
                            if (typeface2 != Typeface.DEFAULT) {
                                break;
                            } else {
                                break;
                            }
                    }
                }
                i10++;
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Typeface.create(typeface2, Math.max(1, Math.min(1000, i7)), z9);
        }
        return Typeface.create(typeface2, (i7 < 600 ? 0 : 1) | (z9 ? 2 : 0));
    }

    @Override // org.telegram.utils.twidget.x
    public Bitmap canvas(int i7) {
        d dVar = this.canvases.get(Integer.valueOf(i7));
        if (dVar == null) {
            return null;
        }
        synchronized (dVar) {
            try {
                Bitmap bitmap = dVar.o;
                if (bitmap == null) {
                    return null;
                }
                if (dVar.s == dVar.r) {
                    if (dVar.p == null) {
                    }
                    return dVar.p;
                }
                dVar.p = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                dVar.s = dVar.r;
                return dVar.p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.utils.twidget.c
    public Bitmap canvasBitmap(int i7) {
        d dVar = this.canvases.get(Integer.valueOf(i7));
        if (dVar == null) {
            return null;
        }
        return dVar.o;
    }

    public byte[] canvasRead(int i7, int i10, int i11, int i12, int i13) {
        int i14 = i10;
        assertWorker();
        if (i12 <= 0 || i13 <= 0 || i12 * i13 > 4194304) {
            return null;
        }
        d dVar = this.canvases.get(Integer.valueOf(i7));
        if (dVar == null) {
            return new byte[i12 * i13 * 4];
        }
        byte[] bArr = new byte[Math.max(i13, 0) * Math.max(i12, 0) * 4];
        if (dVar.o != null) {
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i11);
            int min = Math.min(dVar.o.getWidth(), i14 + i12);
            int min2 = Math.min(dVar.o.getHeight(), i13 + i11);
            if (min > max && min2 > max2) {
                int i15 = min - max;
                int i16 = min2 - max2;
                int[] iArr = new int[i15 * i16];
                dVar.o.getPixels(iArr, 0, i15, max, max2, i15, i16);
                int i17 = max2;
                while (i17 < min2) {
                    int i18 = max;
                    while (i18 < min) {
                        int i19 = iArr[(i18 - max) + ((i17 - max2) * i15)];
                        int i20 = ((i18 - i14) + ((i17 - i11) * i12)) * 4;
                        bArr[i20] = (byte) Color.red(i19);
                        bArr[i20 + 1] = (byte) Color.green(i19);
                        bArr[i20 + 2] = (byte) Color.blue(i19);
                        bArr[i20 + 3] = (byte) Color.alpha(i19);
                        i18++;
                        i14 = i10;
                    }
                    i17++;
                    i14 = i10;
                }
            }
        }
        return bArr;
    }

    public void canvasRelease(int i7) {
        assertWorker();
        d remove = this.canvases.remove(Integer.valueOf(i7));
        if (remove != null) {
            synchronized (remove) {
                try {
                    Bitmap bitmap = remove.o;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    remove.o = null;
                    remove.q = null;
                    remove.p = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[Catch: all -> 0x003b, LOOP:0: B:17:0x005a->B:19:0x005f, LOOP_END, TryCatch #0 {all -> 0x003b, blocks: (B:9:0x0028, B:11:0x002c, B:13:0x0032, B:16:0x0055, B:17:0x005a, B:19:0x005f, B:21:0x0063, B:26:0x003d, B:28:0x0041, B:29:0x0044), top: B:8:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void canvasRun(int i7, int i10, int i11, int[] iArr) {
        assertWorker();
        if (i10 <= 0 || i11 <= 0) {
            canvasRelease(i7);
            return;
        }
        checkCanvasSize(i7, i10, i11);
        d dVar = this.canvases.get(Integer.valueOf(i7));
        if (dVar == null) {
            dVar = new d(i7);
            this.canvases.put(Integer.valueOf(i7), dVar);
        }
        synchronized (dVar) {
            try {
                Bitmap bitmap = dVar.o;
                if (bitmap != null) {
                    if (bitmap.getWidth() == i10) {
                        if (dVar.o.getHeight() != i11) {
                        }
                        dVar.t = iArr;
                        dVar.u = 0;
                        while (dVar.u < iArr.length) {
                            dVar.g(this);
                        }
                        dVar.t = null;
                        dVar.r++;
                    }
                }
                Bitmap bitmap2 = dVar.o;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                dVar.o = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                dVar.q = new Canvas(dVar.o);
                dVar.t = iArr;
                dVar.u = 0;
                while (dVar.u < iArr.length) {
                }
                dVar.t = null;
                dVar.r++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public float[] createFont(byte[] bArr, float f10, int i7, boolean z9, byte[] bArr2) {
        assertWorker();
        Paint paint = new Paint(qs.N1);
        paint.setTextSize(f10);
        paint.setTypeface(typeface(text(bArr), i7, z9));
        String featureSettings = featureSettings(text(bArr2));
        if (featureSettings != null) {
            paint.setFontFeatureSettings(featureSettings);
        }
        float f11 = this.owner.j;
        Paint paint2 = new Paint(paint);
        paint2.setTextSize(f10 * f11);
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        int i10 = this.nextFont + 1;
        this.nextFont = i10;
        this.fonts.put(Integer.valueOf(i10), paint);
        this.deviceFonts.put(Integer.valueOf(i10), paint2);
        paint2.getTextBounds("x", 0, 1, this.bounds);
        float f12 = fontMetrics.ascent;
        float f13 = fontMetrics.descent;
        return new float[]{i10, (-f12) / f11, f13 / f11, ((f13 - f12) + fontMetrics.leading) / f11, this.bounds.height() / f11, paint2.measureText("0") / f11};
    }

    public void deleteFont(int i7) {
        this.fonts.remove(Integer.valueOf(i7));
        this.deviceFonts.remove(Integer.valueOf(i7));
    }

    @Override // org.telegram.utils.twidget.x
    public Paint deviceFont(int i7) {
        return this.deviceFonts.get(Integer.valueOf(i7));
    }

    @Override // org.telegram.utils.twidget.c
    public Paint font(int i7) {
        return this.fonts.get(Integer.valueOf(i7));
    }

    public byte[] formatIntl(byte[] bArr) {
        return t.b(text(bArr)).getBytes(StandardCharsets.UTF_8);
    }

    @Override // org.telegram.utils.twidget.x, org.telegram.utils.twidget.c
    public Bitmap image(int i7) {
        return this.images.get(Integer.valueOf(i7));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a3 A[Catch: all -> 0x01bd, TryCatch #2 {all -> 0x01bd, blocks: (B:76:0x0198, B:78:0x01a3, B:80:0x01af, B:83:0x01b7, B:84:0x01c1, B:85:0x01ca, B:87:0x01d0, B:91:0x01d8, B:93:0x01de, B:126:0x01f0, B:129:0x01fe, B:131:0x0214, B:133:0x021e, B:135:0x0227, B:155:0x0262, B:157:0x0270, B:159:0x0276), top: B:75:0x0198 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float[] loadImage(int i7, byte[] bArr) {
        int i10;
        BitmapFactory.Options options;
        Bitmap bitmap;
        int i11;
        int i12;
        long j3;
        ByteArrayOutputStream byteArrayOutputStream;
        int i13;
        ByteArrayOutputStream byteArrayOutputStream2;
        byte[] bArr2;
        long j10;
        long j11;
        int a10;
        int i14;
        int i15;
        byte[] bArr3;
        boolean z9;
        boolean z10;
        int i16;
        long a11;
        int i17;
        String text = text(bArr);
        int indexOf = text.indexOf(44);
        if (!text.startsWith("data:") || indexOf < 0 || text.length() > 2097152) {
            return null;
        }
        String substring = text.substring(5, indexOf);
        if (substring.contains("svg")) {
            return null;
        }
        try {
            String substring2 = text.substring(indexOf + 1);
            byte[] decode = substring.contains(";base64") ? Base64.decode(substring2, 0) : URLDecoder.decode(substring2, "UTF-8").getBytes(StandardCharsets.ISO_8859_1);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(decode, 0, decode.length, options2);
            int i18 = options2.outWidth;
            if (i18 <= 0 || (i10 = options2.outHeight) <= 0 || i18 * i10 > 4194304) {
                return null;
            }
            if (this.imageBytes + (i18 * i10 * 4) > MEMORY_BUDGET) {
                return null;
            }
            options2.inJustDecodeBounds = false;
            int length = decode.length;
            if (length >= 33) {
                int i19 = 0;
                while (true) {
                    byte[] bArr4 = q.a;
                    if (i19 < 8) {
                        if (decode[i19] != bArr4[i19]) {
                            break;
                        }
                        i19++;
                    } else if (q.c(12, "IHDR", decode) && q.a(8, decode) >= 13) {
                        long a12 = q.a(16, decode);
                        long a13 = q.a(20, decode);
                        int i20 = decode[24] & 255;
                        int i21 = decode[25] & 255;
                        int i22 = decode[28] & 255;
                        if (i21 != 0) {
                            i11 = 3;
                            if (i21 != 3) {
                                if (i21 != 2) {
                                    i11 = i21 == 4 ? 2 : i21 == 6 ? 4 : 0;
                                }
                                if (i11 != 0 && i22 == 0 && a12 > 0 && a13 > 0 && a12 * a13 <= 4194304) {
                                    CRC32 crc32 = new CRC32();
                                    i12 = 8;
                                    while (true) {
                                        options = options2;
                                        if (i12 + 12 <= length) {
                                            j3 = a13;
                                            break;
                                        }
                                        a11 = q.a(i12, decode);
                                        i17 = i12;
                                        j3 = a13;
                                        if (a11 <= (length - i12) - 12) {
                                            int i23 = i17 + 4;
                                            if (q.c(i23, "IEND", decode)) {
                                                break;
                                            }
                                            if (q.c(i23, "IDAT", decode)) {
                                                crc32.reset();
                                                int i24 = (int) a11;
                                                crc32.update(decode, i23, i24 + 4);
                                                if (crc32.getValue() != q.a(i17 + 8 + i24, decode)) {
                                                    break;
                                                }
                                            }
                                            i12 = ((int) a11) + 12 + i17;
                                            options2 = options;
                                            a13 = j3;
                                        } else {
                                            break;
                                        }
                                    }
                                    int i25 = (int) (((((i11 * a12) * i20) + 7) / 8) + 1);
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                    Inflater inflater = new Inflater(true);
                                    byte[] bArr5 = new byte[TLObject.FLAG_14];
                                    long j12 = 0;
                                    i13 = 8;
                                    boolean z11 = true;
                                    while (i13 + 12 <= length && j12 < j3) {
                                        bArr2 = bArr4;
                                        j10 = a12;
                                        try {
                                            a10 = (int) q.a(i13, decode);
                                            if (a10 > (length - i13) - 12) {
                                                int i26 = i13 + 4;
                                                if (!q.c(i26, "IEND", decode)) {
                                                    if (q.c(i26, "IDAT", decode)) {
                                                        int min = z11 ? Math.min(2, a10) : 0;
                                                        inflater.setInput(decode, i13 + 8 + min, a10 - min);
                                                        boolean z12 = false;
                                                        while (!inflater.needsInput() && !inflater.finished() && !z12) {
                                                            try {
                                                                int inflate = inflater.inflate(bArr5);
                                                                if (inflate == 0 && inflater.needsDictionary()) {
                                                                    break;
                                                                }
                                                                i14 = length;
                                                                byteArrayOutputStream.write(bArr5, 0, inflate);
                                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                                while (true) {
                                                                    if (j12 >= j3) {
                                                                        byteArrayOutputStream2 = byteArrayOutputStream;
                                                                        i15 = a10;
                                                                        z10 = z12;
                                                                        i16 = inflate;
                                                                        bArr3 = bArr5;
                                                                        break;
                                                                    }
                                                                    i15 = a10;
                                                                    z10 = z12;
                                                                    long j13 = i25;
                                                                    long j14 = j12 * j13;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream;
                                                                    i16 = inflate;
                                                                    bArr3 = bArr5;
                                                                    if (j14 >= byteArray.length) {
                                                                        break;
                                                                    }
                                                                    if ((byteArray[(int) j14] & 255) > 4) {
                                                                        z12 = true;
                                                                        break;
                                                                    }
                                                                    if (j14 + j13 > byteArray.length) {
                                                                        break;
                                                                    }
                                                                    j12++;
                                                                    z12 = z10;
                                                                    a10 = i15;
                                                                    byteArrayOutputStream = byteArrayOutputStream2;
                                                                    bArr5 = bArr3;
                                                                    inflate = i16;
                                                                }
                                                                z12 = z10;
                                                                if (i16 == 0) {
                                                                    z9 = z12;
                                                                    break;
                                                                }
                                                                length = i14;
                                                                a10 = i15;
                                                                byteArrayOutputStream = byteArrayOutputStream2;
                                                                bArr5 = bArr3;
                                                            } catch (DataFormatException unused) {
                                                                byteArrayOutputStream2 = byteArrayOutputStream;
                                                                i14 = length;
                                                                i15 = a10;
                                                                bArr3 = bArr5;
                                                                z9 = true;
                                                            }
                                                        }
                                                        byteArrayOutputStream2 = byteArrayOutputStream;
                                                        i14 = length;
                                                        i15 = a10;
                                                        bArr3 = bArr5;
                                                        z9 = z12;
                                                        if (z9) {
                                                            break;
                                                        }
                                                        z11 = false;
                                                    } else {
                                                        byteArrayOutputStream2 = byteArrayOutputStream;
                                                        i14 = length;
                                                        i15 = a10;
                                                        bArr3 = bArr5;
                                                        if (byteArrayOutputStream2.size() == 0 && !q.c(i26, "IHDR", decode)) {
                                                            byteArrayOutputStream3.write(decode, i13, i15 + 12);
                                                        }
                                                    }
                                                    i13 += i15 + 12;
                                                    bArr4 = bArr2;
                                                    length = i14;
                                                    a12 = j10;
                                                    byteArrayOutputStream = byteArrayOutputStream2;
                                                    bArr5 = bArr3;
                                                }
                                            }
                                            byteArrayOutputStream2 = byteArrayOutputStream;
                                            break;
                                        } catch (Throwable th2) {
                                            inflater.end();
                                            throw th2;
                                        }
                                    }
                                    byteArrayOutputStream2 = byteArrayOutputStream;
                                    bArr2 = bArr4;
                                    j10 = a12;
                                    j11 = j12;
                                    inflater.end();
                                    if (j11 < j3) {
                                        bitmap = Bitmap.createBitmap((int) j10, (int) j3, Bitmap.Config.ARGB_8888);
                                        if (j11 != 0) {
                                            int i27 = (int) (i25 * j11);
                                            byte[] bArr6 = new byte[i27];
                                            System.arraycopy(byteArrayOutputStream2.toByteArray(), 0, bArr6, 0, i27);
                                            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                            byteArrayOutputStream4.write(bArr2, 0, 8);
                                            byte[] bArr7 = new byte[13];
                                            System.arraycopy(decode, 16, bArr7, 0, 13);
                                            q.b(bArr7, 4, j11);
                                            q.d(byteArrayOutputStream4, "IHDR", bArr7, crc32);
                                            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                                            byteArrayOutputStream4.write(byteArray2, 0, byteArray2.length);
                                            Deflater deflater = new Deflater();
                                            deflater.setInput(bArr6);
                                            deflater.finish();
                                            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                            byte[] bArr8 = new byte[TLObject.FLAG_13];
                                            while (!deflater.finished()) {
                                                byteArrayOutputStream5.write(bArr8, 0, deflater.deflate(bArr8));
                                            }
                                            deflater.end();
                                            q.d(byteArrayOutputStream4, "IDAT", byteArrayOutputStream5.toByteArray(), crc32);
                                            q.d(byteArrayOutputStream4, "IEND", new byte[0], crc32);
                                            byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray3, 0, byteArray3.length);
                                            if (decodeByteArray != null) {
                                                new Canvas(bitmap).drawBitmap(decodeByteArray, 0.0f, 0.0f, (Paint) null);
                                                decodeByteArray.recycle();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i11 = 1;
                        if (i11 != 0) {
                            CRC32 crc322 = new CRC32();
                            i12 = 8;
                            while (true) {
                                options = options2;
                                if (i12 + 12 <= length) {
                                }
                                i12 = ((int) a11) + 12 + i17;
                                options2 = options;
                                a13 = j3;
                            }
                            int i252 = (int) (((((i11 * a12) * i20) + 7) / 8) + 1);
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            ByteArrayOutputStream byteArrayOutputStream32 = new ByteArrayOutputStream();
                            Inflater inflater2 = new Inflater(true);
                            byte[] bArr52 = new byte[TLObject.FLAG_14];
                            long j122 = 0;
                            i13 = 8;
                            boolean z112 = true;
                            while (i13 + 12 <= length) {
                                bArr2 = bArr4;
                                j10 = a12;
                                a10 = (int) q.a(i13, decode);
                                if (a10 > (length - i13) - 12) {
                                }
                                byteArrayOutputStream2 = byteArrayOutputStream;
                            }
                            byteArrayOutputStream2 = byteArrayOutputStream;
                            bArr2 = bArr4;
                            j10 = a12;
                            j11 = j122;
                            inflater2.end();
                            if (j11 < j3) {
                            }
                        }
                    }
                }
            }
            options = options2;
            bitmap = null;
            if (bitmap == null) {
                bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            }
            if (bitmap == null) {
                return null;
            }
            Bitmap put = this.images.put(Integer.valueOf(i7), bitmap);
            long allocationByteCount = this.imageBytes + bitmap.getAllocationByteCount();
            this.imageBytes = allocationByteCount;
            if (put != null) {
                this.imageBytes = allocationByteCount - put.getAllocationByteCount();
            }
            return new float[]{bitmap.getWidth(), bitmap.getHeight()};
        } catch (Exception unused2) {
            return null;
        }
    }

    public void record(byte[] bArr, byte[] bArr2, double d, int i7, int i10, float f10, float f11, int i11, int i12) {
        g fVar;
        int i13;
        int i14;
        assertWorker();
        this.owner.getClass();
        this.owner.getClass();
        Trace.beginSection("WidgetSandbox:Record");
        double nanoTime = d - (System.nanoTime() / 1.0E9d);
        if (Build.VERSION.SDK_INT >= 29) {
            i13 = i7;
            fVar = new e("widget-sandbox-content", 0, 0, i13, i10);
            i14 = i10;
        } else {
            i13 = i7;
            i14 = i10;
            fVar = new f(0, 0, i13, i14);
        }
        g gVar = fVar;
        try {
            try {
                JSONArray jSONArray = new JSONArray(text(bArr));
                JSONObject jSONObject = new JSONObject(text(bArr2));
                System.nanoTime();
                Canvas a10 = gVar.a();
                try {
                    a10.scale(f10, f10);
                    this.painter.f(a10, jSONArray, this, f10);
                    gVar.e();
                    g0[] layers = layers(jSONObject, f10);
                    h0 h0Var = this.owner;
                    System.nanoTime();
                    h0Var.getClass();
                    this.owner.a(gVar, layers, nanoTime, i13, i14, f11, (System.nanoTime() - r2) / 1000000.0f, i11, i12, jSONArray.length(), this.text);
                } catch (Throwable th2) {
                    gVar.e();
                    throw th2;
                }
            } finally {
                this.pendingLayers.clear();
                this.layerParseNanos = 0L;
                Trace.endSection();
            }
        } catch (Exception e10) {
            gVar.c();
            throw e10;
        }
    }

    public void recordLayer(int i7, int i10, byte[] bArr) {
        assertWorker();
        long nanoTime = System.nanoTime();
        this.pendingLayers.put(Integer.valueOf(i7), new JSONArray(text(bArr)));
        this.layerParseNanos = (System.nanoTime() - nanoTime) + this.layerParseNanos;
    }

    public void selectableText(byte[] bArr) {
        assertWorker();
        try {
            String text = text(bArr);
            ConcurrentHashMap<Integer, Paint> concurrentHashMap = this.deviceFonts;
            Objects.requireNonNull(concurrentHashMap);
            this.text = m0.a(text, new r(concurrentHashMap), this.owner.j);
        } catch (Exception unused) {
            this.text = null;
        }
    }

    public void signal(int i7, byte[] bArr) {
        final h0 h0Var = this.owner;
        final String text = text(bArr);
        if (i7 == 8) {
            final int i10 = 0;
            h0Var.a.post(new Runnable() { // from class: org.telegram.utils.twidget.e0
                @Override // java.lang.Runnable
                public final void run() {
                    u uVar;
                    j71 j71Var;
                    u uVar2;
                    switch (i10) {
                        case 0:
                            h0 h0Var2 = h0Var;
                            String str = text;
                            if (h0Var2.K != null) {
                                try {
                                    JSONObject jSONObject = new JSONObject(str);
                                    JSONObject optJSONObject = jSONObject.optJSONObject("values");
                                    u uVar3 = h0Var2.K;
                                    String optString = jSONObject.optString("area");
                                    if (optJSONObject == null) {
                                        optJSONObject = new JSONObject();
                                    }
                                    uVar3.h(optString, optJSONObject);
                                    break;
                                } catch (Exception unused) {
                                    return;
                                }
                            }
                            break;
                        case 1:
                            h0 h0Var3 = h0Var;
                            String str2 = text;
                            if (!h0Var3.u && (uVar = h0Var3.J) != null && (j71Var = uVar.h) != null) {
                                if (j71Var.F || (j71Var.w && j71Var.E)) {
                                    j71Var.a.f(str2);
                                    break;
                                }
                            }
                            break;
                        default:
                            h0 h0Var4 = h0Var;
                            String str3 = text;
                            if (!h0Var4.u && (uVar2 = h0Var4.J) != null) {
                                try {
                                    uVar2.f(new JSONObject(str3));
                                    break;
                                } catch (Exception unused2) {
                                    return;
                                }
                            }
                            break;
                    }
                }
            });
            return;
        }
        if (i7 == 10) {
            h0Var.getClass();
            return;
        }
        if (h0Var.u) {
            return;
        }
        if (i7 == 12 || i7 == 13 || i7 == 14 || i7 == 19) {
            h0Var.a.post(new d10(h0Var, i7, text, 20));
            return;
        }
        if (i7 == 11) {
            final int i11 = 1;
            h0Var.a.post(new Runnable() { // from class: org.telegram.utils.twidget.e0
                @Override // java.lang.Runnable
                public final void run() {
                    u uVar;
                    j71 j71Var;
                    u uVar2;
                    switch (i11) {
                        case 0:
                            h0 h0Var2 = h0Var;
                            String str = text;
                            if (h0Var2.K != null) {
                                try {
                                    JSONObject jSONObject = new JSONObject(str);
                                    JSONObject optJSONObject = jSONObject.optJSONObject("values");
                                    u uVar3 = h0Var2.K;
                                    String optString = jSONObject.optString("area");
                                    if (optJSONObject == null) {
                                        optJSONObject = new JSONObject();
                                    }
                                    uVar3.h(optString, optJSONObject);
                                    break;
                                } catch (Exception unused) {
                                    return;
                                }
                            }
                            break;
                        case 1:
                            h0 h0Var3 = h0Var;
                            String str2 = text;
                            if (!h0Var3.u && (uVar = h0Var3.J) != null && (j71Var = uVar.h) != null) {
                                if (j71Var.F || (j71Var.w && j71Var.E)) {
                                    j71Var.a.f(str2);
                                    break;
                                }
                            }
                            break;
                        default:
                            h0 h0Var4 = h0Var;
                            String str3 = text;
                            if (!h0Var4.u && (uVar2 = h0Var4.J) != null) {
                                try {
                                    uVar2.f(new JSONObject(str3));
                                    break;
                                } catch (Exception unused2) {
                                    return;
                                }
                            }
                            break;
                    }
                }
            });
            return;
        }
        try {
            if (i7 == 18) {
                JSONObject jSONObject = new JSONObject(text);
                jSONObject.optDouble("receive");
                jSONObject.optDouble("animate");
                jSONObject.optDouble("paint");
                jSONObject.optDouble("serialize");
                jSONObject.optDouble("ticks");
                jSONObject.optDouble("framesSent");
                jSONObject.optDouble("opsLatency");
                jSONObject.optDouble("validate", -1.0d);
                jSONObject.optDouble("hop", -1.0d);
                return;
            }
            if (i7 == 16 || i7 == 17 || i7 == 9) {
                return;
            }
            if (i7 == 6) {
                h0Var.m.set(false);
                h0Var.a.post(h0Var.N);
                return;
            }
            if (i7 == 1) {
                h0Var.n.set(true);
                h0Var.a.post(h0Var.R);
                return;
            }
            if (i7 == 2) {
                h0Var.l.set(true);
                h0Var.a.removeCallbacks(h0Var.N);
                h0Var.a.post(h0Var.N);
                return;
            }
            if (i7 == 3) {
                JSONObject jSONObject2 = new JSONObject(text);
                h0Var.a.post(new py(h0Var, jSONObject2.optBoolean("x"), jSONObject2.optBoolean("y"), jSONObject2.optBoolean("hold"), 2));
                return;
            }
            if (i7 != 4) {
                if (i7 == 5) {
                    final int i12 = 2;
                    h0Var.a.post(new Runnable() { // from class: org.telegram.utils.twidget.e0
                        @Override // java.lang.Runnable
                        public final void run() {
                            u uVar;
                            j71 j71Var;
                            u uVar2;
                            switch (i12) {
                                case 0:
                                    h0 h0Var2 = h0Var;
                                    String str = text;
                                    if (h0Var2.K != null) {
                                        try {
                                            JSONObject jSONObject3 = new JSONObject(str);
                                            JSONObject optJSONObject = jSONObject3.optJSONObject("values");
                                            u uVar3 = h0Var2.K;
                                            String optString = jSONObject3.optString("area");
                                            if (optJSONObject == null) {
                                                optJSONObject = new JSONObject();
                                            }
                                            uVar3.h(optString, optJSONObject);
                                            break;
                                        } catch (Exception unused) {
                                            return;
                                        }
                                    }
                                    break;
                                case 1:
                                    h0 h0Var3 = h0Var;
                                    String str2 = text;
                                    if (!h0Var3.u && (uVar = h0Var3.J) != null && (j71Var = uVar.h) != null) {
                                        if (j71Var.F || (j71Var.w && j71Var.E)) {
                                            j71Var.a.f(str2);
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    h0 h0Var4 = h0Var;
                                    String str3 = text;
                                    if (!h0Var4.u && (uVar2 = h0Var4.J) != null) {
                                        try {
                                            uVar2.f(new JSONObject(str3));
                                            break;
                                        } catch (Exception unused2) {
                                            return;
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                    return;
                } else {
                    if (i7 == 7) {
                        float parseFloat = Float.parseFloat(text);
                        h0Var.o.set(parseFloat == 0.0f);
                        h0Var.a.post(new org.telegram.ui.b0(h0Var, parseFloat, 4));
                        return;
                    }
                    return;
                }
            }
            JSONObject jSONObject3 = new JSONObject(text);
            if (jSONObject3.optBoolean("loaded")) {
                h0Var.v = true;
            }
            h0Var.y = "bottom".equals(jSONObject3.optString("resizeAnchor"));
            if (jSONObject3.optBoolean("rendered") && !h0Var.w) {
                double optDouble = jSONObject3.optDouble("height", -1.0d);
                double min = Math.min(600.0f, Math.max(50.0f, h0Var.r / h0Var.j));
                if (h0Var.s && optDouble > 0.0d && Math.abs(min - optDouble) <= 1.0d) {
                    h0Var.x = true;
                }
                h0Var.w = true;
            }
            synchronized (h0Var.q) {
                try {
                    if (h0Var.u) {
                        return;
                    }
                    h0Var.H = jSONObject3;
                    if (!h0Var.I) {
                        h0Var.I = true;
                        h0Var.a.post(h0Var.M);
                    }
                } finally {
                }
            }
        } catch (NumberFormatException | Exception unused) {
        }
    }

    public float textWidth(int i7, byte[] bArr) {
        Paint paint = this.deviceFonts.get(Integer.valueOf(i7));
        if (paint == null) {
            return 0.0f;
        }
        return paint.measureText(text(bArr)) / this.owner.j;
    }
}
