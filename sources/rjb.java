// default package

import android.graphics.Bitmap;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.media.AudioRecordingConfiguration;
import android.view.View;
import com.google.firebase.datatransport.TransportRegistrar;
import java.io.InputStream;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class rjb implements ln5, ee, xmb, ymb, yy5, Vector.TLDeserializer, j3c, lr2, xk0, atc {
    public final /* synthetic */ byte a;

    public /* synthetic */ rjb(byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration c(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static /* synthetic */ void h() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void j(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void k(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void l(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void m(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void p() {
        throw new ClassCastException();
    }

    @Override // lr2
    public final Object X(sm2 sm2Var) {
        f3c lambda$getComponents$0;
        f3c lambda$getComponents$1;
        f3c lambda$getComponents$2;
        switch (this.a) {
            case 10:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(sm2Var);
                return lambda$getComponents$0;
            case 11:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(sm2Var);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(sm2Var);
                return lambda$getComponents$2;
        }
    }

    @Override // atc
    public final InputStream a() {
        return a.b.getResources().openRawResource(R.raw.default_pattern);
    }

    @Override // xk0
    public final Object b(Bitmap bitmap) {
        int i = 0;
        switch (this.a) {
            case 22:
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                Bitmap E = Utilities.E(Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f), bitmap);
                E.setHasAlpha(false);
                return E;
            case 23:
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    i = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                    break;
                }
                break;
            default:
                if (bitmap != null && !bitmap.isRecycled()) {
                    i = Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
                    break;
                }
                break;
        }
        return Integer.valueOf(i);
    }

    @Override // ln5
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        if ((imageReceiver.k0 instanceof e84) || (imageReceiver.T instanceof e84) || (imageReceiver.b0 instanceof e84) || (imageReceiver.n0 instanceof e84)) {
            imageReceiver.p1 = new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        }
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.a) {
            case 8:
                return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i, z);
            default:
                return Vector.Int.TLDeserialize(inputSerializedData, i, z);
        }
    }

    @Override // ymb
    public final void e(int i, View view) {
        m0c m0cVar = (m0c) view;
        ShapeDrawable shapeDrawable = m0cVar.f0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i);
            m0cVar.f0.invalidateSelf();
        }
    }

    @Override // xmb
    public final int g(View view) {
        ShapeDrawable shapeDrawable = ((m0c) view).f0;
        if (shapeDrawable != null) {
            return shapeDrawable.getPaint().getColor();
        }
        return 0;
    }

    @Override // yy5
    public final void o(Exception exc) {
        fc4.g(exc, true);
    }

    @Override // ee
    public final void r(he heVar, int i) {
        switch (this.a) {
            case 2:
                heVar.dismiss();
                break;
            case 3:
                heVar.dismiss();
                break;
            case 21:
                heVar.dismiss();
                break;
            default:
                heVar.dismiss();
                break;
        }
    }

    @Override // ln5
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override // j3c
    public final void d(Exception exc) {
    }

    @Override // ln5
    public final void B0(int i, Drawable drawable) {
    }
}
