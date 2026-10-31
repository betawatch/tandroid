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
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Wallet.x0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
final class WidgetSandboxBackend implements z, c {
    private static final long MEMORY_BUDGET = 33554432;
    private long imageBytes;
    private long layerParseNanos;
    private int nextFont;
    private final k0 owner;
    private q0 text;
    private final ConcurrentHashMap<Integer, Paint> fonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Paint> deviceFonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Bitmap> images = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, d> canvases = new ConcurrentHashMap<>();
    private final HashMap<Integer, JSONArray> pendingLayers = new HashMap<>();
    private HashMap<Long, s> layerContents = new HashMap<>();
    private final a0 painter = new a0();
    private final Rect bounds = new Rect();

    public WidgetSandboxBackend(k0 k0Var) {
        this.owner = k0Var;
    }

    private static void assertWorker() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Native layout and recording must run off UI");
        }
    }

    private void checkCanvasSize(int i10, int i11, int i12) {
        long j10 = i11 * i12;
        if (j10 > 4194304) {
            throw new IllegalArgumentException("Canvas dimensions");
        }
        long j11 = (j10 * 8) + this.imageBytes;
        for (Map.Entry<Integer, d> entry : this.canvases.entrySet()) {
            if (entry.getKey().intValue() != i10) {
                j11 += entry.getValue().m == null ? 0L : r4.getWidth() * r3.m.getHeight() * 8;
            }
        }
        if (j11 > MEMORY_BUDGET) {
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

    private j0[] layers(JSONObject jSONObject, float f7) {
        int i10;
        JSONArray jSONArray;
        int i11;
        long j10;
        float[] fArr;
        float[] fArr2;
        int i12;
        int i13;
        g fVar;
        JSONArray optJSONArray = jSONObject.optJSONArray("l");
        int i14 = 0;
        int length = optJSONArray == null ? 0 : optJSONArray.length();
        HashMap<Long, s> hashMap = new HashMap<>();
        j0[] j0VarArr = new j0[length];
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i15);
            if (optJSONObject != null) {
                long optLong = optJSONObject.optLong("id");
                long optLong2 = optJSONObject.optLong("cv");
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("b");
                if (optJSONArray2 != null) {
                    double optDouble = optJSONArray2.optDouble(i14);
                    i10 = length;
                    double d = f7;
                    jSONArray = optJSONArray;
                    int floor = (int) Math.floor(optDouble * d);
                    int floor2 = (int) Math.floor(optJSONArray2.optDouble(1) * d);
                    int ceil = (int) Math.ceil((optJSONArray2.optDouble(2) + optJSONArray2.optDouble(0)) * d);
                    int ceil2 = (int) Math.ceil((optJSONArray2.optDouble(3) + optJSONArray2.optDouble(1)) * d);
                    s sVar = this.layerContents.get(Long.valueOf(optLong));
                    JSONArray jSONArray2 = this.pendingLayers.get(Integer.valueOf(i15));
                    if (jSONArray2 != null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            g eVar = new e("widget-sandbox-layer", floor, floor2, ceil, ceil2);
                            i13 = floor;
                            i12 = floor2;
                            i11 = i15;
                            j10 = optLong;
                            fVar = eVar;
                        } else {
                            i11 = i15;
                            j10 = optLong;
                            i12 = floor2;
                            i13 = floor;
                            fVar = new f(i13, i12, ceil, ceil2);
                        }
                        Canvas a2 = fVar.a();
                        try {
                            a2.translate(-i13, -i12);
                            a2.scale(f7, f7);
                            this.painter.g(a2, jSONArray2, this, f7);
                            fVar.e();
                            sVar = new s(fVar, (int) optLong2);
                        } catch (Throwable th2) {
                            fVar.e();
                            throw th2;
                        }
                    } else {
                        i11 = i15;
                        j10 = optLong;
                        if (sVar != null) {
                            if (sVar.b != ((int) optLong2)) {
                            }
                        }
                        i15 = i11 + 1;
                        length = i10;
                        optJSONArray = jSONArray;
                        i14 = 0;
                    }
                    hashMap.put(Long.valueOf(j10), sVar);
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("l");
                    float[] fArr3 = null;
                    if (optJSONArray3 != null) {
                        float[] fArr4 = new float[4];
                        a0.d(optJSONArray3, fArr4, 4, new float[0]);
                        JSONArray optJSONArray4 = optJSONObject.optJSONArray("q");
                        if (optJSONArray4 != null) {
                            fArr3 = new float[8];
                            a0.d(optJSONArray4, fArr3, 8, new float[0]);
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
                    a0.d(optJSONArray5, fArr5, length2, new float[0]);
                    int i17 = i16 + 1;
                    j0VarArr[i16] = new j0(sVar.a, fArr, fArr2, optJSONObject.optDouble("ts"), optJSONObject.optDouble("td"), optJSONObject.optInt("tr") != 0, fArr5);
                    i16 = i17;
                    i15 = i11 + 1;
                    length = i10;
                    optJSONArray = jSONArray;
                    i14 = 0;
                }
            }
            jSONArray = optJSONArray;
            i10 = length;
            i11 = i15;
            i15 = i11 + 1;
            length = i10;
            optJSONArray = jSONArray;
            i14 = 0;
        }
        int i18 = length;
        this.layerContents = hashMap;
        if (i16 == i18) {
            return j0VarArr;
        }
        j0[] j0VarArr2 = new j0[i16];
        System.arraycopy(j0VarArr, 0, j0VarArr2, 0, i16);
        return j0VarArr2;
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
    private static Typeface typeface(String str, int i10, boolean z10) {
        Typeface typeface;
        Typeface typeface2 = Typeface.SANS_SERIF;
        String[] split = str.split(",");
        int length = split.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                String lowerCase = split[i11].trim().replace("\"", "").replace("'", "").toLowerCase(Locale.ROOT);
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
                i11++;
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Typeface.create(typeface2, Math.max(1, Math.min(1000, i10)), z10);
        }
        return Typeface.create(typeface2, (i10 < 600 ? 0 : 1) | (z10 ? 2 : 0));
    }

    @Override // org.telegram.utils.twidget.z
    public Bitmap canvas(int i10) {
        d dVar = this.canvases.get(Integer.valueOf(i10));
        if (dVar == null) {
            return null;
        }
        synchronized (dVar) {
            try {
                Bitmap bitmap = dVar.m;
                if (bitmap == null) {
                    return null;
                }
                if (dVar.q == dVar.p) {
                    if (dVar.n == null) {
                    }
                    return dVar.n;
                }
                dVar.n = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                dVar.q = dVar.p;
                return dVar.n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.utils.twidget.c
    public Bitmap canvasBitmap(int i10) {
        d dVar = this.canvases.get(Integer.valueOf(i10));
        if (dVar == null) {
            return null;
        }
        return dVar.m;
    }

    public byte[] canvasRead(int i10, int i11, int i12, int i13, int i14) {
        int i15 = i11;
        assertWorker();
        if (i13 <= 0 || i14 <= 0 || i13 * i14 > 4194304) {
            return null;
        }
        d dVar = this.canvases.get(Integer.valueOf(i10));
        if (dVar == null) {
            return new byte[i13 * i14 * 4];
        }
        byte[] bArr = new byte[Math.max(i14, 0) * Math.max(i13, 0) * 4];
        if (dVar.m != null) {
            int max = Math.max(0, i15);
            int max2 = Math.max(0, i12);
            int min = Math.min(dVar.m.getWidth(), i15 + i13);
            int min2 = Math.min(dVar.m.getHeight(), i14 + i12);
            if (min > max && min2 > max2) {
                int i16 = min - max;
                int i17 = min2 - max2;
                int[] iArr = new int[i16 * i17];
                dVar.m.getPixels(iArr, 0, i16, max, max2, i16, i17);
                int i18 = max2;
                while (i18 < min2) {
                    int i19 = max;
                    while (i19 < min) {
                        int i20 = iArr[(i19 - max) + ((i18 - max2) * i16)];
                        int i21 = ((i19 - i15) + ((i18 - i12) * i13)) * 4;
                        bArr[i21] = (byte) Color.red(i20);
                        bArr[i21 + 1] = (byte) Color.green(i20);
                        bArr[i21 + 2] = (byte) Color.blue(i20);
                        bArr[i21 + 3] = (byte) Color.alpha(i20);
                        i19++;
                        i15 = i11;
                    }
                    i18++;
                    i15 = i11;
                }
            }
        }
        return bArr;
    }

    public void canvasRelease(int i10) {
        assertWorker();
        d remove = this.canvases.remove(Integer.valueOf(i10));
        if (remove != null) {
            synchronized (remove) {
                try {
                    Bitmap bitmap = remove.m;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    remove.m = null;
                    remove.o = null;
                    remove.n = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:10:0x0032, B:12:0x0036, B:14:0x003c, B:18:0x0060, B:20:0x0066, B:22:0x006c, B:24:0x006f, B:27:0x0072, B:32:0x0047, B:34:0x004b, B:35:0x004e), top: B:9:0x0032 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void canvasRun(int i10, int i11, int i12, byte[] bArr) {
        int i13;
        assertWorker();
        if (i11 <= 0 || i12 <= 0) {
            canvasRelease(i10);
            return;
        }
        checkCanvasSize(i10, i11, i12);
        d dVar = this.canvases.get(Integer.valueOf(i10));
        if (dVar == null) {
            dVar = new d(i10);
            this.canvases.put(Integer.valueOf(i10), dVar);
        }
        JSONArray jSONArray = new JSONArray(text(bArr));
        synchronized (dVar) {
            try {
                Bitmap bitmap = dVar.m;
                if (bitmap != null) {
                    if (bitmap.getWidth() == i11) {
                        if (dVar.m.getHeight() != i12) {
                        }
                        for (i13 = 0; i13 < jSONArray.length(); i13++) {
                            JSONObject optJSONObject = jSONArray.optJSONObject(i13);
                            if (optJSONObject != null) {
                                dVar.d(optJSONObject, this);
                            }
                        }
                        dVar.p++;
                    }
                }
                Bitmap bitmap2 = dVar.m;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                dVar.m = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                dVar.o = new Canvas(dVar.m);
                while (i13 < jSONArray.length()) {
                }
                dVar.p++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public float[] createFont(byte[] bArr, float f7, int i10, boolean z10, byte[] bArr2) {
        assertWorker();
        Paint paint = new Paint(zs.N1);
        paint.setTextSize(f7);
        paint.setTypeface(typeface(text(bArr), i10, z10));
        String featureSettings = featureSettings(text(bArr2));
        if (featureSettings != null) {
            paint.setFontFeatureSettings(featureSettings);
        }
        float f10 = this.owner.j;
        Paint paint2 = new Paint(paint);
        paint2.setTextSize(f7 * f10);
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        int i11 = this.nextFont + 1;
        this.nextFont = i11;
        this.fonts.put(Integer.valueOf(i11), paint);
        this.deviceFonts.put(Integer.valueOf(i11), paint2);
        paint2.getTextBounds("x", 0, 1, this.bounds);
        float f11 = fontMetrics.ascent;
        float f12 = fontMetrics.descent;
        return new float[]{i11, (-f11) / f10, f12 / f10, ((f12 - f11) + fontMetrics.leading) / f10, this.bounds.height() / f10, paint2.measureText("0") / f10};
    }

    public void deleteFont(int i10) {
        this.fonts.remove(Integer.valueOf(i10));
        this.deviceFonts.remove(Integer.valueOf(i10));
    }

    @Override // org.telegram.utils.twidget.z
    public Paint deviceFont(int i10) {
        return this.deviceFonts.get(Integer.valueOf(i10));
    }

    @Override // org.telegram.utils.twidget.c
    public Paint font(int i10) {
        return this.fonts.get(Integer.valueOf(i10));
    }

    public byte[] formatIntl(byte[] bArr) {
        return u.b(text(bArr)).getBytes(StandardCharsets.UTF_8);
    }

    @Override // org.telegram.utils.twidget.z, org.telegram.utils.twidget.c
    public Bitmap image(int i10) {
        return this.images.get(Integer.valueOf(i10));
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
    public float[] loadImage(int i10, byte[] bArr) {
        int i11;
        BitmapFactory.Options options;
        Bitmap bitmap;
        int i12;
        int i13;
        long j10;
        ByteArrayOutputStream byteArrayOutputStream;
        int i14;
        ByteArrayOutputStream byteArrayOutputStream2;
        byte[] bArr2;
        long j11;
        long j12;
        int a2;
        int i15;
        int i16;
        byte[] bArr3;
        boolean z10;
        boolean z11;
        int i17;
        long a10;
        int i18;
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
            int i19 = options2.outWidth;
            if (i19 <= 0 || (i11 = options2.outHeight) <= 0 || i19 * i11 > 4194304) {
                return null;
            }
            if (this.imageBytes + (i19 * i11 * 4) > MEMORY_BUDGET) {
                return null;
            }
            options2.inJustDecodeBounds = false;
            int length = decode.length;
            if (length >= 33) {
                int i20 = 0;
                while (true) {
                    byte[] bArr4 = q.a;
                    if (i20 < 8) {
                        if (decode[i20] != bArr4[i20]) {
                            break;
                        }
                        i20++;
                    } else if (q.c(12, "IHDR", decode) && q.a(8, decode) >= 13) {
                        long a11 = q.a(16, decode);
                        long a12 = q.a(20, decode);
                        int i21 = decode[24] & 255;
                        int i22 = decode[25] & 255;
                        int i23 = decode[28] & 255;
                        if (i22 != 0) {
                            i12 = 3;
                            if (i22 != 3) {
                                if (i22 != 2) {
                                    i12 = i22 == 4 ? 2 : i22 == 6 ? 4 : 0;
                                }
                                if (i12 != 0 && i23 == 0 && a11 > 0 && a12 > 0 && a11 * a12 <= 4194304) {
                                    CRC32 crc32 = new CRC32();
                                    i13 = 8;
                                    while (true) {
                                        options = options2;
                                        if (i13 + 12 <= length) {
                                            j10 = a12;
                                            break;
                                        }
                                        a10 = q.a(i13, decode);
                                        i18 = i13;
                                        j10 = a12;
                                        if (a10 <= (length - i13) - 12) {
                                            int i24 = i18 + 4;
                                            if (q.c(i24, "IEND", decode)) {
                                                break;
                                            }
                                            if (q.c(i24, "IDAT", decode)) {
                                                crc32.reset();
                                                int i25 = (int) a10;
                                                crc32.update(decode, i24, i25 + 4);
                                                if (crc32.getValue() != q.a(i18 + 8 + i25, decode)) {
                                                    break;
                                                }
                                            }
                                            i13 = ((int) a10) + 12 + i18;
                                            options2 = options;
                                            a12 = j10;
                                        } else {
                                            break;
                                        }
                                    }
                                    int i26 = (int) (((((i12 * a11) * i21) + 7) / 8) + 1);
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                    Inflater inflater = new Inflater(true);
                                    byte[] bArr5 = new byte[TLObject.FLAG_14];
                                    long j13 = 0;
                                    i14 = 8;
                                    boolean z12 = true;
                                    while (i14 + 12 <= length && j13 < j10) {
                                        bArr2 = bArr4;
                                        j11 = a11;
                                        try {
                                            a2 = (int) q.a(i14, decode);
                                            if (a2 > (length - i14) - 12) {
                                                int i27 = i14 + 4;
                                                if (!q.c(i27, "IEND", decode)) {
                                                    if (q.c(i27, "IDAT", decode)) {
                                                        int min = z12 ? Math.min(2, a2) : 0;
                                                        inflater.setInput(decode, i14 + 8 + min, a2 - min);
                                                        boolean z13 = false;
                                                        while (!inflater.needsInput() && !inflater.finished() && !z13) {
                                                            try {
                                                                int inflate = inflater.inflate(bArr5);
                                                                if (inflate == 0 && inflater.needsDictionary()) {
                                                                    break;
                                                                }
                                                                i15 = length;
                                                                byteArrayOutputStream.write(bArr5, 0, inflate);
                                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                                while (true) {
                                                                    if (j13 >= j10) {
                                                                        byteArrayOutputStream2 = byteArrayOutputStream;
                                                                        i16 = a2;
                                                                        z11 = z13;
                                                                        i17 = inflate;
                                                                        bArr3 = bArr5;
                                                                        break;
                                                                    }
                                                                    i16 = a2;
                                                                    z11 = z13;
                                                                    long j14 = i26;
                                                                    long j15 = j13 * j14;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream;
                                                                    i17 = inflate;
                                                                    bArr3 = bArr5;
                                                                    if (j15 >= byteArray.length) {
                                                                        break;
                                                                    }
                                                                    if ((byteArray[(int) j15] & 255) > 4) {
                                                                        z13 = true;
                                                                        break;
                                                                    }
                                                                    if (j15 + j14 > byteArray.length) {
                                                                        break;
                                                                    }
                                                                    j13++;
                                                                    z13 = z11;
                                                                    a2 = i16;
                                                                    byteArrayOutputStream = byteArrayOutputStream2;
                                                                    bArr5 = bArr3;
                                                                    inflate = i17;
                                                                }
                                                                z13 = z11;
                                                                if (i17 == 0) {
                                                                    z10 = z13;
                                                                    break;
                                                                }
                                                                length = i15;
                                                                a2 = i16;
                                                                byteArrayOutputStream = byteArrayOutputStream2;
                                                                bArr5 = bArr3;
                                                            } catch (DataFormatException unused) {
                                                                byteArrayOutputStream2 = byteArrayOutputStream;
                                                                i15 = length;
                                                                i16 = a2;
                                                                bArr3 = bArr5;
                                                                z10 = true;
                                                            }
                                                        }
                                                        byteArrayOutputStream2 = byteArrayOutputStream;
                                                        i15 = length;
                                                        i16 = a2;
                                                        bArr3 = bArr5;
                                                        z10 = z13;
                                                        if (z10) {
                                                            break;
                                                        }
                                                        z12 = false;
                                                    } else {
                                                        byteArrayOutputStream2 = byteArrayOutputStream;
                                                        i15 = length;
                                                        i16 = a2;
                                                        bArr3 = bArr5;
                                                        if (byteArrayOutputStream2.size() == 0 && !q.c(i27, "IHDR", decode)) {
                                                            byteArrayOutputStream3.write(decode, i14, i16 + 12);
                                                        }
                                                    }
                                                    i14 += i16 + 12;
                                                    bArr4 = bArr2;
                                                    length = i15;
                                                    a11 = j11;
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
                                    j11 = a11;
                                    j12 = j13;
                                    inflater.end();
                                    if (j12 < j10) {
                                        bitmap = Bitmap.createBitmap((int) j11, (int) j10, Bitmap.Config.ARGB_8888);
                                        if (j12 != 0) {
                                            int i28 = (int) (i26 * j12);
                                            byte[] bArr6 = new byte[i28];
                                            System.arraycopy(byteArrayOutputStream2.toByteArray(), 0, bArr6, 0, i28);
                                            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                            byteArrayOutputStream4.write(bArr2, 0, 8);
                                            byte[] bArr7 = new byte[13];
                                            System.arraycopy(decode, 16, bArr7, 0, 13);
                                            q.b(bArr7, 4, j12);
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
                        i12 = 1;
                        if (i12 != 0) {
                            CRC32 crc322 = new CRC32();
                            i13 = 8;
                            while (true) {
                                options = options2;
                                if (i13 + 12 <= length) {
                                }
                                i13 = ((int) a10) + 12 + i18;
                                options2 = options;
                                a12 = j10;
                            }
                            int i262 = (int) (((((i12 * a11) * i21) + 7) / 8) + 1);
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            ByteArrayOutputStream byteArrayOutputStream32 = new ByteArrayOutputStream();
                            Inflater inflater2 = new Inflater(true);
                            byte[] bArr52 = new byte[TLObject.FLAG_14];
                            long j132 = 0;
                            i14 = 8;
                            boolean z122 = true;
                            while (i14 + 12 <= length) {
                                bArr2 = bArr4;
                                j11 = a11;
                                a2 = (int) q.a(i14, decode);
                                if (a2 > (length - i14) - 12) {
                                }
                                byteArrayOutputStream2 = byteArrayOutputStream;
                            }
                            byteArrayOutputStream2 = byteArrayOutputStream;
                            bArr2 = bArr4;
                            j11 = a11;
                            j12 = j132;
                            inflater2.end();
                            if (j12 < j10) {
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
            Bitmap put = this.images.put(Integer.valueOf(i10), bitmap);
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

    public void record(byte[] bArr, byte[] bArr2, double d, int i10, int i11, float f7, float f10, int i12, int i13) {
        g fVar;
        int i14;
        int i15;
        assertWorker();
        this.owner.getClass();
        this.owner.getClass();
        Trace.beginSection("WidgetSandbox:Record");
        double nanoTime = d - (System.nanoTime() / 1.0E9d);
        if (Build.VERSION.SDK_INT >= 29) {
            i14 = i10;
            fVar = new e("widget-sandbox-content", 0, 0, i14, i11);
            i15 = i11;
        } else {
            i14 = i10;
            i15 = i11;
            fVar = new f(0, 0, i14, i15);
        }
        g gVar = fVar;
        try {
            try {
                JSONArray jSONArray = new JSONArray(text(bArr));
                JSONObject jSONObject = new JSONObject(text(bArr2));
                System.nanoTime();
                Canvas a2 = gVar.a();
                try {
                    a2.scale(f7, f7);
                    this.painter.g(a2, jSONArray, this, f7);
                    gVar.e();
                    j0[] layers = layers(jSONObject, f7);
                    k0 k0Var = this.owner;
                    System.nanoTime();
                    k0Var.getClass();
                    k0Var.K = null;
                    this.owner.a(gVar, layers, nanoTime, i14, i15, f10, (System.nanoTime() - r2) / 1000000.0f, i12, i13, jSONArray.length(), this.text);
                } catch (Throwable th2) {
                    gVar.e();
                    throw th2;
                }
            } finally {
                this.pendingLayers.clear();
                this.layerParseNanos = 0L;
                Trace.endSection();
            }
        } catch (Exception e) {
            gVar.c();
            throw e;
        }
    }

    public void recordLayer(int i10, int i11, byte[] bArr) {
        assertWorker();
        long nanoTime = System.nanoTime();
        this.pendingLayers.put(Integer.valueOf(i10), new JSONArray(text(bArr)));
        this.layerParseNanos = (System.nanoTime() - nanoTime) + this.layerParseNanos;
    }

    public void selectableText(byte[] bArr) {
        assertWorker();
        try {
            String text = text(bArr);
            ConcurrentHashMap<Integer, Paint> concurrentHashMap = this.deviceFonts;
            Objects.requireNonNull(concurrentHashMap);
            this.text = q0.a(text, new r(concurrentHashMap), this.owner.j);
        } catch (Exception unused) {
            this.text = null;
        }
    }

    public void signal(int i10, byte[] bArr) {
        boolean z10;
        final k0 k0Var = this.owner;
        final String text = text(bArr);
        final int i11 = 1;
        if (i10 == 8) {
            k0Var.a.post(new Runnable() { // from class: org.telegram.utils.twidget.c0
                @Override // java.lang.Runnable
                public final void run() {
                    w wVar;
                    w wVar2;
                    q81 q81Var;
                    switch (i11) {
                        case 0:
                            k0 k0Var2 = k0Var;
                            String str = text;
                            if (!k0Var2.u && (wVar = k0Var2.J) != null) {
                                try {
                                    wVar.f(new JSONObject(str));
                                    break;
                                } catch (Exception unused) {
                                    return;
                                }
                            }
                            break;
                        case 1:
                            k0 k0Var3 = k0Var;
                            String str2 = text;
                            if (k0Var3.L != null) {
                                try {
                                    JSONObject jSONObject = new JSONObject(str2);
                                    JSONObject optJSONObject = jSONObject.optJSONObject("values");
                                    w wVar3 = k0Var3.L;
                                    String optString = jSONObject.optString("area");
                                    if (optJSONObject == null) {
                                        optJSONObject = new JSONObject();
                                    }
                                    wVar3.h(optString, optJSONObject);
                                    break;
                                } catch (Exception unused2) {
                                    return;
                                }
                            }
                            break;
                        default:
                            k0 k0Var4 = k0Var;
                            String str3 = text;
                            if (!k0Var4.u && (wVar2 = k0Var4.J) != null && (q81Var = wVar2.h) != null) {
                                if (q81Var.F || (q81Var.w && q81Var.E)) {
                                    q81Var.a.f(str3);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 10) {
            k0Var.getClass();
            return;
        }
        if (k0Var.u) {
            return;
        }
        if (i10 == 12 || i10 == 13 || i10 == 14 || i10 == 19) {
            k0Var.a.post(new x0(k0Var, i10, text, 7));
            return;
        }
        final int i12 = 2;
        if (i10 == 11) {
            k0Var.a.post(new Runnable() { // from class: org.telegram.utils.twidget.c0
                @Override // java.lang.Runnable
                public final void run() {
                    w wVar;
                    w wVar2;
                    q81 q81Var;
                    switch (i12) {
                        case 0:
                            k0 k0Var2 = k0Var;
                            String str = text;
                            if (!k0Var2.u && (wVar = k0Var2.J) != null) {
                                try {
                                    wVar.f(new JSONObject(str));
                                    break;
                                } catch (Exception unused) {
                                    return;
                                }
                            }
                            break;
                        case 1:
                            k0 k0Var3 = k0Var;
                            String str2 = text;
                            if (k0Var3.L != null) {
                                try {
                                    JSONObject jSONObject = new JSONObject(str2);
                                    JSONObject optJSONObject = jSONObject.optJSONObject("values");
                                    w wVar3 = k0Var3.L;
                                    String optString = jSONObject.optString("area");
                                    if (optJSONObject == null) {
                                        optJSONObject = new JSONObject();
                                    }
                                    wVar3.h(optString, optJSONObject);
                                    break;
                                } catch (Exception unused2) {
                                    return;
                                }
                            }
                            break;
                        default:
                            k0 k0Var4 = k0Var;
                            String str3 = text;
                            if (!k0Var4.u && (wVar2 = k0Var4.J) != null && (q81Var = wVar2.h) != null) {
                                if (q81Var.F || (q81Var.w && q81Var.E)) {
                                    q81Var.a.f(str3);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            return;
        }
        int i13 = 4;
        try {
            if (i10 == 18) {
                JSONObject jSONObject = new JSONObject(text);
                k0Var.K = new float[]{(float) jSONObject.optDouble("receive"), (float) jSONObject.optDouble("animate"), (float) jSONObject.optDouble("paint"), (float) jSONObject.optDouble("serialize"), 0.0f, 0.0f, (float) jSONObject.optDouble("ticks"), (float) jSONObject.optDouble("framesSent"), (float) jSONObject.optDouble("opsLatency"), (float) jSONObject.optDouble("validate", -1.0d), (float) jSONObject.optDouble("hop", -1.0d)};
                return;
            }
            if (i10 == 16 || i10 == 17 || i10 == 9) {
                return;
            }
            if (i10 == 6) {
                k0Var.m.set(false);
                k0Var.a.post(k0Var.O);
                return;
            }
            if (i10 == 1) {
                k0Var.n.set(true);
                k0Var.a.post(k0Var.S);
                return;
            }
            if (i10 == 2) {
                k0Var.l.set(true);
                k0Var.a.removeCallbacks(k0Var.O);
                k0Var.a.post(k0Var.O);
                return;
            }
            if (i10 == 3) {
                JSONObject jSONObject2 = new JSONObject(text);
                k0Var.a.post(new ez(k0Var, jSONObject2.optBoolean("x"), jSONObject2.optBoolean("y"), jSONObject2.optBoolean("hold"), 2));
                return;
            }
            if (i10 != 4) {
                if (i10 == 5) {
                    final int i14 = 0;
                    k0Var.a.post(new Runnable() { // from class: org.telegram.utils.twidget.c0
                        @Override // java.lang.Runnable
                        public final void run() {
                            w wVar;
                            w wVar2;
                            q81 q81Var;
                            switch (i14) {
                                case 0:
                                    k0 k0Var2 = k0Var;
                                    String str = text;
                                    if (!k0Var2.u && (wVar = k0Var2.J) != null) {
                                        try {
                                            wVar.f(new JSONObject(str));
                                            break;
                                        } catch (Exception unused) {
                                            return;
                                        }
                                    }
                                    break;
                                case 1:
                                    k0 k0Var3 = k0Var;
                                    String str2 = text;
                                    if (k0Var3.L != null) {
                                        try {
                                            JSONObject jSONObject3 = new JSONObject(str2);
                                            JSONObject optJSONObject = jSONObject3.optJSONObject("values");
                                            w wVar3 = k0Var3.L;
                                            String optString = jSONObject3.optString("area");
                                            if (optJSONObject == null) {
                                                optJSONObject = new JSONObject();
                                            }
                                            wVar3.h(optString, optJSONObject);
                                            break;
                                        } catch (Exception unused2) {
                                            return;
                                        }
                                    }
                                    break;
                                default:
                                    k0 k0Var4 = k0Var;
                                    String str3 = text;
                                    if (!k0Var4.u && (wVar2 = k0Var4.J) != null && (q81Var = wVar2.h) != null) {
                                        if (q81Var.F || (q81Var.w && q81Var.E)) {
                                            q81Var.a.f(str3);
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                    return;
                } else {
                    if (i10 == 7) {
                        float parseFloat = Float.parseFloat(text);
                        k0Var.o.set(parseFloat == 0.0f);
                        k0Var.a.post(new org.telegram.ui.a0(k0Var, parseFloat, i13));
                        return;
                    }
                    return;
                }
            }
            JSONObject jSONObject3 = new JSONObject(text);
            if (jSONObject3.optBoolean("loaded")) {
                k0Var.v = true;
            }
            k0Var.y = "bottom".equals(jSONObject3.optString("resizeAnchor"));
            if (jSONObject3.optBoolean("rendered") && !k0Var.w) {
                double optDouble = jSONObject3.optDouble("height", -1.0d);
                double min = Math.min(600.0f, Math.max(50.0f, k0Var.r / k0Var.j));
                if (!k0Var.s || optDouble <= 0.0d || Math.abs(min - optDouble) > 1.0d) {
                    z10 = true;
                } else {
                    z10 = true;
                    k0Var.x = true;
                }
                k0Var.w = z10;
            }
            synchronized (k0Var.q) {
                try {
                    if (k0Var.u) {
                        return;
                    }
                    k0Var.H = jSONObject3;
                    if (!k0Var.I) {
                        k0Var.I = true;
                        k0Var.a.post(k0Var.N);
                    }
                } finally {
                }
            }
        } catch (NumberFormatException | Exception unused) {
        }
    }

    public float textWidth(int i10, byte[] bArr) {
        Paint paint = this.deviceFonts.get(Integer.valueOf(i10));
        if (paint == null) {
            return 0.0f;
        }
        return paint.measureText(text(bArr)) / this.owner.j;
    }
}
