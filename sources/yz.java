// default package

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.media.AudioDescriptor;
import android.media.MediaDrm;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.session.MediaSession;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Comparator$-CC;
import j$.util.Comparator$-EL;
import java.io.ByteArrayInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import org.telegram.utils.twidget.y;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class yz {
    public static float a = -1.0f;
    public static RenderEffect b;

    public static ColorFilter A(int i) {
        BlendMode blendMode;
        mk1.l();
        blendMode = BlendMode.SRC_IN;
        return new BlendModeColorFilter(i, blendMode);
    }

    public static void a(y yVar, kka kkaVar, jvc jvcVar, int i, gl2 gl2Var, RectF rectF, float[] fArr, dwc dwcVar, float f) {
        RenderEffect i2 = i(gl2Var, f, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        if (i2 == null || !((Matrix) kkaVar.f).invert(matrix) || rectF.isEmpty()) {
            return;
        }
        if (yVar.p(kkaVar, new RectF(rectF), y.j(gl2Var, new RectF(rectF)))) {
            int floor = (int) Math.floor(r3.left * f);
            int floor2 = (int) Math.floor(r3.top * f);
            int ceil = (int) Math.ceil(r3.right * f);
            int ceil2 = (int) Math.ceil(r3.bottom * f);
            if (yVar.o((ceil2 - floor2) * (ceil - floor))) {
                yVar.w++;
                RenderNode renderNode = new RenderNode("widget-backdrop");
                renderNode.setPosition(floor, floor2, ceil, ceil2);
                RecordingCanvas beginRecording = renderNode.beginRecording();
                beginRecording.translate(-floor, -floor2);
                beginRecording.scale(f, f);
                beginRecording.concat(matrix);
                yVar.e(beginRecording, jvcVar, i, dwcVar, f, false);
                renderNode.endRecording();
                renderNode.setRenderEffect(i2);
                Canvas canvas = (Canvas) kkaVar.d;
                canvas.save();
                Path path = yVar.f;
                path.rewind();
                if (fArr == null) {
                    path.addRect(rectF, Path.Direction.CW);
                } else {
                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                }
                canvas.clipPath(path);
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                float f2 = 1.0f / f;
                canvas.scale(f2, f2);
                canvas.drawRenderNode(renderNode);
                canvas.restore();
            }
        }
    }

    public static Canvas b(y yVar, cwc cwcVar, RectF rectF, gl2 gl2Var, float f) {
        Shader.TileMode tileMode;
        tileMode = Shader.TileMode.DECAL;
        RenderEffect i = i(gl2Var, f, tileMode);
        if (i == null) {
            return null;
        }
        int floor = ((int) Math.floor(rectF.left * f)) - 1;
        int floor2 = ((int) Math.floor(rectF.top * f)) - 1;
        int ceil = ((int) Math.ceil(rectF.right * f)) + 1;
        int ceil2 = ((int) Math.ceil(rectF.bottom * f)) + 1;
        if (!yVar.o((ceil2 - floor2) * (ceil - floor))) {
            return null;
        }
        RenderNode renderNode = new RenderNode("widget-filter");
        cwcVar.d = floor;
        cwcVar.e = floor2;
        renderNode.setPosition(floor, floor2, ceil, ceil2);
        renderNode.setRenderEffect(i);
        cwcVar.c = renderNode;
        RecordingCanvas beginRecording = renderNode.beginRecording();
        beginRecording.translate(-cwcVar.d, -cwcVar.e);
        beginRecording.scale(f, f);
        return beginRecording;
    }

    public static Canvas c(int i, int i2, Object obj) {
        RenderNode e = qm0.e(obj);
        e.setPosition(0, 0, i, i2);
        return e.beginRecording();
    }

    public static void d(Canvas canvas, Path path) {
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public static RenderEffect e() {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.125f);
        return RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
    }

    public static Bitmap f(int i, int i2, byte[] bArr) {
        BitmapFactory.Options options;
        int i3 = 0;
        if (i2 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int max = Math.max(options.outWidth, options.outHeight); max > i2; max /= 2) {
                options.inSampleSize <<= 1;
            }
        } else {
            options = null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (decodeByteArray == null) {
            throw av7.a("Could not decode image data", new IllegalStateException());
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            d54 d54Var = new d54(byteArrayInputStream);
            byteArrayInputStream.close();
            switch (d54Var.c()) {
                case 3:
                case 4:
                    i3 = kk7.J2;
                    break;
                case 5:
                case 8:
                    i3 = kk7.s4;
                    break;
                case 6:
                case 7:
                    i3 = 90;
                    break;
            }
            if (i3 == 0) {
                return decodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i3);
            return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
        } finally {
        }
    }

    public static void g(Context context, ev2 ev2Var) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            zi7 zi7Var = new zi7(ev2Var);
            telephonyManager.registerTelephonyCallback((Executor) ev2Var.b, zi7Var);
            telephonyManager.unregisterTelephonyCallback(zi7Var);
        } catch (RuntimeException unused) {
            ev2Var.i(5);
        }
    }

    public static void h(Canvas canvas, Object obj) {
        canvas.drawRenderNode(qm0.e(obj));
    }

    public static RenderEffect i(gl2 gl2Var, float f, Shader.TileMode tileMode) {
        BlendMode blendMode;
        Shader.TileMode tileMode2;
        RenderEffect renderEffect = null;
        int i = 0;
        while (true) {
            int[] iArr = (int[]) gl2Var.b;
            if (i >= iArr.length) {
                return renderEffect;
            }
            float f2 = ((float[]) gl2Var.f)[i];
            int i2 = iArr[i];
            if (i2 == 0) {
                float f3 = f2 * f;
                float f4 = f3 > 0.5f ? (f3 - 0.5f) / 0.57735f : 0.0f;
                if (f4 > 0.0f) {
                    renderEffect = renderEffect == null ? RenderEffect.createBlurEffect(f4, f4, tileMode) : RenderEffect.createBlurEffect(f4, f4, renderEffect, tileMode);
                }
            } else if (i2 != 1) {
                if (i2 == 9) {
                    if (renderEffect == null) {
                        renderEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f);
                    }
                    RenderEffect createOffsetEffect = RenderEffect.createOffsetEffect(((float[]) gl2Var.d)[i] * f, ((float[]) gl2Var.e)[i] * f, RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(((int[]) gl2Var.c)[i], PorterDuff.Mode.SRC_IN), renderEffect));
                    float f5 = (f2 / 2.0f) * f;
                    float f6 = f5 > 0.5f ? (f5 - 0.5f) / 0.57735f : 0.0f;
                    if (f6 > 0.0f) {
                        tileMode2 = Shader.TileMode.DECAL;
                        createOffsetEffect = RenderEffect.createBlurEffect(f6, f6, createOffsetEffect, tileMode2);
                    }
                    blendMode = BlendMode.SRC_OVER;
                    renderEffect = RenderEffect.createBlendModeEffect(createOffsetEffect, renderEffect, blendMode);
                }
            } else if (renderEffect == null) {
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setScale(f2, f2, f2, 1.0f);
                renderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
            } else {
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setScale(f2, f2, f2, 1.0f);
                renderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix2), renderEffect);
            }
            i++;
        }
    }

    public static void j(cwc cwcVar, float f) {
        RenderNode e = qm0.e(cwcVar.c);
        e.endRecording();
        cwcVar.a.save();
        float f2 = 1.0f / f;
        cwcVar.a.scale(f2, f2);
        cwcVar.a.drawRenderNode(e);
        cwcVar.a.restore();
    }

    public static void k(Object obj) {
        qm0.e(obj).endRecording();
    }

    public static mm5 l(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            km5 km5Var = mm5.b;
            return w59.e;
        }
        TreeSet treeSet = new TreeSet(Comparator$-EL.reversed(Comparator$-CC.comparing(new xz((byte) 0))));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor a2 = wz.a(it.next());
            if (a2.getStandard() == 1) {
                byte[] descriptor = a2.getDescriptor();
                if (descriptor.length != 3) {
                    lad.f("AudioDescriptorUtil", "Invalid SAD length: " + descriptor.length);
                } else {
                    byte b2 = descriptor[0];
                    int i = (b2 & 7) + 1;
                    if (((b2 >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(g8c.t(i)));
                    }
                }
            }
        }
        return mm5.q(treeSet);
    }

    public static RenderEffect m() {
        RenderEffect renderEffect = b;
        if (renderEffect != null) {
            return renderEffect;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(3.0f);
        RenderEffect createColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
        b = createColorFilterEffect;
        return createColorFilterEffect;
    }

    public static boolean n(Object obj) {
        return obj != null && qm0.e(obj).hasDisplayList();
    }

    public static boolean o() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static Bitmap p(Bitmap bitmap) {
        return Build.VERSION.SDK_INT >= 31 ? bitmap.asShared() : bitmap;
    }

    public static boolean q(MediaDrm mediaDrm, String str, int i) {
        return mediaDrm.requiresSecureDecoder(str, i);
    }

    public static float r(View view) {
        float f;
        int identifier;
        float f2;
        if (Build.VERSION.SDK_INT >= 31) {
            WindowInsets rootWindowInsets = view != null ? view.getRootWindowInsets() : null;
            if (rootWindowInsets == null) {
                f2 = -1.0f;
            } else {
                f2 = rootWindowInsets.getRoundedCorner(0) != null ? r5.getRadius() : 0.0f;
            }
            if (f2 >= 0.0f) {
                return f2;
            }
        }
        float f3 = a;
        if (f3 >= 0.0f) {
            return f3;
        }
        try {
            Resources system = Resources.getSystem();
            f = system.getIdentifier("rounded_corner_radius_top", "dimen", "android") != 0 ? system.getDimensionPixelSize(r3) : 0.0f;
            if (f <= 0.0f && (identifier = system.getIdentifier("rounded_corner_radius", "dimen", "android")) != 0) {
                f = system.getDimensionPixelSize(identifier);
            }
        } catch (Exception unused) {
            f = 0.0f;
        }
        float max = Math.max(0.0f, f);
        a = max;
        return max;
    }

    public static void s(Object obj, float f) {
        qm0.e(obj).setAlpha(f);
    }

    public static void t(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void u(int i, Paint paint) {
        BlendMode blendMode;
        switch (i) {
            case 1:
                blendMode = BlendMode.PLUS;
                break;
            case 2:
                blendMode = BlendMode.SCREEN;
                break;
            case 3:
                blendMode = BlendMode.COLOR_DODGE;
                break;
            case 4:
                blendMode = BlendMode.OVERLAY;
                break;
            case 5:
                blendMode = BlendMode.SOFT_LIGHT;
                break;
            case 6:
                blendMode = BlendMode.COLOR_BURN;
                break;
            default:
                blendMode = null;
                break;
        }
        paint.setBlendMode(blendMode);
    }

    public static void v(Object obj, float f) {
        ((RenderNode) obj).setRenderEffect(f > 0.0f ? RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP) : null);
    }

    public static void w(Object obj, float f, float[] fArr) {
        qm0.e(obj).setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(fArr), RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP)));
    }

    public static void x(MediaDrm mediaDrm, byte[] bArr, uc8 uc8Var) {
        LogSessionId logSessionId;
        LogSessionId a2 = uc8Var.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (a2.equals(logSessionId)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(a2);
    }

    public static void y(ep epVar, uc8 uc8Var) {
        LogSessionId logSessionId;
        LogSessionId a2 = uc8Var.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (a2.equals(logSessionId)) {
            return;
        }
        ((MediaFormat) epVar.b).setString("log-session-id", a2.getStringId());
    }

    public static void z(lv6 lv6Var, ComponentName componentName) {
        try {
            MediaSession mediaSession = ((bv6) lv6Var.b).a;
            mediaSession.getClass();
            mediaSession.setMediaButtonBroadcastReceiver(componentName);
        } catch (IllegalArgumentException e) {
            if (!Build.MANUFACTURER.equals("motorola")) {
                throw e;
            }
            lad.d("MediaSessionLegacyStub", "caught IllegalArgumentException on a motorola device when attempting to set the media button broadcast receiver. See https://github.com/androidx/media/issues/1730 for details.", e);
        }
    }
}
