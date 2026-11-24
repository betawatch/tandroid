// default package

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class zo4 implements ku4, Continuation, hp7, ql5, kk4 {
    public final /* synthetic */ byte a;

    public /* synthetic */ zo4(eq eqVar) {
        this.a = (byte) 8;
    }

    public static /* bridge */ /* synthetic */ BlendMode d(Object obj) {
        return (BlendMode) obj;
    }

    public static /* synthetic */ void f() {
        throw new AssertionError();
    }

    public static /* synthetic */ void g(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void h(Object obj, Object obj2) {
        throw new odb("Fragment " + obj + obj2);
    }

    public static /* synthetic */ void i(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void k(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void m(String str, int i, Object obj, int i2) {
        throw new IndexOutOfBoundsException(str + i + obj + i2);
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void p(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void r(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    @Override // hp7
    public final String c(int i) {
        switch (this.a) {
        }
        return String.format("%02d", Integer.valueOf(i));
    }

    @Override // ql5
    public final boolean e(int i, int i2, int i3, int i4, int i5) {
        switch (this.a) {
            case 12:
                return false;
            default:
                return i != 2 ? !(i2 == 65 && i3 == 80 && i4 == 73 && i5 == 67) : !(i2 == 80 && i3 == 73 && i4 == 67);
        }
    }

    @Override // ku4
    public final Object l(Object obj) {
        switch (this.a) {
            case 6:
                yn6 yn6Var = tt4.k0;
                return 0;
            case 23:
                int L = gm.L(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(gm.L(200.0f), L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(cmb.w0(null, cmb.c6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, L / 2.0f, paint);
                return createBitmap;
            case 24:
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int L2 = gm.L(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(L2, L2, Bitmap.Config.ARGB_8888);
                float f = L2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f, f, f, paint2);
                return createBitmap2;
            default:
                String str = LaunchActivity.C1;
                return new bj6();
        }
    }

    @Override // kk4
    public final boolean run() {
        String str = LaunchActivity.C1;
        return gda.r.length() > 0 && !gda.z;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            wa3.d("SERVICE_NOT_AVAILABLE");
            return null;
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            wa3.d("INSTANCE_ID_RESET");
            return null;
        }
        if (string3 != null) {
            wa3.d(string3);
            return null;
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        wa3.d("SERVICE_NOT_AVAILABLE");
        return null;
    }

    public /* synthetic */ zo4(byte b) {
        this.a = b;
    }
}
